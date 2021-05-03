package com.example.anor.network

import com.example.anor.network.response.characters.CharacterResponse
import retrofit2.http.GET

interface ApiService {

    @GET("character")
    suspend fun chatacters(
    ): CharacterResponse




}