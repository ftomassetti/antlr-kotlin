// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import kotlin.reflect.KClass

object solver : TypeDeclarator {
	override val classesByName : List<KClass<*>> = listOf(cqlParser.IdentifierContext::class,
                                                       cqlParser.NumericValueContext::class,
                                                       cqlParser.DateValueContext::class,
                                                       cqlParser.TextValueContext::class,
                                                       cqlParser.TextComparatorContext::class,
                                                       cqlParser.NumericComparatorContext::class,
                                                       cqlParser.DateComparatorContext::class,
                                                       cqlParser.RangeContext::class,
                                                       cqlParser.NumericRangeContext::class,
                                                       cqlParser.DateRangeContext::class,
                                                       cqlParser.TermContext::class,
                                                       cqlParser.SearchtermContext::class,
                                                       cqlParser.SearchTermListContext::class)
}

class cqlParser(input: TokenStream) : Parser(input) {
	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "cql.g4"

    override val tokenNames: Array<String?>?
        get() = MiniCalcParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = MiniCalcParser.Companion.ruleNames
    override val atn: ATN
        get() = MiniCalcParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        CUSTOM_QUERY_TOKEN(1),
        LIKE(2),
        EQUALS(3),
        GT(4),
        LT(5),
        RANGE_TOK(6),
        AND(7),
        DATE_DDMM(8),
        DATE_DDMMYYYY(9),
        Number(10),
        String(11),
        QuotedString(12),
        UNICODE_WS(13)
    }

    enum class Rules(val id: Int) {
        RULE_identifier(0),
        RULE_numericValue(1),
        RULE_dateValue(2),
        RULE_textValue(3),
        RULE_textComparator(4),
        RULE_numericComparator(5),
        RULE_dateComparator(6),
        RULE_range(7),
        RULE_numericRange(8),
        RULE_dateRange(9),
        RULE_term(10),
        RULE_searchterm(11),
        RULE_searchTermList(12)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("identifier", "numericValue", "dateValue", 
                                "textValue", "textComparator", "numericComparator", 
                                "dateComparator", "range", "numericRange", 
                                "dateRange", "term", "searchterm", "searchTermList")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, 
                                                           null, null, null, 
                                                           "'between'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "CUSTOM_QUERY_TOKEN", 
                                                            "LIKE", "EQUALS", 
                                                            "GT", "LT", 
                                                            "RANGE_TOK", 
                                                            "AND", "DATE_DDMM", 
                                                            "DATE_DDMMYYYY", 
                                                            "Number", "String", 
                                                            "QuotedString", 
                                                            "UNICODE_WS")

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

        private val serializedIntegersATN =
        	arrayOf(3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 
        	3, 15, 95, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 
        	9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 
        	9, 11, 4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 3, 2, 3, 2, 3, 
        	3, 3, 3, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 5, 5, 38, 10, 5, 3, 6, 3, 
        	6, 3, 7, 3, 7, 3, 7, 5, 7, 45, 10, 7, 3, 8, 3, 8, 3, 8, 5, 8, 50, 
        	10, 8, 3, 9, 3, 9, 5, 9, 54, 10, 9, 3, 10, 3, 10, 3, 10, 3, 10, 
        	3, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 
        	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 75, 10, 12, 3, 
        	13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 5, 13, 83, 10, 13, 3, 14, 
        	3, 14, 3, 14, 7, 14, 88, 10, 14, 12, 14, 14, 14, 91, 11, 14, 3, 
        	14, 3, 14, 3, 14, 2, 2, 15, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 
        	22, 24, 26, 2, 5, 4, 2, 3, 3, 13, 13, 3, 2, 10, 11, 3, 2, 4, 5, 
        	2, 92, 2, 28, 3, 2, 2, 2, 4, 30, 3, 2, 2, 2, 6, 32, 3, 2, 2, 2, 
        	8, 37, 3, 2, 2, 2, 10, 39, 3, 2, 2, 2, 12, 44, 3, 2, 2, 2, 14, 
        	49, 3, 2, 2, 2, 16, 53, 3, 2, 2, 2, 18, 55, 3, 2, 2, 2, 20, 60, 
        	3, 2, 2, 2, 22, 74, 3, 2, 2, 2, 24, 82, 3, 2, 2, 2, 26, 84, 3, 
        	2, 2, 2, 28, 29, 9, 2, 2, 2, 29, 3, 3, 2, 2, 2, 30, 31, 7, 12, 
        	2, 2, 31, 5, 3, 2, 2, 2, 32, 33, 9, 3, 2, 2, 33, 7, 3, 2, 2, 2, 
        	34, 38, 7, 13, 2, 2, 35, 38, 7, 14, 2, 2, 36, 38, 5, 2, 2, 2, 37, 
        	34, 3, 2, 2, 2, 37, 35, 3, 2, 2, 2, 37, 36, 3, 2, 2, 2, 38, 9, 
        	3, 2, 2, 2, 39, 40, 9, 4, 2, 2, 40, 11, 3, 2, 2, 2, 41, 45, 5, 
        	10, 6, 2, 42, 45, 7, 6, 2, 2, 43, 45, 7, 7, 2, 2, 44, 41, 3, 2, 
        	2, 2, 44, 42, 3, 2, 2, 2, 44, 43, 3, 2, 2, 2, 45, 13, 3, 2, 2, 
        	2, 46, 50, 5, 10, 6, 2, 47, 50, 7, 6, 2, 2, 48, 50, 7, 7, 2, 2, 
        	49, 46, 3, 2, 2, 2, 49, 47, 3, 2, 2, 2, 49, 48, 3, 2, 2, 2, 50, 
        	15, 3, 2, 2, 2, 51, 54, 5, 18, 10, 2, 52, 54, 5, 20, 11, 2, 53, 
        	51, 3, 2, 2, 2, 53, 52, 3, 2, 2, 2, 54, 17, 3, 2, 2, 2, 55, 56, 
        	7, 8, 2, 2, 56, 57, 5, 4, 3, 2, 57, 58, 7, 9, 2, 2, 58, 59, 5, 
        	4, 3, 2, 59, 19, 3, 2, 2, 2, 60, 61, 7, 8, 2, 2, 61, 62, 5, 6, 
        	4, 2, 62, 63, 7, 9, 2, 2, 63, 64, 5, 6, 4, 2, 64, 21, 3, 2, 2, 
        	2, 65, 66, 5, 12, 7, 2, 66, 67, 5, 4, 3, 2, 67, 75, 3, 2, 2, 2, 
        	68, 69, 5, 14, 8, 2, 69, 70, 5, 6, 4, 2, 70, 75, 3, 2, 2, 2, 71, 
        	72, 5, 10, 6, 2, 72, 73, 5, 8, 5, 2, 73, 75, 3, 2, 2, 2, 74, 65, 
        	3, 2, 2, 2, 74, 68, 3, 2, 2, 2, 74, 71, 3, 2, 2, 2, 75, 23, 3, 
        	2, 2, 2, 76, 77, 5, 2, 2, 2, 77, 78, 5, 22, 12, 2, 78, 83, 3, 2, 
        	2, 2, 79, 80, 5, 2, 2, 2, 80, 81, 5, 16, 9, 2, 81, 83, 3, 2, 2, 
        	2, 82, 76, 3, 2, 2, 2, 82, 79, 3, 2, 2, 2, 83, 25, 3, 2, 2, 2, 
        	84, 89, 5, 24, 13, 2, 85, 86, 7, 9, 2, 2, 86, 88, 5, 24, 13, 2, 
        	87, 85, 3, 2, 2, 2, 88, 91, 3, 2, 2, 2, 89, 87, 3, 2, 2, 2, 89, 
        	90, 3, 2, 2, 2, 90, 92, 3, 2, 2, 2, 91, 89, 3, 2, 2, 2, 92, 93, 
        	7, 2, 2, 3, 93, 27, 3, 2, 2, 2, 9, 37, 44, 49, 53, 74, 82, 89)
        val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val CUSTOM_QUERY_TOKEN = Tokens.CUSTOM_QUERY_TOKEN.id
    private val LIKE = Tokens.LIKE.id
    private val EQUALS = Tokens.EQUALS.id
    private val GT = Tokens.GT.id
    private val LT = Tokens.LT.id
    private val RANGE_TOK = Tokens.RANGE_TOK.id
    private val AND = Tokens.AND.id
    private val DATE_DDMM = Tokens.DATE_DDMM.id
    private val DATE_DDMMYYYY = Tokens.DATE_DDMMYYYY.id
    private val Number = Tokens.Number.id
    private val String = Tokens.String.id
    private val QuotedString = Tokens.QuotedString.id
    private val UNICODE_WS = Tokens.UNICODE_WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class IdentifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_identifier.id
	        set(value) { throw RuntimeException() }
		fun CUSTOM_QUERY_TOKEN() : TerminalNode = getToken(cqlParser.Tokens.CUSTOM_QUERY_TOKEN.id, 0) as TerminalNode
		fun String() : TerminalNode = getToken(cqlParser.Tokens.String.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterIdentifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitIdentifier(this)
		}
	}

	fun  identifier() : IdentifierContext {
		var _localctx : IdentifierContext = IdentifierContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_identifier.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 26
			_la = _input!!.LA(1)
			if ( !(_la==CUSTOM_QUERY_TOKEN || _la==String) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NumericValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_numericValue.id
	        set(value) { throw RuntimeException() }
		fun Number() : TerminalNode = getToken(cqlParser.Tokens.Number.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterNumericValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitNumericValue(this)
		}
	}

	fun  numericValue() : NumericValueContext {
		var _localctx : NumericValueContext = NumericValueContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_numericValue.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 28
			match(Number) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DateValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dateValue.id
	        set(value) { throw RuntimeException() }
		fun DATE_DDMM() : TerminalNode = getToken(cqlParser.Tokens.DATE_DDMM.id, 0) as TerminalNode
		fun DATE_DDMMYYYY() : TerminalNode = getToken(cqlParser.Tokens.DATE_DDMMYYYY.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterDateValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitDateValue(this)
		}
	}

	fun  dateValue() : DateValueContext {
		var _localctx : DateValueContext = DateValueContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_dateValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 30
			_la = _input!!.LA(1)
			if ( !(_la==DATE_DDMM || _la==DATE_DDMMYYYY) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TextValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_textValue.id
	        set(value) { throw RuntimeException() }
		fun String() : TerminalNode = getToken(cqlParser.Tokens.String.id, 0) as TerminalNode
		fun QuotedString() : TerminalNode = getToken(cqlParser.Tokens.QuotedString.id, 0) as TerminalNode
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterTextValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitTextValue(this)
		}
	}

	fun  textValue() : TextValueContext {
		var _localctx : TextValueContext = TextValueContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_textValue.id)
		try {
			this.state = 35
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,0,context) ) {
			1 -> 
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 32
			match(String) as Token
			}
			2 -> 
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 33
			match(QuotedString) as Token
			}
			3 -> 
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 34
			identifier()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TextComparatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_textComparator.id
	        set(value) { throw RuntimeException() }
		fun LIKE() : TerminalNode = getToken(cqlParser.Tokens.LIKE.id, 0) as TerminalNode
		fun EQUALS() : TerminalNode = getToken(cqlParser.Tokens.EQUALS.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterTextComparator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitTextComparator(this)
		}
	}

	fun  textComparator() : TextComparatorContext {
		var _localctx : TextComparatorContext = TextComparatorContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_textComparator.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 37
			_la = _input!!.LA(1)
			if ( !(_la==LIKE || _la==EQUALS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NumericComparatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_numericComparator.id
	        set(value) { throw RuntimeException() }
		fun findTextComparator() : TextComparatorContext? = getRuleContext(solver.getType("TextComparatorContext"),0)
		fun GT() : TerminalNode = getToken(cqlParser.Tokens.GT.id, 0) as TerminalNode
		fun LT() : TerminalNode = getToken(cqlParser.Tokens.LT.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterNumericComparator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitNumericComparator(this)
		}
	}

	fun  numericComparator() : NumericComparatorContext {
		var _localctx : NumericComparatorContext = NumericComparatorContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_numericComparator.id)
		try {
			this.state = 42
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LIKE -> EQUALS ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 39
			textComparator()
			}}
			GT ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 40
			match(GT) as Token
			}}
			LT ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 41
			match(LT) as Token
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DateComparatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dateComparator.id
	        set(value) { throw RuntimeException() }
		fun findTextComparator() : TextComparatorContext? = getRuleContext(solver.getType("TextComparatorContext"),0)
		fun GT() : TerminalNode = getToken(cqlParser.Tokens.GT.id, 0) as TerminalNode
		fun LT() : TerminalNode = getToken(cqlParser.Tokens.LT.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterDateComparator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitDateComparator(this)
		}
	}

	fun  dateComparator() : DateComparatorContext {
		var _localctx : DateComparatorContext = DateComparatorContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_dateComparator.id)
		try {
			this.state = 47
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LIKE -> EQUALS ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 44
			textComparator()
			}}
			GT ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 45
			match(GT) as Token
			}}
			LT ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 46
			match(LT) as Token
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RangeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_range.id
	        set(value) { throw RuntimeException() }
		fun findNumericRange() : NumericRangeContext? = getRuleContext(solver.getType("NumericRangeContext"),0)
		fun findDateRange() : DateRangeContext? = getRuleContext(solver.getType("DateRangeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterRange(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitRange(this)
		}
	}

	fun  range() : RangeContext {
		var _localctx : RangeContext = RangeContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_range.id)
		try {
			this.state = 51
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> 
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 49
			numericRange()
			}
			2 -> 
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 50
			dateRange()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NumericRangeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_numericRange.id
	        set(value) { throw RuntimeException() }
		fun RANGE_TOK() : TerminalNode = getToken(cqlParser.Tokens.RANGE_TOK.id, 0) as TerminalNode
		fun findNumericValue() : List<NumericValueContext> = getRuleContexts(solver.getType("NumericValueContext"))
		fun findNumericValue(i: Int) : NumericValueContext? = getRuleContext(solver.getType("NumericValueContext"),i)
		fun AND() : TerminalNode = getToken(cqlParser.Tokens.AND.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterNumericRange(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitNumericRange(this)
		}
	}

	fun  numericRange() : NumericRangeContext {
		var _localctx : NumericRangeContext = NumericRangeContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_numericRange.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 53
			match(RANGE_TOK) as Token
			this.state = 54
			numericValue()
			this.state = 55
			match(AND) as Token
			this.state = 56
			numericValue()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DateRangeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dateRange.id
	        set(value) { throw RuntimeException() }
		fun RANGE_TOK() : TerminalNode = getToken(cqlParser.Tokens.RANGE_TOK.id, 0) as TerminalNode
		fun findDateValue() : List<DateValueContext> = getRuleContexts(solver.getType("DateValueContext"))
		fun findDateValue(i: Int) : DateValueContext? = getRuleContext(solver.getType("DateValueContext"),i)
		fun AND() : TerminalNode = getToken(cqlParser.Tokens.AND.id, 0) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterDateRange(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitDateRange(this)
		}
	}

	fun  dateRange() : DateRangeContext {
		var _localctx : DateRangeContext = DateRangeContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_dateRange.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 58
			match(RANGE_TOK) as Token
			this.state = 59
			dateValue()
			this.state = 60
			match(AND) as Token
			this.state = 61
			dateValue()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TermContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_term.id
	        set(value) { throw RuntimeException() }
		fun findNumericComparator() : NumericComparatorContext? = getRuleContext(solver.getType("NumericComparatorContext"),0)
		fun findNumericValue() : NumericValueContext? = getRuleContext(solver.getType("NumericValueContext"),0)
		fun findDateComparator() : DateComparatorContext? = getRuleContext(solver.getType("DateComparatorContext"),0)
		fun findDateValue() : DateValueContext? = getRuleContext(solver.getType("DateValueContext"),0)
		fun findTextComparator() : TextComparatorContext? = getRuleContext(solver.getType("TextComparatorContext"),0)
		fun findTextValue() : TextValueContext? = getRuleContext(solver.getType("TextValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterTerm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitTerm(this)
		}
	}

	fun  term() : TermContext {
		var _localctx : TermContext = TermContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_term.id)
		try {
			this.state = 72
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> 
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 63
			numericComparator()
			this.state = 64
			numericValue()
			}
			2 -> 
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 66
			dateComparator()
			this.state = 67
			dateValue()
			}
			3 -> 
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 69
			textComparator()
			this.state = 70
			textValue()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SearchtermContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_searchterm.id
	        set(value) { throw RuntimeException() }
		fun findIdentifier() : IdentifierContext? = getRuleContext(solver.getType("IdentifierContext"),0)
		fun findTerm() : TermContext? = getRuleContext(solver.getType("TermContext"),0)
		fun findRange() : RangeContext? = getRuleContext(solver.getType("RangeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterSearchterm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitSearchterm(this)
		}
	}

	fun  searchterm() : SearchtermContext {
		var _localctx : SearchtermContext = SearchtermContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_searchterm.id)
		try {
			this.state = 80
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> 
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 74
			identifier()
			this.state = 75
			term()
			}
			2 -> 
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 77
			identifier()
			this.state = 78
			range()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SearchTermListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_searchTermList.id
	        set(value) { throw RuntimeException() }
		fun findSearchterm() : List<SearchtermContext> = getRuleContexts(solver.getType("SearchtermContext"))
		fun findSearchterm(i: Int) : SearchtermContext? = getRuleContext(solver.getType("SearchtermContext"),i)
		fun EOF() : TerminalNode = getToken(cqlParser.Tokens.EOF.id, 0) as TerminalNode
		fun AND() : List<TerminalNode> = getTokens(cqlParser.Tokens.AND.id) as TerminalNode
		fun AND(int i) : TerminalNode = getToken(cqlParser.Tokens.AND.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).enterSearchTermList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is cqlListener ) (listener as cqlListener).exitSearchTermList(this)
		}
	}

	fun  searchTermList() : SearchTermListContext {
		var _localctx : SearchTermListContext = SearchTermListContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_searchTermList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 82
			searchterm()
			this.state = 87
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==AND) {
				if (true){
				if (true){
				this.state = 83
				match(AND) as Token
				this.state = 84
				searchterm()
				}
				}
				this.state = 89
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 90
			match(EOF) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

}