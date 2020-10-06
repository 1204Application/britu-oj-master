package com.britu.oj.dto;

import lombok.Data;

import java.util.Date;

/**
 * @program: britu-oj
 * @description:
 * @author: Gauss
 * @date: 2020-09-18 23:53
 **/

public class User {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private String mood;

    private String avatar;

    private Integer flag;

    private String sex;

    private String email;

    private String phone;

    private String school;

    private Integer signCount;

    private Integer submitCount;

    private Integer solutionCount;

    private Integer acCount;

    private Integer tleCount;

    private Integer peCount;

    private Integer meCount;

    private Integer ceCount;

    private Integer reCount;

    private Integer waCount;

    private Integer goldCount;

    private Integer rating;

    private Date lastLoginTime;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getMood() {
        return mood;
    }

    public String getAvatar() {
        return avatar;
    }

    public Integer getFlag() {
        return flag;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchool() {
        return school;
    }

    public Integer getSignCount() {
        return signCount;
    }

    public Integer getSubmitCount() {
        return submitCount;
    }

    public Integer getSolutionCount() {
        return solutionCount;
    }

    public Integer getAcCount() {
        return acCount;
    }

    public Integer getTleCount() {
        return tleCount;
    }

    public Integer getPeCount() {
        return peCount;
    }

    public Integer getMeCount() {
        return meCount;
    }

    public Integer getCeCount() {
        return ceCount;
    }

    public Integer getReCount() {
        return reCount;
    }

    public Integer getWaCount() {
        return waCount;
    }

    public Integer getGoldCount() {
        return goldCount;
    }

    public Integer getRating() {
        return rating;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
