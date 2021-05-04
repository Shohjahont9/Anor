package com.example.anor.network.response.episode

data class EpisodeResponse(
    val air_date: String?,
    val characters: List<Any>?,
    val created: String?,
    val episode: String?,
    val id: Int?,
    val name: String?,
    val url: String?
)