package com.killpackoff.figth.di

import com.killpackoff.figth.FightActivity
import dagger.Subcomponent

/**
 * @author ma.kolpakov
 */
@FightScope
@Subcomponent(modules = [FightModule::class])
interface FightComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): FightComponent
    }

    fun inject(activity: FightActivity)
}

