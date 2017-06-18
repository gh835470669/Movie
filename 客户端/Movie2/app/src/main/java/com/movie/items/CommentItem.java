package com.movie.items;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by ljm on 2017/6/17.
 */
public class CommentItem {
    private int userId;
    private String name;
    private String image;
    private String time;
    private String content;
    private double score;
    private int approve;

    public CommentItem(int userId, String name, String image, String time, String content,
                       double score, int approve) {
        this.userId = userId;
        this.name = name;
        this.image = image;
        this.time = time;
        this.content = content;
        this.score = score;
        this.approve = approve;
    }

    public String getName() {return name;}
    public String getImage() {return image;}
    public String getTime() {return time;}
    public String getContent() {return content;}

    public int getId() {return userId;}
    public int getApprove() {return approve;}
    public double getScore() {return score;}


    public static void parseJson(String json, List<CommentItem> list, Map<String, Object> map) {
        if (json == null) return;

        try {
            JSONObject object = new JSONObject(json);
            JSONObject object1 = object.optJSONObject("data");
            JSONObject info = object1.optJSONObject("MovieDetailModel");
            map.put("cat", info.optString("cat"));

            map.put("dra", info.optString("dra"));
            map.put("star", info.optString("star"));
            map.put("dir", info.optString("dir"));
            map.put("dur", info.optInt("dur"));

            map.put("img", info.optString("img"));
            map.put("nm", info.optString("nm"));
            map.put("rt", info.optString("rt"));
            map.put("sc", info.optDouble("sc"));
            map.put("snum", info.optString("snum"));
            map.put("src", info.optString("src"));

            JSONObject comment = object1.optJSONObject("CommentResponseModel");
            JSONArray array = comment.optJSONArray("cmts");
            for (int i = 0; i < array.length(); ++i) {
                JSONObject object2 = array.getJSONObject(i);

                String img = object2.optString("avatarurl");
                String content = object2.optString("content");
                String nm = object2.optString("nickName");
                String time = object2.optString("time");

                int id = object2.optInt("userId");
                int approve = object2.optInt("approve");
                double score = object2.optDouble("score");

                list.add(new CommentItem(id, nm, img, time, content, score, approve));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
