package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Insert_MemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_member);

        Button insert_member_button=(Button)findViewById(R.id.insert_member_button);
        Button back_top_button=(Button)findViewById(R.id.back_top_button);

        insert_member_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(Insert_MemberActivity.this,Complete_Insert_Member.class);
            startActivity(intent);
            }
        });
        back_top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Insert_MemberActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}