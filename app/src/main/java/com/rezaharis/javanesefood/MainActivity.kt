package com.rezaharis.javanesefood

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvView : RecyclerView
    private var listFood : ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val icProfile = findViewById<ImageView>(R.id.ic_profile)

        rvView = findViewById(R.id.rv_view)
        rvView.setHasFixedSize(true)

        listFood.addAll(FoodData.listFood)
        showFoodList()

        icProfile.setOnClickListener {
            intent = Intent(this@MainActivity, ProfileView::class.java)
            startActivity(intent)
        }
    }

    private fun showFoodList(){
        rvView.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(listFood)
        rvView.adapter = listFoodAdapter
    }
}