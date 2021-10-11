package com.dennisiluma.openweathermap.api

import com.dennisiluma.openweathermap.model.Weather
import com.dennisiluma.openweathermap.util.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.LagosWeather)
    suspend fun getLagosWeather(
    ): Response<Weather>

    @GET(Constants.AbujaWeather)
    suspend fun getAbujaWeather(
    ): Response<Weather>

    @GET(Constants.AmazonWeather)
    suspend fun getAmazonWeather(
    ): Response<Weather>

    @GET(Constants.AnkaraWeather)
    suspend fun getAnkaraWeather(
    ): Response<Weather>

    @GET(Constants.BagdadWeather)
    suspend fun getBagdadWeather(
    ): Response<Weather>

    @GET(Constants.BelarusWeather)
    suspend fun getBelarusWeather(
    ): Response<Weather>

    @GET(Constants.JakartaWeather)
    suspend fun getJakartaWeather(
    ): Response<Weather>

    @GET(Constants.KanoWeather)
    suspend fun getKanoWeather(
    ): Response<Weather>

    @GET(Constants.KenyaWeather)
    suspend fun getKenyaWeather(
    ): Response<Weather>

    @GET(Constants.LesothoWeather)
    suspend fun getLesothoWeather(
    ): Response<Weather>

    @GET(Constants.TexasWeather)
    suspend fun getTexasWeather(
    ): Response<Weather>

    @GET(Constants.WinnipegWeather)
    suspend fun getWinnipegWeather(
    ): Response<Weather>

    @GET(Constants.WesthamWeather)
    suspend fun getWesthamWeather(
    ): Response<Weather>

    @GET(Constants.PeruWeather)
    suspend fun getPeruWeather(
    ): Response<Weather>

    @GET(Constants.CairoWeather)
    suspend fun getCairoWeather(
    ): Response<Weather>

    @GET(Constants.NYWeather)
    suspend fun getNYWeather(
    ): Response<Weather>

}