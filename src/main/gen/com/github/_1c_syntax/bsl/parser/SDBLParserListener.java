// Generated from SDBLParser.g4 by ANTLR 4.13.1
package com.github._1c_syntax.bsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SDBLParser}.
 */
public interface SDBLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SDBLParser#queryPackage}.
	 * @param ctx the parse tree
	 */
	void enterQueryPackage(SDBLParser.QueryPackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#queryPackage}.
	 * @param ctx the parse tree
	 */
	void exitQueryPackage(SDBLParser.QueryPackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#queries}.
	 * @param ctx the parse tree
	 */
	void enterQueries(SDBLParser.QueriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#queries}.
	 * @param ctx the parse tree
	 */
	void exitQueries(SDBLParser.QueriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#dropTableQuery}.
	 * @param ctx the parse tree
	 */
	void enterDropTableQuery(SDBLParser.DropTableQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#dropTableQuery}.
	 * @param ctx the parse tree
	 */
	void exitDropTableQuery(SDBLParser.DropTableQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(SDBLParser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(SDBLParser.SelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SDBLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SDBLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(SDBLParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(SDBLParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SDBLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SDBLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#limitations}.
	 * @param ctx the parse tree
	 */
	void enterLimitations(SDBLParser.LimitationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#limitations}.
	 * @param ctx the parse tree
	 */
	void exitLimitations(SDBLParser.LimitationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(SDBLParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(SDBLParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#selectedFields}.
	 * @param ctx the parse tree
	 */
	void enterSelectedFields(SDBLParser.SelectedFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#selectedFields}.
	 * @param ctx the parse tree
	 */
	void exitSelectedFields(SDBLParser.SelectedFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#selectedField}.
	 * @param ctx the parse tree
	 */
	void enterSelectedField(SDBLParser.SelectedFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#selectedField}.
	 * @param ctx the parse tree
	 */
	void exitSelectedField(SDBLParser.SelectedFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#asteriskField}.
	 * @param ctx the parse tree
	 */
	void enterAsteriskField(SDBLParser.AsteriskFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#asteriskField}.
	 * @param ctx the parse tree
	 */
	void exitAsteriskField(SDBLParser.AsteriskFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#expressionField}.
	 * @param ctx the parse tree
	 */
	void enterExpressionField(SDBLParser.ExpressionFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#expressionField}.
	 * @param ctx the parse tree
	 */
	void exitExpressionField(SDBLParser.ExpressionFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#columnField}.
	 * @param ctx the parse tree
	 */
	void enterColumnField(SDBLParser.ColumnFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#columnField}.
	 * @param ctx the parse tree
	 */
	void exitColumnField(SDBLParser.ColumnFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#emptyTableField}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTableField(SDBLParser.EmptyTableFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#emptyTableField}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTableField(SDBLParser.EmptyTableFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#emptyTableColumns}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTableColumns(SDBLParser.EmptyTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#emptyTableColumns}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTableColumns(SDBLParser.EmptyTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#inlineTableField}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableField(SDBLParser.InlineTableFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#inlineTableField}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableField(SDBLParser.InlineTableFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#recordAutoNumberFunction}.
	 * @param ctx the parse tree
	 */
	void enterRecordAutoNumberFunction(SDBLParser.RecordAutoNumberFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#recordAutoNumberFunction}.
	 * @param ctx the parse tree
	 */
	void exitRecordAutoNumberFunction(SDBLParser.RecordAutoNumberFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#indexingItem}.
	 * @param ctx the parse tree
	 */
	void enterIndexingItem(SDBLParser.IndexingItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#indexingItem}.
	 * @param ctx the parse tree
	 */
	void exitIndexingItem(SDBLParser.IndexingItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#indexingSet}.
	 * @param ctx the parse tree
	 */
	void enterIndexingSet(SDBLParser.IndexingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#indexingSet}.
	 * @param ctx the parse tree
	 */
	void exitIndexingSet(SDBLParser.IndexingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void enterOrderBy(SDBLParser.OrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void exitOrderBy(SDBLParser.OrderByContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#ordersByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrdersByExpression(SDBLParser.OrdersByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#ordersByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrdersByExpression(SDBLParser.OrdersByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#totalBy}.
	 * @param ctx the parse tree
	 */
	void enterTotalBy(SDBLParser.TotalByContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#totalBy}.
	 * @param ctx the parse tree
	 */
	void exitTotalBy(SDBLParser.TotalByContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#totalsGroup}.
	 * @param ctx the parse tree
	 */
	void enterTotalsGroup(SDBLParser.TotalsGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#totalsGroup}.
	 * @param ctx the parse tree
	 */
	void exitTotalsGroup(SDBLParser.TotalsGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#periodic}.
	 * @param ctx the parse tree
	 */
	void enterPeriodic(SDBLParser.PeriodicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#periodic}.
	 * @param ctx the parse tree
	 */
	void exitPeriodic(SDBLParser.PeriodicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SDBLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SDBLParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SDBLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SDBLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpression(SDBLParser.PrimitiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpression(SDBLParser.PrimitiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SDBLParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SDBLParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(SDBLParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(SDBLParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(SDBLParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(SDBLParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SDBLParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SDBLParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SDBLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SDBLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#builtInFunctions}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFunctions(SDBLParser.BuiltInFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#builtInFunctions}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFunctions(SDBLParser.BuiltInFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#aggregateFunctions}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctions(SDBLParser.AggregateFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#aggregateFunctions}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctions(SDBLParser.AggregateFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#valueFunction}.
	 * @param ctx the parse tree
	 */
	void enterValueFunction(SDBLParser.ValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#valueFunction}.
	 * @param ctx the parse tree
	 */
	void exitValueFunction(SDBLParser.ValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(SDBLParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(SDBLParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SDBLParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SDBLParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SDBLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SDBLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(SDBLParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(SDBLParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#isNullPredicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(SDBLParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#isNullPredicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(SDBLParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#comparePredicate}.
	 * @param ctx the parse tree
	 */
	void enterComparePredicate(SDBLParser.ComparePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#comparePredicate}.
	 * @param ctx the parse tree
	 */
	void exitComparePredicate(SDBLParser.ComparePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(SDBLParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(SDBLParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(SDBLParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(SDBLParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#refsPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRefsPredicate(SDBLParser.RefsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#refsPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRefsPredicate(SDBLParser.RefsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SDBLParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SDBLParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#expressionListItem}.
	 * @param ctx the parse tree
	 */
	void enterExpressionListItem(SDBLParser.ExpressionListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#expressionListItem}.
	 * @param ctx the parse tree
	 */
	void exitExpressionListItem(SDBLParser.ExpressionListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#dataSources}.
	 * @param ctx the parse tree
	 */
	void enterDataSources(SDBLParser.DataSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#dataSources}.
	 * @param ctx the parse tree
	 */
	void exitDataSources(SDBLParser.DataSourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#dataSource}.
	 * @param ctx the parse tree
	 */
	void enterDataSource(SDBLParser.DataSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#dataSource}.
	 * @param ctx the parse tree
	 */
	void exitDataSource(SDBLParser.DataSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SDBLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SDBLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#virtualTable}.
	 * @param ctx the parse tree
	 */
	void enterVirtualTable(SDBLParser.VirtualTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#virtualTable}.
	 * @param ctx the parse tree
	 */
	void exitVirtualTable(SDBLParser.VirtualTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#virtualTableParameter}.
	 * @param ctx the parse tree
	 */
	void enterVirtualTableParameter(SDBLParser.VirtualTableParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#virtualTableParameter}.
	 * @param ctx the parse tree
	 */
	void exitVirtualTableParameter(SDBLParser.VirtualTableParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#parameterTable}.
	 * @param ctx the parse tree
	 */
	void enterParameterTable(SDBLParser.ParameterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#parameterTable}.
	 * @param ctx the parse tree
	 */
	void exitParameterTable(SDBLParser.ParameterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#externalDataSourceTable}.
	 * @param ctx the parse tree
	 */
	void enterExternalDataSourceTable(SDBLParser.ExternalDataSourceTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#externalDataSourceTable}.
	 * @param ctx the parse tree
	 */
	void exitExternalDataSourceTable(SDBLParser.ExternalDataSourceTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterJoinPart(SDBLParser.JoinPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitJoinPart(SDBLParser.JoinPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#rightJoin}.
	 * @param ctx the parse tree
	 */
	void enterRightJoin(SDBLParser.RightJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#rightJoin}.
	 * @param ctx the parse tree
	 */
	void exitRightJoin(SDBLParser.RightJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#leftJoin}.
	 * @param ctx the parse tree
	 */
	void enterLeftJoin(SDBLParser.LeftJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#leftJoin}.
	 * @param ctx the parse tree
	 */
	void exitLeftJoin(SDBLParser.LeftJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#fullJoin}.
	 * @param ctx the parse tree
	 */
	void enterFullJoin(SDBLParser.FullJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#fullJoin}.
	 * @param ctx the parse tree
	 */
	void exitFullJoin(SDBLParser.FullJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(SDBLParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(SDBLParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SDBLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SDBLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#datePart}.
	 * @param ctx the parse tree
	 */
	void enterDatePart(SDBLParser.DatePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#datePart}.
	 * @param ctx the parse tree
	 */
	void exitDatePart(SDBLParser.DatePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#multiString}.
	 * @param ctx the parse tree
	 */
	void enterMultiString(SDBLParser.MultiStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#multiString}.
	 * @param ctx the parse tree
	 */
	void exitMultiString(SDBLParser.MultiStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SDBLParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SDBLParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SDBLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SDBLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#temporaryTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTemporaryTableIdentifier(SDBLParser.TemporaryTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#temporaryTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTemporaryTableIdentifier(SDBLParser.TemporaryTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SDBLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SDBLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SDBLParser#mdo}.
	 * @param ctx the parse tree
	 */
	void enterMdo(SDBLParser.MdoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SDBLParser#mdo}.
	 * @param ctx the parse tree
	 */
	void exitMdo(SDBLParser.MdoContext ctx);
}