package com.example.administrator.mvp.biz;

/**
 * Created by Administrator on 2017/8/6.
 */

public interface IUserBiz {
    public  void login(String username, String password, OnLoginListener loginListener);
}
