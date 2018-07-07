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
    public static final int RULE_DECIMAL_DIGIT=20;
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
    public static final int T__66=66;
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
    public static final int RULE_LETTER=11;
    public static final int RULE_EXPONENT=24;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=33;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=16;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=22;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RUNE_LIT=9;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_DECIMAL_LIT=17;
    public static final int RULE_LINE_COMMENT=40;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__90=90;
    public static final int RULE_BINARY_OP=10;
    public static final int RULE_IMAGINARY_LIT=8;
    public static final int RULE_STRING_LIT=4;
    public static final int RULE_INTERPRETED_STRING_LIT=34;
    public static final int RULE_UNICODE_VALUE=25;
    public static final int RULE_LITTLE_U_VALUE=28;
    public static final int RULE_HEX_BYTE_VALUE=32;
    public static final int RULE_OCTAL_BYTE_VALUE=31;
    public static final int RULE_MUL_OP=15;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=5;
    public static final int T__77=77;
    public static final int RULE_HEX_LIT=19;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=14;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_UNICODE_DIGIT=12;
    public static final int T__83=83;
    public static final int RULE_WS=37;
    public static final int RULE_COMMENT=38;
    public static final int RULE_OCTAL_LIT=18;
    public static final int RULE_FLOAT_LIT=7;
    public static final int RULE_TERMINATOR=39;
    public static final int RULE_INT_LIT=6;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_REL_OP=13;
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

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( 'fallthrough' )
            // InternalGo.g:12:9: 'fallthrough'
            {
            match("fallthrough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( '.' )
            // InternalGo.g:13:9: '.'
            {
            match('.'); 

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
            // InternalGo.g:14:7: ( '++' )
            // InternalGo.g:14:9: '++'
            {
            match("++"); 


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
            // InternalGo.g:15:7: ( '--' )
            // InternalGo.g:15:9: '--'
            {
            match("--"); 


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
            // InternalGo.g:16:7: ( '+' )
            // InternalGo.g:16:9: '+'
            {
            match('+'); 

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
            // InternalGo.g:17:7: ( '-' )
            // InternalGo.g:17:9: '-'
            {
            match('-'); 

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
            // InternalGo.g:18:7: ( '|' )
            // InternalGo.g:18:9: '|'
            {
            match('|'); 

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
            // InternalGo.g:19:7: ( '^' )
            // InternalGo.g:19:9: '^'
            {
            match('^'); 

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
            // InternalGo.g:20:7: ( '*' )
            // InternalGo.g:20:9: '*'
            {
            match('*'); 

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
            // InternalGo.g:21:7: ( '/' )
            // InternalGo.g:21:9: '/'
            {
            match('/'); 

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
            // InternalGo.g:22:7: ( '%' )
            // InternalGo.g:22:9: '%'
            {
            match('%'); 

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
            // InternalGo.g:23:7: ( '<<' )
            // InternalGo.g:23:9: '<<'
            {
            match("<<"); 


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
            // InternalGo.g:24:7: ( '>>' )
            // InternalGo.g:24:9: '>>'
            {
            match(">>"); 


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
            // InternalGo.g:25:7: ( '&' )
            // InternalGo.g:25:9: '&'
            {
            match('&'); 

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
            // InternalGo.g:26:7: ( '&^' )
            // InternalGo.g:26:9: '&^'
            {
            match("&^"); 


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
            // InternalGo.g:27:7: ( 'default' )
            // InternalGo.g:27:9: 'default'
            {
            match("default"); 


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
            // InternalGo.g:28:7: ( 'chan' )
            // InternalGo.g:28:9: 'chan'
            {
            match("chan"); 


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
            // InternalGo.g:29:7: ( '!' )
            // InternalGo.g:29:9: '!'
            {
            match('!'); 

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
            // InternalGo.g:30:7: ( '<-' )
            // InternalGo.g:30:9: '<-'
            {
            match("<-"); 


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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
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
    // $ANTLR end "T__93"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12987:17: ( RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )* )
            // InternalGo.g:12987:19: RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalGo.g:12987:31: ( RULE_LETTER | RULE_UNICODE_DIGIT )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='A'||LA1_0=='_'||LA1_0=='a'||LA1_0=='\u00AA'||LA1_0=='\u00B5'||LA1_0=='\u00BA'||LA1_0=='\u00C0'||LA1_0=='\u00D8'||LA1_0=='\u00F8'||LA1_0=='\u0222'||LA1_0=='\u0250'||LA1_0=='\u02B0'||LA1_0=='\u02BB'||LA1_0=='\u02D0'||LA1_0=='\u02E0'||LA1_0=='\u02EE'||LA1_0=='\u037A'||LA1_0=='\u0386'||LA1_0=='\u0388'||LA1_0=='\u038C'||LA1_0=='\u038E'||LA1_0=='\u03A3'||LA1_0=='\u03D0'||LA1_0=='\u03DA'||LA1_0=='\u0400'||LA1_0=='\u048C'||LA1_0=='\u04C7'||LA1_0=='\u04CB'||LA1_0=='\u04D0'||LA1_0=='\u04F8'||LA1_0=='\u0531'||LA1_0=='\u0559'||LA1_0=='\u0561'||LA1_0=='\u05D0'||LA1_0=='\u05F0'||LA1_0=='\u0621'||LA1_0=='\u0640'||LA1_0=='\u0671'||LA1_0=='\u06D5'||LA1_0=='\u06E5'||LA1_0=='\u06FA'||LA1_0=='\u0710'||LA1_0=='\u0712'||LA1_0=='\u0780'||LA1_0=='\u0905'||LA1_0=='\u093D'||LA1_0=='\u0950'||LA1_0=='\u0958'||LA1_0=='\u0985'||LA1_0=='\u098F'||LA1_0=='\u0993'||LA1_0=='\u09AA'||LA1_0=='\u09B2'||LA1_0=='\u09B6'||LA1_0=='\u09DC'||LA1_0=='\u09DF'||LA1_0=='\u09F0'||LA1_0=='\u0A05'||LA1_0=='\u0A0F'||LA1_0=='\u0A13'||LA1_0=='\u0A2A'||LA1_0=='\u0A32'||LA1_0=='\u0A35'||LA1_0=='\u0A38'||LA1_0=='\u0A59'||LA1_0=='\u0A5E'||LA1_0=='\u0A72'||LA1_0=='\u0A85'||LA1_0=='\u0A8D'||LA1_0=='\u0A8F'||LA1_0=='\u0A93'||LA1_0=='\u0AAA'||LA1_0=='\u0AB2'||LA1_0=='\u0AB5'||LA1_0=='\u0ABD'||LA1_0=='\u0AD0'||LA1_0=='\u0AE0'||LA1_0=='\u0B05'||LA1_0=='\u0B0F'||LA1_0=='\u0B13'||LA1_0=='\u0B2A'||LA1_0=='\u0B32'||LA1_0=='\u0B36'||LA1_0=='\u0B3D'||LA1_0=='\u0B5C'||LA1_0=='\u0B5F'||LA1_0=='\u0B85'||LA1_0=='\u0B8E'||LA1_0=='\u0B92'||LA1_0=='\u0B99'||LA1_0=='\u0B9C'||LA1_0=='\u0B9E'||LA1_0=='\u0BA3'||LA1_0=='\u0BA8'||LA1_0=='\u0BAE'||LA1_0=='\u0BB7'||LA1_0=='\u0C05'||LA1_0=='\u0C0E'||LA1_0=='\u0C12'||LA1_0=='\u0C2A'||LA1_0=='\u0C35'||LA1_0=='\u0C60'||LA1_0=='\u0C85'||LA1_0=='\u0C8E'||LA1_0=='\u0C92'||LA1_0=='\u0CAA'||LA1_0=='\u0CB5'||LA1_0=='\u0CDE'||LA1_0=='\u0CE0'||LA1_0=='\u0D05'||LA1_0=='\u0D0E'||LA1_0=='\u0D12'||LA1_0=='\u0D2A'||LA1_0=='\u0D60'||LA1_0=='\u0D85'||LA1_0=='\u0D9A'||LA1_0=='\u0DB3'||LA1_0=='\u0DBD'||LA1_0=='\u0DC0'||LA1_0=='\u0E01'||LA1_0=='\u0E32'||LA1_0=='\u0E40'||LA1_0=='\u0E81'||LA1_0=='\u0E84'||LA1_0=='\u0E87'||LA1_0=='\u0E8A'||LA1_0=='\u0E8D'||LA1_0=='\u0E94'||LA1_0=='\u0E99'||LA1_0=='\u0EA1'||LA1_0=='\u0EA5'||LA1_0=='\u0EA7'||LA1_0=='\u0EAA'||LA1_0=='\u0EAD'||LA1_0=='\u0EB2'||LA1_0=='\u0EBD'||LA1_0=='\u0EC6'||LA1_0=='\u0EDC'||LA1_0=='\u0F00'||LA1_0=='\u0F40'||LA1_0=='\u0F88'||LA1_0=='\u1000'||LA1_0=='\u1023'||LA1_0=='\u1029'||LA1_0=='\u1050'||LA1_0=='\u10A0'||LA1_0=='\u10D0'||LA1_0=='\u1100'||LA1_0=='\u115F'||LA1_0=='\u11A8'||LA1_0=='\u1200'||LA1_0=='\u1208'||LA1_0=='\u1248'||LA1_0=='\u124A'||LA1_0=='\u1250'||LA1_0=='\u1258'||LA1_0=='\u125A'||LA1_0=='\u1260'||LA1_0=='\u1288'||LA1_0=='\u128A'||LA1_0=='\u1290'||LA1_0=='\u12B0'||LA1_0=='\u12B2'||LA1_0=='\u12B8'||LA1_0=='\u12C0'||LA1_0=='\u12C2'||LA1_0=='\u12C8'||LA1_0=='\u12D0'||LA1_0=='\u12D8'||LA1_0=='\u12F0'||LA1_0=='\u1310'||LA1_0=='\u1312'||LA1_0=='\u1318'||LA1_0=='\u1320'||LA1_0=='\u1348'||LA1_0=='\u13A0'||LA1_0=='\u13B1'||LA1_0=='\u1401'||LA1_0=='\u1681'||LA1_0=='\u16A0'||LA1_0=='\u1780'||LA1_0=='\u1820'||LA1_0=='\u1880'||LA1_0=='\u1E00'||LA1_0=='\u1EA0'||LA1_0=='\u1EE1'||LA1_0=='\u1F00'||LA1_0=='\u1F18'||LA1_0=='\u1F20'||LA1_0=='\u1F3A'||LA1_0=='\u1F48'||LA1_0=='\u1F50'||LA1_0=='\u1F59'||LA1_0=='\u1F5B'||LA1_0=='\u1F5D'||LA1_0=='\u1F5F'||LA1_0=='\u1F80'||LA1_0=='\u1FB6'||LA1_0=='\u1FBE'||LA1_0=='\u1FC2'||LA1_0=='\u1FC6'||LA1_0=='\u1FD0'||LA1_0=='\u1FD6'||LA1_0=='\u1FE0'||LA1_0=='\u1FF2'||LA1_0=='\u1FF6'||LA1_0=='\u207F'||LA1_0=='\u2102'||LA1_0=='\u2107'||LA1_0=='\u210A'||LA1_0=='\u2115'||LA1_0=='\u2119'||LA1_0=='\u2124'||LA1_0=='\u2126'||LA1_0=='\u2128'||LA1_0=='\u212A'||LA1_0=='\u212F'||LA1_0=='\u2133'||LA1_0=='\u2160'||LA1_0=='\u3005'||LA1_0=='\u3021'||LA1_0=='\u3031'||LA1_0=='\u3038'||LA1_0=='\u3041'||LA1_0=='\u309D'||LA1_0=='\u30A1'||LA1_0=='\u30FC'||LA1_0=='\u3105'||LA1_0=='\u3131'||LA1_0=='\u31A0'||LA1_0=='\u3400'||LA1_0=='\u4DB5'||LA1_0=='\u4E00'||LA1_0=='\u9FA5'||LA1_0=='\uA000'||LA1_0=='\uAC00'||LA1_0=='\uD7A3'||LA1_0=='\uF900'||LA1_0=='\uFB00'||LA1_0=='\uFB13'||LA1_0=='\uFB1D'||LA1_0=='\uFB1F'||LA1_0=='\uFB2A'||LA1_0=='\uFB38'||LA1_0=='\uFB3E'||LA1_0=='\uFB40'||LA1_0=='\uFB43'||LA1_0=='\uFB46'||LA1_0=='\uFBD3'||LA1_0=='\uFD50'||LA1_0=='\uFD92'||LA1_0=='\uFDF0'||LA1_0=='\uFE70'||LA1_0=='\uFE74'||LA1_0=='\uFE76'||LA1_0=='\uFF21'||LA1_0=='\uFF41'||LA1_0=='\uFF66'||LA1_0=='\uFFC2'||LA1_0=='\uFFCA'||LA1_0=='\uFFD2'||LA1_0=='\uFFDA') ) {
                    alt1=1;
                }
                else if ( (LA1_0=='0'||LA1_0=='\u0660'||LA1_0=='\u06F0'||LA1_0=='\u0966'||LA1_0=='\u09E6'||LA1_0=='\u0A66'||LA1_0=='\u0AE6'||LA1_0=='\u0B66'||LA1_0=='\u0BE7'||LA1_0=='\u0C66'||LA1_0=='\u0CE6'||LA1_0=='\u0D66'||LA1_0=='\u0E50'||LA1_0=='\u0ED0'||LA1_0=='\u0F20'||LA1_0=='\u1040'||LA1_0=='\u1369'||LA1_0=='\u17E0'||LA1_0=='\u1810'||LA1_0=='\uFF10') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:12987:32: RULE_LETTER
            	    {
            	    mRULE_LETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:12987:44: RULE_UNICODE_DIGIT
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
            // InternalGo.g:12989:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:12989:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:12989:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGo.g:12989:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:12989:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:12989:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:12989:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:12989:53: RULE_MUL_OP
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
            // InternalGo.g:12991:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:12991:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:12991:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
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
                    // InternalGo.g:12991:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:12991:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:12991:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:12991:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:12991:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:12991:48: '>='
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
            // InternalGo.g:12993:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:12993:24: ( '+' | '-' | '|' | '^' )
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
            // InternalGo.g:12995:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:12995:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:12995:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
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
                    // InternalGo.g:12995:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:12995:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:12995:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:12995:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:12995:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:12995:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:12995:51: '&^'
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
            // InternalGo.g:12997:24: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:12997:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:12997:26: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
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
                    // InternalGo.g:12997:27: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:12997:31: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:12997:35: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:12997:39: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:12997:43: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:12997:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:12997:51: '<-'
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
            // InternalGo.g:12999:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:12999:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:12999:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
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
                    // InternalGo.g:12999:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:12999:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:12999:49: RULE_HEX_LIT
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
            // InternalGo.g:13001:27: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:13001:29: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
            {
            matchRange('1','9'); 
            // InternalGo.g:13001:38: ( RULE_DECIMAL_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:13001:38: RULE_DECIMAL_DIGIT
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
            // InternalGo.g:13003:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:13003:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:13003:31: ( RULE_OCTAL_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:13003:31: RULE_OCTAL_DIGIT
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
            // InternalGo.g:13005:23: ( '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:13005:25: '0' ( 'X' | 'x' ) ( RULE_HEX_DIGIT )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:13005:39: ( RULE_HEX_DIGIT )+
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
            	    // InternalGo.g:13005:39: RULE_HEX_DIGIT
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
            // InternalGo.g:13007:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalGo.g:13007:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalGo.g:13007:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalGo.g:13007:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalGo.g:13007:37: ( RULE_DECIMALS )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:13007:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalGo.g:13007:52: ( RULE_EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGo.g:13007:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:13007:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:13007:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:13007:113: ( RULE_EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:13007:113: RULE_EXPONENT
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
            // InternalGo.g:13009:24: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:13009:26: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:13009:26: ( RULE_DECIMAL_DIGIT )+
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
            	    // InternalGo.g:13009:26: RULE_DECIMAL_DIGIT
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
            // InternalGo.g:13011:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:13011:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:13011:36: ( '+' | '-' )?
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
            // InternalGo.g:13013:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalGo.g:13013:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalGo.g:13013:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalGo.g:13013:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:13013:37: RULE_FLOAT_LIT
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
            // InternalGo.g:13015:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalGo.g:13015:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalGo.g:13015:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
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
                    // InternalGo.g:13015:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:13015:42: RULE_BYTE_VALUE
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
            // InternalGo.g:13017:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:13017:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:13017:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
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
                    // InternalGo.g:13017:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:13017:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:13017:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:13017:87: RULE_ESCAPED_CHAR
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
            // InternalGo.g:13019:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:13019:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:13019:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
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
                    // InternalGo.g:13019:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:13019:51: RULE_HEX_BYTE_VALUE
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
            // InternalGo.g:13021:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:13021:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalGo.g:13023:30: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:13023:32: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:13025:30: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:13025:32: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:13027:27: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:13027:29: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:13029:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:13029:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalGo.g:13031:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalGo.g:13031:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalGo.g:13031:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
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
                    // InternalGo.g:13031:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:13031:40: RULE_INTERPRETED_STRING_LIT
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
            // InternalGo.g:13033:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalGo.g:13033:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalGo.g:13033:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
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
            // InternalGo.g:13035:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalGo.g:13035:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalGo.g:13035:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
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
            	    // InternalGo.g:13035:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:13035:64: RULE_BYTE_VALUE
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
            // InternalGo.g:13037:22: ( ( RULE_UNICODE_LETTER | '_' ) )
            // InternalGo.g:13037:24: ( RULE_UNICODE_LETTER | '_' )
            {
            // InternalGo.g:13037:24: ( RULE_UNICODE_LETTER | '_' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='A'||LA23_0=='a'||LA23_0=='\u00AA'||LA23_0=='\u00B5'||LA23_0=='\u00BA'||LA23_0=='\u00C0'||LA23_0=='\u00D8'||LA23_0=='\u00F8'||LA23_0=='\u0222'||LA23_0=='\u0250'||LA23_0=='\u02B0'||LA23_0=='\u02BB'||LA23_0=='\u02D0'||LA23_0=='\u02E0'||LA23_0=='\u02EE'||LA23_0=='\u037A'||LA23_0=='\u0386'||LA23_0=='\u0388'||LA23_0=='\u038C'||LA23_0=='\u038E'||LA23_0=='\u03A3'||LA23_0=='\u03D0'||LA23_0=='\u03DA'||LA23_0=='\u0400'||LA23_0=='\u048C'||LA23_0=='\u04C7'||LA23_0=='\u04CB'||LA23_0=='\u04D0'||LA23_0=='\u04F8'||LA23_0=='\u0531'||LA23_0=='\u0559'||LA23_0=='\u0561'||LA23_0=='\u05D0'||LA23_0=='\u05F0'||LA23_0=='\u0621'||LA23_0=='\u0640'||LA23_0=='\u0671'||LA23_0=='\u06D5'||LA23_0=='\u06E5'||LA23_0=='\u06FA'||LA23_0=='\u0710'||LA23_0=='\u0712'||LA23_0=='\u0780'||LA23_0=='\u0905'||LA23_0=='\u093D'||LA23_0=='\u0950'||LA23_0=='\u0958'||LA23_0=='\u0985'||LA23_0=='\u098F'||LA23_0=='\u0993'||LA23_0=='\u09AA'||LA23_0=='\u09B2'||LA23_0=='\u09B6'||LA23_0=='\u09DC'||LA23_0=='\u09DF'||LA23_0=='\u09F0'||LA23_0=='\u0A05'||LA23_0=='\u0A0F'||LA23_0=='\u0A13'||LA23_0=='\u0A2A'||LA23_0=='\u0A32'||LA23_0=='\u0A35'||LA23_0=='\u0A38'||LA23_0=='\u0A59'||LA23_0=='\u0A5E'||LA23_0=='\u0A72'||LA23_0=='\u0A85'||LA23_0=='\u0A8D'||LA23_0=='\u0A8F'||LA23_0=='\u0A93'||LA23_0=='\u0AAA'||LA23_0=='\u0AB2'||LA23_0=='\u0AB5'||LA23_0=='\u0ABD'||LA23_0=='\u0AD0'||LA23_0=='\u0AE0'||LA23_0=='\u0B05'||LA23_0=='\u0B0F'||LA23_0=='\u0B13'||LA23_0=='\u0B2A'||LA23_0=='\u0B32'||LA23_0=='\u0B36'||LA23_0=='\u0B3D'||LA23_0=='\u0B5C'||LA23_0=='\u0B5F'||LA23_0=='\u0B85'||LA23_0=='\u0B8E'||LA23_0=='\u0B92'||LA23_0=='\u0B99'||LA23_0=='\u0B9C'||LA23_0=='\u0B9E'||LA23_0=='\u0BA3'||LA23_0=='\u0BA8'||LA23_0=='\u0BAE'||LA23_0=='\u0BB7'||LA23_0=='\u0C05'||LA23_0=='\u0C0E'||LA23_0=='\u0C12'||LA23_0=='\u0C2A'||LA23_0=='\u0C35'||LA23_0=='\u0C60'||LA23_0=='\u0C85'||LA23_0=='\u0C8E'||LA23_0=='\u0C92'||LA23_0=='\u0CAA'||LA23_0=='\u0CB5'||LA23_0=='\u0CDE'||LA23_0=='\u0CE0'||LA23_0=='\u0D05'||LA23_0=='\u0D0E'||LA23_0=='\u0D12'||LA23_0=='\u0D2A'||LA23_0=='\u0D60'||LA23_0=='\u0D85'||LA23_0=='\u0D9A'||LA23_0=='\u0DB3'||LA23_0=='\u0DBD'||LA23_0=='\u0DC0'||LA23_0=='\u0E01'||LA23_0=='\u0E32'||LA23_0=='\u0E40'||LA23_0=='\u0E81'||LA23_0=='\u0E84'||LA23_0=='\u0E87'||LA23_0=='\u0E8A'||LA23_0=='\u0E8D'||LA23_0=='\u0E94'||LA23_0=='\u0E99'||LA23_0=='\u0EA1'||LA23_0=='\u0EA5'||LA23_0=='\u0EA7'||LA23_0=='\u0EAA'||LA23_0=='\u0EAD'||LA23_0=='\u0EB2'||LA23_0=='\u0EBD'||LA23_0=='\u0EC6'||LA23_0=='\u0EDC'||LA23_0=='\u0F00'||LA23_0=='\u0F40'||LA23_0=='\u0F88'||LA23_0=='\u1000'||LA23_0=='\u1023'||LA23_0=='\u1029'||LA23_0=='\u1050'||LA23_0=='\u10A0'||LA23_0=='\u10D0'||LA23_0=='\u1100'||LA23_0=='\u115F'||LA23_0=='\u11A8'||LA23_0=='\u1200'||LA23_0=='\u1208'||LA23_0=='\u1248'||LA23_0=='\u124A'||LA23_0=='\u1250'||LA23_0=='\u1258'||LA23_0=='\u125A'||LA23_0=='\u1260'||LA23_0=='\u1288'||LA23_0=='\u128A'||LA23_0=='\u1290'||LA23_0=='\u12B0'||LA23_0=='\u12B2'||LA23_0=='\u12B8'||LA23_0=='\u12C0'||LA23_0=='\u12C2'||LA23_0=='\u12C8'||LA23_0=='\u12D0'||LA23_0=='\u12D8'||LA23_0=='\u12F0'||LA23_0=='\u1310'||LA23_0=='\u1312'||LA23_0=='\u1318'||LA23_0=='\u1320'||LA23_0=='\u1348'||LA23_0=='\u13A0'||LA23_0=='\u13B1'||LA23_0=='\u1401'||LA23_0=='\u1681'||LA23_0=='\u16A0'||LA23_0=='\u1780'||LA23_0=='\u1820'||LA23_0=='\u1880'||LA23_0=='\u1E00'||LA23_0=='\u1EA0'||LA23_0=='\u1EE1'||LA23_0=='\u1F00'||LA23_0=='\u1F18'||LA23_0=='\u1F20'||LA23_0=='\u1F3A'||LA23_0=='\u1F48'||LA23_0=='\u1F50'||LA23_0=='\u1F59'||LA23_0=='\u1F5B'||LA23_0=='\u1F5D'||LA23_0=='\u1F5F'||LA23_0=='\u1F80'||LA23_0=='\u1FB6'||LA23_0=='\u1FBE'||LA23_0=='\u1FC2'||LA23_0=='\u1FC6'||LA23_0=='\u1FD0'||LA23_0=='\u1FD6'||LA23_0=='\u1FE0'||LA23_0=='\u1FF2'||LA23_0=='\u1FF6'||LA23_0=='\u207F'||LA23_0=='\u2102'||LA23_0=='\u2107'||LA23_0=='\u210A'||LA23_0=='\u2115'||LA23_0=='\u2119'||LA23_0=='\u2124'||LA23_0=='\u2126'||LA23_0=='\u2128'||LA23_0=='\u212A'||LA23_0=='\u212F'||LA23_0=='\u2133'||LA23_0=='\u2160'||LA23_0=='\u3005'||LA23_0=='\u3021'||LA23_0=='\u3031'||LA23_0=='\u3038'||LA23_0=='\u3041'||LA23_0=='\u309D'||LA23_0=='\u30A1'||LA23_0=='\u30FC'||LA23_0=='\u3105'||LA23_0=='\u3131'||LA23_0=='\u31A0'||LA23_0=='\u3400'||LA23_0=='\u4DB5'||LA23_0=='\u4E00'||LA23_0=='\u9FA5'||LA23_0=='\uA000'||LA23_0=='\uAC00'||LA23_0=='\uD7A3'||LA23_0=='\uF900'||LA23_0=='\uFB00'||LA23_0=='\uFB13'||LA23_0=='\uFB1D'||LA23_0=='\uFB1F'||LA23_0=='\uFB2A'||LA23_0=='\uFB38'||LA23_0=='\uFB3E'||LA23_0=='\uFB40'||LA23_0=='\uFB43'||LA23_0=='\uFB46'||LA23_0=='\uFBD3'||LA23_0=='\uFD50'||LA23_0=='\uFD92'||LA23_0=='\uFDF0'||LA23_0=='\uFE70'||LA23_0=='\uFE74'||LA23_0=='\uFE76'||LA23_0=='\uFF21'||LA23_0=='\uFF41'||LA23_0=='\uFF66'||LA23_0=='\uFFC2'||LA23_0=='\uFFCA'||LA23_0=='\uFFD2'||LA23_0=='\uFFDA') ) {
                alt23=1;
            }
            else if ( (LA23_0=='_') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:13037:25: RULE_UNICODE_LETTER
                    {
                    mRULE_UNICODE_LETTER(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:13037:45: '_'
                    {
                    match('_'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DECIMAL_DIGIT"
    public final void mRULE_DECIMAL_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:13039:29: ( '0' .. '9' )
            // InternalGo.g:13039:31: '0' .. '9'
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
            // InternalGo.g:13041:27: ( '0' .. '7' )
            // InternalGo.g:13041:29: '0' .. '7'
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
            // InternalGo.g:13043:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalGo.g:13043:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalGo.g:13045:23: ( '\\n' )
            // InternalGo.g:13045:25: '\\n'
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
            // InternalGo.g:13047:28: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:13047:30: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // InternalGo.g:13049:29: ( ( '0..9' | '\\u0660..\\u0669' | '\\u06F0..\\u06F9' | '\\u0966..\\u096F' | '\\u09E6..\\u09EF' | '\\u0A66..\\u0A6F' | '\\u0AE6..\\u0AEF' | '\\u0B66..\\u0B6F' | '\\u0BE7..\\u0BEF' | '\\u0C66..\\u0C6F' | '\\u0CE6..\\u0CEF' | '\\u0D66..\\u0D6F' | '\\u0E50..\\u0E59' | '\\u0ED0..\\u0ED9' | '\\u0F20..\\u0F29' | '\\u1040..\\u1049' | '\\u1369..\\u1371' | '\\u17E0..\\u17E9' | '\\u1810..\\u1819' | '\\uFF10..\\uFF19' ) )
            // InternalGo.g:13049:31: ( '0..9' | '\\u0660..\\u0669' | '\\u06F0..\\u06F9' | '\\u0966..\\u096F' | '\\u09E6..\\u09EF' | '\\u0A66..\\u0A6F' | '\\u0AE6..\\u0AEF' | '\\u0B66..\\u0B6F' | '\\u0BE7..\\u0BEF' | '\\u0C66..\\u0C6F' | '\\u0CE6..\\u0CEF' | '\\u0D66..\\u0D6F' | '\\u0E50..\\u0E59' | '\\u0ED0..\\u0ED9' | '\\u0F20..\\u0F29' | '\\u1040..\\u1049' | '\\u1369..\\u1371' | '\\u17E0..\\u17E9' | '\\u1810..\\u1819' | '\\uFF10..\\uFF19' )
            {
            // InternalGo.g:13049:31: ( '0..9' | '\\u0660..\\u0669' | '\\u06F0..\\u06F9' | '\\u0966..\\u096F' | '\\u09E6..\\u09EF' | '\\u0A66..\\u0A6F' | '\\u0AE6..\\u0AEF' | '\\u0B66..\\u0B6F' | '\\u0BE7..\\u0BEF' | '\\u0C66..\\u0C6F' | '\\u0CE6..\\u0CEF' | '\\u0D66..\\u0D6F' | '\\u0E50..\\u0E59' | '\\u0ED0..\\u0ED9' | '\\u0F20..\\u0F29' | '\\u1040..\\u1049' | '\\u1369..\\u1371' | '\\u17E0..\\u17E9' | '\\u1810..\\u1819' | '\\uFF10..\\uFF19' )
            int alt24=20;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt24=1;
                }
                break;
            case '\u0660':
                {
                alt24=2;
                }
                break;
            case '\u06F0':
                {
                alt24=3;
                }
                break;
            case '\u0966':
                {
                alt24=4;
                }
                break;
            case '\u09E6':
                {
                alt24=5;
                }
                break;
            case '\u0A66':
                {
                alt24=6;
                }
                break;
            case '\u0AE6':
                {
                alt24=7;
                }
                break;
            case '\u0B66':
                {
                alt24=8;
                }
                break;
            case '\u0BE7':
                {
                alt24=9;
                }
                break;
            case '\u0C66':
                {
                alt24=10;
                }
                break;
            case '\u0CE6':
                {
                alt24=11;
                }
                break;
            case '\u0D66':
                {
                alt24=12;
                }
                break;
            case '\u0E50':
                {
                alt24=13;
                }
                break;
            case '\u0ED0':
                {
                alt24=14;
                }
                break;
            case '\u0F20':
                {
                alt24=15;
                }
                break;
            case '\u1040':
                {
                alt24=16;
                }
                break;
            case '\u1369':
                {
                alt24=17;
                }
                break;
            case '\u17E0':
                {
                alt24=18;
                }
                break;
            case '\u1810':
                {
                alt24=19;
                }
                break;
            case '\uFF10':
                {
                alt24=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalGo.g:13049:32: '0..9'
                    {
                    match("0..9"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:13049:39: '\\u0660..\\u0669'
                    {
                    match("\u0660..\u0669"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:13049:56: '\\u06F0..\\u06F9'
                    {
                    match("\u06F0..\u06F9"); 


                    }
                    break;
                case 4 :
                    // InternalGo.g:13049:73: '\\u0966..\\u096F'
                    {
                    match("\u0966..\u096F"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:13049:90: '\\u09E6..\\u09EF'
                    {
                    match("\u09E6..\u09EF"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:13049:107: '\\u0A66..\\u0A6F'
                    {
                    match("\u0A66..\u0A6F"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:13049:124: '\\u0AE6..\\u0AEF'
                    {
                    match("\u0AE6..\u0AEF"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:13049:141: '\\u0B66..\\u0B6F'
                    {
                    match("\u0B66..\u0B6F"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:13049:158: '\\u0BE7..\\u0BEF'
                    {
                    match("\u0BE7..\u0BEF"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:13049:175: '\\u0C66..\\u0C6F'
                    {
                    match("\u0C66..\u0C6F"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:13049:192: '\\u0CE6..\\u0CEF'
                    {
                    match("\u0CE6..\u0CEF"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:13049:209: '\\u0D66..\\u0D6F'
                    {
                    match("\u0D66..\u0D6F"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:13049:226: '\\u0E50..\\u0E59'
                    {
                    match("\u0E50..\u0E59"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:13049:243: '\\u0ED0..\\u0ED9'
                    {
                    match("\u0ED0..\u0ED9"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:13049:260: '\\u0F20..\\u0F29'
                    {
                    match("\u0F20..\u0F29"); 


                    }
                    break;
                case 16 :
                    // InternalGo.g:13049:277: '\\u1040..\\u1049'
                    {
                    match("\u1040..\u1049"); 


                    }
                    break;
                case 17 :
                    // InternalGo.g:13049:294: '\\u1369..\\u1371'
                    {
                    match("\u1369..\u1371"); 


                    }
                    break;
                case 18 :
                    // InternalGo.g:13049:311: '\\u17E0..\\u17E9'
                    {
                    match("\u17E0..\u17E9"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:13049:328: '\\u1810..\\u1819'
                    {
                    match("\u1810..\u1819"); 


                    }
                    break;
                case 20 :
                    // InternalGo.g:13049:345: '\\uFF10..\\uFF19'
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
            // InternalGo.g:13051:30: ( ( 'A..Z' | 'a..z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0..\\u00D6' | '\\u00D8..\\u00F6' | '\\u00F8..\\u021F' | '\\u0222..\\u0233' | '\\u0250..\\u02AD' | '\\u02B0..\\u02B8' | '\\u02BB..\\u02C1' | '\\u02D0..\\u02D1' | '\\u02E0..\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388..\\u038A' | '\\u038C' | '\\u038E..\\u03A1' | '\\u03A3..\\u03CE' | '\\u03D0..\\u03D7' | '\\u03DA..\\u03F3' | '\\u0400..\\u0481' | '\\u048C..\\u04C4' | '\\u04C7..\\u04C8' | '\\u04CB..\\u04CC' | '\\u04D0..\\u04F5' | '\\u04F8..\\u04F9' | '\\u0531..\\u0556' | '\\u0559' | '\\u0561..\\u0587' | '\\u05D0..\\u05EA' | '\\u05F0..\\u05F2' | '\\u0621..\\u063A' | '\\u0640..\\u064A' | '\\u0671..\\u06D3' | '\\u06D5' | '\\u06E5..\\u06E6' | '\\u06FA..\\u06FC' | '\\u0710' | '\\u0712..\\u072C' | '\\u0780..\\u07A5' | '\\u0905..\\u0939' | '\\u093D' | '\\u0950' | '\\u0958..\\u0961' | '\\u0985..\\u098C' | '\\u098F..\\u0990' | '\\u0993..\\u09A8' | '\\u09AA..\\u09B0' | '\\u09B2' | '\\u09B6..\\u09B9' | '\\u09DC..\\u09DD' | '\\u09DF..\\u09E1' | '\\u09F0..\\u09F1' | '\\u0A05..\\u0A0A' | '\\u0A0F..\\u0A10' | '\\u0A13..\\u0A28' | '\\u0A2A..\\u0A30' | '\\u0A32..\\u0A33' | '\\u0A35..\\u0A36' | '\\u0A38..\\u0A39' | '\\u0A59..\\u0A5C' | '\\u0A5E' | '\\u0A72..\\u0A74' | '\\u0A85..\\u0A8B' | '\\u0A8D' | '\\u0A8F..\\u0A91' | '\\u0A93..\\u0AA8' | '\\u0AAA..\\u0AB0' | '\\u0AB2..\\u0AB3' | '\\u0AB5..\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05..\\u0B0C' | '\\u0B0F..\\u0B10' | '\\u0B13..\\u0B28' | '\\u0B2A..\\u0B30' | '\\u0B32..\\u0B33' | '\\u0B36..\\u0B39' | '\\u0B3D' | '\\u0B5C..\\u0B5D' | '\\u0B5F..\\u0B61' | '\\u0B85..\\u0B8A' | '\\u0B8E..\\u0B90' | '\\u0B92..\\u0B95' | '\\u0B99..\\u0B9A' | '\\u0B9C' | '\\u0B9E..\\u0B9F' | '\\u0BA3..\\u0BA4' | '\\u0BA8..\\u0BAA' | '\\u0BAE..\\u0BB5' | '\\u0BB7..\\u0BB9' | '\\u0C05..\\u0C0C' | '\\u0C0E..\\u0C10' | '\\u0C12..\\u0C28' | '\\u0C2A..\\u0C33' | '\\u0C35..\\u0C39' | '\\u0C60..\\u0C61' | '\\u0C85..\\u0C8C' | '\\u0C8E..\\u0C90' | '\\u0C92..\\u0CA8' | '\\u0CAA..\\u0CB3' | '\\u0CB5..\\u0CB9' | '\\u0CDE' | '\\u0CE0..\\u0CE1' | '\\u0D05..\\u0D0C' | '\\u0D0E..\\u0D10' | '\\u0D12..\\u0D28' | '\\u0D2A..\\u0D39' | '\\u0D60..\\u0D61' | '\\u0D85..\\u0D96' | '\\u0D9A..\\u0DB1' | '\\u0DB3..\\u0DBB' | '\\u0DBD' | '\\u0DC0..\\u0DC6' | '\\u0E01..\\u0E30' | '\\u0E32..\\u0E33' | '\\u0E40..\\u0E46' | '\\u0E81..\\u0E82' | '\\u0E84' | '\\u0E87..\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94..\\u0E97' | '\\u0E99..\\u0E9F' | '\\u0EA1..\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA..\\u0EAB' | '\\u0EAD..\\u0EB0' | '\\u0EB2..\\u0EB3' | '\\u0EBD..\\u0EC4' | '\\u0EC6' | '\\u0EDC..\\u0EDD' | '\\u0F00' | '\\u0F40..\\u0F6A' | '\\u0F88..\\u0F8B' | '\\u1000..\\u1021' | '\\u1023..\\u1027' | '\\u1029..\\u102A' | '\\u1050..\\u1055' | '\\u10A0..\\u10C5' | '\\u10D0..\\u10F6' | '\\u1100..\\u1159' | '\\u115F..\\u11A2' | '\\u11A8..\\u11F9' | '\\u1200..\\u1206' | '\\u1208..\\u1246' | '\\u1248' | '\\u124A..\\u124D' | '\\u1250..\\u1256' | '\\u1258' | '\\u125A..\\u125D' | '\\u1260..\\u1286' | '\\u1288' | '\\u128A..\\u128D' | '\\u1290..\\u12AE' | '\\u12B0' | '\\u12B2..\\u12B5' | '\\u12B8..\\u12BE' | '\\u12C0' | '\\u12C2..\\u12C5' | '\\u12C8..\\u12CE' | '\\u12D0..\\u12D6' | '\\u12D8..\\u12EE' | '\\u12F0..\\u130E' | '\\u1310' | '\\u1312..\\u1315' | '\\u1318..\\u131E' | '\\u1320..\\u1346' | '\\u1348..\\u135A' | '\\u13A0..\\u13B0' | '\\u13B1..\\u13F4' | '\\u1401..\\u1676' | '\\u1681..\\u169A' | '\\u16A0..\\u16EA' | '\\u1780..\\u17B3' | '\\u1820..\\u1877' | '\\u1880..\\u18A8' | '\\u1E00..\\u1E9B' | '\\u1EA0..\\u1EE0' | '\\u1EE1..\\u1EF9' | '\\u1F00..\\u1F15' | '\\u1F18..\\u1F1D' | '\\u1F20..\\u1F39' | '\\u1F3A..\\u1F45' | '\\u1F48..\\u1F4D' | '\\u1F50..\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F..\\u1F7D' | '\\u1F80..\\u1FB4' | '\\u1FB6..\\u1FBC' | '\\u1FBE' | '\\u1FC2..\\u1FC4' | '\\u1FC6..\\u1FCC' | '\\u1FD0..\\u1FD3' | '\\u1FD6..\\u1FDB' | '\\u1FE0..\\u1FEC' | '\\u1FF2..\\u1FF4' | '\\u1FF6..\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A..\\u2113' | '\\u2115' | '\\u2119..\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A..\\u212D' | '\\u212F..\\u2131' | '\\u2133..\\u2139' | '\\u2160..\\u2183' | '\\u3005..\\u3007' | '\\u3021..\\u3029' | '\\u3031..\\u3035' | '\\u3038..\\u303A' | '\\u3041..\\u3094' | '\\u309D..\\u309E' | '\\u30A1..\\u30FA' | '\\u30FC..\\u30FE' | '\\u3105..\\u312C' | '\\u3131..\\u318E' | '\\u31A0..\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000..\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900..\\uFA2D' | '\\uFB00..\\uFB06' | '\\uFB13..\\uFB17' | '\\uFB1D' | '\\uFB1F..\\uFB28' | '\\uFB2A..\\uFB36' | '\\uFB38..\\uFB3C' | '\\uFB3E' | '\\uFB40..\\uFB41' | '\\uFB43..\\uFB44' | '\\uFB46..\\uFBB1' | '\\uFBD3..\\uFD3D' | '\\uFD50..\\uFD8F' | '\\uFD92..\\uFDC7' | '\\uFDF0..\\uFDFB' | '\\uFE70..\\uFE72' | '\\uFE74' | '\\uFE76..\\uFEFC' | '\\uFF21..\\uFF3A' | '\\uFF41..\\uFF5A' | '\\uFF66..\\uFFBE' | '\\uFFC2..\\uFFC7' | '\\uFFCA..\\uFFCF' | '\\uFFD2..\\uFFD7' | '\\uFFDA..\\uFFDC' ) )
            // InternalGo.g:13051:32: ( 'A..Z' | 'a..z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0..\\u00D6' | '\\u00D8..\\u00F6' | '\\u00F8..\\u021F' | '\\u0222..\\u0233' | '\\u0250..\\u02AD' | '\\u02B0..\\u02B8' | '\\u02BB..\\u02C1' | '\\u02D0..\\u02D1' | '\\u02E0..\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388..\\u038A' | '\\u038C' | '\\u038E..\\u03A1' | '\\u03A3..\\u03CE' | '\\u03D0..\\u03D7' | '\\u03DA..\\u03F3' | '\\u0400..\\u0481' | '\\u048C..\\u04C4' | '\\u04C7..\\u04C8' | '\\u04CB..\\u04CC' | '\\u04D0..\\u04F5' | '\\u04F8..\\u04F9' | '\\u0531..\\u0556' | '\\u0559' | '\\u0561..\\u0587' | '\\u05D0..\\u05EA' | '\\u05F0..\\u05F2' | '\\u0621..\\u063A' | '\\u0640..\\u064A' | '\\u0671..\\u06D3' | '\\u06D5' | '\\u06E5..\\u06E6' | '\\u06FA..\\u06FC' | '\\u0710' | '\\u0712..\\u072C' | '\\u0780..\\u07A5' | '\\u0905..\\u0939' | '\\u093D' | '\\u0950' | '\\u0958..\\u0961' | '\\u0985..\\u098C' | '\\u098F..\\u0990' | '\\u0993..\\u09A8' | '\\u09AA..\\u09B0' | '\\u09B2' | '\\u09B6..\\u09B9' | '\\u09DC..\\u09DD' | '\\u09DF..\\u09E1' | '\\u09F0..\\u09F1' | '\\u0A05..\\u0A0A' | '\\u0A0F..\\u0A10' | '\\u0A13..\\u0A28' | '\\u0A2A..\\u0A30' | '\\u0A32..\\u0A33' | '\\u0A35..\\u0A36' | '\\u0A38..\\u0A39' | '\\u0A59..\\u0A5C' | '\\u0A5E' | '\\u0A72..\\u0A74' | '\\u0A85..\\u0A8B' | '\\u0A8D' | '\\u0A8F..\\u0A91' | '\\u0A93..\\u0AA8' | '\\u0AAA..\\u0AB0' | '\\u0AB2..\\u0AB3' | '\\u0AB5..\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05..\\u0B0C' | '\\u0B0F..\\u0B10' | '\\u0B13..\\u0B28' | '\\u0B2A..\\u0B30' | '\\u0B32..\\u0B33' | '\\u0B36..\\u0B39' | '\\u0B3D' | '\\u0B5C..\\u0B5D' | '\\u0B5F..\\u0B61' | '\\u0B85..\\u0B8A' | '\\u0B8E..\\u0B90' | '\\u0B92..\\u0B95' | '\\u0B99..\\u0B9A' | '\\u0B9C' | '\\u0B9E..\\u0B9F' | '\\u0BA3..\\u0BA4' | '\\u0BA8..\\u0BAA' | '\\u0BAE..\\u0BB5' | '\\u0BB7..\\u0BB9' | '\\u0C05..\\u0C0C' | '\\u0C0E..\\u0C10' | '\\u0C12..\\u0C28' | '\\u0C2A..\\u0C33' | '\\u0C35..\\u0C39' | '\\u0C60..\\u0C61' | '\\u0C85..\\u0C8C' | '\\u0C8E..\\u0C90' | '\\u0C92..\\u0CA8' | '\\u0CAA..\\u0CB3' | '\\u0CB5..\\u0CB9' | '\\u0CDE' | '\\u0CE0..\\u0CE1' | '\\u0D05..\\u0D0C' | '\\u0D0E..\\u0D10' | '\\u0D12..\\u0D28' | '\\u0D2A..\\u0D39' | '\\u0D60..\\u0D61' | '\\u0D85..\\u0D96' | '\\u0D9A..\\u0DB1' | '\\u0DB3..\\u0DBB' | '\\u0DBD' | '\\u0DC0..\\u0DC6' | '\\u0E01..\\u0E30' | '\\u0E32..\\u0E33' | '\\u0E40..\\u0E46' | '\\u0E81..\\u0E82' | '\\u0E84' | '\\u0E87..\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94..\\u0E97' | '\\u0E99..\\u0E9F' | '\\u0EA1..\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA..\\u0EAB' | '\\u0EAD..\\u0EB0' | '\\u0EB2..\\u0EB3' | '\\u0EBD..\\u0EC4' | '\\u0EC6' | '\\u0EDC..\\u0EDD' | '\\u0F00' | '\\u0F40..\\u0F6A' | '\\u0F88..\\u0F8B' | '\\u1000..\\u1021' | '\\u1023..\\u1027' | '\\u1029..\\u102A' | '\\u1050..\\u1055' | '\\u10A0..\\u10C5' | '\\u10D0..\\u10F6' | '\\u1100..\\u1159' | '\\u115F..\\u11A2' | '\\u11A8..\\u11F9' | '\\u1200..\\u1206' | '\\u1208..\\u1246' | '\\u1248' | '\\u124A..\\u124D' | '\\u1250..\\u1256' | '\\u1258' | '\\u125A..\\u125D' | '\\u1260..\\u1286' | '\\u1288' | '\\u128A..\\u128D' | '\\u1290..\\u12AE' | '\\u12B0' | '\\u12B2..\\u12B5' | '\\u12B8..\\u12BE' | '\\u12C0' | '\\u12C2..\\u12C5' | '\\u12C8..\\u12CE' | '\\u12D0..\\u12D6' | '\\u12D8..\\u12EE' | '\\u12F0..\\u130E' | '\\u1310' | '\\u1312..\\u1315' | '\\u1318..\\u131E' | '\\u1320..\\u1346' | '\\u1348..\\u135A' | '\\u13A0..\\u13B0' | '\\u13B1..\\u13F4' | '\\u1401..\\u1676' | '\\u1681..\\u169A' | '\\u16A0..\\u16EA' | '\\u1780..\\u17B3' | '\\u1820..\\u1877' | '\\u1880..\\u18A8' | '\\u1E00..\\u1E9B' | '\\u1EA0..\\u1EE0' | '\\u1EE1..\\u1EF9' | '\\u1F00..\\u1F15' | '\\u1F18..\\u1F1D' | '\\u1F20..\\u1F39' | '\\u1F3A..\\u1F45' | '\\u1F48..\\u1F4D' | '\\u1F50..\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F..\\u1F7D' | '\\u1F80..\\u1FB4' | '\\u1FB6..\\u1FBC' | '\\u1FBE' | '\\u1FC2..\\u1FC4' | '\\u1FC6..\\u1FCC' | '\\u1FD0..\\u1FD3' | '\\u1FD6..\\u1FDB' | '\\u1FE0..\\u1FEC' | '\\u1FF2..\\u1FF4' | '\\u1FF6..\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A..\\u2113' | '\\u2115' | '\\u2119..\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A..\\u212D' | '\\u212F..\\u2131' | '\\u2133..\\u2139' | '\\u2160..\\u2183' | '\\u3005..\\u3007' | '\\u3021..\\u3029' | '\\u3031..\\u3035' | '\\u3038..\\u303A' | '\\u3041..\\u3094' | '\\u309D..\\u309E' | '\\u30A1..\\u30FA' | '\\u30FC..\\u30FE' | '\\u3105..\\u312C' | '\\u3131..\\u318E' | '\\u31A0..\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000..\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900..\\uFA2D' | '\\uFB00..\\uFB06' | '\\uFB13..\\uFB17' | '\\uFB1D' | '\\uFB1F..\\uFB28' | '\\uFB2A..\\uFB36' | '\\uFB38..\\uFB3C' | '\\uFB3E' | '\\uFB40..\\uFB41' | '\\uFB43..\\uFB44' | '\\uFB46..\\uFBB1' | '\\uFBD3..\\uFD3D' | '\\uFD50..\\uFD8F' | '\\uFD92..\\uFDC7' | '\\uFDF0..\\uFDFB' | '\\uFE70..\\uFE72' | '\\uFE74' | '\\uFE76..\\uFEFC' | '\\uFF21..\\uFF3A' | '\\uFF41..\\uFF5A' | '\\uFF66..\\uFFBE' | '\\uFFC2..\\uFFC7' | '\\uFFCA..\\uFFCF' | '\\uFFD2..\\uFFD7' | '\\uFFDA..\\uFFDC' )
            {
            // InternalGo.g:13051:32: ( 'A..Z' | 'a..z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0..\\u00D6' | '\\u00D8..\\u00F6' | '\\u00F8..\\u021F' | '\\u0222..\\u0233' | '\\u0250..\\u02AD' | '\\u02B0..\\u02B8' | '\\u02BB..\\u02C1' | '\\u02D0..\\u02D1' | '\\u02E0..\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388..\\u038A' | '\\u038C' | '\\u038E..\\u03A1' | '\\u03A3..\\u03CE' | '\\u03D0..\\u03D7' | '\\u03DA..\\u03F3' | '\\u0400..\\u0481' | '\\u048C..\\u04C4' | '\\u04C7..\\u04C8' | '\\u04CB..\\u04CC' | '\\u04D0..\\u04F5' | '\\u04F8..\\u04F9' | '\\u0531..\\u0556' | '\\u0559' | '\\u0561..\\u0587' | '\\u05D0..\\u05EA' | '\\u05F0..\\u05F2' | '\\u0621..\\u063A' | '\\u0640..\\u064A' | '\\u0671..\\u06D3' | '\\u06D5' | '\\u06E5..\\u06E6' | '\\u06FA..\\u06FC' | '\\u0710' | '\\u0712..\\u072C' | '\\u0780..\\u07A5' | '\\u0905..\\u0939' | '\\u093D' | '\\u0950' | '\\u0958..\\u0961' | '\\u0985..\\u098C' | '\\u098F..\\u0990' | '\\u0993..\\u09A8' | '\\u09AA..\\u09B0' | '\\u09B2' | '\\u09B6..\\u09B9' | '\\u09DC..\\u09DD' | '\\u09DF..\\u09E1' | '\\u09F0..\\u09F1' | '\\u0A05..\\u0A0A' | '\\u0A0F..\\u0A10' | '\\u0A13..\\u0A28' | '\\u0A2A..\\u0A30' | '\\u0A32..\\u0A33' | '\\u0A35..\\u0A36' | '\\u0A38..\\u0A39' | '\\u0A59..\\u0A5C' | '\\u0A5E' | '\\u0A72..\\u0A74' | '\\u0A85..\\u0A8B' | '\\u0A8D' | '\\u0A8F..\\u0A91' | '\\u0A93..\\u0AA8' | '\\u0AAA..\\u0AB0' | '\\u0AB2..\\u0AB3' | '\\u0AB5..\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05..\\u0B0C' | '\\u0B0F..\\u0B10' | '\\u0B13..\\u0B28' | '\\u0B2A..\\u0B30' | '\\u0B32..\\u0B33' | '\\u0B36..\\u0B39' | '\\u0B3D' | '\\u0B5C..\\u0B5D' | '\\u0B5F..\\u0B61' | '\\u0B85..\\u0B8A' | '\\u0B8E..\\u0B90' | '\\u0B92..\\u0B95' | '\\u0B99..\\u0B9A' | '\\u0B9C' | '\\u0B9E..\\u0B9F' | '\\u0BA3..\\u0BA4' | '\\u0BA8..\\u0BAA' | '\\u0BAE..\\u0BB5' | '\\u0BB7..\\u0BB9' | '\\u0C05..\\u0C0C' | '\\u0C0E..\\u0C10' | '\\u0C12..\\u0C28' | '\\u0C2A..\\u0C33' | '\\u0C35..\\u0C39' | '\\u0C60..\\u0C61' | '\\u0C85..\\u0C8C' | '\\u0C8E..\\u0C90' | '\\u0C92..\\u0CA8' | '\\u0CAA..\\u0CB3' | '\\u0CB5..\\u0CB9' | '\\u0CDE' | '\\u0CE0..\\u0CE1' | '\\u0D05..\\u0D0C' | '\\u0D0E..\\u0D10' | '\\u0D12..\\u0D28' | '\\u0D2A..\\u0D39' | '\\u0D60..\\u0D61' | '\\u0D85..\\u0D96' | '\\u0D9A..\\u0DB1' | '\\u0DB3..\\u0DBB' | '\\u0DBD' | '\\u0DC0..\\u0DC6' | '\\u0E01..\\u0E30' | '\\u0E32..\\u0E33' | '\\u0E40..\\u0E46' | '\\u0E81..\\u0E82' | '\\u0E84' | '\\u0E87..\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94..\\u0E97' | '\\u0E99..\\u0E9F' | '\\u0EA1..\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA..\\u0EAB' | '\\u0EAD..\\u0EB0' | '\\u0EB2..\\u0EB3' | '\\u0EBD..\\u0EC4' | '\\u0EC6' | '\\u0EDC..\\u0EDD' | '\\u0F00' | '\\u0F40..\\u0F6A' | '\\u0F88..\\u0F8B' | '\\u1000..\\u1021' | '\\u1023..\\u1027' | '\\u1029..\\u102A' | '\\u1050..\\u1055' | '\\u10A0..\\u10C5' | '\\u10D0..\\u10F6' | '\\u1100..\\u1159' | '\\u115F..\\u11A2' | '\\u11A8..\\u11F9' | '\\u1200..\\u1206' | '\\u1208..\\u1246' | '\\u1248' | '\\u124A..\\u124D' | '\\u1250..\\u1256' | '\\u1258' | '\\u125A..\\u125D' | '\\u1260..\\u1286' | '\\u1288' | '\\u128A..\\u128D' | '\\u1290..\\u12AE' | '\\u12B0' | '\\u12B2..\\u12B5' | '\\u12B8..\\u12BE' | '\\u12C0' | '\\u12C2..\\u12C5' | '\\u12C8..\\u12CE' | '\\u12D0..\\u12D6' | '\\u12D8..\\u12EE' | '\\u12F0..\\u130E' | '\\u1310' | '\\u1312..\\u1315' | '\\u1318..\\u131E' | '\\u1320..\\u1346' | '\\u1348..\\u135A' | '\\u13A0..\\u13B0' | '\\u13B1..\\u13F4' | '\\u1401..\\u1676' | '\\u1681..\\u169A' | '\\u16A0..\\u16EA' | '\\u1780..\\u17B3' | '\\u1820..\\u1877' | '\\u1880..\\u18A8' | '\\u1E00..\\u1E9B' | '\\u1EA0..\\u1EE0' | '\\u1EE1..\\u1EF9' | '\\u1F00..\\u1F15' | '\\u1F18..\\u1F1D' | '\\u1F20..\\u1F39' | '\\u1F3A..\\u1F45' | '\\u1F48..\\u1F4D' | '\\u1F50..\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F..\\u1F7D' | '\\u1F80..\\u1FB4' | '\\u1FB6..\\u1FBC' | '\\u1FBE' | '\\u1FC2..\\u1FC4' | '\\u1FC6..\\u1FCC' | '\\u1FD0..\\u1FD3' | '\\u1FD6..\\u1FDB' | '\\u1FE0..\\u1FEC' | '\\u1FF2..\\u1FF4' | '\\u1FF6..\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A..\\u2113' | '\\u2115' | '\\u2119..\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A..\\u212D' | '\\u212F..\\u2131' | '\\u2133..\\u2139' | '\\u2160..\\u2183' | '\\u3005..\\u3007' | '\\u3021..\\u3029' | '\\u3031..\\u3035' | '\\u3038..\\u303A' | '\\u3041..\\u3094' | '\\u309D..\\u309E' | '\\u30A1..\\u30FA' | '\\u30FC..\\u30FE' | '\\u3105..\\u312C' | '\\u3131..\\u318E' | '\\u31A0..\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000..\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900..\\uFA2D' | '\\uFB00..\\uFB06' | '\\uFB13..\\uFB17' | '\\uFB1D' | '\\uFB1F..\\uFB28' | '\\uFB2A..\\uFB36' | '\\uFB38..\\uFB3C' | '\\uFB3E' | '\\uFB40..\\uFB41' | '\\uFB43..\\uFB44' | '\\uFB46..\\uFBB1' | '\\uFBD3..\\uFD3D' | '\\uFD50..\\uFD8F' | '\\uFD92..\\uFDC7' | '\\uFDF0..\\uFDFB' | '\\uFE70..\\uFE72' | '\\uFE74' | '\\uFE76..\\uFEFC' | '\\uFF21..\\uFF3A' | '\\uFF41..\\uFF5A' | '\\uFF66..\\uFFBE' | '\\uFFC2..\\uFFC7' | '\\uFFCA..\\uFFCF' | '\\uFFD2..\\uFFD7' | '\\uFFDA..\\uFFDC' )
            int alt25=261;
            switch ( input.LA(1) ) {
            case 'A':
                {
                alt25=1;
                }
                break;
            case 'a':
                {
                alt25=2;
                }
                break;
            case '\u00AA':
                {
                alt25=3;
                }
                break;
            case '\u00B5':
                {
                alt25=4;
                }
                break;
            case '\u00BA':
                {
                alt25=5;
                }
                break;
            case '\u00C0':
                {
                alt25=6;
                }
                break;
            case '\u00D8':
                {
                alt25=7;
                }
                break;
            case '\u00F8':
                {
                alt25=8;
                }
                break;
            case '\u0222':
                {
                alt25=9;
                }
                break;
            case '\u0250':
                {
                alt25=10;
                }
                break;
            case '\u02B0':
                {
                alt25=11;
                }
                break;
            case '\u02BB':
                {
                alt25=12;
                }
                break;
            case '\u02D0':
                {
                alt25=13;
                }
                break;
            case '\u02E0':
                {
                alt25=14;
                }
                break;
            case '\u02EE':
                {
                alt25=15;
                }
                break;
            case '\u037A':
                {
                alt25=16;
                }
                break;
            case '\u0386':
                {
                alt25=17;
                }
                break;
            case '\u0388':
                {
                alt25=18;
                }
                break;
            case '\u038C':
                {
                alt25=19;
                }
                break;
            case '\u038E':
                {
                alt25=20;
                }
                break;
            case '\u03A3':
                {
                alt25=21;
                }
                break;
            case '\u03D0':
                {
                alt25=22;
                }
                break;
            case '\u03DA':
                {
                alt25=23;
                }
                break;
            case '\u0400':
                {
                alt25=24;
                }
                break;
            case '\u048C':
                {
                alt25=25;
                }
                break;
            case '\u04C7':
                {
                alt25=26;
                }
                break;
            case '\u04CB':
                {
                alt25=27;
                }
                break;
            case '\u04D0':
                {
                alt25=28;
                }
                break;
            case '\u04F8':
                {
                alt25=29;
                }
                break;
            case '\u0531':
                {
                alt25=30;
                }
                break;
            case '\u0559':
                {
                alt25=31;
                }
                break;
            case '\u0561':
                {
                alt25=32;
                }
                break;
            case '\u05D0':
                {
                alt25=33;
                }
                break;
            case '\u05F0':
                {
                alt25=34;
                }
                break;
            case '\u0621':
                {
                alt25=35;
                }
                break;
            case '\u0640':
                {
                alt25=36;
                }
                break;
            case '\u0671':
                {
                alt25=37;
                }
                break;
            case '\u06D5':
                {
                alt25=38;
                }
                break;
            case '\u06E5':
                {
                alt25=39;
                }
                break;
            case '\u06FA':
                {
                alt25=40;
                }
                break;
            case '\u0710':
                {
                alt25=41;
                }
                break;
            case '\u0712':
                {
                alt25=42;
                }
                break;
            case '\u0780':
                {
                alt25=43;
                }
                break;
            case '\u0905':
                {
                alt25=44;
                }
                break;
            case '\u093D':
                {
                alt25=45;
                }
                break;
            case '\u0950':
                {
                alt25=46;
                }
                break;
            case '\u0958':
                {
                alt25=47;
                }
                break;
            case '\u0985':
                {
                alt25=48;
                }
                break;
            case '\u098F':
                {
                alt25=49;
                }
                break;
            case '\u0993':
                {
                alt25=50;
                }
                break;
            case '\u09AA':
                {
                alt25=51;
                }
                break;
            case '\u09B2':
                {
                alt25=52;
                }
                break;
            case '\u09B6':
                {
                alt25=53;
                }
                break;
            case '\u09DC':
                {
                alt25=54;
                }
                break;
            case '\u09DF':
                {
                alt25=55;
                }
                break;
            case '\u09F0':
                {
                alt25=56;
                }
                break;
            case '\u0A05':
                {
                alt25=57;
                }
                break;
            case '\u0A0F':
                {
                alt25=58;
                }
                break;
            case '\u0A13':
                {
                alt25=59;
                }
                break;
            case '\u0A2A':
                {
                alt25=60;
                }
                break;
            case '\u0A32':
                {
                alt25=61;
                }
                break;
            case '\u0A35':
                {
                alt25=62;
                }
                break;
            case '\u0A38':
                {
                alt25=63;
                }
                break;
            case '\u0A59':
                {
                alt25=64;
                }
                break;
            case '\u0A5E':
                {
                alt25=65;
                }
                break;
            case '\u0A72':
                {
                alt25=66;
                }
                break;
            case '\u0A85':
                {
                alt25=67;
                }
                break;
            case '\u0A8D':
                {
                alt25=68;
                }
                break;
            case '\u0A8F':
                {
                alt25=69;
                }
                break;
            case '\u0A93':
                {
                alt25=70;
                }
                break;
            case '\u0AAA':
                {
                alt25=71;
                }
                break;
            case '\u0AB2':
                {
                alt25=72;
                }
                break;
            case '\u0AB5':
                {
                alt25=73;
                }
                break;
            case '\u0ABD':
                {
                alt25=74;
                }
                break;
            case '\u0AD0':
                {
                alt25=75;
                }
                break;
            case '\u0AE0':
                {
                alt25=76;
                }
                break;
            case '\u0B05':
                {
                alt25=77;
                }
                break;
            case '\u0B0F':
                {
                alt25=78;
                }
                break;
            case '\u0B13':
                {
                alt25=79;
                }
                break;
            case '\u0B2A':
                {
                alt25=80;
                }
                break;
            case '\u0B32':
                {
                alt25=81;
                }
                break;
            case '\u0B36':
                {
                alt25=82;
                }
                break;
            case '\u0B3D':
                {
                alt25=83;
                }
                break;
            case '\u0B5C':
                {
                alt25=84;
                }
                break;
            case '\u0B5F':
                {
                alt25=85;
                }
                break;
            case '\u0B85':
                {
                alt25=86;
                }
                break;
            case '\u0B8E':
                {
                alt25=87;
                }
                break;
            case '\u0B92':
                {
                alt25=88;
                }
                break;
            case '\u0B99':
                {
                alt25=89;
                }
                break;
            case '\u0B9C':
                {
                alt25=90;
                }
                break;
            case '\u0B9E':
                {
                alt25=91;
                }
                break;
            case '\u0BA3':
                {
                alt25=92;
                }
                break;
            case '\u0BA8':
                {
                alt25=93;
                }
                break;
            case '\u0BAE':
                {
                alt25=94;
                }
                break;
            case '\u0BB7':
                {
                alt25=95;
                }
                break;
            case '\u0C05':
                {
                alt25=96;
                }
                break;
            case '\u0C0E':
                {
                alt25=97;
                }
                break;
            case '\u0C12':
                {
                alt25=98;
                }
                break;
            case '\u0C2A':
                {
                alt25=99;
                }
                break;
            case '\u0C35':
                {
                alt25=100;
                }
                break;
            case '\u0C60':
                {
                alt25=101;
                }
                break;
            case '\u0C85':
                {
                alt25=102;
                }
                break;
            case '\u0C8E':
                {
                alt25=103;
                }
                break;
            case '\u0C92':
                {
                alt25=104;
                }
                break;
            case '\u0CAA':
                {
                alt25=105;
                }
                break;
            case '\u0CB5':
                {
                alt25=106;
                }
                break;
            case '\u0CDE':
                {
                alt25=107;
                }
                break;
            case '\u0CE0':
                {
                alt25=108;
                }
                break;
            case '\u0D05':
                {
                alt25=109;
                }
                break;
            case '\u0D0E':
                {
                alt25=110;
                }
                break;
            case '\u0D12':
                {
                alt25=111;
                }
                break;
            case '\u0D2A':
                {
                alt25=112;
                }
                break;
            case '\u0D60':
                {
                alt25=113;
                }
                break;
            case '\u0D85':
                {
                alt25=114;
                }
                break;
            case '\u0D9A':
                {
                alt25=115;
                }
                break;
            case '\u0DB3':
                {
                alt25=116;
                }
                break;
            case '\u0DBD':
                {
                alt25=117;
                }
                break;
            case '\u0DC0':
                {
                alt25=118;
                }
                break;
            case '\u0E01':
                {
                alt25=119;
                }
                break;
            case '\u0E32':
                {
                alt25=120;
                }
                break;
            case '\u0E40':
                {
                alt25=121;
                }
                break;
            case '\u0E81':
                {
                alt25=122;
                }
                break;
            case '\u0E84':
                {
                alt25=123;
                }
                break;
            case '\u0E87':
                {
                alt25=124;
                }
                break;
            case '\u0E8A':
                {
                alt25=125;
                }
                break;
            case '\u0E8D':
                {
                alt25=126;
                }
                break;
            case '\u0E94':
                {
                alt25=127;
                }
                break;
            case '\u0E99':
                {
                alt25=128;
                }
                break;
            case '\u0EA1':
                {
                alt25=129;
                }
                break;
            case '\u0EA5':
                {
                alt25=130;
                }
                break;
            case '\u0EA7':
                {
                alt25=131;
                }
                break;
            case '\u0EAA':
                {
                alt25=132;
                }
                break;
            case '\u0EAD':
                {
                alt25=133;
                }
                break;
            case '\u0EB2':
                {
                alt25=134;
                }
                break;
            case '\u0EBD':
                {
                alt25=135;
                }
                break;
            case '\u0EC6':
                {
                alt25=136;
                }
                break;
            case '\u0EDC':
                {
                alt25=137;
                }
                break;
            case '\u0F00':
                {
                alt25=138;
                }
                break;
            case '\u0F40':
                {
                alt25=139;
                }
                break;
            case '\u0F88':
                {
                alt25=140;
                }
                break;
            case '\u1000':
                {
                alt25=141;
                }
                break;
            case '\u1023':
                {
                alt25=142;
                }
                break;
            case '\u1029':
                {
                alt25=143;
                }
                break;
            case '\u1050':
                {
                alt25=144;
                }
                break;
            case '\u10A0':
                {
                alt25=145;
                }
                break;
            case '\u10D0':
                {
                alt25=146;
                }
                break;
            case '\u1100':
                {
                alt25=147;
                }
                break;
            case '\u115F':
                {
                alt25=148;
                }
                break;
            case '\u11A8':
                {
                alt25=149;
                }
                break;
            case '\u1200':
                {
                alt25=150;
                }
                break;
            case '\u1208':
                {
                alt25=151;
                }
                break;
            case '\u1248':
                {
                alt25=152;
                }
                break;
            case '\u124A':
                {
                alt25=153;
                }
                break;
            case '\u1250':
                {
                alt25=154;
                }
                break;
            case '\u1258':
                {
                alt25=155;
                }
                break;
            case '\u125A':
                {
                alt25=156;
                }
                break;
            case '\u1260':
                {
                alt25=157;
                }
                break;
            case '\u1288':
                {
                alt25=158;
                }
                break;
            case '\u128A':
                {
                alt25=159;
                }
                break;
            case '\u1290':
                {
                alt25=160;
                }
                break;
            case '\u12B0':
                {
                alt25=161;
                }
                break;
            case '\u12B2':
                {
                alt25=162;
                }
                break;
            case '\u12B8':
                {
                alt25=163;
                }
                break;
            case '\u12C0':
                {
                alt25=164;
                }
                break;
            case '\u12C2':
                {
                alt25=165;
                }
                break;
            case '\u12C8':
                {
                alt25=166;
                }
                break;
            case '\u12D0':
                {
                alt25=167;
                }
                break;
            case '\u12D8':
                {
                alt25=168;
                }
                break;
            case '\u12F0':
                {
                alt25=169;
                }
                break;
            case '\u1310':
                {
                alt25=170;
                }
                break;
            case '\u1312':
                {
                alt25=171;
                }
                break;
            case '\u1318':
                {
                alt25=172;
                }
                break;
            case '\u1320':
                {
                alt25=173;
                }
                break;
            case '\u1348':
                {
                alt25=174;
                }
                break;
            case '\u13A0':
                {
                alt25=175;
                }
                break;
            case '\u13B1':
                {
                alt25=176;
                }
                break;
            case '\u1401':
                {
                alt25=177;
                }
                break;
            case '\u1681':
                {
                alt25=178;
                }
                break;
            case '\u16A0':
                {
                alt25=179;
                }
                break;
            case '\u1780':
                {
                alt25=180;
                }
                break;
            case '\u1820':
                {
                alt25=181;
                }
                break;
            case '\u1880':
                {
                alt25=182;
                }
                break;
            case '\u1E00':
                {
                alt25=183;
                }
                break;
            case '\u1EA0':
                {
                alt25=184;
                }
                break;
            case '\u1EE1':
                {
                alt25=185;
                }
                break;
            case '\u1F00':
                {
                alt25=186;
                }
                break;
            case '\u1F18':
                {
                alt25=187;
                }
                break;
            case '\u1F20':
                {
                alt25=188;
                }
                break;
            case '\u1F3A':
                {
                alt25=189;
                }
                break;
            case '\u1F48':
                {
                alt25=190;
                }
                break;
            case '\u1F50':
                {
                alt25=191;
                }
                break;
            case '\u1F59':
                {
                alt25=192;
                }
                break;
            case '\u1F5B':
                {
                alt25=193;
                }
                break;
            case '\u1F5D':
                {
                alt25=194;
                }
                break;
            case '\u1F5F':
                {
                alt25=195;
                }
                break;
            case '\u1F80':
                {
                alt25=196;
                }
                break;
            case '\u1FB6':
                {
                alt25=197;
                }
                break;
            case '\u1FBE':
                {
                alt25=198;
                }
                break;
            case '\u1FC2':
                {
                alt25=199;
                }
                break;
            case '\u1FC6':
                {
                alt25=200;
                }
                break;
            case '\u1FD0':
                {
                alt25=201;
                }
                break;
            case '\u1FD6':
                {
                alt25=202;
                }
                break;
            case '\u1FE0':
                {
                alt25=203;
                }
                break;
            case '\u1FF2':
                {
                alt25=204;
                }
                break;
            case '\u1FF6':
                {
                alt25=205;
                }
                break;
            case '\u207F':
                {
                alt25=206;
                }
                break;
            case '\u2102':
                {
                alt25=207;
                }
                break;
            case '\u2107':
                {
                alt25=208;
                }
                break;
            case '\u210A':
                {
                alt25=209;
                }
                break;
            case '\u2115':
                {
                alt25=210;
                }
                break;
            case '\u2119':
                {
                alt25=211;
                }
                break;
            case '\u2124':
                {
                alt25=212;
                }
                break;
            case '\u2126':
                {
                alt25=213;
                }
                break;
            case '\u2128':
                {
                alt25=214;
                }
                break;
            case '\u212A':
                {
                alt25=215;
                }
                break;
            case '\u212F':
                {
                alt25=216;
                }
                break;
            case '\u2133':
                {
                alt25=217;
                }
                break;
            case '\u2160':
                {
                alt25=218;
                }
                break;
            case '\u3005':
                {
                alt25=219;
                }
                break;
            case '\u3021':
                {
                alt25=220;
                }
                break;
            case '\u3031':
                {
                alt25=221;
                }
                break;
            case '\u3038':
                {
                alt25=222;
                }
                break;
            case '\u3041':
                {
                alt25=223;
                }
                break;
            case '\u309D':
                {
                alt25=224;
                }
                break;
            case '\u30A1':
                {
                alt25=225;
                }
                break;
            case '\u30FC':
                {
                alt25=226;
                }
                break;
            case '\u3105':
                {
                alt25=227;
                }
                break;
            case '\u3131':
                {
                alt25=228;
                }
                break;
            case '\u31A0':
                {
                alt25=229;
                }
                break;
            case '\u3400':
                {
                alt25=230;
                }
                break;
            case '\u4DB5':
                {
                alt25=231;
                }
                break;
            case '\u4E00':
                {
                alt25=232;
                }
                break;
            case '\u9FA5':
                {
                alt25=233;
                }
                break;
            case '\uA000':
                {
                alt25=234;
                }
                break;
            case '\uAC00':
                {
                alt25=235;
                }
                break;
            case '\uD7A3':
                {
                alt25=236;
                }
                break;
            case '\uF900':
                {
                alt25=237;
                }
                break;
            case '\uFB00':
                {
                alt25=238;
                }
                break;
            case '\uFB13':
                {
                alt25=239;
                }
                break;
            case '\uFB1D':
                {
                alt25=240;
                }
                break;
            case '\uFB1F':
                {
                alt25=241;
                }
                break;
            case '\uFB2A':
                {
                alt25=242;
                }
                break;
            case '\uFB38':
                {
                alt25=243;
                }
                break;
            case '\uFB3E':
                {
                alt25=244;
                }
                break;
            case '\uFB40':
                {
                alt25=245;
                }
                break;
            case '\uFB43':
                {
                alt25=246;
                }
                break;
            case '\uFB46':
                {
                alt25=247;
                }
                break;
            case '\uFBD3':
                {
                alt25=248;
                }
                break;
            case '\uFD50':
                {
                alt25=249;
                }
                break;
            case '\uFD92':
                {
                alt25=250;
                }
                break;
            case '\uFDF0':
                {
                alt25=251;
                }
                break;
            case '\uFE70':
                {
                alt25=252;
                }
                break;
            case '\uFE74':
                {
                alt25=253;
                }
                break;
            case '\uFE76':
                {
                alt25=254;
                }
                break;
            case '\uFF21':
                {
                alt25=255;
                }
                break;
            case '\uFF41':
                {
                alt25=256;
                }
                break;
            case '\uFF66':
                {
                alt25=257;
                }
                break;
            case '\uFFC2':
                {
                alt25=258;
                }
                break;
            case '\uFFCA':
                {
                alt25=259;
                }
                break;
            case '\uFFD2':
                {
                alt25=260;
                }
                break;
            case '\uFFDA':
                {
                alt25=261;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalGo.g:13051:33: 'A..Z'
                    {
                    match("A..Z"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:13051:40: 'a..z'
                    {
                    match("a..z"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:13051:47: '\\u00AA'
                    {
                    match('\u00AA'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:13051:56: '\\u00B5'
                    {
                    match('\u00B5'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:13051:65: '\\u00BA'
                    {
                    match('\u00BA'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:13051:74: '\\u00C0..\\u00D6'
                    {
                    match("\u00C0..\u00D6"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:13051:91: '\\u00D8..\\u00F6'
                    {
                    match("\u00D8..\u00F6"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:13051:108: '\\u00F8..\\u021F'
                    {
                    match("\u00F8..\u021F"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:13051:125: '\\u0222..\\u0233'
                    {
                    match("\u0222..\u0233"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:13051:142: '\\u0250..\\u02AD'
                    {
                    match("\u0250..\u02AD"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:13051:159: '\\u02B0..\\u02B8'
                    {
                    match("\u02B0..\u02B8"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:13051:176: '\\u02BB..\\u02C1'
                    {
                    match("\u02BB..\u02C1"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:13051:193: '\\u02D0..\\u02D1'
                    {
                    match("\u02D0..\u02D1"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:13051:210: '\\u02E0..\\u02E4'
                    {
                    match("\u02E0..\u02E4"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:13051:227: '\\u02EE'
                    {
                    match('\u02EE'); 

                    }
                    break;
                case 16 :
                    // InternalGo.g:13051:236: '\\u037A'
                    {
                    match('\u037A'); 

                    }
                    break;
                case 17 :
                    // InternalGo.g:13051:245: '\\u0386'
                    {
                    match('\u0386'); 

                    }
                    break;
                case 18 :
                    // InternalGo.g:13051:254: '\\u0388..\\u038A'
                    {
                    match("\u0388..\u038A"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:13051:271: '\\u038C'
                    {
                    match('\u038C'); 

                    }
                    break;
                case 20 :
                    // InternalGo.g:13051:280: '\\u038E..\\u03A1'
                    {
                    match("\u038E..\u03A1"); 


                    }
                    break;
                case 21 :
                    // InternalGo.g:13051:297: '\\u03A3..\\u03CE'
                    {
                    match("\u03A3..\u03CE"); 


                    }
                    break;
                case 22 :
                    // InternalGo.g:13051:314: '\\u03D0..\\u03D7'
                    {
                    match("\u03D0..\u03D7"); 


                    }
                    break;
                case 23 :
                    // InternalGo.g:13051:331: '\\u03DA..\\u03F3'
                    {
                    match("\u03DA..\u03F3"); 


                    }
                    break;
                case 24 :
                    // InternalGo.g:13051:348: '\\u0400..\\u0481'
                    {
                    match("\u0400..\u0481"); 


                    }
                    break;
                case 25 :
                    // InternalGo.g:13051:365: '\\u048C..\\u04C4'
                    {
                    match("\u048C..\u04C4"); 


                    }
                    break;
                case 26 :
                    // InternalGo.g:13051:382: '\\u04C7..\\u04C8'
                    {
                    match("\u04C7..\u04C8"); 


                    }
                    break;
                case 27 :
                    // InternalGo.g:13051:399: '\\u04CB..\\u04CC'
                    {
                    match("\u04CB..\u04CC"); 


                    }
                    break;
                case 28 :
                    // InternalGo.g:13051:416: '\\u04D0..\\u04F5'
                    {
                    match("\u04D0..\u04F5"); 


                    }
                    break;
                case 29 :
                    // InternalGo.g:13051:433: '\\u04F8..\\u04F9'
                    {
                    match("\u04F8..\u04F9"); 


                    }
                    break;
                case 30 :
                    // InternalGo.g:13051:450: '\\u0531..\\u0556'
                    {
                    match("\u0531..\u0556"); 


                    }
                    break;
                case 31 :
                    // InternalGo.g:13051:467: '\\u0559'
                    {
                    match('\u0559'); 

                    }
                    break;
                case 32 :
                    // InternalGo.g:13051:476: '\\u0561..\\u0587'
                    {
                    match("\u0561..\u0587"); 


                    }
                    break;
                case 33 :
                    // InternalGo.g:13051:493: '\\u05D0..\\u05EA'
                    {
                    match("\u05D0..\u05EA"); 


                    }
                    break;
                case 34 :
                    // InternalGo.g:13051:510: '\\u05F0..\\u05F2'
                    {
                    match("\u05F0..\u05F2"); 


                    }
                    break;
                case 35 :
                    // InternalGo.g:13051:527: '\\u0621..\\u063A'
                    {
                    match("\u0621..\u063A"); 


                    }
                    break;
                case 36 :
                    // InternalGo.g:13051:544: '\\u0640..\\u064A'
                    {
                    match("\u0640..\u064A"); 


                    }
                    break;
                case 37 :
                    // InternalGo.g:13051:561: '\\u0671..\\u06D3'
                    {
                    match("\u0671..\u06D3"); 


                    }
                    break;
                case 38 :
                    // InternalGo.g:13051:578: '\\u06D5'
                    {
                    match('\u06D5'); 

                    }
                    break;
                case 39 :
                    // InternalGo.g:13051:587: '\\u06E5..\\u06E6'
                    {
                    match("\u06E5..\u06E6"); 


                    }
                    break;
                case 40 :
                    // InternalGo.g:13051:604: '\\u06FA..\\u06FC'
                    {
                    match("\u06FA..\u06FC"); 


                    }
                    break;
                case 41 :
                    // InternalGo.g:13051:621: '\\u0710'
                    {
                    match('\u0710'); 

                    }
                    break;
                case 42 :
                    // InternalGo.g:13051:630: '\\u0712..\\u072C'
                    {
                    match("\u0712..\u072C"); 


                    }
                    break;
                case 43 :
                    // InternalGo.g:13051:647: '\\u0780..\\u07A5'
                    {
                    match("\u0780..\u07A5"); 


                    }
                    break;
                case 44 :
                    // InternalGo.g:13051:664: '\\u0905..\\u0939'
                    {
                    match("\u0905..\u0939"); 


                    }
                    break;
                case 45 :
                    // InternalGo.g:13051:681: '\\u093D'
                    {
                    match('\u093D'); 

                    }
                    break;
                case 46 :
                    // InternalGo.g:13051:690: '\\u0950'
                    {
                    match('\u0950'); 

                    }
                    break;
                case 47 :
                    // InternalGo.g:13051:699: '\\u0958..\\u0961'
                    {
                    match("\u0958..\u0961"); 


                    }
                    break;
                case 48 :
                    // InternalGo.g:13051:716: '\\u0985..\\u098C'
                    {
                    match("\u0985..\u098C"); 


                    }
                    break;
                case 49 :
                    // InternalGo.g:13051:733: '\\u098F..\\u0990'
                    {
                    match("\u098F..\u0990"); 


                    }
                    break;
                case 50 :
                    // InternalGo.g:13051:750: '\\u0993..\\u09A8'
                    {
                    match("\u0993..\u09A8"); 


                    }
                    break;
                case 51 :
                    // InternalGo.g:13051:767: '\\u09AA..\\u09B0'
                    {
                    match("\u09AA..\u09B0"); 


                    }
                    break;
                case 52 :
                    // InternalGo.g:13051:784: '\\u09B2'
                    {
                    match('\u09B2'); 

                    }
                    break;
                case 53 :
                    // InternalGo.g:13051:793: '\\u09B6..\\u09B9'
                    {
                    match("\u09B6..\u09B9"); 


                    }
                    break;
                case 54 :
                    // InternalGo.g:13051:810: '\\u09DC..\\u09DD'
                    {
                    match("\u09DC..\u09DD"); 


                    }
                    break;
                case 55 :
                    // InternalGo.g:13051:827: '\\u09DF..\\u09E1'
                    {
                    match("\u09DF..\u09E1"); 


                    }
                    break;
                case 56 :
                    // InternalGo.g:13051:844: '\\u09F0..\\u09F1'
                    {
                    match("\u09F0..\u09F1"); 


                    }
                    break;
                case 57 :
                    // InternalGo.g:13051:861: '\\u0A05..\\u0A0A'
                    {
                    match("\u0A05..\u0A0A"); 


                    }
                    break;
                case 58 :
                    // InternalGo.g:13051:878: '\\u0A0F..\\u0A10'
                    {
                    match("\u0A0F..\u0A10"); 


                    }
                    break;
                case 59 :
                    // InternalGo.g:13051:895: '\\u0A13..\\u0A28'
                    {
                    match("\u0A13..\u0A28"); 


                    }
                    break;
                case 60 :
                    // InternalGo.g:13051:912: '\\u0A2A..\\u0A30'
                    {
                    match("\u0A2A..\u0A30"); 


                    }
                    break;
                case 61 :
                    // InternalGo.g:13051:929: '\\u0A32..\\u0A33'
                    {
                    match("\u0A32..\u0A33"); 


                    }
                    break;
                case 62 :
                    // InternalGo.g:13051:946: '\\u0A35..\\u0A36'
                    {
                    match("\u0A35..\u0A36"); 


                    }
                    break;
                case 63 :
                    // InternalGo.g:13051:963: '\\u0A38..\\u0A39'
                    {
                    match("\u0A38..\u0A39"); 


                    }
                    break;
                case 64 :
                    // InternalGo.g:13051:980: '\\u0A59..\\u0A5C'
                    {
                    match("\u0A59..\u0A5C"); 


                    }
                    break;
                case 65 :
                    // InternalGo.g:13051:997: '\\u0A5E'
                    {
                    match('\u0A5E'); 

                    }
                    break;
                case 66 :
                    // InternalGo.g:13051:1006: '\\u0A72..\\u0A74'
                    {
                    match("\u0A72..\u0A74"); 


                    }
                    break;
                case 67 :
                    // InternalGo.g:13051:1023: '\\u0A85..\\u0A8B'
                    {
                    match("\u0A85..\u0A8B"); 


                    }
                    break;
                case 68 :
                    // InternalGo.g:13051:1040: '\\u0A8D'
                    {
                    match('\u0A8D'); 

                    }
                    break;
                case 69 :
                    // InternalGo.g:13051:1049: '\\u0A8F..\\u0A91'
                    {
                    match("\u0A8F..\u0A91"); 


                    }
                    break;
                case 70 :
                    // InternalGo.g:13051:1066: '\\u0A93..\\u0AA8'
                    {
                    match("\u0A93..\u0AA8"); 


                    }
                    break;
                case 71 :
                    // InternalGo.g:13051:1083: '\\u0AAA..\\u0AB0'
                    {
                    match("\u0AAA..\u0AB0"); 


                    }
                    break;
                case 72 :
                    // InternalGo.g:13051:1100: '\\u0AB2..\\u0AB3'
                    {
                    match("\u0AB2..\u0AB3"); 


                    }
                    break;
                case 73 :
                    // InternalGo.g:13051:1117: '\\u0AB5..\\u0AB9'
                    {
                    match("\u0AB5..\u0AB9"); 


                    }
                    break;
                case 74 :
                    // InternalGo.g:13051:1134: '\\u0ABD'
                    {
                    match('\u0ABD'); 

                    }
                    break;
                case 75 :
                    // InternalGo.g:13051:1143: '\\u0AD0'
                    {
                    match('\u0AD0'); 

                    }
                    break;
                case 76 :
                    // InternalGo.g:13051:1152: '\\u0AE0'
                    {
                    match('\u0AE0'); 

                    }
                    break;
                case 77 :
                    // InternalGo.g:13051:1161: '\\u0B05..\\u0B0C'
                    {
                    match("\u0B05..\u0B0C"); 


                    }
                    break;
                case 78 :
                    // InternalGo.g:13051:1178: '\\u0B0F..\\u0B10'
                    {
                    match("\u0B0F..\u0B10"); 


                    }
                    break;
                case 79 :
                    // InternalGo.g:13051:1195: '\\u0B13..\\u0B28'
                    {
                    match("\u0B13..\u0B28"); 


                    }
                    break;
                case 80 :
                    // InternalGo.g:13051:1212: '\\u0B2A..\\u0B30'
                    {
                    match("\u0B2A..\u0B30"); 


                    }
                    break;
                case 81 :
                    // InternalGo.g:13051:1229: '\\u0B32..\\u0B33'
                    {
                    match("\u0B32..\u0B33"); 


                    }
                    break;
                case 82 :
                    // InternalGo.g:13051:1246: '\\u0B36..\\u0B39'
                    {
                    match("\u0B36..\u0B39"); 


                    }
                    break;
                case 83 :
                    // InternalGo.g:13051:1263: '\\u0B3D'
                    {
                    match('\u0B3D'); 

                    }
                    break;
                case 84 :
                    // InternalGo.g:13051:1272: '\\u0B5C..\\u0B5D'
                    {
                    match("\u0B5C..\u0B5D"); 


                    }
                    break;
                case 85 :
                    // InternalGo.g:13051:1289: '\\u0B5F..\\u0B61'
                    {
                    match("\u0B5F..\u0B61"); 


                    }
                    break;
                case 86 :
                    // InternalGo.g:13051:1306: '\\u0B85..\\u0B8A'
                    {
                    match("\u0B85..\u0B8A"); 


                    }
                    break;
                case 87 :
                    // InternalGo.g:13051:1323: '\\u0B8E..\\u0B90'
                    {
                    match("\u0B8E..\u0B90"); 


                    }
                    break;
                case 88 :
                    // InternalGo.g:13051:1340: '\\u0B92..\\u0B95'
                    {
                    match("\u0B92..\u0B95"); 


                    }
                    break;
                case 89 :
                    // InternalGo.g:13051:1357: '\\u0B99..\\u0B9A'
                    {
                    match("\u0B99..\u0B9A"); 


                    }
                    break;
                case 90 :
                    // InternalGo.g:13051:1374: '\\u0B9C'
                    {
                    match('\u0B9C'); 

                    }
                    break;
                case 91 :
                    // InternalGo.g:13051:1383: '\\u0B9E..\\u0B9F'
                    {
                    match("\u0B9E..\u0B9F"); 


                    }
                    break;
                case 92 :
                    // InternalGo.g:13051:1400: '\\u0BA3..\\u0BA4'
                    {
                    match("\u0BA3..\u0BA4"); 


                    }
                    break;
                case 93 :
                    // InternalGo.g:13051:1417: '\\u0BA8..\\u0BAA'
                    {
                    match("\u0BA8..\u0BAA"); 


                    }
                    break;
                case 94 :
                    // InternalGo.g:13051:1434: '\\u0BAE..\\u0BB5'
                    {
                    match("\u0BAE..\u0BB5"); 


                    }
                    break;
                case 95 :
                    // InternalGo.g:13051:1451: '\\u0BB7..\\u0BB9'
                    {
                    match("\u0BB7..\u0BB9"); 


                    }
                    break;
                case 96 :
                    // InternalGo.g:13051:1468: '\\u0C05..\\u0C0C'
                    {
                    match("\u0C05..\u0C0C"); 


                    }
                    break;
                case 97 :
                    // InternalGo.g:13051:1485: '\\u0C0E..\\u0C10'
                    {
                    match("\u0C0E..\u0C10"); 


                    }
                    break;
                case 98 :
                    // InternalGo.g:13051:1502: '\\u0C12..\\u0C28'
                    {
                    match("\u0C12..\u0C28"); 


                    }
                    break;
                case 99 :
                    // InternalGo.g:13051:1519: '\\u0C2A..\\u0C33'
                    {
                    match("\u0C2A..\u0C33"); 


                    }
                    break;
                case 100 :
                    // InternalGo.g:13051:1536: '\\u0C35..\\u0C39'
                    {
                    match("\u0C35..\u0C39"); 


                    }
                    break;
                case 101 :
                    // InternalGo.g:13051:1553: '\\u0C60..\\u0C61'
                    {
                    match("\u0C60..\u0C61"); 


                    }
                    break;
                case 102 :
                    // InternalGo.g:13051:1570: '\\u0C85..\\u0C8C'
                    {
                    match("\u0C85..\u0C8C"); 


                    }
                    break;
                case 103 :
                    // InternalGo.g:13051:1587: '\\u0C8E..\\u0C90'
                    {
                    match("\u0C8E..\u0C90"); 


                    }
                    break;
                case 104 :
                    // InternalGo.g:13051:1604: '\\u0C92..\\u0CA8'
                    {
                    match("\u0C92..\u0CA8"); 


                    }
                    break;
                case 105 :
                    // InternalGo.g:13051:1621: '\\u0CAA..\\u0CB3'
                    {
                    match("\u0CAA..\u0CB3"); 


                    }
                    break;
                case 106 :
                    // InternalGo.g:13051:1638: '\\u0CB5..\\u0CB9'
                    {
                    match("\u0CB5..\u0CB9"); 


                    }
                    break;
                case 107 :
                    // InternalGo.g:13051:1655: '\\u0CDE'
                    {
                    match('\u0CDE'); 

                    }
                    break;
                case 108 :
                    // InternalGo.g:13051:1664: '\\u0CE0..\\u0CE1'
                    {
                    match("\u0CE0..\u0CE1"); 


                    }
                    break;
                case 109 :
                    // InternalGo.g:13051:1681: '\\u0D05..\\u0D0C'
                    {
                    match("\u0D05..\u0D0C"); 


                    }
                    break;
                case 110 :
                    // InternalGo.g:13051:1698: '\\u0D0E..\\u0D10'
                    {
                    match("\u0D0E..\u0D10"); 


                    }
                    break;
                case 111 :
                    // InternalGo.g:13051:1715: '\\u0D12..\\u0D28'
                    {
                    match("\u0D12..\u0D28"); 


                    }
                    break;
                case 112 :
                    // InternalGo.g:13051:1732: '\\u0D2A..\\u0D39'
                    {
                    match("\u0D2A..\u0D39"); 


                    }
                    break;
                case 113 :
                    // InternalGo.g:13051:1749: '\\u0D60..\\u0D61'
                    {
                    match("\u0D60..\u0D61"); 


                    }
                    break;
                case 114 :
                    // InternalGo.g:13051:1766: '\\u0D85..\\u0D96'
                    {
                    match("\u0D85..\u0D96"); 


                    }
                    break;
                case 115 :
                    // InternalGo.g:13051:1783: '\\u0D9A..\\u0DB1'
                    {
                    match("\u0D9A..\u0DB1"); 


                    }
                    break;
                case 116 :
                    // InternalGo.g:13051:1800: '\\u0DB3..\\u0DBB'
                    {
                    match("\u0DB3..\u0DBB"); 


                    }
                    break;
                case 117 :
                    // InternalGo.g:13051:1817: '\\u0DBD'
                    {
                    match('\u0DBD'); 

                    }
                    break;
                case 118 :
                    // InternalGo.g:13051:1826: '\\u0DC0..\\u0DC6'
                    {
                    match("\u0DC0..\u0DC6"); 


                    }
                    break;
                case 119 :
                    // InternalGo.g:13051:1843: '\\u0E01..\\u0E30'
                    {
                    match("\u0E01..\u0E30"); 


                    }
                    break;
                case 120 :
                    // InternalGo.g:13051:1860: '\\u0E32..\\u0E33'
                    {
                    match("\u0E32..\u0E33"); 


                    }
                    break;
                case 121 :
                    // InternalGo.g:13051:1877: '\\u0E40..\\u0E46'
                    {
                    match("\u0E40..\u0E46"); 


                    }
                    break;
                case 122 :
                    // InternalGo.g:13051:1894: '\\u0E81..\\u0E82'
                    {
                    match("\u0E81..\u0E82"); 


                    }
                    break;
                case 123 :
                    // InternalGo.g:13051:1911: '\\u0E84'
                    {
                    match('\u0E84'); 

                    }
                    break;
                case 124 :
                    // InternalGo.g:13051:1920: '\\u0E87..\\u0E88'
                    {
                    match("\u0E87..\u0E88"); 


                    }
                    break;
                case 125 :
                    // InternalGo.g:13051:1937: '\\u0E8A'
                    {
                    match('\u0E8A'); 

                    }
                    break;
                case 126 :
                    // InternalGo.g:13051:1946: '\\u0E8D'
                    {
                    match('\u0E8D'); 

                    }
                    break;
                case 127 :
                    // InternalGo.g:13051:1955: '\\u0E94..\\u0E97'
                    {
                    match("\u0E94..\u0E97"); 


                    }
                    break;
                case 128 :
                    // InternalGo.g:13051:1972: '\\u0E99..\\u0E9F'
                    {
                    match("\u0E99..\u0E9F"); 


                    }
                    break;
                case 129 :
                    // InternalGo.g:13051:1989: '\\u0EA1..\\u0EA3'
                    {
                    match("\u0EA1..\u0EA3"); 


                    }
                    break;
                case 130 :
                    // InternalGo.g:13051:2006: '\\u0EA5'
                    {
                    match('\u0EA5'); 

                    }
                    break;
                case 131 :
                    // InternalGo.g:13051:2015: '\\u0EA7'
                    {
                    match('\u0EA7'); 

                    }
                    break;
                case 132 :
                    // InternalGo.g:13051:2024: '\\u0EAA..\\u0EAB'
                    {
                    match("\u0EAA..\u0EAB"); 


                    }
                    break;
                case 133 :
                    // InternalGo.g:13051:2041: '\\u0EAD..\\u0EB0'
                    {
                    match("\u0EAD..\u0EB0"); 


                    }
                    break;
                case 134 :
                    // InternalGo.g:13051:2058: '\\u0EB2..\\u0EB3'
                    {
                    match("\u0EB2..\u0EB3"); 


                    }
                    break;
                case 135 :
                    // InternalGo.g:13051:2075: '\\u0EBD..\\u0EC4'
                    {
                    match("\u0EBD..\u0EC4"); 


                    }
                    break;
                case 136 :
                    // InternalGo.g:13051:2092: '\\u0EC6'
                    {
                    match('\u0EC6'); 

                    }
                    break;
                case 137 :
                    // InternalGo.g:13051:2101: '\\u0EDC..\\u0EDD'
                    {
                    match("\u0EDC..\u0EDD"); 


                    }
                    break;
                case 138 :
                    // InternalGo.g:13051:2118: '\\u0F00'
                    {
                    match('\u0F00'); 

                    }
                    break;
                case 139 :
                    // InternalGo.g:13051:2127: '\\u0F40..\\u0F6A'
                    {
                    match("\u0F40..\u0F6A"); 


                    }
                    break;
                case 140 :
                    // InternalGo.g:13051:2144: '\\u0F88..\\u0F8B'
                    {
                    match("\u0F88..\u0F8B"); 


                    }
                    break;
                case 141 :
                    // InternalGo.g:13051:2161: '\\u1000..\\u1021'
                    {
                    match("\u1000..\u1021"); 


                    }
                    break;
                case 142 :
                    // InternalGo.g:13051:2178: '\\u1023..\\u1027'
                    {
                    match("\u1023..\u1027"); 


                    }
                    break;
                case 143 :
                    // InternalGo.g:13051:2195: '\\u1029..\\u102A'
                    {
                    match("\u1029..\u102A"); 


                    }
                    break;
                case 144 :
                    // InternalGo.g:13051:2212: '\\u1050..\\u1055'
                    {
                    match("\u1050..\u1055"); 


                    }
                    break;
                case 145 :
                    // InternalGo.g:13051:2229: '\\u10A0..\\u10C5'
                    {
                    match("\u10A0..\u10C5"); 


                    }
                    break;
                case 146 :
                    // InternalGo.g:13051:2246: '\\u10D0..\\u10F6'
                    {
                    match("\u10D0..\u10F6"); 


                    }
                    break;
                case 147 :
                    // InternalGo.g:13051:2263: '\\u1100..\\u1159'
                    {
                    match("\u1100..\u1159"); 


                    }
                    break;
                case 148 :
                    // InternalGo.g:13051:2280: '\\u115F..\\u11A2'
                    {
                    match("\u115F..\u11A2"); 


                    }
                    break;
                case 149 :
                    // InternalGo.g:13051:2297: '\\u11A8..\\u11F9'
                    {
                    match("\u11A8..\u11F9"); 


                    }
                    break;
                case 150 :
                    // InternalGo.g:13051:2314: '\\u1200..\\u1206'
                    {
                    match("\u1200..\u1206"); 


                    }
                    break;
                case 151 :
                    // InternalGo.g:13051:2331: '\\u1208..\\u1246'
                    {
                    match("\u1208..\u1246"); 


                    }
                    break;
                case 152 :
                    // InternalGo.g:13051:2348: '\\u1248'
                    {
                    match('\u1248'); 

                    }
                    break;
                case 153 :
                    // InternalGo.g:13051:2357: '\\u124A..\\u124D'
                    {
                    match("\u124A..\u124D"); 


                    }
                    break;
                case 154 :
                    // InternalGo.g:13051:2374: '\\u1250..\\u1256'
                    {
                    match("\u1250..\u1256"); 


                    }
                    break;
                case 155 :
                    // InternalGo.g:13051:2391: '\\u1258'
                    {
                    match('\u1258'); 

                    }
                    break;
                case 156 :
                    // InternalGo.g:13051:2400: '\\u125A..\\u125D'
                    {
                    match("\u125A..\u125D"); 


                    }
                    break;
                case 157 :
                    // InternalGo.g:13051:2417: '\\u1260..\\u1286'
                    {
                    match("\u1260..\u1286"); 


                    }
                    break;
                case 158 :
                    // InternalGo.g:13051:2434: '\\u1288'
                    {
                    match('\u1288'); 

                    }
                    break;
                case 159 :
                    // InternalGo.g:13051:2443: '\\u128A..\\u128D'
                    {
                    match("\u128A..\u128D"); 


                    }
                    break;
                case 160 :
                    // InternalGo.g:13051:2460: '\\u1290..\\u12AE'
                    {
                    match("\u1290..\u12AE"); 


                    }
                    break;
                case 161 :
                    // InternalGo.g:13051:2477: '\\u12B0'
                    {
                    match('\u12B0'); 

                    }
                    break;
                case 162 :
                    // InternalGo.g:13051:2486: '\\u12B2..\\u12B5'
                    {
                    match("\u12B2..\u12B5"); 


                    }
                    break;
                case 163 :
                    // InternalGo.g:13051:2503: '\\u12B8..\\u12BE'
                    {
                    match("\u12B8..\u12BE"); 


                    }
                    break;
                case 164 :
                    // InternalGo.g:13051:2520: '\\u12C0'
                    {
                    match('\u12C0'); 

                    }
                    break;
                case 165 :
                    // InternalGo.g:13051:2529: '\\u12C2..\\u12C5'
                    {
                    match("\u12C2..\u12C5"); 


                    }
                    break;
                case 166 :
                    // InternalGo.g:13051:2546: '\\u12C8..\\u12CE'
                    {
                    match("\u12C8..\u12CE"); 


                    }
                    break;
                case 167 :
                    // InternalGo.g:13051:2563: '\\u12D0..\\u12D6'
                    {
                    match("\u12D0..\u12D6"); 


                    }
                    break;
                case 168 :
                    // InternalGo.g:13051:2580: '\\u12D8..\\u12EE'
                    {
                    match("\u12D8..\u12EE"); 


                    }
                    break;
                case 169 :
                    // InternalGo.g:13051:2597: '\\u12F0..\\u130E'
                    {
                    match("\u12F0..\u130E"); 


                    }
                    break;
                case 170 :
                    // InternalGo.g:13051:2614: '\\u1310'
                    {
                    match('\u1310'); 

                    }
                    break;
                case 171 :
                    // InternalGo.g:13051:2623: '\\u1312..\\u1315'
                    {
                    match("\u1312..\u1315"); 


                    }
                    break;
                case 172 :
                    // InternalGo.g:13051:2640: '\\u1318..\\u131E'
                    {
                    match("\u1318..\u131E"); 


                    }
                    break;
                case 173 :
                    // InternalGo.g:13051:2657: '\\u1320..\\u1346'
                    {
                    match("\u1320..\u1346"); 


                    }
                    break;
                case 174 :
                    // InternalGo.g:13051:2674: '\\u1348..\\u135A'
                    {
                    match("\u1348..\u135A"); 


                    }
                    break;
                case 175 :
                    // InternalGo.g:13051:2691: '\\u13A0..\\u13B0'
                    {
                    match("\u13A0..\u13B0"); 


                    }
                    break;
                case 176 :
                    // InternalGo.g:13051:2708: '\\u13B1..\\u13F4'
                    {
                    match("\u13B1..\u13F4"); 


                    }
                    break;
                case 177 :
                    // InternalGo.g:13051:2725: '\\u1401..\\u1676'
                    {
                    match("\u1401..\u1676"); 


                    }
                    break;
                case 178 :
                    // InternalGo.g:13051:2742: '\\u1681..\\u169A'
                    {
                    match("\u1681..\u169A"); 


                    }
                    break;
                case 179 :
                    // InternalGo.g:13051:2759: '\\u16A0..\\u16EA'
                    {
                    match("\u16A0..\u16EA"); 


                    }
                    break;
                case 180 :
                    // InternalGo.g:13051:2776: '\\u1780..\\u17B3'
                    {
                    match("\u1780..\u17B3"); 


                    }
                    break;
                case 181 :
                    // InternalGo.g:13051:2793: '\\u1820..\\u1877'
                    {
                    match("\u1820..\u1877"); 


                    }
                    break;
                case 182 :
                    // InternalGo.g:13051:2810: '\\u1880..\\u18A8'
                    {
                    match("\u1880..\u18A8"); 


                    }
                    break;
                case 183 :
                    // InternalGo.g:13051:2827: '\\u1E00..\\u1E9B'
                    {
                    match("\u1E00..\u1E9B"); 


                    }
                    break;
                case 184 :
                    // InternalGo.g:13051:2844: '\\u1EA0..\\u1EE0'
                    {
                    match("\u1EA0..\u1EE0"); 


                    }
                    break;
                case 185 :
                    // InternalGo.g:13051:2861: '\\u1EE1..\\u1EF9'
                    {
                    match("\u1EE1..\u1EF9"); 


                    }
                    break;
                case 186 :
                    // InternalGo.g:13051:2878: '\\u1F00..\\u1F15'
                    {
                    match("\u1F00..\u1F15"); 


                    }
                    break;
                case 187 :
                    // InternalGo.g:13051:2895: '\\u1F18..\\u1F1D'
                    {
                    match("\u1F18..\u1F1D"); 


                    }
                    break;
                case 188 :
                    // InternalGo.g:13051:2912: '\\u1F20..\\u1F39'
                    {
                    match("\u1F20..\u1F39"); 


                    }
                    break;
                case 189 :
                    // InternalGo.g:13051:2929: '\\u1F3A..\\u1F45'
                    {
                    match("\u1F3A..\u1F45"); 


                    }
                    break;
                case 190 :
                    // InternalGo.g:13051:2946: '\\u1F48..\\u1F4D'
                    {
                    match("\u1F48..\u1F4D"); 


                    }
                    break;
                case 191 :
                    // InternalGo.g:13051:2963: '\\u1F50..\\u1F57'
                    {
                    match("\u1F50..\u1F57"); 


                    }
                    break;
                case 192 :
                    // InternalGo.g:13051:2980: '\\u1F59'
                    {
                    match('\u1F59'); 

                    }
                    break;
                case 193 :
                    // InternalGo.g:13051:2989: '\\u1F5B'
                    {
                    match('\u1F5B'); 

                    }
                    break;
                case 194 :
                    // InternalGo.g:13051:2998: '\\u1F5D'
                    {
                    match('\u1F5D'); 

                    }
                    break;
                case 195 :
                    // InternalGo.g:13051:3007: '\\u1F5F..\\u1F7D'
                    {
                    match("\u1F5F..\u1F7D"); 


                    }
                    break;
                case 196 :
                    // InternalGo.g:13051:3024: '\\u1F80..\\u1FB4'
                    {
                    match("\u1F80..\u1FB4"); 


                    }
                    break;
                case 197 :
                    // InternalGo.g:13051:3041: '\\u1FB6..\\u1FBC'
                    {
                    match("\u1FB6..\u1FBC"); 


                    }
                    break;
                case 198 :
                    // InternalGo.g:13051:3058: '\\u1FBE'
                    {
                    match('\u1FBE'); 

                    }
                    break;
                case 199 :
                    // InternalGo.g:13051:3067: '\\u1FC2..\\u1FC4'
                    {
                    match("\u1FC2..\u1FC4"); 


                    }
                    break;
                case 200 :
                    // InternalGo.g:13051:3084: '\\u1FC6..\\u1FCC'
                    {
                    match("\u1FC6..\u1FCC"); 


                    }
                    break;
                case 201 :
                    // InternalGo.g:13051:3101: '\\u1FD0..\\u1FD3'
                    {
                    match("\u1FD0..\u1FD3"); 


                    }
                    break;
                case 202 :
                    // InternalGo.g:13051:3118: '\\u1FD6..\\u1FDB'
                    {
                    match("\u1FD6..\u1FDB"); 


                    }
                    break;
                case 203 :
                    // InternalGo.g:13051:3135: '\\u1FE0..\\u1FEC'
                    {
                    match("\u1FE0..\u1FEC"); 


                    }
                    break;
                case 204 :
                    // InternalGo.g:13051:3152: '\\u1FF2..\\u1FF4'
                    {
                    match("\u1FF2..\u1FF4"); 


                    }
                    break;
                case 205 :
                    // InternalGo.g:13051:3169: '\\u1FF6..\\u1FFC'
                    {
                    match("\u1FF6..\u1FFC"); 


                    }
                    break;
                case 206 :
                    // InternalGo.g:13051:3186: '\\u207F'
                    {
                    match('\u207F'); 

                    }
                    break;
                case 207 :
                    // InternalGo.g:13051:3195: '\\u2102'
                    {
                    match('\u2102'); 

                    }
                    break;
                case 208 :
                    // InternalGo.g:13051:3204: '\\u2107'
                    {
                    match('\u2107'); 

                    }
                    break;
                case 209 :
                    // InternalGo.g:13051:3213: '\\u210A..\\u2113'
                    {
                    match("\u210A..\u2113"); 


                    }
                    break;
                case 210 :
                    // InternalGo.g:13051:3230: '\\u2115'
                    {
                    match('\u2115'); 

                    }
                    break;
                case 211 :
                    // InternalGo.g:13051:3239: '\\u2119..\\u211D'
                    {
                    match("\u2119..\u211D"); 


                    }
                    break;
                case 212 :
                    // InternalGo.g:13051:3256: '\\u2124'
                    {
                    match('\u2124'); 

                    }
                    break;
                case 213 :
                    // InternalGo.g:13051:3265: '\\u2126'
                    {
                    match('\u2126'); 

                    }
                    break;
                case 214 :
                    // InternalGo.g:13051:3274: '\\u2128'
                    {
                    match('\u2128'); 

                    }
                    break;
                case 215 :
                    // InternalGo.g:13051:3283: '\\u212A..\\u212D'
                    {
                    match("\u212A..\u212D"); 


                    }
                    break;
                case 216 :
                    // InternalGo.g:13051:3300: '\\u212F..\\u2131'
                    {
                    match("\u212F..\u2131"); 


                    }
                    break;
                case 217 :
                    // InternalGo.g:13051:3317: '\\u2133..\\u2139'
                    {
                    match("\u2133..\u2139"); 


                    }
                    break;
                case 218 :
                    // InternalGo.g:13051:3334: '\\u2160..\\u2183'
                    {
                    match("\u2160..\u2183"); 


                    }
                    break;
                case 219 :
                    // InternalGo.g:13051:3351: '\\u3005..\\u3007'
                    {
                    match("\u3005..\u3007"); 


                    }
                    break;
                case 220 :
                    // InternalGo.g:13051:3368: '\\u3021..\\u3029'
                    {
                    match("\u3021..\u3029"); 


                    }
                    break;
                case 221 :
                    // InternalGo.g:13051:3385: '\\u3031..\\u3035'
                    {
                    match("\u3031..\u3035"); 


                    }
                    break;
                case 222 :
                    // InternalGo.g:13051:3402: '\\u3038..\\u303A'
                    {
                    match("\u3038..\u303A"); 


                    }
                    break;
                case 223 :
                    // InternalGo.g:13051:3419: '\\u3041..\\u3094'
                    {
                    match("\u3041..\u3094"); 


                    }
                    break;
                case 224 :
                    // InternalGo.g:13051:3436: '\\u309D..\\u309E'
                    {
                    match("\u309D..\u309E"); 


                    }
                    break;
                case 225 :
                    // InternalGo.g:13051:3453: '\\u30A1..\\u30FA'
                    {
                    match("\u30A1..\u30FA"); 


                    }
                    break;
                case 226 :
                    // InternalGo.g:13051:3470: '\\u30FC..\\u30FE'
                    {
                    match("\u30FC..\u30FE"); 


                    }
                    break;
                case 227 :
                    // InternalGo.g:13051:3487: '\\u3105..\\u312C'
                    {
                    match("\u3105..\u312C"); 


                    }
                    break;
                case 228 :
                    // InternalGo.g:13051:3504: '\\u3131..\\u318E'
                    {
                    match("\u3131..\u318E"); 


                    }
                    break;
                case 229 :
                    // InternalGo.g:13051:3521: '\\u31A0..\\u31B7'
                    {
                    match("\u31A0..\u31B7"); 


                    }
                    break;
                case 230 :
                    // InternalGo.g:13051:3538: '\\u3400'
                    {
                    match('\u3400'); 

                    }
                    break;
                case 231 :
                    // InternalGo.g:13051:3547: '\\u4DB5'
                    {
                    match('\u4DB5'); 

                    }
                    break;
                case 232 :
                    // InternalGo.g:13051:3556: '\\u4E00'
                    {
                    match('\u4E00'); 

                    }
                    break;
                case 233 :
                    // InternalGo.g:13051:3565: '\\u9FA5'
                    {
                    match('\u9FA5'); 

                    }
                    break;
                case 234 :
                    // InternalGo.g:13051:3574: '\\uA000..\\uA48C'
                    {
                    match("\uA000..\uA48C"); 


                    }
                    break;
                case 235 :
                    // InternalGo.g:13051:3591: '\\uAC00'
                    {
                    match('\uAC00'); 

                    }
                    break;
                case 236 :
                    // InternalGo.g:13051:3600: '\\uD7A3'
                    {
                    match('\uD7A3'); 

                    }
                    break;
                case 237 :
                    // InternalGo.g:13051:3609: '\\uF900..\\uFA2D'
                    {
                    match("\uF900..\uFA2D"); 


                    }
                    break;
                case 238 :
                    // InternalGo.g:13051:3626: '\\uFB00..\\uFB06'
                    {
                    match("\uFB00..\uFB06"); 


                    }
                    break;
                case 239 :
                    // InternalGo.g:13051:3643: '\\uFB13..\\uFB17'
                    {
                    match("\uFB13..\uFB17"); 


                    }
                    break;
                case 240 :
                    // InternalGo.g:13051:3660: '\\uFB1D'
                    {
                    match('\uFB1D'); 

                    }
                    break;
                case 241 :
                    // InternalGo.g:13051:3669: '\\uFB1F..\\uFB28'
                    {
                    match("\uFB1F..\uFB28"); 


                    }
                    break;
                case 242 :
                    // InternalGo.g:13051:3686: '\\uFB2A..\\uFB36'
                    {
                    match("\uFB2A..\uFB36"); 


                    }
                    break;
                case 243 :
                    // InternalGo.g:13051:3703: '\\uFB38..\\uFB3C'
                    {
                    match("\uFB38..\uFB3C"); 


                    }
                    break;
                case 244 :
                    // InternalGo.g:13051:3720: '\\uFB3E'
                    {
                    match('\uFB3E'); 

                    }
                    break;
                case 245 :
                    // InternalGo.g:13051:3729: '\\uFB40..\\uFB41'
                    {
                    match("\uFB40..\uFB41"); 


                    }
                    break;
                case 246 :
                    // InternalGo.g:13051:3746: '\\uFB43..\\uFB44'
                    {
                    match("\uFB43..\uFB44"); 


                    }
                    break;
                case 247 :
                    // InternalGo.g:13051:3763: '\\uFB46..\\uFBB1'
                    {
                    match("\uFB46..\uFBB1"); 


                    }
                    break;
                case 248 :
                    // InternalGo.g:13051:3780: '\\uFBD3..\\uFD3D'
                    {
                    match("\uFBD3..\uFD3D"); 


                    }
                    break;
                case 249 :
                    // InternalGo.g:13051:3797: '\\uFD50..\\uFD8F'
                    {
                    match("\uFD50..\uFD8F"); 


                    }
                    break;
                case 250 :
                    // InternalGo.g:13051:3814: '\\uFD92..\\uFDC7'
                    {
                    match("\uFD92..\uFDC7"); 


                    }
                    break;
                case 251 :
                    // InternalGo.g:13051:3831: '\\uFDF0..\\uFDFB'
                    {
                    match("\uFDF0..\uFDFB"); 


                    }
                    break;
                case 252 :
                    // InternalGo.g:13051:3848: '\\uFE70..\\uFE72'
                    {
                    match("\uFE70..\uFE72"); 


                    }
                    break;
                case 253 :
                    // InternalGo.g:13051:3865: '\\uFE74'
                    {
                    match('\uFE74'); 

                    }
                    break;
                case 254 :
                    // InternalGo.g:13051:3874: '\\uFE76..\\uFEFC'
                    {
                    match("\uFE76..\uFEFC"); 


                    }
                    break;
                case 255 :
                    // InternalGo.g:13051:3891: '\\uFF21..\\uFF3A'
                    {
                    match("\uFF21..\uFF3A"); 


                    }
                    break;
                case 256 :
                    // InternalGo.g:13051:3908: '\\uFF41..\\uFF5A'
                    {
                    match("\uFF41..\uFF5A"); 


                    }
                    break;
                case 257 :
                    // InternalGo.g:13051:3925: '\\uFF66..\\uFFBE'
                    {
                    match("\uFF66..\uFFBE"); 


                    }
                    break;
                case 258 :
                    // InternalGo.g:13051:3942: '\\uFFC2..\\uFFC7'
                    {
                    match("\uFFC2..\uFFC7"); 


                    }
                    break;
                case 259 :
                    // InternalGo.g:13051:3959: '\\uFFCA..\\uFFCF'
                    {
                    match("\uFFCA..\uFFCF"); 


                    }
                    break;
                case 260 :
                    // InternalGo.g:13051:3976: '\\uFFD2..\\uFFD7'
                    {
                    match("\uFFD2..\uFFD7"); 


                    }
                    break;
                case 261 :
                    // InternalGo.g:13051:3993: '\\uFFDA..\\uFFDC'
                    {
                    match("\uFFDA..\uFFDC"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_LETTER"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13053:9: ( ( '\\t' )+ )
            // InternalGo.g:13053:11: ( '\\t' )+
            {
            // InternalGo.g:13053:11: ( '\\t' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\t') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:13053:11: '\\t'
            	    {
            	    match('\t'); 

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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13055:14: ( '/*' ( . )* '*/' )
            // InternalGo.g:13055:16: '/*' ( . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:13055:21: ( . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='*') ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1=='/') ) {
                        alt27=2;
                    }
                    else if ( ((LA27_1>='\u0000' && LA27_1<='.')||(LA27_1>='0' && LA27_1<='\uFFFF')) ) {
                        alt27=1;
                    }


                }
                else if ( ((LA27_0>='\u0000' && LA27_0<=')')||(LA27_0>='+' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGo.g:13055:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_TERMINATOR"
    public final void mRULE_TERMINATOR() throws RecognitionException {
        try {
            int _type = RULE_TERMINATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13057:17: ( '\\r' ( '\\n' )+ )
            // InternalGo.g:13057:19: '\\r' ( '\\n' )+
            {
            match('\r'); 
            // InternalGo.g:13057:24: ( '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='\n') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:13057:24: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINATOR"

    // $ANTLR start "RULE_LINE_COMMENT"
    public final void mRULE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13059:19: ( '//' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalGo.g:13059:21: '//' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match("//"); 

            // InternalGo.g:13059:26: (~ ( ( '\\r' | '\\n' ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:13059:26: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop29;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // InternalGo.g:1:8: ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_WS | RULE_COMMENT | RULE_TERMINATOR | RULE_LINE_COMMENT )
        int alt30=64;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalGo.g:1:10: T__41
                {
                mT__41(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__42
                {
                mT__42(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__43
                {
                mT__43(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__44
                {
                mT__44(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__45
                {
                mT__45(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__46
                {
                mT__46(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__47
                {
                mT__47(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__48
                {
                mT__48(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__49
                {
                mT__49(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__50
                {
                mT__50(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__51
                {
                mT__51(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__52
                {
                mT__52(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__53
                {
                mT__53(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__54
                {
                mT__54(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__55
                {
                mT__55(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__56
                {
                mT__56(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__57
                {
                mT__57(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__58
                {
                mT__58(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__59
                {
                mT__59(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__60
                {
                mT__60(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__61
                {
                mT__61(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__62
                {
                mT__62(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__63
                {
                mT__63(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__64
                {
                mT__64(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__65
                {
                mT__65(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__66
                {
                mT__66(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__67
                {
                mT__67(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__68
                {
                mT__68(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__69
                {
                mT__69(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__70
                {
                mT__70(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__71
                {
                mT__71(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__72
                {
                mT__72(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__73
                {
                mT__73(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__74
                {
                mT__74(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__75
                {
                mT__75(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__76
                {
                mT__76(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__77
                {
                mT__77(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__78
                {
                mT__78(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__79
                {
                mT__79(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__80
                {
                mT__80(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__81
                {
                mT__81(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__82
                {
                mT__82(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: T__83
                {
                mT__83(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:268: T__84
                {
                mT__84(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:274: T__85
                {
                mT__85(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:280: T__86
                {
                mT__86(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:286: T__87
                {
                mT__87(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:292: T__88
                {
                mT__88(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:298: T__89
                {
                mT__89(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:304: T__90
                {
                mT__90(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:310: T__91
                {
                mT__91(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:316: T__92
                {
                mT__92(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:322: T__93
                {
                mT__93(); 

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
                // InternalGo.g:1:436: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 62 :
                // InternalGo.g:1:444: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 63 :
                // InternalGo.g:1:457: RULE_TERMINATOR
                {
                mRULE_TERMINATOR(); 

                }
                break;
            case 64 :
                // InternalGo.g:1:473: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA30 dfa30 = new DFA30(this);
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
            return "12989:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
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
            return "13007:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
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
            return "13013:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA30_eotS =
        "\3\uffff\1\57\1\62\1\64\1\66\2\uffff\1\73\1\uffff\2\65\1\101\2\uffff\1\106\4\uffff\1\112\5\uffff\1\114\11\uffff\2\123\11\uffff\1\134\36\uffff\1\144\5\uffff\1\123\1\134\1\uffff\1\123\15\uffff\2\134\3\uffff\1\134\5\uffff\1\134";
    static final String DFA30_eofS =
        "\162\uffff";
    static final String DFA30_minS =
        "\1\11\1\uffff\1\141\1\56\1\53\1\55\1\174\2\uffff\1\52\1\uffff\1\55\1\76\1\46\1\145\1\141\1\75\1\uffff\1\146\2\uffff\1\75\5\uffff\1\75\1\141\1\uffff\1\157\1\uffff\1\145\4\uffff\2\56\1\12\10\uffff\1\60\21\uffff\1\146\1\uffff\1\156\12\uffff\1\164\4\uffff\1\53\1\56\1\60\1\uffff\2\56\1\12\2\uffff\1\53\3\uffff\1\141\1\163\2\uffff\3\60\1\53\1\uffff\2\60\4\uffff\2\60";
    static final String DFA30_maxS =
        "\1\uffda\1\uffff\1\165\1\71\1\53\1\55\1\174\2\uffff\1\57\1\uffff\1\74\1\76\1\136\1\145\1\157\1\75\1\uffff\1\156\2\uffff\1\75\5\uffff\1\75\1\145\1\uffff\1\157\1\uffff\1\167\4\uffff\2\151\1\172\10\uffff\1\151\21\uffff\1\146\1\uffff\1\156\12\uffff\1\164\4\uffff\1\71\2\151\1\uffff\2\151\1\172\2\uffff\1\71\3\uffff\1\145\1\164\2\uffff\1\71\2\151\1\71\1\uffff\1\71\1\151\4\uffff\1\71\1\151";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\5\uffff\1\11\1\12\1\uffff\1\14\6\uffff\1\25\1\uffff\1\27\1\30\1\uffff\1\33\1\34\1\36\1\37\1\40\2\uffff\1\44\1\uffff\1\51\1\uffff\1\60\1\61\1\63\1\66\3\uffff\1\74\1\75\1\77\1\2\1\35\1\55\1\64\1\3\1\uffff\1\4\1\6\1\5\1\7\1\67\1\10\1\11\1\12\1\76\1\100\1\13\1\14\1\15\1\24\1\16\1\20\1\17\1\uffff\1\22\1\uffff\1\53\1\23\1\26\1\50\1\62\1\32\1\41\1\42\1\43\1\56\1\uffff\1\52\1\54\1\65\1\70\3\uffff\1\72\3\uffff\1\73\1\71\1\uffff\1\15\1\16\1\20\2\uffff\1\46\1\57\4\uffff\1\73\2\uffff\1\21\1\47\1\31\1\45\2\uffff";
    static final String DFA30_specialS =
        "\162\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\51\3\uffff\1\52\23\uffff\1\20\1\50\2\uffff\1\12\1\15\1\47\1\23\1\24\1\10\1\4\1\26\1\5\1\3\1\11\1\46\11\45\1\33\1\1\1\13\1\25\1\14\2\uffff\1\44\31\uffff\1\41\1\uffff\1\42\1\7\1\44\1\uffff\1\44\1\35\1\17\1\16\1\37\1\2\1\36\1\uffff\1\22\3\uffff\1\43\2\uffff\1\21\1\uffff\1\34\1\40\1\27\1\uffff\1\30\4\uffff\1\31\1\6\1\32\54\uffff\1\44\12\uffff\1\44\4\uffff\1\44\5\uffff\1\44\27\uffff\1\44\37\uffff\1\44\u0129\uffff\1\44\55\uffff\1\44\137\uffff\1\44\12\uffff\1\44\24\uffff\1\44\17\uffff\1\44\15\uffff\1\44\u008b\uffff\1\44\13\uffff\1\44\1\uffff\1\44\3\uffff\1\44\1\uffff\1\44\24\uffff\1\44\54\uffff\1\44\11\uffff\1\44\45\uffff\1\44\u008b\uffff\1\44\72\uffff\1\44\3\uffff\1\44\4\uffff\1\44\47\uffff\1\44\70\uffff\1\44\47\uffff\1\44\7\uffff\1\44\156\uffff\1\44\37\uffff\1\44\60\uffff\1\44\36\uffff\1\44\60\uffff\1\44\143\uffff\1\44\17\uffff\1\44\24\uffff\1\44\25\uffff\1\44\1\uffff\1\44\155\uffff\1\44\u0184\uffff\1\44\67\uffff\1\44\22\uffff\1\44\7\uffff\1\44\54\uffff\1\44\11\uffff\1\44\3\uffff\1\44\26\uffff\1\44\7\uffff\1\44\3\uffff\1\44\45\uffff\1\44\2\uffff\1\44\20\uffff\1\44\24\uffff\1\44\11\uffff\1\44\3\uffff\1\44\26\uffff\1\44\7\uffff\1\44\2\uffff\1\44\2\uffff\1\44\40\uffff\1\44\4\uffff\1\44\23\uffff\1\44\22\uffff\1\44\7\uffff\1\44\1\uffff\1\44\3\uffff\1\44\26\uffff\1\44\7\uffff\1\44\2\uffff\1\44\7\uffff\1\44\22\uffff\1\44\17\uffff\1\44\44\uffff\1\44\11\uffff\1\44\3\uffff\1\44\26\uffff\1\44\7\uffff\1\44\3\uffff\1\44\6\uffff\1\44\36\uffff\1\44\2\uffff\1\44\45\uffff\1\44\10\uffff\1\44\3\uffff\1\44\6\uffff\1\44\2\uffff\1\44\1\uffff\1\44\4\uffff\1\44\4\uffff\1\44\5\uffff\1\44\10\uffff\1\44\115\uffff\1\44\10\uffff\1\44\3\uffff\1\44\27\uffff\1\44\12\uffff\1\44\52\uffff\1\44\44\uffff\1\44\10\uffff\1\44\3\uffff\1\44\27\uffff\1\44\12\uffff\1\44\50\uffff\1\44\1\uffff\1\44\44\uffff\1\44\10\uffff\1\44\3\uffff\1\44\27\uffff\1\44\65\uffff\1\44\44\uffff\1\44\24\uffff\1\44\30\uffff\1\44\11\uffff\1\44\2\uffff\1\44\100\uffff\1\44\60\uffff\1\44\15\uffff\1\44\100\uffff\1\44\2\uffff\1\44\2\uffff\1\44\2\uffff\1\44\2\uffff\1\44\6\uffff\1\44\4\uffff\1\44\7\uffff\1\44\3\uffff\1\44\1\uffff\1\44\2\uffff\1\44\2\uffff\1\44\4\uffff\1\44\12\uffff\1\44\10\uffff\1\44\25\uffff\1\44\43\uffff\1\44\77\uffff\1\44\107\uffff\1\44\167\uffff\1\44\42\uffff\1\44\5\uffff\1\44\46\uffff\1\44\117\uffff\1\44\57\uffff\1\44\57\uffff\1\44\136\uffff\1\44\110\uffff\1\44\127\uffff\1\44\7\uffff\1\44\77\uffff\1\44\1\uffff\1\44\5\uffff\1\44\7\uffff\1\44\1\uffff\1\44\5\uffff\1\44\47\uffff\1\44\1\uffff\1\44\5\uffff\1\44\37\uffff\1\44\1\uffff\1\44\5\uffff\1\44\7\uffff\1\44\1\uffff\1\44\5\uffff\1\44\7\uffff\1\44\7\uffff\1\44\27\uffff\1\44\37\uffff\1\44\1\uffff\1\44\5\uffff\1\44\7\uffff\1\44\47\uffff\1\44\127\uffff\1\44\20\uffff\1\44\117\uffff\1\44\u027f\uffff\1\44\36\uffff\1\44\u00df\uffff\1\44\u009f\uffff\1\44\137\uffff\1\44\u057f\uffff\1\44\u009f\uffff\1\44\100\uffff\1\44\36\uffff\1\44\27\uffff\1\44\7\uffff\1\44\31\uffff\1\44\15\uffff\1\44\7\uffff\1\44\10\uffff\1\44\1\uffff\1\44\1\uffff\1\44\1\uffff\1\44\40\uffff\1\44\65\uffff\1\44\7\uffff\1\44\3\uffff\1\44\3\uffff\1\44\11\uffff\1\44\5\uffff\1\44\11\uffff\1\44\21\uffff\1\44\3\uffff\1\44\u0088\uffff\1\44\u0082\uffff\1\44\4\uffff\1\44\2\uffff\1\44\12\uffff\1\44\3\uffff\1\44\12\uffff\1\44\1\uffff\1\44\1\uffff\1\44\1\uffff\1\44\4\uffff\1\44\3\uffff\1\44\54\uffff\1\44\u0ea4\uffff\1\44\33\uffff\1\44\17\uffff\1\44\6\uffff\1\44\10\uffff\1\44\133\uffff\1\44\3\uffff\1\44\132\uffff\1\44\10\uffff\1\44\53\uffff\1\44\156\uffff\1\44\u025f\uffff\1\44\u19b4\uffff\1\44\112\uffff\1\44\u51a4\uffff\1\44\132\uffff\1\44\u0bff\uffff\1\44\u2ba2\uffff\1\44\u215c\uffff\1\44\u01ff\uffff\1\44\22\uffff\1\44\11\uffff\1\44\1\uffff\1\44\12\uffff\1\44\15\uffff\1\44\5\uffff\1\44\1\uffff\1\44\2\uffff\1\44\2\uffff\1\44\u008c\uffff\1\44\u017c\uffff\1\44\101\uffff\1\44\135\uffff\1\44\177\uffff\1\44\3\uffff\1\44\1\uffff\1\44\u00aa\uffff\1\44\37\uffff\1\44\44\uffff\1\44\133\uffff\1\44\7\uffff\1\44\7\uffff\1\44\7\uffff\1\44",
            "",
            "\1\53\15\uffff\1\55\5\uffff\1\54",
            "\1\56\1\uffff\12\60",
            "\1\61",
            "\1\63",
            "\1\65",
            "",
            "",
            "\1\71\4\uffff\1\72",
            "",
            "\1\76\16\uffff\1\75",
            "\1\77",
            "\1\65\67\uffff\1\100",
            "\1\102",
            "\1\105\6\uffff\1\103\6\uffff\1\104",
            "\1\65",
            "",
            "\1\110\6\uffff\1\107\1\111",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\116\3\uffff\1\115",
            "",
            "\1\117",
            "",
            "\1\121\16\uffff\1\122\2\uffff\1\120",
            "",
            "",
            "",
            "",
            "\1\126\1\uffff\12\125\13\uffff\1\124\37\uffff\1\124\3\uffff\1\127",
            "\1\126\1\uffff\10\130\2\131\13\uffff\1\124\37\uffff\1\124\3\uffff\1\127",
            "\1\50\34\uffff\1\50\31\uffff\32\132\1\uffff\1\133\4\uffff\32\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\13\uffff\1\135\37\uffff\1\135\3\uffff\1\127",
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
            "\1\141",
            "",
            "\1\142",
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
            "\1\143",
            "",
            "",
            "",
            "",
            "\1\145\1\uffff\1\145\2\uffff\12\146",
            "\1\126\1\uffff\12\125\13\uffff\1\124\37\uffff\1\124\3\uffff\1\127",
            "\12\147\13\uffff\1\150\37\uffff\1\150\3\uffff\1\127",
            "",
            "\1\126\1\uffff\10\130\2\131\13\uffff\1\124\37\uffff\1\124\3\uffff\1\127",
            "\1\126\1\uffff\12\131\13\uffff\1\124\37\uffff\1\124\3\uffff\1\127",
            "\1\50\34\uffff\1\151\31\uffff\32\50\6\uffff\32\50",
            "",
            "",
            "\1\152\1\uffff\1\152\2\uffff\12\153",
            "",
            "",
            "",
            "\1\154\3\uffff\1\155",
            "\1\156\1\157",
            "",
            "",
            "\12\146",
            "\12\146\57\uffff\1\127",
            "\12\147\13\uffff\1\150\37\uffff\1\150\3\uffff\1\127",
            "\1\160\1\uffff\1\160\2\uffff\12\161",
            "",
            "\12\153",
            "\12\153\57\uffff\1\127",
            "",
            "",
            "",
            "",
            "\12\161",
            "\12\161\57\uffff\1\127"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_IDENTIFIER | RULE_BINARY_OP | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_WS | RULE_COMMENT | RULE_TERMINATOR | RULE_LINE_COMMENT );";
        }
    }
 

}