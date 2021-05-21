package com.example.runmvvmmapsroomcoroutinessettingshilt.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    // We can sort Long values easily when compared to java.util.Date, so we are using long to save date and time.
    var timeStamp: Long = 0L, // when our run was i.e. date and time
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L, // how long our run was
    var caloriesBurned: Int = 0
) {
    // We provide this data class objects based on this primary key, so we will not put id in constructor.
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}