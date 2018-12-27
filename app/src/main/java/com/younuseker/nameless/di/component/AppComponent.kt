package com.younuseker.nameless.di.component

import android.app.Application
import com.younuseker.nameless.App
import com.younuseker.nameless.di.module.ActivityModule
import com.younuseker.nameless.di.module.AppModule
import com.younuseker.nameless.di.module.ViewModelModule
import com.younuseker.nameless.di.scope.AppScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by yunuseker on 06.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
@AppScope
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        ViewModelModule::class
))
interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application):Builder

        fun build():AppComponent
    }

    fun inject(app: App)
}