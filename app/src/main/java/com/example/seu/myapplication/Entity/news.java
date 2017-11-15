package com.example.seu.myapplication.Entity;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by seu on 2017/11/7.
 */

public class news {
        private String NewsID;
        private String Title;
        private String Abstract;
        private String ImageUrl;
        private String PublishDate;
        private String Auther;



    public String getNewsID() {
        return NewsID;
    }

    public void setNewsID(String newsID) {
        NewsID = newsID;
    }

    public String getTitle() {
        if(Title.length()>10)
            return Title.substring(0,9)+"...";
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publicDate) {
        PublishDate = publicDate;
    }

    public String getAuther() {
        return Auther;
    }

    public void setAuther(String auther) {
        Auther = auther;
    }

    public ArrayList<news> initnews_list(){
        ArrayList<news> list = new ArrayList<news>();

        for(int i=0;i<2;i++){
            news n1 =new news();
            n1.setNewsID("9437c278-296b-43a2-a0a6-e81f9618fd23");
            n1.setAuther("admin");
            n1.setImageUrl("http://182.254.152.65:8000/Upload/News/20160523190004251.png");
            n1.setPublishDate("2016-05-23");
            n1.setTitle("参观考察活动");
            n1.setAbstract("");

            news n2 =new news();
            n2.setNewsID("dfa499f0-0f7c-41b8-8b92-c9844861d321");
            n2.setAuther("admin");
            n2.setImageUrl("http://182.254.152.65:8000/Upload/News/20160523190004251.png");
            n2.setPublishDate("2016-05-23");
            n2.setTitle("春的锣鼓，为五月太阳盛会敲响");
            n2.setAbstract("");

            news n3 =new news();
            n3.setNewsID("6e40e0a9-ed93-436b-8794-55d0cf1e60d3");
            n3.setAuther("admin");
            n3.setImageUrl("http://182.254.152.65:8000/Upload/News/20160523190004251.png");
            n3.setPublishDate("2016-05-23");
            n3.setTitle("阳光恩典砺风雨 绿色征程创新篇");
            n3.setAbstract("");

            list.add(n1);
            list.add(n2);
            list.add(n3);
        }

        return list;
    }
}
