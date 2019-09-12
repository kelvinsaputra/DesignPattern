package com.example.customcomponent

import android.animation.Animator
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewAnimationUtils
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.view_custom_component.*
import kotlinx.android.synthetic.main.view_custom_component.view.*

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class CustomComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_custom_component, this, true)
        orientation = VERTICAL

        attrs?.let {

            val productArray = context.obtainStyledAttributes(it, R.styleable.custom_component_attributes, 0, 0)
            val text_shopName = resources.getText(productArray
                .getResourceId(R.styleable.custom_component_attributes_custom_component_title, R.string.shopName))
            val text_productName = resources.getText(productArray
                .getResourceId(R.styleable.custom_component_attributes_custom_component_title, R.string.productName))
            val text_discount = resources.getText(productArray
                .getResourceId(R.styleable.custom_component_attributes_custom_component_title, R.string.discount))
            val text_oriPrice = resources.getText(productArray
                .getResourceId(R.styleable.custom_component_attributes_custom_component_title, R.string.originalPrice))
            val text_discountedPrice = resources.getText(productArray
                .getResourceId(R.styleable.custom_component_attributes_custom_component_title, R.string.discountedPrice))

            shopName.text = text_shopName
            productName.text = text_productName
            discount.text = text_discount
            originalPrice.text = text_oriPrice
            discountedPrice.text = text_discountedPrice

            productArray.recycle()

            shopName.setOnTouchListener { v, event ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        val x = layoutContent.getRight()
                        val y = layoutContent.getBottom()

                        val startRadius = 0
                        val endRadius = Math.hypot(
                            layoutContent.getWidth().toDouble(),
                            layoutContent.getHeight().toDouble()
                        ).toInt()

                        val anim = ViewAnimationUtils.createCircularReveal(
                            layoutButtons,
                            x,
                            y,
                            startRadius.toFloat(),
                            endRadius.toFloat()
                        )

                        layoutButtons.setVisibility(View.VISIBLE)
                        anim.start()
                    }
                    MotionEvent.ACTION_UP -> {
                        val x = layoutButtons.right
                        val y = layoutButtons.bottom

                        val startRadius = Math.max(layoutContent.width, layoutContent.height)
                        val endRadius = 0

                        val anim = ViewAnimationUtils.createCircularReveal(
                            layoutButtons,
                            x,
                            y,
                            startRadius.toFloat(),
                            endRadius.toFloat()
                        )
                        anim.addListener(object : Animator.AnimatorListener {
                            override fun onAnimationStart(animator: Animator) {

                            }

                            override fun onAnimationEnd(animator: Animator) {
                                layoutButtons.visibility = View.GONE
                            }

                            override fun onAnimationCancel(animator: Animator) {

                            }

                            override fun onAnimationRepeat(animator: Animator) {

                            }
                        })
                        anim.start()
                    }
                }
                return@setOnTouchListener true
            }
        }
    }

}