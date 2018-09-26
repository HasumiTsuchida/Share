package com.example.admin.share;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setting_Personal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting__personal);



        OriginalFragmentPagerAdapter adapter = new OriginalFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.viewPager);
        switch (viewPager.getId()){
            case 1:
                Button();
                Intent intent = new Intent(Setting_Personal.this,Setting_Personal.class);
                startActivity(intent);
            case 2:
                Button();
                Intent intent2 = new Intent(Setting_Personal.this,Setting_Group.class);
                startActivity(intent2);
            case 3:
                Button();
                Intent intent3 = new Intent(Setting_Personal.this,Setting_Other.class);
                startActivity(intent3);

        }
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
    protected void Button(){
        Button setting_personal_button=(Button)findViewById(R.id.setting_personal_button);
        Button back_login_top_button=(Button)findViewById(R.id.back_login_top_button);


        setting_personal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting_Personal.this,Setting_Personal.class);
                startActivity(intent);
            }
        });
        back_login_top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting_Personal.this,Login_TOP.class);
                startActivity(intent);
            }
        });
    }
}
