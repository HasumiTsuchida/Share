package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_TOP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_top);

        Button menu_and_plan_button=(Button)findViewById(R.id.menu_and_plan_button);
        Button food_button=(Button)findViewById(R.id.food_button);
        Button setting_button=(Button)findViewById(R.id.setting_button);

        menu_and_plan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_TOP.this,Calendar_TOP.class);
                startActivity(intent);
            }
        });
        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_TOP.this,Food_TOP.class);
                startActivity(intent);
            }
        });
        setting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_TOP.this,Tab_Setting.class);
                startActivity(intent);
            }
        });
    }
}
