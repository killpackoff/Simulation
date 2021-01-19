package com.killpackoff.simulation.core

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * @author ma.kolpakov
 */
@Component(modules = [CreatureModule::class])
interface CoreComponent {
    fun simple(): Fight
    fun creature():ICreature
}

@Module
class CreatureModule{
    @Provides
    fun creature(): ICreature = SimpleCreature()
}

