package com.example.dell.tmvp_day01.base;

/**
* Created by TMVPHelper on 2018/05/28
*/
public class LoginModel implements LoginContract.Model{

    @Override
    public boolean login(String username, String paw) {
        if (username.equals("12345")&paw.equals("123")){
            return true;
        }
        return false;
    }
}