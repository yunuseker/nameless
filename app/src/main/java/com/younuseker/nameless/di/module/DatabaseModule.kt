package com.younuseker.nameless.di.module

import android.arch.persistence.room.Room
import android.content.Context
import com.younuseker.nameless.data.database.AppDatabase
import com.younuseker.nameless.utils.DATABASE_NAME
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yunuseker on 06.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
@Module(includes = arrayOf(AppModule::class))
class DatabaseModule{

    @Singleton
    @Provides
    fun provideAppDatabase(context: Context):AppDatabase{
        return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DATABASE_NAME
        ).build()
    }
}