package com.killpackoff.figth

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.view.WindowManager.LayoutParams.FLAG_DIM_BEHIND
import android.view.WindowManager.LayoutParams.MATCH_PARENT
import android.widget.TextView
import androidx.fragment.app.DialogFragment

/**
 * @author ma.kolpakov
 */
class TestFragmentDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return context?.let {
            TextView(it).apply {
                dialog?.window?.apply {
                    background = ColorDrawable(Color.TRANSPARENT)
                    setDecorCaptionShade(0)
                    clearFlags(FLAG_DIM_BEHIND)
                    setGravity(Gravity.START or Gravity.BOTTOM)
                    val p = attributes
                    p.width = MATCH_PARENT
                    p.height = MATCH_PARENT
                    p.softInputMode = WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE
                    p.x = 0
                    p.y = 0
                    attributes = p
                }
                text = "Привет Диалог \n Фрагмент"
            }
        }
    }

    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }
}