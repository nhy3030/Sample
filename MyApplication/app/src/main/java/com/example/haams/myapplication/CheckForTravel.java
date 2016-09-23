package com.example.haams.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class CheckForTravel extends AppCompatActivity {

    private Intent tIntent,cIntent;
    private Button btnOk, btnCall,btnEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_for_travel);
        initFlating();


    }

    private void initFlating() {

        LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout = inflater.inflate(R.layout.activity_for_check_things, null, false);
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("여행 가고파 ㅠ");
        dlg.setView(layout);
        dlg.show();


        btnOk = (Button) layout.findViewById(R.id.btn_OK);
        btnCall = (Button) layout.findViewById(R.id.btnCall);
        btnEnd = (Button) layout.findViewById(R.id.btnEnd);

        btnOk.setOnClickListener(new dialogListener());
        btnCall.setOnClickListener(new dialogListener());
        btnEnd.setOnClickListener(new dialogListener());

    }

    private class dialogListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_OK:
                    tIntent = new Intent();
                    tIntent.putExtra("travel", "오늘의 여행지는 어디입니까?!?");
                    Log.i("travel","보내기 성공?");
                    setResult(RESULT_OK, tIntent);
                    finish();
                    break;

                case R.id.btnCall:
                    cIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01046182721"));
                    startActivity(cIntent);
                    break;

                case R.id.btnEnd:
                    finish();
                    break;

            }

        }
    }

}
