package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGood;
    CustomGoodAdapter adp;
    ArrayList<Good> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGood = findViewById(R.id.lvGood);

        arr = new ArrayList<>();
        arr.add(new Good("Google","80",R.drawable.ic_action_name));
        arr.add(new Good("Google","80",R.drawable.ic_action_name));
        arr.add(new Good("Google","80",R.drawable.ic_action_name));
        adp = new CustomGoodAdapter(this,R.layout.item_listview,arr);
        lvGood.setAdapter((adp));
    }
}