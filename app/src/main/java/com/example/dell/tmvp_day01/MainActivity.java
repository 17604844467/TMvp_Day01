package com.example.dell.tmvp_day01;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dell.tmvp_day01.base.BaseAcyivity;
import com.example.dell.tmvp_day01.base.LoginContract;
import com.example.dell.tmvp_day01.base.LoginModel;
import com.example.dell.tmvp_day01.base.LoginPresenter;

public class MainActivity extends BaseAcyivity<LoginPresenter, LoginModel> implements LoginContract.View {

    private EditText userName;
    private EditText paw;
    private Button mLogin;

    @Override
    protected void initView() {
        userName = findViewById(R.id.userName);
        paw = findViewById(R.id.paw);
        mLogin = findViewById(R.id.mLogin);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login(userName.getText().toString(),paw.getText().toString());
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void loginsuc() {
        Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginmag(String mag) {
        Toast.makeText(this, mag, Toast.LENGTH_SHORT).show();
    }
}
