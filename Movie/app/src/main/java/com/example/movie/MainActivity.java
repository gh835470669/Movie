package com.example.movie;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpPager;
    private ArrayList<Fragment> fragments;
    private FragmentManager fragmentManager;

    private class MyPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragments;

        public MyPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> fragments) {
            super(fragmentManager);
            this.fragments = fragments;
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return fragments.size();
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Movie";
                case 1:
                    return "Theatre";
                case 2:
                    return "User";
                default:
                    return null;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpPager = (ViewPager) findViewById(R.id.vpPager);
        fragmentManager = getSupportFragmentManager();
        fragments = new ArrayList<>();
        fragments.add(MovieFragment.newInstance());
        fragments.add(MovieFragment.newInstance());
        fragments.add(UserFragment.newInstance());
        vpPager.setAdapter(new MyPagerAdapter(fragmentManager, fragments));

        // Attach the page change listener inside the activity
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            // This method will be invoked when a new page becomes selected.
            @Override
            public void onPageSelected(int position) {
            }

            // This method will be invoked when the current page is scrolled
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Code goes here
            }

            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            @Override
            public void onPageScrollStateChanged(int state) {
                // Code goes here
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("d", "onResume: MainAct");

        Intent intent = getIntent();
        if (intent == null) return;
        if (intent.getStringExtra("act") == null) return;
        if (intent.getStringExtra("act").equals("login")) {
            vpPager.setCurrentItem(2);
        } else if (intent.getStringExtra("act").equals("alter")) {
            vpPager.setCurrentItem(2);
        }
    }
}
