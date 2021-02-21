package com.killpackoff.simulation.app

import android.app.Application
import com.killpackoff.simulation.app.di.AppComponent
import com.killpackoff.simulation.app.di.DaggerAppComponent

/**
 * @author ma.kolpakov
 */
class SimulationApp: Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder().build()
    }
}

fun Application.component(): AppComponent {
    return (this as SimulationApp).appComponent
}