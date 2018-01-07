package com.strumenta.kotlinmultiplatform

expect fun String.toCharArray() : CharArray

fun CharArray.convertToString() : String {
    var s = ""
    this.forEach { s += it }
    return s
}

expect fun isCharUppercase(firstChar: Char): Boolean

expect fun isCharLowerCase(firstChar: Char): Boolean

expect fun Char.Companion.isSupplementaryCodePoint(codePoint: Int): Boolean

expect fun Char.Companion.toChars(codePoint: Int, resultArray: CharArray, resultIdx: Int): Int

expect fun Char.Companion.charCount(i: Int): Byte

expect fun Char.Companion.maxValue() : Char