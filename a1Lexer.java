// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class a1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u0010\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\tG\b\t\n\t\f\tJ\t\t\u0001\n\u0004\nM\b\n\u000b"+
		"\n\f\nN\u0001\n\u0001\n\u0004\nS\b\n\u000b\n\f\nT\u0003\nW\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fa"+
		"\b\f\u0001\r\u0001\r\u0005\re\b\r\n\r\f\rh\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000fr\b\u000f\n\u000f\f\u000fu\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u007f\b\u0010\n\u0010\f\u0010\u0082\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u001d\u000e"+
		"\u001f\u000f!\u0010\u0001\u0000\b\u0002\u0000AZaz\u0001\u000009\u0001"+
		"\u0000az\u0002\u0000__az\u0002\u0000\t\n  \u0001\u0000\n\n\u0001\u0000"+
		"//\u0001\u0000**\u0090\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005"+
		"(\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t.\u0001\u0000"+
		"\u0000\u0000\u000b0\u0001\u0000\u0000\u0000\r2\u0001\u0000\u0000\u0000"+
		"\u000f:\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013D"+
		"\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017X\u0001\u0000"+
		"\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bb\u0001\u0000\u0000\u0000"+
		"\u001di\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000\u0000!x\u0001"+
		"\u0000\u0000\u0000#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0005-\u0000\u0000&\'\u0005>\u0000\u0000\'\u0004\u0001\u0000\u0000"+
		"\u0000()\u0005&\u0000\u0000)*\u0005&\u0000\u0000*\u0006\u0001\u0000\u0000"+
		"\u0000+,\u0005|\u0000\u0000,-\u0005|\u0000\u0000-\b\u0001\u0000\u0000"+
		"\u0000./\u0005(\u0000\u0000/\n\u0001\u0000\u0000\u000001\u0005)\u0000"+
		"\u00001\f\u0001\u0000\u0000\u000023\u0005.\u0000\u000034\u0005u\u0000"+
		"\u000045\u0005p\u0000\u000056\u0005d\u0000\u000067\u0005a\u0000\u0000"+
		"78\u0005t\u0000\u000089\u0005e\u0000\u00009\u000e\u0001\u0000\u0000\u0000"+
		":;\u0005.\u0000\u0000;<\u0005l\u0000\u0000<=\u0005a\u0000\u0000=>\u0005"+
		"t\u0000\u0000>?\u0005c\u0000\u0000?@\u0005h\u0000\u0000@\u0010\u0001\u0000"+
		"\u0000\u0000AB\u0005.\u0000\u0000BC\u0003\u001b\r\u0000C\u0012\u0001\u0000"+
		"\u0000\u0000DH\u0007\u0000\u0000\u0000EG\u0007\u0000\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000KM\u0007\u0001\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OV\u0001\u0000\u0000\u0000PR\u0005.\u0000\u0000QS\u0007\u0001\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VP\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0016\u0001\u0000\u0000\u0000"+
		"XY\u0005!\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000Z[\u0005&\u0000\u0000"+
		"[a\u0005&\u0000\u0000\\]\u0005|\u0000\u0000]a\u0005|\u0000\u0000^_\u0005"+
		"=\u0000\u0000_a\u0005=\u0000\u0000`Z\u0001\u0000\u0000\u0000`\\\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000a\u001a\u0001\u0000\u0000"+
		"\u0000bf\u0007\u0002\u0000\u0000ce\u0007\u0003\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\u001c\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000ij\u0007\u0004\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0006\u000e"+
		"\u0000\u0000l\u001e\u0001\u0000\u0000\u0000mn\u0005/\u0000\u0000no\u0005"+
		"/\u0000\u0000os\u0001\u0000\u0000\u0000pr\b\u0005\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0006\u000f\u0000\u0000w \u0001\u0000\u0000\u0000xy\u0005/\u0000"+
		"\u0000yz\u0005*\u0000\u0000z\u0080\u0001\u0000\u0000\u0000{|\u0005*\u0000"+
		"\u0000|\u007f\b\u0006\u0000\u0000}\u007f\b\u0007\u0000\u0000~{\u0001\u0000"+
		"\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005*\u0000\u0000\u0084\u0085\u0005/\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0006\u0010\u0000\u0000\u0087\"\u0001\u0000"+
		"\u0000\u0000\n\u0000HNTV`fs~\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}