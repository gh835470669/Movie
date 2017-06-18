package com.movie.items;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by ljm on 2017/6/17.
 */
public class MovieShowTimeItem {
    private int id;
    private String tm;      //开始时间
    private String end;
    private String th;  //放映厅
    private String lang;    //语言
    private double price;
    private String tp;  //3D

    public MovieShowTimeItem(int id, String tm, String end, String th, String lang, String tp, double price) {
        this.id = id;
        this.tm = tm;
        this.end = end;
        this.th = th;
        this.lang = lang;
        this.tp = tp;
        this.price = price;
    }

    public String getStart() {return tm;}
    public String getEnd() {return end;}
    public String getHall() {return th;}
    public String getLanguage() {return lang;}
    public String get_3D() {return tp;}

    public int getId() {return id;}
    public double getPrice() {return price;}


    //解析影院详情数据
    public static void parseJson(String json, Map<Integer, List<MovieShowTimeItem>> map) {
        if (json == null) return;

        List<MovieShowTimeItem> list  =  new ArrayList<>();
        try {
            JSONObject object = new JSONObject(json);
            JSONObject object1 = object.optJSONObject("data");
            JSONObject object2 = object1.optJSONObject("DateShow");

            Iterator<String> iterator = object2.keys();
            Random random = new Random();
            while (iterator.hasNext()) {
                String key = iterator.next();
                JSONArray array = object2.optJSONArray(key);

                for (int i = 0; i < array.length(); ++i) {
                    JSONObject movie = array.getJSONObject(i);
                    String th = movie.optString("th");
                    String tm = movie.optString("tm");
                    String tp = movie.optString("tp");
                    String lang = movie.optString("lang");
                    String end = movie.optString("end");

                    int id = movie.optInt("showId");
                    double price = random.nextInt(30) * 2;

                    list.add(new MovieShowTimeItem(id, tm, end, th, lang, tp,price));
                }
            }
            if (map.size() == 0) return;
            int n = list.size() / map.size();
            int index = 0;
            for (int i = 0; i < map.size(); ++i) {
                for (int k = 0; k < n; ++k) {
                    map.get(i).add(list.get(index++));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
