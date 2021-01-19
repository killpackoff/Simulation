package com.killpackoff.figth.di

import com.killpackoff.figth.FightActivity
import com.killpackoff.simulation.core.CoreComponent
import dagger.Component

/**
 * @author ma.kolpakov
 */
@FightScope
@Component(dependencies = [CoreComponent::class],modules = [FightModule::class])
interface FightComponent {

    fun inject(activity: FightActivity)
}

