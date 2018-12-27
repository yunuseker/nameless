package com.younuseker.nameless.base

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by yunuseker on 06.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
open class BaseViewModel:ViewModel(){
    protected val compositeDisposable=CompositeDisposable()
    val errorMessage:MutableLiveData<String> =MutableLiveData()

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}