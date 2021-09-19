package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.LangvitsBinding


class RvAdapter (var languageList: List<Language>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {



	// create an inner class with name ViewHolder
	// It takes a view argument, in which pass the generated class of single_item.xml
	// ie SingleItemBinding and in the RecyclerView.ViewHolder(binding.root) pass it like this
	// viewHolder пщлучает ссылки на елементы разьетки
	inner class ViewHolder(val binding: LangvitsBinding) : RecyclerView.ViewHolder(binding.root)

	// inside the onCreateViewHolder inflate the view of SingleItemBinding
	// and return new ViewHolder object containing this layout
	// Cоздаем viewHolder и передаем туда binding
	//onCreateViewHolder: возвращает объект ViewHolder, который будет хранить данные по одному объекту.
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val binding = LangvitsBinding
			.inflate(LayoutInflater.from(parent.context), parent, false)
var viewHolder:ViewHolder = ViewHolder(binding)
		return viewHolder
	}

	// bind the items with each item of the list languageList which than will be
	// shown in recycler view
	// to keep it simple we are not setting any image data to view
	// берем каждый елемент списка и с помошью ViewHolder отражаем данные RecyaiclView
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		var language = languageList[position]
		holder.binding.tvExp.text = language.exp
		holder.binding.tvLangName.text = language.name

	}

	// return the size of languageList
	override fun getItemCount(): Int {
		return languageList.size
	}
}
