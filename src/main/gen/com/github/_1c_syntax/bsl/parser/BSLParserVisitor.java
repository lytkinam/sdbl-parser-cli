// Generated from BSLParser.g4 by ANTLR 4.13.1
package com.github._1c_syntax.bsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BSLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BSLParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(BSLParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_native}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_native(BSLParser.Preproc_nativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#usedLib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsedLib(BSLParser.UsedLibContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(BSLParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#moduleAnnotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleAnnotations(BSLParser.ModuleAnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#shebang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShebang(BSLParser.ShebangContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#regionStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegionStart(BSLParser.RegionStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#regionEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegionEnd(BSLParser.RegionEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#regionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegionName(BSLParser.RegionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_if(BSLParser.Preproc_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_elsif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_elsif(BSLParser.Preproc_elsifContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_else(BSLParser.Preproc_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_endif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_endif(BSLParser.Preproc_endifContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_expression(BSLParser.Preproc_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_logicalOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_logicalOperand(BSLParser.Preproc_logicalOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_logicalExpression(BSLParser.Preproc_logicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_symbol(BSLParser.Preproc_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_unknownSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_unknownSymbol(BSLParser.Preproc_unknownSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preproc_boolOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreproc_boolOperation(BSLParser.Preproc_boolOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor(BSLParser.PreprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#compilerDirectiveSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveSymbol(BSLParser.CompilerDirectiveSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#compilerDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirective(BSLParser.CompilerDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(BSLParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#annotationParamName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamName(BSLParser.AnnotationParamNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(BSLParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#annotationParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParams(BSLParser.AnnotationParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#annotationParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParam(BSLParser.AnnotationParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#annotationParamValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamValue(BSLParser.AnnotationParamValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(BSLParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#moduleVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleVars(BSLParser.ModuleVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#moduleVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleVar(BSLParser.ModuleVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#moduleVarsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleVarsList(BSLParser.ModuleVarsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#moduleVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleVarDeclaration(BSLParser.ModuleVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#subVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubVars(BSLParser.SubVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#subVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubVar(BSLParser.SubVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#subVarsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubVarsList(BSLParser.SubVarsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#subVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubVarDeclaration(BSLParser.SubVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#subName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubName(BSLParser.SubNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#subs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubs(BSLParser.SubsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(BSLParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(BSLParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BSLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#procDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDeclaration(BSLParser.ProcDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(BSLParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#subCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubCodeBlock(BSLParser.SubCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(BSLParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(BSLParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#raiseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStatement(BSLParser.RaiseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BSLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#ifBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBranch(BSLParser.IfBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#elsifBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsifBranch(BSLParser.ElsifBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#elseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBranch(BSLParser.ElseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(BSLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(BSLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#forEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(BSLParser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(BSLParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(BSLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#executeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStatement(BSLParser.ExecuteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(BSLParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#waitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitStatement(BSLParser.WaitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(BSLParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(BSLParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(BSLParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#tryCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCodeBlock(BSLParser.TryCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#exceptCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptCodeBlock(BSLParser.ExceptCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(BSLParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(BSLParser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#addHandlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddHandlerStatement(BSLParser.AddHandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#removeHandlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveHandlerStatement(BSLParser.RemoveHandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOperator(BSLParser.TernaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#waitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitExpression(BSLParser.WaitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#fileCodeBlockBeforeSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileCodeBlockBeforeSub(BSLParser.FileCodeBlockBeforeSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#fileCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileCodeBlock(BSLParser.FileCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(BSLParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(BSLParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(BSLParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(BSLParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(BSLParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#constValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstValue(BSLParser.ConstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#multilineString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultilineString(BSLParser.MultilineStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(BSLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BSLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#callParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParamList(BSLParser.CallParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#callParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParam(BSLParser.CallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BSLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(BSLParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#compareOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOperation(BSLParser.CompareOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#boolOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOperation(BSLParser.BoolOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#unaryModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryModifier(BSLParser.UnaryModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(BSLParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(BSLParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(BSLParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(BSLParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#globalMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalMethodCall(BSLParser.GlobalMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(BSLParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#complexIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexIdentifier(BSLParser.ComplexIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(BSLParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#acceptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptor(BSLParser.AcceptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValue(BSLParser.LValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#accessCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessCall(BSLParser.AccessCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#accessIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessIndex(BSLParser.AccessIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#accessProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessProperty(BSLParser.AccessPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#incompleteAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncompleteAccess(BSLParser.IncompleteAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#doCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoCall(BSLParser.DoCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(BSLParser.CompoundStatementContext ctx);
}