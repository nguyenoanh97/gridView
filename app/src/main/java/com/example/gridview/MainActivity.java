package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvHinhAnh;
    ArrayList<HinhAnh> arrayImage;
    HinhAnhAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvHinhAnh = (GridView) findViewById(R.id.gridviewHinhAnh);
        arrayImage = new ArrayList<>();
        arrayImage.add(new HinhAnh("Chân giò hầm", R.drawable.changio));
        arrayImage.add(new HinhAnh("Cơm âm phủ", R.drawable.comamphu));
        arrayImage.add(new HinhAnh("Đùi gà nướng", R.drawable.duiganuong));
        arrayImage.add(new HinhAnh("Chân giò hầm", R.drawable.changio));
        arrayImage.add(new HinhAnh("Mỳ ống", R.drawable.miong));
        arrayImage.add(new HinhAnh("Món Âu", R.drawable.monau));
        arrayImage.add(new HinhAnh("Ốc xào", R.drawable.oc));
        arrayImage.add(new HinhAnh("Phở", R.drawable.pho));
        arrayImage.add(new HinhAnh("Xiên BBQ", R.drawable.xienbbq));

        adapter = new HinhAnhAdapter(this, R.layout.dong_hinh_anh, arrayImage);
        gvHinhAnh.setAdapter(adapter);
        gvHinhAnh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayImage.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });



        }


    }
