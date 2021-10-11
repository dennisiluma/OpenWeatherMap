package com.dennisiluma.openweathermap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dennisiluma.openweathermap.databinding.ActivityDetailsBinding
import com.dennisiluma.openweathermap.repository.WeatherDetailRepository
import com.dennisiluma.openweathermap.viewmodel.WeatherDetailViewModelFactory
import com.dennisiluma.openweathermap.viewmodel.WeatherDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

class DetailsActivity : AppCompatActivity() {

    lateinit var viewModel: WeatherDetailViewModel
    private lateinit var city: String
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val incomingCity = intent.extras
        if (incomingCity != null) {
            city = incomingCity.getString("city").toString()
            Toast.makeText(this, city, Toast.LENGTH_SHORT).show()

            val repository = WeatherDetailRepository()
            val viewModelFactory =
                WeatherDetailViewModelFactory(
                    repository
                )
            viewModel =
                ViewModelProvider(this, viewModelFactory).get(WeatherDetailViewModel::class.java)
        }

        if(city != null){
            viewModel.getWeather(city)
        }

        binding.tvCityName.text = city
        try {
            viewModel.weatherResponse.observe(this, Observer {
                Toast.makeText(this, it.name.toString(), Toast.LENGTH_SHORT).show()
//                binding.tvCityName.text = it.name
//                val celsius = it.main.temp.toInt() - 273
//                binding.tvTemperature.text = "$celsius °C"
//                binding.tvDescription.text = it.weather[0].description
//                binding.tvClouds.text = it.clouds.all.toString()
//                binding.tvWindSpeed.text = it.wind.speed.toString()
//                binding.tvHumidity.text = it.main.humidity.toString()
//                binding.tvLatLong.text = "Lat: ${it.coord.lat}, Long: ${it.coord.lon}"
            })
        } catch (e: Exception) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}