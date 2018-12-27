package com.younuseker.nameless.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by yunuseker on 08.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
@Database(entities = arrayOf(
        UserDao::class
),version = 1,exportSchema = false)
abstract class AppDatabase:RoomDatabase(){
    abstract fun userDao():UserDao
}