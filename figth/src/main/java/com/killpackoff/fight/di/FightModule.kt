package com.killpackoff.fight.di

import androidx.fragment.app.Fragment
import com.killpackoff.fight.FightFragment
import dagger.Binds
import dagger.Module

/**
 * @author ma.kolpakov
 */


@Module
abstract class FightModule {

    @Fight
    @Binds
    abstract fun fightFragment(fragment: FightFragment): Fragment
}