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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_BINARY_OP=4;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=29;
    public static final int RULE_UNICODE_VALUE=10;
    public static final int RULE_LITTLE_U_VALUE=26;
    public static final int RULE_HEX_BYTE_VALUE=12;
    public static final int RULE_OCTAL_BYTE_VALUE=11;
    public static final int RULE_MUL_OP=17;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_SEMICOLON=5;
    public static final int RULE_NEWLINE=19;
    public static final int RULE_BIG_U_VALUE=27;
    public static final int RULE_ESCAPED_CHAR=28;
    public static final int RULE_IDENTIFIER=14;
    public static final int RULE_STRING=30;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_KEYWORDS=24;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNICODE_LETTER=20;
    public static final int RULE_HEX_LIT=9;
    public static final int RULE_UNICODE_CHAR=25;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_ADD_OP=16;
    public static final int RULE_UNICODE_DIGIT=22;
    public static final int RULE_WS=33;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_OCTAL_LIT=8;
    public static final int RULE_LETTER=21;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=13;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=18;
    public static final int T__45=45;
    public static final int RULE_REL_OP=15;
    public static final int RULE_HEX_DIGIT=23;
    public static final int T__46=46;
    public static final int RULE_ASSIGN_OP=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( '(' )
            // InternalGo.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( ')' )
            // InternalGo.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( '[' )
            // InternalGo.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:14:7: ( ']' )
            // InternalGo.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:15:7: ( '{' )
            // InternalGo.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16:7: ( '}' )
            // InternalGo.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:17:7: ( '++' )
            // InternalGo.g:17:9: '++'
            {
            match("++"); 


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
            // InternalGo.g:18:7: ( '=' )
            // InternalGo.g:18:9: '='
            {
            match('='); 

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
            // InternalGo.g:19:7: ( ':=' )
            // InternalGo.g:19:9: ':='
            {
            match(":="); 


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
            // InternalGo.g:20:7: ( ',' )
            // InternalGo.g:20:9: ','
            {
            match(','); 

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
            // InternalGo.g:21:7: ( '--' )
            // InternalGo.g:21:9: '--'
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
            // InternalGo.g:22:7: ( '...' )
            // InternalGo.g:22:9: '...'
            {
            match("..."); 


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
            // InternalGo.g:23:7: ( '.' )
            // InternalGo.g:23:9: '.'
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
            // InternalGo.g:24:7: ( ':' )
            // InternalGo.g:24:9: ':'
            {
            match(':'); 

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
            // InternalGo.g:25:7: ( 'E' )
            // InternalGo.g:25:9: 'E'
            {
            match('E'); 

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
            // InternalGo.g:26:7: ( 'e' )
            // InternalGo.g:26:9: 'e'
            {
            match('e'); 

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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:29:7: ( 'i' )
            // InternalGo.g:29:9: 'i'
            {
            match('i'); 

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
            // InternalGo.g:30:7: ( '\\'' )
            // InternalGo.g:30:9: '\\''
            {
            match('\''); 

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
            // InternalGo.g:31:7: ( '\"' )
            // InternalGo.g:31:9: '\"'
            {
            match('\"'); 

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
            // InternalGo.g:32:7: ( 'oi' )
            // InternalGo.g:32:9: 'oi'
            {
            match("oi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1862:16: ( ';' )
            // InternalGo.g:1862:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_BINARY_OP"
    public final void mRULE_BINARY_OP() throws RecognitionException {
        try {
            int _type = RULE_BINARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1864:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:1864:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:1864:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGo.g:1864:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:1864:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:1864:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:1864:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:1864:53: RULE_MUL_OP
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
            // InternalGo.g:1866:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:1866:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:1866:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '!':
                {
                alt2=2;
                }
                break;
            case '<':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=3;}
                }
                break;
            case '>':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='=') ) {
                    alt2=6;
                }
                else {
                    alt2=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:1866:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:1866:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:1866:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:1866:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:1866:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:1866:48: '>='
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
            // InternalGo.g:1868:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:1868:24: ( '+' | '-' | '|' | '^' )
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
            // InternalGo.g:1870:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:1870:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:1870:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt3=1;
                }
                break;
            case '/':
                {
                alt3=2;
                }
                break;
            case '%':
                {
                alt3=3;
                }
                break;
            case '<':
                {
                alt3=4;
                }
                break;
            case '>':
                {
                alt3=5;
                }
                break;
            case '&':
                {
                int LA3_6 = input.LA(2);

                if ( (LA3_6=='^') ) {
                    alt3=7;
                }
                else {
                    alt3=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:1870:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1870:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:1870:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:1870:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:1870:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:1870:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:1870:51: '&^'
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
            int _type = RULE_UNARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1872:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:1872:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:1872:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt4=1;
                }
                break;
            case '-':
                {
                alt4=2;
                }
                break;
            case '!':
                {
                alt4=3;
                }
                break;
            case '^':
                {
                alt4=4;
                }
                break;
            case '*':
                {
                alt4=5;
                }
                break;
            case '&':
                {
                alt4=6;
                }
                break;
            case '<':
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:1872:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1872:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:1872:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:1872:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:1872:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:1872:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:1872:42: '<-'
                    {
                    match("<-"); 


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
    // $ANTLR end "RULE_UNARY_OP"

    // $ANTLR start "RULE_ASSIGN_OP"
    public final void mRULE_ASSIGN_OP() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1874:16: ( ( RULE_ADD_OP | RULE_MUL_OP )? '=' )
            // InternalGo.g:1874:18: ( RULE_ADD_OP | RULE_MUL_OP )? '='
            {
            // InternalGo.g:1874:18: ( RULE_ADD_OP | RULE_MUL_OP )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-'||LA5_0=='^'||LA5_0=='|') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='%' && LA5_0<='&')||LA5_0=='*'||LA5_0=='/'||LA5_0=='<'||LA5_0=='>') ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:1874:19: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1874:31: RULE_MUL_OP
                    {
                    mRULE_MUL_OP(); 

                    }
                    break;

            }

            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN_OP"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalGo.g:1876:23: ( '\\n' )
            // InternalGo.g:1876:25: '\\n'
            {
            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalGo.g:1878:22: ( ( RULE_UNICODE_LETTER | '_' ) )
            // InternalGo.g:1878:24: ( RULE_UNICODE_LETTER | '_' )
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

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:1880:25: ( ( RULE_UNICODE_DIGIT | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalGo.g:1880:27: ( RULE_UNICODE_DIGIT | 'A' .. 'F' | 'a' .. 'f' )
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

    // $ANTLR start "RULE_KEYWORDS"
    public final void mRULE_KEYWORDS() throws RecognitionException {
        try {
            int _type = RULE_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1882:15: ( ( 'break' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' ) )
            // InternalGo.g:1882:17: ( 'break' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' )
            {
            // InternalGo.g:1882:17: ( 'break' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' )
            int alt6=25;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalGo.g:1882:18: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:1882:26: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:1882:36: 'func'
                    {
                    match("func"); 


                    }
                    break;
                case 4 :
                    // InternalGo.g:1882:43: 'interface'
                    {
                    match("interface"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:1882:55: 'select'
                    {
                    match("select"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:1882:64: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:1882:71: 'defer'
                    {
                    match("defer"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:1882:79: 'go'
                    {
                    match("go"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:1882:84: 'map'
                    {
                    match("map"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:1882:90: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:1882:99: 'chan'
                    {
                    match("chan"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:1882:106: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:1882:113: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:1882:120: 'package'
                    {
                    match("package"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:1882:130: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 16 :
                    // InternalGo.g:1882:139: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 17 :
                    // InternalGo.g:1882:147: 'fallthrough'
                    {
                    match("fallthrough"); 


                    }
                    break;
                case 18 :
                    // InternalGo.g:1882:161: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:1882:166: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 20 :
                    // InternalGo.g:1882:174: 'type'
                    {
                    match("type"); 


                    }
                    break;
                case 21 :
                    // InternalGo.g:1882:181: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 22 :
                    // InternalGo.g:1882:192: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 23 :
                    // InternalGo.g:1882:198: 'import'
                    {
                    match("import"); 


                    }
                    break;
                case 24 :
                    // InternalGo.g:1882:207: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 25 :
                    // InternalGo.g:1882:216: 'var'
                    {
                    match("var"); 


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
    // $ANTLR end "RULE_KEYWORDS"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1884:17: ( RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )* )
            // InternalGo.g:1884:19: RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalGo.g:1884:31: ( RULE_LETTER | RULE_UNICODE_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    break loop7;
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

    // $ANTLR start "RULE_UNICODE_CHAR"
    public final void mRULE_UNICODE_CHAR() throws RecognitionException {
        try {
            // InternalGo.g:1886:28: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalGo.g:1886:30: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // InternalGo.g:1888:30: ( RULE_UNICODE_CHAR )
            // InternalGo.g:1888:32: RULE_UNICODE_CHAR
            {
            mRULE_UNICODE_CHAR(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_LETTER"

    // $ANTLR start "RULE_UNICODE_DIGIT"
    public final void mRULE_UNICODE_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:1890:29: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) )
            // InternalGo.g:1890:31: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
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
    // $ANTLR end "RULE_UNICODE_DIGIT"

    // $ANTLR start "RULE_OCTAL_LIT"
    public final void mRULE_OCTAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1892:16: ( '0' ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )* )
            // InternalGo.g:1892:18: '0' ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )*
            {
            match('0'); 
            // InternalGo.g:1892:22: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='7') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_LIT"

    // $ANTLR start "RULE_HEX_LIT"
    public final void mRULE_HEX_LIT() throws RecognitionException {
        try {
            int _type = RULE_HEX_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1894:14: ( '0' ( 'X' | 'x' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )* )
            // InternalGo.g:1894:16: '0' ( 'X' | 'x' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )*
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_HEX_DIGIT(); 
            // InternalGo.g:1894:45: ( RULE_HEX_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:1894:45: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_LIT"

    // $ANTLR start "RULE_UNICODE_VALUE"
    public final void mRULE_UNICODE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_UNICODE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1896:20: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:1896:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:1896:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt10=2;
                    }
                    break;
                case 'U':
                    {
                    alt10=3;
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
                    alt10=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:1896:23: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1896:41: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:1896:61: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:1896:78: RULE_ESCAPED_CHAR
                    {
                    mRULE_ESCAPED_CHAR(); 

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
    // $ANTLR end "RULE_UNICODE_VALUE"

    // $ANTLR start "RULE_OCTAL_BYTE_VALUE"
    public final void mRULE_OCTAL_BYTE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_BYTE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1898:23: ( '\\\\' ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) )
            // InternalGo.g:1898:25: '\\\\' ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )
            {
            match('\\'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='7') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='7') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='7') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_BYTE_VALUE"

    // $ANTLR start "RULE_HEX_BYTE_VALUE"
    public final void mRULE_HEX_BYTE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_HEX_BYTE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1900:21: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:1900:23: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('x'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_BYTE_VALUE"

    // $ANTLR start "RULE_LITTLE_U_VALUE"
    public final void mRULE_LITTLE_U_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:1902:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:1902:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
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
            // InternalGo.g:1904:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:1904:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('U'); 
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
            // InternalGo.g:1906:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:1906:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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

    // $ANTLR start "RULE_RAW_STRING_LIT"
    public final void mRULE_RAW_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_RAW_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1908:21: ( '`' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '`' )
            // InternalGo.g:1908:23: '`' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '`'
            {
            match('`'); 
            // InternalGo.g:1908:27: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n'||(LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
                }
            } while (true);

            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RAW_STRING_LIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1910:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:1910:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:1910:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:1910:11: '^'
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

            // InternalGo.g:1910:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
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
            // InternalGo.g:1912:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:1912:12: ( '0' .. '9' )+
            {
            // InternalGo.g:1912:12: ( '0' .. '9' )+
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
            	    // InternalGo.g:1912:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalGo.g:1914:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:1914:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:1914:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1914:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:1914:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalGo.g:1914:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:1914:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1914:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:1914:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalGo.g:1914:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:1914:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // InternalGo.g:1916:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:1916:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:1916:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGo.g:1916:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // InternalGo.g:1918:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:1918:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:1918:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:1918:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop19;
                }
            } while (true);

            // InternalGo.g:1918:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1918:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:1918:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGo.g:1918:41: '\\r'
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
            // InternalGo.g:1920:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:1920:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:1920:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // InternalGo.g:1922:16: ( . )
            // InternalGo.g:1922:18: .
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
        // InternalGo.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_SEMICOLON | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSIGN_OP | RULE_KEYWORDS | RULE_IDENTIFIER | RULE_OCTAL_LIT | RULE_HEX_LIT | RULE_UNICODE_VALUE | RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=41;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalGo.g:1:10: T__35
                {
                mT__35(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__36
                {
                mT__36(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__37
                {
                mT__37(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__38
                {
                mT__38(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__39
                {
                mT__39(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__40
                {
                mT__40(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__41
                {
                mT__41(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__42
                {
                mT__42(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__43
                {
                mT__43(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__44
                {
                mT__44(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__45
                {
                mT__45(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__46
                {
                mT__46(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__47
                {
                mT__47(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__48
                {
                mT__48(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__49
                {
                mT__49(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__50
                {
                mT__50(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__51
                {
                mT__51(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__52
                {
                mT__52(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__53
                {
                mT__53(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__54
                {
                mT__54(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__55
                {
                mT__55(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__56
                {
                mT__56(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:157: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:172: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:186: RULE_ASSIGN_OP
                {
                mRULE_ASSIGN_OP(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:201: RULE_KEYWORDS
                {
                mRULE_KEYWORDS(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:215: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:231: RULE_OCTAL_LIT
                {
                mRULE_OCTAL_LIT(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:246: RULE_HEX_LIT
                {
                mRULE_HEX_LIT(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:259: RULE_UNICODE_VALUE
                {
                mRULE_UNICODE_VALUE(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:278: RULE_OCTAL_BYTE_VALUE
                {
                mRULE_OCTAL_BYTE_VALUE(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:300: RULE_HEX_BYTE_VALUE
                {
                mRULE_HEX_BYTE_VALUE(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:320: RULE_RAW_STRING_LIT
                {
                mRULE_RAW_STRING_LIT(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:340: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:348: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:357: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:369: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:385: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:401: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:409: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA1_eotS =
        "\1\uffff\1\6\1\7\1\uffff\2\3\4\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\41\1\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA1_maxS =
        "\2\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\3\2\uffff\1\4\1\5\1\1\1\2";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "1864:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
        }
    }
    static final String DFA6_eotS =
        "\33\uffff\1\41\12\uffff";
    static final String DFA6_eofS =
        "\46\uffff";
    static final String DFA6_minS =
        "\1\142\1\uffff\1\145\1\141\1\146\1\145\1\141\1\157\3\uffff\1\141\2\uffff\1\146\13\uffff\1\156\1\164\2\uffff\1\141\1\163\6\uffff";
    static final String DFA6_maxS =
        "\1\166\1\uffff\1\145\1\165\1\156\1\167\2\157\3\uffff\1\145\2\uffff\1\146\13\uffff\1\156\1\164\2\uffff\1\145\1\164\6\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\6\uffff\1\11\1\14\1\16\1\uffff\1\24\1\31\1\uffff\1\3\1\21\1\26\1\4\1\22\1\27\1\5\1\12\1\17\1\6\1\13\2\uffff\1\23\1\30\2\uffff\1\15\1\10\1\2\1\7\1\20\1\25";
    static final String DFA6_specialS =
        "\46\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\6\1\2\1\11\1\3\1\7\1\uffff\1\4\3\uffff\1\10\2\uffff\1\12\1\uffff\1\13\1\5\1\14\1\uffff\1\15",
            "",
            "\1\16",
            "\1\20\15\uffff\1\21\5\uffff\1\17",
            "\1\23\6\uffff\1\24\1\22",
            "\1\25\16\uffff\1\26\2\uffff\1\27",
            "\1\30\6\uffff\1\31\6\uffff\1\32",
            "\1\33",
            "",
            "",
            "",
            "\1\34\3\uffff\1\35",
            "",
            "",
            "\1\36",
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
            "\1\37",
            "\1\40",
            "",
            "",
            "\1\42\3\uffff\1\43",
            "\1\44\1\45",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1882:17: ( 'break' | 'default' | 'func' | 'interface' | 'select' | 'case' | 'defer' | 'go' | 'map' | 'struct' | 'chan' | 'else' | 'goto' | 'package' | 'switch' | 'const' | 'fallthrough' | 'if' | 'range' | 'type' | 'continue' | 'for' | 'import' | 'return' | 'var' )";
        }
    }
    static final String DFA23_eotS =
        "\7\uffff\1\67\1\72\1\74\1\uffff\1\77\1\101\1\102\1\105\1\111\1\113\1\114\1\116\1\uffff\2\71\1\121\6\71\14\116\1\152\1\116\2\57\26\uffff\2\116\1\uffff\1\116\1\164\1\116\4\uffff\1\166\2\uffff\1\71\1\uffff\2\71\3\uffff\13\116\1\164\6\116\2\uffff\1\152\6\uffff\2\116\1\uffff\1\116\1\uffff\4\116\1\164\7\116\1\164\4\116\2\164\5\116\1\164\4\116\2\164\2\116\1\164\3\116\1\164\2\116\1\164\1\116\1\164\4\116\1\164\2\116\1\164\2\116\1\164\2\116\3\164\2\116\1\164\1\116\1\164\2\116\1\164\2\116\2\164\2\116\1\164";
    static final String DFA23_eofS =
        "\u00c1\uffff";
    static final String DFA23_minS =
        "\1\0\6\uffff\1\53\2\75\1\uffff\1\55\1\56\3\60\2\0\1\60\1\uffff\3\75\1\55\1\76\2\75\1\52\1\75\16\60\1\42\1\12\26\uffff\2\60\1\uffff\3\60\4\uffff\1\60\2\uffff\1\75\1\uffff\2\75\3\uffff\22\60\2\uffff\1\60\6\uffff\2\60\1\uffff\1\60\1\uffff\112\60";
    static final String DFA23_maxS =
        "\1\uffff\6\uffff\3\75\1\uffff\1\75\1\56\3\172\2\uffff\1\172\1\uffff\1\75\1\136\1\75\1\74\1\76\1\172\3\75\14\172\1\170\1\172\1\170\1\172\26\uffff\2\172\1\uffff\3\172\4\uffff\1\172\2\uffff\1\75\1\uffff\2\75\3\uffff\22\172\2\uffff\1\71\6\uffff\2\172\1\uffff\1\172\1\uffff\112\172";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\12\10\uffff\1\27\31\uffff\1\44\1\50\1\51\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\21\1\32\1\30\1\10\1\11\1\16\1\12\1\13\1\22\1\14\1\15\1\17\2\uffff\1\20\3\uffff\1\23\1\45\1\24\1\25\1\uffff\1\34\1\27\1\uffff\1\31\2\uffff\1\43\1\46\1\47\22\uffff\1\36\1\35\1\uffff\1\44\1\37\1\40\1\41\1\42\1\50\2\uffff\1\33\1\uffff\1\26\112\uffff";
    static final String DFA23_specialS =
        "\1\1\17\uffff\1\0\1\2\u00af\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\26\1\21\2\57\1\34\1\25\1\20\1\1\1\2\1\32\1\7\1\12\1\13\1\14\1\33\1\51\11\55\1\11\1\23\1\27\1\10\1\30\2\57\4\50\1\15\25\50\1\3\1\53\1\4\1\31\1\52\1\54\1\50\1\35\1\41\1\36\1\16\1\37\1\42\1\50\1\17\3\50\1\43\1\50\1\22\1\44\1\50\1\45\1\40\1\46\1\50\1\47\4\50\1\5\1\24\1\6\uff82\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\21\uffff\1\70",
            "\1\71",
            "\1\73",
            "",
            "\1\76\17\uffff\1\70",
            "\1\100",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\104\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\5\103\1\107\6\103\1\110\1\106\14\103",
            "\0\112",
            "\0\112",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\10\103\1\115\21\103",
            "",
            "\1\70",
            "\1\70\40\uffff\1\120",
            "\1\71",
            "\1\121\16\uffff\1\122",
            "\1\123",
            "\1\70\3\uffff\32\124\4\uffff\1\124\1\uffff\32\124",
            "\1\70",
            "\1\125\4\uffff\1\126\15\uffff\1\70",
            "\1\70",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\127\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\130\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\132\15\103\1\133\5\103\1\131\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\134\16\103\1\135\2\103\1\136\3\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\137\6\103\1\140\6\103\1\141\13\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\142\13\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\143\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\144\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\145\3\103\1\146\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\30\103\1\147\1\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\150\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\10\153\2\154\36\uffff\1\151\37\uffff\1\151",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\155\4\uffff\1\155\10\uffff\10\156\35\uffff\1\155\6\uffff\1\155\4\uffff\2\155\3\uffff\1\155\7\uffff\1\155\3\uffff\1\155\1\uffff\3\155\1\uffff\1\157",
            "\1\160\66\uffff\32\160\5\uffff\33\160",
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
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\22\103\1\162\7\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\163\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\17\103\1\165\12\103",
            "",
            "",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\1\70",
            "",
            "\1\70",
            "\1\70",
            "",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\167\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\5\103\1\170\24\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\171\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\172\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\173\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\174\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\175\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\10\103\1\176\21\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\22\103\1\177\7\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u0080\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u0081\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u0082\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\17\103\1\u0083\12\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u0084\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u0085\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u0086\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\17\103\1\u0087\12\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u0088\10\103",
            "",
            "",
            "\10\153\2\154",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u0089\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u008a\25\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\u008b\13\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u008c\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u008d\3\103\1\u008e\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u008f\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\u0090\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u0091\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u0092\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u0093\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u0094\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u0095\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\22\103\1\u0096\1\u0097\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\u0098\13\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\12\103\1\u0099\17\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\6\103\1\u009a\23\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u009b\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u009c\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u009d\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u009e\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\12\103\1\u009f\17\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u00a0\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00a1\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00a2\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00a3\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00a4\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00a5\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00a6\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\10\103\1\u00a7\21\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u00a8\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00a9\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00aa\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\5\103\1\u00ab\24\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00ac\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\103\1\u00ad\16\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\7\103\1\u00ae\22\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00af\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00b0\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\7\103\1\u00b1\22\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u00b2\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\6\103\1\u00b3\23\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\15\103\1\u00b4\14\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\1\u00b5\31\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\103\1\u00b6\6\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00b7\10\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u00b8\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00b9\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\2\103\1\u00ba\27\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\103\1\u00bb\13\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00bc\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\u00bd\25\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\24\103\1\u00be\5\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\6\103\1\u00bf\23\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\7\103\1\u00c0\22\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_SEMICOLON | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSIGN_OP | RULE_KEYWORDS | RULE_IDENTIFIER | RULE_OCTAL_LIT | RULE_HEX_LIT | RULE_UNICODE_VALUE | RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_16 = input.LA(1);

                        s = -1;
                        if ( ((LA23_16>='\u0000' && LA23_16<='\uFFFF')) ) {s = 74;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='(') ) {s = 1;}

                        else if ( (LA23_0==')') ) {s = 2;}

                        else if ( (LA23_0=='[') ) {s = 3;}

                        else if ( (LA23_0==']') ) {s = 4;}

                        else if ( (LA23_0=='{') ) {s = 5;}

                        else if ( (LA23_0=='}') ) {s = 6;}

                        else if ( (LA23_0=='+') ) {s = 7;}

                        else if ( (LA23_0=='=') ) {s = 8;}

                        else if ( (LA23_0==':') ) {s = 9;}

                        else if ( (LA23_0==',') ) {s = 10;}

                        else if ( (LA23_0=='-') ) {s = 11;}

                        else if ( (LA23_0=='.') ) {s = 12;}

                        else if ( (LA23_0=='E') ) {s = 13;}

                        else if ( (LA23_0=='e') ) {s = 14;}

                        else if ( (LA23_0=='i') ) {s = 15;}

                        else if ( (LA23_0=='\'') ) {s = 16;}

                        else if ( (LA23_0=='\"') ) {s = 17;}

                        else if ( (LA23_0=='o') ) {s = 18;}

                        else if ( (LA23_0==';') ) {s = 19;}

                        else if ( (LA23_0=='|') ) {s = 20;}

                        else if ( (LA23_0=='&') ) {s = 21;}

                        else if ( (LA23_0=='!') ) {s = 22;}

                        else if ( (LA23_0=='<') ) {s = 23;}

                        else if ( (LA23_0=='>') ) {s = 24;}

                        else if ( (LA23_0=='^') ) {s = 25;}

                        else if ( (LA23_0=='*') ) {s = 26;}

                        else if ( (LA23_0=='/') ) {s = 27;}

                        else if ( (LA23_0=='%') ) {s = 28;}

                        else if ( (LA23_0=='b') ) {s = 29;}

                        else if ( (LA23_0=='d') ) {s = 30;}

                        else if ( (LA23_0=='f') ) {s = 31;}

                        else if ( (LA23_0=='s') ) {s = 32;}

                        else if ( (LA23_0=='c') ) {s = 33;}

                        else if ( (LA23_0=='g') ) {s = 34;}

                        else if ( (LA23_0=='m') ) {s = 35;}

                        else if ( (LA23_0=='p') ) {s = 36;}

                        else if ( (LA23_0=='r') ) {s = 37;}

                        else if ( (LA23_0=='t') ) {s = 38;}

                        else if ( (LA23_0=='v') ) {s = 39;}

                        else if ( ((LA23_0>='A' && LA23_0<='D')||(LA23_0>='F' && LA23_0<='Z')||LA23_0=='a'||LA23_0=='h'||(LA23_0>='j' && LA23_0<='l')||LA23_0=='n'||LA23_0=='q'||LA23_0=='u'||(LA23_0>='w' && LA23_0<='z')) ) {s = 40;}

                        else if ( (LA23_0=='0') ) {s = 41;}

                        else if ( (LA23_0=='_') ) {s = 42;}

                        else if ( (LA23_0=='\\') ) {s = 43;}

                        else if ( (LA23_0=='`') ) {s = 44;}

                        else if ( ((LA23_0>='1' && LA23_0<='9')) ) {s = 45;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 46;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||(LA23_0>='#' && LA23_0<='$')||(LA23_0>='?' && LA23_0<='@')||(LA23_0>='~' && LA23_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_17 = input.LA(1);

                        s = -1;
                        if ( ((LA23_17>='\u0000' && LA23_17<='\uFFFF')) ) {s = 74;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}