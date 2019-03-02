package com.example.hzh.hzhmvp.module_mvp;

/**
 * 基础的视图接口
 */
public interface IBaseView {

    /**
     * 显示toast
     *
     * @param resId 字符串的id
     */
    void showToast(int resId);

    /**
     * 显示toast
     *
     * @param msg 字符串
     */
    void showToast(CharSequence msg);
}
