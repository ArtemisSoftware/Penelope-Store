package com.artemissoftware.penelopestore.di

import com.artemissoftware.penelopestore.api.MakeupApi
import com.artemissoftware.penelopestore.repositories.MakeupRepository
import com.artemissoftware.penelopestore.repositories.MakeupRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMakeupRepository(makeupApi: MakeupApi): MakeupRepository {
        return MakeupRepository_Impl(makeupApi = makeupApi)
    }
}