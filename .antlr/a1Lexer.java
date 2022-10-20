// Generated from c:\DTU\3-semester\Compilerteknik\lorteopgave\CoCo\a1.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, UPDATE=9, 
		LATCH=10, TOKEN=11, VARIABLE=12, CONST=13, NOT=14, LOGIC=15, WHITESPACE=16, 
		KOMMENTAR=17, MULTILINEKOMMENTAR=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "UPDATE", 
			"LATCH", "TOKEN", "VARIABLE", "CONST", "NOT", "LOGIC", "ID", "WHITESPACE", 
			"KOMMENTAR", "MULTILINEKOMMENTAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.simulate'", "'='", "'->'", "'&&'", "'||'", "'('", 
			"')'", "'.update'", "'.latch'", null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "UPDATE", "LATCH", 
			"TOKEN", "VARIABLE", "CONST", "NOT", "LOGIC", "WHITESPACE", "KOMMENTAR", 
			"MULTILINEKOMMENTAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\ra\n\r\f\r\16\rd\13\r\3"+
		"\16\6\16g\n\16\r\16\16\16h\3\16\3\16\6\16m\n\16\r\16\16\16n\5\16q\n\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20{\n\20\3\21\3\21\7\21\177"+
		"\n\21\f\21\16\21\u0082\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23\u008c\n\23\f\23\16\23\u008f\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u0099\n\24\f\24\16\24\u009c\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\2#\22%\23\'\24\3\2\n\4\2C\\c|\3\2\62;\3\2c|\4\2aac|\4"+
		"\2\13\f\"\"\3\2\f\f\3\2\61\61\3\2,,\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2"+
		"\2\5\63\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13B\3\2\2\2\rE\3\2\2\2\17H\3\2\2"+
		"\2\21J\3\2\2\2\23L\3\2\2\2\25T\3\2\2\2\27[\3\2\2\2\31^\3\2\2\2\33f\3\2"+
		"\2\2\35r\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#\u0083\3\2\2\2%\u0087\3\2\2\2\'"+
		"\u0092\3\2\2\2)*\7\60\2\2*+\7j\2\2+,\7c\2\2,-\7t\2\2-.\7f\2\2./\7y\2\2"+
		"/\60\7c\2\2\60\61\7t\2\2\61\62\7g\2\2\62\4\3\2\2\2\63\64\7\60\2\2\64\65"+
		"\7u\2\2\65\66\7k\2\2\66\67\7o\2\2\678\7w\2\289\7n\2\29:\7c\2\2:;\7v\2"+
		"\2;<\7g\2\2<\6\3\2\2\2=>\7?\2\2>\b\3\2\2\2?@\7/\2\2@A\7@\2\2A\n\3\2\2"+
		"\2BC\7(\2\2CD\7(\2\2D\f\3\2\2\2EF\7~\2\2FG\7~\2\2G\16\3\2\2\2HI\7*\2\2"+
		"I\20\3\2\2\2JK\7+\2\2K\22\3\2\2\2LM\7\60\2\2MN\7w\2\2NO\7r\2\2OP\7f\2"+
		"\2PQ\7c\2\2QR\7v\2\2RS\7g\2\2S\24\3\2\2\2TU\7\60\2\2UV\7n\2\2VW\7c\2\2"+
		"WX\7v\2\2XY\7e\2\2YZ\7j\2\2Z\26\3\2\2\2[\\\7\60\2\2\\]\5!\21\2]\30\3\2"+
		"\2\2^b\t\2\2\2_a\t\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\32\3"+
		"\2\2\2db\3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ip\3"+
		"\2\2\2jl\7\60\2\2km\t\3\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2oq"+
		"\3\2\2\2pj\3\2\2\2pq\3\2\2\2q\34\3\2\2\2rs\7#\2\2s\36\3\2\2\2tu\7(\2\2"+
		"u{\7(\2\2vw\7~\2\2w{\7~\2\2xy\7?\2\2y{\7?\2\2zt\3\2\2\2zv\3\2\2\2zx\3"+
		"\2\2\2{ \3\2\2\2|\u0080\t\4\2\2}\177\t\5\2\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\"\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0083\u0084\t\6\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\22\2\2\u0086"+
		"$\3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7\61\2\2\u0089\u008d\3\2\2"+
		"\2\u008a\u008c\n\7\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\b\23\2\2\u0091&\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7,\2\2"+
		"\u0094\u009a\3\2\2\2\u0095\u0096\7,\2\2\u0096\u0099\n\b\2\2\u0097\u0099"+
		"\n\t\2\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\7,\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\b\24\2\2\u00a1(\3\2\2\2\f\2bhnpz\u0080\u008d\u0098\u009a\3\b\2"+
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