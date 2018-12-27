package com.younuseker.nameless.data.dto

/**
 * Created by yunuseker on 08.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
sealed class DataHolder<out T>{
    data class Success<out T>(val data:T):DataHolder<T>()
    data class Error<out T>(val error:Throwable):DataHolder<T>()
}