package com.example.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AlterUserActivity extends AppCompatActivity {
    private Button confirmButton;
    private Button cancelButton;
    private EditText username;
    private EditText password;
    private EditText confirmPass;
    private String username_str;
    private String password_str;
    private String avatar_url;
    private ArrayList<String[]> userdatas;

    private void getUserdatas() {
        userdatas = new ArrayList<>();
        userdatas.add(new String[] {"abc", "abc"});
        //get datas from database

    }

    private void alterUserData(String username, String password, String avatar) {
        //alter the database
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter_user);

        Intent intent = getIntent();
        if (intent == null) return;
        if (intent.getStringExtra("act") == null) return;
        if (intent.getStringExtra("act").equals("main")) {
            Bundle b = intent.getExtras();
            username_str = b.getString("username");
        }

        getUserdatas();

        username = (EditText)findViewById(R.id.alter_username);
        password = (EditText)findViewById(R.id.alter_password);
        confirmPass = (EditText)findViewById(R.id.alter_confirmPassword);

        confirmButton = (Button)findViewById(R.id.alter_confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                String conf = confirmPass.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(AlterUserActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (pass.isEmpty() || conf.isEmpty()) {
                    Toast.makeText(AlterUserActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!pass.equals(conf)) {
                    Toast.makeText(AlterUserActivity.this, "密码不一致", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (name.equals(username_str)) {
                    Toast.makeText(AlterUserActivity.this, "用户名已经被注册", Toast.LENGTH_SHORT).show();
                    return;
                }

                for (int i = 0; i < userdatas.size(); i++) {
                    if (name.equals(userdatas.get(i)[0])) {
                        Toast.makeText(AlterUserActivity.this, "用户名已经被注册", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }

                alterUserData(name, pass, null);

                Intent intent = new Intent(AlterUserActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("username", name);
                intent.putExtras(bundle);
                intent.putExtra("act", "alter");
                startActivity(intent);
            }
        });

        cancelButton = (Button)findViewById(R.id.alter_cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlterUserActivity.this, MainActivity.class);
                intent.putExtra("act", "alter");
                startActivity(intent);
            }
        });
    }
}
