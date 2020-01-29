package com.github.sumimakito.awesomeqr.option.background

import android.graphics.Bitmap
import android.graphics.Rect
import android.graphics.RectF

abstract class Background @JvmOverloads constructor(
    var alpha: Float = 0.6f,
    var clippingRect: Rect? = null,
    var bitmap: Bitmap? = null
) {
    var clippingRectF: RectF?
        get() {
            throw RuntimeException("STUB")
        }
        set(value) {
            throw RuntimeException("STUB")
        }

    fun recycle() {
        throw RuntimeException("STUB")
    }

    abstract fun duplicate(): Background

}