package com.younuseker.nameless.di.module

import android.app.Application
import android.content.Context
import com.younuseker.nameless.di.scope.AppScope
import dagger.Module
import dagger.Provides

/**
 * Created by yunuseker on 06.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
@Module
class AppModule{

    @Provides
    @AppScope
    fun provideContext(application: Application):Context{
        return application.applicationContext
    }
}