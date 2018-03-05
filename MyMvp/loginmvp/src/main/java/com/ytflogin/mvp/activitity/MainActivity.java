package com.ytflogin.mvp.activitity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.ytflogin.mvp.R;
import com.ytflogin.mvp.model.IUserLoginListenser;
import com.ytflogin.mvp.presenter.IUserPresenter;
import com.ytflogin.mvp.view.IUserView;

import butterknife.BindView;


public class MainActivity extends AppCompatActivity implements IUserView{//实现view层接口从页面获取数据源
//step ⑦这里使用了butterknife注解方式，省去了findviewbyid的操作
    @BindView(R.id.et_name)
    EditText et_name;
    @BindView(R.id.et_pwd)
    EditText et_pwd;
    @BindView(R.id.btn_login)
    Button btn_login;
    private IUserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userPresenter=new IUserPresenter(this);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPresenter.login(loginListenser);
            }
        });
    }
    /**
     * 实例化登录监听接口
     */
    private IUserLoginListenser loginListenser=new IUserLoginListenser() {
        @Override
        public void onSucess() {
            Toast.makeText(getApplication(),"登录成功！",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onError() {
            Toast.makeText(getApplication(),"信息不全！",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onFail() {
            Toast.makeText(getApplication(),"登录失败！",Toast.LENGTH_SHORT).show();
        }
    };
    /**
     * 以下方法获取页面数据
     * @return 用户输入数据
     */
    @Override
    public String getUserName() {
        return et_name.getText().toString();
    }

    @Override
    public String getPwd() {
        return et_pwd.getText().toString();
    }

}
