package com.killpackoff.figth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.killpackoff.figth.databinding.ActivityFightBinding
import javax.inject.Inject

class FightActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: FightViewModel

    lateinit var binding: ActivityFightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        application.component().inject(this)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fight)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        binding.linearLayout
//        binding.turnButton.setOnClickListener {
//            TestFragmentDialog().show(supportFragmentManager, TestFragmentDialog.TAG)
//        }
    }

}