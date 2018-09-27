package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.Date;

public class Calendar_TOP extends AppCompatActivity {

    private TextView titleText;
    private Button prevButton, nextButton;
    private CalendarAdapter mCalendarAdapter;
    private GridView calendarGridView;
    private GestureDetector mGestureDetector;
    private static final int SWIPE_MIN_DISTANCE = 50;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar__top);

        mGestureDetector = new GestureDetector(this, mOnGestureListener);

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

    }
    // これがないとGestureDetectorが動かない
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch ( event.getAction() ) {

            case MotionEvent.ACTION_DOWN:
                //画面がタッチされたときの動作

                break;

            case MotionEvent.ACTION_MOVE:
                //タッチしたまま移動したときの動作
                break;

            case MotionEvent.ACTION_UP:
                //タッチが離されたときの動作
                break;

            case MotionEvent.ACTION_CANCEL:
                //他の要因によってタッチがキャンセルされたときの動作
                break;
        }
        return mGestureDetector.onTouchEvent(event);
    }

    private final GestureDetector.SimpleOnGestureListener mOnGestureListener = new GestureDetector.SimpleOnGestureListener() {
        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {

            try {

                if (Math.abs(event1.getY() - event2.getY()) > SWIPE_MAX_OFF_PATH) {
                    // 縦の移動距離が大きすぎる場合は無視
                    return false;
                }

                if (event1.getX() - event2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    // 開始位置から終了位置の移動距離が指定値より大きい
                    // X軸の移動速度が指定値より大きい
                    mCalendarAdapter.nextMonth();
                    titleText.setText(mCalendarAdapter.getTitle());

                } else if (event2.getX() - event1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    // 終了位置から開始位置の移動距離が指定値より大きい
                    // X軸の移動速度が指定値より大きい
                    mCalendarAdapter.prevMonth();
                    titleText.setText(mCalendarAdapter.getTitle());
                }

            } catch (Exception e) {
                // nothing
            }
            return false;
        }
        @Override
        public boolean onDown(MotionEvent event) {
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
            return false;
        }
    };
}