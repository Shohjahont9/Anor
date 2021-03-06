package com.example.anor.network.response.location

data class LocationResponse(
    val created: String?,
    val dimension: String?,
    val id: Int?,
    val name: String?,
    val residents: List<Any>?,
    val type: String?,
    val url: String?
)