package com.android.myapplication.popularmovies.ui.list.state

import com.android.myapplication.popularmovies.ui.list.model.MovieData

data class ListViewState(
    var movieList:List<MovieData>?=null
)