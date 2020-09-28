package com.internship.yaarmelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NightModeLoginActivity extends AppCompatActivity {

    FloatingActionButton fab_day_mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_mode_login);

        fab_day_mode = (FloatingActionButton)findViewById(R.id.day_mode_fab);
        fab_day_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(NightModeLoginActivity.this,MainActivity.class);
                Toast.makeText(NightModeLoginActivity.this," Day Mode ",Toast.LENGTH_SHORT).show();
                startActivity(p);
            }
        });

    }
}