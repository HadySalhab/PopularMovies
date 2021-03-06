package com.android.myapplication.popularmovies.persistence

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
public interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: MovieEntity)

    @Delete
    suspend fun deleteMovie(movie: MovieEntity)

    @Query("SELECT * FROM movie WHERE id = :id")
    suspend fun getMovieById(id: Long): MovieEntity?

    @Query("SELECT * FROM movie")
    fun getAllMovies(): LiveData<List<MovieEntity>>
}