package com.mymovie.pojo;

import java.io.Serializable;

public class Seat implements Serializable {
    private Integer sId;

    private Integer cinemaId;

    private Integer hallId;

    private Integer nonEmpty;

    private static final long serialVersionUID = 1L;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public Integer getNonEmpty() {
        return nonEmpty;
    }

    public void setNonEmpty(Integer nonEmpty) {
        this.nonEmpty = nonEmpty;
    }
}