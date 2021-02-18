package com.killpackoff.components.health_bar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.killpackoff.components.databinding.HealthBarBinding

/**
 * @author ma.kolpakov
 */
class HealthBar(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {
    private val binding: HealthBarBinding =
        HealthBarBinding.inflate(LayoutInflater.from(context), this, true)

    fun setHealth(value: Int) {
        binding.textView.text = value.toString()
        binding.progressBar2.progress = value
    }
}