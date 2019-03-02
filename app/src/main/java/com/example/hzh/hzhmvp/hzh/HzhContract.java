package com.example.hzh.hzhmvp.hzh;

import com.example.hzh.hzhmvp.hzh.bean.User;
import com.example.hzh.hzhmvp.hzh.listener.OnCallBack;
import com.example.hzh.hzhmvp.hzh.vo.HzhDataVo;
import com.example.hzh.hzhmvp.module_mvp.BasePresenter;
import com.example.hzh.hzhmvp.module_mvp.IBaseView;

/**
 * mvp-contract
 */
public interface HzhContract {
    // mvp-model-接口(非必须，可以使用presenter代替)
    interface Model {
        /**
         * 请求用户数据
         *
         * @param parameter 请求参数
         * @param callBack  请求回调
         */
        void requestHzhData(HzhDataVo parameter, OnCallBack<User> callBack);
    }

    // mvp-view-接口
    interface View extends IBaseView {
        /**
         * 显示数据
         * @param user
         */
        void showData(User user);
    }

    // mvp-presenter-抽象类（或接口）
    abstract class Presenter extends BasePresenter<View> {
        /**
         * 请求用户数据
         */
        abstract void requestHzhData();
    }
}
