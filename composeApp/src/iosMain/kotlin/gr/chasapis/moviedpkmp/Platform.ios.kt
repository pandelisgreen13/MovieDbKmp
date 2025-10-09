package gr.chasapis.moviedpkmp

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion + " " + UIDevice.currentDevice.model
}

actual fun getPlatform(): Platform = IOSPlatform()