package com.killpackoff.simulation.core

import javax.inject.Inject
import javax.inject.Named
import kotlin.properties.Delegates.observable


/**
 * @author ma.kolpakov
 */
class Fight @Inject constructor(var creatureA: ICreature,var creatureB: ICreature) {

    var turnCount = 0

    fun turn() {
        var attacking = creatureA
        var defending = creatureB
        if (turnCount % 2 > 0) {
            attacking = creatureB
            defending = creatureA
        }

        val attackCommand = attacking.getSkillList().first().getCommand(this)
        attackCommand.apply(defending)
        turnCount++
    }

    fun applyCommand(){

    }
}