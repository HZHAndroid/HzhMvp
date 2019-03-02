package com.example.hzh.hzhmvp.hzh.listener;

/**
 * 请求回调
 *
 * @param <D> 返回的数据类型
 */
public interface OnCallBack<D> {
    void onCall(D result);
}
