package com.example.cv_maker;

public class CV {
    private String name;
    private String id;
    private String department;
    private String education ;
    private String birthday;
    private String languages ;
    private String personalab;
    private String address;
    private String telnum ;
    private String tag;

    public CV(String name, String id, String department, String education, String birthday, String languages, String personalab, String address, String telnum, String tag) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.education = education;
        this.birthday = birthday;
        this.languages = languages;
        this.personalab = personalab;
        this.address = address;
        this.telnum = telnum;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPersonalab() {
        return personalab;
    }

    public void setPersonalab(String personalab) {
        this.personalab = personalab;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
