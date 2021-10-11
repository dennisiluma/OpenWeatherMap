package com.dennisiluma.openweathermap.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dennisiluma.openweathermap.model.Weather
import com.dennisiluma.openweathermap.repository.WeatherDetailRepository
import kotlinx.coroutines.launch
import okhttp3.Response

class WeatherDetailViewModel(private val repository: WeatherDetailRepository) : ViewModel() {
    private val _response = MutableLiveData<Weather>()
    val weatherResponse: LiveData<Weather>
        get() = _response

    fun getLagosWeather() = viewModelScope.launch {
        repository.getLagosWeather().let {
            if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getKenyaWeather() = viewModelScope.launch {
        repository.getKenyaWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getCairoWeather() = viewModelScope.launch {
        repository.getCairoWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getAbujaWeather() = viewModelScope.launch {
        repository.getAbujaWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getNYWeather() = viewModelScope.launch {
        repository.getNYWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getTexasWeather() = viewModelScope.launch {
        repository.getTexasWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getAmazonWeather() = viewModelScope.launch {
        repository.getAmazonWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getBelarusWeather() = viewModelScope.launch {
        repository.getBelarusWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getLesothoWeather() = viewModelScope.launch {
        repository.getLesothoWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getJakartaWeather() = viewModelScope.launch {
        repository.getJakartaWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getAnkaraWeather() = viewModelScope.launch {
        repository.getAnkaraWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getKanoWeather() = viewModelScope.launch {
        repository.getKanoWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getPeruWeather() = viewModelScope.launch {
        repository.getPeruWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getWinnipegWeather() = viewModelScope.launch {
        repository.getWinnipegWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getBagdadWeather() = viewModelScope.launch {
        repository.getBagdadWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }

    fun getWesthamWeather() = viewModelScope.launch {
        repository.getWesthamWeather().let { if (it.isSuccessful) _response.postValue(it.body()) }
    }
}