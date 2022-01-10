package com.example.historylearningapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PozdravniZaslonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pozdravni_zaslon);
        Button buttonZacnimo = findViewById(R.id.buttonZacnimo);
        buttonZacnimo.setOnClickListener(this);
    }

    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext()
                , IzbiraTematikeActivity.class));
        overridePendingTransition(0,0);
    }
}