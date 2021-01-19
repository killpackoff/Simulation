package com.killpackoff.simulation.core

import javax.inject.Inject
import kotlin.properties.Delegates
import kotlin.properties.Delegates.observable


/**
 * @author ma.kolpakov
 */
class Fight @Inject constructor(val creatureA: ICreature, val creatureB: ICreature) {
    private var turnCount by observable(0){ _, _, new ->
        turnData?.invoke(new)
    }
    var turnData: ((Int) -> Unit)? = null

    fun turn() {
        var attacking = creatureA
        var defending = creatureB
        if (turnCount % 2 > 0) {
            attacking = creatureB
            defending = creatureA
        }

        val attackCommand = attacking.getAttackCommand()
        attackCommand.apply(defending)
        turnCount++
    }

}