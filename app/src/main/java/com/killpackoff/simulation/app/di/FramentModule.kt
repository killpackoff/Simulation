package com.killpackoff.simulation.app.di

import androidx.fragment.app.Fragment
import com.killpackoff.simulation.app.FirstFragment
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * @author ma.kolpakov
 */


@Module
abstract class FirstFragmentModule {
    @Binds
    @Singleton
    abstract fun firstFragment(fragment: FirstFragment): Fragment
}