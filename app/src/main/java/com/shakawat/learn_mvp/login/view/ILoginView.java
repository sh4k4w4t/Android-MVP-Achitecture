package com.shakawat.learn_mvp.login.view;

public interface ILoginView {
    void onLoginSuccess(String msg);
    void onLoginError(String msg);
    void onSetProgressBarVisibility(int visibility);
}
