// Generated from /home/tobias/Documents/DTU/Compiler/CoCo/a1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, UPDATE=7, LATCH=8, TOKEN=9, 
		VARIABLE=10, CONST=11, NOT=12, LOGIC=13, WHITESPACE=14, KOMMENTAR=15, 
		MULTILINEKOMMENTAR=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "UPDATE", "LATCH", "TOKEN", 
			"VARIABLE", "CONST", "NOT", "LOGIC", "ID", "WHITESPACE", "KOMMENTAR", 
			"MULTILINEKOMMENTAR"
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


	public a1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "a1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\7\13I\n\13\f\13\16\13L\13\13\3\f\6\fO\n\f\r\f\16\fP\3\f\3\f\6"+
		"\fU\n\f\r\f\16\fV\5\fY\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"c\n\16\3\17\3\17\7\17g\n\17\f\17\16\17j\13\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\7\21t\n\21\f\21\16\21w\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0081\n\22\f\22\16\22\u0084\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\2\37\20!\21#\22\3\2\n\4\2C\\c|\3\2\62;\3\2c|\4\2aac|\4\2"+
		"\13\f\"\"\3\2\f\f\3\2\61\61\3\2,,\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7*\3\2\2\2\t"+
		"-\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21<\3\2\2\2\23C\3\2"+
		"\2\2\25F\3\2\2\2\27N\3\2\2\2\31Z\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37k\3"+
		"\2\2\2!o\3\2\2\2#z\3\2\2\2%&\7?\2\2&\4\3\2\2\2\'(\7/\2\2()\7@\2\2)\6\3"+
		"\2\2\2*+\7(\2\2+,\7(\2\2,\b\3\2\2\2-.\7~\2\2./\7~\2\2/\n\3\2\2\2\60\61"+
		"\7*\2\2\61\f\3\2\2\2\62\63\7+\2\2\63\16\3\2\2\2\64\65\7\60\2\2\65\66\7"+
		"w\2\2\66\67\7r\2\2\678\7f\2\289\7c\2\29:\7v\2\2:;\7g\2\2;\20\3\2\2\2<"+
		"=\7\60\2\2=>\7n\2\2>?\7c\2\2?@\7v\2\2@A\7e\2\2AB\7j\2\2B\22\3\2\2\2CD"+
		"\7\60\2\2DE\5\35\17\2E\24\3\2\2\2FJ\t\2\2\2GI\t\2\2\2HG\3\2\2\2IL\3\2"+
		"\2\2JH\3\2\2\2JK\3\2\2\2K\26\3\2\2\2LJ\3\2\2\2MO\t\3\2\2NM\3\2\2\2OP\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2QX\3\2\2\2RT\7\60\2\2SU\t\3\2\2TS\3\2\2\2UV"+
		"\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XR\3\2\2\2XY\3\2\2\2Y\30\3\2\2\2"+
		"Z[\7#\2\2[\32\3\2\2\2\\]\7(\2\2]c\7(\2\2^_\7~\2\2_c\7~\2\2`a\7?\2\2ac"+
		"\7?\2\2b\\\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\34\3\2\2\2dh\t\4\2\2eg\t\5\2\2"+
		"fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\36\3\2\2\2jh\3\2\2\2kl\t\6\2"+
		"\2lm\3\2\2\2mn\b\20\2\2n \3\2\2\2op\7\61\2\2pq\7\61\2\2qu\3\2\2\2rt\n"+
		"\7\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\b"+
		"\21\2\2y\"\3\2\2\2z{\7\61\2\2{|\7,\2\2|\u0082\3\2\2\2}~\7,\2\2~\u0081"+
		"\n\b\2\2\177\u0081\n\t\2\2\u0080}\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7,\2\2\u0086\u0087\7\61\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\b\22\2\2\u0089$\3\2\2\2\f\2JPVXbhu\u0080\u0082\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}