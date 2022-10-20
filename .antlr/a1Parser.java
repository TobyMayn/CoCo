// Generated from c:\DTU\3-semester\Compilerteknik\lorteopgave\CoCo\a1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, LATCH=13, VARIABLE=14, CONST=15, WHITESPACE=16, 
		KOMMENTAR=17, MULTILINEKOMMENTAR=18;
	public static final int
		RULE_start = 0, RULE_updateDecl = 1, RULE_simInp = 2, RULE_latchDec = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "updateDecl", "simInp", "latchDec", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.update'", "'.simulate'", 
			"'='", "'->'", "'!'", "'&&'", "'||'", "'('", "')'", "'.latch'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "LATCH", "VARIABLE", "CONST", "WHITESPACE", "KOMMENTAR", "MULTILINEKOMMENTAR"
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
	public String getGrammarFileName() { return "a1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public a1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Token hard;
		public Token VARIABLE;
		public List<Token> in = new ArrayList<Token>();
		public List<Token> out = new ArrayList<Token>();
		public LatchDecContext latchDec;
		public List<LatchDecContext> latch = new ArrayList<LatchDecContext>();
		public UpdateDeclContext updateDecl;
		public List<UpdateDeclContext> up = new ArrayList<UpdateDeclContext>();
		public SimInpContext simInp;
		public List<SimInpContext> sim = new ArrayList<SimInpContext>();
		public TerminalNode EOF() { return getToken(a1Parser.EOF, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(a1Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(a1Parser.VARIABLE, i);
		}
		public List<LatchDecContext> latchDec() {
			return getRuleContexts(LatchDecContext.class);
		}
		public LatchDecContext latchDec(int i) {
			return getRuleContext(LatchDecContext.class,i);
		}
		public List<UpdateDeclContext> updateDecl() {
			return getRuleContexts(UpdateDeclContext.class);
		}
		public UpdateDeclContext updateDecl(int i) {
			return getRuleContext(UpdateDeclContext.class,i);
		}
		public List<SimInpContext> simInp() {
			return getRuleContexts(SimInpContext.class);
		}
		public SimInpContext simInp(int i) {
			return getRuleContext(SimInpContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			((StartContext)_localctx).hard = match(VARIABLE);
			setState(12);
			match(T__1);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				((StartContext)_localctx).VARIABLE = match(VARIABLE);
				((StartContext)_localctx).in.add(((StartContext)_localctx).VARIABLE);
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(18);
			match(T__2);
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				((StartContext)_localctx).VARIABLE = match(VARIABLE);
				((StartContext)_localctx).out.add(((StartContext)_localctx).VARIABLE);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				((StartContext)_localctx).latchDec = latchDec();
				((StartContext)_localctx).latch.add(((StartContext)_localctx).latchDec);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LATCH );
			setState(29);
			match(T__3);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				((StartContext)_localctx).updateDecl = updateDecl();
				((StartContext)_localctx).up.add(((StartContext)_localctx).updateDecl);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(35);
			match(T__4);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((StartContext)_localctx).simInp = simInp();
				((StartContext)_localctx).sim.add(((StartContext)_localctx).simInp);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(41);
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

	public static class UpdateDeclContext extends ParserRuleContext {
		public UpdateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateDecl; }
	 
		public UpdateDeclContext() { }
		public void copyFrom(UpdateDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateContext extends UpdateDeclContext {
		public Token v1;
		public ExprContext e1;
		public TerminalNode VARIABLE() { return getToken(a1Parser.VARIABLE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public UpdateContext(UpdateDeclContext ctx) { copyFrom(ctx); }
	}

	public final UpdateDeclContext updateDecl() throws RecognitionException {
		UpdateDeclContext _localctx = new UpdateDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_updateDecl);
		try {
			int _alt;
			_localctx = new UpdateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((UpdateContext)_localctx).v1 = match(VARIABLE);
			setState(44);
			match(T__5);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					((UpdateContext)_localctx).e1 = expr(0);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class SimInpContext extends ParserRuleContext {
		public SimInpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simInp; }
	 
		public SimInpContext() { }
		public void copyFrom(SimInpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimulateContext extends SimInpContext {
		public Token v1;
		public Token c;
		public TerminalNode VARIABLE() { return getToken(a1Parser.VARIABLE, 0); }
		public TerminalNode CONST() { return getToken(a1Parser.CONST, 0); }
		public SimulateContext(SimInpContext ctx) { copyFrom(ctx); }
	}

	public final SimInpContext simInp() throws RecognitionException {
		SimInpContext _localctx = new SimInpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simInp);
		try {
			_localctx = new SimulateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((SimulateContext)_localctx).v1 = match(VARIABLE);
			setState(52);
			match(T__5);
			setState(53);
			((SimulateContext)_localctx).c = match(CONST);
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

	public static class LatchDecContext extends ParserRuleContext {
		public LatchDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchDec; }
	 
		public LatchDecContext() { }
		public void copyFrom(LatchDecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LatchContext extends LatchDecContext {
		public Token v1;
		public Token v2;
		public TerminalNode LATCH() { return getToken(a1Parser.LATCH, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(a1Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(a1Parser.VARIABLE, i);
		}
		public LatchContext(LatchDecContext ctx) { copyFrom(ctx); }
	}

	public final LatchDecContext latchDec() throws RecognitionException {
		LatchDecContext _localctx = new LatchDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_latchDec);
		try {
			_localctx = new LatchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LATCH);
			setState(56);
			((LatchContext)_localctx).v1 = match(VARIABLE);
			setState(57);
			match(T__6);
			setState(58);
			((LatchContext)_localctx).v2 = match(VARIABLE);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VariableContext extends ExprContext {
		public Token v1;
		public TerminalNode VARIABLE() { return getToken(a1Parser.VARIABLE, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstContext extends ExprContext {
		public Token c;
		public TerminalNode CONST() { return getToken(a1Parser.CONST, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				match(T__7);
				setState(62);
				((NotContext)_localctx).e1 = expr(6);
				}
				break;
			case T__10:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__10);
				setState(64);
				((ParenthesisContext)_localctx).e1 = expr(0);
				setState(65);
				match(T__11);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				((VariableContext)_localctx).v1 = match(VARIABLE);
				}
				break;
			case CONST:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				((ConstContext)_localctx).c = match(CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						match(T__8);
						setState(73);
						((AndContext)_localctx).e2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(75);
						match(T__9);
						setState(76);
						((OrContext)_localctx).e2 = expr(5);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\6\2\27\n\2\r\2\16\2\30\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\6\2\"\n"+
		"\2\r\2\16\2#\3\2\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\7\3\61\n\3"+
		"\f\3\16\3\64\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16"+
		"\6S\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2Z\2\f\3\2\2\2\4-\3\2\2\2\6\65\3\2"+
		"\2\2\b9\3\2\2\2\nG\3\2\2\2\f\r\7\3\2\2\r\16\7\20\2\2\16\20\7\4\2\2\17"+
		"\21\7\20\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23"+
		"\24\3\2\2\2\24\26\7\5\2\2\25\27\7\20\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30"+
		"\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\34\5\b\5\2\33\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37!\7\6\2\2 \"\5"+
		"\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%\'\7\7\2\2&"+
		"(\5\6\4\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2\2"+
		"\3,\3\3\2\2\2-.\7\20\2\2.\62\7\b\2\2/\61\5\n\6\2\60/\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\7\20"+
		"\2\2\66\67\7\b\2\2\678\7\21\2\28\7\3\2\2\29:\7\17\2\2:;\7\20\2\2;<\7\t"+
		"\2\2<=\7\20\2\2=\t\3\2\2\2>?\b\6\1\2?@\7\n\2\2@H\5\n\6\bAB\7\r\2\2BC\5"+
		"\n\6\2CD\7\16\2\2DH\3\2\2\2EH\7\20\2\2FH\7\21\2\2G>\3\2\2\2GA\3\2\2\2"+
		"GE\3\2\2\2GF\3\2\2\2HQ\3\2\2\2IJ\f\7\2\2JK\7\13\2\2KP\5\n\6\bLM\f\6\2"+
		"\2MN\7\f\2\2NP\5\n\6\7OI\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2R\13\3\2\2\2SQ\3\2\2\2\13\22\30\35#)\62GOQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}