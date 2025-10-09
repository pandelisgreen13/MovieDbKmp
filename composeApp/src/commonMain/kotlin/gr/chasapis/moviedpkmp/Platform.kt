package gr.chasapis.moviedpkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform