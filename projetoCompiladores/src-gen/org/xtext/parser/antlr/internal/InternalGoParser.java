package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BINARY_OP", "RULE_SEMICOLON", "RULE_ASSIGN_OP", "RULE_INT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_UNICODE_VALUE", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_IDENTIFIER", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_UNARY_OP", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'oi'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'='", "':='", "','", "'--'", "'...'", "'.'", "':'", "'E'", "'e'", "'+'", "'-'", "'i'", "'\\''", "'\"'", "'struct'", "'*'"
    };
    public static final int T__50=50;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_BINARY_OP=4;
    public static final int T__58=58;
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


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



     	private GoGrammarAccess grammarAccess;

        public InternalGoParser(TokenStream input, GoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGo.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGo.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGo.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGo.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= 'oi' ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_greetings_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:77:2: ( ( (lv_greetings_0_0= 'oi' ) ) )
            // InternalGo.g:78:2: ( (lv_greetings_0_0= 'oi' ) )
            {
            // InternalGo.g:78:2: ( (lv_greetings_0_0= 'oi' ) )
            // InternalGo.g:79:3: (lv_greetings_0_0= 'oi' )
            {
            // InternalGo.g:79:3: (lv_greetings_0_0= 'oi' )
            // InternalGo.g:80:4: lv_greetings_0_0= 'oi'
            {
            lv_greetings_0_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_greetings_0_0, grammarAccess.getModelAccess().getGreetingsOiKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getModelRule());
              				}
              				addWithLastConsumed(current, "greetings", lv_greetings_0_0, "oi");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "ruleOPERATORS"
    // InternalGo.g:96:1: ruleOPERATORS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP ) ;
    public final AntlrDatatypeRuleToken ruleOPERATORS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_OP_0=null;
        Token kw=null;
        Token this_SEMICOLON_11=null;
        Token this_ASSIGN_OP_16=null;


        	enterRule();

        try {
            // InternalGo.g:102:2: ( (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP ) )
            // InternalGo.g:103:2: (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP )
            {
            // InternalGo.g:103:2: (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP )
            int alt1=17;
            switch ( input.LA(1) ) {
            case RULE_BINARY_OP:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 39:
                {
                alt1=5;
                }
                break;
            case 40:
                {
                alt1=6;
                }
                break;
            case 41:
                {
                alt1=7;
                }
                break;
            case 42:
                {
                alt1=8;
                }
                break;
            case 43:
                {
                alt1=9;
                }
                break;
            case 44:
                {
                alt1=10;
                }
                break;
            case 45:
                {
                alt1=11;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt1=12;
                }
                break;
            case 46:
                {
                alt1=13;
                }
                break;
            case 47:
                {
                alt1=14;
                }
                break;
            case 48:
                {
                alt1=15;
                }
                break;
            case 49:
                {
                alt1=16;
                }
                break;
            case RULE_ASSIGN_OP:
                {
                alt1=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGo.g:104:3: this_BINARY_OP_0= RULE_BINARY_OP
                    {
                    this_BINARY_OP_0=(Token)match(input,RULE_BINARY_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BINARY_OP_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BINARY_OP_0, grammarAccess.getOPERATORSAccess().getBINARY_OPTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:112:3: kw= '('
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getLeftParenthesisKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:118:3: kw= ')'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getRightParenthesisKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:124:3: kw= '['
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getLeftSquareBracketKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:130:3: kw= ']'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getRightSquareBracketKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:136:3: kw= '{'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getLeftCurlyBracketKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:142:3: kw= '}'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getRightCurlyBracketKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:148:3: kw= '++'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getPlusSignPlusSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGo.g:154:3: kw= '='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGo.g:160:3: kw= ':='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getColonEqualsSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGo.g:166:3: kw= ','
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getCommaKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalGo.g:172:3: this_SEMICOLON_11= RULE_SEMICOLON
                    {
                    this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SEMICOLON_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SEMICOLON_11, grammarAccess.getOPERATORSAccess().getSEMICOLONTerminalRuleCall_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalGo.g:180:3: kw= '--'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getHyphenMinusHyphenMinusKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalGo.g:186:3: kw= '...'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getFullStopFullStopFullStopKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalGo.g:192:3: kw= '.'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getFullStopKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalGo.g:198:3: kw= ':'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getColonKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalGo.g:204:3: this_ASSIGN_OP_16= RULE_ASSIGN_OP
                    {
                    this_ASSIGN_OP_16=(Token)match(input,RULE_ASSIGN_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ASSIGN_OP_16);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ASSIGN_OP_16, grammarAccess.getOPERATORSAccess().getASSIGN_OPTerminalRuleCall_16());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPERATORS"


    // $ANTLR start "entryRuleInt_lit"
    // InternalGo.g:215:1: entryRuleInt_lit returns [String current=null] : iv_ruleInt_lit= ruleInt_lit EOF ;
    public final String entryRuleInt_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt_lit = null;


        try {
            // InternalGo.g:215:47: (iv_ruleInt_lit= ruleInt_lit EOF )
            // InternalGo.g:216:2: iv_ruleInt_lit= ruleInt_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInt_lit=ruleInt_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInt_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt_lit"


    // $ANTLR start "ruleInt_lit"
    // InternalGo.g:222:1: ruleInt_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT ) ;
    public final AntlrDatatypeRuleToken ruleInt_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_OCTAL_LIT_1=null;
        Token this_HEX_LIT_2=null;


        	enterRule();

        try {
            // InternalGo.g:228:2: ( (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT ) )
            // InternalGo.g:229:2: (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT )
            {
            // InternalGo.g:229:2: (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case RULE_OCTAL_LIT:
                {
                alt2=2;
                }
                break;
            case RULE_HEX_LIT:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:230:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getInt_litAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:238:3: this_OCTAL_LIT_1= RULE_OCTAL_LIT
                    {
                    this_OCTAL_LIT_1=(Token)match(input,RULE_OCTAL_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OCTAL_LIT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OCTAL_LIT_1, grammarAccess.getInt_litAccess().getOCTAL_LITTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:246:3: this_HEX_LIT_2= RULE_HEX_LIT
                    {
                    this_HEX_LIT_2=(Token)match(input,RULE_HEX_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HEX_LIT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HEX_LIT_2, grammarAccess.getInt_litAccess().getHEX_LITTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt_lit"


    // $ANTLR start "entryRuleFloat_lit"
    // InternalGo.g:257:1: entryRuleFloat_lit returns [String current=null] : iv_ruleFloat_lit= ruleFloat_lit EOF ;
    public final String entryRuleFloat_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat_lit = null;


        try {
            // InternalGo.g:257:49: (iv_ruleFloat_lit= ruleFloat_lit EOF )
            // InternalGo.g:258:2: iv_ruleFloat_lit= ruleFloat_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloat_lit=ruleFloat_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat_lit"


    // $ANTLR start "ruleFloat_lit"
    // InternalGo.g:264:1: ruleFloat_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;
        AntlrDatatypeRuleToken this_Exponent_3 = null;

        AntlrDatatypeRuleToken this_Exponent_4 = null;

        AntlrDatatypeRuleToken this_Exponent_7 = null;



        	enterRule();

        try {
            // InternalGo.g:270:2: ( (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? ) )
            // InternalGo.g:271:2: (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? )
            {
            // InternalGo.g:271:2: (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? )
            // InternalGo.g:272:3: this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalGo.g:279:3: ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=50 && LA5_0<=51)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:280:4: (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? )
                    {
                    // InternalGo.g:280:4: (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? )
                    // InternalGo.g:281:5: kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )?
                    {
                    kw=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getFloat_litAccess().getFullStopKeyword_1_0_0());
                      				
                    }
                    // InternalGo.g:286:5: (this_INT_2= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalGo.g:287:6: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_2, grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalGo.g:295:5: (this_Exponent_3= ruleExponent )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=50 && LA4_0<=51)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalGo.g:296:6: this_Exponent_3= ruleExponent
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2());
                              					
                            }
                            pushFollow(FOLLOW_5);
                            this_Exponent_3=ruleExponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_Exponent_3);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:309:4: this_Exponent_4= ruleExponent
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_Exponent_4=ruleExponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Exponent_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFloat_litAccess().getFullStopKeyword_2());
              		
            }
            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_6);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_6, grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalGo.g:332:3: (this_Exponent_7= ruleExponent )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=50 && LA6_0<=51)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:333:4: this_Exponent_7= ruleExponent
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Exponent_7=ruleExponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Exponent_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat_lit"


    // $ANTLR start "entryRuleExponent"
    // InternalGo.g:348:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // InternalGo.g:348:48: (iv_ruleExponent= ruleExponent EOF )
            // InternalGo.g:349:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExponent=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponent.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponent"


    // $ANTLR start "ruleExponent"
    // InternalGo.g:355:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalGo.g:361:2: ( ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) )
            // InternalGo.g:362:2: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            {
            // InternalGo.g:362:2: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            // InternalGo.g:363:3: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT
            {
            // InternalGo.g:363:3: (kw= 'E' | kw= 'e' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==50) ) {
                alt7=1;
            }
            else if ( (LA7_0==51) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:364:4: kw= 'E'
                    {
                    kw=(Token)match(input,50,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:370:4: kw= 'e'
                    {
                    kw=(Token)match(input,51,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:376:3: (kw= '+' | kw= '-' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            else if ( (LA8_0==53) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:377:4: kw= '+'
                    {
                    kw=(Token)match(input,52,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getPlusSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:383:4: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getHyphenMinusKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_4);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_4, grammarAccess.getExponentAccess().getINTTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleImaginary_lit"
    // InternalGo.g:400:1: entryRuleImaginary_lit returns [String current=null] : iv_ruleImaginary_lit= ruleImaginary_lit EOF ;
    public final String entryRuleImaginary_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImaginary_lit = null;


        try {
            // InternalGo.g:400:53: (iv_ruleImaginary_lit= ruleImaginary_lit EOF )
            // InternalGo.g:401:2: iv_ruleImaginary_lit= ruleImaginary_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImaginary_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImaginary_lit=ruleImaginary_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImaginary_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImaginary_lit"


    // $ANTLR start "ruleImaginary_lit"
    // InternalGo.g:407:1: ruleImaginary_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' ) ;
    public final AntlrDatatypeRuleToken ruleImaginary_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Float_lit_1 = null;



        	enterRule();

        try {
            // InternalGo.g:413:2: ( ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' ) )
            // InternalGo.g:414:2: ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' )
            {
            // InternalGo.g:414:2: ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' )
            // InternalGo.g:415:3: (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i'
            {
            // InternalGo.g:415:3: (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==54) ) {
                    alt9=1;
                }
                else if ( (LA9_1==48||(LA9_1>=50 && LA9_1<=51)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:416:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getImaginary_litAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:424:4: this_Float_lit_1= ruleFloat_lit
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImaginary_litAccess().getFloat_litParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Float_lit_1=ruleFloat_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Float_lit_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImaginary_litAccess().getIKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImaginary_lit"


    // $ANTLR start "entryRuleRune_lit"
    // InternalGo.g:444:1: entryRuleRune_lit returns [String current=null] : iv_ruleRune_lit= ruleRune_lit EOF ;
    public final String entryRuleRune_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRune_lit = null;


        try {
            // InternalGo.g:444:48: (iv_ruleRune_lit= ruleRune_lit EOF )
            // InternalGo.g:445:2: iv_ruleRune_lit= ruleRune_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRune_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRune_lit=ruleRune_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRune_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRune_lit"


    // $ANTLR start "ruleRune_lit"
    // InternalGo.g:451:1: ruleRune_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken ruleRune_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_UNICODE_VALUE_1=null;
        AntlrDatatypeRuleToken this_Byte_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:457:2: ( (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' ) )
            // InternalGo.g:458:2: (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' )
            {
            // InternalGo.g:458:2: (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' )
            // InternalGo.g:459:3: kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\''
            {
            kw=(Token)match(input,55,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRune_litAccess().getApostropheKeyword_0());
              		
            }
            // InternalGo.g:464:3: (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_UNICODE_VALUE) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_OCTAL_BYTE_VALUE && LA10_0<=RULE_HEX_BYTE_VALUE)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:465:4: this_UNICODE_VALUE_1= RULE_UNICODE_VALUE
                    {
                    this_UNICODE_VALUE_1=(Token)match(input,RULE_UNICODE_VALUE,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UNICODE_VALUE_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_UNICODE_VALUE_1, grammarAccess.getRune_litAccess().getUNICODE_VALUETerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:473:4: this_Byte_value_2= ruleByte_value
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRune_litAccess().getByte_valueParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_Byte_value_2=ruleByte_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Byte_value_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRune_litAccess().getApostropheKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRune_lit"


    // $ANTLR start "entryRuleByte_value"
    // InternalGo.g:493:1: entryRuleByte_value returns [String current=null] : iv_ruleByte_value= ruleByte_value EOF ;
    public final String entryRuleByte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleByte_value = null;


        try {
            // InternalGo.g:493:50: (iv_ruleByte_value= ruleByte_value EOF )
            // InternalGo.g:494:2: iv_ruleByte_value= ruleByte_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByte_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleByte_value=ruleByte_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleByte_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleByte_value"


    // $ANTLR start "ruleByte_value"
    // InternalGo.g:500:1: ruleByte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleByte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OCTAL_BYTE_VALUE_0=null;
        Token this_HEX_BYTE_VALUE_1=null;


        	enterRule();

        try {
            // InternalGo.g:506:2: ( (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:507:2: (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:507:2: (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OCTAL_BYTE_VALUE) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_HEX_BYTE_VALUE) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:508:3: this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE
                    {
                    this_OCTAL_BYTE_VALUE_0=(Token)match(input,RULE_OCTAL_BYTE_VALUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OCTAL_BYTE_VALUE_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OCTAL_BYTE_VALUE_0, grammarAccess.getByte_valueAccess().getOCTAL_BYTE_VALUETerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:516:3: this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE
                    {
                    this_HEX_BYTE_VALUE_1=(Token)match(input,RULE_HEX_BYTE_VALUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HEX_BYTE_VALUE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HEX_BYTE_VALUE_1, grammarAccess.getByte_valueAccess().getHEX_BYTE_VALUETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleByte_value"


    // $ANTLR start "entryRuleString_lit"
    // InternalGo.g:527:1: entryRuleString_lit returns [String current=null] : iv_ruleString_lit= ruleString_lit EOF ;
    public final String entryRuleString_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString_lit = null;


        try {
            // InternalGo.g:527:50: (iv_ruleString_lit= ruleString_lit EOF )
            // InternalGo.g:528:2: iv_ruleString_lit= ruleString_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleString_lit=ruleString_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleString_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString_lit"


    // $ANTLR start "ruleString_lit"
    // InternalGo.g:534:1: ruleString_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit ) ;
    public final AntlrDatatypeRuleToken ruleString_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RAW_STRING_LIT_0=null;
        AntlrDatatypeRuleToken this_Interpreted_string_lit_1 = null;



        	enterRule();

        try {
            // InternalGo.g:540:2: ( (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit ) )
            // InternalGo.g:541:2: (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit )
            {
            // InternalGo.g:541:2: (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_RAW_STRING_LIT) ) {
                alt12=1;
            }
            else if ( (LA12_0==56) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:542:3: this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT
                    {
                    this_RAW_STRING_LIT_0=(Token)match(input,RULE_RAW_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RAW_STRING_LIT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_RAW_STRING_LIT_0, grammarAccess.getString_litAccess().getRAW_STRING_LITTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:550:3: this_Interpreted_string_lit_1= ruleInterpreted_string_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getString_litAccess().getInterpreted_string_litParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interpreted_string_lit_1=ruleInterpreted_string_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Interpreted_string_lit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString_lit"


    // $ANTLR start "entryRuleInterpreted_string_lit"
    // InternalGo.g:564:1: entryRuleInterpreted_string_lit returns [String current=null] : iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF ;
    public final String entryRuleInterpreted_string_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterpreted_string_lit = null;


        try {
            // InternalGo.g:564:62: (iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF )
            // InternalGo.g:565:2: iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterpreted_string_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterpreted_string_lit=ruleInterpreted_string_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterpreted_string_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterpreted_string_lit"


    // $ANTLR start "ruleInterpreted_string_lit"
    // InternalGo.g:571:1: ruleInterpreted_string_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleInterpreted_string_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_UNICODE_VALUE_1=null;
        AntlrDatatypeRuleToken this_Byte_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:577:2: ( (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' ) )
            // InternalGo.g:578:2: (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' )
            {
            // InternalGo.g:578:2: (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' )
            // InternalGo.g:579:3: kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"'
            {
            kw=(Token)match(input,56,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0());
              		
            }
            // InternalGo.g:584:3: (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_UNICODE_VALUE) ) {
                    alt13=1;
                }
                else if ( ((LA13_0>=RULE_OCTAL_BYTE_VALUE && LA13_0<=RULE_HEX_BYTE_VALUE)) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:585:4: this_UNICODE_VALUE_1= RULE_UNICODE_VALUE
            	    {
            	    this_UNICODE_VALUE_1=(Token)match(input,RULE_UNICODE_VALUE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_UNICODE_VALUE_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_UNICODE_VALUE_1, grammarAccess.getInterpreted_string_litAccess().getUNICODE_VALUETerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:593:4: this_Byte_value_2= ruleByte_value
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInterpreted_string_litAccess().getByte_valueParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_12);
            	    this_Byte_value_2=ruleByte_value();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Byte_value_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterpreted_string_lit"


    // $ANTLR start "entryRuleLiterals"
    // InternalGo.g:613:1: entryRuleLiterals returns [String current=null] : iv_ruleLiterals= ruleLiterals EOF ;
    public final String entryRuleLiterals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiterals = null;


        try {
            // InternalGo.g:613:48: (iv_ruleLiterals= ruleLiterals EOF )
            // InternalGo.g:614:2: iv_ruleLiterals= ruleLiterals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiterals=ruleLiterals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiterals.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiterals"


    // $ANTLR start "ruleLiterals"
    // InternalGo.g:620:1: ruleLiterals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit ) ;
    public final AntlrDatatypeRuleToken ruleLiterals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Int_lit_0 = null;

        AntlrDatatypeRuleToken this_Float_lit_1 = null;

        AntlrDatatypeRuleToken this_Imaginary_lit_2 = null;

        AntlrDatatypeRuleToken this_Rune_lit_3 = null;

        AntlrDatatypeRuleToken this_String_lit_4 = null;



        	enterRule();

        try {
            // InternalGo.g:626:2: ( (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit ) )
            // InternalGo.g:627:2: (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit )
            {
            // InternalGo.g:627:2: (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit )
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGo.g:628:3: this_Int_lit_0= ruleInt_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralsAccess().getInt_litParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Int_lit_0=ruleInt_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Int_lit_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:639:3: this_Float_lit_1= ruleFloat_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralsAccess().getFloat_litParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Float_lit_1=ruleFloat_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Float_lit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:650:3: this_Imaginary_lit_2= ruleImaginary_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralsAccess().getImaginary_litParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Imaginary_lit_2=ruleImaginary_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Imaginary_lit_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:661:3: this_Rune_lit_3= ruleRune_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralsAccess().getRune_litParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Rune_lit_3=ruleRune_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Rune_lit_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:672:3: this_String_lit_4= ruleString_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralsAccess().getString_litParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_String_lit_4=ruleString_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_String_lit_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiterals"


    // $ANTLR start "entryRuleType"
    // InternalGo.g:686:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalGo.g:686:44: (iv_ruleType= ruleType EOF )
            // InternalGo.g:687:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGo.g:693:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_name_0= ruleType_name ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_name_0 = null;



        	enterRule();

        try {
            // InternalGo.g:699:2: (this_Type_name_0= ruleType_name )
            // InternalGo.g:700:2: this_Type_name_0= ruleType_name
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTypeAccess().getType_nameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Type_name_0=ruleType_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Type_name_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_name"
    // InternalGo.g:713:1: entryRuleType_name returns [String current=null] : iv_ruleType_name= ruleType_name EOF ;
    public final String entryRuleType_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_name = null;


        try {
            // InternalGo.g:713:49: (iv_ruleType_name= ruleType_name EOF )
            // InternalGo.g:714:2: iv_ruleType_name= ruleType_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType_name=ruleType_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_name.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType_name"


    // $ANTLR start "ruleType_name"
    // InternalGo.g:720:1: ruleType_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident ) ;
    public final AntlrDatatypeRuleToken ruleType_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Qualified_ident_1 = null;



        	enterRule();

        try {
            // InternalGo.g:726:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident ) )
            // InternalGo.g:727:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident )
            {
            // InternalGo.g:727:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENTIFIER) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==48) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||LA15_1==RULE_SEMICOLON||LA15_1==RULE_RAW_STRING_LIT||LA15_1==39||LA15_1==45||LA15_1==56) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:728:3: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENTIFIER_0, grammarAccess.getType_nameAccess().getIDENTIFIERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:736:3: this_Qualified_ident_1= ruleQualified_ident
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_nameAccess().getQualified_identParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Qualified_ident_1=ruleQualified_ident();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Qualified_ident_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType_name"


    // $ANTLR start "entryRuleArray_type"
    // InternalGo.g:750:1: entryRuleArray_type returns [String current=null] : iv_ruleArray_type= ruleArray_type EOF ;
    public final String entryRuleArray_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray_type = null;


        try {
            // InternalGo.g:750:50: (iv_ruleArray_type= ruleArray_type EOF )
            // InternalGo.g:751:2: iv_ruleArray_type= ruleArray_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArray_type=ruleArray_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray_type.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray_type"


    // $ANTLR start "ruleArray_type"
    // InternalGo.g:757:1: ruleArray_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleArray_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Parameter_list_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalGo.g:763:2: ( (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType ) )
            // InternalGo.g:764:2: (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType )
            {
            // InternalGo.g:764:2: (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType )
            // InternalGo.g:765:3: kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType
            {
            kw=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGo.g:770:3: ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list )
            // InternalGo.g:771:4: ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getArray_typeAccess().getParameter_listParserRuleCall_1());
              			
            }
            pushFollow(FOLLOW_14);
            this_Parameter_list_1=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_Parameter_list_1);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            kw=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArray_typeAccess().getTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_3=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray_type"


    // $ANTLR start "entryRuleStruct_type"
    // InternalGo.g:803:1: entryRuleStruct_type returns [String current=null] : iv_ruleStruct_type= ruleStruct_type EOF ;
    public final String entryRuleStruct_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStruct_type = null;


        try {
            // InternalGo.g:803:51: (iv_ruleStruct_type= ruleStruct_type EOF )
            // InternalGo.g:804:2: iv_ruleStruct_type= ruleStruct_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStruct_type=ruleStruct_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStruct_type.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStruct_type"


    // $ANTLR start "ruleStruct_type"
    // InternalGo.g:810:1: ruleStruct_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStruct_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SEMICOLON_3=null;
        AntlrDatatypeRuleToken this_Field_decl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:816:2: ( (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' ) )
            // InternalGo.g:817:2: (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' )
            {
            // InternalGo.g:817:2: (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' )
            // InternalGo.g:818:3: kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}'
            {
            kw=(Token)match(input,57,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStruct_typeAccess().getStructKeyword_0());
              		
            }
            kw=(Token)match(input,40,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStruct_typeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:828:3: (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_IDENTIFIER||LA16_0==58) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGo.g:829:4: this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStruct_typeAccess().getField_declParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    this_Field_decl_2=ruleField_decl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Field_decl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SEMICOLON_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SEMICOLON_3, grammarAccess.getStruct_typeAccess().getSEMICOLONTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStruct_typeAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStruct_type"


    // $ANTLR start "entryRuleField_decl"
    // InternalGo.g:856:1: entryRuleField_decl returns [String current=null] : iv_ruleField_decl= ruleField_decl EOF ;
    public final String entryRuleField_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleField_decl = null;


        try {
            // InternalGo.g:856:50: (iv_ruleField_decl= ruleField_decl EOF )
            // InternalGo.g:857:2: iv_ruleField_decl= ruleField_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField_decl=ruleField_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_decl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField_decl"


    // $ANTLR start "ruleField_decl"
    // InternalGo.g:863:1: ruleField_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? ) ;
    public final AntlrDatatypeRuleToken ruleField_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_list_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_Embedded_field_2 = null;

        AntlrDatatypeRuleToken this_String_lit_3 = null;



        	enterRule();

        try {
            // InternalGo.g:869:2: ( ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? ) )
            // InternalGo.g:870:2: ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? )
            {
            // InternalGo.g:870:2: ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? )
            // InternalGo.g:871:3: ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )?
            {
            // InternalGo.g:871:3: ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENTIFIER) ) {
                alt17=1;
            }
            else if ( (LA17_0==58) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:872:4: (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType )
                    {
                    // InternalGo.g:872:4: (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType )
                    // InternalGo.g:873:5: this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getField_declAccess().getIdentifier_listParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    this_Identifier_list_0=ruleIdentifier_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Identifier_list_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getField_declAccess().getTypeParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Type_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:895:4: this_Embedded_field_2= ruleEmbedded_field
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getField_declAccess().getEmbedded_fieldParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_Embedded_field_2=ruleEmbedded_field();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Embedded_field_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:906:3: (this_String_lit_3= ruleString_lit )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_RAW_STRING_LIT||LA18_0==56) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:907:4: this_String_lit_3= ruleString_lit
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getField_declAccess().getString_litParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_String_lit_3=ruleString_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_String_lit_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField_decl"


    // $ANTLR start "entryRuleEmbedded_field"
    // InternalGo.g:922:1: entryRuleEmbedded_field returns [String current=null] : iv_ruleEmbedded_field= ruleEmbedded_field EOF ;
    public final String entryRuleEmbedded_field() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmbedded_field = null;


        try {
            // InternalGo.g:922:54: (iv_ruleEmbedded_field= ruleEmbedded_field EOF )
            // InternalGo.g:923:2: iv_ruleEmbedded_field= ruleEmbedded_field EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmbedded_fieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmbedded_field=ruleEmbedded_field();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmbedded_field.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmbedded_field"


    // $ANTLR start "ruleEmbedded_field"
    // InternalGo.g:929:1: ruleEmbedded_field returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' )+ this_Type_name_1= ruleType_name ) ;
    public final AntlrDatatypeRuleToken ruleEmbedded_field() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_name_1 = null;



        	enterRule();

        try {
            // InternalGo.g:935:2: ( ( (kw= '*' )+ this_Type_name_1= ruleType_name ) )
            // InternalGo.g:936:2: ( (kw= '*' )+ this_Type_name_1= ruleType_name )
            {
            // InternalGo.g:936:2: ( (kw= '*' )+ this_Type_name_1= ruleType_name )
            // InternalGo.g:937:3: (kw= '*' )+ this_Type_name_1= ruleType_name
            {
            // InternalGo.g:937:3: (kw= '*' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:938:4: kw= '*'
            	    {
            	    kw=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEmbedded_fieldAccess().getType_nameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_name_1=ruleType_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_name_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmbedded_field"


    // $ANTLR start "entryRulePointer_type"
    // InternalGo.g:958:1: entryRulePointer_type returns [String current=null] : iv_rulePointer_type= rulePointer_type EOF ;
    public final String entryRulePointer_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointer_type = null;


        try {
            // InternalGo.g:958:52: (iv_rulePointer_type= rulePointer_type EOF )
            // InternalGo.g:959:2: iv_rulePointer_type= rulePointer_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointer_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePointer_type=rulePointer_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointer_type.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointer_type"


    // $ANTLR start "rulePointer_type"
    // InternalGo.g:965:1: rulePointer_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken rulePointer_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:971:2: ( (kw= '*' this_Type_1= ruleType ) )
            // InternalGo.g:972:2: (kw= '*' this_Type_1= ruleType )
            {
            // InternalGo.g:972:2: (kw= '*' this_Type_1= ruleType )
            // InternalGo.g:973:3: kw= '*' this_Type_1= ruleType
            {
            kw=(Token)match(input,58,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPointer_typeAccess().getAsteriskKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_1=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointer_type"


    // $ANTLR start "entryRuleParameter_list"
    // InternalGo.g:992:1: entryRuleParameter_list returns [String current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final String entryRuleParameter_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter_list = null;


        try {
            // InternalGo.g:992:54: (iv_ruleParameter_list= ruleParameter_list EOF )
            // InternalGo.g:993:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // InternalGo.g:999:1: ruleParameter_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )* ) ;
    public final AntlrDatatypeRuleToken ruleParameter_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Parameter_decl_0 = null;

        AntlrDatatypeRuleToken this_Parameter_decl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1005:2: ( ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )* ) )
            // InternalGo.g:1006:2: ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )* )
            {
            // InternalGo.g:1006:2: ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )* )
            // InternalGo.g:1007:3: ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )*
            {
            // InternalGo.g:1007:3: ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl )
            // InternalGo.g:1008:4: ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_20);
            this_Parameter_decl_0=ruleParameter_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_Parameter_decl_0);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:1021:3: (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==45) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGo.g:1022:4: kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl )
            	    {
            	    kw=(Token)match(input,45,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalGo.g:1027:4: ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl )
            	    // InternalGo.g:1028:5: ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    this_Parameter_decl_2=ruleParameter_decl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_Parameter_decl_2);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter_decl"
    // InternalGo.g:1046:1: entryRuleParameter_decl returns [String current=null] : iv_ruleParameter_decl= ruleParameter_decl EOF ;
    public final String entryRuleParameter_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter_decl = null;


        try {
            // InternalGo.g:1046:54: (iv_ruleParameter_decl= ruleParameter_decl EOF )
            // InternalGo.g:1047:2: iv_ruleParameter_decl= ruleParameter_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_declRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter_decl=ruleParameter_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_decl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter_decl"


    // $ANTLR start "ruleParameter_decl"
    // InternalGo.g:1053:1: ruleParameter_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleParameter_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_list_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1059:2: ( ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType ) )
            // InternalGo.g:1060:2: ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType )
            {
            // InternalGo.g:1060:2: ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType )
            // InternalGo.g:1061:3: ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType
            {
            // InternalGo.g:1061:3: ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENTIFIER) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==45) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==RULE_IDENTIFIER) ) {
                        int LA21_6 = input.LA(4);

                        if ( (synpred4_InternalGo()) ) {
                            alt21=1;
                        }
                    }
                }
                else if ( (LA21_1==47) && (synpred4_InternalGo())) {
                    alt21=1;
                }
                else if ( (LA21_1==RULE_IDENTIFIER) && (synpred4_InternalGo())) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1062:4: ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameter_declAccess().getIdentifier_listParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    this_Identifier_list_0=ruleIdentifier_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Identifier_list_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:1075:3: (kw= '...' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:1076:4: kw= '...'
                    {
                    kw=(Token)match(input,47,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameter_declAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_2=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter_decl"


    // $ANTLR start "entryRuleIdentifier_list"
    // InternalGo.g:1096:1: entryRuleIdentifier_list returns [String current=null] : iv_ruleIdentifier_list= ruleIdentifier_list EOF ;
    public final String entryRuleIdentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier_list = null;


        try {
            // InternalGo.g:1096:55: (iv_ruleIdentifier_list= ruleIdentifier_list EOF )
            // InternalGo.g:1097:2: iv_ruleIdentifier_list= ruleIdentifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier_list=ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier_list"


    // $ANTLR start "ruleIdentifier_list"
    // InternalGo.g:1103:1: ruleIdentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalGo.g:1109:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // InternalGo.g:1110:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // InternalGo.g:1110:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // InternalGo.g:1111:3: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            // InternalGo.g:1118:3: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGo.g:1119:4: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,45,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENTIFIER_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier_list"


    // $ANTLR start "entryRuleQualified_ident"
    // InternalGo.g:1136:1: entryRuleQualified_ident returns [String current=null] : iv_ruleQualified_ident= ruleQualified_ident EOF ;
    public final String entryRuleQualified_ident() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified_ident = null;


        try {
            // InternalGo.g:1136:55: (iv_ruleQualified_ident= ruleQualified_ident EOF )
            // InternalGo.g:1137:2: iv_ruleQualified_ident= ruleQualified_ident EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualified_identRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualified_ident=ruleQualified_ident();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualified_ident.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualified_ident"


    // $ANTLR start "ruleQualified_ident"
    // InternalGo.g:1143:1: ruleQualified_ident returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleQualified_ident() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalGo.g:1149:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) )
            // InternalGo.g:1150:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            {
            // InternalGo.g:1150:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            // InternalGo.g:1151:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,48,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualified_identAccess().getFullStopKeyword_1());
              		
            }
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_2, grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualified_ident"


    // $ANTLR start "entryRuleImport_spec"
    // InternalGo.g:1174:1: entryRuleImport_spec returns [String current=null] : iv_ruleImport_spec= ruleImport_spec EOF ;
    public final String entryRuleImport_spec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport_spec = null;


        try {
            // InternalGo.g:1174:51: (iv_ruleImport_spec= ruleImport_spec EOF )
            // InternalGo.g:1175:2: iv_ruleImport_spec= ruleImport_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_specRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport_spec=ruleImport_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_spec.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport_spec"


    // $ANTLR start "ruleImport_spec"
    // InternalGo.g:1181:1: ruleImport_spec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path ) ;
    public final AntlrDatatypeRuleToken ruleImport_spec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_Import_path_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1187:2: ( ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path ) )
            // InternalGo.g:1188:2: ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path )
            {
            // InternalGo.g:1188:2: ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path )
            // InternalGo.g:1189:3: (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path
            {
            // InternalGo.g:1189:3: (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_IDENTIFIER) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1190:4: kw= '.'
                    {
                    kw=(Token)match(input,48,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImport_specAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1196:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getImport_specAccess().getIDENTIFIERTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImport_specAccess().getImport_pathParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Import_path_2=ruleImport_path();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Import_path_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport_spec"


    // $ANTLR start "entryRuleImport_path"
    // InternalGo.g:1218:1: entryRuleImport_path returns [String current=null] : iv_ruleImport_path= ruleImport_path EOF ;
    public final String entryRuleImport_path() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport_path = null;


        try {
            // InternalGo.g:1218:51: (iv_ruleImport_path= ruleImport_path EOF )
            // InternalGo.g:1219:2: iv_ruleImport_path= ruleImport_path EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_pathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport_path=ruleImport_path();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_path.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport_path"


    // $ANTLR start "ruleImport_path"
    // InternalGo.g:1225:1: ruleImport_path returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_String_lit_0= ruleString_lit ;
    public final AntlrDatatypeRuleToken ruleImport_path() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_String_lit_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1231:2: (this_String_lit_0= ruleString_lit )
            // InternalGo.g:1232:2: this_String_lit_0= ruleString_lit
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getImport_pathAccess().getString_litParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_String_lit_0=ruleString_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_String_lit_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport_path"

    // $ANTLR start synpred4_InternalGo
    public final void synpred4_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1062:4: ( ruleIdentifier_list )
        // InternalGo.g:1062:5: ruleIdentifier_list
        {
        pushFollow(FOLLOW_2);
        ruleIdentifier_list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalGo

    // Delegated rules

    public final boolean synpred4_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\uffff\1\2\21\uffff\1\26\5\uffff\1\26";
    static final String dfa_3s = "\1\7\1\60\4\uffff\3\7\1\60\5\7\1\60\2\7\1\60\1\62\2\7\1\uffff\2\7\1\66";
    static final String dfa_4s = "\1\70\1\66\4\uffff\1\63\2\65\1\63\2\65\3\7\1\60\2\7\1\60\1\66\2\65\1\uffff\2\7\1\66";
    static final String dfa_5s = "\2\uffff\1\1\1\4\1\5\1\3\20\uffff\1\2\3\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\4\51\uffff\1\3\1\4",
            "\1\6\1\uffff\1\7\1\10\2\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\11\50\uffff\1\14\1\uffff\1\12\1\13",
            "\1\17\54\uffff\1\15\1\16",
            "\1\17\54\uffff\1\15\1\16",
            "\1\14\1\uffff\1\12\1\13",
            "\1\22\54\uffff\1\20\1\21",
            "\1\22\54\uffff\1\20\1\21",
            "\1\23",
            "\1\17",
            "\1\17",
            "\1\14",
            "\1\22",
            "\1\22",
            "\1\14",
            "\1\24\1\25\2\uffff\1\5",
            "\1\31\54\uffff\1\27\1\30",
            "\1\31\54\uffff\1\27\1\30",
            "",
            "\1\31",
            "\1\31",
            "\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "627:2: (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000D000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000D000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000D000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0030000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0100000000001C00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0400020000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000002002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400800000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0100000000002000L});

}