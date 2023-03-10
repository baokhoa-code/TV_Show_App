package com.example.tv_show_mvvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tv_show_mvvm.repositories.MostPopularTVShowsRepository;
import com.example.tv_show_mvvm.responses.TVShowsResponse;

public class MostPopularTVShowsViewModel extends ViewModel {

    private final MostPopularTVShowsRepository mostPopularTVShowsRepository;

    public MostPopularTVShowsViewModel() {
        mostPopularTVShowsRepository = new MostPopularTVShowsRepository();
    }

    public LiveData<TVShowsResponse> getMostPopularTVShows(int page) {
        return mostPopularTVShowsRepository.getMostPopularTVShows(page);
    }
}
