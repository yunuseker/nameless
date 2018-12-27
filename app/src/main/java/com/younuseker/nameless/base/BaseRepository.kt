package com.younuseker.nameless.base

import android.content.SharedPreferences
import com.younuseker.nameless.data.dto.DataHolder
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers


/**
 * Created by yunuseker on 08.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
open class BaseRepository {


    protected fun<T> sendRequest(call: Observable<T>): Observable<DataHolder<T>>{
        return call
                .observeOn(Schedulers.io())
                .subscribeOn(Schedulers.io())
                .map<DataHolder<T>> {data->DataHolder.Success(data)  }
                .onErrorResumeNext{throwable:Throwable->
                    Observable.just(DataHolder.Error<T>(throwable))as Observable<out DataHolder<T>>
                }
                .doOnError { t:Throwable->t.printStackTrace() }
    }
}