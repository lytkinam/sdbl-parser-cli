// Generated from BSLDescriptionParser.g4 by ANTLR 4.13.1
package com.github._1c_syntax.bsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BSLDescriptionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BSLDescriptionParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#methodDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDescription(BSLDescriptionParser.MethodDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#deprecateBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeprecateBlock(BSLDescriptionParser.DeprecateBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#deprecateDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeprecateDescription(BSLDescriptionParser.DeprecateDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#descriptionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionBlock(BSLDescriptionParser.DescriptionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#descriptionString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionString(BSLDescriptionParser.DescriptionStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#examplesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExamplesBlock(BSLDescriptionParser.ExamplesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#examplesHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExamplesHead(BSLDescriptionParser.ExamplesHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#examplesString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExamplesString(BSLDescriptionParser.ExamplesStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#callOptionsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallOptionsBlock(BSLDescriptionParser.CallOptionsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#callOptionsHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallOptionsHead(BSLDescriptionParser.CallOptionsHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#callOptionsString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallOptionsString(BSLDescriptionParser.CallOptionsStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#parametersBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersBlock(BSLDescriptionParser.ParametersBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#parametersHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersHead(BSLDescriptionParser.ParametersHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#parameterString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterString(BSLDescriptionParser.ParameterStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(BSLDescriptionParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(BSLDescriptionParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(BSLDescriptionParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#returnsValuesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsValuesBlock(BSLDescriptionParser.ReturnsValuesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#returnsValuesHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsValuesHead(BSLDescriptionParser.ReturnsValuesHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#returnsValuesString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsValuesString(BSLDescriptionParser.ReturnsValuesStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#skipBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipBlock(BSLDescriptionParser.SkipBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#skipKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipKey(BSLDescriptionParser.SkipKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#returnsValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsValue(BSLDescriptionParser.ReturnsValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#typeDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDescription(BSLDescriptionParser.TypeDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#typesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesBlock(BSLDescriptionParser.TypesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BSLDescriptionParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(BSLDescriptionParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#collectionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionType(BSLDescriptionParser.CollectionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#hyperlinkType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyperlinkType(BSLDescriptionParser.HyperlinkTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#listTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTypes(BSLDescriptionParser.ListTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(BSLDescriptionParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#hyperlink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyperlink(BSLDescriptionParser.HyperlinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#splitter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitter(BSLDescriptionParser.SplitterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSLDescriptionParser#startPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartPart(BSLDescriptionParser.StartPartContext ctx);
}