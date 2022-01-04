package com.example.android_testing_complete.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    var name:String,var quantity:Int,var price:Float,var imageUrl:String,
    @PrimaryKey(autoGenerate = true)
    val id:Int? = null
) {
}