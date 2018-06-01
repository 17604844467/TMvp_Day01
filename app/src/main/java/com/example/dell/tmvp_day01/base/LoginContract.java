package com.example.dell.tmvp_day01.base;

public interface LoginContract {

    interface View extends BaseView {
        void loginsuc();
        void loginmag(String mag);
    }

    interface Model extends BaseModel {
        boolean login(String username,String paw);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        public abstract void login(String username,String paw);
        
    }
}