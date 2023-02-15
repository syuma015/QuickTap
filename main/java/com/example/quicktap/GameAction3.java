package com.example.quicktap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class GameAction3 extends AppCompatActivity implements Runnable, View.OnClickListener{
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button startbtn;


    private TextView textTime;


    private final Handler handler = new Handler(Looper.getMainLooper());
    // HandlerはThreadを使って並行処理する際にメインスレッドに対して受け渡ししてくれます
    private final SimpleDateFormat date = new SimpleDateFormat("mm:ss:SS", Locale.JAPAN);
    // SimpleDateFormatクラスを使って日時を文字列で表示できる

    private volatile boolean timephase = false;



    private int count;
    private long startTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_action3);


        count = 1;
        b1 = findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.button5);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.button6);
        b6.setOnClickListener(this);
        b7 = findViewById(R.id.button7);
        b7.setOnClickListener(this);
        b8 = findViewById(R.id.button8);
        b8.setOnClickListener(this);
        b9 = findViewById(R.id.button9);
        b9.setOnClickListener(this);
        startbtn = findViewById(R.id.buttonstart);
        startbtn.setOnClickListener(this);

//        ((Button)findViewById(R.id.button1)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button2)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button3)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button4)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button5)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button6)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button7)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button8)).setOnClickListener(this);
//        ((Button)findViewById(R.id.button9)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonHome)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonRetry)).setOnClickListener(this);

        textTime = (TextView)findViewById(R.id.textTime);
        textTime.setText(date.format(0));
        // textTime.setText(date.format(0));で「00:00:00」をテキスト表示

        List<String> number = new ArrayList<String>();
        number.add("1");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        number.add("9");
        Collections.shuffle(number);

        b1.setText(number.get(0));
        b2.setText(number.get(1));
        b3.setText(number.get(2));
        b4.setText(number.get(3));
        b5.setText(number.get(4));
        b6.setText(number.get(5));
        b7.setText(number.get(6));
        b8.setText(number.get(7));
        b9.setText(number.get(8));





    }


    @Override
    public void onClick(View view) {
        Thread thread;
        //　ボタンが複数ある場合はswitch文を使用する
        switch (view.getId()) {
            //b1.setVisibility(View.INVISIBLE);でボタンを消せる
            //b1.setVisibility(View.VISIBLE);でボタンを再表示させられる

            case (R.id.button1):
                if(b1.getText().toString().equals("" + count)){
                    b1.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button2):
                if(b2.getText().toString().equals("" + count)) {
                    b2.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button3):
                if(b3.getText().toString().equals("" + count)) {
                    b3.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button4):
                if(b4.getText().toString().equals("" + count)) {
                    b4.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button5):
                if(b5.getText().toString().equals("" + count)) {
                    b5.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button6):
                if(b6.getText().toString().equals("" + count)) {
                    b6.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button7):
                if(b7.getText().toString().equals("" + count)) {
                    b7.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button8):
                if(b8.getText().toString().equals("" + count)) {
                    b8.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.button9):
                if(b9.getText().toString().equals("" + count)) {
                    b9.setVisibility(view.INVISIBLE);
                    count += 1;
                }
                if(count == 10){
                    timephase = true;
                    textTime.setText(date.format(0));
                    Intent intentScore = new Intent(getApplication(),ScoreZone.class);
                    startActivity(intentScore);
                }
                break;
            case (R.id.buttonstart):
                startbtn.setVisibility(View.INVISIBLE);
                timephase = false;
                thread = new Thread(this);
                thread.start();
                startTime = System.currentTimeMillis();
                break;
            case (R.id.buttonHome):
                Intent intenthome = new Intent(getApplication(),MainActivity.class);
                startActivity(intenthome);
                break;
            case (R.id.buttonRetry):
                Intent intentretry = new Intent(getApplication(),GameAction3.class);
                startActivity(intentretry);
                break;
        }
    }

    @Override
    public void run(){

        int period = 10;

        while(!timephase){
            try{
                Thread.sleep(period);
            }catch (InterruptedException e){
                e.printStackTrace();
                timephase = true;
            }
            handler.post(new Runnable() {
                @Override
                public void run() {
                    long endTime = System.currentTimeMillis();
                    // System.currentTimeMillis()は現在の時間を取得してくれ、スタートした時間とストップした時間の差がタイマー表示してくれる
                    long nowTime = (endTime - startTime);

                    textTime.setText(date.format(nowTime));
                }
            });
        }

    }
}