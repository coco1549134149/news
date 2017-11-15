package com.example.seu.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.seu.myapplication.Entity.news;
import com.example.seu.myapplication.R;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seu on 2017/11/7.
 */

public class newsAdapter extends BaseAdapter {
    private LinkedList<news> news;
    private ArrayList<news> Onews = new ArrayList<news>();
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public newsAdapter(Context mContext,ArrayList<news> n) {
        this.Onews =n;
        this.news = news;
        this.mContext = mContext;
        mLayoutInflater = LayoutInflater.from(mContext);
    }



    @Override
    public int getCount() {
        return Onews.size();
    }

    @Override
    public news getItem(int position) {
        return Onews.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    static class viewHolder{
        public ImageView imageView;
        public TextView newsTitle,newsTime,newsAuther;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder holder = null;
        if (convertView==null){
            convertView = mLayoutInflater.inflate(R.layout.activity_news_item,null);
            holder = new viewHolder();
            holder.imageView = (ImageView)convertView.findViewById(R.id.image);
            holder.newsTitle = (TextView)convertView.findViewById(R.id.title);
            holder.newsAuther = (TextView)convertView.findViewById(R.id.Auther);
            holder.newsTime = (TextView)convertView.findViewById(R.id.time);
            convertView.setTag(holder);
            }else{
            holder = (viewHolder)convertView.getTag();
        }

        news item = getItem(position);
        holder.newsTitle.setText(item.getTitle());
        holder.newsAuther.setText(item.getAuther());

        holder.newsTime.setText(item.getPublishDate());







        System.out.println("---------------------我是一条可爱的分割线-----------------------");
        Glide.with(mContext).load("http://182.254.152.65:8000/Upload/News/20160523185952089.png").into(holder.imageView);
        return convertView;
    }
}
