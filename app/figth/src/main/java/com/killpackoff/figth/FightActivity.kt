package com.killpackoff.figth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.killpackoff.figth.creature.CreatureFragment
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
        fightComponent = application.component().fightComponent().create()
        fightComponent.inject(this)

        viewBinding = ActivityFightBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                val fragment1 = CreatureFragment()
                val fragment2 = CreatureFragment()
                application.component().inject(fragment1)
                application.component().inject(fragment2)
                add(R.id.creaqature1_fragment, fragment1)
                add(R.id.creaqature2_fragment,fragment2)
            }
        }

        viewModel.turnLiveData.observe(this) {
            viewBinding.turnText.text = it?.toString()
        }
        viewBinding.turnButton.setOnClickListener {
            viewModel.doTurn()
        }
    }

}