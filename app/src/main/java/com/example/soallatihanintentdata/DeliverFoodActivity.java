package com.example.soallatihanintentdata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeliverFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_food);
        TextView data_nama = (TextView) findViewById(R.id.data_nama);
        TextView data_alamat = (TextView) findViewById(R.id.data_alamat);
        TextView data_pesanan = (TextView) findViewById(R.id.data_pesanan);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String alamat = bundle.getString("alamat");
        String pesan = bundle.getString("pesan");

        data_nama.setText(name);
        data_alamat.setText(alamat);
        data_pesanan.setText(pesan);
    }
}
