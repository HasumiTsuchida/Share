package com.example.admin.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

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
                boolean hasError = true;
                EditText editText_member_name = (EditText)findViewById(R.id.editText_member_name);

                if(editText_member_name.getText().toString().isEmpty()) {
                    editText_member_name.setError("名前を入力してください");
                    hasError = false;
                }
//||editText_member_name.getText().toString().matches("^[!-/:-@\\-`{-~]+$")
                //全角を含む文字列のみ許容 "^[\\x01-\\x7E]+$"
                if(editText_member_name.getText().toString().matches("^[\\x01-\\x7E]+$") || editText_member_name.getText().toString().matches("^[!-/:-@{-~_^`]+$")){
                    editText_member_name.setError("記号を除く全角文字で入力してください");
                    hasError = false;
                }
                EditText editText_mail_address = (EditText)findViewById(R.id.editText_mail_address);
                if(editText_mail_address.getText().toString().isEmpty()) {
                    editText_mail_address.setError("メールアドレスを入力してください");
                    hasError = false;
                }
                if(!(editText_mail_address.getText().toString().matches("^[0-9a-zA-Z_@\\.]+$"))) {
                    editText_mail_address.setError("不正な文字が含まれています");
                    hasError = false;
                }
                RadioButton pass_true_button = (RadioButton)findViewById(R.id.pass_true_button);
                EditText editText_password = (EditText)findViewById(R.id.editText_password);
                if(pass_true_button.isChecked() == true){
                    if(editText_password.getText().toString().isEmpty()) {
                        editText_password.setError("パスワードを入力してください");
                        hasError = false;
                    }
                }
                EditText editText_notification_times = (EditText)findViewById(R.id.editText_notification_times);
                if(editText_notification_times.getText().toString().isEmpty()) {
                    editText_notification_times.setText("3");
                }
                if(!hasError){
                    return ;
                }
                Intent intent = new Intent(Insert_MemberActivity.this, Complete_Insert_Member.class);
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