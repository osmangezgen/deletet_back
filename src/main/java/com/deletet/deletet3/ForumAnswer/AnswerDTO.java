package com.deletet.deletet3.ForumAnswer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class AnswerDTO {

    private Long id;
    private Long userid;
    private String fullname;
    private String question_id;
    private String explanation;
    private String body;
    private String date;
    private String status;
    private int likecount;
    private int upcount;
    private boolean owner;


    public AnswerDTO(Long id, Long userid, String fullname, String question_id, String explanation, String body, String date, String status, int likecount, int upcount,boolean owner) {

        this.id = id;
        this.userid=userid;
        this.fullname = fullname;
        this.question_id = question_id;
        this.explanation = explanation;
        this.body = body;
        this.date = date;
        this.status = status;
        this.likecount=likecount;
        this.upcount=upcount;
        this.owner=owner;
    }

    public int getLikecount() {
        return likecount;
    }

    public void setLikecount(int likecount) {
        this.likecount = likecount;
    }

    public int getUpcount() {
        return upcount;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public void setUpcount(int upcount) {
        this.upcount = upcount;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}