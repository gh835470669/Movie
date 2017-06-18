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
import com.movie.activity.MovieDetailActivity;
import com.movie.adapter.MovieAdapter;
import com.movie.http.Http;
import com.movie.items.MovieItem;
import com.movie.utils.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieFragment extends Fragment {
    private View mView;
    private ListView listView;
    private List<MovieItem> list;
    private MovieAdapter adapter;
    private ProgressDialog dialog;

    private final int MSG_IMAGE = 99, MSG_BUY = 100;
    private ViewPager viewPager;
    private List<ImageView> imgs;

    @Override
    public void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saveInstanceState) {
        mView = inflater.inflate(R.layout.fragment_movie, null);

        initView();
        initData();
        initHandler();
        initMovieItemClickEvent();

        return mView;
    }

    private void initView() {
        listView = (ListView)mView.findViewById(R.id.listview);
    }

    private void initData() {
        list = new ArrayList<>();
        adapter = new MovieAdapter(getActivity(), list);
        listView.setAdapter(adapter);
        adapter.setBuyCallback(new MovieAdapter.BuyCallback() {
            @Override
            public void buy(final int pos) {
                dialog.show();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String s = Http.buy(list.get(pos).getId());
                        Message message = Message.obtain();
                        message.what = MSG_BUY;
                        message.obj = s;
                        handler.sendMessageDelayed(message, 2000);
                    }
                }).start();
            }
        });

        dialog = new ProgressDialog(getContext());
        dialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String s = Http.getMovies();
                Message message = Message.obtain();
                message.what = 0;
                message.obj = s;
                handler.sendMessage(message);
            }
        }).start();
    }

    private void initMovieItemClickEvent() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MovieItem item = (MovieItem) listView.getItemAtPosition(position);
                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
                intent.putExtra("id", item.getId());
                startActivity(intent);
            }
        });
    }

    private void setMovieHeader() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.header_movie, null);
        viewPager = (ViewPager)v.findViewById(R.id.viewpager);
//        ViewGroup.LayoutParams params1 = viewPager.getLayoutParams();
//        params1.width = ViewGroup.LayoutParams.MATCH_PARENT;
//        params1.height = 200;
        imgs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            int n = random.nextInt(list.size());
            ImageView imageView = new ImageView(getContext());
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(100,100);
            params.width = ViewGroup.LayoutParams.MATCH_PARENT;
            params.height = ViewGroup.LayoutParams.MATCH_PARENT;
            imageView.setLayoutParams(params);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setTag(list.get(n).getImage());
            Util.load_img(getContext(), imageView, list.get(n).getImage());
            imgs.add(imageView);
        }

        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return imgs.size();
            }
            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ((ViewPager) container).addView(imgs.get(position));
                return imgs.get(position);
            }
            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                ((ViewPager) container).removeView(imgs.get(position));
            }
            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }
        });

        listView.addHeaderView(viewPager);
        handler.sendEmptyMessageDelayed(MSG_IMAGE, 3*1000);
    }

    private Handler handler;
    private void initHandler() {
        handler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
                        dialog.dismiss();

                        String s = (String) msg.obj;
                        MovieItem.parseJson(s, list);
                        adapter.notifyDataSetChanged();

                        setMovieHeader();
                        break;
                    case MSG_IMAGE:
                        int n = (viewPager.getCurrentItem()+1)%imgs.size();
                        viewPager.setCurrentItem(n);
                        handler.sendEmptyMessageDelayed(MSG_IMAGE, 3*1000);
                        break;
                    case MSG_BUY:
                        dialog.dismiss();
                        s = (String) msg.obj;
                        break;
                }
            }
        };
    }
}
