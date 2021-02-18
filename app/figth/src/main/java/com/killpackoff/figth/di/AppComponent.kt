package com.killpackoff.figth.di

import com.killpackoff.figth.FightActivity
import com.killpackoff.figth.creature.CreatureFragment
import com.killpackoff.simulation.core.Core
import com.killpackoff.simulation.core.CoreModule
import com.killpackoff.simulation.core.Fight
import dagger.Component
import javax.inject.Singleton

/**
 * @author ma.kolpakov
 */
@Core
@Component(modules = [CoreModule::class])
interface AppComponent {
    fun inject(fightActivity: FightActivity)
}