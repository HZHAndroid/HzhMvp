package com.example.hzh.hzhmvp.module_mvp;

import java.lang.ref.WeakReference;

/**
 * 基础的presenter
 * @param <V> view
 */
public class BasePresenter<V extends IBaseView> {
    // View（接口，如Activity、Fragment）的弱引用
    protected WeakReference<V> mViewRef;

    /**
     * 关联view
     *
     * @param view
     */
    public void attachView(V view) {
        mViewRef = new WeakReference<>(view);
    }

    // 解除关联
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
        }
    }

    // 获取View
    protected V getView() {
        return mViewRef.get();
    }
}
