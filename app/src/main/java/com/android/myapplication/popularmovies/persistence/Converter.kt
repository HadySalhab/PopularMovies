package com.android.myapplication.popularmovies.persistence

import com.android.myapplication.popularmovies.api.model.Genre
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converter {
    private val gson=Gson()

    fun fromGenresList(genres:List<Genre>):String{
        return gson.toJson(genres)
    }

    fun toGenresList(genres: String?):List<Genre>{
        return  if(genres==null){
             emptyList()
        }else{
            val listType = object : TypeToken<List<Genre?>?>() {}.type
            gson.fromJson(genres,listType)
        }
    }
}