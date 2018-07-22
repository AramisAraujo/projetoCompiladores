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
    public static final int RULE_RUNE_LIT=9;
    public static final int RULE_DECIMAL_LIT=18;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BINARY_OP=10;
    public static final int T__95=95;
    public static final int RULE_IMAGINARY_LIT=8;
    public static final int RULE_STRING_LIT=4;
    public static final int RULE_INTERPRETED_STRING_LIT=34;
    public static final int RULE_UNICODE_VALUE=25;
    public static final int RULE_LITTLE_U_VALUE=28;
    public static final int RULE_HEX_BYTE_VALUE=32;
    public static final int RULE_OCTAL_BYTE_VALUE=31;
    public static final int RULE_MUL_OP=16;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=5;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=42;
    public static final int RULE_OCTAL_LIT=19;
    public static final int RULE_FLOAT_LIT=7;
    public static final int RULE_INT_LIT=6;
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

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( ';' )
            // InternalGo.g:11:9: ';'
            {
            match(';'); 

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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:30:7: ( 'package' )
            // InternalGo.g:30:9: 'package'
            {
            match("package"); 


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
            // InternalGo.g:31:7: ( 'import' )
            // InternalGo.g:31:9: 'import'
            {
            match("import"); 


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
            // InternalGo.g:32:7: ( '(' )
            // InternalGo.g:32:9: '('
            {
            match('('); 

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
            // InternalGo.g:33:7: ( ')' )
            // InternalGo.g:33:9: ')'
            {
            match(')'); 

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
            // InternalGo.g:34:7: ( 'const' )
            // InternalGo.g:34:9: 'const'
            {
            match("const"); 


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
            // InternalGo.g:35:7: ( '=' )
            // InternalGo.g:35:9: '='
            {
            match('='); 

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
            // InternalGo.g:36:7: ( ',' )
            // InternalGo.g:36:9: ','
            {
            match(','); 

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
            // InternalGo.g:37:7: ( 'type' )
            // InternalGo.g:37:9: 'type'
            {
            match("type"); 


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
            // InternalGo.g:38:7: ( 'func' )
            // InternalGo.g:38:9: 'func'
            {
            match("func"); 


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
            // InternalGo.g:39:7: ( 'var' )
            // InternalGo.g:39:9: 'var'
            {
            match("var"); 


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
            // InternalGo.g:40:7: ( '{' )
            // InternalGo.g:40:9: '{'
            {
            match('{'); 

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
            // InternalGo.g:41:7: ( '}' )
            // InternalGo.g:41:9: '}'
            {
            match('}'); 

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
            // InternalGo.g:42:7: ( ':=' )
            // InternalGo.g:42:9: ':='
            {
            match(":="); 


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
            // InternalGo.g:43:7: ( ':' )
            // InternalGo.g:43:9: ':'
            {
            match(':'); 

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
            // InternalGo.g:44:7: ( 'return' )
            // InternalGo.g:44:9: 'return'
            {
            match("return"); 


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
            // InternalGo.g:45:7: ( 'break' )
            // InternalGo.g:45:9: 'break'
            {
            match("break"); 


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
            // InternalGo.g:46:7: ( 'continue' )
            // InternalGo.g:46:9: 'continue'
            {
            match("continue"); 


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
            // InternalGo.g:47:7: ( 'goto' )
            // InternalGo.g:47:9: 'goto'
            {
            match("goto"); 


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
            // InternalGo.g:48:7: ( 'defer' )
            // InternalGo.g:48:9: 'defer'
            {
            match("defer"); 


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
            // InternalGo.g:49:7: ( 'if' )
            // InternalGo.g:49:9: 'if'
            {
            match("if"); 


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
            // InternalGo.g:50:7: ( 'else' )
            // InternalGo.g:50:9: 'else'
            {
            match("else"); 


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
            // InternalGo.g:51:7: ( 'switch' )
            // InternalGo.g:51:9: 'switch'
            {
            match("switch"); 


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
            // InternalGo.g:52:7: ( 'case' )
            // InternalGo.g:52:9: 'case'
            {
            match("case"); 


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
            // InternalGo.g:53:7: ( 'select' )
            // InternalGo.g:53:9: 'select'
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
            // InternalGo.g:54:7: ( 'for' )
            // InternalGo.g:54:9: 'for'
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
            // InternalGo.g:55:7: ( 'range' )
            // InternalGo.g:55:9: 'range'
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
            // InternalGo.g:56:7: ( 'go' )
            // InternalGo.g:56:9: 'go'
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
            // InternalGo.g:57:7: ( '[' )
            // InternalGo.g:57:9: '['
            {
            match('['); 

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
            // InternalGo.g:58:7: ( ']' )
            // InternalGo.g:58:9: ']'
            {
            match(']'); 

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
            // InternalGo.g:59:7: ( 'interface' )
            // InternalGo.g:59:9: 'interface'
            {
            match("interface"); 


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
            // InternalGo.g:60:7: ( 'map' )
            // InternalGo.g:60:9: 'map'
            {
            match("map"); 


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
            // InternalGo.g:61:7: ( '...' )
            // InternalGo.g:61:9: '...'
            {
            match("..."); 


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
            // InternalGo.g:62:7: ( 'struct' )
            // InternalGo.g:62:9: 'struct'
            {
            match("struct"); 


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
            // InternalGo.g:63:7: ( 'fallthrough' )
            // InternalGo.g:63:9: 'fallthrough'
            {
            match("fallthrough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16591:17: ( RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:16591:19: RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalGo.g:16591:31: ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
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
            // InternalGo.g:16593:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:16593:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:16593:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGo.g:16593:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:16593:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:16593:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16593:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:16593:53: RULE_MUL_OP
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
            // InternalGo.g:16595:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:16595:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:16595:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
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
                    // InternalGo.g:16595:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:16595:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:16595:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16595:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:16595:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:16595:48: '>='
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
            // InternalGo.g:16597:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:16597:24: ( '+' | '-' | '|' | '^' )
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
            // InternalGo.g:16599:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:16599:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:16599:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
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
                    // InternalGo.g:16599:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16599:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16599:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16599:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:16599:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:16599:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:16599:51: '&^'
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
            // InternalGo.g:16601:24: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:16601:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:16601:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
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
                    // InternalGo.g:16601:27: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16601:31: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16601:35: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16601:39: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:16601:43: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:16601:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:16601:51: '<-'
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
            // InternalGo.g:16603:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:16603:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:16603:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
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
                    // InternalGo.g:16603:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16603:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16603:49: RULE_HEX_LIT
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
            // InternalGo.g:16605:27: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:16605:29: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
            {
            matchRange('1','9'); 
            // InternalGo.g:16605:38: ( RULE_DECIMAL_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:16605:38: RULE_DECIMAL_DIGIT
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
            // InternalGo.g:16607:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:16607:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:16607:31: ( RULE_OCTAL_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:16607:31: RULE_OCTAL_DIGIT
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
            // InternalGo.g:16609:23: ( '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:16609:25: '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:16609:39: ( RULE_HEX_DIGIT )+
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
            	    // InternalGo.g:16609:39: RULE_HEX_DIGIT
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
            // InternalGo.g:16611:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalGo.g:16611:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalGo.g:16611:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalGo.g:16611:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalGo.g:16611:37: ( RULE_DECIMALS )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:16611:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalGo.g:16611:52: ( RULE_EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGo.g:16611:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:16611:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16611:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:16611:113: ( RULE_EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:16611:113: RULE_EXPONENT
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
            // InternalGo.g:16613:24: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:16613:26: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:16613:26: ( RULE_DECIMAL_DIGIT )+
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
            	    // InternalGo.g:16613:26: RULE_DECIMAL_DIGIT
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
            // InternalGo.g:16615:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:16615:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:16615:36: ( '+' | '-' )?
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
            // InternalGo.g:16617:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalGo.g:16617:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalGo.g:16617:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalGo.g:16617:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16617:37: RULE_FLOAT_LIT
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
            // InternalGo.g:16619:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalGo.g:16619:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalGo.g:16619:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
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
                    // InternalGo.g:16619:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16619:42: RULE_BYTE_VALUE
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
            // InternalGo.g:16621:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:16621:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:16621:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
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
                    // InternalGo.g:16621:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16621:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:16621:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:16621:87: RULE_ESCAPED_CHAR
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
            // InternalGo.g:16623:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:16623:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:16623:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
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
                    // InternalGo.g:16623:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16623:51: RULE_HEX_BYTE_VALUE
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
            // InternalGo.g:16625:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:16625:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalGo.g:16627:30: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:16627:32: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:16629:30: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:16629:32: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:16631:27: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:16631:29: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:16633:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:16633:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalGo.g:16635:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalGo.g:16635:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalGo.g:16635:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
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
                    // InternalGo.g:16635:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:16635:40: RULE_INTERPRETED_STRING_LIT
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
            // InternalGo.g:16637:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalGo.g:16637:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalGo.g:16637:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
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
            // InternalGo.g:16639:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalGo.g:16639:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalGo.g:16639:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
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
            	    // InternalGo.g:16639:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:16639:64: RULE_BYTE_VALUE
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
            // InternalGo.g:16641:22: ( ( RULE_UNICODE_LETTER | '_' ) )
            // InternalGo.g:16641:24: ( RULE_UNICODE_LETTER | '_' )
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
            // InternalGo.g:16643:29: ( '0' .. '9' )
            // InternalGo.g:16643:31: '0' .. '9'
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
            // InternalGo.g:16645:27: ( '0' .. '7' )
            // InternalGo.g:16645:29: '0' .. '7'
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
            // InternalGo.g:16647:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalGo.g:16647:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalGo.g:16649:23: ( '\\n' )
            // InternalGo.g:16649:25: '\\n'
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
            // InternalGo.g:16651:28: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:16651:30: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // InternalGo.g:16653:30: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:16653:32: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // InternalGo.g:16655:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:16655:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:16655:11: ( '^' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='^') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:16655:11: '^'
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

            // InternalGo.g:16655:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalGo.g:16657:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:16657:12: ( '0' .. '9' )+
            {
            // InternalGo.g:16657:12: ( '0' .. '9' )+
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
            	    // InternalGo.g:16657:13: '0' .. '9'
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
            // InternalGo.g:16659:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:16659:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:16659:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGo.g:16659:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:16659:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGo.g:16659:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:16659:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGo.g:16659:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:16659:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGo.g:16659:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:16659:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGo.g:16661:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:16661:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:16661:24: ( options {greedy=false; } : . )*
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
            	    // InternalGo.g:16661:52: .
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
            // InternalGo.g:16663:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:16663:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:16663:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:16663:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGo.g:16663:40: ( ( '\\r' )? '\\n' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\n'||LA32_0=='\r') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:16663:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:16663:41: ( '\\r' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\r') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGo.g:16663:41: '\\r'
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
            // InternalGo.g:16665:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:16665:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:16665:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalGo.g:16667:16: ( . )
            // InternalGo.g:16667:18: .
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
        // InternalGo.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt34=67;
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
            return "16593:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
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
            return "16611:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
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
            return "16617:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA34_eotS =
        "\2\uffff\1\56\1\60\1\62\1\64\1\65\1\uffff\1\72\1\uffff\2\63\1\100\2\102\1\107\2\102\2\uffff\1\116\1\uffff\3\102\2\uffff\1\130\5\102\2\uffff\2\102\2\144\2\52\4\uffff\1\164\23\uffff\1\102\1\uffff\4\102\1\uffff\2\102\1\177\1\102\4\uffff\5\102\4\uffff\3\102\1\u008a\4\102\2\uffff\1\102\2\uffff\1\144\1\164\1\uffff\1\144\1\u0094\16\uffff\6\102\1\uffff\3\102\1\u00ae\1\102\1\u00b0\4\102\1\uffff\4\102\1\u00b9\1\uffff\2\164\17\uffff\1\164\2\102\1\u00c8\2\102\1\u00cb\3\102\1\u00cf\1\u00d0\1\uffff\1\102\1\uffff\3\102\1\u00d5\1\u00d6\3\102\2\uffff\1\164\12\uffff\1\102\1\u00e3\1\uffff\1\u00e4\1\102\1\uffff\3\102\2\uffff\2\102\1\u00eb\1\u00ec\2\uffff\3\102\10\uffff\1\102\2\uffff\2\102\1\u00f7\2\102\1\u00fa\2\uffff\1\u00fb\1\u00fc\1\u00fd\4\uffff\1\u0102\1\102\1\u0104\1\uffff\2\102\11\uffff\1\u0109\1\uffff\2\102\3\uffff\1\u010e\1\102\3\uffff\1\102\2\uffff\1\u0115\3\uffff";
    static final String DFA34_eofS =
        "\u0116\uffff";
    static final String DFA34_minS =
        "\1\0\1\uffff\1\56\1\53\1\55\1\174\1\101\1\uffff\1\52\1\uffff\1\55\1\76\1\46\2\60\1\75\2\60\2\uffff\1\75\1\uffff\3\60\2\uffff\1\75\5\60\2\uffff\2\60\2\56\2\0\4\uffff\1\60\23\uffff\1\60\1\uffff\4\60\1\uffff\4\60\4\uffff\5\60\4\uffff\10\60\2\uffff\1\60\1\uffff\1\53\1\56\1\60\1\uffff\2\56\3\0\2\uffff\2\0\3\uffff\1\53\3\uffff\6\60\1\uffff\12\60\1\uffff\10\60\1\53\2\uffff\5\0\1\uffff\5\0\15\60\1\uffff\1\60\1\uffff\10\60\1\uffff\2\60\1\uffff\2\0\1\uffff\6\0\2\60\1\uffff\2\60\1\uffff\3\60\2\uffff\4\60\2\uffff\3\60\10\0\1\60\2\uffff\6\60\2\uffff\3\60\4\0\3\60\1\uffff\2\60\4\uffff\4\0\1\uffff\1\60\1\uffff\2\60\2\0\1\uffff\2\60\2\0\1\uffff\1\60\2\0\1\60\2\0\1\uffff";
    static final String DFA34_maxS =
        "\1\uffff\1\uffff\1\71\1\53\1\55\1\174\1\172\1\uffff\1\57\1\uffff\1\74\1\76\1\136\2\172\1\75\2\172\2\uffff\1\75\1\uffff\3\172\2\uffff\1\75\5\172\2\uffff\2\172\2\151\2\uffff\4\uffff\1\151\23\uffff\1\172\1\uffff\4\172\1\uffff\4\172\4\uffff\5\172\4\uffff\10\172\2\uffff\1\172\1\uffff\1\71\2\151\1\uffff\2\151\3\uffff\2\uffff\2\uffff\3\uffff\1\71\3\uffff\6\172\1\uffff\12\172\1\uffff\5\172\1\71\2\151\1\71\2\uffff\5\uffff\1\uffff\5\uffff\1\71\1\151\13\172\1\uffff\1\172\1\uffff\10\172\1\uffff\1\71\1\151\1\uffff\2\uffff\1\uffff\6\uffff\2\172\1\uffff\2\172\1\uffff\3\172\2\uffff\4\172\2\uffff\3\172\10\uffff\1\172\2\uffff\6\172\2\uffff\3\172\4\uffff\3\172\1\uffff\2\172\4\uffff\4\uffff\1\uffff\1\172\1\uffff\2\172\2\uffff\1\uffff\2\172\2\uffff\1\uffff\1\172\2\uffff\1\172\2\uffff\1\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\5\uffff\1\11\1\uffff\1\13\10\uffff\1\26\1\27\1\uffff\1\32\3\uffff\1\36\1\37\6\uffff\1\57\1\60\6\uffff\1\102\1\103\1\1\1\63\1\uffff\1\2\1\3\1\5\1\4\1\6\1\67\1\7\1\10\1\75\1\11\1\100\1\101\1\12\1\13\1\14\1\23\1\15\1\17\1\16\1\uffff\1\66\4\uffff\1\22\4\uffff\1\26\1\27\1\31\1\32\5\uffff\1\36\1\37\1\40\1\41\10\uffff\1\57\1\60\1\uffff\1\70\3\uffff\1\72\5\uffff\1\74\1\77\2\uffff\1\74\1\102\1\71\1\uffff\1\14\1\15\1\17\6\uffff\1\47\12\uffff\1\56\11\uffff\1\76\1\73\5\uffff\1\74\22\uffff\1\54\1\uffff\1\35\10\uffff\1\62\2\uffff\1\73\2\uffff\1\73\10\uffff\1\21\2\uffff\1\52\3\uffff\1\33\1\34\4\uffff\1\45\1\50\14\uffff\1\46\1\30\6\uffff\1\55\1\43\12\uffff\1\25\2\uffff\1\42\1\51\1\53\1\64\4\uffff\1\20\1\uffff\1\24\4\uffff\1\44\4\uffff\1\61\6\uffff\1\65";
    static final String DFA34_specialS =
        "\1\25\46\uffff\1\35\1\55\102\uffff\1\17\1\16\1\10\2\uffff\1\26\1\15\44\uffff\1\57\1\60\1\33\1\56\1\61\1\uffff\1\30\1\31\1\20\1\27\1\32\34\uffff\1\2\1\5\1\uffff\1\1\1\0\1\40\1\44\1\36\1\34\24\uffff\1\3\1\6\1\46\1\37\1\42\1\45\1\23\1\21\16\uffff\1\4\1\7\1\43\1\47\12\uffff\1\41\1\11\1\22\1\50\5\uffff\1\12\1\51\3\uffff\1\13\1\52\2\uffff\1\14\1\53\1\uffff\1\54\1\24\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\17\1\50\2\52\1\11\1\14\1\47\1\22\1\23\1\7\1\3\1\25\1\4\1\2\1\10\1\46\11\45\1\33\1\1\1\12\1\24\1\13\2\52\32\44\1\41\1\52\1\42\1\6\1\44\1\52\1\44\1\35\1\16\1\15\1\37\1\27\1\36\1\44\1\21\3\44\1\43\2\44\1\20\1\44\1\34\1\40\1\26\1\44\1\30\4\44\1\31\1\5\1\32\uff82\52",
            "",
            "\1\54\1\uffff\12\55",
            "\1\57",
            "\1\61",
            "\1\63",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\70\4\uffff\1\71",
            "",
            "\1\75\16\uffff\1\74",
            "\1\76",
            "\1\63\67\uffff\1\77",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\101\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\106\6\103\1\104\6\103\1\105\13\103",
            "\1\63",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\110\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\5\103\1\112\6\103\1\111\1\113\14\103",
            "",
            "",
            "\1\63",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\30\103\1\120\1\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\123\15\103\1\122\5\103\1\121\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\124\31\103",
            "",
            "",
            "\1\127",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\132\3\103\1\131\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\133\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\134\13\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\135\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\137\16\103\1\140\2\103\1\136\3\103",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\143\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\147\1\uffff\12\146\13\uffff\1\145\37\uffff\1\145\3\uffff\1\150",
            "\1\147\1\uffff\10\151\2\152\13\uffff\1\145\37\uffff\1\145\3\uffff\1\150",
            "\12\157\1\155\34\157\1\156\31\157\32\153\1\157\1\154\4\157\32\153\uff85\157",
            "\42\157\1\162\36\157\32\160\1\157\1\161\4\157\32\160\uff85\157",
            "",
            "",
            "",
            "",
            "\12\55\13\uffff\1\165\37\uffff\1\165\3\uffff\1\150",
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
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\5\103\1\171\24\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\172\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\173\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\22\103\1\174\7\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\175\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\17\103\1\176\12\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u0080\6\103",
            "",
            "",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\17\103\1\u0081\12\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u0082\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u0083\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\u0084\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u0085\10\103",
            "",
            "",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u0086\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u0087\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u0088\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u0089\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\22\103\1\u008b\7\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\10\103\1\u008c\21\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\u008d\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u008e\10\103",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\17\103\1\u008f\12\103",
            "",
            "\1\u0090\1\uffff\1\u0090\2\uffff\12\u0091",
            "\1\147\1\uffff\12\146\13\uffff\1\145\37\uffff\1\145\3\uffff\1\150",
            "\12\u0092\13\uffff\1\u0093\37\uffff\1\u0093\3\uffff\1\150",
            "",
            "\1\147\1\uffff\10\151\2\152\13\uffff\1\145\37\uffff\1\145\3\uffff\1\150",
            "\1\147\1\uffff\12\152\13\uffff\1\145\37\uffff\1\145\3\uffff\1\150",
            "\12\157\1\155\34\157\1\u0095\31\157\32\155\6\157\32\155\uff85\157",
            "\42\157\1\u0098\4\157\1\u0098\10\157\10\u009a\35\157\1\u0097\6\157\1\u0098\4\157\2\u0098\3\157\1\u0098\7\157\1\u0098\3\157\1\u0098\1\157\1\u0098\1\u0096\1\u0098\1\157\1\u0099\uff87\157",
            "\12\157\1\155\34\157\1\156\31\157\32\155\6\157\32\155\uff85\157",
            "",
            "",
            "\42\157\1\162\36\157\32\160\1\157\1\161\4\157\32\160\uff85\157",
            "\42\157\1\u009e\4\157\1\u009e\10\157\10\u00a0\35\157\1\u009d\6\157\1\u009e\4\157\2\u009e\3\157\1\u009e\7\157\1\u009e\3\157\1\u009e\1\157\1\u009e\1\u009c\1\u009e\1\157\1\u009f\uff87\157",
            "",
            "",
            "",
            "\1\u00a1\1\uffff\1\u00a1\2\uffff\12\u00a2",
            "",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u00a3\3\103\1\u00a4\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u00a5\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\22\103\1\u00a6\1\u00a7\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00a8\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\12\103\1\u00a9\17\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\u00aa\13\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00ab\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00ac\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00ad\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\u00af\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u00b1\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\6\103\1\u00b2\23\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u00b3\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\u00b4\13\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00b5\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00b6\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00b7\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u00b8\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\u0091",
            "\12\u0091\57\uffff\1\150",
            "\12\u0092\13\uffff\1\u0093\37\uffff\1\u0093\3\uffff\1\150",
            "\1\u00ba\1\uffff\1\u00ba\2\uffff\12\u00bb",
            "",
            "",
            "\60\157\12\u00bd\7\157\6\u00bd\32\157\6\u00bd\uff99\157",
            "\60\157\12\u00be\7\157\6\u00be\32\157\6\u00be\uff99\157",
            "\47\157\1\u00bf\uffd8\157",
            "\60\157\12\u00c0\7\157\6\u00c0\32\157\6\u00c0\uff99\157",
            "\60\157\10\u00c1\uffc8\157",
            "",
            "\60\157\12\u00c2\7\157\6\u00c2\32\157\6\u00c2\uff99\157",
            "\60\157\12\u00c3\7\157\6\u00c3\32\157\6\u00c3\uff99\157",
            "\42\157\1\162\36\157\32\160\1\157\1\161\4\157\32\160\uff85\157",
            "\60\157\12\u00c4\7\157\6\u00c4\32\157\6\u00c4\uff99\157",
            "\60\157\10\u00c5\uffc8\157",
            "\12\u00a2",
            "\12\u00a2\57\uffff\1\150",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u00c6\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00c7\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00c9\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\10\103\1\u00ca\21\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u00cc\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00cd\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00ce\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00d1\6\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00d2\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00d3\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\12\103\1\u00d4\17\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00d7\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00d8\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00d9\27\103",
            "",
            "\12\u00bb",
            "\12\u00bb\57\uffff\1\150",
            "",
            "\60\157\12\u00da\7\157\6\u00da\32\157\6\u00da\uff99\157",
            "\60\157\12\u00db\7\157\6\u00db\32\157\6\u00db\uff99\157",
            "",
            "\60\157\12\u00dc\7\157\6\u00dc\32\157\6\u00dc\uff99\157",
            "\60\157\10\u00dd\uffc8\157",
            "\60\157\12\u00de\7\157\6\u00de\32\157\6\u00de\uff99\157",
            "\60\157\12\u00df\7\157\6\u00df\32\157\6\u00df\uff99\157",
            "\60\157\12\u00e0\7\157\6\u00e0\32\157\6\u00e0\uff99\157",
            "\60\157\10\u00e1\uffc8\157",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\u00e2\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u00e5\14\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\6\103\1\u00e6\23\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00e7\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\5\103\1\u00e8\24\103",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\7\103\1\u00e9\22\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u00ea\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\7\103\1\u00ed\22\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00ee\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00ef\6\103",
            "\60\157\12\u00f0\7\157\6\u00f0\32\157\6\u00f0\uff99\157",
            "\60\157\12\u00f1\7\157\6\u00f1\32\157\6\u00f1\uff99\157",
            "\47\157\1\u00bf\uffd8\157",
            "\47\157\1\u00bf\uffd8\157",
            "\60\157\12\u00f2\7\157\6\u00f2\32\157\6\u00f2\uff99\157",
            "\60\157\12\u00f3\7\157\6\u00f3\32\157\6\u00f3\uff99\157",
            "\42\157\1\162\36\157\32\160\1\157\1\161\4\157\32\160\uff85\157",
            "\42\157\1\162\36\157\32\160\1\157\1\161\4\157\32\160\uff85\157",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00f4\6\103",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u00f5\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00f6\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u00f8\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00f9\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\60\157\12\u00fe\7\157\6\u00fe\32\157\6\u00fe\uff99\157",
            "\60\157\12\u00ff\7\157\6\u00ff\32\157\6\u00ff\uff99\157",
            "\60\157\12\u0100\7\157\6\u0100\32\157\6\u0100\uff99\157",
            "\60\157\12\u0101\7\157\6\u0101\32\157\6\u0101\uff99\157",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u0103\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u0105\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\u0106\13\103",
            "",
            "",
            "",
            "",
            "\47\157\1\u00bf\uffd8\157",
            "\60\157\12\u0107\7\157\6\u0107\32\157\6\u0107\uff99\157",
            "\42\157\1\162\36\157\32\160\1\157\1\161\4\157\32\160\uff85\157",
            "\60\157\12\u0108\7\157\6\u0108\32\157\6\u0108\uff99\157",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u010a\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u010b\5\103",
            "\60\157\12\u010c\7\157\6\u010c\32\157\6\u010c\uff99\157",
            "\60\157\12\u010d\7\157\6\u010d\32\157\6\u010d\uff99\157",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\6\103\1\u010f\23\103",
            "\60\157\12\u0110\7\157\6\u0110\32\157\6\u0110\uff99\157",
            "\60\157\12\u0111\7\157\6\u0111\32\157\6\u0111\uff99\157",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\7\103\1\u0112\22\103",
            "\60\157\12\u0113\7\157\6\u0113\32\157\6\u0113\uff99\157",
            "\60\157\12\u0114\7\157\6\u0114\32\157\6\u0114\uff99\157",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\47\157\1\u00bf\uffd8\157",
            "\42\157\1\162\36\157\32\160\1\157\1\161\4\157\32\160\uff85\157",
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
            return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_193 = input.LA(1);

                        s = -1;
                        if ( ((LA34_193>='0' && LA34_193<='7')) ) {s = 221;}

                        else if ( ((LA34_193>='\u0000' && LA34_193<='/')||(LA34_193>='8' && LA34_193<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_192 = input.LA(1);

                        s = -1;
                        if ( ((LA34_192>='\u0000' && LA34_192<='/')||(LA34_192>=':' && LA34_192<='@')||(LA34_192>='G' && LA34_192<='`')||(LA34_192>='g' && LA34_192<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_192>='0' && LA34_192<='9')||(LA34_192>='A' && LA34_192<='F')||(LA34_192>='a' && LA34_192<='f')) ) {s = 220;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_189 = input.LA(1);

                        s = -1;
                        if ( ((LA34_189>='\u0000' && LA34_189<='/')||(LA34_189>=':' && LA34_189<='@')||(LA34_189>='G' && LA34_189<='`')||(LA34_189>='g' && LA34_189<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_189>='0' && LA34_189<='9')||(LA34_189>='A' && LA34_189<='F')||(LA34_189>='a' && LA34_189<='f')) ) {s = 218;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_218 = input.LA(1);

                        s = -1;
                        if ( ((LA34_218>='\u0000' && LA34_218<='/')||(LA34_218>=':' && LA34_218<='@')||(LA34_218>='G' && LA34_218<='`')||(LA34_218>='g' && LA34_218<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_218>='0' && LA34_218<='9')||(LA34_218>='A' && LA34_218<='F')||(LA34_218>='a' && LA34_218<='f')) ) {s = 240;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_240 = input.LA(1);

                        s = -1;
                        if ( ((LA34_240>='\u0000' && LA34_240<='/')||(LA34_240>=':' && LA34_240<='@')||(LA34_240>='G' && LA34_240<='`')||(LA34_240>='g' && LA34_240<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_240>='0' && LA34_240<='9')||(LA34_240>='A' && LA34_240<='F')||(LA34_240>='a' && LA34_240<='f')) ) {s = 254;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_190 = input.LA(1);

                        s = -1;
                        if ( ((LA34_190>='\u0000' && LA34_190<='/')||(LA34_190>=':' && LA34_190<='@')||(LA34_190>='G' && LA34_190<='`')||(LA34_190>='g' && LA34_190<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_190>='0' && LA34_190<='9')||(LA34_190>='A' && LA34_190<='F')||(LA34_190>='a' && LA34_190<='f')) ) {s = 219;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_219 = input.LA(1);

                        s = -1;
                        if ( ((LA34_219>='\u0000' && LA34_219<='/')||(LA34_219>=':' && LA34_219<='@')||(LA34_219>='G' && LA34_219<='`')||(LA34_219>='g' && LA34_219<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_219>='0' && LA34_219<='9')||(LA34_219>='A' && LA34_219<='F')||(LA34_219>='a' && LA34_219<='f')) ) {s = 241;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_241 = input.LA(1);

                        s = -1;
                        if ( ((LA34_241>='\u0000' && LA34_241<='/')||(LA34_241>=':' && LA34_241<='@')||(LA34_241>='G' && LA34_241<='`')||(LA34_241>='g' && LA34_241<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_241>='0' && LA34_241<='9')||(LA34_241>='A' && LA34_241<='F')||(LA34_241>='a' && LA34_241<='f')) ) {s = 255;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_109 = input.LA(1);

                        s = -1;
                        if ( (LA34_109=='\'') ) {s = 110;}

                        else if ( ((LA34_109>='\u0000' && LA34_109<='\t')||(LA34_109>='\u000B' && LA34_109<='&')||(LA34_109>='(' && LA34_109<='@')||(LA34_109>='[' && LA34_109<='`')||(LA34_109>='{' && LA34_109<='\uFFFF')) ) {s = 111;}

                        else if ( (LA34_109=='\n'||(LA34_109>='A' && LA34_109<='Z')||(LA34_109>='a' && LA34_109<='z')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_255 = input.LA(1);

                        s = -1;
                        if ( ((LA34_255>='\u0000' && LA34_255<='/')||(LA34_255>=':' && LA34_255<='@')||(LA34_255>='G' && LA34_255<='`')||(LA34_255>='g' && LA34_255<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_255>='0' && LA34_255<='9')||(LA34_255>='A' && LA34_255<='F')||(LA34_255>='a' && LA34_255<='f')) ) {s = 263;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_263 = input.LA(1);

                        s = -1;
                        if ( ((LA34_263>='\u0000' && LA34_263<='/')||(LA34_263>=':' && LA34_263<='@')||(LA34_263>='G' && LA34_263<='`')||(LA34_263>='g' && LA34_263<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_263>='0' && LA34_263<='9')||(LA34_263>='A' && LA34_263<='F')||(LA34_263>='a' && LA34_263<='f')) ) {s = 268;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_268 = input.LA(1);

                        s = -1;
                        if ( ((LA34_268>='\u0000' && LA34_268<='/')||(LA34_268>=':' && LA34_268<='@')||(LA34_268>='G' && LA34_268<='`')||(LA34_268>='g' && LA34_268<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_268>='0' && LA34_268<='9')||(LA34_268>='A' && LA34_268<='F')||(LA34_268>='a' && LA34_268<='f')) ) {s = 272;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_272 = input.LA(1);

                        s = -1;
                        if ( ((LA34_272>='\u0000' && LA34_272<='/')||(LA34_272>=':' && LA34_272<='@')||(LA34_272>='G' && LA34_272<='`')||(LA34_272>='g' && LA34_272<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_272>='0' && LA34_272<='9')||(LA34_272>='A' && LA34_272<='F')||(LA34_272>='a' && LA34_272<='f')) ) {s = 275;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_113 = input.LA(1);

                        s = -1;
                        if ( (LA34_113=='u') ) {s = 156;}

                        else if ( (LA34_113=='U') ) {s = 157;}

                        else if ( (LA34_113=='\"'||LA34_113=='\''||LA34_113=='\\'||(LA34_113>='a' && LA34_113<='b')||LA34_113=='f'||LA34_113=='n'||LA34_113=='r'||LA34_113=='t'||LA34_113=='v') ) {s = 158;}

                        else if ( (LA34_113=='x') ) {s = 159;}

                        else if ( ((LA34_113>='0' && LA34_113<='7')) ) {s = 160;}

                        else if ( ((LA34_113>='\u0000' && LA34_113<='!')||(LA34_113>='#' && LA34_113<='&')||(LA34_113>='(' && LA34_113<='/')||(LA34_113>='8' && LA34_113<='T')||(LA34_113>='V' && LA34_113<='[')||(LA34_113>=']' && LA34_113<='`')||(LA34_113>='c' && LA34_113<='e')||(LA34_113>='g' && LA34_113<='m')||(LA34_113>='o' && LA34_113<='q')||LA34_113=='s'||LA34_113=='w'||(LA34_113>='y' && LA34_113<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_108 = input.LA(1);

                        s = -1;
                        if ( (LA34_108=='u') ) {s = 150;}

                        else if ( (LA34_108=='U') ) {s = 151;}

                        else if ( (LA34_108=='\"'||LA34_108=='\''||LA34_108=='\\'||(LA34_108>='a' && LA34_108<='b')||LA34_108=='f'||LA34_108=='n'||LA34_108=='r'||LA34_108=='t'||LA34_108=='v') ) {s = 152;}

                        else if ( (LA34_108=='x') ) {s = 153;}

                        else if ( ((LA34_108>='0' && LA34_108<='7')) ) {s = 154;}

                        else if ( ((LA34_108>='\u0000' && LA34_108<='!')||(LA34_108>='#' && LA34_108<='&')||(LA34_108>='(' && LA34_108<='/')||(LA34_108>='8' && LA34_108<='T')||(LA34_108>='V' && LA34_108<='[')||(LA34_108>=']' && LA34_108<='`')||(LA34_108>='c' && LA34_108<='e')||(LA34_108>='g' && LA34_108<='m')||(LA34_108>='o' && LA34_108<='q')||LA34_108=='s'||LA34_108=='w'||(LA34_108>='y' && LA34_108<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_107 = input.LA(1);

                        s = -1;
                        if ( (LA34_107=='\'') ) {s = 149;}

                        else if ( ((LA34_107>='\u0000' && LA34_107<='\t')||(LA34_107>='\u000B' && LA34_107<='&')||(LA34_107>='(' && LA34_107<='@')||(LA34_107>='[' && LA34_107<='`')||(LA34_107>='{' && LA34_107<='\uFFFF')) ) {s = 111;}

                        else if ( (LA34_107=='\n'||(LA34_107>='A' && LA34_107<='Z')||(LA34_107>='a' && LA34_107<='z')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_158 = input.LA(1);

                        s = -1;
                        if ( (LA34_158=='\"') ) {s = 114;}

                        else if ( (LA34_158=='\\') ) {s = 113;}

                        else if ( ((LA34_158>='A' && LA34_158<='Z')||(LA34_158>='a' && LA34_158<='z')) ) {s = 112;}

                        else if ( ((LA34_158>='\u0000' && LA34_158<='!')||(LA34_158>='#' && LA34_158<='@')||LA34_158=='['||(LA34_158>=']' && LA34_158<='`')||(LA34_158>='{' && LA34_158<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA34_225 = input.LA(1);

                        s = -1;
                        if ( (LA34_225=='\"') ) {s = 114;}

                        else if ( ((LA34_225>='A' && LA34_225<='Z')||(LA34_225>='a' && LA34_225<='z')) ) {s = 112;}

                        else if ( (LA34_225=='\\') ) {s = 113;}

                        else if ( ((LA34_225>='\u0000' && LA34_225<='!')||(LA34_225>='#' && LA34_225<='@')||LA34_225=='['||(LA34_225>=']' && LA34_225<='`')||(LA34_225>='{' && LA34_225<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA34_256 = input.LA(1);

                        s = -1;
                        if ( (LA34_256=='\"') ) {s = 114;}

                        else if ( ((LA34_256>='A' && LA34_256<='Z')||(LA34_256>='a' && LA34_256<='z')) ) {s = 112;}

                        else if ( (LA34_256=='\\') ) {s = 113;}

                        else if ( ((LA34_256>='\u0000' && LA34_256<='!')||(LA34_256>='#' && LA34_256<='@')||LA34_256=='['||(LA34_256>=']' && LA34_256<='`')||(LA34_256>='{' && LA34_256<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA34_224 = input.LA(1);

                        s = -1;
                        if ( (LA34_224=='\"') ) {s = 114;}

                        else if ( ((LA34_224>='A' && LA34_224<='Z')||(LA34_224>='a' && LA34_224<='z')) ) {s = 112;}

                        else if ( (LA34_224=='\\') ) {s = 113;}

                        else if ( ((LA34_224>='\u0000' && LA34_224<='!')||(LA34_224>='#' && LA34_224<='@')||LA34_224=='['||(LA34_224>=']' && LA34_224<='`')||(LA34_224>='{' && LA34_224<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA34_276 = input.LA(1);

                        s = -1;
                        if ( (LA34_276=='\"') ) {s = 114;}

                        else if ( ((LA34_276>='A' && LA34_276<='Z')||(LA34_276>='a' && LA34_276<='z')) ) {s = 112;}

                        else if ( (LA34_276=='\\') ) {s = 113;}

                        else if ( ((LA34_276>='\u0000' && LA34_276<='!')||(LA34_276>='#' && LA34_276<='@')||LA34_276=='['||(LA34_276>=']' && LA34_276<='`')||(LA34_276>='{' && LA34_276<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA34_0 = input.LA(1);

                        s = -1;
                        if ( (LA34_0==';') ) {s = 1;}

                        else if ( (LA34_0=='.') ) {s = 2;}

                        else if ( (LA34_0=='+') ) {s = 3;}

                        else if ( (LA34_0=='-') ) {s = 4;}

                        else if ( (LA34_0=='|') ) {s = 5;}

                        else if ( (LA34_0=='^') ) {s = 6;}

                        else if ( (LA34_0=='*') ) {s = 7;}

                        else if ( (LA34_0=='/') ) {s = 8;}

                        else if ( (LA34_0=='%') ) {s = 9;}

                        else if ( (LA34_0=='<') ) {s = 10;}

                        else if ( (LA34_0=='>') ) {s = 11;}

                        else if ( (LA34_0=='&') ) {s = 12;}

                        else if ( (LA34_0=='d') ) {s = 13;}

                        else if ( (LA34_0=='c') ) {s = 14;}

                        else if ( (LA34_0=='!') ) {s = 15;}

                        else if ( (LA34_0=='p') ) {s = 16;}

                        else if ( (LA34_0=='i') ) {s = 17;}

                        else if ( (LA34_0=='(') ) {s = 18;}

                        else if ( (LA34_0==')') ) {s = 19;}

                        else if ( (LA34_0=='=') ) {s = 20;}

                        else if ( (LA34_0==',') ) {s = 21;}

                        else if ( (LA34_0=='t') ) {s = 22;}

                        else if ( (LA34_0=='f') ) {s = 23;}

                        else if ( (LA34_0=='v') ) {s = 24;}

                        else if ( (LA34_0=='{') ) {s = 25;}

                        else if ( (LA34_0=='}') ) {s = 26;}

                        else if ( (LA34_0==':') ) {s = 27;}

                        else if ( (LA34_0=='r') ) {s = 28;}

                        else if ( (LA34_0=='b') ) {s = 29;}

                        else if ( (LA34_0=='g') ) {s = 30;}

                        else if ( (LA34_0=='e') ) {s = 31;}

                        else if ( (LA34_0=='s') ) {s = 32;}

                        else if ( (LA34_0=='[') ) {s = 33;}

                        else if ( (LA34_0==']') ) {s = 34;}

                        else if ( (LA34_0=='m') ) {s = 35;}

                        else if ( ((LA34_0>='A' && LA34_0<='Z')||LA34_0=='_'||LA34_0=='a'||LA34_0=='h'||(LA34_0>='j' && LA34_0<='l')||(LA34_0>='n' && LA34_0<='o')||LA34_0=='q'||LA34_0=='u'||(LA34_0>='w' && LA34_0<='z')) ) {s = 36;}

                        else if ( ((LA34_0>='1' && LA34_0<='9')) ) {s = 37;}

                        else if ( (LA34_0=='0') ) {s = 38;}

                        else if ( (LA34_0=='\'') ) {s = 39;}

                        else if ( (LA34_0=='\"') ) {s = 40;}

                        else if ( ((LA34_0>='\t' && LA34_0<='\n')||LA34_0=='\r'||LA34_0==' ') ) {s = 41;}

                        else if ( ((LA34_0>='\u0000' && LA34_0<='\b')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\u001F')||(LA34_0>='#' && LA34_0<='$')||(LA34_0>='?' && LA34_0<='@')||LA34_0=='\\'||LA34_0=='`'||(LA34_0>='~' && LA34_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA34_112 = input.LA(1);

                        s = -1;
                        if ( (LA34_112=='\"') ) {s = 114;}

                        else if ( ((LA34_112>='A' && LA34_112<='Z')||(LA34_112>='a' && LA34_112<='z')) ) {s = 112;}

                        else if ( (LA34_112=='\\') ) {s = 113;}

                        else if ( ((LA34_112>='\u0000' && LA34_112<='!')||(LA34_112>='#' && LA34_112<='@')||LA34_112=='['||(LA34_112>=']' && LA34_112<='`')||(LA34_112>='{' && LA34_112<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA34_159 = input.LA(1);

                        s = -1;
                        if ( ((LA34_159>='\u0000' && LA34_159<='/')||(LA34_159>=':' && LA34_159<='@')||(LA34_159>='G' && LA34_159<='`')||(LA34_159>='g' && LA34_159<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_159>='0' && LA34_159<='9')||(LA34_159>='A' && LA34_159<='F')||(LA34_159>='a' && LA34_159<='f')) ) {s = 196;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA34_156 = input.LA(1);

                        s = -1;
                        if ( ((LA34_156>='0' && LA34_156<='9')||(LA34_156>='A' && LA34_156<='F')||(LA34_156>='a' && LA34_156<='f')) ) {s = 194;}

                        else if ( ((LA34_156>='\u0000' && LA34_156<='/')||(LA34_156>=':' && LA34_156<='@')||(LA34_156>='G' && LA34_156<='`')||(LA34_156>='g' && LA34_156<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA34_157 = input.LA(1);

                        s = -1;
                        if ( ((LA34_157>='0' && LA34_157<='9')||(LA34_157>='A' && LA34_157<='F')||(LA34_157>='a' && LA34_157<='f')) ) {s = 195;}

                        else if ( ((LA34_157>='\u0000' && LA34_157<='/')||(LA34_157>=':' && LA34_157<='@')||(LA34_157>='G' && LA34_157<='`')||(LA34_157>='g' && LA34_157<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA34_160 = input.LA(1);

                        s = -1;
                        if ( ((LA34_160>='0' && LA34_160<='7')) ) {s = 197;}

                        else if ( ((LA34_160>='\u0000' && LA34_160<='/')||(LA34_160>='8' && LA34_160<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA34_152 = input.LA(1);

                        s = -1;
                        if ( (LA34_152=='\'') ) {s = 191;}

                        else if ( ((LA34_152>='\u0000' && LA34_152<='&')||(LA34_152>='(' && LA34_152<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA34_197 = input.LA(1);

                        s = -1;
                        if ( ((LA34_197>='0' && LA34_197<='7')) ) {s = 225;}

                        else if ( ((LA34_197>='\u0000' && LA34_197<='/')||(LA34_197>='8' && LA34_197<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA34_39 = input.LA(1);

                        s = -1;
                        if ( ((LA34_39>='A' && LA34_39<='Z')||(LA34_39>='a' && LA34_39<='z')) ) {s = 107;}

                        else if ( (LA34_39=='\\') ) {s = 108;}

                        else if ( (LA34_39=='\n') ) {s = 109;}

                        else if ( (LA34_39=='\'') ) {s = 110;}

                        else if ( ((LA34_39>='\u0000' && LA34_39<='\t')||(LA34_39>='\u000B' && LA34_39<='&')||(LA34_39>='(' && LA34_39<='@')||LA34_39=='['||(LA34_39>=']' && LA34_39<='`')||(LA34_39>='{' && LA34_39<='\uFFFF')) ) {s = 111;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA34_196 = input.LA(1);

                        s = -1;
                        if ( ((LA34_196>='\u0000' && LA34_196<='/')||(LA34_196>=':' && LA34_196<='@')||(LA34_196>='G' && LA34_196<='`')||(LA34_196>='g' && LA34_196<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_196>='0' && LA34_196<='9')||(LA34_196>='A' && LA34_196<='F')||(LA34_196>='a' && LA34_196<='f')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA34_221 = input.LA(1);

                        s = -1;
                        if ( (LA34_221=='\'') ) {s = 191;}

                        else if ( ((LA34_221>='\u0000' && LA34_221<='&')||(LA34_221>='(' && LA34_221<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA34_194 = input.LA(1);

                        s = -1;
                        if ( ((LA34_194>='0' && LA34_194<='9')||(LA34_194>='A' && LA34_194<='F')||(LA34_194>='a' && LA34_194<='f')) ) {s = 222;}

                        else if ( ((LA34_194>='\u0000' && LA34_194<='/')||(LA34_194>=':' && LA34_194<='@')||(LA34_194>='G' && LA34_194<='`')||(LA34_194>='g' && LA34_194<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA34_254 = input.LA(1);

                        s = -1;
                        if ( (LA34_254=='\'') ) {s = 191;}

                        else if ( ((LA34_254>='\u0000' && LA34_254<='&')||(LA34_254>='(' && LA34_254<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA34_222 = input.LA(1);

                        s = -1;
                        if ( ((LA34_222>='0' && LA34_222<='9')||(LA34_222>='A' && LA34_222<='F')||(LA34_222>='a' && LA34_222<='f')) ) {s = 242;}

                        else if ( ((LA34_222>='\u0000' && LA34_222<='/')||(LA34_222>=':' && LA34_222<='@')||(LA34_222>='G' && LA34_222<='`')||(LA34_222>='g' && LA34_222<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA34_242 = input.LA(1);

                        s = -1;
                        if ( ((LA34_242>='0' && LA34_242<='9')||(LA34_242>='A' && LA34_242<='F')||(LA34_242>='a' && LA34_242<='f')) ) {s = 256;}

                        else if ( ((LA34_242>='\u0000' && LA34_242<='/')||(LA34_242>=':' && LA34_242<='@')||(LA34_242>='G' && LA34_242<='`')||(LA34_242>='g' && LA34_242<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA34_195 = input.LA(1);

                        s = -1;
                        if ( ((LA34_195>='0' && LA34_195<='9')||(LA34_195>='A' && LA34_195<='F')||(LA34_195>='a' && LA34_195<='f')) ) {s = 223;}

                        else if ( ((LA34_195>='\u0000' && LA34_195<='/')||(LA34_195>=':' && LA34_195<='@')||(LA34_195>='G' && LA34_195<='`')||(LA34_195>='g' && LA34_195<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA34_223 = input.LA(1);

                        s = -1;
                        if ( ((LA34_223>='0' && LA34_223<='9')||(LA34_223>='A' && LA34_223<='F')||(LA34_223>='a' && LA34_223<='f')) ) {s = 243;}

                        else if ( ((LA34_223>='\u0000' && LA34_223<='/')||(LA34_223>=':' && LA34_223<='@')||(LA34_223>='G' && LA34_223<='`')||(LA34_223>='g' && LA34_223<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA34_220 = input.LA(1);

                        s = -1;
                        if ( (LA34_220=='\'') ) {s = 191;}

                        else if ( ((LA34_220>='\u0000' && LA34_220<='&')||(LA34_220>='(' && LA34_220<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA34_243 = input.LA(1);

                        s = -1;
                        if ( ((LA34_243>='0' && LA34_243<='9')||(LA34_243>='A' && LA34_243<='F')||(LA34_243>='a' && LA34_243<='f')) ) {s = 257;}

                        else if ( ((LA34_243>='\u0000' && LA34_243<='/')||(LA34_243>=':' && LA34_243<='@')||(LA34_243>='G' && LA34_243<='`')||(LA34_243>='g' && LA34_243<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA34_257 = input.LA(1);

                        s = -1;
                        if ( ((LA34_257>='0' && LA34_257<='9')||(LA34_257>='A' && LA34_257<='F')||(LA34_257>='a' && LA34_257<='f')) ) {s = 264;}

                        else if ( ((LA34_257>='\u0000' && LA34_257<='/')||(LA34_257>=':' && LA34_257<='@')||(LA34_257>='G' && LA34_257<='`')||(LA34_257>='g' && LA34_257<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA34_264 = input.LA(1);

                        s = -1;
                        if ( ((LA34_264>='0' && LA34_264<='9')||(LA34_264>='A' && LA34_264<='F')||(LA34_264>='a' && LA34_264<='f')) ) {s = 269;}

                        else if ( ((LA34_264>='\u0000' && LA34_264<='/')||(LA34_264>=':' && LA34_264<='@')||(LA34_264>='G' && LA34_264<='`')||(LA34_264>='g' && LA34_264<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA34_269 = input.LA(1);

                        s = -1;
                        if ( ((LA34_269>='\u0000' && LA34_269<='/')||(LA34_269>=':' && LA34_269<='@')||(LA34_269>='G' && LA34_269<='`')||(LA34_269>='g' && LA34_269<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_269>='0' && LA34_269<='9')||(LA34_269>='A' && LA34_269<='F')||(LA34_269>='a' && LA34_269<='f')) ) {s = 273;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA34_273 = input.LA(1);

                        s = -1;
                        if ( ((LA34_273>='0' && LA34_273<='9')||(LA34_273>='A' && LA34_273<='F')||(LA34_273>='a' && LA34_273<='f')) ) {s = 276;}

                        else if ( ((LA34_273>='\u0000' && LA34_273<='/')||(LA34_273>=':' && LA34_273<='@')||(LA34_273>='G' && LA34_273<='`')||(LA34_273>='g' && LA34_273<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA34_275 = input.LA(1);

                        s = -1;
                        if ( (LA34_275=='\'') ) {s = 191;}

                        else if ( ((LA34_275>='\u0000' && LA34_275<='&')||(LA34_275>='(' && LA34_275<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA34_40 = input.LA(1);

                        s = -1;
                        if ( ((LA34_40>='A' && LA34_40<='Z')||(LA34_40>='a' && LA34_40<='z')) ) {s = 112;}

                        else if ( (LA34_40=='\\') ) {s = 113;}

                        else if ( (LA34_40=='\"') ) {s = 114;}

                        else if ( ((LA34_40>='\u0000' && LA34_40<='!')||(LA34_40>='#' && LA34_40<='@')||LA34_40=='['||(LA34_40>=']' && LA34_40<='`')||(LA34_40>='{' && LA34_40<='\uFFFF')) ) {s = 111;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA34_153 = input.LA(1);

                        s = -1;
                        if ( ((LA34_153>='\u0000' && LA34_153<='/')||(LA34_153>=':' && LA34_153<='@')||(LA34_153>='G' && LA34_153<='`')||(LA34_153>='g' && LA34_153<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_153>='0' && LA34_153<='9')||(LA34_153>='A' && LA34_153<='F')||(LA34_153>='a' && LA34_153<='f')) ) {s = 192;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA34_150 = input.LA(1);

                        s = -1;
                        if ( ((LA34_150>='0' && LA34_150<='9')||(LA34_150>='A' && LA34_150<='F')||(LA34_150>='a' && LA34_150<='f')) ) {s = 189;}

                        else if ( ((LA34_150>='\u0000' && LA34_150<='/')||(LA34_150>=':' && LA34_150<='@')||(LA34_150>='G' && LA34_150<='`')||(LA34_150>='g' && LA34_150<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA34_151 = input.LA(1);

                        s = -1;
                        if ( ((LA34_151>='0' && LA34_151<='9')||(LA34_151>='A' && LA34_151<='F')||(LA34_151>='a' && LA34_151<='f')) ) {s = 190;}

                        else if ( ((LA34_151>='\u0000' && LA34_151<='/')||(LA34_151>=':' && LA34_151<='@')||(LA34_151>='G' && LA34_151<='`')||(LA34_151>='g' && LA34_151<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA34_154 = input.LA(1);

                        s = -1;
                        if ( ((LA34_154>='\u0000' && LA34_154<='/')||(LA34_154>='8' && LA34_154<='\uFFFF')) ) {s = 111;}

                        else if ( ((LA34_154>='0' && LA34_154<='7')) ) {s = 193;}

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