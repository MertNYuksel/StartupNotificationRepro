package com.mertnevzatyuksel.startupnotification

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class XInitializer: Initializer<Unit> {

    override fun create(context: Context) {
        Log.d("NotificationRepro", "XInitializer created")
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}