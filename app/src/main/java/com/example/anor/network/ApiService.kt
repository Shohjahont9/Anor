package com.example.anor.network

import com.example.anor.network.response.characters.CharacterResponse
import com.example.anor.network.response.episode.EpisodeResponse
import com.example.anor.network.response.location.LocationResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path


interface ApiService {

    @Headers("Content-Type: application/json")
    @GET("character/{id}")
    suspend fun chatacters(
        @Path("id") character:Int
    ): CharacterResponse

    @Headers("Content-Type: application/json")
    @GET("location/{id}")
    suspend fun locations(
        @Path("id") location:Int
    ): LocationResponse

    @Headers("Content-Type: application/json")
    @GET("episode/{id}")
    suspend fun episodes(
        @Path("id") episode:Int
    ): EpisodeResponse

}