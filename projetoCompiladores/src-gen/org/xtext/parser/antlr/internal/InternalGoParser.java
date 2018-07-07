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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_STRING_LIT", "RULE_WS", "RULE_INT_LIT", "RULE_FLOAT_LIT", "RULE_IMAGINARY_LIT", "RULE_RUNE_LIT", "RULE_BINARY_OP", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_UNARY_OP", "RULE_DECIMAL_LIT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_DECIMAL_DIGIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_DECIMALS", "RULE_EXPONENT", "RULE_UNICODE_VALUE", "RULE_BYTE_VALUE", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_INTERPRETED_STRING_LIT", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "';'", "'package'", "'import'", "'('", "')'", "'.'", "'const'", "'='", "','", "'type'", "'func'", "'var'", "'{'", "'}'", "'<-'", "'++'", "'--'", "'+'", "'-'", "'|'", "'^'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "':='", "':'", "'return'", "'break'", "'continue'", "'goto'", "'fallthrough'", "'defer'", "'if'", "'else'", "'switch'", "'case'", "'default'", "'select'", "'for'", "'range'", "'go'", "'['", "']'", "'interface'", "'map'", "'chan'", "'...'", "'struct'", "'!'"
    };
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
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_INTERPRETED_STRING_LIT=35;
    public static final int RULE_UNICODE_VALUE=26;
    public static final int RULE_LITTLE_U_VALUE=29;
    public static final int RULE_HEX_BYTE_VALUE=33;
    public static final int RULE_OCTAL_BYTE_VALUE=32;
    public static final int RULE_MUL_OP=16;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=4;
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
    public static final int RULE_WS=6;
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


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

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
    // InternalGo.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGo.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalGo.g:71:2: iv_ruleModel= ruleModel EOF
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
    // InternalGo.g:77:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= rulesourceFile ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:83:2: ( ( (lv_greetings_0_0= rulesourceFile ) ) )
            // InternalGo.g:84:2: ( (lv_greetings_0_0= rulesourceFile ) )
            {
            // InternalGo.g:84:2: ( (lv_greetings_0_0= rulesourceFile ) )
            // InternalGo.g:85:3: (lv_greetings_0_0= rulesourceFile )
            {
            // InternalGo.g:85:3: (lv_greetings_0_0= rulesourceFile )
            // InternalGo.g:86:4: lv_greetings_0_0= rulesourceFile
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelAccess().getGreetingsSourceFileParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_greetings_0_0=rulesourceFile();

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
              					"org.xtext.Go.sourceFile");
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


    // $ANTLR start "entryRulesourceFile"
    // InternalGo.g:106:1: entryRulesourceFile returns [EObject current=null] : iv_rulesourceFile= rulesourceFile EOF ;
    public final EObject entryRulesourceFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesourceFile = null;


        try {
            // InternalGo.g:106:51: (iv_rulesourceFile= rulesourceFile EOF )
            // InternalGo.g:107:2: iv_rulesourceFile= rulesourceFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesourceFile=rulesourceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesourceFile; 
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
    // $ANTLR end "entryRulesourceFile"


    // $ANTLR start "rulesourceFile"
    // InternalGo.g:113:1: rulesourceFile returns [EObject current=null] : ( ( (lv_packageClause_0_0= rulepackageClause ) ) ( ruleimportDecl otherlv_2= ';' )* ( ruletopLevelDecl otherlv_4= ';' )* ) ;
    public final EObject rulesourceFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_packageClause_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:119:2: ( ( ( (lv_packageClause_0_0= rulepackageClause ) ) ( ruleimportDecl otherlv_2= ';' )* ( ruletopLevelDecl otherlv_4= ';' )* ) )
            // InternalGo.g:120:2: ( ( (lv_packageClause_0_0= rulepackageClause ) ) ( ruleimportDecl otherlv_2= ';' )* ( ruletopLevelDecl otherlv_4= ';' )* )
            {
            // InternalGo.g:120:2: ( ( (lv_packageClause_0_0= rulepackageClause ) ) ( ruleimportDecl otherlv_2= ';' )* ( ruletopLevelDecl otherlv_4= ';' )* )
            // InternalGo.g:121:3: ( (lv_packageClause_0_0= rulepackageClause ) ) ( ruleimportDecl otherlv_2= ';' )* ( ruletopLevelDecl otherlv_4= ';' )*
            {
            // InternalGo.g:121:3: ( (lv_packageClause_0_0= rulepackageClause ) )
            // InternalGo.g:122:4: (lv_packageClause_0_0= rulepackageClause )
            {
            // InternalGo.g:122:4: (lv_packageClause_0_0= rulepackageClause )
            // InternalGo.g:123:5: lv_packageClause_0_0= rulepackageClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSourceFileAccess().getPackageClausePackageClauseParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_packageClause_0_0=rulepackageClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSourceFileRule());
              					}
              					set(
              						current,
              						"packageClause",
              						lv_packageClause_0_0,
              						"org.xtext.Go.packageClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:140:3: ( ruleimportDecl otherlv_2= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==46) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:141:4: ruleimportDecl otherlv_2= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getImportDeclParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    ruleimportDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSourceFileAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGo.g:156:3: ( ruletopLevelDecl otherlv_4= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==50||(LA2_0>=53 && LA2_0<=55)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGo.g:157:4: ruletopLevelDecl otherlv_4= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getTopLevelDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    ruletopLevelDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_4=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getSourceFileAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rulesourceFile"


    // $ANTLR start "entryRulepackageClause"
    // InternalGo.g:176:1: entryRulepackageClause returns [String current=null] : iv_rulepackageClause= rulepackageClause EOF ;
    public final String entryRulepackageClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepackageClause = null;


        try {
            // InternalGo.g:176:53: (iv_rulepackageClause= rulepackageClause EOF )
            // InternalGo.g:177:2: iv_rulepackageClause= rulepackageClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepackageClause=rulepackageClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepackageClause.getText(); 
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
    // $ANTLR end "entryRulepackageClause"


    // $ANTLR start "rulepackageClause"
    // InternalGo.g:183:1: rulepackageClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulepackageClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:189:2: ( (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER ) )
            // InternalGo.g:190:2: (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER )
            {
            // InternalGo.g:190:2: (kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER )
            // InternalGo.g:191:3: kw= 'package' this_IDENTIFIER_1= RULE_IDENTIFIER
            {
            kw=(Token)match(input,45,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPackageClauseAccess().getPackageKeyword_0());
              		
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_1, grammarAccess.getPackageClauseAccess().getIDENTIFIERTerminalRuleCall_1());
              		
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
    // $ANTLR end "rulepackageClause"


    // $ANTLR start "entryRuleimportDecl"
    // InternalGo.g:207:1: entryRuleimportDecl returns [String current=null] : iv_ruleimportDecl= ruleimportDecl EOF ;
    public final String entryRuleimportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleimportDecl = null;


        try {
            // InternalGo.g:207:50: (iv_ruleimportDecl= ruleimportDecl EOF )
            // InternalGo.g:208:2: iv_ruleimportDecl= ruleimportDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleimportDecl=ruleimportDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimportDecl.getText(); 
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
    // $ANTLR end "entryRuleimportDecl"


    // $ANTLR start "ruleimportDecl"
    // InternalGo.g:214:1: ruleimportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_importSpec_1= ruleimportSpec | (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleimportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_importSpec_1 = null;

        AntlrDatatypeRuleToken this_importSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:220:2: ( (kw= 'import' (this_importSpec_1= ruleimportSpec | (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' ) ) ) )
            // InternalGo.g:221:2: (kw= 'import' (this_importSpec_1= ruleimportSpec | (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' ) ) )
            {
            // InternalGo.g:221:2: (kw= 'import' (this_importSpec_1= ruleimportSpec | (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' ) ) )
            // InternalGo.g:222:3: kw= 'import' (this_importSpec_1= ruleimportSpec | (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' ) )
            {
            kw=(Token)match(input,46,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImportDeclAccess().getImportKeyword_0());
              		
            }
            // InternalGo.g:227:3: (this_importSpec_1= ruleimportSpec | (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_IDENTIFIER && LA4_0<=RULE_STRING_LIT)||LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:228:4: this_importSpec_1= ruleimportSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_importSpec_1=ruleimportSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_importSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:239:4: (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' )
                    {
                    // InternalGo.g:239:4: (kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')' )
                    // InternalGo.g:240:5: kw= '(' (this_importSpec_3= ruleimportSpec )* kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:245:5: (this_importSpec_3= ruleimportSpec )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_IDENTIFIER && LA3_0<=RULE_STRING_LIT)||LA3_0==49) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGo.g:246:6: this_importSpec_3= ruleimportSpec
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_1_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    this_importSpec_3=ruleimportSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_importSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
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
    // $ANTLR end "ruleimportDecl"


    // $ANTLR start "entryRuleimportSpec"
    // InternalGo.g:268:1: entryRuleimportSpec returns [String current=null] : iv_ruleimportSpec= ruleimportSpec EOF ;
    public final String entryRuleimportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleimportSpec = null;


        try {
            // InternalGo.g:268:50: (iv_ruleimportSpec= ruleimportSpec EOF )
            // InternalGo.g:269:2: iv_ruleimportSpec= ruleimportSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleimportSpec=ruleimportSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimportSpec.getText(); 
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
    // $ANTLR end "entryRuleimportSpec"


    // $ANTLR start "ruleimportSpec"
    // InternalGo.g:275:1: ruleimportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_importPath_2= ruleimportPath ) ;
    public final AntlrDatatypeRuleToken ruleimportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_importPath_2 = null;



        	enterRule();

        try {
            // InternalGo.g:281:2: ( ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_importPath_2= ruleimportPath ) )
            // InternalGo.g:282:2: ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_importPath_2= ruleimportPath )
            {
            // InternalGo.g:282:2: ( (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_importPath_2= ruleimportPath )
            // InternalGo.g:283:3: (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )? this_importPath_2= ruleimportPath
            {
            // InternalGo.g:283:3: (kw= '.' | this_IDENTIFIER_1= RULE_IDENTIFIER )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==49) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_IDENTIFIER) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:284:4: kw= '.'
                    {
                    kw=(Token)match(input,49,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:290:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getImportSpecAccess().getIDENTIFIERTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImportSpecAccess().getImportPathParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_importPath_2=ruleimportPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_importPath_2);
              		
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
    // $ANTLR end "ruleimportSpec"


    // $ANTLR start "entryRuleimportPath"
    // InternalGo.g:312:1: entryRuleimportPath returns [String current=null] : iv_ruleimportPath= ruleimportPath EOF ;
    public final String entryRuleimportPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleimportPath = null;


        try {
            // InternalGo.g:312:50: (iv_ruleimportPath= ruleimportPath EOF )
            // InternalGo.g:313:2: iv_ruleimportPath= ruleimportPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleimportPath=ruleimportPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimportPath.getText(); 
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
    // $ANTLR end "entryRuleimportPath"


    // $ANTLR start "ruleimportPath"
    // InternalGo.g:319:1: ruleimportPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleimportPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalGo.g:325:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalGo.g:326:2: this_STRING_LIT_0= RULE_STRING_LIT
            {
            this_STRING_LIT_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_LIT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_LIT_0, grammarAccess.getImportPathAccess().getSTRING_LITTerminalRuleCall());
              	
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
    // $ANTLR end "ruleimportPath"


    // $ANTLR start "entryRuletopLevelDecl"
    // InternalGo.g:336:1: entryRuletopLevelDecl returns [String current=null] : iv_ruletopLevelDecl= ruletopLevelDecl EOF ;
    public final String entryRuletopLevelDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletopLevelDecl = null;


        try {
            // InternalGo.g:336:52: (iv_ruletopLevelDecl= ruletopLevelDecl EOF )
            // InternalGo.g:337:2: iv_ruletopLevelDecl= ruletopLevelDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletopLevelDecl=ruletopLevelDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletopLevelDecl.getText(); 
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
    // $ANTLR end "entryRuletopLevelDecl"


    // $ANTLR start "ruletopLevelDecl"
    // InternalGo.g:343:1: ruletopLevelDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_0= ruledeclaration | this_functionDecl_1= rulefunctionDecl | this_methodDecl_2= rulemethodDecl ) ;
    public final AntlrDatatypeRuleToken ruletopLevelDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_0 = null;

        AntlrDatatypeRuleToken this_functionDecl_1 = null;

        AntlrDatatypeRuleToken this_methodDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:349:2: ( (this_declaration_0= ruledeclaration | this_functionDecl_1= rulefunctionDecl | this_methodDecl_2= rulemethodDecl ) )
            // InternalGo.g:350:2: (this_declaration_0= ruledeclaration | this_functionDecl_1= rulefunctionDecl | this_methodDecl_2= rulemethodDecl )
            {
            // InternalGo.g:350:2: (this_declaration_0= ruledeclaration | this_functionDecl_1= rulefunctionDecl | this_methodDecl_2= rulemethodDecl )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50||LA6_0==53||LA6_0==55) ) {
                alt6=1;
            }
            else if ( (LA6_0==54) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_IDENTIFIER) ) {
                    alt6=2;
                }
                else if ( (LA6_2==47) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:351:3: this_declaration_0= ruledeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_declaration_0=ruledeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_declaration_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:362:3: this_functionDecl_1= rulefunctionDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getFunctionDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_functionDecl_1=rulefunctionDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_functionDecl_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:373:3: this_methodDecl_2= rulemethodDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getMethodDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_methodDecl_2=rulemethodDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_methodDecl_2);
                      		
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
    // $ANTLR end "ruletopLevelDecl"


    // $ANTLR start "entryRuledeclaration"
    // InternalGo.g:387:1: entryRuledeclaration returns [String current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final String entryRuledeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration = null;


        try {
            // InternalGo.g:387:51: (iv_ruledeclaration= ruledeclaration EOF )
            // InternalGo.g:388:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeclaration=ruledeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration.getText(); 
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
    // $ANTLR end "entryRuledeclaration"


    // $ANTLR start "ruledeclaration"
    // InternalGo.g:394:1: ruledeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_constDecl_0= ruleconstDecl | this_typeDecl_1= ruletypeDecl | this_varDecl_2= rulevarDecl ) ;
    public final AntlrDatatypeRuleToken ruledeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_constDecl_0 = null;

        AntlrDatatypeRuleToken this_typeDecl_1 = null;

        AntlrDatatypeRuleToken this_varDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:400:2: ( (this_constDecl_0= ruleconstDecl | this_typeDecl_1= ruletypeDecl | this_varDecl_2= rulevarDecl ) )
            // InternalGo.g:401:2: (this_constDecl_0= ruleconstDecl | this_typeDecl_1= ruletypeDecl | this_varDecl_2= rulevarDecl )
            {
            // InternalGo.g:401:2: (this_constDecl_0= ruleconstDecl | this_typeDecl_1= ruletypeDecl | this_varDecl_2= rulevarDecl )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt7=1;
                }
                break;
            case 53:
                {
                alt7=2;
                }
                break;
            case 55:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGo.g:402:3: this_constDecl_0= ruleconstDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getConstDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_constDecl_0=ruleconstDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_constDecl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:413:3: this_typeDecl_1= ruletypeDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeDecl_1=ruletypeDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeDecl_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:424:3: this_varDecl_2= rulevarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getVarDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_varDecl_2=rulevarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_varDecl_2);
                      		
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
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "entryRuleconstDecl"
    // InternalGo.g:438:1: entryRuleconstDecl returns [String current=null] : iv_ruleconstDecl= ruleconstDecl EOF ;
    public final String entryRuleconstDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstDecl = null;


        try {
            // InternalGo.g:438:49: (iv_ruleconstDecl= ruleconstDecl EOF )
            // InternalGo.g:439:2: iv_ruleconstDecl= ruleconstDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstDecl=ruleconstDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstDecl.getText(); 
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
    // $ANTLR end "entryRuleconstDecl"


    // $ANTLR start "ruleconstDecl"
    // InternalGo.g:445:1: ruleconstDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' (this_constSpec_1= ruleconstSpec | (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleconstDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constSpec_1 = null;

        AntlrDatatypeRuleToken this_constSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:451:2: ( (kw= 'const' (this_constSpec_1= ruleconstSpec | (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalGo.g:452:2: (kw= 'const' (this_constSpec_1= ruleconstSpec | (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalGo.g:452:2: (kw= 'const' (this_constSpec_1= ruleconstSpec | (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' ) ) )
            // InternalGo.g:453:3: kw= 'const' (this_constSpec_1= ruleconstSpec | (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,50,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getConstDeclAccess().getConstKeyword_0());
              		
            }
            // InternalGo.g:458:3: (this_constSpec_1= ruleconstSpec | (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENTIFIER) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:459:4: this_constSpec_1= ruleconstSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_constSpec_1=ruleconstSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:470:4: (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' )
                    {
                    // InternalGo.g:470:4: (kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')' )
                    // InternalGo.g:471:5: kw= '(' (this_constSpec_3= ruleconstSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getConstDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:476:5: (this_constSpec_3= ruleconstSpec kw= ';' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_IDENTIFIER) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGo.g:477:6: this_constSpec_3= ruleconstSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    this_constSpec_3=ruleconstSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_constSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getConstDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getConstDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
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
    // $ANTLR end "ruleconstDecl"


    // $ANTLR start "entryRuleconstSpec"
    // InternalGo.g:504:1: entryRuleconstSpec returns [String current=null] : iv_ruleconstSpec= ruleconstSpec EOF ;
    public final String entryRuleconstSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstSpec = null;


        try {
            // InternalGo.g:504:49: (iv_ruleconstSpec= ruleconstSpec EOF )
            // InternalGo.g:505:2: iv_ruleconstSpec= ruleconstSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstSpec=ruleconstSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstSpec.getText(); 
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
    // $ANTLR end "entryRuleconstSpec"


    // $ANTLR start "ruleconstSpec"
    // InternalGo.g:511:1: ruleconstSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype )? kw= '=' this_expressionList_3= ruleexpressionList )? ) ;
    public final AntlrDatatypeRuleToken ruleconstSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifierList_0 = null;

        AntlrDatatypeRuleToken this_type_1 = null;

        AntlrDatatypeRuleToken this_expressionList_3 = null;



        	enterRule();

        try {
            // InternalGo.g:517:2: ( (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype )? kw= '=' this_expressionList_3= ruleexpressionList )? ) )
            // InternalGo.g:518:2: (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype )? kw= '=' this_expressionList_3= ruleexpressionList )? )
            {
            // InternalGo.g:518:2: (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype )? kw= '=' this_expressionList_3= ruleexpressionList )? )
            // InternalGo.g:519:3: this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype )? kw= '=' this_expressionList_3= ruleexpressionList )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_identifierList_0=ruleidentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_identifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:529:3: ( (this_type_1= ruletype )? kw= '=' this_expressionList_3= ruleexpressionList )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_IDENTIFIER||LA11_0==47||LA11_0==51||LA11_0==54||LA11_0==58||LA11_0==65||LA11_0==89||(LA11_0>=91 && LA11_0<=93)||LA11_0==95) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:530:4: (this_type_1= ruletype )? kw= '=' this_expressionList_3= ruleexpressionList
                    {
                    // InternalGo.g:530:4: (this_type_1= ruletype )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_IDENTIFIER||LA10_0==47||LA10_0==54||LA10_0==58||LA10_0==65||LA10_0==89||(LA10_0>=91 && LA10_0<=93)||LA10_0==95) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:531:5: this_type_1= ruletype
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConstSpecAccess().getTypeParserRuleCall_1_0());
                              				
                            }
                            pushFollow(FOLLOW_13);
                            this_type_1=ruletype();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_type_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,51,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConstSpecAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConstSpecAccess().getExpressionListParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expressionList_3=ruleexpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expressionList_3);
                      			
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
    // $ANTLR end "ruleconstSpec"


    // $ANTLR start "entryRuleidentifierList"
    // InternalGo.g:562:1: entryRuleidentifierList returns [String current=null] : iv_ruleidentifierList= ruleidentifierList EOF ;
    public final String entryRuleidentifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifierList = null;


        try {
            // InternalGo.g:562:54: (iv_ruleidentifierList= ruleidentifierList EOF )
            // InternalGo.g:563:2: iv_ruleidentifierList= ruleidentifierList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleidentifierList=ruleidentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifierList.getText(); 
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
    // $ANTLR end "entryRuleidentifierList"


    // $ANTLR start "ruleidentifierList"
    // InternalGo.g:569:1: ruleidentifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalGo.g:575:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // InternalGo.g:576:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // InternalGo.g:576:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // InternalGo.g:577:3: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            // InternalGo.g:584:3: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==52) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:585:4: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,52,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIdentifierListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENTIFIER_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleidentifierList"


    // $ANTLR start "entryRuleexpressionList"
    // InternalGo.g:602:1: entryRuleexpressionList returns [String current=null] : iv_ruleexpressionList= ruleexpressionList EOF ;
    public final String entryRuleexpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpressionList = null;


        try {
            // InternalGo.g:602:54: (iv_ruleexpressionList= ruleexpressionList EOF )
            // InternalGo.g:603:2: iv_ruleexpressionList= ruleexpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionList=ruleexpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionList.getText(); 
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
    // $ANTLR end "entryRuleexpressionList"


    // $ANTLR start "ruleexpressionList"
    // InternalGo.g:609:1: ruleexpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) ;
    public final AntlrDatatypeRuleToken ruleexpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;



        	enterRule();

        try {
            // InternalGo.g:615:2: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) )
            // InternalGo.g:616:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
            {
            // InternalGo.g:616:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
            // InternalGo.g:617:3: this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:627:3: (kw= ',' this_expression_2= ruleexpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==52) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred16_InternalGo()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:628:4: kw= ',' this_expression_2= ruleexpression
            	    {
            	    kw=(Token)match(input,52,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_15);
            	    this_expression_2=ruleexpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_expression_2);
            	      			
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
    // $ANTLR end "ruleexpressionList"


    // $ANTLR start "entryRuletypeDecl"
    // InternalGo.g:648:1: entryRuletypeDecl returns [String current=null] : iv_ruletypeDecl= ruletypeDecl EOF ;
    public final String entryRuletypeDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeDecl = null;


        try {
            // InternalGo.g:648:48: (iv_ruletypeDecl= ruletypeDecl EOF )
            // InternalGo.g:649:2: iv_ruletypeDecl= ruletypeDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeDecl=ruletypeDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeDecl.getText(); 
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
    // $ANTLR end "entryRuletypeDecl"


    // $ANTLR start "ruletypeDecl"
    // InternalGo.g:655:1: ruletypeDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' (this_typeSpec_1= ruletypeSpec | (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruletypeDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeSpec_1 = null;

        AntlrDatatypeRuleToken this_typeSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:661:2: ( (kw= 'type' (this_typeSpec_1= ruletypeSpec | (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalGo.g:662:2: (kw= 'type' (this_typeSpec_1= ruletypeSpec | (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalGo.g:662:2: (kw= 'type' (this_typeSpec_1= ruletypeSpec | (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' ) ) )
            // InternalGo.g:663:3: kw= 'type' (this_typeSpec_1= ruletypeSpec | (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,53,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
              		
            }
            // InternalGo.g:668:3: (this_typeSpec_1= ruletypeSpec | (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENTIFIER) ) {
                alt15=1;
            }
            else if ( (LA15_0==47) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:669:4: this_typeSpec_1= ruletypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_typeSpec_1=ruletypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:680:4: (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' )
                    {
                    // InternalGo.g:680:4: (kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')' )
                    // InternalGo.g:681:5: kw= '(' (this_typeSpec_3= ruletypeSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getTypeDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:686:5: (this_typeSpec_3= ruletypeSpec kw= ';' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_IDENTIFIER) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGo.g:687:6: this_typeSpec_3= ruletypeSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    this_typeSpec_3=ruletypeSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_typeSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getTypeDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
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
    // $ANTLR end "ruletypeDecl"


    // $ANTLR start "entryRuletypeSpec"
    // InternalGo.g:714:1: entryRuletypeSpec returns [String current=null] : iv_ruletypeSpec= ruletypeSpec EOF ;
    public final String entryRuletypeSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeSpec = null;


        try {
            // InternalGo.g:714:48: (iv_ruletypeSpec= ruletypeSpec EOF )
            // InternalGo.g:715:2: iv_ruletypeSpec= ruletypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeSpec=ruletypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeSpec.getText(); 
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
    // $ANTLR end "entryRuletypeSpec"


    // $ANTLR start "ruletypeSpec"
    // InternalGo.g:721:1: ruletypeSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_type_1= ruletype ) ;
    public final AntlrDatatypeRuleToken ruletypeSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:727:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_type_1= ruletype ) )
            // InternalGo.g:728:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_type_1= ruletype )
            {
            // InternalGo.g:728:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_type_1= ruletype )
            // InternalGo.g:729:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_type_1= ruletype
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeSpecAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeSpecAccess().getTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_type_1=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_type_1);
              		
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
    // $ANTLR end "ruletypeSpec"


    // $ANTLR start "entryRulefunctionDecl"
    // InternalGo.g:750:1: entryRulefunctionDecl returns [String current=null] : iv_rulefunctionDecl= rulefunctionDecl EOF ;
    public final String entryRulefunctionDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunctionDecl = null;


        try {
            // InternalGo.g:750:52: (iv_rulefunctionDecl= rulefunctionDecl EOF )
            // InternalGo.g:751:2: iv_rulefunctionDecl= rulefunctionDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunctionDecl=rulefunctionDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunctionDecl.getText(); 
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
    // $ANTLR end "entryRulefunctionDecl"


    // $ANTLR start "rulefunctionDecl"
    // InternalGo.g:757:1: rulefunctionDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER (this_function_2= rulefunction | this_signature_3= rulesignature ) ) ;
    public final AntlrDatatypeRuleToken rulefunctionDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_function_2 = null;

        AntlrDatatypeRuleToken this_signature_3 = null;



        	enterRule();

        try {
            // InternalGo.g:763:2: ( (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER (this_function_2= rulefunction | this_signature_3= rulesignature ) ) )
            // InternalGo.g:764:2: (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER (this_function_2= rulefunction | this_signature_3= rulesignature ) )
            {
            // InternalGo.g:764:2: (kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER (this_function_2= rulefunction | this_signature_3= rulesignature ) )
            // InternalGo.g:765:3: kw= 'func' this_IDENTIFIER_1= RULE_IDENTIFIER (this_function_2= rulefunction | this_signature_3= rulesignature )
            {
            kw=(Token)match(input,54,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionDeclAccess().getFuncKeyword_0());
              		
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_1, grammarAccess.getFunctionDeclAccess().getIDENTIFIERTerminalRuleCall_1());
              		
            }
            // InternalGo.g:777:3: (this_function_2= rulefunction | this_signature_3= rulesignature )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred19_InternalGo()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:778:4: this_function_2= rulefunction
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_function_2=rulefunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_function_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:789:4: this_signature_3= rulesignature
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionDeclAccess().getSignatureParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_signature_3=rulesignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_signature_3);
                      			
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
    // $ANTLR end "rulefunctionDecl"


    // $ANTLR start "entryRulefunction"
    // InternalGo.g:804:1: entryRulefunction returns [String current=null] : iv_rulefunction= rulefunction EOF ;
    public final String entryRulefunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction = null;


        try {
            // InternalGo.g:804:48: (iv_rulefunction= rulefunction EOF )
            // InternalGo.g:805:2: iv_rulefunction= rulefunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction=rulefunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction.getText(); 
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
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // InternalGo.g:811:1: rulefunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_signature_0= rulesignature this_block_1= ruleblock ) ;
    public final AntlrDatatypeRuleToken rulefunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_signature_0 = null;

        AntlrDatatypeRuleToken this_block_1 = null;



        	enterRule();

        try {
            // InternalGo.g:817:2: ( (this_signature_0= rulesignature this_block_1= ruleblock ) )
            // InternalGo.g:818:2: (this_signature_0= rulesignature this_block_1= ruleblock )
            {
            // InternalGo.g:818:2: (this_signature_0= rulesignature this_block_1= ruleblock )
            // InternalGo.g:819:3: this_signature_0= rulesignature this_block_1= ruleblock
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getSignatureParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_signature_0=rulesignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_signature_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getBlockParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_block_1=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_block_1);
              		
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
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRulemethodDecl"
    // InternalGo.g:843:1: entryRulemethodDecl returns [String current=null] : iv_rulemethodDecl= rulemethodDecl EOF ;
    public final String entryRulemethodDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemethodDecl = null;


        try {
            // InternalGo.g:843:50: (iv_rulemethodDecl= rulemethodDecl EOF )
            // InternalGo.g:844:2: iv_rulemethodDecl= rulemethodDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemethodDecl=rulemethodDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemethodDecl.getText(); 
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
    // $ANTLR end "entryRulemethodDecl"


    // $ANTLR start "rulemethodDecl"
    // InternalGo.g:850:1: rulemethodDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_receiver_1= rulereceiver this_IDENTIFIER_2= RULE_IDENTIFIER (this_function_3= rulefunction | this_signature_4= rulesignature ) ) ;
    public final AntlrDatatypeRuleToken rulemethodDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_2=null;
        AntlrDatatypeRuleToken this_receiver_1 = null;

        AntlrDatatypeRuleToken this_function_3 = null;

        AntlrDatatypeRuleToken this_signature_4 = null;



        	enterRule();

        try {
            // InternalGo.g:856:2: ( (kw= 'func' this_receiver_1= rulereceiver this_IDENTIFIER_2= RULE_IDENTIFIER (this_function_3= rulefunction | this_signature_4= rulesignature ) ) )
            // InternalGo.g:857:2: (kw= 'func' this_receiver_1= rulereceiver this_IDENTIFIER_2= RULE_IDENTIFIER (this_function_3= rulefunction | this_signature_4= rulesignature ) )
            {
            // InternalGo.g:857:2: (kw= 'func' this_receiver_1= rulereceiver this_IDENTIFIER_2= RULE_IDENTIFIER (this_function_3= rulefunction | this_signature_4= rulesignature ) )
            // InternalGo.g:858:3: kw= 'func' this_receiver_1= rulereceiver this_IDENTIFIER_2= RULE_IDENTIFIER (this_function_3= rulefunction | this_signature_4= rulesignature )
            {
            kw=(Token)match(input,54,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMethodDeclAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getReceiverParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_6);
            this_receiver_1=rulereceiver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_receiver_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_2, grammarAccess.getMethodDeclAccess().getIDENTIFIERTerminalRuleCall_2());
              		
            }
            // InternalGo.g:880:3: (this_function_3= rulefunction | this_signature_4= rulesignature )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred20_InternalGo()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
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
                    // InternalGo.g:881:4: this_function_3= rulefunction
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodDeclAccess().getFunctionParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_function_3=rulefunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_function_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:892:4: this_signature_4= rulesignature
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodDeclAccess().getSignatureParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_signature_4=rulesignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_signature_4);
                      			
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
    // $ANTLR end "rulemethodDecl"


    // $ANTLR start "entryRulereceiver"
    // InternalGo.g:907:1: entryRulereceiver returns [String current=null] : iv_rulereceiver= rulereceiver EOF ;
    public final String entryRulereceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereceiver = null;


        try {
            // InternalGo.g:907:48: (iv_rulereceiver= rulereceiver EOF )
            // InternalGo.g:908:2: iv_rulereceiver= rulereceiver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulereceiver=rulereceiver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereceiver.getText(); 
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
    // $ANTLR end "entryRulereceiver"


    // $ANTLR start "rulereceiver"
    // InternalGo.g:914:1: rulereceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_parameters_0= ruleparameters ;
    public final AntlrDatatypeRuleToken rulereceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_parameters_0 = null;



        	enterRule();

        try {
            // InternalGo.g:920:2: (this_parameters_0= ruleparameters )
            // InternalGo.g:921:2: this_parameters_0= ruleparameters
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getReceiverAccess().getParametersParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_parameters_0=ruleparameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_parameters_0);
              	
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
    // $ANTLR end "rulereceiver"


    // $ANTLR start "entryRulevarDecl"
    // InternalGo.g:934:1: entryRulevarDecl returns [String current=null] : iv_rulevarDecl= rulevarDecl EOF ;
    public final String entryRulevarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevarDecl = null;


        try {
            // InternalGo.g:934:47: (iv_rulevarDecl= rulevarDecl EOF )
            // InternalGo.g:935:2: iv_rulevarDecl= rulevarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarDecl=rulevarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarDecl.getText(); 
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
    // $ANTLR end "entryRulevarDecl"


    // $ANTLR start "rulevarDecl"
    // InternalGo.g:941:1: rulevarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'var' (this_varSpec_1= rulevarSpec | (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken rulevarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_varSpec_1 = null;

        AntlrDatatypeRuleToken this_varSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:947:2: ( (kw= 'var' (this_varSpec_1= rulevarSpec | (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalGo.g:948:2: (kw= 'var' (this_varSpec_1= rulevarSpec | (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalGo.g:948:2: (kw= 'var' (this_varSpec_1= rulevarSpec | (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' ) ) )
            // InternalGo.g:949:3: kw= 'var' (this_varSpec_1= rulevarSpec | (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,55,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVarDeclAccess().getVarKeyword_0());
              		
            }
            // InternalGo.g:954:3: (this_varSpec_1= rulevarSpec | (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENTIFIER) ) {
                alt19=1;
            }
            else if ( (LA19_0==47) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:955:4: this_varSpec_1= rulevarSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_varSpec_1=rulevarSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_varSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:966:4: (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' )
                    {
                    // InternalGo.g:966:4: (kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')' )
                    // InternalGo.g:967:5: kw= '(' (this_varSpec_3= rulevarSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:972:5: (this_varSpec_3= rulevarSpec kw= ';' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_IDENTIFIER) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalGo.g:973:6: this_varSpec_3= rulevarSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    this_varSpec_3=rulevarSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_varSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getVarDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
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
    // $ANTLR end "rulevarDecl"


    // $ANTLR start "entryRulevarSpec"
    // InternalGo.g:1000:1: entryRulevarSpec returns [String current=null] : iv_rulevarSpec= rulevarSpec EOF ;
    public final String entryRulevarSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevarSpec = null;


        try {
            // InternalGo.g:1000:47: (iv_rulevarSpec= rulevarSpec EOF )
            // InternalGo.g:1001:2: iv_rulevarSpec= rulevarSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarSpec=rulevarSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarSpec.getText(); 
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
    // $ANTLR end "entryRulevarSpec"


    // $ANTLR start "rulevarSpec"
    // InternalGo.g:1007:1: rulevarSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? ) | (kw= '=' this_expressionList_5= ruleexpressionList ) ) ) ;
    public final AntlrDatatypeRuleToken rulevarSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifierList_0 = null;

        AntlrDatatypeRuleToken this_type_1 = null;

        AntlrDatatypeRuleToken this_expressionList_3 = null;

        AntlrDatatypeRuleToken this_expressionList_5 = null;



        	enterRule();

        try {
            // InternalGo.g:1013:2: ( (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? ) | (kw= '=' this_expressionList_5= ruleexpressionList ) ) ) )
            // InternalGo.g:1014:2: (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? ) | (kw= '=' this_expressionList_5= ruleexpressionList ) ) )
            {
            // InternalGo.g:1014:2: (this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? ) | (kw= '=' this_expressionList_5= ruleexpressionList ) ) )
            // InternalGo.g:1015:3: this_identifierList_0= ruleidentifierList ( (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? ) | (kw= '=' this_expressionList_5= ruleexpressionList ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_identifierList_0=ruleidentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_identifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1025:3: ( (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? ) | (kw= '=' this_expressionList_5= ruleexpressionList ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENTIFIER||LA21_0==47||LA21_0==54||LA21_0==58||LA21_0==65||LA21_0==89||(LA21_0>=91 && LA21_0<=93)||LA21_0==95) ) {
                alt21=1;
            }
            else if ( (LA21_0==51) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1026:4: (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? )
                    {
                    // InternalGo.g:1026:4: (this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )? )
                    // InternalGo.g:1027:5: this_type_1= ruletype (kw= '=' this_expressionList_3= ruleexpressionList )?
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getTypeParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    this_type_1=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_type_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalGo.g:1037:5: (kw= '=' this_expressionList_3= ruleexpressionList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==51) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGo.g:1038:6: kw= '=' this_expressionList_3= ruleexpressionList
                            {
                            kw=(Token)match(input,51,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getVarSpecAccess().getEqualsSignKeyword_1_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getVarSpecAccess().getExpressionListParserRuleCall_1_0_1_1());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            this_expressionList_3=ruleexpressionList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_expressionList_3);
                              					
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
                    // InternalGo.g:1056:4: (kw= '=' this_expressionList_5= ruleexpressionList )
                    {
                    // InternalGo.g:1056:4: (kw= '=' this_expressionList_5= ruleexpressionList )
                    // InternalGo.g:1057:5: kw= '=' this_expressionList_5= ruleexpressionList
                    {
                    kw=(Token)match(input,51,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarSpecAccess().getEqualsSignKeyword_1_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getExpressionListParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_expressionList_5=ruleexpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expressionList_5);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "rulevarSpec"


    // $ANTLR start "entryRuleblock"
    // InternalGo.g:1078:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // InternalGo.g:1078:45: (iv_ruleblock= ruleblock EOF )
            // InternalGo.g:1079:2: iv_ruleblock= ruleblock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleblock.getText(); 
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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalGo.g:1085:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_statementList_1= rulestatementList kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statementList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1091:2: ( (kw= '{' this_statementList_1= rulestatementList kw= '}' ) )
            // InternalGo.g:1092:2: (kw= '{' this_statementList_1= rulestatementList kw= '}' )
            {
            // InternalGo.g:1092:2: (kw= '{' this_statementList_1= rulestatementList kw= '}' )
            // InternalGo.g:1093:3: kw= '{' this_statementList_1= rulestatementList kw= '}'
            {
            kw=(Token)match(input,56,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBlockAccess().getStatementListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_22);
            this_statementList_1=rulestatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_statementList_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatementList"
    // InternalGo.g:1117:1: entryRulestatementList returns [String current=null] : iv_rulestatementList= rulestatementList EOF ;
    public final String entryRulestatementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatementList = null;


        try {
            // InternalGo.g:1117:53: (iv_rulestatementList= rulestatementList EOF )
            // InternalGo.g:1118:2: iv_rulestatementList= rulestatementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatementList=rulestatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatementList.getText(); 
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
    // $ANTLR end "entryRulestatementList"


    // $ANTLR start "rulestatementList"
    // InternalGo.g:1124:1: rulestatementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement kw= ';' )* ;
    public final AntlrDatatypeRuleToken rulestatementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1130:2: ( (this_statement_0= rulestatement kw= ';' )* )
            // InternalGo.g:1131:2: (this_statement_0= rulestatement kw= ';' )*
            {
            // InternalGo.g:1131:2: (this_statement_0= rulestatement kw= ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_IDENTIFIER && LA22_0<=RULE_BINARY_OP)||LA22_0==44||LA22_0==47||(LA22_0>=49 && LA22_0<=56)||(LA22_0>=58 && LA22_0<=71)||(LA22_0>=74 && LA22_0<=80)||LA22_0==82||(LA22_0>=85 && LA22_0<=86)||(LA22_0>=88 && LA22_0<=89)||(LA22_0>=91 && LA22_0<=93)||(LA22_0>=95 && LA22_0<=96)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGo.g:1132:3: this_statement_0= rulestatement kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getStatementListAccess().getStatementParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_4);
            	    this_statement_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_statement_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,44,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getStatementListAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "rulestatementList"


    // $ANTLR start "entryRulestatement"
    // InternalGo.g:1151:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // InternalGo.g:1151:49: (iv_rulestatement= rulestatement EOF )
            // InternalGo.g:1152:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement.getText(); 
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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalGo.g:1158:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_0= ruledeclaration | this_labeledStmt_1= rulelabeledStmt | this_simpleStmt_2= rulesimpleStmt | this_goStmt_3= rulegoStmt | this_returnStmt_4= rulereturnStmt | this_breakStmt_5= rulebreakStmt | this_continueStmt_6= rulecontinueStmt | this_gotoStmt_7= rulegotoStmt | this_fallthroughStmt_8= rulefallthroughStmt | this_block_9= ruleblock | this_ifStmt_10= ruleifStmt | this_switchStmt_11= ruleswitchStmt | this_selectStmt_12= ruleselectStmt | this_forStmt_13= ruleforStmt | this_deferStmt_14= ruledeferStmt ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_0 = null;

        AntlrDatatypeRuleToken this_labeledStmt_1 = null;

        AntlrDatatypeRuleToken this_simpleStmt_2 = null;

        AntlrDatatypeRuleToken this_goStmt_3 = null;

        AntlrDatatypeRuleToken this_returnStmt_4 = null;

        AntlrDatatypeRuleToken this_breakStmt_5 = null;

        AntlrDatatypeRuleToken this_continueStmt_6 = null;

        AntlrDatatypeRuleToken this_gotoStmt_7 = null;

        AntlrDatatypeRuleToken this_fallthroughStmt_8 = null;

        AntlrDatatypeRuleToken this_block_9 = null;

        AntlrDatatypeRuleToken this_ifStmt_10 = null;

        AntlrDatatypeRuleToken this_switchStmt_11 = null;

        AntlrDatatypeRuleToken this_selectStmt_12 = null;

        AntlrDatatypeRuleToken this_forStmt_13 = null;

        AntlrDatatypeRuleToken this_deferStmt_14 = null;



        	enterRule();

        try {
            // InternalGo.g:1164:2: ( (this_declaration_0= ruledeclaration | this_labeledStmt_1= rulelabeledStmt | this_simpleStmt_2= rulesimpleStmt | this_goStmt_3= rulegoStmt | this_returnStmt_4= rulereturnStmt | this_breakStmt_5= rulebreakStmt | this_continueStmt_6= rulecontinueStmt | this_gotoStmt_7= rulegotoStmt | this_fallthroughStmt_8= rulefallthroughStmt | this_block_9= ruleblock | this_ifStmt_10= ruleifStmt | this_switchStmt_11= ruleswitchStmt | this_selectStmt_12= ruleselectStmt | this_forStmt_13= ruleforStmt | this_deferStmt_14= ruledeferStmt ) )
            // InternalGo.g:1165:2: (this_declaration_0= ruledeclaration | this_labeledStmt_1= rulelabeledStmt | this_simpleStmt_2= rulesimpleStmt | this_goStmt_3= rulegoStmt | this_returnStmt_4= rulereturnStmt | this_breakStmt_5= rulebreakStmt | this_continueStmt_6= rulecontinueStmt | this_gotoStmt_7= rulegotoStmt | this_fallthroughStmt_8= rulefallthroughStmt | this_block_9= ruleblock | this_ifStmt_10= ruleifStmt | this_switchStmt_11= ruleswitchStmt | this_selectStmt_12= ruleselectStmt | this_forStmt_13= ruleforStmt | this_deferStmt_14= ruledeferStmt )
            {
            // InternalGo.g:1165:2: (this_declaration_0= ruledeclaration | this_labeledStmt_1= rulelabeledStmt | this_simpleStmt_2= rulesimpleStmt | this_goStmt_3= rulegoStmt | this_returnStmt_4= rulereturnStmt | this_breakStmt_5= rulebreakStmt | this_continueStmt_6= rulecontinueStmt | this_gotoStmt_7= rulegotoStmt | this_fallthroughStmt_8= rulefallthroughStmt | this_block_9= ruleblock | this_ifStmt_10= ruleifStmt | this_switchStmt_11= ruleswitchStmt | this_selectStmt_12= ruleselectStmt | this_forStmt_13= ruleforStmt | this_deferStmt_14= ruledeferStmt )
            int alt23=15;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalGo.g:1166:3: this_declaration_0= ruledeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_declaration_0=ruledeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_declaration_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1177:3: this_labeledStmt_1= rulelabeledStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLabeledStmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_labeledStmt_1=rulelabeledStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_labeledStmt_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1188:3: this_simpleStmt_2= rulesimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSimpleStmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_simpleStmt_2=rulesimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_simpleStmt_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:1199:3: this_goStmt_3= rulegoStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getGoStmtParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_goStmt_3=rulegoStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_goStmt_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:1210:3: this_returnStmt_4= rulereturnStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getReturnStmtParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_returnStmt_4=rulereturnStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_returnStmt_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:1221:3: this_breakStmt_5= rulebreakStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBreakStmtParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_breakStmt_5=rulebreakStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_breakStmt_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:1232:3: this_continueStmt_6= rulecontinueStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getContinueStmtParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_continueStmt_6=rulecontinueStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_continueStmt_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:1243:3: this_gotoStmt_7= rulegotoStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getGotoStmtParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_gotoStmt_7=rulegotoStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_gotoStmt_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGo.g:1254:3: this_fallthroughStmt_8= rulefallthroughStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getFallthroughStmtParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_fallthroughStmt_8=rulefallthroughStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_fallthroughStmt_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGo.g:1265:3: this_block_9= ruleblock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_block_9=ruleblock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_block_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGo.g:1276:3: this_ifStmt_10= ruleifStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ifStmt_10=ruleifStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ifStmt_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalGo.g:1287:3: this_switchStmt_11= ruleswitchStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSwitchStmtParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_switchStmt_11=ruleswitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_switchStmt_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalGo.g:1298:3: this_selectStmt_12= ruleselectStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSelectStmtParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_selectStmt_12=ruleselectStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_selectStmt_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalGo.g:1309:3: this_forStmt_13= ruleforStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStmtParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_forStmt_13=ruleforStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_forStmt_13);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalGo.g:1320:3: this_deferStmt_14= ruledeferStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDeferStmtParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_deferStmt_14=ruledeferStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_deferStmt_14);
                      		
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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimpleStmt"
    // InternalGo.g:1334:1: entryRulesimpleStmt returns [String current=null] : iv_rulesimpleStmt= rulesimpleStmt EOF ;
    public final String entryRulesimpleStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimpleStmt = null;


        try {
            // InternalGo.g:1334:50: (iv_rulesimpleStmt= rulesimpleStmt EOF )
            // InternalGo.g:1335:2: iv_rulesimpleStmt= rulesimpleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesimpleStmt=rulesimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimpleStmt.getText(); 
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
    // $ANTLR end "entryRulesimpleStmt"


    // $ANTLR start "rulesimpleStmt"
    // InternalGo.g:1341:1: rulesimpleStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_sendStmt_0= rulesendStmt | this_expressionStmt_1= ruleexpressionStmt | this_incDecStmt_2= ruleincDecStmt | this_assignment_3= ruleassignment | this_shortVarDecl_4= ruleshortVarDecl | this_emptyStmt_5= ruleemptyStmt ) ;
    public final AntlrDatatypeRuleToken rulesimpleStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_sendStmt_0 = null;

        AntlrDatatypeRuleToken this_expressionStmt_1 = null;

        AntlrDatatypeRuleToken this_incDecStmt_2 = null;

        AntlrDatatypeRuleToken this_assignment_3 = null;

        AntlrDatatypeRuleToken this_shortVarDecl_4 = null;

        AntlrDatatypeRuleToken this_emptyStmt_5 = null;



        	enterRule();

        try {
            // InternalGo.g:1347:2: ( (this_sendStmt_0= rulesendStmt | this_expressionStmt_1= ruleexpressionStmt | this_incDecStmt_2= ruleincDecStmt | this_assignment_3= ruleassignment | this_shortVarDecl_4= ruleshortVarDecl | this_emptyStmt_5= ruleemptyStmt ) )
            // InternalGo.g:1348:2: (this_sendStmt_0= rulesendStmt | this_expressionStmt_1= ruleexpressionStmt | this_incDecStmt_2= ruleincDecStmt | this_assignment_3= ruleassignment | this_shortVarDecl_4= ruleshortVarDecl | this_emptyStmt_5= ruleemptyStmt )
            {
            // InternalGo.g:1348:2: (this_sendStmt_0= rulesendStmt | this_expressionStmt_1= ruleexpressionStmt | this_incDecStmt_2= ruleincDecStmt | this_assignment_3= ruleassignment | this_shortVarDecl_4= ruleshortVarDecl | this_emptyStmt_5= ruleemptyStmt )
            int alt24=6;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1349:3: this_sendStmt_0= rulesendStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getSendStmtParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_sendStmt_0=rulesendStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_sendStmt_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1360:3: this_expressionStmt_1= ruleexpressionStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionStmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_expressionStmt_1=ruleexpressionStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_expressionStmt_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1371:3: this_incDecStmt_2= ruleincDecStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getIncDecStmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_incDecStmt_2=ruleincDecStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_incDecStmt_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:1382:3: this_assignment_3= ruleassignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getAssignmentParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_assignment_3=ruleassignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_assignment_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:1393:3: this_shortVarDecl_4= ruleshortVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getShortVarDeclParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_shortVarDecl_4=ruleshortVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_shortVarDecl_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:1404:3: this_emptyStmt_5= ruleemptyStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getEmptyStmtParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_emptyStmt_5=ruleemptyStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_emptyStmt_5);
                      		
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
    // $ANTLR end "rulesimpleStmt"


    // $ANTLR start "entryRuleexpressionStmt"
    // InternalGo.g:1418:1: entryRuleexpressionStmt returns [String current=null] : iv_ruleexpressionStmt= ruleexpressionStmt EOF ;
    public final String entryRuleexpressionStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpressionStmt = null;


        try {
            // InternalGo.g:1418:54: (iv_ruleexpressionStmt= ruleexpressionStmt EOF )
            // InternalGo.g:1419:2: iv_ruleexpressionStmt= ruleexpressionStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionStmt=ruleexpressionStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionStmt.getText(); 
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
    // $ANTLR end "entryRuleexpressionStmt"


    // $ANTLR start "ruleexpressionStmt"
    // InternalGo.g:1425:1: ruleexpressionStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_expression_0= ruleexpression ;
    public final AntlrDatatypeRuleToken ruleexpressionStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_expression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1431:2: (this_expression_0= ruleexpression )
            // InternalGo.g:1432:2: this_expression_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionStmtAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_0);
              	
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
    // $ANTLR end "ruleexpressionStmt"


    // $ANTLR start "entryRulesendStmt"
    // InternalGo.g:1445:1: entryRulesendStmt returns [String current=null] : iv_rulesendStmt= rulesendStmt EOF ;
    public final String entryRulesendStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesendStmt = null;


        try {
            // InternalGo.g:1445:48: (iv_rulesendStmt= rulesendStmt EOF )
            // InternalGo.g:1446:2: iv_rulesendStmt= rulesendStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSendStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesendStmt=rulesendStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesendStmt.getText(); 
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
    // $ANTLR end "entryRulesendStmt"


    // $ANTLR start "rulesendStmt"
    // InternalGo.g:1452:1: rulesendStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression kw= '<-' this_expression_2= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulesendStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1458:2: ( (this_expression_0= ruleexpression kw= '<-' this_expression_2= ruleexpression ) )
            // InternalGo.g:1459:2: (this_expression_0= ruleexpression kw= '<-' this_expression_2= ruleexpression )
            {
            // InternalGo.g:1459:2: (this_expression_0= ruleexpression kw= '<-' this_expression_2= ruleexpression )
            // InternalGo.g:1460:3: this_expression_0= ruleexpression kw= '<-' this_expression_2= ruleexpression
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSendStmtAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,58,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSendStmtAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSendStmtAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_2);
              		
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
    // $ANTLR end "rulesendStmt"


    // $ANTLR start "entryRuleincDecStmt"
    // InternalGo.g:1489:1: entryRuleincDecStmt returns [String current=null] : iv_ruleincDecStmt= ruleincDecStmt EOF ;
    public final String entryRuleincDecStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleincDecStmt = null;


        try {
            // InternalGo.g:1489:50: (iv_ruleincDecStmt= ruleincDecStmt EOF )
            // InternalGo.g:1490:2: iv_ruleincDecStmt= ruleincDecStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncDecStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleincDecStmt=ruleincDecStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleincDecStmt.getText(); 
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
    // $ANTLR end "entryRuleincDecStmt"


    // $ANTLR start "ruleincDecStmt"
    // InternalGo.g:1496:1: ruleincDecStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (kw= '++' | kw= '--' ) ) ;
    public final AntlrDatatypeRuleToken ruleincDecStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1502:2: ( (this_expression_0= ruleexpression (kw= '++' | kw= '--' ) ) )
            // InternalGo.g:1503:2: (this_expression_0= ruleexpression (kw= '++' | kw= '--' ) )
            {
            // InternalGo.g:1503:2: (this_expression_0= ruleexpression (kw= '++' | kw= '--' ) )
            // InternalGo.g:1504:3: this_expression_0= ruleexpression (kw= '++' | kw= '--' )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIncDecStmtAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1514:3: (kw= '++' | kw= '--' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            else if ( (LA25_0==60) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:1515:4: kw= '++'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIncDecStmtAccess().getPlusSignPlusSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1521:4: kw= '--'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIncDecStmtAccess().getHyphenMinusHyphenMinusKeyword_1_1());
                      			
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
    // $ANTLR end "ruleincDecStmt"


    // $ANTLR start "entryRuleassignment"
    // InternalGo.g:1531:1: entryRuleassignment returns [String current=null] : iv_ruleassignment= ruleassignment EOF ;
    public final String entryRuleassignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment = null;


        try {
            // InternalGo.g:1531:50: (iv_ruleassignment= ruleassignment EOF )
            // InternalGo.g:1532:2: iv_ruleassignment= ruleassignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleassignment=ruleassignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment.getText(); 
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
    // $ANTLR end "entryRuleassignment"


    // $ANTLR start "ruleassignment"
    // InternalGo.g:1538:1: ruleassignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expressionList_0= ruleexpressionList this_assign_op_1= ruleassign_op this_expressionList_2= ruleexpressionList ) ;
    public final AntlrDatatypeRuleToken ruleassignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_expressionList_0 = null;

        AntlrDatatypeRuleToken this_assign_op_1 = null;

        AntlrDatatypeRuleToken this_expressionList_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1544:2: ( (this_expressionList_0= ruleexpressionList this_assign_op_1= ruleassign_op this_expressionList_2= ruleexpressionList ) )
            // InternalGo.g:1545:2: (this_expressionList_0= ruleexpressionList this_assign_op_1= ruleassign_op this_expressionList_2= ruleexpressionList )
            {
            // InternalGo.g:1545:2: (this_expressionList_0= ruleexpressionList this_assign_op_1= ruleassign_op this_expressionList_2= ruleexpressionList )
            // InternalGo.g:1546:3: this_expressionList_0= ruleexpressionList this_assign_op_1= ruleassign_op this_expressionList_2= ruleexpressionList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_expressionList_0=ruleexpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expressionList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getAssign_opParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_14);
            this_assign_op_1=ruleassign_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_assign_op_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_expressionList_2=ruleexpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expressionList_2);
              		
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
    // $ANTLR end "ruleassignment"


    // $ANTLR start "entryRuleassign_op"
    // InternalGo.g:1580:1: entryRuleassign_op returns [String current=null] : iv_ruleassign_op= ruleassign_op EOF ;
    public final String entryRuleassign_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassign_op = null;


        try {
            // InternalGo.g:1580:49: (iv_ruleassign_op= ruleassign_op EOF )
            // InternalGo.g:1581:2: iv_ruleassign_op= ruleassign_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssign_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleassign_op=ruleassign_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassign_op.getText(); 
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
    // $ANTLR end "entryRuleassign_op"


    // $ANTLR start "ruleassign_op"
    // InternalGo.g:1587:1: ruleassign_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' | kw= '|' | kw= '^' | kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )? kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleassign_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1593:2: ( ( (kw= '+' | kw= '-' | kw= '|' | kw= '^' | kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )? kw= '=' ) )
            // InternalGo.g:1594:2: ( (kw= '+' | kw= '-' | kw= '|' | kw= '^' | kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )? kw= '=' )
            {
            // InternalGo.g:1594:2: ( (kw= '+' | kw= '-' | kw= '|' | kw= '^' | kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )? kw= '=' )
            // InternalGo.g:1595:3: (kw= '+' | kw= '-' | kw= '|' | kw= '^' | kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )? kw= '='
            {
            // InternalGo.g:1595:3: (kw= '+' | kw= '-' | kw= '|' | kw= '^' | kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )?
            int alt26=12;
            switch ( input.LA(1) ) {
                case 61:
                    {
                    alt26=1;
                    }
                    break;
                case 62:
                    {
                    alt26=2;
                    }
                    break;
                case 63:
                    {
                    alt26=3;
                    }
                    break;
                case 64:
                    {
                    alt26=4;
                    }
                    break;
                case 65:
                    {
                    alt26=5;
                    }
                    break;
                case 66:
                    {
                    alt26=6;
                    }
                    break;
                case 67:
                    {
                    alt26=7;
                    }
                    break;
                case 68:
                    {
                    alt26=8;
                    }
                    break;
                case 69:
                    {
                    alt26=9;
                    }
                    break;
                case 70:
                    {
                    alt26=10;
                    }
                    break;
                case 71:
                    {
                    alt26=11;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // InternalGo.g:1596:4: kw= '+'
                    {
                    kw=(Token)match(input,61,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1602:4: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1608:4: kw= '|'
                    {
                    kw=(Token)match(input,63,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getVerticalLineKeyword_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:1614:4: kw= '^'
                    {
                    kw=(Token)match(input,64,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getCircumflexAccentKeyword_0_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:1620:4: kw= '*'
                    {
                    kw=(Token)match(input,65,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getAsteriskKeyword_0_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:1626:4: kw= '/'
                    {
                    kw=(Token)match(input,66,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getSolidusKeyword_0_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:1632:4: kw= '%'
                    {
                    kw=(Token)match(input,67,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getPercentSignKeyword_0_6());
                      			
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:1638:4: kw= '<<'
                    {
                    kw=(Token)match(input,68,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getLessThanSignLessThanSignKeyword_0_7());
                      			
                    }

                    }
                    break;
                case 9 :
                    // InternalGo.g:1644:4: kw= '>>'
                    {
                    kw=(Token)match(input,69,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getGreaterThanSignGreaterThanSignKeyword_0_8());
                      			
                    }

                    }
                    break;
                case 10 :
                    // InternalGo.g:1650:4: kw= '&'
                    {
                    kw=(Token)match(input,70,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getAmpersandKeyword_0_9());
                      			
                    }

                    }
                    break;
                case 11 :
                    // InternalGo.g:1656:4: kw= '&^'
                    {
                    kw=(Token)match(input,71,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAssign_opAccess().getAmpersandCircumflexAccentKeyword_0_10());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAssign_opAccess().getEqualsSignKeyword_1());
              		
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
    // $ANTLR end "ruleassign_op"


    // $ANTLR start "entryRuleshortVarDecl"
    // InternalGo.g:1671:1: entryRuleshortVarDecl returns [String current=null] : iv_ruleshortVarDecl= ruleshortVarDecl EOF ;
    public final String entryRuleshortVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleshortVarDecl = null;


        try {
            // InternalGo.g:1671:52: (iv_ruleshortVarDecl= ruleshortVarDecl EOF )
            // InternalGo.g:1672:2: iv_ruleshortVarDecl= ruleshortVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShortVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleshortVarDecl=ruleshortVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleshortVarDecl.getText(); 
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
    // $ANTLR end "entryRuleshortVarDecl"


    // $ANTLR start "ruleshortVarDecl"
    // InternalGo.g:1678:1: ruleshortVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifierList_0= ruleidentifierList kw= ':=' this_expressionList_2= ruleexpressionList ) ;
    public final AntlrDatatypeRuleToken ruleshortVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifierList_0 = null;

        AntlrDatatypeRuleToken this_expressionList_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1684:2: ( (this_identifierList_0= ruleidentifierList kw= ':=' this_expressionList_2= ruleexpressionList ) )
            // InternalGo.g:1685:2: (this_identifierList_0= ruleidentifierList kw= ':=' this_expressionList_2= ruleexpressionList )
            {
            // InternalGo.g:1685:2: (this_identifierList_0= ruleidentifierList kw= ':=' this_expressionList_2= ruleexpressionList )
            // InternalGo.g:1686:3: this_identifierList_0= ruleidentifierList kw= ':=' this_expressionList_2= ruleexpressionList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShortVarDeclAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_identifierList_0=ruleidentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_identifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,72,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getShortVarDeclAccess().getColonEqualsSignKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShortVarDeclAccess().getExpressionListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_expressionList_2=ruleexpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expressionList_2);
              		
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
    // $ANTLR end "ruleshortVarDecl"


    // $ANTLR start "entryRuleemptyStmt"
    // InternalGo.g:1715:1: entryRuleemptyStmt returns [String current=null] : iv_ruleemptyStmt= ruleemptyStmt EOF ;
    public final String entryRuleemptyStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleemptyStmt = null;


        try {
            // InternalGo.g:1715:49: (iv_ruleemptyStmt= ruleemptyStmt EOF )
            // InternalGo.g:1716:2: iv_ruleemptyStmt= ruleemptyStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleemptyStmt=ruleemptyStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleemptyStmt.getText(); 
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
    // $ANTLR end "entryRuleemptyStmt"


    // $ANTLR start "ruleemptyStmt"
    // InternalGo.g:1722:1: ruleemptyStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WS_0= RULE_WS ;
    public final AntlrDatatypeRuleToken ruleemptyStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;


        	enterRule();

        try {
            // InternalGo.g:1728:2: (this_WS_0= RULE_WS )
            // InternalGo.g:1729:2: this_WS_0= RULE_WS
            {
            this_WS_0=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_WS_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_WS_0, grammarAccess.getEmptyStmtAccess().getWSTerminalRuleCall());
              	
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
    // $ANTLR end "ruleemptyStmt"


    // $ANTLR start "entryRulelabeledStmt"
    // InternalGo.g:1739:1: entryRulelabeledStmt returns [String current=null] : iv_rulelabeledStmt= rulelabeledStmt EOF ;
    public final String entryRulelabeledStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabeledStmt = null;


        try {
            // InternalGo.g:1739:51: (iv_rulelabeledStmt= rulelabeledStmt EOF )
            // InternalGo.g:1740:2: iv_rulelabeledStmt= rulelabeledStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelabeledStmt=rulelabeledStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabeledStmt.getText(); 
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
    // $ANTLR end "entryRulelabeledStmt"


    // $ANTLR start "rulelabeledStmt"
    // InternalGo.g:1746:1: rulelabeledStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_statement_2= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulelabeledStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_statement_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1752:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_statement_2= rulestatement ) )
            // InternalGo.g:1753:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_statement_2= rulestatement )
            {
            // InternalGo.g:1753:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_statement_2= rulestatement )
            // InternalGo.g:1754:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' this_statement_2= rulestatement
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getLabeledStmtAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,73,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLabeledStmtAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLabeledStmtAccess().getStatementParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_statement_2=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_statement_2);
              		
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
    // $ANTLR end "rulelabeledStmt"


    // $ANTLR start "entryRulereturnStmt"
    // InternalGo.g:1780:1: entryRulereturnStmt returns [String current=null] : iv_rulereturnStmt= rulereturnStmt EOF ;
    public final String entryRulereturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereturnStmt = null;


        try {
            // InternalGo.g:1780:50: (iv_rulereturnStmt= rulereturnStmt EOF )
            // InternalGo.g:1781:2: iv_rulereturnStmt= rulereturnStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulereturnStmt=rulereturnStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereturnStmt.getText(); 
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
    // $ANTLR end "entryRulereturnStmt"


    // $ANTLR start "rulereturnStmt"
    // InternalGo.g:1787:1: rulereturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' (this_expressionList_1= ruleexpressionList )? ) ;
    public final AntlrDatatypeRuleToken rulereturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1793:2: ( (kw= 'return' (this_expressionList_1= ruleexpressionList )? ) )
            // InternalGo.g:1794:2: (kw= 'return' (this_expressionList_1= ruleexpressionList )? )
            {
            // InternalGo.g:1794:2: (kw= 'return' (this_expressionList_1= ruleexpressionList )? )
            // InternalGo.g:1795:3: kw= 'return' (this_expressionList_1= ruleexpressionList )?
            {
            kw=(Token)match(input,74,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getReturnStmtAccess().getReturnKeyword_0());
              		
            }
            // InternalGo.g:1800:3: (this_expressionList_1= ruleexpressionList )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case RULE_IDENTIFIER:
                case RULE_STRING_LIT:
                case RULE_INT_LIT:
                case RULE_FLOAT_LIT:
                case RULE_IMAGINARY_LIT:
                case RULE_RUNE_LIT:
                case RULE_BINARY_OP:
                case 47:
                case 49:
                case 52:
                case 54:
                case 58:
                case 61:
                case 62:
                case 64:
                case 65:
                case 70:
                case 89:
                case 91:
                case 92:
                case 93:
                case 95:
                case 96:
                    {
                    alt27=1;
                    }
                    break;
                case 44:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (synpred57_InternalGo()) ) {
                        alt27=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (synpred57_InternalGo()) ) {
                        alt27=1;
                    }
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // InternalGo.g:1801:4: this_expressionList_1= ruleexpressionList
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReturnStmtAccess().getExpressionListParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expressionList_1=ruleexpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expressionList_1);
                      			
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
    // $ANTLR end "rulereturnStmt"


    // $ANTLR start "entryRulebreakStmt"
    // InternalGo.g:1816:1: entryRulebreakStmt returns [String current=null] : iv_rulebreakStmt= rulebreakStmt EOF ;
    public final String entryRulebreakStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebreakStmt = null;


        try {
            // InternalGo.g:1816:49: (iv_rulebreakStmt= rulebreakStmt EOF )
            // InternalGo.g:1817:2: iv_rulebreakStmt= rulebreakStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebreakStmt=rulebreakStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebreakStmt.getText(); 
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
    // $ANTLR end "entryRulebreakStmt"


    // $ANTLR start "rulebreakStmt"
    // InternalGo.g:1823:1: rulebreakStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken rulebreakStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:1829:2: ( (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) )
            // InternalGo.g:1830:2: (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            {
            // InternalGo.g:1830:2: (kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            // InternalGo.g:1831:3: kw= 'break' (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            {
            kw=(Token)match(input,75,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBreakStmtAccess().getBreakKeyword_0());
              		
            }
            // InternalGo.g:1836:3: (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENTIFIER) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:1837:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getBreakStmtAccess().getIDENTIFIERTerminalRuleCall_1());
                      			
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
    // $ANTLR end "rulebreakStmt"


    // $ANTLR start "entryRulecontinueStmt"
    // InternalGo.g:1849:1: entryRulecontinueStmt returns [String current=null] : iv_rulecontinueStmt= rulecontinueStmt EOF ;
    public final String entryRulecontinueStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecontinueStmt = null;


        try {
            // InternalGo.g:1849:52: (iv_rulecontinueStmt= rulecontinueStmt EOF )
            // InternalGo.g:1850:2: iv_rulecontinueStmt= rulecontinueStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecontinueStmt=rulecontinueStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecontinueStmt.getText(); 
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
    // $ANTLR end "entryRulecontinueStmt"


    // $ANTLR start "rulecontinueStmt"
    // InternalGo.g:1856:1: rulecontinueStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken rulecontinueStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:1862:2: ( (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? ) )
            // InternalGo.g:1863:2: (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            {
            // InternalGo.g:1863:2: (kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )? )
            // InternalGo.g:1864:3: kw= 'continue' (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            {
            kw=(Token)match(input,76,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getContinueStmtAccess().getContinueKeyword_0());
              		
            }
            // InternalGo.g:1869:3: (this_IDENTIFIER_1= RULE_IDENTIFIER )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_IDENTIFIER) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:1870:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getContinueStmtAccess().getIDENTIFIERTerminalRuleCall_1());
                      			
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
    // $ANTLR end "rulecontinueStmt"


    // $ANTLR start "entryRulegotoStmt"
    // InternalGo.g:1882:1: entryRulegotoStmt returns [String current=null] : iv_rulegotoStmt= rulegotoStmt EOF ;
    public final String entryRulegotoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegotoStmt = null;


        try {
            // InternalGo.g:1882:48: (iv_rulegotoStmt= rulegotoStmt EOF )
            // InternalGo.g:1883:2: iv_rulegotoStmt= rulegotoStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulegotoStmt=rulegotoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulegotoStmt.getText(); 
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
    // $ANTLR end "entryRulegotoStmt"


    // $ANTLR start "rulegotoStmt"
    // InternalGo.g:1889:1: rulegotoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulegotoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:1895:2: ( (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER ) )
            // InternalGo.g:1896:2: (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER )
            {
            // InternalGo.g:1896:2: (kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER )
            // InternalGo.g:1897:3: kw= 'goto' this_IDENTIFIER_1= RULE_IDENTIFIER
            {
            kw=(Token)match(input,77,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getGotoStmtAccess().getGotoKeyword_0());
              		
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_1, grammarAccess.getGotoStmtAccess().getIDENTIFIERTerminalRuleCall_1());
              		
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
    // $ANTLR end "rulegotoStmt"


    // $ANTLR start "entryRulefallthroughStmt"
    // InternalGo.g:1913:1: entryRulefallthroughStmt returns [String current=null] : iv_rulefallthroughStmt= rulefallthroughStmt EOF ;
    public final String entryRulefallthroughStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefallthroughStmt = null;


        try {
            // InternalGo.g:1913:55: (iv_rulefallthroughStmt= rulefallthroughStmt EOF )
            // InternalGo.g:1914:2: iv_rulefallthroughStmt= rulefallthroughStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFallthroughStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefallthroughStmt=rulefallthroughStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefallthroughStmt.getText(); 
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
    // $ANTLR end "entryRulefallthroughStmt"


    // $ANTLR start "rulefallthroughStmt"
    // InternalGo.g:1920:1: rulefallthroughStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fallthrough' ;
    public final AntlrDatatypeRuleToken rulefallthroughStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1926:2: (kw= 'fallthrough' )
            // InternalGo.g:1927:2: kw= 'fallthrough'
            {
            kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFallthroughStmtAccess().getFallthroughKeyword());
              	
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
    // $ANTLR end "rulefallthroughStmt"


    // $ANTLR start "entryRuledeferStmt"
    // InternalGo.g:1935:1: entryRuledeferStmt returns [String current=null] : iv_ruledeferStmt= ruledeferStmt EOF ;
    public final String entryRuledeferStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeferStmt = null;


        try {
            // InternalGo.g:1935:49: (iv_ruledeferStmt= ruledeferStmt EOF )
            // InternalGo.g:1936:2: iv_ruledeferStmt= ruledeferStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeferStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeferStmt=ruledeferStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeferStmt.getText(); 
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
    // $ANTLR end "entryRuledeferStmt"


    // $ANTLR start "ruledeferStmt"
    // InternalGo.g:1942:1: ruledeferStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'defer' this_expression_1= ruleexpression ) ;
    public final AntlrDatatypeRuleToken ruledeferStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1948:2: ( (kw= 'defer' this_expression_1= ruleexpression ) )
            // InternalGo.g:1949:2: (kw= 'defer' this_expression_1= ruleexpression )
            {
            // InternalGo.g:1949:2: (kw= 'defer' this_expression_1= ruleexpression )
            // InternalGo.g:1950:3: kw= 'defer' this_expression_1= ruleexpression
            {
            kw=(Token)match(input,79,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDeferStmtAccess().getDeferKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDeferStmtAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_expression_1=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_1);
              		
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
    // $ANTLR end "ruledeferStmt"


    // $ANTLR start "entryRuleifStmt"
    // InternalGo.g:1969:1: entryRuleifStmt returns [String current=null] : iv_ruleifStmt= ruleifStmt EOF ;
    public final String entryRuleifStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleifStmt = null;


        try {
            // InternalGo.g:1969:46: (iv_ruleifStmt= ruleifStmt EOF )
            // InternalGo.g:1970:2: iv_ruleifStmt= ruleifStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleifStmt=ruleifStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleifStmt.getText(); 
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
    // $ANTLR end "entryRuleifStmt"


    // $ANTLR start "ruleifStmt"
    // InternalGo.g:1976:1: ruleifStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_expression_3= ruleexpression this_block_4= ruleblock (kw= 'else' (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock ) )? ) ;
    public final AntlrDatatypeRuleToken ruleifStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_simpleStmt_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;

        AntlrDatatypeRuleToken this_block_4 = null;

        AntlrDatatypeRuleToken this_ifStmt_6 = null;

        AntlrDatatypeRuleToken this_block_7 = null;



        	enterRule();

        try {
            // InternalGo.g:1982:2: ( (kw= 'if' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_expression_3= ruleexpression this_block_4= ruleblock (kw= 'else' (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock ) )? ) )
            // InternalGo.g:1983:2: (kw= 'if' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_expression_3= ruleexpression this_block_4= ruleblock (kw= 'else' (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock ) )? )
            {
            // InternalGo.g:1983:2: (kw= 'if' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_expression_3= ruleexpression this_block_4= ruleblock (kw= 'else' (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock ) )? )
            // InternalGo.g:1984:3: kw= 'if' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_expression_3= ruleexpression this_block_4= ruleblock (kw= 'else' (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock ) )?
            {
            kw=(Token)match(input,80,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIfStmtAccess().getIfKeyword_0());
              		
            }
            // InternalGo.g:1989:3: (this_simpleStmt_1= rulesimpleStmt kw= ';' )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalGo.g:1990:4: this_simpleStmt_1= rulesimpleStmt kw= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtAccess().getSimpleStmtParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_simpleStmt_1=rulesimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_simpleStmt_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,44,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIfStmtAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_18);
            this_expression_3=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_33);
            this_block_4=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_block_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2026:3: (kw= 'else' (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==81) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:2027:4: kw= 'else' (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock )
                    {
                    kw=(Token)match(input,81,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIfStmtAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalGo.g:2032:4: (this_ifStmt_6= ruleifStmt | this_block_7= ruleblock )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==80) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==56) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGo.g:2033:5: this_ifStmt_6= ruleifStmt
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getIfStmtAccess().getIfStmtParserRuleCall_4_1_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_ifStmt_6=ruleifStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ifStmt_6);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2044:5: this_block_7= ruleblock
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_4_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_block_7=ruleblock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_block_7);
                              				
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
    // $ANTLR end "ruleifStmt"


    // $ANTLR start "entryRuleswitchStmt"
    // InternalGo.g:2060:1: entryRuleswitchStmt returns [String current=null] : iv_ruleswitchStmt= ruleswitchStmt EOF ;
    public final String entryRuleswitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleswitchStmt = null;


        try {
            // InternalGo.g:2060:50: (iv_ruleswitchStmt= ruleswitchStmt EOF )
            // InternalGo.g:2061:2: iv_ruleswitchStmt= ruleswitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleswitchStmt=ruleswitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitchStmt.getText(); 
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
    // $ANTLR end "entryRuleswitchStmt"


    // $ANTLR start "ruleswitchStmt"
    // InternalGo.g:2067:1: ruleswitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_exprSwitchStmt_0= ruleexprSwitchStmt | this_typeSwitchStmt_1= ruletypeSwitchStmt ) ;
    public final AntlrDatatypeRuleToken ruleswitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_exprSwitchStmt_0 = null;

        AntlrDatatypeRuleToken this_typeSwitchStmt_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2073:2: ( (this_exprSwitchStmt_0= ruleexprSwitchStmt | this_typeSwitchStmt_1= ruletypeSwitchStmt ) )
            // InternalGo.g:2074:2: (this_exprSwitchStmt_0= ruleexprSwitchStmt | this_typeSwitchStmt_1= ruletypeSwitchStmt )
            {
            // InternalGo.g:2074:2: (this_exprSwitchStmt_0= ruleexprSwitchStmt | this_typeSwitchStmt_1= ruletypeSwitchStmt )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==82) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred63_InternalGo()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:2075:3: this_exprSwitchStmt_0= ruleexprSwitchStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSwitchStmtAccess().getExprSwitchStmtParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_exprSwitchStmt_0=ruleexprSwitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_exprSwitchStmt_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2086:3: this_typeSwitchStmt_1= ruletypeSwitchStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSwitchStmtAccess().getTypeSwitchStmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeSwitchStmt_1=ruletypeSwitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeSwitchStmt_1);
                      		
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
    // $ANTLR end "ruleswitchStmt"


    // $ANTLR start "entryRuleexprSwitchStmt"
    // InternalGo.g:2100:1: entryRuleexprSwitchStmt returns [String current=null] : iv_ruleexprSwitchStmt= ruleexprSwitchStmt EOF ;
    public final String entryRuleexprSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexprSwitchStmt = null;


        try {
            // InternalGo.g:2100:54: (iv_ruleexprSwitchStmt= ruleexprSwitchStmt EOF )
            // InternalGo.g:2101:2: iv_ruleexprSwitchStmt= ruleexprSwitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexprSwitchStmt=ruleexprSwitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexprSwitchStmt.getText(); 
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
    // $ANTLR end "entryRuleexprSwitchStmt"


    // $ANTLR start "ruleexprSwitchStmt"
    // InternalGo.g:2107:1: ruleexprSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? (this_expression_3= ruleexpression )? kw= '{' (this_exprCaseClause_5= ruleexprCaseClause )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleexprSwitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_simpleStmt_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;

        AntlrDatatypeRuleToken this_exprCaseClause_5 = null;



        	enterRule();

        try {
            // InternalGo.g:2113:2: ( (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? (this_expression_3= ruleexpression )? kw= '{' (this_exprCaseClause_5= ruleexprCaseClause )* kw= '}' ) )
            // InternalGo.g:2114:2: (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? (this_expression_3= ruleexpression )? kw= '{' (this_exprCaseClause_5= ruleexprCaseClause )* kw= '}' )
            {
            // InternalGo.g:2114:2: (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? (this_expression_3= ruleexpression )? kw= '{' (this_exprCaseClause_5= ruleexprCaseClause )* kw= '}' )
            // InternalGo.g:2115:3: kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? (this_expression_3= ruleexpression )? kw= '{' (this_exprCaseClause_5= ruleexprCaseClause )* kw= '}'
            {
            kw=(Token)match(input,82,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExprSwitchStmtAccess().getSwitchKeyword_0());
              		
            }
            // InternalGo.g:2120:3: (this_simpleStmt_1= rulesimpleStmt kw= ';' )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalGo.g:2121:4: this_simpleStmt_1= rulesimpleStmt kw= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSwitchStmtAccess().getSimpleStmtParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_simpleStmt_1=rulesimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_simpleStmt_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,44,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSwitchStmtAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:2137:3: (this_expression_3= ruleexpression )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_IDENTIFIER && LA35_0<=RULE_STRING_LIT)||(LA35_0>=RULE_INT_LIT && LA35_0<=RULE_BINARY_OP)||LA35_0==47||LA35_0==49||LA35_0==54||LA35_0==58||(LA35_0>=61 && LA35_0<=62)||(LA35_0>=64 && LA35_0<=65)||LA35_0==70||LA35_0==89||(LA35_0>=91 && LA35_0<=93)||(LA35_0>=95 && LA35_0<=96)) ) {
                alt35=1;
            }
            else if ( (LA35_0==56) ) {
                int LA35_2 = input.LA(2);

                if ( (synpred65_InternalGo()) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalGo.g:2138:4: this_expression_3= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSwitchStmtAccess().getExpressionParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_expression_3=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,56,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExprSwitchStmtAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGo.g:2154:3: (this_exprCaseClause_5= ruleexprCaseClause )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=83 && LA36_0<=84)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:2155:4: this_exprCaseClause_5= ruleexprCaseClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprSwitchStmtAccess().getExprCaseClauseParserRuleCall_4());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
            	    this_exprCaseClause_5=ruleexprCaseClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_exprCaseClause_5);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExprSwitchStmtAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleexprSwitchStmt"


    // $ANTLR start "entryRuleexprCaseClause"
    // InternalGo.g:2175:1: entryRuleexprCaseClause returns [String current=null] : iv_ruleexprCaseClause= ruleexprCaseClause EOF ;
    public final String entryRuleexprCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexprCaseClause = null;


        try {
            // InternalGo.g:2175:54: (iv_ruleexprCaseClause= ruleexprCaseClause EOF )
            // InternalGo.g:2176:2: iv_ruleexprCaseClause= ruleexprCaseClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprCaseClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexprCaseClause=ruleexprCaseClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexprCaseClause.getText(); 
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
    // $ANTLR end "entryRuleexprCaseClause"


    // $ANTLR start "ruleexprCaseClause"
    // InternalGo.g:2182:1: ruleexprCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_exprSwitchCase_0= ruleexprSwitchCase kw= ':' this_statementList_2= rulestatementList ) ;
    public final AntlrDatatypeRuleToken ruleexprCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_exprSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_statementList_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2188:2: ( (this_exprSwitchCase_0= ruleexprSwitchCase kw= ':' this_statementList_2= rulestatementList ) )
            // InternalGo.g:2189:2: (this_exprSwitchCase_0= ruleexprSwitchCase kw= ':' this_statementList_2= rulestatementList )
            {
            // InternalGo.g:2189:2: (this_exprSwitchCase_0= ruleexprSwitchCase kw= ':' this_statementList_2= rulestatementList )
            // InternalGo.g:2190:3: this_exprSwitchCase_0= ruleexprSwitchCase kw= ':' this_statementList_2= rulestatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprCaseClauseAccess().getExprSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_exprSwitchCase_0=ruleexprSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_exprSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,73,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExprCaseClauseAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprCaseClauseAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_statementList_2=rulestatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_statementList_2);
              		
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
    // $ANTLR end "ruleexprCaseClause"


    // $ANTLR start "entryRuleexprSwitchCase"
    // InternalGo.g:2219:1: entryRuleexprSwitchCase returns [String current=null] : iv_ruleexprSwitchCase= ruleexprSwitchCase EOF ;
    public final String entryRuleexprSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexprSwitchCase = null;


        try {
            // InternalGo.g:2219:54: (iv_ruleexprSwitchCase= ruleexprSwitchCase EOF )
            // InternalGo.g:2220:2: iv_ruleexprSwitchCase= ruleexprSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexprSwitchCase=ruleexprSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexprSwitchCase.getText(); 
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
    // $ANTLR end "entryRuleexprSwitchCase"


    // $ANTLR start "ruleexprSwitchCase"
    // InternalGo.g:2226:1: ruleexprSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' this_expressionList_1= ruleexpressionList ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleexprSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2232:2: ( ( (kw= 'case' this_expressionList_1= ruleexpressionList ) | kw= 'default' ) )
            // InternalGo.g:2233:2: ( (kw= 'case' this_expressionList_1= ruleexpressionList ) | kw= 'default' )
            {
            // InternalGo.g:2233:2: ( (kw= 'case' this_expressionList_1= ruleexpressionList ) | kw= 'default' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==83) ) {
                alt37=1;
            }
            else if ( (LA37_0==84) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGo.g:2234:3: (kw= 'case' this_expressionList_1= ruleexpressionList )
                    {
                    // InternalGo.g:2234:3: (kw= 'case' this_expressionList_1= ruleexpressionList )
                    // InternalGo.g:2235:4: kw= 'case' this_expressionList_1= ruleexpressionList
                    {
                    kw=(Token)match(input,83,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSwitchCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSwitchCaseAccess().getExpressionListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expressionList_1=ruleexpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expressionList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2252:3: kw= 'default'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getExprSwitchCaseAccess().getDefaultKeyword_1());
                      		
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
    // $ANTLR end "ruleexprSwitchCase"


    // $ANTLR start "entryRuletypeSwitchStmt"
    // InternalGo.g:2261:1: entryRuletypeSwitchStmt returns [String current=null] : iv_ruletypeSwitchStmt= ruletypeSwitchStmt EOF ;
    public final String entryRuletypeSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeSwitchStmt = null;


        try {
            // InternalGo.g:2261:54: (iv_ruletypeSwitchStmt= ruletypeSwitchStmt EOF )
            // InternalGo.g:2262:2: iv_ruletypeSwitchStmt= ruletypeSwitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeSwitchStmt=ruletypeSwitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeSwitchStmt.getText(); 
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
    // $ANTLR end "entryRuletypeSwitchStmt"


    // $ANTLR start "ruletypeSwitchStmt"
    // InternalGo.g:2268:1: ruletypeSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_typeSwitchGuard_3= ruletypeSwitchGuard kw= '{' (this_typeCaseClause_5= ruletypeCaseClause )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruletypeSwitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_simpleStmt_1 = null;

        AntlrDatatypeRuleToken this_typeSwitchGuard_3 = null;

        AntlrDatatypeRuleToken this_typeCaseClause_5 = null;



        	enterRule();

        try {
            // InternalGo.g:2274:2: ( (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_typeSwitchGuard_3= ruletypeSwitchGuard kw= '{' (this_typeCaseClause_5= ruletypeCaseClause )* kw= '}' ) )
            // InternalGo.g:2275:2: (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_typeSwitchGuard_3= ruletypeSwitchGuard kw= '{' (this_typeCaseClause_5= ruletypeCaseClause )* kw= '}' )
            {
            // InternalGo.g:2275:2: (kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_typeSwitchGuard_3= ruletypeSwitchGuard kw= '{' (this_typeCaseClause_5= ruletypeCaseClause )* kw= '}' )
            // InternalGo.g:2276:3: kw= 'switch' (this_simpleStmt_1= rulesimpleStmt kw= ';' )? this_typeSwitchGuard_3= ruletypeSwitchGuard kw= '{' (this_typeCaseClause_5= ruletypeCaseClause )* kw= '}'
            {
            kw=(Token)match(input,82,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchStmtAccess().getSwitchKeyword_0());
              		
            }
            // InternalGo.g:2281:3: (this_simpleStmt_1= rulesimpleStmt kw= ';' )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalGo.g:2282:4: this_simpleStmt_1= rulesimpleStmt kw= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeSwitchStmtAccess().getSimpleStmtParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_simpleStmt_1=rulesimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_simpleStmt_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,44,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeSwitchStmtAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeSwitchStmtAccess().getTypeSwitchGuardParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_18);
            this_typeSwitchGuard_3=ruletypeSwitchGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_typeSwitchGuard_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,56,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchStmtAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGo.g:2313:3: (this_typeCaseClause_5= ruletypeCaseClause )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=83 && LA39_0<=84)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:2314:4: this_typeCaseClause_5= ruletypeCaseClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTypeSwitchStmtAccess().getTypeCaseClauseParserRuleCall_4());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
            	    this_typeCaseClause_5=ruletypeCaseClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_typeCaseClause_5);
            	      			
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

            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchStmtAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruletypeSwitchStmt"


    // $ANTLR start "entryRuletypeSwitchGuard"
    // InternalGo.g:2334:1: entryRuletypeSwitchGuard returns [String current=null] : iv_ruletypeSwitchGuard= ruletypeSwitchGuard EOF ;
    public final String entryRuletypeSwitchGuard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeSwitchGuard = null;


        try {
            // InternalGo.g:2334:55: (iv_ruletypeSwitchGuard= ruletypeSwitchGuard EOF )
            // InternalGo.g:2335:2: iv_ruletypeSwitchGuard= ruletypeSwitchGuard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSwitchGuardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeSwitchGuard=ruletypeSwitchGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeSwitchGuard.getText(); 
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
    // $ANTLR end "entryRuletypeSwitchGuard"


    // $ANTLR start "ruletypeSwitchGuard"
    // InternalGo.g:2341:1: ruletypeSwitchGuard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )? this_primaryExpr_2= ruleprimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruletypeSwitchGuard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_primaryExpr_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2347:2: ( ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )? this_primaryExpr_2= ruleprimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' ) )
            // InternalGo.g:2348:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )? this_primaryExpr_2= ruleprimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' )
            {
            // InternalGo.g:2348:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )? this_primaryExpr_2= ruleprimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' )
            // InternalGo.g:2349:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )? this_primaryExpr_2= ruleprimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')'
            {
            // InternalGo.g:2349:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_IDENTIFIER) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==72) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalGo.g:2350:4: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':='
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeSwitchGuardAccess().getIDENTIFIERTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,72,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getColonEqualsSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeSwitchGuardAccess().getPrimaryExprParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_39);
            this_primaryExpr_2=ruleprimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_primaryExpr_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,49,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getFullStopKeyword_2());
              		
            }
            kw=(Token)match(input,47,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getLeftParenthesisKeyword_3());
              		
            }
            kw=(Token)match(input,53,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getTypeKeyword_4());
              		
            }
            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruletypeSwitchGuard"


    // $ANTLR start "entryRuletypeCaseClause"
    // InternalGo.g:2397:1: entryRuletypeCaseClause returns [String current=null] : iv_ruletypeCaseClause= ruletypeCaseClause EOF ;
    public final String entryRuletypeCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeCaseClause = null;


        try {
            // InternalGo.g:2397:54: (iv_ruletypeCaseClause= ruletypeCaseClause EOF )
            // InternalGo.g:2398:2: iv_ruletypeCaseClause= ruletypeCaseClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCaseClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeCaseClause=ruletypeCaseClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeCaseClause.getText(); 
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
    // $ANTLR end "entryRuletypeCaseClause"


    // $ANTLR start "ruletypeCaseClause"
    // InternalGo.g:2404:1: ruletypeCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_typeSwitchCase_0= ruletypeSwitchCase kw= ':' this_statementList_2= rulestatementList ) ;
    public final AntlrDatatypeRuleToken ruletypeCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_statementList_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2410:2: ( (this_typeSwitchCase_0= ruletypeSwitchCase kw= ':' this_statementList_2= rulestatementList ) )
            // InternalGo.g:2411:2: (this_typeSwitchCase_0= ruletypeSwitchCase kw= ':' this_statementList_2= rulestatementList )
            {
            // InternalGo.g:2411:2: (this_typeSwitchCase_0= ruletypeSwitchCase kw= ':' this_statementList_2= rulestatementList )
            // InternalGo.g:2412:3: this_typeSwitchCase_0= ruletypeSwitchCase kw= ':' this_statementList_2= rulestatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeCaseClauseAccess().getTypeSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_typeSwitchCase_0=ruletypeSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_typeSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,73,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeCaseClauseAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeCaseClauseAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_statementList_2=rulestatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_statementList_2);
              		
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
    // $ANTLR end "ruletypeCaseClause"


    // $ANTLR start "entryRuletypeSwitchCase"
    // InternalGo.g:2441:1: entryRuletypeSwitchCase returns [String current=null] : iv_ruletypeSwitchCase= ruletypeSwitchCase EOF ;
    public final String entryRuletypeSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeSwitchCase = null;


        try {
            // InternalGo.g:2441:54: (iv_ruletypeSwitchCase= ruletypeSwitchCase EOF )
            // InternalGo.g:2442:2: iv_ruletypeSwitchCase= ruletypeSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeSwitchCase=ruletypeSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeSwitchCase.getText(); 
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
    // $ANTLR end "entryRuletypeSwitchCase"


    // $ANTLR start "ruletypeSwitchCase"
    // InternalGo.g:2448:1: ruletypeSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' this_typeList_1= ruletypeList ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruletypeSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2454:2: ( ( (kw= 'case' this_typeList_1= ruletypeList ) | kw= 'default' ) )
            // InternalGo.g:2455:2: ( (kw= 'case' this_typeList_1= ruletypeList ) | kw= 'default' )
            {
            // InternalGo.g:2455:2: ( (kw= 'case' this_typeList_1= ruletypeList ) | kw= 'default' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==83) ) {
                alt41=1;
            }
            else if ( (LA41_0==84) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalGo.g:2456:3: (kw= 'case' this_typeList_1= ruletypeList )
                    {
                    // InternalGo.g:2456:3: (kw= 'case' this_typeList_1= ruletypeList )
                    // InternalGo.g:2457:4: kw= 'case' this_typeList_1= ruletypeList
                    {
                    kw=(Token)match(input,83,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeSwitchCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeSwitchCaseAccess().getTypeListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_typeList_1=ruletypeList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2474:3: kw= 'default'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeSwitchCaseAccess().getDefaultKeyword_1());
                      		
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
    // $ANTLR end "ruletypeSwitchCase"


    // $ANTLR start "entryRuletypeList"
    // InternalGo.g:2483:1: entryRuletypeList returns [String current=null] : iv_ruletypeList= ruletypeList EOF ;
    public final String entryRuletypeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeList = null;


        try {
            // InternalGo.g:2483:48: (iv_ruletypeList= ruletypeList EOF )
            // InternalGo.g:2484:2: iv_ruletypeList= ruletypeList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeList=ruletypeList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeList.getText(); 
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
    // $ANTLR end "entryRuletypeList"


    // $ANTLR start "ruletypeList"
    // InternalGo.g:2490:1: ruletypeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_type_0= ruletype (kw= ',' this_type_2= ruletype )* ) ;
    public final AntlrDatatypeRuleToken ruletypeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2496:2: ( (this_type_0= ruletype (kw= ',' this_type_2= ruletype )* ) )
            // InternalGo.g:2497:2: (this_type_0= ruletype (kw= ',' this_type_2= ruletype )* )
            {
            // InternalGo.g:2497:2: (this_type_0= ruletype (kw= ',' this_type_2= ruletype )* )
            // InternalGo.g:2498:3: this_type_0= ruletype (kw= ',' this_type_2= ruletype )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_type_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_type_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2508:3: (kw= ',' this_type_2= ruletype )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==52) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGo.g:2509:4: kw= ',' this_type_2= ruletype
            	    {
            	    kw=(Token)match(input,52,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTypeListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_15);
            	    this_type_2=ruletype();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_type_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruletypeList"


    // $ANTLR start "entryRuleselectStmt"
    // InternalGo.g:2529:1: entryRuleselectStmt returns [String current=null] : iv_ruleselectStmt= ruleselectStmt EOF ;
    public final String entryRuleselectStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleselectStmt = null;


        try {
            // InternalGo.g:2529:50: (iv_ruleselectStmt= ruleselectStmt EOF )
            // InternalGo.g:2530:2: iv_ruleselectStmt= ruleselectStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleselectStmt=ruleselectStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselectStmt.getText(); 
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
    // $ANTLR end "entryRuleselectStmt"


    // $ANTLR start "ruleselectStmt"
    // InternalGo.g:2536:1: ruleselectStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'select' kw= '{' (this_commClause_2= rulecommClause )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleselectStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_commClause_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2542:2: ( (kw= 'select' kw= '{' (this_commClause_2= rulecommClause )* kw= '}' ) )
            // InternalGo.g:2543:2: (kw= 'select' kw= '{' (this_commClause_2= rulecommClause )* kw= '}' )
            {
            // InternalGo.g:2543:2: (kw= 'select' kw= '{' (this_commClause_2= rulecommClause )* kw= '}' )
            // InternalGo.g:2544:3: kw= 'select' kw= '{' (this_commClause_2= rulecommClause )* kw= '}'
            {
            kw=(Token)match(input,85,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getSelectKeyword_0());
              		
            }
            kw=(Token)match(input,56,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:2554:3: (this_commClause_2= rulecommClause )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=83 && LA43_0<=84)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGo.g:2555:4: this_commClause_2= rulecommClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSelectStmtAccess().getCommClauseParserRuleCall_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
            	    this_commClause_2=rulecommClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_commClause_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleselectStmt"


    // $ANTLR start "entryRulecommClause"
    // InternalGo.g:2575:1: entryRulecommClause returns [String current=null] : iv_rulecommClause= rulecommClause EOF ;
    public final String entryRulecommClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecommClause = null;


        try {
            // InternalGo.g:2575:50: (iv_rulecommClause= rulecommClause EOF )
            // InternalGo.g:2576:2: iv_rulecommClause= rulecommClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecommClause=rulecommClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecommClause.getText(); 
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
    // $ANTLR end "entryRulecommClause"


    // $ANTLR start "rulecommClause"
    // InternalGo.g:2582:1: rulecommClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_commCase_0= rulecommCase kw= ':' this_statementList_2= rulestatementList ) ;
    public final AntlrDatatypeRuleToken rulecommClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_commCase_0 = null;

        AntlrDatatypeRuleToken this_statementList_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2588:2: ( (this_commCase_0= rulecommCase kw= ':' this_statementList_2= rulestatementList ) )
            // InternalGo.g:2589:2: (this_commCase_0= rulecommCase kw= ':' this_statementList_2= rulestatementList )
            {
            // InternalGo.g:2589:2: (this_commCase_0= rulecommCase kw= ':' this_statementList_2= rulestatementList )
            // InternalGo.g:2590:3: this_commCase_0= rulecommCase kw= ':' this_statementList_2= rulestatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getCommCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_commCase_0=rulecommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_commCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,73,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getCommClauseAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_statementList_2=rulestatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_statementList_2);
              		
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
    // $ANTLR end "rulecommClause"


    // $ANTLR start "entryRulecommCase"
    // InternalGo.g:2619:1: entryRulecommCase returns [String current=null] : iv_rulecommCase= rulecommCase EOF ;
    public final String entryRulecommCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecommCase = null;


        try {
            // InternalGo.g:2619:48: (iv_rulecommCase= rulecommCase EOF )
            // InternalGo.g:2620:2: iv_rulecommCase= rulecommCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecommCase=rulecommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecommCase.getText(); 
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
    // $ANTLR end "entryRulecommCase"


    // $ANTLR start "rulecommCase"
    // InternalGo.g:2626:1: rulecommCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt ) ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken rulecommCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_sendStmt_1 = null;

        AntlrDatatypeRuleToken this_recvStmt_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2632:2: ( ( (kw= 'case' (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt ) ) | kw= 'default' ) )
            // InternalGo.g:2633:2: ( (kw= 'case' (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt ) ) | kw= 'default' )
            {
            // InternalGo.g:2633:2: ( (kw= 'case' (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt ) ) | kw= 'default' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==83) ) {
                alt45=1;
            }
            else if ( (LA45_0==84) ) {
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
                    // InternalGo.g:2634:3: (kw= 'case' (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt ) )
                    {
                    // InternalGo.g:2634:3: (kw= 'case' (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt ) )
                    // InternalGo.g:2635:4: kw= 'case' (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt )
                    {
                    kw=(Token)match(input,83,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCommCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    // InternalGo.g:2640:4: (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt )
                    int alt44=2;
                    alt44 = dfa44.predict(input);
                    switch (alt44) {
                        case 1 :
                            // InternalGo.g:2641:5: this_sendStmt_1= rulesendStmt
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getCommCaseAccess().getSendStmtParserRuleCall_0_1_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_sendStmt_1=rulesendStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_sendStmt_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2652:5: this_recvStmt_2= rulerecvStmt
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getCommCaseAccess().getRecvStmtParserRuleCall_0_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_recvStmt_2=rulerecvStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_recvStmt_2);
                              				
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
                    // InternalGo.g:2665:3: kw= 'default'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCommCaseAccess().getDefaultKeyword_1());
                      		
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
    // $ANTLR end "rulecommCase"


    // $ANTLR start "entryRulerecvStmt"
    // InternalGo.g:2674:1: entryRulerecvStmt returns [String current=null] : iv_rulerecvStmt= rulerecvStmt EOF ;
    public final String entryRulerecvStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecvStmt = null;


        try {
            // InternalGo.g:2674:48: (iv_rulerecvStmt= rulerecvStmt EOF )
            // InternalGo.g:2675:2: iv_rulerecvStmt= rulerecvStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecvStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerecvStmt=rulerecvStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecvStmt.getText(); 
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
    // $ANTLR end "entryRulerecvStmt"


    // $ANTLR start "rulerecvStmt"
    // InternalGo.g:2681:1: rulerecvStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? this_expression_4= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulerecvStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_0 = null;

        AntlrDatatypeRuleToken this_identifierList_2 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;



        	enterRule();

        try {
            // InternalGo.g:2687:2: ( ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? this_expression_4= ruleexpression ) )
            // InternalGo.g:2688:2: ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? this_expression_4= ruleexpression )
            {
            // InternalGo.g:2688:2: ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? this_expression_4= ruleexpression )
            // InternalGo.g:2689:3: ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? this_expression_4= ruleexpression
            {
            // InternalGo.g:2689:3: ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )?
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalGo.g:2690:4: (this_expressionList_0= ruleexpressionList kw= '=' )
                    {
                    // InternalGo.g:2690:4: (this_expressionList_0= ruleexpressionList kw= '=' )
                    // InternalGo.g:2691:5: this_expressionList_0= ruleexpressionList kw= '='
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecvStmtAccess().getExpressionListParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    this_expressionList_0=ruleexpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expressionList_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,51,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecvStmtAccess().getEqualsSignKeyword_0_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2708:4: (this_identifierList_2= ruleidentifierList kw= ':=' )
                    {
                    // InternalGo.g:2708:4: (this_identifierList_2= ruleidentifierList kw= ':=' )
                    // InternalGo.g:2709:5: this_identifierList_2= ruleidentifierList kw= ':='
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecvStmtAccess().getIdentifierListParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    this_identifierList_2=ruleidentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_identifierList_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,72,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecvStmtAccess().getColonEqualsSignKeyword_0_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRecvStmtAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_expression_4=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_4);
              		
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
    // $ANTLR end "rulerecvStmt"


    // $ANTLR start "entryRuleforStmt"
    // InternalGo.g:2740:1: entryRuleforStmt returns [String current=null] : iv_ruleforStmt= ruleforStmt EOF ;
    public final String entryRuleforStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleforStmt = null;


        try {
            // InternalGo.g:2740:47: (iv_ruleforStmt= ruleforStmt EOF )
            // InternalGo.g:2741:2: iv_ruleforStmt= ruleforStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleforStmt=ruleforStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleforStmt.getText(); 
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
    // $ANTLR end "entryRuleforStmt"


    // $ANTLR start "ruleforStmt"
    // InternalGo.g:2747:1: ruleforStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' (this_expression_1= ruleexpression | this_forClause_2= ruleforClause | this_rangeClause_3= rulerangeClause )? this_block_4= ruleblock ) ;
    public final AntlrDatatypeRuleToken ruleforStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_forClause_2 = null;

        AntlrDatatypeRuleToken this_rangeClause_3 = null;

        AntlrDatatypeRuleToken this_block_4 = null;



        	enterRule();

        try {
            // InternalGo.g:2753:2: ( (kw= 'for' (this_expression_1= ruleexpression | this_forClause_2= ruleforClause | this_rangeClause_3= rulerangeClause )? this_block_4= ruleblock ) )
            // InternalGo.g:2754:2: (kw= 'for' (this_expression_1= ruleexpression | this_forClause_2= ruleforClause | this_rangeClause_3= rulerangeClause )? this_block_4= ruleblock )
            {
            // InternalGo.g:2754:2: (kw= 'for' (this_expression_1= ruleexpression | this_forClause_2= ruleforClause | this_rangeClause_3= rulerangeClause )? this_block_4= ruleblock )
            // InternalGo.g:2755:3: kw= 'for' (this_expression_1= ruleexpression | this_forClause_2= ruleforClause | this_rangeClause_3= rulerangeClause )? this_block_4= ruleblock
            {
            kw=(Token)match(input,86,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForStmtAccess().getForKeyword_0());
              		
            }
            // InternalGo.g:2760:3: (this_expression_1= ruleexpression | this_forClause_2= ruleforClause | this_rangeClause_3= rulerangeClause )?
            int alt47=4;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalGo.g:2761:4: this_expression_1= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtAccess().getExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2772:4: this_forClause_2= ruleforClause
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtAccess().getForClauseParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_forClause_2=ruleforClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_forClause_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2783:4: this_rangeClause_3= rulerangeClause
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtAccess().getRangeClauseParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_rangeClause_3=rulerangeClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_rangeClause_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForStmtAccess().getBlockParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_block_4=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_block_4);
              		
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
    // $ANTLR end "ruleforStmt"


    // $ANTLR start "entryRuleforClause"
    // InternalGo.g:2808:1: entryRuleforClause returns [String current=null] : iv_ruleforClause= ruleforClause EOF ;
    public final String entryRuleforClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleforClause = null;


        try {
            // InternalGo.g:2808:49: (iv_ruleforClause= ruleforClause EOF )
            // InternalGo.g:2809:2: iv_ruleforClause= ruleforClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleforClause=ruleforClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleforClause.getText(); 
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
    // $ANTLR end "entryRuleforClause"


    // $ANTLR start "ruleforClause"
    // InternalGo.g:2815:1: ruleforClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_simpleStmt_0= rulesimpleStmt )? kw= ';' (this_expression_2= ruleexpression )? kw= ';' (this_simpleStmt_4= rulesimpleStmt )? ) ;
    public final AntlrDatatypeRuleToken ruleforClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_simpleStmt_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_simpleStmt_4 = null;



        	enterRule();

        try {
            // InternalGo.g:2821:2: ( ( (this_simpleStmt_0= rulesimpleStmt )? kw= ';' (this_expression_2= ruleexpression )? kw= ';' (this_simpleStmt_4= rulesimpleStmt )? ) )
            // InternalGo.g:2822:2: ( (this_simpleStmt_0= rulesimpleStmt )? kw= ';' (this_expression_2= ruleexpression )? kw= ';' (this_simpleStmt_4= rulesimpleStmt )? )
            {
            // InternalGo.g:2822:2: ( (this_simpleStmt_0= rulesimpleStmt )? kw= ';' (this_expression_2= ruleexpression )? kw= ';' (this_simpleStmt_4= rulesimpleStmt )? )
            // InternalGo.g:2823:3: (this_simpleStmt_0= rulesimpleStmt )? kw= ';' (this_expression_2= ruleexpression )? kw= ';' (this_simpleStmt_4= rulesimpleStmt )?
            {
            // InternalGo.g:2823:3: (this_simpleStmt_0= rulesimpleStmt )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_IDENTIFIER && LA48_0<=RULE_BINARY_OP)||LA48_0==47||LA48_0==49||(LA48_0>=51 && LA48_0<=52)||LA48_0==54||(LA48_0>=58 && LA48_0<=71)||LA48_0==89||(LA48_0>=91 && LA48_0<=93)||(LA48_0>=95 && LA48_0<=96)) ) {
                alt48=1;
            }
            else if ( (LA48_0==44) ) {
                int LA48_2 = input.LA(2);

                if ( (synpred81_InternalGo()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:2824:4: this_simpleStmt_0= rulesimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getSimpleStmtParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_simpleStmt_0=rulesimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_simpleStmt_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,44,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForClauseAccess().getSemicolonKeyword_1());
              		
            }
            // InternalGo.g:2840:3: (this_expression_2= ruleexpression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_IDENTIFIER && LA49_0<=RULE_STRING_LIT)||(LA49_0>=RULE_INT_LIT && LA49_0<=RULE_BINARY_OP)||LA49_0==47||LA49_0==49||LA49_0==54||LA49_0==58||(LA49_0>=61 && LA49_0<=62)||(LA49_0>=64 && LA49_0<=65)||LA49_0==70||LA49_0==89||(LA49_0>=91 && LA49_0<=93)||(LA49_0>=95 && LA49_0<=96)) ) {
                alt49=1;
            }
            else if ( (LA49_0==44) ) {
                int LA49_2 = input.LA(2);

                if ( (synpred82_InternalGo()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:2841:4: this_expression_2= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getExpressionParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_2=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,44,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForClauseAccess().getSemicolonKeyword_3());
              		
            }
            // InternalGo.g:2857:3: (this_simpleStmt_4= rulesimpleStmt )?
            int alt50=2;
            switch ( input.LA(1) ) {
                case RULE_IDENTIFIER:
                case RULE_STRING_LIT:
                case RULE_WS:
                case RULE_INT_LIT:
                case RULE_FLOAT_LIT:
                case RULE_IMAGINARY_LIT:
                case RULE_RUNE_LIT:
                case RULE_BINARY_OP:
                case 47:
                case 49:
                case 51:
                case 52:
                case 54:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 89:
                case 91:
                case 92:
                case 93:
                case 95:
                case 96:
                    {
                    alt50=1;
                    }
                    break;
                case 56:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (synpred83_InternalGo()) ) {
                        alt50=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA50_3 = input.LA(2);

                    if ( (synpred83_InternalGo()) ) {
                        alt50=1;
                    }
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // InternalGo.g:2858:4: this_simpleStmt_4= rulesimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getSimpleStmtParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_simpleStmt_4=rulesimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_simpleStmt_4);
                      			
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
    // $ANTLR end "ruleforClause"


    // $ANTLR start "entryRulerangeClause"
    // InternalGo.g:2873:1: entryRulerangeClause returns [String current=null] : iv_rulerangeClause= rulerangeClause EOF ;
    public final String entryRulerangeClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerangeClause = null;


        try {
            // InternalGo.g:2873:51: (iv_rulerangeClause= rulerangeClause EOF )
            // InternalGo.g:2874:2: iv_rulerangeClause= rulerangeClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerangeClause=rulerangeClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerangeClause.getText(); 
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
    // $ANTLR end "entryRulerangeClause"


    // $ANTLR start "rulerangeClause"
    // InternalGo.g:2880:1: rulerangeClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? kw= 'range' this_expression_5= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulerangeClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_0 = null;

        AntlrDatatypeRuleToken this_identifierList_2 = null;

        AntlrDatatypeRuleToken this_expression_5 = null;



        	enterRule();

        try {
            // InternalGo.g:2886:2: ( ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? kw= 'range' this_expression_5= ruleexpression ) )
            // InternalGo.g:2887:2: ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? kw= 'range' this_expression_5= ruleexpression )
            {
            // InternalGo.g:2887:2: ( ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? kw= 'range' this_expression_5= ruleexpression )
            // InternalGo.g:2888:3: ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )? kw= 'range' this_expression_5= ruleexpression
            {
            // InternalGo.g:2888:3: ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )?
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalGo.g:2889:4: (this_expressionList_0= ruleexpressionList kw= '=' )
                    {
                    // InternalGo.g:2889:4: (this_expressionList_0= ruleexpressionList kw= '=' )
                    // InternalGo.g:2890:5: this_expressionList_0= ruleexpressionList kw= '='
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRangeClauseAccess().getExpressionListParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    this_expressionList_0=ruleexpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expressionList_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,51,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRangeClauseAccess().getEqualsSignKeyword_0_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2907:4: (this_identifierList_2= ruleidentifierList kw= ':=' )
                    {
                    // InternalGo.g:2907:4: (this_identifierList_2= ruleidentifierList kw= ':=' )
                    // InternalGo.g:2908:5: this_identifierList_2= ruleidentifierList kw= ':='
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRangeClauseAccess().getIdentifierListParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    this_identifierList_2=ruleidentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_identifierList_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,72,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRangeClauseAccess().getColonEqualsSignKeyword_0_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            kw=(Token)match(input,87,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRangeClauseAccess().getRangeKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRangeClauseAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_expression_5=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_5);
              		
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
    // $ANTLR end "rulerangeClause"


    // $ANTLR start "entryRulegoStmt"
    // InternalGo.g:2944:1: entryRulegoStmt returns [String current=null] : iv_rulegoStmt= rulegoStmt EOF ;
    public final String entryRulegoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegoStmt = null;


        try {
            // InternalGo.g:2944:46: (iv_rulegoStmt= rulegoStmt EOF )
            // InternalGo.g:2945:2: iv_rulegoStmt= rulegoStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulegoStmt=rulegoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulegoStmt.getText(); 
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
    // $ANTLR end "entryRulegoStmt"


    // $ANTLR start "rulegoStmt"
    // InternalGo.g:2951:1: rulegoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go' this_expression_1= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulegoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2957:2: ( (kw= 'go' this_expression_1= ruleexpression ) )
            // InternalGo.g:2958:2: (kw= 'go' this_expression_1= ruleexpression )
            {
            // InternalGo.g:2958:2: (kw= 'go' this_expression_1= ruleexpression )
            // InternalGo.g:2959:3: kw= 'go' this_expression_1= ruleexpression
            {
            kw=(Token)match(input,88,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getGoStmtAccess().getGoKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGoStmtAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_expression_1=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_1);
              		
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
    // $ANTLR end "rulegoStmt"


    // $ANTLR start "entryRuletype"
    // InternalGo.g:2978:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // InternalGo.g:2978:44: (iv_ruletype= ruletype EOF )
            // InternalGo.g:2979:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype.getText(); 
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
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalGo.g:2985:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_typeName_0= ruletypeName | this_typeLit_1= ruletypeLit | (kw= '(' this_type_3= ruletype kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeName_0 = null;

        AntlrDatatypeRuleToken this_typeLit_1 = null;

        AntlrDatatypeRuleToken this_type_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2991:2: ( (this_typeName_0= ruletypeName | this_typeLit_1= ruletypeLit | (kw= '(' this_type_3= ruletype kw= ')' ) ) )
            // InternalGo.g:2992:2: (this_typeName_0= ruletypeName | this_typeLit_1= ruletypeLit | (kw= '(' this_type_3= ruletype kw= ')' ) )
            {
            // InternalGo.g:2992:2: (this_typeName_0= ruletypeName | this_typeLit_1= ruletypeLit | (kw= '(' this_type_3= ruletype kw= ')' ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt52=1;
                }
                break;
            case 54:
            case 58:
            case 65:
            case 89:
            case 91:
            case 92:
            case 93:
            case 95:
                {
                alt52=2;
                }
                break;
            case 47:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalGo.g:2993:3: this_typeName_0= ruletypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeName_0=ruletypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3004:3: this_typeLit_1= ruletypeLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getTypeLitParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeLit_1=ruletypeLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeLit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3015:3: (kw= '(' this_type_3= ruletype kw= ')' )
                    {
                    // InternalGo.g:3015:3: (kw= '(' this_type_3= ruletype kw= ')' )
                    // InternalGo.g:3016:4: kw= '(' this_type_3= ruletype kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_type_3=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuletypeName"
    // InternalGo.g:3041:1: entryRuletypeName returns [String current=null] : iv_ruletypeName= ruletypeName EOF ;
    public final String entryRuletypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeName = null;


        try {
            // InternalGo.g:3041:48: (iv_ruletypeName= ruletypeName EOF )
            // InternalGo.g:3042:2: iv_ruletypeName= ruletypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeName=ruletypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeName.getText(); 
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
    // $ANTLR end "entryRuletypeName"


    // $ANTLR start "ruletypeName"
    // InternalGo.g:3048:1: ruletypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent ) ;
    public final AntlrDatatypeRuleToken ruletypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_qualifiedIdent_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3054:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent ) )
            // InternalGo.g:3055:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent )
            {
            // InternalGo.g:3055:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_IDENTIFIER) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==49) ) {
                    int LA53_2 = input.LA(3);

                    if ( (LA53_2==RULE_IDENTIFIER) ) {
                        int LA53_4 = input.LA(4);

                        if ( (synpred88_InternalGo()) ) {
                            alt53=1;
                        }
                        else if ( (true) ) {
                            alt53=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA53_1==EOF||LA53_1==RULE_STRING_LIT||LA53_1==44||(LA53_1>=47 && LA53_1<=48)||(LA53_1>=51 && LA53_1<=52)||LA53_1==56||LA53_1==73||LA53_1==90||LA53_1==94) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalGo.g:3056:3: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeNameAccess().getIDENTIFIERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3064:3: this_qualifiedIdent_1= rulequalifiedIdent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeNameAccess().getQualifiedIdentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_qualifiedIdent_1=rulequalifiedIdent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_qualifiedIdent_1);
                      		
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
    // $ANTLR end "ruletypeName"


    // $ANTLR start "entryRuletypeLit"
    // InternalGo.g:3078:1: entryRuletypeLit returns [String current=null] : iv_ruletypeLit= ruletypeLit EOF ;
    public final String entryRuletypeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeLit = null;


        try {
            // InternalGo.g:3078:47: (iv_ruletypeLit= ruletypeLit EOF )
            // InternalGo.g:3079:2: iv_ruletypeLit= ruletypeLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeLit=ruletypeLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeLit.getText(); 
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
    // $ANTLR end "entryRuletypeLit"


    // $ANTLR start "ruletypeLit"
    // InternalGo.g:3085:1: ruletypeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_arrayType_0= rulearrayType | this_structType_1= rulestructType | this_pointerType_2= rulepointerType | this_functionType_3= rulefunctionType | this_interfaceType_4= ruleinterfaceType | this_sliceType_5= rulesliceType | this_mapType_6= rulemapType | this_channelType_7= rulechannelType ) ;
    public final AntlrDatatypeRuleToken ruletypeLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_arrayType_0 = null;

        AntlrDatatypeRuleToken this_structType_1 = null;

        AntlrDatatypeRuleToken this_pointerType_2 = null;

        AntlrDatatypeRuleToken this_functionType_3 = null;

        AntlrDatatypeRuleToken this_interfaceType_4 = null;

        AntlrDatatypeRuleToken this_sliceType_5 = null;

        AntlrDatatypeRuleToken this_mapType_6 = null;

        AntlrDatatypeRuleToken this_channelType_7 = null;



        	enterRule();

        try {
            // InternalGo.g:3091:2: ( (this_arrayType_0= rulearrayType | this_structType_1= rulestructType | this_pointerType_2= rulepointerType | this_functionType_3= rulefunctionType | this_interfaceType_4= ruleinterfaceType | this_sliceType_5= rulesliceType | this_mapType_6= rulemapType | this_channelType_7= rulechannelType ) )
            // InternalGo.g:3092:2: (this_arrayType_0= rulearrayType | this_structType_1= rulestructType | this_pointerType_2= rulepointerType | this_functionType_3= rulefunctionType | this_interfaceType_4= ruleinterfaceType | this_sliceType_5= rulesliceType | this_mapType_6= rulemapType | this_channelType_7= rulechannelType )
            {
            // InternalGo.g:3092:2: (this_arrayType_0= rulearrayType | this_structType_1= rulestructType | this_pointerType_2= rulepointerType | this_functionType_3= rulefunctionType | this_interfaceType_4= ruleinterfaceType | this_sliceType_5= rulesliceType | this_mapType_6= rulemapType | this_channelType_7= rulechannelType )
            int alt54=8;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalGo.g:3093:3: this_arrayType_0= rulearrayType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getArrayTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_arrayType_0=rulearrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_arrayType_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3104:3: this_structType_1= rulestructType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getStructTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_structType_1=rulestructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_structType_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3115:3: this_pointerType_2= rulepointerType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getPointerTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_pointerType_2=rulepointerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_pointerType_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3126:3: this_functionType_3= rulefunctionType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getFunctionTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_functionType_3=rulefunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_functionType_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3137:3: this_interfaceType_4= ruleinterfaceType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getInterfaceTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_interfaceType_4=ruleinterfaceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_interfaceType_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:3148:3: this_sliceType_5= rulesliceType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getSliceTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_sliceType_5=rulesliceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_sliceType_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:3159:3: this_mapType_6= rulemapType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getMapTypeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_mapType_6=rulemapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_mapType_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:3170:3: this_channelType_7= rulechannelType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getChannelTypeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_channelType_7=rulechannelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_channelType_7);
                      		
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
    // $ANTLR end "ruletypeLit"


    // $ANTLR start "entryRulearrayType"
    // InternalGo.g:3184:1: entryRulearrayType returns [String current=null] : iv_rulearrayType= rulearrayType EOF ;
    public final String entryRulearrayType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearrayType = null;


        try {
            // InternalGo.g:3184:49: (iv_rulearrayType= rulearrayType EOF )
            // InternalGo.g:3185:2: iv_rulearrayType= rulearrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearrayType=rulearrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearrayType.getText(); 
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
    // $ANTLR end "entryRulearrayType"


    // $ANTLR start "rulearrayType"
    // InternalGo.g:3191:1: rulearrayType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_arrayLength_1= rulearrayLength kw= ']' this_elementType_3= ruleelementType ) ;
    public final AntlrDatatypeRuleToken rulearrayType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_arrayLength_1 = null;

        AntlrDatatypeRuleToken this_elementType_3 = null;



        	enterRule();

        try {
            // InternalGo.g:3197:2: ( (kw= '[' this_arrayLength_1= rulearrayLength kw= ']' this_elementType_3= ruleelementType ) )
            // InternalGo.g:3198:2: (kw= '[' this_arrayLength_1= rulearrayLength kw= ']' this_elementType_3= ruleelementType )
            {
            // InternalGo.g:3198:2: (kw= '[' this_arrayLength_1= rulearrayLength kw= ']' this_elementType_3= ruleelementType )
            // InternalGo.g:3199:3: kw= '[' this_arrayLength_1= rulearrayLength kw= ']' this_elementType_3= ruleelementType
            {
            kw=(Token)match(input,89,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayTypeAccess().getArrayLengthParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_46);
            this_arrayLength_1=rulearrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_arrayLength_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,90,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayTypeAccess().getElementTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_elementType_3=ruleelementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_elementType_3);
              		
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
    // $ANTLR end "rulearrayType"


    // $ANTLR start "entryRulearrayLength"
    // InternalGo.g:3233:1: entryRulearrayLength returns [String current=null] : iv_rulearrayLength= rulearrayLength EOF ;
    public final String entryRulearrayLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearrayLength = null;


        try {
            // InternalGo.g:3233:51: (iv_rulearrayLength= rulearrayLength EOF )
            // InternalGo.g:3234:2: iv_rulearrayLength= rulearrayLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearrayLength=rulearrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearrayLength.getText(); 
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
    // $ANTLR end "entryRulearrayLength"


    // $ANTLR start "rulearrayLength"
    // InternalGo.g:3240:1: rulearrayLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_expression_0= ruleexpression ;
    public final AntlrDatatypeRuleToken rulearrayLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_expression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3246:2: (this_expression_0= ruleexpression )
            // InternalGo.g:3247:2: this_expression_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArrayLengthAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_0);
              	
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
    // $ANTLR end "rulearrayLength"


    // $ANTLR start "entryRuleelementType"
    // InternalGo.g:3260:1: entryRuleelementType returns [String current=null] : iv_ruleelementType= ruleelementType EOF ;
    public final String entryRuleelementType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelementType = null;


        try {
            // InternalGo.g:3260:51: (iv_ruleelementType= ruleelementType EOF )
            // InternalGo.g:3261:2: iv_ruleelementType= ruleelementType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleelementType=ruleelementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleelementType.getText(); 
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
    // $ANTLR end "entryRuleelementType"


    // $ANTLR start "ruleelementType"
    // InternalGo.g:3267:1: ruleelementType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_type_0= ruletype ;
    public final AntlrDatatypeRuleToken ruleelementType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_type_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3273:2: (this_type_0= ruletype )
            // InternalGo.g:3274:2: this_type_0= ruletype
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getElementTypeAccess().getTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_type_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_type_0);
              	
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
    // $ANTLR end "ruleelementType"


    // $ANTLR start "entryRulepointerType"
    // InternalGo.g:3287:1: entryRulepointerType returns [String current=null] : iv_rulepointerType= rulepointerType EOF ;
    public final String entryRulepointerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepointerType = null;


        try {
            // InternalGo.g:3287:51: (iv_rulepointerType= rulepointerType EOF )
            // InternalGo.g:3288:2: iv_rulepointerType= rulepointerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepointerType=rulepointerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepointerType.getText(); 
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
    // $ANTLR end "entryRulepointerType"


    // $ANTLR start "rulepointerType"
    // InternalGo.g:3294:1: rulepointerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_type_1= ruletype ) ;
    public final AntlrDatatypeRuleToken rulepointerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3300:2: ( (kw= '*' this_type_1= ruletype ) )
            // InternalGo.g:3301:2: (kw= '*' this_type_1= ruletype )
            {
            // InternalGo.g:3301:2: (kw= '*' this_type_1= ruletype )
            // InternalGo.g:3302:3: kw= '*' this_type_1= ruletype
            {
            kw=(Token)match(input,65,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPointerTypeAccess().getAsteriskKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPointerTypeAccess().getTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_type_1=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_type_1);
              		
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
    // $ANTLR end "rulepointerType"


    // $ANTLR start "entryRuleinterfaceType"
    // InternalGo.g:3321:1: entryRuleinterfaceType returns [String current=null] : iv_ruleinterfaceType= ruleinterfaceType EOF ;
    public final String entryRuleinterfaceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinterfaceType = null;


        try {
            // InternalGo.g:3321:53: (iv_ruleinterfaceType= ruleinterfaceType EOF )
            // InternalGo.g:3322:2: iv_ruleinterfaceType= ruleinterfaceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinterfaceType=ruleinterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterfaceType.getText(); 
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
    // $ANTLR end "entryRuleinterfaceType"


    // $ANTLR start "ruleinterfaceType"
    // InternalGo.g:3328:1: ruleinterfaceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'interface' kw= '{' (this_methodSpec_2= rulemethodSpec kw= ';' )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleinterfaceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_methodSpec_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3334:2: ( (kw= 'interface' kw= '{' (this_methodSpec_2= rulemethodSpec kw= ';' )* kw= '}' ) )
            // InternalGo.g:3335:2: (kw= 'interface' kw= '{' (this_methodSpec_2= rulemethodSpec kw= ';' )* kw= '}' )
            {
            // InternalGo.g:3335:2: (kw= 'interface' kw= '{' (this_methodSpec_2= rulemethodSpec kw= ';' )* kw= '}' )
            // InternalGo.g:3336:3: kw= 'interface' kw= '{' (this_methodSpec_2= rulemethodSpec kw= ';' )* kw= '}'
            {
            kw=(Token)match(input,91,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getInterfaceKeyword_0());
              		
            }
            kw=(Token)match(input,56,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:3346:3: (this_methodSpec_2= rulemethodSpec kw= ';' )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_IDENTIFIER) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalGo.g:3347:4: this_methodSpec_2= rulemethodSpec kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInterfaceTypeAccess().getMethodSpecParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    this_methodSpec_2=rulemethodSpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_methodSpec_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,44,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleinterfaceType"


    // $ANTLR start "entryRulesliceType"
    // InternalGo.g:3372:1: entryRulesliceType returns [String current=null] : iv_rulesliceType= rulesliceType EOF ;
    public final String entryRulesliceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesliceType = null;


        try {
            // InternalGo.g:3372:49: (iv_rulesliceType= rulesliceType EOF )
            // InternalGo.g:3373:2: iv_rulesliceType= rulesliceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSliceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesliceType=rulesliceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesliceType.getText(); 
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
    // $ANTLR end "entryRulesliceType"


    // $ANTLR start "rulesliceType"
    // InternalGo.g:3379:1: rulesliceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' this_elementType_2= ruleelementType ) ;
    public final AntlrDatatypeRuleToken rulesliceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_elementType_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3385:2: ( (kw= '[' kw= ']' this_elementType_2= ruleelementType ) )
            // InternalGo.g:3386:2: (kw= '[' kw= ']' this_elementType_2= ruleelementType )
            {
            // InternalGo.g:3386:2: (kw= '[' kw= ']' this_elementType_2= ruleelementType )
            // InternalGo.g:3387:3: kw= '[' kw= ']' this_elementType_2= ruleelementType
            {
            kw=(Token)match(input,89,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSliceTypeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,90,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSliceTypeAccess().getRightSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSliceTypeAccess().getElementTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_elementType_2=ruleelementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_elementType_2);
              		
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
    // $ANTLR end "rulesliceType"


    // $ANTLR start "entryRulemapType"
    // InternalGo.g:3411:1: entryRulemapType returns [String current=null] : iv_rulemapType= rulemapType EOF ;
    public final String entryRulemapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemapType = null;


        try {
            // InternalGo.g:3411:47: (iv_rulemapType= rulemapType EOF )
            // InternalGo.g:3412:2: iv_rulemapType= rulemapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemapType=rulemapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemapType.getText(); 
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
    // $ANTLR end "entryRulemapType"


    // $ANTLR start "rulemapType"
    // InternalGo.g:3418:1: rulemapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'map' kw= '[' this_type_2= ruletype kw= ']' this_elementType_4= ruleelementType ) ;
    public final AntlrDatatypeRuleToken rulemapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_elementType_4 = null;



        	enterRule();

        try {
            // InternalGo.g:3424:2: ( (kw= 'map' kw= '[' this_type_2= ruletype kw= ']' this_elementType_4= ruleelementType ) )
            // InternalGo.g:3425:2: (kw= 'map' kw= '[' this_type_2= ruletype kw= ']' this_elementType_4= ruleelementType )
            {
            // InternalGo.g:3425:2: (kw= 'map' kw= '[' this_type_2= ruletype kw= ']' this_elementType_4= ruleelementType )
            // InternalGo.g:3426:3: kw= 'map' kw= '[' this_type_2= ruletype kw= ']' this_elementType_4= ruleelementType
            {
            kw=(Token)match(input,92,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getMapKeyword_0());
              		
            }
            kw=(Token)match(input,89,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapTypeAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_46);
            this_type_2=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_type_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,90,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getRightSquareBracketKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapTypeAccess().getElementTypeParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            this_elementType_4=ruleelementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_elementType_4);
              		
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
    // $ANTLR end "rulemapType"


    // $ANTLR start "entryRulechannelType"
    // InternalGo.g:3465:1: entryRulechannelType returns [String current=null] : iv_rulechannelType= rulechannelType EOF ;
    public final String entryRulechannelType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulechannelType = null;


        try {
            // InternalGo.g:3465:51: (iv_rulechannelType= rulechannelType EOF )
            // InternalGo.g:3466:2: iv_rulechannelType= rulechannelType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulechannelType=rulechannelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulechannelType.getText(); 
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
    // $ANTLR end "entryRulechannelType"


    // $ANTLR start "rulechannelType"
    // InternalGo.g:3472:1: rulechannelType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'chan' | (kw= 'chan' kw= '<-' ) | (kw= '<-' kw= 'chan' ) ) this_elementType_5= ruleelementType ) ;
    public final AntlrDatatypeRuleToken rulechannelType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_elementType_5 = null;



        	enterRule();

        try {
            // InternalGo.g:3478:2: ( ( (kw= 'chan' | (kw= 'chan' kw= '<-' ) | (kw= '<-' kw= 'chan' ) ) this_elementType_5= ruleelementType ) )
            // InternalGo.g:3479:2: ( (kw= 'chan' | (kw= 'chan' kw= '<-' ) | (kw= '<-' kw= 'chan' ) ) this_elementType_5= ruleelementType )
            {
            // InternalGo.g:3479:2: ( (kw= 'chan' | (kw= 'chan' kw= '<-' ) | (kw= '<-' kw= 'chan' ) ) this_elementType_5= ruleelementType )
            // InternalGo.g:3480:3: (kw= 'chan' | (kw= 'chan' kw= '<-' ) | (kw= '<-' kw= 'chan' ) ) this_elementType_5= ruleelementType
            {
            // InternalGo.g:3480:3: (kw= 'chan' | (kw= 'chan' kw= '<-' ) | (kw= '<-' kw= 'chan' ) )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==93) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred97_InternalGo()) ) {
                    alt56=1;
                }
                else if ( (synpred98_InternalGo()) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA56_0==58) ) {
                alt56=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalGo.g:3481:4: kw= 'chan'
                    {
                    kw=(Token)match(input,93,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getChannelTypeAccess().getChanKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3487:4: (kw= 'chan' kw= '<-' )
                    {
                    // InternalGo.g:3487:4: (kw= 'chan' kw= '<-' )
                    // InternalGo.g:3488:5: kw= 'chan' kw= '<-'
                    {
                    kw=(Token)match(input,93,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getChanKeyword_0_1_0());
                      				
                    }
                    kw=(Token)match(input,58,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:3500:4: (kw= '<-' kw= 'chan' )
                    {
                    // InternalGo.g:3500:4: (kw= '<-' kw= 'chan' )
                    // InternalGo.g:3501:5: kw= '<-' kw= 'chan'
                    {
                    kw=(Token)match(input,58,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_2_0());
                      				
                    }
                    kw=(Token)match(input,93,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getChanKeyword_0_2_1());
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChannelTypeAccess().getElementTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_elementType_5=ruleelementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_elementType_5);
              		
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
    // $ANTLR end "rulechannelType"


    // $ANTLR start "entryRulemethodSpec"
    // InternalGo.g:3527:1: entryRulemethodSpec returns [String current=null] : iv_rulemethodSpec= rulemethodSpec EOF ;
    public final String entryRulemethodSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemethodSpec = null;


        try {
            // InternalGo.g:3527:50: (iv_rulemethodSpec= rulemethodSpec EOF )
            // InternalGo.g:3528:2: iv_rulemethodSpec= rulemethodSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemethodSpec=rulemethodSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemethodSpec.getText(); 
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
    // $ANTLR end "entryRulemethodSpec"


    // $ANTLR start "rulemethodSpec"
    // InternalGo.g:3534:1: rulemethodSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_signature_1= rulesignature ) | this_typeName_2= ruletypeName ) ;
    public final AntlrDatatypeRuleToken rulemethodSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_signature_1 = null;

        AntlrDatatypeRuleToken this_typeName_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3540:2: ( ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_signature_1= rulesignature ) | this_typeName_2= ruletypeName ) )
            // InternalGo.g:3541:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_signature_1= rulesignature ) | this_typeName_2= ruletypeName )
            {
            // InternalGo.g:3541:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_signature_1= rulesignature ) | this_typeName_2= ruletypeName )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_IDENTIFIER) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==47) ) {
                    alt57=1;
                }
                else if ( (LA57_1==EOF||LA57_1==44||LA57_1==49) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalGo.g:3542:3: (this_IDENTIFIER_0= RULE_IDENTIFIER this_signature_1= rulesignature )
                    {
                    // InternalGo.g:3542:3: (this_IDENTIFIER_0= RULE_IDENTIFIER this_signature_1= rulesignature )
                    // InternalGo.g:3543:4: this_IDENTIFIER_0= RULE_IDENTIFIER this_signature_1= rulesignature
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_0, grammarAccess.getMethodSpecAccess().getIDENTIFIERTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodSpecAccess().getSignatureParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_signature_1=rulesignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_signature_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3562:3: this_typeName_2= ruletypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethodSpecAccess().getTypeNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeName_2=ruletypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeName_2);
                      		
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
    // $ANTLR end "rulemethodSpec"


    // $ANTLR start "entryRulefunctionType"
    // InternalGo.g:3576:1: entryRulefunctionType returns [String current=null] : iv_rulefunctionType= rulefunctionType EOF ;
    public final String entryRulefunctionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunctionType = null;


        try {
            // InternalGo.g:3576:52: (iv_rulefunctionType= rulefunctionType EOF )
            // InternalGo.g:3577:2: iv_rulefunctionType= rulefunctionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunctionType=rulefunctionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunctionType.getText(); 
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
    // $ANTLR end "entryRulefunctionType"


    // $ANTLR start "rulefunctionType"
    // InternalGo.g:3583:1: rulefunctionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_signature_1= rulesignature ) ;
    public final AntlrDatatypeRuleToken rulefunctionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_signature_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3589:2: ( (kw= 'func' this_signature_1= rulesignature ) )
            // InternalGo.g:3590:2: (kw= 'func' this_signature_1= rulesignature )
            {
            // InternalGo.g:3590:2: (kw= 'func' this_signature_1= rulesignature )
            // InternalGo.g:3591:3: kw= 'func' this_signature_1= rulesignature
            {
            kw=(Token)match(input,54,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionTypeAccess().getSignatureParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_signature_1=rulesignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_signature_1);
              		
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
    // $ANTLR end "rulefunctionType"


    // $ANTLR start "entryRulesignature"
    // InternalGo.g:3610:1: entryRulesignature returns [String current=null] : iv_rulesignature= rulesignature EOF ;
    public final String entryRulesignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignature = null;


        try {
            // InternalGo.g:3610:49: (iv_rulesignature= rulesignature EOF )
            // InternalGo.g:3611:2: iv_rulesignature= rulesignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesignature=rulesignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignature.getText(); 
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
    // $ANTLR end "entryRulesignature"


    // $ANTLR start "rulesignature"
    // InternalGo.g:3617:1: rulesignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_parameters_0= ruleparameters (this_result_1= ruleresult )? ) ;
    public final AntlrDatatypeRuleToken rulesignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_parameters_0 = null;

        AntlrDatatypeRuleToken this_result_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3623:2: ( (this_parameters_0= ruleparameters (this_result_1= ruleresult )? ) )
            // InternalGo.g:3624:2: (this_parameters_0= ruleparameters (this_result_1= ruleresult )? )
            {
            // InternalGo.g:3624:2: (this_parameters_0= ruleparameters (this_result_1= ruleresult )? )
            // InternalGo.g:3625:3: this_parameters_0= ruleparameters (this_result_1= ruleresult )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_parameters_0=ruleparameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_parameters_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:3635:3: (this_result_1= ruleresult )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalGo.g:3636:4: this_result_1= ruleresult
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignatureAccess().getResultParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_result_1=ruleresult();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_result_1);
                      			
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
    // $ANTLR end "rulesignature"


    // $ANTLR start "entryRuleresult"
    // InternalGo.g:3651:1: entryRuleresult returns [String current=null] : iv_ruleresult= ruleresult EOF ;
    public final String entryRuleresult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleresult = null;


        try {
            // InternalGo.g:3651:46: (iv_ruleresult= ruleresult EOF )
            // InternalGo.g:3652:2: iv_ruleresult= ruleresult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleresult=ruleresult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleresult.getText(); 
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
    // $ANTLR end "entryRuleresult"


    // $ANTLR start "ruleresult"
    // InternalGo.g:3658:1: ruleresult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_parameters_0= ruleparameters | this_type_1= ruletype ) ;
    public final AntlrDatatypeRuleToken ruleresult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_parameters_0 = null;

        AntlrDatatypeRuleToken this_type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3664:2: ( (this_parameters_0= ruleparameters | this_type_1= ruletype ) )
            // InternalGo.g:3665:2: (this_parameters_0= ruleparameters | this_type_1= ruletype )
            {
            // InternalGo.g:3665:2: (this_parameters_0= ruleparameters | this_type_1= ruletype )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalGo.g:3666:3: this_parameters_0= ruleparameters
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getParametersParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_parameters_0=ruleparameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_parameters_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3677:3: this_type_1= ruletype
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_type_1=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_type_1);
                      		
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
    // $ANTLR end "ruleresult"


    // $ANTLR start "entryRuleparameters"
    // InternalGo.g:3691:1: entryRuleparameters returns [String current=null] : iv_ruleparameters= ruleparameters EOF ;
    public final String entryRuleparameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameters = null;


        try {
            // InternalGo.g:3691:50: (iv_ruleparameters= ruleparameters EOF )
            // InternalGo.g:3692:2: iv_ruleparameters= ruleparameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameters=ruleparameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameters.getText(); 
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
    // $ANTLR end "entryRuleparameters"


    // $ANTLR start "ruleparameters"
    // InternalGo.g:3698:1: ruleparameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_parameterList_1= ruleparameterList (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleparameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_parameterList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3704:2: ( (kw= '(' (this_parameterList_1= ruleparameterList (kw= ',' )? )? kw= ')' ) )
            // InternalGo.g:3705:2: (kw= '(' (this_parameterList_1= ruleparameterList (kw= ',' )? )? kw= ')' )
            {
            // InternalGo.g:3705:2: (kw= '(' (this_parameterList_1= ruleparameterList (kw= ',' )? )? kw= ')' )
            // InternalGo.g:3706:3: kw= '(' (this_parameterList_1= ruleparameterList (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,47,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGo.g:3711:3: (this_parameterList_1= ruleparameterList (kw= ',' )? )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_IDENTIFIER||LA61_0==47||LA61_0==54||LA61_0==58||LA61_0==65||LA61_0==89||(LA61_0>=91 && LA61_0<=95)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalGo.g:3712:4: this_parameterList_1= ruleparameterList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getParameterListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_52);
                    this_parameterList_1=ruleparameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_parameterList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:3722:4: (kw= ',' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==52) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalGo.g:3723:5: kw= ','
                            {
                            kw=(Token)match(input,52,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getParametersAccess().getCommaKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleparameters"


    // $ANTLR start "entryRuleparameterList"
    // InternalGo.g:3739:1: entryRuleparameterList returns [String current=null] : iv_ruleparameterList= ruleparameterList EOF ;
    public final String entryRuleparameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameterList = null;


        try {
            // InternalGo.g:3739:53: (iv_ruleparameterList= ruleparameterList EOF )
            // InternalGo.g:3740:2: iv_ruleparameterList= ruleparameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameterList=ruleparameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameterList.getText(); 
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
    // $ANTLR end "entryRuleparameterList"


    // $ANTLR start "ruleparameterList"
    // InternalGo.g:3746:1: ruleparameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_parameterDecl_0= ruleparameterDecl (kw= ',' this_parameterDecl_2= ruleparameterDecl )* ) ;
    public final AntlrDatatypeRuleToken ruleparameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_parameterDecl_0 = null;

        AntlrDatatypeRuleToken this_parameterDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3752:2: ( (this_parameterDecl_0= ruleparameterDecl (kw= ',' this_parameterDecl_2= ruleparameterDecl )* ) )
            // InternalGo.g:3753:2: (this_parameterDecl_0= ruleparameterDecl (kw= ',' this_parameterDecl_2= ruleparameterDecl )* )
            {
            // InternalGo.g:3753:2: (this_parameterDecl_0= ruleparameterDecl (kw= ',' this_parameterDecl_2= ruleparameterDecl )* )
            // InternalGo.g:3754:3: this_parameterDecl_0= ruleparameterDecl (kw= ',' this_parameterDecl_2= ruleparameterDecl )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_parameterDecl_0=ruleparameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_parameterDecl_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:3764:3: (kw= ',' this_parameterDecl_2= ruleparameterDecl )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==52) ) {
                    int LA62_1 = input.LA(2);

                    if ( (LA62_1==RULE_IDENTIFIER||LA62_1==47||LA62_1==54||LA62_1==58||LA62_1==65||LA62_1==89||(LA62_1>=91 && LA62_1<=95)) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // InternalGo.g:3765:4: kw= ',' this_parameterDecl_2= ruleparameterDecl
            	    {
            	    kw=(Token)match(input,52,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_15);
            	    this_parameterDecl_2=ruleparameterDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_parameterDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleparameterList"


    // $ANTLR start "entryRuleparameterDecl"
    // InternalGo.g:3785:1: entryRuleparameterDecl returns [String current=null] : iv_ruleparameterDecl= ruleparameterDecl EOF ;
    public final String entryRuleparameterDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameterDecl = null;


        try {
            // InternalGo.g:3785:53: (iv_ruleparameterDecl= ruleparameterDecl EOF )
            // InternalGo.g:3786:2: iv_ruleparameterDecl= ruleparameterDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameterDecl=ruleparameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameterDecl.getText(); 
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
    // $ANTLR end "entryRuleparameterDecl"


    // $ANTLR start "ruleparameterDecl"
    // InternalGo.g:3792:1: ruleparameterDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_identifierList_0= ruleidentifierList )? (kw= '...' )? this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruleparameterDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifierList_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3798:2: ( ( (this_identifierList_0= ruleidentifierList )? (kw= '...' )? this_type_2= ruletype ) )
            // InternalGo.g:3799:2: ( (this_identifierList_0= ruleidentifierList )? (kw= '...' )? this_type_2= ruletype )
            {
            // InternalGo.g:3799:2: ( (this_identifierList_0= ruleidentifierList )? (kw= '...' )? this_type_2= ruletype )
            // InternalGo.g:3800:3: (this_identifierList_0= ruleidentifierList )? (kw= '...' )? this_type_2= ruletype
            {
            // InternalGo.g:3800:3: (this_identifierList_0= ruleidentifierList )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_IDENTIFIER) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==52) ) {
                    int LA63_3 = input.LA(3);

                    if ( (LA63_3==RULE_IDENTIFIER) ) {
                        int LA63_5 = input.LA(4);

                        if ( (synpred105_InternalGo()) ) {
                            alt63=1;
                        }
                    }
                }
                else if ( (LA63_1==RULE_IDENTIFIER||LA63_1==47||LA63_1==54||LA63_1==58||LA63_1==65||LA63_1==89||(LA63_1>=91 && LA63_1<=95)) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalGo.g:3801:4: this_identifierList_0= ruleidentifierList
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdentifierListParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    this_identifierList_0=ruleidentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_identifierList_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:3812:3: (kw= '...' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==94) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalGo.g:3813:4: kw= '...'
                    {
                    kw=(Token)match(input,94,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_type_2=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_type_2);
              		
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
    // $ANTLR end "ruleparameterDecl"


    // $ANTLR start "entryRuleoperand"
    // InternalGo.g:3833:1: entryRuleoperand returns [String current=null] : iv_ruleoperand= ruleoperand EOF ;
    public final String entryRuleoperand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperand = null;


        try {
            // InternalGo.g:3833:47: (iv_ruleoperand= ruleoperand EOF )
            // InternalGo.g:3834:2: iv_ruleoperand= ruleoperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleoperand=ruleoperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoperand.getText(); 
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
    // $ANTLR end "entryRuleoperand"


    // $ANTLR start "ruleoperand"
    // InternalGo.g:3840:1: ruleoperand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_literal_0= ruleliteral | this_operandName_1= ruleoperandName | this_methodExpr_2= rulemethodExpr | (kw= '(' this_expression_4= ruleexpression kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleoperand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_literal_0 = null;

        AntlrDatatypeRuleToken this_operandName_1 = null;

        AntlrDatatypeRuleToken this_methodExpr_2 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;



        	enterRule();

        try {
            // InternalGo.g:3846:2: ( (this_literal_0= ruleliteral | this_operandName_1= ruleoperandName | this_methodExpr_2= rulemethodExpr | (kw= '(' this_expression_4= ruleexpression kw= ')' ) ) )
            // InternalGo.g:3847:2: (this_literal_0= ruleliteral | this_operandName_1= ruleoperandName | this_methodExpr_2= rulemethodExpr | (kw= '(' this_expression_4= ruleexpression kw= ')' ) )
            {
            // InternalGo.g:3847:2: (this_literal_0= ruleliteral | this_operandName_1= ruleoperandName | this_methodExpr_2= rulemethodExpr | (kw= '(' this_expression_4= ruleexpression kw= ')' ) )
            int alt65=4;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalGo.g:3848:3: this_literal_0= ruleliteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_literal_0=ruleliteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_literal_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3859:3: this_operandName_1= ruleoperandName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getOperandNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_operandName_1=ruleoperandName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_operandName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3870:3: this_methodExpr_2= rulemethodExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getMethodExprParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_methodExpr_2=rulemethodExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_methodExpr_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3881:3: (kw= '(' this_expression_4= ruleexpression kw= ')' )
                    {
                    // InternalGo.g:3881:3: (kw= '(' this_expression_4= ruleexpression kw= ')' )
                    // InternalGo.g:3882:4: kw= '(' this_expression_4= ruleexpression kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_expression_4=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOperandAccess().getRightParenthesisKeyword_3_2());
                      			
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
    // $ANTLR end "ruleoperand"


    // $ANTLR start "entryRuleliteral"
    // InternalGo.g:3907:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // InternalGo.g:3907:47: (iv_ruleliteral= ruleliteral EOF )
            // InternalGo.g:3908:2: iv_ruleliteral= ruleliteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleliteral=ruleliteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral.getText(); 
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
    // $ANTLR end "entryRuleliteral"


    // $ANTLR start "ruleliteral"
    // InternalGo.g:3914:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_basicLit_0= rulebasicLit | this_compositeLit_1= rulecompositeLit | this_functionLit_2= rulefunctionLit ) ;
    public final AntlrDatatypeRuleToken ruleliteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_basicLit_0 = null;

        AntlrDatatypeRuleToken this_compositeLit_1 = null;

        AntlrDatatypeRuleToken this_functionLit_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3920:2: ( (this_basicLit_0= rulebasicLit | this_compositeLit_1= rulecompositeLit | this_functionLit_2= rulefunctionLit ) )
            // InternalGo.g:3921:2: (this_basicLit_0= rulebasicLit | this_compositeLit_1= rulecompositeLit | this_functionLit_2= rulefunctionLit )
            {
            // InternalGo.g:3921:2: (this_basicLit_0= rulebasicLit | this_compositeLit_1= rulecompositeLit | this_functionLit_2= rulefunctionLit )
            int alt66=3;
            switch ( input.LA(1) ) {
            case RULE_STRING_LIT:
            case RULE_INT_LIT:
            case RULE_FLOAT_LIT:
            case RULE_IMAGINARY_LIT:
            case RULE_RUNE_LIT:
                {
                alt66=1;
                }
                break;
            case RULE_IDENTIFIER:
            case 89:
            case 92:
            case 95:
                {
                alt66=2;
                }
                break;
            case 54:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalGo.g:3922:3: this_basicLit_0= rulebasicLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBasicLitParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_basicLit_0=rulebasicLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_basicLit_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3933:3: this_compositeLit_1= rulecompositeLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getCompositeLitParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_compositeLit_1=rulecompositeLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_compositeLit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3944:3: this_functionLit_2= rulefunctionLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getFunctionLitParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_functionLit_2=rulefunctionLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_functionLit_2);
                      		
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
    // $ANTLR end "ruleliteral"


    // $ANTLR start "entryRulebasicLit"
    // InternalGo.g:3958:1: entryRulebasicLit returns [String current=null] : iv_rulebasicLit= rulebasicLit EOF ;
    public final String entryRulebasicLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebasicLit = null;


        try {
            // InternalGo.g:3958:48: (iv_rulebasicLit= rulebasicLit EOF )
            // InternalGo.g:3959:2: iv_rulebasicLit= rulebasicLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebasicLit=rulebasicLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebasicLit.getText(); 
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
    // $ANTLR end "entryRulebasicLit"


    // $ANTLR start "rulebasicLit"
    // InternalGo.g:3965:1: rulebasicLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= RULE_FLOAT_LIT | this_IMAGINARY_LIT_2= RULE_IMAGINARY_LIT | this_RUNE_LIT_3= RULE_RUNE_LIT | this_STRING_LIT_4= RULE_STRING_LIT ) ;
    public final AntlrDatatypeRuleToken rulebasicLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_LIT_0=null;
        Token this_FLOAT_LIT_1=null;
        Token this_IMAGINARY_LIT_2=null;
        Token this_RUNE_LIT_3=null;
        Token this_STRING_LIT_4=null;


        	enterRule();

        try {
            // InternalGo.g:3971:2: ( (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= RULE_FLOAT_LIT | this_IMAGINARY_LIT_2= RULE_IMAGINARY_LIT | this_RUNE_LIT_3= RULE_RUNE_LIT | this_STRING_LIT_4= RULE_STRING_LIT ) )
            // InternalGo.g:3972:2: (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= RULE_FLOAT_LIT | this_IMAGINARY_LIT_2= RULE_IMAGINARY_LIT | this_RUNE_LIT_3= RULE_RUNE_LIT | this_STRING_LIT_4= RULE_STRING_LIT )
            {
            // InternalGo.g:3972:2: (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= RULE_FLOAT_LIT | this_IMAGINARY_LIT_2= RULE_IMAGINARY_LIT | this_RUNE_LIT_3= RULE_RUNE_LIT | this_STRING_LIT_4= RULE_STRING_LIT )
            int alt67=5;
            switch ( input.LA(1) ) {
            case RULE_INT_LIT:
                {
                alt67=1;
                }
                break;
            case RULE_FLOAT_LIT:
                {
                alt67=2;
                }
                break;
            case RULE_IMAGINARY_LIT:
                {
                alt67=3;
                }
                break;
            case RULE_RUNE_LIT:
                {
                alt67=4;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt67=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalGo.g:3973:3: this_INT_LIT_0= RULE_INT_LIT
                    {
                    this_INT_LIT_0=(Token)match(input,RULE_INT_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_LIT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_LIT_0, grammarAccess.getBasicLitAccess().getINT_LITTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3981:3: this_FLOAT_LIT_1= RULE_FLOAT_LIT
                    {
                    this_FLOAT_LIT_1=(Token)match(input,RULE_FLOAT_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FLOAT_LIT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_FLOAT_LIT_1, grammarAccess.getBasicLitAccess().getFLOAT_LITTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3989:3: this_IMAGINARY_LIT_2= RULE_IMAGINARY_LIT
                    {
                    this_IMAGINARY_LIT_2=(Token)match(input,RULE_IMAGINARY_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IMAGINARY_LIT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IMAGINARY_LIT_2, grammarAccess.getBasicLitAccess().getIMAGINARY_LITTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3997:3: this_RUNE_LIT_3= RULE_RUNE_LIT
                    {
                    this_RUNE_LIT_3=(Token)match(input,RULE_RUNE_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RUNE_LIT_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_RUNE_LIT_3, grammarAccess.getBasicLitAccess().getRUNE_LITTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:4005:3: this_STRING_LIT_4= RULE_STRING_LIT
                    {
                    this_STRING_LIT_4=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_LIT_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_LIT_4, grammarAccess.getBasicLitAccess().getSTRING_LITTerminalRuleCall_4());
                      		
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
    // $ANTLR end "rulebasicLit"


    // $ANTLR start "entryRuleoperandName"
    // InternalGo.g:4016:1: entryRuleoperandName returns [String current=null] : iv_ruleoperandName= ruleoperandName EOF ;
    public final String entryRuleoperandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperandName = null;


        try {
            // InternalGo.g:4016:51: (iv_ruleoperandName= ruleoperandName EOF )
            // InternalGo.g:4017:2: iv_ruleoperandName= ruleoperandName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleoperandName=ruleoperandName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoperandName.getText(); 
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
    // $ANTLR end "entryRuleoperandName"


    // $ANTLR start "ruleoperandName"
    // InternalGo.g:4023:1: ruleoperandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent ) ;
    public final AntlrDatatypeRuleToken ruleoperandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_qualifiedIdent_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4029:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent ) )
            // InternalGo.g:4030:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent )
            {
            // InternalGo.g:4030:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_qualifiedIdent_1= rulequalifiedIdent )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_IDENTIFIER) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==EOF||LA68_1==RULE_BINARY_OP||LA68_1==44||LA68_1==48||(LA68_1>=51 && LA68_1<=52)||(LA68_1>=56 && LA68_1<=71)||LA68_1==73||LA68_1==90||LA68_1==94) ) {
                    alt68=1;
                }
                else if ( (LA68_1==49) ) {
                    int LA68_3 = input.LA(3);

                    if ( (LA68_3==RULE_IDENTIFIER) ) {
                        alt68=2;
                    }
                    else if ( (LA68_3==47) ) {
                        alt68=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalGo.g:4031:3: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENTIFIER_0, grammarAccess.getOperandNameAccess().getIDENTIFIERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4039:3: this_qualifiedIdent_1= rulequalifiedIdent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandNameAccess().getQualifiedIdentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_qualifiedIdent_1=rulequalifiedIdent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_qualifiedIdent_1);
                      		
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
    // $ANTLR end "ruleoperandName"


    // $ANTLR start "entryRulequalifiedIdent"
    // InternalGo.g:4053:1: entryRulequalifiedIdent returns [String current=null] : iv_rulequalifiedIdent= rulequalifiedIdent EOF ;
    public final String entryRulequalifiedIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulequalifiedIdent = null;


        try {
            // InternalGo.g:4053:54: (iv_rulequalifiedIdent= rulequalifiedIdent EOF )
            // InternalGo.g:4054:2: iv_rulequalifiedIdent= rulequalifiedIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulequalifiedIdent=rulequalifiedIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulequalifiedIdent.getText(); 
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
    // $ANTLR end "entryRulequalifiedIdent"


    // $ANTLR start "rulequalifiedIdent"
    // InternalGo.g:4060:1: rulequalifiedIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulequalifiedIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalGo.g:4066:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) )
            // InternalGo.g:4067:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            {
            // InternalGo.g:4067:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            // InternalGo.g:4068:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getQualifiedIdentAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,49,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedIdentAccess().getFullStopKeyword_1());
              		
            }
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_2, grammarAccess.getQualifiedIdentAccess().getIDENTIFIERTerminalRuleCall_2());
              		
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
    // $ANTLR end "rulequalifiedIdent"


    // $ANTLR start "entryRulecompositeLit"
    // InternalGo.g:4091:1: entryRulecompositeLit returns [String current=null] : iv_rulecompositeLit= rulecompositeLit EOF ;
    public final String entryRulecompositeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompositeLit = null;


        try {
            // InternalGo.g:4091:52: (iv_rulecompositeLit= rulecompositeLit EOF )
            // InternalGo.g:4092:2: iv_rulecompositeLit= rulecompositeLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecompositeLit=rulecompositeLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompositeLit.getText(); 
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
    // $ANTLR end "entryRulecompositeLit"


    // $ANTLR start "rulecompositeLit"
    // InternalGo.g:4098:1: rulecompositeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_literalType_0= ruleliteralType this_literalValue_1= ruleliteralValue ) ;
    public final AntlrDatatypeRuleToken rulecompositeLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_literalType_0 = null;

        AntlrDatatypeRuleToken this_literalValue_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4104:2: ( (this_literalType_0= ruleliteralType this_literalValue_1= ruleliteralValue ) )
            // InternalGo.g:4105:2: (this_literalType_0= ruleliteralType this_literalValue_1= ruleliteralValue )
            {
            // InternalGo.g:4105:2: (this_literalType_0= ruleliteralType this_literalValue_1= ruleliteralValue )
            // InternalGo.g:4106:3: this_literalType_0= ruleliteralType this_literalValue_1= ruleliteralValue
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompositeLitAccess().getLiteralTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_literalType_0=ruleliteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_literalType_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompositeLitAccess().getLiteralValueParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_literalValue_1=ruleliteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_literalValue_1);
              		
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
    // $ANTLR end "rulecompositeLit"


    // $ANTLR start "entryRuleliteralType"
    // InternalGo.g:4130:1: entryRuleliteralType returns [String current=null] : iv_ruleliteralType= ruleliteralType EOF ;
    public final String entryRuleliteralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteralType = null;


        try {
            // InternalGo.g:4130:51: (iv_ruleliteralType= ruleliteralType EOF )
            // InternalGo.g:4131:2: iv_ruleliteralType= ruleliteralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleliteralType=ruleliteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteralType.getText(); 
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
    // $ANTLR end "entryRuleliteralType"


    // $ANTLR start "ruleliteralType"
    // InternalGo.g:4137:1: ruleliteralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_structType_0= rulestructType | this_arrayType_1= rulearrayType | (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType ) | this_sliceType_6= rulesliceType | this_mapType_7= rulemapType | this_typeName_8= ruletypeName ) ;
    public final AntlrDatatypeRuleToken ruleliteralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_structType_0 = null;

        AntlrDatatypeRuleToken this_arrayType_1 = null;

        AntlrDatatypeRuleToken this_elementType_5 = null;

        AntlrDatatypeRuleToken this_sliceType_6 = null;

        AntlrDatatypeRuleToken this_mapType_7 = null;

        AntlrDatatypeRuleToken this_typeName_8 = null;



        	enterRule();

        try {
            // InternalGo.g:4143:2: ( (this_structType_0= rulestructType | this_arrayType_1= rulearrayType | (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType ) | this_sliceType_6= rulesliceType | this_mapType_7= rulemapType | this_typeName_8= ruletypeName ) )
            // InternalGo.g:4144:2: (this_structType_0= rulestructType | this_arrayType_1= rulearrayType | (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType ) | this_sliceType_6= rulesliceType | this_mapType_7= rulemapType | this_typeName_8= ruletypeName )
            {
            // InternalGo.g:4144:2: (this_structType_0= rulestructType | this_arrayType_1= rulearrayType | (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType ) | this_sliceType_6= rulesliceType | this_mapType_7= rulemapType | this_typeName_8= ruletypeName )
            int alt69=6;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt69=1;
                }
                break;
            case 89:
                {
                int LA69_2 = input.LA(2);

                if ( (synpred118_InternalGo()) ) {
                    alt69=2;
                }
                else if ( (synpred119_InternalGo()) ) {
                    alt69=3;
                }
                else if ( (synpred120_InternalGo()) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;
                }
                }
                break;
            case 92:
                {
                alt69=5;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt69=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalGo.g:4145:3: this_structType_0= rulestructType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getStructTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_structType_0=rulestructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_structType_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4156:3: this_arrayType_1= rulearrayType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getArrayTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_arrayType_1=rulearrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_arrayType_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:4167:3: (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType )
                    {
                    // InternalGo.g:4167:3: (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType )
                    // InternalGo.g:4168:4: kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType
                    {
                    kw=(Token)match(input,89,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    kw=(Token)match(input,94,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeAccess().getFullStopFullStopFullStopKeyword_2_1());
                      			
                    }
                    kw=(Token)match(input,90,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeAccess().getRightSquareBracketKeyword_2_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralTypeAccess().getElementTypeParserRuleCall_2_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_elementType_5=ruleelementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_elementType_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:4195:3: this_sliceType_6= rulesliceType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getSliceTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_sliceType_6=rulesliceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_sliceType_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:4206:3: this_mapType_7= rulemapType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getMapTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_mapType_7=rulemapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_mapType_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:4217:3: this_typeName_8= ruletypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getTypeNameParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeName_8=ruletypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeName_8);
                      		
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
    // $ANTLR end "ruleliteralType"


    // $ANTLR start "entryRuleliteralValue"
    // InternalGo.g:4231:1: entryRuleliteralValue returns [String current=null] : iv_ruleliteralValue= ruleliteralValue EOF ;
    public final String entryRuleliteralValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteralValue = null;


        try {
            // InternalGo.g:4231:52: (iv_ruleliteralValue= ruleliteralValue EOF )
            // InternalGo.g:4232:2: iv_ruleliteralValue= ruleliteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleliteralValue=ruleliteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteralValue.getText(); 
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
    // $ANTLR end "entryRuleliteralValue"


    // $ANTLR start "ruleliteralValue"
    // InternalGo.g:4238:1: ruleliteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_elementList_1= ruleelementList (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleliteralValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_elementList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4244:2: ( (kw= '{' (this_elementList_1= ruleelementList (kw= ',' )? )? kw= '}' ) )
            // InternalGo.g:4245:2: (kw= '{' (this_elementList_1= ruleelementList (kw= ',' )? )? kw= '}' )
            {
            // InternalGo.g:4245:2: (kw= '{' (this_elementList_1= ruleelementList (kw= ',' )? )? kw= '}' )
            // InternalGo.g:4246:3: kw= '{' (this_elementList_1= ruleelementList (kw= ',' )? )? kw= '}'
            {
            kw=(Token)match(input,56,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGo.g:4251:3: (this_elementList_1= ruleelementList (kw= ',' )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_IDENTIFIER && LA71_0<=RULE_STRING_LIT)||(LA71_0>=RULE_INT_LIT && LA71_0<=RULE_BINARY_OP)||LA71_0==47||LA71_0==49||LA71_0==52||LA71_0==54||LA71_0==56||LA71_0==58||(LA71_0>=61 && LA71_0<=62)||(LA71_0>=64 && LA71_0<=65)||LA71_0==70||LA71_0==73||LA71_0==89||(LA71_0>=91 && LA71_0<=93)||(LA71_0>=95 && LA71_0<=96)) ) {
                alt71=1;
            }
            else if ( (LA71_0==57) ) {
                int LA71_2 = input.LA(2);

                if ( (synpred123_InternalGo()) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // InternalGo.g:4252:4: this_elementList_1= ruleelementList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralValueAccess().getElementListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_elementList_1=ruleelementList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_elementList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:4262:4: (kw= ',' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==52) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalGo.g:4263:5: kw= ','
                            {
                            kw=(Token)match(input,52,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getLiteralValueAccess().getCommaKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getRightCurlyBracketKeyword_2());
              		
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
    // $ANTLR end "ruleliteralValue"


    // $ANTLR start "entryRuleelementList"
    // InternalGo.g:4279:1: entryRuleelementList returns [String current=null] : iv_ruleelementList= ruleelementList EOF ;
    public final String entryRuleelementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelementList = null;


        try {
            // InternalGo.g:4279:51: (iv_ruleelementList= ruleelementList EOF )
            // InternalGo.g:4280:2: iv_ruleelementList= ruleelementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleelementList=ruleelementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleelementList.getText(); 
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
    // $ANTLR end "entryRuleelementList"


    // $ANTLR start "ruleelementList"
    // InternalGo.g:4286:1: ruleelementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_keyedElement_0= rulekeyedElement (kw= ',' this_keyedElement_2= rulekeyedElement )* ) ;
    public final AntlrDatatypeRuleToken ruleelementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_keyedElement_0 = null;

        AntlrDatatypeRuleToken this_keyedElement_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4292:2: ( (this_keyedElement_0= rulekeyedElement (kw= ',' this_keyedElement_2= rulekeyedElement )* ) )
            // InternalGo.g:4293:2: (this_keyedElement_0= rulekeyedElement (kw= ',' this_keyedElement_2= rulekeyedElement )* )
            {
            // InternalGo.g:4293:2: (this_keyedElement_0= rulekeyedElement (kw= ',' this_keyedElement_2= rulekeyedElement )* )
            // InternalGo.g:4294:3: this_keyedElement_0= rulekeyedElement (kw= ',' this_keyedElement_2= rulekeyedElement )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_keyedElement_0=rulekeyedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_keyedElement_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:4304:3: (kw= ',' this_keyedElement_2= rulekeyedElement )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==52) ) {
                    int LA72_1 = input.LA(2);

                    if ( (synpred124_InternalGo()) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // InternalGo.g:4305:4: kw= ',' this_keyedElement_2= rulekeyedElement
            	    {
            	    kw=(Token)match(input,52,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_15);
            	    this_keyedElement_2=rulekeyedElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_keyedElement_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // $ANTLR end "ruleelementList"


    // $ANTLR start "entryRulekeyedElement"
    // InternalGo.g:4325:1: entryRulekeyedElement returns [String current=null] : iv_rulekeyedElement= rulekeyedElement EOF ;
    public final String entryRulekeyedElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulekeyedElement = null;


        try {
            // InternalGo.g:4325:52: (iv_rulekeyedElement= rulekeyedElement EOF )
            // InternalGo.g:4326:2: iv_rulekeyedElement= rulekeyedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyedElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulekeyedElement=rulekeyedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulekeyedElement.getText(); 
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
    // $ANTLR end "entryRulekeyedElement"


    // $ANTLR start "rulekeyedElement"
    // InternalGo.g:4332:1: rulekeyedElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_key_0= rulekey kw= ':' )? this_element_2= ruleelement ) ;
    public final AntlrDatatypeRuleToken rulekeyedElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_key_0 = null;

        AntlrDatatypeRuleToken this_element_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4338:2: ( ( (this_key_0= rulekey kw= ':' )? this_element_2= ruleelement ) )
            // InternalGo.g:4339:2: ( (this_key_0= rulekey kw= ':' )? this_element_2= ruleelement )
            {
            // InternalGo.g:4339:2: ( (this_key_0= rulekey kw= ':' )? this_element_2= ruleelement )
            // InternalGo.g:4340:3: (this_key_0= rulekey kw= ':' )? this_element_2= ruleelement
            {
            // InternalGo.g:4340:3: (this_key_0= rulekey kw= ':' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalGo.g:4341:4: this_key_0= rulekey kw= ':'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getKeyedElementAccess().getKeyParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_key_0=rulekey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_key_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,73,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getKeyedElementAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getKeyedElementAccess().getElementParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_element_2=ruleelement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_element_2);
              		
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
    // $ANTLR end "rulekeyedElement"


    // $ANTLR start "entryRulekey"
    // InternalGo.g:4371:1: entryRulekey returns [String current=null] : iv_rulekey= rulekey EOF ;
    public final String entryRulekey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulekey = null;


        try {
            // InternalGo.g:4371:43: (iv_rulekey= rulekey EOF )
            // InternalGo.g:4372:2: iv_rulekey= rulekey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulekey=rulekey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulekey.getText(); 
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
    // $ANTLR end "entryRulekey"


    // $ANTLR start "rulekey"
    // InternalGo.g:4378:1: rulekey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_expression_1= ruleexpression | this_literalValue_2= ruleliteralValue ) ;
    public final AntlrDatatypeRuleToken rulekey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_literalValue_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4384:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_expression_1= ruleexpression | this_literalValue_2= ruleliteralValue ) )
            // InternalGo.g:4385:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_expression_1= ruleexpression | this_literalValue_2= ruleliteralValue )
            {
            // InternalGo.g:4385:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_expression_1= ruleexpression | this_literalValue_2= ruleliteralValue )
            int alt74=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                int LA74_1 = input.LA(2);

                if ( (synpred126_InternalGo()) ) {
                    alt74=1;
                }
                else if ( (synpred127_InternalGo()) ) {
                    alt74=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case RULE_STRING_LIT:
            case RULE_INT_LIT:
            case RULE_FLOAT_LIT:
            case RULE_IMAGINARY_LIT:
            case RULE_RUNE_LIT:
            case RULE_BINARY_OP:
            case 47:
            case 49:
            case 54:
            case 58:
            case 61:
            case 62:
            case 64:
            case 65:
            case 70:
            case 73:
            case 89:
            case 91:
            case 92:
            case 93:
            case 95:
            case 96:
                {
                alt74=2;
                }
                break;
            case 56:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalGo.g:4386:3: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENTIFIER_0, grammarAccess.getKeyAccess().getIDENTIFIERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4394:3: this_expression_1= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_expression_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:4405:3: this_literalValue_2= ruleliteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getLiteralValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_literalValue_2=ruleliteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_literalValue_2);
                      		
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
    // $ANTLR end "rulekey"


    // $ANTLR start "entryRuleelement"
    // InternalGo.g:4419:1: entryRuleelement returns [String current=null] : iv_ruleelement= ruleelement EOF ;
    public final String entryRuleelement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelement = null;


        try {
            // InternalGo.g:4419:47: (iv_ruleelement= ruleelement EOF )
            // InternalGo.g:4420:2: iv_ruleelement= ruleelement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleelement=ruleelement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleelement.getText(); 
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
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // InternalGo.g:4426:1: ruleelement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression | this_literalValue_1= ruleliteralValue ) ;
    public final AntlrDatatypeRuleToken ruleelement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_literalValue_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4432:2: ( (this_expression_0= ruleexpression | this_literalValue_1= ruleliteralValue ) )
            // InternalGo.g:4433:2: (this_expression_0= ruleexpression | this_literalValue_1= ruleliteralValue )
            {
            // InternalGo.g:4433:2: (this_expression_0= ruleexpression | this_literalValue_1= ruleliteralValue )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==EOF||(LA75_0>=RULE_IDENTIFIER && LA75_0<=RULE_STRING_LIT)||(LA75_0>=RULE_INT_LIT && LA75_0<=RULE_BINARY_OP)||LA75_0==47||LA75_0==49||LA75_0==52||LA75_0==54||(LA75_0>=57 && LA75_0<=58)||(LA75_0>=61 && LA75_0<=62)||(LA75_0>=64 && LA75_0<=65)||LA75_0==70||LA75_0==89||(LA75_0>=91 && LA75_0<=93)||(LA75_0>=95 && LA75_0<=96)) ) {
                alt75=1;
            }
            else if ( (LA75_0==56) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalGo.g:4434:3: this_expression_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4445:3: this_literalValue_1= ruleliteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getLiteralValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_literalValue_1=ruleliteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_literalValue_1);
                      		
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
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRulestructType"
    // InternalGo.g:4459:1: entryRulestructType returns [String current=null] : iv_rulestructType= rulestructType EOF ;
    public final String entryRulestructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructType = null;


        try {
            // InternalGo.g:4459:50: (iv_rulestructType= rulestructType EOF )
            // InternalGo.g:4460:2: iv_rulestructType= rulestructType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestructType=rulestructType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructType.getText(); 
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
    // $ANTLR end "entryRulestructType"


    // $ANTLR start "rulestructType"
    // InternalGo.g:4466:1: rulestructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' kw= '{' (this_fieldDecl_2= rulefieldDecl kw= ';' )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulestructType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_fieldDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4472:2: ( (kw= 'struct' kw= '{' (this_fieldDecl_2= rulefieldDecl kw= ';' )* kw= '}' ) )
            // InternalGo.g:4473:2: (kw= 'struct' kw= '{' (this_fieldDecl_2= rulefieldDecl kw= ';' )* kw= '}' )
            {
            // InternalGo.g:4473:2: (kw= 'struct' kw= '{' (this_fieldDecl_2= rulefieldDecl kw= ';' )* kw= '}' )
            // InternalGo.g:4474:3: kw= 'struct' kw= '{' (this_fieldDecl_2= rulefieldDecl kw= ';' )* kw= '}'
            {
            kw=(Token)match(input,95,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getStructKeyword_0());
              		
            }
            kw=(Token)match(input,56,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:4484:3: (this_fieldDecl_2= rulefieldDecl kw= ';' )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_IDENTIFIER||LA76_0==65) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalGo.g:4485:4: this_fieldDecl_2= rulefieldDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStructTypeAccess().getFieldDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    this_fieldDecl_2=rulefieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_fieldDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,44,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getStructTypeAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "rulestructType"


    // $ANTLR start "entryRulefieldDecl"
    // InternalGo.g:4510:1: entryRulefieldDecl returns [String current=null] : iv_rulefieldDecl= rulefieldDecl EOF ;
    public final String entryRulefieldDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefieldDecl = null;


        try {
            // InternalGo.g:4510:49: (iv_rulefieldDecl= rulefieldDecl EOF )
            // InternalGo.g:4511:2: iv_rulefieldDecl= rulefieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefieldDecl=rulefieldDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefieldDecl.getText(); 
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
    // $ANTLR end "entryRulefieldDecl"


    // $ANTLR start "rulefieldDecl"
    // InternalGo.g:4517:1: rulefieldDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_identifierList_0= ruleidentifierList this_type_1= ruletype ) | this_anonymousField_2= ruleanonymousField ) (this_STRING_LIT_3= RULE_STRING_LIT )? ) ;
    public final AntlrDatatypeRuleToken rulefieldDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_3=null;
        AntlrDatatypeRuleToken this_identifierList_0 = null;

        AntlrDatatypeRuleToken this_type_1 = null;

        AntlrDatatypeRuleToken this_anonymousField_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4523:2: ( ( ( (this_identifierList_0= ruleidentifierList this_type_1= ruletype ) | this_anonymousField_2= ruleanonymousField ) (this_STRING_LIT_3= RULE_STRING_LIT )? ) )
            // InternalGo.g:4524:2: ( ( (this_identifierList_0= ruleidentifierList this_type_1= ruletype ) | this_anonymousField_2= ruleanonymousField ) (this_STRING_LIT_3= RULE_STRING_LIT )? )
            {
            // InternalGo.g:4524:2: ( ( (this_identifierList_0= ruleidentifierList this_type_1= ruletype ) | this_anonymousField_2= ruleanonymousField ) (this_STRING_LIT_3= RULE_STRING_LIT )? )
            // InternalGo.g:4525:3: ( (this_identifierList_0= ruleidentifierList this_type_1= ruletype ) | this_anonymousField_2= ruleanonymousField ) (this_STRING_LIT_3= RULE_STRING_LIT )?
            {
            // InternalGo.g:4525:3: ( (this_identifierList_0= ruleidentifierList this_type_1= ruletype ) | this_anonymousField_2= ruleanonymousField )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_IDENTIFIER) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==EOF||LA77_1==RULE_STRING_LIT||LA77_1==44||LA77_1==49) ) {
                    alt77=2;
                }
                else if ( (LA77_1==RULE_IDENTIFIER||LA77_1==47||LA77_1==52||LA77_1==54||LA77_1==58||LA77_1==65||LA77_1==89||(LA77_1>=91 && LA77_1<=93)||LA77_1==95) ) {
                    alt77=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA77_0==65) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalGo.g:4526:4: (this_identifierList_0= ruleidentifierList this_type_1= ruletype )
                    {
                    // InternalGo.g:4526:4: (this_identifierList_0= ruleidentifierList this_type_1= ruletype )
                    // InternalGo.g:4527:5: this_identifierList_0= ruleidentifierList this_type_1= ruletype
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getIdentifierListParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    this_identifierList_0=ruleidentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_identifierList_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_58);
                    this_type_1=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_type_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:4549:4: this_anonymousField_2= ruleanonymousField
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFieldDeclAccess().getAnonymousFieldParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_58);
                    this_anonymousField_2=ruleanonymousField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_anonymousField_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:4560:3: (this_STRING_LIT_3= RULE_STRING_LIT )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_STRING_LIT) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalGo.g:4561:4: this_STRING_LIT_3= RULE_STRING_LIT
                    {
                    this_STRING_LIT_3=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_STRING_LIT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_LIT_3, grammarAccess.getFieldDeclAccess().getSTRING_LITTerminalRuleCall_1());
                      			
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
    // $ANTLR end "rulefieldDecl"


    // $ANTLR start "entryRuleanonymousField"
    // InternalGo.g:4573:1: entryRuleanonymousField returns [String current=null] : iv_ruleanonymousField= ruleanonymousField EOF ;
    public final String entryRuleanonymousField() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleanonymousField = null;


        try {
            // InternalGo.g:4573:54: (iv_ruleanonymousField= ruleanonymousField EOF )
            // InternalGo.g:4574:2: iv_ruleanonymousField= ruleanonymousField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnonymousFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleanonymousField=ruleanonymousField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleanonymousField.getText(); 
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
    // $ANTLR end "entryRuleanonymousField"


    // $ANTLR start "ruleanonymousField"
    // InternalGo.g:4580:1: ruleanonymousField returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' )? this_typeName_1= ruletypeName ) ;
    public final AntlrDatatypeRuleToken ruleanonymousField() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeName_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4586:2: ( ( (kw= '*' )? this_typeName_1= ruletypeName ) )
            // InternalGo.g:4587:2: ( (kw= '*' )? this_typeName_1= ruletypeName )
            {
            // InternalGo.g:4587:2: ( (kw= '*' )? this_typeName_1= ruletypeName )
            // InternalGo.g:4588:3: (kw= '*' )? this_typeName_1= ruletypeName
            {
            // InternalGo.g:4588:3: (kw= '*' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==65) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalGo.g:4589:4: kw= '*'
                    {
                    kw=(Token)match(input,65,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getAnonymousFieldAccess().getAsteriskKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAnonymousFieldAccess().getTypeNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_typeName_1=ruletypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_typeName_1);
              		
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
    // $ANTLR end "ruleanonymousField"


    // $ANTLR start "entryRulefunctionLit"
    // InternalGo.g:4609:1: entryRulefunctionLit returns [String current=null] : iv_rulefunctionLit= rulefunctionLit EOF ;
    public final String entryRulefunctionLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunctionLit = null;


        try {
            // InternalGo.g:4609:51: (iv_rulefunctionLit= rulefunctionLit EOF )
            // InternalGo.g:4610:2: iv_rulefunctionLit= rulefunctionLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunctionLit=rulefunctionLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunctionLit.getText(); 
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
    // $ANTLR end "entryRulefunctionLit"


    // $ANTLR start "rulefunctionLit"
    // InternalGo.g:4616:1: rulefunctionLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_function_1= rulefunction ) ;
    public final AntlrDatatypeRuleToken rulefunctionLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_function_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4622:2: ( (kw= 'func' this_function_1= rulefunction ) )
            // InternalGo.g:4623:2: (kw= 'func' this_function_1= rulefunction )
            {
            // InternalGo.g:4623:2: (kw= 'func' this_function_1= rulefunction )
            // InternalGo.g:4624:3: kw= 'func' this_function_1= rulefunction
            {
            kw=(Token)match(input,54,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionLitAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionLitAccess().getFunctionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_function_1=rulefunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_function_1);
              		
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
    // $ANTLR end "rulefunctionLit"


    // $ANTLR start "entryRuleprimaryExpr"
    // InternalGo.g:4643:1: entryRuleprimaryExpr returns [String current=null] : iv_ruleprimaryExpr= ruleprimaryExpr EOF ;
    public final String entryRuleprimaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimaryExpr = null;


        try {
            // InternalGo.g:4643:51: (iv_ruleprimaryExpr= ruleprimaryExpr EOF )
            // InternalGo.g:4644:2: iv_ruleprimaryExpr= ruleprimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimaryExpr=ruleprimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimaryExpr.getText(); 
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
    // $ANTLR end "entryRuleprimaryExpr"


    // $ANTLR start "ruleprimaryExpr"
    // InternalGo.g:4650:1: ruleprimaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_operand_0= ruleoperand | this_conversion_1= ruleconversion ) | this_primaryExprSelector_2= ruleprimaryExprSelector | this_primaryExprIndex_3= ruleprimaryExprIndex | this_primaryExprSlice_4= ruleprimaryExprSlice | this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion | this_primaryExprArguments_6= ruleprimaryExprArguments ) ;
    public final AntlrDatatypeRuleToken ruleprimaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_operand_0 = null;

        AntlrDatatypeRuleToken this_conversion_1 = null;

        AntlrDatatypeRuleToken this_primaryExprSelector_2 = null;

        AntlrDatatypeRuleToken this_primaryExprIndex_3 = null;

        AntlrDatatypeRuleToken this_primaryExprSlice_4 = null;

        AntlrDatatypeRuleToken this_primaryExprTypeAssertion_5 = null;

        AntlrDatatypeRuleToken this_primaryExprArguments_6 = null;



        	enterRule();

        try {
            // InternalGo.g:4656:2: ( ( (this_operand_0= ruleoperand | this_conversion_1= ruleconversion ) | this_primaryExprSelector_2= ruleprimaryExprSelector | this_primaryExprIndex_3= ruleprimaryExprIndex | this_primaryExprSlice_4= ruleprimaryExprSlice | this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion | this_primaryExprArguments_6= ruleprimaryExprArguments ) )
            // InternalGo.g:4657:2: ( (this_operand_0= ruleoperand | this_conversion_1= ruleconversion ) | this_primaryExprSelector_2= ruleprimaryExprSelector | this_primaryExprIndex_3= ruleprimaryExprIndex | this_primaryExprSlice_4= ruleprimaryExprSlice | this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion | this_primaryExprArguments_6= ruleprimaryExprArguments )
            {
            // InternalGo.g:4657:2: ( (this_operand_0= ruleoperand | this_conversion_1= ruleconversion ) | this_primaryExprSelector_2= ruleprimaryExprSelector | this_primaryExprIndex_3= ruleprimaryExprIndex | this_primaryExprSlice_4= ruleprimaryExprSlice | this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion | this_primaryExprArguments_6= ruleprimaryExprArguments )
            int alt81=6;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // InternalGo.g:4658:3: (this_operand_0= ruleoperand | this_conversion_1= ruleconversion )
                    {
                    // InternalGo.g:4658:3: (this_operand_0= ruleoperand | this_conversion_1= ruleconversion )
                    int alt80=2;
                    alt80 = dfa80.predict(input);
                    switch (alt80) {
                        case 1 :
                            // InternalGo.g:4659:4: this_operand_0= ruleoperand
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getPrimaryExprAccess().getOperandParserRuleCall_0_0());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_operand_0=ruleoperand();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_operand_0);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:4670:4: this_conversion_1= ruleconversion
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getPrimaryExprAccess().getConversionParserRuleCall_0_1());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_conversion_1=ruleconversion();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_conversion_1);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:4682:3: this_primaryExprSelector_2= ruleprimaryExprSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprSelectorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprSelector_2=ruleprimaryExprSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprSelector_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:4693:3: this_primaryExprIndex_3= ruleprimaryExprIndex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprIndexParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprIndex_3=ruleprimaryExprIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprIndex_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:4704:3: this_primaryExprSlice_4= ruleprimaryExprSlice
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprSliceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprSlice_4=ruleprimaryExprSlice();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprSlice_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:4715:3: this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprTypeAssertionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprTypeAssertion_5=ruleprimaryExprTypeAssertion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprTypeAssertion_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:4726:3: this_primaryExprArguments_6= ruleprimaryExprArguments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprArgumentsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprArguments_6=ruleprimaryExprArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprArguments_6);
                      		
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
    // $ANTLR end "ruleprimaryExpr"


    // $ANTLR start "entryRuleprimaryExprStuff"
    // InternalGo.g:4740:1: entryRuleprimaryExprStuff returns [String current=null] : iv_ruleprimaryExprStuff= ruleprimaryExprStuff EOF ;
    public final String entryRuleprimaryExprStuff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimaryExprStuff = null;


        try {
            // InternalGo.g:4740:56: (iv_ruleprimaryExprStuff= ruleprimaryExprStuff EOF )
            // InternalGo.g:4741:2: iv_ruleprimaryExprStuff= ruleprimaryExprStuff EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprStuffRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimaryExprStuff=ruleprimaryExprStuff();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimaryExprStuff.getText(); 
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
    // $ANTLR end "entryRuleprimaryExprStuff"


    // $ANTLR start "ruleprimaryExprStuff"
    // InternalGo.g:4747:1: ruleprimaryExprStuff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_selector_0= ruleselector | this_index_1= ruleindex | this_slice_2= ruleslice | this_typeAssertion_3= ruletypeAssertion | this_arguments_4= rulearguments ) ;
    public final AntlrDatatypeRuleToken ruleprimaryExprStuff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_selector_0 = null;

        AntlrDatatypeRuleToken this_index_1 = null;

        AntlrDatatypeRuleToken this_slice_2 = null;

        AntlrDatatypeRuleToken this_typeAssertion_3 = null;

        AntlrDatatypeRuleToken this_arguments_4 = null;



        	enterRule();

        try {
            // InternalGo.g:4753:2: ( (this_selector_0= ruleselector | this_index_1= ruleindex | this_slice_2= ruleslice | this_typeAssertion_3= ruletypeAssertion | this_arguments_4= rulearguments ) )
            // InternalGo.g:4754:2: (this_selector_0= ruleselector | this_index_1= ruleindex | this_slice_2= ruleslice | this_typeAssertion_3= ruletypeAssertion | this_arguments_4= rulearguments )
            {
            // InternalGo.g:4754:2: (this_selector_0= ruleselector | this_index_1= ruleindex | this_slice_2= ruleslice | this_typeAssertion_3= ruletypeAssertion | this_arguments_4= rulearguments )
            int alt82=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA82_1 = input.LA(2);

                if ( (synpred139_InternalGo()) ) {
                    alt82=1;
                }
                else if ( (synpred142_InternalGo()) ) {
                    alt82=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
                }
                break;
            case 89:
                {
                int LA82_2 = input.LA(2);

                if ( (synpred140_InternalGo()) ) {
                    alt82=2;
                }
                else if ( (synpred141_InternalGo()) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalGo.g:4755:3: this_selector_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getSelectorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_selector_0=ruleselector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_selector_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4766:3: this_index_1= ruleindex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getIndexParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_index_1=ruleindex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_index_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:4777:3: this_slice_2= ruleslice
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getSliceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_slice_2=ruleslice();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_slice_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:4788:3: this_typeAssertion_3= ruletypeAssertion
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getTypeAssertionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeAssertion_3=ruletypeAssertion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeAssertion_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:4799:3: this_arguments_4= rulearguments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getArgumentsParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_arguments_4=rulearguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_arguments_4);
                      		
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
    // $ANTLR end "ruleprimaryExprStuff"


    // $ANTLR start "entryRuleprimaryExprSelector"
    // InternalGo.g:4813:1: entryRuleprimaryExprSelector returns [String current=null] : iv_ruleprimaryExprSelector= ruleprimaryExprSelector EOF ;
    public final String entryRuleprimaryExprSelector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimaryExprSelector = null;


        try {
            // InternalGo.g:4813:59: (iv_ruleprimaryExprSelector= ruleprimaryExprSelector EOF )
            // InternalGo.g:4814:2: iv_ruleprimaryExprSelector= ruleprimaryExprSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimaryExprSelector=ruleprimaryExprSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimaryExprSelector.getText(); 
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
    // $ANTLR end "entryRuleprimaryExprSelector"


    // $ANTLR start "ruleprimaryExprSelector"
    // InternalGo.g:4820:1: ruleprimaryExprSelector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSelector_1= ruleprimaryExprSelector )? ;
    public final AntlrDatatypeRuleToken ruleprimaryExprSelector() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_primaryExprStuff_0 = null;

        AntlrDatatypeRuleToken this_primaryExprSelector_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4826:2: ( (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSelector_1= ruleprimaryExprSelector )? )
            // InternalGo.g:4827:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSelector_1= ruleprimaryExprSelector )?
            {
            // InternalGo.g:4827:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSelector_1= ruleprimaryExprSelector )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==49) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==RULE_IDENTIFIER) ) {
                    alt83=1;
                }
                else if ( (LA83_1==47) ) {
                    int LA83_4 = input.LA(3);

                    if ( (LA83_4==RULE_IDENTIFIER||LA83_4==47||LA83_4==54||LA83_4==58||LA83_4==65||LA83_4==89||(LA83_4>=91 && LA83_4<=93)||LA83_4==95) ) {
                        alt83=1;
                    }
                }
            }
            else if ( (LA83_0==47||LA83_0==89) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalGo.g:4828:3: this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSelector_1= ruleprimaryExprSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprSelectorAccess().getPrimaryExprStuffParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_59);
                    this_primaryExprStuff_0=ruleprimaryExprStuff();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprStuff_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprSelectorAccess().getPrimaryExprSelectorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprSelector_1=ruleprimaryExprSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprSelector_1);
                      		
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
    // $ANTLR end "ruleprimaryExprSelector"


    // $ANTLR start "entryRuleprimaryExprIndex"
    // InternalGo.g:4852:1: entryRuleprimaryExprIndex returns [String current=null] : iv_ruleprimaryExprIndex= ruleprimaryExprIndex EOF ;
    public final String entryRuleprimaryExprIndex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimaryExprIndex = null;


        try {
            // InternalGo.g:4852:56: (iv_ruleprimaryExprIndex= ruleprimaryExprIndex EOF )
            // InternalGo.g:4853:2: iv_ruleprimaryExprIndex= ruleprimaryExprIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimaryExprIndex=ruleprimaryExprIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimaryExprIndex.getText(); 
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
    // $ANTLR end "entryRuleprimaryExprIndex"


    // $ANTLR start "ruleprimaryExprIndex"
    // InternalGo.g:4859:1: ruleprimaryExprIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprIndex_1= ruleprimaryExprIndex )? ;
    public final AntlrDatatypeRuleToken ruleprimaryExprIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_primaryExprStuff_0 = null;

        AntlrDatatypeRuleToken this_primaryExprIndex_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4865:2: ( (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprIndex_1= ruleprimaryExprIndex )? )
            // InternalGo.g:4866:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprIndex_1= ruleprimaryExprIndex )?
            {
            // InternalGo.g:4866:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprIndex_1= ruleprimaryExprIndex )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==49) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==RULE_IDENTIFIER) ) {
                    alt84=1;
                }
                else if ( (LA84_1==47) ) {
                    int LA84_4 = input.LA(3);

                    if ( (LA84_4==RULE_IDENTIFIER||LA84_4==47||LA84_4==54||LA84_4==58||LA84_4==65||LA84_4==89||(LA84_4>=91 && LA84_4<=93)||LA84_4==95) ) {
                        alt84=1;
                    }
                }
            }
            else if ( (LA84_0==47||LA84_0==89) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalGo.g:4867:3: this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprIndex_1= ruleprimaryExprIndex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprIndexAccess().getPrimaryExprStuffParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_59);
                    this_primaryExprStuff_0=ruleprimaryExprStuff();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprStuff_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprIndexAccess().getPrimaryExprIndexParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprIndex_1=ruleprimaryExprIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprIndex_1);
                      		
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
    // $ANTLR end "ruleprimaryExprIndex"


    // $ANTLR start "entryRuleprimaryExprSlice"
    // InternalGo.g:4891:1: entryRuleprimaryExprSlice returns [String current=null] : iv_ruleprimaryExprSlice= ruleprimaryExprSlice EOF ;
    public final String entryRuleprimaryExprSlice() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimaryExprSlice = null;


        try {
            // InternalGo.g:4891:56: (iv_ruleprimaryExprSlice= ruleprimaryExprSlice EOF )
            // InternalGo.g:4892:2: iv_ruleprimaryExprSlice= ruleprimaryExprSlice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprSliceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimaryExprSlice=ruleprimaryExprSlice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimaryExprSlice.getText(); 
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
    // $ANTLR end "entryRuleprimaryExprSlice"


    // $ANTLR start "ruleprimaryExprSlice"
    // InternalGo.g:4898:1: ruleprimaryExprSlice returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSlice_1= ruleprimaryExprSlice )? ;
    public final AntlrDatatypeRuleToken ruleprimaryExprSlice() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_primaryExprStuff_0 = null;

        AntlrDatatypeRuleToken this_primaryExprSlice_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4904:2: ( (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSlice_1= ruleprimaryExprSlice )? )
            // InternalGo.g:4905:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSlice_1= ruleprimaryExprSlice )?
            {
            // InternalGo.g:4905:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSlice_1= ruleprimaryExprSlice )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==49) ) {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==47) ) {
                    int LA85_4 = input.LA(3);

                    if ( (LA85_4==RULE_IDENTIFIER||LA85_4==47||LA85_4==54||LA85_4==58||LA85_4==65||LA85_4==89||(LA85_4>=91 && LA85_4<=93)||LA85_4==95) ) {
                        alt85=1;
                    }
                }
                else if ( (LA85_1==RULE_IDENTIFIER) ) {
                    alt85=1;
                }
            }
            else if ( (LA85_0==47||LA85_0==89) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalGo.g:4906:3: this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprSlice_1= ruleprimaryExprSlice
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprSliceAccess().getPrimaryExprStuffParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_59);
                    this_primaryExprStuff_0=ruleprimaryExprStuff();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprStuff_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprSliceAccess().getPrimaryExprSliceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprSlice_1=ruleprimaryExprSlice();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprSlice_1);
                      		
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
    // $ANTLR end "ruleprimaryExprSlice"


    // $ANTLR start "entryRuleprimaryExprTypeAssertion"
    // InternalGo.g:4930:1: entryRuleprimaryExprTypeAssertion returns [String current=null] : iv_ruleprimaryExprTypeAssertion= ruleprimaryExprTypeAssertion EOF ;
    public final String entryRuleprimaryExprTypeAssertion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimaryExprTypeAssertion = null;


        try {
            // InternalGo.g:4930:64: (iv_ruleprimaryExprTypeAssertion= ruleprimaryExprTypeAssertion EOF )
            // InternalGo.g:4931:2: iv_ruleprimaryExprTypeAssertion= ruleprimaryExprTypeAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprTypeAssertionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimaryExprTypeAssertion=ruleprimaryExprTypeAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimaryExprTypeAssertion.getText(); 
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
    // $ANTLR end "entryRuleprimaryExprTypeAssertion"


    // $ANTLR start "ruleprimaryExprTypeAssertion"
    // InternalGo.g:4937:1: ruleprimaryExprTypeAssertion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprTypeAssertion_1= ruleprimaryExprTypeAssertion )? ;
    public final AntlrDatatypeRuleToken ruleprimaryExprTypeAssertion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_primaryExprStuff_0 = null;

        AntlrDatatypeRuleToken this_primaryExprTypeAssertion_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4943:2: ( (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprTypeAssertion_1= ruleprimaryExprTypeAssertion )? )
            // InternalGo.g:4944:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprTypeAssertion_1= ruleprimaryExprTypeAssertion )?
            {
            // InternalGo.g:4944:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprTypeAssertion_1= ruleprimaryExprTypeAssertion )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==49) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==47) ) {
                    int LA86_4 = input.LA(3);

                    if ( (LA86_4==RULE_IDENTIFIER||LA86_4==47||LA86_4==54||LA86_4==58||LA86_4==65||LA86_4==89||(LA86_4>=91 && LA86_4<=93)||LA86_4==95) ) {
                        alt86=1;
                    }
                }
                else if ( (LA86_1==RULE_IDENTIFIER) ) {
                    alt86=1;
                }
            }
            else if ( (LA86_0==47||LA86_0==89) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalGo.g:4945:3: this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprTypeAssertion_1= ruleprimaryExprTypeAssertion
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprTypeAssertionAccess().getPrimaryExprStuffParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_59);
                    this_primaryExprStuff_0=ruleprimaryExprStuff();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprStuff_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprTypeAssertionAccess().getPrimaryExprTypeAssertionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprTypeAssertion_1=ruleprimaryExprTypeAssertion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprTypeAssertion_1);
                      		
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
    // $ANTLR end "ruleprimaryExprTypeAssertion"


    // $ANTLR start "entryRuleprimaryExprArguments"
    // InternalGo.g:4969:1: entryRuleprimaryExprArguments returns [String current=null] : iv_ruleprimaryExprArguments= ruleprimaryExprArguments EOF ;
    public final String entryRuleprimaryExprArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimaryExprArguments = null;


        try {
            // InternalGo.g:4969:60: (iv_ruleprimaryExprArguments= ruleprimaryExprArguments EOF )
            // InternalGo.g:4970:2: iv_ruleprimaryExprArguments= ruleprimaryExprArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimaryExprArguments=ruleprimaryExprArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimaryExprArguments.getText(); 
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
    // $ANTLR end "entryRuleprimaryExprArguments"


    // $ANTLR start "ruleprimaryExprArguments"
    // InternalGo.g:4976:1: ruleprimaryExprArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprArguments_1= ruleprimaryExprArguments )? ;
    public final AntlrDatatypeRuleToken ruleprimaryExprArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_primaryExprStuff_0 = null;

        AntlrDatatypeRuleToken this_primaryExprArguments_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4982:2: ( (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprArguments_1= ruleprimaryExprArguments )? )
            // InternalGo.g:4983:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprArguments_1= ruleprimaryExprArguments )?
            {
            // InternalGo.g:4983:2: (this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprArguments_1= ruleprimaryExprArguments )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==49) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==RULE_IDENTIFIER) ) {
                    alt87=1;
                }
                else if ( (LA87_1==47) ) {
                    int LA87_4 = input.LA(3);

                    if ( (LA87_4==RULE_IDENTIFIER||LA87_4==47||LA87_4==54||LA87_4==58||LA87_4==65||LA87_4==89||(LA87_4>=91 && LA87_4<=93)||LA87_4==95) ) {
                        alt87=1;
                    }
                }
            }
            else if ( (LA87_0==47||LA87_0==89) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalGo.g:4984:3: this_primaryExprStuff_0= ruleprimaryExprStuff this_primaryExprArguments_1= ruleprimaryExprArguments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprArgumentsAccess().getPrimaryExprStuffParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_59);
                    this_primaryExprStuff_0=ruleprimaryExprStuff();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprStuff_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprArgumentsAccess().getPrimaryExprArgumentsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExprArguments_1=ruleprimaryExprArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExprArguments_1);
                      		
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
    // $ANTLR end "ruleprimaryExprArguments"


    // $ANTLR start "entryRuleselector"
    // InternalGo.g:5008:1: entryRuleselector returns [String current=null] : iv_ruleselector= ruleselector EOF ;
    public final String entryRuleselector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleselector = null;


        try {
            // InternalGo.g:5008:48: (iv_ruleselector= ruleselector EOF )
            // InternalGo.g:5009:2: iv_ruleselector= ruleselector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleselector=ruleselector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselector.getText(); 
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
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // InternalGo.g:5015:1: ruleselector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleselector() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;


        	enterRule();

        try {
            // InternalGo.g:5021:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) )
            // InternalGo.g:5022:2: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
            {
            // InternalGo.g:5022:2: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
            // InternalGo.g:5023:3: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
            {
            kw=(Token)match(input,49,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectorAccess().getFullStopKeyword_0());
              		
            }
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_1, grammarAccess.getSelectorAccess().getIDENTIFIERTerminalRuleCall_1());
              		
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
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRuleindex"
    // InternalGo.g:5039:1: entryRuleindex returns [String current=null] : iv_ruleindex= ruleindex EOF ;
    public final String entryRuleindex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleindex = null;


        try {
            // InternalGo.g:5039:45: (iv_ruleindex= ruleindex EOF )
            // InternalGo.g:5040:2: iv_ruleindex= ruleindex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleindex=ruleindex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleindex.getText(); 
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
    // $ANTLR end "entryRuleindex"


    // $ANTLR start "ruleindex"
    // InternalGo.g:5046:1: ruleindex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_expression_1= ruleexpression kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleindex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:5052:2: ( (kw= '[' this_expression_1= ruleexpression kw= ']' ) )
            // InternalGo.g:5053:2: (kw= '[' this_expression_1= ruleexpression kw= ']' )
            {
            // InternalGo.g:5053:2: (kw= '[' this_expression_1= ruleexpression kw= ']' )
            // InternalGo.g:5054:3: kw= '[' this_expression_1= ruleexpression kw= ']'
            {
            kw=(Token)match(input,89,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIndexAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_46);
            this_expression_1=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIndexAccess().getRightSquareBracketKeyword_2());
              		
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
    // $ANTLR end "ruleindex"


    // $ANTLR start "entryRuleslice"
    // InternalGo.g:5078:1: entryRuleslice returns [String current=null] : iv_ruleslice= ruleslice EOF ;
    public final String entryRuleslice() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleslice = null;


        try {
            // InternalGo.g:5078:45: (iv_ruleslice= ruleslice EOF )
            // InternalGo.g:5079:2: iv_ruleslice= ruleslice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSliceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleslice=ruleslice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleslice.getText(); 
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
    // $ANTLR end "entryRuleslice"


    // $ANTLR start "ruleslice"
    // InternalGo.g:5085:1: ruleslice returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) | ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression ) ) kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleslice() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;

        AntlrDatatypeRuleToken this_expression_6 = null;

        AntlrDatatypeRuleToken this_expression_8 = null;



        	enterRule();

        try {
            // InternalGo.g:5091:2: ( (kw= '[' ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) | ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression ) ) kw= ']' ) )
            // InternalGo.g:5092:2: (kw= '[' ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) | ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression ) ) kw= ']' )
            {
            // InternalGo.g:5092:2: (kw= '[' ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) | ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression ) ) kw= ']' )
            // InternalGo.g:5093:3: kw= '[' ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) | ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression ) ) kw= ']'
            {
            kw=(Token)match(input,89,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSliceAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGo.g:5098:3: ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) | ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression ) )
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // InternalGo.g:5099:4: ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? )
                    {
                    // InternalGo.g:5099:4: ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? )
                    // InternalGo.g:5100:5: (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )?
                    {
                    // InternalGo.g:5100:5: (this_expression_1= ruleexpression )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( ((LA88_0>=RULE_IDENTIFIER && LA88_0<=RULE_STRING_LIT)||(LA88_0>=RULE_INT_LIT && LA88_0<=RULE_BINARY_OP)||LA88_0==47||LA88_0==49||LA88_0==54||LA88_0==58||(LA88_0>=61 && LA88_0<=62)||(LA88_0>=64 && LA88_0<=65)||LA88_0==70||LA88_0==89||(LA88_0>=91 && LA88_0<=93)||(LA88_0>=95 && LA88_0<=96)) ) {
                        alt88=1;
                    }
                    else if ( (LA88_0==73) ) {
                        int LA88_2 = input.LA(2);

                        if ( (synpred148_InternalGo()) ) {
                            alt88=1;
                        }
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalGo.g:5101:6: this_expression_1= ruleexpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_0_0());
                              					
                            }
                            pushFollow(FOLLOW_28);
                            this_expression_1=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_expression_1);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,73,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getSliceAccess().getColonKeyword_1_0_1());
                      				
                    }
                    // InternalGo.g:5117:5: (this_expression_3= ruleexpression )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=RULE_IDENTIFIER && LA89_0<=RULE_STRING_LIT)||(LA89_0>=RULE_INT_LIT && LA89_0<=RULE_BINARY_OP)||LA89_0==47||LA89_0==49||LA89_0==54||LA89_0==58||(LA89_0>=61 && LA89_0<=62)||(LA89_0>=64 && LA89_0<=65)||LA89_0==70||LA89_0==89||(LA89_0>=91 && LA89_0<=93)||(LA89_0>=95 && LA89_0<=96)) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==90) ) {
                        int LA89_2 = input.LA(2);

                        if ( (synpred149_InternalGo()) ) {
                            alt89=1;
                        }
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalGo.g:5118:6: this_expression_3= ruleexpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_0_2());
                              					
                            }
                            pushFollow(FOLLOW_46);
                            this_expression_3=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_expression_3);
                              					
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
                    // InternalGo.g:5131:4: ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression )
                    {
                    // InternalGo.g:5131:4: ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression )
                    // InternalGo.g:5132:5: (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression
                    {
                    // InternalGo.g:5132:5: (this_expression_4= ruleexpression )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( ((LA90_0>=RULE_IDENTIFIER && LA90_0<=RULE_STRING_LIT)||(LA90_0>=RULE_INT_LIT && LA90_0<=RULE_BINARY_OP)||LA90_0==47||LA90_0==49||LA90_0==54||LA90_0==58||(LA90_0>=61 && LA90_0<=62)||(LA90_0>=64 && LA90_0<=65)||LA90_0==70||LA90_0==89||(LA90_0>=91 && LA90_0<=93)||(LA90_0>=95 && LA90_0<=96)) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==73) ) {
                        int LA90_2 = input.LA(2);

                        if ( (synpred151_InternalGo()) ) {
                            alt90=1;
                        }
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalGo.g:5133:6: this_expression_4= ruleexpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_28);
                            this_expression_4=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_expression_4);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,73,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getSliceAccess().getColonKeyword_1_1_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_1_2());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    this_expression_6=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_6);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,73,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getSliceAccess().getColonKeyword_1_1_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_1_4());
                      				
                    }
                    pushFollow(FOLLOW_46);
                    this_expression_8=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_8);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSliceAccess().getRightSquareBracketKeyword_2());
              		
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
    // $ANTLR end "ruleslice"


    // $ANTLR start "entryRuletypeAssertion"
    // InternalGo.g:5185:1: entryRuletypeAssertion returns [String current=null] : iv_ruletypeAssertion= ruletypeAssertion EOF ;
    public final String entryRuletypeAssertion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeAssertion = null;


        try {
            // InternalGo.g:5185:53: (iv_ruletypeAssertion= ruletypeAssertion EOF )
            // InternalGo.g:5186:2: iv_ruletypeAssertion= ruletypeAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeAssertionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeAssertion=ruletypeAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeAssertion.getText(); 
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
    // $ANTLR end "entryRuletypeAssertion"


    // $ANTLR start "ruletypeAssertion"
    // InternalGo.g:5192:1: ruletypeAssertion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' kw= '(' this_type_2= ruletype kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruletypeAssertion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:5198:2: ( (kw= '.' kw= '(' this_type_2= ruletype kw= ')' ) )
            // InternalGo.g:5199:2: (kw= '.' kw= '(' this_type_2= ruletype kw= ')' )
            {
            // InternalGo.g:5199:2: (kw= '.' kw= '(' this_type_2= ruletype kw= ')' )
            // InternalGo.g:5200:3: kw= '.' kw= '(' this_type_2= ruletype kw= ')'
            {
            kw=(Token)match(input,49,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeAssertionAccess().getFullStopKeyword_0());
              		
            }
            kw=(Token)match(input,47,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeAssertionAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeAssertionAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_41);
            this_type_2=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_type_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeAssertionAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruletypeAssertion"


    // $ANTLR start "entryRulearguments"
    // InternalGo.g:5229:1: entryRulearguments returns [String current=null] : iv_rulearguments= rulearguments EOF ;
    public final String entryRulearguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearguments = null;


        try {
            // InternalGo.g:5229:49: (iv_rulearguments= rulearguments EOF )
            // InternalGo.g:5230:2: iv_rulearguments= rulearguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearguments=rulearguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearguments.getText(); 
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
    // $ANTLR end "entryRulearguments"


    // $ANTLR start "rulearguments"
    // InternalGo.g:5236:1: rulearguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulearguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_1 = null;

        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_expressionList_4 = null;



        	enterRule();

        try {
            // InternalGo.g:5242:2: ( (kw= '(' ( (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) )
            // InternalGo.g:5243:2: (kw= '(' ( (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            {
            // InternalGo.g:5243:2: (kw= '(' ( (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            // InternalGo.g:5244:3: kw= '(' ( (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGo.g:5249:3: ( (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_IDENTIFIER && LA96_0<=RULE_STRING_LIT)||(LA96_0>=RULE_INT_LIT && LA96_0<=RULE_BINARY_OP)||LA96_0==47||LA96_0==49||LA96_0==52||LA96_0==54||LA96_0==58||(LA96_0>=61 && LA96_0<=62)||(LA96_0>=64 && LA96_0<=65)||LA96_0==70||LA96_0==89||(LA96_0>=91 && LA96_0<=96)) ) {
                alt96=1;
            }
            else if ( (LA96_0==48) ) {
                int LA96_2 = input.LA(2);

                if ( (synpred156_InternalGo()) ) {
                    alt96=1;
                }
            }
            switch (alt96) {
                case 1 :
                    // InternalGo.g:5250:4: (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )?
                    {
                    // InternalGo.g:5250:4: (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) )
                    int alt93=2;
                    alt93 = dfa93.predict(input);
                    switch (alt93) {
                        case 1 :
                            // InternalGo.g:5251:5: this_expressionList_1= ruleexpressionList
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_0());
                              				
                            }
                            pushFollow(FOLLOW_63);
                            this_expressionList_1=ruleexpressionList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_expressionList_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:5262:5: (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? )
                            {
                            // InternalGo.g:5262:5: (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? )
                            // InternalGo.g:5263:6: this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )?
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getArgumentsAccess().getTypeParserRuleCall_1_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_63);
                            this_type_2=ruletype();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_type_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            // InternalGo.g:5273:6: (kw= ',' this_expressionList_4= ruleexpressionList )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==52) ) {
                                int LA92_1 = input.LA(2);

                                if ( (synpred153_InternalGo()) ) {
                                    alt92=1;
                                }
                            }
                            switch (alt92) {
                                case 1 :
                                    // InternalGo.g:5274:7: kw= ',' this_expressionList_4= ruleexpressionList
                                    {
                                    kw=(Token)match(input,52,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current.merge(kw);
                                      							newLeafNode(kw, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0_1_1_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_1_1_1());
                                      						
                                    }
                                    pushFollow(FOLLOW_63);
                                    this_expressionList_4=ruleexpressionList();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current.merge(this_expressionList_4);
                                      						
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

                    }

                    // InternalGo.g:5292:4: (kw= '...' )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==94) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalGo.g:5293:5: kw= '...'
                            {
                            kw=(Token)match(input,94,FOLLOW_52); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGo.g:5299:4: (kw= ',' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==52) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalGo.g:5300:5: kw= ','
                            {
                            kw=(Token)match(input,52,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getArgumentsAccess().getCommaKeyword_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "rulearguments"


    // $ANTLR start "entryRulemethodExpr"
    // InternalGo.g:5316:1: entryRulemethodExpr returns [String current=null] : iv_rulemethodExpr= rulemethodExpr EOF ;
    public final String entryRulemethodExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemethodExpr = null;


        try {
            // InternalGo.g:5316:50: (iv_rulemethodExpr= rulemethodExpr EOF )
            // InternalGo.g:5317:2: iv_rulemethodExpr= rulemethodExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemethodExpr=rulemethodExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemethodExpr.getText(); 
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
    // $ANTLR end "entryRulemethodExpr"


    // $ANTLR start "rulemethodExpr"
    // InternalGo.g:5323:1: rulemethodExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_receiverType_0= rulereceiverType kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulemethodExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_2=null;
        AntlrDatatypeRuleToken this_receiverType_0 = null;



        	enterRule();

        try {
            // InternalGo.g:5329:2: ( (this_receiverType_0= rulereceiverType kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER ) )
            // InternalGo.g:5330:2: (this_receiverType_0= rulereceiverType kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            {
            // InternalGo.g:5330:2: (this_receiverType_0= rulereceiverType kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER )
            // InternalGo.g:5331:3: this_receiverType_0= rulereceiverType kw= '.' this_IDENTIFIER_2= RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodExprAccess().getReceiverTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_receiverType_0=rulereceiverType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_receiverType_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,49,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMethodExprAccess().getFullStopKeyword_1());
              		
            }
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_2, grammarAccess.getMethodExprAccess().getIDENTIFIERTerminalRuleCall_2());
              		
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
    // $ANTLR end "rulemethodExpr"


    // $ANTLR start "entryRulereceiverType"
    // InternalGo.g:5357:1: entryRulereceiverType returns [String current=null] : iv_rulereceiverType= rulereceiverType EOF ;
    public final String entryRulereceiverType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereceiverType = null;


        try {
            // InternalGo.g:5357:52: (iv_rulereceiverType= rulereceiverType EOF )
            // InternalGo.g:5358:2: iv_rulereceiverType= rulereceiverType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiverTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulereceiverType=rulereceiverType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereceiverType.getText(); 
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
    // $ANTLR end "entryRulereceiverType"


    // $ANTLR start "rulereceiverType"
    // InternalGo.g:5364:1: rulereceiverType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_typeName_0= ruletypeName | (kw= '(' kw= '*' this_typeName_3= ruletypeName kw= ')' ) | (kw= '(' this_receiverType_6= rulereceiverType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulereceiverType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeName_0 = null;

        AntlrDatatypeRuleToken this_typeName_3 = null;

        AntlrDatatypeRuleToken this_receiverType_6 = null;



        	enterRule();

        try {
            // InternalGo.g:5370:2: ( (this_typeName_0= ruletypeName | (kw= '(' kw= '*' this_typeName_3= ruletypeName kw= ')' ) | (kw= '(' this_receiverType_6= rulereceiverType kw= ')' ) ) )
            // InternalGo.g:5371:2: (this_typeName_0= ruletypeName | (kw= '(' kw= '*' this_typeName_3= ruletypeName kw= ')' ) | (kw= '(' this_receiverType_6= rulereceiverType kw= ')' ) )
            {
            // InternalGo.g:5371:2: (this_typeName_0= ruletypeName | (kw= '(' kw= '*' this_typeName_3= ruletypeName kw= ')' ) | (kw= '(' this_receiverType_6= rulereceiverType kw= ')' ) )
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_IDENTIFIER) ) {
                alt97=1;
            }
            else if ( (LA97_0==47) ) {
                int LA97_2 = input.LA(2);

                if ( (LA97_2==65) ) {
                    alt97=2;
                }
                else if ( (LA97_2==RULE_IDENTIFIER||LA97_2==47) ) {
                    alt97=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalGo.g:5372:3: this_typeName_0= ruletypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReceiverTypeAccess().getTypeNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeName_0=ruletypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:5383:3: (kw= '(' kw= '*' this_typeName_3= ruletypeName kw= ')' )
                    {
                    // InternalGo.g:5383:3: (kw= '(' kw= '*' this_typeName_3= ruletypeName kw= ')' )
                    // InternalGo.g:5384:4: kw= '(' kw= '*' this_typeName_3= ruletypeName kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getReceiverTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,65,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getReceiverTypeAccess().getAsteriskKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReceiverTypeAccess().getTypeNameParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_typeName_3=ruletypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeName_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getReceiverTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:5411:3: (kw= '(' this_receiverType_6= rulereceiverType kw= ')' )
                    {
                    // InternalGo.g:5411:3: (kw= '(' this_receiverType_6= rulereceiverType kw= ')' )
                    // InternalGo.g:5412:4: kw= '(' this_receiverType_6= rulereceiverType kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getReceiverTypeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReceiverTypeAccess().getReceiverTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_receiverType_6=rulereceiverType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_receiverType_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getReceiverTypeAccess().getRightParenthesisKeyword_2_2());
                      			
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
    // $ANTLR end "rulereceiverType"


    // $ANTLR start "entryRuleexpression"
    // InternalGo.g:5437:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // InternalGo.g:5437:50: (iv_ruleexpression= ruleexpression EOF )
            // InternalGo.g:5438:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression.getText(); 
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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalGo.g:5444:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_unaryExpr_0= ruleunaryExpr this_expressionMatched_1= ruleexpressionMatched ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_unaryExpr_0 = null;

        AntlrDatatypeRuleToken this_expressionMatched_1 = null;



        	enterRule();

        try {
            // InternalGo.g:5450:2: ( (this_unaryExpr_0= ruleunaryExpr this_expressionMatched_1= ruleexpressionMatched ) )
            // InternalGo.g:5451:2: (this_unaryExpr_0= ruleunaryExpr this_expressionMatched_1= ruleexpressionMatched )
            {
            // InternalGo.g:5451:2: (this_unaryExpr_0= ruleunaryExpr this_expressionMatched_1= ruleexpressionMatched )
            // InternalGo.g:5452:3: this_unaryExpr_0= ruleunaryExpr this_expressionMatched_1= ruleexpressionMatched
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getUnaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_65);
            this_unaryExpr_0=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_unaryExpr_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getExpressionMatchedParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_expressionMatched_1=ruleexpressionMatched();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expressionMatched_1);
              		
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleexpressionMatched"
    // InternalGo.g:5476:1: entryRuleexpressionMatched returns [String current=null] : iv_ruleexpressionMatched= ruleexpressionMatched EOF ;
    public final String entryRuleexpressionMatched() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpressionMatched = null;


        try {
            // InternalGo.g:5476:57: (iv_ruleexpressionMatched= ruleexpressionMatched EOF )
            // InternalGo.g:5477:2: iv_ruleexpressionMatched= ruleexpressionMatched EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMatchedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionMatched=ruleexpressionMatched();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionMatched.getText(); 
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
    // $ANTLR end "entryRuleexpressionMatched"


    // $ANTLR start "ruleexpressionMatched"
    // InternalGo.g:5483:1: ruleexpressionMatched returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BINARY_OP_0= RULE_BINARY_OP this_expression_1= ruleexpression )? ;
    public final AntlrDatatypeRuleToken ruleexpressionMatched() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_OP_0=null;
        AntlrDatatypeRuleToken this_expression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:5489:2: ( (this_BINARY_OP_0= RULE_BINARY_OP this_expression_1= ruleexpression )? )
            // InternalGo.g:5490:2: (this_BINARY_OP_0= RULE_BINARY_OP this_expression_1= ruleexpression )?
            {
            // InternalGo.g:5490:2: (this_BINARY_OP_0= RULE_BINARY_OP this_expression_1= ruleexpression )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_BINARY_OP) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalGo.g:5491:3: this_BINARY_OP_0= RULE_BINARY_OP this_expression_1= ruleexpression
                    {
                    this_BINARY_OP_0=(Token)match(input,RULE_BINARY_OP,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BINARY_OP_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BINARY_OP_0, grammarAccess.getExpressionMatchedAccess().getBINARY_OPTerminalRuleCall_0());
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionMatchedAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_expression_1);
                      		
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
    // $ANTLR end "ruleexpressionMatched"


    // $ANTLR start "entryRuleunaryExpr"
    // InternalGo.g:5512:1: entryRuleunaryExpr returns [String current=null] : iv_ruleunaryExpr= ruleunaryExpr EOF ;
    public final String entryRuleunaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunaryExpr = null;


        try {
            // InternalGo.g:5512:49: (iv_ruleunaryExpr= ruleunaryExpr EOF )
            // InternalGo.g:5513:2: iv_ruleunaryExpr= ruleunaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunaryExpr=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunaryExpr.getText(); 
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
    // $ANTLR end "entryRuleunaryExpr"


    // $ANTLR start "ruleunaryExpr"
    // InternalGo.g:5519:1: ruleunaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_primaryExpr_0= ruleprimaryExpr | ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) this_unaryExpr_8= ruleunaryExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleunaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_primaryExpr_0 = null;

        AntlrDatatypeRuleToken this_unaryExpr_8 = null;



        	enterRule();

        try {
            // InternalGo.g:5525:2: ( (this_primaryExpr_0= ruleprimaryExpr | ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) this_unaryExpr_8= ruleunaryExpr ) ) )
            // InternalGo.g:5526:2: (this_primaryExpr_0= ruleprimaryExpr | ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) this_unaryExpr_8= ruleunaryExpr ) )
            {
            // InternalGo.g:5526:2: (this_primaryExpr_0= ruleprimaryExpr | ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) this_unaryExpr_8= ruleunaryExpr ) )
            int alt100=2;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_IDENTIFIER:
            case RULE_STRING_LIT:
            case RULE_INT_LIT:
            case RULE_FLOAT_LIT:
            case RULE_IMAGINARY_LIT:
            case RULE_RUNE_LIT:
            case RULE_BINARY_OP:
            case 44:
            case 47:
            case 48:
            case 49:
            case 51:
            case 52:
            case 54:
            case 56:
            case 57:
            case 59:
            case 60:
            case 63:
            case 66:
            case 67:
            case 68:
            case 69:
            case 71:
            case 73:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt100=1;
                }
                break;
            case 65:
                {
                int LA100_2 = input.LA(2);

                if ( (synpred160_InternalGo()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                int LA100_3 = input.LA(2);

                if ( (synpred160_InternalGo()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 3, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                int LA100_4 = input.LA(2);

                if ( (synpred160_InternalGo()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 4, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                int LA100_5 = input.LA(2);

                if ( (synpred160_InternalGo()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 5, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA100_6 = input.LA(2);

                if ( (synpred160_InternalGo()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 6, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                int LA100_7 = input.LA(2);

                if ( (synpred160_InternalGo()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 7, input);

                    throw nvae;
                }
                }
                break;
            case 96:
                {
                alt100=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalGo.g:5527:3: this_primaryExpr_0= ruleprimaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExprAccess().getPrimaryExprParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_primaryExpr_0=ruleprimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_primaryExpr_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:5538:3: ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) this_unaryExpr_8= ruleunaryExpr )
                    {
                    // InternalGo.g:5538:3: ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) this_unaryExpr_8= ruleunaryExpr )
                    // InternalGo.g:5539:4: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) this_unaryExpr_8= ruleunaryExpr
                    {
                    // InternalGo.g:5539:4: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' )
                    int alt99=7;
                    switch ( input.LA(1) ) {
                    case 61:
                        {
                        alt99=1;
                        }
                        break;
                    case 62:
                        {
                        alt99=2;
                        }
                        break;
                    case 96:
                        {
                        alt99=3;
                        }
                        break;
                    case 64:
                        {
                        alt99=4;
                        }
                        break;
                    case 65:
                        {
                        alt99=5;
                        }
                        break;
                    case 70:
                        {
                        alt99=6;
                        }
                        break;
                    case 58:
                        {
                        alt99=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }

                    switch (alt99) {
                        case 1 :
                            // InternalGo.g:5540:5: kw= '+'
                            {
                            kw=(Token)match(input,61,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getUnaryExprAccess().getPlusSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:5546:5: kw= '-'
                            {
                            kw=(Token)match(input,62,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGo.g:5552:5: kw= '!'
                            {
                            kw=(Token)match(input,96,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGo.g:5558:5: kw= '^'
                            {
                            kw=(Token)match(input,64,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getUnaryExprAccess().getCircumflexAccentKeyword_1_0_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalGo.g:5564:5: kw= '*'
                            {
                            kw=(Token)match(input,65,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getUnaryExprAccess().getAsteriskKeyword_1_0_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalGo.g:5570:5: kw= '&'
                            {
                            kw=(Token)match(input,70,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getUnaryExprAccess().getAmpersandKeyword_1_0_5());
                              				
                            }

                            }
                            break;
                        case 7 :
                            // InternalGo.g:5576:5: kw= '<-'
                            {
                            kw=(Token)match(input,58,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getUnaryExprAccess().getLessThanSignHyphenMinusKeyword_1_0_6());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnaryExprAccess().getUnaryExprParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_unaryExpr_8=ruleunaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unaryExpr_8);
                      			
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
    // $ANTLR end "ruleunaryExpr"


    // $ANTLR start "entryRuleconversion"
    // InternalGo.g:5597:1: entryRuleconversion returns [String current=null] : iv_ruleconversion= ruleconversion EOF ;
    public final String entryRuleconversion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconversion = null;


        try {
            // InternalGo.g:5597:50: (iv_ruleconversion= ruleconversion EOF )
            // InternalGo.g:5598:2: iv_ruleconversion= ruleconversion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConversionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconversion=ruleconversion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconversion.getText(); 
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
    // $ANTLR end "entryRuleconversion"


    // $ANTLR start "ruleconversion"
    // InternalGo.g:5604:1: ruleconversion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_type_0= ruletype kw= '(' this_expression_2= ruleexpression (kw= ',' )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleconversion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;



        	enterRule();

        try {
            // InternalGo.g:5610:2: ( (this_type_0= ruletype kw= '(' this_expression_2= ruleexpression (kw= ',' )? kw= ')' ) )
            // InternalGo.g:5611:2: (this_type_0= ruletype kw= '(' this_expression_2= ruleexpression (kw= ',' )? kw= ')' )
            {
            // InternalGo.g:5611:2: (this_type_0= ruletype kw= '(' this_expression_2= ruleexpression (kw= ',' )? kw= ')' )
            // InternalGo.g:5612:3: this_type_0= ruletype kw= '(' this_expression_2= ruleexpression (kw= ',' )? kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConversionAccess().getTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_type_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_type_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,47,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getConversionAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConversionAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_52);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:5637:3: (kw= ',' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==52) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalGo.g:5638:4: kw= ','
                    {
                    kw=(Token)match(input,52,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConversionAccess().getCommaKeyword_3());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getConversionAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleconversion"

    // $ANTLR start synpred16_InternalGo
    public final void synpred16_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;


        // InternalGo.g:628:4: (kw= ',' this_expression_2= ruleexpression )
        // InternalGo.g:628:4: kw= ',' this_expression_2= ruleexpression
        {
        kw=(Token)match(input,52,FOLLOW_14); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_expression_2=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGo

    // $ANTLR start synpred19_InternalGo
    public final void synpred19_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_function_2 = null;


        // InternalGo.g:778:4: (this_function_2= rulefunction )
        // InternalGo.g:778:4: this_function_2= rulefunction
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionParserRuleCall_2_0());
          			
        }
        pushFollow(FOLLOW_2);
        this_function_2=rulefunction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalGo

    // $ANTLR start synpred20_InternalGo
    public final void synpred20_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_function_3 = null;


        // InternalGo.g:881:4: (this_function_3= rulefunction )
        // InternalGo.g:881:4: this_function_3= rulefunction
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getMethodDeclAccess().getFunctionParserRuleCall_3_0());
          			
        }
        pushFollow(FOLLOW_2);
        this_function_3=rulefunction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalGo

    // $ANTLR start synpred40_InternalGo
    public final void synpred40_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_sendStmt_0 = null;


        // InternalGo.g:1349:3: (this_sendStmt_0= rulesendStmt )
        // InternalGo.g:1349:3: this_sendStmt_0= rulesendStmt
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getSimpleStmtAccess().getSendStmtParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_sendStmt_0=rulesendStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalGo

    // $ANTLR start synpred41_InternalGo
    public final void synpred41_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expressionStmt_1 = null;


        // InternalGo.g:1360:3: (this_expressionStmt_1= ruleexpressionStmt )
        // InternalGo.g:1360:3: this_expressionStmt_1= ruleexpressionStmt
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionStmtParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_expressionStmt_1=ruleexpressionStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalGo

    // $ANTLR start synpred42_InternalGo
    public final void synpred42_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_incDecStmt_2 = null;


        // InternalGo.g:1371:3: (this_incDecStmt_2= ruleincDecStmt )
        // InternalGo.g:1371:3: this_incDecStmt_2= ruleincDecStmt
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getSimpleStmtAccess().getIncDecStmtParserRuleCall_2());
          		
        }
        pushFollow(FOLLOW_2);
        this_incDecStmt_2=ruleincDecStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalGo

    // $ANTLR start synpred43_InternalGo
    public final void synpred43_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_assignment_3 = null;


        // InternalGo.g:1382:3: (this_assignment_3= ruleassignment )
        // InternalGo.g:1382:3: this_assignment_3= ruleassignment
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getSimpleStmtAccess().getAssignmentParserRuleCall_3());
          		
        }
        pushFollow(FOLLOW_2);
        this_assignment_3=ruleassignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalGo

    // $ANTLR start synpred44_InternalGo
    public final void synpred44_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_shortVarDecl_4 = null;


        // InternalGo.g:1393:3: (this_shortVarDecl_4= ruleshortVarDecl )
        // InternalGo.g:1393:3: this_shortVarDecl_4= ruleshortVarDecl
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getSimpleStmtAccess().getShortVarDeclParserRuleCall_4());
          		
        }
        pushFollow(FOLLOW_2);
        this_shortVarDecl_4=ruleshortVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalGo

    // $ANTLR start synpred57_InternalGo
    public final void synpred57_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expressionList_1 = null;


        // InternalGo.g:1801:4: (this_expressionList_1= ruleexpressionList )
        // InternalGo.g:1801:4: this_expressionList_1= ruleexpressionList
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getReturnStmtAccess().getExpressionListParserRuleCall_1());
          			
        }
        pushFollow(FOLLOW_2);
        this_expressionList_1=ruleexpressionList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalGo

    // $ANTLR start synpred60_InternalGo
    public final void synpred60_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_simpleStmt_1 = null;


        // InternalGo.g:1990:4: (this_simpleStmt_1= rulesimpleStmt kw= ';' )
        // InternalGo.g:1990:4: this_simpleStmt_1= rulesimpleStmt kw= ';'
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getIfStmtAccess().getSimpleStmtParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_4);
        this_simpleStmt_1=rulesimpleStmt();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalGo

    // $ANTLR start synpred63_InternalGo
    public final void synpred63_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_exprSwitchStmt_0 = null;


        // InternalGo.g:2075:3: (this_exprSwitchStmt_0= ruleexprSwitchStmt )
        // InternalGo.g:2075:3: this_exprSwitchStmt_0= ruleexprSwitchStmt
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getSwitchStmtAccess().getExprSwitchStmtParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_exprSwitchStmt_0=ruleexprSwitchStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalGo

    // $ANTLR start synpred64_InternalGo
    public final void synpred64_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_simpleStmt_1 = null;


        // InternalGo.g:2121:4: (this_simpleStmt_1= rulesimpleStmt kw= ';' )
        // InternalGo.g:2121:4: this_simpleStmt_1= rulesimpleStmt kw= ';'
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExprSwitchStmtAccess().getSimpleStmtParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_4);
        this_simpleStmt_1=rulesimpleStmt();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalGo

    // $ANTLR start synpred65_InternalGo
    public final void synpred65_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expression_3 = null;


        // InternalGo.g:2138:4: (this_expression_3= ruleexpression )
        // InternalGo.g:2138:4: this_expression_3= ruleexpression
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExprSwitchStmtAccess().getExpressionParserRuleCall_2());
          			
        }
        pushFollow(FOLLOW_2);
        this_expression_3=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalGo

    // $ANTLR start synpred68_InternalGo
    public final void synpred68_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_simpleStmt_1 = null;


        // InternalGo.g:2282:4: (this_simpleStmt_1= rulesimpleStmt kw= ';' )
        // InternalGo.g:2282:4: this_simpleStmt_1= rulesimpleStmt kw= ';'
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getTypeSwitchStmtAccess().getSimpleStmtParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_4);
        this_simpleStmt_1=rulesimpleStmt();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalGo

    // $ANTLR start synpred74_InternalGo
    public final void synpred74_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_sendStmt_1 = null;


        // InternalGo.g:2641:5: (this_sendStmt_1= rulesendStmt )
        // InternalGo.g:2641:5: this_sendStmt_1= rulesendStmt
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getCommCaseAccess().getSendStmtParserRuleCall_0_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        this_sendStmt_1=rulesendStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalGo

    // $ANTLR start synpred76_InternalGo
    public final void synpred76_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_0 = null;


        // InternalGo.g:2690:4: ( (this_expressionList_0= ruleexpressionList kw= '=' ) )
        // InternalGo.g:2690:4: (this_expressionList_0= ruleexpressionList kw= '=' )
        {
        // InternalGo.g:2690:4: (this_expressionList_0= ruleexpressionList kw= '=' )
        // InternalGo.g:2691:5: this_expressionList_0= ruleexpressionList kw= '='
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getRecvStmtAccess().getExpressionListParserRuleCall_0_0_0());
          				
        }
        pushFollow(FOLLOW_13);
        this_expressionList_0=ruleexpressionList();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred76_InternalGo

    // $ANTLR start synpred77_InternalGo
    public final void synpred77_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_identifierList_2 = null;


        // InternalGo.g:2708:4: ( (this_identifierList_2= ruleidentifierList kw= ':=' ) )
        // InternalGo.g:2708:4: (this_identifierList_2= ruleidentifierList kw= ':=' )
        {
        // InternalGo.g:2708:4: (this_identifierList_2= ruleidentifierList kw= ':=' )
        // InternalGo.g:2709:5: this_identifierList_2= ruleidentifierList kw= ':='
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getRecvStmtAccess().getIdentifierListParserRuleCall_0_1_0());
          				
        }
        pushFollow(FOLLOW_27);
        this_identifierList_2=ruleidentifierList();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred77_InternalGo

    // $ANTLR start synpred78_InternalGo
    public final void synpred78_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expression_1 = null;


        // InternalGo.g:2761:4: (this_expression_1= ruleexpression )
        // InternalGo.g:2761:4: this_expression_1= ruleexpression
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getForStmtAccess().getExpressionParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_2);
        this_expression_1=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_InternalGo

    // $ANTLR start synpred79_InternalGo
    public final void synpred79_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_forClause_2 = null;


        // InternalGo.g:2772:4: (this_forClause_2= ruleforClause )
        // InternalGo.g:2772:4: this_forClause_2= ruleforClause
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getForStmtAccess().getForClauseParserRuleCall_1_1());
          			
        }
        pushFollow(FOLLOW_2);
        this_forClause_2=ruleforClause();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalGo

    // $ANTLR start synpred80_InternalGo
    public final void synpred80_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_rangeClause_3 = null;


        // InternalGo.g:2783:4: (this_rangeClause_3= rulerangeClause )
        // InternalGo.g:2783:4: this_rangeClause_3= rulerangeClause
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getForStmtAccess().getRangeClauseParserRuleCall_1_2());
          			
        }
        pushFollow(FOLLOW_2);
        this_rangeClause_3=rulerangeClause();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_InternalGo

    // $ANTLR start synpred81_InternalGo
    public final void synpred81_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_simpleStmt_0 = null;


        // InternalGo.g:2824:4: (this_simpleStmt_0= rulesimpleStmt )
        // InternalGo.g:2824:4: this_simpleStmt_0= rulesimpleStmt
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getForClauseAccess().getSimpleStmtParserRuleCall_0());
          			
        }
        pushFollow(FOLLOW_2);
        this_simpleStmt_0=rulesimpleStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_InternalGo

    // $ANTLR start synpred82_InternalGo
    public final void synpred82_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expression_2 = null;


        // InternalGo.g:2841:4: (this_expression_2= ruleexpression )
        // InternalGo.g:2841:4: this_expression_2= ruleexpression
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getForClauseAccess().getExpressionParserRuleCall_2());
          			
        }
        pushFollow(FOLLOW_2);
        this_expression_2=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_InternalGo

    // $ANTLR start synpred83_InternalGo
    public final void synpred83_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_simpleStmt_4 = null;


        // InternalGo.g:2858:4: (this_simpleStmt_4= rulesimpleStmt )
        // InternalGo.g:2858:4: this_simpleStmt_4= rulesimpleStmt
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getForClauseAccess().getSimpleStmtParserRuleCall_4());
          			
        }
        pushFollow(FOLLOW_2);
        this_simpleStmt_4=rulesimpleStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_InternalGo

    // $ANTLR start synpred88_InternalGo
    public final void synpred88_InternalGo_fragment() throws RecognitionException {   
        Token this_IDENTIFIER_0=null;

        // InternalGo.g:3056:3: (this_IDENTIFIER_0= RULE_IDENTIFIER )
        // InternalGo.g:3056:3: this_IDENTIFIER_0= RULE_IDENTIFIER
        {
        this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalGo

    // $ANTLR start synpred89_InternalGo
    public final void synpred89_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_arrayType_0 = null;


        // InternalGo.g:3093:3: (this_arrayType_0= rulearrayType )
        // InternalGo.g:3093:3: this_arrayType_0= rulearrayType
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getTypeLitAccess().getArrayTypeParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_arrayType_0=rulearrayType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_InternalGo

    // $ANTLR start synpred94_InternalGo
    public final void synpred94_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_sliceType_5 = null;


        // InternalGo.g:3148:3: (this_sliceType_5= rulesliceType )
        // InternalGo.g:3148:3: this_sliceType_5= rulesliceType
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getTypeLitAccess().getSliceTypeParserRuleCall_5());
          		
        }
        pushFollow(FOLLOW_2);
        this_sliceType_5=rulesliceType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_InternalGo

    // $ANTLR start synpred97_InternalGo
    public final void synpred97_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:3481:4: (kw= 'chan' )
        // InternalGo.g:3481:4: kw= 'chan'
        {
        kw=(Token)match(input,93,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_InternalGo

    // $ANTLR start synpred98_InternalGo
    public final void synpred98_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:3487:4: ( (kw= 'chan' kw= '<-' ) )
        // InternalGo.g:3487:4: (kw= 'chan' kw= '<-' )
        {
        // InternalGo.g:3487:4: (kw= 'chan' kw= '<-' )
        // InternalGo.g:3488:5: kw= 'chan' kw= '<-'
        {
        kw=(Token)match(input,93,FOLLOW_24); if (state.failed) return ;
        kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred98_InternalGo

    // $ANTLR start synpred100_InternalGo
    public final void synpred100_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_result_1 = null;


        // InternalGo.g:3636:4: (this_result_1= ruleresult )
        // InternalGo.g:3636:4: this_result_1= ruleresult
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getSignatureAccess().getResultParserRuleCall_1());
          			
        }
        pushFollow(FOLLOW_2);
        this_result_1=ruleresult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_InternalGo

    // $ANTLR start synpred101_InternalGo
    public final void synpred101_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_parameters_0 = null;


        // InternalGo.g:3666:3: (this_parameters_0= ruleparameters )
        // InternalGo.g:3666:3: this_parameters_0= ruleparameters
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getResultAccess().getParametersParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_parameters_0=ruleparameters();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalGo

    // $ANTLR start synpred105_InternalGo
    public final void synpred105_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_identifierList_0 = null;


        // InternalGo.g:3801:4: (this_identifierList_0= ruleidentifierList )
        // InternalGo.g:3801:4: this_identifierList_0= ruleidentifierList
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdentifierListParserRuleCall_0());
          			
        }
        pushFollow(FOLLOW_2);
        this_identifierList_0=ruleidentifierList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_InternalGo

    // $ANTLR start synpred107_InternalGo
    public final void synpred107_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_literal_0 = null;


        // InternalGo.g:3848:3: (this_literal_0= ruleliteral )
        // InternalGo.g:3848:3: this_literal_0= ruleliteral
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_literal_0=ruleliteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_InternalGo

    // $ANTLR start synpred108_InternalGo
    public final void synpred108_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_operandName_1 = null;


        // InternalGo.g:3859:3: (this_operandName_1= ruleoperandName )
        // InternalGo.g:3859:3: this_operandName_1= ruleoperandName
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getOperandAccess().getOperandNameParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_operandName_1=ruleoperandName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_InternalGo

    // $ANTLR start synpred109_InternalGo
    public final void synpred109_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_methodExpr_2 = null;


        // InternalGo.g:3870:3: (this_methodExpr_2= rulemethodExpr )
        // InternalGo.g:3870:3: this_methodExpr_2= rulemethodExpr
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getOperandAccess().getMethodExprParserRuleCall_2());
          		
        }
        pushFollow(FOLLOW_2);
        this_methodExpr_2=rulemethodExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_InternalGo

    // $ANTLR start synpred118_InternalGo
    public final void synpred118_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_arrayType_1 = null;


        // InternalGo.g:4156:3: (this_arrayType_1= rulearrayType )
        // InternalGo.g:4156:3: this_arrayType_1= rulearrayType
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getLiteralTypeAccess().getArrayTypeParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_arrayType_1=rulearrayType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_InternalGo

    // $ANTLR start synpred119_InternalGo
    public final void synpred119_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_elementType_5 = null;


        // InternalGo.g:4167:3: ( (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType ) )
        // InternalGo.g:4167:3: (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType )
        {
        // InternalGo.g:4167:3: (kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType )
        // InternalGo.g:4168:4: kw= '[' kw= '...' kw= ']' this_elementType_5= ruleelementType
        {
        kw=(Token)match(input,89,FOLLOW_54); if (state.failed) return ;
        kw=(Token)match(input,94,FOLLOW_46); if (state.failed) return ;
        kw=(Token)match(input,90,FOLLOW_16); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_elementType_5=ruleelementType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred119_InternalGo

    // $ANTLR start synpred120_InternalGo
    public final void synpred120_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_sliceType_6 = null;


        // InternalGo.g:4195:3: (this_sliceType_6= rulesliceType )
        // InternalGo.g:4195:3: this_sliceType_6= rulesliceType
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getLiteralTypeAccess().getSliceTypeParserRuleCall_3());
          		
        }
        pushFollow(FOLLOW_2);
        this_sliceType_6=rulesliceType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_InternalGo

    // $ANTLR start synpred123_InternalGo
    public final void synpred123_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_elementList_1 = null;


        // InternalGo.g:4252:4: (this_elementList_1= ruleelementList (kw= ',' )? )
        // InternalGo.g:4252:4: this_elementList_1= ruleelementList (kw= ',' )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getLiteralValueAccess().getElementListParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_15);
        this_elementList_1=ruleelementList();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:4262:4: (kw= ',' )?
        int alt107=2;
        int LA107_0 = input.LA(1);

        if ( (LA107_0==52) ) {
            alt107=1;
        }
        switch (alt107) {
            case 1 :
                // InternalGo.g:4263:5: kw= ','
                {
                kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred123_InternalGo

    // $ANTLR start synpred124_InternalGo
    public final void synpred124_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_keyedElement_2 = null;


        // InternalGo.g:4305:4: (kw= ',' this_keyedElement_2= rulekeyedElement )
        // InternalGo.g:4305:4: kw= ',' this_keyedElement_2= rulekeyedElement
        {
        kw=(Token)match(input,52,FOLLOW_36); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_keyedElement_2=rulekeyedElement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_InternalGo

    // $ANTLR start synpred125_InternalGo
    public final void synpred125_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_key_0 = null;


        // InternalGo.g:4341:4: (this_key_0= rulekey kw= ':' )
        // InternalGo.g:4341:4: this_key_0= rulekey kw= ':'
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getKeyedElementAccess().getKeyParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_28);
        this_key_0=rulekey();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_InternalGo

    // $ANTLR start synpred126_InternalGo
    public final void synpred126_InternalGo_fragment() throws RecognitionException {   
        Token this_IDENTIFIER_0=null;

        // InternalGo.g:4386:3: (this_IDENTIFIER_0= RULE_IDENTIFIER )
        // InternalGo.g:4386:3: this_IDENTIFIER_0= RULE_IDENTIFIER
        {
        this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_InternalGo

    // $ANTLR start synpred127_InternalGo
    public final void synpred127_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expression_1 = null;


        // InternalGo.g:4394:3: (this_expression_1= ruleexpression )
        // InternalGo.g:4394:3: this_expression_1= ruleexpression
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getKeyAccess().getExpressionParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_expression_1=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_InternalGo

    // $ANTLR start synpred133_InternalGo
    public final void synpred133_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_operand_0 = null;


        // InternalGo.g:4659:4: (this_operand_0= ruleoperand )
        // InternalGo.g:4659:4: this_operand_0= ruleoperand
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getPrimaryExprAccess().getOperandParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_2);
        this_operand_0=ruleoperand();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_InternalGo

    // $ANTLR start synpred134_InternalGo
    public final void synpred134_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_operand_0 = null;

        AntlrDatatypeRuleToken this_conversion_1 = null;


        // InternalGo.g:4658:3: ( (this_operand_0= ruleoperand | this_conversion_1= ruleconversion ) )
        // InternalGo.g:4658:3: (this_operand_0= ruleoperand | this_conversion_1= ruleconversion )
        {
        // InternalGo.g:4658:3: (this_operand_0= ruleoperand | this_conversion_1= ruleconversion )
        int alt108=2;
        alt108 = dfa108.predict(input);
        switch (alt108) {
            case 1 :
                // InternalGo.g:4659:4: this_operand_0= ruleoperand
                {
                pushFollow(FOLLOW_2);
                this_operand_0=ruleoperand();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalGo.g:4670:4: this_conversion_1= ruleconversion
                {
                if ( state.backtracking==0 ) {

                  				newCompositeNode(grammarAccess.getPrimaryExprAccess().getConversionParserRuleCall_0_1());
                  			
                }
                pushFollow(FOLLOW_2);
                this_conversion_1=ruleconversion();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred134_InternalGo

    // $ANTLR start synpred135_InternalGo
    public final void synpred135_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_primaryExprSelector_2 = null;


        // InternalGo.g:4682:3: (this_primaryExprSelector_2= ruleprimaryExprSelector )
        // InternalGo.g:4682:3: this_primaryExprSelector_2= ruleprimaryExprSelector
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprSelectorParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_primaryExprSelector_2=ruleprimaryExprSelector();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_InternalGo

    // $ANTLR start synpred136_InternalGo
    public final void synpred136_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_primaryExprIndex_3 = null;


        // InternalGo.g:4693:3: (this_primaryExprIndex_3= ruleprimaryExprIndex )
        // InternalGo.g:4693:3: this_primaryExprIndex_3= ruleprimaryExprIndex
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprIndexParserRuleCall_2());
          		
        }
        pushFollow(FOLLOW_2);
        this_primaryExprIndex_3=ruleprimaryExprIndex();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_InternalGo

    // $ANTLR start synpred137_InternalGo
    public final void synpred137_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_primaryExprSlice_4 = null;


        // InternalGo.g:4704:3: (this_primaryExprSlice_4= ruleprimaryExprSlice )
        // InternalGo.g:4704:3: this_primaryExprSlice_4= ruleprimaryExprSlice
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprSliceParserRuleCall_3());
          		
        }
        pushFollow(FOLLOW_2);
        this_primaryExprSlice_4=ruleprimaryExprSlice();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_InternalGo

    // $ANTLR start synpred138_InternalGo
    public final void synpred138_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_primaryExprTypeAssertion_5 = null;


        // InternalGo.g:4715:3: (this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion )
        // InternalGo.g:4715:3: this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprTypeAssertionParserRuleCall_4());
          		
        }
        pushFollow(FOLLOW_2);
        this_primaryExprTypeAssertion_5=ruleprimaryExprTypeAssertion();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_InternalGo

    // $ANTLR start synpred139_InternalGo
    public final void synpred139_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_selector_0 = null;


        // InternalGo.g:4755:3: (this_selector_0= ruleselector )
        // InternalGo.g:4755:3: this_selector_0= ruleselector
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getSelectorParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_selector_0=ruleselector();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_InternalGo

    // $ANTLR start synpred140_InternalGo
    public final void synpred140_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_index_1 = null;


        // InternalGo.g:4766:3: (this_index_1= ruleindex )
        // InternalGo.g:4766:3: this_index_1= ruleindex
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getIndexParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_index_1=ruleindex();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_InternalGo

    // $ANTLR start synpred141_InternalGo
    public final void synpred141_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_slice_2 = null;


        // InternalGo.g:4777:3: (this_slice_2= ruleslice )
        // InternalGo.g:4777:3: this_slice_2= ruleslice
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getSliceParserRuleCall_2());
          		
        }
        pushFollow(FOLLOW_2);
        this_slice_2=ruleslice();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_InternalGo

    // $ANTLR start synpred142_InternalGo
    public final void synpred142_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_typeAssertion_3 = null;


        // InternalGo.g:4788:3: (this_typeAssertion_3= ruletypeAssertion )
        // InternalGo.g:4788:3: this_typeAssertion_3= ruletypeAssertion
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryExprStuffAccess().getTypeAssertionParserRuleCall_3());
          		
        }
        pushFollow(FOLLOW_2);
        this_typeAssertion_3=ruletypeAssertion();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_InternalGo

    // $ANTLR start synpred148_InternalGo
    public final void synpred148_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expression_1 = null;


        // InternalGo.g:5101:6: (this_expression_1= ruleexpression )
        // InternalGo.g:5101:6: this_expression_1= ruleexpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        this_expression_1=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred148_InternalGo

    // $ANTLR start synpred149_InternalGo
    public final void synpred149_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expression_3 = null;


        // InternalGo.g:5118:6: (this_expression_3= ruleexpression )
        // InternalGo.g:5118:6: this_expression_3= ruleexpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_0_2());
          					
        }
        pushFollow(FOLLOW_2);
        this_expression_3=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred149_InternalGo

    // $ANTLR start synpred150_InternalGo
    public final void synpred150_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;


        // InternalGo.g:5099:4: ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) )
        // InternalGo.g:5099:4: ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? )
        {
        // InternalGo.g:5099:4: ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? )
        // InternalGo.g:5100:5: (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )?
        {
        // InternalGo.g:5100:5: (this_expression_1= ruleexpression )?
        int alt109=2;
        int LA109_0 = input.LA(1);

        if ( ((LA109_0>=RULE_IDENTIFIER && LA109_0<=RULE_STRING_LIT)||(LA109_0>=RULE_INT_LIT && LA109_0<=RULE_BINARY_OP)||LA109_0==47||LA109_0==49||LA109_0==54||LA109_0==58||(LA109_0>=61 && LA109_0<=62)||(LA109_0>=64 && LA109_0<=65)||LA109_0==70||LA109_0==89||(LA109_0>=91 && LA109_0<=93)||(LA109_0>=95 && LA109_0<=96)) ) {
            alt109=1;
        }
        else if ( (LA109_0==73) ) {
            int LA109_2 = input.LA(2);

            if ( (synpred148_InternalGo()) ) {
                alt109=1;
            }
        }
        switch (alt109) {
            case 1 :
                // InternalGo.g:5101:6: this_expression_1= ruleexpression
                {
                pushFollow(FOLLOW_28);
                this_expression_1=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        kw=(Token)match(input,73,FOLLOW_30); if (state.failed) return ;
        // InternalGo.g:5117:5: (this_expression_3= ruleexpression )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( ((LA110_0>=RULE_IDENTIFIER && LA110_0<=RULE_STRING_LIT)||(LA110_0>=RULE_INT_LIT && LA110_0<=RULE_BINARY_OP)||LA110_0==47||LA110_0==49||LA110_0==54||LA110_0==58||(LA110_0>=61 && LA110_0<=62)||(LA110_0>=64 && LA110_0<=65)||LA110_0==70||LA110_0==89||(LA110_0>=91 && LA110_0<=93)||(LA110_0>=95 && LA110_0<=96)) ) {
            alt110=1;
        }
        else if ( (LA110_0==EOF) ) {
            int LA110_2 = input.LA(2);

            if ( (synpred149_InternalGo()) ) {
                alt110=1;
            }
        }
        switch (alt110) {
            case 1 :
                // InternalGo.g:5118:6: this_expression_3= ruleexpression
                {
                pushFollow(FOLLOW_2);
                this_expression_3=ruleexpression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred150_InternalGo

    // $ANTLR start synpred151_InternalGo
    public final void synpred151_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expression_4 = null;


        // InternalGo.g:5133:6: (this_expression_4= ruleexpression )
        // InternalGo.g:5133:6: this_expression_4= ruleexpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSliceAccess().getExpressionParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        this_expression_4=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred151_InternalGo

    // $ANTLR start synpred152_InternalGo
    public final void synpred152_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_expressionList_1 = null;


        // InternalGo.g:5251:5: (this_expressionList_1= ruleexpressionList )
        // InternalGo.g:5251:5: this_expressionList_1= ruleexpressionList
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        this_expressionList_1=ruleexpressionList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred152_InternalGo

    // $ANTLR start synpred153_InternalGo
    public final void synpred153_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_4 = null;


        // InternalGo.g:5274:7: (kw= ',' this_expressionList_4= ruleexpressionList )
        // InternalGo.g:5274:7: kw= ',' this_expressionList_4= ruleexpressionList
        {
        kw=(Token)match(input,52,FOLLOW_14); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_expressionList_4=ruleexpressionList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred153_InternalGo

    // $ANTLR start synpred156_InternalGo
    public final void synpred156_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_expressionList_1 = null;

        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_expressionList_4 = null;


        // InternalGo.g:5250:4: ( (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )? )
        // InternalGo.g:5250:4: (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) ) (kw= '...' )? (kw= ',' )?
        {
        // InternalGo.g:5250:4: (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) )
        int alt112=2;
        alt112 = dfa112.predict(input);
        switch (alt112) {
            case 1 :
                // InternalGo.g:5251:5: this_expressionList_1= ruleexpressionList
                {
                pushFollow(FOLLOW_66);
                this_expressionList_1=ruleexpressionList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalGo.g:5262:5: (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? )
                {
                // InternalGo.g:5262:5: (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? )
                // InternalGo.g:5263:6: this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )?
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getArgumentsAccess().getTypeParserRuleCall_1_0_1_0());
                  					
                }
                pushFollow(FOLLOW_66);
                this_type_2=ruletype();

                state._fsp--;
                if (state.failed) return ;
                // InternalGo.g:5273:6: (kw= ',' this_expressionList_4= ruleexpressionList )?
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==52) ) {
                    int LA111_1 = input.LA(2);

                    if ( (synpred153_InternalGo()) ) {
                        alt111=1;
                    }
                }
                switch (alt111) {
                    case 1 :
                        // InternalGo.g:5274:7: kw= ',' this_expressionList_4= ruleexpressionList
                        {
                        kw=(Token)match(input,52,FOLLOW_14); if (state.failed) return ;
                        pushFollow(FOLLOW_66);
                        this_expressionList_4=ruleexpressionList();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;

        }

        // InternalGo.g:5292:4: (kw= '...' )?
        int alt113=2;
        int LA113_0 = input.LA(1);

        if ( (LA113_0==94) ) {
            alt113=1;
        }
        switch (alt113) {
            case 1 :
                // InternalGo.g:5293:5: kw= '...'
                {
                kw=(Token)match(input,94,FOLLOW_15); if (state.failed) return ;

                }
                break;

        }

        // InternalGo.g:5299:4: (kw= ',' )?
        int alt114=2;
        int LA114_0 = input.LA(1);

        if ( (LA114_0==52) ) {
            alt114=1;
        }
        switch (alt114) {
            case 1 :
                // InternalGo.g:5300:5: kw= ','
                {
                kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred156_InternalGo

    // $ANTLR start synpred160_InternalGo
    public final void synpred160_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_primaryExpr_0 = null;


        // InternalGo.g:5527:3: (this_primaryExpr_0= ruleprimaryExpr )
        // InternalGo.g:5527:3: this_primaryExpr_0= ruleprimaryExpr
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getUnaryExprAccess().getPrimaryExprParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_primaryExpr_0=ruleprimaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred160_InternalGo

    // Delegated rules

    public final boolean synpred150_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred150_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred160_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred160_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred148_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA112 dfa112 = new DFA112(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\3\1\uffff\1\3\16\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\13\16\uffff";
    static final String dfa_4s = "\1\140\1\uffff\1\111\16\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\2";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\7\3\40\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\1\2\3\1\1\1\3\1\1\1\12\1\uffff\16\3\2\uffff\1\5\1\6\1\7\1\10\1\11\1\17\1\13\1\uffff\1\14\2\uffff\1\15\1\16\1\uffff\1\4\1\3\1\uffff\3\3\1\uffff\2\3",
            "",
            "\1\3\40\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\2\3\3\uffff\1\3\1\uffff\17\3\1\20",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1165:2: (this_declaration_0= ruledeclaration | this_labeledStmt_1= rulelabeledStmt | this_simpleStmt_2= rulesimpleStmt | this_goStmt_3= rulegoStmt | this_returnStmt_4= rulereturnStmt | this_breakStmt_5= rulebreakStmt | this_continueStmt_6= rulecontinueStmt | this_gotoStmt_7= rulegotoStmt | this_fallthroughStmt_8= rulefallthroughStmt | this_block_9= ruleblock | this_ifStmt_10= ruleifStmt | this_switchStmt_11= ruleswitchStmt | this_selectStmt_12= ruleselectStmt | this_forStmt_13= ruleforStmt | this_deferStmt_14= ruledeferStmt )";
        }
    }
    static final String dfa_8s = "\47\uffff";
    static final String dfa_9s = "\1\27\46\uffff";
    static final String dfa_10s = "\1\4\26\0\20\uffff";
    static final String dfa_11s = "\1\140\26\0\20\uffff";
    static final String dfa_12s = "\27\uffff\1\2\2\uffff\1\3\1\uffff\1\4\7\uffff\1\6\1\1\1\5";
    static final String dfa_13s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\20\uffff}>";
    static final String[] dfa_14s = {
            "\1\11\1\5\1\44\1\1\1\2\1\3\1\4\1\21\40\uffff\1\27\2\uffff\1\13\1\uffff\1\20\1\uffff\2\34\1\uffff\1\12\1\uffff\1\27\1\uffff\1\17\2\32\1\22\1\23\1\34\1\25\1\14\4\34\1\26\1\34\21\uffff\1\7\1\uffff\1\15\1\10\1\16\1\uffff\1\6\1\24",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1348:2: (this_sendStmt_0= rulesendStmt | this_expressionStmt_1= ruleexpressionStmt | this_incDecStmt_2= ruleincDecStmt | this_assignment_3= ruleassignment | this_shortVarDecl_4= ruleshortVarDecl | this_emptyStmt_5= ruleemptyStmt )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                        else if ( (synpred44_InternalGo()) ) {s = 38;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA24_12 = input.LA(1);

                         
                        int index24_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA24_13 = input.LA(1);

                         
                        int index24_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA24_14 = input.LA(1);

                         
                        int index24_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA24_15 = input.LA(1);

                         
                        int index24_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA24_16 = input.LA(1);

                         
                        int index24_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA24_17 = input.LA(1);

                         
                        int index24_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA24_18 = input.LA(1);

                         
                        int index24_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA24_19 = input.LA(1);

                         
                        int index24_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA24_20 = input.LA(1);

                         
                        int index24_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA24_21 = input.LA(1);

                         
                        int index24_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA24_22 = input.LA(1);

                         
                        int index24_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 37;}

                        else if ( (synpred41_InternalGo()) ) {s = 23;}

                        else if ( (synpred42_InternalGo()) ) {s = 26;}

                        else if ( (synpred43_InternalGo()) ) {s = 28;}

                         
                        input.seek(index24_22);
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
    static final String dfa_15s = "\44\uffff";
    static final String dfa_16s = "\1\4\26\0\15\uffff";
    static final String dfa_17s = "\1\140\26\0\15\uffff";
    static final String dfa_18s = "\27\uffff\1\1\13\uffff\1\2";
    static final String dfa_19s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\15\uffff}>";
    static final String[] dfa_20s = {
            "\1\11\1\5\1\27\1\1\1\2\1\3\1\4\1\21\40\uffff\1\27\2\uffff\1\13\1\uffff\1\20\1\uffff\2\27\1\uffff\1\12\1\uffff\1\43\1\uffff\1\17\2\27\1\22\1\23\1\27\1\25\1\14\4\27\1\26\1\27\21\uffff\1\7\1\uffff\1\15\1\10\1\16\1\uffff\1\6\1\24",
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

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1989:3: (this_simpleStmt_1= rulesimpleStmt kw= ';' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_9 = input.LA(1);

                         
                        int index30_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA30_10 = input.LA(1);

                         
                        int index30_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA30_11 = input.LA(1);

                         
                        int index30_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA30_12 = input.LA(1);

                         
                        int index30_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA30_13 = input.LA(1);

                         
                        int index30_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA30_14 = input.LA(1);

                         
                        int index30_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA30_15 = input.LA(1);

                         
                        int index30_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA30_16 = input.LA(1);

                         
                        int index30_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA30_17 = input.LA(1);

                         
                        int index30_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA30_18 = input.LA(1);

                         
                        int index30_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA30_19 = input.LA(1);

                         
                        int index30_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA30_20 = input.LA(1);

                         
                        int index30_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA30_21 = input.LA(1);

                         
                        int index30_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA30_22 = input.LA(1);

                         
                        int index30_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index30_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2120:3: (this_simpleStmt_1= rulesimpleStmt kw= ';' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_16 = input.LA(1);

                         
                        int index34_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_17 = input.LA(1);

                         
                        int index34_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA34_18 = input.LA(1);

                         
                        int index34_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA34_19 = input.LA(1);

                         
                        int index34_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA34_20 = input.LA(1);

                         
                        int index34_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA34_21 = input.LA(1);

                         
                        int index34_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA34_22 = input.LA(1);

                         
                        int index34_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index34_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\1\4\20\0\23\uffff";
    static final String dfa_22s = "\1\140\20\0\23\uffff";
    static final String dfa_23s = "\21\uffff\1\1\21\uffff\1\2";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\23\uffff}>";
    static final String[] dfa_25s = {
            "\1\11\1\5\1\21\1\1\1\2\1\3\1\4\1\21\40\uffff\1\21\2\uffff\1\13\1\uffff\1\20\1\uffff\2\21\1\uffff\1\12\3\uffff\1\17\6\21\1\14\6\21\21\uffff\1\7\1\uffff\1\15\1\10\1\16\1\uffff\1\6\1\21",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2281:3: (this_simpleStmt_1= rulesimpleStmt kw= ';' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA38_10 = input.LA(1);

                         
                        int index38_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA38_11 = input.LA(1);

                         
                        int index38_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA38_12 = input.LA(1);

                         
                        int index38_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA38_13 = input.LA(1);

                         
                        int index38_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA38_14 = input.LA(1);

                         
                        int index38_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA38_15 = input.LA(1);

                         
                        int index38_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA38_16 = input.LA(1);

                         
                        int index38_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index38_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\34\uffff";
    static final String dfa_27s = "\1\27\33\uffff";
    static final String dfa_28s = "\1\4\26\0\5\uffff";
    static final String dfa_29s = "\1\140\26\0\5\uffff";
    static final String dfa_30s = "\27\uffff\1\2\3\uffff\1\1";
    static final String dfa_31s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\5\uffff}>";
    static final String[] dfa_32s = {
            "\1\11\1\5\1\uffff\1\1\1\2\1\3\1\4\1\21\43\uffff\1\13\1\uffff\1\20\1\uffff\2\27\1\uffff\1\12\3\uffff\1\17\2\uffff\1\22\1\23\1\uffff\1\25\1\14\4\uffff\1\26\2\uffff\1\27\17\uffff\1\7\1\uffff\1\15\1\10\1\16\1\uffff\1\6\1\24",
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

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2640:4: (this_sendStmt_1= rulesendStmt | this_recvStmt_2= rulerecvStmt )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_4 = input.LA(1);

                         
                        int index44_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_8 = input.LA(1);

                         
                        int index44_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA44_15 = input.LA(1);

                         
                        int index44_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA44_16 = input.LA(1);

                         
                        int index44_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA44_17 = input.LA(1);

                         
                        int index44_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA44_18 = input.LA(1);

                         
                        int index44_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA44_19 = input.LA(1);

                         
                        int index44_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA44_20 = input.LA(1);

                         
                        int index44_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA44_21 = input.LA(1);

                         
                        int index44_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA44_22 = input.LA(1);

                         
                        int index44_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index44_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\1\31\33\uffff";
    static final String dfa_34s = "\1\4\21\0\2\uffff\5\0\3\uffff";
    static final String dfa_35s = "\1\140\21\0\2\uffff\5\0\3\uffff";
    static final String dfa_36s = "\22\uffff\1\1\6\uffff\1\3\1\uffff\1\2";
    static final String dfa_37s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff\1\21\1\22\1\23\1\24\1\25\3\uffff}>";
    static final String[] dfa_38s = {
            "\1\11\1\5\1\uffff\1\1\1\2\1\3\1\4\1\21\43\uffff\1\13\1\uffff\1\20\1\uffff\2\22\1\uffff\1\12\3\uffff\1\17\2\uffff\1\24\1\25\1\uffff\1\27\1\14\4\uffff\1\30\2\uffff\1\31\17\uffff\1\7\1\uffff\1\15\1\10\1\16\1\uffff\1\6\1\26",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_26;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "2689:3: ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_3 = input.LA(1);

                         
                        int index46_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_4 = input.LA(1);

                         
                        int index46_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_5 = input.LA(1);

                         
                        int index46_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_7 = input.LA(1);

                         
                        int index46_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_8 = input.LA(1);

                         
                        int index46_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA46_9 = input.LA(1);

                         
                        int index46_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (synpred77_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA46_10 = input.LA(1);

                         
                        int index46_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA46_11 = input.LA(1);

                         
                        int index46_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA46_12 = input.LA(1);

                         
                        int index46_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA46_13 = input.LA(1);

                         
                        int index46_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA46_14 = input.LA(1);

                         
                        int index46_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA46_15 = input.LA(1);

                         
                        int index46_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA46_16 = input.LA(1);

                         
                        int index46_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA46_17 = input.LA(1);

                         
                        int index46_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA46_20 = input.LA(1);

                         
                        int index46_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA46_21 = input.LA(1);

                         
                        int index46_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA46_22 = input.LA(1);

                         
                        int index46_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA46_23 = input.LA(1);

                         
                        int index46_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_23);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA46_24 = input.LA(1);

                         
                        int index46_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index46_24);
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
    static final String dfa_39s = "\1\4\27\0\3\uffff\1\0\6\uffff\1\0\4\uffff";
    static final String dfa_40s = "\1\140\27\0\3\uffff\1\0\6\uffff\1\0\4\uffff";
    static final String dfa_41s = "\30\uffff\1\2\13\uffff\1\3\1\1\1\4";
    static final String dfa_42s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\3\uffff\1\27\6\uffff\1\30\4\uffff}>";
    static final String[] dfa_43s = {
            "\1\11\1\5\1\30\1\1\1\2\1\3\1\4\1\21\40\uffff\1\30\2\uffff\1\13\1\uffff\1\20\1\uffff\1\42\1\33\1\uffff\1\12\1\uffff\1\22\1\uffff\1\17\2\30\1\23\1\24\1\30\1\26\1\14\4\30\1\27\1\30\17\uffff\1\44\1\uffff\1\7\1\uffff\1\15\1\10\1\16\1\uffff\1\6\1\25",
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
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "2760:3: (this_expression_1= ruleexpression | this_forClause_2= ruleforClause | this_rangeClause_3= rulerangeClause )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_4 = input.LA(1);

                         
                        int index47_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_8 = input.LA(1);

                         
                        int index47_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_9 = input.LA(1);

                         
                        int index47_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_10 = input.LA(1);

                         
                        int index47_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_11 = input.LA(1);

                         
                        int index47_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_12 = input.LA(1);

                         
                        int index47_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_13 = input.LA(1);

                         
                        int index47_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA47_14 = input.LA(1);

                         
                        int index47_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA47_15 = input.LA(1);

                         
                        int index47_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA47_16 = input.LA(1);

                         
                        int index47_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA47_17 = input.LA(1);

                         
                        int index47_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA47_18 = input.LA(1);

                         
                        int index47_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index47_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA47_19 = input.LA(1);

                         
                        int index47_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA47_20 = input.LA(1);

                         
                        int index47_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA47_21 = input.LA(1);

                         
                        int index47_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA47_22 = input.LA(1);

                         
                        int index47_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA47_23 = input.LA(1);

                         
                        int index47_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalGo()) ) {s = 37;}

                        else if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA47_27 = input.LA(1);

                         
                        int index47_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_27);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA47_34 = input.LA(1);

                         
                        int index47_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalGo()) ) {s = 24;}

                        else if ( (synpred80_InternalGo()) ) {s = 36;}

                         
                        input.seek(index47_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\7\uffff";
    static final String dfa_45s = "\1\4\1\uffff\1\13\1\uffff\1\4\1\uffff\1\13";
    static final String dfa_46s = "\1\140\1\uffff\1\110\1\uffff\1\140\1\uffff\1\110";
    static final String dfa_47s = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\uffff";
    static final String dfa_48s = "\7\uffff}>";
    static final String[] dfa_49s = {
            "\1\2\1\1\1\uffff\5\1\43\uffff\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\2\uffff\2\1\1\uffff\2\1\4\uffff\1\1\20\uffff\1\3\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1",
            "",
            "\1\1\43\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\4\3\uffff\1\1\17\uffff\1\5",
            "",
            "\1\6\1\1\1\uffff\5\1\43\uffff\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\2\uffff\2\1\1\uffff\2\1\4\uffff\1\1\22\uffff\1\1\1\uffff\3\1\1\uffff\2\1",
            "",
            "\1\1\43\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\4\3\uffff\1\1\17\uffff\1\5"
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2888:3: ( (this_expressionList_0= ruleexpressionList kw= '=' ) | (this_identifierList_2= ruleidentifierList kw= ':=' ) )?";
        }
    }
    static final String dfa_50s = "\13\uffff";
    static final String dfa_51s = "\1\66\1\0\11\uffff";
    static final String dfa_52s = "\1\137\1\0\11\uffff";
    static final String dfa_53s = "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\uffff\1\1\1\6";
    static final String dfa_54s = "\1\uffff\1\0\11\uffff}>";
    static final String[] dfa_55s = {
            "\1\4\3\uffff\1\7\6\uffff\1\3\27\uffff\1\1\1\uffff\1\5\1\6\1\7\1\uffff\1\2",
            "\1\uffff",
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

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_50;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "3092:2: (this_arrayType_0= rulearrayType | this_structType_1= rulestructType | this_pointerType_2= rulepointerType | this_functionType_3= rulefunctionType | this_interfaceType_4= ruleinterfaceType | this_sliceType_5= rulesliceType | this_mapType_6= rulemapType | this_channelType_7= rulechannelType )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalGo()) ) {s = 9;}

                        else if ( (synpred94_InternalGo()) ) {s = 10;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_56s = "\25\uffff";
    static final String dfa_57s = "\1\13\24\uffff";
    static final String dfa_58s = "\1\4\1\0\23\uffff";
    static final String dfa_59s = "\1\137\1\0\23\uffff";
    static final String dfa_60s = "\2\uffff\1\1\10\uffff\1\2\11\uffff";
    static final String dfa_61s = "\1\uffff\1\0\23\uffff}>";
    static final String[] dfa_62s = {
            "\1\2\1\13\46\uffff\1\13\2\uffff\1\1\1\13\2\uffff\2\13\1\uffff\1\2\1\uffff\1\13\1\uffff\1\2\6\uffff\1\2\7\uffff\1\13\17\uffff\1\2\1\13\3\2\1\13\1\2",
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

    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_56;
            this.eof = dfa_57;
            this.min = dfa_58;
            this.max = dfa_59;
            this.accept = dfa_60;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "3635:3: (this_result_1= ruleresult )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_63s = "\14\uffff";
    static final String dfa_64s = "\1\4\1\0\12\uffff";
    static final String dfa_65s = "\1\137\1\0\12\uffff";
    static final String dfa_66s = "\2\uffff\1\2\10\uffff\1\1";
    static final String dfa_67s = "\1\uffff\1\0\12\uffff}>";
    static final String[] dfa_68s = {
            "\1\2\52\uffff\1\1\6\uffff\1\2\3\uffff\1\2\6\uffff\1\2\27\uffff\1\2\1\uffff\3\2\1\uffff\1\2",
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
            ""
    };

    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[][] dfa_68 = unpackEncodedStringArray(dfa_68s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_63;
            this.eof = dfa_63;
            this.min = dfa_64;
            this.max = dfa_65;
            this.accept = dfa_66;
            this.special = dfa_67;
            this.transition = dfa_68;
        }
        public String getDescription() {
            return "3665:2: (this_parameters_0= ruleparameters | this_type_1= ruletype )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_69s = "\17\uffff";
    static final String dfa_70s = "\1\4\10\uffff\1\0\1\uffff\1\0\3\uffff";
    static final String dfa_71s = "\1\137\10\uffff\1\0\1\uffff\1\0\3\uffff";
    static final String dfa_72s = "\1\uffff\1\1\12\uffff\1\2\1\3\1\4";
    static final String dfa_73s = "\11\uffff\1\0\1\uffff\1\1\3\uffff}>";
    static final String[] dfa_74s = {
            "\1\11\1\1\1\uffff\4\1\44\uffff\1\13\6\uffff\1\1\42\uffff\1\1\2\uffff\1\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[][] dfa_74 = unpackEncodedStringArray(dfa_74s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_69;
            this.eof = dfa_69;
            this.min = dfa_70;
            this.max = dfa_71;
            this.accept = dfa_72;
            this.special = dfa_73;
            this.transition = dfa_74;
        }
        public String getDescription() {
            return "3847:2: (this_literal_0= ruleliteral | this_operandName_1= ruleoperandName | this_methodExpr_2= rulemethodExpr | (kw= '(' this_expression_4= ruleexpression kw= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_9 = input.LA(1);

                         
                        int index65_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred107_InternalGo()) ) {s = 1;}

                        else if ( (synpred108_InternalGo()) ) {s = 12;}

                        else if ( (synpred109_InternalGo()) ) {s = 13;}

                         
                        input.seek(index65_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_11 = input.LA(1);

                         
                        int index65_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalGo()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index65_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_75s = "\1\4\21\0\1\uffff\6\0\3\uffff";
    static final String dfa_76s = "\1\140\21\0\1\uffff\6\0\3\uffff";
    static final String dfa_77s = "\22\uffff\1\1\6\uffff\1\2\2\uffff";
    static final String dfa_78s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\3\uffff}>";
    static final String[] dfa_79s = {
            "\1\1\1\6\1\uffff\1\2\1\3\1\4\1\5\1\21\43\uffff\1\13\1\uffff\1\20\2\uffff\1\31\1\uffff\1\12\1\uffff\1\30\1\31\1\17\2\uffff\1\23\1\24\1\uffff\1\26\1\14\4\uffff\1\27\2\uffff\1\22\17\uffff\1\10\1\uffff\1\15\1\11\1\16\1\uffff\1\7\1\25",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_26;
            this.eof = dfa_33;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "4340:3: (this_key_0= rulekey kw= ':' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalGo()) ) {s = 18;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_80s = "\55\uffff";
    static final String dfa_81s = "\1\21\54\uffff";
    static final String dfa_82s = "\1\4\6\uffff\1\0\3\uffff\2\0\2\uffff\31\0\5\uffff";
    static final String dfa_83s = "\1\137\6\uffff\1\0\3\uffff\2\0\2\uffff\31\0\5\uffff";
    static final String dfa_84s = "\1\uffff\1\1\46\uffff\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_85s = "\7\uffff\1\0\3\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\5\uffff}>";
    static final String[] dfa_86s = {
            "\2\1\1\uffff\4\1\1\22\40\uffff\1\24\2\uffff\1\13\1\43\1\20\1\uffff\1\37\1\23\1\uffff\1\1\1\uffff\1\40\1\47\1\17\1\44\1\45\1\25\1\26\1\27\1\30\1\14\1\31\1\32\1\33\1\34\1\35\1\36\1\uffff\1\41\17\uffff\1\7\1\46\3\1\1\42\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final char[] dfa_82 = DFA.unpackEncodedStringToUnsignedChars(dfa_82s);
    static final char[] dfa_83 = DFA.unpackEncodedStringToUnsignedChars(dfa_83s);
    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[][] dfa_86 = unpackEncodedStringArray(dfa_86s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_80;
            this.eof = dfa_81;
            this.min = dfa_82;
            this.max = dfa_83;
            this.accept = dfa_84;
            this.special = dfa_85;
            this.transition = dfa_86;
        }
        public String getDescription() {
            return "4657:2: ( (this_operand_0= ruleoperand | this_conversion_1= ruleconversion ) | this_primaryExprSelector_2= ruleprimaryExprSelector | this_primaryExprIndex_3= ruleprimaryExprIndex | this_primaryExprSlice_4= ruleprimaryExprSlice | this_primaryExprTypeAssertion_5= ruleprimaryExprTypeAssertion | this_primaryExprArguments_6= ruleprimaryExprArguments )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_InternalGo()) ) {s = 1;}

                        else if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_InternalGo()) ) {s = 1;}

                        else if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_InternalGo()) ) {s = 1;}

                        else if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_InternalGo()) ) {s = 1;}

                        else if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_30 = input.LA(1);

                         
                        int index81_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_30);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_31 = input.LA(1);

                         
                        int index81_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_31);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_32 = input.LA(1);

                         
                        int index81_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_32);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_33 = input.LA(1);

                         
                        int index81_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_33);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_34 = input.LA(1);

                         
                        int index81_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_34);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_35 = input.LA(1);

                         
                        int index81_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_35);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA81_36 = input.LA(1);

                         
                        int index81_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_36);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA81_37 = input.LA(1);

                         
                        int index81_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_37);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA81_38 = input.LA(1);

                         
                        int index81_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_38);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA81_39 = input.LA(1);

                         
                        int index81_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalGo()) ) {s = 40;}

                        else if ( (synpred136_InternalGo()) ) {s = 41;}

                        else if ( (synpred137_InternalGo()) ) {s = 42;}

                        else if ( (synpred138_InternalGo()) ) {s = 43;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index81_39);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_87s = "\20\uffff";
    static final String dfa_88s = "\1\4\5\uffff\6\0\4\uffff";
    static final String dfa_89s = "\1\137\5\uffff\6\0\4\uffff";
    static final String dfa_90s = "\1\uffff\1\1\12\uffff\1\2\3\uffff";
    static final String dfa_91s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\4\uffff}>";
    static final String[] dfa_92s = {
            "\1\11\1\1\1\uffff\4\1\44\uffff\1\13\6\uffff\1\12\3\uffff\1\14\6\uffff\1\14\27\uffff\1\7\1\uffff\1\14\1\10\1\14\1\uffff\1\6",
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
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_87 = DFA.unpackEncodedString(dfa_87s);
    static final char[] dfa_88 = DFA.unpackEncodedStringToUnsignedChars(dfa_88s);
    static final char[] dfa_89 = DFA.unpackEncodedStringToUnsignedChars(dfa_89s);
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final short[] dfa_91 = DFA.unpackEncodedString(dfa_91s);
    static final short[][] dfa_92 = unpackEncodedStringArray(dfa_92s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_87;
            this.eof = dfa_87;
            this.min = dfa_88;
            this.max = dfa_89;
            this.accept = dfa_90;
            this.special = dfa_91;
            this.transition = dfa_92;
        }
        public String getDescription() {
            return "4658:3: (this_operand_0= ruleoperand | this_conversion_1= ruleconversion )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_6 = input.LA(1);

                         
                        int index80_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index80_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_7 = input.LA(1);

                         
                        int index80_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index80_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_9 = input.LA(1);

                         
                        int index80_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index80_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_10 = input.LA(1);

                         
                        int index80_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index80_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_11 = input.LA(1);

                         
                        int index80_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index80_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_93s = "\32\uffff";
    static final String dfa_94s = "\1\4\27\0\2\uffff";
    static final String dfa_95s = "\1\140\27\0\2\uffff";
    static final String dfa_96s = "\30\uffff\1\1\1\2";
    static final String dfa_97s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\2\uffff}>";
    static final String[] dfa_98s = {
            "\1\11\1\5\1\uffff\1\1\1\2\1\3\1\4\1\21\43\uffff\1\13\1\uffff\1\20\4\uffff\1\12\3\uffff\1\17\2\uffff\1\23\1\24\1\uffff\1\26\1\14\4\uffff\1\27\2\uffff\1\22\17\uffff\1\7\1\uffff\1\15\1\10\1\16\1\uffff\1\6\1\25",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_93 = DFA.unpackEncodedString(dfa_93s);
    static final char[] dfa_94 = DFA.unpackEncodedStringToUnsignedChars(dfa_94s);
    static final char[] dfa_95 = DFA.unpackEncodedStringToUnsignedChars(dfa_95s);
    static final short[] dfa_96 = DFA.unpackEncodedString(dfa_96s);
    static final short[] dfa_97 = DFA.unpackEncodedString(dfa_97s);
    static final short[][] dfa_98 = unpackEncodedStringArray(dfa_98s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_93;
            this.eof = dfa_93;
            this.min = dfa_94;
            this.max = dfa_95;
            this.accept = dfa_96;
            this.special = dfa_97;
            this.transition = dfa_98;
        }
        public String getDescription() {
            return "5098:3: ( ( (this_expression_1= ruleexpression )? kw= ':' (this_expression_3= ruleexpression )? ) | ( (this_expression_4= ruleexpression )? kw= ':' this_expression_6= ruleexpression kw= ':' this_expression_8= ruleexpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA91_2 = input.LA(1);

                         
                        int index91_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA91_3 = input.LA(1);

                         
                        int index91_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA91_4 = input.LA(1);

                         
                        int index91_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA91_5 = input.LA(1);

                         
                        int index91_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA91_6 = input.LA(1);

                         
                        int index91_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA91_7 = input.LA(1);

                         
                        int index91_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA91_8 = input.LA(1);

                         
                        int index91_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA91_9 = input.LA(1);

                         
                        int index91_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA91_10 = input.LA(1);

                         
                        int index91_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA91_11 = input.LA(1);

                         
                        int index91_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA91_12 = input.LA(1);

                         
                        int index91_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA91_13 = input.LA(1);

                         
                        int index91_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA91_14 = input.LA(1);

                         
                        int index91_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA91_15 = input.LA(1);

                         
                        int index91_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA91_16 = input.LA(1);

                         
                        int index91_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA91_17 = input.LA(1);

                         
                        int index91_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA91_18 = input.LA(1);

                         
                        int index91_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA91_19 = input.LA(1);

                         
                        int index91_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA91_20 = input.LA(1);

                         
                        int index91_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA91_21 = input.LA(1);

                         
                        int index91_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA91_22 = input.LA(1);

                         
                        int index91_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA91_23 = input.LA(1);

                         
                        int index91_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred150_InternalGo()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_99s = "\33\uffff";
    static final String dfa_100s = "\1\4\5\uffff\12\0\13\uffff";
    static final String dfa_101s = "\1\140\5\uffff\12\0\13\uffff";
    static final String dfa_102s = "\1\uffff\1\1\30\uffff\1\2";
    static final String dfa_103s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\13\uffff}>";
    static final String[] dfa_104s = {
            "\1\11\1\1\1\uffff\5\1\43\uffff\1\13\2\1\2\uffff\1\1\1\uffff\1\12\3\uffff\1\17\2\uffff\2\1\1\uffff\1\1\1\14\4\uffff\1\1\22\uffff\1\7\1\uffff\1\15\1\10\1\16\1\1\1\6\1\1",
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

    static final short[] dfa_99 = DFA.unpackEncodedString(dfa_99s);
    static final char[] dfa_100 = DFA.unpackEncodedStringToUnsignedChars(dfa_100s);
    static final char[] dfa_101 = DFA.unpackEncodedStringToUnsignedChars(dfa_101s);
    static final short[] dfa_102 = DFA.unpackEncodedString(dfa_102s);
    static final short[] dfa_103 = DFA.unpackEncodedString(dfa_103s);
    static final short[][] dfa_104 = unpackEncodedStringArray(dfa_104s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_99;
            this.eof = dfa_99;
            this.min = dfa_100;
            this.max = dfa_101;
            this.accept = dfa_102;
            this.special = dfa_103;
            this.transition = dfa_104;
        }
        public String getDescription() {
            return "5250:4: (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = dfa_87;
            this.eof = dfa_87;
            this.min = dfa_88;
            this.max = dfa_89;
            this.accept = dfa_90;
            this.special = dfa_91;
            this.transition = dfa_92;
        }
        public String getDescription() {
            return "4658:3: (this_operand_0= ruleoperand | this_conversion_1= ruleconversion )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_6 = input.LA(1);

                         
                        int index108_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index108_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA108_7 = input.LA(1);

                         
                        int index108_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index108_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA108_8 = input.LA(1);

                         
                        int index108_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index108_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA108_9 = input.LA(1);

                         
                        int index108_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index108_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA108_10 = input.LA(1);

                         
                        int index108_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index108_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA108_11 = input.LA(1);

                         
                        int index108_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index108_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_105s = "\1\1\32\uffff";
    static final String[] dfa_106s = {
            "\1\11\1\1\1\uffff\5\1\43\uffff\1\13\1\uffff\1\1\2\uffff\1\1\1\uffff\1\12\3\uffff\1\17\2\uffff\2\1\1\uffff\1\1\1\14\4\uffff\1\1\22\uffff\1\7\1\uffff\1\15\1\10\1\16\1\1\1\6\1\1",
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
    static final short[] dfa_105 = DFA.unpackEncodedString(dfa_105s);
    static final short[][] dfa_106 = unpackEncodedStringArray(dfa_106s);

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = dfa_99;
            this.eof = dfa_105;
            this.min = dfa_100;
            this.max = dfa_101;
            this.accept = dfa_102;
            this.special = dfa_103;
            this.transition = dfa_106;
        }
        public String getDescription() {
            return "5250:4: (this_expressionList_1= ruleexpressionList | (this_type_2= ruletype (kw= ',' this_expressionList_4= ruleexpressionList )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_6 = input.LA(1);

                         
                        int index112_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_7 = input.LA(1);

                         
                        int index112_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA112_8 = input.LA(1);

                         
                        int index112_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA112_9 = input.LA(1);

                         
                        int index112_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA112_10 = input.LA(1);

                         
                        int index112_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA112_11 = input.LA(1);

                         
                        int index112_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA112_12 = input.LA(1);

                         
                        int index112_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA112_13 = input.LA(1);

                         
                        int index112_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA112_14 = input.LA(1);

                         
                        int index112_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA112_15 = input.LA(1);

                         
                        int index112_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index112_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 112, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00E4400000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00E4000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0002800000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0003000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0448800000000012L,0x00000000BA000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x64428000000007B0L,0x00000001BA000043L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0440800000000010L,0x00000000BA000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0448800000000010L,0x00000000BA000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x67E68000000007F0L,0x00000001BB65FC43L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x65E68000000007F2L,0x00000001BB65FC43L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xE008000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x65E68000000007F0L,0x00000001BB65FC43L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x64428000000007B2L,0x00000001BA000043L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x64428000000007F0L,0x00000001BA000043L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x65428000000007F0L,0x00000001BA000043L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x65428000000007B0L,0x00000001BA000043L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x04428000000007B0L,0x00000000BA000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x65429000000007F0L,0x00000001BA800043L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x64429000000007B0L,0x00000001BA000043L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x64428000000007F2L,0x00000001BA000043L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0440800000000012L,0x00000000BA000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0441800000000010L,0x00000000FA000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0440800000000010L,0x00000000FA000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x67428000000007B0L,0x00000001BA000043L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0002800000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x64428000000007B0L,0x00000001BA000243L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x64428000000007B0L,0x00000001BE000043L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x64438000000007B0L,0x00000001BA000043L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0011000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0010000000000002L,0x0000000040000000L});

}