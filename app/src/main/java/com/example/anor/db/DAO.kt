package com.example.anor.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAO {
    @Query("SELECT*FROM items_entity")
    suspend fun allNotes(): List<ItemsEntity>

    @Insert
    suspend fun insertItems(itemsEntity: List<ItemsEntity>)

}