package com.zhao.quiz.domain;

import lombok.Data;

@Data
public class Question {
    private int questionId;
    private String questionType; // 增加概念题类型
    private String questionCourse;
    private String questionName;
    private String questionOpa;
    private String questionOpb;
    private String questionOpc;
    private String questionOpd;
    private String questionOpright;
    private String questionImage; // 增加图片URL字段


    public Question(int questionId, String questionType, String questionCourse, String questionName, String questionOpa, String questionOpb, String questionOpc, String questionOpd, String questionOpright) {
        this.questionId = questionId;
        this.questionType = questionType;
        this.questionCourse = questionCourse;
        this.questionName = questionName;
        this.questionOpa = questionOpa;
        this.questionOpb = questionOpb;
        this.questionOpc = questionOpc;
        this.questionOpd = questionOpd;
        this.questionOpright = questionOpright;
    }

    public Question() {
    }

    public Question(String questionType, String questionCourse) {
        this.questionType = questionType;
        this.questionCourse = questionCourse;
    }
}
