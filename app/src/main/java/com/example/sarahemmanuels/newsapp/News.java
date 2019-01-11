package com.example.sarahemmanuels.newsapp;

public class News {

    private String Title;
    private String Author;
    private String Url;
    private String Date;
    private String Section;

    public News(String title, String author, String url, String date, String section) {
        Title = title;
        Author = author;
        Url = url;
        Date = date;
        Section = section;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getUrl() {
        return Url;
    }

    public String getDate() {
        return Date;
    }

    public String getSection() {
        return Section;
    }

}
