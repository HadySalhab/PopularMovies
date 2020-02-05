package com.android.myapplication.popularmovies.ui.list.state

sealed class ListStateEvent {
    class GetListMovie(sortBy:String):ListStateEvent()
}