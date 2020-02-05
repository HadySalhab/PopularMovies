package com.android.myapplication.popularmovies.api

import androidx.lifecycle.LiveData
import com.android.myapplication.popularmovies.api.responses.MovieDetailsResponse
import com.android.myapplication.popularmovies.api.responses.MovieResponse
import com.android.myapplication.popularmovies.util.GenericApiResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMoviedbService {
    @GET("movie/{sort_by}")
    fun getMovies(
        @Path("sort_by")
        sortBy: String = "popular",
        @Query("page")
        page: Int
    ):LiveData<GenericApiResponse<MovieResponse>>
    @GET("movie/{id}")
    fun getMovieDetail(
        @Path("id")
        id:Int,
        @Query("append_to_response")
        details:String="videos,credits,reviews"
    ):LiveData<GenericApiResponse<MovieDetailsResponse>>

}