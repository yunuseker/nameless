package com.younuseker.nameless.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.younuseker.nameless.viewmodel.VMMainAct
import com.younuseker.nameless.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by yunuseker on 06.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
@Module
abstract class ViewModelModule{
    @Binds
    @IntoMap
    @ViewModelKey(VMMainAct::class)
    internal abstract fun vmMainAct(viewModel:VMMainAct):ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory):ViewModelProvider.Factory
}