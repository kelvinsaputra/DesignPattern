package com.example.customcomponent

import android.animation.Animator
import com.example.customcomponent.Controller.DummyController
import com.example.customcomponent.Model.Product
import android.content.Context
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_custom_component.view.*
import kotlinx.android.synthetic.main.view_custom_component.*


class ProductAdapter(val products : List<Product>, val context: Context):
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_custom_component, parent, false)
        view.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    val x = view.layoutContent.getRight()
                    val y = view.layoutContent.getBottom()

                    val startRadius = 0
                    val endRadius = Math.hypot(
                        view.layoutContent.getWidth().toDouble(),
                        view.layoutContent.getHeight().toDouble()
                    ).toInt()

                    val anim = ViewAnimationUtils.createCircularReveal(
                        view.layoutButtons,
                        x,
                        y,
                        startRadius.toFloat(),
                        endRadius.toFloat()
                    )

                    view.layoutButtons.setVisibility(View.VISIBLE)
                    anim.start()
                }
                MotionEvent.ACTION_UP -> {
                    val x = view.layoutButtons.right
                    val y = view.layoutButtons.bottom

                    val startRadius = Math.max(view.layoutContent.width, view.layoutContent.height)
                    val endRadius = 0

                    val anim = ViewAnimationUtils.createCircularReveal(
                        view.layoutButtons,
                        x,
                        y,
                        startRadius.toFloat(),
                        endRadius.toFloat()
                    )
                    anim.addListener(object : Animator.AnimatorListener {
                        override fun onAnimationStart(animator: Animator) {

                        }

                        override fun onAnimationEnd(animator: Animator) {
                            view.layoutButtons.visibility = View.GONE
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
        val holder = ViewHolder(view)

        return holder
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        val product = products[i]
        holder.shopName.text = product.shop_name
        holder.productName.text = product.prod_name

        var disc: Double = product.discount.toDouble()/100
        val price = product.price
        var discPrice = (1 - disc ) * price
        holder.discount.text = product.discount.toString()+"%"
        holder.originalPrice.text = "Rp. "+price.toString()
//        holder.originalPrice.text
        holder.discountedPrice.text = "Rp. "+discPrice.toInt().toString()
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val shopName:TextView = view.shopName
        val productName:TextView = view.productName
        val discount:TextView = view.discount
        val originalPrice:TextView = view.originalPrice
        val discountedPrice:TextView = view.discountedPrice


    }
}