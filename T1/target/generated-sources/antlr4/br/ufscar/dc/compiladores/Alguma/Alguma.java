// Generated from br\u005Cufscar\dc\compiladores\Alguma\Alguma.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.Alguma;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Alguma extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRAS_CHAVE=1, OP_LOGICO=2, OP_ARITMETICO=3, OP_RELACIONAL=4, ATRIBUICAO=5, 
		PONT=6, ENDEREÇO=7, DOISPONTOS=8, VIRGULA=9, PONTO=10, INTERVALO=11, ABREPAR=12, 
		FECHAPAR=13, ABRECHAVE=14, FECHACHAVE=15, NUM_INT=16, NUM_REAL=17, WS=18, 
		IDENT=19, CADEIA=20, COMENTARIO=21, CADEIA_SEM_FIM=22, COMENTARIO_SEM_FIM=23, 
		Caracter_invalido=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRAS_CHAVE", "OP_LOGICO", "OP_ARITMETICO", "OP_RELACIONAL", "ATRIBUICAO", 
			"PONT", "ENDEREÇO", "DOISPONTOS", "VIRGULA", "PONTO", "INTERVALO", "ABREPAR", 
			"FECHAPAR", "ABRECHAVE", "FECHACHAVE", "NUM_INT", "NUM_REAL", "WS", "IDENT", 
			"CADEIA", "COMENTARIO", "CADEIA_SEM_FIM", "COMENTARIO_SEM_FIM", "Caracter_invalido"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<-'", "'^'", "'&'", "':'", "','", "'.'", 
			"'..'", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRAS_CHAVE", "OP_LOGICO", "OP_ARITMETICO", "OP_RELACIONAL", 
			"ATRIBUICAO", "PONT", "ENDERE\u0006O", "DOISPONTOS", "VIRGULA", "PONTO", 
			"INTERVALO", "ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", "NUM_INT", 
			"NUM_REAL", "WS", "IDENT", "CADEIA", "COMENTARIO", "CADEIA_SEM_FIM", 
			"COMENTARIO_SEM_FIM", "Caracter_invalido"
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


	public Alguma(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

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
		"\u0004\u0000\u0018\u0194\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0121\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0129\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0136\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0004\u000f\u0151\b\u000f\u000b\u000f\f\u000f\u0152\u0001"+
		"\u0010\u0004\u0010\u0156\b\u0010\u000b\u0010\f\u0010\u0157\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u015c\b\u0010\u000b\u0010\f\u0010\u015d\u0003"+
		"\u0010\u0160\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0168\b\u0012\n\u0012\f\u0012\u016b\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u016f\b\u0013\n\u0013\f\u0013\u0172"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0178"+
		"\b\u0014\n\u0014\f\u0014\u017b\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u0183\b\u0015\n\u0015"+
		"\f\u0015\u0186\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u018c\b\u0016\n\u0016\f\u0016\u018f\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0007\u0004"+
		"\u0000%%*+--//\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0004\u000009AZ_"+
		"_az\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r}}\u0002\u0000\n\n\r\r"+
		"\u01c4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u0001\u0120\u0001\u0000\u0000\u0000\u0003"+
		"\u0128\u0001\u0000\u0000\u0000\u0005\u012a\u0001\u0000\u0000\u0000\u0007"+
		"\u0135\u0001\u0000\u0000\u0000\t\u0137\u0001\u0000\u0000\u0000\u000b\u013a"+
		"\u0001\u0000\u0000\u0000\r\u013c\u0001\u0000\u0000\u0000\u000f\u013e\u0001"+
		"\u0000\u0000\u0000\u0011\u0140\u0001\u0000\u0000\u0000\u0013\u0142\u0001"+
		"\u0000\u0000\u0000\u0015\u0144\u0001\u0000\u0000\u0000\u0017\u0147\u0001"+
		"\u0000\u0000\u0000\u0019\u0149\u0001\u0000\u0000\u0000\u001b\u014b\u0001"+
		"\u0000\u0000\u0000\u001d\u014d\u0001\u0000\u0000\u0000\u001f\u0150\u0001"+
		"\u0000\u0000\u0000!\u0155\u0001\u0000\u0000\u0000#\u0161\u0001\u0000\u0000"+
		"\u0000%\u0165\u0001\u0000\u0000\u0000\'\u016c\u0001\u0000\u0000\u0000"+
		")\u0175\u0001\u0000\u0000\u0000+\u0180\u0001\u0000\u0000\u0000-\u0189"+
		"\u0001\u0000\u0000\u0000/\u0192\u0001\u0000\u0000\u000012\u0005a\u0000"+
		"\u000023\u0005l\u0000\u000034\u0005g\u0000\u000045\u0005o\u0000\u0000"+
		"56\u0005r\u0000\u000067\u0005i\u0000\u000078\u0005t\u0000\u000089\u0005"+
		"m\u0000\u00009\u0121\u0005o\u0000\u0000:;\u0005f\u0000\u0000;<\u0005i"+
		"\u0000\u0000<=\u0005m\u0000\u0000=>\u0005_\u0000\u0000>?\u0005a\u0000"+
		"\u0000?@\u0005l\u0000\u0000@A\u0005g\u0000\u0000AB\u0005o\u0000\u0000"+
		"BC\u0005r\u0000\u0000CD\u0005i\u0000\u0000DE\u0005t\u0000\u0000EF\u0005"+
		"m\u0000\u0000F\u0121\u0005o\u0000\u0000GH\u0005d\u0000\u0000HI\u0005e"+
		"\u0000\u0000IJ\u0005c\u0000\u0000JK\u0005l\u0000\u0000KL\u0005a\u0000"+
		"\u0000LM\u0005r\u0000\u0000M\u0121\u0005e\u0000\u0000NO\u0005c\u0000\u0000"+
		"OP\u0005o\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005s\u0000\u0000RS\u0005"+
		"t\u0000\u0000ST\u0005a\u0000\u0000TU\u0005n\u0000\u0000UV\u0005t\u0000"+
		"\u0000V\u0121\u0005e\u0000\u0000WX\u0005t\u0000\u0000XY\u0005i\u0000\u0000"+
		"YZ\u0005p\u0000\u0000Z\u0121\u0005o\u0000\u0000[\\\u0005l\u0000\u0000"+
		"\\]\u0005i\u0000\u0000]^\u0005t\u0000\u0000^_\u0005e\u0000\u0000_`\u0005"+
		"r\u0000\u0000`a\u0005a\u0000\u0000a\u0121\u0005l\u0000\u0000bc\u0005i"+
		"\u0000\u0000cd\u0005n\u0000\u0000de\u0005t\u0000\u0000ef\u0005e\u0000"+
		"\u0000fg\u0005i\u0000\u0000gh\u0005r\u0000\u0000h\u0121\u0005o\u0000\u0000"+
		"ij\u0005r\u0000\u0000jk\u0005e\u0000\u0000kl\u0005a\u0000\u0000l\u0121"+
		"\u0005l\u0000\u0000mn\u0005l\u0000\u0000no\u0005o\u0000\u0000op\u0005"+
		"g\u0000\u0000pq\u0005i\u0000\u0000qr\u0005c\u0000\u0000r\u0121\u0005o"+
		"\u0000\u0000st\u0005v\u0000\u0000tu\u0005e\u0000\u0000uv\u0005r\u0000"+
		"\u0000vw\u0005d\u0000\u0000wx\u0005a\u0000\u0000xy\u0005d\u0000\u0000"+
		"yz\u0005e\u0000\u0000z{\u0005i\u0000\u0000{|\u0005r\u0000\u0000|\u0121"+
		"\u0005o\u0000\u0000}~\u0005f\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f"+
		"\u0080\u0005l\u0000\u0000\u0080\u0081\u0005s\u0000\u0000\u0081\u0121\u0005"+
		"o\u0000\u0000\u0082\u0083\u0005r\u0000\u0000\u0083\u0084\u0005e\u0000"+
		"\u0000\u0084\u0085\u0005g\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086"+
		"\u0087\u0005s\u0000\u0000\u0087\u0088\u0005t\u0000\u0000\u0088\u0089\u0005"+
		"r\u0000\u0000\u0089\u0121\u0005o\u0000\u0000\u008a\u008b\u0005f\u0000"+
		"\u0000\u008b\u008c\u0005i\u0000\u0000\u008c\u008d\u0005m\u0000\u0000\u008d"+
		"\u008e\u0005_\u0000\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005"+
		"e\u0000\u0000\u0090\u0091\u0005g\u0000\u0000\u0091\u0092\u0005i\u0000"+
		"\u0000\u0092\u0093\u0005s\u0000\u0000\u0093\u0094\u0005t\u0000\u0000\u0094"+
		"\u0095\u0005r\u0000\u0000\u0095\u0121\u0005o\u0000\u0000\u0096\u0097\u0005"+
		"f\u0000\u0000\u0097\u0098\u0005u\u0000\u0000\u0098\u0099\u0005n\u0000"+
		"\u0000\u0099\u009a\u0005c\u0000\u0000\u009a\u009b\u0005a\u0000\u0000\u009b"+
		"\u0121\u0005o\u0000\u0000\u009c\u009d\u0005f\u0000\u0000\u009d\u009e\u0005"+
		"i\u0000\u0000\u009e\u009f\u0005m\u0000\u0000\u009f\u00a0\u0005_\u0000"+
		"\u0000\u00a0\u00a1\u0005f\u0000\u0000\u00a1\u00a2\u0005u\u0000\u0000\u00a2"+
		"\u00a3\u0005n\u0000\u0000\u00a3\u00a4\u0005c\u0000\u0000\u00a4\u00a5\u0005"+
		"a\u0000\u0000\u00a5\u0121\u0005o\u0000\u0000\u00a6\u00a7\u0005v\u0000"+
		"\u0000\u00a7\u00a8\u0005a\u0000\u0000\u00a8\u0121\u0005r\u0000\u0000\u00a9"+
		"\u00aa\u0005l\u0000\u0000\u00aa\u00ab\u0005e\u0000\u0000\u00ab\u00ac\u0005"+
		"i\u0000\u0000\u00ac\u0121\u0005a\u0000\u0000\u00ad\u00ae\u0005e\u0000"+
		"\u0000\u00ae\u00af\u0005s\u0000\u0000\u00af\u00b0\u0005c\u0000\u0000\u00b0"+
		"\u00b1\u0005r\u0000\u0000\u00b1\u00b2\u0005e\u0000\u0000\u00b2\u00b3\u0005"+
		"v\u0000\u0000\u00b3\u0121\u0005a\u0000\u0000\u00b4\u00b5\u0005s\u0000"+
		"\u0000\u00b5\u0121\u0005e\u0000\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7"+
		"\u00b8\u0005n\u0000\u0000\u00b8\u00b9\u0005t\u0000\u0000\u00b9\u00ba\u0005"+
		"a\u0000\u0000\u00ba\u0121\u0005o\u0000\u0000\u00bb\u00bc\u0005s\u0000"+
		"\u0000\u00bc\u00bd\u0005e\u0000\u0000\u00bd\u00be\u0005n\u0000\u0000\u00be"+
		"\u00bf\u0005a\u0000\u0000\u00bf\u0121\u0005o\u0000\u0000\u00c0\u00c1\u0005"+
		"f\u0000\u0000\u00c1\u00c2\u0005i\u0000\u0000\u00c2\u00c3\u0005m\u0000"+
		"\u0000\u00c3\u00c4\u0005_\u0000\u0000\u00c4\u00c5\u0005s\u0000\u0000\u00c5"+
		"\u0121\u0005e\u0000\u0000\u00c6\u00c7\u0005c\u0000\u0000\u00c7\u00c8\u0005"+
		"a\u0000\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u0121\u0005o\u0000"+
		"\u0000\u00ca\u00cb\u0005s\u0000\u0000\u00cb\u00cc\u0005e\u0000\u0000\u00cc"+
		"\u00cd\u0005j\u0000\u0000\u00cd\u0121\u0005a\u0000\u0000\u00ce\u00cf\u0005"+
		"f\u0000\u0000\u00cf\u00d0\u0005i\u0000\u0000\u00d0\u00d1\u0005m\u0000"+
		"\u0000\u00d1\u00d2\u0005_\u0000\u0000\u00d2\u00d3\u0005c\u0000\u0000\u00d3"+
		"\u00d4\u0005a\u0000\u0000\u00d4\u00d5\u0005s\u0000\u0000\u00d5\u0121\u0005"+
		"o\u0000\u0000\u00d6\u00d7\u0005p\u0000\u0000\u00d7\u00d8\u0005a\u0000"+
		"\u0000\u00d8\u00d9\u0005r\u0000\u0000\u00d9\u0121\u0005a\u0000\u0000\u00da"+
		"\u00db\u0005a\u0000\u0000\u00db\u00dc\u0005t\u0000\u0000\u00dc\u0121\u0005"+
		"e\u0000\u0000\u00dd\u00de\u0005f\u0000\u0000\u00de\u00df\u0005a\u0000"+
		"\u0000\u00df\u00e0\u0005c\u0000\u0000\u00e0\u0121\u0005a\u0000\u0000\u00e1"+
		"\u00e2\u0005f\u0000\u0000\u00e2\u00e3\u0005i\u0000\u0000\u00e3\u00e4\u0005"+
		"m\u0000\u0000\u00e4\u00e5\u0005_\u0000\u0000\u00e5\u00e6\u0005p\u0000"+
		"\u0000\u00e6\u00e7\u0005a\u0000\u0000\u00e7\u00e8\u0005r\u0000\u0000\u00e8"+
		"\u0121\u0005a\u0000\u0000\u00e9\u00ea\u0005e\u0000\u0000\u00ea\u00eb\u0005"+
		"n\u0000\u0000\u00eb\u00ec\u0005q\u0000\u0000\u00ec\u00ed\u0005u\u0000"+
		"\u0000\u00ed\u00ee\u0005a\u0000\u0000\u00ee\u00ef\u0005n\u0000\u0000\u00ef"+
		"\u00f0\u0005t\u0000\u0000\u00f0\u0121\u0005o\u0000\u0000\u00f1\u00f2\u0005"+
		"f\u0000\u0000\u00f2\u00f3\u0005i\u0000\u0000\u00f3\u00f4\u0005m\u0000"+
		"\u0000\u00f4\u00f5\u0005_\u0000\u0000\u00f5\u00f6\u0005e\u0000\u0000\u00f6"+
		"\u00f7\u0005n\u0000\u0000\u00f7\u00f8\u0005q\u0000\u0000\u00f8\u00f9\u0005"+
		"u\u0000\u0000\u00f9\u00fa\u0005a\u0000\u0000\u00fa\u00fb\u0005n\u0000"+
		"\u0000\u00fb\u00fc\u0005t\u0000\u0000\u00fc\u0121\u0005o\u0000\u0000\u00fd"+
		"\u00fe\u0005r\u0000\u0000\u00fe\u00ff\u0005e\u0000\u0000\u00ff\u0100\u0005"+
		"t\u0000\u0000\u0100\u0101\u0005o\u0000\u0000\u0101\u0102\u0005r\u0000"+
		"\u0000\u0102\u0103\u0005n\u0000\u0000\u0103\u0121\u0005e\u0000\u0000\u0104"+
		"\u0105\u0005p\u0000\u0000\u0105\u0106\u0005r\u0000\u0000\u0106\u0107\u0005"+
		"o\u0000\u0000\u0107\u0108\u0005c\u0000\u0000\u0108\u0109\u0005e\u0000"+
		"\u0000\u0109\u010a\u0005d\u0000\u0000\u010a\u010b\u0005i\u0000\u0000\u010b"+
		"\u010c\u0005m\u0000\u0000\u010c\u010d\u0005e\u0000\u0000\u010d\u010e\u0005"+
		"n\u0000\u0000\u010e\u010f\u0005t\u0000\u0000\u010f\u0121\u0005o\u0000"+
		"\u0000\u0110\u0111\u0005f\u0000\u0000\u0111\u0112\u0005i\u0000\u0000\u0112"+
		"\u0113\u0005m\u0000\u0000\u0113\u0114\u0005_\u0000\u0000\u0114\u0115\u0005"+
		"p\u0000\u0000\u0115\u0116\u0005r\u0000\u0000\u0116\u0117\u0005o\u0000"+
		"\u0000\u0117\u0118\u0005c\u0000\u0000\u0118\u0119\u0005e\u0000\u0000\u0119"+
		"\u011a\u0005d\u0000\u0000\u011a\u011b\u0005i\u0000\u0000\u011b\u011c\u0005"+
		"m\u0000\u0000\u011c\u011d\u0005e\u0000\u0000\u011d\u011e\u0005n\u0000"+
		"\u0000\u011e\u011f\u0005t\u0000\u0000\u011f\u0121\u0005o\u0000\u0000\u0120"+
		"1\u0001\u0000\u0000\u0000\u0120:\u0001\u0000\u0000\u0000\u0120G\u0001"+
		"\u0000\u0000\u0000\u0120N\u0001\u0000\u0000\u0000\u0120W\u0001\u0000\u0000"+
		"\u0000\u0120[\u0001\u0000\u0000\u0000\u0120b\u0001\u0000\u0000\u0000\u0120"+
		"i\u0001\u0000\u0000\u0000\u0120m\u0001\u0000\u0000\u0000\u0120s\u0001"+
		"\u0000\u0000\u0000\u0120}\u0001\u0000\u0000\u0000\u0120\u0082\u0001\u0000"+
		"\u0000\u0000\u0120\u008a\u0001\u0000\u0000\u0000\u0120\u0096\u0001\u0000"+
		"\u0000\u0000\u0120\u009c\u0001\u0000\u0000\u0000\u0120\u00a6\u0001\u0000"+
		"\u0000\u0000\u0120\u00a9\u0001\u0000\u0000\u0000\u0120\u00ad\u0001\u0000"+
		"\u0000\u0000\u0120\u00b4\u0001\u0000\u0000\u0000\u0120\u00b6\u0001\u0000"+
		"\u0000\u0000\u0120\u00bb\u0001\u0000\u0000\u0000\u0120\u00c0\u0001\u0000"+
		"\u0000\u0000\u0120\u00c6\u0001\u0000\u0000\u0000\u0120\u00ca\u0001\u0000"+
		"\u0000\u0000\u0120\u00ce\u0001\u0000\u0000\u0000\u0120\u00d6\u0001\u0000"+
		"\u0000\u0000\u0120\u00da\u0001\u0000\u0000\u0000\u0120\u00dd\u0001\u0000"+
		"\u0000\u0000\u0120\u00e1\u0001\u0000\u0000\u0000\u0120\u00e9\u0001\u0000"+
		"\u0000\u0000\u0120\u00f1\u0001\u0000\u0000\u0000\u0120\u00fd\u0001\u0000"+
		"\u0000\u0000\u0120\u0104\u0001\u0000\u0000\u0000\u0120\u0110\u0001\u0000"+
		"\u0000\u0000\u0121\u0002\u0001\u0000\u0000\u0000\u0122\u0129\u0005e\u0000"+
		"\u0000\u0123\u0124\u0005o\u0000\u0000\u0124\u0129\u0005u\u0000\u0000\u0125"+
		"\u0126\u0005n\u0000\u0000\u0126\u0127\u0005a\u0000\u0000\u0127\u0129\u0005"+
		"o\u0000\u0000\u0128\u0122\u0001\u0000\u0000\u0000\u0128\u0123\u0001\u0000"+
		"\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0129\u0004\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0007\u0000\u0000\u0000\u012b\u0006\u0001\u0000"+
		"\u0000\u0000\u012c\u0136\u0005>\u0000\u0000\u012d\u012e\u0005>\u0000\u0000"+
		"\u012e\u0136\u0005=\u0000\u0000\u012f\u0136\u0005<\u0000\u0000\u0130\u0131"+
		"\u0005<\u0000\u0000\u0131\u0136\u0005=\u0000\u0000\u0132\u0133\u0005<"+
		"\u0000\u0000\u0133\u0136\u0005>\u0000\u0000\u0134\u0136\u0005=\u0000\u0000"+
		"\u0135\u012c\u0001\u0000\u0000\u0000\u0135\u012d\u0001\u0000\u0000\u0000"+
		"\u0135\u012f\u0001\u0000\u0000\u0000\u0135\u0130\u0001\u0000\u0000\u0000"+
		"\u0135\u0132\u0001\u0000\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\b\u0001\u0000\u0000\u0000\u0137\u0138\u0005<\u0000\u0000\u0138"+
		"\u0139\u0005-\u0000\u0000\u0139\n\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005^\u0000\u0000\u013b\f\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"&\u0000\u0000\u013d\u000e\u0001\u0000\u0000\u0000\u013e\u013f\u0005:\u0000"+
		"\u0000\u013f\u0010\u0001\u0000\u0000\u0000\u0140\u0141\u0005,\u0000\u0000"+
		"\u0141\u0012\u0001\u0000\u0000\u0000\u0142\u0143\u0005.\u0000\u0000\u0143"+
		"\u0014\u0001\u0000\u0000\u0000\u0144\u0145\u0005.\u0000\u0000\u0145\u0146"+
		"\u0005.\u0000\u0000\u0146\u0016\u0001\u0000\u0000\u0000\u0147\u0148\u0005"+
		"(\u0000\u0000\u0148\u0018\u0001\u0000\u0000\u0000\u0149\u014a\u0005)\u0000"+
		"\u0000\u014a\u001a\u0001\u0000\u0000\u0000\u014b\u014c\u0005[\u0000\u0000"+
		"\u014c\u001c\u0001\u0000\u0000\u0000\u014d\u014e\u0005]\u0000\u0000\u014e"+
		"\u001e\u0001\u0000\u0000\u0000\u014f\u0151\u000209\u0000\u0150\u014f\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153 \u0001\u0000"+
		"\u0000\u0000\u0154\u0156\u000209\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015f\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0005.\u0000\u0000\u015a\u015c\u000209\u0000\u015b\u015a"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\"\u0001\u0000\u0000\u0000\u0161\u0162\u0007"+
		"\u0001\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0006"+
		"\u0011\u0000\u0000\u0164$\u0001\u0000\u0000\u0000\u0165\u0169\u0007\u0002"+
		"\u0000\u0000\u0166\u0168\u0007\u0003\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a&\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u0170\u0005\"\u0000\u0000"+
		"\u016d\u016f\b\u0004\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172"+
		"\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0005\"\u0000\u0000\u0174("+
		"\u0001\u0000\u0000\u0000\u0175\u0179\u0005{\u0000\u0000\u0176\u0178\b"+
		"\u0005\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001"+
		"\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0005}\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0006\u0014\u0000\u0000\u017f*\u0001\u0000\u0000"+
		"\u0000\u0180\u0184\u0005\"\u0000\u0000\u0181\u0183\b\u0004\u0000\u0000"+
		"\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0007\u0006\u0000\u0000\u0188,\u0001\u0000\u0000\u0000\u0189"+
		"\u018d\u0005{\u0000\u0000\u018a\u018c\b\u0005\u0000\u0000\u018b\u018a"+
		"\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0007\u0006\u0000\u0000\u0191.\u0001\u0000\u0000\u0000\u0192\u0193\t"+
		"\u0000\u0000\u0000\u01930\u0001\u0000\u0000\u0000\r\u0000\u0120\u0128"+
		"\u0135\u0152\u0157\u015d\u015f\u0169\u0170\u0179\u0184\u018d\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}