package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Input_Plan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input__plan);

        Button view_menu_detail_input_form=(Button)findViewById(R.id.view_menu_detail_input_form);
        Button view_plan_input_form=(Button)findViewById(R.id.view_plan_input_form);
        Button back_page_button=(Button)findViewById(R.id.back_page_button);
        Button insert_plan_button=(Button)findViewById(R.id.insert_plan_button);


        view_menu_detail_input_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Input_Plan.this,Input_Menu_Detail.class);
                startActivity(intent);
            }
        });

        view_plan_input_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Input_Plan.this,Input_Plan.class);
                startActivity(intent);
            }
        });

        back_page_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Input_Plan.this,Calendar_TOP.class);
                startActivity(intent);
            }
        });

        insert_plan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Input_Plan.this,Input_Plan.class);
                startActivity(intent);
            }
        });
    }
}
