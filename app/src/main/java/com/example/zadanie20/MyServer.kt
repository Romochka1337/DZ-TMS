package com.example.zadanie20

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class MyServer: LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun connect(){
        //...
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun disconnect(){
        //...
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(source: LifecycleOwner?, event: Lifecycle.Event?){
        Log.i(TAG, "onAny() $source $event")
    }
}