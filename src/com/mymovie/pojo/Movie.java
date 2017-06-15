package com.mymovie.pojo;

import java.io.Serializable;

public class Movie implements Serializable {
    private Integer mlId;

    private String data;

    private Integer mId;

    private Integer like;

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

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
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