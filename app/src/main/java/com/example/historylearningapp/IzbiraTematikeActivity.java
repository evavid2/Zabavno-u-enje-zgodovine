package com.example.historylearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IzbiraTematikeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izbira_tematike);

        Button nap = (Button) findViewById(R.id.Napoelon);
        nap.setOnClickListener(this);
        nap.setBackgroundColor(Color.parseColor("#808080"));
        Button franc = (Button) findViewById(R.id.Franc);
        franc.setOnClickListener(this);
        franc.setBackgroundColor(Color.parseColor("#808080"));
        Button ref = (Button) findViewById(R.id.Ref);
        ref.setBackgroundColor(Color.parseColor("#808080"));
        ref.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Napoelon:
                startActivity(new Intent(getApplicationContext()
                        , MainActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.Franc:
                // do your code
                break;
            case R.id.Ref:
                // do your code
                break;
            default:
                break;
        }
    }
}