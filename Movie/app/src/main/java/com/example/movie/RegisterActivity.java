package com.example.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    private Button regiserButton;
    private EditText username;
    private EditText password;
    private EditText confirmPass;
    private ArrayList<String[]> userdatas;

    private void addUser(String[] userdata) {
        userdatas.add(userdata);
        //write data base
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Bundle b = getIntent().getExtras();
        userdatas = (ArrayList<String[]>)getIntent().getSerializableExtra("userdatas");

        username = (EditText)findViewById(R.id.alter_username);
        password = (EditText)findViewById(R.id.alter_password);
        confirmPass = (EditText)findViewById(R.id.alter_confirmPassword);

        regiserButton = (Button)findViewById(R.id.alter_confirmButton);
        regiserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                String conf = confirmPass.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (pass.isEmpty() || conf.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!pass.equals(conf)) {
                    Toast.makeText(RegisterActivity.this, "密码不一致", Toast.LENGTH_SHORT).show();
                    return;
                }

                for (int i = 0; i < userdatas.size(); i++) {
                    if (name.equals(userdatas.get(i)[0])) {
                        Toast.makeText(RegisterActivity.this, "用户名已经被注册", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }


                addUser(new String[]{name, pass});

                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("userdatas", userdatas);
                intent.putExtras(bundle);
                intent.putExtra("act", "register");
                startActivity(intent);
            }
        });
    }
}
