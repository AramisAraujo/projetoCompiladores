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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BINARY_OP", "RULE_SEMICOLON", "RULE_ASSIGN_OP", "RULE_INT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_UNICODE_VALUE", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_IDENTIFIER", "RULE_UNARY_OP", "RULE_WS", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'='", "':='", "','", "'--'", "'...'", "'.'", "':'", "'E'", "'e'", "'+'", "'-'", "'i'", "'\\''", "'\"'", "'struct'", "'*'", "'func'", "'interface'", "'map'", "'chan'", "'chan<-'", "'<-chan'", "'const'", "'fallthrough'", "'if'", "'else'", "'go'", "'return'", "'break'", "'continue'", "'goto'", "'defer'", "'package'", "'import'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_BINARY_OP=4;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=30;
    public static final int RULE_UNICODE_VALUE=10;
    public static final int RULE_LITTLE_U_VALUE=27;
    public static final int RULE_HEX_BYTE_VALUE=12;
    public static final int RULE_OCTAL_BYTE_VALUE=11;
    public static final int RULE_MUL_OP=19;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=32;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=20;
    public static final int RULE_BIG_U_VALUE=28;
    public static final int RULE_ESCAPED_CHAR=29;
    public static final int RULE_IDENTIFIER=14;
    public static final int RULE_STRING=31;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_KEYWORDS=25;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNICODE_LETTER=21;
    public static final int RULE_HEX_LIT=9;
    public static final int RULE_UNICODE_CHAR=26;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=18;
    public static final int T__75=75;
    public static final int RULE_UNICODE_DIGIT=23;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_OCTAL_LIT=8;
    public static final int RULE_LETTER=22;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=13;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=15;
    public static final int T__45=45;
    public static final int RULE_REL_OP=17;
    public static final int RULE_HEX_DIGIT=24;
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
    // InternalGo.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleprogram ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:77:2: ( ( (lv_greetings_0_0= ruleprogram ) ) )
            // InternalGo.g:78:2: ( (lv_greetings_0_0= ruleprogram ) )
            {
            // InternalGo.g:78:2: ( (lv_greetings_0_0= ruleprogram ) )
            // InternalGo.g:79:3: (lv_greetings_0_0= ruleprogram )
            {
            // InternalGo.g:79:3: (lv_greetings_0_0= ruleprogram )
            // InternalGo.g:80:4: lv_greetings_0_0= ruleprogram
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_greetings_0_0=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getModelRule());
              				}
              				add(
              					current,
              					"greetings",
              					lv_greetings_0_0,
              					"org.xtext.Go.program");
              				afterParserOrEnumRuleCall();
              			
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


    // $ANTLR start "entryRuleprogram"
    // InternalGo.g:100:1: entryRuleprogram returns [String current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final String entryRuleprogram() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram = null;


        try {
            // InternalGo.g:100:47: (iv_ruleprogram= ruleprogram EOF )
            // InternalGo.g:101:2: iv_ruleprogram= ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram.getText(); 
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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalGo.g:107:1: ruleprogram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Import_decl_0= ruleImport_decl | this_Package_clause_1= rulePackage_clause | this_Function_decl_2= ruleFunction_decl ) ;
    public final AntlrDatatypeRuleToken ruleprogram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Import_decl_0 = null;

        AntlrDatatypeRuleToken this_Package_clause_1 = null;

        AntlrDatatypeRuleToken this_Function_decl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_Import_decl_0= ruleImport_decl | this_Package_clause_1= rulePackage_clause | this_Function_decl_2= ruleFunction_decl ) )
            // InternalGo.g:114:2: (this_Import_decl_0= ruleImport_decl | this_Package_clause_1= rulePackage_clause | this_Function_decl_2= ruleFunction_decl )
            {
            // InternalGo.g:114:2: (this_Import_decl_0= ruleImport_decl | this_Package_clause_1= rulePackage_clause | this_Function_decl_2= ruleFunction_decl )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt1=1;
                }
                break;
            case 74:
                {
                alt1=2;
                }
                break;
            case 58:
                {
                alt1=3;
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
                    // InternalGo.g:115:3: this_Import_decl_0= ruleImport_decl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProgramAccess().getImport_declParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Import_decl_0=ruleImport_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Import_decl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:126:3: this_Package_clause_1= rulePackage_clause
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProgramAccess().getPackage_clauseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Package_clause_1=rulePackage_clause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Package_clause_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:137:3: this_Function_decl_2= ruleFunction_decl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProgramAccess().getFunction_declParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Function_decl_2=ruleFunction_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Function_decl_2);
                      		
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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "ruleOPERATORS"
    // InternalGo.g:152:1: ruleOPERATORS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP ) ;
    public final AntlrDatatypeRuleToken ruleOPERATORS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_OP_0=null;
        Token kw=null;
        Token this_SEMICOLON_11=null;
        Token this_ASSIGN_OP_16=null;


        	enterRule();

        try {
            // InternalGo.g:158:2: ( (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP ) )
            // InternalGo.g:159:2: (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP )
            {
            // InternalGo.g:159:2: (this_BINARY_OP_0= RULE_BINARY_OP | kw= '(' | kw= ')' | kw= '[' | kw= ']' | kw= '{' | kw= '}' | kw= '++' | kw= '=' | kw= ':=' | kw= ',' | this_SEMICOLON_11= RULE_SEMICOLON | kw= '--' | kw= '...' | kw= '.' | kw= ':' | this_ASSIGN_OP_16= RULE_ASSIGN_OP )
            int alt2=17;
            switch ( input.LA(1) ) {
            case RULE_BINARY_OP:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 39:
                {
                alt2=6;
                }
                break;
            case 40:
                {
                alt2=7;
                }
                break;
            case 41:
                {
                alt2=8;
                }
                break;
            case 42:
                {
                alt2=9;
                }
                break;
            case 43:
                {
                alt2=10;
                }
                break;
            case 44:
                {
                alt2=11;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt2=12;
                }
                break;
            case 45:
                {
                alt2=13;
                }
                break;
            case 46:
                {
                alt2=14;
                }
                break;
            case 47:
                {
                alt2=15;
                }
                break;
            case 48:
                {
                alt2=16;
                }
                break;
            case RULE_ASSIGN_OP:
                {
                alt2=17;
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
                    // InternalGo.g:160:3: this_BINARY_OP_0= RULE_BINARY_OP
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
                    // InternalGo.g:168:3: kw= '('
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getLeftParenthesisKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:174:3: kw= ')'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getRightParenthesisKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:180:3: kw= '['
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getLeftSquareBracketKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:186:3: kw= ']'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getRightSquareBracketKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:192:3: kw= '{'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getLeftCurlyBracketKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:198:3: kw= '}'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getRightCurlyBracketKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:204:3: kw= '++'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getPlusSignPlusSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGo.g:210:3: kw= '='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGo.g:216:3: kw= ':='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getColonEqualsSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGo.g:222:3: kw= ','
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getCommaKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalGo.g:228:3: this_SEMICOLON_11= RULE_SEMICOLON
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
                    // InternalGo.g:236:3: kw= '--'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getHyphenMinusHyphenMinusKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalGo.g:242:3: kw= '...'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getFullStopFullStopFullStopKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalGo.g:248:3: kw= '.'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getFullStopKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalGo.g:254:3: kw= ':'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOPERATORSAccess().getColonKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalGo.g:260:3: this_ASSIGN_OP_16= RULE_ASSIGN_OP
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
    // InternalGo.g:271:1: entryRuleInt_lit returns [String current=null] : iv_ruleInt_lit= ruleInt_lit EOF ;
    public final String entryRuleInt_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt_lit = null;


        try {
            // InternalGo.g:271:47: (iv_ruleInt_lit= ruleInt_lit EOF )
            // InternalGo.g:272:2: iv_ruleInt_lit= ruleInt_lit EOF
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
    // InternalGo.g:278:1: ruleInt_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT ) ;
    public final AntlrDatatypeRuleToken ruleInt_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_OCTAL_LIT_1=null;
        Token this_HEX_LIT_2=null;


        	enterRule();

        try {
            // InternalGo.g:284:2: ( (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT ) )
            // InternalGo.g:285:2: (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT )
            {
            // InternalGo.g:285:2: (this_INT_0= RULE_INT | this_OCTAL_LIT_1= RULE_OCTAL_LIT | this_HEX_LIT_2= RULE_HEX_LIT )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_OCTAL_LIT:
                {
                alt3=2;
                }
                break;
            case RULE_HEX_LIT:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:286:3: this_INT_0= RULE_INT
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
                    // InternalGo.g:294:3: this_OCTAL_LIT_1= RULE_OCTAL_LIT
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
                    // InternalGo.g:302:3: this_HEX_LIT_2= RULE_HEX_LIT
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
    // InternalGo.g:313:1: entryRuleFloat_lit returns [String current=null] : iv_ruleFloat_lit= ruleFloat_lit EOF ;
    public final String entryRuleFloat_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat_lit = null;


        try {
            // InternalGo.g:313:49: (iv_ruleFloat_lit= ruleFloat_lit EOF )
            // InternalGo.g:314:2: iv_ruleFloat_lit= ruleFloat_lit EOF
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
    // InternalGo.g:320:1: ruleFloat_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? ) ;
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
            // InternalGo.g:326:2: ( (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? ) )
            // InternalGo.g:327:2: (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? )
            {
            // InternalGo.g:327:2: (this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )? )
            // InternalGo.g:328:3: this_INT_0= RULE_INT ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent ) kw= '.' this_INT_6= RULE_INT (this_Exponent_7= ruleExponent )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalGo.g:335:3: ( (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? ) | this_Exponent_4= ruleExponent )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=49 && LA6_0<=50)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:336:4: (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? )
                    {
                    // InternalGo.g:336:4: (kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )? )
                    // InternalGo.g:337:5: kw= '.' (this_INT_2= RULE_INT )? (this_Exponent_3= ruleExponent )?
                    {
                    kw=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getFloat_litAccess().getFullStopKeyword_1_0_0());
                      				
                    }
                    // InternalGo.g:342:5: (this_INT_2= RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalGo.g:343:6: this_INT_2= RULE_INT
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

                    // InternalGo.g:351:5: (this_Exponent_3= ruleExponent )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=49 && LA5_0<=50)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalGo.g:352:6: this_Exponent_3= ruleExponent
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
                    // InternalGo.g:365:4: this_Exponent_4= ruleExponent
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

            kw=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
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
            // InternalGo.g:388:3: (this_Exponent_7= ruleExponent )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=49 && LA7_0<=50)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:389:4: this_Exponent_7= ruleExponent
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
    // InternalGo.g:404:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // InternalGo.g:404:48: (iv_ruleExponent= ruleExponent EOF )
            // InternalGo.g:405:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalGo.g:411:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalGo.g:417:2: ( ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) )
            // InternalGo.g:418:2: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            {
            // InternalGo.g:418:2: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            // InternalGo.g:419:3: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_4= RULE_INT
            {
            // InternalGo.g:419:3: (kw= 'E' | kw= 'e' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            else if ( (LA8_0==50) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:420:4: kw= 'E'
                    {
                    kw=(Token)match(input,49,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:426:4: kw= 'e'
                    {
                    kw=(Token)match(input,50,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:432:3: (kw= '+' | kw= '-' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==51) ) {
                alt9=1;
            }
            else if ( (LA9_0==52) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:433:4: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getPlusSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:439:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_6); if (state.failed) return current;
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
    // InternalGo.g:456:1: entryRuleImaginary_lit returns [String current=null] : iv_ruleImaginary_lit= ruleImaginary_lit EOF ;
    public final String entryRuleImaginary_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImaginary_lit = null;


        try {
            // InternalGo.g:456:53: (iv_ruleImaginary_lit= ruleImaginary_lit EOF )
            // InternalGo.g:457:2: iv_ruleImaginary_lit= ruleImaginary_lit EOF
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
    // InternalGo.g:463:1: ruleImaginary_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' ) ;
    public final AntlrDatatypeRuleToken ruleImaginary_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Float_lit_1 = null;



        	enterRule();

        try {
            // InternalGo.g:469:2: ( ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' ) )
            // InternalGo.g:470:2: ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' )
            {
            // InternalGo.g:470:2: ( (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i' )
            // InternalGo.g:471:3: (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit ) kw= 'i'
            {
            // InternalGo.g:471:3: (this_INT_0= RULE_INT | this_Float_lit_1= ruleFloat_lit )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==53) ) {
                    alt10=1;
                }
                else if ( (LA10_1==47||(LA10_1>=49 && LA10_1<=50)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:472:4: this_INT_0= RULE_INT
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
                    // InternalGo.g:480:4: this_Float_lit_1= ruleFloat_lit
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

            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:500:1: entryRuleRune_lit returns [String current=null] : iv_ruleRune_lit= ruleRune_lit EOF ;
    public final String entryRuleRune_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRune_lit = null;


        try {
            // InternalGo.g:500:48: (iv_ruleRune_lit= ruleRune_lit EOF )
            // InternalGo.g:501:2: iv_ruleRune_lit= ruleRune_lit EOF
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
    // InternalGo.g:507:1: ruleRune_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken ruleRune_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_UNICODE_VALUE_1=null;
        AntlrDatatypeRuleToken this_Byte_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:513:2: ( (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' ) )
            // InternalGo.g:514:2: (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' )
            {
            // InternalGo.g:514:2: (kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\'' )
            // InternalGo.g:515:3: kw= '\\'' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value ) kw= '\\''
            {
            kw=(Token)match(input,54,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRune_litAccess().getApostropheKeyword_0());
              		
            }
            // InternalGo.g:520:3: (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_UNICODE_VALUE) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_OCTAL_BYTE_VALUE && LA11_0<=RULE_HEX_BYTE_VALUE)) ) {
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
                    // InternalGo.g:521:4: this_UNICODE_VALUE_1= RULE_UNICODE_VALUE
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
                    // InternalGo.g:529:4: this_Byte_value_2= ruleByte_value
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

            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:549:1: entryRuleByte_value returns [String current=null] : iv_ruleByte_value= ruleByte_value EOF ;
    public final String entryRuleByte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleByte_value = null;


        try {
            // InternalGo.g:549:50: (iv_ruleByte_value= ruleByte_value EOF )
            // InternalGo.g:550:2: iv_ruleByte_value= ruleByte_value EOF
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
    // InternalGo.g:556:1: ruleByte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleByte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OCTAL_BYTE_VALUE_0=null;
        Token this_HEX_BYTE_VALUE_1=null;


        	enterRule();

        try {
            // InternalGo.g:562:2: ( (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:563:2: (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:563:2: (this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE | this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_OCTAL_BYTE_VALUE) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_HEX_BYTE_VALUE) ) {
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
                    // InternalGo.g:564:3: this_OCTAL_BYTE_VALUE_0= RULE_OCTAL_BYTE_VALUE
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
                    // InternalGo.g:572:3: this_HEX_BYTE_VALUE_1= RULE_HEX_BYTE_VALUE
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
    // InternalGo.g:583:1: entryRuleString_lit returns [String current=null] : iv_ruleString_lit= ruleString_lit EOF ;
    public final String entryRuleString_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString_lit = null;


        try {
            // InternalGo.g:583:50: (iv_ruleString_lit= ruleString_lit EOF )
            // InternalGo.g:584:2: iv_ruleString_lit= ruleString_lit EOF
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
    // InternalGo.g:590:1: ruleString_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit ) ;
    public final AntlrDatatypeRuleToken ruleString_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RAW_STRING_LIT_0=null;
        AntlrDatatypeRuleToken this_Interpreted_string_lit_1 = null;



        	enterRule();

        try {
            // InternalGo.g:596:2: ( (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit ) )
            // InternalGo.g:597:2: (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit )
            {
            // InternalGo.g:597:2: (this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT | this_Interpreted_string_lit_1= ruleInterpreted_string_lit )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_RAW_STRING_LIT) ) {
                alt13=1;
            }
            else if ( (LA13_0==55) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:598:3: this_RAW_STRING_LIT_0= RULE_RAW_STRING_LIT
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
                    // InternalGo.g:606:3: this_Interpreted_string_lit_1= ruleInterpreted_string_lit
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
    // InternalGo.g:620:1: entryRuleInterpreted_string_lit returns [String current=null] : iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF ;
    public final String entryRuleInterpreted_string_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterpreted_string_lit = null;


        try {
            // InternalGo.g:620:62: (iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF )
            // InternalGo.g:621:2: iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF
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
    // InternalGo.g:627:1: ruleInterpreted_string_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleInterpreted_string_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_UNICODE_VALUE_1=null;
        AntlrDatatypeRuleToken this_Byte_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:633:2: ( (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' ) )
            // InternalGo.g:634:2: (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' )
            {
            // InternalGo.g:634:2: (kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"' )
            // InternalGo.g:635:3: kw= '\"' (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )* kw= '\"'
            {
            kw=(Token)match(input,55,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0());
              		
            }
            // InternalGo.g:640:3: (this_UNICODE_VALUE_1= RULE_UNICODE_VALUE | this_Byte_value_2= ruleByte_value )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_UNICODE_VALUE) ) {
                    alt14=1;
                }
                else if ( ((LA14_0>=RULE_OCTAL_BYTE_VALUE && LA14_0<=RULE_HEX_BYTE_VALUE)) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:641:4: this_UNICODE_VALUE_1= RULE_UNICODE_VALUE
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
            	    // InternalGo.g:649:4: this_Byte_value_2= ruleByte_value
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
            	    break loop14;
                }
            } while (true);

            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:669:1: entryRuleLiterals returns [String current=null] : iv_ruleLiterals= ruleLiterals EOF ;
    public final String entryRuleLiterals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiterals = null;


        try {
            // InternalGo.g:669:48: (iv_ruleLiterals= ruleLiterals EOF )
            // InternalGo.g:670:2: iv_ruleLiterals= ruleLiterals EOF
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
    // InternalGo.g:676:1: ruleLiterals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit ) ;
    public final AntlrDatatypeRuleToken ruleLiterals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Int_lit_0 = null;

        AntlrDatatypeRuleToken this_Float_lit_1 = null;

        AntlrDatatypeRuleToken this_Imaginary_lit_2 = null;

        AntlrDatatypeRuleToken this_Rune_lit_3 = null;

        AntlrDatatypeRuleToken this_String_lit_4 = null;



        	enterRule();

        try {
            // InternalGo.g:682:2: ( (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit ) )
            // InternalGo.g:683:2: (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit )
            {
            // InternalGo.g:683:2: (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit )
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalGo.g:684:3: this_Int_lit_0= ruleInt_lit
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
                    // InternalGo.g:695:3: this_Float_lit_1= ruleFloat_lit
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
                    // InternalGo.g:706:3: this_Imaginary_lit_2= ruleImaginary_lit
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
                    // InternalGo.g:717:3: this_Rune_lit_3= ruleRune_lit
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
                    // InternalGo.g:728:3: this_String_lit_4= ruleString_lit
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
    // InternalGo.g:742:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalGo.g:742:44: (iv_ruleType= ruleType EOF )
            // InternalGo.g:743:2: iv_ruleType= ruleType EOF
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
    // InternalGo.g:749:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Type_name_0= ruleType_name | this_Type_lit_1= ruleType_lit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_name_0 = null;

        AntlrDatatypeRuleToken this_Type_lit_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalGo.g:755:2: ( (this_Type_name_0= ruleType_name | this_Type_lit_1= ruleType_lit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) )
            // InternalGo.g:756:2: (this_Type_name_0= ruleType_name | this_Type_lit_1= ruleType_lit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
            {
            // InternalGo.g:756:2: (this_Type_name_0= ruleType_name | this_Type_lit_1= ruleType_lit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt16=1;
                }
                break;
            case 37:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalGo.g:757:3: this_Type_name_0= ruleType_name
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getType_nameParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalGo.g:768:3: this_Type_lit_1= ruleType_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getType_litParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Type_lit_1=ruleType_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Type_lit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:779:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    {
                    // InternalGo.g:779:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    // InternalGo.g:780:4: kw= '(' this_Type_3= ruleType kw= ')'
                    {
                    kw=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Type_3=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_name"
    // InternalGo.g:805:1: entryRuleType_name returns [String current=null] : iv_ruleType_name= ruleType_name EOF ;
    public final String entryRuleType_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_name = null;


        try {
            // InternalGo.g:805:49: (iv_ruleType_name= ruleType_name EOF )
            // InternalGo.g:806:2: iv_ruleType_name= ruleType_name EOF
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
    // InternalGo.g:812:1: ruleType_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident ) ;
    public final AntlrDatatypeRuleToken ruleType_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Qualified_ident_1 = null;



        	enterRule();

        try {
            // InternalGo.g:818:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident ) )
            // InternalGo.g:819:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident )
            {
            // InternalGo.g:819:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENTIFIER) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||LA17_1==RULE_SEMICOLON||(LA17_1>=RULE_RAW_STRING_LIT && LA17_1<=RULE_IDENTIFIER)||(LA17_1>=35 && LA17_1<=39)||LA17_1==42||LA17_1==44||(LA17_1>=55 && LA17_1<=63)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==47) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:820:3: this_IDENTIFIER_0= RULE_IDENTIFIER
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
                    // InternalGo.g:828:3: this_Qualified_ident_1= ruleQualified_ident
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


    // $ANTLR start "entryRuleType_lit"
    // InternalGo.g:842:1: entryRuleType_lit returns [String current=null] : iv_ruleType_lit= ruleType_lit EOF ;
    public final String entryRuleType_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_lit = null;


        try {
            // InternalGo.g:842:48: (iv_ruleType_lit= ruleType_lit EOF )
            // InternalGo.g:843:2: iv_ruleType_lit= ruleType_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType_lit=ruleType_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_lit.getText(); 
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
    // $ANTLR end "entryRuleType_lit"


    // $ANTLR start "ruleType_lit"
    // InternalGo.g:849:1: ruleType_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Array_type_0= ruleArray_type | this_Struct_type_1= ruleStruct_type | this_Pointer_type_2= rulePointer_type | this_Function_type_3= ruleFunction_type | this_Slice_type_4= ruleSlice_type | this_Map_type_5= ruleMap_type | this_Interface_type_6= ruleInterface_type | this_Channel_type_7= ruleChannel_type ) ;
    public final AntlrDatatypeRuleToken ruleType_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Array_type_0 = null;

        AntlrDatatypeRuleToken this_Struct_type_1 = null;

        AntlrDatatypeRuleToken this_Pointer_type_2 = null;

        AntlrDatatypeRuleToken this_Function_type_3 = null;

        AntlrDatatypeRuleToken this_Slice_type_4 = null;

        AntlrDatatypeRuleToken this_Map_type_5 = null;

        AntlrDatatypeRuleToken this_Interface_type_6 = null;

        AntlrDatatypeRuleToken this_Channel_type_7 = null;



        	enterRule();

        try {
            // InternalGo.g:855:2: ( (this_Array_type_0= ruleArray_type | this_Struct_type_1= ruleStruct_type | this_Pointer_type_2= rulePointer_type | this_Function_type_3= ruleFunction_type | this_Slice_type_4= ruleSlice_type | this_Map_type_5= ruleMap_type | this_Interface_type_6= ruleInterface_type | this_Channel_type_7= ruleChannel_type ) )
            // InternalGo.g:856:2: (this_Array_type_0= ruleArray_type | this_Struct_type_1= ruleStruct_type | this_Pointer_type_2= rulePointer_type | this_Function_type_3= ruleFunction_type | this_Slice_type_4= ruleSlice_type | this_Map_type_5= ruleMap_type | this_Interface_type_6= ruleInterface_type | this_Channel_type_7= ruleChannel_type )
            {
            // InternalGo.g:856:2: (this_Array_type_0= ruleArray_type | this_Struct_type_1= ruleStruct_type | this_Pointer_type_2= rulePointer_type | this_Function_type_3= ruleFunction_type | this_Slice_type_4= ruleSlice_type | this_Map_type_5= ruleMap_type | this_Interface_type_6= ruleInterface_type | this_Channel_type_7= ruleChannel_type )
            int alt18=8;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalGo.g:857:3: this_Array_type_0= ruleArray_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getArray_typeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Array_type_0=ruleArray_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Array_type_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:868:3: this_Struct_type_1= ruleStruct_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getStruct_typeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Struct_type_1=ruleStruct_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Struct_type_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:879:3: this_Pointer_type_2= rulePointer_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getPointer_typeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Pointer_type_2=rulePointer_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Pointer_type_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:890:3: this_Function_type_3= ruleFunction_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getFunction_typeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Function_type_3=ruleFunction_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Function_type_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:901:3: this_Slice_type_4= ruleSlice_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getSlice_typeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Slice_type_4=ruleSlice_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Slice_type_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:912:3: this_Map_type_5= ruleMap_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getMap_typeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Map_type_5=ruleMap_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Map_type_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:923:3: this_Interface_type_6= ruleInterface_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getInterface_typeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interface_type_6=ruleInterface_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Interface_type_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:934:3: this_Channel_type_7= ruleChannel_type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_litAccess().getChannel_typeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Channel_type_7=ruleChannel_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Channel_type_7);
                      		
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
    // $ANTLR end "ruleType_lit"


    // $ANTLR start "entryRuleArray_type"
    // InternalGo.g:948:1: entryRuleArray_type returns [String current=null] : iv_ruleArray_type= ruleArray_type EOF ;
    public final String entryRuleArray_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray_type = null;


        try {
            // InternalGo.g:948:50: (iv_ruleArray_type= ruleArray_type EOF )
            // InternalGo.g:949:2: iv_ruleArray_type= ruleArray_type EOF
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
    // InternalGo.g:955:1: ruleArray_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleArray_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Parameter_list_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalGo.g:961:2: ( (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType ) )
            // InternalGo.g:962:2: (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType )
            {
            // InternalGo.g:962:2: (kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType )
            // InternalGo.g:963:3: kw= '[' ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) kw= ']' this_Type_3= ruleType
            {
            kw=(Token)match(input,37,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGo.g:968:3: ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list )
            // InternalGo.g:969:4: ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getArray_typeAccess().getParameter_listParserRuleCall_1());
              			
            }
            pushFollow(FOLLOW_16);
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

            kw=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
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
    // InternalGo.g:1001:1: entryRuleStruct_type returns [String current=null] : iv_ruleStruct_type= ruleStruct_type EOF ;
    public final String entryRuleStruct_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStruct_type = null;


        try {
            // InternalGo.g:1001:51: (iv_ruleStruct_type= ruleStruct_type EOF )
            // InternalGo.g:1002:2: iv_ruleStruct_type= ruleStruct_type EOF
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
    // InternalGo.g:1008:1: ruleStruct_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStruct_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SEMICOLON_3=null;
        AntlrDatatypeRuleToken this_Field_decl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1014:2: ( (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' ) )
            // InternalGo.g:1015:2: (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' )
            {
            // InternalGo.g:1015:2: (kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' )
            // InternalGo.g:1016:3: kw= 'struct' kw= '{' (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}'
            {
            kw=(Token)match(input,56,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStruct_typeAccess().getStructKeyword_0());
              		
            }
            kw=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStruct_typeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:1026:3: (this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_IDENTIFIER||LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:1027:4: this_Field_decl_2= ruleField_decl this_SEMICOLON_3= RULE_SEMICOLON
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStruct_typeAccess().getField_declParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_19);
            	    this_Field_decl_2=ruleField_decl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Field_decl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SEMICOLON_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SEMICOLON_3, grammarAccess.getStruct_typeAccess().getSEMICOLONTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1054:1: entryRuleField_decl returns [String current=null] : iv_ruleField_decl= ruleField_decl EOF ;
    public final String entryRuleField_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleField_decl = null;


        try {
            // InternalGo.g:1054:50: (iv_ruleField_decl= ruleField_decl EOF )
            // InternalGo.g:1055:2: iv_ruleField_decl= ruleField_decl EOF
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
    // InternalGo.g:1061:1: ruleField_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? ) ;
    public final AntlrDatatypeRuleToken ruleField_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_list_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_Embedded_field_2 = null;

        AntlrDatatypeRuleToken this_String_lit_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1067:2: ( ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? ) )
            // InternalGo.g:1068:2: ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? )
            {
            // InternalGo.g:1068:2: ( ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )? )
            // InternalGo.g:1069:3: ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field ) (this_String_lit_3= ruleString_lit )?
            {
            // InternalGo.g:1069:3: ( (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType ) | this_Embedded_field_2= ruleEmbedded_field )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER) ) {
                alt20=1;
            }
            else if ( (LA20_0==57) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:1070:4: (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType )
                    {
                    // InternalGo.g:1070:4: (this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType )
                    // InternalGo.g:1071:5: this_Identifier_list_0= ruleIdentifier_list this_Type_1= ruleType
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
                    pushFollow(FOLLOW_20);
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
                    // InternalGo.g:1093:4: this_Embedded_field_2= ruleEmbedded_field
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getField_declAccess().getEmbedded_fieldParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_20);
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

            // InternalGo.g:1104:3: (this_String_lit_3= ruleString_lit )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_RAW_STRING_LIT||LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1105:4: this_String_lit_3= ruleString_lit
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
    // InternalGo.g:1120:1: entryRuleEmbedded_field returns [String current=null] : iv_ruleEmbedded_field= ruleEmbedded_field EOF ;
    public final String entryRuleEmbedded_field() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmbedded_field = null;


        try {
            // InternalGo.g:1120:54: (iv_ruleEmbedded_field= ruleEmbedded_field EOF )
            // InternalGo.g:1121:2: iv_ruleEmbedded_field= ruleEmbedded_field EOF
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
    // InternalGo.g:1127:1: ruleEmbedded_field returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' )+ this_Type_name_1= ruleType_name ) ;
    public final AntlrDatatypeRuleToken ruleEmbedded_field() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_name_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1133:2: ( ( (kw= '*' )+ this_Type_name_1= ruleType_name ) )
            // InternalGo.g:1134:2: ( (kw= '*' )+ this_Type_name_1= ruleType_name )
            {
            // InternalGo.g:1134:2: ( (kw= '*' )+ this_Type_name_1= ruleType_name )
            // InternalGo.g:1135:3: (kw= '*' )+ this_Type_name_1= ruleType_name
            {
            // InternalGo.g:1135:3: (kw= '*' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==57) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGo.g:1136:4: kw= '*'
            	    {
            	    kw=(Token)match(input,57,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalGo.g:1156:1: entryRulePointer_type returns [String current=null] : iv_rulePointer_type= rulePointer_type EOF ;
    public final String entryRulePointer_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointer_type = null;


        try {
            // InternalGo.g:1156:52: (iv_rulePointer_type= rulePointer_type EOF )
            // InternalGo.g:1157:2: iv_rulePointer_type= rulePointer_type EOF
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
    // InternalGo.g:1163:1: rulePointer_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken rulePointer_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1169:2: ( (kw= '*' this_Type_1= ruleType ) )
            // InternalGo.g:1170:2: (kw= '*' this_Type_1= ruleType )
            {
            // InternalGo.g:1170:2: (kw= '*' this_Type_1= ruleType )
            // InternalGo.g:1171:3: kw= '*' this_Type_1= ruleType
            {
            kw=(Token)match(input,57,FOLLOW_13); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFunction_type"
    // InternalGo.g:1190:1: entryRuleFunction_type returns [String current=null] : iv_ruleFunction_type= ruleFunction_type EOF ;
    public final String entryRuleFunction_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction_type = null;


        try {
            // InternalGo.g:1190:53: (iv_ruleFunction_type= ruleFunction_type EOF )
            // InternalGo.g:1191:2: iv_ruleFunction_type= ruleFunction_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction_type=ruleFunction_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction_type.getText(); 
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
    // $ANTLR end "entryRuleFunction_type"


    // $ANTLR start "ruleFunction_type"
    // InternalGo.g:1197:1: ruleFunction_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_Signature_1= ruleSignature ) ;
    public final AntlrDatatypeRuleToken ruleFunction_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Signature_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1203:2: ( (kw= 'func' this_Signature_1= ruleSignature ) )
            // InternalGo.g:1204:2: (kw= 'func' this_Signature_1= ruleSignature )
            {
            // InternalGo.g:1204:2: (kw= 'func' this_Signature_1= ruleSignature )
            // InternalGo.g:1205:3: kw= 'func' this_Signature_1= ruleSignature
            {
            kw=(Token)match(input,58,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunction_typeAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunction_typeAccess().getSignatureParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Signature_1=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_1);
              		
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
    // $ANTLR end "ruleFunction_type"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:1224:1: entryRuleSignature returns [String current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final String entryRuleSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignature = null;


        try {
            // InternalGo.g:1224:49: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:1225:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature.getText(); 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:1231:1: ruleSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )+ ) ;
    public final AntlrDatatypeRuleToken ruleSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Result_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1237:2: ( (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )+ ) )
            // InternalGo.g:1238:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )+ )
            {
            // InternalGo.g:1238:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )+ )
            // InternalGo.g:1239:3: this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )+
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Parameters_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1249:3: ( ( ruleResult )=>this_Result_1= ruleResult )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalGo.g:1250:4: ( ruleResult )=>this_Result_1= ruleResult
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSignatureAccess().getResultParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
            	    this_Result_1=ruleResult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Result_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalGo.g:1266:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // InternalGo.g:1266:46: (iv_ruleResult= ruleResult EOF )
            // InternalGo.g:1267:2: iv_ruleResult= ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResult.getText(); 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGo.g:1273:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters | ( ( ruleType )=>this_Type_1= ruleType ) ) ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1279:2: ( (this_Parameters_0= ruleParameters | ( ( ruleType )=>this_Type_1= ruleType ) ) )
            // InternalGo.g:1280:2: (this_Parameters_0= ruleParameters | ( ( ruleType )=>this_Type_1= ruleType ) )
            {
            // InternalGo.g:1280:2: (this_Parameters_0= ruleParameters | ( ( ruleType )=>this_Type_1= ruleType ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1281:3: this_Parameters_0= ruleParameters
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getParametersParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameters_0=ruleParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Parameters_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1292:3: ( ( ruleType )=>this_Type_1= ruleType )
                    {
                    // InternalGo.g:1292:3: ( ( ruleType )=>this_Type_1= ruleType )
                    // InternalGo.g:1293:4: ( ruleType )=>this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getResultAccess().getTypeParserRuleCall_1());
                      			
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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:1309:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // InternalGo.g:1309:50: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:1310:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters.getText(); 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:1316:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+ )+ kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Parameter_list_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1322:2: ( (kw= '(' ( ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+ )+ kw= ')' ) )
            // InternalGo.g:1323:2: (kw= '(' ( ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+ )+ kw= ')' )
            {
            // InternalGo.g:1323:2: (kw= '(' ( ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+ )+ kw= ')' )
            // InternalGo.g:1324:3: kw= '(' ( ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+ )+ kw= ')'
            {
            kw=(Token)match(input,35,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGo.g:1329:3: ( ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+ )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:1330:4: ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+
            	    {
            	    // InternalGo.g:1330:4: ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list )
            	    // InternalGo.g:1331:5: ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getParametersAccess().getParameter_listParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
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

            	    // InternalGo.g:1344:4: (kw= ',' )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==44) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalGo.g:1345:5: kw= ','
            	    	    {
            	    	    kw=(Token)match(input,44,FOLLOW_25); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(kw);
            	    	      					newLeafNode(kw, grammarAccess.getParametersAccess().getCommaKeyword_1_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt25 >= 1 ) break loop25;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(25, input);
            	                throw eee;
            	        }
            	        cnt25++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter_list"
    // InternalGo.g:1361:1: entryRuleParameter_list returns [String current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final String entryRuleParameter_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter_list = null;


        try {
            // InternalGo.g:1361:54: (iv_ruleParameter_list= ruleParameter_list EOF )
            // InternalGo.g:1362:2: iv_ruleParameter_list= ruleParameter_list EOF
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
    // InternalGo.g:1368:1: ruleParameter_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) ( ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )=> (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) ) )* ) ;
    public final AntlrDatatypeRuleToken ruleParameter_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Parameter_decl_0 = null;

        AntlrDatatypeRuleToken this_Parameter_decl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1374:2: ( ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) ( ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )=> (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) ) )* ) )
            // InternalGo.g:1375:2: ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) ( ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )=> (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) ) )* )
            {
            // InternalGo.g:1375:2: ( ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) ( ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )=> (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) ) )* )
            // InternalGo.g:1376:3: ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl ) ( ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )=> (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) ) )*
            {
            // InternalGo.g:1376:3: ( ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl )
            // InternalGo.g:1377:4: ( ruleIdentifier_list )=>this_Parameter_decl_0= ruleParameter_decl
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_26);
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

            // InternalGo.g:1390:3: ( ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )=> (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==44) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred7_InternalGo()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalGo.g:1391:4: ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )=> (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )
            	    {
            	    // InternalGo.g:1400:4: (kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl ) )
            	    // InternalGo.g:1401:5: kw= ',' ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl )
            	    {
            	    kw=(Token)match(input,44,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0_0());
            	      				
            	    }
            	    // InternalGo.g:1406:5: ( ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl )
            	    // InternalGo.g:1407:6: ( ruleIdentifier_list )=>this_Parameter_decl_2= ruleParameter_decl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_0_1());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalGo.g:1426:1: entryRuleParameter_decl returns [String current=null] : iv_ruleParameter_decl= ruleParameter_decl EOF ;
    public final String entryRuleParameter_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter_decl = null;


        try {
            // InternalGo.g:1426:54: (iv_ruleParameter_decl= ruleParameter_decl EOF )
            // InternalGo.g:1427:2: iv_ruleParameter_decl= ruleParameter_decl EOF
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
    // InternalGo.g:1433:1: ruleParameter_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleParameter_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_list_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1439:2: ( ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType ) )
            // InternalGo.g:1440:2: ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType )
            {
            // InternalGo.g:1440:2: ( ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType )
            // InternalGo.g:1441:3: ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )? (kw= '...' )? this_Type_2= ruleType
            {
            // InternalGo.g:1441:3: ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalGo.g:1442:4: ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameter_declAccess().getIdentifier_listParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
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

            // InternalGo.g:1455:3: (kw= '...' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:1456:4: kw= '...'
                    {
                    kw=(Token)match(input,46,FOLLOW_13); if (state.failed) return current;
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
    // InternalGo.g:1476:1: entryRuleIdentifier_list returns [String current=null] : iv_ruleIdentifier_list= ruleIdentifier_list EOF ;
    public final String entryRuleIdentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier_list = null;


        try {
            // InternalGo.g:1476:55: (iv_ruleIdentifier_list= ruleIdentifier_list EOF )
            // InternalGo.g:1477:2: iv_ruleIdentifier_list= ruleIdentifier_list EOF
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
    // InternalGo.g:1483:1: ruleIdentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalGo.g:1489:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // InternalGo.g:1490:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // InternalGo.g:1490:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // InternalGo.g:1491:3: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            // InternalGo.g:1498:3: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:1499:4: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,44,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENTIFIER_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
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


    // $ANTLR start "entryRuleInterface_type"
    // InternalGo.g:1516:1: entryRuleInterface_type returns [String current=null] : iv_ruleInterface_type= ruleInterface_type EOF ;
    public final String entryRuleInterface_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_type = null;


        try {
            // InternalGo.g:1516:54: (iv_ruleInterface_type= ruleInterface_type EOF )
            // InternalGo.g:1517:2: iv_ruleInterface_type= ruleInterface_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterface_type=ruleInterface_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_type.getText(); 
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
    // $ANTLR end "entryRuleInterface_type"


    // $ANTLR start "ruleInterface_type"
    // InternalGo.g:1523:1: ruleInterface_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'interface' kw= '{' (this_Method_spec_2= ruleMethod_spec this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleInterface_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SEMICOLON_3=null;
        AntlrDatatypeRuleToken this_Method_spec_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1529:2: ( (kw= 'interface' kw= '{' (this_Method_spec_2= ruleMethod_spec this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' ) )
            // InternalGo.g:1530:2: (kw= 'interface' kw= '{' (this_Method_spec_2= ruleMethod_spec this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' )
            {
            // InternalGo.g:1530:2: (kw= 'interface' kw= '{' (this_Method_spec_2= ruleMethod_spec this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}' )
            // InternalGo.g:1531:3: kw= 'interface' kw= '{' (this_Method_spec_2= ruleMethod_spec this_SEMICOLON_3= RULE_SEMICOLON )* kw= '}'
            {
            kw=(Token)match(input,59,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterface_typeAccess().getInterfaceKeyword_0());
              		
            }
            kw=(Token)match(input,39,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterface_typeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:1541:3: (this_Method_spec_2= ruleMethod_spec this_SEMICOLON_3= RULE_SEMICOLON )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_IDENTIFIER) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:1542:4: this_Method_spec_2= ruleMethod_spec this_SEMICOLON_3= RULE_SEMICOLON
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInterface_typeAccess().getMethod_specParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_19);
            	    this_Method_spec_2=ruleMethod_spec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Method_spec_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SEMICOLON_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SEMICOLON_3, grammarAccess.getInterface_typeAccess().getSEMICOLONTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterface_typeAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleInterface_type"


    // $ANTLR start "entryRuleMethod_spec"
    // InternalGo.g:1569:1: entryRuleMethod_spec returns [String current=null] : iv_ruleMethod_spec= ruleMethod_spec EOF ;
    public final String entryRuleMethod_spec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethod_spec = null;


        try {
            // InternalGo.g:1569:51: (iv_ruleMethod_spec= ruleMethod_spec EOF )
            // InternalGo.g:1570:2: iv_ruleMethod_spec= ruleMethod_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_specRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod_spec=ruleMethod_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_spec.getText(); 
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
    // $ANTLR end "entryRuleMethod_spec"


    // $ANTLR start "ruleMethod_spec"
    // InternalGo.g:1576:1: ruleMethod_spec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Signature_1= ruleSignature ) | this_Type_name_2= ruleType_name ) ;
    public final AntlrDatatypeRuleToken ruleMethod_spec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Signature_1 = null;

        AntlrDatatypeRuleToken this_Type_name_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1582:2: ( ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Signature_1= ruleSignature ) | this_Type_name_2= ruleType_name ) )
            // InternalGo.g:1583:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Signature_1= ruleSignature ) | this_Type_name_2= ruleType_name )
            {
            // InternalGo.g:1583:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Signature_1= ruleSignature ) | this_Type_name_2= ruleType_name )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_IDENTIFIER) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==EOF||LA32_1==RULE_SEMICOLON||LA32_1==47) ) {
                    alt32=2;
                }
                else if ( (LA32_1==35) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:1584:3: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Signature_1= ruleSignature )
                    {
                    // InternalGo.g:1584:3: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Signature_1= ruleSignature )
                    // InternalGo.g:1585:4: this_IDENTIFIER_0= RULE_IDENTIFIER this_Signature_1= ruleSignature
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_0, grammarAccess.getMethod_specAccess().getIDENTIFIERTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethod_specAccess().getSignatureParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Signature_1=ruleSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Signature_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1604:3: this_Type_name_2= ruleType_name
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethod_specAccess().getType_nameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Type_name_2=ruleType_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Type_name_2);
                      		
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
    // $ANTLR end "ruleMethod_spec"


    // $ANTLR start "entryRuleSlice_type"
    // InternalGo.g:1618:1: entryRuleSlice_type returns [String current=null] : iv_ruleSlice_type= ruleSlice_type EOF ;
    public final String entryRuleSlice_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlice_type = null;


        try {
            // InternalGo.g:1618:50: (iv_ruleSlice_type= ruleSlice_type EOF )
            // InternalGo.g:1619:2: iv_ruleSlice_type= ruleSlice_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlice_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSlice_type=ruleSlice_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlice_type.getText(); 
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
    // $ANTLR end "entryRuleSlice_type"


    // $ANTLR start "ruleSlice_type"
    // InternalGo.g:1625:1: ruleSlice_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleSlice_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1631:2: ( (kw= '[' kw= ']' this_Type_2= ruleType ) )
            // InternalGo.g:1632:2: (kw= '[' kw= ']' this_Type_2= ruleType )
            {
            // InternalGo.g:1632:2: (kw= '[' kw= ']' this_Type_2= ruleType )
            // InternalGo.g:1633:3: kw= '[' kw= ']' this_Type_2= ruleType
            {
            kw=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSlice_typeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSlice_typeAccess().getRightSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlice_typeAccess().getTypeParserRuleCall_2());
              		
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
    // $ANTLR end "ruleSlice_type"


    // $ANTLR start "entryRuleMap_type"
    // InternalGo.g:1657:1: entryRuleMap_type returns [String current=null] : iv_ruleMap_type= ruleMap_type EOF ;
    public final String entryRuleMap_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMap_type = null;


        try {
            // InternalGo.g:1657:48: (iv_ruleMap_type= ruleMap_type EOF )
            // InternalGo.g:1658:2: iv_ruleMap_type= ruleMap_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMap_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMap_type=ruleMap_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMap_type.getText(); 
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
    // $ANTLR end "entryRuleMap_type"


    // $ANTLR start "ruleMap_type"
    // InternalGo.g:1664:1: ruleMap_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'map' kw= '[' this_Type_2= ruleType kw= ']' this_Type_4= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleMap_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_Type_4 = null;



        	enterRule();

        try {
            // InternalGo.g:1670:2: ( (kw= 'map' kw= '[' this_Type_2= ruleType kw= ']' this_Type_4= ruleType ) )
            // InternalGo.g:1671:2: (kw= 'map' kw= '[' this_Type_2= ruleType kw= ']' this_Type_4= ruleType )
            {
            // InternalGo.g:1671:2: (kw= 'map' kw= '[' this_Type_2= ruleType kw= ']' this_Type_4= ruleType )
            // InternalGo.g:1672:3: kw= 'map' kw= '[' this_Type_2= ruleType kw= ']' this_Type_4= ruleType
            {
            kw=(Token)match(input,60,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMap_typeAccess().getMapKeyword_0());
              		
            }
            kw=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMap_typeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMap_typeAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_16);
            this_Type_2=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMap_typeAccess().getRightSquareBracketKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMap_typeAccess().getTypeParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_4=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_4);
              		
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
    // $ANTLR end "ruleMap_type"


    // $ANTLR start "entryRuleChannel_type"
    // InternalGo.g:1711:1: entryRuleChannel_type returns [String current=null] : iv_ruleChannel_type= ruleChannel_type EOF ;
    public final String entryRuleChannel_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannel_type = null;


        try {
            // InternalGo.g:1711:52: (iv_ruleChannel_type= ruleChannel_type EOF )
            // InternalGo.g:1712:2: iv_ruleChannel_type= ruleChannel_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannel_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannel_type=ruleChannel_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannel_type.getText(); 
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
    // $ANTLR end "entryRuleChannel_type"


    // $ANTLR start "ruleChannel_type"
    // InternalGo.g:1718:1: ruleChannel_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'chan' | kw= 'chan<-' | kw= '<-chan' ) this_Type_3= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleChannel_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1724:2: ( ( (kw= 'chan' | kw= 'chan<-' | kw= '<-chan' ) this_Type_3= ruleType ) )
            // InternalGo.g:1725:2: ( (kw= 'chan' | kw= 'chan<-' | kw= '<-chan' ) this_Type_3= ruleType )
            {
            // InternalGo.g:1725:2: ( (kw= 'chan' | kw= 'chan<-' | kw= '<-chan' ) this_Type_3= ruleType )
            // InternalGo.g:1726:3: (kw= 'chan' | kw= 'chan<-' | kw= '<-chan' ) this_Type_3= ruleType
            {
            // InternalGo.g:1726:3: (kw= 'chan' | kw= 'chan<-' | kw= '<-chan' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt33=1;
                }
                break;
            case 62:
                {
                alt33=2;
                }
                break;
            case 63:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGo.g:1727:4: kw= 'chan'
                    {
                    kw=(Token)match(input,61,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getChannel_typeAccess().getChanKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1733:4: kw= 'chan<-'
                    {
                    kw=(Token)match(input,62,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getChannel_typeAccess().getChanKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1739:4: kw= '<-chan'
                    {
                    kw=(Token)match(input,63,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getChannel_typeAccess().getChanKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChannel_typeAccess().getTypeParserRuleCall_1());
              		
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
    // $ANTLR end "ruleChannel_type"


    // $ANTLR start "entryRuleBlock"
    // InternalGo.g:1759:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalGo.g:1759:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalGo.g:1760:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock.getText(); 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalGo.g:1766:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_Statement_list_1= ruleStatement_list kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_list_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1772:2: ( (kw= '{' this_Statement_list_1= ruleStatement_list kw= '}' ) )
            // InternalGo.g:1773:2: (kw= '{' this_Statement_list_1= ruleStatement_list kw= '}' )
            {
            // InternalGo.g:1773:2: (kw= '{' this_Statement_list_1= ruleStatement_list kw= '}' )
            // InternalGo.g:1774:3: kw= '{' this_Statement_list_1= ruleStatement_list kw= '}'
            {
            kw=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBlockAccess().getStatement_listParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_31);
            this_Statement_list_1=ruleStatement_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Statement_list_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
              		
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement_list"
    // InternalGo.g:1798:1: entryRuleStatement_list returns [String current=null] : iv_ruleStatement_list= ruleStatement_list EOF ;
    public final String entryRuleStatement_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement_list = null;


        try {
            // InternalGo.g:1798:54: (iv_ruleStatement_list= ruleStatement_list EOF )
            // InternalGo.g:1799:2: iv_ruleStatement_list= ruleStatement_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement_list=ruleStatement_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_list.getText(); 
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
    // $ANTLR end "entryRuleStatement_list"


    // $ANTLR start "ruleStatement_list"
    // InternalGo.g:1805:1: ruleStatement_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Statement_0= ruleStatement this_SEMICOLON_1= RULE_SEMICOLON )* ;
    public final AntlrDatatypeRuleToken ruleStatement_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SEMICOLON_1=null;
        AntlrDatatypeRuleToken this_Statement_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1811:2: ( (this_Statement_0= ruleStatement this_SEMICOLON_1= RULE_SEMICOLON )* )
            // InternalGo.g:1812:2: (this_Statement_0= ruleStatement this_SEMICOLON_1= RULE_SEMICOLON )*
            {
            // InternalGo.g:1812:2: (this_Statement_0= ruleStatement this_SEMICOLON_1= RULE_SEMICOLON )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_IDENTIFIER||LA34_0==35||LA34_0==39||(LA34_0>=64 && LA34_0<=66)||(LA34_0>=68 && LA34_0<=73)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGo.g:1813:3: this_Statement_0= ruleStatement this_SEMICOLON_1= RULE_SEMICOLON
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getStatement_listAccess().getStatementParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_19);
            	    this_Statement_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Statement_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_SEMICOLON_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_SEMICOLON_1, grammarAccess.getStatement_listAccess().getSEMICOLONTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


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
    // $ANTLR end "ruleStatement_list"


    // $ANTLR start "entryRuleDeclaration"
    // InternalGo.g:1834:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalGo.g:1834:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalGo.g:1835:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration.getText(); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalGo.g:1841:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Const_decl_0= ruleConst_decl ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Const_decl_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1847:2: (this_Const_decl_0= ruleConst_decl )
            // InternalGo.g:1848:2: this_Const_decl_0= ruleConst_decl
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getDeclarationAccess().getConst_declParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Const_decl_0=ruleConst_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Const_decl_0);
              	
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleConst_decl"
    // InternalGo.g:1861:1: entryRuleConst_decl returns [String current=null] : iv_ruleConst_decl= ruleConst_decl EOF ;
    public final String entryRuleConst_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConst_decl = null;


        try {
            // InternalGo.g:1861:50: (iv_ruleConst_decl= ruleConst_decl EOF )
            // InternalGo.g:1862:2: iv_ruleConst_decl= ruleConst_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConst_declRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConst_decl=ruleConst_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst_decl.getText(); 
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
    // $ANTLR end "entryRuleConst_decl"


    // $ANTLR start "ruleConst_decl"
    // InternalGo.g:1868:1: ruleConst_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'const' this_Const_spec_1= ruleConst_spec ) | (kw= '(' (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleConst_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken this_Const_spec_1 = null;

        AntlrDatatypeRuleToken this_Const_spec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1874:2: ( ( (kw= 'const' this_Const_spec_1= ruleConst_spec ) | (kw= '(' (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) )
            // InternalGo.g:1875:2: ( (kw= 'const' this_Const_spec_1= ruleConst_spec ) | (kw= '(' (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) )
            {
            // InternalGo.g:1875:2: ( (kw= 'const' this_Const_spec_1= ruleConst_spec ) | (kw= '(' (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==64) ) {
                alt36=1;
            }
            else if ( (LA36_0==35) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalGo.g:1876:3: (kw= 'const' this_Const_spec_1= ruleConst_spec )
                    {
                    // InternalGo.g:1876:3: (kw= 'const' this_Const_spec_1= ruleConst_spec )
                    // InternalGo.g:1877:4: kw= 'const' this_Const_spec_1= ruleConst_spec
                    {
                    kw=(Token)match(input,64,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConst_declAccess().getConstKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConst_declAccess().getConst_specParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Const_spec_1=ruleConst_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Const_spec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1894:3: (kw= '(' (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' )
                    {
                    // InternalGo.g:1894:3: (kw= '(' (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' )
                    // InternalGo.g:1895:4: kw= '(' (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')'
                    {
                    kw=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConst_declAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGo.g:1900:4: (this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_IDENTIFIER) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalGo.g:1901:5: this_Const_spec_3= ruleConst_spec this_SEMICOLON_4= RULE_SEMICOLON
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getConst_declAccess().getConst_specParserRuleCall_1_1_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    this_Const_spec_3=ruleConst_spec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_Const_spec_3);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SEMICOLON_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SEMICOLON_4, grammarAccess.getConst_declAccess().getSEMICOLONTerminalRuleCall_1_1_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConst_declAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

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
    // $ANTLR end "ruleConst_decl"


    // $ANTLR start "entryRuleConst_spec"
    // InternalGo.g:1929:1: entryRuleConst_spec returns [String current=null] : iv_ruleConst_spec= ruleConst_spec EOF ;
    public final String entryRuleConst_spec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConst_spec = null;


        try {
            // InternalGo.g:1929:50: (iv_ruleConst_spec= ruleConst_spec EOF )
            // InternalGo.g:1930:2: iv_ruleConst_spec= ruleConst_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConst_specRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConst_spec=ruleConst_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst_spec.getText(); 
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
    // $ANTLR end "entryRuleConst_spec"


    // $ANTLR start "ruleConst_spec"
    // InternalGo.g:1936:1: ruleConst_spec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Identifier_list_0= ruleIdentifier_list ( (this_Type_1= ruleType )? kw= '=' this_Expression_list_3= ruleExpression_list )? ) ;
    public final AntlrDatatypeRuleToken ruleConst_spec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_list_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_Expression_list_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1942:2: ( (this_Identifier_list_0= ruleIdentifier_list ( (this_Type_1= ruleType )? kw= '=' this_Expression_list_3= ruleExpression_list )? ) )
            // InternalGo.g:1943:2: (this_Identifier_list_0= ruleIdentifier_list ( (this_Type_1= ruleType )? kw= '=' this_Expression_list_3= ruleExpression_list )? )
            {
            // InternalGo.g:1943:2: (this_Identifier_list_0= ruleIdentifier_list ( (this_Type_1= ruleType )? kw= '=' this_Expression_list_3= ruleExpression_list )? )
            // InternalGo.g:1944:3: this_Identifier_list_0= ruleIdentifier_list ( (this_Type_1= ruleType )? kw= '=' this_Expression_list_3= ruleExpression_list )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConst_specAccess().getIdentifier_listParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_Identifier_list_0=ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Identifier_list_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1954:3: ( (this_Type_1= ruleType )? kw= '=' this_Expression_list_3= ruleExpression_list )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_IDENTIFIER||LA38_0==35||LA38_0==37||LA38_0==42||(LA38_0>=56 && LA38_0<=63)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGo.g:1955:4: (this_Type_1= ruleType )? kw= '=' this_Expression_list_3= ruleExpression_list
                    {
                    // InternalGo.g:1955:4: (this_Type_1= ruleType )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_IDENTIFIER||LA37_0==35||LA37_0==37||(LA37_0>=56 && LA37_0<=63)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalGo.g:1956:5: this_Type_1= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConst_specAccess().getTypeParserRuleCall_1_0());
                              				
                            }
                            pushFollow(FOLLOW_35);
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
                            break;

                    }

                    kw=(Token)match(input,42,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConst_specAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConst_specAccess().getExpression_listParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_list_3=ruleExpression_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_list_3);
                      			
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
    // $ANTLR end "ruleConst_spec"


    // $ANTLR start "entryRuleExpression_list"
    // InternalGo.g:1987:1: entryRuleExpression_list returns [String current=null] : iv_ruleExpression_list= ruleExpression_list EOF ;
    public final String entryRuleExpression_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression_list = null;


        try {
            // InternalGo.g:1987:55: (iv_ruleExpression_list= ruleExpression_list EOF )
            // InternalGo.g:1988:2: iv_ruleExpression_list= ruleExpression_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression_list=ruleExpression_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_list.getText(); 
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
    // $ANTLR end "entryRuleExpression_list"


    // $ANTLR start "ruleExpression_list"
    // InternalGo.g:1994:1: ruleExpression_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpression_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2000:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalGo.g:2001:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalGo.g:2001:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalGo.g:2002:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2012:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==44) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:2013:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,44,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_26);
            	    this_Expression_2=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleExpression_list"


    // $ANTLR start "entryRuleFunction_decl"
    // InternalGo.g:2033:1: entryRuleFunction_decl returns [String current=null] : iv_ruleFunction_decl= ruleFunction_decl EOF ;
    public final String entryRuleFunction_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction_decl = null;


        try {
            // InternalGo.g:2033:53: (iv_ruleFunction_decl= ruleFunction_decl EOF )
            // InternalGo.g:2034:2: iv_ruleFunction_decl= ruleFunction_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_declRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction_decl=ruleFunction_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction_decl.getText(); 
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
    // $ANTLR end "entryRuleFunction_decl"


    // $ANTLR start "ruleFunction_decl"
    // InternalGo.g:2040:1: ruleFunction_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER this_Signature_2= ruleSignature (this_Function_body_3= ruleFunction_body )? ) ;
    public final AntlrDatatypeRuleToken ruleFunction_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_Signature_2 = null;

        AntlrDatatypeRuleToken this_Function_body_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2046:2: ( (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER this_Signature_2= ruleSignature (this_Function_body_3= ruleFunction_body )? ) )
            // InternalGo.g:2047:2: (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER this_Signature_2= ruleSignature (this_Function_body_3= ruleFunction_body )? )
            {
            // InternalGo.g:2047:2: (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER this_Signature_2= ruleSignature (this_Function_body_3= ruleFunction_body )? )
            // InternalGo.g:2048:3: kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER this_Signature_2= ruleSignature (this_Function_body_3= ruleFunction_body )?
            {
            kw=(Token)match(input,58,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunction_declAccess().getFuncKeyword_0());
              		
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_1, grammarAccess.getFunction_declAccess().getIDENTIFIERTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunction_declAccess().getSignatureParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_37);
            this_Signature_2=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2070:3: (this_Function_body_3= ruleFunction_body )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGo.g:2071:4: this_Function_body_3= ruleFunction_body
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_declAccess().getFunction_bodyParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Function_body_3=ruleFunction_body();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Function_body_3);
                      			
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
    // $ANTLR end "ruleFunction_decl"


    // $ANTLR start "entryRuleFunction_body"
    // InternalGo.g:2086:1: entryRuleFunction_body returns [String current=null] : iv_ruleFunction_body= ruleFunction_body EOF ;
    public final String entryRuleFunction_body() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction_body = null;


        try {
            // InternalGo.g:2086:53: (iv_ruleFunction_body= ruleFunction_body EOF )
            // InternalGo.g:2087:2: iv_ruleFunction_body= ruleFunction_body EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_bodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction_body=ruleFunction_body();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction_body.getText(); 
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
    // $ANTLR end "entryRuleFunction_body"


    // $ANTLR start "ruleFunction_body"
    // InternalGo.g:2093:1: ruleFunction_body returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Block_0= ruleBlock ;
    public final AntlrDatatypeRuleToken ruleFunction_body() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Block_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2099:2: (this_Block_0= ruleBlock )
            // InternalGo.g:2100:2: this_Block_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFunction_bodyAccess().getBlockParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Block_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Block_0);
              	
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
    // $ANTLR end "ruleFunction_body"


    // $ANTLR start "entryRuleOperand"
    // InternalGo.g:2113:1: entryRuleOperand returns [String current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final String entryRuleOperand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperand = null;


        try {
            // InternalGo.g:2113:47: (iv_ruleOperand= ruleOperand EOF )
            // InternalGo.g:2114:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand.getText(); 
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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalGo.g:2120:1: ruleOperand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Literals_0= ruleLiterals | this_Operand_name_1= ruleOperand_name | (kw= '(' this_Expression_3= ruleExpression kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleOperand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Literals_0 = null;

        AntlrDatatypeRuleToken this_Operand_name_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2126:2: ( (this_Literals_0= ruleLiterals | this_Operand_name_1= ruleOperand_name | (kw= '(' this_Expression_3= ruleExpression kw= ')' ) ) )
            // InternalGo.g:2127:2: (this_Literals_0= ruleLiterals | this_Operand_name_1= ruleOperand_name | (kw= '(' this_Expression_3= ruleExpression kw= ')' ) )
            {
            // InternalGo.g:2127:2: (this_Literals_0= ruleLiterals | this_Operand_name_1= ruleOperand_name | (kw= '(' this_Expression_3= ruleExpression kw= ')' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_OCTAL_LIT:
            case RULE_HEX_LIT:
            case RULE_RAW_STRING_LIT:
            case 54:
            case 55:
                {
                alt41=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt41=2;
                }
                break;
            case 35:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalGo.g:2128:3: this_Literals_0= ruleLiterals
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getLiteralsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literals_0=ruleLiterals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Literals_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2139:3: this_Operand_name_1= ruleOperand_name
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getOperand_nameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Operand_name_1=ruleOperand_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Operand_name_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2150:3: (kw= '(' this_Expression_3= ruleExpression kw= ')' )
                    {
                    // InternalGo.g:2150:3: (kw= '(' this_Expression_3= ruleExpression kw= ')' )
                    // InternalGo.g:2151:4: kw= '(' this_Expression_3= ruleExpression kw= ')'
                    {
                    kw=(Token)match(input,35,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOperandAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleOperand_name"
    // InternalGo.g:2176:1: entryRuleOperand_name returns [String current=null] : iv_ruleOperand_name= ruleOperand_name EOF ;
    public final String entryRuleOperand_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperand_name = null;


        try {
            // InternalGo.g:2176:52: (iv_ruleOperand_name= ruleOperand_name EOF )
            // InternalGo.g:2177:2: iv_ruleOperand_name= ruleOperand_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperand_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand_name=ruleOperand_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand_name.getText(); 
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
    // $ANTLR end "entryRuleOperand_name"


    // $ANTLR start "ruleOperand_name"
    // InternalGo.g:2183:1: ruleOperand_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident ) ;
    public final AntlrDatatypeRuleToken ruleOperand_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Qualified_ident_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2189:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident ) )
            // InternalGo.g:2190:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident )
            {
            // InternalGo.g:2190:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_Qualified_ident_1= ruleQualified_ident )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_IDENTIFIER) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==EOF||LA42_1==RULE_BINARY_OP||(LA42_1>=RULE_INT && LA42_1<=RULE_HEX_LIT)||(LA42_1>=RULE_RAW_STRING_LIT && LA42_1<=RULE_UNARY_OP)||LA42_1==35||(LA42_1>=54 && LA42_1<=55)) ) {
                    alt42=1;
                }
                else if ( (LA42_1==47) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGo.g:2191:3: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENTIFIER_0, grammarAccess.getOperand_nameAccess().getIDENTIFIERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2199:3: this_Qualified_ident_1= ruleQualified_ident
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperand_nameAccess().getQualified_identParserRuleCall_1());
                      		
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
    // $ANTLR end "ruleOperand_name"


    // $ANTLR start "entryRuleQualified_ident"
    // InternalGo.g:2213:1: entryRuleQualified_ident returns [String current=null] : iv_ruleQualified_ident= ruleQualified_ident EOF ;
    public final String entryRuleQualified_ident() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified_ident = null;


        try {
            // InternalGo.g:2213:55: (iv_ruleQualified_ident= ruleQualified_ident EOF )
            // InternalGo.g:2214:2: iv_ruleQualified_ident= ruleQualified_ident EOF
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
    // InternalGo.g:2220:1: ruleQualified_ident returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleQualified_ident() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalGo.g:2226:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) )
            // InternalGo.g:2227:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            {
            // InternalGo.g:2227:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            // InternalGo.g:2228:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,47,FOLLOW_27); if (state.failed) return current;
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


    // $ANTLR start "entryRulePrimary_expr"
    // InternalGo.g:2251:1: entryRulePrimary_expr returns [String current=null] : iv_rulePrimary_expr= rulePrimary_expr EOF ;
    public final String entryRulePrimary_expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimary_expr = null;


        try {
            // InternalGo.g:2251:52: (iv_rulePrimary_expr= rulePrimary_expr EOF )
            // InternalGo.g:2252:2: iv_rulePrimary_expr= rulePrimary_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimary_exprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary_expr=rulePrimary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary_expr.getText(); 
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
    // $ANTLR end "entryRulePrimary_expr"


    // $ANTLR start "rulePrimary_expr"
    // InternalGo.g:2258:1: rulePrimary_expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Operand_0= ruleOperand ;
    public final AntlrDatatypeRuleToken rulePrimary_expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Operand_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2264:2: (this_Operand_0= ruleOperand )
            // InternalGo.g:2265:2: this_Operand_0= ruleOperand
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getPrimary_exprAccess().getOperandParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Operand_0=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Operand_0);
              	
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
    // $ANTLR end "rulePrimary_expr"


    // $ANTLR start "entryRuleExpression"
    // InternalGo.g:2278:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalGo.g:2278:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:2279:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression.getText(); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGo.g:2285:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Unary_expr_0= ruleUnary_expr this_Expression_line_1= ruleExpression_line ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Unary_expr_0 = null;

        AntlrDatatypeRuleToken this_Expression_line_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2291:2: ( (this_Unary_expr_0= ruleUnary_expr this_Expression_line_1= ruleExpression_line ) )
            // InternalGo.g:2292:2: (this_Unary_expr_0= ruleUnary_expr this_Expression_line_1= ruleExpression_line )
            {
            // InternalGo.g:2292:2: (this_Unary_expr_0= ruleUnary_expr this_Expression_line_1= ruleExpression_line )
            // InternalGo.g:2293:3: this_Unary_expr_0= ruleUnary_expr this_Expression_line_1= ruleExpression_line
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getUnary_exprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Unary_expr_0=ruleUnary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Unary_expr_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getExpression_lineParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Expression_line_1=ruleExpression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_line_1);
              		
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_line"
    // InternalGo.g:2317:1: entryRuleExpression_line returns [String current=null] : iv_ruleExpression_line= ruleExpression_line EOF ;
    public final String entryRuleExpression_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression_line = null;


        try {
            // InternalGo.g:2317:55: (iv_ruleExpression_line= ruleExpression_line EOF )
            // InternalGo.g:2318:2: iv_ruleExpression_line= ruleExpression_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_lineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression_line=ruleExpression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_line.getText(); 
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
    // $ANTLR end "entryRuleExpression_line"


    // $ANTLR start "ruleExpression_line"
    // InternalGo.g:2324:1: ruleExpression_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BINARY_OP_0= RULE_BINARY_OP this_Expression_1= ruleExpression this_Expression_line_2= ruleExpression_line ) ;
    public final AntlrDatatypeRuleToken ruleExpression_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_OP_0=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_line_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2330:2: ( (this_BINARY_OP_0= RULE_BINARY_OP this_Expression_1= ruleExpression this_Expression_line_2= ruleExpression_line ) )
            // InternalGo.g:2331:2: (this_BINARY_OP_0= RULE_BINARY_OP this_Expression_1= ruleExpression this_Expression_line_2= ruleExpression_line )
            {
            // InternalGo.g:2331:2: (this_BINARY_OP_0= RULE_BINARY_OP this_Expression_1= ruleExpression this_Expression_line_2= ruleExpression_line )
            // InternalGo.g:2332:3: this_BINARY_OP_0= RULE_BINARY_OP this_Expression_1= ruleExpression this_Expression_line_2= ruleExpression_line
            {
            this_BINARY_OP_0=(Token)match(input,RULE_BINARY_OP,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_BINARY_OP_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BINARY_OP_0, grammarAccess.getExpression_lineAccess().getBINARY_OPTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression_lineAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_38);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression_lineAccess().getExpression_lineParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Expression_line_2=ruleExpression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_line_2);
              		
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
    // $ANTLR end "ruleExpression_line"


    // $ANTLR start "entryRuleUnary_expr"
    // InternalGo.g:2363:1: entryRuleUnary_expr returns [String current=null] : iv_ruleUnary_expr= ruleUnary_expr EOF ;
    public final String entryRuleUnary_expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnary_expr = null;


        try {
            // InternalGo.g:2363:50: (iv_ruleUnary_expr= ruleUnary_expr EOF )
            // InternalGo.g:2364:2: iv_ruleUnary_expr= ruleUnary_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_exprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnary_expr=ruleUnary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnary_expr.getText(); 
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
    // $ANTLR end "entryRuleUnary_expr"


    // $ANTLR start "ruleUnary_expr"
    // InternalGo.g:2370:1: ruleUnary_expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Primary_expr_0= rulePrimary_expr | this_UNARY_OP_1= RULE_UNARY_OP )+ ;
    public final AntlrDatatypeRuleToken ruleUnary_expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNARY_OP_1=null;
        AntlrDatatypeRuleToken this_Primary_expr_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2376:2: ( (this_Primary_expr_0= rulePrimary_expr | this_UNARY_OP_1= RULE_UNARY_OP )+ )
            // InternalGo.g:2377:2: (this_Primary_expr_0= rulePrimary_expr | this_UNARY_OP_1= RULE_UNARY_OP )+
            {
            // InternalGo.g:2377:2: (this_Primary_expr_0= rulePrimary_expr | this_UNARY_OP_1= RULE_UNARY_OP )+
            int cnt43=0;
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_HEX_LIT)||(LA43_0>=RULE_RAW_STRING_LIT && LA43_0<=RULE_IDENTIFIER)||LA43_0==35||(LA43_0>=54 && LA43_0<=55)) ) {
                    alt43=1;
                }
                else if ( (LA43_0==RULE_UNARY_OP) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGo.g:2378:3: this_Primary_expr_0= rulePrimary_expr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_39);
            	    this_Primary_expr_0=rulePrimary_expr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Primary_expr_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:2389:3: this_UNARY_OP_1= RULE_UNARY_OP
            	    {
            	    this_UNARY_OP_1=(Token)match(input,RULE_UNARY_OP,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_UNARY_OP_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_UNARY_OP_1, grammarAccess.getUnary_exprAccess().getUNARY_OPTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


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
    // $ANTLR end "ruleUnary_expr"


    // $ANTLR start "entryRuleStatement"
    // InternalGo.g:2400:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalGo.g:2400:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalGo.g:2401:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement.getText(); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGo.g:2407:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_Labeled_stmt_1= ruleLabeled_stmt | this_Go_stmt_2= ruleGo_stmt | this_Return_stmt_3= ruleReturn_stmt | this_Break_stmt_4= ruleBreak_stmt | this_Continue_stmt_5= ruleContinue_stmt | this_Goto_stmt_6= ruleGoto_stmt | kw= 'fallthrough' | this_Block_8= ruleBlock | this_If_stmt_9= ruleIf_stmt | this_Defer_stmt_10= ruleDefer_stmt ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Declaration_0 = null;

        AntlrDatatypeRuleToken this_Labeled_stmt_1 = null;

        AntlrDatatypeRuleToken this_Go_stmt_2 = null;

        AntlrDatatypeRuleToken this_Return_stmt_3 = null;

        AntlrDatatypeRuleToken this_Break_stmt_4 = null;

        AntlrDatatypeRuleToken this_Continue_stmt_5 = null;

        AntlrDatatypeRuleToken this_Goto_stmt_6 = null;

        AntlrDatatypeRuleToken this_Block_8 = null;

        AntlrDatatypeRuleToken this_If_stmt_9 = null;

        AntlrDatatypeRuleToken this_Defer_stmt_10 = null;



        	enterRule();

        try {
            // InternalGo.g:2413:2: ( (this_Declaration_0= ruleDeclaration | this_Labeled_stmt_1= ruleLabeled_stmt | this_Go_stmt_2= ruleGo_stmt | this_Return_stmt_3= ruleReturn_stmt | this_Break_stmt_4= ruleBreak_stmt | this_Continue_stmt_5= ruleContinue_stmt | this_Goto_stmt_6= ruleGoto_stmt | kw= 'fallthrough' | this_Block_8= ruleBlock | this_If_stmt_9= ruleIf_stmt | this_Defer_stmt_10= ruleDefer_stmt ) )
            // InternalGo.g:2414:2: (this_Declaration_0= ruleDeclaration | this_Labeled_stmt_1= ruleLabeled_stmt | this_Go_stmt_2= ruleGo_stmt | this_Return_stmt_3= ruleReturn_stmt | this_Break_stmt_4= ruleBreak_stmt | this_Continue_stmt_5= ruleContinue_stmt | this_Goto_stmt_6= ruleGoto_stmt | kw= 'fallthrough' | this_Block_8= ruleBlock | this_If_stmt_9= ruleIf_stmt | this_Defer_stmt_10= ruleDefer_stmt )
            {
            // InternalGo.g:2414:2: (this_Declaration_0= ruleDeclaration | this_Labeled_stmt_1= ruleLabeled_stmt | this_Go_stmt_2= ruleGo_stmt | this_Return_stmt_3= ruleReturn_stmt | this_Break_stmt_4= ruleBreak_stmt | this_Continue_stmt_5= ruleContinue_stmt | this_Goto_stmt_6= ruleGoto_stmt | kw= 'fallthrough' | this_Block_8= ruleBlock | this_If_stmt_9= ruleIf_stmt | this_Defer_stmt_10= ruleDefer_stmt )
            int alt44=11;
            switch ( input.LA(1) ) {
            case 35:
            case 64:
                {
                alt44=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt44=2;
                }
                break;
            case 68:
                {
                alt44=3;
                }
                break;
            case 69:
                {
                alt44=4;
                }
                break;
            case 70:
                {
                alt44=5;
                }
                break;
            case 71:
                {
                alt44=6;
                }
                break;
            case 72:
                {
                alt44=7;
                }
                break;
            case 65:
                {
                alt44=8;
                }
                break;
            case 39:
                {
                alt44=9;
                }
                break;
            case 66:
                {
                alt44=10;
                }
                break;
            case 73:
                {
                alt44=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalGo.g:2415:3: this_Declaration_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Declaration_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2426:3: this_Labeled_stmt_1= ruleLabeled_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLabeled_stmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Labeled_stmt_1=ruleLabeled_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Labeled_stmt_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2437:3: this_Go_stmt_2= ruleGo_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getGo_stmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Go_stmt_2=ruleGo_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Go_stmt_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2448:3: this_Return_stmt_3= ruleReturn_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getReturn_stmtParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Return_stmt_3=ruleReturn_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Return_stmt_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2459:3: this_Break_stmt_4= ruleBreak_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBreak_stmtParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Break_stmt_4=ruleBreak_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Break_stmt_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:2470:3: this_Continue_stmt_5= ruleContinue_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getContinue_stmtParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Continue_stmt_5=ruleContinue_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Continue_stmt_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:2481:3: this_Goto_stmt_6= ruleGoto_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getGoto_stmtParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Goto_stmt_6=ruleGoto_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Goto_stmt_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:2492:3: kw= 'fallthrough'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStatementAccess().getFallthroughKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGo.g:2498:3: this_Block_8= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_8=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Block_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGo.g:2509:3: this_If_stmt_9= ruleIf_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIf_stmtParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_stmt_9=ruleIf_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_If_stmt_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGo.g:2520:3: this_Defer_stmt_10= ruleDefer_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDefer_stmtParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Defer_stmt_10=ruleDefer_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Defer_stmt_10);
                      		
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSimple_stmt"
    // InternalGo.g:2534:1: entryRuleSimple_stmt returns [String current=null] : iv_ruleSimple_stmt= ruleSimple_stmt EOF ;
    public final String entryRuleSimple_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimple_stmt = null;


        try {
            // InternalGo.g:2534:51: (iv_ruleSimple_stmt= ruleSimple_stmt EOF )
            // InternalGo.g:2535:2: iv_ruleSimple_stmt= ruleSimple_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimple_stmt=ruleSimple_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimple_stmt.getText(); 
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
    // $ANTLR end "entryRuleSimple_stmt"


    // $ANTLR start "ruleSimple_stmt"
    // InternalGo.g:2541:1: ruleSimple_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Empty_stmt_0= ruleEmpty_stmt | this_Expression_stmt_1= ruleExpression_stmt ) ;
    public final AntlrDatatypeRuleToken ruleSimple_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Empty_stmt_0 = null;

        AntlrDatatypeRuleToken this_Expression_stmt_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2547:2: ( (this_Empty_stmt_0= ruleEmpty_stmt | this_Expression_stmt_1= ruleExpression_stmt ) )
            // InternalGo.g:2548:2: (this_Empty_stmt_0= ruleEmpty_stmt | this_Expression_stmt_1= ruleExpression_stmt )
            {
            // InternalGo.g:2548:2: (this_Empty_stmt_0= ruleEmpty_stmt | this_Expression_stmt_1= ruleExpression_stmt )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_WS) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_HEX_LIT)||(LA45_0>=RULE_RAW_STRING_LIT && LA45_0<=RULE_UNARY_OP)||LA45_0==35||(LA45_0>=54 && LA45_0<=55)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalGo.g:2549:3: this_Empty_stmt_0= ruleEmpty_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimple_stmtAccess().getEmpty_stmtParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Empty_stmt_0=ruleEmpty_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Empty_stmt_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2560:3: this_Expression_stmt_1= ruleExpression_stmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimple_stmtAccess().getExpression_stmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_stmt_1=ruleExpression_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Expression_stmt_1);
                      		
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
    // $ANTLR end "ruleSimple_stmt"


    // $ANTLR start "entryRuleEmpty_stmt"
    // InternalGo.g:2574:1: entryRuleEmpty_stmt returns [String current=null] : iv_ruleEmpty_stmt= ruleEmpty_stmt EOF ;
    public final String entryRuleEmpty_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmpty_stmt = null;


        try {
            // InternalGo.g:2574:50: (iv_ruleEmpty_stmt= ruleEmpty_stmt EOF )
            // InternalGo.g:2575:2: iv_ruleEmpty_stmt= ruleEmpty_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmpty_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmpty_stmt=ruleEmpty_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmpty_stmt.getText(); 
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
    // $ANTLR end "entryRuleEmpty_stmt"


    // $ANTLR start "ruleEmpty_stmt"
    // InternalGo.g:2581:1: ruleEmpty_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WS_0= RULE_WS ;
    public final AntlrDatatypeRuleToken ruleEmpty_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;


        	enterRule();

        try {
            // InternalGo.g:2587:2: (this_WS_0= RULE_WS )
            // InternalGo.g:2588:2: this_WS_0= RULE_WS
            {
            this_WS_0=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_WS_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_WS_0, grammarAccess.getEmpty_stmtAccess().getWSTerminalRuleCall());
              	
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
    // $ANTLR end "ruleEmpty_stmt"


    // $ANTLR start "entryRuleLabeled_stmt"
    // InternalGo.g:2598:1: entryRuleLabeled_stmt returns [String current=null] : iv_ruleLabeled_stmt= ruleLabeled_stmt EOF ;
    public final String entryRuleLabeled_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabeled_stmt = null;


        try {
            // InternalGo.g:2598:52: (iv_ruleLabeled_stmt= ruleLabeled_stmt EOF )
            // InternalGo.g:2599:2: iv_ruleLabeled_stmt= ruleLabeled_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeled_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabeled_stmt=ruleLabeled_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeled_stmt.getText(); 
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
    // $ANTLR end "entryRuleLabeled_stmt"


    // $ANTLR start "ruleLabeled_stmt"
    // InternalGo.g:2605:1: ruleLabeled_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_Statement_2= ruleStatement ) ;
    public final AntlrDatatypeRuleToken ruleLabeled_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2611:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_Statement_2= ruleStatement ) )
            // InternalGo.g:2612:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_Statement_2= ruleStatement )
            {
            // InternalGo.g:2612:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_Statement_2= ruleStatement )
            // InternalGo.g:2613:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_Statement_2= ruleStatement
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getLabeled_stmtAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,48,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLabeled_stmtAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLabeled_stmtAccess().getStatementParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Statement_2=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Statement_2);
              		
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
    // $ANTLR end "ruleLabeled_stmt"


    // $ANTLR start "entryRuleExpression_stmt"
    // InternalGo.g:2639:1: entryRuleExpression_stmt returns [String current=null] : iv_ruleExpression_stmt= ruleExpression_stmt EOF ;
    public final String entryRuleExpression_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression_stmt = null;


        try {
            // InternalGo.g:2639:55: (iv_ruleExpression_stmt= ruleExpression_stmt EOF )
            // InternalGo.g:2640:2: iv_ruleExpression_stmt= ruleExpression_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression_stmt=ruleExpression_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_stmt.getText(); 
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
    // $ANTLR end "entryRuleExpression_stmt"


    // $ANTLR start "ruleExpression_stmt"
    // InternalGo.g:2646:1: ruleExpression_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleExpression_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2652:2: (this_Expression_0= ruleExpression )
            // InternalGo.g:2653:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpression_stmtAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_0);
              	
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
    // $ANTLR end "ruleExpression_stmt"


    // $ANTLR start "entryRuleIf_stmt"
    // InternalGo.g:2666:1: entryRuleIf_stmt returns [String current=null] : iv_ruleIf_stmt= ruleIf_stmt EOF ;
    public final String entryRuleIf_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIf_stmt = null;


        try {
            // InternalGo.g:2666:47: (iv_ruleIf_stmt= ruleIf_stmt EOF )
            // InternalGo.g:2667:2: iv_ruleIf_stmt= ruleIf_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf_stmt=ruleIf_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_stmt.getText(); 
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
    // $ANTLR end "entryRuleIf_stmt"


    // $ANTLR start "ruleIf_stmt"
    // InternalGo.g:2673:1: ruleIf_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' (this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON )? ( ( ruleExpression )=>this_Expression_3= ruleExpression ) this_Block_4= ruleBlock (kw= 'else' (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock ) )? ) ;
    public final AntlrDatatypeRuleToken ruleIf_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SEMICOLON_2=null;
        AntlrDatatypeRuleToken this_Simple_stmt_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_Block_4 = null;

        AntlrDatatypeRuleToken this_If_stmt_6 = null;

        AntlrDatatypeRuleToken this_Block_7 = null;



        	enterRule();

        try {
            // InternalGo.g:2679:2: ( (kw= 'if' (this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON )? ( ( ruleExpression )=>this_Expression_3= ruleExpression ) this_Block_4= ruleBlock (kw= 'else' (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock ) )? ) )
            // InternalGo.g:2680:2: (kw= 'if' (this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON )? ( ( ruleExpression )=>this_Expression_3= ruleExpression ) this_Block_4= ruleBlock (kw= 'else' (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock ) )? )
            {
            // InternalGo.g:2680:2: (kw= 'if' (this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON )? ( ( ruleExpression )=>this_Expression_3= ruleExpression ) this_Block_4= ruleBlock (kw= 'else' (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock ) )? )
            // InternalGo.g:2681:3: kw= 'if' (this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON )? ( ( ruleExpression )=>this_Expression_3= ruleExpression ) this_Block_4= ruleBlock (kw= 'else' (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock ) )?
            {
            kw=(Token)match(input,66,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIf_stmtAccess().getIfKeyword_0());
              		
            }
            // InternalGo.g:2686:3: (this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalGo.g:2687:4: this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIf_stmtAccess().getSimple_stmtParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    this_Simple_stmt_1=ruleSimple_stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Simple_stmt_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SEMICOLON_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SEMICOLON_2, grammarAccess.getIf_stmtAccess().getSEMICOLONTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:2705:3: ( ( ruleExpression )=>this_Expression_3= ruleExpression )
            // InternalGo.g:2706:4: ( ruleExpression )=>this_Expression_3= ruleExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIf_stmtAccess().getExpressionParserRuleCall_2());
              			
            }
            pushFollow(FOLLOW_17);
            this_Expression_3=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_Expression_3);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIf_stmtAccess().getBlockParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_43);
            this_Block_4=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2728:3: (kw= 'else' (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==67) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:2729:4: kw= 'else' (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock )
                    {
                    kw=(Token)match(input,67,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIf_stmtAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalGo.g:2734:4: (this_If_stmt_6= ruleIf_stmt | this_Block_7= ruleBlock )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==66) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==39) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalGo.g:2735:5: this_If_stmt_6= ruleIf_stmt
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getIf_stmtAccess().getIf_stmtParserRuleCall_4_1_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_If_stmt_6=ruleIf_stmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_If_stmt_6);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2746:5: this_Block_7= ruleBlock
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getIf_stmtAccess().getBlockParserRuleCall_4_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_Block_7=ruleBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Block_7);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

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
    // $ANTLR end "ruleIf_stmt"


    // $ANTLR start "entryRuleGo_stmt"
    // InternalGo.g:2762:1: entryRuleGo_stmt returns [String current=null] : iv_ruleGo_stmt= ruleGo_stmt EOF ;
    public final String entryRuleGo_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGo_stmt = null;


        try {
            // InternalGo.g:2762:47: (iv_ruleGo_stmt= ruleGo_stmt EOF )
            // InternalGo.g:2763:2: iv_ruleGo_stmt= ruleGo_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGo_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGo_stmt=ruleGo_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGo_stmt.getText(); 
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
    // $ANTLR end "entryRuleGo_stmt"


    // $ANTLR start "ruleGo_stmt"
    // InternalGo.g:2769:1: ruleGo_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go' this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleGo_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2775:2: ( (kw= 'go' this_Expression_1= ruleExpression ) )
            // InternalGo.g:2776:2: (kw= 'go' this_Expression_1= ruleExpression )
            {
            // InternalGo.g:2776:2: (kw= 'go' this_Expression_1= ruleExpression )
            // InternalGo.g:2777:3: kw= 'go' this_Expression_1= ruleExpression
            {
            kw=(Token)match(input,68,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getGo_stmtAccess().getGoKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGo_stmtAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_1);
              		
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
    // $ANTLR end "ruleGo_stmt"


    // $ANTLR start "entryRuleReturn_stmt"
    // InternalGo.g:2796:1: entryRuleReturn_stmt returns [String current=null] : iv_ruleReturn_stmt= ruleReturn_stmt EOF ;
    public final String entryRuleReturn_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturn_stmt = null;


        try {
            // InternalGo.g:2796:51: (iv_ruleReturn_stmt= ruleReturn_stmt EOF )
            // InternalGo.g:2797:2: iv_ruleReturn_stmt= ruleReturn_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturn_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturn_stmt=ruleReturn_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn_stmt.getText(); 
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
    // $ANTLR end "entryRuleReturn_stmt"


    // $ANTLR start "ruleReturn_stmt"
    // InternalGo.g:2803:1: ruleReturn_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' (this_Expression_list_1= ruleExpression_list )? ) ;
    public final AntlrDatatypeRuleToken ruleReturn_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_list_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2809:2: ( (kw= 'return' (this_Expression_list_1= ruleExpression_list )? ) )
            // InternalGo.g:2810:2: (kw= 'return' (this_Expression_list_1= ruleExpression_list )? )
            {
            // InternalGo.g:2810:2: (kw= 'return' (this_Expression_list_1= ruleExpression_list )? )
            // InternalGo.g:2811:3: kw= 'return' (this_Expression_list_1= ruleExpression_list )?
            {
            kw=(Token)match(input,69,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getReturn_stmtAccess().getReturnKeyword_0());
              		
            }
            // InternalGo.g:2816:3: (this_Expression_list_1= ruleExpression_list )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_HEX_LIT)||(LA49_0>=RULE_RAW_STRING_LIT && LA49_0<=RULE_UNARY_OP)||LA49_0==35||(LA49_0>=54 && LA49_0<=55)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:2817:4: this_Expression_list_1= ruleExpression_list
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReturn_stmtAccess().getExpression_listParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_list_1=ruleExpression_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_list_1);
                      			
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
    // $ANTLR end "ruleReturn_stmt"


    // $ANTLR start "entryRuleBreak_stmt"
    // InternalGo.g:2832:1: entryRuleBreak_stmt returns [String current=null] : iv_ruleBreak_stmt= ruleBreak_stmt EOF ;
    public final String entryRuleBreak_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreak_stmt = null;


        try {
            // InternalGo.g:2832:50: (iv_ruleBreak_stmt= ruleBreak_stmt EOF )
            // InternalGo.g:2833:2: iv_ruleBreak_stmt= ruleBreak_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreak_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreak_stmt=ruleBreak_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreak_stmt.getText(); 
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
    // $ANTLR end "entryRuleBreak_stmt"


    // $ANTLR start "ruleBreak_stmt"
    // InternalGo.g:2839:1: ruleBreak_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken ruleBreak_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:2845:2: ( (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) )
            // InternalGo.g:2846:2: (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            {
            // InternalGo.g:2846:2: (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            // InternalGo.g:2847:3: kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            {
            kw=(Token)match(input,70,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBreak_stmtAccess().getBreakKeyword_0());
              		
            }
            // InternalGo.g:2852:3: (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_IDENTIFIER) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGo.g:2853:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getBreak_stmtAccess().getIDENTIFIERTerminalRuleCall_1());
                      			
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
    // $ANTLR end "ruleBreak_stmt"


    // $ANTLR start "entryRuleContinue_stmt"
    // InternalGo.g:2865:1: entryRuleContinue_stmt returns [String current=null] : iv_ruleContinue_stmt= ruleContinue_stmt EOF ;
    public final String entryRuleContinue_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContinue_stmt = null;


        try {
            // InternalGo.g:2865:53: (iv_ruleContinue_stmt= ruleContinue_stmt EOF )
            // InternalGo.g:2866:2: iv_ruleContinue_stmt= ruleContinue_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinue_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContinue_stmt=ruleContinue_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinue_stmt.getText(); 
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
    // $ANTLR end "entryRuleContinue_stmt"


    // $ANTLR start "ruleContinue_stmt"
    // InternalGo.g:2872:1: ruleContinue_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken ruleContinue_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:2878:2: ( (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) )
            // InternalGo.g:2879:2: (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            {
            // InternalGo.g:2879:2: (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            // InternalGo.g:2880:3: kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            {
            kw=(Token)match(input,71,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getContinue_stmtAccess().getContinueKeyword_0());
              		
            }
            // InternalGo.g:2885:3: (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_IDENTIFIER) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGo.g:2886:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getContinue_stmtAccess().getIDENTIFIERTerminalRuleCall_1());
                      			
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
    // $ANTLR end "ruleContinue_stmt"


    // $ANTLR start "entryRuleGoto_stmt"
    // InternalGo.g:2898:1: entryRuleGoto_stmt returns [String current=null] : iv_ruleGoto_stmt= ruleGoto_stmt EOF ;
    public final String entryRuleGoto_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoto_stmt = null;


        try {
            // InternalGo.g:2898:49: (iv_ruleGoto_stmt= ruleGoto_stmt EOF )
            // InternalGo.g:2899:2: iv_ruleGoto_stmt= ruleGoto_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoto_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGoto_stmt=ruleGoto_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto_stmt.getText(); 
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
    // $ANTLR end "entryRuleGoto_stmt"


    // $ANTLR start "ruleGoto_stmt"
    // InternalGo.g:2905:1: ruleGoto_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleGoto_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:2911:2: ( (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER ) )
            // InternalGo.g:2912:2: (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER )
            {
            // InternalGo.g:2912:2: (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER )
            // InternalGo.g:2913:3: kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER
            {
            kw=(Token)match(input,72,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getGoto_stmtAccess().getGotoKeyword_0());
              		
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_1, grammarAccess.getGoto_stmtAccess().getIDENTIFIERTerminalRuleCall_1());
              		
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
    // $ANTLR end "ruleGoto_stmt"


    // $ANTLR start "entryRuleDefer_stmt"
    // InternalGo.g:2929:1: entryRuleDefer_stmt returns [String current=null] : iv_ruleDefer_stmt= ruleDefer_stmt EOF ;
    public final String entryRuleDefer_stmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefer_stmt = null;


        try {
            // InternalGo.g:2929:50: (iv_ruleDefer_stmt= ruleDefer_stmt EOF )
            // InternalGo.g:2930:2: iv_ruleDefer_stmt= ruleDefer_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefer_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefer_stmt=ruleDefer_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefer_stmt.getText(); 
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
    // $ANTLR end "entryRuleDefer_stmt"


    // $ANTLR start "ruleDefer_stmt"
    // InternalGo.g:2936:1: ruleDefer_stmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'defer' this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleDefer_stmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2942:2: ( (kw= 'defer' this_Expression_1= ruleExpression ) )
            // InternalGo.g:2943:2: (kw= 'defer' this_Expression_1= ruleExpression )
            {
            // InternalGo.g:2943:2: (kw= 'defer' this_Expression_1= ruleExpression )
            // InternalGo.g:2944:3: kw= 'defer' this_Expression_1= ruleExpression
            {
            kw=(Token)match(input,73,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefer_stmtAccess().getDeferKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefer_stmtAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_1);
              		
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
    // $ANTLR end "ruleDefer_stmt"


    // $ANTLR start "entryRulePackage_clause"
    // InternalGo.g:2963:1: entryRulePackage_clause returns [String current=null] : iv_rulePackage_clause= rulePackage_clause EOF ;
    public final String entryRulePackage_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_clause = null;


        try {
            // InternalGo.g:2963:54: (iv_rulePackage_clause= rulePackage_clause EOF )
            // InternalGo.g:2964:2: iv_rulePackage_clause= rulePackage_clause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_clauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage_clause=rulePackage_clause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_clause.getText(); 
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
    // $ANTLR end "entryRulePackage_clause"


    // $ANTLR start "rulePackage_clause"
    // InternalGo.g:2970:1: rulePackage_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulePackage_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:2976:2: ( (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER ) )
            // InternalGo.g:2977:2: (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER )
            {
            // InternalGo.g:2977:2: (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER )
            // InternalGo.g:2978:3: kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER
            {
            kw=(Token)match(input,74,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPackage_clauseAccess().getPackageKeyword_0());
              		
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_1, grammarAccess.getPackage_clauseAccess().getIDENTIFIERTerminalRuleCall_1());
              		
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
    // $ANTLR end "rulePackage_clause"


    // $ANTLR start "entryRuleImport_decl"
    // InternalGo.g:2994:1: entryRuleImport_decl returns [String current=null] : iv_ruleImport_decl= ruleImport_decl EOF ;
    public final String entryRuleImport_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport_decl = null;


        try {
            // InternalGo.g:2994:51: (iv_ruleImport_decl= ruleImport_decl EOF )
            // InternalGo.g:2995:2: iv_ruleImport_decl= ruleImport_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_declRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport_decl=ruleImport_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_decl.getText(); 
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
    // $ANTLR end "entryRuleImport_decl"


    // $ANTLR start "ruleImport_decl"
    // InternalGo.g:3001:1: ruleImport_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImport_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken this_Import_spec_1 = null;

        AntlrDatatypeRuleToken this_Import_spec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:3007:2: ( (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) ) )
            // InternalGo.g:3008:2: (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) )
            {
            // InternalGo.g:3008:2: (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) )
            // InternalGo.g:3009:3: kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) )
            {
            kw=(Token)match(input,75,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImport_declAccess().getImportKeyword_0());
              		
            }
            // InternalGo.g:3014:3: (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_RAW_STRING_LIT && LA53_0<=RULE_IDENTIFIER)||LA53_0==47||LA53_0==55) ) {
                alt53=1;
            }
            else if ( (LA53_0==35) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalGo.g:3015:4: this_Import_spec_1= ruleImport_spec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Import_spec_1=ruleImport_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Import_spec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3026:4: (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' )
                    {
                    // InternalGo.g:3026:4: (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' )
                    // InternalGo.g:3027:5: kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')'
                    {
                    kw=(Token)match(input,35,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImport_declAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:3032:5: (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_RAW_STRING_LIT && LA52_0<=RULE_IDENTIFIER)||LA52_0==47||LA52_0==55) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalGo.g:3033:6: this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    this_Import_spec_3=ruleImport_spec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_Import_spec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_SEMICOLON_4);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_SEMICOLON_4, grammarAccess.getImport_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImport_declAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

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
    // $ANTLR end "ruleImport_decl"


    // $ANTLR start "entryRuleImport_spec"
    // InternalGo.g:3062:1: entryRuleImport_spec returns [String current=null] : iv_ruleImport_spec= ruleImport_spec EOF ;
    public final String entryRuleImport_spec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport_spec = null;


        try {
            // InternalGo.g:3062:51: (iv_ruleImport_spec= ruleImport_spec EOF )
            // InternalGo.g:3063:2: iv_ruleImport_spec= ruleImport_spec EOF
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
    // InternalGo.g:3069:1: ruleImport_spec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path ) ;
    public final AntlrDatatypeRuleToken ruleImport_spec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_Import_path_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3075:2: ( ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path ) )
            // InternalGo.g:3076:2: ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path )
            {
            // InternalGo.g:3076:2: ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path )
            // InternalGo.g:3077:3: (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_Import_path_2= ruleImport_path
            {
            // InternalGo.g:3077:3: (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_IDENTIFIER) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // InternalGo.g:3078:4: kw= '.'
                    {
                    kw=(Token)match(input,47,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImport_specAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3084:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_48); if (state.failed) return current;
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
    // InternalGo.g:3106:1: entryRuleImport_path returns [String current=null] : iv_ruleImport_path= ruleImport_path EOF ;
    public final String entryRuleImport_path() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport_path = null;


        try {
            // InternalGo.g:3106:51: (iv_ruleImport_path= ruleImport_path EOF )
            // InternalGo.g:3107:2: iv_ruleImport_path= ruleImport_path EOF
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
    // InternalGo.g:3113:1: ruleImport_path returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_String_lit_0= ruleString_lit ;
    public final AntlrDatatypeRuleToken ruleImport_path() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_String_lit_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3119:2: (this_String_lit_0= ruleString_lit )
            // InternalGo.g:3120:2: this_String_lit_0= ruleString_lit
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

    // $ANTLR start synpred2_InternalGo
    public final void synpred2_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1250:4: ( ruleResult )
        // InternalGo.g:1250:5: ruleResult
        {
        pushFollow(FOLLOW_2);
        ruleResult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGo

    // $ANTLR start synpred3_InternalGo
    public final void synpred3_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1293:4: ( ruleType )
        // InternalGo.g:1293:5: ruleType
        {
        pushFollow(FOLLOW_2);
        ruleType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalGo

    // $ANTLR start synpred4_InternalGo
    public final void synpred4_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1331:5: ( ruleIdentifier_list )
        // InternalGo.g:1331:6: ruleIdentifier_list
        {
        pushFollow(FOLLOW_2);
        ruleIdentifier_list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalGo

    // $ANTLR start synpred7_InternalGo
    public final void synpred7_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1391:4: ( ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) ) )
        // InternalGo.g:1391:5: ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) )
        {
        // InternalGo.g:1391:5: ( ',' ( ( ruleIdentifier_list )=> ruleParameter_decl ) )
        // InternalGo.g:1392:5: ',' ( ( ruleIdentifier_list )=> ruleParameter_decl )
        {
        match(input,44,FOLLOW_15); if (state.failed) return ;
        // InternalGo.g:1393:5: ( ( ruleIdentifier_list )=> ruleParameter_decl )
        // InternalGo.g:1394:6: ( ruleIdentifier_list )=> ruleParameter_decl
        {
        pushFollow(FOLLOW_2);
        ruleParameter_decl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGo

    // $ANTLR start synpred9_InternalGo
    public final void synpred9_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1442:4: ( ruleIdentifier_list )
        // InternalGo.g:1442:5: ruleIdentifier_list
        {
        pushFollow(FOLLOW_2);
        ruleIdentifier_list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalGo

    // $ANTLR start synpred10_InternalGo
    public final void synpred10_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2706:4: ( ruleExpression )
        // InternalGo.g:2706:5: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalGo

    // Delegated rules

    public final boolean synpred7_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred2_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\uffff\1\2\21\uffff\1\26\5\uffff\1\26";
    static final String dfa_3s = "\1\7\1\4\3\uffff\3\7\1\uffff\1\57\5\7\1\57\2\7\1\57\1\4\2\7\1\uffff\2\7\1\4";
    static final String dfa_4s = "\2\67\3\uffff\1\62\2\64\1\uffff\1\62\2\64\3\7\1\57\2\7\1\57\1\67\2\64\1\uffff\2\7\1\67";
    static final String dfa_5s = "\2\uffff\1\1\1\4\1\5\3\uffff\1\3\15\uffff\1\2\3\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\4\50\uffff\1\3\1\4",
            "\1\2\2\uffff\3\2\3\uffff\3\2\23\uffff\1\2\13\uffff\1\5\1\uffff\1\6\1\7\2\uffff\1\10\2\2",
            "",
            "",
            "",
            "\1\11\47\uffff\1\14\1\uffff\1\12\1\13",
            "\1\17\53\uffff\1\15\1\16",
            "\1\17\53\uffff\1\15\1\16",
            "",
            "\1\14\1\uffff\1\12\1\13",
            "\1\22\53\uffff\1\20\1\21",
            "\1\22\53\uffff\1\20\1\21",
            "\1\23",
            "\1\17",
            "\1\17",
            "\1\14",
            "\1\22",
            "\1\22",
            "\1\14",
            "\1\26\2\uffff\3\26\3\uffff\3\26\23\uffff\1\26\15\uffff\1\24\1\25\2\uffff\1\10\2\26",
            "\1\31\53\uffff\1\27\1\30",
            "\1\31\53\uffff\1\27\1\30",
            "",
            "\1\31",
            "\1\31",
            "\1\26\2\uffff\3\26\3\uffff\3\26\23\uffff\1\26\21\uffff\1\10\2\26"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "683:2: (this_Int_lit_0= ruleInt_lit | this_Float_lit_1= ruleFloat_lit | this_Imaginary_lit_2= ruleImaginary_lit | this_Rune_lit_3= ruleRune_lit | this_String_lit_4= ruleString_lit )";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\45\1\16\10\uffff";
    static final String dfa_10s = "\2\77\10\uffff";
    static final String dfa_11s = "\2\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\1\1\5";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\22\uffff\1\2\1\3\1\4\1\6\1\5\3\7",
            "\1\10\24\uffff\1\10\1\uffff\1\10\1\11\7\uffff\1\10\11\uffff\10\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "856:2: (this_Array_type_0= ruleArray_type | this_Struct_type_1= ruleStruct_type | this_Pointer_type_2= rulePointer_type | this_Function_type_3= ruleFunction_type | this_Slice_type_4= ruleSlice_type | this_Map_type_5= ruleMap_type | this_Interface_type_6= ruleInterface_type | this_Channel_type_7= ruleChannel_type )";
        }
    }
    static final String dfa_14s = "\26\uffff";
    static final String dfa_15s = "\1\1\25\uffff";
    static final String dfa_16s = "\1\5\5\uffff\13\0\5\uffff";
    static final String dfa_17s = "\1\77\5\uffff\13\0\5\uffff";
    static final String dfa_18s = "\1\uffff\1\2\23\uffff\1\1";
    static final String dfa_19s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\5\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\7\uffff\1\1\1\7\24\uffff\1\6\1\1\1\10\2\1\2\uffff\1\1\1\uffff\1\1\12\uffff\1\1\1\11\1\12\1\13\1\15\1\14\1\16\1\17\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()+ loopback of 1249:3: ( ( ruleResult )=>this_Result_1= ruleResult )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_16 = input.LA(1);

                         
                        int index23_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\15\uffff";
    static final String dfa_22s = "\1\16\1\0\13\uffff";
    static final String dfa_23s = "\1\77\1\0\13\uffff";
    static final String dfa_24s = "\2\uffff\12\2\1\1";
    static final String dfa_25s = "\1\0\1\1\13\uffff}>";
    static final String[] dfa_26s = {
            "\1\2\24\uffff\1\1\1\uffff\1\3\22\uffff\1\4\1\5\1\6\1\10\1\7\1\11\1\12\1\13",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1280:2: (this_Parameters_0= ruleParameters | ( ( ruleType )=>this_Type_1= ruleType ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0==35) ) {s = 1;}

                        else if ( (LA24_0==RULE_IDENTIFIER) && (synpred3_InternalGo())) {s = 2;}

                        else if ( (LA24_0==37) && (synpred3_InternalGo())) {s = 3;}

                        else if ( (LA24_0==56) && (synpred3_InternalGo())) {s = 4;}

                        else if ( (LA24_0==57) && (synpred3_InternalGo())) {s = 5;}

                        else if ( (LA24_0==58) && (synpred3_InternalGo())) {s = 6;}

                        else if ( (LA24_0==60) && (synpred3_InternalGo())) {s = 7;}

                        else if ( (LA24_0==59) && (synpred3_InternalGo())) {s = 8;}

                        else if ( (LA24_0==61) && (synpred3_InternalGo())) {s = 9;}

                        else if ( (LA24_0==62) && (synpred3_InternalGo())) {s = 10;}

                        else if ( (LA24_0==63) && (synpred3_InternalGo())) {s = 11;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 12;}

                        else if ( (synpred3_InternalGo()) ) {s = 11;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\16\uffff";
    static final String dfa_28s = "\1\16\15\uffff";
    static final String dfa_29s = "\1\77\15\uffff";
    static final String dfa_30s = "\1\uffff\1\2\14\1";
    static final String dfa_31s = "\1\0\15\uffff}>";
    static final String[] dfa_32s = {
            "\1\2\24\uffff\1\15\1\1\1\4\10\uffff\1\3\11\uffff\1\5\1\6\1\7\1\11\1\10\1\12\1\13\1\14",
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
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()+ loopback of 1329:3: ( ( ( ruleIdentifier_list )=>this_Parameter_list_1= ruleParameter_list ) (kw= ',' )+ )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==36) ) {s = 1;}

                        else if ( (LA26_0==RULE_IDENTIFIER) && (synpred4_InternalGo())) {s = 2;}

                        else if ( (LA26_0==46) && (synpred4_InternalGo())) {s = 3;}

                        else if ( (LA26_0==37) && (synpred4_InternalGo())) {s = 4;}

                        else if ( (LA26_0==56) && (synpred4_InternalGo())) {s = 5;}

                        else if ( (LA26_0==57) && (synpred4_InternalGo())) {s = 6;}

                        else if ( (LA26_0==58) && (synpred4_InternalGo())) {s = 7;}

                        else if ( (LA26_0==60) && (synpred4_InternalGo())) {s = 8;}

                        else if ( (LA26_0==59) && (synpred4_InternalGo())) {s = 9;}

                        else if ( (LA26_0==61) && (synpred4_InternalGo())) {s = 10;}

                        else if ( (LA26_0==62) && (synpred4_InternalGo())) {s = 11;}

                        else if ( (LA26_0==63) && (synpred4_InternalGo())) {s = 12;}

                        else if ( (LA26_0==35) && (synpred4_InternalGo())) {s = 13;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\21\uffff";
    static final String dfa_34s = "\1\uffff\1\2\17\uffff";
    static final String dfa_35s = "\2\16\1\uffff\1\16\14\uffff\1\0";
    static final String dfa_36s = "\2\77\1\uffff\1\77\14\uffff\1\0";
    static final String dfa_37s = "\2\uffff\1\2\1\uffff\14\1\1\uffff";
    static final String dfa_38s = "\1\uffff\1\1\16\uffff\1\0}>";
    static final String[] dfa_39s = {
            "\1\1\24\uffff\1\2\1\uffff\1\2\10\uffff\1\2\11\uffff\10\2",
            "\1\5\24\uffff\1\17\1\uffff\1\6\1\2\5\uffff\1\3\1\uffff\1\4\1\2\10\uffff\1\7\1\10\1\11\1\13\1\12\1\14\1\15\1\16",
            "",
            "\1\20\24\uffff\3\2\6\uffff\1\2\1\uffff\1\2\11\uffff\10\2",
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
            "\1\uffff"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_33;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "1441:3: ( ( ruleIdentifier_list )=>this_Identifier_list_0= ruleIdentifier_list )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_16 = input.LA(1);

                         
                        int index28_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalGo()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_1==44) ) {s = 3;}

                        else if ( (LA28_1==EOF||LA28_1==38||LA28_1==47) ) {s = 2;}

                        else if ( (LA28_1==46) && (synpred9_InternalGo())) {s = 4;}

                        else if ( (LA28_1==RULE_IDENTIFIER) && (synpred9_InternalGo())) {s = 5;}

                        else if ( (LA28_1==37) && (synpred9_InternalGo())) {s = 6;}

                        else if ( (LA28_1==56) && (synpred9_InternalGo())) {s = 7;}

                        else if ( (LA28_1==57) && (synpred9_InternalGo())) {s = 8;}

                        else if ( (LA28_1==58) && (synpred9_InternalGo())) {s = 9;}

                        else if ( (LA28_1==60) && (synpred9_InternalGo())) {s = 10;}

                        else if ( (LA28_1==59) && (synpred9_InternalGo())) {s = 11;}

                        else if ( (LA28_1==61) && (synpred9_InternalGo())) {s = 12;}

                        else if ( (LA28_1==62) && (synpred9_InternalGo())) {s = 13;}

                        else if ( (LA28_1==63) && (synpred9_InternalGo())) {s = 14;}

                        else if ( (LA28_1==35) && (synpred9_InternalGo())) {s = 15;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\14\uffff";
    static final String dfa_41s = "\1\7\1\uffff\11\0\1\uffff";
    static final String dfa_42s = "\1\67\1\uffff\11\0\1\uffff";
    static final String dfa_43s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_44s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff}>";
    static final String[] dfa_45s = {
            "\1\2\1\3\1\4\3\uffff\1\6\1\10\1\12\1\1\22\uffff\1\11\22\uffff\1\5\1\7",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_40;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "2686:3: (this_Simple_stmt_1= ruleSimple_stmt this_SEMICOLON_2= RULE_SEMICOLON )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_3 = input.LA(1);

                         
                        int index46_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_4 = input.LA(1);

                         
                        int index46_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_5 = input.LA(1);

                         
                        int index46_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_7 = input.LA(1);

                         
                        int index46_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_8 = input.LA(1);

                         
                        int index46_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_9 = input.LA(1);

                         
                        int index46_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA46_10 = input.LA(1);

                         
                        int index46_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred10_InternalGo()) ) {s = 11;}

                         
                        input.seek(index46_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0006800000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0006800000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0006800000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0018000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0080000000001C00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFF00002800004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFF00402800004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0200010000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0080000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xFF00002800004002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xFF00503800004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018800004000L,0x00000000000003F7L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008800004002L,0x00000000000003F7L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFF00042800004002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00C000080000E380L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00C000080000E382L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008800004000L,0x00000000000003F7L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00C000080001E380L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080800800006000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0080801000006000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080800000006000L});

}