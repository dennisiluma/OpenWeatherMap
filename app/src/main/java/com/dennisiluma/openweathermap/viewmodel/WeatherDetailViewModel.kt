package com.dennisiluma.openweathermap.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dennisiluma.openweathermap.model.Weather
import com.dennisiluma.openweathermap.repository.WeatherDetailRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.Response

class WeatherDetailViewModel (private val repository: WeatherDetailRepository):ViewModel() {
    private val _response = MutableLiveData<Weather>()
    val weatherResponse: LiveData<Weather>
        get() = _response

    fun getWeather(city:String) = viewModelScope.launch {
        //_response.postValue(null) //dispose the values and enter new result
        when(city){
                    "lagos" -> repository.getLagosWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "kenya" -> repository.getKenyaWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "cairo"-> repository.getCairoWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "abuja" -> repository.getAbujaWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "new york" -> repository.getNYWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "texas" -> repository.getTexasWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "amazon" -> repository.getAmazonWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "belarus"-> repository.getBelarusWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "lesotho" -> repository.getLesothoWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "jakarta" -> repository.getJakartaWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "ankara" -> repository.getAnkaraWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "kano" -> repository.getKanoWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "peru" -> repository.getPeruWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "winnipeg" -> repository.getWinnipegWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "bagdad" -> repository.getBagdadWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
                    "westham"-> repository.getWesthamWeather().let { if(it.isSuccessful) _response.postValue(it.body()) }
            else -> repository.getLagosWeather().let { if(it.isSuccessful) _response.postValue(it.body())}
        }
    }
}