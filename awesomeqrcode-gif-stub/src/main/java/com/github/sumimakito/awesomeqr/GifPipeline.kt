package com.github.sumimakito.awesomeqr

import android.graphics.Bitmap
import android.graphics.RectF
import java.io.File

class GifPipeline {

    var outputFile: File?
        get() {
            throw RuntimeException("STUB")
        }
        set(value) {
            throw RuntimeException("STUB")
        }

    var clippingRect: RectF?
        get() {
            throw RuntimeException("STUB")
        }
        set(value) {
            throw RuntimeException("STUB")
        }

    var errorInfo: String?
        get() {
            throw RuntimeException("STUB")
        }
        set(value) {
            throw RuntimeException("STUB")
        }

    fun init(file: File): Boolean {
        throw RuntimeException("STUB")
    }

    fun nextFrame(): Bitmap? {
        throw RuntimeException("STUB")

    }

    fun pushRendered(bitmap: Bitmap) {
        throw RuntimeException("STUB")

    }

    fun postRender(): Boolean {
        throw RuntimeException("STUB")

    }

    fun release(): Boolean {
        throw RuntimeException("STUB")
    }
}
