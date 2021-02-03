package com.killpackoff.figth.creature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.killpackoff.simulation.core.SimpleCreature
import javax.inject.Inject

/**
 * @author ma.kolpakov
 */
class CreatureViewModel @Inject constructor( creture: SimpleCreature):ViewModel() {
    private var _turnLiveData = MediatorLiveData<Int>()
    var turnLiveData: LiveData<Int> = _turnLiveData
    init {
        creture.healthData = {
            _turnLiveData.value=it
        }
    }
}