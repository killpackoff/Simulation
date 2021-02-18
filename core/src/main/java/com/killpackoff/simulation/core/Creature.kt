package com.killpackoff.simulation.core

import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

/**
 * @author ma.kolpakov
 */
abstract class ICreature(val name: String) {

    @Deprecated("Перенести в аттрибуты")
    var health = MutableStateFlow(100)
    var attrubutes = MutableStateFlow(setOf<IAttribute<*>>())
    abstract fun getSkillList(): Set<IAbility>
}

interface IAbility {
    val name: String
    fun getCommand(fight: Fight): ICommand
}

interface IAttribute<T> {
    val name: String
    var value: T
}

interface ICommand {
    fun apply(creature: ICreature)
}


class SimpleCreature @Inject constructor(name: String) : ICreature(name) {

    override fun getSkillList(): Set<IAbility> {
        return setOf(object : IAbility {
            override val name = "Atack"

            override fun getCommand(fight: Fight): ICommand {
                return SimpleCommand()
            }
        })
    }
}

class SimpleCommand : ICommand {
    override fun apply(creature: ICreature) {
        creature.health.value -= 10
    }

}
