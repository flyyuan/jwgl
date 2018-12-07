package com.example.demo.model;


public class Student {

  private long id;
  private String name;
  private long classId;
  private String stuNum;
  private String phone;
  private String school;
  private long state;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }


  public String getStuNum() {
    return stuNum;
  }

  public void setStuNum(String stuNum) {
    this.stuNum = stuNum;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
