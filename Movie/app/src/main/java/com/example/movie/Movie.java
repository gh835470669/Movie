package com.example.movie;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by 黄健军 on 2017/6/7.
 */

public class Movie implements Parcelable {
    private String icon;
    private String name;
    private String introduction;
    private float score;
    private int id;
    private String tagOf23D;
    private ArrayList<String> tags;

    public Movie() {

    }

    protected Movie(Parcel in) {
        icon = in.readString();
        name = in.readString();
        introduction = in.readString();
        score = in.readFloat();
        id = in.readInt();
        tagOf23D = in.readString();
        tags = new ArrayList<>();
        in.readStringList(tags);
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagOf23D() {
        return tagOf23D;
    }

    public void setTagOf23D(String tagOf23D) {
        this.tagOf23D = tagOf23D;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(icon);
        dest.writeString(name);
        dest.writeString(introduction);
        dest.writeFloat(score);
        dest.writeInt(id);
        dest.writeString(tagOf23D);
        dest.writeStringList(tags);
    }
}
