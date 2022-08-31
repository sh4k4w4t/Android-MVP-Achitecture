package com.shakawat.learn_mvp.login.model;

public interface IUser {
    String getEmail();
    String getPassword();
    int checkUserValidity();
}
