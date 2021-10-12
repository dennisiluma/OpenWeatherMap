package com.dennisiluma.openweathermap.repository

import com.dennisiluma.openweathermap.api.RetrofitInstance
import com.dennisiluma.openweathermap.model.Weather
import retrofit2.Response


class WeatherDetailRepository {
    /*List of methods to query weather, A better implementation is to use one method and then pass a query as arguments*/
    suspend fun getLagosWeather(): Response<Weather> = RetrofitInstance.api.getLagosWeather()
    suspend fun getKenyaWeather(): Response<Weather> = RetrofitInstance.api.getKenyaWeather()
    suspend fun getAbujaWeather(): Response<Weather> = RetrofitInstance.api.getAbujaWeather()
    suspend fun getCairoWeather(): Response<Weather> = RetrofitInstance.api.getCairoWeather()
    suspend fun getTexasWeather(): Response<Weather> = RetrofitInstance.api.getTexasWeather()
    suspend fun getAmazonWeather(): Response<Weather> = RetrofitInstance.api.getAmazonWeather()
    suspend fun getBelarusWeather(): Response<Weather> = RetrofitInstance.api.getBelarusWeather()
    suspend fun getLesothoWeather(): Response<Weather> = RetrofitInstance.api.getLesothoWeather()
    suspend fun getJakartaWeather(): Response<Weather> = RetrofitInstance.api.getJakartaWeather()
    suspend fun getKanoWeather(): Response<Weather> = RetrofitInstance.api.getKanoWeather()
    suspend fun getPeruWeather(): Response<Weather> = RetrofitInstance.api.getPeruWeather()
    suspend fun getWinnipegWeather(): Response<Weather> = RetrofitInstance.api.getWinnipegWeather()
    suspend fun getBagdadWeather(): Response<Weather> = RetrofitInstance.api.getBagdadWeather()
    suspend fun getWesthamWeather(): Response<Weather> = RetrofitInstance.api.getWesthamWeather()
    suspend fun getAnkaraWeather(): Response<Weather> = RetrofitInstance.api.getAnkaraWeather()
    suspend fun getNYWeather(): Response<Weather> = RetrofitInstance.api.getNYWeather()
}