package com.example.tv_show_mvvm.repositories;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tv_show_mvvm.network.ApiClient;
import com.example.tv_show_mvvm.network.ApiService;
import com.example.tv_show_mvvm.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostPopularTVShowsRepository {
    private static final String TAG = MostPopularTVShowsRepository.class.getSimpleName();
    private final ApiService apiService;

    public MostPopularTVShowsRepository() {
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TVShowsResponse> getMostPopularTVShows(int page) {

        MutableLiveData<TVShowsResponse> data = new MutableLiveData<>();

        apiService.getMostPopularTVShows(page).enqueue(new Callback<TVShowsResponse>() {
            @Override
            public void onResponse(@NonNull Call<TVShowsResponse> call, @NonNull Response<TVShowsResponse> response) {
                Log.d(TAG, "onResponse: ");
                data.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<TVShowsResponse> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure: ");
                data.setValue(null);
            }
        });
        return data;
    }
}
