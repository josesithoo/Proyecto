package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm10);
    }
    public void cargarpantalla(View v) {
        Intent frm9 = new Intent(this, FrmActivity.class);
        startActivity(frm9);
        finish();
    }
}
