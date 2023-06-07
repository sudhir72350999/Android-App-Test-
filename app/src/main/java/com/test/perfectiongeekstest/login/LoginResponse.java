package com.test.perfectiongeekstest.login;

public class LoginResponse {

    User res;
    String token;
    String message;

    public LoginResponse(User res, String token, String message) {
        this.res = res;
        this.token = token;
        this.message = message;
    }

    public User getRes() {
        return res;
    }

    public void setRes(User res) {
        this.res = res;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
