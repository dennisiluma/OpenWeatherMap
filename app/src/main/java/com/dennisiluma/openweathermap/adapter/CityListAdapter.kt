package com.dennisiluma.openweathermap.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dennisiluma.openweathermap.DetailsActivity
import com.dennisiluma.openweathermap.databinding.ListItemBinding
import com.dennisiluma.openweathermap.model.CityListModel
import kotlin.collections.ArrayList


class CityListAdapter(private var list: ArrayList<CityListModel>) :
    RecyclerView.Adapter<CityListAdapter.ViewHolder>() {

    private var allList: ArrayList<CityListModel> = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listItemLayoutBindings =
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(listItemLayoutBindings)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cityListModel = allList[position]

        holder.listItemLayoutBinding.cityListModel =
            cityListModel //using databinding to bind the values to the xml

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailsActivity::class.java)
            intent.putExtra("city", cityListModel.name.lowercase())
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return allList.size
    }

    class ViewHolder(var listItemLayoutBinding: ListItemBinding) :
        RecyclerView.ViewHolder(listItemLayoutBinding.root) {
    }
}