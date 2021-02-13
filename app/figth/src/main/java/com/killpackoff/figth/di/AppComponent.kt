package com.killpackoff.figth.di

import com.killpackoff.figth.creature.CreatureFragment
import com.killpackoff.simulation.core.CoreModule
import com.killpackoff.simulation.core.Fight
import dagger.Component
import javax.inject.Singleton

/**
 * @author ma.kolpakov
 */
@Singleton
@Component()
//@Component(modules = [CoreModule::class, CreatureSubComponentModule::class])
interface AppComponent {
//    fun fightComponent(): FightComponent.Factory
//    fun fight(): Fight
//    fun inject(creatureFragment:CreatureFragment)
}