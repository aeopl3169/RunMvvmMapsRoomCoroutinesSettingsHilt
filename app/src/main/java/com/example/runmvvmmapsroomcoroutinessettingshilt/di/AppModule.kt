package com.example.runmvvmmapsroomcoroutinessettingshilt.di

import android.content.Context
import androidx.room.Room
import com.example.runmvvmmapsroomcoroutinessettingshilt.db.RunningDatabase
import com.example.runmvvmmapsroomcoroutinessettingshilt.others.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * In dagger we have to create separate components for this module but in new dagger hilt we just need to use @InstallIn.
 * @InstallIn annotation tells dagger that this module should be installed in 'SingletonComponent' class.
 * For component lifetime - https://developer.android.com/training/dependency-injection/hilt-android#component-lifetimes .
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * @param app - @ApplicationContext will provide context. This feature will work by using hilt.
     */
    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    /**
     * @param db - Dagger looks for functions which provides 'RunningDatabase' in the module
     * if found, it automatically creates 'RunningDatabase' and passes it in this parameter.
     */
    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}