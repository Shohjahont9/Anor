package com.example.anor.di


import com.example.anor.db.DAO
import com.example.anor.ui.mainFragment.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import com.example.anor.network.ApiService

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun provideHomeRepository(
        api: ApiService,
        db: DAO
    ): MainRepository = MainRepository(api, db)

}

