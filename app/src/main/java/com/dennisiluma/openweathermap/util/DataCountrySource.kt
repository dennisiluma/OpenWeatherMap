package com.dennisiluma.openweathermap.util

import com.dennisiluma.openweathermap.model.CityListModel

class DataCountrySource {

    companion object {

        fun createDataSet(): ArrayList<CityListModel> {
            val list = ArrayList<CityListModel>()
            val countries = arrayListOf<String>(
                "Kenya", "Cairo", "Lagos", "Abuja", "New York", "Texas", "Amazon", "Belarus",
                "Lesotho", "Jakarta", "Ankara", "Kano", "Peru", "Winnipeg", "Bagdad", "Westham"
            )
            for (country in countries) {
                list.add(CityListModel(country, "https://cdn.pixabay.com/photo/2021/02/12/11/26/continent-6008276_960_720.png"))
            }
            return list
        }
    }
}