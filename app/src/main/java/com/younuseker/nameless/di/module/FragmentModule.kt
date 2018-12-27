package com.younuseker.nameless.di.module

import com.younuseker.nameless.ui.main.MainFrg
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by yunuseker on 06.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
@Module
abstract class FragmentModule{
    @ContributesAndroidInjector
    internal abstract fun mainFragment():MainFrg
}