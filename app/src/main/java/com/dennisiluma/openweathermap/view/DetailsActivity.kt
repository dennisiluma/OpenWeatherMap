package com.dennisiluma.openweathermap.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dennisiluma.openweathermap.R
import com.dennisiluma.openweathermap.databinding.ActivityDetailsBinding
import com.dennisiluma.openweathermap.repository.WeatherDetailRepository
import com.dennisiluma.openweathermap.viewmodel.WeatherDetailViewModelFactory
import com.dennisiluma.openweathermap.viewmodel.WeatherDetailViewModel




class DetailsActivity : AppCompatActivity() {

    lateinit var viewModel: WeatherDetailViewModel
    private var city: String? = null
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*collect intent extra bundle coming from mainActivity*/
        city = intent.extras!!.getString("city").toString()

        instantiateViewModel() //custom method
        sendWeatherApiRequest() //custom method
        displayWeatherResult() //custom method
    }

    private fun instantiateViewModel(){
        if (city != null) { // if there's intent, then proceed
            val repository = WeatherDetailRepository() //Instantiate the Weather Repository
            val viewModelFactory = WeatherDetailViewModelFactory(repository) // Instantiate ViewModel Factory
            viewModel = ViewModelProvider(this, viewModelFactory).get(WeatherDetailViewModel::class.java) //Instantiate the viewmodel
        }
    }
    private fun sendWeatherApiRequest(){
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
    }
    private fun displayWeatherResult(){
        /*Here, we are collecting our weather values from the live data in our viewmodel and diaplaying it to the user*/
        try {
            viewModel.weatherResponse.observe(this, Observer {

                binding.tvCityName.text = it.name.replaceFirstChar {
                    it.uppercaseChar()
                }
                val celsius = it.main.temp.toInt() - 273 //Here, we are converting to Degree celsius
                if(celsius % 1 == 0){

                    binding.detainLayout.setBackgroundResource(R.drawable.background)
                    binding.indeterminateBar.visibility = View.GONE //Turn off Progress bar when the values has been received
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