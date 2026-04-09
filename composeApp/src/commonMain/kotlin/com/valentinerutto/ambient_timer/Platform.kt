package com.valentinerutto.ambient_timer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform