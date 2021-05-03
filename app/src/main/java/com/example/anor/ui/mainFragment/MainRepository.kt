package com.example.anor.ui.mainFragment

import com.example.anor.db.DAO
import com.example.anor.network.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val api:ApiService,
    private val db:DAO
) {
}