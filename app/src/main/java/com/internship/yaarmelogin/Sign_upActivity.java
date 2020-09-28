package com.internship.yaarmelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Sign_upActivity extends AppCompatActivity {

    LinearLayout linearLayout_personal_details,linearLayout_set_up_login;
    Button btn_continue,btn_previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        linearLayout_personal_details = (LinearLayout)findViewById(R.id.linearlayout_personal_details);
        linearLayout_set_up_login = (LinearLayout)findViewById(R.id.linearlayout_setup_details);

        btn_continue = (Button)findViewById(R.id.sign_up_continue_button);
        btn_previous = (Button)findViewById(R.id.sign_up_previous_button);

        linearLayout_personal_details.setVisibility(View.VISIBLE);
        linearLayout_set_up_login.setVisibility(View.GONE);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_personal_details.setVisibility(View.GONE);
                linearLayout_set_up_login.setVisibility(View.VISIBLE);
            }
        });

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_personal_details.setVisibility(View.VISIBLE);
                linearLayout_set_up_login.setVisibility(View.GONE);
            }
        });

    }
}