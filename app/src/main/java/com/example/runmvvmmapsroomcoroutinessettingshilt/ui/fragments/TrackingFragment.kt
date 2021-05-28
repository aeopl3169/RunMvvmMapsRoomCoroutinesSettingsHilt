package com.example.runmvvmmapsroomcoroutinessettingshilt.ui.fragments

import androidx.fragment.app.Fragment
import com.example.runmvvmmapsroomcoroutinessettingshilt.R
import com.example.runmvvmmapsroomcoroutinessettingshilt.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.fragment.app.viewModels


@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val vieModel: MainViewModel by viewModels()

}