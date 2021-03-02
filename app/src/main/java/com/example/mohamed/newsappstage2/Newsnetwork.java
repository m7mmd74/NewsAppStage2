package com.example.mohamed.newsappstage2;

public class Newsnetwork {
    private String mTitle;
    private String mCategory;
    private String mDate;
    private String mUrl;
    private String mAuthor;

    public Newsnetwork(String mTitle, String mCategory, String mDate, String mUrl, String mAuthor) {
        this.mTitle = mTitle;
        this.mCategory = mCategory;
        this.mDate = mDate;
        this.mUrl = mUrl;
        this.mAuthor = mAuthor;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmAuthor() {
        return mAuthor;
    }
}
