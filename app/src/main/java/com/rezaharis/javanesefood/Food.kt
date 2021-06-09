package com.rezaharis.javanesefood

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    var foodName:String = "",
    var desFood:String = "",
    var photo:Int = 0
):Parcelable
