package com.belirsiz.beta;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {




    Button btnLogin1;
    Button btnKayit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }


    public void btnLogin1(View view) {
        Intent i = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(i);
    }


    public void btnKayit1(View view) {
        Intent i = new Intent(HomeActivity.this, SignupActivity.class);
        startActivity(i);
    }
}