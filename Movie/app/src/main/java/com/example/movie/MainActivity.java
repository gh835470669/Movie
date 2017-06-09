package com.example.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Button registerButton;
    private Button loginButton;
    private EditText username;
    private EditText password;

    private ArrayList<String[]> userdatas;

    private void getUserdatas() {
        userdatas = new ArrayList<>();
        userdatas.add(new String[] {"abc", "abc"});
        //get datas from database
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserdatas();

        registerButton = (Button)findViewById(R.id.LogIn_registerButton);
        username = (EditText)findViewById(R.id.LogIn_username);
        password = (EditText)findViewById(R.id.LogIn_password);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("userdatas", userdatas);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        loginButton = (Button)findViewById(R.id.LogIn_loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                for (int i = 0; i < userdatas.size(); i++) {
                    if (username.getText().toString().equals(userdatas.get(i)[0])) {
                        if (password.getText().toString().equals(userdatas.get(i)[1])) {
                            Intent intent = new Intent(MainActivity.this, MovieActivity.class);
                            startActivity(intent);
                            return;
                        } else {
                            Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }
                Toast.makeText(MainActivity.this, "用户名错误", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Bundle b = getIntent().getExtras();
        if (b != null) {
            ArrayList<String[]> users = (ArrayList<String[]>)b.getSerializable("userdatas");
            if (users != null) {
                userdatas = users;
            } else {
                Log.d("d", "onResume: userdatas are null");
            }
        }
    }
}
