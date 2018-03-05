package com.ytflogin.mvp.model;

import android.text.TextUtils;

/**
 * step⑤ 实现登陆接口的方法，处理业务逻辑
 * Created by ytf on 2018/2/26.
 */

public class UserModel implements IUserModel {

    @Override
    public void login(String name, String pwd, IUserLoginListenser userLoginListenser) {
        if(TextUtils.isEmpty(name)||TextUtils.isEmpty(pwd)){
            userLoginListenser.onError();
            return;
        }
        if (name.equals("ytf")&&pwd.equals("123")){
            userLoginListenser.onSucess();
        }else {
            userLoginListenser.onFail();
        }
    }
}
