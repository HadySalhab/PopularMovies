package com.android.myapplication.popularmovies.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.android.myapplication.popularmovies.api.model.Genre
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movie")
data class MovieEntity(

    @PrimaryKey
    val id: Long = 0,

    @ColumnInfo(name = "original_title")
    val originalTitle: String? = null,

    @ColumnInfo(name = "poster_path")
    val posterPath: String? = null,

    @ColumnInfo(name = "backdrop_path")
    val backdropPath: String? = null,

    @ColumnInfo(name = "vote_average")
    val voteAverage: Double? = 0.0,

    @ColumnInfo(name = "vote_count")
    var voteCount: Int = 0,

    @ColumnInfo(name = "release_date")
    val releaseDate: String? = null,

    @ColumnInfo(name = "genres")
    val genres: List<Genre>? = null,

    @ColumnInfo(name = "runtime")
    val runtime:Int=0

)