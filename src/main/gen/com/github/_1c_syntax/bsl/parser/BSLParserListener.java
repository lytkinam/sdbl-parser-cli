// Generated from BSLParser.g4 by ANTLR 4.13.1
package com.github._1c_syntax.bsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BSLParser}.
 */
public interface BSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BSLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BSLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BSLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_native}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_native(BSLParser.Preproc_nativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_native}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_native(BSLParser.Preproc_nativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#usedLib}.
	 * @param ctx the parse tree
	 */
	void enterUsedLib(BSLParser.UsedLibContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#usedLib}.
	 * @param ctx the parse tree
	 */
	void exitUsedLib(BSLParser.UsedLibContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(BSLParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(BSLParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#moduleAnnotations}.
	 * @param ctx the parse tree
	 */
	void enterModuleAnnotations(BSLParser.ModuleAnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#moduleAnnotations}.
	 * @param ctx the parse tree
	 */
	void exitModuleAnnotations(BSLParser.ModuleAnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#shebang}.
	 * @param ctx the parse tree
	 */
	void enterShebang(BSLParser.ShebangContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#shebang}.
	 * @param ctx the parse tree
	 */
	void exitShebang(BSLParser.ShebangContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#regionStart}.
	 * @param ctx the parse tree
	 */
	void enterRegionStart(BSLParser.RegionStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#regionStart}.
	 * @param ctx the parse tree
	 */
	void exitRegionStart(BSLParser.RegionStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#regionEnd}.
	 * @param ctx the parse tree
	 */
	void enterRegionEnd(BSLParser.RegionEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#regionEnd}.
	 * @param ctx the parse tree
	 */
	void exitRegionEnd(BSLParser.RegionEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#regionName}.
	 * @param ctx the parse tree
	 */
	void enterRegionName(BSLParser.RegionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#regionName}.
	 * @param ctx the parse tree
	 */
	void exitRegionName(BSLParser.RegionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_if}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_if(BSLParser.Preproc_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_if}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_if(BSLParser.Preproc_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_elsif}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_elsif(BSLParser.Preproc_elsifContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_elsif}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_elsif(BSLParser.Preproc_elsifContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_else}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_else(BSLParser.Preproc_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_else}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_else(BSLParser.Preproc_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_endif}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_endif(BSLParser.Preproc_endifContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_endif}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_endif(BSLParser.Preproc_endifContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_expression}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_expression(BSLParser.Preproc_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_expression}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_expression(BSLParser.Preproc_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_logicalOperand}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_logicalOperand(BSLParser.Preproc_logicalOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_logicalOperand}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_logicalOperand(BSLParser.Preproc_logicalOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_logicalExpression(BSLParser.Preproc_logicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_logicalExpression(BSLParser.Preproc_logicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_symbol}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_symbol(BSLParser.Preproc_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_symbol}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_symbol(BSLParser.Preproc_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_unknownSymbol}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_unknownSymbol(BSLParser.Preproc_unknownSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_unknownSymbol}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_unknownSymbol(BSLParser.Preproc_unknownSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preproc_boolOperation}.
	 * @param ctx the parse tree
	 */
	void enterPreproc_boolOperation(BSLParser.Preproc_boolOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preproc_boolOperation}.
	 * @param ctx the parse tree
	 */
	void exitPreproc_boolOperation(BSLParser.Preproc_boolOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor(BSLParser.PreprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor(BSLParser.PreprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#compilerDirectiveSymbol}.
	 * @param ctx the parse tree
	 */
	void enterCompilerDirectiveSymbol(BSLParser.CompilerDirectiveSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#compilerDirectiveSymbol}.
	 * @param ctx the parse tree
	 */
	void exitCompilerDirectiveSymbol(BSLParser.CompilerDirectiveSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#compilerDirective}.
	 * @param ctx the parse tree
	 */
	void enterCompilerDirective(BSLParser.CompilerDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#compilerDirective}.
	 * @param ctx the parse tree
	 */
	void exitCompilerDirective(BSLParser.CompilerDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(BSLParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(BSLParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#annotationParamName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamName(BSLParser.AnnotationParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#annotationParamName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamName(BSLParser.AnnotationParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(BSLParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(BSLParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#annotationParams}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParams(BSLParser.AnnotationParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#annotationParams}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParams(BSLParser.AnnotationParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#annotationParam}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParam(BSLParser.AnnotationParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#annotationParam}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParam(BSLParser.AnnotationParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#annotationParamValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamValue(BSLParser.AnnotationParamValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#annotationParamValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamValue(BSLParser.AnnotationParamValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(BSLParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(BSLParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#moduleVars}.
	 * @param ctx the parse tree
	 */
	void enterModuleVars(BSLParser.ModuleVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#moduleVars}.
	 * @param ctx the parse tree
	 */
	void exitModuleVars(BSLParser.ModuleVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#moduleVar}.
	 * @param ctx the parse tree
	 */
	void enterModuleVar(BSLParser.ModuleVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#moduleVar}.
	 * @param ctx the parse tree
	 */
	void exitModuleVar(BSLParser.ModuleVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#moduleVarsList}.
	 * @param ctx the parse tree
	 */
	void enterModuleVarsList(BSLParser.ModuleVarsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#moduleVarsList}.
	 * @param ctx the parse tree
	 */
	void exitModuleVarsList(BSLParser.ModuleVarsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#moduleVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleVarDeclaration(BSLParser.ModuleVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#moduleVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleVarDeclaration(BSLParser.ModuleVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#subVars}.
	 * @param ctx the parse tree
	 */
	void enterSubVars(BSLParser.SubVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#subVars}.
	 * @param ctx the parse tree
	 */
	void exitSubVars(BSLParser.SubVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#subVar}.
	 * @param ctx the parse tree
	 */
	void enterSubVar(BSLParser.SubVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#subVar}.
	 * @param ctx the parse tree
	 */
	void exitSubVar(BSLParser.SubVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#subVarsList}.
	 * @param ctx the parse tree
	 */
	void enterSubVarsList(BSLParser.SubVarsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#subVarsList}.
	 * @param ctx the parse tree
	 */
	void exitSubVarsList(BSLParser.SubVarsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#subVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubVarDeclaration(BSLParser.SubVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#subVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubVarDeclaration(BSLParser.SubVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#subName}.
	 * @param ctx the parse tree
	 */
	void enterSubName(BSLParser.SubNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#subName}.
	 * @param ctx the parse tree
	 */
	void exitSubName(BSLParser.SubNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#subs}.
	 * @param ctx the parse tree
	 */
	void enterSubs(BSLParser.SubsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#subs}.
	 * @param ctx the parse tree
	 */
	void exitSubs(BSLParser.SubsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(BSLParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(BSLParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(BSLParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(BSLParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BSLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BSLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#procDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcDeclaration(BSLParser.ProcDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#procDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcDeclaration(BSLParser.ProcDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(BSLParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(BSLParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#subCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubCodeBlock(BSLParser.SubCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#subCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubCodeBlock(BSLParser.SubCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(BSLParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(BSLParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(BSLParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(BSLParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#raiseStatement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStatement(BSLParser.RaiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#raiseStatement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStatement(BSLParser.RaiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BSLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BSLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#ifBranch}.
	 * @param ctx the parse tree
	 */
	void enterIfBranch(BSLParser.IfBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#ifBranch}.
	 * @param ctx the parse tree
	 */
	void exitIfBranch(BSLParser.IfBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#elsifBranch}.
	 * @param ctx the parse tree
	 */
	void enterElsifBranch(BSLParser.ElsifBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#elsifBranch}.
	 * @param ctx the parse tree
	 */
	void exitElsifBranch(BSLParser.ElsifBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseBranch(BSLParser.ElseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseBranch(BSLParser.ElseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(BSLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(BSLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(BSLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(BSLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(BSLParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(BSLParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(BSLParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(BSLParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(BSLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(BSLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(BSLParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(BSLParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(BSLParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(BSLParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void enterWaitStatement(BSLParser.WaitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void exitWaitStatement(BSLParser.WaitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(BSLParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(BSLParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(BSLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(BSLParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(BSLParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(BSLParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#tryCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryCodeBlock(BSLParser.TryCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#tryCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryCodeBlock(BSLParser.TryCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#exceptCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterExceptCodeBlock(BSLParser.ExceptCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#exceptCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitExceptCodeBlock(BSLParser.ExceptCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(BSLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(BSLParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(BSLParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(BSLParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#addHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddHandlerStatement(BSLParser.AddHandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#addHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddHandlerStatement(BSLParser.AddHandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#removeHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterRemoveHandlerStatement(BSLParser.RemoveHandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#removeHandlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitRemoveHandlerStatement(BSLParser.RemoveHandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperator(BSLParser.TernaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperator(BSLParser.TernaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#waitExpression}.
	 * @param ctx the parse tree
	 */
	void enterWaitExpression(BSLParser.WaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#waitExpression}.
	 * @param ctx the parse tree
	 */
	void exitWaitExpression(BSLParser.WaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#fileCodeBlockBeforeSub}.
	 * @param ctx the parse tree
	 */
	void enterFileCodeBlockBeforeSub(BSLParser.FileCodeBlockBeforeSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#fileCodeBlockBeforeSub}.
	 * @param ctx the parse tree
	 */
	void exitFileCodeBlockBeforeSub(BSLParser.FileCodeBlockBeforeSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#fileCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFileCodeBlock(BSLParser.FileCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#fileCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFileCodeBlock(BSLParser.FileCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(BSLParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(BSLParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(BSLParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(BSLParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(BSLParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(BSLParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(BSLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(BSLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(BSLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(BSLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(BSLParser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(BSLParser.ConstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#multilineString}.
	 * @param ctx the parse tree
	 */
	void enterMultilineString(BSLParser.MultilineStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#multilineString}.
	 * @param ctx the parse tree
	 */
	void exitMultilineString(BSLParser.MultilineStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(BSLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(BSLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BSLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BSLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#callParamList}.
	 * @param ctx the parse tree
	 */
	void enterCallParamList(BSLParser.CallParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#callParamList}.
	 * @param ctx the parse tree
	 */
	void exitCallParamList(BSLParser.CallParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#callParam}.
	 * @param ctx the parse tree
	 */
	void enterCallParam(BSLParser.CallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#callParam}.
	 * @param ctx the parse tree
	 */
	void exitCallParam(BSLParser.CallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(BSLParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(BSLParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#compareOperation}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperation(BSLParser.CompareOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#compareOperation}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperation(BSLParser.CompareOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#boolOperation}.
	 * @param ctx the parse tree
	 */
	void enterBoolOperation(BSLParser.BoolOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#boolOperation}.
	 * @param ctx the parse tree
	 */
	void exitBoolOperation(BSLParser.BoolOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#unaryModifier}.
	 * @param ctx the parse tree
	 */
	void enterUnaryModifier(BSLParser.UnaryModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#unaryModifier}.
	 * @param ctx the parse tree
	 */
	void exitUnaryModifier(BSLParser.UnaryModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(BSLParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(BSLParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(BSLParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(BSLParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(BSLParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(BSLParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(BSLParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(BSLParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#globalMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterGlobalMethodCall(BSLParser.GlobalMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#globalMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitGlobalMethodCall(BSLParser.GlobalMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(BSLParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(BSLParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#complexIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterComplexIdentifier(BSLParser.ComplexIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#complexIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitComplexIdentifier(BSLParser.ComplexIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(BSLParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(BSLParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#acceptor}.
	 * @param ctx the parse tree
	 */
	void enterAcceptor(BSLParser.AcceptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#acceptor}.
	 * @param ctx the parse tree
	 */
	void exitAcceptor(BSLParser.AcceptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValue(BSLParser.LValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValue(BSLParser.LValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#accessCall}.
	 * @param ctx the parse tree
	 */
	void enterAccessCall(BSLParser.AccessCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#accessCall}.
	 * @param ctx the parse tree
	 */
	void exitAccessCall(BSLParser.AccessCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#accessIndex}.
	 * @param ctx the parse tree
	 */
	void enterAccessIndex(BSLParser.AccessIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#accessIndex}.
	 * @param ctx the parse tree
	 */
	void exitAccessIndex(BSLParser.AccessIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#accessProperty}.
	 * @param ctx the parse tree
	 */
	void enterAccessProperty(BSLParser.AccessPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#accessProperty}.
	 * @param ctx the parse tree
	 */
	void exitAccessProperty(BSLParser.AccessPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#incompleteAccess}.
	 * @param ctx the parse tree
	 */
	void enterIncompleteAccess(BSLParser.IncompleteAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#incompleteAccess}.
	 * @param ctx the parse tree
	 */
	void exitIncompleteAccess(BSLParser.IncompleteAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#doCall}.
	 * @param ctx the parse tree
	 */
	void enterDoCall(BSLParser.DoCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#doCall}.
	 * @param ctx the parse tree
	 */
	void exitDoCall(BSLParser.DoCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(BSLParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(BSLParser.CompoundStatementContext ctx);
}