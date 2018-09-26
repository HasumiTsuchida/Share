package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Complete_Insert_Member extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete__insert__member);

        Button back_top_button=(Button)findViewById(R.id.back_top_button);

        back_top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Complete_Insert_Member.this,Login_TOP.class);
                startActivity(intent);
            }
        });
    }
}
