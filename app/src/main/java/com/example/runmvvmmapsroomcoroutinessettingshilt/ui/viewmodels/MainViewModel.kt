package com.example.runmvvmmapsroomcoroutinessettingshilt.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.runmvvmmapsroomcoroutinessettingshilt.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * By using @HiltViewModel we don't need to create factory
 *
 * @property mainRepository
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}