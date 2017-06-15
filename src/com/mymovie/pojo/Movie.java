package com.mymovie.pojo;

import java.io.Serializable;

public class Movie implements Serializable {
    private Integer mlId;

    private String data;

    private Integer mId;

    private Integer userLike;

    private Integer haveSeen;

    private String mName;

    private Integer uId;

    private static final long serialVersionUID = 1L;

    public Integer getMlId() {
        return mlId;
    }

    public void setMlId(Integer mlId) {
        this.mlId = mlId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getUserLike() {
        return userLike;
    }

    public void setUserLike(Integer userLike) {
        this.userLike = userLike;
    }

    public Integer getHaveSeen() {
        return haveSeen;
    }

    public void setHaveSeen(Integer haveSeen) {
        this.haveSeen = haveSeen;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}