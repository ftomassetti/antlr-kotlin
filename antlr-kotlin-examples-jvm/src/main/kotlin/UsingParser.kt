import me.tomassetti.minicalc.MiniCalcLexer
import me.tomassetti.minicalc.MiniCalcParser
import org.antlr.v4.kotlinruntime.ANTLRInputStream
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun main(args: Array<String>) {

//    if (MiniCalcLexer.serializedATN.length != MiniCalcLexer.serializedIntegersATN.size) {
//        throw RuntimeException("DIFFERENT LENGTHS")
//    }
//    for (i in 0..MiniCalcLexer.serializedATN.length) {
//        if (MiniCalcLexer.serializedATN[i].toInt() != MiniCalcLexer.serializedIntegersATN[i]) {
//            throw RuntimeException("DIFFERENT AT $i ${MiniCalcLexer.serializedATN[i].toInt()} ${MiniCalcLexer.serializedIntegersATN[i]}")
//        }
//    }

    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    var parser = MiniCalcParser(CommonTokenStream(lexer))
    try {
        val root = parser.miniCalcFile()
        println("Parsed: ${root::class}")
        println("Parsed: ${root.childCount}")
        println("Parsed: ${root.children!![0]::class}")
    } catch (e: Throwable) {
        println("Error: $e")
    }
}