package com.test.perfectiongeekstest.getdata;

import java.util.List;

public class Result {
    private String _id;
    private String assignedDate;
    private String submissionDate;
    private String questionType;
    private String selectType;
    private List<Question> questions;
    private String classId;
    private String sectionId;
    private String subjectId;
    private List<Syllabus> syllabus;
    private String description;
    private List<String> attachQuestionFile;
    private int createdByAdmin;
    private List<String> answerSheets;
    private String createdAt;
    private String updatedAt;


    // getters and setters


    public Result(String _id, String assignedDate, String submissionDate, String questionType, String selectType, List<Question> questions, String classId, String sectionId, String subjectId, List<Syllabus> syllabus, String description, List<String> attachQuestionFile, int createdByAdmin, List<String> answerSheets, String createdAt, String updatedAt) {
        this._id = _id;
        this.assignedDate = assignedDate;
        this.submissionDate = submissionDate;
        this.questionType = questionType;
        this.selectType = selectType;
        this.questions = questions;
        this.classId = classId;
        this.sectionId = sectionId;
        this.subjectId = subjectId;
        this.syllabus = syllabus;
        this.description = description;
        this.attachQuestionFile = attachQuestionFile;
        this.createdByAdmin = createdByAdmin;
        this.answerSheets = answerSheets;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public List<Syllabus> getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(List<Syllabus> syllabus) {
        this.syllabus = syllabus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAttachQuestionFile() {
        return attachQuestionFile;
    }

    public void setAttachQuestionFile(List<String> attachQuestionFile) {
        this.attachQuestionFile = attachQuestionFile;
    }

    public int getCreatedByAdmin() {
        return createdByAdmin;
    }

    public void setCreatedByAdmin(int createdByAdmin) {
        this.createdByAdmin = createdByAdmin;
    }

    public List<String> getAnswerSheets() {
        return answerSheets;
    }

    public void setAnswerSheets(List<String> answerSheets) {
        this.answerSheets = answerSheets;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
