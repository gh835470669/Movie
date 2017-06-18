package com.movie.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.movie.R;
import com.movie.adapter.CommentAdapter;
import com.movie.fragments.CinemaFragment;
import com.movie.fragments.MovieFragment;
import com.movie.fragments.SettingFragment;
import com.movie.http.Http;
import com.movie.items.CommentItem;
import com.movie.items.MovieItem;
import com.movie.utils.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ljm on 2017/6/17.
 */
public class MovieDetailActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView commentView;
    private List<CommentItem> list;
    private CommentAdapter adapter;

    private ImageView back;
    private int movieId;
    private ProgressDialog dialog;
    private Map<String, Object> map;

    private ImageView image;
    private TextView name, score, cat,length, shwDate, detail;
    private View like, haveSeen;
    private ImageView like_img, haveSeen_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        initView();
        initData();
        initHandler();

        Util.showStatusBar(this);
    }

    private void initView() {
        commentView = (ListView)findViewById(R.id.listview);
        back = (ImageView) findViewById(R.id.back);

        image = (ImageView) findViewById(R.id.image);
        name = (TextView)findViewById(R.id.name);
        score = (TextView)findViewById(R.id.score);
        cat = (TextView)findViewById(R.id.cat);
        length = (TextView)findViewById(R.id.length);
        shwDate = (TextView)findViewById(R.id.shwDate);
        detail = (TextView)findViewById(R.id.detail);

        like =  findViewById(R.id.like);
        haveSeen =  findViewById(R.id.haveSeen);
        like_img = (ImageView) findViewById(R.id.like_img);
        haveSeen_img = (ImageView) findViewById(R.id.haveSeen_img);


        back.setOnClickListener(this);
        like.setOnClickListener(this);
        haveSeen.setOnClickListener(this);
    }

    private void initData() {
        movieId = getIntent().getIntExtra("id", 0);

        map = new HashMap<>();
        list = new ArrayList<>();
        adapter = new CommentAdapter(this, list);
        commentView.setAdapter(adapter);

        dialog = new ProgressDialog(this);
        dialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String s = Http.getMovie_detail(movieId);
                Message message = Message.obtain();
                message.obj = s;
                message.what = 0;
                handler.sendMessage(message);
            }
        }).start();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.like:

                break;
            case R.id.haveSeen:

                break;
        }
    }

    private void setData() {
        Util.load_img(this, image, (String) map.get("img"));
        name.setText((String)map.get("nm"));
        score.setText(map.get("sc")+"");
        cat.setText((String)map.get("cat"));
        length.setText((String)map.get("src")+" / " + map.get("dur")+"min");
        shwDate.setText((String)map.get("rt"));
        detail.setText("导演: "+(String)map.get("dir")+"\n\n"
        +"明星: "+map.get("star")+"\n\n"
        +"简介: "+map.get("dra"));
    }

    private Handler handler;
    private void initHandler() {
        handler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
                        dialog.dismiss();
                        String s = (String) msg.obj;
                        CommentItem.parseJson(s, list, map);
                        adapter.notifyDataSetChanged();
                        setData();
                        Util.setListViewHeightBasedOnChildren(commentView);

                        Util.setToast(getApplicationContext(),list.size()+"");
                        break;
                }
            }
        };
    }
}
