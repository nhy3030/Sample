package com.example.haams.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class CheckForFood extends AppCompatActivity {

    private Intent fIntent,cIntent;
    private Button btnOk, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initFlating();

    }

    private void initFlating() {

        LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout = inflater.inflate(R.layout.activity_for_check_things, null, false);
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("야식 각입니다.");
        dlg.setView(layout);

        dlg.show();

        btnOk = (Button) layout.findViewById(R.id.btn_OK);
        btnCall = (Button) layout.findViewById(R.id.btnCall);

        btnOk.setOnClickListener(new dialogListener());
        btnCall.setOnClickListener(new dialogListener());

    }

    private class dialogListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_OK:
                    fIntent = new Intent();
                    fIntent.putExtra("food", "오늘 야식은 무엇입니까?!?");
                    setResult(RESULT_OK, fIntent);
                    finish();
                    break;

                case R.id.btnCall:
                    cIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01046182721"));
                    startActivity(cIntent);
                    break;
            }

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
