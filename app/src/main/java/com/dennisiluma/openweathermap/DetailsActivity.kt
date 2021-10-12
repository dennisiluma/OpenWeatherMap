package com.dennisiluma.openweathermap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dennisiluma.openweathermap.databinding.ActivityDetailsBinding
import com.dennisiluma.openweathermap.repository.WeatherDetailRepository
import com.dennisiluma.openweathermap.viewmodel.WeatherDetailViewModelFactory
import com.dennisiluma.openweathermap.viewmodel.WeatherDetailViewModel
import okhttp3.internal.notify
import android.app.ProgressDialog




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

            val repository = WeatherDetailRepository()
            val viewModelFactory =
                WeatherDetailViewModelFactory(
                    repository
                )
            viewModel =
                ViewModelProvider(this, viewModelFactory).get(WeatherDetailViewModel::class.java)
        }

        when(city){
            "lagos" -> viewModel.getLagosWeather()
            "kenya" -> viewModel.getKenyaWeather()
            "cairo" -> viewModel.getCairoWeather()
            "Abuja" -> viewModel.getAbujaWeather()
            "new york" -> viewModel.getNYWeather()
            "texas"-> viewModel.getTexasWeather()
            "amazon"-> viewModel.getAmazonWeather()
            "belarus"-> viewModel.getBelarusWeather()
            "lesotho"-> viewModel.getLesothoWeather()
            "jakarta"-> viewModel.getJakartaWeather()
            "ankara"-> viewModel.getAnkaraWeather()
            "kano"-> viewModel.getKanoWeather()
            "peru"-> viewModel.getPeruWeather()
            "winnipeg"-> viewModel.getWinnipegWeather()
            "bagdad"-> viewModel.getBagdadWeather()
            "westham"-> viewModel.getWesthamWeather()
        }

        binding.tvCityName.text = city
        try {
            viewModel.weatherResponse.observe(this, Observer {

                binding.tvCityName.text = it.name.replaceFirstChar {
                    it.uppercaseChar()
                }
                val celsius = it.main.temp.toInt() - 273
                if(celsius % 1 == 0){
                    binding.indeterminateBar.visibility = View.GONE //Turn off Progress bar
                }
                binding.tvTemperature.text = "$celsius °C"
                binding.tvDescription.text = it.weather[0].description.replaceFirstChar {
                    it.uppercaseChar()
                }
                binding.tvClouds.text = it.clouds.all.toString()
                binding.tvWindSpeed.text = it.wind.speed.toString()
                binding.tvHumidity.text = it.main.humidity.toString()
                binding.tvLatLong.text = "Lat: ${it.coord.lat}, Long: ${it.coord.lon}"
            })
        } catch (e: Exception) {
            Log.e("Error", e.message.toString())
        }
    }
}