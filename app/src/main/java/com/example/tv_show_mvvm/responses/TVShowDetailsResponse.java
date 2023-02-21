package com.example.tv_show_mvvm.responses;

import com.google.gson.annotations.SerializedName;
import com.example.tv_show_mvvm.model.TVShowDetails;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails;

    public TVShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
