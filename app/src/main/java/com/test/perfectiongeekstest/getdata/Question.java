package com.test.perfectiongeekstest.getdata;

import java.util.List;

public class Question {
    private String question;
    private String answer;
    private List<String> option;
    private String _id;

    // getters and setters


    public Question(String question, String answer, List<String> option, String _id) {
        this.question = question;
        this.answer = answer;
        this.option = option;
        this._id = _id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getOption() {
        return option;
    }

    public void setOption(List<String> option) {
        this.option = option;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
