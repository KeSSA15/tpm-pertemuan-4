package com.example.fragmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Implisit extends AppCompatActivity {

    ImageView activityimplisit_iv;
    TextView activityimplisit_tv_nama, activityimplisit_tv_desc;
    String nama, desc;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implisit);
        activityimplisit_iv = findViewById(R.id.activityimplisit_iv);
        activityimplisit_tv_nama = findViewById(R.id.activityimplisit_tv_nama);
        activityimplisit_tv_desc = findViewById(R.id.activityimplisit_tv_desc);
        nama = getIntent().getStringExtra("nama");
        desc = getIntent().getStringExtra("desc");
        image = getIntent().getIntExtra("image",0);
        activityimplisit_tv_nama.setText(nama);
        activityimplisit_tv_desc.setText(desc);
        activityimplisit_iv.setImageResource(image);


    }
}

