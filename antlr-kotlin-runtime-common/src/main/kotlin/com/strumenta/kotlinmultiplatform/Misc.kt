package com.strumenta.kotlinmultiplatform

import kotlin.reflect.KClass

expect fun assert(condition: Boolean)

expect class BitSet {
    constructor()

    fun set(bitIndex: Int)
    fun clear(bitIndex: Int)
    fun get(bitIndex: Int): Boolean
    fun cardinality(): Int
    fun nextSetBit(i: Int): Int
    fun or(alts: BitSet)
}

expect object Math {

    fun min(a: Int, b: Int) : Int

    fun max(a: Int, b: Int) : Int

    fun floor(d: Double): Double
}

expect class UUID {
    constructor(most: Long, least: Long)
    companion object {
        fun fromString(encoded: String) : UUID
    }
}

expect fun errMessage(message: String)

expect fun outMessage(message: String)

expect class Type

expect fun Type.isInstance(any: Any?) : Boolean

interface TypeDeclarator {
    val classesByName : List<KClass<*>>
}

expect fun TypeDeclarator.getType(name: String) : Type
