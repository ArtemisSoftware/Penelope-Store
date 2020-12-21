package com.artemissoftware.penelopestore.di

import com.artemissoftware.penelopestore.api.MakeupApi
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideMakeupApi(): MakeupApi {
        return Retrofit.Builder()
            .baseUrl(MakeupApi.URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(MakeupApi::class.java)
    }

}