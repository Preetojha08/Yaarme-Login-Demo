package com.internship.yaarmelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_night_mode;
    TextView tv_sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        setTitle("Login");
        tv_sign_up = (TextView)findViewById(R.id.sign_up_text_view);
        tv_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this,Sign_upActivity.class);
                startActivity(p);
            }
        });
        /*
        fab_night_mode = (FloatingActionButton)findViewById(R.id.night_mode_fab);

        fab_night_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this,NightModeLoginActivity.class);
                Toast.makeText(MainActivity.this," Night Mode ",Toast.LENGTH_SHORT).show();
                startActivity(p);
            }
        });
        */

    }
}