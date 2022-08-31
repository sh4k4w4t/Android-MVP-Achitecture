package com.shakawat.learn_mvp.login.presenter;

import com.shakawat.learn_mvp.login.model.IUser;
import com.shakawat.learn_mvp.login.model.UserImplementetion;
import com.shakawat.learn_mvp.login.view.ILoginView;

public class LogInPresenterImplementation implements ILogInPresenter{

    private ILoginView loginView;

    public LogInPresenterImplementation(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void doLogin(String email, String pass) {
        IUser user= new UserImplementetion(email,pass);
        int login_code= user.checkUserValidity();

        if (login_code==0){
            loginView.onLoginError("Please Enter your mail:");
        }
        if (login_code==1){}
        if (login_code==2){}
        if (login_code==3){}
        if (login_code==-1){}

    }

    @Override
    public void setProgressBarVisibility(int visibility) {

    }
}
