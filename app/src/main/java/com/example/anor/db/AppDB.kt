package com.example.anor.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [ItemsEntity::class], version = 1, exportSchema = false)

abstract class AppDB : RoomDatabase() {

    abstract fun getNotesDAO(): DAO

    companion object {

        private var INSTANCE: AppDB? = null

        fun getApplicationDB(context: Context): AppDB {
            if (INSTANCE == null) {
                synchronized(AppDB::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            AppDB::class.java, "room_db"
                        )
                            .fallbackToDestructiveMigration()
                            .build()
                    }
                }
            }
            return INSTANCE!!
        }
    }

}