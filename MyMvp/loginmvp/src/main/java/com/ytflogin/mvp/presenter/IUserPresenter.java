package com.ytflogin.mvp.presenter;

import com.ytflogin.mvp.model.IUserLoginListenser;
import com.ytflogin.mvp.model.IUserModel;
import com.ytflogin.mvp.model.UserModel;
import com.ytflogin.mvp.view.IUserView;

/**
 * step⑥
 * view层中提供数据源，model层提供业务逻辑方法，
 * presenter就是要把他们关联起来，所以需要model和view的实例
 * Created by ytf on 2018/2/26.
 */

public class IUserPresenter {
//    数据源，view的实例：
    private IUserView iUserView;
//    业务逻辑，model实例
    private IUserModel iUserModel;//父类的引用

    /**
     * 构造方法，传入view层数据源
     * @param iUserView
     */
    public IUserPresenter(IUserView iUserView) {
        this.iUserView = iUserView;
        iUserModel=new UserModel();//父类引用指向子类对象，调用登录方法
    }

    /**
     * 登录的方法，把view层和model层建立关联，实现真正的登录
     * @param loginListenser
     */
    public void login(IUserLoginListenser loginListenser){
        iUserModel.login(iUserView.getUserName(),iUserView.getPwd(),loginListenser);
    }
}
