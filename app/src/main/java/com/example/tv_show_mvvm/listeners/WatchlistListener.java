package com.example.tv_show_mvvm.listeners;

import com.example.tv_show_mvvm.model.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist(TVShow tvShow, int position);
}
