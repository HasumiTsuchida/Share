package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView;

import java.util.Date;

public class Calendar_TOP extends AppCompatActivity {

    private TextView titleText;
    private Button prevButton, nextButton;
    private CalendarAdapter mCalendarAdapter;
    private GridView calendarGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar__top);

        Button back_login_top_button=(Button)findViewById(R.id.back_login_top_button);

        back_login_top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calendar_TOP.this,Login_TOP.class);
                startActivity(intent);
            }
        });

        titleText = findViewById(R.id.titleText);
        prevButton = findViewById(R.id.prevButton);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCalendarAdapter.prevMonth();
                titleText.setText(mCalendarAdapter.getTitle());
            }
        });
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCalendarAdapter.nextMonth();
                titleText.setText(mCalendarAdapter.getTitle());
            }
        });
        calendarGridView = findViewById(R.id.calendarGridView);
        mCalendarAdapter = new CalendarAdapter(this);
        calendarGridView.setAdapter(mCalendarAdapter);
        titleText.setText(mCalendarAdapter.getTitle());
        calendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //日付を取得できた↓
                String test = mCalendarAdapter.getDay(position);
                //TODO 日付とshare_id で検索結果があれば、値をつめて表示。
                // (返却される日付フォーマット例：2018/09/20)
                boolean hasResult = true;
                if(hasResult) {
                    Intent intent = new Intent(Calendar_TOP.this, Input_Menu_Detail.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(Calendar_TOP.this, Input_Menu_Detail.class);
                    startActivity(intent);
                }
            }
        });
    }
}