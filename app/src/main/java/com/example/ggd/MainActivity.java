package com.example.ggd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Запуск dozo
        Button button = findViewById(R.id.dozo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.hyperpc", "com.example.hyperpc.Splashscreen"));
                startActivity(intent);
            }
        });

        //Запуск kairos
        Button button1 = findViewById(R.id.kairos);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.kotocar", "com.example.kotocar.SplashScreen"));
                startActivity(intent);
            }
        });

        //Запуск vaga
        Button button2 = findViewById(R.id.vaga);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.vaga", "com.example.vaga.MainActivity"));
                startActivity(intent);
            }
        });

        //Запуск pickle
        Button button3 = findViewById(R.id.pickle);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.pickle", "com.example.pickle.MainActivity"));
                startActivity(intent);
            }
        });

        //Запуск olman
        Button button4 = findViewById(R.id.olman);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.olman", "com.example.olman.MainActivity"));
                startActivity(intent);
            }
        });
    }

}