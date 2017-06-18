package com.movie.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.movie.R;
import com.movie.activity.CinemaDetailActivity;
import com.movie.adapter.CinemaAdapter;
import com.movie.adapter.MovieAdapter;
import com.movie.http.Http;
import com.movie.items.CinemaItem;
import com.movie.items.MovieItem;
import com.movie.utils.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ljm on 2017/6/17.
 */
public class CinemaFragment extends Fragment {
    private View mView;
    private ListView listView;
    private List<CinemaItem> list;
    private CinemaAdapter adapter;
    private ProgressDialog dialog;

    @Override
    public void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saveInstanceState) {
        mView = inflater.inflate(R.layout.fragment_cinema, null);

        initView();
        initData();
        initHandler();
        initCinemaItemClickEvent();

        return mView;
    }

    private void initView() {
        listView = (ListView)mView.findViewById(R.id.listview);
    }

    private void initData() {
        list = new ArrayList<>();
        adapter = new CinemaAdapter(getActivity(), list);
        listView.setAdapter(adapter);

        dialog = new ProgressDialog(getContext());
        dialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String s = Http.getCinemas();
                Message message = Message.obtain();
                message.what = 0;
                message.obj = s;
                handler.sendMessage(message);
            }
        }).start();
    }

    private void initCinemaItemClickEvent() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CinemaItem item = (CinemaItem)listView.getItemAtPosition(position);
                Intent intent = new Intent(getActivity(), CinemaDetailActivity.class);
                intent.putExtra("id", item.getId());
                startActivity(intent);
            }
        });
    }

    private Handler handler;
    private void initHandler() {
        handler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
                        dialog.dismiss();

                        String s = (String) msg.obj;
                        CinemaItem.parseJson(s, list);
                        adapter.notifyDataSetChanged();
                        break;
                }
            }
        };
    }
}
