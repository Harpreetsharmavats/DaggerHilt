package com.example.daggerhilt.di

import com.example.daggerhilt.data.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun retrofitInstance() : Retrofit {
        return Retrofit.Builder().baseUrl("https://randomuser.me/").addConverterFactory(
            GsonConverterFactory.create()).build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(retrofit: Retrofit) : ApiService {
        return retrofit.create(ApiService::class.java)
    }
}