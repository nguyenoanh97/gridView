package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gvTen;
    String[] arrayTen = {"A", "B", "C", "D", "E", "F", "Y", "K", "L", "M", "O", "P", "Q", "G", "H", "I", "J"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvTen = (GridView) findViewById(R.id.gridviewTen);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayTen);
        gvTen.setAdapter(adapter);

        gvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayTen[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}