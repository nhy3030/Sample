package com.example.shinee.sapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bnt_intent;
    private EditText input_name;
    private EditText input_age;
    private EditText input_addr;
    private String name, age, addr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_name = (EditText)findViewById(R.id.txt1);
        input_age = (EditText)findViewById(R.id.txt2);
        input_addr = (EditText)findViewById(R.id.txt3);

        bnt_intent = (Button)findViewById(R.id.bnt_intent);
        bnt_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*name = input_name.getText().toString();
                age = input_age.getText().toString();
                addr = input_addr.getText().toString();
                */

                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                intent.putExtra("name", input_name.getText().toString());
                intent.putExtra("age", input_age.getText().toString());
                intent.putExtra("addr", input_addr.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
