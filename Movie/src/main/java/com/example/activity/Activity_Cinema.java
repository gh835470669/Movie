package com.example.activity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.models.Cinema;

/**
 * Created by Wang on 2017/6/20.
 */

public class Activity_Cinema extends Activity{

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cinema);
        ImageButton button = (ImageButton)findViewById(R.id.imageButton);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Cinema.this, Activity_Search.class);
                startActivity(intent);

            }
        });
    }
}