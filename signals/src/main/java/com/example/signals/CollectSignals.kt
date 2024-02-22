package com.example.signals

import com.example.collection.ServiceProvider

class CollectSignals {

    fun solve() {
        println("call from signals: ${ServiceProvider().isActive()}")
    }
}
