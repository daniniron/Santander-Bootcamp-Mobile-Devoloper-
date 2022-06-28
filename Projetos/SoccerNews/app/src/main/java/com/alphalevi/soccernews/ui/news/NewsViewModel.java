package com.alphalevi.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alphalevi.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria tem destaque importante", ""));
        news.add(new News("Ferrina Joga no Sabado", ""));
        news.add(new News("Copa do mundo femenino", ""));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}