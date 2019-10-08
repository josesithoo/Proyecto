package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm9);
    }
    public void cargarpantalla2(View v){
        Intent frm1 = new Intent(this, FrmActivity.class);
        startActivity(frm1);
        finish();
    }
}
