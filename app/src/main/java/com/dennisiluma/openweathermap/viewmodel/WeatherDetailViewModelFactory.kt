package com.dennisiluma.openweathermap.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dennisiluma.openweathermap.repository.WeatherDetailRepository

class WeatherDetailViewModelFactory (private val weatherDetailRepository: WeatherDetailRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return WeatherDetailViewModel(weatherDetailRepository) as T
    }
}
