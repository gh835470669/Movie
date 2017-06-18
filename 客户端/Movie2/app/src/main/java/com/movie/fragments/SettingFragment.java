package com.movie.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.movie.R;

import java.util.ArrayList;

/**
 * Created by ljm on 2017/6/17.
 */
public class SettingFragment extends Fragment {
    private boolean isLogon;
    private UserData userData;
    private TextView username;
    private Button logoff;
    private RelativeLayout wantToWatch;
    private RelativeLayout haveWatched;

    private class UserData {
        public String username;
        public String avatar;
        public ArrayList<Integer> collected_movies;
        public ArrayList<Integer> wantToWatech_movies;
    }

    private void getUserdataByName(String username) {
        userData = new UserData();
        userData.username = username;

        userData.collected_movies = new ArrayList<>();
        userData.collected_movies.add(1);

        userData.wantToWatech_movies = new ArrayList<>();
        userData.wantToWatech_movies.add(2);
    }

    public static SettingFragment newInstance() {
        SettingFragment userFragment = new SettingFragment();
        Bundle args = new Bundle();
        userFragment.setArguments(args);
        return userFragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getUserdataByName("XiaLuLu");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        wantToWatch = (RelativeLayout)view.findViewById(R.id.user_wantToWatch);
        wantToWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isLogon) return;
//                Intent intent = new Intent(SettingFragment.this.getContext(), WantToWatchActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putIntegerArrayList("movies", userData.wantToWatech_movies);
//                intent.putExtras(bundle);
//                intent.putExtra("act", "main");
//                startActivity(intent);
            }
        });
        haveWatched = (RelativeLayout)view.findViewById(R.id.user_haveWatched);
        haveWatched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isLogon) return;
//                Intent intent = new Intent(SettingFragment.this, HaveWatchedActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putIntegerArrayList("movies", userData.collected_movies);
//                intent.putExtras(bundle);
//                intent.putExtra("act", "main");
//                startActivity(intent);
            }
        });

        logoff = (Button)view.findViewById(R.id.user_logoff);
        logoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isLogon = false;
                username.setText("未登录");
                logoff.setVisibility(View.INVISIBLE);
            }
        });
        username = (TextView)view.findViewById(R.id.user_username);
        isLogon = false;
        username.setText("未登陆");
        logoff.setVisibility(View.INVISIBLE);

        RelativeLayout userInfo = (RelativeLayout)view.findViewById(R.id.user_userInfo);
        userInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isLogon) {
//                    Intent intent = new Intent(SettingFragment.this.getContext(), AlterUserActivity.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putString("username", username.getText().toString());
//                    intent.putExtras(bundle);
//                    intent.putExtra("act", "main");
//                    startActivity(intent);
                } else {
//                    Intent intent = new Intent(SettingFragment.this.getContext(), LoginActivity.class);
//                    startActivity(intent);
                }
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("d", "onResume: SettingFragment");

        Intent intent = getActivity().getIntent();
        if (intent == null) return;
        if (intent.getStringExtra("act") == null) return;
        if (intent.getStringExtra("act").equals("login")) {
            Bundle bundle = intent.getExtras();
            getUserdataByName(bundle.getString("username"));
            isLogon = true;
            username.setText(userData.username);
            logoff.setVisibility(View.VISIBLE);
        } else if (intent.getStringExtra("act").equals("alter")) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                isLogon = true;
                username.setText(bundle.getString("username"));
                logoff.setVisibility(View.VISIBLE);
            }
        }
    }
}
