package com.example.data.api

import com.example.data.model.movie.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("v1/search/movie.json")
    fun getSearchMovie(
        @Query("query") query: String,
        @Query("start") start: Int = 1,
        @Query("display") display: Int = 15
    ): Single<MovieResponse>

    @GET("v1/search/movie.json")
    suspend fun getSearchMovieFlow(
        @Query("query") query: String,
        @Query("start") start: Int = 1,
        @Query("display") display: Int = 15
    ): MovieResponse
}