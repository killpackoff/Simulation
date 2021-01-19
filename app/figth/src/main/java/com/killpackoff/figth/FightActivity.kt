package com.killpackoff.figth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.killpackoff.figth.databinding.ActivityFightBinding
import com.killpackoff.figth.di.FightComponent
import javax.inject.Inject

class FightActivity : AppCompatActivity() {


    @Inject
    lateinit var viewModel: FightViewModel
    lateinit var viewBinding: ActivityFightBinding
    lateinit var fightComponent: FightComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fightComponent = (application as SimulationApp).appComponent.fightComponent().create()
        fightComponent.inject(this)
        viewBinding = ActivityFightBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        ///
        viewModel.turnLiveData.observe(this) {
            viewBinding.turnText.text = it?.toString()
        }
        viewBinding.turnButton.setOnClickListener {
            viewModel.doTurn()
        }
    }


}