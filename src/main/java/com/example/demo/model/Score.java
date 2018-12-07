package com.example.demo.model;

public class Score {

  private long id;
  private String score;
  private long userId;
  private long state;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
