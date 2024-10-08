package com.example.bearwear

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform