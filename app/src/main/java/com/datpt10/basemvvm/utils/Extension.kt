package com.datpt10.basemvvm.utils

import android.content.Context
import android.os.SystemClock
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.inputmethod.InputMethodManager
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment


fun View.hideKeyBoard(): Boolean =
    try {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    } catch (ignored: RuntimeException) {
        false
    }


fun Fragment.hideKeyboard(): Boolean =
    try {
        val inputMethodManager =
            this.context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view?.windowToken, 0)
    } catch (ignored: RuntimeException) {
        false
    }

fun View.showKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    requestFocus()
    imm.showSoftInput(this, 0)
}


@BindingAdapter("onSingleClick")
fun View.setSingleClick(execution: () -> Unit) {
    setOnClickListener(object : View.OnClickListener {
        var lastClickTime: Long = 0
        override fun onClick(p0: View?) {
            if (SystemClock.elapsedRealtime() - lastClickTime < Constants.CLICK_SPENDING_TIME) {
                return
            }
            lastClickTime = SystemClock.elapsedRealtime()
            execution.invoke()
        }
    })
}

//Lý, 4:52 CH
fun View.setFadeAnimation(milliseconds: Long) {
    val anim = AlphaAnimation(0F, 1F)
    anim.duration = milliseconds
    startAnimation(anim)
}

fun Long.getOriginPrice(sale: Float): Int {
    val temp = (this / (1 - sale)).toInt()
    return (temp / 1000) * 1000
}
