package com.android.myapplication.popularmovies.api.responses

import com.android.myapplication.popularmovies.api.model.Movie
import com.google.gson.annotations.SerializedName

public class MovieResponse{

    @SerializedName("page")
    var page:Int=1

    @SerializedName("total_results")
    val totalResults:Int=0

    @SerializedName("total_pages")
    val total_pages:Int=0

    @SerializedName("results")
    var movies:List<Movie>?=null
}