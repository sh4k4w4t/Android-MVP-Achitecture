package com.shakawat.learn_mvp.login.presenter;

import com.shakawat.learn_mvp.login.view.ILoginView;

public class LogInPresenterImplementation implements ILogInPresenter{

    private ILoginView loginView;

    public LogInPresenterImplementation(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void doLogin(String email, String pass) {

    }

    @Override
    public void setProgressBarVisibility(int visibility) {

    }
}
