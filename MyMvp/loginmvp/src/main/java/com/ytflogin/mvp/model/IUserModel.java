package com.ytflogin.mvp.model;

/**
 * step④
 * Created by ytf on 2018/2/26.
 * 提供处理数据的接口方法，这里封装一个登陆的方法，
 */

public interface IUserModel {
    /**
     * 提取一个登陆的方法，并传入登陆监听接口，也可以添加别的方法
     * @param name 用户名
     * @param pwd 用户密码
     * @param userLoginListenser 登陆状态监听
     */
    public void login(String name,String pwd,IUserLoginListenser userLoginListenser);
}
