package com.dennisiluma.openweathermap.model

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.dennisiluma.openweathermap.R
import com.squareup.picasso.Picasso

data class CityListModel(
    var name: String,
    var image: String,
) {
    companion object {

        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(view: ImageView, imageUrl: String?) {
            imageUrl?.let {
                Picasso.get()
                    .load(imageUrl)
                    .placeholder(R.drawable.nice_country)
                    .error(R.drawable.nice_country)
                    .into(view)
            }
        }
    }

}
