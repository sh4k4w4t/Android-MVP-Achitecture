package com.shakawat.learn_mvp.login.presenter;

import com.shakawat.learn_mvp.login.view.ILoginView;

public interface ILogInPresenter {

    void doLogin(String email, String pass);
    void setProgressBarVisibility(int visibility);
}
