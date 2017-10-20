package com.example.administrator.mvp.view;

import com.example.administrator.mvp.bean.User;

/**
 * Created by Administrator on 2017/8/6.
 */

public interface IUserLoginView {
    public String getUserName();

    public String getPassWord();

    public void clearUserName();

    public void clearPassWord();

    public void showLoading();

    public void hideLoading();

    public void toMainActivity(User user);

    public void showFailedError();
}
