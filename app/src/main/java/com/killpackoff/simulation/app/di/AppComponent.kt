package com.killpackoff.simulation.app.di

import com.killpackoff.simulation.app.MainFragmentFactory
import com.killpackoff.simulation.core.Core
import com.killpackoff.simulation.core.CoreModule
import dagger.Component

/**
 * @author ma.kolpakov
 */
@Core
@Component(modules = [CoreModule::class, FirstFragmentModule::class])
interface AppComponent {
    fun fragmentFactory(): MainFragmentFactory
}

