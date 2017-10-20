package com.example.administrator.mvp.biz;

import com.example.administrator.mvp.bean.User;

/**
 * Created by Administrator on 2017/8/6.
 */

public interface OnLoginListener {
    public  void loginSuccess(User user);
    public   void loginFailed();
}
