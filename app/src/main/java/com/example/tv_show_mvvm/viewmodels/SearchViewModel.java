package com.example.tv_show_mvvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tv_show_mvvm.repositories.SearchTVShowRepository;
import com.example.tv_show_mvvm.responses.TVShowsResponse;

public class SearchViewModel extends ViewModel {

    private SearchTVShowRepository searchTVShowRepository;

    public SearchViewModel() {
        searchTVShowRepository = new SearchTVShowRepository();
    }

    public LiveData<TVShowsResponse> searchTVShow(String query, int page) {
        return searchTVShowRepository.searchTVShow(query, page);
    }
}
