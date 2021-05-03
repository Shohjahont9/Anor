package com.example.anor.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items_entity")
data class ItemsEntity(
    var title: String,
    var date: String,
    var sts: Int,
    var progress: Int,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)