package com.test.perfectiongeekstest.getdata;

import java.util.List;

public class Syllabus {
    private String chapterno;
    private String chapterName;
    private List<String> topic;
    private String _id;

    // getters and setters


    public Syllabus(String chapterno, String chapterName, List<String> topic, String _id) {
        this.chapterno = chapterno;
        this.chapterName = chapterName;
        this.topic = topic;
        this._id = _id;
    }


    public String getChapterno() {
        return chapterno;
    }

    public void setChapterno(String chapterno) {
        this.chapterno = chapterno;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public List<String> getTopic() {
        return topic;
    }

    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
