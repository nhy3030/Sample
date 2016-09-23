package com.example.haams.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class CheckForHobby extends AppCompatActivity {

    private Intent hIntent,cIntent;
    private Button btnOk,btnCall,btnEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_for_hobby);
        initFlating();

    }

    private void initFlating() {

        LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout = inflater.inflate(R.layout.activity_for_check_things, null, false);
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("취미 뭐에요?");
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
                    hIntent = new Intent();
                    hIntent.putExtra("hobby", "당신의 취미는 무엇입니까?!?");
                    setResult(RESULT_OK, hIntent);
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
  /*  @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }*/
}
