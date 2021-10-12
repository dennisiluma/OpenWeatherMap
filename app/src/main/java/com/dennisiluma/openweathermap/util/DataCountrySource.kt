package com.dennisiluma.openweathermap.util

import com.dennisiluma.openweathermap.model.CityListModel

class DataCountrySource {

    companion object {
        fun createDataSet(): ArrayList<CityListModel> {
            val list = ArrayList<CityListModel>()
            list.add(CityListModel("lagos", "https://image.shutterstock.com/image-photo/lagos-island-nigeria-july-2nd-600w-1474779227.jpg"))
            list.add(CityListModel("kenya", "https://image.shutterstock.com/image-photo/african-women-woven-wicker-baskets-600w-711980332.jpg"))
            list.add(CityListModel("cairo", "https://cdn.pixabay.com/photo/2018/06/16/10/10/pyramid-3478575__480.jpg"))
            list.add(CityListModel("abuja", "https://image.shutterstock.com/image-photo/beautiful-aerial-shot-abuja-metropolitan-600w-1550102267.jpg"))
            list.add(CityListModel("new york", "https://cdn.pixabay.com/photo/2014/07/01/12/35/taxi-381233__340.jpg"))
            list.add(CityListModel("texas", "https://cdn.pixabay.com/photo/2016/06/30/02/58/crowd-of-people-1488213__340.jpg"))
            list.add(CityListModel("amazon", "https://cdn.pixabay.com/photo/2015/09/26/21/33/suspension-bridge-959853__340.jpg"))
            list.add(CityListModel("belarus", "https://cdn.pixabay.com/photo/2017/04/11/14/15/belarus-2221622__340.jpg"))
            list.add(CityListModel("lesotho", "https://cdn.pixabay.com/photo/2018/09/27/12/50/lesotho-3707018__340.jpg"))
            list.add(CityListModel("jakarta", "https://cdn.pixabay.com/photo/2020/12/09/18/21/vendor-5818165__340.jpg"))
            list.add(CityListModel("ankara", "https://cdn.pixabay.com/photo/2019/01/01/20/25/cami-3907508__340.jpg"))
            list.add(CityListModel("kano", "https://image.shutterstock.com/image-photo/kano-nigeria-circa-october-2010-600w-1114945388.jpg"))
            list.add(CityListModel("peru", "https://cdn.pixabay.com/photo/2015/02/19/00/38/peru-641632__340.jpg"))
            list.add(CityListModel("winnipeg", "https://cdn.pixabay.com/photo/2013/07/19/18/19/winnipeg-165374__340.jpg"))
            list.add(CityListModel("bagdad", "https://cdn.pixabay.com/photo/2012/02/18/22/53/arc-14716__340.jpg"))
            list.add(CityListModel("westham", "https://cdn.pixabay.com/photo/2019/08/29/04/53/wellington-4438121__480.jpg"))

            return list
        }
    }
}