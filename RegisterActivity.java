package com.example.x14322491.registerlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etAge = (EditText) findViewById(R,id.etAge);
        final EditText etName = (EditText) findViewById(R,id.etName);
        final EditText etUsername = (EditText) findViewById(R,id.etUsename);
        final EditText etPassword = (EditText) findViewById(R,id.etPassword);

        final Button bRegister = (Button) findViewById(R,id.bRegister);
    }
}
