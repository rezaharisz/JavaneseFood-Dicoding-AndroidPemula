package com.rezaharis.javanesefood

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(private val listFood:ArrayList<Food>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodName = itemView.findViewById<TextView>(R.id.food_name)!!
        val foodDes = itemView.findViewById<TextView>(R.id.food_des)!!
        val foodPhoto = itemView.findViewById<ImageView>(R.id.food_photo)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(80,80))
            .into(holder.foodPhoto)

        holder.foodName.text = food.foodName
        holder.foodDes.text = food.desFood

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ItemView::class.java)
            intent.putExtra(ItemView.FOOD, food)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listFood.size
    }
}