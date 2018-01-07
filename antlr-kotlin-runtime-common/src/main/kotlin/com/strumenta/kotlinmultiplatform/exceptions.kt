package com.strumenta.kotlinmultiplatform

expect class RuntimeException : Throwable {
    constructor(message: String)
}

expect class NullPointerException : Throwable {
    constructor()
    constructor(message: String)
}
