package com.strumenta.kotlinmultiplatform

expect fun <T> Array<T>.clone(): Array<T>

expect fun <T> arraycopy(tokens: Array<T>, p: Int, tokens1: Array<T>, i: Int, i1: Int)

expect fun <T> Array<T>.indices() : List<Int>

expect fun IntArray.indices() : List<Int>

expect object Arrays {
    fun <T> asList(vararg elements: T): List<T>

    fun <T> copyOf(original: Array<T>, size: Int): Array<T>

    fun equals(a: Array<*>, b: Array<*>) : Boolean

    fun toString(a: Array<*>): String
}

expect object Collections {
    fun unmodifiableList(asList: Collection<*>): List<*>
    fun <T, U> unmodifiableMap(t: T): U
    fun <T : Comparable<T>>min(precedencePredicates: List<T>): T
    fun <T : Comparable<T>>max(precedencePredicates: List<T>): T

}

expect class WeakHashMap<K, V> : MutableMap<K,V>{
    constructor()
}

expect class IdentityHashMap<K, V> : MutableMap<K, V> {
    constructor()
}
