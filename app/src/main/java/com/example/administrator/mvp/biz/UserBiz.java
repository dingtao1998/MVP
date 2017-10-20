package com.example.administrator.mvp.biz;

import com.example.administrator.mvp.bean.User;

/**
 * Created by Administrator on 2017/8/6.
 */

public class UserBiz implements IUserBiz {
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if("zhy".equals(username)&&"123".equals(password)){
                  User  user = new User();
                  user.setUsername("zhy");
                  user.setPassword("123");
                  loginListener.loginSuccess(user);
              }else{
                  loginListener.loginFailed();
              }

            }

        }.start();
    }
}
