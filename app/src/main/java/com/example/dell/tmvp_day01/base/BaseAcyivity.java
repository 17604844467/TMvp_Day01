package com.example.dell.tmvp_day01.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.dell.tmvp_day01.utils.TUtils;

public abstract class BaseAcyivity <T extends BasePresenter,M extends BaseModel> extends Activity {
    public T mPresenter;
    public M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        setContentView(getLayoutId());
        mPresenter = TUtils.getT(this,0);
        mModel = TUtils.getT(this,1);
        if (this instanceof BaseView){
            mPresenter.setMV(mModel,this);
        }
        initView();
    }

    protected abstract void initView();

    public abstract int getLayoutId();
}
