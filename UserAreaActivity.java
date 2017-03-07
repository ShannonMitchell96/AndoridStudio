package com.example.x14322491.registerlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText) findViewById(R,id.etUsename);
        final EditText etAge = (EditText) findViewById(R,id.etAge);
        final EditText etUsername = (EditText) findViewById(R,id.etUsename);
        final TextView welcomeMessage = (TextView) findViewById(R,id.etWelcomeMsg);
    }
}
