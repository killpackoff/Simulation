package com.killpackoff.figth

import android.app.Application
import com.killpackoff.figth.di.AppComponent
import com.killpackoff.figth.di.DaggerAppComponent

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
fun Application.component():AppComponent{
    return (this as SimulationApp).appComponent
}