package com.ytflogin.mvp.view;

/**
 * step②
 * Created by ytf on 2018/2/26.
 * 一个页面对应一个view层接口，提供获取数据的方法
 * View层的任务就是抽象页面的数据，提取出来写成方法
 */

public interface IUserView {
//    提供获取用户名和密码信息的数据接口方法
    public String getUserName();
    public String getPwd();
}
