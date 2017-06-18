package com.movie.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.movie.R;
import com.movie.adapter.CommentAdapter;
import com.movie.adapter.MovieAdapter;
import com.movie.adapter.MovieShowTimeAdapter;
import com.movie.http.Http;
import com.movie.items.CinemaItem;
import com.movie.items.CommentItem;
import com.movie.items.MovieItem;
import com.movie.items.MovieShowTimeItem;
import com.movie.utils.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ljm on 2017/6/17.
 */
public class CinemaDetailActivity extends AppCompatActivity implements View.OnClickListener,
        MovieAdapter.BuyCallback{
    private ListView listView;
    private List<MovieItem> list;
    private MovieAdapter adapter;

    private ListView dateListView;
    private List<MovieShowTimeItem> dateList;
    private MovieShowTimeAdapter dateAdapter;

    private ImageView back;
    private TextView name,name2,score,addr;
    private ProgressDialog dialog;
    private PopupWindow popupWindow;

    private int cinemaId;
    private Map<String, Object> map;

    private Map<Integer, List<MovieShowTimeItem>> listMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_cinema_detail);

        initView();
        initData();
        initPopupWindow();
        initHandler();

        Util.showStatusBar(this);
    }

    private void initView() {
        listView = (ListView)findViewById(R.id.listview);
        back = (ImageView) findViewById(R.id.back);

        name = (TextView)findViewById(R.id.name);
        name2 = (TextView)findViewById(R.id.name2);
        score = (TextView)findViewById(R.id.score);
        addr = (TextView)findViewById(R.id.addr);

        back.setOnClickListener(this);
    }

    private void initData() {
        cinemaId = getIntent().getIntExtra("id", 0);

        map = new HashMap<>();
        listMap = new HashMap<>();
        list = new ArrayList<>();
        adapter = new MovieAdapter(this, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dateList = listMap.get(position);
                dateAdapter = new MovieShowTimeAdapter(CinemaDetailActivity.this, dateList);
                dateListView.setAdapter(dateAdapter);
                //dateAdapter.notifyDataSetChanged();
                popupWindow.showAtLocation(listView, Gravity.BOTTOM, 0, 0);
            }
        });
        adapter.setBuyCallback(new MovieAdapter.BuyCallback() {
            @Override
            public void buy(int pos) {
                listView.performItemClick(listView.getChildAt(pos),pos,listView.getItemIdAtPosition(pos));
            }
        });

        dialog = new ProgressDialog(this);
        dialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String s = Http.getCinemaDetail(cinemaId);
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

    @Override
    public void buy(int pos) {

    }

    private void initPopupWindow() {
        popupWindow = new PopupWindow(listView,
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
                true);
        View view = LayoutInflater.from(this).inflate(R.layout.popupwindow_hall, null);
        popupWindow.setContentView(view);
        dateListView = (ListView)view.findViewById(R.id.listview);


        View cancelView = view.findViewById(R.id.cancel);
        cancelView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
    }

    private void setData(String json) {
        name.setText((String)map.get("nm"));
        name2.setText((String)map.get("nm"));
        score.setText(Util.getDouble((double)map.get("score"))+"分");
        addr.setText((String)map.get("addr"));

        for (int i = 0; i < list.size(); ++i) {
            List<MovieShowTimeItem> tmp = new ArrayList<>();
            listMap.put(i, tmp);
        }
        MovieShowTimeItem.parseJson(json, listMap);
    }

    private Handler handler;
    private void initHandler() {
        handler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
                        dialog.dismiss();
                        String s = (String) msg.obj;
                        //Util.setToast(CinemaDetailActivity.this, s);
                        MovieItem.parseJson2(s, list, map);
                        adapter.notifyDataSetChanged();
                        setData(s);
                        break;
                }
            }
        };
    }
}
