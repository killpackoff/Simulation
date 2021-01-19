package com.killpackoff.figth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.killpackoff.figth.databinding.ActivityFightBinding
import com.killpackoff.figth.di.DaggerFightComponent
import com.killpackoff.simulation.core.Fight
import javax.inject.Inject
import com.killpackoff.simulation.core.DaggerCoreComponent
import com.killpackoff.simulation.core.ICreature

class FightActivity : AppCompatActivity() {


    @Inject
    lateinit var viewModel: FightViewModel
    lateinit var viewBinding: ActivityFightBinding
    private val fightComponent by lazy {
        DaggerFightComponent.builder().coreComponent(DaggerCoreComponent.create()).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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