// Generated from SDBLParser.g4 by ANTLR 4.13.1
package com.github._1c_syntax.bsl.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SDBLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_SPACE=1, LINE_COMMENT=2, DOT=3, LPAREN=4, RPAREN=5, SEMICOLON=6, 
		COMMA=7, ASSIGN=8, PLUS=9, MINUS=10, LESS_OR_EQUAL=11, NOT_EQUAL=12, LESS=13, 
		GREATER_OR_EQUAL=14, GREATER=15, MUL=16, QUOTIENT=17, NUMBER_SIGH=18, 
		AMPERSAND=19, BRACE=20, ALLOWED=21, ADD=22, AND=23, AS=24, ASC=25, AUTOORDER=26, 
		BETWEEN=27, BY=28, CASE=29, CAST=30, DESC=31, DISTINCT=32, DROP=33, ELSE=34, 
		END=35, ESCAPE=36, FALSE=37, FROM=38, HAVING=39, INTO=40, IS=41, ISNULL=42, 
		LIKE=43, NOT=44, NULL=45, OF=46, OR=47, OVERALL=48, SELECT=49, THEN=50, 
		TOP=51, TOTALS=52, TRUE=53, UNDEFINED=54, WHEN=55, WHERE=56, ACOS=57, 
		ASIN=58, ATAN=59, AVG=60, BEGINOFPERIOD=61, BOOLEAN=62, COS=63, COUNT=64, 
		DATE=65, DATEADD=66, DATEDIFF=67, DATETIME=68, DAY=69, DAYOFYEAR=70, EMPTYTABLE=71, 
		EMPTYREF=72, ENDOFPERIOD=73, EXP=74, HALFYEAR=75, HOUR=76, INT=77, LEFT=78, 
		LOG=79, LOG10=80, LOWER=81, MAX=82, MIN=83, MINUTE=84, MONTH=85, NUMBER=86, 
		UNIQUE=87, QUARTER=88, PERIODS=89, REFS=90, PRESENTATION=91, RECORDAUTONUMBER=92, 
		REFPRESENTATION=93, POW=94, RIGHT=95, ROUND=96, SECOND=97, SIN=98, SQRT=99, 
		STOREDDATASIZE=100, STRING=101, STRINGLENGTH=102, STRFIND=103, STRREPLACE=104, 
		SUBSTRING=105, SUM=106, TAN=107, TENDAYS=108, TRIMALL=109, TRIML=110, 
		TRIMR=111, TYPE=112, UPPER=113, VALUE=114, VALUETYPE=115, WEEK=116, WEEKDAY=117, 
		YEAR=118, UUID=119, ACCOUNTING_REGISTER_TYPE=120, ACCUMULATION_REGISTER_TYPE=121, 
		BUSINESS_PROCESS_TYPE=122, CALCULATION_REGISTER_TYPE=123, CATALOG_TYPE=124, 
		CHART_OF_ACCOUNTS_TYPE=125, CHART_OF_CALCULATION_TYPES_TYPE=126, CHART_OF_CHARACTERISTIC_TYPES_TYPE=127, 
		CONSTANT_TYPE=128, DOCUMENT_TYPE=129, DOCUMENT_JOURNAL_TYPE=130, ENUM_TYPE=131, 
		EXCHANGE_PLAN_TYPE=132, EXTERNAL_DATA_SOURCE_TYPE=133, FILTER_CRITERION_TYPE=134, 
		INFORMATION_REGISTER_TYPE=135, SEQUENCE_TYPE=136, TASK_TYPE=137, ROUTEPOINT_FIELD=138, 
		INDEX_BY_SETS=139, INDEX_BY=140, GROUP_BY_GROUPING_SETS=141, GROUP_BY=142, 
		ORDER_BY=143, FOR_UPDATE=144, RIGHT_OUTER_JOIN=145, RIGHT_JOIN=146, LEFT_OUTER_JOIN=147, 
		LEFT_JOIN=148, FULL_OUTER_JOIN=149, FULL_JOIN=150, INNER_JOIN=151, JOIN=152, 
		UNION_ALL=153, UNION=154, ONLY_HIERARCHY=155, HIERARCHY=156, IN_HIERARCHY=157, 
		IN=158, GROUPEDBY=159, DECIMAL=160, FLOAT=161, INCORRECT_IDENTIFIER=162, 
		IDENTIFIER=163, UNKNOWN=164, PARAMETER_IDENTIFIER=165, ACTUAL_ACTION_PERIOD_VT=166, 
		BALANCE_VT=167, BALANCE_AND_TURNOVERS_VT=168, BOUNDARIES_VT=169, DR_CR_TURNOVERS_VT=170, 
		EXT_DIMENSIONS_VT=171, RECORDS_WITH_EXT_DIMENSIONS_VT=172, SCHEDULE_DATA_VT=173, 
		SLICEFIRST_VT=174, SLICELAST_VT=175, TASK_BY_PERFORMER_VT=176, TURNOVERS_VT=177, 
		BRACE_START=178, EDS_TABLE=179, EDS_CUBE=180, EDS_CUBE_DIMTABLE=181, STR=182;
	public static final int
		RULE_queryPackage = 0, RULE_queries = 1, RULE_dropTableQuery = 2, RULE_selectQuery = 3, 
		RULE_subquery = 4, RULE_union = 5, RULE_query = 6, RULE_limitations = 7, 
		RULE_top = 8, RULE_selectedFields = 9, RULE_selectedField = 10, RULE_asteriskField = 11, 
		RULE_expressionField = 12, RULE_columnField = 13, RULE_emptyTableField = 14, 
		RULE_emptyTableColumns = 15, RULE_inlineTableField = 16, RULE_recordAutoNumberFunction = 17, 
		RULE_indexingItem = 18, RULE_indexingSet = 19, RULE_orderBy = 20, RULE_ordersByExpression = 21, 
		RULE_totalBy = 22, RULE_totalsGroup = 23, RULE_periodic = 24, RULE_column = 25, 
		RULE_expression = 26, RULE_primitiveExpression = 27, RULE_caseExpression = 28, 
		RULE_caseBranch = 29, RULE_bracketExpression = 30, RULE_unaryExpression = 31, 
		RULE_functionCall = 32, RULE_builtInFunctions = 33, RULE_aggregateFunctions = 34, 
		RULE_valueFunction = 35, RULE_castFunction = 36, RULE_logicalExpression = 37, 
		RULE_predicate = 38, RULE_likePredicate = 39, RULE_isNullPredicate = 40, 
		RULE_comparePredicate = 41, RULE_betweenPredicate = 42, RULE_inPredicate = 43, 
		RULE_refsPredicate = 44, RULE_expressionList = 45, RULE_expressionListItem = 46, 
		RULE_dataSources = 47, RULE_dataSource = 48, RULE_table = 49, RULE_virtualTable = 50, 
		RULE_virtualTableParameter = 51, RULE_parameterTable = 52, RULE_externalDataSourceTable = 53, 
		RULE_joinPart = 54, RULE_rightJoin = 55, RULE_leftJoin = 56, RULE_fullJoin = 57, 
		RULE_innerJoin = 58, RULE_alias = 59, RULE_datePart = 60, RULE_multiString = 61, 
		RULE_sign = 62, RULE_identifier = 63, RULE_temporaryTableIdentifier = 64, 
		RULE_parameter = 65, RULE_mdo = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryPackage", "queries", "dropTableQuery", "selectQuery", "subquery", 
			"union", "query", "limitations", "top", "selectedFields", "selectedField", 
			"asteriskField", "expressionField", "columnField", "emptyTableField", 
			"emptyTableColumns", "inlineTableField", "recordAutoNumberFunction", 
			"indexingItem", "indexingSet", "orderBy", "ordersByExpression", "totalBy", 
			"totalsGroup", "periodic", "column", "expression", "primitiveExpression", 
			"caseExpression", "caseBranch", "bracketExpression", "unaryExpression", 
			"functionCall", "builtInFunctions", "aggregateFunctions", "valueFunction", 
			"castFunction", "logicalExpression", "predicate", "likePredicate", "isNullPredicate", 
			"comparePredicate", "betweenPredicate", "inPredicate", "refsPredicate", 
			"expressionList", "expressionListItem", "dataSources", "dataSource", 
			"table", "virtualTable", "virtualTableParameter", "parameterTable", "externalDataSourceTable", 
			"joinPart", "rightJoin", "leftJoin", "fullJoin", "innerJoin", "alias", 
			"datePart", "multiString", "sign", "identifier", "temporaryTableIdentifier", 
			"parameter", "mdo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'", "'('", "')'", "';'", "','", "'='", "'+'", "'-'", 
			"'<='", "'<>'", "'<'", "'>='", "'>'", "'*'", "'/'", "'#'", "'&'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'NULL'", "'OF'", null, null, null, null, null, null, null, null, null, 
			null, "'ACOS'", "'ASIN'", "'ATAN'", null, null, null, "'COS'", null, 
			null, null, null, null, null, null, null, null, null, "'EXP'", null, 
			null, null, null, "'LOG'", "'LOG10'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'POW'", null, null, null, 
			"'SIN'", "'SQRT'", null, null, null, null, null, null, null, "'TAN'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITE_SPACE", "LINE_COMMENT", "DOT", "LPAREN", "RPAREN", "SEMICOLON", 
			"COMMA", "ASSIGN", "PLUS", "MINUS", "LESS_OR_EQUAL", "NOT_EQUAL", "LESS", 
			"GREATER_OR_EQUAL", "GREATER", "MUL", "QUOTIENT", "NUMBER_SIGH", "AMPERSAND", 
			"BRACE", "ALLOWED", "ADD", "AND", "AS", "ASC", "AUTOORDER", "BETWEEN", 
			"BY", "CASE", "CAST", "DESC", "DISTINCT", "DROP", "ELSE", "END", "ESCAPE", 
			"FALSE", "FROM", "HAVING", "INTO", "IS", "ISNULL", "LIKE", "NOT", "NULL", 
			"OF", "OR", "OVERALL", "SELECT", "THEN", "TOP", "TOTALS", "TRUE", "UNDEFINED", 
			"WHEN", "WHERE", "ACOS", "ASIN", "ATAN", "AVG", "BEGINOFPERIOD", "BOOLEAN", 
			"COS", "COUNT", "DATE", "DATEADD", "DATEDIFF", "DATETIME", "DAY", "DAYOFYEAR", 
			"EMPTYTABLE", "EMPTYREF", "ENDOFPERIOD", "EXP", "HALFYEAR", "HOUR", "INT", 
			"LEFT", "LOG", "LOG10", "LOWER", "MAX", "MIN", "MINUTE", "MONTH", "NUMBER", 
			"UNIQUE", "QUARTER", "PERIODS", "REFS", "PRESENTATION", "RECORDAUTONUMBER", 
			"REFPRESENTATION", "POW", "RIGHT", "ROUND", "SECOND", "SIN", "SQRT", 
			"STOREDDATASIZE", "STRING", "STRINGLENGTH", "STRFIND", "STRREPLACE", 
			"SUBSTRING", "SUM", "TAN", "TENDAYS", "TRIMALL", "TRIML", "TRIMR", "TYPE", 
			"UPPER", "VALUE", "VALUETYPE", "WEEK", "WEEKDAY", "YEAR", "UUID", "ACCOUNTING_REGISTER_TYPE", 
			"ACCUMULATION_REGISTER_TYPE", "BUSINESS_PROCESS_TYPE", "CALCULATION_REGISTER_TYPE", 
			"CATALOG_TYPE", "CHART_OF_ACCOUNTS_TYPE", "CHART_OF_CALCULATION_TYPES_TYPE", 
			"CHART_OF_CHARACTERISTIC_TYPES_TYPE", "CONSTANT_TYPE", "DOCUMENT_TYPE", 
			"DOCUMENT_JOURNAL_TYPE", "ENUM_TYPE", "EXCHANGE_PLAN_TYPE", "EXTERNAL_DATA_SOURCE_TYPE", 
			"FILTER_CRITERION_TYPE", "INFORMATION_REGISTER_TYPE", "SEQUENCE_TYPE", 
			"TASK_TYPE", "ROUTEPOINT_FIELD", "INDEX_BY_SETS", "INDEX_BY", "GROUP_BY_GROUPING_SETS", 
			"GROUP_BY", "ORDER_BY", "FOR_UPDATE", "RIGHT_OUTER_JOIN", "RIGHT_JOIN", 
			"LEFT_OUTER_JOIN", "LEFT_JOIN", "FULL_OUTER_JOIN", "FULL_JOIN", "INNER_JOIN", 
			"JOIN", "UNION_ALL", "UNION", "ONLY_HIERARCHY", "HIERARCHY", "IN_HIERARCHY", 
			"IN", "GROUPEDBY", "DECIMAL", "FLOAT", "INCORRECT_IDENTIFIER", "IDENTIFIER", 
			"UNKNOWN", "PARAMETER_IDENTIFIER", "ACTUAL_ACTION_PERIOD_VT", "BALANCE_VT", 
			"BALANCE_AND_TURNOVERS_VT", "BOUNDARIES_VT", "DR_CR_TURNOVERS_VT", "EXT_DIMENSIONS_VT", 
			"RECORDS_WITH_EXT_DIMENSIONS_VT", "SCHEDULE_DATA_VT", "SLICEFIRST_VT", 
			"SLICELAST_VT", "TASK_BY_PERFORMER_VT", "TURNOVERS_VT", "BRACE_START", 
			"EDS_TABLE", "EDS_CUBE", "EDS_CUBE_DIMTABLE", "STR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SDBLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SDBLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPackageContext extends ParserRuleContext {
		public List<QueriesContext> queries() {
			return getRuleContexts(QueriesContext.class);
		}
		public QueriesContext queries(int i) {
			return getRuleContext(QueriesContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SDBLParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SDBLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SDBLParser.SEMICOLON, i);
		}
		public QueryPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterQueryPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitQueryPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitQueryPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPackageContext queryPackage() throws RecognitionException {
		QueryPackageContext _localctx = new QueryPackageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryPackage);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			queries();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(SEMICOLON);
					setState(136);
					queries();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(142);
				match(SEMICOLON);
				}
			}

			setState(145);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueriesContext extends ParserRuleContext {
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public DropTableQueryContext dropTableQuery() {
			return getRuleContext(DropTableQueryContext.class,0);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_queries);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				selectQuery();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				dropTableQuery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableQueryContext extends ParserRuleContext {
		public IdentifierContext temporaryTableName;
		public TerminalNode DROP() { return getToken(SDBLParser.DROP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropTableQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterDropTableQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitDropTableQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitDropTableQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableQueryContext dropTableQuery() throws RecognitionException {
		DropTableQueryContext _localctx = new DropTableQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dropTableQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DROP);
			setState(152);
			((DropTableQueryContext)_localctx).temporaryTableName = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectQueryContext extends ParserRuleContext {
		public Token autoorder;
		public OrderByContext orders;
		public TotalByContext totals;
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode AUTOORDER() { return getToken(SDBLParser.AUTOORDER, 0); }
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public TotalByContext totalBy() {
			return getRuleContext(TotalByContext.class,0);
		}
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitSelectQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitSelectQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			subquery();
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(155);
				((SelectQueryContext)_localctx).autoorder = match(AUTOORDER);
				setState(156);
				((SelectQueryContext)_localctx).orders = orderBy();
				setState(157);
				((SelectQueryContext)_localctx).totals = totalBy();
				}
				}
				break;
			case 2:
				{
				{
				setState(159);
				((SelectQueryContext)_localctx).orders = orderBy();
				setState(160);
				((SelectQueryContext)_localctx).autoorder = match(AUTOORDER);
				setState(161);
				((SelectQueryContext)_localctx).totals = totalBy();
				}
				}
				break;
			case 3:
				{
				{
				setState(163);
				((SelectQueryContext)_localctx).orders = orderBy();
				setState(164);
				((SelectQueryContext)_localctx).totals = totalBy();
				setState(165);
				((SelectQueryContext)_localctx).autoorder = match(AUTOORDER);
				}
				}
				break;
			case 4:
				{
				{
				setState(167);
				((SelectQueryContext)_localctx).autoorder = match(AUTOORDER);
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ORDER_BY:
					{
					setState(168);
					((SelectQueryContext)_localctx).orders = orderBy();
					}
					break;
				case TOTALS:
					{
					setState(169);
					((SelectQueryContext)_localctx).totals = totalBy();
					}
					break;
				case EOF:
				case SEMICOLON:
					break;
				default:
					break;
				}
				}
				}
				break;
			case 5:
				{
				{
				setState(172);
				((SelectQueryContext)_localctx).orders = orderBy();
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTOORDER:
					{
					setState(173);
					((SelectQueryContext)_localctx).autoorder = match(AUTOORDER);
					}
					break;
				case TOTALS:
					{
					setState(174);
					((SelectQueryContext)_localctx).totals = totalBy();
					}
					break;
				case EOF:
				case SEMICOLON:
					break;
				default:
					break;
				}
				}
				}
				break;
			case 6:
				{
				{
				setState(177);
				((SelectQueryContext)_localctx).totals = totalBy();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTOORDER) {
					{
					setState(178);
					((SelectQueryContext)_localctx).autoorder = match(AUTOORDER);
					}
				}

				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends ParserRuleContext {
		public QueryContext main;
		public UnionContext union;
		public List<UnionContext> unions = new ArrayList<UnionContext>();
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((SubqueryContext)_localctx).main = query();
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(184);
				orderBy();
				}
				break;
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNION_ALL || _la==UNION) {
				{
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					((SubqueryContext)_localctx).union = union();
					((SubqueryContext)_localctx).unions.add(((SubqueryContext)_localctx).union);
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==UNION_ALL || _la==UNION );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionContext extends ParserRuleContext {
		public Token unionType;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SDBLParser.UNION, 0); }
		public TerminalNode UNION_ALL() { return getToken(SDBLParser.UNION_ALL, 0); }
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((UnionContext)_localctx).unionType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UNION_ALL || _la==UNION) ) {
				((UnionContext)_localctx).unionType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			query();
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(196);
				orderBy();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public SelectedFieldsContext columns;
		public TemporaryTableIdentifierContext temporaryTableName;
		public DataSourcesContext from;
		public LogicalExpressionContext where;
		public ExpressionListContext expressionList;
		public List<ExpressionListContext> groupingSet = new ArrayList<ExpressionListContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupBy = new ArrayList<ExpressionContext>();
		public LogicalExpressionContext having;
		public MdoContext forUpdate;
		public IndexingSetContext indexingSet;
		public List<IndexingSetContext> indexSets = new ArrayList<IndexingSetContext>();
		public IndexingItemContext indexingItem;
		public List<IndexingItemContext> indexes = new ArrayList<IndexingItemContext>();
		public TerminalNode SELECT() { return getToken(SDBLParser.SELECT, 0); }
		public SelectedFieldsContext selectedFields() {
			return getRuleContext(SelectedFieldsContext.class,0);
		}
		public LimitationsContext limitations() {
			return getRuleContext(LimitationsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SDBLParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SDBLParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SDBLParser.HAVING, 0); }
		public TerminalNode FOR_UPDATE() { return getToken(SDBLParser.FOR_UPDATE, 0); }
		public TerminalNode INTO() { return getToken(SDBLParser.INTO, 0); }
		public TerminalNode ADD() { return getToken(SDBLParser.ADD, 0); }
		public TemporaryTableIdentifierContext temporaryTableIdentifier() {
			return getRuleContext(TemporaryTableIdentifierContext.class,0);
		}
		public DataSourcesContext dataSources() {
			return getRuleContext(DataSourcesContext.class,0);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode GROUP_BY_GROUPING_SETS() { return getToken(SDBLParser.GROUP_BY_GROUPING_SETS, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SDBLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SDBLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SDBLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SDBLParser.RPAREN, i);
		}
		public TerminalNode GROUP_BY() { return getToken(SDBLParser.GROUP_BY, 0); }
		public TerminalNode INDEX_BY_SETS() { return getToken(SDBLParser.INDEX_BY_SETS, 0); }
		public TerminalNode INDEX_BY() { return getToken(SDBLParser.INDEX_BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IndexingSetContext> indexingSet() {
			return getRuleContexts(IndexingSetContext.class);
		}
		public IndexingSetContext indexingSet(int i) {
			return getRuleContext(IndexingSetContext.class,i);
		}
		public List<IndexingItemContext> indexingItem() {
			return getRuleContexts(IndexingItemContext.class);
		}
		public IndexingItemContext indexingItem(int i) {
			return getRuleContext(IndexingItemContext.class,i);
		}
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public List<TerminalNode> UNIQUE() { return getTokens(SDBLParser.UNIQUE); }
		public TerminalNode UNIQUE(int i) {
			return getToken(SDBLParser.UNIQUE, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SELECT);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251804110749696L) != 0)) {
				{
				setState(200);
				limitations();
				}
			}

			setState(203);
			((QueryContext)_localctx).columns = selectedFields();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==INTO) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==INTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				((QueryContext)_localctx).temporaryTableName = temporaryTableIdentifier();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(208);
				match(FROM);
				setState(209);
				((QueryContext)_localctx).from = dataSources();
				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(212);
				match(WHERE);
				setState(213);
				((QueryContext)_localctx).where = logicalExpression();
				}
			}

			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP_BY_GROUPING_SETS:
				{
				{
				setState(216);
				match(GROUP_BY_GROUPING_SETS);
				setState(217);
				match(LPAREN);
				{
				setState(218);
				match(LPAREN);
				setState(219);
				((QueryContext)_localctx).expressionList = expressionList();
				((QueryContext)_localctx).groupingSet.add(((QueryContext)_localctx).expressionList);
				setState(220);
				match(RPAREN);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221);
					match(COMMA);
					setState(222);
					match(LPAREN);
					setState(223);
					((QueryContext)_localctx).expressionList = expressionList();
					((QueryContext)_localctx).groupingSet.add(((QueryContext)_localctx).expressionList);
					setState(224);
					match(RPAREN);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(231);
				match(RPAREN);
				}
				}
				break;
			case GROUP_BY:
				{
				{
				setState(233);
				match(GROUP_BY);
				setState(234);
				((QueryContext)_localctx).expression = expression(0);
				((QueryContext)_localctx).groupBy.add(((QueryContext)_localctx).expression);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					((QueryContext)_localctx).expression = expression(0);
					((QueryContext)_localctx).groupBy.add(((QueryContext)_localctx).expression);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EOF:
			case RPAREN:
			case SEMICOLON:
			case AUTOORDER:
			case HAVING:
			case TOTALS:
			case INDEX_BY_SETS:
			case INDEX_BY:
			case ORDER_BY:
			case FOR_UPDATE:
			case UNION_ALL:
			case UNION:
				break;
			default:
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(244);
				match(HAVING);
				setState(245);
				((QueryContext)_localctx).having = logicalExpression();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR_UPDATE) {
				{
				setState(248);
				match(FOR_UPDATE);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 262143L) != 0)) {
					{
					setState(249);
					((QueryContext)_localctx).forUpdate = mdo();
					}
				}

				}
			}

			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX_BY_SETS:
				{
				{
				setState(254);
				match(INDEX_BY_SETS);
				setState(255);
				match(LPAREN);
				setState(256);
				((QueryContext)_localctx).indexingSet = indexingSet();
				((QueryContext)_localctx).indexSets.add(((QueryContext)_localctx).indexingSet);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					((QueryContext)_localctx).indexingSet = indexingSet();
					((QueryContext)_localctx).indexSets.add(((QueryContext)_localctx).indexingSet);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(RPAREN);
				}
				}
				break;
			case INDEX_BY:
				{
				{
				setState(266);
				match(INDEX_BY);
				setState(267);
				((QueryContext)_localctx).indexingItem = indexingItem();
				((QueryContext)_localctx).indexes.add(((QueryContext)_localctx).indexingItem);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(268);
					match(UNIQUE);
					}
				}

				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(271);
					match(COMMA);
					setState(272);
					((QueryContext)_localctx).indexingItem = indexingItem();
					((QueryContext)_localctx).indexes.add(((QueryContext)_localctx).indexingItem);
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNIQUE) {
						{
						setState(273);
						match(UNIQUE);
						}
					}

					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EOF:
			case RPAREN:
			case SEMICOLON:
			case AUTOORDER:
			case TOTALS:
			case ORDER_BY:
			case UNION_ALL:
			case UNION:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitationsContext extends ParserRuleContext {
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SDBLParser.DISTINCT, 0); }
		public TerminalNode ALLOWED() { return getToken(SDBLParser.ALLOWED, 0); }
		public LimitationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterLimitations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitLimitations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitLimitations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitationsContext limitations() throws RecognitionException {
		LimitationsContext _localctx = new LimitationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limitations);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOP:
					{
					setState(283);
					top();
					}
					break;
				case DISTINCT:
					{
					setState(284);
					match(DISTINCT);
					}
					break;
				case ALLOWED:
					{
					setState(285);
					match(ALLOWED);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(288);
				match(ALLOWED);
				setState(289);
				match(DISTINCT);
				setState(290);
				top();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(291);
				match(ALLOWED);
				setState(292);
				top();
				setState(293);
				match(DISTINCT);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(295);
				top();
				setState(296);
				match(ALLOWED);
				setState(297);
				match(DISTINCT);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(299);
				top();
				setState(300);
				match(DISTINCT);
				setState(301);
				match(ALLOWED);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(303);
				match(DISTINCT);
				setState(304);
				match(ALLOWED);
				setState(305);
				top();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(306);
				match(DISTINCT);
				setState(307);
				top();
				setState(308);
				match(ALLOWED);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(310);
				match(ALLOWED);
				setState(311);
				match(DISTINCT);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(312);
				match(ALLOWED);
				setState(313);
				top();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(314);
				match(DISTINCT);
				setState(315);
				match(ALLOWED);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(316);
				match(DISTINCT);
				setState(317);
				top();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(318);
				top();
				setState(319);
				match(ALLOWED);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(321);
				top();
				setState(322);
				match(DISTINCT);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopContext extends ParserRuleContext {
		public Token count;
		public TerminalNode TOP() { return getToken(SDBLParser.TOP, 0); }
		public TerminalNode DECIMAL() { return getToken(SDBLParser.DECIMAL, 0); }
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitTop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(TOP);
			setState(327);
			((TopContext)_localctx).count = match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectedFieldsContext extends ParserRuleContext {
		public SelectedFieldContext selectedField;
		public List<SelectedFieldContext> fields = new ArrayList<SelectedFieldContext>();
		public List<SelectedFieldContext> selectedField() {
			return getRuleContexts(SelectedFieldContext.class);
		}
		public SelectedFieldContext selectedField(int i) {
			return getRuleContext(SelectedFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public SelectedFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectedFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterSelectedFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitSelectedFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitSelectedFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectedFieldsContext selectedFields() throws RecognitionException {
		SelectedFieldsContext _localctx = new SelectedFieldsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectedFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((SelectedFieldsContext)_localctx).selectedField = selectedField();
			((SelectedFieldsContext)_localctx).fields.add(((SelectedFieldsContext)_localctx).selectedField);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(330);
				match(COMMA);
				setState(331);
				((SelectedFieldsContext)_localctx).selectedField = selectedField();
				((SelectedFieldsContext)_localctx).fields.add(((SelectedFieldsContext)_localctx).selectedField);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectedFieldContext extends ParserRuleContext {
		public AsteriskFieldContext asteriskField() {
			return getRuleContext(AsteriskFieldContext.class,0);
		}
		public ColumnFieldContext columnField() {
			return getRuleContext(ColumnFieldContext.class,0);
		}
		public EmptyTableFieldContext emptyTableField() {
			return getRuleContext(EmptyTableFieldContext.class,0);
		}
		public InlineTableFieldContext inlineTableField() {
			return getRuleContext(InlineTableFieldContext.class,0);
		}
		public ExpressionFieldContext expressionField() {
			return getRuleContext(ExpressionFieldContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectedField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterSelectedField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitSelectedField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitSelectedField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectedFieldContext selectedField() throws RecognitionException {
		SelectedFieldContext _localctx = new SelectedFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectedField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(337);
				asteriskField();
				}
				break;
			case 2:
				{
				setState(338);
				columnField();
				}
				break;
			case 3:
				{
				setState(339);
				emptyTableField();
				}
				break;
			case 4:
				{
				setState(340);
				inlineTableField();
				}
				break;
			case 5:
				{
				setState(341);
				expressionField();
				}
				break;
			}
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(344);
				alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsteriskFieldContext extends ParserRuleContext {
		public IdentifierContext tableName;
		public TerminalNode MUL() { return getToken(SDBLParser.MUL, 0); }
		public List<TerminalNode> DOT() { return getTokens(SDBLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SDBLParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AsteriskFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asteriskField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterAsteriskField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitAsteriskField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitAsteriskField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsteriskFieldContext asteriskField() throws RecognitionException {
		AsteriskFieldContext _localctx = new AsteriskFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asteriskField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -139044197498880000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -8388609L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 1125659472562175L) != 0)) {
				{
				{
				setState(347);
				((AsteriskFieldContext)_localctx).tableName = identifier();
				setState(348);
				match(DOT);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFieldContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterExpressionField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitExpressionField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitExpressionField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionFieldContext expressionField() throws RecognitionException {
		ExpressionFieldContext _localctx = new ExpressionFieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionField);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				logicalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnFieldContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(SDBLParser.NULL, 0); }
		public RecordAutoNumberFunctionContext recordAutoNumberFunction() {
			return getRuleContext(RecordAutoNumberFunctionContext.class,0);
		}
		public ColumnFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterColumnField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitColumnField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitColumnField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnFieldContext columnField() throws RecognitionException {
		ColumnFieldContext _localctx = new ColumnFieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnField);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(NULL);
				}
				break;
			case RECORDAUTONUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				recordAutoNumberFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyTableFieldContext extends ParserRuleContext {
		public Token emptyTable;
		public TerminalNode DOT() { return getToken(SDBLParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public EmptyTableColumnsContext emptyTableColumns() {
			return getRuleContext(EmptyTableColumnsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public TerminalNode EMPTYTABLE() { return getToken(SDBLParser.EMPTYTABLE, 0); }
		public EmptyTableFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyTableField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterEmptyTableField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitEmptyTableField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitEmptyTableField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyTableFieldContext emptyTableField() throws RecognitionException {
		EmptyTableFieldContext _localctx = new EmptyTableFieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_emptyTableField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((EmptyTableFieldContext)_localctx).emptyTable = match(EMPTYTABLE);
			setState(366);
			match(DOT);
			setState(367);
			match(LPAREN);
			setState(368);
			emptyTableColumns();
			setState(369);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyTableColumnsContext extends ParserRuleContext {
		public AliasContext alias;
		public List<AliasContext> columns = new ArrayList<AliasContext>();
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public EmptyTableColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyTableColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterEmptyTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitEmptyTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitEmptyTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyTableColumnsContext emptyTableColumns() throws RecognitionException {
		EmptyTableColumnsContext _localctx = new EmptyTableColumnsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_emptyTableColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((EmptyTableColumnsContext)_localctx).alias = alias();
			((EmptyTableColumnsContext)_localctx).columns.add(((EmptyTableColumnsContext)_localctx).alias);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				((EmptyTableColumnsContext)_localctx).alias = alias();
				((EmptyTableColumnsContext)_localctx).columns.add(((EmptyTableColumnsContext)_localctx).alias);
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableFieldContext extends ParserRuleContext {
		public ColumnContext inlineTable;
		public SelectedFieldsContext inlineTableFields;
		public TerminalNode DOT() { return getToken(SDBLParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SelectedFieldsContext selectedFields() {
			return getRuleContext(SelectedFieldsContext.class,0);
		}
		public InlineTableFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTableField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterInlineTableField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitInlineTableField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitInlineTableField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableFieldContext inlineTableField() throws RecognitionException {
		InlineTableFieldContext _localctx = new InlineTableFieldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inlineTableField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((InlineTableFieldContext)_localctx).inlineTable = column();
			setState(380);
			match(DOT);
			setState(381);
			match(LPAREN);
			setState(382);
			((InlineTableFieldContext)_localctx).inlineTableFields = selectedFields();
			setState(383);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordAutoNumberFunctionContext extends ParserRuleContext {
		public Token doCall;
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public TerminalNode RECORDAUTONUMBER() { return getToken(SDBLParser.RECORDAUTONUMBER, 0); }
		public RecordAutoNumberFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordAutoNumberFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterRecordAutoNumberFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitRecordAutoNumberFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitRecordAutoNumberFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordAutoNumberFunctionContext recordAutoNumberFunction() throws RecognitionException {
		RecordAutoNumberFunctionContext _localctx = new RecordAutoNumberFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_recordAutoNumberFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((RecordAutoNumberFunctionContext)_localctx).doCall = match(RECORDAUTONUMBER);
			setState(386);
			match(LPAREN);
			setState(387);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexingItemContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public IndexingItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterIndexingItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitIndexingItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitIndexingItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingItemContext indexingItem() throws RecognitionException {
		IndexingItemContext _localctx = new IndexingItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_indexingItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPERSAND:
				{
				setState(389);
				parameter();
				}
				break;
			case DROP:
			case END:
			case ISNULL:
			case SELECT:
			case TOTALS:
			case ACOS:
			case ASIN:
			case ATAN:
			case AVG:
			case BEGINOFPERIOD:
			case BOOLEAN:
			case COS:
			case COUNT:
			case DATE:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DAY:
			case DAYOFYEAR:
			case EMPTYTABLE:
			case EMPTYREF:
			case ENDOFPERIOD:
			case EXP:
			case HALFYEAR:
			case HOUR:
			case INT:
			case LEFT:
			case LOG:
			case LOG10:
			case LOWER:
			case MAX:
			case MIN:
			case MINUTE:
			case MONTH:
			case NUMBER:
			case QUARTER:
			case PERIODS:
			case REFS:
			case PRESENTATION:
			case RECORDAUTONUMBER:
			case REFPRESENTATION:
			case POW:
			case RIGHT:
			case ROUND:
			case SECOND:
			case SIN:
			case SQRT:
			case STOREDDATASIZE:
			case STRING:
			case STRINGLENGTH:
			case STRFIND:
			case STRREPLACE:
			case SUBSTRING:
			case SUM:
			case TAN:
			case TENDAYS:
			case TRIMALL:
			case TRIML:
			case TRIMR:
			case TYPE:
			case UPPER:
			case VALUE:
			case VALUETYPE:
			case WEEK:
			case WEEKDAY:
			case YEAR:
			case UUID:
			case ACCOUNTING_REGISTER_TYPE:
			case ACCUMULATION_REGISTER_TYPE:
			case BUSINESS_PROCESS_TYPE:
			case CALCULATION_REGISTER_TYPE:
			case CATALOG_TYPE:
			case CHART_OF_ACCOUNTS_TYPE:
			case CHART_OF_CALCULATION_TYPES_TYPE:
			case CHART_OF_CHARACTERISTIC_TYPES_TYPE:
			case CONSTANT_TYPE:
			case DOCUMENT_TYPE:
			case DOCUMENT_JOURNAL_TYPE:
			case ENUM_TYPE:
			case EXCHANGE_PLAN_TYPE:
			case EXTERNAL_DATA_SOURCE_TYPE:
			case FILTER_CRITERION_TYPE:
			case INFORMATION_REGISTER_TYPE:
			case SEQUENCE_TYPE:
			case TASK_TYPE:
			case ROUTEPOINT_FIELD:
			case JOIN:
			case UNION:
			case IDENTIFIER:
			case ACTUAL_ACTION_PERIOD_VT:
			case BALANCE_VT:
			case BALANCE_AND_TURNOVERS_VT:
			case BOUNDARIES_VT:
			case DR_CR_TURNOVERS_VT:
			case EXT_DIMENSIONS_VT:
			case RECORDS_WITH_EXT_DIMENSIONS_VT:
			case SCHEDULE_DATA_VT:
			case SLICEFIRST_VT:
			case SLICELAST_VT:
			case TASK_BY_PERFORMER_VT:
			case TURNOVERS_VT:
				{
				setState(390);
				column();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexingSetContext extends ParserRuleContext {
		public IndexingItemContext indexingItem;
		public List<IndexingItemContext> indexes = new ArrayList<IndexingItemContext>();
		public Token unique;
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public List<IndexingItemContext> indexingItem() {
			return getRuleContexts(IndexingItemContext.class);
		}
		public IndexingItemContext indexingItem(int i) {
			return getRuleContext(IndexingItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public TerminalNode UNIQUE() { return getToken(SDBLParser.UNIQUE, 0); }
		public IndexingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterIndexingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitIndexingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitIndexingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingSetContext indexingSet() throws RecognitionException {
		IndexingSetContext _localctx = new IndexingSetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_indexingSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(LPAREN);
			setState(394);
			((IndexingSetContext)_localctx).indexingItem = indexingItem();
			((IndexingSetContext)_localctx).indexes.add(((IndexingSetContext)_localctx).indexingItem);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				((IndexingSetContext)_localctx).indexingItem = indexingItem();
				((IndexingSetContext)_localctx).indexes.add(((IndexingSetContext)_localctx).indexingItem);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(RPAREN);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(403);
				((IndexingSetContext)_localctx).unique = match(UNIQUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByContext extends ParserRuleContext {
		public OrdersByExpressionContext ordersByExpression;
		public List<OrdersByExpressionContext> orders = new ArrayList<OrdersByExpressionContext>();
		public TerminalNode ORDER_BY() { return getToken(SDBLParser.ORDER_BY, 0); }
		public List<OrdersByExpressionContext> ordersByExpression() {
			return getRuleContexts(OrdersByExpressionContext.class);
		}
		public OrdersByExpressionContext ordersByExpression(int i) {
			return getRuleContext(OrdersByExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_orderBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ORDER_BY);
			setState(407);
			((OrderByContext)_localctx).ordersByExpression = ordersByExpression();
			((OrderByContext)_localctx).orders.add(((OrderByContext)_localctx).ordersByExpression);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(408);
				match(COMMA);
				setState(409);
				((OrderByContext)_localctx).ordersByExpression = ordersByExpression();
				((OrderByContext)_localctx).orders.add(((OrderByContext)_localctx).ordersByExpression);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrdersByExpressionContext extends ParserRuleContext {
		public Token direction;
		public Token hierarchy;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SDBLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SDBLParser.DESC, 0); }
		public TerminalNode HIERARCHY() { return getToken(SDBLParser.HIERARCHY, 0); }
		public OrdersByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordersByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterOrdersByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitOrdersByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitOrdersByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdersByExpressionContext ordersByExpression() throws RecognitionException {
		OrdersByExpressionContext _localctx = new OrdersByExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ordersByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			expression(0);
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
				{
				setState(416);
				((OrdersByExpressionContext)_localctx).direction = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrdersByExpressionContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case HIERARCHY:
				{
				{
				setState(417);
				((OrdersByExpressionContext)_localctx).hierarchy = match(HIERARCHY);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESC) {
					{
					setState(418);
					((OrdersByExpressionContext)_localctx).direction = match(DESC);
					}
				}

				}
				}
				break;
			case EOF:
			case RPAREN:
			case SEMICOLON:
			case COMMA:
			case AUTOORDER:
			case TOTALS:
			case ORDER_BY:
			case UNION_ALL:
			case UNION:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TotalByContext extends ParserRuleContext {
		public TotalsGroupContext totalsGroup;
		public List<TotalsGroupContext> totalsGroups = new ArrayList<TotalsGroupContext>();
		public TerminalNode TOTALS() { return getToken(SDBLParser.TOTALS, 0); }
		public TerminalNode BY() { return getToken(SDBLParser.BY, 0); }
		public List<TotalsGroupContext> totalsGroup() {
			return getRuleContexts(TotalsGroupContext.class);
		}
		public TotalsGroupContext totalsGroup(int i) {
			return getRuleContext(TotalsGroupContext.class,i);
		}
		public SelectedFieldsContext selectedFields() {
			return getRuleContext(SelectedFieldsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public TotalByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterTotalBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitTotalBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitTotalBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalByContext totalBy() throws RecognitionException {
		TotalByContext _localctx = new TotalByContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_totalBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(TOTALS);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -75940887107402224L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -8388609L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 19140073014429695L) != 0)) {
				{
				setState(424);
				selectedFields();
				}
			}

			setState(427);
			match(BY);
			setState(428);
			((TotalByContext)_localctx).totalsGroup = totalsGroup();
			((TotalByContext)_localctx).totalsGroups.add(((TotalByContext)_localctx).totalsGroup);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(429);
				match(COMMA);
				setState(430);
				((TotalByContext)_localctx).totalsGroup = totalsGroup();
				((TotalByContext)_localctx).totalsGroups.add(((TotalByContext)_localctx).totalsGroup);
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TotalsGroupContext extends ParserRuleContext {
		public Token hierarchyType;
		public TerminalNode OVERALL() { return getToken(SDBLParser.OVERALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PeriodicContext periodic() {
			return getRuleContext(PeriodicContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode ONLY_HIERARCHY() { return getToken(SDBLParser.ONLY_HIERARCHY, 0); }
		public TerminalNode HIERARCHY() { return getToken(SDBLParser.HIERARCHY, 0); }
		public TotalsGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalsGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterTotalsGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitTotalsGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitTotalsGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalsGroupContext totalsGroup() throws RecognitionException {
		TotalsGroupContext _localctx = new TotalsGroupContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_totalsGroup);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(OVERALL);
				}
				break;
			case LPAREN:
			case PLUS:
			case MINUS:
			case AMPERSAND:
			case CASE:
			case CAST:
			case DROP:
			case END:
			case FALSE:
			case ISNULL:
			case NULL:
			case SELECT:
			case TOTALS:
			case TRUE:
			case UNDEFINED:
			case WHEN:
			case ACOS:
			case ASIN:
			case ATAN:
			case AVG:
			case BEGINOFPERIOD:
			case BOOLEAN:
			case COS:
			case COUNT:
			case DATE:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DAY:
			case DAYOFYEAR:
			case EMPTYTABLE:
			case EMPTYREF:
			case ENDOFPERIOD:
			case EXP:
			case HALFYEAR:
			case HOUR:
			case INT:
			case LEFT:
			case LOG:
			case LOG10:
			case LOWER:
			case MAX:
			case MIN:
			case MINUTE:
			case MONTH:
			case NUMBER:
			case QUARTER:
			case PERIODS:
			case REFS:
			case PRESENTATION:
			case RECORDAUTONUMBER:
			case REFPRESENTATION:
			case POW:
			case RIGHT:
			case ROUND:
			case SECOND:
			case SIN:
			case SQRT:
			case STOREDDATASIZE:
			case STRING:
			case STRINGLENGTH:
			case STRFIND:
			case STRREPLACE:
			case SUBSTRING:
			case SUM:
			case TAN:
			case TENDAYS:
			case TRIMALL:
			case TRIML:
			case TRIMR:
			case TYPE:
			case UPPER:
			case VALUE:
			case VALUETYPE:
			case WEEK:
			case WEEKDAY:
			case YEAR:
			case UUID:
			case ACCOUNTING_REGISTER_TYPE:
			case ACCUMULATION_REGISTER_TYPE:
			case BUSINESS_PROCESS_TYPE:
			case CALCULATION_REGISTER_TYPE:
			case CATALOG_TYPE:
			case CHART_OF_ACCOUNTS_TYPE:
			case CHART_OF_CALCULATION_TYPES_TYPE:
			case CHART_OF_CHARACTERISTIC_TYPES_TYPE:
			case CONSTANT_TYPE:
			case DOCUMENT_TYPE:
			case DOCUMENT_JOURNAL_TYPE:
			case ENUM_TYPE:
			case EXCHANGE_PLAN_TYPE:
			case EXTERNAL_DATA_SOURCE_TYPE:
			case FILTER_CRITERION_TYPE:
			case INFORMATION_REGISTER_TYPE:
			case SEQUENCE_TYPE:
			case TASK_TYPE:
			case ROUTEPOINT_FIELD:
			case JOIN:
			case UNION:
			case GROUPEDBY:
			case DECIMAL:
			case FLOAT:
			case IDENTIFIER:
			case ACTUAL_ACTION_PERIOD_VT:
			case BALANCE_VT:
			case BALANCE_AND_TURNOVERS_VT:
			case BOUNDARIES_VT:
			case DR_CR_TURNOVERS_VT:
			case EXT_DIMENSIONS_VT:
			case RECORDS_WITH_EXT_DIMENSIONS_VT:
			case SCHEDULE_DATA_VT:
			case SLICEFIRST_VT:
			case SLICELAST_VT:
			case TASK_BY_PERFORMER_VT:
			case TURNOVERS_VT:
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(437);
				expression(0);
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(438);
					((TotalsGroupContext)_localctx).hierarchyType = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ONLY_HIERARCHY || _la==HIERARCHY) ) {
						((TotalsGroupContext)_localctx).hierarchyType = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(439);
					periodic();
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -139044197482102784L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -8388609L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 1125659472562175L) != 0)) {
					{
					setState(442);
					alias();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PeriodicContext extends ParserRuleContext {
		public Token periodType;
		public ExpressionContext first;
		public ExpressionContext second;
		public TerminalNode PERIODS() { return getToken(SDBLParser.PERIODS, 0); }
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public TerminalNode SECOND() { return getToken(SDBLParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SDBLParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(SDBLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SDBLParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(SDBLParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(SDBLParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(SDBLParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(SDBLParser.YEAR, 0); }
		public TerminalNode TENDAYS() { return getToken(SDBLParser.TENDAYS, 0); }
		public TerminalNode HALFYEAR() { return getToken(SDBLParser.HALFYEAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PeriodicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterPeriodic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitPeriodic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitPeriodic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodicContext periodic() throws RecognitionException {
		PeriodicContext _localctx = new PeriodicContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_periodic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(PERIODS);
			setState(448);
			match(LPAREN);
			setState(449);
			((PeriodicContext)_localctx).periodType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 704237466648769L) != 0)) ) {
				((PeriodicContext)_localctx).periodType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(450);
				match(COMMA);
				setState(451);
				((PeriodicContext)_localctx).first = expression(0);
				}
				break;
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(454);
				match(COMMA);
				setState(455);
				((PeriodicContext)_localctx).second = expression(0);
				}
			}

			setState(458);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public IdentifierContext mdoName;
		public IdentifierContext identifier;
		public List<IdentifierContext> columnNames = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SDBLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SDBLParser.DOT, i);
		}
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column);
		try {
			int _alt;
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((ColumnContext)_localctx).mdoName = identifier();
				setState(463); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(461);
						match(DOT);
						setState(462);
						((ColumnContext)_localctx).identifier = identifier();
						((ColumnContext)_localctx).columnNames.add(((ColumnContext)_localctx).identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(465); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				((ColumnContext)_localctx).identifier = identifier();
				((ColumnContext)_localctx).columnNames.add(((ColumnContext)_localctx).identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				mdo();
				setState(471); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(469);
						match(DOT);
						setState(470);
						((ColumnContext)_localctx).identifier = identifier();
						((ColumnContext)_localctx).columnNames.add(((ColumnContext)_localctx).identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(473); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token binaryOperation;
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public BracketExpressionContext bracketExpression() {
			return getRuleContext(BracketExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SDBLParser.MUL, 0); }
		public TerminalNode QUOTIENT() { return getToken(SDBLParser.QUOTIENT, 0); }
		public TerminalNode PLUS() { return getToken(SDBLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SDBLParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(478);
				primitiveExpression();
				}
				break;
			case 2:
				{
				setState(479);
				functionCall();
				}
				break;
			case 3:
				{
				setState(480);
				caseExpression();
				}
				break;
			case 4:
				{
				setState(481);
				column();
				}
				break;
			case 5:
				{
				setState(482);
				bracketExpression();
				}
				break;
			case 6:
				{
				setState(483);
				unaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(486);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(487);
					((ExpressionContext)_localctx).binaryOperation = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 198144L) != 0)) ) {
						((ExpressionContext)_localctx).binaryOperation = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(488);
					expression(2);
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveExpressionContext extends ParserRuleContext {
		public Token booleanValue;
		public DatePartContext year;
		public DatePartContext month;
		public DatePartContext day;
		public DatePartContext hour;
		public DatePartContext minute;
		public DatePartContext second;
		public TerminalNode NULL() { return getToken(SDBLParser.NULL, 0); }
		public TerminalNode UNDEFINED() { return getToken(SDBLParser.UNDEFINED, 0); }
		public MultiStringContext multiString() {
			return getRuleContext(MultiStringContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(SDBLParser.DECIMAL, 0); }
		public TerminalNode FLOAT() { return getToken(SDBLParser.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(SDBLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SDBLParser.FALSE, 0); }
		public TerminalNode DATETIME() { return getToken(SDBLParser.DATETIME, 0); }
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public List<DatePartContext> datePart() {
			return getRuleContexts(DatePartContext.class);
		}
		public DatePartContext datePart(int i) {
			return getRuleContext(DatePartContext.class,i);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(SDBLParser.TYPE, 0); }
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SDBLParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SDBLParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(SDBLParser.DATE, 0); }
		public TerminalNode NUMBER() { return getToken(SDBLParser.NUMBER, 0); }
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterPrimitiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitPrimitiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitPrimitiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primitiveExpression);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(NULL);
				}
				break;
			case UNDEFINED:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(UNDEFINED);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				multiString();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				match(DECIMAL);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				match(FLOAT);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(499);
				((PrimitiveExpressionContext)_localctx).booleanValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
					((PrimitiveExpressionContext)_localctx).booleanValue = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(500);
				match(DATETIME);
				setState(501);
				match(LPAREN);
				setState(502);
				((PrimitiveExpressionContext)_localctx).year = datePart();
				setState(503);
				match(COMMA);
				setState(504);
				((PrimitiveExpressionContext)_localctx).month = datePart();
				setState(505);
				match(COMMA);
				setState(506);
				((PrimitiveExpressionContext)_localctx).day = datePart();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(507);
					match(COMMA);
					setState(508);
					((PrimitiveExpressionContext)_localctx).hour = datePart();
					setState(509);
					match(COMMA);
					setState(510);
					((PrimitiveExpressionContext)_localctx).minute = datePart();
					setState(511);
					match(COMMA);
					setState(512);
					((PrimitiveExpressionContext)_localctx).second = datePart();
					}
				}

				setState(516);
				match(RPAREN);
				}
				}
				break;
			case AMPERSAND:
				enterOuterAlt(_localctx, 8);
				{
				setState(518);
				parameter();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(519);
				match(TYPE);
				setState(520);
				match(LPAREN);
				setState(526);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCOUNTING_REGISTER_TYPE:
				case ACCUMULATION_REGISTER_TYPE:
				case BUSINESS_PROCESS_TYPE:
				case CALCULATION_REGISTER_TYPE:
				case CATALOG_TYPE:
				case CHART_OF_ACCOUNTS_TYPE:
				case CHART_OF_CALCULATION_TYPES_TYPE:
				case CHART_OF_CHARACTERISTIC_TYPES_TYPE:
				case CONSTANT_TYPE:
				case DOCUMENT_TYPE:
				case DOCUMENT_JOURNAL_TYPE:
				case ENUM_TYPE:
				case EXCHANGE_PLAN_TYPE:
				case EXTERNAL_DATA_SOURCE_TYPE:
				case FILTER_CRITERION_TYPE:
				case INFORMATION_REGISTER_TYPE:
				case SEQUENCE_TYPE:
				case TASK_TYPE:
					{
					setState(521);
					mdo();
					}
					break;
				case STRING:
					{
					setState(522);
					match(STRING);
					}
					break;
				case BOOLEAN:
					{
					setState(523);
					match(BOOLEAN);
					}
					break;
				case DATE:
					{
					setState(524);
					match(DATE);
					}
					break;
				case NUMBER:
					{
					setState(525);
					match(NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(528);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends ParserRuleContext {
		public ExpressionContext caseExp;
		public LogicalExpressionContext elseExp;
		public TerminalNode CASE() { return getToken(SDBLParser.CASE, 0); }
		public TerminalNode END() { return getToken(SDBLParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SDBLParser.ELSE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseExpression);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(531);
				match(CASE);
				setState(532);
				((CaseExpressionContext)_localctx).caseExp = expression(0);
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(533);
					caseBranch();
					}
					}
					setState(536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(538);
					match(ELSE);
					setState(539);
					((CaseExpressionContext)_localctx).elseExp = logicalExpression();
					}
				}

				setState(542);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(544);
				match(CASE);
				setState(546); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(545);
					caseBranch();
					}
					}
					setState(548); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(550);
					match(ELSE);
					setState(551);
					((CaseExpressionContext)_localctx).elseExp = logicalExpression();
					}
				}

				setState(554);
				match(END);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(556);
				caseBranch();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(557);
					match(ELSE);
					setState(558);
					((CaseExpressionContext)_localctx).elseExp = logicalExpression();
					}
				}

				setState(561);
				match(END);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBranchContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SDBLParser.WHEN, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SDBLParser.THEN, 0); }
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterCaseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitCaseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitCaseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(WHEN);
			setState(566);
			logicalExpression();
			setState(567);
			match(THEN);
			setState(568);
			logicalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public BracketExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketExpressionContext bracketExpression() throws RecognitionException {
		BracketExpressionContext _localctx = new BracketExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bracketExpression);
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(570);
				match(LPAREN);
				setState(571);
				expression(0);
				setState(572);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(574);
				match(LPAREN);
				setState(575);
				subquery();
				setState(576);
				match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			sign();
			setState(581);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> columnNames = new ArrayList<IdentifierContext>();
		public AggregateFunctionsContext aggregateFunctions() {
			return getRuleContext(AggregateFunctionsContext.class,0);
		}
		public BuiltInFunctionsContext builtInFunctions() {
			return getRuleContext(BuiltInFunctionsContext.class,0);
		}
		public ValueFunctionContext valueFunction() {
			return getRuleContext(ValueFunctionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SDBLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SDBLParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionCall);
		try {
			int _alt;
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				aggregateFunctions();
				}
				break;
			case ISNULL:
			case ACOS:
			case ASIN:
			case ATAN:
			case BEGINOFPERIOD:
			case COS:
			case DATEADD:
			case DATEDIFF:
			case DAY:
			case DAYOFYEAR:
			case ENDOFPERIOD:
			case EXP:
			case HOUR:
			case INT:
			case LEFT:
			case LOG:
			case LOG10:
			case LOWER:
			case MINUTE:
			case MONTH:
			case QUARTER:
			case PRESENTATION:
			case REFPRESENTATION:
			case POW:
			case RIGHT:
			case ROUND:
			case SECOND:
			case SIN:
			case SQRT:
			case STOREDDATASIZE:
			case STRING:
			case STRINGLENGTH:
			case STRFIND:
			case STRREPLACE:
			case SUBSTRING:
			case TAN:
			case TRIMALL:
			case TRIML:
			case TRIMR:
			case UPPER:
			case VALUETYPE:
			case WEEK:
			case WEEKDAY:
			case YEAR:
			case UUID:
			case GROUPEDBY:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				builtInFunctions();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(585);
				valueFunction();
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(586);
						match(DOT);
						setState(587);
						((FunctionCallContext)_localctx).identifier = identifier();
						((FunctionCallContext)_localctx).columnNames.add(((FunctionCallContext)_localctx).identifier);
						}
						} 
					}
					setState(592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(593);
				castFunction();
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(594);
						match(DOT);
						setState(595);
						((FunctionCallContext)_localctx).identifier = identifier();
						((FunctionCallContext)_localctx).columnNames.add(((FunctionCallContext)_localctx).identifier);
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInFunctionsContext extends ParserRuleContext {
		public Token doCall;
		public ExpressionContext string;
		public ExpressionContext charNo;
		public ExpressionContext count;
		public ExpressionContext date;
		public Token periodType;
		public ExpressionContext firstdate;
		public ExpressionContext seconddate;
		public ExpressionContext value;
		public LogicalExpressionContext first;
		public LogicalExpressionContext second;
		public ExpressionContext decimal;
		public ExpressionContext stringLength;
		public ExpressionContext precise;
		public ExpressionContext substring1;
		public ExpressionContext substring2;
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public TerminalNode SUBSTRING() { return getToken(SDBLParser.SUBSTRING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode YEAR() { return getToken(SDBLParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(SDBLParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(SDBLParser.MONTH, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SDBLParser.DAYOFYEAR, 0); }
		public TerminalNode DAY() { return getToken(SDBLParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(SDBLParser.WEEK, 0); }
		public TerminalNode WEEKDAY() { return getToken(SDBLParser.WEEKDAY, 0); }
		public TerminalNode HOUR() { return getToken(SDBLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SDBLParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SDBLParser.SECOND, 0); }
		public TerminalNode BEGINOFPERIOD() { return getToken(SDBLParser.BEGINOFPERIOD, 0); }
		public TerminalNode ENDOFPERIOD() { return getToken(SDBLParser.ENDOFPERIOD, 0); }
		public TerminalNode TENDAYS() { return getToken(SDBLParser.TENDAYS, 0); }
		public TerminalNode HALFYEAR() { return getToken(SDBLParser.HALFYEAR, 0); }
		public TerminalNode DATEADD() { return getToken(SDBLParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SDBLParser.DATEDIFF, 0); }
		public TerminalNode VALUETYPE() { return getToken(SDBLParser.VALUETYPE, 0); }
		public TerminalNode PRESENTATION() { return getToken(SDBLParser.PRESENTATION, 0); }
		public TerminalNode REFPRESENTATION() { return getToken(SDBLParser.REFPRESENTATION, 0); }
		public TerminalNode GROUPEDBY() { return getToken(SDBLParser.GROUPEDBY, 0); }
		public TerminalNode STRING() { return getToken(SDBLParser.STRING, 0); }
		public TerminalNode ISNULL() { return getToken(SDBLParser.ISNULL, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode ACOS() { return getToken(SDBLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(SDBLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(SDBLParser.ATAN, 0); }
		public TerminalNode COS() { return getToken(SDBLParser.COS, 0); }
		public TerminalNode SIN() { return getToken(SDBLParser.SIN, 0); }
		public TerminalNode TAN() { return getToken(SDBLParser.TAN, 0); }
		public TerminalNode LOG() { return getToken(SDBLParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(SDBLParser.LOG10, 0); }
		public TerminalNode EXP() { return getToken(SDBLParser.EXP, 0); }
		public TerminalNode POW() { return getToken(SDBLParser.POW, 0); }
		public TerminalNode SQRT() { return getToken(SDBLParser.SQRT, 0); }
		public TerminalNode INT() { return getToken(SDBLParser.INT, 0); }
		public TerminalNode LOWER() { return getToken(SDBLParser.LOWER, 0); }
		public TerminalNode STRINGLENGTH() { return getToken(SDBLParser.STRINGLENGTH, 0); }
		public TerminalNode TRIMALL() { return getToken(SDBLParser.TRIMALL, 0); }
		public TerminalNode TRIML() { return getToken(SDBLParser.TRIML, 0); }
		public TerminalNode TRIMR() { return getToken(SDBLParser.TRIMR, 0); }
		public TerminalNode UPPER() { return getToken(SDBLParser.UPPER, 0); }
		public TerminalNode LEFT() { return getToken(SDBLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SDBLParser.RIGHT, 0); }
		public TerminalNode ROUND() { return getToken(SDBLParser.ROUND, 0); }
		public TerminalNode STOREDDATASIZE() { return getToken(SDBLParser.STOREDDATASIZE, 0); }
		public TerminalNode UUID() { return getToken(SDBLParser.UUID, 0); }
		public TerminalNode STRFIND() { return getToken(SDBLParser.STRFIND, 0); }
		public TerminalNode STRREPLACE() { return getToken(SDBLParser.STRREPLACE, 0); }
		public BuiltInFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterBuiltInFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitBuiltInFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitBuiltInFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInFunctionsContext builtInFunctions() throws RecognitionException {
		BuiltInFunctionsContext _localctx = new BuiltInFunctionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_builtInFunctions);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBSTRING:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(603);
				((BuiltInFunctionsContext)_localctx).doCall = match(SUBSTRING);
				setState(604);
				match(LPAREN);
				setState(605);
				((BuiltInFunctionsContext)_localctx).string = expression(0);
				setState(606);
				match(COMMA);
				setState(607);
				((BuiltInFunctionsContext)_localctx).charNo = expression(0);
				setState(608);
				match(COMMA);
				setState(609);
				((BuiltInFunctionsContext)_localctx).count = expression(0);
				setState(610);
				match(RPAREN);
				}
				}
				break;
			case DAY:
			case DAYOFYEAR:
			case HOUR:
			case MINUTE:
			case MONTH:
			case QUARTER:
			case SECOND:
			case WEEK:
			case WEEKDAY:
			case YEAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(612);
				((BuiltInFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 985162687545475L) != 0)) ) {
					((BuiltInFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(613);
				match(LPAREN);
				setState(614);
				((BuiltInFunctionsContext)_localctx).date = expression(0);
				setState(615);
				match(RPAREN);
				}
				}
				break;
			case BEGINOFPERIOD:
			case ENDOFPERIOD:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(617);
				((BuiltInFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BEGINOFPERIOD || _la==ENDOFPERIOD) ) {
					((BuiltInFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(618);
				match(LPAREN);
				setState(619);
				((BuiltInFunctionsContext)_localctx).date = expression(0);
				setState(620);
				match(COMMA);
				setState(621);
				((BuiltInFunctionsContext)_localctx).periodType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 704237198213313L) != 0)) ) {
					((BuiltInFunctionsContext)_localctx).periodType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(622);
				match(RPAREN);
				}
				}
				break;
			case DATEADD:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(624);
				((BuiltInFunctionsContext)_localctx).doCall = match(DATEADD);
				setState(625);
				match(LPAREN);
				setState(626);
				((BuiltInFunctionsContext)_localctx).date = expression(0);
				setState(627);
				match(COMMA);
				setState(628);
				((BuiltInFunctionsContext)_localctx).periodType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 704237466648769L) != 0)) ) {
					((BuiltInFunctionsContext)_localctx).periodType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(629);
				match(COMMA);
				setState(630);
				((BuiltInFunctionsContext)_localctx).count = expression(0);
				setState(631);
				match(RPAREN);
				}
				}
				break;
			case DATEDIFF:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(633);
				((BuiltInFunctionsContext)_localctx).doCall = match(DATEDIFF);
				setState(634);
				match(LPAREN);
				setState(635);
				((BuiltInFunctionsContext)_localctx).firstdate = expression(0);
				setState(636);
				match(COMMA);
				setState(637);
				((BuiltInFunctionsContext)_localctx).seconddate = expression(0);
				setState(638);
				match(COMMA);
				setState(639);
				((BuiltInFunctionsContext)_localctx).periodType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 562950222479489L) != 0)) ) {
					((BuiltInFunctionsContext)_localctx).periodType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(640);
				match(RPAREN);
				}
				}
				break;
			case PRESENTATION:
			case REFPRESENTATION:
			case STRING:
			case VALUETYPE:
			case GROUPEDBY:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(642);
				((BuiltInFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 16778245L) != 0) || _la==GROUPEDBY) ) {
					((BuiltInFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(643);
				match(LPAREN);
				setState(644);
				((BuiltInFunctionsContext)_localctx).value = expression(0);
				setState(645);
				match(RPAREN);
				}
				}
				break;
			case ISNULL:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(647);
				((BuiltInFunctionsContext)_localctx).doCall = match(ISNULL);
				setState(648);
				match(LPAREN);
				setState(649);
				((BuiltInFunctionsContext)_localctx).first = logicalExpression();
				setState(650);
				match(COMMA);
				setState(651);
				((BuiltInFunctionsContext)_localctx).second = logicalExpression();
				setState(652);
				match(RPAREN);
				}
				}
				break;
			case ACOS:
			case ASIN:
			case ATAN:
			case COS:
			case EXP:
			case INT:
			case LOG:
			case LOG10:
			case POW:
			case SIN:
			case SQRT:
			case TAN:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(654);
				((BuiltInFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1132634429325383L) != 0)) ) {
					((BuiltInFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(655);
				match(LPAREN);
				setState(656);
				((BuiltInFunctionsContext)_localctx).decimal = expression(0);
				setState(657);
				match(RPAREN);
				}
				}
				break;
			case LOWER:
			case STRINGLENGTH:
			case TRIMALL:
			case TRIML:
			case TRIMR:
			case UPPER:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(659);
				((BuiltInFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 6176112641L) != 0)) ) {
					((BuiltInFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(660);
				match(LPAREN);
				setState(661);
				((BuiltInFunctionsContext)_localctx).string = expression(0);
				setState(662);
				match(RPAREN);
				}
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(664);
				((BuiltInFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
					((BuiltInFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(665);
				match(LPAREN);
				setState(666);
				((BuiltInFunctionsContext)_localctx).string = expression(0);
				setState(667);
				match(COMMA);
				setState(668);
				((BuiltInFunctionsContext)_localctx).stringLength = expression(0);
				setState(669);
				match(RPAREN);
				}
				}
				break;
			case ROUND:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(671);
				((BuiltInFunctionsContext)_localctx).doCall = match(ROUND);
				setState(672);
				match(LPAREN);
				setState(673);
				((BuiltInFunctionsContext)_localctx).decimal = expression(0);
				setState(674);
				match(COMMA);
				setState(675);
				((BuiltInFunctionsContext)_localctx).precise = expression(0);
				setState(676);
				match(RPAREN);
				}
				}
				break;
			case STOREDDATASIZE:
			case UUID:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(678);
				((BuiltInFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STOREDDATASIZE || _la==UUID) ) {
					((BuiltInFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(679);
				match(LPAREN);
				setState(680);
				((BuiltInFunctionsContext)_localctx).value = expression(0);
				setState(681);
				match(RPAREN);
				}
				}
				break;
			case STRFIND:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(683);
				((BuiltInFunctionsContext)_localctx).doCall = match(STRFIND);
				setState(684);
				match(LPAREN);
				setState(685);
				((BuiltInFunctionsContext)_localctx).string = expression(0);
				setState(686);
				match(COMMA);
				setState(687);
				((BuiltInFunctionsContext)_localctx).substring1 = expression(0);
				setState(688);
				match(RPAREN);
				}
				}
				break;
			case STRREPLACE:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(690);
				((BuiltInFunctionsContext)_localctx).doCall = match(STRREPLACE);
				setState(691);
				match(LPAREN);
				setState(692);
				((BuiltInFunctionsContext)_localctx).string = expression(0);
				setState(693);
				match(COMMA);
				setState(694);
				((BuiltInFunctionsContext)_localctx).substring1 = expression(0);
				setState(695);
				match(COMMA);
				setState(696);
				((BuiltInFunctionsContext)_localctx).substring2 = expression(0);
				setState(697);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateFunctionsContext extends ParserRuleContext {
		public Token doCall;
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public TerminalNode SUM() { return getToken(SDBLParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(SDBLParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(SDBLParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SDBLParser.MAX, 0); }
		public TerminalNode COUNT() { return getToken(SDBLParser.COUNT, 0); }
		public TerminalNode MUL() { return getToken(SDBLParser.MUL, 0); }
		public TerminalNode DISTINCT() { return getToken(SDBLParser.DISTINCT, 0); }
		public AggregateFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterAggregateFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitAggregateFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitAggregateFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionsContext aggregateFunctions() throws RecognitionException {
		AggregateFunctionsContext _localctx = new AggregateFunctionsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_aggregateFunctions);
		int _la;
		try {
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(701);
				((AggregateFunctionsContext)_localctx).doCall = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 70368756760577L) != 0)) ) {
					((AggregateFunctionsContext)_localctx).doCall = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(702);
				match(LPAREN);
				setState(703);
				logicalExpression();
				setState(704);
				match(RPAREN);
				}
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(706);
				((AggregateFunctionsContext)_localctx).doCall = match(COUNT);
				setState(707);
				match(LPAREN);
				setState(713);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
				case PLUS:
				case MINUS:
				case AMPERSAND:
				case CASE:
				case CAST:
				case DISTINCT:
				case DROP:
				case END:
				case FALSE:
				case ISNULL:
				case NOT:
				case NULL:
				case SELECT:
				case TOTALS:
				case TRUE:
				case UNDEFINED:
				case WHEN:
				case ACOS:
				case ASIN:
				case ATAN:
				case AVG:
				case BEGINOFPERIOD:
				case BOOLEAN:
				case COS:
				case COUNT:
				case DATE:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DAY:
				case DAYOFYEAR:
				case EMPTYTABLE:
				case EMPTYREF:
				case ENDOFPERIOD:
				case EXP:
				case HALFYEAR:
				case HOUR:
				case INT:
				case LEFT:
				case LOG:
				case LOG10:
				case LOWER:
				case MAX:
				case MIN:
				case MINUTE:
				case MONTH:
				case NUMBER:
				case QUARTER:
				case PERIODS:
				case REFS:
				case PRESENTATION:
				case RECORDAUTONUMBER:
				case REFPRESENTATION:
				case POW:
				case RIGHT:
				case ROUND:
				case SECOND:
				case SIN:
				case SQRT:
				case STOREDDATASIZE:
				case STRING:
				case STRINGLENGTH:
				case STRFIND:
				case STRREPLACE:
				case SUBSTRING:
				case SUM:
				case TAN:
				case TENDAYS:
				case TRIMALL:
				case TRIML:
				case TRIMR:
				case TYPE:
				case UPPER:
				case VALUE:
				case VALUETYPE:
				case WEEK:
				case WEEKDAY:
				case YEAR:
				case UUID:
				case ACCOUNTING_REGISTER_TYPE:
				case ACCUMULATION_REGISTER_TYPE:
				case BUSINESS_PROCESS_TYPE:
				case CALCULATION_REGISTER_TYPE:
				case CATALOG_TYPE:
				case CHART_OF_ACCOUNTS_TYPE:
				case CHART_OF_CALCULATION_TYPES_TYPE:
				case CHART_OF_CHARACTERISTIC_TYPES_TYPE:
				case CONSTANT_TYPE:
				case DOCUMENT_TYPE:
				case DOCUMENT_JOURNAL_TYPE:
				case ENUM_TYPE:
				case EXCHANGE_PLAN_TYPE:
				case EXTERNAL_DATA_SOURCE_TYPE:
				case FILTER_CRITERION_TYPE:
				case INFORMATION_REGISTER_TYPE:
				case SEQUENCE_TYPE:
				case TASK_TYPE:
				case ROUTEPOINT_FIELD:
				case JOIN:
				case UNION:
				case GROUPEDBY:
				case DECIMAL:
				case FLOAT:
				case IDENTIFIER:
				case ACTUAL_ACTION_PERIOD_VT:
				case BALANCE_VT:
				case BALANCE_AND_TURNOVERS_VT:
				case BOUNDARIES_VT:
				case DR_CR_TURNOVERS_VT:
				case EXT_DIMENSIONS_VT:
				case RECORDS_WITH_EXT_DIMENSIONS_VT:
				case SCHEDULE_DATA_VT:
				case SLICEFIRST_VT:
				case SLICELAST_VT:
				case TASK_BY_PERFORMER_VT:
				case TURNOVERS_VT:
				case STR:
					{
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT) {
						{
						setState(708);
						match(DISTINCT);
						}
					}

					setState(711);
					logicalExpression();
					}
					break;
				case MUL:
					{
					setState(712);
					match(MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(715);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueFunctionContext extends ParserRuleContext {
		public Token doCall;
		public Token type;
		public IdentifierContext mdoName;
		public Token emptyFer;
		public IdentifierContext predefinedName;
		public IdentifierContext routePointName;
		public IdentifierContext systemName;
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public TerminalNode VALUE() { return getToken(SDBLParser.VALUE, 0); }
		public List<TerminalNode> DOT() { return getTokens(SDBLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SDBLParser.DOT, i);
		}
		public TerminalNode ROUTEPOINT_FIELD() { return getToken(SDBLParser.ROUTEPOINT_FIELD, 0); }
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EMPTYREF() { return getToken(SDBLParser.EMPTYREF, 0); }
		public TerminalNode BUSINESS_PROCESS_TYPE() { return getToken(SDBLParser.BUSINESS_PROCESS_TYPE, 0); }
		public TerminalNode CATALOG_TYPE() { return getToken(SDBLParser.CATALOG_TYPE, 0); }
		public TerminalNode DOCUMENT_TYPE() { return getToken(SDBLParser.DOCUMENT_TYPE, 0); }
		public TerminalNode FILTER_CRITERION_TYPE() { return getToken(SDBLParser.FILTER_CRITERION_TYPE, 0); }
		public TerminalNode EXCHANGE_PLAN_TYPE() { return getToken(SDBLParser.EXCHANGE_PLAN_TYPE, 0); }
		public TerminalNode ENUM_TYPE() { return getToken(SDBLParser.ENUM_TYPE, 0); }
		public TerminalNode CHART_OF_CHARACTERISTIC_TYPES_TYPE() { return getToken(SDBLParser.CHART_OF_CHARACTERISTIC_TYPES_TYPE, 0); }
		public TerminalNode CHART_OF_ACCOUNTS_TYPE() { return getToken(SDBLParser.CHART_OF_ACCOUNTS_TYPE, 0); }
		public TerminalNode CHART_OF_CALCULATION_TYPES_TYPE() { return getToken(SDBLParser.CHART_OF_CALCULATION_TYPES_TYPE, 0); }
		public TerminalNode TASK_TYPE() { return getToken(SDBLParser.TASK_TYPE, 0); }
		public TerminalNode EXTERNAL_DATA_SOURCE_TYPE() { return getToken(SDBLParser.EXTERNAL_DATA_SOURCE_TYPE, 0); }
		public ValueFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterValueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitValueFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitValueFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueFunctionContext valueFunction() throws RecognitionException {
		ValueFunctionContext _localctx = new ValueFunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_valueFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			((ValueFunctionContext)_localctx).doCall = match(VALUE);
			setState(719);
			match(LPAREN);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				{
				setState(720);
				((ValueFunctionContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 40637L) != 0)) ) {
					((ValueFunctionContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(721);
				match(DOT);
				setState(722);
				((ValueFunctionContext)_localctx).mdoName = identifier();
				setState(723);
				match(DOT);
				setState(724);
				((ValueFunctionContext)_localctx).emptyFer = match(EMPTYREF);
				}
				}
				break;
			case 2:
				{
				{
				setState(726);
				((ValueFunctionContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 143L) != 0)) ) {
					((ValueFunctionContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(727);
				match(DOT);
				setState(728);
				((ValueFunctionContext)_localctx).mdoName = identifier();
				setState(729);
				match(DOT);
				setState(730);
				((ValueFunctionContext)_localctx).predefinedName = identifier();
				}
				}
				break;
			case 3:
				{
				{
				setState(732);
				((ValueFunctionContext)_localctx).type = match(BUSINESS_PROCESS_TYPE);
				setState(733);
				match(DOT);
				setState(734);
				((ValueFunctionContext)_localctx).mdoName = identifier();
				setState(735);
				match(DOT);
				setState(736);
				match(ROUTEPOINT_FIELD);
				setState(737);
				match(DOT);
				setState(738);
				((ValueFunctionContext)_localctx).routePointName = identifier();
				}
				}
				break;
			case 4:
				{
				{
				setState(740);
				((ValueFunctionContext)_localctx).systemName = identifier();
				setState(741);
				match(DOT);
				setState(742);
				((ValueFunctionContext)_localctx).predefinedName = identifier();
				}
				}
				break;
			case 5:
				{
				{
				setState(744);
				mdo();
				setState(745);
				match(DOT);
				}
				}
				break;
			}
			setState(749);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastFunctionContext extends ParserRuleContext {
		public Token doCall;
		public ExpressionContext value;
		public Token type;
		public Token len;
		public Token prec;
		public List<TerminalNode> LPAREN() { return getTokens(SDBLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SDBLParser.LPAREN, i);
		}
		public TerminalNode AS() { return getToken(SDBLParser.AS, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(SDBLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SDBLParser.RPAREN, i);
		}
		public TerminalNode CAST() { return getToken(SDBLParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(SDBLParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(SDBLParser.DATE, 0); }
		public TerminalNode NUMBER() { return getToken(SDBLParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SDBLParser.STRING, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(SDBLParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(SDBLParser.DECIMAL, i);
		}
		public TerminalNode COMMA() { return getToken(SDBLParser.COMMA, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterCastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitCastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_castFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(751);
			((CastFunctionContext)_localctx).doCall = match(CAST);
			setState(752);
			match(LPAREN);
			setState(753);
			((CastFunctionContext)_localctx).value = expression(0);
			setState(754);
			match(AS);
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				{
				setState(755);
				((CastFunctionContext)_localctx).type = match(BOOLEAN);
				}
				break;
			case NUMBER:
				{
				{
				setState(756);
				((CastFunctionContext)_localctx).type = match(NUMBER);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(757);
					match(LPAREN);
					setState(758);
					((CastFunctionContext)_localctx).len = match(DECIMAL);
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(759);
						match(COMMA);
						setState(760);
						((CastFunctionContext)_localctx).prec = match(DECIMAL);
						}
					}

					setState(763);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case STRING:
				{
				{
				setState(766);
				((CastFunctionContext)_localctx).type = match(STRING);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(767);
					match(LPAREN);
					setState(768);
					((CastFunctionContext)_localctx).len = match(DECIMAL);
					setState(769);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case DATE:
				{
				setState(772);
				((CastFunctionContext)_localctx).type = match(DATE);
				}
				break;
			case ACCOUNTING_REGISTER_TYPE:
			case ACCUMULATION_REGISTER_TYPE:
			case BUSINESS_PROCESS_TYPE:
			case CALCULATION_REGISTER_TYPE:
			case CATALOG_TYPE:
			case CHART_OF_ACCOUNTS_TYPE:
			case CHART_OF_CALCULATION_TYPES_TYPE:
			case CHART_OF_CHARACTERISTIC_TYPES_TYPE:
			case CONSTANT_TYPE:
			case DOCUMENT_TYPE:
			case DOCUMENT_JOURNAL_TYPE:
			case ENUM_TYPE:
			case EXCHANGE_PLAN_TYPE:
			case EXTERNAL_DATA_SOURCE_TYPE:
			case FILTER_CRITERION_TYPE:
			case INFORMATION_REGISTER_TYPE:
			case SEQUENCE_TYPE:
			case TASK_TYPE:
				{
				setState(773);
				mdo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(776);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public PredicateContext predicate;
		public List<PredicateContext> condidions = new ArrayList<PredicateContext>();
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SDBLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SDBLParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(SDBLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SDBLParser.OR, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			((LogicalExpressionContext)_localctx).predicate = predicate();
			((LogicalExpressionContext)_localctx).condidions.add(((LogicalExpressionContext)_localctx).predicate);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(779);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(780);
				((LogicalExpressionContext)_localctx).predicate = predicate();
				((LogicalExpressionContext)_localctx).condidions.add(((LogicalExpressionContext)_localctx).predicate);
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public ExpressionContext booleanPredicate;
		public LikePredicateContext likePredicate() {
			return getRuleContext(LikePredicateContext.class,0);
		}
		public IsNullPredicateContext isNullPredicate() {
			return getRuleContext(IsNullPredicateContext.class,0);
		}
		public ComparePredicateContext comparePredicate() {
			return getRuleContext(ComparePredicateContext.class,0);
		}
		public BetweenPredicateContext betweenPredicate() {
			return getRuleContext(BetweenPredicateContext.class,0);
		}
		public InPredicateContext inPredicate() {
			return getRuleContext(InPredicateContext.class,0);
		}
		public RefsPredicateContext refsPredicate() {
			return getRuleContext(RefsPredicateContext.class,0);
		}
		public List<TerminalNode> NOT() { return getTokens(SDBLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(SDBLParser.NOT, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(786);
				match(NOT);
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(792);
				((PredicateContext)_localctx).booleanPredicate = expression(0);
				}
				break;
			case 2:
				{
				setState(793);
				likePredicate();
				}
				break;
			case 3:
				{
				setState(794);
				isNullPredicate();
				}
				break;
			case 4:
				{
				setState(795);
				comparePredicate();
				}
				break;
			case 5:
				{
				setState(796);
				betweenPredicate();
				}
				break;
			case 6:
				{
				setState(797);
				inPredicate();
				}
				break;
			case 7:
				{
				setState(798);
				refsPredicate();
				}
				break;
			case 8:
				{
				{
				setState(799);
				match(LPAREN);
				setState(800);
				logicalExpression();
				setState(801);
				match(RPAREN);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LikePredicateContext extends ParserRuleContext {
		public MultiStringContext escape;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(SDBLParser.LIKE, 0); }
		public List<TerminalNode> NOT() { return getTokens(SDBLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(SDBLParser.NOT, i);
		}
		public TerminalNode ESCAPE() { return getToken(SDBLParser.ESCAPE, 0); }
		public MultiStringContext multiString() {
			return getRuleContext(MultiStringContext.class,0);
		}
		public LikePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterLikePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitLikePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikePredicateContext likePredicate() throws RecognitionException {
		LikePredicateContext _localctx = new LikePredicateContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_likePredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			expression(0);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(806);
				match(NOT);
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(812);
			match(LIKE);
			setState(813);
			expression(0);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESCAPE) {
				{
				setState(814);
				match(ESCAPE);
				setState(815);
				((LikePredicateContext)_localctx).escape = multiString();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsNullPredicateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(SDBLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SDBLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SDBLParser.NOT, 0); }
		public IsNullPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isNullPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterIsNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitIsNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitIsNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsNullPredicateContext isNullPredicate() throws RecognitionException {
		IsNullPredicateContext _localctx = new IsNullPredicateContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_isNullPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			expression(0);
			setState(819);
			match(IS);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(820);
				match(NOT);
				}
			}

			setState(823);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparePredicateContext extends ParserRuleContext {
		public Token compareOperation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(SDBLParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(SDBLParser.LESS_OR_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(SDBLParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(SDBLParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode ASSIGN() { return getToken(SDBLParser.ASSIGN, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SDBLParser.NOT_EQUAL, 0); }
		public ComparePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterComparePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitComparePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitComparePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparePredicateContext comparePredicate() throws RecognitionException {
		ComparePredicateContext _localctx = new ComparePredicateContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_comparePredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			expression(0);
			setState(826);
			((ComparePredicateContext)_localctx).compareOperation = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63744L) != 0)) ) {
				((ComparePredicateContext)_localctx).compareOperation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(827);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BetweenPredicateContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SDBLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SDBLParser.AND, 0); }
		public BetweenPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betweenPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterBetweenPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitBetweenPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitBetweenPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenPredicateContext betweenPredicate() throws RecognitionException {
		BetweenPredicateContext _localctx = new BetweenPredicateContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_betweenPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			expression(0);
			setState(830);
			match(BETWEEN);
			setState(831);
			expression(0);
			setState(832);
			match(AND);
			setState(833);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InPredicateContext extends ParserRuleContext {
		public Token typeIn;
		public List<TerminalNode> LPAREN() { return getTokens(SDBLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SDBLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SDBLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SDBLParser.RPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SDBLParser.IN, 0); }
		public TerminalNode IN_HIERARCHY() { return getToken(SDBLParser.IN_HIERARCHY, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(SDBLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(SDBLParser.NOT, i);
		}
		public InPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(835);
				expression(0);
				}
				break;
			case 2:
				{
				{
				setState(836);
				match(LPAREN);
				setState(837);
				expressionList();
				setState(838);
				match(RPAREN);
				}
				}
				break;
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(842);
				match(NOT);
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(848);
			((InPredicateContext)_localctx).typeIn = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==IN_HIERARCHY || _la==IN) ) {
				((InPredicateContext)_localctx).typeIn = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(849);
			match(LPAREN);
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(850);
				subquery();
				}
				break;
			case 2:
				{
				setState(851);
				expressionList();
				}
				break;
			}
			setState(854);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RefsPredicateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode REFS() { return getToken(SDBLParser.REFS, 0); }
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public RefsPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refsPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterRefsPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitRefsPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitRefsPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefsPredicateContext refsPredicate() throws RecognitionException {
		RefsPredicateContext _localctx = new RefsPredicateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_refsPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			expression(0);
			setState(857);
			match(REFS);
			setState(858);
			mdo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListItemContext expressionListItem;
		public List<ExpressionListItemContext> exp = new ArrayList<ExpressionListItemContext>();
		public List<ExpressionListItemContext> expressionListItem() {
			return getRuleContexts(ExpressionListItemContext.class);
		}
		public ExpressionListItemContext expressionListItem(int i) {
			return getRuleContext(ExpressionListItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			((ExpressionListContext)_localctx).expressionListItem = expressionListItem();
			((ExpressionListContext)_localctx).exp.add(((ExpressionListContext)_localctx).expressionListItem);
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(861);
				match(COMMA);
				setState(862);
				((ExpressionListContext)_localctx).expressionListItem = expressionListItem();
				((ExpressionListContext)_localctx).exp.add(((ExpressionListContext)_localctx).expressionListItem);
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterExpressionListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitExpressionListItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitExpressionListItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListItemContext expressionListItem() throws RecognitionException {
		ExpressionListItemContext _localctx = new ExpressionListItemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionListItem);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				logicalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataSourcesContext extends ParserRuleContext {
		public DataSourceContext dataSource;
		public List<DataSourceContext> tables = new ArrayList<DataSourceContext>();
		public List<DataSourceContext> dataSource() {
			return getRuleContexts(DataSourceContext.class);
		}
		public DataSourceContext dataSource(int i) {
			return getRuleContext(DataSourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public DataSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterDataSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitDataSources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitDataSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourcesContext dataSources() throws RecognitionException {
		DataSourcesContext _localctx = new DataSourcesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dataSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			((DataSourcesContext)_localctx).dataSource = dataSource();
			((DataSourcesContext)_localctx).tables.add(((DataSourcesContext)_localctx).dataSource);
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(873);
				match(COMMA);
				setState(874);
				((DataSourcesContext)_localctx).dataSource = dataSource();
				((DataSourcesContext)_localctx).tables.add(((DataSourcesContext)_localctx).dataSource);
				}
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataSourceContext extends ParserRuleContext {
		public JoinPartContext joinPart;
		public List<JoinPartContext> joins = new ArrayList<JoinPartContext>();
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public DataSourceContext dataSource() {
			return getRuleContext(DataSourceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public List<JoinPartContext> joinPart() {
			return getRuleContexts(JoinPartContext.class);
		}
		public JoinPartContext joinPart(int i) {
			return getRuleContext(JoinPartContext.class,i);
		}
		public VirtualTableContext virtualTable() {
			return getRuleContext(VirtualTableContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ParameterTableContext parameterTable() {
			return getRuleContext(ParameterTableContext.class,0);
		}
		public ExternalDataSourceTableContext externalDataSourceTable() {
			return getRuleContext(ExternalDataSourceTableContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public DataSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterDataSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitDataSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitDataSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceContext dataSource() throws RecognitionException {
		DataSourceContext _localctx = new DataSourceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dataSource);
		int _la;
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(880);
				match(LPAREN);
				setState(881);
				dataSource();
				setState(882);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(904);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AMPERSAND:
				case DROP:
				case END:
				case ISNULL:
				case SELECT:
				case TOTALS:
				case ACOS:
				case ASIN:
				case ATAN:
				case AVG:
				case BEGINOFPERIOD:
				case BOOLEAN:
				case COS:
				case COUNT:
				case DATE:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DAY:
				case DAYOFYEAR:
				case EMPTYTABLE:
				case EMPTYREF:
				case ENDOFPERIOD:
				case EXP:
				case HALFYEAR:
				case HOUR:
				case INT:
				case LEFT:
				case LOG:
				case LOG10:
				case LOWER:
				case MAX:
				case MIN:
				case MINUTE:
				case MONTH:
				case NUMBER:
				case QUARTER:
				case PERIODS:
				case REFS:
				case PRESENTATION:
				case RECORDAUTONUMBER:
				case REFPRESENTATION:
				case POW:
				case RIGHT:
				case ROUND:
				case SECOND:
				case SIN:
				case SQRT:
				case STOREDDATASIZE:
				case STRING:
				case STRINGLENGTH:
				case STRFIND:
				case STRREPLACE:
				case SUBSTRING:
				case SUM:
				case TAN:
				case TENDAYS:
				case TRIMALL:
				case TRIML:
				case TRIMR:
				case TYPE:
				case UPPER:
				case VALUE:
				case VALUETYPE:
				case WEEK:
				case WEEKDAY:
				case YEAR:
				case UUID:
				case ACCOUNTING_REGISTER_TYPE:
				case ACCUMULATION_REGISTER_TYPE:
				case BUSINESS_PROCESS_TYPE:
				case CALCULATION_REGISTER_TYPE:
				case CATALOG_TYPE:
				case CHART_OF_ACCOUNTS_TYPE:
				case CHART_OF_CALCULATION_TYPES_TYPE:
				case CHART_OF_CHARACTERISTIC_TYPES_TYPE:
				case CONSTANT_TYPE:
				case DOCUMENT_TYPE:
				case DOCUMENT_JOURNAL_TYPE:
				case ENUM_TYPE:
				case EXCHANGE_PLAN_TYPE:
				case EXTERNAL_DATA_SOURCE_TYPE:
				case FILTER_CRITERION_TYPE:
				case INFORMATION_REGISTER_TYPE:
				case SEQUENCE_TYPE:
				case TASK_TYPE:
				case ROUTEPOINT_FIELD:
				case JOIN:
				case UNION:
				case IDENTIFIER:
				case ACTUAL_ACTION_PERIOD_VT:
				case BALANCE_VT:
				case BALANCE_AND_TURNOVERS_VT:
				case BOUNDARIES_VT:
				case DR_CR_TURNOVERS_VT:
				case EXT_DIMENSIONS_VT:
				case RECORDS_WITH_EXT_DIMENSIONS_VT:
				case SCHEDULE_DATA_VT:
				case SLICEFIRST_VT:
				case SLICELAST_VT:
				case TASK_BY_PERFORMER_VT:
				case TURNOVERS_VT:
					{
					{
					setState(888);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(884);
						virtualTable();
						}
						break;
					case 2:
						{
						setState(885);
						table();
						}
						break;
					case 3:
						{
						setState(886);
						parameterTable();
						}
						break;
					case 4:
						{
						setState(887);
						externalDataSourceTable();
						}
						break;
					}
					setState(891);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(890);
						alias();
						}
						break;
					}
					}
					}
					break;
				case LPAREN:
					{
					{
					setState(893);
					match(LPAREN);
					setState(898);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(894);
						virtualTable();
						}
						break;
					case 2:
						{
						setState(895);
						table();
						}
						break;
					case 3:
						{
						setState(896);
						parameterTable();
						}
						break;
					case 4:
						{
						setState(897);
						subquery();
						}
						break;
					}
					setState(900);
					match(RPAREN);
					setState(902);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(901);
						alias();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & 255L) != 0)) {
					{
					{
					setState(906);
					((DataSourceContext)_localctx).joinPart = joinPart();
					((DataSourceContext)_localctx).joins.add(((DataSourceContext)_localctx).joinPart);
					}
					}
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends ParserRuleContext {
		public IdentifierContext objectTableName;
		public IdentifierContext tableName;
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SDBLParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_table);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				mdo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				mdo();
				setState(916);
				match(DOT);
				setState(917);
				((TableContext)_localctx).objectTableName = identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				((TableContext)_localctx).tableName = identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VirtualTableContext extends ParserRuleContext {
		public Token virtualTableName;
		public VirtualTableParameterContext virtualTableParameter;
		public List<VirtualTableParameterContext> virtualTableParameters = new ArrayList<VirtualTableParameterContext>();
		public Token type;
		public IdentifierContext tableName;
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SDBLParser.DOT, 0); }
		public TerminalNode SLICELAST_VT() { return getToken(SDBLParser.SLICELAST_VT, 0); }
		public TerminalNode SLICEFIRST_VT() { return getToken(SDBLParser.SLICEFIRST_VT, 0); }
		public TerminalNode BOUNDARIES_VT() { return getToken(SDBLParser.BOUNDARIES_VT, 0); }
		public TerminalNode TURNOVERS_VT() { return getToken(SDBLParser.TURNOVERS_VT, 0); }
		public TerminalNode BALANCE_VT() { return getToken(SDBLParser.BALANCE_VT, 0); }
		public TerminalNode BALANCE_AND_TURNOVERS_VT() { return getToken(SDBLParser.BALANCE_AND_TURNOVERS_VT, 0); }
		public TerminalNode EXT_DIMENSIONS_VT() { return getToken(SDBLParser.EXT_DIMENSIONS_VT, 0); }
		public TerminalNode RECORDS_WITH_EXT_DIMENSIONS_VT() { return getToken(SDBLParser.RECORDS_WITH_EXT_DIMENSIONS_VT, 0); }
		public TerminalNode DR_CR_TURNOVERS_VT() { return getToken(SDBLParser.DR_CR_TURNOVERS_VT, 0); }
		public TerminalNode ACTUAL_ACTION_PERIOD_VT() { return getToken(SDBLParser.ACTUAL_ACTION_PERIOD_VT, 0); }
		public TerminalNode SCHEDULE_DATA_VT() { return getToken(SDBLParser.SCHEDULE_DATA_VT, 0); }
		public TerminalNode TASK_BY_PERFORMER_VT() { return getToken(SDBLParser.TASK_BY_PERFORMER_VT, 0); }
		public TerminalNode LPAREN() { return getToken(SDBLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SDBLParser.RPAREN, 0); }
		public List<VirtualTableParameterContext> virtualTableParameter() {
			return getRuleContexts(VirtualTableParameterContext.class);
		}
		public VirtualTableParameterContext virtualTableParameter(int i) {
			return getRuleContext(VirtualTableParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SDBLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SDBLParser.COMMA, i);
		}
		public TerminalNode FILTER_CRITERION_TYPE() { return getToken(SDBLParser.FILTER_CRITERION_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public VirtualTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterVirtualTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitVirtualTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitVirtualTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualTableContext virtualTable() throws RecognitionException {
		VirtualTableContext _localctx = new VirtualTableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_virtualTable);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(922);
				mdo();
				setState(923);
				match(DOT);
				setState(924);
				((VirtualTableContext)_localctx).virtualTableName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 4095L) != 0)) ) {
					((VirtualTableContext)_localctx).virtualTableName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(925);
					match(LPAREN);
					setState(926);
					((VirtualTableContext)_localctx).virtualTableParameter = virtualTableParameter();
					((VirtualTableContext)_localctx).virtualTableParameters.add(((VirtualTableContext)_localctx).virtualTableParameter);
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(927);
						match(COMMA);
						setState(928);
						((VirtualTableContext)_localctx).virtualTableParameter = virtualTableParameter();
						((VirtualTableContext)_localctx).virtualTableParameters.add(((VirtualTableContext)_localctx).virtualTableParameter);
						}
						}
						setState(933);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(934);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(938);
				((VirtualTableContext)_localctx).type = match(FILTER_CRITERION_TYPE);
				setState(939);
				match(DOT);
				setState(940);
				((VirtualTableContext)_localctx).tableName = identifier();
				setState(941);
				match(LPAREN);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AMPERSAND) {
					{
					setState(942);
					parameter();
					}
				}

				setState(945);
				match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VirtualTableParameterContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public VirtualTableParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualTableParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterVirtualTableParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitVirtualTableParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitVirtualTableParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualTableParameterContext virtualTableParameter() throws RecognitionException {
		VirtualTableParameterContext _localctx = new VirtualTableParameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_virtualTableParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -75940887107467760L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -8388609L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 19140073014429695L) != 0)) {
				{
				setState(949);
				logicalExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterTableContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterParameterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitParameterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitParameterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTableContext parameterTable() throws RecognitionException {
		ParameterTableContext _localctx = new ParameterTableContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDataSourceTableContext extends ParserRuleContext {
		public IdentifierContext tableName;
		public IdentifierContext cubeName;
		public MdoContext mdo() {
			return getRuleContext(MdoContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SDBLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SDBLParser.DOT, i);
		}
		public TerminalNode EDS_TABLE() { return getToken(SDBLParser.EDS_TABLE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EDS_CUBE() { return getToken(SDBLParser.EDS_CUBE, 0); }
		public TerminalNode EDS_CUBE_DIMTABLE() { return getToken(SDBLParser.EDS_CUBE_DIMTABLE, 0); }
		public ExternalDataSourceTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDataSourceTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterExternalDataSourceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitExternalDataSourceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitExternalDataSourceTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDataSourceTableContext externalDataSourceTable() throws RecognitionException {
		ExternalDataSourceTableContext _localctx = new ExternalDataSourceTableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_externalDataSourceTable);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				mdo();
				setState(955);
				match(DOT);
				setState(956);
				match(EDS_TABLE);
				setState(957);
				match(DOT);
				setState(958);
				((ExternalDataSourceTableContext)_localctx).tableName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				mdo();
				setState(961);
				match(DOT);
				setState(962);
				match(EDS_CUBE);
				setState(963);
				match(DOT);
				setState(964);
				((ExternalDataSourceTableContext)_localctx).cubeName = identifier();
				setState(965);
				match(DOT);
				setState(966);
				match(EDS_CUBE_DIMTABLE);
				setState(967);
				match(DOT);
				setState(968);
				((ExternalDataSourceTableContext)_localctx).tableName = identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinPartContext extends ParserRuleContext {
		public DataSourceContext source;
		public LogicalExpressionContext condition;
		public TerminalNode BY() { return getToken(SDBLParser.BY, 0); }
		public DataSourceContext dataSource() {
			return getRuleContext(DataSourceContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public RightJoinContext rightJoin() {
			return getRuleContext(RightJoinContext.class,0);
		}
		public LeftJoinContext leftJoin() {
			return getRuleContext(LeftJoinContext.class,0);
		}
		public FullJoinContext fullJoin() {
			return getRuleContext(FullJoinContext.class,0);
		}
		public InnerJoinContext innerJoin() {
			return getRuleContext(InnerJoinContext.class,0);
		}
		public JoinPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterJoinPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitJoinPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitJoinPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinPartContext joinPart() throws RecognitionException {
		JoinPartContext _localctx = new JoinPartContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_joinPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT_OUTER_JOIN:
			case RIGHT_JOIN:
				{
				setState(972);
				rightJoin();
				}
				break;
			case LEFT_OUTER_JOIN:
			case LEFT_JOIN:
				{
				setState(973);
				leftJoin();
				}
				break;
			case FULL_OUTER_JOIN:
			case FULL_JOIN:
				{
				setState(974);
				fullJoin();
				}
				break;
			case INNER_JOIN:
			case JOIN:
				{
				setState(975);
				innerJoin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(978);
			((JoinPartContext)_localctx).source = dataSource();
			setState(979);
			match(BY);
			setState(980);
			((JoinPartContext)_localctx).condition = logicalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RightJoinContext extends ParserRuleContext {
		public Token keyword;
		public TerminalNode RIGHT_OUTER_JOIN() { return getToken(SDBLParser.RIGHT_OUTER_JOIN, 0); }
		public TerminalNode RIGHT_JOIN() { return getToken(SDBLParser.RIGHT_JOIN, 0); }
		public RightJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterRightJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitRightJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitRightJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightJoinContext rightJoin() throws RecognitionException {
		RightJoinContext _localctx = new RightJoinContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_rightJoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			((RightJoinContext)_localctx).keyword = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==RIGHT_OUTER_JOIN || _la==RIGHT_JOIN) ) {
				((RightJoinContext)_localctx).keyword = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeftJoinContext extends ParserRuleContext {
		public Token keyword;
		public TerminalNode LEFT_OUTER_JOIN() { return getToken(SDBLParser.LEFT_OUTER_JOIN, 0); }
		public TerminalNode LEFT_JOIN() { return getToken(SDBLParser.LEFT_JOIN, 0); }
		public LeftJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterLeftJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitLeftJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitLeftJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftJoinContext leftJoin() throws RecognitionException {
		LeftJoinContext _localctx = new LeftJoinContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_leftJoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			((LeftJoinContext)_localctx).keyword = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==LEFT_OUTER_JOIN || _la==LEFT_JOIN) ) {
				((LeftJoinContext)_localctx).keyword = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullJoinContext extends ParserRuleContext {
		public Token keyword;
		public TerminalNode FULL_OUTER_JOIN() { return getToken(SDBLParser.FULL_OUTER_JOIN, 0); }
		public TerminalNode FULL_JOIN() { return getToken(SDBLParser.FULL_JOIN, 0); }
		public FullJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterFullJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitFullJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitFullJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullJoinContext fullJoin() throws RecognitionException {
		FullJoinContext _localctx = new FullJoinContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fullJoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			((FullJoinContext)_localctx).keyword = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==FULL_OUTER_JOIN || _la==FULL_JOIN) ) {
				((FullJoinContext)_localctx).keyword = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerJoinContext extends ParserRuleContext {
		public Token keyword;
		public TerminalNode INNER_JOIN() { return getToken(SDBLParser.INNER_JOIN, 0); }
		public TerminalNode JOIN() { return getToken(SDBLParser.JOIN, 0); }
		public InnerJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerJoinContext innerJoin() throws RecognitionException {
		InnerJoinContext _localctx = new InnerJoinContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_innerJoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			((InnerJoinContext)_localctx).keyword = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INNER_JOIN || _la==JOIN) ) {
				((InnerJoinContext)_localctx).keyword = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SDBLParser.AS, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(990);
				match(AS);
				}
			}

			setState(993);
			((AliasContext)_localctx).name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatePartContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(SDBLParser.DECIMAL, 0); }
		public DatePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterDatePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitDatePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitDatePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatePartContext datePart() throws RecognitionException {
		DatePartContext _localctx = new DatePartContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_datePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPERSAND:
				{
				setState(995);
				parameter();
				}
				break;
			case DECIMAL:
				{
				setState(996);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiStringContext extends ParserRuleContext {
		public List<TerminalNode> STR() { return getTokens(SDBLParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(SDBLParser.STR, i);
		}
		public MultiStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterMultiString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitMultiString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitMultiString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiStringContext multiString() throws RecognitionException {
		MultiStringContext _localctx = new MultiStringContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_multiString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1000); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(999);
					match(STR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1002); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SDBLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SDBLParser.PLUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SDBLParser.IDENTIFIER, 0); }
		public TerminalNode ACTUAL_ACTION_PERIOD_VT() { return getToken(SDBLParser.ACTUAL_ACTION_PERIOD_VT, 0); }
		public TerminalNode BALANCE_VT() { return getToken(SDBLParser.BALANCE_VT, 0); }
		public TerminalNode BALANCE_AND_TURNOVERS_VT() { return getToken(SDBLParser.BALANCE_AND_TURNOVERS_VT, 0); }
		public TerminalNode BOUNDARIES_VT() { return getToken(SDBLParser.BOUNDARIES_VT, 0); }
		public TerminalNode DR_CR_TURNOVERS_VT() { return getToken(SDBLParser.DR_CR_TURNOVERS_VT, 0); }
		public TerminalNode EXT_DIMENSIONS_VT() { return getToken(SDBLParser.EXT_DIMENSIONS_VT, 0); }
		public TerminalNode RECORDS_WITH_EXT_DIMENSIONS_VT() { return getToken(SDBLParser.RECORDS_WITH_EXT_DIMENSIONS_VT, 0); }
		public TerminalNode SCHEDULE_DATA_VT() { return getToken(SDBLParser.SCHEDULE_DATA_VT, 0); }
		public TerminalNode SLICEFIRST_VT() { return getToken(SDBLParser.SLICEFIRST_VT, 0); }
		public TerminalNode SLICELAST_VT() { return getToken(SDBLParser.SLICELAST_VT, 0); }
		public TerminalNode TASK_BY_PERFORMER_VT() { return getToken(SDBLParser.TASK_BY_PERFORMER_VT, 0); }
		public TerminalNode TURNOVERS_VT() { return getToken(SDBLParser.TURNOVERS_VT, 0); }
		public TerminalNode ROUTEPOINT_FIELD() { return getToken(SDBLParser.ROUTEPOINT_FIELD, 0); }
		public TerminalNode BUSINESS_PROCESS_TYPE() { return getToken(SDBLParser.BUSINESS_PROCESS_TYPE, 0); }
		public TerminalNode CATALOG_TYPE() { return getToken(SDBLParser.CATALOG_TYPE, 0); }
		public TerminalNode DOCUMENT_TYPE() { return getToken(SDBLParser.DOCUMENT_TYPE, 0); }
		public TerminalNode INFORMATION_REGISTER_TYPE() { return getToken(SDBLParser.INFORMATION_REGISTER_TYPE, 0); }
		public TerminalNode CONSTANT_TYPE() { return getToken(SDBLParser.CONSTANT_TYPE, 0); }
		public TerminalNode FILTER_CRITERION_TYPE() { return getToken(SDBLParser.FILTER_CRITERION_TYPE, 0); }
		public TerminalNode EXCHANGE_PLAN_TYPE() { return getToken(SDBLParser.EXCHANGE_PLAN_TYPE, 0); }
		public TerminalNode SEQUENCE_TYPE() { return getToken(SDBLParser.SEQUENCE_TYPE, 0); }
		public TerminalNode DOCUMENT_JOURNAL_TYPE() { return getToken(SDBLParser.DOCUMENT_JOURNAL_TYPE, 0); }
		public TerminalNode ENUM_TYPE() { return getToken(SDBLParser.ENUM_TYPE, 0); }
		public TerminalNode CHART_OF_CHARACTERISTIC_TYPES_TYPE() { return getToken(SDBLParser.CHART_OF_CHARACTERISTIC_TYPES_TYPE, 0); }
		public TerminalNode CHART_OF_ACCOUNTS_TYPE() { return getToken(SDBLParser.CHART_OF_ACCOUNTS_TYPE, 0); }
		public TerminalNode CHART_OF_CALCULATION_TYPES_TYPE() { return getToken(SDBLParser.CHART_OF_CALCULATION_TYPES_TYPE, 0); }
		public TerminalNode ACCUMULATION_REGISTER_TYPE() { return getToken(SDBLParser.ACCUMULATION_REGISTER_TYPE, 0); }
		public TerminalNode ACCOUNTING_REGISTER_TYPE() { return getToken(SDBLParser.ACCOUNTING_REGISTER_TYPE, 0); }
		public TerminalNode CALCULATION_REGISTER_TYPE() { return getToken(SDBLParser.CALCULATION_REGISTER_TYPE, 0); }
		public TerminalNode TASK_TYPE() { return getToken(SDBLParser.TASK_TYPE, 0); }
		public TerminalNode EXTERNAL_DATA_SOURCE_TYPE() { return getToken(SDBLParser.EXTERNAL_DATA_SOURCE_TYPE, 0); }
		public TerminalNode DROP() { return getToken(SDBLParser.DROP, 0); }
		public TerminalNode END() { return getToken(SDBLParser.END, 0); }
		public TerminalNode ISNULL() { return getToken(SDBLParser.ISNULL, 0); }
		public TerminalNode JOIN() { return getToken(SDBLParser.JOIN, 0); }
		public TerminalNode SELECT() { return getToken(SDBLParser.SELECT, 0); }
		public TerminalNode TOTALS() { return getToken(SDBLParser.TOTALS, 0); }
		public TerminalNode UNION() { return getToken(SDBLParser.UNION, 0); }
		public TerminalNode AVG() { return getToken(SDBLParser.AVG, 0); }
		public TerminalNode BEGINOFPERIOD() { return getToken(SDBLParser.BEGINOFPERIOD, 0); }
		public TerminalNode BOOLEAN() { return getToken(SDBLParser.BOOLEAN, 0); }
		public TerminalNode COUNT() { return getToken(SDBLParser.COUNT, 0); }
		public TerminalNode DATE() { return getToken(SDBLParser.DATE, 0); }
		public TerminalNode DATEADD() { return getToken(SDBLParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SDBLParser.DATEDIFF, 0); }
		public TerminalNode DATETIME() { return getToken(SDBLParser.DATETIME, 0); }
		public TerminalNode DAY() { return getToken(SDBLParser.DAY, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SDBLParser.DAYOFYEAR, 0); }
		public TerminalNode EMPTYTABLE() { return getToken(SDBLParser.EMPTYTABLE, 0); }
		public TerminalNode EMPTYREF() { return getToken(SDBLParser.EMPTYREF, 0); }
		public TerminalNode ENDOFPERIOD() { return getToken(SDBLParser.ENDOFPERIOD, 0); }
		public TerminalNode HALFYEAR() { return getToken(SDBLParser.HALFYEAR, 0); }
		public TerminalNode HOUR() { return getToken(SDBLParser.HOUR, 0); }
		public TerminalNode MAX() { return getToken(SDBLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SDBLParser.MIN, 0); }
		public TerminalNode MINUTE() { return getToken(SDBLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SDBLParser.MONTH, 0); }
		public TerminalNode NUMBER() { return getToken(SDBLParser.NUMBER, 0); }
		public TerminalNode QUARTER() { return getToken(SDBLParser.QUARTER, 0); }
		public TerminalNode PERIODS() { return getToken(SDBLParser.PERIODS, 0); }
		public TerminalNode REFS() { return getToken(SDBLParser.REFS, 0); }
		public TerminalNode PRESENTATION() { return getToken(SDBLParser.PRESENTATION, 0); }
		public TerminalNode RECORDAUTONUMBER() { return getToken(SDBLParser.RECORDAUTONUMBER, 0); }
		public TerminalNode REFPRESENTATION() { return getToken(SDBLParser.REFPRESENTATION, 0); }
		public TerminalNode SECOND() { return getToken(SDBLParser.SECOND, 0); }
		public TerminalNode STRING() { return getToken(SDBLParser.STRING, 0); }
		public TerminalNode SUBSTRING() { return getToken(SDBLParser.SUBSTRING, 0); }
		public TerminalNode SUM() { return getToken(SDBLParser.SUM, 0); }
		public TerminalNode TENDAYS() { return getToken(SDBLParser.TENDAYS, 0); }
		public TerminalNode TYPE() { return getToken(SDBLParser.TYPE, 0); }
		public TerminalNode VALUE() { return getToken(SDBLParser.VALUE, 0); }
		public TerminalNode VALUETYPE() { return getToken(SDBLParser.VALUETYPE, 0); }
		public TerminalNode WEEK() { return getToken(SDBLParser.WEEK, 0); }
		public TerminalNode WEEKDAY() { return getToken(SDBLParser.WEEKDAY, 0); }
		public TerminalNode YEAR() { return getToken(SDBLParser.YEAR, 0); }
		public TerminalNode RIGHT() { return getToken(SDBLParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(SDBLParser.LEFT, 0); }
		public TerminalNode ACOS() { return getToken(SDBLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(SDBLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(SDBLParser.ATAN, 0); }
		public TerminalNode COS() { return getToken(SDBLParser.COS, 0); }
		public TerminalNode SIN() { return getToken(SDBLParser.SIN, 0); }
		public TerminalNode TAN() { return getToken(SDBLParser.TAN, 0); }
		public TerminalNode LOG() { return getToken(SDBLParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(SDBLParser.LOG10, 0); }
		public TerminalNode EXP() { return getToken(SDBLParser.EXP, 0); }
		public TerminalNode POW() { return getToken(SDBLParser.POW, 0); }
		public TerminalNode SQRT() { return getToken(SDBLParser.SQRT, 0); }
		public TerminalNode INT() { return getToken(SDBLParser.INT, 0); }
		public TerminalNode LOWER() { return getToken(SDBLParser.LOWER, 0); }
		public TerminalNode STRINGLENGTH() { return getToken(SDBLParser.STRINGLENGTH, 0); }
		public TerminalNode TRIMALL() { return getToken(SDBLParser.TRIMALL, 0); }
		public TerminalNode TRIML() { return getToken(SDBLParser.TRIML, 0); }
		public TerminalNode TRIMR() { return getToken(SDBLParser.TRIMR, 0); }
		public TerminalNode UPPER() { return getToken(SDBLParser.UPPER, 0); }
		public TerminalNode ROUND() { return getToken(SDBLParser.ROUND, 0); }
		public TerminalNode STOREDDATASIZE() { return getToken(SDBLParser.STOREDDATASIZE, 0); }
		public TerminalNode UUID() { return getToken(SDBLParser.UUID, 0); }
		public TerminalNode STRFIND() { return getToken(SDBLParser.STRFIND, 0); }
		public TerminalNode STRREPLACE() { return getToken(SDBLParser.STRREPLACE, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -139044197498880000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -8388609L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 1125659472562175L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemporaryTableIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SDBLParser.DOT, 0); }
		public List<TerminalNode> NUMBER_SIGH() { return getTokens(SDBLParser.NUMBER_SIGH); }
		public TerminalNode NUMBER_SIGH(int i) {
			return getToken(SDBLParser.NUMBER_SIGH, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(SDBLParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(SDBLParser.DECIMAL, i);
		}
		public TemporaryTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporaryTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterTemporaryTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitTemporaryTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitTemporaryTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporaryTableIdentifierContext temporaryTableIdentifier() throws RecognitionException {
		TemporaryTableIdentifierContext _localctx = new TemporaryTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_temporaryTableIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1008);
				match(DOT);
				}
			}

			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1012); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1011);
					match(NUMBER_SIGH);
					}
					}
					setState(1014); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER_SIGH );
				}
				break;
			case 2:
				{
				setState(1016);
				identifier();
				}
				break;
			case 3:
				{
				setState(1029); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1019); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								setState(1019);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case DROP:
								case END:
								case ISNULL:
								case SELECT:
								case TOTALS:
								case ACOS:
								case ASIN:
								case ATAN:
								case AVG:
								case BEGINOFPERIOD:
								case BOOLEAN:
								case COS:
								case COUNT:
								case DATE:
								case DATEADD:
								case DATEDIFF:
								case DATETIME:
								case DAY:
								case DAYOFYEAR:
								case EMPTYTABLE:
								case EMPTYREF:
								case ENDOFPERIOD:
								case EXP:
								case HALFYEAR:
								case HOUR:
								case INT:
								case LEFT:
								case LOG:
								case LOG10:
								case LOWER:
								case MAX:
								case MIN:
								case MINUTE:
								case MONTH:
								case NUMBER:
								case QUARTER:
								case PERIODS:
								case REFS:
								case PRESENTATION:
								case RECORDAUTONUMBER:
								case REFPRESENTATION:
								case POW:
								case RIGHT:
								case ROUND:
								case SECOND:
								case SIN:
								case SQRT:
								case STOREDDATASIZE:
								case STRING:
								case STRINGLENGTH:
								case STRFIND:
								case STRREPLACE:
								case SUBSTRING:
								case SUM:
								case TAN:
								case TENDAYS:
								case TRIMALL:
								case TRIML:
								case TRIMR:
								case TYPE:
								case UPPER:
								case VALUE:
								case VALUETYPE:
								case WEEK:
								case WEEKDAY:
								case YEAR:
								case UUID:
								case ACCOUNTING_REGISTER_TYPE:
								case ACCUMULATION_REGISTER_TYPE:
								case BUSINESS_PROCESS_TYPE:
								case CALCULATION_REGISTER_TYPE:
								case CATALOG_TYPE:
								case CHART_OF_ACCOUNTS_TYPE:
								case CHART_OF_CALCULATION_TYPES_TYPE:
								case CHART_OF_CHARACTERISTIC_TYPES_TYPE:
								case CONSTANT_TYPE:
								case DOCUMENT_TYPE:
								case DOCUMENT_JOURNAL_TYPE:
								case ENUM_TYPE:
								case EXCHANGE_PLAN_TYPE:
								case EXTERNAL_DATA_SOURCE_TYPE:
								case FILTER_CRITERION_TYPE:
								case INFORMATION_REGISTER_TYPE:
								case SEQUENCE_TYPE:
								case TASK_TYPE:
								case ROUTEPOINT_FIELD:
								case JOIN:
								case UNION:
								case IDENTIFIER:
								case ACTUAL_ACTION_PERIOD_VT:
								case BALANCE_VT:
								case BALANCE_AND_TURNOVERS_VT:
								case BOUNDARIES_VT:
								case DR_CR_TURNOVERS_VT:
								case EXT_DIMENSIONS_VT:
								case RECORDS_WITH_EXT_DIMENSIONS_VT:
								case SCHEDULE_DATA_VT:
								case SLICEFIRST_VT:
								case SLICELAST_VT:
								case TASK_BY_PERFORMER_VT:
								case TURNOVERS_VT:
									{
									setState(1017);
									identifier();
									}
									break;
								case NUMBER_SIGH:
									{
									setState(1018);
									match(NUMBER_SIGH);
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1021); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1026);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DECIMAL) {
							{
							{
							setState(1023);
							match(DECIMAL);
							}
							}
							setState(1028);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1031); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Token name;
		public TerminalNode AMPERSAND() { return getToken(SDBLParser.AMPERSAND, 0); }
		public TerminalNode PARAMETER_IDENTIFIER() { return getToken(SDBLParser.PARAMETER_IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(AMPERSAND);
			setState(1036);
			((ParameterContext)_localctx).name = match(PARAMETER_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MdoContext extends ParserRuleContext {
		public Token type;
		public IdentifierContext tableName;
		public TerminalNode DOT() { return getToken(SDBLParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode BUSINESS_PROCESS_TYPE() { return getToken(SDBLParser.BUSINESS_PROCESS_TYPE, 0); }
		public TerminalNode CATALOG_TYPE() { return getToken(SDBLParser.CATALOG_TYPE, 0); }
		public TerminalNode DOCUMENT_TYPE() { return getToken(SDBLParser.DOCUMENT_TYPE, 0); }
		public TerminalNode INFORMATION_REGISTER_TYPE() { return getToken(SDBLParser.INFORMATION_REGISTER_TYPE, 0); }
		public TerminalNode CONSTANT_TYPE() { return getToken(SDBLParser.CONSTANT_TYPE, 0); }
		public TerminalNode FILTER_CRITERION_TYPE() { return getToken(SDBLParser.FILTER_CRITERION_TYPE, 0); }
		public TerminalNode EXCHANGE_PLAN_TYPE() { return getToken(SDBLParser.EXCHANGE_PLAN_TYPE, 0); }
		public TerminalNode SEQUENCE_TYPE() { return getToken(SDBLParser.SEQUENCE_TYPE, 0); }
		public TerminalNode DOCUMENT_JOURNAL_TYPE() { return getToken(SDBLParser.DOCUMENT_JOURNAL_TYPE, 0); }
		public TerminalNode ENUM_TYPE() { return getToken(SDBLParser.ENUM_TYPE, 0); }
		public TerminalNode CHART_OF_CHARACTERISTIC_TYPES_TYPE() { return getToken(SDBLParser.CHART_OF_CHARACTERISTIC_TYPES_TYPE, 0); }
		public TerminalNode CHART_OF_ACCOUNTS_TYPE() { return getToken(SDBLParser.CHART_OF_ACCOUNTS_TYPE, 0); }
		public TerminalNode CHART_OF_CALCULATION_TYPES_TYPE() { return getToken(SDBLParser.CHART_OF_CALCULATION_TYPES_TYPE, 0); }
		public TerminalNode ACCUMULATION_REGISTER_TYPE() { return getToken(SDBLParser.ACCUMULATION_REGISTER_TYPE, 0); }
		public TerminalNode ACCOUNTING_REGISTER_TYPE() { return getToken(SDBLParser.ACCOUNTING_REGISTER_TYPE, 0); }
		public TerminalNode CALCULATION_REGISTER_TYPE() { return getToken(SDBLParser.CALCULATION_REGISTER_TYPE, 0); }
		public TerminalNode TASK_TYPE() { return getToken(SDBLParser.TASK_TYPE, 0); }
		public TerminalNode EXTERNAL_DATA_SOURCE_TYPE() { return getToken(SDBLParser.EXTERNAL_DATA_SOURCE_TYPE, 0); }
		public MdoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).enterMdo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SDBLParserListener ) ((SDBLParserListener)listener).exitMdo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SDBLParserVisitor ) return ((SDBLParserVisitor<? extends T>)visitor).visitMdo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdoContext mdo() throws RecognitionException {
		MdoContext _localctx = new MdoContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_mdo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			((MdoContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 262143L) != 0)) ) {
				((MdoContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1039);
			match(DOT);
			setState(1040);
			((MdoContext)_localctx).tableName = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b6\u0413\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u008a\b\u0000\n\u0000\f\u0000\u008d\t\u0000\u0001\u0000\u0003\u0000"+
		"\u0090\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0096\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00ab\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00b0\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00b4\b\u0003\u0003\u0003\u00b6\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00ba\b\u0004\u0001\u0004\u0004\u0004\u00bd\b\u0004\u000b\u0004"+
		"\f\u0004\u00be\u0003\u0004\u00c1\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00c6\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00ca"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cf\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00d3\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00d7\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00e3\b\u0006\n\u0006\f\u0006\u00e6\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ee"+
		"\b\u0006\n\u0006\f\u0006\u00f1\t\u0006\u0003\u0006\u00f3\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00f7\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00fb\b\u0006\u0003\u0006\u00fd\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0104\b\u0006\n\u0006"+
		"\f\u0006\u0107\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u010e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0113\b\u0006\u0005\u0006\u0115\b\u0006\n\u0006\f\u0006\u0118"+
		"\t\u0006\u0003\u0006\u011a\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u011f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0145\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u014d\b\t\n\t\f\t\u0150\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0157\b\n\u0001\n\u0003\n\u015a"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u015f\b\u000b\n\u000b"+
		"\f\u000b\u0162\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f"+
		"\u0168\b\f\u0001\r\u0001\r\u0003\r\u016c\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0177\b\u000f\n\u000f\f\u000f\u017a\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0188\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u018e\b\u0013\n\u0013\f\u0013\u0191\t\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0195\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u019b\b\u0014\n\u0014\f\u0014\u019e\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01a4\b\u0015\u0003\u0015\u01a6\b"+
		"\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u01aa\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01b0\b\u0016\n\u0016\f\u0016"+
		"\u01b3\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01b9\b\u0017\u0001\u0017\u0003\u0017\u01bc\b\u0017\u0003\u0017\u01be"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01c5\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01c9\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019"+
		"\u01d0\b\u0019\u000b\u0019\f\u0019\u01d1\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0004\u0019\u01d8\b\u0019\u000b\u0019\f\u0019\u01d9"+
		"\u0003\u0019\u01dc\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01e5\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u01ea\b\u001a\n\u001a\f\u001a\u01ed"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0203\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u020f\b\u001b\u0001\u001b\u0003"+
		"\u001b\u0212\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u0217"+
		"\b\u001c\u000b\u001c\f\u001c\u0218\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u021d\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c"+
		"\u0223\b\u001c\u000b\u001c\f\u001c\u0224\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0229\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0230\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0234"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0243\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u024d\b \n \f \u0250"+
		"\t \u0001 \u0001 \u0001 \u0005 \u0255\b \n \f \u0258\t \u0003 \u025a\b"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02bc\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02c6\b\"\u0001"+
		"\"\u0001\"\u0003\"\u02ca\b\"\u0001\"\u0003\"\u02cd\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02ec\b#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u02fa\b$\u0001$\u0003$\u02fd\b$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0303\b$\u0001$\u0001$\u0003$\u0307\b$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0005%\u030e\b%\n%\f%\u0311\t%\u0001&\u0005&\u0314\b&\n&\f&\u0317\t"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u0324\b&\u0001\'\u0001\'\u0005\'\u0328\b\'\n\'\f\'\u032b"+
		"\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0331\b\'\u0001(\u0001(\u0001"+
		"(\u0003(\u0336\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0349\b+\u0001+\u0005+\u034c\b+\n+\f+\u034f\t+\u0001+\u0001+\u0001+"+
		"\u0001+\u0003+\u0355\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0005-\u0360\b-\n-\f-\u0363\t-\u0001.\u0001.\u0003.\u0367"+
		"\b.\u0001/\u0001/\u0001/\u0005/\u036c\b/\n/\f/\u036f\t/\u00010\u00010"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u0379\b0\u00010\u0003"+
		"0\u037c\b0\u00010\u00010\u00010\u00010\u00010\u00030\u0383\b0\u00010\u0001"+
		"0\u00030\u0387\b0\u00030\u0389\b0\u00010\u00050\u038c\b0\n0\f0\u038f\t"+
		"0\u00030\u0391\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u0399"+
		"\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u03a2\b2\n"+
		"2\f2\u03a5\t2\u00012\u00012\u00032\u03a9\b2\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u03b0\b2\u00012\u00012\u00032\u03b4\b2\u00013\u00033\u03b7"+
		"\b3\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u03cb"+
		"\b5\u00016\u00016\u00016\u00016\u00036\u03d1\b6\u00016\u00016\u00016\u0001"+
		"6\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0003"+
		";\u03e0\b;\u0001;\u0001;\u0001<\u0001<\u0003<\u03e6\b<\u0001=\u0004=\u03e9"+
		"\b=\u000b=\f=\u03ea\u0001>\u0001>\u0001?\u0001?\u0001@\u0003@\u03f2\b"+
		"@\u0001@\u0004@\u03f5\b@\u000b@\f@\u03f6\u0001@\u0001@\u0001@\u0004@\u03fc"+
		"\b@\u000b@\f@\u03fd\u0001@\u0005@\u0401\b@\n@\f@\u0404\t@\u0004@\u0406"+
		"\b@\u000b@\f@\u0407\u0003@\u040a\b@\u0001A\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0000\u00014C\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0000\u001e\u0001\u0000"+
		"\u0099\u009a\u0002\u0000\u0016\u0016((\u0002\u0000\u0019\u0019\u001f\u001f"+
		"\u0001\u0000\u009b\u009c\b\u0000EEKLTUXXaallttvv\u0002\u0000\t\n\u0010"+
		"\u0011\u0002\u0000%%55\u0006\u0000EFLLTUXXaatv\u0002\u0000==II\u0007\u0000"+
		"EEKLTUXXllttvv\u0006\u0000EELLTUXXaavv\u0005\u0000[[]]eess\u009f\u009f"+
		"\b\u00009;??JJMMOP^^bckk\u0004\u0000QQffmoqq\u0002\u0000NN__\u0002\u0000"+
		"ddww\u0003\u0000<<RSjj\u0005\u0000zz|\u007f\u0081\u0081\u0083\u0086\u0089"+
		"\u0089\u0002\u0000|\u007f\u0083\u0083\u0002\u0000\u0017\u0017//\u0002"+
		"\u0000\b\b\u000b\u000f\u0001\u0000\u009d\u009e\u0001\u0000\u00a6\u00b1"+
		"\u0001\u0000\u0091\u0092\u0001\u0000\u0093\u0094\u0001\u0000\u0095\u0096"+
		"\u0001\u0000\u0097\u0098\u0001\u0000\t\n\u000b\u0000!!##**11449VX\u008a"+
		"\u0098\u0098\u009a\u009a\u00a3\u00a3\u00a6\u00b1\u0001\u0000x\u0089\u048b"+
		"\u0000\u0086\u0001\u0000\u0000\u0000\u0002\u0095\u0001\u0000\u0000\u0000"+
		"\u0004\u0097\u0001\u0000\u0000\u0000\u0006\u009a\u0001\u0000\u0000\u0000"+
		"\b\u00b7\u0001\u0000\u0000\u0000\n\u00c2\u0001\u0000\u0000\u0000\f\u00c7"+
		"\u0001\u0000\u0000\u0000\u000e\u0144\u0001\u0000\u0000\u0000\u0010\u0146"+
		"\u0001\u0000\u0000\u0000\u0012\u0149\u0001\u0000\u0000\u0000\u0014\u0156"+
		"\u0001\u0000\u0000\u0000\u0016\u0160\u0001\u0000\u0000\u0000\u0018\u0167"+
		"\u0001\u0000\u0000\u0000\u001a\u016b\u0001\u0000\u0000\u0000\u001c\u016d"+
		"\u0001\u0000\u0000\u0000\u001e\u0173\u0001\u0000\u0000\u0000 \u017b\u0001"+
		"\u0000\u0000\u0000\"\u0181\u0001\u0000\u0000\u0000$\u0187\u0001\u0000"+
		"\u0000\u0000&\u0189\u0001\u0000\u0000\u0000(\u0196\u0001\u0000\u0000\u0000"+
		"*\u019f\u0001\u0000\u0000\u0000,\u01a7\u0001\u0000\u0000\u0000.\u01bd"+
		"\u0001\u0000\u0000\u00000\u01bf\u0001\u0000\u0000\u00002\u01db\u0001\u0000"+
		"\u0000\u00004\u01e4\u0001\u0000\u0000\u00006\u0211\u0001\u0000\u0000\u0000"+
		"8\u0233\u0001\u0000\u0000\u0000:\u0235\u0001\u0000\u0000\u0000<\u0242"+
		"\u0001\u0000\u0000\u0000>\u0244\u0001\u0000\u0000\u0000@\u0259\u0001\u0000"+
		"\u0000\u0000B\u02bb\u0001\u0000\u0000\u0000D\u02cc\u0001\u0000\u0000\u0000"+
		"F\u02ce\u0001\u0000\u0000\u0000H\u02ef\u0001\u0000\u0000\u0000J\u030a"+
		"\u0001\u0000\u0000\u0000L\u0315\u0001\u0000\u0000\u0000N\u0325\u0001\u0000"+
		"\u0000\u0000P\u0332\u0001\u0000\u0000\u0000R\u0339\u0001\u0000\u0000\u0000"+
		"T\u033d\u0001\u0000\u0000\u0000V\u0348\u0001\u0000\u0000\u0000X\u0358"+
		"\u0001\u0000\u0000\u0000Z\u035c\u0001\u0000\u0000\u0000\\\u0366\u0001"+
		"\u0000\u0000\u0000^\u0368\u0001\u0000\u0000\u0000`\u0390\u0001\u0000\u0000"+
		"\u0000b\u0398\u0001\u0000\u0000\u0000d\u03b3\u0001\u0000\u0000\u0000f"+
		"\u03b6\u0001\u0000\u0000\u0000h\u03b8\u0001\u0000\u0000\u0000j\u03ca\u0001"+
		"\u0000\u0000\u0000l\u03d0\u0001\u0000\u0000\u0000n\u03d6\u0001\u0000\u0000"+
		"\u0000p\u03d8\u0001\u0000\u0000\u0000r\u03da\u0001\u0000\u0000\u0000t"+
		"\u03dc\u0001\u0000\u0000\u0000v\u03df\u0001\u0000\u0000\u0000x\u03e5\u0001"+
		"\u0000\u0000\u0000z\u03e8\u0001\u0000\u0000\u0000|\u03ec\u0001\u0000\u0000"+
		"\u0000~\u03ee\u0001\u0000\u0000\u0000\u0080\u03f1\u0001\u0000\u0000\u0000"+
		"\u0082\u040b\u0001\u0000\u0000\u0000\u0084\u040e\u0001\u0000\u0000\u0000"+
		"\u0086\u008b\u0003\u0002\u0001\u0000\u0087\u0088\u0005\u0006\u0000\u0000"+
		"\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u0006\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0000\u0000\u0001"+
		"\u0092\u0001\u0001\u0000\u0000\u0000\u0093\u0096\u0003\u0006\u0003\u0000"+
		"\u0094\u0096\u0003\u0004\u0002\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0003\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005!\u0000\u0000\u0098\u0099\u0003~?\u0000\u0099\u0005"+
		"\u0001\u0000\u0000\u0000\u009a\u00b5\u0003\b\u0004\u0000\u009b\u009c\u0005"+
		"\u001a\u0000\u0000\u009c\u009d\u0003(\u0014\u0000\u009d\u009e\u0003,\u0016"+
		"\u0000\u009e\u00b6\u0001\u0000\u0000\u0000\u009f\u00a0\u0003(\u0014\u0000"+
		"\u00a0\u00a1\u0005\u001a\u0000\u0000\u00a1\u00a2\u0003,\u0016\u0000\u00a2"+
		"\u00b6\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003(\u0014\u0000\u00a4\u00a5"+
		"\u0003,\u0016\u0000\u00a5\u00a6\u0005\u001a\u0000\u0000\u00a6\u00b6\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0005\u001a\u0000\u0000\u00a8\u00ab\u0003"+
		"(\u0014\u0000\u00a9\u00ab\u0003,\u0016\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00b6\u0001\u0000\u0000\u0000\u00ac\u00af\u0003(\u0014\u0000"+
		"\u00ad\u00b0\u0005\u001a\u0000\u0000\u00ae\u00b0\u0003,\u0016\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b6\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0003,\u0016\u0000\u00b2\u00b4\u0005\u001a\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u009b\u0001\u0000\u0000\u0000\u00b5\u009f"+
		"\u0001\u0000\u0000\u0000\u00b5\u00a3\u0001\u0000\u0000\u0000\u00b5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0007"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\f\u0006\u0000\u00b8\u00ba\u0003"+
		"(\u0014\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00c0\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\n\u0005"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\t\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0007\u0000\u0000\u0000\u00c3\u00c5\u0003\f\u0006\u0000\u00c4"+
		"\u00c6\u0003(\u0014\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u000b\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u00051\u0000\u0000\u00c8\u00ca\u0003\u000e\u0007\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00ce\u0003\u0012\t\u0000\u00cc\u00cd\u0007\u0001"+
		"\u0000\u0000\u00cd\u00cf\u0003\u0080@\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1\u00d3\u0003^/\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d5\u00058\u0000\u0000\u00d5\u00d7"+
		"\u0003J%\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00f2\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u008d"+
		"\u0000\u0000\u00d9\u00da\u0005\u0004\u0000\u0000\u00da\u00db\u0005\u0004"+
		"\u0000\u0000\u00db\u00dc\u0003Z-\u0000\u00dc\u00e4\u0005\u0005\u0000\u0000"+
		"\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u00df\u0005\u0004\u0000\u0000"+
		"\u00df\u00e0\u0003Z-\u0000\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e3\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0005\u0000\u0000\u00e8\u00f3"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u008e\u0000\u0000\u00ea\u00ef"+
		"\u00034\u001a\u0000\u00eb\u00ec\u0005\u0007\u0000\u0000\u00ec\u00ee\u0003"+
		"4\u001a\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00d8\u0001\u0000\u0000\u0000\u00f2\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005\'\u0000\u0000\u00f5\u00f7\u0003J%\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fc\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\u0090\u0000\u0000"+
		"\u00f9\u00fb\u0003\u0084B\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u0119\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u008b\u0000\u0000\u00ff"+
		"\u0100\u0005\u0004\u0000\u0000\u0100\u0105\u0003&\u0013\u0000\u0101\u0102"+
		"\u0005\u0007\u0000\u0000\u0102\u0104\u0003&\u0013\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005"+
		"\u0005\u0000\u0000\u0109\u011a\u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"\u008c\u0000\u0000\u010b\u010d\u0003$\u0012\u0000\u010c\u010e\u0005W\u0000"+
		"\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0116\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0007\u0000"+
		"\u0000\u0110\u0112\u0003$\u0012\u0000\u0111\u0113\u0005W\u0000\u0000\u0112"+
		"\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0115\u0001\u0000\u0000\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0115"+
		"\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0119\u00fe\u0001\u0000\u0000\u0000\u0119"+
		"\u010a\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\r\u0001\u0000\u0000\u0000\u011b\u011f\u0003\u0010\b\u0000\u011c\u011f"+
		"\u0005 \u0000\u0000\u011d\u011f\u0005\u0015\u0000\u0000\u011e\u011b\u0001"+
		"\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0145\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"\u0015\u0000\u0000\u0121\u0122\u0005 \u0000\u0000\u0122\u0145\u0003\u0010"+
		"\b\u0000\u0123\u0124\u0005\u0015\u0000\u0000\u0124\u0125\u0003\u0010\b"+
		"\u0000\u0125\u0126\u0005 \u0000\u0000\u0126\u0145\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0003\u0010\b\u0000\u0128\u0129\u0005\u0015\u0000\u0000\u0129"+
		"\u012a\u0005 \u0000\u0000\u012a\u0145\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0003\u0010\b\u0000\u012c\u012d\u0005 \u0000\u0000\u012d\u012e\u0005"+
		"\u0015\u0000\u0000\u012e\u0145\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		" \u0000\u0000\u0130\u0131\u0005\u0015\u0000\u0000\u0131\u0145\u0003\u0010"+
		"\b\u0000\u0132\u0133\u0005 \u0000\u0000\u0133\u0134\u0003\u0010\b\u0000"+
		"\u0134\u0135\u0005\u0015\u0000\u0000\u0135\u0145\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005\u0015\u0000\u0000\u0137\u0145\u0005 \u0000\u0000\u0138"+
		"\u0139\u0005\u0015\u0000\u0000\u0139\u0145\u0003\u0010\b\u0000\u013a\u013b"+
		"\u0005 \u0000\u0000\u013b\u0145\u0005\u0015\u0000\u0000\u013c\u013d\u0005"+
		" \u0000\u0000\u013d\u0145\u0003\u0010\b\u0000\u013e\u013f\u0003\u0010"+
		"\b\u0000\u013f\u0140\u0005\u0015\u0000\u0000\u0140\u0145\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0003\u0010\b\u0000\u0142\u0143\u0005 \u0000\u0000"+
		"\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u011e\u0001\u0000\u0000\u0000"+
		"\u0144\u0120\u0001\u0000\u0000\u0000\u0144\u0123\u0001\u0000\u0000\u0000"+
		"\u0144\u0127\u0001\u0000\u0000\u0000\u0144\u012b\u0001\u0000\u0000\u0000"+
		"\u0144\u012f\u0001\u0000\u0000\u0000\u0144\u0132\u0001\u0000\u0000\u0000"+
		"\u0144\u0136\u0001\u0000\u0000\u0000\u0144\u0138\u0001\u0000\u0000\u0000"+
		"\u0144\u013a\u0001\u0000\u0000\u0000\u0144\u013c\u0001\u0000\u0000\u0000"+
		"\u0144\u013e\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000"+
		"\u0145\u000f\u0001\u0000\u0000\u0000\u0146\u0147\u00053\u0000\u0000\u0147"+
		"\u0148\u0005\u00a0\u0000\u0000\u0148\u0011\u0001\u0000\u0000\u0000\u0149"+
		"\u014e\u0003\u0014\n\u0000\u014a\u014b\u0005\u0007\u0000\u0000\u014b\u014d"+
		"\u0003\u0014\n\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0013\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0157\u0003\u0016\u000b\u0000\u0152\u0157\u0003"+
		"\u001a\r\u0000\u0153\u0157\u0003\u001c\u000e\u0000\u0154\u0157\u0003 "+
		"\u0010\u0000\u0155\u0157\u0003\u0018\f\u0000\u0156\u0151\u0001\u0000\u0000"+
		"\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0156\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u015a\u0003v;\u0000\u0159"+
		"\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u0015\u0001\u0000\u0000\u0000\u015b\u015c\u0003~?\u0000\u015c\u015d\u0005"+
		"\u0003\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u015b\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0005"+
		"\u0010\u0000\u0000\u0164\u0017\u0001\u0000\u0000\u0000\u0165\u0168\u0003"+
		"4\u001a\u0000\u0166\u0168\u0003J%\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u0019\u0001\u0000\u0000"+
		"\u0000\u0169\u016c\u0005-\u0000\u0000\u016a\u016c\u0003\"\u0011\u0000"+
		"\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000"+
		"\u016c\u001b\u0001\u0000\u0000\u0000\u016d\u016e\u0005G\u0000\u0000\u016e"+
		"\u016f\u0005\u0003\u0000\u0000\u016f\u0170\u0005\u0004\u0000\u0000\u0170"+
		"\u0171\u0003\u001e\u000f\u0000\u0171\u0172\u0005\u0005\u0000\u0000\u0172"+
		"\u001d\u0001\u0000\u0000\u0000\u0173\u0178\u0003v;\u0000\u0174\u0175\u0005"+
		"\u0007\u0000\u0000\u0175\u0177\u0003v;\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u001f\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u00032\u0019\u0000"+
		"\u017c\u017d\u0005\u0003\u0000\u0000\u017d\u017e\u0005\u0004\u0000\u0000"+
		"\u017e\u017f\u0003\u0012\t\u0000\u017f\u0180\u0005\u0005\u0000\u0000\u0180"+
		"!\u0001\u0000\u0000\u0000\u0181\u0182\u0005\\\u0000\u0000\u0182\u0183"+
		"\u0005\u0004\u0000\u0000\u0183\u0184\u0005\u0005\u0000\u0000\u0184#\u0001"+
		"\u0000\u0000\u0000\u0185\u0188\u0003\u0082A\u0000\u0186\u0188\u00032\u0019"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000"+
		"\u0000\u0188%\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u0004\u0000\u0000"+
		"\u018a\u018f\u0003$\u0012\u0000\u018b\u018c\u0005\u0007\u0000\u0000\u018c"+
		"\u018e\u0003$\u0012\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u0191"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0192\u0194\u0005\u0005\u0000\u0000\u0193\u0195"+
		"\u0005W\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\'\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u008f"+
		"\u0000\u0000\u0197\u019c\u0003*\u0015\u0000\u0198\u0199\u0005\u0007\u0000"+
		"\u0000\u0199\u019b\u0003*\u0015\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d)\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a5\u00034\u001a\u0000\u01a0\u01a6"+
		"\u0007\u0002\u0000\u0000\u01a1\u01a3\u0005\u009c\u0000\u0000\u01a2\u01a4"+
		"\u0005\u001f\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a1\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6+\u0001\u0000\u0000\u0000\u01a7\u01a9\u0005"+
		"4\u0000\u0000\u01a8\u01aa\u0003\u0012\t\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0005\u001c\u0000\u0000\u01ac\u01b1\u0003.\u0017"+
		"\u0000\u01ad\u01ae\u0005\u0007\u0000\u0000\u01ae\u01b0\u0003.\u0017\u0000"+
		"\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2-\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4"+
		"\u01be\u00050\u0000\u0000\u01b5\u01b8\u00034\u001a\u0000\u01b6\u01b9\u0007"+
		"\u0003\u0000\u0000\u01b7\u01b9\u00030\u0018\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01bc\u0003v;\u0000"+
		"\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b4\u0001\u0000\u0000\u0000"+
		"\u01bd\u01b5\u0001\u0000\u0000\u0000\u01be/\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005Y\u0000\u0000\u01c0\u01c1\u0005\u0004\u0000\u0000\u01c1\u01c4"+
		"\u0007\u0004\u0000\u0000\u01c2\u01c3\u0005\u0007\u0000\u0000\u01c3\u01c5"+
		"\u00034\u001a\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"\u0007\u0000\u0000\u01c7\u01c9\u00034\u001a\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0005\u0005\u0000\u0000\u01cb1\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0003~?\u0000\u01cd\u01ce\u0005\u0003\u0000\u0000\u01ce"+
		"\u01d0\u0003~?\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d2\u01dc\u0001\u0000\u0000\u0000\u01d3\u01dc\u0003"+
		"~?\u0000\u01d4\u01d7\u0003\u0084B\u0000\u01d5\u01d6\u0005\u0003\u0000"+
		"\u0000\u01d6\u01d8\u0003~?\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db"+
		"\u01cc\u0001\u0000\u0000\u0000\u01db\u01d3\u0001\u0000\u0000\u0000\u01db"+
		"\u01d4\u0001\u0000\u0000\u0000\u01dc3\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0006\u001a\uffff\uffff\u0000\u01de\u01e5\u00036\u001b\u0000\u01df\u01e5"+
		"\u0003@ \u0000\u01e0\u01e5\u00038\u001c\u0000\u01e1\u01e5\u00032\u0019"+
		"\u0000\u01e2\u01e5\u0003<\u001e\u0000\u01e3\u01e5\u0003>\u001f\u0000\u01e4"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e4\u01df\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e4\u01e1\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5"+
		"\u01eb\u0001\u0000\u0000\u0000\u01e6\u01e7\n\u0001\u0000\u0000\u01e7\u01e8"+
		"\u0007\u0005\u0000\u0000\u01e8\u01ea\u00034\u001a\u0002\u01e9\u01e6\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec5\u0001\u0000"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u0212\u0005-\u0000"+
		"\u0000\u01ef\u0212\u00056\u0000\u0000\u01f0\u0212\u0003z=\u0000\u01f1"+
		"\u0212\u0005\u00a0\u0000\u0000\u01f2\u0212\u0005\u00a1\u0000\u0000\u01f3"+
		"\u0212\u0007\u0006\u0000\u0000\u01f4\u01f5\u0005D\u0000\u0000\u01f5\u01f6"+
		"\u0005\u0004\u0000\u0000\u01f6\u01f7\u0003x<\u0000\u01f7\u01f8\u0005\u0007"+
		"\u0000\u0000\u01f8\u01f9\u0003x<\u0000\u01f9\u01fa\u0005\u0007\u0000\u0000"+
		"\u01fa\u0202\u0003x<\u0000\u01fb\u01fc\u0005\u0007\u0000\u0000\u01fc\u01fd"+
		"\u0003x<\u0000\u01fd\u01fe\u0005\u0007\u0000\u0000\u01fe\u01ff\u0003x"+
		"<\u0000\u01ff\u0200\u0005\u0007\u0000\u0000\u0200\u0201\u0003x<\u0000"+
		"\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01fb\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005\u0005\u0000\u0000\u0205\u0212\u0001\u0000\u0000\u0000"+
		"\u0206\u0212\u0003\u0082A\u0000\u0207\u0208\u0005p\u0000\u0000\u0208\u020e"+
		"\u0005\u0004\u0000\u0000\u0209\u020f\u0003\u0084B\u0000\u020a\u020f\u0005"+
		"e\u0000\u0000\u020b\u020f\u0005>\u0000\u0000\u020c\u020f\u0005A\u0000"+
		"\u0000\u020d\u020f\u0005V\u0000\u0000\u020e\u0209\u0001\u0000\u0000\u0000"+
		"\u020e\u020a\u0001\u0000\u0000\u0000\u020e\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0005\u0005\u0000\u0000"+
		"\u0211\u01ee\u0001\u0000\u0000\u0000\u0211\u01ef\u0001\u0000\u0000\u0000"+
		"\u0211\u01f0\u0001\u0000\u0000\u0000\u0211\u01f1\u0001\u0000\u0000\u0000"+
		"\u0211\u01f2\u0001\u0000\u0000\u0000\u0211\u01f3\u0001\u0000\u0000\u0000"+
		"\u0211\u01f4\u0001\u0000\u0000\u0000\u0211\u0206\u0001\u0000\u0000\u0000"+
		"\u0211\u0207\u0001\u0000\u0000\u0000\u02127\u0001\u0000\u0000\u0000\u0213"+
		"\u0214\u0005\u001d\u0000\u0000\u0214\u0216\u00034\u001a\u0000\u0215\u0217"+
		"\u0003:\u001d\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001"+
		"\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000\u0000\u021a\u021b\u0005"+
		"\"\u0000\u0000\u021b\u021d\u0003J%\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0005#\u0000\u0000\u021f\u0234\u0001\u0000\u0000\u0000"+
		"\u0220\u0222\u0005\u001d\u0000\u0000\u0221\u0223\u0003:\u001d\u0000\u0222"+
		"\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224"+
		"\u0222\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225"+
		"\u0228\u0001\u0000\u0000\u0000\u0226\u0227\u0005\"\u0000\u0000\u0227\u0229"+
		"\u0003J%\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0005#\u0000"+
		"\u0000\u022b\u0234\u0001\u0000\u0000\u0000\u022c\u022f\u0003:\u001d\u0000"+
		"\u022d\u022e\u0005\"\u0000\u0000\u022e\u0230\u0003J%\u0000\u022f\u022d"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0005#\u0000\u0000\u0232\u0234\u0001"+
		"\u0000\u0000\u0000\u0233\u0213\u0001\u0000\u0000\u0000\u0233\u0220\u0001"+
		"\u0000\u0000\u0000\u0233\u022c\u0001\u0000\u0000\u0000\u02349\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u00057\u0000\u0000\u0236\u0237\u0003J%\u0000"+
		"\u0237\u0238\u00052\u0000\u0000\u0238\u0239\u0003J%\u0000\u0239;\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0005\u0004\u0000\u0000\u023b\u023c\u0003"+
		"4\u001a\u0000\u023c\u023d\u0005\u0005\u0000\u0000\u023d\u0243\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0005\u0004\u0000\u0000\u023f\u0240\u0003\b\u0004"+
		"\u0000\u0240\u0241\u0005\u0005\u0000\u0000\u0241\u0243\u0001\u0000\u0000"+
		"\u0000\u0242\u023a\u0001\u0000\u0000\u0000\u0242\u023e\u0001\u0000\u0000"+
		"\u0000\u0243=\u0001\u0000\u0000\u0000\u0244\u0245\u0003|>\u0000\u0245"+
		"\u0246\u00034\u001a\u0000\u0246?\u0001\u0000\u0000\u0000\u0247\u025a\u0003"+
		"D\"\u0000\u0248\u025a\u0003B!\u0000\u0249\u024e\u0003F#\u0000\u024a\u024b"+
		"\u0005\u0003\u0000\u0000\u024b\u024d\u0003~?\u0000\u024c\u024a\u0001\u0000"+
		"\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u025a\u0001\u0000"+
		"\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0256\u0003H$\u0000"+
		"\u0252\u0253\u0005\u0003\u0000\u0000\u0253\u0255\u0003~?\u0000\u0254\u0252"+
		"\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u025a"+
		"\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u0247"+
		"\u0001\u0000\u0000\u0000\u0259\u0248\u0001\u0000\u0000\u0000\u0259\u0249"+
		"\u0001\u0000\u0000\u0000\u0259\u0251\u0001\u0000\u0000\u0000\u025aA\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0005i\u0000\u0000\u025c\u025d\u0005\u0004"+
		"\u0000\u0000\u025d\u025e\u00034\u001a\u0000\u025e\u025f\u0005\u0007\u0000"+
		"\u0000\u025f\u0260\u00034\u001a\u0000\u0260\u0261\u0005\u0007\u0000\u0000"+
		"\u0261\u0262\u00034\u001a\u0000\u0262\u0263\u0005\u0005\u0000\u0000\u0263"+
		"\u02bc\u0001\u0000\u0000\u0000\u0264\u0265\u0007\u0007\u0000\u0000\u0265"+
		"\u0266\u0005\u0004\u0000\u0000\u0266\u0267\u00034\u001a\u0000\u0267\u0268"+
		"\u0005\u0005\u0000\u0000\u0268\u02bc\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u0007\b\u0000\u0000\u026a\u026b\u0005\u0004\u0000\u0000\u026b\u026c\u0003"+
		"4\u001a\u0000\u026c\u026d\u0005\u0007\u0000\u0000\u026d\u026e\u0007\t"+
		"\u0000\u0000\u026e\u026f\u0005\u0005\u0000\u0000\u026f\u02bc\u0001\u0000"+
		"\u0000\u0000\u0270\u0271\u0005B\u0000\u0000\u0271\u0272\u0005\u0004\u0000"+
		"\u0000\u0272\u0273\u00034\u001a\u0000\u0273\u0274\u0005\u0007\u0000\u0000"+
		"\u0274\u0275\u0007\u0004\u0000\u0000\u0275\u0276\u0005\u0007\u0000\u0000"+
		"\u0276\u0277\u00034\u001a\u0000\u0277\u0278\u0005\u0005\u0000\u0000\u0278"+
		"\u02bc\u0001\u0000\u0000\u0000\u0279\u027a\u0005C\u0000\u0000\u027a\u027b"+
		"\u0005\u0004\u0000\u0000\u027b\u027c\u00034\u001a\u0000\u027c\u027d\u0005"+
		"\u0007\u0000\u0000\u027d\u027e\u00034\u001a\u0000\u027e\u027f\u0005\u0007"+
		"\u0000\u0000\u027f\u0280\u0007\n\u0000\u0000\u0280\u0281\u0005\u0005\u0000"+
		"\u0000\u0281\u02bc\u0001\u0000\u0000\u0000\u0282\u0283\u0007\u000b\u0000"+
		"\u0000\u0283\u0284\u0005\u0004\u0000\u0000\u0284\u0285\u00034\u001a\u0000"+
		"\u0285\u0286\u0005\u0005\u0000\u0000\u0286\u02bc\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0005*\u0000\u0000\u0288\u0289\u0005\u0004\u0000\u0000\u0289"+
		"\u028a\u0003J%\u0000\u028a\u028b\u0005\u0007\u0000\u0000\u028b\u028c\u0003"+
		"J%\u0000\u028c\u028d\u0005\u0005\u0000\u0000\u028d\u02bc\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0007\f\u0000\u0000\u028f\u0290\u0005\u0004\u0000\u0000"+
		"\u0290\u0291\u00034\u001a\u0000\u0291\u0292\u0005\u0005\u0000\u0000\u0292"+
		"\u02bc\u0001\u0000\u0000\u0000\u0293\u0294\u0007\r\u0000\u0000\u0294\u0295"+
		"\u0005\u0004\u0000\u0000\u0295\u0296\u00034\u001a\u0000\u0296\u0297\u0005"+
		"\u0005\u0000\u0000\u0297\u02bc\u0001\u0000\u0000\u0000\u0298\u0299\u0007"+
		"\u000e\u0000\u0000\u0299\u029a\u0005\u0004\u0000\u0000\u029a\u029b\u0003"+
		"4\u001a\u0000\u029b\u029c\u0005\u0007\u0000\u0000\u029c\u029d\u00034\u001a"+
		"\u0000\u029d\u029e\u0005\u0005\u0000\u0000\u029e\u02bc\u0001\u0000\u0000"+
		"\u0000\u029f\u02a0\u0005`\u0000\u0000\u02a0\u02a1\u0005\u0004\u0000\u0000"+
		"\u02a1\u02a2\u00034\u001a\u0000\u02a2\u02a3\u0005\u0007\u0000\u0000\u02a3"+
		"\u02a4\u00034\u001a\u0000\u02a4\u02a5\u0005\u0005\u0000\u0000\u02a5\u02bc"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0007\u000f\u0000\u0000\u02a7\u02a8"+
		"\u0005\u0004\u0000\u0000\u02a8\u02a9\u00034\u001a\u0000\u02a9\u02aa\u0005"+
		"\u0005\u0000\u0000\u02aa\u02bc\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005"+
		"g\u0000\u0000\u02ac\u02ad\u0005\u0004\u0000\u0000\u02ad\u02ae\u00034\u001a"+
		"\u0000\u02ae\u02af\u0005\u0007\u0000\u0000\u02af\u02b0\u00034\u001a\u0000"+
		"\u02b0\u02b1\u0005\u0005\u0000\u0000\u02b1\u02bc\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0005h\u0000\u0000\u02b3\u02b4\u0005\u0004\u0000\u0000\u02b4"+
		"\u02b5\u00034\u001a\u0000\u02b5\u02b6\u0005\u0007\u0000\u0000\u02b6\u02b7"+
		"\u00034\u001a\u0000\u02b7\u02b8\u0005\u0007\u0000\u0000\u02b8\u02b9\u0003"+
		"4\u001a\u0000\u02b9\u02ba\u0005\u0005\u0000\u0000\u02ba\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bb\u025b\u0001\u0000\u0000\u0000\u02bb\u0264\u0001\u0000"+
		"\u0000\u0000\u02bb\u0269\u0001\u0000\u0000\u0000\u02bb\u0270\u0001\u0000"+
		"\u0000\u0000\u02bb\u0279\u0001\u0000\u0000\u0000\u02bb\u0282\u0001\u0000"+
		"\u0000\u0000\u02bb\u0287\u0001\u0000\u0000\u0000\u02bb\u028e\u0001\u0000"+
		"\u0000\u0000\u02bb\u0293\u0001\u0000\u0000\u0000\u02bb\u0298\u0001\u0000"+
		"\u0000\u0000\u02bb\u029f\u0001\u0000\u0000\u0000\u02bb\u02a6\u0001\u0000"+
		"\u0000\u0000\u02bb\u02ab\u0001\u0000\u0000\u0000\u02bb\u02b2\u0001\u0000"+
		"\u0000\u0000\u02bcC\u0001\u0000\u0000\u0000\u02bd\u02be\u0007\u0010\u0000"+
		"\u0000\u02be\u02bf\u0005\u0004\u0000\u0000\u02bf\u02c0\u0003J%\u0000\u02c0"+
		"\u02c1\u0005\u0005\u0000\u0000\u02c1\u02cd\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c3\u0005@\u0000\u0000\u02c3\u02c9\u0005\u0004\u0000\u0000\u02c4\u02c6"+
		"\u0005 \u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02ca\u0003"+
		"J%\u0000\u02c8\u02ca\u0005\u0010\u0000\u0000\u02c9\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cd\u0005\u0005\u0000\u0000\u02cc\u02bd\u0001\u0000\u0000"+
		"\u0000\u02cc\u02c2\u0001\u0000\u0000\u0000\u02cdE\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u0005r\u0000\u0000\u02cf\u02eb\u0005\u0004\u0000\u0000\u02d0"+
		"\u02d1\u0007\u0011\u0000\u0000\u02d1\u02d2\u0005\u0003\u0000\u0000\u02d2"+
		"\u02d3\u0003~?\u0000\u02d3\u02d4\u0005\u0003\u0000\u0000\u02d4\u02d5\u0005"+
		"H\u0000\u0000\u02d5\u02ec\u0001\u0000\u0000\u0000\u02d6\u02d7\u0007\u0012"+
		"\u0000\u0000\u02d7\u02d8\u0005\u0003\u0000\u0000\u02d8\u02d9\u0003~?\u0000"+
		"\u02d9\u02da\u0005\u0003\u0000\u0000\u02da\u02db\u0003~?\u0000\u02db\u02ec"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005z\u0000\u0000\u02dd\u02de\u0005"+
		"\u0003\u0000\u0000\u02de\u02df\u0003~?\u0000\u02df\u02e0\u0005\u0003\u0000"+
		"\u0000\u02e0\u02e1\u0005\u008a\u0000\u0000\u02e1\u02e2\u0005\u0003\u0000"+
		"\u0000\u02e2\u02e3\u0003~?\u0000\u02e3\u02ec\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e5\u0003~?\u0000\u02e5\u02e6\u0005\u0003\u0000\u0000\u02e6\u02e7\u0003"+
		"~?\u0000\u02e7\u02ec\u0001\u0000\u0000\u0000\u02e8\u02e9\u0003\u0084B"+
		"\u0000\u02e9\u02ea\u0005\u0003\u0000\u0000\u02ea\u02ec\u0001\u0000\u0000"+
		"\u0000\u02eb\u02d0\u0001\u0000\u0000\u0000\u02eb\u02d6\u0001\u0000\u0000"+
		"\u0000\u02eb\u02dc\u0001\u0000\u0000\u0000\u02eb\u02e4\u0001\u0000\u0000"+
		"\u0000\u02eb\u02e8\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0005\u0005\u0000\u0000\u02eeG\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0005\u001e\u0000\u0000\u02f0\u02f1\u0005\u0004\u0000\u0000"+
		"\u02f1\u02f2\u00034\u001a\u0000\u02f2\u0306\u0005\u0018\u0000\u0000\u02f3"+
		"\u0307\u0005>\u0000\u0000\u02f4\u02fc\u0005V\u0000\u0000\u02f5\u02f6\u0005"+
		"\u0004\u0000\u0000\u02f6\u02f9\u0005\u00a0\u0000\u0000\u02f7\u02f8\u0005"+
		"\u0007\u0000\u0000\u02f8\u02fa\u0005\u00a0\u0000\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fd\u0005\u0005\u0000\u0000\u02fc\u02f5\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u0307\u0001"+
		"\u0000\u0000\u0000\u02fe\u0302\u0005e\u0000\u0000\u02ff\u0300\u0005\u0004"+
		"\u0000\u0000\u0300\u0301\u0005\u00a0\u0000\u0000\u0301\u0303\u0005\u0005"+
		"\u0000\u0000\u0302\u02ff\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000"+
		"\u0000\u0000\u0303\u0307\u0001\u0000\u0000\u0000\u0304\u0307\u0005A\u0000"+
		"\u0000\u0305\u0307\u0003\u0084B\u0000\u0306\u02f3\u0001\u0000\u0000\u0000"+
		"\u0306\u02f4\u0001\u0000\u0000\u0000\u0306\u02fe\u0001\u0000\u0000\u0000"+
		"\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0305\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u0309\u0005\u0005\u0000\u0000"+
		"\u0309I\u0001\u0000\u0000\u0000\u030a\u030f\u0003L&\u0000\u030b\u030c"+
		"\u0007\u0013\u0000\u0000\u030c\u030e\u0003L&\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030e\u0311\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310K\u0001\u0000\u0000"+
		"\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312\u0314\u0005,\u0000\u0000"+
		"\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000\u0000"+
		"\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0323\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000"+
		"\u0318\u0324\u00034\u001a\u0000\u0319\u0324\u0003N\'\u0000\u031a\u0324"+
		"\u0003P(\u0000\u031b\u0324\u0003R)\u0000\u031c\u0324\u0003T*\u0000\u031d"+
		"\u0324\u0003V+\u0000\u031e\u0324\u0003X,\u0000\u031f\u0320\u0005\u0004"+
		"\u0000\u0000\u0320\u0321\u0003J%\u0000\u0321\u0322\u0005\u0005\u0000\u0000"+
		"\u0322\u0324\u0001\u0000\u0000\u0000\u0323\u0318\u0001\u0000\u0000\u0000"+
		"\u0323\u0319\u0001\u0000\u0000\u0000\u0323\u031a\u0001\u0000\u0000\u0000"+
		"\u0323\u031b\u0001\u0000\u0000\u0000\u0323\u031c\u0001\u0000\u0000\u0000"+
		"\u0323\u031d\u0001\u0000\u0000\u0000\u0323\u031e\u0001\u0000\u0000\u0000"+
		"\u0323\u031f\u0001\u0000\u0000\u0000\u0324M\u0001\u0000\u0000\u0000\u0325"+
		"\u0329\u00034\u001a\u0000\u0326\u0328\u0005,\u0000\u0000\u0327\u0326\u0001"+
		"\u0000\u0000\u0000\u0328\u032b\u0001\u0000\u0000\u0000\u0329\u0327\u0001"+
		"\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0001"+
		"\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032c\u032d\u0005"+
		"+\u0000\u0000\u032d\u0330\u00034\u001a\u0000\u032e\u032f\u0005$\u0000"+
		"\u0000\u032f\u0331\u0003z=\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330"+
		"\u0331\u0001\u0000\u0000\u0000\u0331O\u0001\u0000\u0000\u0000\u0332\u0333"+
		"\u00034\u001a\u0000\u0333\u0335\u0005)\u0000\u0000\u0334\u0336\u0005,"+
		"\u0000\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0005-\u0000"+
		"\u0000\u0338Q\u0001\u0000\u0000\u0000\u0339\u033a\u00034\u001a\u0000\u033a"+
		"\u033b\u0007\u0014\u0000\u0000\u033b\u033c\u00034\u001a\u0000\u033cS\u0001"+
		"\u0000\u0000\u0000\u033d\u033e\u00034\u001a\u0000\u033e\u033f\u0005\u001b"+
		"\u0000\u0000\u033f\u0340\u00034\u001a\u0000\u0340\u0341\u0005\u0017\u0000"+
		"\u0000\u0341\u0342\u00034\u001a\u0000\u0342U\u0001\u0000\u0000\u0000\u0343"+
		"\u0349\u00034\u001a\u0000\u0344\u0345\u0005\u0004\u0000\u0000\u0345\u0346"+
		"\u0003Z-\u0000\u0346\u0347\u0005\u0005\u0000\u0000\u0347\u0349\u0001\u0000"+
		"\u0000\u0000\u0348\u0343\u0001\u0000\u0000\u0000\u0348\u0344\u0001\u0000"+
		"\u0000\u0000\u0349\u034d\u0001\u0000\u0000\u0000\u034a\u034c\u0005,\u0000"+
		"\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034c\u034f\u0001\u0000\u0000"+
		"\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000"+
		"\u0000\u034e\u0350\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000"+
		"\u0000\u0350\u0351\u0007\u0015\u0000\u0000\u0351\u0354\u0005\u0004\u0000"+
		"\u0000\u0352\u0355\u0003\b\u0004\u0000\u0353\u0355\u0003Z-\u0000\u0354"+
		"\u0352\u0001\u0000\u0000\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0355"+
		"\u0356\u0001\u0000\u0000\u0000\u0356\u0357\u0005\u0005\u0000\u0000\u0357"+
		"W\u0001\u0000\u0000\u0000\u0358\u0359\u00034\u001a\u0000\u0359\u035a\u0005"+
		"Z\u0000\u0000\u035a\u035b\u0003\u0084B\u0000\u035bY\u0001\u0000\u0000"+
		"\u0000\u035c\u0361\u0003\\.\u0000\u035d\u035e\u0005\u0007\u0000\u0000"+
		"\u035e\u0360\u0003\\.\u0000\u035f\u035d\u0001\u0000\u0000\u0000\u0360"+
		"\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361"+
		"\u0362\u0001\u0000\u0000\u0000\u0362[\u0001\u0000\u0000\u0000\u0363\u0361"+
		"\u0001\u0000\u0000\u0000\u0364\u0367\u00034\u001a\u0000\u0365\u0367\u0003"+
		"J%\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0365\u0001\u0000\u0000"+
		"\u0000\u0367]\u0001\u0000\u0000\u0000\u0368\u036d\u0003`0\u0000\u0369"+
		"\u036a\u0005\u0007\u0000\u0000\u036a\u036c\u0003`0\u0000\u036b\u0369\u0001"+
		"\u0000\u0000\u0000\u036c\u036f\u0001\u0000\u0000\u0000\u036d\u036b\u0001"+
		"\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e_\u0001\u0000"+
		"\u0000\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u0370\u0371\u0005\u0004"+
		"\u0000\u0000\u0371\u0372\u0003`0\u0000\u0372\u0373\u0005\u0005\u0000\u0000"+
		"\u0373\u0391\u0001\u0000\u0000\u0000\u0374\u0379\u0003d2\u0000\u0375\u0379"+
		"\u0003b1\u0000\u0376\u0379\u0003h4\u0000\u0377\u0379\u0003j5\u0000\u0378"+
		"\u0374\u0001\u0000\u0000\u0000\u0378\u0375\u0001\u0000\u0000\u0000\u0378"+
		"\u0376\u0001\u0000\u0000\u0000\u0378\u0377\u0001\u0000\u0000\u0000\u0379"+
		"\u037b\u0001\u0000\u0000\u0000\u037a\u037c\u0003v;\u0000\u037b\u037a\u0001"+
		"\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u0389\u0001"+
		"\u0000\u0000\u0000\u037d\u0382\u0005\u0004\u0000\u0000\u037e\u0383\u0003"+
		"d2\u0000\u037f\u0383\u0003b1\u0000\u0380\u0383\u0003h4\u0000\u0381\u0383"+
		"\u0003\b\u0004\u0000\u0382\u037e\u0001\u0000\u0000\u0000\u0382\u037f\u0001"+
		"\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0382\u0381\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0386\u0005"+
		"\u0005\u0000\u0000\u0385\u0387\u0003v;\u0000\u0386\u0385\u0001\u0000\u0000"+
		"\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u0389\u0001\u0000\u0000"+
		"\u0000\u0388\u0378\u0001\u0000\u0000\u0000\u0388\u037d\u0001\u0000\u0000"+
		"\u0000\u0389\u038d\u0001\u0000\u0000\u0000\u038a\u038c\u0003l6\u0000\u038b"+
		"\u038a\u0001\u0000\u0000\u0000\u038c\u038f\u0001\u0000\u0000\u0000\u038d"+
		"\u038b\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e"+
		"\u0391\u0001\u0000\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u0390"+
		"\u0370\u0001\u0000\u0000\u0000\u0390\u0388\u0001\u0000\u0000\u0000\u0391"+
		"a\u0001\u0000\u0000\u0000\u0392\u0399\u0003\u0084B\u0000\u0393\u0394\u0003"+
		"\u0084B\u0000\u0394\u0395\u0005\u0003\u0000\u0000\u0395\u0396\u0003~?"+
		"\u0000\u0396\u0399\u0001\u0000\u0000\u0000\u0397\u0399\u0003~?\u0000\u0398"+
		"\u0392\u0001\u0000\u0000\u0000\u0398\u0393\u0001\u0000\u0000\u0000\u0398"+
		"\u0397\u0001\u0000\u0000\u0000\u0399c\u0001\u0000\u0000\u0000\u039a\u039b"+
		"\u0003\u0084B\u0000\u039b\u039c\u0005\u0003\u0000\u0000\u039c\u03a8\u0007"+
		"\u0016\u0000\u0000\u039d\u039e\u0005\u0004\u0000\u0000\u039e\u03a3\u0003"+
		"f3\u0000\u039f\u03a0\u0005\u0007\u0000\u0000\u03a0\u03a2\u0003f3\u0000"+
		"\u03a1\u039f\u0001\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a6\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a7\u0005\u0005\u0000\u0000\u03a7\u03a9\u0001\u0000\u0000\u0000"+
		"\u03a8\u039d\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000"+
		"\u03a9\u03b4\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005\u0086\u0000\u0000"+
		"\u03ab\u03ac\u0005\u0003\u0000\u0000\u03ac\u03ad\u0003~?\u0000\u03ad\u03af"+
		"\u0005\u0004\u0000\u0000\u03ae\u03b0\u0003\u0082A\u0000\u03af\u03ae\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b2\u0005\u0005\u0000\u0000\u03b2\u03b4\u0001"+
		"\u0000\u0000\u0000\u03b3\u039a\u0001\u0000\u0000\u0000\u03b3\u03aa\u0001"+
		"\u0000\u0000\u0000\u03b4e\u0001\u0000\u0000\u0000\u03b5\u03b7\u0003J%"+
		"\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b7g\u0001\u0000\u0000\u0000\u03b8\u03b9\u0003\u0082A\u0000\u03b9"+
		"i\u0001\u0000\u0000\u0000\u03ba\u03bb\u0003\u0084B\u0000\u03bb\u03bc\u0005"+
		"\u0003\u0000\u0000\u03bc\u03bd\u0005\u00b3\u0000\u0000\u03bd\u03be\u0005"+
		"\u0003\u0000\u0000\u03be\u03bf\u0003~?\u0000\u03bf\u03cb\u0001\u0000\u0000"+
		"\u0000\u03c0\u03c1\u0003\u0084B\u0000\u03c1\u03c2\u0005\u0003\u0000\u0000"+
		"\u03c2\u03c3\u0005\u00b4\u0000\u0000\u03c3\u03c4\u0005\u0003\u0000\u0000"+
		"\u03c4\u03c5\u0003~?\u0000\u03c5\u03c6\u0005\u0003\u0000\u0000\u03c6\u03c7"+
		"\u0005\u00b5\u0000\u0000\u03c7\u03c8\u0005\u0003\u0000\u0000\u03c8\u03c9"+
		"\u0003~?\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000\u03ca\u03ba\u0001\u0000"+
		"\u0000\u0000\u03ca\u03c0\u0001\u0000\u0000\u0000\u03cbk\u0001\u0000\u0000"+
		"\u0000\u03cc\u03d1\u0003n7\u0000\u03cd\u03d1\u0003p8\u0000\u03ce\u03d1"+
		"\u0003r9\u0000\u03cf\u03d1\u0003t:\u0000\u03d0\u03cc\u0001\u0000\u0000"+
		"\u0000\u03d0\u03cd\u0001\u0000\u0000\u0000\u03d0\u03ce\u0001\u0000\u0000"+
		"\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d3\u0003`0\u0000\u03d3\u03d4\u0005\u001c\u0000\u0000\u03d4"+
		"\u03d5\u0003J%\u0000\u03d5m\u0001\u0000\u0000\u0000\u03d6\u03d7\u0007"+
		"\u0017\u0000\u0000\u03d7o\u0001\u0000\u0000\u0000\u03d8\u03d9\u0007\u0018"+
		"\u0000\u0000\u03d9q\u0001\u0000\u0000\u0000\u03da\u03db\u0007\u0019\u0000"+
		"\u0000\u03dbs\u0001\u0000\u0000\u0000\u03dc\u03dd\u0007\u001a\u0000\u0000"+
		"\u03ddu\u0001\u0000\u0000\u0000\u03de\u03e0\u0005\u0018\u0000\u0000\u03df"+
		"\u03de\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e2\u0003~?\u0000\u03e2w\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e6\u0003\u0082A\u0000\u03e4\u03e6\u0005\u00a0"+
		"\u0000\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e6y\u0001\u0000\u0000\u0000\u03e7\u03e9\u0005\u00b6\u0000"+
		"\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000"+
		"\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000"+
		"\u0000\u03eb{\u0001\u0000\u0000\u0000\u03ec\u03ed\u0007\u001b\u0000\u0000"+
		"\u03ed}\u0001\u0000\u0000\u0000\u03ee\u03ef\u0007\u001c\u0000\u0000\u03ef"+
		"\u007f\u0001\u0000\u0000\u0000\u03f0\u03f2\u0005\u0003\u0000\u0000\u03f1"+
		"\u03f0\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2"+
		"\u0409\u0001\u0000\u0000\u0000\u03f3\u03f5\u0005\u0012\u0000\u0000\u03f4"+
		"\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7"+
		"\u040a\u0001\u0000\u0000\u0000\u03f8\u040a\u0003~?\u0000\u03f9\u03fc\u0003"+
		"~?\u0000\u03fa\u03fc\u0005\u0012\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fa\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000"+
		"\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fe\u0402\u0001\u0000\u0000\u0000\u03ff\u0401\u0005\u00a0\u0000"+
		"\u0000\u0400\u03ff\u0001\u0000\u0000\u0000\u0401\u0404\u0001\u0000\u0000"+
		"\u0000\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
		"\u0000\u0403\u0406\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000\u0000"+
		"\u0000\u0405\u03fb\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000"+
		"\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000"+
		"\u0000\u0408\u040a\u0001\u0000\u0000\u0000\u0409\u03f4\u0001\u0000\u0000"+
		"\u0000\u0409\u03f8\u0001\u0000\u0000\u0000\u0409\u0405\u0001\u0000\u0000"+
		"\u0000\u040a\u0081\u0001\u0000\u0000\u0000\u040b\u040c\u0005\u0013\u0000"+
		"\u0000\u040c\u040d\u0005\u00a5\u0000\u0000\u040d\u0083\u0001\u0000\u0000"+
		"\u0000\u040e\u040f\u0007\u001d\u0000\u0000\u040f\u0410\u0005\u0003\u0000"+
		"\u0000\u0410\u0411\u0003~?\u0000\u0411\u0085\u0001\u0000\u0000\u0000p"+
		"\u008b\u008f\u0095\u00aa\u00af\u00b3\u00b5\u00b9\u00be\u00c0\u00c5\u00c9"+
		"\u00ce\u00d2\u00d6\u00e4\u00ef\u00f2\u00f6\u00fa\u00fc\u0105\u010d\u0112"+
		"\u0116\u0119\u011e\u0144\u014e\u0156\u0159\u0160\u0167\u016b\u0178\u0187"+
		"\u018f\u0194\u019c\u01a3\u01a5\u01a9\u01b1\u01b8\u01bb\u01bd\u01c4\u01c8"+
		"\u01d1\u01d9\u01db\u01e4\u01eb\u0202\u020e\u0211\u0218\u021c\u0224\u0228"+
		"\u022f\u0233\u0242\u024e\u0256\u0259\u02bb\u02c5\u02c9\u02cc\u02eb\u02f9"+
		"\u02fc\u0302\u0306\u030f\u0315\u0323\u0329\u0330\u0335\u0348\u034d\u0354"+
		"\u0361\u0366\u036d\u0378\u037b\u0382\u0386\u0388\u038d\u0390\u0398\u03a3"+
		"\u03a8\u03af\u03b3\u03b6\u03ca\u03d0\u03df\u03e5\u03ea\u03f1\u03f6\u03fb"+
		"\u03fd\u0402\u0407\u0409";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}