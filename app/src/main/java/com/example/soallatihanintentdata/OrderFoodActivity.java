package com.example.soallatihanintentdata;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class OrderFoodActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);
        final EditText nama = (EditText) findViewById(R.id.nama);
        final EditText alamat = (EditText) findViewById(R.id.almt);
        final EditText pesan = (EditText) findViewById(R.id.psn);
        Button btnorder = (Button) findViewById(R.id.btnorder);
        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ord = new Intent(OrderFoodActivity.this,DeliverFoodActivity.class);
                ord.putExtra("name", nama.getText().toString());
                ord.putExtra("alamat", alamat.getText().toString());
                ord.putExtra("pesan", pesan.getText().toString());
                startActivity(ord);
            }
        });
    }
}
