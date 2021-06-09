package com.rezaharis.javanesefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ItemView : AppCompatActivity() {
    companion object {
        const val FOOD = "food"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_view)

        val tvFood = findViewById<TextView>(R.id.tv_food)
        val tvDes = findViewById<TextView>(R.id.tv_des)
        val ivFood = findViewById<ImageView>(R.id.iv_food)
        val btnBack = findViewById<ImageView>(R.id.btn_back)

        val food = intent.getParcelableExtra<Food>(FOOD) as Food
        tvFood.text = food.foodName
        tvDes.text = food.desFood
        ivFood.setImageResource(food.photo)

        btnBack.setOnClickListener {
            super.onBackPressed()
        }
    }
}
