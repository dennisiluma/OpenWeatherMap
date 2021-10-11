package com.dennisiluma.openweathermap.api

import com.dennisiluma.openweathermap.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    //build your retrofit which will be used to send request to the api url passed as a parameter to the baseUrl method,
   //by lazy variable declaration means it will only run when it is neede
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //map the JsonPlaceHolderApi class, use the built api above to send a get request which can use the path and query specified in the JsonPlaceHolderApi Class
    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}