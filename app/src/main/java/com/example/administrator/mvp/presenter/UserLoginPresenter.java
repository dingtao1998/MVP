package com.example.administrator.mvp.presenter;

import android.util.Log;

import com.example.administrator.mvp.bean.User;
import com.example.administrator.mvp.biz.IUserBiz;
import com.example.administrator.mvp.biz.OnLoginListener;
import com.example.administrator.mvp.biz.UserBiz;
import com.example.administrator.mvp.view.IUserLoginView;

/**
 * Created by Administrator on 2017/8/6.
 */

public class UserLoginPresenter {
    private IUserBiz userBiz;
    private IUserLoginView userLoginView;

    public UserLoginPresenter(IUserLoginView userLoginView) {
        this.userLoginView = userLoginView;
        userBiz = new UserBiz();
    }

    public void login() {
        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getPassWord(), new OnLoginListener() {
            @Override
            public void loginSuccess(User user) {
                Log.i("SS","SS");

            }

            @Override
            public void loginFailed() {


            }
        });
    }

    public void clear() {
        userLoginView.clearUserName();

        userLoginView.clearPassWord();
    }
}
