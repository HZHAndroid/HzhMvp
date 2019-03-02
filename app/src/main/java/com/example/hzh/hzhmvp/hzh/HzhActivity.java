package com.example.hzh.hzhmvp.hzh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.hzh.hzhmvp.hzh.bean.User;
import com.example.hzh.hzhmvp.module_mvp.BaseActivity;

public class HzhActivity extends BaseActivity<HzhContract.View, HzhPresenter> implements HzhContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter.requestHzhData();
    }

    @Override
    protected HzhContract.View get_mvp_view() {
        return this;
    }

    @Override
    protected HzhPresenter create_mvp_presenter() {
        return new HzhPresenter();
    }

    @Override
    public void showData(User user) {
        showToast(user.getUserId() + "");
    }
}
