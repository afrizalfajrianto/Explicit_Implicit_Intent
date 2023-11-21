package com.example.helloappti22a4;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainHome extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.btnSetAlarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode untuk mengatur alarm
                setAlarm();
            }
        });
    }
    private void setAlarm() {
        Intent alarm = new Intent(android.provider.AlarmClock.ACTION_SET_ALARM);
        startActivity(alarm);
    }

    public void btnHelloWorld(View view) {
        Intent helloworld = new Intent(MainHome.this, MainHello.class);
        startActivity(helloworld);
    }

    public void btnCount(View view) {
        Intent count = new Intent(MainHome.this, CountActivity.class);
        startActivity(count);
    }

    public void btnSianida(View view) {
        Intent sianida = new Intent(MainHome.this, ScrollingIceCoold.class);
        startActivity(sianida);
    }

    public void btnTwoActivity(View view) {
        Intent twoact = new Intent(MainHome.this, FibonacciActivity.class);
        startActivity(twoact);
    }

    public void btnToast(View view) {
        Intent toast = new Intent(MainHome.this, TwoactActivity.class);
        startActivity(toast);
    }
}
