package com.example.hzh.hzhmvp.hzh;

import android.util.Log;

import com.example.hzh.hzhmvp.hzh.bean.User;
import com.example.hzh.hzhmvp.hzh.listener.OnCallBack;
import com.example.hzh.hzhmvp.hzh.vo.HzhDataVo;

import java.util.UUID;

// mvp-presenter-实现（或继承）
public class HzhPresenter extends HzhContract.Presenter {

    private HzhContract.Model mModel = null;

    public HzhPresenter() {
        mModel = new HzhModel();
    }

    @Override
    void requestHzhData() {
        // 组织参数
        HzhDataVo parameter = new HzhDataVo();
        parameter.setUserId(UUID.randomUUID()+"");
        // 请求数据
        mModel.requestHzhData(parameter, new OnCallBack<User>() {
            @Override
            public void onCall(User result) {
                Log.e("Hzh",result.toString());
                if (mViewRef.get() == null) {
                    return;
                }
                mViewRef.get().showData(result);
            }
        });
    }
}
