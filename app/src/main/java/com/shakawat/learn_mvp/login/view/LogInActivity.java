package com.shakawat.learn_mvp.login.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.shakawat.learn_mvp.databinding.ActivityLoginBinding;
import com.shakawat.learn_mvp.login.presenter.ILogInPresenter;
import com.shakawat.learn_mvp.login.presenter.LogInPresenterImplementation;

public class LogInActivity extends AppCompatActivity implements ILoginView{

    ActivityLoginBinding binding;
    private ILogInPresenter logInPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        logInPresenter= new LogInPresenterImplementation(this);
        logInPresenter.setProgressBarVisibility(View.INVISIBLE);

        binding.submitSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logInPresenter.setProgressBarVisibility(View.VISIBLE);
                logInPresenter.doLogin(binding.mailIDSignIn.getText().toString(),binding.passwordSignIn.getText().toString());
            }
        });

    }

    @Override
    public void onLoginSuccess(String msg) {
        logInPresenter.setProgressBarVisibility(View.INVISIBLE);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {
        binding.progressId.setVisibility(visibility);
    }
}