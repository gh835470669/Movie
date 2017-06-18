package com.movie.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.movie.R;
import com.movie.fragments.CinemaFragment;
import com.movie.fragments.MovieFragment;
import com.movie.fragments.SettingFragment;
import com.movie.utils.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ljm on 2017/6/17.
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener{
    private MovieFragment movieFragment;
    private CinemaFragment cinemaFragment;
    private SettingFragment settingFragment;
    private List<Fragment> fragments;
    private ViewPager viewPager;

//    private EditText editText;
    private Button movie, cinema, setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();

        Util.showStatusBar(this);
    }

    private void initView() {
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        movie = (Button)findViewById(R.id.button1);
        cinema = (Button)findViewById(R.id.button2);
        setting = (Button)findViewById(R.id.button3);
        movie.setOnClickListener(this);
        cinema.setOnClickListener(this);
        setting.setOnClickListener(this);
    }

    private void initData() {
        movieFragment = new MovieFragment();
        settingFragment = new SettingFragment();
        cinemaFragment = new CinemaFragment();
        fragments = new ArrayList<>();
        fragments.add(movieFragment);
        fragments.add(cinemaFragment);
        fragments.add(settingFragment);

        initViewPager();
        movie.performClick();
    }

    private void initViewPager() {
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                return fragments.get(position);
            }
            @Override
            public int getCount() {
                return fragments.size();
            }

        };
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) { }
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0: movie.performClick(); break;
                    case 1: cinema.performClick(); break;
                    case 2: setting.performClick(); break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) { }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                viewPager.setCurrentItem(0);
                movie.setBackgroundColor(getResources().getColor(R.color.gray2));
                cinema.setBackgroundColor(getResources().getColor(R.color.gray));
                setting.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case R.id.button2:
                viewPager.setCurrentItem(1);
                movie.setBackgroundColor(getResources().getColor(R.color.gray));
                cinema.setBackgroundColor(getResources().getColor(R.color.gray2));
                setting.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case R.id.button3:
                viewPager.setCurrentItem(2);
                movie.setBackgroundColor(getResources().getColor(R.color.gray));
                cinema.setBackgroundColor(getResources().getColor(R.color.gray));
                setting.setBackgroundColor(getResources().getColor(R.color.gray2));
                break;
        }
    }
}
