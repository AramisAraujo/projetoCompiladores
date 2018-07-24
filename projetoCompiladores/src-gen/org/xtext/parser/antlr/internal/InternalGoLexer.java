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
    public static final int RULE_DECIMAL_DIGIT=13;
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
    public static final int RULE_ID=37;
    public static final int RULE_INT=38;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=40;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=23;
    public static final int RULE_NEWLINE=35;
    public static final int RULE_BIG_U_VALUE=29;
    public static final int RULE_ESCAPED_CHAR=30;
    public static final int RULE_BYTE_VALUE=26;
    public static final int RULE_UNICODE_LETTER=36;
    public static final int RULE_UNICODE_CHAR=27;
    public static final int RULE_OCTAL_DIGIT=21;
    public static final int RULE_LETTER=12;
    public static final int RULE_EXPONENT=24;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=33;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=17;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=22;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RUNE_LIT=10;
    public static final int RULE_DECIMAL_LIT=18;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__99=99;
    public static final int RULE_BINARY_OP=11;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_IMAGINARY_LIT=9;
    public static final int T__98=98;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_INTERPRETED_STRING_LIT=34;
    public static final int RULE_UNICODE_VALUE=25;
    public static final int RULE_LITTLE_U_VALUE=28;
    public static final int RULE_HEX_BYTE_VALUE=32;
    public static final int RULE_OCTAL_BYTE_VALUE=31;
    public static final int RULE_MUL_OP=16;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=39;
    public static final int RULE_SL_COMMENT=41;
    public static final int T__77=77;
    public static final int RULE_HEX_LIT=20;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=15;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=42;
    public static final int RULE_OCTAL_LIT=19;
    public static final int RULE_FLOAT_LIT=8;
    public static final int RULE_INT_LIT=7;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_REL_OP=14;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;

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

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
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
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
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
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
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
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
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
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:66:7: ( 'map' )
            // InternalGo.g:66:9: 'map'
            {
            match("map"); 


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
            // InternalGo.g:67:7: ( 'chan' )
            // InternalGo.g:67:9: 'chan'
            {
            match("chan"); 


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
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
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
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
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
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
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
    // $ANTLR end "T__103"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7916:17: ( RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:7916:19: RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalGo.g:7916:31: ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
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

    // $ANTLR start "RULE_BINARY_OP"
    public final void mRULE_BINARY_OP() throws RecognitionException {
        try {
            int _type = RULE_BINARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7918:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:7918:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:7918:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGo.g:7918:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:7918:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:7918:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7918:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:7918:53: RULE_MUL_OP
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
            // InternalGo.g:7920:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:7920:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:7920:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt3=1;
                }
                break;
            case '!':
                {
                alt3=2;
                }
                break;
            case '<':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=3;}
                }
                break;
            case '>':
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4=='=') ) {
                    alt3=6;
                }
                else {
                    alt3=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:7920:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:7920:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:7920:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7920:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:7920:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:7920:48: '>='
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
            // InternalGo.g:7922:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:7922:24: ( '+' | '-' | '|' | '^' )
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
            // InternalGo.g:7924:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:7924:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:7924:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt4=1;
                }
                break;
            case '/':
                {
                alt4=2;
                }
                break;
            case '%':
                {
                alt4=3;
                }
                break;
            case '<':
                {
                alt4=4;
                }
                break;
            case '>':
                {
                alt4=5;
                }
                break;
            case '&':
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6=='^') ) {
                    alt4=7;
                }
                else {
                    alt4=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:7924:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7924:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7924:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7924:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:7924:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:7924:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:7924:51: '&^'
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
            // InternalGo.g:7926:24: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:7926:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:7926:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt5=1;
                }
                break;
            case '-':
                {
                alt5=2;
                }
                break;
            case '!':
                {
                alt5=3;
                }
                break;
            case '^':
                {
                alt5=4;
                }
                break;
            case '*':
                {
                alt5=5;
                }
                break;
            case '&':
                {
                alt5=6;
                }
                break;
            case '<':
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:7926:27: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7926:31: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7926:35: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7926:39: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:7926:43: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:7926:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:7926:51: '<-'
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
            // InternalGo.g:7928:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:7928:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:7928:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='1' && LA6_0<='9')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='0') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='X'||LA6_2=='x') ) {
                    alt6=3;
                }
                else {
                    alt6=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:7928:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7928:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7928:49: RULE_HEX_LIT
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
            // InternalGo.g:7930:27: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:7930:29: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
            {
            matchRange('1','9'); 
            // InternalGo.g:7930:38: ( RULE_DECIMAL_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:7930:38: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalGo.g:7932:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:7932:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:7932:31: ( RULE_OCTAL_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:7932:31: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalGo.g:7934:23: ( '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:7934:25: '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:7934:39: ( RULE_HEX_DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:7934:39: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalGo.g:7936:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalGo.g:7936:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalGo.g:7936:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalGo.g:7936:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalGo.g:7936:37: ( RULE_DECIMALS )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:7936:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalGo.g:7936:52: ( RULE_EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGo.g:7936:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:7936:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7936:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:7936:113: ( RULE_EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:7936:113: RULE_EXPONENT
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
            // InternalGo.g:7938:24: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:7938:26: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:7938:26: ( RULE_DECIMAL_DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:7938:26: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalGo.g:7940:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:7940:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:7940:36: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
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
            // InternalGo.g:7942:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalGo.g:7942:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalGo.g:7942:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalGo.g:7942:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7942:37: RULE_FLOAT_LIT
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
            // InternalGo.g:7944:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalGo.g:7944:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalGo.g:7944:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='A' && LA17_0<='Z')||(LA17_0>='a' && LA17_0<='z')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='\\') ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2=='\"'||LA17_2=='\''||LA17_2=='U'||LA17_2=='\\'||(LA17_2>='a' && LA17_2<='b')||LA17_2=='f'||LA17_2=='n'||LA17_2=='r'||(LA17_2>='t' && LA17_2<='v')) ) {
                    alt17=1;
                }
                else if ( ((LA17_2>='0' && LA17_2<='7')||LA17_2=='x') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:7944:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7944:42: RULE_BYTE_VALUE
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
            // InternalGo.g:7946:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:7946:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:7946:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='A' && LA18_0<='Z')||(LA18_0>='a' && LA18_0<='z')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case 'U':
                    {
                    alt18=3;
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
                    alt18=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:7946:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7946:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7946:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7946:87: RULE_ESCAPED_CHAR
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
            // InternalGo.g:7948:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:7948:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:7948:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='x') ) {
                    alt19=2;
                }
                else if ( ((LA19_1>='0' && LA19_1<='7')) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

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
                    // InternalGo.g:7948:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7948:51: RULE_HEX_BYTE_VALUE
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
            // InternalGo.g:7950:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:7950:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalGo.g:7952:30: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:7952:32: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:7954:30: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:7954:32: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:7956:27: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:7956:29: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:7958:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:7958:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalGo.g:7960:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalGo.g:7960:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalGo.g:7960:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\'') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\"') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:7960:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7960:40: RULE_INTERPRETED_STRING_LIT
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
            // InternalGo.g:7962:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalGo.g:7962:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalGo.g:7962:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\n'||(LA21_0>='A' && LA21_0<='Z')||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
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
            	    break loop21;
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
            // InternalGo.g:7964:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalGo.g:7964:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalGo.g:7964:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='A' && LA22_0<='Z')||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }
                else if ( (LA22_0=='\\') ) {
                    int LA22_3 = input.LA(2);

                    if ( (LA22_3=='\"'||LA22_3=='\''||LA22_3=='U'||LA22_3=='\\'||(LA22_3>='a' && LA22_3<='b')||LA22_3=='f'||LA22_3=='n'||LA22_3=='r'||(LA22_3>='t' && LA22_3<='v')) ) {
                        alt22=1;
                    }
                    else if ( ((LA22_3>='0' && LA22_3<='7')||LA22_3=='x') ) {
                        alt22=2;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalGo.g:7964:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:7964:64: RULE_BYTE_VALUE
            	    {
            	    mRULE_BYTE_VALUE(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // InternalGo.g:7966:22: ( ( RULE_UNICODE_LETTER | '_' ) )
            // InternalGo.g:7966:24: ( RULE_UNICODE_LETTER | '_' )
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
            // InternalGo.g:7968:29: ( '0' .. '9' )
            // InternalGo.g:7968:31: '0' .. '9'
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
            // InternalGo.g:7970:27: ( '0' .. '7' )
            // InternalGo.g:7970:29: '0' .. '7'
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
            // InternalGo.g:7972:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalGo.g:7972:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalGo.g:7974:23: ( '\\n' )
            // InternalGo.g:7974:25: '\\n'
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
            // InternalGo.g:7976:28: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:7976:30: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // InternalGo.g:7978:30: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:7978:32: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // InternalGo.g:7980:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:7980:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:7980:11: ( '^' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='^') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:7980:11: '^'
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

            // InternalGo.g:7980:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')) ) {
                    alt24=1;
                }


                switch (alt24) {
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
            	    break loop24;
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
            // InternalGo.g:7982:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:7982:12: ( '0' .. '9' )+
            {
            // InternalGo.g:7982:12: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGo.g:7982:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // InternalGo.g:7984:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:7984:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:7984:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\"') ) {
                alt28=1;
            }
            else if ( (LA28_0=='\'') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:7984:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:7984:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGo.g:7984:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:7984:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop26;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7984:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:7984:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGo.g:7984:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:7984:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop27;
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
            // InternalGo.g:7986:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:7986:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:7986:24: ( options {greedy=false; } : . )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='*') ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1=='/') ) {
                        alt29=2;
                    }
                    else if ( ((LA29_1>='\u0000' && LA29_1<='.')||(LA29_1>='0' && LA29_1<='\uFFFF')) ) {
                        alt29=1;
                    }


                }
                else if ( ((LA29_0>='\u0000' && LA29_0<=')')||(LA29_0>='+' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:7986:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // InternalGo.g:7988:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:7988:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:7988:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:7988:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop30;
                }
            } while (true);

            // InternalGo.g:7988:40: ( ( '\\r' )? '\\n' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\n'||LA32_0=='\r') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:7988:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:7988:41: ( '\\r' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\r') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGo.g:7988:41: '\\r'
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
            // InternalGo.g:7990:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:7990:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:7990:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {
                    alt33=1;
                }


                switch (alt33) {
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
            // InternalGo.g:7992:16: ( . )
            // InternalGo.g:7992:18: .
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
        // InternalGo.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt34=75;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // InternalGo.g:1:10: T__43
                {
                mT__43(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__44
                {
                mT__44(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__45
                {
                mT__45(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__46
                {
                mT__46(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__47
                {
                mT__47(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__48
                {
                mT__48(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__49
                {
                mT__49(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__50
                {
                mT__50(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__51
                {
                mT__51(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__52
                {
                mT__52(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__53
                {
                mT__53(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__54
                {
                mT__54(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__55
                {
                mT__55(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__56
                {
                mT__56(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__57
                {
                mT__57(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__58
                {
                mT__58(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__59
                {
                mT__59(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__60
                {
                mT__60(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__61
                {
                mT__61(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__62
                {
                mT__62(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__63
                {
                mT__63(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__64
                {
                mT__64(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__65
                {
                mT__65(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__66
                {
                mT__66(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__67
                {
                mT__67(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__68
                {
                mT__68(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__69
                {
                mT__69(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__70
                {
                mT__70(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__71
                {
                mT__71(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__72
                {
                mT__72(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__73
                {
                mT__73(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__74
                {
                mT__74(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__75
                {
                mT__75(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__76
                {
                mT__76(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__77
                {
                mT__77(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__78
                {
                mT__78(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__79
                {
                mT__79(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__80
                {
                mT__80(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__81
                {
                mT__81(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__82
                {
                mT__82(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__83
                {
                mT__83(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__84
                {
                mT__84(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: T__85
                {
                mT__85(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:268: T__86
                {
                mT__86(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:274: T__87
                {
                mT__87(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:280: T__88
                {
                mT__88(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:286: T__89
                {
                mT__89(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:292: T__90
                {
                mT__90(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:298: T__91
                {
                mT__91(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:304: T__92
                {
                mT__92(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:310: T__93
                {
                mT__93(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:316: T__94
                {
                mT__94(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:322: T__95
                {
                mT__95(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:328: T__96
                {
                mT__96(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:334: T__97
                {
                mT__97(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:340: T__98
                {
                mT__98(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:346: T__99
                {
                mT__99(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:352: T__100
                {
                mT__100(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:359: T__101
                {
                mT__101(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:366: T__102
                {
                mT__102(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:373: T__103
                {
                mT__103(); 

                }
                break;
            case 62 :
                // InternalGo.g:1:380: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 63 :
                // InternalGo.g:1:396: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 64 :
                // InternalGo.g:1:411: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 65 :
                // InternalGo.g:1:424: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 66 :
                // InternalGo.g:1:439: RULE_IMAGINARY_LIT
                {
                mRULE_IMAGINARY_LIT(); 

                }
                break;
            case 67 :
                // InternalGo.g:1:458: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 68 :
                // InternalGo.g:1:472: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 69 :
                // InternalGo.g:1:488: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 70 :
                // InternalGo.g:1:496: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 71 :
                // InternalGo.g:1:505: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // InternalGo.g:1:517: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 73 :
                // InternalGo.g:1:533: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 74 :
                // InternalGo.g:1:549: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // InternalGo.g:1:557: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA2_eotS =
        "\1\uffff\1\6\1\7\1\uffff\2\3\4\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\41\1\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA2_maxS =
        "\2\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\3\2\uffff\1\4\1\5\1\1\1\2";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "7918:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
        }
    }
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\3\1\2\1\1";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "7936:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
        }
    }
    static final String DFA16_eotS =
        "\4\uffff";
    static final String DFA16_eofS =
        "\4\uffff";
    static final String DFA16_minS =
        "\2\56\2\uffff";
    static final String DFA16_maxS =
        "\1\71\1\151\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA16_specialS =
        "\4\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "7942:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\2\64\2\uffff\1\74\1\64\1\101\1\uffff\3\64\2\uffff\1\100\1\115\1\117\1\120\1\121\1\uffff\1\126\1\uffff\1\100\1\132\1\134\15\64\2\uffff\1\64\1\161\1\uffff\1\64\2\163\2\61\2\uffff\2\64\1\uffff\1\64\1\u0085\1\64\3\uffff\1\u0087\1\uffff\3\64\3\uffff\5\64\25\uffff\3\64\1\u0098\15\64\2\uffff\1\64\3\uffff\1\u0087\1\163\2\uffff\1\163\1\u00ab\11\uffff\2\64\1\uffff\1\64\2\uffff\6\64\1\u00c4\1\u00c5\3\uffff\4\64\1\uffff\13\64\1\u00d6\1\64\1\u00d8\1\u0087\2\uffff\1\u0087\15\uffff\3\64\1\uffff\1\u0087\2\64\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\64\2\uffff\3\64\1\u00f2\2\64\1\u00f5\11\64\1\uffff\1\64\2\uffff\1\u0087\12\uffff\3\64\1\u010b\1\64\4\uffff\2\64\1\u010f\1\u0110\1\uffff\1\u0111\1\64\1\uffff\3\64\1\u0116\1\64\1\u0118\4\64\10\uffff\1\64\1\u0122\1\64\1\uffff\2\64\1\u0126\3\uffff\1\64\1\u0128\1\u0129\1\u012a\1\uffff\1\64\1\uffff\4\64\4\uffff\1\u0134\1\uffff\3\64\1\uffff\1\u0138\3\uffff\1\64\1\u013a\2\64\1\u013d\5\uffff\1\64\1\u0141\1\64\1\uffff\1\64\1\uffff\1\u0144\1\64\3\uffff\1\u0148\1\uffff\2\64\1\uffff\1\u014b\3\uffff\1\64\1\u014f\3\uffff\1\u0152\4\uffff";
    static final String DFA34_eofS =
        "\u0153\uffff";
    static final String DFA34_minS =
        "\1\0\2\60\2\uffff\1\56\1\60\1\75\1\uffff\3\60\2\uffff\1\55\1\53\1\55\1\174\1\101\1\uffff\1\52\1\uffff\1\76\1\46\1\75\15\60\2\uffff\1\60\1\75\1\uffff\1\60\2\56\2\0\2\uffff\2\60\1\uffff\3\60\3\uffff\1\60\1\uffff\3\60\3\uffff\5\60\25\uffff\21\60\2\uffff\1\60\3\uffff\1\60\1\56\1\53\1\uffff\2\56\3\0\2\uffff\2\0\2\uffff\2\60\1\uffff\1\60\1\uffff\1\53\10\60\3\uffff\4\60\1\uffff\17\60\1\53\2\60\2\uffff\5\0\1\uffff\5\0\14\60\2\uffff\20\60\1\uffff\1\60\1\uffff\2\60\1\uffff\2\0\1\uffff\6\0\5\60\4\uffff\4\60\1\uffff\2\60\1\uffff\12\60\10\0\3\60\1\uffff\3\60\3\uffff\4\60\1\uffff\1\60\1\uffff\4\60\4\0\1\60\1\uffff\3\60\1\uffff\1\60\3\uffff\5\60\4\0\1\uffff\3\60\1\uffff\1\60\1\uffff\2\60\1\uffff\2\0\1\60\1\uffff\2\60\1\uffff\1\60\2\0\1\uffff\2\60\1\uffff\2\0\1\60\1\uffff\2\0\1\uffff";
    static final String DFA34_maxS =
        "\1\uffff\2\172\2\uffff\1\71\1\172\1\75\1\uffff\3\172\2\uffff\1\74\1\53\1\55\1\174\1\172\1\uffff\1\57\1\uffff\1\76\1\136\1\75\15\172\2\uffff\1\172\1\75\1\uffff\1\172\2\151\2\uffff\2\uffff\2\172\1\uffff\3\172\3\uffff\1\151\1\uffff\3\172\3\uffff\5\172\25\uffff\21\172\2\uffff\1\172\3\uffff\2\151\1\71\1\uffff\2\151\3\uffff\2\uffff\2\uffff\2\uffff\2\172\1\uffff\1\172\1\uffff\1\71\10\172\3\uffff\4\172\1\uffff\16\172\1\151\2\71\1\151\2\uffff\5\uffff\1\uffff\5\uffff\3\172\1\71\1\151\7\172\2\uffff\20\172\1\uffff\1\172\1\uffff\1\71\1\151\1\uffff\2\uffff\1\uffff\6\uffff\5\172\4\uffff\4\172\1\uffff\2\172\1\uffff\12\172\10\uffff\3\172\1\uffff\3\172\3\uffff\4\172\1\uffff\1\172\1\uffff\4\172\4\uffff\1\172\1\uffff\3\172\1\uffff\1\172\3\uffff\5\172\4\uffff\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2\uffff\1\172\1\uffff\2\172\1\uffff\1\172\2\uffff\1\uffff\2\172\1\uffff\2\uffff\1\172\1\uffff\2\uffff\1\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\3\1\4\3\uffff\1\10\3\uffff\1\14\1\15\5\uffff\1\25\1\uffff\1\27\20\uffff\1\65\1\66\2\uffff\1\75\5\uffff\1\112\1\113\2\uffff\1\76\3\uffff\1\3\1\4\1\72\1\uffff\1\5\3\uffff\1\77\1\7\1\10\5\uffff\1\14\1\15\1\16\1\30\1\17\1\21\1\20\1\22\1\23\1\24\1\105\1\25\1\110\1\111\1\26\1\27\1\31\1\33\1\32\1\34\1\35\21\uffff\1\65\1\66\1\uffff\1\74\1\75\1\100\3\uffff\1\102\5\uffff\1\104\1\107\2\uffff\1\104\1\112\2\uffff\1\44\1\uffff\1\101\11\uffff\1\30\1\31\1\33\4\uffff\1\54\22\uffff\1\106\1\103\5\uffff\1\104\21\uffff\1\52\1\13\20\uffff\1\63\1\uffff\1\70\2\uffff\1\103\2\uffff\1\103\13\uffff\1\47\1\71\1\11\1\12\4\uffff\1\41\2\uffff\1\45\25\uffff\1\6\3\uffff\1\53\1\37\1\43\4\uffff\1\55\1\uffff\1\62\11\uffff\1\2\3\uffff\1\36\1\uffff\1\46\1\51\1\73\11\uffff\1\1\3\uffff\1\50\1\uffff\1\57\2\uffff\1\64\3\uffff\1\40\2\uffff\1\60\3\uffff\1\67\2\uffff\1\61\3\uffff\1\56\2\uffff\1\42";
    static final String DFA34_specialS =
        "\1\12\55\uffff\1\5\1\36\112\uffff\1\30\1\37\1\6\2\uffff\1\35\1\53\54\uffff\1\42\1\43\1\0\1\41\1\3\1\uffff\1\33\1\34\1\40\1\32\1\44\44\uffff\1\13\1\16\1\uffff\1\11\1\7\1\47\1\52\1\46\1\45\33\uffff\1\14\1\17\1\27\1\25\1\50\1\54\1\4\1\1\25\uffff\1\15\1\20\1\51\1\55\17\uffff\1\26\1\21\1\2\1\56\12\uffff\1\22\1\57\6\uffff\1\23\1\60\4\uffff\1\24\1\61\2\uffff\1\31\1\10\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\51\1\57\2\61\1\25\1\27\1\56\1\3\1\4\1\23\1\17\1\10\1\20\1\5\1\24\1\55\11\54\1\30\1\52\1\16\1\7\1\26\2\61\1\37\1\53\1\45\2\53\1\42\2\53\1\43\3\53\1\44\2\53\1\41\2\53\1\40\7\53\1\46\1\61\1\47\1\22\1\53\1\61\1\53\1\32\1\6\1\34\1\35\1\12\1\33\1\53\1\2\3\53\1\50\2\53\1\1\1\53\1\31\1\36\1\11\1\53\1\13\4\53\1\14\1\21\1\15\uff82\61",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\62\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\66\6\63\1\65\1\67\14\63",
            "",
            "",
            "\1\72\1\uffff\12\73",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\76\6\63\1\77\6\63\1\75\13\63",
            "\1\100",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\30\63\1\103\1\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\105\15\63\1\106\5\63\1\104\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\107\31\63",
            "",
            "",
            "\1\112\16\uffff\1\113",
            "\1\114",
            "\1\116",
            "\1\100",
            "\32\122\4\uffff\1\122\1\uffff\32\122",
            "",
            "\1\124\4\uffff\1\125",
            "",
            "\1\130",
            "\1\100\67\uffff\1\131",
            "\1\133",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\136\3\63\1\135\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\137\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\140\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\141\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\142\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\144\16\63\1\145\2\63\1\143\3\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\146\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\150\7\63\1\147\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\151\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\152\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\153\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\154\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\155\22\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\160\31\63",
            "\1\100",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\164\1\uffff\12\165\13\uffff\1\166\37\uffff\1\166\3\uffff\1\167",
            "\1\164\1\uffff\10\170\2\171\13\uffff\1\166\37\uffff\1\166\3\uffff\1\167",
            "\12\176\1\174\34\176\1\175\31\176\32\172\1\176\1\173\4\176\32\172\uff85\176",
            "\42\176\1\u0081\36\176\32\u0080\1\176\1\177\4\176\32\u0080\uff85\176",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u0083\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\17\63\1\u0084\12\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0086\6\63",
            "",
            "",
            "",
            "\12\73\13\uffff\1\u0088\37\uffff\1\u0088\3\uffff\1\167",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0089\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u008a\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u008b\31\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\17\63\1\u008c\12\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u008d\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u008e\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u008f\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u0090\10\63",
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
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0094\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0095\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0096\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0097\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\u0099\24\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u009a\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u009b\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u009c\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u009d\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u009e\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u009f\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00a0\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00a1\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00a2\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00a3\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\17\63\1\u00a4\12\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00a5\31\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\17\63\1\u00a6\12\63",
            "",
            "",
            "",
            "\12\u00a7\13\uffff\1\u00a8\37\uffff\1\u00a8\3\uffff\1\167",
            "\1\164\1\uffff\12\165\13\uffff\1\166\37\uffff\1\166\3\uffff\1\167",
            "\1\u00a9\1\uffff\1\u00a9\2\uffff\12\u00aa",
            "",
            "\1\164\1\uffff\10\170\2\171\13\uffff\1\166\37\uffff\1\166\3\uffff\1\167",
            "\1\164\1\uffff\12\171\13\uffff\1\166\37\uffff\1\166\3\uffff\1\167",
            "\12\176\1\174\34\176\1\u00ac\31\176\32\174\6\176\32\174\uff85\176",
            "\42\176\1\u00af\4\176\1\u00af\10\176\10\u00b1\35\176\1\u00ae\6\176\1\u00af\4\176\2\u00af\3\176\1\u00af\7\176\1\u00af\3\176\1\u00af\1\176\1\u00af\1\u00ad\1\u00af\1\176\1\u00b0\uff87\176",
            "\12\176\1\174\34\176\1\175\31\176\32\174\6\176\32\174\uff85\176",
            "",
            "",
            "\42\176\1\u00b5\4\176\1\u00b5\10\176\10\u00b7\35\176\1\u00b4\6\176\1\u00b5\4\176\2\u00b5\3\176\1\u00b5\7\176\1\u00b5\3\176\1\u00b5\1\176\1\u00b5\1\u00b3\1\u00b5\1\176\1\u00b6\uff87\176",
            "\42\176\1\u0081\36\176\32\u0080\1\176\1\177\4\176\32\u0080\uff85\176",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\12\63\1\u00b8\17\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u00b9\13\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00ba\25\63",
            "",
            "\1\u00bb\1\uffff\1\u00bb\2\uffff\12\u00bc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00bd\1\u00be\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00bf\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00c0\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00c1\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00c2\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00c3\16\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00c6\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\6\63\1\u00c7\23\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00c8\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u00c9\13\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00cb\3\63\1\u00ca\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00cc\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00cd\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00ce\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00cf\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00d0\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00d1\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00d2\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00d3\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00d4\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00d5\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00d7\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\u00a7\13\uffff\1\u00a8\37\uffff\1\u00a8\3\uffff\1\167",
            "\1\u00d9\1\uffff\1\u00d9\2\uffff\12\u00da",
            "\12\u00aa",
            "\12\u00aa\57\uffff\1\167",
            "",
            "",
            "\60\176\12\u00dc\7\176\6\u00dc\32\176\6\u00dc\uff99\176",
            "\60\176\12\u00dd\7\176\6\u00dd\32\176\6\u00dd\uff99\176",
            "\47\176\1\u00de\uffd8\176",
            "\60\176\12\u00df\7\176\6\u00df\32\176\6\u00df\uff99\176",
            "\60\176\10\u00e0\uffc8\176",
            "",
            "\60\176\12\u00e1\7\176\6\u00e1\32\176\6\u00e1\uff99\176",
            "\60\176\12\u00e2\7\176\6\u00e2\32\176\6\u00e2\uff99\176",
            "\42\176\1\u0081\36\176\32\u0080\1\176\1\177\4\176\32\u0080\uff85\176",
            "\60\176\12\u00e3\7\176\6\u00e3\32\176\6\u00e3\uff99\176",
            "\60\176\10\u00e4\uffc8\176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00e5\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00e6\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00e7\10\63",
            "\12\u00bc",
            "\12\u00bc\57\uffff\1\167",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00e8\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u00e9\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00ee\6\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00ef\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00f0\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\12\63\1\u00f1\17\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00f3\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00f4\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00f6\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00f7\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00f8\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\30\63\1\u00f9\1\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u00fa\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00fb\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00fc\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00fd\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u00fe\10\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u00ff\14\63",
            "",
            "\12\u00da",
            "\12\u00da\57\uffff\1\167",
            "",
            "\60\176\12\u0100\7\176\6\u0100\32\176\6\u0100\uff99\176",
            "\60\176\12\u0101\7\176\6\u0101\32\176\6\u0101\uff99\176",
            "",
            "\60\176\12\u0102\7\176\6\u0102\32\176\6\u0102\uff99\176",
            "\60\176\10\u0103\uffc8\176",
            "\60\176\12\u0104\7\176\6\u0104\32\176\6\u0104\uff99\176",
            "\60\176\12\u0105\7\176\6\u0105\32\176\6\u0105\uff99\176",
            "\60\176\12\u0106\7\176\6\u0106\32\176\6\u0106\uff99\176",
            "\60\176\10\u0107\uffc8\176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\6\63\1\u0108\23\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0109\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\u010a\24\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u010c\14\63",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\u010d\22\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u010e\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u0112\16\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\u0113\22\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0114\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0115\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0117\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0119\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\10\63\1\u011a\21\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\5\63\1\u011b\24\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u011c\25\63",
            "\60\176\12\u011d\7\176\6\u011d\32\176\6\u011d\uff99\176",
            "\60\176\12\u011e\7\176\6\u011e\32\176\6\u011e\uff99\176",
            "\47\176\1\u00de\uffd8\176",
            "\47\176\1\u00de\uffd8\176",
            "\60\176\12\u011f\7\176\6\u011f\32\176\6\u011f\uff99\176",
            "\60\176\12\u0120\7\176\6\u0120\32\176\6\u0120\uff99\176",
            "\42\176\1\u0081\36\176\32\u0080\1\176\1\177\4\176\32\u0080\uff85\176",
            "\42\176\1\u0081\36\176\32\u0080\1\176\1\177\4\176\32\u0080\uff85\176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0121\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u0123\31\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u0124\5\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u0125\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u0127\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\23\63\1\u012b\6\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\21\63\1\u012c\10\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u012d\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u012e\31\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u012f\16\63",
            "\60\176\12\u0130\7\176\6\u0130\32\176\6\u0130\uff99\176",
            "\60\176\12\u0131\7\176\6\u0131\32\176\6\u0131\uff99\176",
            "\60\176\12\u0132\7\176\6\u0132\32\176\6\u0132\uff99\176",
            "\60\176\12\u0133\7\176\6\u0133\32\176\6\u0133\uff99\176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u0135\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0136\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\u0137\13\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\30\63\1\u0139\1\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u013b\14\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\2\63\1\u013c\27\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\47\176\1\u00de\uffd8\176",
            "\60\176\12\u013e\7\176\6\u013e\32\176\6\u013e\uff99\176",
            "\42\176\1\u0081\36\176\32\u0080\1\176\1\177\4\176\32\u0080\uff85\176",
            "\60\176\12\u013f\7\176\6\u013f\32\176\6\u013f\uff99\176",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0140\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u0142\5\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\17\63\1\u0143\12\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u0145\25\63",
            "",
            "\60\176\12\u0146\7\176\6\u0146\32\176\6\u0146\uff99\176",
            "\60\176\12\u0147\7\176\6\u0147\32\176\6\u0147\uff99\176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\6\63\1\u0149\23\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u014a\25\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\60\176\12\u014c\7\176\6\u014c\32\176\6\u014c\uff99\176",
            "\60\176\12\u014d\7\176\6\u014d\32\176\6\u014d\uff99\176",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\u014e\22\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\60\176\12\u0150\7\176\6\u0150\32\176\6\u0150\uff99\176",
            "\60\176\12\u0151\7\176\6\u0151\32\176\6\u0151\uff99\176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\47\176\1\u00de\uffd8\176",
            "\42\176\1\u0081\36\176\32\u0080\1\176\1\177\4\176\32\u0080\uff85\176",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_175 = input.LA(1);

                        s = -1;
                        if ( (LA34_175=='\'') ) {s = 222;}

                        else if ( ((LA34_175>='\u0000' && LA34_175<='&')||(LA34_175>='(' && LA34_175<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_263 = input.LA(1);

                        s = -1;
                        if ( (LA34_263=='\"') ) {s = 129;}

                        else if ( ((LA34_263>='A' && LA34_263<='Z')||(LA34_263>='a' && LA34_263<='z')) ) {s = 128;}

                        else if ( (LA34_263=='\\') ) {s = 127;}

                        else if ( ((LA34_263>='\u0000' && LA34_263<='!')||(LA34_263>='#' && LA34_263<='@')||LA34_263=='['||(LA34_263>=']' && LA34_263<='`')||(LA34_263>='{' && LA34_263<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_306 = input.LA(1);

                        s = -1;
                        if ( (LA34_306=='\"') ) {s = 129;}

                        else if ( (LA34_306=='\\') ) {s = 127;}

                        else if ( ((LA34_306>='A' && LA34_306<='Z')||(LA34_306>='a' && LA34_306<='z')) ) {s = 128;}

                        else if ( ((LA34_306>='\u0000' && LA34_306<='!')||(LA34_306>='#' && LA34_306<='@')||LA34_306=='['||(LA34_306>=']' && LA34_306<='`')||(LA34_306>='{' && LA34_306<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_177 = input.LA(1);

                        s = -1;
                        if ( ((LA34_177>='\u0000' && LA34_177<='/')||(LA34_177>='8' && LA34_177<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_177>='0' && LA34_177<='7')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_262 = input.LA(1);

                        s = -1;
                        if ( (LA34_262=='\"') ) {s = 129;}

                        else if ( (LA34_262=='\\') ) {s = 127;}

                        else if ( ((LA34_262>='A' && LA34_262<='Z')||(LA34_262>='a' && LA34_262<='z')) ) {s = 128;}

                        else if ( ((LA34_262>='\u0000' && LA34_262<='!')||(LA34_262>='#' && LA34_262<='@')||LA34_262=='['||(LA34_262>=']' && LA34_262<='`')||(LA34_262>='{' && LA34_262<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_46 = input.LA(1);

                        s = -1;
                        if ( ((LA34_46>='A' && LA34_46<='Z')||(LA34_46>='a' && LA34_46<='z')) ) {s = 122;}

                        else if ( (LA34_46=='\\') ) {s = 123;}

                        else if ( (LA34_46=='\n') ) {s = 124;}

                        else if ( (LA34_46=='\'') ) {s = 125;}

                        else if ( ((LA34_46>='\u0000' && LA34_46<='\t')||(LA34_46>='\u000B' && LA34_46<='&')||(LA34_46>='(' && LA34_46<='@')||LA34_46=='['||(LA34_46>=']' && LA34_46<='`')||(LA34_46>='{' && LA34_46<='\uFFFF')) ) {s = 126;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_124 = input.LA(1);

                        s = -1;
                        if ( (LA34_124=='\'') ) {s = 125;}

                        else if ( (LA34_124=='\n'||(LA34_124>='A' && LA34_124<='Z')||(LA34_124>='a' && LA34_124<='z')) ) {s = 124;}

                        else if ( ((LA34_124>='\u0000' && LA34_124<='\t')||(LA34_124>='\u000B' && LA34_124<='&')||(LA34_124>='(' && LA34_124<='@')||(LA34_124>='[' && LA34_124<='`')||(LA34_124>='{' && LA34_124<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_224 = input.LA(1);

                        s = -1;
                        if ( ((LA34_224>='\u0000' && LA34_224<='/')||(LA34_224>='8' && LA34_224<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_224>='0' && LA34_224<='7')) ) {s = 259;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_337 = input.LA(1);

                        s = -1;
                        if ( (LA34_337=='\"') ) {s = 129;}

                        else if ( (LA34_337=='\\') ) {s = 127;}

                        else if ( ((LA34_337>='A' && LA34_337<='Z')||(LA34_337>='a' && LA34_337<='z')) ) {s = 128;}

                        else if ( ((LA34_337>='\u0000' && LA34_337<='!')||(LA34_337>='#' && LA34_337<='@')||LA34_337=='['||(LA34_337>=']' && LA34_337<='`')||(LA34_337>='{' && LA34_337<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_223 = input.LA(1);

                        s = -1;
                        if ( ((LA34_223>='0' && LA34_223<='9')||(LA34_223>='A' && LA34_223<='F')||(LA34_223>='a' && LA34_223<='f')) ) {s = 258;}

                        else if ( ((LA34_223>='\u0000' && LA34_223<='/')||(LA34_223>=':' && LA34_223<='@')||(LA34_223>='G' && LA34_223<='`')||(LA34_223>='g' && LA34_223<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_0 = input.LA(1);

                        s = -1;
                        if ( (LA34_0=='p') ) {s = 1;}

                        else if ( (LA34_0=='i') ) {s = 2;}

                        else if ( (LA34_0=='(') ) {s = 3;}

                        else if ( (LA34_0==')') ) {s = 4;}

                        else if ( (LA34_0=='.') ) {s = 5;}

                        else if ( (LA34_0=='c') ) {s = 6;}

                        else if ( (LA34_0=='=') ) {s = 7;}

                        else if ( (LA34_0==',') ) {s = 8;}

                        else if ( (LA34_0=='t') ) {s = 9;}

                        else if ( (LA34_0=='f') ) {s = 10;}

                        else if ( (LA34_0=='v') ) {s = 11;}

                        else if ( (LA34_0=='{') ) {s = 12;}

                        else if ( (LA34_0=='}') ) {s = 13;}

                        else if ( (LA34_0=='<') ) {s = 14;}

                        else if ( (LA34_0=='+') ) {s = 15;}

                        else if ( (LA34_0=='-') ) {s = 16;}

                        else if ( (LA34_0=='|') ) {s = 17;}

                        else if ( (LA34_0=='^') ) {s = 18;}

                        else if ( (LA34_0=='*') ) {s = 19;}

                        else if ( (LA34_0=='/') ) {s = 20;}

                        else if ( (LA34_0=='%') ) {s = 21;}

                        else if ( (LA34_0=='>') ) {s = 22;}

                        else if ( (LA34_0=='&') ) {s = 23;}

                        else if ( (LA34_0==':') ) {s = 24;}

                        else if ( (LA34_0=='r') ) {s = 25;}

                        else if ( (LA34_0=='b') ) {s = 26;}

                        else if ( (LA34_0=='g') ) {s = 27;}

                        else if ( (LA34_0=='d') ) {s = 28;}

                        else if ( (LA34_0=='e') ) {s = 29;}

                        else if ( (LA34_0=='s') ) {s = 30;}

                        else if ( (LA34_0=='A') ) {s = 31;}

                        else if ( (LA34_0=='S') ) {s = 32;}

                        else if ( (LA34_0=='P') ) {s = 33;}

                        else if ( (LA34_0=='F') ) {s = 34;}

                        else if ( (LA34_0=='I') ) {s = 35;}

                        else if ( (LA34_0=='M') ) {s = 36;}

                        else if ( (LA34_0=='C') ) {s = 37;}

                        else if ( (LA34_0=='[') ) {s = 38;}

                        else if ( (LA34_0==']') ) {s = 39;}

                        else if ( (LA34_0=='m') ) {s = 40;}

                        else if ( (LA34_0=='!') ) {s = 41;}

                        else if ( (LA34_0==';') ) {s = 42;}

                        else if ( (LA34_0=='B'||(LA34_0>='D' && LA34_0<='E')||(LA34_0>='G' && LA34_0<='H')||(LA34_0>='J' && LA34_0<='L')||(LA34_0>='N' && LA34_0<='O')||(LA34_0>='Q' && LA34_0<='R')||(LA34_0>='T' && LA34_0<='Z')||LA34_0=='_'||LA34_0=='a'||LA34_0=='h'||(LA34_0>='j' && LA34_0<='l')||(LA34_0>='n' && LA34_0<='o')||LA34_0=='q'||LA34_0=='u'||(LA34_0>='w' && LA34_0<='z')) ) {s = 43;}

                        else if ( ((LA34_0>='1' && LA34_0<='9')) ) {s = 44;}

                        else if ( (LA34_0=='0') ) {s = 45;}

                        else if ( (LA34_0=='\'') ) {s = 46;}

                        else if ( (LA34_0=='\"') ) {s = 47;}

                        else if ( ((LA34_0>='\t' && LA34_0<='\n')||LA34_0=='\r'||LA34_0==' ') ) {s = 48;}

                        else if ( ((LA34_0>='\u0000' && LA34_0<='\b')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\u001F')||(LA34_0>='#' && LA34_0<='$')||(LA34_0>='?' && LA34_0<='@')||LA34_0=='\\'||LA34_0=='`'||(LA34_0>='~' && LA34_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_220 = input.LA(1);

                        s = -1;
                        if ( ((LA34_220>='\u0000' && LA34_220<='/')||(LA34_220>=':' && LA34_220<='@')||(LA34_220>='G' && LA34_220<='`')||(LA34_220>='g' && LA34_220<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_220>='0' && LA34_220<='9')||(LA34_220>='A' && LA34_220<='F')||(LA34_220>='a' && LA34_220<='f')) ) {s = 256;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_256 = input.LA(1);

                        s = -1;
                        if ( ((LA34_256>='\u0000' && LA34_256<='/')||(LA34_256>=':' && LA34_256<='@')||(LA34_256>='G' && LA34_256<='`')||(LA34_256>='g' && LA34_256<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_256>='0' && LA34_256<='9')||(LA34_256>='A' && LA34_256<='F')||(LA34_256>='a' && LA34_256<='f')) ) {s = 285;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_285 = input.LA(1);

                        s = -1;
                        if ( ((LA34_285>='\u0000' && LA34_285<='/')||(LA34_285>=':' && LA34_285<='@')||(LA34_285>='G' && LA34_285<='`')||(LA34_285>='g' && LA34_285<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_285>='0' && LA34_285<='9')||(LA34_285>='A' && LA34_285<='F')||(LA34_285>='a' && LA34_285<='f')) ) {s = 304;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_221 = input.LA(1);

                        s = -1;
                        if ( ((LA34_221>='\u0000' && LA34_221<='/')||(LA34_221>=':' && LA34_221<='@')||(LA34_221>='G' && LA34_221<='`')||(LA34_221>='g' && LA34_221<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_221>='0' && LA34_221<='9')||(LA34_221>='A' && LA34_221<='F')||(LA34_221>='a' && LA34_221<='f')) ) {s = 257;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_257 = input.LA(1);

                        s = -1;
                        if ( ((LA34_257>='\u0000' && LA34_257<='/')||(LA34_257>=':' && LA34_257<='@')||(LA34_257>='G' && LA34_257<='`')||(LA34_257>='g' && LA34_257<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_257>='0' && LA34_257<='9')||(LA34_257>='A' && LA34_257<='F')||(LA34_257>='a' && LA34_257<='f')) ) {s = 286;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_286 = input.LA(1);

                        s = -1;
                        if ( ((LA34_286>='\u0000' && LA34_286<='/')||(LA34_286>=':' && LA34_286<='@')||(LA34_286>='G' && LA34_286<='`')||(LA34_286>='g' && LA34_286<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_286>='0' && LA34_286<='9')||(LA34_286>='A' && LA34_286<='F')||(LA34_286>='a' && LA34_286<='f')) ) {s = 305;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA34_305 = input.LA(1);

                        s = -1;
                        if ( ((LA34_305>='\u0000' && LA34_305<='/')||(LA34_305>=':' && LA34_305<='@')||(LA34_305>='G' && LA34_305<='`')||(LA34_305>='g' && LA34_305<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_305>='0' && LA34_305<='9')||(LA34_305>='A' && LA34_305<='F')||(LA34_305>='a' && LA34_305<='f')) ) {s = 318;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA34_318 = input.LA(1);

                        s = -1;
                        if ( ((LA34_318>='0' && LA34_318<='9')||(LA34_318>='A' && LA34_318<='F')||(LA34_318>='a' && LA34_318<='f')) ) {s = 326;}

                        else if ( ((LA34_318>='\u0000' && LA34_318<='/')||(LA34_318>=':' && LA34_318<='@')||(LA34_318>='G' && LA34_318<='`')||(LA34_318>='g' && LA34_318<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA34_326 = input.LA(1);

                        s = -1;
                        if ( ((LA34_326>='0' && LA34_326<='9')||(LA34_326>='A' && LA34_326<='F')||(LA34_326>='a' && LA34_326<='f')) ) {s = 332;}

                        else if ( ((LA34_326>='\u0000' && LA34_326<='/')||(LA34_326>=':' && LA34_326<='@')||(LA34_326>='G' && LA34_326<='`')||(LA34_326>='g' && LA34_326<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA34_332 = input.LA(1);

                        s = -1;
                        if ( ((LA34_332>='0' && LA34_332<='9')||(LA34_332>='A' && LA34_332<='F')||(LA34_332>='a' && LA34_332<='f')) ) {s = 336;}

                        else if ( ((LA34_332>='\u0000' && LA34_332<='/')||(LA34_332>=':' && LA34_332<='@')||(LA34_332>='G' && LA34_332<='`')||(LA34_332>='g' && LA34_332<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA34_259 = input.LA(1);

                        s = -1;
                        if ( (LA34_259=='\'') ) {s = 222;}

                        else if ( ((LA34_259>='\u0000' && LA34_259<='&')||(LA34_259>='(' && LA34_259<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA34_304 = input.LA(1);

                        s = -1;
                        if ( (LA34_304=='\'') ) {s = 222;}

                        else if ( ((LA34_304>='\u0000' && LA34_304<='&')||(LA34_304>='(' && LA34_304<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA34_258 = input.LA(1);

                        s = -1;
                        if ( (LA34_258=='\'') ) {s = 222;}

                        else if ( ((LA34_258>='\u0000' && LA34_258<='&')||(LA34_258>='(' && LA34_258<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA34_122 = input.LA(1);

                        s = -1;
                        if ( (LA34_122=='\'') ) {s = 172;}

                        else if ( (LA34_122=='\n'||(LA34_122>='A' && LA34_122<='Z')||(LA34_122>='a' && LA34_122<='z')) ) {s = 124;}

                        else if ( ((LA34_122>='\u0000' && LA34_122<='\t')||(LA34_122>='\u000B' && LA34_122<='&')||(LA34_122>='(' && LA34_122<='@')||(LA34_122>='[' && LA34_122<='`')||(LA34_122>='{' && LA34_122<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA34_336 = input.LA(1);

                        s = -1;
                        if ( (LA34_336=='\'') ) {s = 222;}

                        else if ( ((LA34_336>='\u0000' && LA34_336<='&')||(LA34_336>='(' && LA34_336<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA34_182 = input.LA(1);

                        s = -1;
                        if ( ((LA34_182>='0' && LA34_182<='9')||(LA34_182>='A' && LA34_182<='F')||(LA34_182>='a' && LA34_182<='f')) ) {s = 227;}

                        else if ( ((LA34_182>='\u0000' && LA34_182<='/')||(LA34_182>=':' && LA34_182<='@')||(LA34_182>='G' && LA34_182<='`')||(LA34_182>='g' && LA34_182<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA34_179 = input.LA(1);

                        s = -1;
                        if ( ((LA34_179>='\u0000' && LA34_179<='/')||(LA34_179>=':' && LA34_179<='@')||(LA34_179>='G' && LA34_179<='`')||(LA34_179>='g' && LA34_179<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_179>='0' && LA34_179<='9')||(LA34_179>='A' && LA34_179<='F')||(LA34_179>='a' && LA34_179<='f')) ) {s = 225;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA34_180 = input.LA(1);

                        s = -1;
                        if ( ((LA34_180>='0' && LA34_180<='9')||(LA34_180>='A' && LA34_180<='F')||(LA34_180>='a' && LA34_180<='f')) ) {s = 226;}

                        else if ( ((LA34_180>='\u0000' && LA34_180<='/')||(LA34_180>=':' && LA34_180<='@')||(LA34_180>='G' && LA34_180<='`')||(LA34_180>='g' && LA34_180<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA34_127 = input.LA(1);

                        s = -1;
                        if ( (LA34_127=='u') ) {s = 179;}

                        else if ( (LA34_127=='U') ) {s = 180;}

                        else if ( (LA34_127=='\"'||LA34_127=='\''||LA34_127=='\\'||(LA34_127>='a' && LA34_127<='b')||LA34_127=='f'||LA34_127=='n'||LA34_127=='r'||LA34_127=='t'||LA34_127=='v') ) {s = 181;}

                        else if ( (LA34_127=='x') ) {s = 182;}

                        else if ( ((LA34_127>='0' && LA34_127<='7')) ) {s = 183;}

                        else if ( ((LA34_127>='\u0000' && LA34_127<='!')||(LA34_127>='#' && LA34_127<='&')||(LA34_127>='(' && LA34_127<='/')||(LA34_127>='8' && LA34_127<='T')||(LA34_127>='V' && LA34_127<='[')||(LA34_127>=']' && LA34_127<='`')||(LA34_127>='c' && LA34_127<='e')||(LA34_127>='g' && LA34_127<='m')||(LA34_127>='o' && LA34_127<='q')||LA34_127=='s'||LA34_127=='w'||(LA34_127>='y' && LA34_127<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA34_47 = input.LA(1);

                        s = -1;
                        if ( (LA34_47=='\\') ) {s = 127;}

                        else if ( ((LA34_47>='A' && LA34_47<='Z')||(LA34_47>='a' && LA34_47<='z')) ) {s = 128;}

                        else if ( (LA34_47=='\"') ) {s = 129;}

                        else if ( ((LA34_47>='\u0000' && LA34_47<='!')||(LA34_47>='#' && LA34_47<='@')||LA34_47=='['||(LA34_47>=']' && LA34_47<='`')||(LA34_47>='{' && LA34_47<='\uFFFF')) ) {s = 126;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA34_123 = input.LA(1);

                        s = -1;
                        if ( (LA34_123=='u') ) {s = 173;}

                        else if ( (LA34_123=='U') ) {s = 174;}

                        else if ( (LA34_123=='\"'||LA34_123=='\''||LA34_123=='\\'||(LA34_123>='a' && LA34_123<='b')||LA34_123=='f'||LA34_123=='n'||LA34_123=='r'||LA34_123=='t'||LA34_123=='v') ) {s = 175;}

                        else if ( (LA34_123=='x') ) {s = 176;}

                        else if ( ((LA34_123>='0' && LA34_123<='7')) ) {s = 177;}

                        else if ( ((LA34_123>='\u0000' && LA34_123<='!')||(LA34_123>='#' && LA34_123<='&')||(LA34_123>='(' && LA34_123<='/')||(LA34_123>='8' && LA34_123<='T')||(LA34_123>='V' && LA34_123<='[')||(LA34_123>=']' && LA34_123<='`')||(LA34_123>='c' && LA34_123<='e')||(LA34_123>='g' && LA34_123<='m')||(LA34_123>='o' && LA34_123<='q')||LA34_123=='s'||LA34_123=='w'||(LA34_123>='y' && LA34_123<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA34_181 = input.LA(1);

                        s = -1;
                        if ( (LA34_181=='\"') ) {s = 129;}

                        else if ( ((LA34_181>='A' && LA34_181<='Z')||(LA34_181>='a' && LA34_181<='z')) ) {s = 128;}

                        else if ( (LA34_181=='\\') ) {s = 127;}

                        else if ( ((LA34_181>='\u0000' && LA34_181<='!')||(LA34_181>='#' && LA34_181<='@')||LA34_181=='['||(LA34_181>=']' && LA34_181<='`')||(LA34_181>='{' && LA34_181<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA34_176 = input.LA(1);

                        s = -1;
                        if ( ((LA34_176>='\u0000' && LA34_176<='/')||(LA34_176>=':' && LA34_176<='@')||(LA34_176>='G' && LA34_176<='`')||(LA34_176>='g' && LA34_176<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_176>='0' && LA34_176<='9')||(LA34_176>='A' && LA34_176<='F')||(LA34_176>='a' && LA34_176<='f')) ) {s = 223;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA34_173 = input.LA(1);

                        s = -1;
                        if ( ((LA34_173>='\u0000' && LA34_173<='/')||(LA34_173>=':' && LA34_173<='@')||(LA34_173>='G' && LA34_173<='`')||(LA34_173>='g' && LA34_173<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_173>='0' && LA34_173<='9')||(LA34_173>='A' && LA34_173<='F')||(LA34_173>='a' && LA34_173<='f')) ) {s = 220;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA34_174 = input.LA(1);

                        s = -1;
                        if ( ((LA34_174>='\u0000' && LA34_174<='/')||(LA34_174>=':' && LA34_174<='@')||(LA34_174>='G' && LA34_174<='`')||(LA34_174>='g' && LA34_174<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_174>='0' && LA34_174<='9')||(LA34_174>='A' && LA34_174<='F')||(LA34_174>='a' && LA34_174<='f')) ) {s = 221;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA34_183 = input.LA(1);

                        s = -1;
                        if ( ((LA34_183>='\u0000' && LA34_183<='/')||(LA34_183>='8' && LA34_183<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_183>='0' && LA34_183<='7')) ) {s = 228;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA34_228 = input.LA(1);

                        s = -1;
                        if ( ((LA34_228>='\u0000' && LA34_228<='/')||(LA34_228>='8' && LA34_228<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_228>='0' && LA34_228<='7')) ) {s = 263;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA34_227 = input.LA(1);

                        s = -1;
                        if ( ((LA34_227>='\u0000' && LA34_227<='/')||(LA34_227>=':' && LA34_227<='@')||(LA34_227>='G' && LA34_227<='`')||(LA34_227>='g' && LA34_227<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_227>='0' && LA34_227<='9')||(LA34_227>='A' && LA34_227<='F')||(LA34_227>='a' && LA34_227<='f')) ) {s = 262;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA34_225 = input.LA(1);

                        s = -1;
                        if ( ((LA34_225>='\u0000' && LA34_225<='/')||(LA34_225>=':' && LA34_225<='@')||(LA34_225>='G' && LA34_225<='`')||(LA34_225>='g' && LA34_225<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_225>='0' && LA34_225<='9')||(LA34_225>='A' && LA34_225<='F')||(LA34_225>='a' && LA34_225<='f')) ) {s = 260;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA34_260 = input.LA(1);

                        s = -1;
                        if ( ((LA34_260>='\u0000' && LA34_260<='/')||(LA34_260>=':' && LA34_260<='@')||(LA34_260>='G' && LA34_260<='`')||(LA34_260>='g' && LA34_260<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_260>='0' && LA34_260<='9')||(LA34_260>='A' && LA34_260<='F')||(LA34_260>='a' && LA34_260<='f')) ) {s = 287;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA34_287 = input.LA(1);

                        s = -1;
                        if ( ((LA34_287>='\u0000' && LA34_287<='/')||(LA34_287>=':' && LA34_287<='@')||(LA34_287>='G' && LA34_287<='`')||(LA34_287>='g' && LA34_287<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_287>='0' && LA34_287<='9')||(LA34_287>='A' && LA34_287<='F')||(LA34_287>='a' && LA34_287<='f')) ) {s = 306;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA34_226 = input.LA(1);

                        s = -1;
                        if ( ((LA34_226>='0' && LA34_226<='9')||(LA34_226>='A' && LA34_226<='F')||(LA34_226>='a' && LA34_226<='f')) ) {s = 261;}

                        else if ( ((LA34_226>='\u0000' && LA34_226<='/')||(LA34_226>=':' && LA34_226<='@')||(LA34_226>='G' && LA34_226<='`')||(LA34_226>='g' && LA34_226<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA34_128 = input.LA(1);

                        s = -1;
                        if ( (LA34_128=='\"') ) {s = 129;}

                        else if ( (LA34_128=='\\') ) {s = 127;}

                        else if ( ((LA34_128>='A' && LA34_128<='Z')||(LA34_128>='a' && LA34_128<='z')) ) {s = 128;}

                        else if ( ((LA34_128>='\u0000' && LA34_128<='!')||(LA34_128>='#' && LA34_128<='@')||LA34_128=='['||(LA34_128>=']' && LA34_128<='`')||(LA34_128>='{' && LA34_128<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA34_261 = input.LA(1);

                        s = -1;
                        if ( ((LA34_261>='\u0000' && LA34_261<='/')||(LA34_261>=':' && LA34_261<='@')||(LA34_261>='G' && LA34_261<='`')||(LA34_261>='g' && LA34_261<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_261>='0' && LA34_261<='9')||(LA34_261>='A' && LA34_261<='F')||(LA34_261>='a' && LA34_261<='f')) ) {s = 288;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA34_288 = input.LA(1);

                        s = -1;
                        if ( ((LA34_288>='\u0000' && LA34_288<='/')||(LA34_288>=':' && LA34_288<='@')||(LA34_288>='G' && LA34_288<='`')||(LA34_288>='g' && LA34_288<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_288>='0' && LA34_288<='9')||(LA34_288>='A' && LA34_288<='F')||(LA34_288>='a' && LA34_288<='f')) ) {s = 307;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA34_307 = input.LA(1);

                        s = -1;
                        if ( ((LA34_307>='\u0000' && LA34_307<='/')||(LA34_307>=':' && LA34_307<='@')||(LA34_307>='G' && LA34_307<='`')||(LA34_307>='g' && LA34_307<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_307>='0' && LA34_307<='9')||(LA34_307>='A' && LA34_307<='F')||(LA34_307>='a' && LA34_307<='f')) ) {s = 319;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA34_319 = input.LA(1);

                        s = -1;
                        if ( ((LA34_319>='\u0000' && LA34_319<='/')||(LA34_319>=':' && LA34_319<='@')||(LA34_319>='G' && LA34_319<='`')||(LA34_319>='g' && LA34_319<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_319>='0' && LA34_319<='9')||(LA34_319>='A' && LA34_319<='F')||(LA34_319>='a' && LA34_319<='f')) ) {s = 327;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA34_327 = input.LA(1);

                        s = -1;
                        if ( ((LA34_327>='\u0000' && LA34_327<='/')||(LA34_327>=':' && LA34_327<='@')||(LA34_327>='G' && LA34_327<='`')||(LA34_327>='g' && LA34_327<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_327>='0' && LA34_327<='9')||(LA34_327>='A' && LA34_327<='F')||(LA34_327>='a' && LA34_327<='f')) ) {s = 333;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA34_333 = input.LA(1);

                        s = -1;
                        if ( ((LA34_333>='\u0000' && LA34_333<='/')||(LA34_333>=':' && LA34_333<='@')||(LA34_333>='G' && LA34_333<='`')||(LA34_333>='g' && LA34_333<='\uFFFF')) ) {s = 126;}

                        else if ( ((LA34_333>='0' && LA34_333<='9')||(LA34_333>='A' && LA34_333<='F')||(LA34_333>='a' && LA34_333<='f')) ) {s = 337;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}