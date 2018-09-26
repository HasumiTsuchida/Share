package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food_TOP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__top);

        Button back_login_top_button=(Button)findViewById(R.id.back_login_top_button);
        Button food_name_button=(Button)findViewById(R.id.food_name_button);

        back_login_top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food_TOP.this,Login_TOP.class);
                startActivity(intent);
            }
        });
        food_name_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food_TOP.this,Input_Food_Detail.class);
                startActivity(intent);
            }
        });
    }
}
