package com.example.x14322491.registerlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText etUsername = (EditText) findViewById(R,id.etUsename);
        final EditText etPassword = (EditText) findViewById(R,id.etPassword);

        final Button bLogin = (Button) findViewById(R,id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.twRegisterHere);

        registerLink.setOnClickListener(new View.OnClickRegister(){
            public void onClick(View v){
                intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);




            }
            ) }
    }
}
