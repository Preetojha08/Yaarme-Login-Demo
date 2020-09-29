package com.internship.yaarmelogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class Sign_upActivity extends AppCompatActivity {

    LinearLayout linearLayout_personal_details,linearLayout_set_up_login;
    Button btn_continue,btn_previous,btn_final_sign_up;

    View view_step_line_one,view_step_line_two;
    TextView tv_step_one,tv_step_two,tv_login_sign_up;

    EditText edt_first_name,edt_last_name,edt_username,edt_user_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        linearLayout_personal_details = (LinearLayout)findViewById(R.id.linearlayout_personal_details);
        linearLayout_set_up_login = (LinearLayout)findViewById(R.id.linearlayout_setup_details);

        btn_continue = (Button)findViewById(R.id.sign_up_continue_button);
        btn_previous = (Button)findViewById(R.id.sign_up_previous_button);
        btn_final_sign_up = (Button)findViewById(R.id.main_sign_up_button);

        tv_step_one = (TextView)findViewById(R.id.step_text_view_one);
        tv_step_two = (TextView)findViewById(R.id.step_text_view_two);
        tv_login_sign_up = (TextView)findViewById(R.id.text_view_login_sign_up);

        edt_first_name = (EditText)findViewById(R.id.first_name_user);
        edt_last_name = (EditText)findViewById(R.id.last_name_user);
        edt_username = (EditText)findViewById(R.id.et_username_user);
        edt_user_password = (EditText)findViewById(R.id.et_password_user);

        view_step_line_one = (View)findViewById(R.id.step_view_line_one);
        view_step_line_two = (View)findViewById(R.id.step_view_line_two);

        linearLayout_personal_details.setVisibility(View.VISIBLE);
        linearLayout_set_up_login.setVisibility(View.GONE);

        view_step_line_one.setVisibility(View.VISIBLE);
        view_step_line_two.setVisibility(View.GONE);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String first_n ,last_n;
                first_n = edt_first_name.getText().toString();
                last_n = edt_last_name.getText().toString();

                if (first_n.isEmpty() || last_n.isEmpty())
                {
                    Toast.makeText(Sign_upActivity.this,"Fill all the details",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    linearLayout_personal_details.setVisibility(View.GONE);
                    linearLayout_set_up_login.setVisibility(View.VISIBLE);
                    view_step_line_one.setVisibility(View.GONE);
                    view_step_line_two.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout_personal_details.setVisibility(View.VISIBLE);
                linearLayout_set_up_login.setVisibility(View.GONE);

            }
        });

        btn_final_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_step_two.setBackgroundResource(R.drawable.step_text_bg);
                tv_step_two.setTextColor(Color.WHITE);


            }
        });

        tv_login_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign_upActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}
