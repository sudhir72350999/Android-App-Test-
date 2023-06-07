package com.test.perfectiongeekstest.getdata;

import java.util.List;

public class ApiData {

    private int count;
    private List<Result> result;
    private String message;

    public ApiData(int count, List<Result> result, String message) {
        this.count = count;
        this.result = result;
        this.message = message;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

