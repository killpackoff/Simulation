package com.killpackoff.figth.di

import com.killpackoff.simulation.core.CoreComponent
import dagger.Component
import javax.inject.Singleton

/**
 * @author ma.kolpakov
 */
@Component(dependencies = [CoreComponent::class],modules = [SubComponentsModule::class])
@Singleton
interface AppComponent {
    fun fightComponent(): FightComponent.Factory
}