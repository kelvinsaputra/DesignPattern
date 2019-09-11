package com.example.scrollbottomsheet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_bottom_sheet.*



/**
 * A simple [Fragment] subclass.
 */
class BottomSheetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val view = layoutInflater.inflate(R.layout.fragment_fragment_bottom_sheet_dialog, null)
        // TO Instance FragmentBottomSheetDialog
        val bottomSheetFragment = FragmentBottomSheetDialog()
        btnShow.setOnClickListener{
            // TO Show FragmentBottomSheetDialog
            bottomSheetFragment.show(fragmentManager!!, bottomSheetFragment.tag)
        }
    }



}
