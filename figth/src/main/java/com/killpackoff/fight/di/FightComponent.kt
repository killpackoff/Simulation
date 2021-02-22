package com.killpackoff.fight.di

import dagger.Component
import javax.inject.Scope

/**
 * @author ma.kolpakov
 */
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class Fight

@Fight
@Component(modules = [FightModule::class])
interface FightComponent