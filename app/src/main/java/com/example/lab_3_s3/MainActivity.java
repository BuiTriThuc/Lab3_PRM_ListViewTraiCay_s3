package com.example.lab_3_s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }

    private void AnhXa() {
        lvTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new TraiCay("Bong", "Vinh Long", R.drawable.bong));
        arrayTraiCay.add(new TraiCay("cam", "Dak Lak", R.drawable.cam));
        arrayTraiCay.add(new TraiCay("dua", "Ben Tre", R.drawable.dua));
        arrayTraiCay.add(new TraiCay("Sau Rieng", "Dak Nong", R.drawable.saurieng));
        arrayTraiCay.add(new TraiCay("Tao", "Trung Quoc", R.drawable.tao));
        arrayTraiCay.add(new TraiCay("Xoai", "Easup", R.drawable.xoai));

    }
}