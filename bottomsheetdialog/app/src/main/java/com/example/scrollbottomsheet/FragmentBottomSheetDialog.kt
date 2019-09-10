package com.example.scrollbottomsheet


import android.app.Dialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_fragment_bottom_sheet_dialog.*
import kotlinx.android.synthetic.main.fragment_fragment_bottom_sheet_dialog.view.*
import android.view.MotionEvent
import android.view.View.OnTouchListener




/**
 * A simple [Fragment] subclass.
 */
class FragmentBottomSheetDialog : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =
            inflater.inflate(R.layout.fragment_fragment_bottom_sheet_dialog, container, false)


        view.btnAnchorTop.setOnTouchListener(OnTouchListener { v, event ->
            // v.parent.requestDisallowInterceptTouchEvent(true)
            when (event.action and MotionEvent.ACTION_MASK) {
                MotionEvent.ACTION_UP ->  Log.d("Touching", "AnchorTop")
            }
            false
        })
        view.scroll_main.setOnTouchListener(OnTouchListener { v, event ->
            v.parent.requestDisallowInterceptTouchEvent(true)
            when (event.action and MotionEvent.ACTION_MASK) {
                MotionEvent.ACTION_UP -> v.parent.requestDisallowInterceptTouchEvent(false)
            }
            false
        })
        return view
    }



    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val bottomSheetDialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        bottomSheetDialog.setOnShowListener {
            val dialog = it as BottomSheetDialog
            dialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet) as FrameLayout
            val containerLayout: FrameLayout =
                dialog.findViewById<FrameLayout>(com.google.android.material.R.id.container) as FrameLayout

            val button = btnAnchor
            val parent = button.parent as ViewGroup
            parent.removeView(button)
            containerLayout.addView(button, containerLayout.childCount)



            val bottomSheet = dialog.findViewById<View>(R.id.design_bottom_sheet) as FrameLayout
            val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
            bottomSheetBehavior.skipCollapsed = true
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED



            //parent.requestDisallowInterceptTouchEvent(true)

        }
        return bottomSheetDialog
    }

}
