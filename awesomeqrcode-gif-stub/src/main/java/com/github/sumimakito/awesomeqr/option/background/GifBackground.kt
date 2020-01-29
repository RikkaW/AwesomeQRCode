package com.github.sumimakito.awesomeqr.option.background

import android.graphics.Bitmap
import android.graphics.Rect
import java.io.File

class GifBackground @JvmOverloads constructor(
    var outputFile: File? = null,
    var inputFile: File? = null,
    alpha: Float = 0.6f,
    clippingRect: Rect? = null,
    bitmap: Bitmap? = null
) : Background(alpha, clippingRect, bitmap) {

    override fun duplicate(): GifBackground {
        throw RuntimeException("STUB")
    }
}