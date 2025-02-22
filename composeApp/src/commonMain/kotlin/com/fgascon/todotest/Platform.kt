package com.fgascon.todotest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform