package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm);
    }

    public void cargarpantalla(View v) {
        Intent frm2 = new Intent(this, Frm2Activity.class);
        startActivity(frm2);
        finish();
    }

    public void cargarpantalla2(View v) {
        Intent frm3 = new Intent(this, Frm3Activity.class);
        startActivity(frm3);
        finish();
    }

    public void cargarpantalla3(View v) {
        Intent frm4 = new Intent(this, Frm4Activity.class);
        startActivity(frm4);
        finish();
    }

    public void cargarpantalla4(View v) {
        Intent frm5 = new Intent(this, Frm5Activity.class);
        startActivity(frm5);
        finish();
    }

    public void cargarpantalla5(View v) {
        Intent frm6 = new Intent(this, Frm6Activity.class);
        startActivity(frm6);
        finish();
    }

    public void cargarpantalla6(View v) {
        Intent frm7 = new Intent(this, Frm7Activity.class);
        startActivity(frm7);
        finish();
    }

    public void cargarpantalla7(View v) {
        Intent frm8 = new Intent(this, Frm8Activity.class);
        startActivity(frm8);
        finish();
    }
    public void cargarpantalla8(View v) {
        Intent frm9 = new Intent(this, Frm9Activity.class);
        startActivity(frm9);
        finish();
    }
    public void cargarpantalla9(View v) {
        Intent frm10 = new Intent(this, Frm10Activity.class);
        startActivity(frm10);
        finish();
    }
    public void cargarpantalla10(View v) {
        Intent frm10 = new Intent(this, Frm11Activity.class);
        startActivity(frm10);
        finish();
    }
}