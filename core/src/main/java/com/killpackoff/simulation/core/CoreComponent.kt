package com.killpackoff.simulation.core

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * @author ma.kolpakov
 */
@Component(modules = [CreatureModule::class])
interface CoreComponent {
    @Singleton
    fun simple(): Fight
}

@Module
class CreatureModule{
    @Provides
    fun creature(): ICreature = SimpleCreature()
}

