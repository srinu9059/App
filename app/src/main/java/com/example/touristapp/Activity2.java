package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {
    ImageView italy;
    ImageView china;
    ImageView india;
    ImageView brazil;
    ImageView peru;
    ImageView mexico;
    ImageView jordan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        italy =findViewById(R.id.italy);
        italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,italy.class);
                startActivity(intent);
            }
        });

        china = findViewById(R.id.china);
        china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,china.class);
                startActivity(intent);
            }
        });

        india = findViewById(R.id.india);
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,india.class);
                startActivity(intent);
            }
        });

        brazil = findViewById(R.id.brazil);
        brazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,brazil.class);
                startActivity(intent);
            }
        });

        peru = findViewById(R.id.peru);
        peru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,peru.class);
                startActivity(intent);
            }
        });

        mexico = findViewById(R.id.mexico);
        mexico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,mexico.class);
                startActivity(intent);
            }
        });

        jordan = findViewById(R.id.jordan);
        jordan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,jordan.class);
                startActivity(intent);
            }
        });
    }
}