package com.example.dell.tmvp_day01.base;

import android.content.Context;

class BasePresenter<M, V> {
    public Context context;
    public M mModle;
    public V mView;
    public void setMV(M m,V v){
        this.mModle = m;
        this.mView = v;
    }
}
