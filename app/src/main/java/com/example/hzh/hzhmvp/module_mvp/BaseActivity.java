package com.example.hzh.hzhmvp.module_mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * 基础的Activity
 *
 * @param <V> view
 * @param <P> presenter
 */
public abstract class BaseActivity<V extends IBaseView, P extends BasePresenter<V>> extends AppCompatActivity
        implements IBaseView {

    // presenter
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = create_mvp_presenter();
        if (mPresenter != null) {
            mPresenter.attachView(get_mvp_view());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }


    // 获取mvp的view
    protected abstract V get_mvp_view();

    // 创建 mvp的 presenter
    protected abstract P create_mvp_presenter();

    @Override
    public void showToast(int resId) {
        Toast.makeText(this, resId, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showToast(CharSequence msg) {
        if (msg == null){
            return;
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
