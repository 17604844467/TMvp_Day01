package com.example.dell.tmvp_day01.base;

/**
* Created by TMVPHelper on 2018/05/28
*/
public class LoginPresenter extends LoginContract.Presenter{

    @Override
    public void login(String username, String paw) {
        if (mModle.login(username,paw)){
            mView.loginsuc();
        }else{
            mView.loginmag("登陆失败");
        }
    }
}