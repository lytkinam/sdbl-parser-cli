// Generated from BSLDescriptionParser.g4 by ANTLR 4.13.1
package com.github._1c_syntax.bsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BSLDescriptionParser}.
 */
public interface BSLDescriptionParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#methodDescription}.
	 * @param ctx the parse tree
	 */
	void enterMethodDescription(BSLDescriptionParser.MethodDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#methodDescription}.
	 * @param ctx the parse tree
	 */
	void exitMethodDescription(BSLDescriptionParser.MethodDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#deprecateBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeprecateBlock(BSLDescriptionParser.DeprecateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#deprecateBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeprecateBlock(BSLDescriptionParser.DeprecateBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#deprecateDescription}.
	 * @param ctx the parse tree
	 */
	void enterDeprecateDescription(BSLDescriptionParser.DeprecateDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#deprecateDescription}.
	 * @param ctx the parse tree
	 */
	void exitDeprecateDescription(BSLDescriptionParser.DeprecateDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#descriptionBlock}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionBlock(BSLDescriptionParser.DescriptionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#descriptionBlock}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionBlock(BSLDescriptionParser.DescriptionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#descriptionString}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionString(BSLDescriptionParser.DescriptionStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#descriptionString}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionString(BSLDescriptionParser.DescriptionStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#examplesBlock}.
	 * @param ctx the parse tree
	 */
	void enterExamplesBlock(BSLDescriptionParser.ExamplesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#examplesBlock}.
	 * @param ctx the parse tree
	 */
	void exitExamplesBlock(BSLDescriptionParser.ExamplesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#examplesHead}.
	 * @param ctx the parse tree
	 */
	void enterExamplesHead(BSLDescriptionParser.ExamplesHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#examplesHead}.
	 * @param ctx the parse tree
	 */
	void exitExamplesHead(BSLDescriptionParser.ExamplesHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#examplesString}.
	 * @param ctx the parse tree
	 */
	void enterExamplesString(BSLDescriptionParser.ExamplesStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#examplesString}.
	 * @param ctx the parse tree
	 */
	void exitExamplesString(BSLDescriptionParser.ExamplesStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#callOptionsBlock}.
	 * @param ctx the parse tree
	 */
	void enterCallOptionsBlock(BSLDescriptionParser.CallOptionsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#callOptionsBlock}.
	 * @param ctx the parse tree
	 */
	void exitCallOptionsBlock(BSLDescriptionParser.CallOptionsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#callOptionsHead}.
	 * @param ctx the parse tree
	 */
	void enterCallOptionsHead(BSLDescriptionParser.CallOptionsHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#callOptionsHead}.
	 * @param ctx the parse tree
	 */
	void exitCallOptionsHead(BSLDescriptionParser.CallOptionsHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#callOptionsString}.
	 * @param ctx the parse tree
	 */
	void enterCallOptionsString(BSLDescriptionParser.CallOptionsStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#callOptionsString}.
	 * @param ctx the parse tree
	 */
	void exitCallOptionsString(BSLDescriptionParser.CallOptionsStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#parametersBlock}.
	 * @param ctx the parse tree
	 */
	void enterParametersBlock(BSLDescriptionParser.ParametersBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#parametersBlock}.
	 * @param ctx the parse tree
	 */
	void exitParametersBlock(BSLDescriptionParser.ParametersBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#parametersHead}.
	 * @param ctx the parse tree
	 */
	void enterParametersHead(BSLDescriptionParser.ParametersHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#parametersHead}.
	 * @param ctx the parse tree
	 */
	void exitParametersHead(BSLDescriptionParser.ParametersHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#parameterString}.
	 * @param ctx the parse tree
	 */
	void enterParameterString(BSLDescriptionParser.ParameterStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#parameterString}.
	 * @param ctx the parse tree
	 */
	void exitParameterString(BSLDescriptionParser.ParameterStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(BSLDescriptionParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(BSLDescriptionParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(BSLDescriptionParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(BSLDescriptionParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(BSLDescriptionParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(BSLDescriptionParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#returnsValuesBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnsValuesBlock(BSLDescriptionParser.ReturnsValuesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#returnsValuesBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnsValuesBlock(BSLDescriptionParser.ReturnsValuesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#returnsValuesHead}.
	 * @param ctx the parse tree
	 */
	void enterReturnsValuesHead(BSLDescriptionParser.ReturnsValuesHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#returnsValuesHead}.
	 * @param ctx the parse tree
	 */
	void exitReturnsValuesHead(BSLDescriptionParser.ReturnsValuesHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#returnsValuesString}.
	 * @param ctx the parse tree
	 */
	void enterReturnsValuesString(BSLDescriptionParser.ReturnsValuesStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#returnsValuesString}.
	 * @param ctx the parse tree
	 */
	void exitReturnsValuesString(BSLDescriptionParser.ReturnsValuesStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#skipBlock}.
	 * @param ctx the parse tree
	 */
	void enterSkipBlock(BSLDescriptionParser.SkipBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#skipBlock}.
	 * @param ctx the parse tree
	 */
	void exitSkipBlock(BSLDescriptionParser.SkipBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#skipKey}.
	 * @param ctx the parse tree
	 */
	void enterSkipKey(BSLDescriptionParser.SkipKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#skipKey}.
	 * @param ctx the parse tree
	 */
	void exitSkipKey(BSLDescriptionParser.SkipKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#returnsValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnsValue(BSLDescriptionParser.ReturnsValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#returnsValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnsValue(BSLDescriptionParser.ReturnsValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#typeDescription}.
	 * @param ctx the parse tree
	 */
	void enterTypeDescription(BSLDescriptionParser.TypeDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#typeDescription}.
	 * @param ctx the parse tree
	 */
	void exitTypeDescription(BSLDescriptionParser.TypeDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#typesBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypesBlock(BSLDescriptionParser.TypesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#typesBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypesBlock(BSLDescriptionParser.TypesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BSLDescriptionParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BSLDescriptionParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(BSLDescriptionParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(BSLDescriptionParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionType(BSLDescriptionParser.CollectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionType(BSLDescriptionParser.CollectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#hyperlinkType}.
	 * @param ctx the parse tree
	 */
	void enterHyperlinkType(BSLDescriptionParser.HyperlinkTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#hyperlinkType}.
	 * @param ctx the parse tree
	 */
	void exitHyperlinkType(BSLDescriptionParser.HyperlinkTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#listTypes}.
	 * @param ctx the parse tree
	 */
	void enterListTypes(BSLDescriptionParser.ListTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#listTypes}.
	 * @param ctx the parse tree
	 */
	void exitListTypes(BSLDescriptionParser.ListTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(BSLDescriptionParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(BSLDescriptionParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#hyperlink}.
	 * @param ctx the parse tree
	 */
	void enterHyperlink(BSLDescriptionParser.HyperlinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#hyperlink}.
	 * @param ctx the parse tree
	 */
	void exitHyperlink(BSLDescriptionParser.HyperlinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#splitter}.
	 * @param ctx the parse tree
	 */
	void enterSplitter(BSLDescriptionParser.SplitterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#splitter}.
	 * @param ctx the parse tree
	 */
	void exitSplitter(BSLDescriptionParser.SplitterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSLDescriptionParser#startPart}.
	 * @param ctx the parse tree
	 */
	void enterStartPart(BSLDescriptionParser.StartPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSLDescriptionParser#startPart}.
	 * @param ctx the parse tree
	 */
	void exitStartPart(BSLDescriptionParser.StartPartContext ctx);
}