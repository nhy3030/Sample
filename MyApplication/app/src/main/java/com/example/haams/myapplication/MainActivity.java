package com.example.haams.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.haams.myapplication.Pictures.Food_Pictures;
import com.example.haams.myapplication.Pictures.Hobby_Pictures;
import com.example.haams.myapplication.Pictures.Travel_Pictures;

import butterknife.BindView;
import butterknife.OnClick;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent1, intent2, intent3;
    private int requestCode1 = 1001;
    private int requestCode2 = 1002;
    private int requestCode3 = 1003;
    Food_Pictures pActivity;
    Hobby_Pictures hActivity;
    Travel_Pictures tActivity;
    private String str1, str2, str3;
    @BindView((R.id.food))
    Button bnt1;
    @BindView((R.id.hobby)) Button bnt2;
    @BindView((R.id.travel)) Button bnt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        findViewById(R.id.food).setOnClickListener(this);
        findViewById(R.id.travel).setOnClickListener(this);
        findViewById(R.id.hobby).setOnClickListener(this);
    }
    @OnClick(R.id.food)
    void OnFoodClick()
    {
           intent1 = new Intent(this,CheckForFood.class);
            startActivityForResult(intent1, requestCode1);
    }

    @OnClick({R.id.food, R.id.travel, R.id.hobby})
    void OnClikcEverthing() {
        Toast.makeText(MainActivity.this,"aaaa",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.food:
                intent1 = new Intent(this, CheckForFood.class);
                startActivityForResult(intent1, requestCode1);
                break;
            case R.id.travel:
                intent2 = new Intent(this, CheckForTravel.class);
                startActivityForResult(intent2, requestCode2);
                break;
            case R.id.hobby:
                intent3 = new Intent(this, CheckForHobby.class);
                startActivityForResult(intent3, requestCode3);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1001:
                if (resultCode == RESULT_OK) {
                    str1 = data.getStringExtra("food");
                    Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_LONG).show();
                    pActivity = new Food_Pictures(this);
                } else {
                    Log.e("error", "전송오류");
                }
                break;
            case 1002:
                if (resultCode == RESULT_OK) {
                    str2 = data.getStringExtra("travel");
                    Toast.makeText(getApplicationContext(), str2, Toast.LENGTH_LONG).show();
                    tActivity = new Travel_Pictures(this);
                } else {
                    Log.e("error", "전송오류");
                }
                break;
            case 1003:
                if (resultCode == RESULT_OK) {
                    str3 = data.getStringExtra("hobby");
                    Toast.makeText(getApplicationContext(), str3, Toast.LENGTH_LONG).show();
                    hActivity = new Hobby_Pictures(this);
                } else {
                    Log.e("error", "전송오류");
                }
                break;
        }
    }
}
