package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_DECIMAL_DIGIT=14;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=39;
    public static final int RULE_INT=40;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=42;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=25;
    public static final int RULE_NEWLINE=37;
    public static final int RULE_BIG_U_VALUE=31;
    public static final int RULE_ESCAPED_CHAR=32;
    public static final int RULE_BYTE_VALUE=28;
    public static final int RULE_UNICODE_LETTER=38;
    public static final int RULE_UNICODE_CHAR=29;
    public static final int RULE_OCTAL_DIGIT=23;
    public static final int RULE_KEYWORD=15;
    public static final int RULE_BOOL=11;
    public static final int RULE_LETTER=13;
    public static final int RULE_EXPONENT=26;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=35;
    public static final int RULE_UNARY_OP=19;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=24;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RUNE_LIT=10;
    public static final int RULE_DECIMAL_LIT=20;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__99=99;
    public static final int RULE_BINARY_OP=12;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_IMAGINARY_LIT=9;
    public static final int T__98=98;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_INTERPRETED_STRING_LIT=36;
    public static final int RULE_UNICODE_VALUE=27;
    public static final int RULE_LITTLE_U_VALUE=30;
    public static final int RULE_HEX_BYTE_VALUE=34;
    public static final int RULE_OCTAL_BYTE_VALUE=33;
    public static final int RULE_MUL_OP=18;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=41;
    public static final int RULE_SL_COMMENT=43;
    public static final int T__77=77;
    public static final int RULE_HEX_LIT=22;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=17;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=44;
    public static final int RULE_OCTAL_LIT=21;
    public static final int RULE_FLOAT_LIT=8;
    public static final int RULE_INT_LIT=7;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_REL_OP=16;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalGoLexer() {;} 
    public InternalGoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGo.g"; }

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( 'package' )
            // InternalGo.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( 'import' )
            // InternalGo.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( '(' )
            // InternalGo.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:14:7: ( ')' )
            // InternalGo.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:15:7: ( '.' )
            // InternalGo.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16:7: ( 'const' )
            // InternalGo.g:16:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:17:7: ( '=' )
            // InternalGo.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:18:7: ( ',' )
            // InternalGo.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:19:7: ( 'type' )
            // InternalGo.g:19:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:20:7: ( 'func' )
            // InternalGo.g:20:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21:7: ( 'var' )
            // InternalGo.g:21:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:22:7: ( '{' )
            // InternalGo.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:23:7: ( '}' )
            // InternalGo.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:24:7: ( '<-' )
            // InternalGo.g:24:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:25:7: ( '++' )
            // InternalGo.g:25:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:26:7: ( '--' )
            // InternalGo.g:26:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:27:7: ( '+' )
            // InternalGo.g:27:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:28:7: ( '-' )
            // InternalGo.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:29:7: ( '|' )
            // InternalGo.g:29:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:30:7: ( '^' )
            // InternalGo.g:30:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:31:7: ( '*' )
            // InternalGo.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:32:7: ( '/' )
            // InternalGo.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:33:7: ( '%' )
            // InternalGo.g:33:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:34:7: ( '<<' )
            // InternalGo.g:34:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:35:7: ( '>>' )
            // InternalGo.g:35:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:36:7: ( '&' )
            // InternalGo.g:36:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:37:7: ( '&^' )
            // InternalGo.g:37:9: '&^'
            {
            match("&^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:38:7: ( ':=' )
            // InternalGo.g:38:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( ':' )
            // InternalGo.g:39:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( 'return' )
            // InternalGo.g:40:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( 'break' )
            // InternalGo.g:41:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:42:7: ( 'continue' )
            // InternalGo.g:42:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:43:7: ( 'goto' )
            // InternalGo.g:43:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:44:7: ( 'fallthrough' )
            // InternalGo.g:44:9: 'fallthrough'
            {
            match("fallthrough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:45:7: ( 'defer' )
            // InternalGo.g:45:9: 'defer'
            {
            match("defer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:46:7: ( 'if' )
            // InternalGo.g:46:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:47:7: ( 'else' )
            // InternalGo.g:47:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:48:7: ( 'switch' )
            // InternalGo.g:48:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:49:7: ( 'case' )
            // InternalGo.g:49:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:50:7: ( 'default' )
            // InternalGo.g:50:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:51:7: ( 'select' )
            // InternalGo.g:51:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:52:7: ( 'for' )
            // InternalGo.g:52:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:53:7: ( 'range' )
            // InternalGo.g:53:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:54:7: ( 'go' )
            // InternalGo.g:54:9: 'go'
            {
            match("go"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:55:7: ( 'Array' )
            // InternalGo.g:55:9: 'Array'
            {
            match("Array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:56:7: ( 'StructType' )
            // InternalGo.g:56:9: 'StructType'
            {
            match("StructType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:57:7: ( 'Pointer' )
            // InternalGo.g:57:9: 'Pointer'
            {
            match("Pointer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:58:7: ( 'Function' )
            // InternalGo.g:58:9: 'Function'
            {
            match("Function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:59:7: ( 'Interface' )
            // InternalGo.g:59:9: 'Interface'
            {
            match("Interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:60:7: ( 'Slice' )
            // InternalGo.g:60:9: 'Slice'
            {
            match("Slice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:61:7: ( 'Map' )
            // InternalGo.g:61:9: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:62:7: ( 'Channel' )
            // InternalGo.g:62:9: 'Channel'
            {
            match("Channel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:63:7: ( '[' )
            // InternalGo.g:63:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:64:7: ( ']' )
            // InternalGo.g:64:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:65:7: ( 'interface' )
            // InternalGo.g:65:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:66:8: ( 'map' )
            // InternalGo.g:66:10: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:67:8: ( 'chan' )
            // InternalGo.g:67:10: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:68:8: ( '...' )
            // InternalGo.g:68:10: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:69:8: ( 'struct' )
            // InternalGo.g:69:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:70:8: ( '!' )
            // InternalGo.g:70:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:71:8: ( ';' )
            // InternalGo.g:71:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8142:11: ( ( 'true' | 'false' ) )
            // InternalGo.g:8142:13: ( 'true' | 'false' )
            {
            // InternalGo.g:8142:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGo.g:8142:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8142:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8144:17: ( RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:8144:19: RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalGo.g:8144:31: ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            // InternalGo.g:8146:23: ( ( 'break' | 'int' | 'string' | 'float' | 'bool' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' ) )
            // InternalGo.g:8146:25: ( 'break' | 'int' | 'string' | 'float' | 'bool' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' )
            {
            // InternalGo.g:8146:25: ( 'break' | 'int' | 'string' | 'float' | 'bool' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' )
            int alt3=29;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGo.g:8146:26: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8146:34: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8146:40: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 4 :
                    // InternalGo.g:8146:49: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8146:57: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8146:64: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:8146:74: 'func'
                    {
                    match("func"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:8146:81: 'interface'
                    {
                    match("interface"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:8146:93: 'select'
                    {
                    match("select"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:8146:102: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:8146:109: 'defer'
                    {
                    match("defer"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:8146:117: 'go'
                    {
                    match("go"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:8146:122: 'map'
                    {
                    match("map"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:8146:128: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:8146:137: 'chan'
                    {
                    match("chan"); 


                    }
                    break;
                case 16 :
                    // InternalGo.g:8146:144: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 17 :
                    // InternalGo.g:8146:151: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 18 :
                    // InternalGo.g:8146:158: 'package'
                    {
                    match("package"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:8146:168: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 20 :
                    // InternalGo.g:8146:177: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 21 :
                    // InternalGo.g:8146:185: 'fallthrough'
                    {
                    match("fallthrough"); 


                    }
                    break;
                case 22 :
                    // InternalGo.g:8146:199: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 23 :
                    // InternalGo.g:8146:204: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 24 :
                    // InternalGo.g:8146:212: 'type'
                    {
                    match("type"); 


                    }
                    break;
                case 25 :
                    // InternalGo.g:8146:219: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 26 :
                    // InternalGo.g:8146:230: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 27 :
                    // InternalGo.g:8146:236: 'import'
                    {
                    match("import"); 


                    }
                    break;
                case 28 :
                    // InternalGo.g:8146:245: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 29 :
                    // InternalGo.g:8146:254: 'var'
                    {
                    match("var"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD"

    // $ANTLR start "RULE_BINARY_OP"
    public final void mRULE_BINARY_OP() throws RecognitionException {
        try {
            int _type = RULE_BINARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8148:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:8148:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:8148:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGo.g:8148:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8148:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8148:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8148:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8148:53: RULE_MUL_OP
                    {
                    mRULE_MUL_OP(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_OP"

    // $ANTLR start "RULE_REL_OP"
    public final void mRULE_REL_OP() throws RecognitionException {
        try {
            // InternalGo.g:8150:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:8150:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:8150:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt5=1;
                }
                break;
            case '!':
                {
                alt5=2;
                }
                break;
            case '<':
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3=='=') ) {
                    alt5=4;
                }
                else {
                    alt5=3;}
                }
                break;
            case '>':
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4=='=') ) {
                    alt5=6;
                }
                else {
                    alt5=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:8150:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8150:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8150:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8150:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8150:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8150:48: '>='
                    {
                    match(">="); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_REL_OP"

    // $ANTLR start "RULE_ADD_OP"
    public final void mRULE_ADD_OP() throws RecognitionException {
        try {
            // InternalGo.g:8152:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:8152:24: ( '+' | '-' | '|' | '^' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='^'||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_OP"

    // $ANTLR start "RULE_MUL_OP"
    public final void mRULE_MUL_OP() throws RecognitionException {
        try {
            // InternalGo.g:8154:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:8154:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:8154:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt6=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt6=1;
                }
                break;
            case '/':
                {
                alt6=2;
                }
                break;
            case '%':
                {
                alt6=3;
                }
                break;
            case '<':
                {
                alt6=4;
                }
                break;
            case '>':
                {
                alt6=5;
                }
                break;
            case '&':
                {
                int LA6_6 = input.LA(2);

                if ( (LA6_6=='^') ) {
                    alt6=7;
                }
                else {
                    alt6=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGo.g:8154:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8154:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8154:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8154:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8154:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8154:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8154:51: '&^'
                    {
                    match("&^"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_OP"

    // $ANTLR start "RULE_UNARY_OP"
    public final void mRULE_UNARY_OP() throws RecognitionException {
        try {
            // InternalGo.g:8156:24: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:8156:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:8156:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt7=1;
                }
                break;
            case '-':
                {
                alt7=2;
                }
                break;
            case '!':
                {
                alt7=3;
                }
                break;
            case '^':
                {
                alt7=4;
                }
                break;
            case '*':
                {
                alt7=5;
                }
                break;
            case '&':
                {
                alt7=6;
                }
                break;
            case '<':
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGo.g:8156:27: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8156:31: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8156:35: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8156:39: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8156:43: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8156:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8156:51: '<-'
                    {
                    match("<-"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNARY_OP"

    // $ANTLR start "RULE_INT_LIT"
    public final void mRULE_INT_LIT() throws RecognitionException {
        try {
            int _type = RULE_INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8158:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:8158:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:8158:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='0') ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='X'||LA8_2=='x') ) {
                    alt8=3;
                }
                else {
                    alt8=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:8158:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8158:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8158:49: RULE_HEX_LIT
                    {
                    mRULE_HEX_LIT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_LIT"

    // $ANTLR start "RULE_DECIMAL_LIT"
    public final void mRULE_DECIMAL_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8160:27: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:8160:29: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
            {
            matchRange('1','9'); 
            // InternalGo.g:8160:38: ( RULE_DECIMAL_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:8160:38: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_LIT"

    // $ANTLR start "RULE_OCTAL_LIT"
    public final void mRULE_OCTAL_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8162:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:8162:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:8162:31: ( RULE_OCTAL_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:8162:31: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_LIT"

    // $ANTLR start "RULE_HEX_LIT"
    public final void mRULE_HEX_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8164:23: ( '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:8164:25: '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8164:39: ( RULE_HEX_DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')||(LA11_0>='a' && LA11_0<='f')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:8164:39: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_LIT"

    // $ANTLR start "RULE_FLOAT_LIT"
    public final void mRULE_FLOAT_LIT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8166:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalGo.g:8166:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalGo.g:8166:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalGo.g:8166:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalGo.g:8166:37: ( RULE_DECIMALS )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:8166:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalGo.g:8166:52: ( RULE_EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGo.g:8166:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:8166:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8166:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:8166:113: ( RULE_EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGo.g:8166:113: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_LIT"

    // $ANTLR start "RULE_DECIMALS"
    public final void mRULE_DECIMALS() throws RecognitionException {
        try {
            // InternalGo.g:8168:24: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:8168:26: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:8168:26: ( RULE_DECIMAL_DIGIT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGo.g:8168:26: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMALS"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalGo.g:8170:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:8170:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8170:36: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='+'||LA17_0=='-') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_DECIMALS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_IMAGINARY_LIT"
    public final void mRULE_IMAGINARY_LIT() throws RecognitionException {
        try {
            int _type = RULE_IMAGINARY_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8172:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalGo.g:8172:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalGo.g:8172:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalGo.g:8172:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8172:37: RULE_FLOAT_LIT
                    {
                    mRULE_FLOAT_LIT(); 

                    }
                    break;

            }

            match('i'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMAGINARY_LIT"

    // $ANTLR start "RULE_RUNE_LIT"
    public final void mRULE_RUNE_LIT() throws RecognitionException {
        try {
            int _type = RULE_RUNE_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8174:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalGo.g:8174:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalGo.g:8174:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='z')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='\\') ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2=='\"'||LA19_2=='\''||LA19_2=='U'||LA19_2=='\\'||(LA19_2>='a' && LA19_2<='b')||LA19_2=='f'||LA19_2=='n'||LA19_2=='r'||(LA19_2>='t' && LA19_2<='v')) ) {
                    alt19=1;
                }
                else if ( ((LA19_2>='0' && LA19_2<='7')||LA19_2=='x') ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:8174:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8174:42: RULE_BYTE_VALUE
                    {
                    mRULE_BYTE_VALUE(); 

                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RUNE_LIT"

    // $ANTLR start "RULE_UNICODE_VALUE"
    public final void mRULE_UNICODE_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8176:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:8176:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:8176:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='A' && LA20_0<='Z')||(LA20_0>='a' && LA20_0<='z')) ) {
                alt20=1;
            }
            else if ( (LA20_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt20=2;
                    }
                    break;
                case 'U':
                    {
                    alt20=3;
                    }
                    break;
                case '\"':
                case '\'':
                case '\\':
                case 'a':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                case 'v':
                    {
                    alt20=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:8176:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8176:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8176:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8176:87: RULE_ESCAPED_CHAR
                    {
                    mRULE_ESCAPED_CHAR(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_VALUE"

    // $ANTLR start "RULE_BYTE_VALUE"
    public final void mRULE_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8178:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:8178:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:8178:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='x') ) {
                    alt21=2;
                }
                else if ( ((LA21_1>='0' && LA21_1<='7')) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:8178:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8178:51: RULE_HEX_BYTE_VALUE
                    {
                    mRULE_HEX_BYTE_VALUE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE_VALUE"

    // $ANTLR start "RULE_OCTAL_BYTE_VALUE"
    public final void mRULE_OCTAL_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8180:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:8180:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
            {
            match('\\'); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_BYTE_VALUE"

    // $ANTLR start "RULE_HEX_BYTE_VALUE"
    public final void mRULE_HEX_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8182:30: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8182:32: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match("\\x"); 

            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_BYTE_VALUE"

    // $ANTLR start "RULE_LITTLE_U_VALUE"
    public final void mRULE_LITTLE_U_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8184:30: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8184:32: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match("\\u"); 

            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITTLE_U_VALUE"

    // $ANTLR start "RULE_BIG_U_VALUE"
    public final void mRULE_BIG_U_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8186:27: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8186:29: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match("\\U"); 

            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIG_U_VALUE"

    // $ANTLR start "RULE_ESCAPED_CHAR"
    public final void mRULE_ESCAPED_CHAR() throws RecognitionException {
        try {
            // InternalGo.g:8188:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:8188:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHAR"

    // $ANTLR start "RULE_STRING_LIT"
    public final void mRULE_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8190:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalGo.g:8190:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalGo.g:8190:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\'') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\"') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:8190:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8190:40: RULE_INTERPRETED_STRING_LIT
                    {
                    mRULE_INTERPRETED_STRING_LIT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LIT"

    // $ANTLR start "RULE_RAW_STRING_LIT"
    public final void mRULE_RAW_STRING_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8192:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalGo.g:8192:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalGo.g:8192:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\n'||(LA23_0>='A' && LA23_0<='Z')||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( input.LA(1)=='\n'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RAW_STRING_LIT"

    // $ANTLR start "RULE_INTERPRETED_STRING_LIT"
    public final void mRULE_INTERPRETED_STRING_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8194:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalGo.g:8194:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalGo.g:8194:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='A' && LA24_0<='Z')||(LA24_0>='a' && LA24_0<='z')) ) {
                    alt24=1;
                }
                else if ( (LA24_0=='\\') ) {
                    int LA24_3 = input.LA(2);

                    if ( (LA24_3=='\"'||LA24_3=='\''||LA24_3=='U'||LA24_3=='\\'||(LA24_3>='a' && LA24_3<='b')||LA24_3=='f'||LA24_3=='n'||LA24_3=='r'||(LA24_3>='t' && LA24_3<='v')) ) {
                        alt24=1;
                    }
                    else if ( ((LA24_3>='0' && LA24_3<='7')||LA24_3=='x') ) {
                        alt24=2;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalGo.g:8194:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:8194:64: RULE_BYTE_VALUE
            	    {
            	    mRULE_BYTE_VALUE(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERPRETED_STRING_LIT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalGo.g:8196:22: ( ( RULE_UNICODE_LETTER | '_' ) )
            // InternalGo.g:8196:24: ( RULE_UNICODE_LETTER | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DECIMAL_DIGIT"
    public final void mRULE_DECIMAL_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:8198:29: ( '0' .. '9' )
            // InternalGo.g:8198:31: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:8200:27: ( '0' .. '7' )
            // InternalGo.g:8200:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:8202:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalGo.g:8202:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalGo.g:8204:23: ( '\\n' )
            // InternalGo.g:8204:25: '\\n'
            {
            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_UNICODE_CHAR"
    public final void mRULE_UNICODE_CHAR() throws RecognitionException {
        try {
            // InternalGo.g:8206:28: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:8206:30: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_CHAR"

    // $ANTLR start "RULE_UNICODE_LETTER"
    public final void mRULE_UNICODE_LETTER() throws RecognitionException {
        try {
            // InternalGo.g:8208:30: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:8208:32: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_LETTER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8210:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:8210:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:8210:11: ( '^' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='^') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:8210:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8210:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8212:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:8212:12: ( '0' .. '9' )+
            {
            // InternalGo.g:8212:12: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGo.g:8212:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8214:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:8214:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:8214:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\"') ) {
                alt30=1;
            }
            else if ( (LA30_0=='\'') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:8214:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:8214:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='!')||(LA28_0>='#' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalGo.g:8214:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8214:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8214:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:8214:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\\') ) {
                            alt29=1;
                        }
                        else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\uFFFF')) ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalGo.g:8214:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8214:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8216:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:8216:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:8216:24: ( options {greedy=false; } : . )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='*') ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1=='/') ) {
                        alt31=2;
                    }
                    else if ( ((LA31_1>='\u0000' && LA31_1<='.')||(LA31_1>='0' && LA31_1<='\uFFFF')) ) {
                        alt31=1;
                    }


                }
                else if ( ((LA31_0>='\u0000' && LA31_0<=')')||(LA31_0>='+' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:8216:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8218:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:8218:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:8218:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:8218:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalGo.g:8218:40: ( ( '\\r' )? '\\n' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:8218:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:8218:41: ( '\\r' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\r') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalGo.g:8218:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8220:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:8220:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:8220:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8222:16: ( . )
            // InternalGo.g:8222:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGo.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | RULE_BOOL | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt36=76;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // InternalGo.g:1:10: T__45
                {
                mT__45(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__46
                {
                mT__46(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__47
                {
                mT__47(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__48
                {
                mT__48(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__49
                {
                mT__49(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__50
                {
                mT__50(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__51
                {
                mT__51(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__52
                {
                mT__52(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__53
                {
                mT__53(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__54
                {
                mT__54(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__55
                {
                mT__55(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__56
                {
                mT__56(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__57
                {
                mT__57(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__58
                {
                mT__58(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__59
                {
                mT__59(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__60
                {
                mT__60(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__61
                {
                mT__61(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__62
                {
                mT__62(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__63
                {
                mT__63(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__64
                {
                mT__64(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__65
                {
                mT__65(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__66
                {
                mT__66(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__67
                {
                mT__67(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__68
                {
                mT__68(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__69
                {
                mT__69(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__70
                {
                mT__70(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__71
                {
                mT__71(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__72
                {
                mT__72(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__73
                {
                mT__73(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__74
                {
                mT__74(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__75
                {
                mT__75(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__76
                {
                mT__76(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__77
                {
                mT__77(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__78
                {
                mT__78(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__79
                {
                mT__79(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__80
                {
                mT__80(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__81
                {
                mT__81(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__82
                {
                mT__82(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__83
                {
                mT__83(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__84
                {
                mT__84(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__85
                {
                mT__85(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__86
                {
                mT__86(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: T__87
                {
                mT__87(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:268: T__88
                {
                mT__88(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:274: T__89
                {
                mT__89(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:280: T__90
                {
                mT__90(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:286: T__91
                {
                mT__91(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:292: T__92
                {
                mT__92(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:298: T__93
                {
                mT__93(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:304: T__94
                {
                mT__94(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:310: T__95
                {
                mT__95(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:316: T__96
                {
                mT__96(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:322: T__97
                {
                mT__97(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:328: T__98
                {
                mT__98(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:334: T__99
                {
                mT__99(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:340: T__100
                {
                mT__100(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:347: T__101
                {
                mT__101(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:354: T__102
                {
                mT__102(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:361: T__103
                {
                mT__103(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:368: T__104
                {
                mT__104(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:375: T__105
                {
                mT__105(); 

                }
                break;
            case 62 :
                // InternalGo.g:1:382: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 63 :
                // InternalGo.g:1:392: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 64 :
                // InternalGo.g:1:408: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 65 :
                // InternalGo.g:1:423: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 66 :
                // InternalGo.g:1:436: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 67 :
                // InternalGo.g:1:451: RULE_IMAGINARY_LIT
                {
                mRULE_IMAGINARY_LIT(); 

                }
                break;
            case 68 :
                // InternalGo.g:1:470: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 69 :
                // InternalGo.g:1:484: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 70 :
                // InternalGo.g:1:500: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // InternalGo.g:1:508: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 72 :
                // InternalGo.g:1:517: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 73 :
                // InternalGo.g:1:529: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // InternalGo.g:1:545: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // InternalGo.g:1:561: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // InternalGo.g:1:569: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA3_eotS =
        "\36\uffff\1\46\2\uffff\1\50\15\uffff";
    static final String DFA3_eofS =
        "\57\uffff";
    static final String DFA3_minS =
        "\1\142\1\157\1\146\1\145\1\141\1\145\1\141\1\157\3\uffff\1\141\4\uffff\1\164\2\uffff\1\162\6\uffff\1\146\2\uffff\1\156\1\164\2\uffff\1\145\1\151\1\141\1\163\12\uffff";
    static final String DFA3_maxS =
        "\1\166\1\162\1\156\1\167\1\165\1\145\2\157\3\uffff\1\145\4\uffff\1\164\2\uffff\1\162\6\uffff\1\146\2\uffff\1\156\1\164\2\uffff\1\145\1\165\1\145\1\164\12\uffff";
    static final String DFA3_acceptS =
        "\10\uffff\1\15\1\20\1\22\1\uffff\1\30\1\35\1\1\1\5\1\uffff\1\26\1\33\1\uffff\1\11\1\23\1\4\1\7\1\25\1\32\1\uffff\1\12\1\17\2\uffff\1\27\1\34\4\uffff\1\21\1\14\1\10\1\2\1\3\1\16\1\6\1\13\1\24\1\31";
    static final String DFA3_specialS =
        "\57\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\6\1\5\1\11\1\4\1\7\1\uffff\1\2\3\uffff\1\10\2\uffff\1\12\1\uffff\1\13\1\3\1\14\1\uffff\1\15",
            "\1\17\2\uffff\1\16",
            "\1\21\6\uffff\1\22\1\20",
            "\1\24\16\uffff\1\23\2\uffff\1\25",
            "\1\30\12\uffff\1\26\2\uffff\1\31\5\uffff\1\27",
            "\1\32",
            "\1\33\6\uffff\1\34\6\uffff\1\35",
            "\1\36",
            "",
            "",
            "",
            "\1\37\3\uffff\1\40",
            "",
            "",
            "",
            "",
            "\1\41",
            "",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "\1\44",
            "\1\45",
            "",
            "",
            "\1\47",
            "\1\51\13\uffff\1\52",
            "\1\53\3\uffff\1\54",
            "\1\55\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "8146:25: ( 'break' | 'int' | 'string' | 'float' | 'bool' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' )";
        }
    }
    static final String DFA4_eotS =
        "\1\uffff\1\6\1\7\1\uffff\2\3\4\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\41\1\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA4_maxS =
        "\2\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\3\2\uffff\1\4\1\5\1\1\1\2";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\3\uffff\1\7\1\2\3\uffff\1\7\1\6\1\uffff\1\6\1\uffff\1\7\14\uffff\1\4\1\3\1\5\37\uffff\1\6\35\uffff\1\1",
            "\1\10",
            "\1\11",
            "",
            "\1\7",
            "\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "8148:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
        }
    }
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\2\56\3\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\1\2\1\1";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "8166:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\4\uffff";
    static final String DFA18_minS =
        "\2\56\2\uffff";
    static final String DFA18_maxS =
        "\1\71\1\151\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "8172:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\2\63\2\uffff\1\73\1\63\1\101\1\uffff\3\63\2\uffff\1\100\1\116\1\120\1\121\1\122\1\uffff\1\127\1\uffff\1\100\1\133\1\135\15\63\2\uffff\1\63\1\162\1\uffff\1\63\2\164\2\61\2\uffff\1\63\1\uffff\2\63\1\u0086\1\63\4\uffff\1\u0088\3\63\3\uffff\6\63\25\uffff\3\63\1\u009a\15\63\2\uffff\1\63\4\uffff\1\164\1\u0088\1\uffff\1\164\1\u00ad\11\uffff\2\63\1\uffff\1\63\2\uffff\7\63\1\u00c8\1\u00c9\3\uffff\4\63\1\uffff\13\63\1\u00da\1\63\1\u00dc\1\uffff\2\u0088\16\uffff\3\63\1\uffff\1\u0088\2\63\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\2\63\2\uffff\3\63\1\u00f8\2\63\1\u00fb\11\63\1\uffff\1\63\2\uffff\1\u0088\12\uffff\3\63\1\u0111\1\63\5\uffff\1\63\1\u00f1\1\63\1\u0115\1\u0116\1\uffff\1\u0117\1\63\1\uffff\3\63\1\u011c\1\63\1\u011e\4\63\10\uffff\1\63\1\u0128\1\63\1\uffff\2\63\1\u012c\3\uffff\1\63\1\u012e\1\u012f\1\u0130\1\uffff\1\63\1\uffff\4\63\4\uffff\1\u013a\1\uffff\3\63\1\uffff\1\u013e\3\uffff\1\63\1\u0140\2\63\1\u0143\5\uffff\1\63\1\u0147\1\63\1\uffff\1\63\1\uffff\1\u014a\1\63\3\uffff\1\u014e\1\uffff\2\63\1\uffff\1\u0151\3\uffff\1\63\1\u0155\3\uffff\1\u0158\4\uffff";
    static final String DFA36_eofS =
        "\u0159\uffff";
    static final String DFA36_minS =
        "\1\0\2\60\2\uffff\1\56\1\60\1\75\1\uffff\3\60\2\uffff\1\55\1\53\1\55\1\174\1\101\1\uffff\1\52\1\uffff\1\76\1\46\1\75\15\60\2\uffff\1\60\1\75\1\uffff\1\60\2\56\2\0\2\uffff\1\60\1\uffff\4\60\4\uffff\4\60\3\uffff\6\60\25\uffff\21\60\2\uffff\1\60\3\uffff\1\53\1\56\1\60\1\uffff\2\56\2\0\2\uffff\3\0\2\uffff\2\60\1\uffff\1\60\1\uffff\1\53\11\60\3\uffff\4\60\1\uffff\21\60\1\53\1\uffff\5\0\2\uffff\5\0\16\60\2\uffff\20\60\1\uffff\1\60\1\uffff\2\60\2\0\1\uffff\2\0\1\uffff\4\0\5\60\5\uffff\5\60\1\uffff\2\60\1\uffff\12\60\10\0\3\60\1\uffff\3\60\3\uffff\4\60\1\uffff\1\60\1\uffff\4\60\4\0\1\60\1\uffff\3\60\1\uffff\1\60\3\uffff\5\60\4\0\1\uffff\3\60\1\uffff\1\60\1\uffff\2\60\1\uffff\2\0\1\60\1\uffff\2\60\1\uffff\1\60\2\0\1\uffff\2\60\1\uffff\2\0\1\60\1\uffff\2\0\1\uffff";
    static final String DFA36_maxS =
        "\1\uffff\2\172\2\uffff\1\71\1\172\1\75\1\uffff\3\172\2\uffff\1\74\1\53\1\55\1\174\1\172\1\uffff\1\57\1\uffff\1\76\1\136\1\75\15\172\2\uffff\1\172\1\75\1\uffff\1\172\2\151\2\uffff\2\uffff\1\172\1\uffff\4\172\4\uffff\1\151\3\172\3\uffff\6\172\25\uffff\21\172\2\uffff\1\172\3\uffff\1\71\2\151\1\uffff\2\151\2\uffff\2\uffff\3\uffff\2\uffff\2\172\1\uffff\1\172\1\uffff\1\71\11\172\3\uffff\4\172\1\uffff\16\172\1\71\2\151\1\71\1\uffff\5\uffff\2\uffff\5\uffff\3\172\1\71\1\151\11\172\2\uffff\20\172\1\uffff\1\172\1\uffff\1\71\1\151\2\uffff\1\uffff\2\uffff\1\uffff\4\uffff\5\172\5\uffff\5\172\1\uffff\2\172\1\uffff\12\172\10\uffff\3\172\1\uffff\3\172\3\uffff\4\172\1\uffff\1\172\1\uffff\4\172\4\uffff\1\172\1\uffff\3\172\1\uffff\1\172\3\uffff\5\172\4\uffff\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2\uffff\1\172\1\uffff\2\172\1\uffff\1\172\2\uffff\1\uffff\2\172\1\uffff\2\uffff\1\172\1\uffff\2\uffff\1\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\1\3\1\4\3\uffff\1\10\3\uffff\1\14\1\15\5\uffff\1\25\1\uffff\1\27\20\uffff\1\65\1\66\2\uffff\1\75\5\uffff\1\113\1\114\1\uffff\1\77\4\uffff\1\3\1\4\1\72\1\5\4\uffff\1\100\1\7\1\10\6\uffff\1\14\1\15\1\16\1\30\1\17\1\21\1\20\1\22\1\23\1\24\1\106\1\25\1\111\1\112\1\26\1\27\1\31\1\33\1\32\1\34\1\35\21\uffff\1\65\1\66\1\uffff\1\74\1\75\1\101\3\uffff\1\103\4\uffff\1\105\1\110\3\uffff\1\105\1\113\2\uffff\1\44\1\uffff\1\102\12\uffff\1\30\1\31\1\33\4\uffff\1\54\22\uffff\1\107\5\uffff\1\104\1\105\23\uffff\1\52\1\13\20\uffff\1\63\1\uffff\1\70\4\uffff\1\104\2\uffff\1\104\11\uffff\1\47\1\71\1\11\1\76\1\12\5\uffff\1\41\2\uffff\1\45\25\uffff\1\6\3\uffff\1\53\1\37\1\43\4\uffff\1\55\1\uffff\1\62\11\uffff\1\2\3\uffff\1\36\1\uffff\1\46\1\51\1\73\11\uffff\1\1\3\uffff\1\50\1\uffff\1\57\2\uffff\1\64\3\uffff\1\40\2\uffff\1\60\3\uffff\1\67\2\uffff\1\61\3\uffff\1\56\2\uffff\1\42";
    static final String DFA36_specialS =
        "\1\60\55\uffff\1\34\1\37\113\uffff\1\26\1\33\2\uffff\1\0\1\13\1\25\54\uffff\1\30\1\31\1\32\1\27\1\2\2\uffff\1\1\1\4\1\57\1\61\1\41\45\uffff\1\6\1\11\1\uffff\1\5\1\3\1\uffff\1\45\1\50\1\44\1\43\35\uffff\1\7\1\12\1\23\1\20\1\46\1\51\1\40\1\35\25\uffff\1\10\1\14\1\47\1\52\17\uffff\1\22\1\15\1\36\1\53\12\uffff\1\16\1\54\6\uffff\1\17\1\55\4\uffff\1\21\1\56\2\uffff\1\24\1\42\1\uffff}>";
    static final String[] DFA36_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\51\1\57\2\61\1\25\1\27\1\56\1\3\1\4\1\23\1\17\1\10\1\20\1\5\1\24\1\55\11\54\1\30\1\52\1\16\1\7\1\26\2\61\1\37\1\53\1\45\2\53\1\42\2\53\1\43\3\53\1\44\2\53\1\41\2\53\1\40\7\53\1\46\1\61\1\47\1\22\1\53\1\61\1\53\1\32\1\6\1\34\1\35\1\12\1\33\1\53\1\2\3\53\1\50\2\53\1\1\1\53\1\31\1\36\1\11\1\53\1\13\4\53\1\14\1\21\1\15\uff82\61",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\62\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\66\6\64\1\65\1\67\14\64",
            "",
            "",
            "\1\72\1\uffff\12\74",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\76\6\64\1\77\6\64\1\75\13\64",
            "\1\100",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\104\6\64\1\103\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\106\15\64\1\107\5\64\1\105\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\110\31\64",
            "",
            "",
            "\1\113\16\uffff\1\114",
            "\1\115",
            "\1\117",
            "\1\100",
            "\32\123\4\uffff\1\123\1\uffff\32\123",
            "",
            "\1\125\4\uffff\1\126",
            "",
            "\1\131",
            "\1\100\67\uffff\1\132",
            "\1\134",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\137\3\64\1\136\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\140\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\141\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\142\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\143\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\145\16\64\1\146\2\64\1\144\3\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\147\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\151\7\64\1\150\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\152\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\153\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\154\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\155\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\156\22\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\161\31\64",
            "\1\100",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\167\1\uffff\12\166\13\uffff\1\165\37\uffff\1\165\3\uffff\1\170",
            "\1\167\1\uffff\10\171\2\172\13\uffff\1\165\37\uffff\1\165\3\uffff\1\170",
            "\12\176\1\177\34\176\1\175\31\176\32\174\1\176\1\173\4\176\32\174\uff85\176",
            "\42\176\1\u0082\36\176\32\u0080\1\176\1\u0081\4\176\32\u0080\uff85\176",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0084\27\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u0085\12\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0087\6\64",
            "",
            "",
            "",
            "",
            "\12\74\13\uffff\1\u0089\37\uffff\1\u0089\3\uffff\1\170",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u008a\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u008b\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u008c\31\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u008d\12\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u008e\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u008f\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0090\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0091\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0092\10\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0096\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0097\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0098\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0099\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u009b\24\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u009c\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u009d\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u009e\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u009f\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00a0\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00a1\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00a2\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00a3\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00a4\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00a5\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u00a6\12\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00a7\31\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u00a8\12\64",
            "",
            "",
            "",
            "\1\u00a9\1\uffff\1\u00a9\2\uffff\12\u00aa",
            "\1\167\1\uffff\12\166\13\uffff\1\165\37\uffff\1\165\3\uffff\1\170",
            "\12\u00ab\13\uffff\1\u00ac\37\uffff\1\u00ac\3\uffff\1\170",
            "",
            "\1\167\1\uffff\10\171\2\172\13\uffff\1\165\37\uffff\1\165\3\uffff\1\170",
            "\1\167\1\uffff\12\172\13\uffff\1\165\37\uffff\1\165\3\uffff\1\170",
            "\42\176\1\u00b0\4\176\1\u00b0\10\176\10\u00b2\35\176\1\u00af\6\176\1\u00b0\4\176\2\u00b0\3\176\1\u00b0\7\176\1\u00b0\3\176\1\u00b0\1\176\1\u00b0\1\u00ae\1\u00b0\1\176\1\u00b1\uff87\176",
            "\12\176\1\177\34\176\1\u00b3\31\176\32\177\6\176\32\177\uff85\176",
            "",
            "",
            "\12\176\1\177\34\176\1\175\31\176\32\177\6\176\32\177\uff85\176",
            "\42\176\1\u0082\36\176\32\u0080\1\176\1\u0081\4\176\32\u0080\uff85\176",
            "\42\176\1\u00b7\4\176\1\u00b7\10\176\10\u00b9\35\176\1\u00b6\6\176\1\u00b7\4\176\2\u00b7\3\176\1\u00b7\7\176\1\u00b7\3\176\1\u00b7\1\176\1\u00b7\1\u00b5\1\u00b7\1\176\1\u00b8\uff87\176",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\12\64\1\u00ba\17\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00bb\13\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00bc\25\64",
            "",
            "\1\u00bd\1\uffff\1\u00bd\2\uffff\12\u00be",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u00bf\1\u00c0\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00c1\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00c2\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00c3\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00c4\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00c5\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00c6\6\64\1\u00c7\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u00ca\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u00cb\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00cc\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00cd\13\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00cf\3\64\1\u00ce\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00d0\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00d1\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00d2\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u00d3\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00d4\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u00d5\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00d6\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00d7\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00d8\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00d9\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00db\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\u00aa",
            "\12\u00aa\57\uffff\1\170",
            "\12\u00ab\13\uffff\1\u00ac\37\uffff\1\u00ac\3\uffff\1\170",
            "\1\u00dd\1\uffff\1\u00dd\2\uffff\12\u00de",
            "",
            "\60\176\12\u00df\7\176\6\u00df\32\176\6\u00df\uff99\176",
            "\60\176\12\u00e0\7\176\6\u00e0\32\176\6\u00e0\uff99\176",
            "\47\176\1\u00e1\uffd8\176",
            "\60\176\12\u00e2\7\176\6\u00e2\32\176\6\u00e2\uff99\176",
            "\60\176\10\u00e3\uffc8\176",
            "",
            "",
            "\60\176\12\u00e5\7\176\6\u00e5\32\176\6\u00e5\uff99\176",
            "\60\176\12\u00e6\7\176\6\u00e6\32\176\6\u00e6\uff99\176",
            "\42\176\1\u0082\36\176\32\u0080\1\176\1\u0081\4\176\32\u0080\uff85\176",
            "\60\176\12\u00e7\7\176\6\u00e7\32\176\6\u00e7\uff99\176",
            "\60\176\10\u00e8\uffc8\176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00e9\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00ea\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00eb\10\64",
            "\12\u00be",
            "\12\u00be\57\uffff\1\170",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00ec\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00ed\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00f3\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00f4\25\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00f5\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00f6\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\12\64\1\u00f7\17\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00f9\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u00fa\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00fc\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00fd\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00fe\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u00ff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0100\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0101\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0102\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0103\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0104\10\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0105\14\64",
            "",
            "\12\u00de",
            "\12\u00de\57\uffff\1\170",
            "\60\176\12\u0106\7\176\6\u0106\32\176\6\u0106\uff99\176",
            "\60\176\12\u0107\7\176\6\u0107\32\176\6\u0107\uff99\176",
            "",
            "\60\176\12\u0108\7\176\6\u0108\32\176\6\u0108\uff99\176",
            "\60\176\10\u0109\uffc8\176",
            "",
            "\60\176\12\u010a\7\176\6\u010a\32\176\6\u010a\uff99\176",
            "\60\176\12\u010b\7\176\6\u010b\32\176\6\u010b\uff99\176",
            "\60\176\12\u010c\7\176\6\u010c\32\176\6\u010c\uff99\176",
            "\60\176\10\u010d\uffc8\176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u010e\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u010f\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u0110\24\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0112\14\64",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u0113\22\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0114\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0118\16\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u0119\22\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u011a\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u011b\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u011d\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u011f\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0120\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u0121\24\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0122\25\64",
            "\60\176\12\u0123\7\176\6\u0123\32\176\6\u0123\uff99\176",
            "\60\176\12\u0124\7\176\6\u0124\32\176\6\u0124\uff99\176",
            "\47\176\1\u00e1\uffd8\176",
            "\47\176\1\u00e1\uffd8\176",
            "\60\176\12\u0125\7\176\6\u0125\32\176\6\u0125\uff99\176",
            "\60\176\12\u0126\7\176\6\u0126\32\176\6\u0126\uff99\176",
            "\42\176\1\u0082\36\176\32\u0080\1\176\1\u0081\4\176\32\u0080\uff85\176",
            "\42\176\1\u0082\36\176\32\u0080\1\176\1\u0081\4\176\32\u0080\uff85\176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0127\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0129\31\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u012a\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u012b\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u012d\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\23\64\1\u0131\6\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0132\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0133\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0134\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0135\16\64",
            "\60\176\12\u0136\7\176\6\u0136\32\176\6\u0136\uff99\176",
            "\60\176\12\u0137\7\176\6\u0137\32\176\6\u0137\uff99\176",
            "\60\176\12\u0138\7\176\6\u0138\32\176\6\u0138\uff99\176",
            "\60\176\12\u0139\7\176\6\u0139\32\176\6\u0139\uff99\176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u013b\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u013c\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u013d\13\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u013f\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0141\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0142\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\47\176\1\u00e1\uffd8\176",
            "\60\176\12\u0144\7\176\6\u0144\32\176\6\u0144\uff99\176",
            "\42\176\1\u0082\36\176\32\u0080\1\176\1\u0081\4\176\32\u0080\uff85\176",
            "\60\176\12\u0145\7\176\6\u0145\32\176\6\u0145\uff99\176",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0146\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u0148\5\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u0149\12\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u014b\25\64",
            "",
            "\60\176\12\u014c\7\176\6\u014c\32\176\6\u014c\uff99\176",
            "\60\176\12\u014d\7\176\6\u014d\32\176\6\u014d\uff99\176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u014f\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0150\25\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\60\176\12\u0152\7\176\6\u0152\32\176\6\u0152\uff99\176",
            "\60\176\12\u0153\7\176\6\u0153\32\176\6\u0153\uff99\176",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u0154\22\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\60\176\12\u0156\7\176\6\u0156\32\176\6\u0156\uff99\176",
            "\60\176\12\u0157\7\176\6\u0157\32\176\6\u0157\uff99\176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\47\176\1\u00e1\uffd8\176",
            "\42\176\1\u0082\36\176\32\u0080\1\176\1\u0081\4\176\32\u0080\uff85\176",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | RULE_BOOL | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_127 = input.LA(1);

                        s = -1;
                        if ( (LA36_127=='\'') ) {s = 125;}

                        else if ( (LA36_127=='\n'||(LA36_127>='A' && LA36_127<='Z')||(LA36_127>='a' && LA36_127<='z')) ) {s = 127;}

                        else if ( ((LA36_127>='\u0000' && LA36_127<='\t')||(LA36_127>='\u000B' && LA36_127<='&')||(LA36_127>='(' && LA36_127<='@')||(LA36_127>='[' && LA36_127<='`')||(LA36_127>='{' && LA36_127<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_181 = input.LA(1);

                        s = -1;
                        if ( ((LA36_181>='\u0000' && LA36_181<='/')||(LA36_181>=':' && LA36_181<='@')||(LA36_181>='G' && LA36_181<='`')||(LA36_181>='g' && LA36_181<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_181>='0' && LA36_181<='9')||(LA36_181>='A' && LA36_181<='F')||(LA36_181>='a' && LA36_181<='f')) ) {s = 229;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_178 = input.LA(1);

                        s = -1;
                        if ( ((LA36_178>='0' && LA36_178<='7')) ) {s = 227;}

                        else if ( ((LA36_178>='\u0000' && LA36_178<='/')||(LA36_178>='8' && LA36_178<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_227 = input.LA(1);

                        s = -1;
                        if ( ((LA36_227>='0' && LA36_227<='7')) ) {s = 265;}

                        else if ( ((LA36_227>='\u0000' && LA36_227<='/')||(LA36_227>='8' && LA36_227<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_182 = input.LA(1);

                        s = -1;
                        if ( ((LA36_182>='\u0000' && LA36_182<='/')||(LA36_182>=':' && LA36_182<='@')||(LA36_182>='G' && LA36_182<='`')||(LA36_182>='g' && LA36_182<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_182>='0' && LA36_182<='9')||(LA36_182>='A' && LA36_182<='F')||(LA36_182>='a' && LA36_182<='f')) ) {s = 230;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_226 = input.LA(1);

                        s = -1;
                        if ( ((LA36_226>='0' && LA36_226<='9')||(LA36_226>='A' && LA36_226<='F')||(LA36_226>='a' && LA36_226<='f')) ) {s = 264;}

                        else if ( ((LA36_226>='\u0000' && LA36_226<='/')||(LA36_226>=':' && LA36_226<='@')||(LA36_226>='G' && LA36_226<='`')||(LA36_226>='g' && LA36_226<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_223 = input.LA(1);

                        s = -1;
                        if ( ((LA36_223>='0' && LA36_223<='9')||(LA36_223>='A' && LA36_223<='F')||(LA36_223>='a' && LA36_223<='f')) ) {s = 262;}

                        else if ( ((LA36_223>='\u0000' && LA36_223<='/')||(LA36_223>=':' && LA36_223<='@')||(LA36_223>='G' && LA36_223<='`')||(LA36_223>='g' && LA36_223<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_262 = input.LA(1);

                        s = -1;
                        if ( ((LA36_262>='0' && LA36_262<='9')||(LA36_262>='A' && LA36_262<='F')||(LA36_262>='a' && LA36_262<='f')) ) {s = 291;}

                        else if ( ((LA36_262>='\u0000' && LA36_262<='/')||(LA36_262>=':' && LA36_262<='@')||(LA36_262>='G' && LA36_262<='`')||(LA36_262>='g' && LA36_262<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_291 = input.LA(1);

                        s = -1;
                        if ( ((LA36_291>='0' && LA36_291<='9')||(LA36_291>='A' && LA36_291<='F')||(LA36_291>='a' && LA36_291<='f')) ) {s = 310;}

                        else if ( ((LA36_291>='\u0000' && LA36_291<='/')||(LA36_291>=':' && LA36_291<='@')||(LA36_291>='G' && LA36_291<='`')||(LA36_291>='g' && LA36_291<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_224 = input.LA(1);

                        s = -1;
                        if ( ((LA36_224>='0' && LA36_224<='9')||(LA36_224>='A' && LA36_224<='F')||(LA36_224>='a' && LA36_224<='f')) ) {s = 263;}

                        else if ( ((LA36_224>='\u0000' && LA36_224<='/')||(LA36_224>=':' && LA36_224<='@')||(LA36_224>='G' && LA36_224<='`')||(LA36_224>='g' && LA36_224<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_263 = input.LA(1);

                        s = -1;
                        if ( ((LA36_263>='0' && LA36_263<='9')||(LA36_263>='A' && LA36_263<='F')||(LA36_263>='a' && LA36_263<='f')) ) {s = 292;}

                        else if ( ((LA36_263>='\u0000' && LA36_263<='/')||(LA36_263>=':' && LA36_263<='@')||(LA36_263>='G' && LA36_263<='`')||(LA36_263>='g' && LA36_263<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_128 = input.LA(1);

                        s = -1;
                        if ( (LA36_128=='\"') ) {s = 130;}

                        else if ( ((LA36_128>='A' && LA36_128<='Z')||(LA36_128>='a' && LA36_128<='z')) ) {s = 128;}

                        else if ( (LA36_128=='\\') ) {s = 129;}

                        else if ( ((LA36_128>='\u0000' && LA36_128<='!')||(LA36_128>='#' && LA36_128<='@')||LA36_128=='['||(LA36_128>=']' && LA36_128<='`')||(LA36_128>='{' && LA36_128<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA36_292 = input.LA(1);

                        s = -1;
                        if ( ((LA36_292>='0' && LA36_292<='9')||(LA36_292>='A' && LA36_292<='F')||(LA36_292>='a' && LA36_292<='f')) ) {s = 311;}

                        else if ( ((LA36_292>='\u0000' && LA36_292<='/')||(LA36_292>=':' && LA36_292<='@')||(LA36_292>='G' && LA36_292<='`')||(LA36_292>='g' && LA36_292<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA36_311 = input.LA(1);

                        s = -1;
                        if ( ((LA36_311>='0' && LA36_311<='9')||(LA36_311>='A' && LA36_311<='F')||(LA36_311>='a' && LA36_311<='f')) ) {s = 324;}

                        else if ( ((LA36_311>='\u0000' && LA36_311<='/')||(LA36_311>=':' && LA36_311<='@')||(LA36_311>='G' && LA36_311<='`')||(LA36_311>='g' && LA36_311<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA36_324 = input.LA(1);

                        s = -1;
                        if ( ((LA36_324>='\u0000' && LA36_324<='/')||(LA36_324>=':' && LA36_324<='@')||(LA36_324>='G' && LA36_324<='`')||(LA36_324>='g' && LA36_324<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_324>='0' && LA36_324<='9')||(LA36_324>='A' && LA36_324<='F')||(LA36_324>='a' && LA36_324<='f')) ) {s = 332;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA36_332 = input.LA(1);

                        s = -1;
                        if ( ((LA36_332>='0' && LA36_332<='9')||(LA36_332>='A' && LA36_332<='F')||(LA36_332>='a' && LA36_332<='f')) ) {s = 338;}

                        else if ( ((LA36_332>='\u0000' && LA36_332<='/')||(LA36_332>=':' && LA36_332<='@')||(LA36_332>='G' && LA36_332<='`')||(LA36_332>='g' && LA36_332<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA36_265 = input.LA(1);

                        s = -1;
                        if ( (LA36_265=='\'') ) {s = 225;}

                        else if ( ((LA36_265>='\u0000' && LA36_265<='&')||(LA36_265>='(' && LA36_265<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA36_338 = input.LA(1);

                        s = -1;
                        if ( ((LA36_338>='0' && LA36_338<='9')||(LA36_338>='A' && LA36_338<='F')||(LA36_338>='a' && LA36_338<='f')) ) {s = 342;}

                        else if ( ((LA36_338>='\u0000' && LA36_338<='/')||(LA36_338>=':' && LA36_338<='@')||(LA36_338>='G' && LA36_338<='`')||(LA36_338>='g' && LA36_338<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA36_310 = input.LA(1);

                        s = -1;
                        if ( (LA36_310=='\'') ) {s = 225;}

                        else if ( ((LA36_310>='\u0000' && LA36_310<='&')||(LA36_310>='(' && LA36_310<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA36_264 = input.LA(1);

                        s = -1;
                        if ( (LA36_264=='\'') ) {s = 225;}

                        else if ( ((LA36_264>='\u0000' && LA36_264<='&')||(LA36_264>='(' && LA36_264<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA36_342 = input.LA(1);

                        s = -1;
                        if ( (LA36_342=='\'') ) {s = 225;}

                        else if ( ((LA36_342>='\u0000' && LA36_342<='&')||(LA36_342>='(' && LA36_342<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA36_129 = input.LA(1);

                        s = -1;
                        if ( (LA36_129=='u') ) {s = 181;}

                        else if ( (LA36_129=='U') ) {s = 182;}

                        else if ( (LA36_129=='\"'||LA36_129=='\''||LA36_129=='\\'||(LA36_129>='a' && LA36_129<='b')||LA36_129=='f'||LA36_129=='n'||LA36_129=='r'||LA36_129=='t'||LA36_129=='v') ) {s = 183;}

                        else if ( (LA36_129=='x') ) {s = 184;}

                        else if ( ((LA36_129>='0' && LA36_129<='7')) ) {s = 185;}

                        else if ( ((LA36_129>='\u0000' && LA36_129<='!')||(LA36_129>='#' && LA36_129<='&')||(LA36_129>='(' && LA36_129<='/')||(LA36_129>='8' && LA36_129<='T')||(LA36_129>='V' && LA36_129<='[')||(LA36_129>=']' && LA36_129<='`')||(LA36_129>='c' && LA36_129<='e')||(LA36_129>='g' && LA36_129<='m')||(LA36_129>='o' && LA36_129<='q')||LA36_129=='s'||LA36_129=='w'||(LA36_129>='y' && LA36_129<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA36_123 = input.LA(1);

                        s = -1;
                        if ( (LA36_123=='u') ) {s = 174;}

                        else if ( (LA36_123=='U') ) {s = 175;}

                        else if ( (LA36_123=='\"'||LA36_123=='\''||LA36_123=='\\'||(LA36_123>='a' && LA36_123<='b')||LA36_123=='f'||LA36_123=='n'||LA36_123=='r'||LA36_123=='t'||LA36_123=='v') ) {s = 176;}

                        else if ( (LA36_123=='x') ) {s = 177;}

                        else if ( ((LA36_123>='0' && LA36_123<='7')) ) {s = 178;}

                        else if ( ((LA36_123>='\u0000' && LA36_123<='!')||(LA36_123>='#' && LA36_123<='&')||(LA36_123>='(' && LA36_123<='/')||(LA36_123>='8' && LA36_123<='T')||(LA36_123>='V' && LA36_123<='[')||(LA36_123>=']' && LA36_123<='`')||(LA36_123>='c' && LA36_123<='e')||(LA36_123>='g' && LA36_123<='m')||(LA36_123>='o' && LA36_123<='q')||LA36_123=='s'||LA36_123=='w'||(LA36_123>='y' && LA36_123<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA36_177 = input.LA(1);

                        s = -1;
                        if ( ((LA36_177>='\u0000' && LA36_177<='/')||(LA36_177>=':' && LA36_177<='@')||(LA36_177>='G' && LA36_177<='`')||(LA36_177>='g' && LA36_177<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_177>='0' && LA36_177<='9')||(LA36_177>='A' && LA36_177<='F')||(LA36_177>='a' && LA36_177<='f')) ) {s = 226;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA36_174 = input.LA(1);

                        s = -1;
                        if ( ((LA36_174>='0' && LA36_174<='9')||(LA36_174>='A' && LA36_174<='F')||(LA36_174>='a' && LA36_174<='f')) ) {s = 223;}

                        else if ( ((LA36_174>='\u0000' && LA36_174<='/')||(LA36_174>=':' && LA36_174<='@')||(LA36_174>='G' && LA36_174<='`')||(LA36_174>='g' && LA36_174<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA36_175 = input.LA(1);

                        s = -1;
                        if ( ((LA36_175>='\u0000' && LA36_175<='/')||(LA36_175>=':' && LA36_175<='@')||(LA36_175>='G' && LA36_175<='`')||(LA36_175>='g' && LA36_175<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_175>='0' && LA36_175<='9')||(LA36_175>='A' && LA36_175<='F')||(LA36_175>='a' && LA36_175<='f')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA36_176 = input.LA(1);

                        s = -1;
                        if ( (LA36_176=='\'') ) {s = 225;}

                        else if ( ((LA36_176>='\u0000' && LA36_176<='&')||(LA36_176>='(' && LA36_176<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA36_124 = input.LA(1);

                        s = -1;
                        if ( (LA36_124=='\'') ) {s = 179;}

                        else if ( (LA36_124=='\n'||(LA36_124>='A' && LA36_124<='Z')||(LA36_124>='a' && LA36_124<='z')) ) {s = 127;}

                        else if ( ((LA36_124>='\u0000' && LA36_124<='\t')||(LA36_124>='\u000B' && LA36_124<='&')||(LA36_124>='(' && LA36_124<='@')||(LA36_124>='[' && LA36_124<='`')||(LA36_124>='{' && LA36_124<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA36_46 = input.LA(1);

                        s = -1;
                        if ( (LA36_46=='\\') ) {s = 123;}

                        else if ( ((LA36_46>='A' && LA36_46<='Z')||(LA36_46>='a' && LA36_46<='z')) ) {s = 124;}

                        else if ( (LA36_46=='\'') ) {s = 125;}

                        else if ( ((LA36_46>='\u0000' && LA36_46<='\t')||(LA36_46>='\u000B' && LA36_46<='&')||(LA36_46>='(' && LA36_46<='@')||LA36_46=='['||(LA36_46>=']' && LA36_46<='`')||(LA36_46>='{' && LA36_46<='\uFFFF')) ) {s = 126;}

                        else if ( (LA36_46=='\n') ) {s = 127;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA36_269 = input.LA(1);

                        s = -1;
                        if ( (LA36_269=='\"') ) {s = 130;}

                        else if ( (LA36_269=='\\') ) {s = 129;}

                        else if ( ((LA36_269>='A' && LA36_269<='Z')||(LA36_269>='a' && LA36_269<='z')) ) {s = 128;}

                        else if ( ((LA36_269>='\u0000' && LA36_269<='!')||(LA36_269>='#' && LA36_269<='@')||LA36_269=='['||(LA36_269>=']' && LA36_269<='`')||(LA36_269>='{' && LA36_269<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA36_312 = input.LA(1);

                        s = -1;
                        if ( (LA36_312=='\"') ) {s = 130;}

                        else if ( ((LA36_312>='A' && LA36_312<='Z')||(LA36_312>='a' && LA36_312<='z')) ) {s = 128;}

                        else if ( (LA36_312=='\\') ) {s = 129;}

                        else if ( ((LA36_312>='\u0000' && LA36_312<='!')||(LA36_312>='#' && LA36_312<='@')||LA36_312=='['||(LA36_312>=']' && LA36_312<='`')||(LA36_312>='{' && LA36_312<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA36_47 = input.LA(1);

                        s = -1;
                        if ( ((LA36_47>='A' && LA36_47<='Z')||(LA36_47>='a' && LA36_47<='z')) ) {s = 128;}

                        else if ( (LA36_47=='\\') ) {s = 129;}

                        else if ( (LA36_47=='\"') ) {s = 130;}

                        else if ( ((LA36_47>='\u0000' && LA36_47<='!')||(LA36_47>='#' && LA36_47<='@')||LA36_47=='['||(LA36_47>=']' && LA36_47<='`')||(LA36_47>='{' && LA36_47<='\uFFFF')) ) {s = 126;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA36_268 = input.LA(1);

                        s = -1;
                        if ( (LA36_268=='\"') ) {s = 130;}

                        else if ( (LA36_268=='\\') ) {s = 129;}

                        else if ( ((LA36_268>='A' && LA36_268<='Z')||(LA36_268>='a' && LA36_268<='z')) ) {s = 128;}

                        else if ( ((LA36_268>='\u0000' && LA36_268<='!')||(LA36_268>='#' && LA36_268<='@')||LA36_268=='['||(LA36_268>=']' && LA36_268<='`')||(LA36_268>='{' && LA36_268<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA36_185 = input.LA(1);

                        s = -1;
                        if ( ((LA36_185>='\u0000' && LA36_185<='/')||(LA36_185>='8' && LA36_185<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_185>='0' && LA36_185<='7')) ) {s = 232;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA36_343 = input.LA(1);

                        s = -1;
                        if ( (LA36_343=='\"') ) {s = 130;}

                        else if ( (LA36_343=='\\') ) {s = 129;}

                        else if ( ((LA36_343>='A' && LA36_343<='Z')||(LA36_343>='a' && LA36_343<='z')) ) {s = 128;}

                        else if ( ((LA36_343>='\u0000' && LA36_343<='!')||(LA36_343>='#' && LA36_343<='@')||LA36_343=='['||(LA36_343>=']' && LA36_343<='`')||(LA36_343>='{' && LA36_343<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA36_232 = input.LA(1);

                        s = -1;
                        if ( ((LA36_232>='\u0000' && LA36_232<='/')||(LA36_232>='8' && LA36_232<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_232>='0' && LA36_232<='7')) ) {s = 269;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA36_231 = input.LA(1);

                        s = -1;
                        if ( ((LA36_231>='\u0000' && LA36_231<='/')||(LA36_231>=':' && LA36_231<='@')||(LA36_231>='G' && LA36_231<='`')||(LA36_231>='g' && LA36_231<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_231>='0' && LA36_231<='9')||(LA36_231>='A' && LA36_231<='F')||(LA36_231>='a' && LA36_231<='f')) ) {s = 268;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA36_229 = input.LA(1);

                        s = -1;
                        if ( ((LA36_229>='0' && LA36_229<='9')||(LA36_229>='A' && LA36_229<='F')||(LA36_229>='a' && LA36_229<='f')) ) {s = 266;}

                        else if ( ((LA36_229>='\u0000' && LA36_229<='/')||(LA36_229>=':' && LA36_229<='@')||(LA36_229>='G' && LA36_229<='`')||(LA36_229>='g' && LA36_229<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA36_266 = input.LA(1);

                        s = -1;
                        if ( ((LA36_266>='0' && LA36_266<='9')||(LA36_266>='A' && LA36_266<='F')||(LA36_266>='a' && LA36_266<='f')) ) {s = 293;}

                        else if ( ((LA36_266>='\u0000' && LA36_266<='/')||(LA36_266>=':' && LA36_266<='@')||(LA36_266>='G' && LA36_266<='`')||(LA36_266>='g' && LA36_266<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA36_293 = input.LA(1);

                        s = -1;
                        if ( ((LA36_293>='0' && LA36_293<='9')||(LA36_293>='A' && LA36_293<='F')||(LA36_293>='a' && LA36_293<='f')) ) {s = 312;}

                        else if ( ((LA36_293>='\u0000' && LA36_293<='/')||(LA36_293>=':' && LA36_293<='@')||(LA36_293>='G' && LA36_293<='`')||(LA36_293>='g' && LA36_293<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA36_230 = input.LA(1);

                        s = -1;
                        if ( ((LA36_230>='0' && LA36_230<='9')||(LA36_230>='A' && LA36_230<='F')||(LA36_230>='a' && LA36_230<='f')) ) {s = 267;}

                        else if ( ((LA36_230>='\u0000' && LA36_230<='/')||(LA36_230>=':' && LA36_230<='@')||(LA36_230>='G' && LA36_230<='`')||(LA36_230>='g' && LA36_230<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA36_267 = input.LA(1);

                        s = -1;
                        if ( ((LA36_267>='0' && LA36_267<='9')||(LA36_267>='A' && LA36_267<='F')||(LA36_267>='a' && LA36_267<='f')) ) {s = 294;}

                        else if ( ((LA36_267>='\u0000' && LA36_267<='/')||(LA36_267>=':' && LA36_267<='@')||(LA36_267>='G' && LA36_267<='`')||(LA36_267>='g' && LA36_267<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA36_294 = input.LA(1);

                        s = -1;
                        if ( ((LA36_294>='0' && LA36_294<='9')||(LA36_294>='A' && LA36_294<='F')||(LA36_294>='a' && LA36_294<='f')) ) {s = 313;}

                        else if ( ((LA36_294>='\u0000' && LA36_294<='/')||(LA36_294>=':' && LA36_294<='@')||(LA36_294>='G' && LA36_294<='`')||(LA36_294>='g' && LA36_294<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA36_313 = input.LA(1);

                        s = -1;
                        if ( ((LA36_313>='0' && LA36_313<='9')||(LA36_313>='A' && LA36_313<='F')||(LA36_313>='a' && LA36_313<='f')) ) {s = 325;}

                        else if ( ((LA36_313>='\u0000' && LA36_313<='/')||(LA36_313>=':' && LA36_313<='@')||(LA36_313>='G' && LA36_313<='`')||(LA36_313>='g' && LA36_313<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA36_325 = input.LA(1);

                        s = -1;
                        if ( ((LA36_325>='0' && LA36_325<='9')||(LA36_325>='A' && LA36_325<='F')||(LA36_325>='a' && LA36_325<='f')) ) {s = 333;}

                        else if ( ((LA36_325>='\u0000' && LA36_325<='/')||(LA36_325>=':' && LA36_325<='@')||(LA36_325>='G' && LA36_325<='`')||(LA36_325>='g' && LA36_325<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA36_333 = input.LA(1);

                        s = -1;
                        if ( ((LA36_333>='\u0000' && LA36_333<='/')||(LA36_333>=':' && LA36_333<='@')||(LA36_333>='G' && LA36_333<='`')||(LA36_333>='g' && LA36_333<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_333>='0' && LA36_333<='9')||(LA36_333>='A' && LA36_333<='F')||(LA36_333>='a' && LA36_333<='f')) ) {s = 339;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA36_339 = input.LA(1);

                        s = -1;
                        if ( ((LA36_339>='\u0000' && LA36_339<='/')||(LA36_339>=':' && LA36_339<='@')||(LA36_339>='G' && LA36_339<='`')||(LA36_339>='g' && LA36_339<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA36_339>='0' && LA36_339<='9')||(LA36_339>='A' && LA36_339<='F')||(LA36_339>='a' && LA36_339<='f')) ) {s = 343;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA36_183 = input.LA(1);

                        s = -1;
                        if ( (LA36_183=='\"') ) {s = 130;}

                        else if ( (LA36_183=='\\') ) {s = 129;}

                        else if ( ((LA36_183>='A' && LA36_183<='Z')||(LA36_183>='a' && LA36_183<='z')) ) {s = 128;}

                        else if ( ((LA36_183>='\u0000' && LA36_183<='!')||(LA36_183>='#' && LA36_183<='@')||LA36_183=='['||(LA36_183>=']' && LA36_183<='`')||(LA36_183>='{' && LA36_183<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA36_0 = input.LA(1);

                        s = -1;
                        if ( (LA36_0=='p') ) {s = 1;}

                        else if ( (LA36_0=='i') ) {s = 2;}

                        else if ( (LA36_0=='(') ) {s = 3;}

                        else if ( (LA36_0==')') ) {s = 4;}

                        else if ( (LA36_0=='.') ) {s = 5;}

                        else if ( (LA36_0=='c') ) {s = 6;}

                        else if ( (LA36_0=='=') ) {s = 7;}

                        else if ( (LA36_0==',') ) {s = 8;}

                        else if ( (LA36_0=='t') ) {s = 9;}

                        else if ( (LA36_0=='f') ) {s = 10;}

                        else if ( (LA36_0=='v') ) {s = 11;}

                        else if ( (LA36_0=='{') ) {s = 12;}

                        else if ( (LA36_0=='}') ) {s = 13;}

                        else if ( (LA36_0=='<') ) {s = 14;}

                        else if ( (LA36_0=='+') ) {s = 15;}

                        else if ( (LA36_0=='-') ) {s = 16;}

                        else if ( (LA36_0=='|') ) {s = 17;}

                        else if ( (LA36_0=='^') ) {s = 18;}

                        else if ( (LA36_0=='*') ) {s = 19;}

                        else if ( (LA36_0=='/') ) {s = 20;}

                        else if ( (LA36_0=='%') ) {s = 21;}

                        else if ( (LA36_0=='>') ) {s = 22;}

                        else if ( (LA36_0=='&') ) {s = 23;}

                        else if ( (LA36_0==':') ) {s = 24;}

                        else if ( (LA36_0=='r') ) {s = 25;}

                        else if ( (LA36_0=='b') ) {s = 26;}

                        else if ( (LA36_0=='g') ) {s = 27;}

                        else if ( (LA36_0=='d') ) {s = 28;}

                        else if ( (LA36_0=='e') ) {s = 29;}

                        else if ( (LA36_0=='s') ) {s = 30;}

                        else if ( (LA36_0=='A') ) {s = 31;}

                        else if ( (LA36_0=='S') ) {s = 32;}

                        else if ( (LA36_0=='P') ) {s = 33;}

                        else if ( (LA36_0=='F') ) {s = 34;}

                        else if ( (LA36_0=='I') ) {s = 35;}

                        else if ( (LA36_0=='M') ) {s = 36;}

                        else if ( (LA36_0=='C') ) {s = 37;}

                        else if ( (LA36_0=='[') ) {s = 38;}

                        else if ( (LA36_0==']') ) {s = 39;}

                        else if ( (LA36_0=='m') ) {s = 40;}

                        else if ( (LA36_0=='!') ) {s = 41;}

                        else if ( (LA36_0==';') ) {s = 42;}

                        else if ( (LA36_0=='B'||(LA36_0>='D' && LA36_0<='E')||(LA36_0>='G' && LA36_0<='H')||(LA36_0>='J' && LA36_0<='L')||(LA36_0>='N' && LA36_0<='O')||(LA36_0>='Q' && LA36_0<='R')||(LA36_0>='T' && LA36_0<='Z')||LA36_0=='_'||LA36_0=='a'||LA36_0=='h'||(LA36_0>='j' && LA36_0<='l')||(LA36_0>='n' && LA36_0<='o')||LA36_0=='q'||LA36_0=='u'||(LA36_0>='w' && LA36_0<='z')) ) {s = 43;}

                        else if ( ((LA36_0>='1' && LA36_0<='9')) ) {s = 44;}

                        else if ( (LA36_0=='0') ) {s = 45;}

                        else if ( (LA36_0=='\'') ) {s = 46;}

                        else if ( (LA36_0=='\"') ) {s = 47;}

                        else if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {s = 48;}

                        else if ( ((LA36_0>='\u0000' && LA36_0<='\b')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\u001F')||(LA36_0>='#' && LA36_0<='$')||(LA36_0>='?' && LA36_0<='@')||LA36_0=='\\'||LA36_0=='`'||(LA36_0>='~' && LA36_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA36_184 = input.LA(1);

                        s = -1;
                        if ( ((LA36_184>='0' && LA36_184<='9')||(LA36_184>='A' && LA36_184<='F')||(LA36_184>='a' && LA36_184<='f')) ) {s = 231;}

                        else if ( ((LA36_184>='\u0000' && LA36_184<='/')||(LA36_184>=':' && LA36_184<='@')||(LA36_184>='G' && LA36_184<='`')||(LA36_184>='g' && LA36_184<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}