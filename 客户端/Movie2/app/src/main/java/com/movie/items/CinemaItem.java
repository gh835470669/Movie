package com.movie.items;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by ljm on 2017/6/17.
 */
public class CinemaItem {
    private int id;
    private String name;
    private String addr;
    private double price;
    private double distance;
    private int label_num;
    private List<Integer> label;

    public CinemaItem(int id, String name, String addr ,double price) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.price = price;

        Random random = new Random();
        this.distance = random.nextDouble() * 30;
        this.label_num = random.nextInt(6) + 1;
        label = new ArrayList<>();
        for (int i = 0; i < label_num; ++i) {
            label.add(random.nextInt(6));
        }
    }

    public String getName() {return name;}
    public String getAddr() {return addr;}

    public int getId() {return id;}
    public double getPrice() {return price;}
    public double getDistance() {return distance;}
    public List<Integer> getLabel() {return label;}


    public static void parseJson(String json, List<CinemaItem> list) {
        if (json == null) return;

        try {
            JSONObject object = new JSONObject(json);
            JSONObject object1 = object.optJSONObject("data");
            Iterator<String> iterator =  object1.keys();
            while (iterator.hasNext()) {
                String key = iterator.next();
                JSONArray array = object1.optJSONArray(key);

                for (int i = 0; i < array.length(); ++i) {
                    JSONObject object2 = array.getJSONObject(i);
                    String nm = object2.optString("nm");
                    String addr = object2.optString("addr");

                    int id = object2.optInt("id");
                    double sellPrice = object2.optDouble("sellPrice");

                    list.add(new CinemaItem(id, nm, addr, sellPrice));
                }
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
