package com.example.android.newsapp;


public class News {
    private String sectionName, webTitle, webPublicationDate, webUrl;

    public News(String new_sectionName, String new_webTitle, String new_webPublicationDate, String new_webUrl) {
        sectionName = new_sectionName;
        webTitle = new_webTitle;
        webPublicationDate = new_webPublicationDate;
        webUrl = new_webUrl;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getWebUrl() {
        return webUrl;
    }
}
