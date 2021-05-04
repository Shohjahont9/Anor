package com.example.anor.ui.mainFragment

import com.example.anor.db.DAO
import com.example.anor.network.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val api:ApiService,
    private val db:DAO
) {
    suspend fun getCharacters(id:Int) = api.chatacters(id)

    suspend fun getLocation(id: Int) = api.locations(id)

    suspend fun getEpisode(id: Int) = api.episodes(id)

    
}