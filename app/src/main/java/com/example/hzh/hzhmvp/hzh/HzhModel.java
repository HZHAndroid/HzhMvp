package com.example.hzh.hzhmvp.hzh;

import com.example.hzh.hzhmvp.hzh.bean.User;
import com.example.hzh.hzhmvp.hzh.listener.OnCallBack;
import com.example.hzh.hzhmvp.hzh.vo.HzhDataVo;

import java.util.Random;

/**
 * mvp-model-实现
 */
public class HzhModel implements HzhContract.Model {

    @Override
    public void requestHzhData(HzhDataVo parameter, OnCallBack<User> callBack) {
        if (parameter == null) {
            return;
        }
        // 开始组织请求参数
        // 请求数据，然后解析
        // 然后回调

        // 这里不想复杂，就简单模拟
        String userId = parameter.getUserId();
        User user = new User();
        user.setUserId(userId);
        user.setAge(new Random().nextInt(100));
        user.setName("zhangsan" + new Random().nextInt(200));

        if (callBack != null) {
            callBack.onCall(user);
        }
    }
}
