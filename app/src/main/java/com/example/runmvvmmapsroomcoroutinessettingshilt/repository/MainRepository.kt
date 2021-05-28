package com.example.runmvvmmapsroomcoroutinessettingshilt.repository

import com.example.runmvvmmapsroomcoroutinessettingshilt.db.Run
import com.example.runmvvmmapsroomcoroutinessettingshilt.db.RunDAO
import dagger.Provides
import javax.inject.Inject

// In the AppModule class we did not create a function to provide this class by annotating with @Provides
// because here 'RunDAO' is the only parameters passed whose instance is already provided by dagger hilt
// and will automatically understand that this class should also be provided when required.

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTime() = runDao.getAllRunsSortedByTime()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}