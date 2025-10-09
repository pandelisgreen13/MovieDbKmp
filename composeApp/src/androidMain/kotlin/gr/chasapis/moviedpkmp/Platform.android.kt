package gr.chasapis.moviedpkmp

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT} ${Build.MANUFACTURER}"
}

actual fun getPlatform(): Platform = AndroidPlatform()