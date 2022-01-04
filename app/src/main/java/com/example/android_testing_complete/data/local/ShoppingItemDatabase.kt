package com.example.android_testing_complete.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities =[ShoppingItem::class], version = 1
)
abstract class ShoppingItemDatabase : RoomDatabase(){

    abstract fun shoppingDao():ShoppingDao

}