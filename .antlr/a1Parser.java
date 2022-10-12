// Generated from /home/tobias/Documents/DTU/Compiler/CoCo/a1.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, UPDATE=7, LATCH=8, TOKEN=9, 
		VARIABLE=10, CONST=11, NOT=12, LOGIC=13, WHITESPACE=14, KOMMENTAR=15, 
		MULTILINEKOMMENTAR=16;
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
			null, "'='", "'->'", "'&&'", "'||'", "'('", "')'", "'.update'", "'.latch'", 
			null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "UPDATE", "LATCH", "TOKEN", 
			"VARIABLE", "CONST", "NOT", "LOGIC", "WHITESPACE", "KOMMENTAR", "MULTILINEKOMMENTAR"
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
		public Token t;
		public Token v1;
		public Token u;
		public SimInpContext simInp() {
			return getRuleContext(SimInpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(a1Parser.EOF, 0); }
		public List<TerminalNode> TOKEN() { return getTokens(a1Parser.TOKEN); }
		public TerminalNode TOKEN(int i) {
			return getToken(a1Parser.TOKEN, i);
		}
		public TerminalNode UPDATE() { return getToken(a1Parser.UPDATE, 0); }
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
		public List<TerminalNode> VARIABLE() { return getTokens(a1Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(a1Parser.VARIABLE, i);
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
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN) {
				{
				{
				setState(10);
				((StartContext)_localctx).t = match(TOKEN);
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(11);
					((StartContext)_localctx).v1 = match(VARIABLE);
					}
					}
					setState(14); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VARIABLE );
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				latchDec();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LATCH );
			}
			{
			setState(26);
			((StartContext)_localctx).u = match(UPDATE);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				updateDecl();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			}
			setState(32);
			((StartContext)_localctx).t = match(TOKEN);
			setState(33);
			simInp();
			setState(34);
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
		public Token v1;
		public Token op;
		public ExprContext e1;
		public TerminalNode VARIABLE() { return getToken(a1Parser.VARIABLE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public UpdateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateDecl; }
	}

	public final UpdateDeclContext updateDecl() throws RecognitionException {
		UpdateDeclContext _localctx = new UpdateDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_updateDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((UpdateDeclContext)_localctx).v1 = match(VARIABLE);
			setState(37);
			((UpdateDeclContext)_localctx).op = match(T__0);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					((UpdateDeclContext)_localctx).e1 = expr(0);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public Token v1;
		public Token op;
		public Token c;
		public TerminalNode VARIABLE() { return getToken(a1Parser.VARIABLE, 0); }
		public TerminalNode CONST() { return getToken(a1Parser.CONST, 0); }
		public SimInpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simInp; }
	}

	public final SimInpContext simInp() throws RecognitionException {
		SimInpContext _localctx = new SimInpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simInp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((SimInpContext)_localctx).v1 = match(VARIABLE);
			setState(45);
			((SimInpContext)_localctx).op = match(T__0);
			setState(46);
			((SimInpContext)_localctx).c = match(CONST);
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
		public Token lat;
		public Token v1;
		public Token op;
		public Token v2;
		public TerminalNode LATCH() { return getToken(a1Parser.LATCH, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(a1Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(a1Parser.VARIABLE, i);
		}
		public LatchDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchDec; }
	}

	public final LatchDecContext latchDec() throws RecognitionException {
		LatchDecContext _localctx = new LatchDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_latchDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((LatchDecContext)_localctx).lat = match(LATCH);
			setState(49);
			((LatchDecContext)_localctx).v1 = match(VARIABLE);
			setState(50);
			((LatchDecContext)_localctx).op = match(T__1);
			setState(51);
			((LatchDecContext)_localctx).v2 = match(VARIABLE);
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
		public ExprContext e1;
		public Token v1;
		public Token c;
		public Token op;
		public ExprContext e2;
		public TerminalNode NOT() { return getToken(a1Parser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VARIABLE() { return getToken(a1Parser.VARIABLE, 0); }
		public TerminalNode CONST() { return getToken(a1Parser.CONST, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(54);
				match(NOT);
				setState(55);
				((ExprContext)_localctx).e1 = expr(6);
				}
				break;
			case T__4:
				{
				setState(56);
				match(T__4);
				setState(57);
				((ExprContext)_localctx).e1 = expr(0);
				setState(58);
				match(T__5);
				}
				break;
			case VARIABLE:
				{
				setState(60);
				((ExprContext)_localctx).v1 = match(VARIABLE);
				}
				break;
			case CONST:
				{
				setState(61);
				((ExprContext)_localctx).c = match(CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65);
						((ExprContext)_localctx).op = match(T__2);
						setState(66);
						((ExprContext)_localctx).e2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(68);
						((ExprContext)_localctx).op = match(T__3);
						setState(69);
						((ExprContext)_localctx).e2 = expr(5);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\7\2\23\n\2\f"+
		"\2\16\2\26\13\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\6\2\37\n\2\r\2\16\2"+
		" \3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2"+
		"\2R\2\24\3\2\2\2\4&\3\2\2\2\6.\3\2\2\2\b\62\3\2\2\2\n@\3\2\2\2\f\16\7"+
		"\13\2\2\r\17\7\f\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3"+
		"\2\2\2\21\23\3\2\2\2\22\f\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\27\31\5\b\5\2\30\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\7\t\2\2\35\37\5"+
		"\4\3\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7"+
		"\13\2\2#$\5\6\4\2$%\7\2\2\3%\3\3\2\2\2&\'\7\f\2\2\'+\7\3\2\2(*\5\n\6\2"+
		")(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-+\3\2\2\2./\7\f\2"+
		"\2/\60\7\3\2\2\60\61\7\r\2\2\61\7\3\2\2\2\62\63\7\n\2\2\63\64\7\f\2\2"+
		"\64\65\7\4\2\2\65\66\7\f\2\2\66\t\3\2\2\2\678\b\6\1\289\7\16\2\29A\5\n"+
		"\6\b:;\7\7\2\2;<\5\n\6\2<=\7\b\2\2=A\3\2\2\2>A\7\f\2\2?A\7\r\2\2@\67\3"+
		"\2\2\2@:\3\2\2\2@>\3\2\2\2@?\3\2\2\2AJ\3\2\2\2BC\f\7\2\2CD\7\5\2\2DI\5"+
		"\n\6\bEF\f\6\2\2FG\7\6\2\2GI\5\n\6\7HB\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3\2\2\2\n\20\24\32 +@HJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}