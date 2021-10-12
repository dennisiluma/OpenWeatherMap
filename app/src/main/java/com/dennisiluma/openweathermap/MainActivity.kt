package com.dennisiluma.openweathermap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.dennisiluma.openweathermap.adapter.CityListAdapter
import com.dennisiluma.openweathermap.databinding.ActivityMainBinding
import com.dennisiluma.openweathermap.util.DataCountrySource


class MainActivity : AppCompatActivity() {

    private val cityListAdapter by lazy { CityListAdapter(DataCountrySource.createDataSet()) }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*Set ToolBar Title*/
        binding.toolbar.title = "Weather App"
        /*SetUp RecyclerView and map to adapter*/
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = cityListAdapter
        }
    }
}