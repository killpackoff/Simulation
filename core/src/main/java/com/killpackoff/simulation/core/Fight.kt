package com.killpackoff.simulation.core

import javax.inject.Inject
import javax.inject.Named
import kotlin.properties.Delegates.observable


/**
 * @author ma.kolpakov
 */
class Fight @Inject constructor() {
    @Inject
    @field:Named("creatureA")
    lateinit var creatureA: ICreature

    @Inject
    @field:Named("creatureB")
    lateinit var creatureB: ICreature

    var turnCount = 0

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