package com.example.portraitdrawingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Portrait Drawing");

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent1 = new Intent(MainActivity.this, Page1.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(MainActivity.this, Page2.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(MainActivity.this, Page3.class);
                startActivity(intent3);
                break;

            default :
                break;
        }
    }
}