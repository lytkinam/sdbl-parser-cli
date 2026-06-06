// Generated from SDBLParser.g4 by ANTLR 4.13.1
package com.github._1c_syntax.bsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SDBLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SDBLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SDBLParser#queryPackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPackage(SDBLParser.QueryPackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#queries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueries(SDBLParser.QueriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#dropTableQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableQuery(SDBLParser.DropTableQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#selectQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectQuery(SDBLParser.SelectQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SDBLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(SDBLParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SDBLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#limitations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitations(SDBLParser.LimitationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(SDBLParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#selectedFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectedFields(SDBLParser.SelectedFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#selectedField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectedField(SDBLParser.SelectedFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#asteriskField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskField(SDBLParser.AsteriskFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#expressionField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionField(SDBLParser.ExpressionFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#columnField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnField(SDBLParser.ColumnFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#emptyTableField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTableField(SDBLParser.EmptyTableFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#emptyTableColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTableColumns(SDBLParser.EmptyTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#inlineTableField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableField(SDBLParser.InlineTableFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#recordAutoNumberFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordAutoNumberFunction(SDBLParser.RecordAutoNumberFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#indexingItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingItem(SDBLParser.IndexingItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#indexingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingSet(SDBLParser.IndexingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#orderBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderBy(SDBLParser.OrderByContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#ordersByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdersByExpression(SDBLParser.OrdersByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#totalBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalBy(SDBLParser.TotalByContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#totalsGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalsGroup(SDBLParser.TotalsGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#periodic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodic(SDBLParser.PeriodicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SDBLParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SDBLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression(SDBLParser.PrimitiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(SDBLParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(SDBLParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#bracketExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(SDBLParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SDBLParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SDBLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#builtInFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInFunctions(SDBLParser.BuiltInFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#aggregateFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctions(SDBLParser.AggregateFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#valueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFunction(SDBLParser.ValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(SDBLParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(SDBLParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SDBLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#likePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(SDBLParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#isNullPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(SDBLParser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#comparePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparePredicate(SDBLParser.ComparePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(SDBLParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(SDBLParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#refsPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefsPredicate(SDBLParser.RefsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(SDBLParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#expressionListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListItem(SDBLParser.ExpressionListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#dataSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSources(SDBLParser.DataSourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#dataSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSource(SDBLParser.DataSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SDBLParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#virtualTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualTable(SDBLParser.VirtualTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#virtualTableParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualTableParameter(SDBLParser.VirtualTableParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#parameterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTable(SDBLParser.ParameterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#externalDataSourceTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDataSourceTable(SDBLParser.ExternalDataSourceTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPart(SDBLParser.JoinPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#rightJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightJoin(SDBLParser.RightJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#leftJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftJoin(SDBLParser.LeftJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#fullJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullJoin(SDBLParser.FullJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#innerJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(SDBLParser.InnerJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SDBLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#datePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatePart(SDBLParser.DatePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#multiString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiString(SDBLParser.MultiStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SDBLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SDBLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#temporaryTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporaryTableIdentifier(SDBLParser.TemporaryTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SDBLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SDBLParser#mdo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdo(SDBLParser.MdoContext ctx);
}