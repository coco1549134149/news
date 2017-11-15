package com.example.seu.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.seu.myapplication.R;

public class news_item_Activity extends AppCompatActivity {

    private ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_item);
        image1 = (ImageView)findViewById(R.id.image);
        Glide.with(this).load("http://182.254.152.65:8000/Upload/News/20160523185952089.png").into(image1);
    }
}
