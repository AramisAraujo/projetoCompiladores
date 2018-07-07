package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_DECIMAL_DIGIT=21;
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
    public static final int RULE_ID=38;
    public static final int RULE_INT=39;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=41;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=24;
    public static final int RULE_NEWLINE=36;
    public static final int RULE_BIG_U_VALUE=30;
    public static final int RULE_ESCAPED_CHAR=31;
    public static final int RULE_BYTE_VALUE=27;
    public static final int RULE_UNICODE_LETTER=37;
    public static final int RULE_UNICODE_CHAR=28;
    public static final int RULE_OCTAL_DIGIT=22;
    public static final int RULE_LETTER=12;
    public static final int RULE_EXPONENT=25;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=34;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=17;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=23;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RUNE_LIT=10;
    public static final int RULE_DECIMAL_LIT=18;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BINARY_OP=11;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int RULE_IMAGINARY_LIT=9;
    public static final int RULE_STRING_LIT=4;
    public static final int RULE_INTERPRETED_STRING_LIT=35;
    public static final int RULE_UNICODE_VALUE=26;
    public static final int RULE_LITTLE_U_VALUE=29;
    public static final int RULE_HEX_BYTE_VALUE=33;
    public static final int RULE_OCTAL_BYTE_VALUE=32;
    public static final int RULE_MUL_OP=16;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_STRING=40;
    public static final int RULE_SL_COMMENT=42;
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
    public static final int RULE_UNICODE_DIGIT=13;
    public static final int T__83=83;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=43;
    public static final int RULE_OCTAL_LIT=19;
    public static final int RULE_FLOAT_LIT=8;
    public static final int RULE_INT_LIT=7;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_REL_OP=14;
    public static final int T__84=84;
    public static final int T__85=85;
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

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( 'fallthrough' )
            // InternalGo.g:11:9: 'fallthrough'
            {
            match("fallthrough"); 


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
            // InternalGo.g:12:7: ( '.' )
            // InternalGo.g:12:9: '.'
            {
            match('.'); 

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
            // InternalGo.g:13:7: ( '++' )
            // InternalGo.g:13:9: '++'
            {
            match("++"); 


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
            // InternalGo.g:14:7: ( '--' )
            // InternalGo.g:14:9: '--'
            {
            match("--"); 


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
            // InternalGo.g:15:7: ( '+' )
            // InternalGo.g:15:9: '+'
            {
            match('+'); 

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
            // InternalGo.g:16:7: ( '-' )
            // InternalGo.g:16:9: '-'
            {
            match('-'); 

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
            // InternalGo.g:17:7: ( '|' )
            // InternalGo.g:17:9: '|'
            {
            match('|'); 

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
            // InternalGo.g:18:7: ( '^' )
            // InternalGo.g:18:9: '^'
            {
            match('^'); 

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
            // InternalGo.g:19:7: ( '*' )
            // InternalGo.g:19:9: '*'
            {
            match('*'); 

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
            // InternalGo.g:20:7: ( '/' )
            // InternalGo.g:20:9: '/'
            {
            match('/'); 

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
            // InternalGo.g:21:7: ( '%' )
            // InternalGo.g:21:9: '%'
            {
            match('%'); 

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
            // InternalGo.g:22:7: ( '<<' )
            // InternalGo.g:22:9: '<<'
            {
            match("<<"); 


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
            // InternalGo.g:23:7: ( '>>' )
            // InternalGo.g:23:9: '>>'
            {
            match(">>"); 


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
            // InternalGo.g:24:7: ( '&' )
            // InternalGo.g:24:9: '&'
            {
            match('&'); 

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
            // InternalGo.g:25:7: ( '&^' )
            // InternalGo.g:25:9: '&^'
            {
            match("&^"); 


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
            // InternalGo.g:26:7: ( 'default' )
            // InternalGo.g:26:9: 'default'
            {
            match("default"); 


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
            // InternalGo.g:27:7: ( 'chan' )
            // InternalGo.g:27:9: 'chan'
            {
            match("chan"); 


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
            // InternalGo.g:28:7: ( '!' )
            // InternalGo.g:28:9: '!'
            {
            match('!'); 

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
            // InternalGo.g:29:7: ( '<-' )
            // InternalGo.g:29:9: '<-'
            {
            match("<-"); 


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
            // InternalGo.g:30:7: ( ';' )
            // InternalGo.g:30:9: ';'
            {
            match(';'); 

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
            // InternalGo.g:31:7: ( 'package' )
            // InternalGo.g:31:9: 'package'
            {
            match("package"); 


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
            // InternalGo.g:32:7: ( 'import' )
            // InternalGo.g:32:9: 'import'
            {
            match("import"); 


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
            // InternalGo.g:33:7: ( '(' )
            // InternalGo.g:33:9: '('
            {
            match('('); 

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
            // InternalGo.g:34:7: ( ')' )
            // InternalGo.g:34:9: ')'
            {
            match(')'); 

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
            // InternalGo.g:35:7: ( 'const' )
            // InternalGo.g:35:9: 'const'
            {
            match("const"); 


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
            // InternalGo.g:36:7: ( '=' )
            // InternalGo.g:36:9: '='
            {
            match('='); 

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
            // InternalGo.g:37:7: ( ',' )
            // InternalGo.g:37:9: ','
            {
            match(','); 

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
            // InternalGo.g:38:7: ( 'type' )
            // InternalGo.g:38:9: 'type'
            {
            match("type"); 


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
            // InternalGo.g:39:7: ( 'func' )
            // InternalGo.g:39:9: 'func'
            {
            match("func"); 


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
            // InternalGo.g:40:7: ( 'var' )
            // InternalGo.g:40:9: 'var'
            {
            match("var"); 


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
            // InternalGo.g:41:7: ( '{' )
            // InternalGo.g:41:9: '{'
            {
            match('{'); 

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
            // InternalGo.g:42:7: ( '}' )
            // InternalGo.g:42:9: '}'
            {
            match('}'); 

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
            // InternalGo.g:43:7: ( ':=' )
            // InternalGo.g:43:9: ':='
            {
            match(":="); 


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
            // InternalGo.g:44:7: ( ':' )
            // InternalGo.g:44:9: ':'
            {
            match(':'); 

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
            // InternalGo.g:45:7: ( 'return' )
            // InternalGo.g:45:9: 'return'
            {
            match("return"); 


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
            // InternalGo.g:46:7: ( 'break' )
            // InternalGo.g:46:9: 'break'
            {
            match("break"); 


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
            // InternalGo.g:47:7: ( 'continue' )
            // InternalGo.g:47:9: 'continue'
            {
            match("continue"); 


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
            // InternalGo.g:48:7: ( 'goto' )
            // InternalGo.g:48:9: 'goto'
            {
            match("goto"); 


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
            // InternalGo.g:49:7: ( 'defer' )
            // InternalGo.g:49:9: 'defer'
            {
            match("defer"); 


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
            // InternalGo.g:50:7: ( 'if' )
            // InternalGo.g:50:9: 'if'
            {
            match("if"); 


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
            // InternalGo.g:51:7: ( 'else' )
            // InternalGo.g:51:9: 'else'
            {
            match("else"); 


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
            // InternalGo.g:52:7: ( 'switch' )
            // InternalGo.g:52:9: 'switch'
            {
            match("switch"); 


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
            // InternalGo.g:53:7: ( 'case' )
            // InternalGo.g:53:9: 'case'
            {
            match("case"); 


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
            // InternalGo.g:54:7: ( 'select' )
            // InternalGo.g:54:9: 'select'
            {
            match("select"); 


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
            // InternalGo.g:55:7: ( 'for' )
            // InternalGo.g:55:9: 'for'
            {
            match("for"); 


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
            // InternalGo.g:56:7: ( 'range' )
            // InternalGo.g:56:9: 'range'
            {
            match("range"); 


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
            // InternalGo.g:57:7: ( 'go' )
            // InternalGo.g:57:9: 'go'
            {
            match("go"); 


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
            // InternalGo.g:58:7: ( '[' )
            // InternalGo.g:58:9: '['
            {
            match('['); 

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
            // InternalGo.g:59:7: ( ']' )
            // InternalGo.g:59:9: ']'
            {
            match(']'); 

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
            // InternalGo.g:60:7: ( 'interface' )
            // InternalGo.g:60:9: 'interface'
            {
            match("interface"); 


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
            // InternalGo.g:61:7: ( 'map' )
            // InternalGo.g:61:9: 'map'
            {
            match("map"); 


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
            // InternalGo.g:62:7: ( '...' )
            // InternalGo.g:62:9: '...'
            {
            match("..."); 


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
            // InternalGo.g:63:7: ( 'struct' )
            // InternalGo.g:63:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16166:17: ( RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )* )
            // InternalGo.g:16166:19: RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalGo.g:16166:31: ( RULE_LETTER | RULE_UNICODE_DIGIT )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }
                else if ( (LA1_0=='0'||LA1_0=='\u0660'||LA1_0=='\u06F0'||LA1_0=='\u0966'||LA1_0=='\u09E6'||LA1_0=='\u0A66'||LA1_0=='\u0AE6'||LA1_0=='\u0B66'||LA1_0=='\u0BE7'||LA1_0=='\u0C66'||LA1_0=='\u0CE6'||LA1_0=='\u0D66'||LA1_0=='\u0E50'||LA1_0=='\u0ED0'||LA1_0=='\u0F20'||LA1_0=='\u1040'||LA1_0=='\u1369'||LA1_0=='\u17E0'||LA1_0=='\u1810'||LA1_0=='\uFF10') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:16166:32: RULE_LETTER
            	    {
            	    mRULE_LETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:16166:44: RULE_UNICODE_DIGIT
            	    {
            	    mRULE_UNICODE_DIGIT(); 

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
            // InternalGo.g:16168:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:16168:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:16168:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGo.g:16168:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:16168:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:16168:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16168:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:16168:53: RULE_MUL_OP
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
            // InternalGo.g:16170:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:16170:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:16170:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
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
                    // InternalGo.g:16170:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:16170:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:16170:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16170:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:16170:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:16170:48: '>='
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
            // InternalGo.g:16172:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:16172:24: ( '+' | '-' | '|' | '^' )
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
            // InternalGo.g:16174:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:16174:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:16174:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
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
                    // InternalGo.g:16174:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16174:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16174:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16174:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:16174:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:16174:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:16174:51: '&^'
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
            // InternalGo.g:16176:24: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:16176:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:16176:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
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
                    // InternalGo.g:16176:27: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16176:31: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16176:35: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16176:39: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:16176:43: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:16176:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:16176:51: '<-'
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
            // InternalGo.g:16178:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:16178:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:16178:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
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
                    // InternalGo.g:16178:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16178:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16178:49: RULE_HEX_LIT
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
            // InternalGo.g:16180:27: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:16180:29: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
            {
            matchRange('1','9'); 
            // InternalGo.g:16180:38: ( RULE_DECIMAL_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:16180:38: RULE_DECIMAL_DIGIT
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
            // InternalGo.g:16182:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:16182:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:16182:31: ( RULE_OCTAL_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:16182:31: RULE_OCTAL_DIGIT
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
            // InternalGo.g:16184:23: ( '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:16184:25: '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:16184:39: ( RULE_HEX_DIGIT )+
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
            	    // InternalGo.g:16184:39: RULE_HEX_DIGIT
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
            // InternalGo.g:16186:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalGo.g:16186:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalGo.g:16186:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalGo.g:16186:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalGo.g:16186:37: ( RULE_DECIMALS )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:16186:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalGo.g:16186:52: ( RULE_EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGo.g:16186:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:16186:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16186:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:16186:113: ( RULE_EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:16186:113: RULE_EXPONENT
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
            // InternalGo.g:16188:24: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:16188:26: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:16188:26: ( RULE_DECIMAL_DIGIT )+
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
            	    // InternalGo.g:16188:26: RULE_DECIMAL_DIGIT
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
            // InternalGo.g:16190:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:16190:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:16190:36: ( '+' | '-' )?
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
            // InternalGo.g:16192:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalGo.g:16192:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalGo.g:16192:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalGo.g:16192:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16192:37: RULE_FLOAT_LIT
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
            // InternalGo.g:16194:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalGo.g:16194:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalGo.g:16194:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
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
                    // InternalGo.g:16194:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16194:42: RULE_BYTE_VALUE
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
            // InternalGo.g:16196:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:16196:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:16196:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
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
                    // InternalGo.g:16196:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16196:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16196:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16196:87: RULE_ESCAPED_CHAR
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
            // InternalGo.g:16198:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:16198:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:16198:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
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
                    // InternalGo.g:16198:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16198:51: RULE_HEX_BYTE_VALUE
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
            // InternalGo.g:16200:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:16200:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalGo.g:16202:30: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:16202:32: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:16204:30: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:16204:32: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:16206:27: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:16206:29: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:16208:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:16208:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalGo.g:16210:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalGo.g:16210:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalGo.g:16210:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
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
                    // InternalGo.g:16210:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16210:40: RULE_INTERPRETED_STRING_LIT
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
            // InternalGo.g:16212:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalGo.g:16212:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalGo.g:16212:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
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
            // InternalGo.g:16214:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalGo.g:16214:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalGo.g:16214:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
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
            	    // InternalGo.g:16214:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:16214:64: RULE_BYTE_VALUE
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
            // InternalGo.g:16216:22: ( ( RULE_UNICODE_LETTER | '_' ) )
            // InternalGo.g:16216:24: ( RULE_UNICODE_LETTER | '_' )
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
            // InternalGo.g:16218:29: ( '0' .. '9' )
            // InternalGo.g:16218:31: '0' .. '9'
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
            // InternalGo.g:16220:27: ( '0' .. '7' )
            // InternalGo.g:16220:29: '0' .. '7'
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
            // InternalGo.g:16222:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalGo.g:16222:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalGo.g:16224:23: ( '\\n' )
            // InternalGo.g:16224:25: '\\n'
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
            // InternalGo.g:16226:28: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:16226:30: ( 'A' .. 'Z' | 'a' .. 'z' )
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

    // $ANTLR start "RULE_UNICODE_DIGIT"
    public final void mRULE_UNICODE_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:16228:29: ( ( '0..9' | '\\u0660..\\u0669' | '\\u06F0..\\u06F9' | '\\u0966..\\u096F' | '\\u09E6..\\u09EF' | '\\u0A66..\\u0A6F' | '\\u0AE6..\\u0AEF' | '\\u0B66..\\u0B6F' | '\\u0BE7..\\u0BEF' | '\\u0C66..\\u0C6F' | '\\u0CE6..\\u0CEF' | '\\u0D66..\\u0D6F' | '\\u0E50..\\u0E59' | '\\u0ED0..\\u0ED9' | '\\u0F20..\\u0F29' | '\\u1040..\\u1049' | '\\u1369..\\u1371' | '\\u17E0..\\u17E9' | '\\u1810..\\u1819' | '\\uFF10..\\uFF19' ) )
            // InternalGo.g:16228:31: ( '0..9' | '\\u0660..\\u0669' | '\\u06F0..\\u06F9' | '\\u0966..\\u096F' | '\\u09E6..\\u09EF' | '\\u0A66..\\u0A6F' | '\\u0AE6..\\u0AEF' | '\\u0B66..\\u0B6F' | '\\u0BE7..\\u0BEF' | '\\u0C66..\\u0C6F' | '\\u0CE6..\\u0CEF' | '\\u0D66..\\u0D6F' | '\\u0E50..\\u0E59' | '\\u0ED0..\\u0ED9' | '\\u0F20..\\u0F29' | '\\u1040..\\u1049' | '\\u1369..\\u1371' | '\\u17E0..\\u17E9' | '\\u1810..\\u1819' | '\\uFF10..\\uFF19' )
            {
            // InternalGo.g:16228:31: ( '0..9' | '\\u0660..\\u0669' | '\\u06F0..\\u06F9' | '\\u0966..\\u096F' | '\\u09E6..\\u09EF' | '\\u0A66..\\u0A6F' | '\\u0AE6..\\u0AEF' | '\\u0B66..\\u0B6F' | '\\u0BE7..\\u0BEF' | '\\u0C66..\\u0C6F' | '\\u0CE6..\\u0CEF' | '\\u0D66..\\u0D6F' | '\\u0E50..\\u0E59' | '\\u0ED0..\\u0ED9' | '\\u0F20..\\u0F29' | '\\u1040..\\u1049' | '\\u1369..\\u1371' | '\\u17E0..\\u17E9' | '\\u1810..\\u1819' | '\\uFF10..\\uFF19' )
            int alt23=20;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt23=1;
                }
                break;
            case '\u0660':
                {
                alt23=2;
                }
                break;
            case '\u06F0':
                {
                alt23=3;
                }
                break;
            case '\u0966':
                {
                alt23=4;
                }
                break;
            case '\u09E6':
                {
                alt23=5;
                }
                break;
            case '\u0A66':
                {
                alt23=6;
                }
                break;
            case '\u0AE6':
                {
                alt23=7;
                }
                break;
            case '\u0B66':
                {
                alt23=8;
                }
                break;
            case '\u0BE7':
                {
                alt23=9;
                }
                break;
            case '\u0C66':
                {
                alt23=10;
                }
                break;
            case '\u0CE6':
                {
                alt23=11;
                }
                break;
            case '\u0D66':
                {
                alt23=12;
                }
                break;
            case '\u0E50':
                {
                alt23=13;
                }
                break;
            case '\u0ED0':
                {
                alt23=14;
                }
                break;
            case '\u0F20':
                {
                alt23=15;
                }
                break;
            case '\u1040':
                {
                alt23=16;
                }
                break;
            case '\u1369':
                {
                alt23=17;
                }
                break;
            case '\u17E0':
                {
                alt23=18;
                }
                break;
            case '\u1810':
                {
                alt23=19;
                }
                break;
            case '\uFF10':
                {
                alt23=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalGo.g:16228:32: '0..9'
                    {
                    match("0..9"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:16228:39: '\\u0660..\\u0669'
                    {
                    match("\u0660..\u0669"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:16228:56: '\\u06F0..\\u06F9'
                    {
                    match("\u06F0..\u06F9"); 


                    }
                    break;
                case 4 :
                    // InternalGo.g:16228:73: '\\u0966..\\u096F'
                    {
                    match("\u0966..\u096F"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:16228:90: '\\u09E6..\\u09EF'
                    {
                    match("\u09E6..\u09EF"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:16228:107: '\\u0A66..\\u0A6F'
                    {
                    match("\u0A66..\u0A6F"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:16228:124: '\\u0AE6..\\u0AEF'
                    {
                    match("\u0AE6..\u0AEF"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:16228:141: '\\u0B66..\\u0B6F'
                    {
                    match("\u0B66..\u0B6F"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:16228:158: '\\u0BE7..\\u0BEF'
                    {
                    match("\u0BE7..\u0BEF"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:16228:175: '\\u0C66..\\u0C6F'
                    {
                    match("\u0C66..\u0C6F"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:16228:192: '\\u0CE6..\\u0CEF'
                    {
                    match("\u0CE6..\u0CEF"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:16228:209: '\\u0D66..\\u0D6F'
                    {
                    match("\u0D66..\u0D6F"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:16228:226: '\\u0E50..\\u0E59'
                    {
                    match("\u0E50..\u0E59"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:16228:243: '\\u0ED0..\\u0ED9'
                    {
                    match("\u0ED0..\u0ED9"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:16228:260: '\\u0F20..\\u0F29'
                    {
                    match("\u0F20..\u0F29"); 


                    }
                    break;
                case 16 :
                    // InternalGo.g:16228:277: '\\u1040..\\u1049'
                    {
                    match("\u1040..\u1049"); 


                    }
                    break;
                case 17 :
                    // InternalGo.g:16228:294: '\\u1369..\\u1371'
                    {
                    match("\u1369..\u1371"); 


                    }
                    break;
                case 18 :
                    // InternalGo.g:16228:311: '\\u17E0..\\u17E9'
                    {
                    match("\u17E0..\u17E9"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:16228:328: '\\u1810..\\u1819'
                    {
                    match("\u1810..\u1819"); 


                    }
                    break;
                case 20 :
                    // InternalGo.g:16228:345: '\\uFF10..\\uFF19'
                    {
                    match("\uFF10..\uFF19"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_DIGIT"

    // $ANTLR start "RULE_UNICODE_LETTER"
    public final void mRULE_UNICODE_LETTER() throws RecognitionException {
        try {
            // InternalGo.g:16230:30: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:16230:32: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // InternalGo.g:16232:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:16232:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:16232:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:16232:11: '^'
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

            // InternalGo.g:16232:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
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
            	    break loop25;
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
            // InternalGo.g:16234:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:16234:12: ( '0' .. '9' )+
            {
            // InternalGo.g:16234:12: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:16234:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // InternalGo.g:16236:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:16236:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:16236:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\"') ) {
                alt29=1;
            }
            else if ( (LA29_0=='\'') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:16236:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:16236:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGo.g:16236:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:16236:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop27;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16236:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:16236:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalGo.g:16236:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:16236:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop28;
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
            // InternalGo.g:16238:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:16238:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:16238:24: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFF')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:16238:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // InternalGo.g:16240:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:16240:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:16240:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:16240:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop31;
                }
            } while (true);

            // InternalGo.g:16240:40: ( ( '\\r' )? '\\n' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\n'||LA33_0=='\r') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:16240:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:16240:41: ( '\\r' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='\r') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalGo.g:16240:41: '\\r'
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
            // InternalGo.g:16242:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:16242:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:16242:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\t' && LA34_0<='\n')||LA34_0=='\r'||LA34_0==' ') ) {
                    alt34=1;
                }


                switch (alt34) {
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
            // InternalGo.g:16244:16: ( . )
            // InternalGo.g:16244:18: .
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
        // InternalGo.g:1:8: ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt35=67;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // InternalGo.g:1:10: T__44
                {
                mT__44(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__45
                {
                mT__45(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__46
                {
                mT__46(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__47
                {
                mT__47(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__48
                {
                mT__48(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__49
                {
                mT__49(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__50
                {
                mT__50(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__51
                {
                mT__51(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__52
                {
                mT__52(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__53
                {
                mT__53(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__54
                {
                mT__54(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__55
                {
                mT__55(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__56
                {
                mT__56(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__57
                {
                mT__57(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__58
                {
                mT__58(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__59
                {
                mT__59(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__60
                {
                mT__60(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__61
                {
                mT__61(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__62
                {
                mT__62(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__63
                {
                mT__63(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__64
                {
                mT__64(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__65
                {
                mT__65(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__66
                {
                mT__66(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__67
                {
                mT__67(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__68
                {
                mT__68(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__69
                {
                mT__69(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__70
                {
                mT__70(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__71
                {
                mT__71(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__72
                {
                mT__72(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__73
                {
                mT__73(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__74
                {
                mT__74(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__75
                {
                mT__75(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__76
                {
                mT__76(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__77
                {
                mT__77(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__78
                {
                mT__78(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__79
                {
                mT__79(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__80
                {
                mT__80(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__81
                {
                mT__81(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__82
                {
                mT__82(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__83
                {
                mT__83(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__84
                {
                mT__84(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__85
                {
                mT__85(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: T__86
                {
                mT__86(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:268: T__87
                {
                mT__87(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:274: T__88
                {
                mT__88(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:280: T__89
                {
                mT__89(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:286: T__90
                {
                mT__90(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:292: T__91
                {
                mT__91(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:298: T__92
                {
                mT__92(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:304: T__93
                {
                mT__93(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:310: T__94
                {
                mT__94(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:316: T__95
                {
                mT__95(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:322: T__96
                {
                mT__96(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:328: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:344: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:359: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:372: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:387: RULE_IMAGINARY_LIT
                {
                mRULE_IMAGINARY_LIT(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:406: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:420: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:436: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 62 :
                // InternalGo.g:1:444: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 63 :
                // InternalGo.g:1:453: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // InternalGo.g:1:465: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 65 :
                // InternalGo.g:1:481: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 66 :
                // InternalGo.g:1:497: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 67 :
                // InternalGo.g:1:505: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA35 dfa35 = new DFA35(this);
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
            return "16168:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
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
            return "16186:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
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
            return "16192:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA35_eotS =
        "\1\uffff\1\57\1\64\1\66\1\70\1\72\1\73\1\uffff\1\77\1\uffff\2\71\1\105\2\57\1\112\1\uffff\2\57\2\uffff\1\122\1\uffff\2\57\2\uffff\1\131\5\57\2\uffff\2\57\2\145\2\52\2\uffff\4\57\1\uffff\1\61\2\uffff\1\170\22\uffff\4\57\2\uffff\2\57\1\u0083\1\57\4\uffff\2\57\4\uffff\3\57\1\u008b\4\57\2\uffff\1\57\1\uffff\1\145\1\uffff\1\170\1\uffff\1\145\1\u0095\11\uffff\2\57\1\u00a4\5\uffff\6\57\1\uffff\2\57\1\u00b1\4\57\1\uffff\4\57\1\u00ba\1\uffff\2\170\16\uffff\1\57\1\u00c8\2\uffff\1\170\2\57\1\u00cb\2\57\1\u00ce\3\57\1\u00d2\1\uffff\3\57\1\u00d6\1\u00d7\3\57\2\uffff\1\170\12\uffff\1\57\1\uffff\1\57\1\u00e5\1\uffff\1\u00e6\1\57\1\uffff\3\57\1\uffff\1\57\1\u00ec\1\u00ed\2\uffff\3\57\10\uffff\2\57\2\uffff\2\57\1\u00f9\1\57\1\u00fb\2\uffff\1\u00fc\1\u00fd\1\u00fe\4\uffff\1\57\1\u0104\1\57\1\u0106\1\uffff\1\57\10\uffff\1\57\1\uffff\1\u010b\1\uffff\1\57\2\uffff\1\57\1\uffff\1\u0110\2\uffff\1\57\3\uffff\1\u0116\3\uffff";
    static final String DFA35_eofS =
        "\u0117\uffff";
    static final String DFA35_minS =
        "\1\0\1\60\1\56\1\53\1\55\1\174\1\101\1\uffff\1\52\1\uffff\1\55\1\76\1\46\2\60\1\75\1\uffff\2\60\2\uffff\1\75\1\uffff\2\60\2\uffff\1\75\5\60\2\uffff\2\60\2\56\2\0\2\uffff\4\60\1\uffff\1\56\2\uffff\1\60\22\uffff\4\60\2\uffff\4\60\4\uffff\2\60\4\uffff\10\60\2\uffff\1\60\1\uffff\1\56\1\53\1\60\1\uffff\2\56\2\0\2\uffff\3\0\2\uffff\3\60\1\uffff\1\53\3\uffff\6\60\1\uffff\7\60\1\uffff\10\60\1\53\1\uffff\5\0\2\uffff\5\0\2\60\1\uffff\14\60\1\uffff\10\60\1\uffff\2\60\2\0\1\uffff\2\0\1\uffff\4\0\1\60\1\uffff\2\60\1\uffff\2\60\1\uffff\3\60\1\uffff\3\60\2\uffff\3\60\10\0\2\60\2\uffff\5\60\2\uffff\3\60\4\0\4\60\1\uffff\1\60\4\uffff\4\0\1\60\1\uffff\1\60\1\uffff\1\60\2\0\1\60\1\uffff\1\60\2\0\1\60\1\uffff\2\0\1\60\2\0\1\uffff";
    static final String DFA35_maxS =
        "\1\uffff\1\172\1\71\1\53\1\55\1\174\1\172\1\uffff\1\57\1\uffff\1\74\1\76\1\136\2\172\1\75\1\uffff\2\172\2\uffff\1\75\1\uffff\2\172\2\uffff\1\75\5\172\2\uffff\2\172\2\151\2\uffff\2\uffff\4\172\1\uffff\1\56\2\uffff\1\151\22\uffff\4\172\2\uffff\2\172\1\uff10\1\172\4\uffff\2\172\4\uffff\3\172\1\uff10\4\172\2\uffff\1\172\1\uffff\1\151\1\71\1\151\1\uffff\2\151\2\uffff\2\uffff\3\uffff\2\uffff\2\172\1\uff10\1\uffff\1\71\3\uffff\6\172\1\uffff\2\172\1\uff10\4\172\1\uffff\4\172\1\uff10\1\71\2\151\1\71\1\uffff\5\uffff\2\uffff\5\uffff\1\172\1\uff10\1\uffff\1\71\1\151\2\172\1\uff10\2\172\1\uff10\3\172\1\uff10\1\uffff\3\172\2\uff10\3\172\1\uffff\1\71\1\151\2\uffff\1\uffff\2\uffff\1\uffff\4\uffff\1\172\1\uffff\1\172\1\uff10\1\uffff\1\uff10\1\172\1\uffff\3\172\1\uffff\1\172\2\uff10\2\uffff\3\172\10\uffff\2\172\2\uffff\2\172\1\uff10\1\172\1\uff10\2\uffff\3\uff10\4\uffff\1\172\1\uff10\1\172\1\uff10\1\uffff\1\172\4\uffff\4\uffff\1\172\1\uffff\1\uff10\1\uffff\1\172\2\uffff\1\172\1\uffff\1\uff10\2\uffff\1\172\1\uffff\2\uffff\1\uff10\2\uffff\1\uffff";
    static final String DFA35_acceptS =
        "\7\uffff\1\11\1\uffff\1\13\6\uffff\1\24\2\uffff\1\27\1\30\1\uffff\1\33\2\uffff\1\37\1\40\6\uffff\1\60\1\61\6\uffff\1\102\1\103\4\uffff\1\66\1\uffff\1\75\1\64\1\uffff\1\2\1\3\1\5\1\4\1\6\1\67\1\7\1\10\1\11\1\100\1\101\1\12\1\13\1\14\1\23\1\15\1\17\1\16\4\uffff\1\22\1\24\4\uffff\1\27\1\30\1\32\1\33\2\uffff\1\37\1\40\1\41\1\42\10\uffff\1\60\1\61\1\uffff\1\70\3\uffff\1\72\4\uffff\1\74\1\77\3\uffff\1\74\1\102\3\uffff\1\71\1\uffff\1\14\1\15\1\17\6\uffff\1\50\7\uffff\1\57\11\uffff\1\76\5\uffff\1\73\1\74\7\uffff\1\55\14\uffff\1\36\10\uffff\1\63\4\uffff\1\73\2\uffff\1\73\5\uffff\1\35\2\uffff\1\21\2\uffff\1\53\3\uffff\1\34\3\uffff\1\46\1\51\15\uffff\1\47\1\31\5\uffff\1\56\1\44\13\uffff\1\26\1\uffff\1\43\1\52\1\54\1\65\5\uffff\1\20\1\uffff\1\25\4\uffff\1\45\4\uffff\1\62\5\uffff\1\1";
    static final String DFA35_specialS =
        "\1\1\46\uffff\1\37\1\43\103\uffff\1\14\1\0\2\uffff\1\55\1\13\1\12\43\uffff\1\41\1\42\1\17\1\40\1\44\2\uffff\1\7\1\11\1\2\1\5\1\15\33\uffff\1\47\1\52\1\uffff\1\46\1\45\1\uffff\1\21\1\26\1\20\1\16\24\uffff\1\50\1\53\1\32\1\22\1\23\1\27\1\6\1\3\16\uffff\1\51\1\54\1\24\1\30\12\uffff\1\25\1\56\1\4\1\31\5\uffff\1\57\1\33\3\uffff\1\60\1\34\2\uffff\1\61\1\35\1\uffff\1\36\1\10\1\uffff}>";
    static final String[] DFA35_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\17\1\50\2\52\1\11\1\14\1\47\1\23\1\24\1\7\1\3\1\26\1\4\1\2\1\10\1\46\11\45\1\33\1\20\1\12\1\25\1\13\2\52\32\44\1\41\1\52\1\42\1\6\1\44\1\52\1\44\1\35\1\16\1\15\1\37\1\1\1\36\1\44\1\22\3\44\1\43\2\44\1\21\1\44\1\34\1\40\1\27\1\44\1\30\4\44\1\31\1\5\1\32\uff82\52",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\53\15\56\1\55\5\56\1\54\5\56",
            "\1\62\1\uffff\12\63",
            "\1\65",
            "\1\67",
            "\1\71",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\75\4\uffff\1\76",
            "",
            "\1\102\16\uffff\1\101",
            "\1\103",
            "\1\71\67\uffff\1\104",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\106\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\111\6\56\1\107\6\56\1\110\13\56",
            "\1\71",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\114\31\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\116\6\56\1\115\1\117\14\56",
            "",
            "",
            "\1\71",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\124\1\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\125\31\56",
            "",
            "",
            "\1\130",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\133\3\56\1\132\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\134\10\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\135\13\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\136\16\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\140\16\56\1\141\2\56\1\137\3\56",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\144\31\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\150\1\uffff\12\146\13\uffff\1\147\37\uffff\1\147\3\uffff\1\151",
            "\1\150\1\uffff\10\152\2\153\13\uffff\1\147\37\uffff\1\147\3\uffff\1\151",
            "\12\157\1\160\34\157\1\156\31\157\32\155\1\157\1\154\4\157\32\155\uff85\157",
            "\42\157\1\163\36\157\32\161\1\157\1\162\4\157\32\161\uff85\157",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\165\16\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\166\14\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\167\10\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\57",
            "",
            "",
            "\12\63\13\uffff\1\171\37\uffff\1\171\3\uffff\1\151",
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
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\175\24\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\176\31\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\177\14\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0080\7\56",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0081\27\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0082\12\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0084\6\56",
            "",
            "",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0085\12\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0086\10\56",
            "",
            "",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0087\6\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0088\14\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0089\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u008a\6\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u008c\7\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u008d\21\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u008e\16\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u008f\10\56",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0090\12\56",
            "",
            "\1\150\1\uffff\12\146\13\uffff\1\147\37\uffff\1\147\3\uffff\1\151",
            "\1\u0091\1\uffff\1\u0091\2\uffff\12\u0092",
            "\12\u0093\13\uffff\1\u0094\37\uffff\1\u0094\3\uffff\1\151",
            "",
            "\1\150\1\uffff\10\152\2\153\13\uffff\1\147\37\uffff\1\147\3\uffff\1\151",
            "\1\150\1\uffff\12\153\13\uffff\1\147\37\uffff\1\147\3\uffff\1\151",
            "\42\157\1\u0098\4\157\1\u0098\10\157\10\u009a\35\157\1\u0097\6\157\1\u0098\4\157\2\u0098\3\157\1\u0098\7\157\1\u0098\3\157\1\u0098\1\157\1\u0098\1\u0096\1\u0098\1\157\1\u0099\uff87\157",
            "\12\157\1\160\34\157\1\u009b\31\157\32\160\6\157\32\160\uff85\157",
            "",
            "",
            "\12\157\1\160\34\157\1\156\31\157\32\160\6\157\32\160\uff85\157",
            "\42\157\1\163\36\157\32\161\1\157\1\162\4\157\32\161\uff85\157",
            "\42\157\1\u009f\4\157\1\u009f\10\157\10\u00a1\35\157\1\u009e\6\157\1\u009f\4\157\2\u009f\3\157\1\u009f\7\157\1\u009f\3\157\1\u009f\1\157\1\u009f\1\u009d\1\u009f\1\157\1\u00a0\uff87\157",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00a2\16\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00a3\27\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "\1\u00a5\1\uffff\1\u00a5\2\uffff\12\u00a6",
            "",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a7\3\56\1\u00a8\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00a9\14\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00aa\1\u00ab\6\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00ac\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u00ad\17\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00ae\13\56",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00af\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b0\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00b2\5\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00b3\23\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b4\31\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00b5\13\56",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b6\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00b7\6\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b8\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00b9\5\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\12\u0092",
            "\12\u0092\57\uffff\1\151",
            "\12\u0093\13\uffff\1\u0094\37\uffff\1\u0094\3\uffff\1\151",
            "\1\u00bb\1\uffff\1\u00bb\2\uffff\12\u00bc",
            "",
            "\60\157\12\u00bd\7\157\6\u00bd\32\157\6\u00bd\uff99\157",
            "\60\157\12\u00be\7\157\6\u00be\32\157\6\u00be\uff99\157",
            "\47\157\1\u00bf\uffd8\157",
            "\60\157\12\u00c0\7\157\6\u00c0\32\157\6\u00c0\uff99\157",
            "\60\157\10\u00c1\uffc8\157",
            "",
            "",
            "\60\157\12\u00c3\7\157\6\u00c3\32\157\6\u00c3\uff99\157",
            "\60\157\12\u00c4\7\157\6\u00c4\32\157\6\u00c4\uff99\157",
            "\42\157\1\163\36\157\32\161\1\157\1\162\4\157\32\161\uff85\157",
            "\60\157\12\u00c5\7\157\6\u00c5\32\157\6\u00c5\uff99\157",
            "\60\157\10\u00c6\uffc8\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00c7\6\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "\12\u00a6",
            "\12\u00a6\57\uffff\1\151",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00c9\5\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00ca\10\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00cc\6\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00cd\21\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00cf\31\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00d0\10\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00d1\10\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00d3\10\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d4\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u00d5\17\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00d8\27\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00d9\27\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00da\27\56",
            "",
            "\12\u00bc",
            "\12\u00bc\57\uffff\1\151",
            "\60\157\12\u00db\7\157\6\u00db\32\157\6\u00db\uff99\157",
            "\60\157\12\u00dc\7\157\6\u00dc\32\157\6\u00dc\uff99\157",
            "",
            "\60\157\12\u00dd\7\157\6\u00dd\32\157\6\u00dd\uff99\157",
            "\60\157\10\u00de\uffc8\157",
            "",
            "\60\157\12\u00df\7\157\6\u00df\32\157\6\u00df\uff99\157",
            "\60\157\12\u00e0\7\157\6\u00e0\32\157\6\u00e0\uff99\157",
            "\60\157\12\u00e1\7\157\6\u00e1\32\157\6\u00e1\uff99\157",
            "\60\157\10\u00e2\uffc8\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00e3\22\56",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00e4\16\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00e7\14\56",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00e8\23\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00e9\6\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u00ea\24\56",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00eb\14\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00ee\22\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ef\6\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00f0\6\56",
            "\60\157\12\u00f1\7\157\6\u00f1\32\157\6\u00f1\uff99\157",
            "\60\157\12\u00f2\7\157\6\u00f2\32\157\6\u00f2\uff99\157",
            "\47\157\1\u00bf\uffd8\157",
            "\47\157\1\u00bf\uffd8\157",
            "\60\157\12\u00f3\7\157\6\u00f3\32\157\6\u00f3\uff99\157",
            "\60\157\12\u00f4\7\157\6\u00f4\32\157\6\u00f4\uff99\157",
            "\42\157\1\163\36\157\32\161\1\157\1\162\4\157\32\161\uff85\157",
            "\42\157\1\163\36\157\32\161\1\157\1\162\4\157\32\161\uff85\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00f5\10\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00f6\6\56",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00f7\5\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f8\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00fa\31\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\60\157\12\u00ff\7\157\6\u00ff\32\157\6\u00ff\uff99\157",
            "\60\157\12\u0100\7\157\6\u0100\32\157\6\u0100\uff99\157",
            "\60\157\12\u0101\7\157\6\u0101\32\157\6\u0101\uff99\157",
            "\60\157\12\u0102\7\157\6\u0102\32\157\6\u0102\uff99\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0103\13\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0105\25\56",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0107\27\56",
            "",
            "",
            "",
            "",
            "\47\157\1\u00bf\uffd8\157",
            "\60\157\12\u0108\7\157\6\u0108\32\157\6\u0108\uff99\157",
            "\42\157\1\163\36\157\32\161\1\157\1\162\4\157\32\161\uff85\157",
            "\60\157\12\u0109\7\157\6\u0109\32\157\6\u0109\uff99\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u010a\5\56",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u010c\25\56",
            "\60\157\12\u010d\7\157\6\u010d\32\157\6\u010d\uff99\157",
            "\60\157\12\u010e\7\157\6\u010e\32\157\6\u010e\uff99\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u010f\23\56",
            "",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\60\157\12\u0111\7\157\6\u0111\32\157\6\u0111\uff99\157",
            "\60\157\12\u0112\7\157\6\u0112\32\157\6\u0112\uff99\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u0113\22\56",
            "",
            "\60\157\12\u0114\7\157\6\u0114\32\157\6\u0114\uff99\157",
            "\60\157\12\u0115\7\157\6\u0115\32\157\6\u0115\uff99\157",
            "\1\60\11\61\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\u05e5\uffff\1\57\u008f\uffff\1\57\u0275\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u0080\uffff\1\57\176\uffff\1\57\177\uffff\1\57\177\uffff\1\57\u00e9\uffff\1\57\177\uffff\1\57\117\uffff\1\57\u011f\uffff\1\57\u0328\uffff\1\57\u0476\uffff\1\57\57\uffff\1\57\ue6ff\uffff\1\57",
            "\47\157\1\u00bf\uffd8\157",
            "\42\157\1\163\36\157\32\161\1\157\1\162\4\157\32\161\uff85\157",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_109 = input.LA(1);

                        s = -1;
                        if ( (LA35_109=='\'') ) {s = 155;}

                        else if ( (LA35_109=='\n'||(LA35_109>='A' && LA35_109<='Z')||(LA35_109>='a' && LA35_109<='z')) ) {s = 112;}

                        else if ( ((LA35_109>='\u0000' && LA35_109<='\t')||(LA35_109>='\u000B' && LA35_109<='&')||(LA35_109>='(' && LA35_109<='@')||(LA35_109>='[' && LA35_109<='`')||(LA35_109>='{' && LA35_109<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_0 = input.LA(1);

                        s = -1;
                        if ( (LA35_0=='f') ) {s = 1;}

                        else if ( (LA35_0=='.') ) {s = 2;}

                        else if ( (LA35_0=='+') ) {s = 3;}

                        else if ( (LA35_0=='-') ) {s = 4;}

                        else if ( (LA35_0=='|') ) {s = 5;}

                        else if ( (LA35_0=='^') ) {s = 6;}

                        else if ( (LA35_0=='*') ) {s = 7;}

                        else if ( (LA35_0=='/') ) {s = 8;}

                        else if ( (LA35_0=='%') ) {s = 9;}

                        else if ( (LA35_0=='<') ) {s = 10;}

                        else if ( (LA35_0=='>') ) {s = 11;}

                        else if ( (LA35_0=='&') ) {s = 12;}

                        else if ( (LA35_0=='d') ) {s = 13;}

                        else if ( (LA35_0=='c') ) {s = 14;}

                        else if ( (LA35_0=='!') ) {s = 15;}

                        else if ( (LA35_0==';') ) {s = 16;}

                        else if ( (LA35_0=='p') ) {s = 17;}

                        else if ( (LA35_0=='i') ) {s = 18;}

                        else if ( (LA35_0=='(') ) {s = 19;}

                        else if ( (LA35_0==')') ) {s = 20;}

                        else if ( (LA35_0=='=') ) {s = 21;}

                        else if ( (LA35_0==',') ) {s = 22;}

                        else if ( (LA35_0=='t') ) {s = 23;}

                        else if ( (LA35_0=='v') ) {s = 24;}

                        else if ( (LA35_0=='{') ) {s = 25;}

                        else if ( (LA35_0=='}') ) {s = 26;}

                        else if ( (LA35_0==':') ) {s = 27;}

                        else if ( (LA35_0=='r') ) {s = 28;}

                        else if ( (LA35_0=='b') ) {s = 29;}

                        else if ( (LA35_0=='g') ) {s = 30;}

                        else if ( (LA35_0=='e') ) {s = 31;}

                        else if ( (LA35_0=='s') ) {s = 32;}

                        else if ( (LA35_0=='[') ) {s = 33;}

                        else if ( (LA35_0==']') ) {s = 34;}

                        else if ( (LA35_0=='m') ) {s = 35;}

                        else if ( ((LA35_0>='A' && LA35_0<='Z')||LA35_0=='_'||LA35_0=='a'||LA35_0=='h'||(LA35_0>='j' && LA35_0<='l')||(LA35_0>='n' && LA35_0<='o')||LA35_0=='q'||LA35_0=='u'||(LA35_0>='w' && LA35_0<='z')) ) {s = 36;}

                        else if ( ((LA35_0>='1' && LA35_0<='9')) ) {s = 37;}

                        else if ( (LA35_0=='0') ) {s = 38;}

                        else if ( (LA35_0=='\'') ) {s = 39;}

                        else if ( (LA35_0=='\"') ) {s = 40;}

                        else if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {s = 41;}

                        else if ( ((LA35_0>='\u0000' && LA35_0<='\b')||(LA35_0>='\u000B' && LA35_0<='\f')||(LA35_0>='\u000E' && LA35_0<='\u001F')||(LA35_0>='#' && LA35_0<='$')||(LA35_0>='?' && LA35_0<='@')||LA35_0=='\\'||LA35_0=='`'||(LA35_0>='~' && LA35_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_159 = input.LA(1);

                        s = -1;
                        if ( (LA35_159=='\"') ) {s = 115;}

                        else if ( ((LA35_159>='A' && LA35_159<='Z')||(LA35_159>='a' && LA35_159<='z')) ) {s = 113;}

                        else if ( (LA35_159=='\\') ) {s = 114;}

                        else if ( ((LA35_159>='\u0000' && LA35_159<='!')||(LA35_159>='#' && LA35_159<='@')||LA35_159=='['||(LA35_159>=']' && LA35_159<='`')||(LA35_159>='{' && LA35_159<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_226 = input.LA(1);

                        s = -1;
                        if ( (LA35_226=='\"') ) {s = 115;}

                        else if ( (LA35_226=='\\') ) {s = 114;}

                        else if ( ((LA35_226>='A' && LA35_226<='Z')||(LA35_226>='a' && LA35_226<='z')) ) {s = 113;}

                        else if ( ((LA35_226>='\u0000' && LA35_226<='!')||(LA35_226>='#' && LA35_226<='@')||LA35_226=='['||(LA35_226>=']' && LA35_226<='`')||(LA35_226>='{' && LA35_226<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_257 = input.LA(1);

                        s = -1;
                        if ( (LA35_257=='\"') ) {s = 115;}

                        else if ( ((LA35_257>='A' && LA35_257<='Z')||(LA35_257>='a' && LA35_257<='z')) ) {s = 113;}

                        else if ( (LA35_257=='\\') ) {s = 114;}

                        else if ( ((LA35_257>='\u0000' && LA35_257<='!')||(LA35_257>='#' && LA35_257<='@')||LA35_257=='['||(LA35_257>=']' && LA35_257<='`')||(LA35_257>='{' && LA35_257<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_160 = input.LA(1);

                        s = -1;
                        if ( ((LA35_160>='\u0000' && LA35_160<='/')||(LA35_160>=':' && LA35_160<='@')||(LA35_160>='G' && LA35_160<='`')||(LA35_160>='g' && LA35_160<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_160>='0' && LA35_160<='9')||(LA35_160>='A' && LA35_160<='F')||(LA35_160>='a' && LA35_160<='f')) ) {s = 197;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_225 = input.LA(1);

                        s = -1;
                        if ( (LA35_225=='\"') ) {s = 115;}

                        else if ( (LA35_225=='\\') ) {s = 114;}

                        else if ( ((LA35_225>='A' && LA35_225<='Z')||(LA35_225>='a' && LA35_225<='z')) ) {s = 113;}

                        else if ( ((LA35_225>='\u0000' && LA35_225<='!')||(LA35_225>='#' && LA35_225<='@')||LA35_225=='['||(LA35_225>=']' && LA35_225<='`')||(LA35_225>='{' && LA35_225<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_157 = input.LA(1);

                        s = -1;
                        if ( ((LA35_157>='\u0000' && LA35_157<='/')||(LA35_157>=':' && LA35_157<='@')||(LA35_157>='G' && LA35_157<='`')||(LA35_157>='g' && LA35_157<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_157>='0' && LA35_157<='9')||(LA35_157>='A' && LA35_157<='F')||(LA35_157>='a' && LA35_157<='f')) ) {s = 195;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA35_277 = input.LA(1);

                        s = -1;
                        if ( (LA35_277=='\"') ) {s = 115;}

                        else if ( (LA35_277=='\\') ) {s = 114;}

                        else if ( ((LA35_277>='A' && LA35_277<='Z')||(LA35_277>='a' && LA35_277<='z')) ) {s = 113;}

                        else if ( ((LA35_277>='\u0000' && LA35_277<='!')||(LA35_277>='#' && LA35_277<='@')||LA35_277=='['||(LA35_277>=']' && LA35_277<='`')||(LA35_277>='{' && LA35_277<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA35_158 = input.LA(1);

                        s = -1;
                        if ( ((LA35_158>='\u0000' && LA35_158<='/')||(LA35_158>=':' && LA35_158<='@')||(LA35_158>='G' && LA35_158<='`')||(LA35_158>='g' && LA35_158<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_158>='0' && LA35_158<='9')||(LA35_158>='A' && LA35_158<='F')||(LA35_158>='a' && LA35_158<='f')) ) {s = 196;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA35_114 = input.LA(1);

                        s = -1;
                        if ( (LA35_114=='u') ) {s = 157;}

                        else if ( (LA35_114=='U') ) {s = 158;}

                        else if ( (LA35_114=='\"'||LA35_114=='\''||LA35_114=='\\'||(LA35_114>='a' && LA35_114<='b')||LA35_114=='f'||LA35_114=='n'||LA35_114=='r'||LA35_114=='t'||LA35_114=='v') ) {s = 159;}

                        else if ( (LA35_114=='x') ) {s = 160;}

                        else if ( ((LA35_114>='0' && LA35_114<='7')) ) {s = 161;}

                        else if ( ((LA35_114>='\u0000' && LA35_114<='!')||(LA35_114>='#' && LA35_114<='&')||(LA35_114>='(' && LA35_114<='/')||(LA35_114>='8' && LA35_114<='T')||(LA35_114>='V' && LA35_114<='[')||(LA35_114>=']' && LA35_114<='`')||(LA35_114>='c' && LA35_114<='e')||(LA35_114>='g' && LA35_114<='m')||(LA35_114>='o' && LA35_114<='q')||LA35_114=='s'||LA35_114=='w'||(LA35_114>='y' && LA35_114<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA35_113 = input.LA(1);

                        s = -1;
                        if ( (LA35_113=='\"') ) {s = 115;}

                        else if ( ((LA35_113>='A' && LA35_113<='Z')||(LA35_113>='a' && LA35_113<='z')) ) {s = 113;}

                        else if ( (LA35_113=='\\') ) {s = 114;}

                        else if ( ((LA35_113>='\u0000' && LA35_113<='!')||(LA35_113>='#' && LA35_113<='@')||LA35_113=='['||(LA35_113>=']' && LA35_113<='`')||(LA35_113>='{' && LA35_113<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA35_108 = input.LA(1);

                        s = -1;
                        if ( (LA35_108=='u') ) {s = 150;}

                        else if ( (LA35_108=='U') ) {s = 151;}

                        else if ( (LA35_108=='\"'||LA35_108=='\''||LA35_108=='\\'||(LA35_108>='a' && LA35_108<='b')||LA35_108=='f'||LA35_108=='n'||LA35_108=='r'||LA35_108=='t'||LA35_108=='v') ) {s = 152;}

                        else if ( (LA35_108=='x') ) {s = 153;}

                        else if ( ((LA35_108>='0' && LA35_108<='7')) ) {s = 154;}

                        else if ( ((LA35_108>='\u0000' && LA35_108<='!')||(LA35_108>='#' && LA35_108<='&')||(LA35_108>='(' && LA35_108<='/')||(LA35_108>='8' && LA35_108<='T')||(LA35_108>='V' && LA35_108<='[')||(LA35_108>=']' && LA35_108<='`')||(LA35_108>='c' && LA35_108<='e')||(LA35_108>='g' && LA35_108<='m')||(LA35_108>='o' && LA35_108<='q')||LA35_108=='s'||LA35_108=='w'||(LA35_108>='y' && LA35_108<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA35_161 = input.LA(1);

                        s = -1;
                        if ( ((LA35_161>='\u0000' && LA35_161<='/')||(LA35_161>='8' && LA35_161<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_161>='0' && LA35_161<='7')) ) {s = 198;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA35_198 = input.LA(1);

                        s = -1;
                        if ( ((LA35_198>='\u0000' && LA35_198<='/')||(LA35_198>='8' && LA35_198<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_198>='0' && LA35_198<='7')) ) {s = 226;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA35_152 = input.LA(1);

                        s = -1;
                        if ( (LA35_152=='\'') ) {s = 191;}

                        else if ( ((LA35_152>='\u0000' && LA35_152<='&')||(LA35_152>='(' && LA35_152<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA35_197 = input.LA(1);

                        s = -1;
                        if ( ((LA35_197>='0' && LA35_197<='9')||(LA35_197>='A' && LA35_197<='F')||(LA35_197>='a' && LA35_197<='f')) ) {s = 225;}

                        else if ( ((LA35_197>='\u0000' && LA35_197<='/')||(LA35_197>=':' && LA35_197<='@')||(LA35_197>='G' && LA35_197<='`')||(LA35_197>='g' && LA35_197<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA35_195 = input.LA(1);

                        s = -1;
                        if ( ((LA35_195>='\u0000' && LA35_195<='/')||(LA35_195>=':' && LA35_195<='@')||(LA35_195>='G' && LA35_195<='`')||(LA35_195>='g' && LA35_195<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_195>='0' && LA35_195<='9')||(LA35_195>='A' && LA35_195<='F')||(LA35_195>='a' && LA35_195<='f')) ) {s = 223;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA35_222 = input.LA(1);

                        s = -1;
                        if ( (LA35_222=='\'') ) {s = 191;}

                        else if ( ((LA35_222>='\u0000' && LA35_222<='&')||(LA35_222>='(' && LA35_222<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA35_223 = input.LA(1);

                        s = -1;
                        if ( ((LA35_223>='\u0000' && LA35_223<='/')||(LA35_223>=':' && LA35_223<='@')||(LA35_223>='G' && LA35_223<='`')||(LA35_223>='g' && LA35_223<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_223>='0' && LA35_223<='9')||(LA35_223>='A' && LA35_223<='F')||(LA35_223>='a' && LA35_223<='f')) ) {s = 243;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA35_243 = input.LA(1);

                        s = -1;
                        if ( ((LA35_243>='0' && LA35_243<='9')||(LA35_243>='A' && LA35_243<='F')||(LA35_243>='a' && LA35_243<='f')) ) {s = 257;}

                        else if ( ((LA35_243>='\u0000' && LA35_243<='/')||(LA35_243>=':' && LA35_243<='@')||(LA35_243>='G' && LA35_243<='`')||(LA35_243>='g' && LA35_243<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA35_255 = input.LA(1);

                        s = -1;
                        if ( (LA35_255=='\'') ) {s = 191;}

                        else if ( ((LA35_255>='\u0000' && LA35_255<='&')||(LA35_255>='(' && LA35_255<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA35_196 = input.LA(1);

                        s = -1;
                        if ( ((LA35_196>='\u0000' && LA35_196<='/')||(LA35_196>=':' && LA35_196<='@')||(LA35_196>='G' && LA35_196<='`')||(LA35_196>='g' && LA35_196<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_196>='0' && LA35_196<='9')||(LA35_196>='A' && LA35_196<='F')||(LA35_196>='a' && LA35_196<='f')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA35_224 = input.LA(1);

                        s = -1;
                        if ( ((LA35_224>='\u0000' && LA35_224<='/')||(LA35_224>=':' && LA35_224<='@')||(LA35_224>='G' && LA35_224<='`')||(LA35_224>='g' && LA35_224<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_224>='0' && LA35_224<='9')||(LA35_224>='A' && LA35_224<='F')||(LA35_224>='a' && LA35_224<='f')) ) {s = 244;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA35_244 = input.LA(1);

                        s = -1;
                        if ( ((LA35_244>='\u0000' && LA35_244<='/')||(LA35_244>=':' && LA35_244<='@')||(LA35_244>='G' && LA35_244<='`')||(LA35_244>='g' && LA35_244<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_244>='0' && LA35_244<='9')||(LA35_244>='A' && LA35_244<='F')||(LA35_244>='a' && LA35_244<='f')) ) {s = 258;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA35_258 = input.LA(1);

                        s = -1;
                        if ( ((LA35_258>='0' && LA35_258<='9')||(LA35_258>='A' && LA35_258<='F')||(LA35_258>='a' && LA35_258<='f')) ) {s = 265;}

                        else if ( ((LA35_258>='\u0000' && LA35_258<='/')||(LA35_258>=':' && LA35_258<='@')||(LA35_258>='G' && LA35_258<='`')||(LA35_258>='g' && LA35_258<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA35_221 = input.LA(1);

                        s = -1;
                        if ( (LA35_221=='\'') ) {s = 191;}

                        else if ( ((LA35_221>='\u0000' && LA35_221<='&')||(LA35_221>='(' && LA35_221<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA35_265 = input.LA(1);

                        s = -1;
                        if ( ((LA35_265>='0' && LA35_265<='9')||(LA35_265>='A' && LA35_265<='F')||(LA35_265>='a' && LA35_265<='f')) ) {s = 270;}

                        else if ( ((LA35_265>='\u0000' && LA35_265<='/')||(LA35_265>=':' && LA35_265<='@')||(LA35_265>='G' && LA35_265<='`')||(LA35_265>='g' && LA35_265<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA35_270 = input.LA(1);

                        s = -1;
                        if ( ((LA35_270>='0' && LA35_270<='9')||(LA35_270>='A' && LA35_270<='F')||(LA35_270>='a' && LA35_270<='f')) ) {s = 274;}

                        else if ( ((LA35_270>='\u0000' && LA35_270<='/')||(LA35_270>=':' && LA35_270<='@')||(LA35_270>='G' && LA35_270<='`')||(LA35_270>='g' && LA35_270<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA35_274 = input.LA(1);

                        s = -1;
                        if ( ((LA35_274>='\u0000' && LA35_274<='/')||(LA35_274>=':' && LA35_274<='@')||(LA35_274>='G' && LA35_274<='`')||(LA35_274>='g' && LA35_274<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_274>='0' && LA35_274<='9')||(LA35_274>='A' && LA35_274<='F')||(LA35_274>='a' && LA35_274<='f')) ) {s = 277;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA35_276 = input.LA(1);

                        s = -1;
                        if ( (LA35_276=='\'') ) {s = 191;}

                        else if ( ((LA35_276>='\u0000' && LA35_276<='&')||(LA35_276>='(' && LA35_276<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA35_39 = input.LA(1);

                        s = -1;
                        if ( (LA35_39=='\\') ) {s = 108;}

                        else if ( ((LA35_39>='A' && LA35_39<='Z')||(LA35_39>='a' && LA35_39<='z')) ) {s = 109;}

                        else if ( (LA35_39=='\'') ) {s = 110;}

                        else if ( ((LA35_39>='\u0000' && LA35_39<='\t')||(LA35_39>='\u000B' && LA35_39<='&')||(LA35_39>='(' && LA35_39<='@')||LA35_39=='['||(LA35_39>=']' && LA35_39<='`')||(LA35_39>='{' && LA35_39<='\uFFFF')) ) {s = 111;}

                        else if ( (LA35_39=='\n') ) {s = 112;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA35_153 = input.LA(1);

                        s = -1;
                        if ( ((LA35_153>='\u0000' && LA35_153<='/')||(LA35_153>=':' && LA35_153<='@')||(LA35_153>='G' && LA35_153<='`')||(LA35_153>='g' && LA35_153<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_153>='0' && LA35_153<='9')||(LA35_153>='A' && LA35_153<='F')||(LA35_153>='a' && LA35_153<='f')) ) {s = 192;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA35_150 = input.LA(1);

                        s = -1;
                        if ( ((LA35_150>='\u0000' && LA35_150<='/')||(LA35_150>=':' && LA35_150<='@')||(LA35_150>='G' && LA35_150<='`')||(LA35_150>='g' && LA35_150<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_150>='0' && LA35_150<='9')||(LA35_150>='A' && LA35_150<='F')||(LA35_150>='a' && LA35_150<='f')) ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA35_151 = input.LA(1);

                        s = -1;
                        if ( ((LA35_151>='\u0000' && LA35_151<='/')||(LA35_151>=':' && LA35_151<='@')||(LA35_151>='G' && LA35_151<='`')||(LA35_151>='g' && LA35_151<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_151>='0' && LA35_151<='9')||(LA35_151>='A' && LA35_151<='F')||(LA35_151>='a' && LA35_151<='f')) ) {s = 190;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA35_40 = input.LA(1);

                        s = -1;
                        if ( ((LA35_40>='A' && LA35_40<='Z')||(LA35_40>='a' && LA35_40<='z')) ) {s = 113;}

                        else if ( (LA35_40=='\\') ) {s = 114;}

                        else if ( (LA35_40=='\"') ) {s = 115;}

                        else if ( ((LA35_40>='\u0000' && LA35_40<='!')||(LA35_40>='#' && LA35_40<='@')||LA35_40=='['||(LA35_40>=']' && LA35_40<='`')||(LA35_40>='{' && LA35_40<='\uFFFF')) ) {s = 111;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA35_154 = input.LA(1);

                        s = -1;
                        if ( ((LA35_154>='0' && LA35_154<='7')) ) {s = 193;}

                        else if ( ((LA35_154>='\u0000' && LA35_154<='/')||(LA35_154>='8' && LA35_154<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA35_193 = input.LA(1);

                        s = -1;
                        if ( ((LA35_193>='0' && LA35_193<='7')) ) {s = 222;}

                        else if ( ((LA35_193>='\u0000' && LA35_193<='/')||(LA35_193>='8' && LA35_193<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA35_192 = input.LA(1);

                        s = -1;
                        if ( ((LA35_192>='0' && LA35_192<='9')||(LA35_192>='A' && LA35_192<='F')||(LA35_192>='a' && LA35_192<='f')) ) {s = 221;}

                        else if ( ((LA35_192>='\u0000' && LA35_192<='/')||(LA35_192>=':' && LA35_192<='@')||(LA35_192>='G' && LA35_192<='`')||(LA35_192>='g' && LA35_192<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA35_189 = input.LA(1);

                        s = -1;
                        if ( ((LA35_189>='0' && LA35_189<='9')||(LA35_189>='A' && LA35_189<='F')||(LA35_189>='a' && LA35_189<='f')) ) {s = 219;}

                        else if ( ((LA35_189>='\u0000' && LA35_189<='/')||(LA35_189>=':' && LA35_189<='@')||(LA35_189>='G' && LA35_189<='`')||(LA35_189>='g' && LA35_189<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA35_219 = input.LA(1);

                        s = -1;
                        if ( ((LA35_219>='\u0000' && LA35_219<='/')||(LA35_219>=':' && LA35_219<='@')||(LA35_219>='G' && LA35_219<='`')||(LA35_219>='g' && LA35_219<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_219>='0' && LA35_219<='9')||(LA35_219>='A' && LA35_219<='F')||(LA35_219>='a' && LA35_219<='f')) ) {s = 241;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA35_241 = input.LA(1);

                        s = -1;
                        if ( ((LA35_241>='\u0000' && LA35_241<='/')||(LA35_241>=':' && LA35_241<='@')||(LA35_241>='G' && LA35_241<='`')||(LA35_241>='g' && LA35_241<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_241>='0' && LA35_241<='9')||(LA35_241>='A' && LA35_241<='F')||(LA35_241>='a' && LA35_241<='f')) ) {s = 255;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA35_190 = input.LA(1);

                        s = -1;
                        if ( ((LA35_190>='0' && LA35_190<='9')||(LA35_190>='A' && LA35_190<='F')||(LA35_190>='a' && LA35_190<='f')) ) {s = 220;}

                        else if ( ((LA35_190>='\u0000' && LA35_190<='/')||(LA35_190>=':' && LA35_190<='@')||(LA35_190>='G' && LA35_190<='`')||(LA35_190>='g' && LA35_190<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA35_220 = input.LA(1);

                        s = -1;
                        if ( ((LA35_220>='0' && LA35_220<='9')||(LA35_220>='A' && LA35_220<='F')||(LA35_220>='a' && LA35_220<='f')) ) {s = 242;}

                        else if ( ((LA35_220>='\u0000' && LA35_220<='/')||(LA35_220>=':' && LA35_220<='@')||(LA35_220>='G' && LA35_220<='`')||(LA35_220>='g' && LA35_220<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA35_242 = input.LA(1);

                        s = -1;
                        if ( ((LA35_242>='\u0000' && LA35_242<='/')||(LA35_242>=':' && LA35_242<='@')||(LA35_242>='G' && LA35_242<='`')||(LA35_242>='g' && LA35_242<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_242>='0' && LA35_242<='9')||(LA35_242>='A' && LA35_242<='F')||(LA35_242>='a' && LA35_242<='f')) ) {s = 256;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA35_112 = input.LA(1);

                        s = -1;
                        if ( (LA35_112=='\'') ) {s = 110;}

                        else if ( (LA35_112=='\n'||(LA35_112>='A' && LA35_112<='Z')||(LA35_112>='a' && LA35_112<='z')) ) {s = 112;}

                        else if ( ((LA35_112>='\u0000' && LA35_112<='\t')||(LA35_112>='\u000B' && LA35_112<='&')||(LA35_112>='(' && LA35_112<='@')||(LA35_112>='[' && LA35_112<='`')||(LA35_112>='{' && LA35_112<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA35_256 = input.LA(1);

                        s = -1;
                        if ( ((LA35_256>='\u0000' && LA35_256<='/')||(LA35_256>=':' && LA35_256<='@')||(LA35_256>='G' && LA35_256<='`')||(LA35_256>='g' && LA35_256<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_256>='0' && LA35_256<='9')||(LA35_256>='A' && LA35_256<='F')||(LA35_256>='a' && LA35_256<='f')) ) {s = 264;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA35_264 = input.LA(1);

                        s = -1;
                        if ( ((LA35_264>='\u0000' && LA35_264<='/')||(LA35_264>=':' && LA35_264<='@')||(LA35_264>='G' && LA35_264<='`')||(LA35_264>='g' && LA35_264<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA35_264>='0' && LA35_264<='9')||(LA35_264>='A' && LA35_264<='F')||(LA35_264>='a' && LA35_264<='f')) ) {s = 269;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA35_269 = input.LA(1);

                        s = -1;
                        if ( ((LA35_269>='0' && LA35_269<='9')||(LA35_269>='A' && LA35_269<='F')||(LA35_269>='a' && LA35_269<='f')) ) {s = 273;}

                        else if ( ((LA35_269>='\u0000' && LA35_269<='/')||(LA35_269>=':' && LA35_269<='@')||(LA35_269>='G' && LA35_269<='`')||(LA35_269>='g' && LA35_269<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA35_273 = input.LA(1);

                        s = -1;
                        if ( ((LA35_273>='0' && LA35_273<='9')||(LA35_273>='A' && LA35_273<='F')||(LA35_273>='a' && LA35_273<='f')) ) {s = 276;}

                        else if ( ((LA35_273>='\u0000' && LA35_273<='/')||(LA35_273>=':' && LA35_273<='@')||(LA35_273>='G' && LA35_273<='`')||(LA35_273>='g' && LA35_273<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}