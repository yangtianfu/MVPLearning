package com.ytflogin.mvp.model;

/**
 * step③
 * Created by ytf on 2018/2/26.
 * 处理业务逻辑的监听接口，这里用来判断登陆结果状态
 */

public interface IUserLoginListenser {
//    用来监听业务逻辑处理的判断，实现接口后可以通过Toast等显示结果
    public void onSucess();//登陆成功
    public void onError();//用户信息不正确
    public void onFail();//登陆失败
}
