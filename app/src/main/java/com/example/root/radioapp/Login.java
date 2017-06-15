package com.example.root.radioapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Login extends Activity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

           TextView textView = (TextView) findViewById(R.id.link_criar_conta);
           textView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(Login.this, SingUp.class);
                   startActivity(intent);
                   finish();
               }
           });

    }
}
