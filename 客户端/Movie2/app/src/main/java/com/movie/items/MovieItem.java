package com.movie.items;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by ljm on 2017/6/17.
 */
public class MovieItem {
    private int id;
    private String name;
    private String image;
    private String describe;
    private String showInfo;
    private boolean imax;
    private boolean _3d;
    private double score;
    private String type;

    public MovieItem(int id, String name, String image, String describe, String showInfo, String type,
                 boolean imax, boolean _3d, double score) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.describe = describe;
        this.showInfo = showInfo;
        this.type = type;
        this.imax = imax;
        this._3d = _3d;
        this.score = score;
    }

    public String getName() {return name;}
    public String getImage() {return image;}
    public String getDescribe() {return describe;}
    public String getShowInfo() {return showInfo;}
    public String getType() {return type;}

    public int getId() {return id;}
    public double getScore() {return score;}
    public boolean get_3d() {return _3d;}
    public boolean getimax() {return imax;}


    public static void parseJson(String json, List<MovieItem> list) {
        if (json == null) return;

        try {
            JSONObject object = new JSONObject(json);
            JSONObject object1 = object.optJSONObject("data");
            JSONArray array = object1.optJSONArray("movies");
            for (int i = 0; i < array.length(); ++i) {
                JSONObject object2 = array.getJSONObject(i);
                String showInfo = object2.optString("showInfo");
                String img = object2.optString("img");
                String nm = object2.optString("nm");
                String cat = object2.optString("cat");
                String scm = object2.optString("scm");

                boolean imax = object2.optBoolean("imax");
                boolean _3d = object2.optBoolean("3d");

                int id = object2.optInt("id");
                double score = object2.optDouble("sc");

                list.add(new MovieItem(id, nm, img, scm, showInfo, cat, imax, _3d, score));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    //解析影院详情数据
    public static void parseJson2(String json, List<MovieItem> list, Map<String, Object> map) {
        if (json == null) return;

        try {
            JSONObject object = new JSONObject(json);
            JSONObject object1 = object.optJSONObject("data");
            JSONObject object2 = object1.optJSONObject("cinemaDetailModel");
            map.put("nm", object2.optString("nm"));
            map.put("addr", object2.optString("addr"));
            map.put("score", object2.optDouble("s"));

            JSONArray array = object1.optJSONArray("movies");
            for (int i = 0; i < array.length(); ++i) {
                JSONObject movie = array.getJSONObject(i);
                String img = movie.optString("img");
                String nm = movie.optString("nm");
                String ver = movie.optString("ver");

                int id = movie.optInt("id");
                double score = movie.optDouble("sc");

                list.add(new MovieItem(id, nm, img, ver, "", "", false, true, score));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
