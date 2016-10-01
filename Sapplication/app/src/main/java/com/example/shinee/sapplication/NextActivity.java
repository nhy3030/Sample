package com.example.shinee.sapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * Created by 서명윤 on 2016-09-30.
 */

public class NextActivity extends Activity implements OnClickListener {
    private TextView output_name;
    private TextView output_age;
    private TextView output_addr;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String name = "이름: " + intent.getStringExtra("name");
        String age = "나이: "+ intent.getStringExtra("age");
        String addr = "주소: " + intent.getStringExtra("addr");

        output_name = (TextView)findViewById(R.id.txt_next1);
        output_name.setText(name);


        output_age = (TextView)findViewById(R.id.txt_next2);
        output_age.setText(age);


        output_addr = (TextView)findViewById(R.id.txt_next3);
        output_addr.setText(addr);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
