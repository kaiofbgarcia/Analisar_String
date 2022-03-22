// Generated from c:\Users\kaiof\OneDrive\Área de Trabalho\Comp\Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CHARC=38, 
		NUMINT=39, NDOUBLE=40, ID=41, STR=42, WS=43, COM=44;
	public static final int
		RULE_prog = 0, RULE_global = 1, RULE_num = 2, RULE_function = 3, RULE_type = 4, 
		RULE_param = 5, RULE_paramcomplx = 6, RULE_block = 7, RULE_cmd = 8, RULE_forr = 9, 
		RULE_forinit = 10, RULE_dowhile = 11, RULE_whilee = 12, RULE_swtstm = 13, 
		RULE_cases = 14, RULE_retrn = 15, RULE_atrib = 16, RULE_print = 17, RULE_printargs = 18, 
		RULE_scan = 19, RULE_scanargs = 20, RULE_scanargstype = 21, RULE_expr = 22, 
		RULE_term = 23, RULE_fact = 24, RULE_funccallact = 25, RULE_funccall = 26, 
		RULE_downfact = 27, RULE_funcargs = 28, RULE_decl = 29, RULE_declatrib = 30, 
		RULE_ifstm = 31, RULE_cond = 32, RULE_cdand = 33, RULE_cndts = 34, RULE_relop = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "global", "num", "function", "type", "param", "paramcomplx", 
			"block", "cmd", "forr", "forinit", "dowhile", "whilee", "swtstm", "cases", 
			"retrn", "atrib", "print", "printargs", "scan", "scanargs", "scanargstype", 
			"expr", "term", "fact", "funccallact", "funccall", "downfact", "funcargs", 
			"decl", "declatrib", "ifstm", "cond", "cdand", "cndts", "relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'int'", "'double'", "'char'", "','", "'*'", 
			"'['", "']'", "'{'", "'}'", "'for'", "'do'", "'while'", "'switch'", "'case'", 
			"':'", "'break'", "'return'", "'='", "'+'", "'-'", "'printf'", "'scanf'", 
			"'&'", "'/'", "'if'", "'else'", "'||'", "'&&'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CHARC", "NUMINT", "NDOUBLE", "ID", "STR", "WS", "COM"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(72);
					global();
					}
					break;
				case 2:
					{
					setState(73);
					function();
					}
					break;
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0) );
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

	public static class GlobalContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			decl();
			setState(79);
			match(T__0);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(ExprParser.NUMINT, 0); }
		public TerminalNode NDOUBLE() { return getToken(ExprParser.NDOUBLE, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==NUMINT || _la==NDOUBLE) ) {
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			type();
			setState(84);
			match(ID);
			setState(85);
			match(T__1);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(86);
				param();
				}
			}

			setState(89);
			match(T__2);
			setState(90);
			block();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class ParamContext extends ParserRuleContext {
		public ParamcomplxContext paramcomplx() {
			return getRuleContext(ParamcomplxContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				paramcomplx();
				setState(95);
				match(T__6);
				setState(96);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				paramcomplx();
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

	public static class ParamcomplxContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ParamcomplxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramcomplx; }
	}

	public final ParamcomplxContext paramcomplx() throws RecognitionException {
		ParamcomplxContext _localctx = new ParamcomplxContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramcomplx);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				type();
				setState(102);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				type();
				setState(105);
				match(T__7);
				setState(106);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				type();
				setState(109);
				match(ID);
				setState(110);
				match(T__8);
				setState(111);
				match(T__9);
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

	public static class BlockContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__10);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				cmd();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << ID))) != 0) );
			setState(121);
			match(T__11);
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

	public static class CmdContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public RetrnContext retrn() {
			return getRuleContext(RetrnContext.class,0);
		}
		public FunccallactContext funccallact() {
			return getRuleContext(FunccallactContext.class,0);
		}
		public IfstmContext ifstm() {
			return getRuleContext(IfstmContext.class,0);
		}
		public SwtstmContext swtstm() {
			return getRuleContext(SwtstmContext.class,0);
		}
		public WhileeContext whilee() {
			return getRuleContext(WhileeContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public ForrContext forr() {
			return getRuleContext(ForrContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				atrib();
				setState(124);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				print();
				setState(127);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				scan();
				setState(130);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				decl();
				setState(133);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				retrn();
				setState(136);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				funccallact();
				setState(139);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				ifstm();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				swtstm();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				whilee();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				dowhile();
				setState(145);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(147);
				forr();
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

	public static class ForrContext extends ParserRuleContext {
		public ForinitContext forinit() {
			return getRuleContext(ForinitContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forr; }
	}

	public final ForrContext forr() throws RecognitionException {
		ForrContext _localctx = new ForrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__12);
			setState(151);
			match(T__1);
			setState(152);
			forinit();
			setState(153);
			match(T__0);
			setState(154);
			cond(0);
			setState(155);
			match(T__0);
			setState(156);
			atrib();
			setState(157);
			match(T__2);
			setState(158);
			block();
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

	public static class ForinitContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public DeclatribContext declatrib() {
			return getRuleContext(DeclatribContext.class,0);
		}
		public ForinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinit; }
	}

	public final ForinitContext forinit() throws RecognitionException {
		ForinitContext _localctx = new ForinitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forinit);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				atrib();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				declatrib();
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

	public static class DowhileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__13);
			setState(165);
			block();
			setState(166);
			match(T__14);
			setState(167);
			match(T__1);
			setState(168);
			cond(0);
			setState(169);
			match(T__2);
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

	public static class WhileeContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilee; }
	}

	public final WhileeContext whilee() throws RecognitionException {
		WhileeContext _localctx = new WhileeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whilee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__14);
			setState(172);
			match(T__1);
			setState(173);
			cond(0);
			setState(174);
			match(T__2);
			setState(175);
			block();
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

	public static class SwtstmContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CasesContext> cases() {
			return getRuleContexts(CasesContext.class);
		}
		public CasesContext cases(int i) {
			return getRuleContext(CasesContext.class,i);
		}
		public SwtstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swtstm; }
	}

	public final SwtstmContext swtstm() throws RecognitionException {
		SwtstmContext _localctx = new SwtstmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_swtstm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__15);
			setState(178);
			match(T__1);
			setState(179);
			expr(0);
			setState(180);
			match(T__2);
			setState(181);
			match(T__10);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				cases();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
			setState(187);
			match(T__11);
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

	public static class CasesContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(ExprParser.NUMINT, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__16);
			setState(190);
			match(NUMINT);
			setState(191);
			match(T__17);
			setState(192);
			match(T__10);
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				cmd();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << ID))) != 0) );
			setState(198);
			match(T__18);
			setState(199);
			match(T__0);
			setState(200);
			match(T__11);
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

	public static class RetrnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrn; }
	}

	public final RetrnContext retrn() throws RecognitionException {
		RetrnContext _localctx = new RetrnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retrn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__19);
			setState(203);
			expr(0);
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

	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atrib);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ID);
				setState(206);
				match(T__20);
				setState(207);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__7);
				setState(209);
				match(ID);
				setState(210);
				match(T__20);
				setState(211);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(ID);
				setState(213);
				match(T__8);
				setState(214);
				expr(0);
				setState(215);
				match(T__9);
				setState(216);
				match(T__20);
				setState(217);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(ID);
				setState(220);
				match(T__21);
				setState(221);
				match(T__21);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(ID);
				setState(223);
				match(T__22);
				setState(224);
				match(T__22);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public PrintargsContext printargs() {
			return getRuleContext(PrintargsContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__23);
				setState(228);
				match(T__1);
				setState(229);
				match(STR);
				setState(230);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(T__23);
				setState(232);
				match(T__1);
				setState(233);
				match(STR);
				setState(234);
				match(T__6);
				setState(235);
				printargs();
				setState(236);
				match(T__2);
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

	public static class PrintargsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintargsContext printargs() {
			return getRuleContext(PrintargsContext.class,0);
		}
		public PrintargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printargs; }
	}

	public final PrintargsContext printargs() throws RecognitionException {
		PrintargsContext _localctx = new PrintargsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printargs);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				expr(0);
				setState(241);
				match(T__6);
				setState(242);
				printargs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				expr(0);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public ScanargsContext scanargs() {
			return getRuleContext(ScanargsContext.class,0);
		}
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__24);
			setState(248);
			match(T__1);
			setState(249);
			match(STR);
			setState(250);
			match(T__6);
			setState(251);
			scanargs();
			setState(252);
			match(T__2);
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

	public static class ScanargsContext extends ParserRuleContext {
		public ScanargstypeContext scanargstype() {
			return getRuleContext(ScanargstypeContext.class,0);
		}
		public ScanargsContext scanargs() {
			return getRuleContext(ScanargsContext.class,0);
		}
		public ScanargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanargs; }
	}

	public final ScanargsContext scanargs() throws RecognitionException {
		ScanargsContext _localctx = new ScanargsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scanargs);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				scanargstype();
				setState(255);
				match(T__6);
				setState(256);
				scanargs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				scanargstype();
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

	public static class ScanargstypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ScanargstypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanargstype; }
	}

	public final ScanargstypeContext scanargstype() throws RecognitionException {
		ScanargstypeContext _localctx = new ScanargstypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scanargstype);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__25);
				setState(262);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(T__25);
				setState(265);
				match(ID);
				setState(266);
				match(T__8);
				setState(267);
				expr(0);
				setState(268);
				match(T__9);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(273);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(276);
						match(T__21);
						setState(277);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(279);
						match(T__22);
						setState(280);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						term(0);
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						match(T__7);
						setState(293);
						fact();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(295);
						match(T__26);
						setState(296);
						fact();
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class FactContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode CHARC() { return getToken(ExprParser.CHARC, 0); }
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fact);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMINT:
			case NDOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				num();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(STR);
				}
				break;
			case CHARC:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(CHARC);
				}
				break;
			case T__1:
			case T__7:
			case T__25:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				funccall();
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

	public static class FunccallactContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
		}
		public FunccallactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccallact; }
	}

	public final FunccallactContext funccallact() throws RecognitionException {
		FunccallactContext _localctx = new FunccallactContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funccallact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ID);
			setState(309);
			match(T__1);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__25) | (1L << CHARC) | (1L << NUMINT) | (1L << NDOUBLE) | (1L << ID) | (1L << STR))) != 0)) {
				{
				setState(310);
				funcargs();
				}
			}

			setState(313);
			match(T__2);
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

	public static class FunccallContext extends ParserRuleContext {
		public FunccallactContext funccallact() {
			return getRuleContext(FunccallactContext.class,0);
		}
		public DownfactContext downfact() {
			return getRuleContext(DownfactContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funccall);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				funccallact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				downfact();
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

	public static class DownfactContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DownfactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_downfact; }
	}

	public final DownfactContext downfact() throws RecognitionException {
		DownfactContext _localctx = new DownfactContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_downfact);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(T__25);
				setState(321);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(T__7);
				setState(323);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(ID);
				setState(325);
				match(T__8);
				setState(326);
				expr(0);
				setState(327);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(T__1);
				setState(330);
				expr(0);
				setState(331);
				match(T__2);
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

	public static class FuncargsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
		}
		public FuncargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargs; }
	}

	public final FuncargsContext funcargs() throws RecognitionException {
		FuncargsContext _localctx = new FuncargsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funcargs);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				expr(0);
				setState(336);
				match(T__6);
				setState(337);
				funcargs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				expr(0);
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

	public static class DeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclatribContext declatrib() {
			return getRuleContext(DeclatribContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_decl);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				type();
				setState(343);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				type();
				setState(346);
				match(T__7);
				setState(347);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				type();
				setState(350);
				match(ID);
				setState(351);
				match(T__8);
				setState(352);
				expr(0);
				setState(353);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				declatrib();
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

	public static class DeclatribContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public DeclatribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declatrib; }
	}

	public final DeclatribContext declatrib() throws RecognitionException {
		DeclatribContext _localctx = new DeclatribContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declatrib);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				type();
				setState(359);
				match(ID);
				setState(360);
				match(T__20);
				setState(361);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				type();
				setState(364);
				match(T__7);
				setState(365);
				match(ID);
				setState(366);
				match(T__20);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(367);
					match(T__25);
					}
				}

				setState(370);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(T__5);
				setState(373);
				match(ID);
				setState(374);
				match(T__8);
				setState(375);
				match(T__9);
				setState(376);
				match(T__20);
				setState(377);
				match(STR);
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

	public static class IfstmContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstm; }
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifstm);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__27);
				setState(381);
				match(T__1);
				setState(382);
				cond(0);
				setState(383);
				match(T__2);
				setState(384);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__27);
				setState(387);
				match(T__1);
				setState(388);
				cond(0);
				setState(389);
				match(T__2);
				setState(390);
				block();
				setState(391);
				match(T__28);
				setState(392);
				block();
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

	public static class CondContext extends ParserRuleContext {
		public CdandContext cdand() {
			return getRuleContext(CdandContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			cdand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(399);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(400);
					match(T__29);
					setState(401);
					cdand(0);
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class CdandContext extends ParserRuleContext {
		public CndtsContext cndts() {
			return getRuleContext(CndtsContext.class,0);
		}
		public CdandContext cdand() {
			return getRuleContext(CdandContext.class,0);
		}
		public CdandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdand; }
	}

	public final CdandContext cdand() throws RecognitionException {
		return cdand(0);
	}

	private CdandContext cdand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CdandContext _localctx = new CdandContext(_ctx, _parentState);
		CdandContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_cdand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			cndts();
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CdandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cdand);
					setState(410);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(411);
					match(T__30);
					setState(412);
					cndts();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class CndtsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CndtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cndts; }
	}

	public final CndtsContext cndts() throws RecognitionException {
		CndtsContext _localctx = new CndtsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cndts);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				expr(0);
				setState(419);
				relop();
				setState(420);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(T__1);
				setState(423);
				cond(0);
				setState(424);
				match(T__2);
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

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 23:
			return term_sempred((TermContext)_localctx, predIndex);
		case 32:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 33:
			return cdand_sempred((CdandContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cdand_sempred(CdandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\6\2M\n\2\r\2\16\2N\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3"+
		"\t\3\t\6\tx\n\t\r\t\16\ty\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0097"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00a5"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\6\17\u00ba\n\17\r\17\16\17\u00bb\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\6\20\u00c5\n\20\r\20\16\20\u00c6\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e4\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f1\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00f8\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0106\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0111\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u011e\n\30\f\30\16\30\u0121\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u012c\n\31\f\31\16\31\u012f\13\31"+
		"\3\32\3\32\3\32\3\32\5\32\u0135\n\32\3\33\3\33\3\33\5\33\u013a\n\33\3"+
		"\33\3\33\3\34\3\34\5\34\u0140\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0150\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0157\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0167\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u0173\n \3 \3 \3 \3 \3 \3 \3 \3 \5 \u017d\n \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\5!\u018d\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0195\n\"\f"+
		"\"\16\"\u0198\13\"\3#\3#\3#\3#\3#\3#\7#\u01a0\n#\f#\16#\u01a3\13#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u01ad\n$\3%\3%\3%\2\6.\60BD&\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\5\3\2)*\3\2\6\b"+
		"\3\2\"\'\2\u01c2\2L\3\2\2\2\4P\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\n^\3\2\2"+
		"\2\fe\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22\u0096\3\2\2\2\24\u0098\3\2\2"+
		"\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00ad\3\2\2\2\34\u00b3\3\2\2\2"+
		"\36\u00bf\3\2\2\2 \u00cc\3\2\2\2\"\u00e3\3\2\2\2$\u00f0\3\2\2\2&\u00f7"+
		"\3\2\2\2(\u00f9\3\2\2\2*\u0105\3\2\2\2,\u0110\3\2\2\2.\u0112\3\2\2\2\60"+
		"\u0122\3\2\2\2\62\u0134\3\2\2\2\64\u0136\3\2\2\2\66\u013f\3\2\2\28\u014f"+
		"\3\2\2\2:\u0156\3\2\2\2<\u0166\3\2\2\2>\u017c\3\2\2\2@\u018c\3\2\2\2B"+
		"\u018e\3\2\2\2D\u0199\3\2\2\2F\u01ac\3\2\2\2H\u01ae\3\2\2\2JM\5\4\3\2"+
		"KM\5\b\5\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\3\3\2\2"+
		"\2PQ\5<\37\2QR\7\3\2\2R\5\3\2\2\2ST\t\2\2\2T\7\3\2\2\2UV\5\n\6\2VW\7+"+
		"\2\2WY\7\4\2\2XZ\5\f\7\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\5\2\2\\]\5"+
		"\20\t\2]\t\3\2\2\2^_\t\3\2\2_\13\3\2\2\2`a\5\16\b\2ab\7\t\2\2bc\5\f\7"+
		"\2cf\3\2\2\2df\5\16\b\2e`\3\2\2\2ed\3\2\2\2f\r\3\2\2\2gh\5\n\6\2hi\7+"+
		"\2\2it\3\2\2\2jk\5\n\6\2kl\7\n\2\2lm\7+\2\2mt\3\2\2\2no\5\n\6\2op\7+\2"+
		"\2pq\7\13\2\2qr\7\f\2\2rt\3\2\2\2sg\3\2\2\2sj\3\2\2\2sn\3\2\2\2t\17\3"+
		"\2\2\2uw\7\r\2\2vx\5\22\n\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{"+
		"\3\2\2\2{|\7\16\2\2|\21\3\2\2\2}~\5\"\22\2~\177\7\3\2\2\177\u0097\3\2"+
		"\2\2\u0080\u0081\5$\23\2\u0081\u0082\7\3\2\2\u0082\u0097\3\2\2\2\u0083"+
		"\u0084\5(\25\2\u0084\u0085\7\3\2\2\u0085\u0097\3\2\2\2\u0086\u0087\5<"+
		"\37\2\u0087\u0088\7\3\2\2\u0088\u0097\3\2\2\2\u0089\u008a\5 \21\2\u008a"+
		"\u008b\7\3\2\2\u008b\u0097\3\2\2\2\u008c\u008d\5\64\33\2\u008d\u008e\7"+
		"\3\2\2\u008e\u0097\3\2\2\2\u008f\u0097\5@!\2\u0090\u0097\5\34\17\2\u0091"+
		"\u0097\5\32\16\2\u0092\u0093\5\30\r\2\u0093\u0094\7\3\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0097\5\24\13\2\u0096}\3\2\2\2\u0096\u0080\3\2\2\2\u0096"+
		"\u0083\3\2\2\2\u0096\u0086\3\2\2\2\u0096\u0089\3\2\2\2\u0096\u008c\3\2"+
		"\2\2\u0096\u008f\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0096\u0095\3\2\2\2\u0097\23\3\2\2\2\u0098\u0099\7\17\2"+
		"\2\u0099\u009a\7\4\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7\3\2\2\u009c"+
		"\u009d\5B\"\2\u009d\u009e\7\3\2\2\u009e\u009f\5\"\22\2\u009f\u00a0\7\5"+
		"\2\2\u00a0\u00a1\5\20\t\2\u00a1\25\3\2\2\2\u00a2\u00a5\5\"\22\2\u00a3"+
		"\u00a5\5> \2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2"+
		"\u00a6\u00a7\7\20\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7\21\2\2\u00a9"+
		"\u00aa\7\4\2\2\u00aa\u00ab\5B\"\2\u00ab\u00ac\7\5\2\2\u00ac\31\3\2\2\2"+
		"\u00ad\u00ae\7\21\2\2\u00ae\u00af\7\4\2\2\u00af\u00b0\5B\"\2\u00b0\u00b1"+
		"\7\5\2\2\u00b1\u00b2\5\20\t\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\22\2\2\u00b4"+
		"\u00b5\7\4\2\2\u00b5\u00b6\5.\30\2\u00b6\u00b7\7\5\2\2\u00b7\u00b9\7\r"+
		"\2\2\u00b8\u00ba\5\36\20\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\16"+
		"\2\2\u00be\35\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0\u00c1\7)\2\2\u00c1\u00c2"+
		"\7\24\2\2\u00c2\u00c4\7\r\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\7\25\2\2\u00c9\u00ca\7\3\2\2\u00ca\u00cb\7\16\2\2"+
		"\u00cb\37\3\2\2\2\u00cc\u00cd\7\26\2\2\u00cd\u00ce\5.\30\2\u00ce!\3\2"+
		"\2\2\u00cf\u00d0\7+\2\2\u00d0\u00d1\7\27\2\2\u00d1\u00e4\5.\30\2\u00d2"+
		"\u00d3\7\n\2\2\u00d3\u00d4\7+\2\2\u00d4\u00d5\7\27\2\2\u00d5\u00e4\5."+
		"\30\2\u00d6\u00d7\7+\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5.\30\2\u00d9"+
		"\u00da\7\f\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\5.\30\2\u00dc\u00e4\3"+
		"\2\2\2\u00dd\u00de\7+\2\2\u00de\u00df\7\30\2\2\u00df\u00e4\7\30\2\2\u00e0"+
		"\u00e1\7+\2\2\u00e1\u00e2\7\31\2\2\u00e2\u00e4\7\31\2\2\u00e3\u00cf\3"+
		"\2\2\2\u00e3\u00d2\3\2\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7\32\2\2\u00e6\u00e7\7\4\2\2"+
		"\u00e7\u00e8\7,\2\2\u00e8\u00f1\7\5\2\2\u00e9\u00ea\7\32\2\2\u00ea\u00eb"+
		"\7\4\2\2\u00eb\u00ec\7,\2\2\u00ec\u00ed\7\t\2\2\u00ed\u00ee\5&\24\2\u00ee"+
		"\u00ef\7\5\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e9\3\2"+
		"\2\2\u00f1%\3\2\2\2\u00f2\u00f3\5.\30\2\u00f3\u00f4\7\t\2\2\u00f4\u00f5"+
		"\5&\24\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\5.\30\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fa\7\33\2\2\u00fa\u00fb\7\4\2"+
		"\2\u00fb\u00fc\7,\2\2\u00fc\u00fd\7\t\2\2\u00fd\u00fe\5*\26\2\u00fe\u00ff"+
		"\7\5\2\2\u00ff)\3\2\2\2\u0100\u0101\5,\27\2\u0101\u0102\7\t\2\2\u0102"+
		"\u0103\5*\26\2\u0103\u0106\3\2\2\2\u0104\u0106\5,\27\2\u0105\u0100\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106+\3\2\2\2\u0107\u0108\7\34\2\2\u0108\u0111"+
		"\7+\2\2\u0109\u0111\7+\2\2\u010a\u010b\7\34\2\2\u010b\u010c\7+\2\2\u010c"+
		"\u010d\7\13\2\2\u010d\u010e\5.\30\2\u010e\u010f\7\f\2\2\u010f\u0111\3"+
		"\2\2\2\u0110\u0107\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010a\3\2\2\2\u0111"+
		"-\3\2\2\2\u0112\u0113\b\30\1\2\u0113\u0114\5\60\31\2\u0114\u011f\3\2\2"+
		"\2\u0115\u0116\f\6\2\2\u0116\u0117\7\30\2\2\u0117\u011e\5\60\31\2\u0118"+
		"\u0119\f\5\2\2\u0119\u011a\7\31\2\2\u011a\u011e\5\60\31\2\u011b\u011c"+
		"\f\4\2\2\u011c\u011e\5\60\31\2\u011d\u0115\3\2\2\2\u011d\u0118\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120/\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\b\31\1\2\u0123"+
		"\u0124\5\62\32\2\u0124\u012d\3\2\2\2\u0125\u0126\f\5\2\2\u0126\u0127\7"+
		"\n\2\2\u0127\u012c\5\62\32\2\u0128\u0129\f\4\2\2\u0129\u012a\7\35\2\2"+
		"\u012a\u012c\5\62\32\2\u012b\u0125\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\61\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0135\5\6\4\2\u0131\u0135\7,\2\2\u0132\u0135\7(\2"+
		"\2\u0133\u0135\5\66\34\2\u0134\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\63\3\2\2\2\u0136\u0137\7+\2\2"+
		"\u0137\u0139\7\4\2\2\u0138\u013a\5:\36\2\u0139\u0138\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\5\2\2\u013c\65\3\2\2\2\u013d"+
		"\u0140\5\64\33\2\u013e\u0140\58\35\2\u013f\u013d\3\2\2\2\u013f\u013e\3"+
		"\2\2\2\u0140\67\3\2\2\2\u0141\u0150\7+\2\2\u0142\u0143\7\34\2\2\u0143"+
		"\u0150\7+\2\2\u0144\u0145\7\n\2\2\u0145\u0150\7+\2\2\u0146\u0147\7+\2"+
		"\2\u0147\u0148\7\13\2\2\u0148\u0149\5.\30\2\u0149\u014a\7\f\2\2\u014a"+
		"\u0150\3\2\2\2\u014b\u014c\7\4\2\2\u014c\u014d\5.\30\2\u014d\u014e\7\5"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u0141\3\2\2\2\u014f\u0142\3\2\2\2\u014f"+
		"\u0144\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u014b\3\2\2\2\u01509\3\2\2\2"+
		"\u0151\u0152\5.\30\2\u0152\u0153\7\t\2\2\u0153\u0154\5:\36\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0157\5.\30\2\u0156\u0151\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		";\3\2\2\2\u0158\u0159\5\n\6\2\u0159\u015a\7+\2\2\u015a\u0167\3\2\2\2\u015b"+
		"\u015c\5\n\6\2\u015c\u015d\7\n\2\2\u015d\u015e\7+\2\2\u015e\u0167\3\2"+
		"\2\2\u015f\u0160\5\n\6\2\u0160\u0161\7+\2\2\u0161\u0162\7\13\2\2\u0162"+
		"\u0163\5.\30\2\u0163\u0164\7\f\2\2\u0164\u0167\3\2\2\2\u0165\u0167\5>"+
		" \2\u0166\u0158\3\2\2\2\u0166\u015b\3\2\2\2\u0166\u015f\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167=\3\2\2\2\u0168\u0169\5\n\6\2\u0169\u016a\7+\2\2\u016a"+
		"\u016b\7\27\2\2\u016b\u016c\5.\30\2\u016c\u017d\3\2\2\2\u016d\u016e\5"+
		"\n\6\2\u016e\u016f\7\n\2\2\u016f\u0170\7+\2\2\u0170\u0172\7\27\2\2\u0171"+
		"\u0173\7\34\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3"+
		"\2\2\2\u0174\u0175\7+\2\2\u0175\u017d\3\2\2\2\u0176\u0177\7\b\2\2\u0177"+
		"\u0178\7+\2\2\u0178\u0179\7\13\2\2\u0179\u017a\7\f\2\2\u017a\u017b\7\27"+
		"\2\2\u017b\u017d\7,\2\2\u017c\u0168\3\2\2\2\u017c\u016d\3\2\2\2\u017c"+
		"\u0176\3\2\2\2\u017d?\3\2\2\2\u017e\u017f\7\36\2\2\u017f\u0180\7\4\2\2"+
		"\u0180\u0181\5B\"\2\u0181\u0182\7\5\2\2\u0182\u0183\5\20\t\2\u0183\u018d"+
		"\3\2\2\2\u0184\u0185\7\36\2\2\u0185\u0186\7\4\2\2\u0186\u0187\5B\"\2\u0187"+
		"\u0188\7\5\2\2\u0188\u0189\5\20\t\2\u0189\u018a\7\37\2\2\u018a\u018b\5"+
		"\20\t\2\u018b\u018d\3\2\2\2\u018c\u017e\3\2\2\2\u018c\u0184\3\2\2\2\u018d"+
		"A\3\2\2\2\u018e\u018f\b\"\1\2\u018f\u0190\5D#\2\u0190\u0196\3\2\2\2\u0191"+
		"\u0192\f\4\2\2\u0192\u0193\7 \2\2\u0193\u0195\5D#\2\u0194\u0191\3\2\2"+
		"\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197C"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\b#\1\2\u019a\u019b\5F$\2\u019b"+
		"\u01a1\3\2\2\2\u019c\u019d\f\4\2\2\u019d\u019e\7!\2\2\u019e\u01a0\5F$"+
		"\2\u019f\u019c\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2E\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\5.\30\2\u01a5"+
		"\u01a6\5H%\2\u01a6\u01a7\5.\30\2\u01a7\u01ad\3\2\2\2\u01a8\u01a9\7\4\2"+
		"\2\u01a9\u01aa\5B\"\2\u01aa\u01ab\7\5\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a4"+
		"\3\2\2\2\u01ac\u01a8\3\2\2\2\u01adG\3\2\2\2\u01ae\u01af\t\4\2\2\u01af"+
		"I\3\2\2\2!LNYesy\u0096\u00a4\u00bb\u00c6\u00e3\u00f0\u00f7\u0105\u0110"+
		"\u011d\u011f\u012b\u012d\u0134\u0139\u013f\u014f\u0156\u0166\u0172\u017c"+
		"\u018c\u0196\u01a1\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}