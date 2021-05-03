package com.example.anor.di

import android.content.Context
import androidx.room.Room
import com.example.anor.db.AppDB
import com.example.anor.db.DAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDB =
        Room.databaseBuilder(
            appContext,
            AppDB::class.java,
            "app_database"
        ).fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun provideCreateFragmentDAO(
        db: AppDB
    ): DAO = db.getNotesDAO()


}