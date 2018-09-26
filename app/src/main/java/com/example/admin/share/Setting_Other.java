package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setting_Other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting__other);

        Button setting_other_button=(Button)findViewById(R.id.setting_other_button);
        Button back_login_top_button=(Button)findViewById(R.id.back_login_top_button);

        setting_other_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting_Other.this,Setting_Other.class);
                startActivity(intent);
            }
        });
        back_login_top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting_Other.this,Login_TOP.class);
                startActivity(intent);
            }
        });
    }
}
