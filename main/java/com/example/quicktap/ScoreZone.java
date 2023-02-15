package com.example.quicktap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreZone extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_zone);



        TextView textNew = (TextView)findViewById((R.id.textNew));
        TextView textScore = (TextView)findViewById((R.id.textScore));
        TextView textTime = (TextView)findViewById((R.id.textTime));

        ((Button)findViewById(R.id.buttonHome)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonRetry)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //　ボタンが複数ある場合はswitch文を使用する
        switch (view.getId()) {
            case (R.id.buttonHome):
                Intent intenthome = new Intent(getApplication(), MainActivity.class);
                startActivity(intenthome);
                break;
            case (R.id.buttonRetry):
                Intent intentretry = new Intent(getApplication(), GameAction3.class);
                startActivity(intentretry);
                break;
        }
    }
}