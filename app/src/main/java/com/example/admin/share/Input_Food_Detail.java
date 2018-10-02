package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Input_Food_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input__food__detail);

        Button back_page_button=(Button)findViewById(R.id.back_page_button);
        Button insert_food_detail_button=(Button)findViewById(R.id.insert_food_detail_button);

        back_page_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Input_Food_Detail.this,Food_TOP.class);
                startActivity(intent);
            }
        });
        insert_food_detail_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Input_Food_Detail.this,Food_TOP.class);
                startActivity(intent);
            }
        });

    }
}
