package com.example.soallatihanintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton gofood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gofood = (ImageButton) findViewById(R.id.btngofood);
        gofood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent orderfood = new Intent(this,OrderFoodActivity.class);
        startActivity(orderfood);
    }
}
