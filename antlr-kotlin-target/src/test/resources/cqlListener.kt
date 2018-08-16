// Generated from java-escape by ANTLR 4.7.1

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cqlParser}.
 */
interface cqlListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	fun enterIdentifier(ctx: cqlParser.IdentifierContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	fun exitIdentifier(ctx: cqlParser.IdentifierContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#numericValue}.
	 * @param ctx the parse tree
	 */
	fun enterNumericValue(ctx: cqlParser.NumericValueContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#numericValue}.
	 * @param ctx the parse tree
	 */
	fun exitNumericValue(ctx: cqlParser.NumericValueContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#dateValue}.
	 * @param ctx the parse tree
	 */
	fun enterDateValue(ctx: cqlParser.DateValueContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#dateValue}.
	 * @param ctx the parse tree
	 */
	fun exitDateValue(ctx: cqlParser.DateValueContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#textValue}.
	 * @param ctx the parse tree
	 */
	fun enterTextValue(ctx: cqlParser.TextValueContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#textValue}.
	 * @param ctx the parse tree
	 */
	fun exitTextValue(ctx: cqlParser.TextValueContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#textComparator}.
	 * @param ctx the parse tree
	 */
	fun enterTextComparator(ctx: cqlParser.TextComparatorContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#textComparator}.
	 * @param ctx the parse tree
	 */
	fun exitTextComparator(ctx: cqlParser.TextComparatorContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#numericComparator}.
	 * @param ctx the parse tree
	 */
	fun enterNumericComparator(ctx: cqlParser.NumericComparatorContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#numericComparator}.
	 * @param ctx the parse tree
	 */
	fun exitNumericComparator(ctx: cqlParser.NumericComparatorContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#dateComparator}.
	 * @param ctx the parse tree
	 */
	fun enterDateComparator(ctx: cqlParser.DateComparatorContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#dateComparator}.
	 * @param ctx the parse tree
	 */
	fun exitDateComparator(ctx: cqlParser.DateComparatorContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#range}.
	 * @param ctx the parse tree
	 */
	fun enterRange(ctx: cqlParser.RangeContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#range}.
	 * @param ctx the parse tree
	 */
	fun exitRange(ctx: cqlParser.RangeContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#numericRange}.
	 * @param ctx the parse tree
	 */
	fun enterNumericRange(ctx: cqlParser.NumericRangeContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#numericRange}.
	 * @param ctx the parse tree
	 */
	fun exitNumericRange(ctx: cqlParser.NumericRangeContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#dateRange}.
	 * @param ctx the parse tree
	 */
	fun enterDateRange(ctx: cqlParser.DateRangeContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#dateRange}.
	 * @param ctx the parse tree
	 */
	fun exitDateRange(ctx: cqlParser.DateRangeContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	fun enterTerm(ctx: cqlParser.TermContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	fun exitTerm(ctx: cqlParser.TermContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#searchterm}.
	 * @param ctx the parse tree
	 */
	fun enterSearchterm(ctx: cqlParser.SearchtermContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#searchterm}.
	 * @param ctx the parse tree
	 */
	fun exitSearchterm(ctx: cqlParser.SearchtermContext)
	/**
	 * Enter a parse tree produced by {@link cqlParser#searchTermList}.
	 * @param ctx the parse tree
	 */
	fun enterSearchTermList(ctx: cqlParser.SearchTermListContext)
	/**
	 * Exit a parse tree produced by {@link cqlParser#searchTermList}.
	 * @param ctx the parse tree
	 */
	fun exitSearchTermList(ctx: cqlParser.SearchTermListContext)
}