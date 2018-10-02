package com.example.admin.share;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tab_Day_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab__day__detail);

        Tab_Day_Detail_Adpter adpter = new Tab_Day_Detail_Adpter(getSupportFragmentManager());

        ViewPager viewPager_day_detail = findViewById(R.id.viewPager_day_detail);

        viewPager_day_detail.setOffscreenPageLimit(3);
        viewPager_day_detail.setAdapter(adpter);

        TabLayout day_of_time = findViewById(R.id.day_of_time);
        day_of_time.setupWithViewPager(viewPager_day_detail);

    }
}
