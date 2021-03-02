package com.example.mohamed.newsappstage2;

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<Newsnetwork>> {

    String mURL ;

    public NewsLoader(Context context, String url) {
        super(context);
        this.mURL = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Newsnetwork> loadInBackground() {
        if (mURL == null) {
            return null;
        }

        List<Newsnetwork> newsList = QueryUtils.fetchNewsData(mURL);
        return newsList;
    }
}