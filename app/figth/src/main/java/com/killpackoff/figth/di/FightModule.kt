package com.killpackoff.figth.di

import androidx.lifecycle.ViewModel
import com.killpackoff.figth.FightViewModel
import com.killpackoff.simulation.core.Fight
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * @author ma.kolpakov
 */
@Module
class FightModule {
    @FightScope
    @Provides
    fun fightViewModel(fight: Fight): FightViewModel {
       return FightViewModel(fight)
    }
}