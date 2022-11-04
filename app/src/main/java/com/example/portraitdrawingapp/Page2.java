package com.example.portraitdrawingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Page2 extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        getSupportActionBar().setTitle("Draw Portrait");

        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        ImageButton imageButton9 = findViewById(R.id.imageButton9);
        ImageButton imageButton10 = findViewById(R.id.imageButton10);


        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
        imageButton9.setOnClickListener(this);
        imageButton10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton1:
                Intent intent1 = new Intent(Page2.this, Pic1.class);
                startActivity(intent1);
                break;
            case R.id.imageButton2:
                Intent intent2 = new Intent(Page2.this, Pic2.class);
                startActivity(intent2);
                break;
            case R.id.imageButton3:
                Intent intent3 = new Intent(Page2.this, Pic3.class);
                startActivity(intent3);
                break;
            case R.id.imageButton4:
                Intent intent4 = new Intent(Page2.this, Pic4.class);
                startActivity(intent4);
                break;
            case R.id.imageButton5:
                Intent intent5 = new Intent(Page2.this, Pic5.class);
                startActivity(intent5);
                break;
            case R.id.imageButton6:
                Intent intent6 = new Intent(Page2.this, Pic6.class);
                startActivity(intent6);
                break;
            case R.id.imageButton7:
                Intent intent7 = new Intent(Page2.this, Pic7.class);
                startActivity(intent7);
                break;
            case R.id.imageButton8:
                Intent intent8 = new Intent(Page2.this, Pic8.class);
                startActivity(intent8);
                break;
            case R.id.imageButton9:
                Intent intent9 = new Intent(Page2.this, Pic9.class);
                startActivity(intent9);
                break;
            case R.id.imageButton10:
                Intent intent10 = new Intent(Page2.this, Pic10.class);
                startActivity(intent10);
                break;
        }
    }
}