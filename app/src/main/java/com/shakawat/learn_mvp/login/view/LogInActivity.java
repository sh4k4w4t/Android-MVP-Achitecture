package com.shakawat.learn_mvp.login.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shakawat.learn_mvp.databinding.ActivityMainBinding;

public class LogInActivity extends AppCompatActivity implements ILoginView{

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ActivityMainBinding.inflate(getLayoutInflater()).getRoot());


    }

    @Override
    public void onLoginSuccess(String msg) {

    }

    @Override
    public void onLoginError(String msg) {

    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {

    }
}