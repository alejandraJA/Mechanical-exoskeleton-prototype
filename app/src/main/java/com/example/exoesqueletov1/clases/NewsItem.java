package com.example.exoesqueletov1.clases;

public class NewsItem {


    private String Title;
    private int userPhoto;

    public NewsItem(String title, int userPhoto) {
        Title = title;
        this.userPhoto = userPhoto;
    }

    String getTitle() {
        return Title;
    }

    int getUserPhoto() {
        return userPhoto;
    }
}