package com.example.runmvvmmapsroomcoroutinessettingshilt.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runmvvmmapsroomcoroutinessettingshilt.R
import com.example.runmvvmmapsroomcoroutinessettingshilt.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val vieModel: StatisticsViewModel by viewModels()

}