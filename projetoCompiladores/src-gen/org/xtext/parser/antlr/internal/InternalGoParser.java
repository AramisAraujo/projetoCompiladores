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

@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LETTER", "RULE_IDENTIFIER", "RULE_HEX_DIGIT", "RULE_UNICODE_CHAR", "RULE_NEWLINE", "RULE_SEMICOLON", "RULE_UNICODE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\\\'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'x'", "'u'", "'U'", "'a'", "'b'", "'f'", "'n'", "'r'", "'t'", "'v'", "'\\''", "'\"'", "'`'", "'import'", "'('", "')'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_ID=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=9;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=8;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_UNICODE_CHAR=7;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_UNICODE_DIGIT=10;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_LETTER=4;
    public static final int RULE_HEX_DIGIT=6;
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

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

            				newCompositeNode(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_greetings_0_0=ruleprogram();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:107:1: ruleprogram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Import_decl_0= ruleImport_decl ;
    public final AntlrDatatypeRuleToken ruleprogram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Import_decl_0 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: (this_Import_decl_0= ruleImport_decl )
            // InternalGo.g:114:2: this_Import_decl_0= ruleImport_decl
            {

            		newCompositeNode(grammarAccess.getProgramAccess().getImport_declParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Import_decl_0=ruleImport_decl();

            state._fsp--;


            		current.merge(this_Import_decl_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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


    // $ANTLR start "entryRuleIdentifier_Unicode_Value"
    // InternalGo.g:127:1: entryRuleIdentifier_Unicode_Value returns [String current=null] : iv_ruleIdentifier_Unicode_Value= ruleIdentifier_Unicode_Value EOF ;
    public final String entryRuleIdentifier_Unicode_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier_Unicode_Value = null;


        try {
            // InternalGo.g:127:64: (iv_ruleIdentifier_Unicode_Value= ruleIdentifier_Unicode_Value EOF )
            // InternalGo.g:128:2: iv_ruleIdentifier_Unicode_Value= ruleIdentifier_Unicode_Value EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_Unicode_ValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier_Unicode_Value=ruleIdentifier_Unicode_Value();

            state._fsp--;

             current =iv_ruleIdentifier_Unicode_Value.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier_Unicode_Value"


    // $ANTLR start "ruleIdentifier_Unicode_Value"
    // InternalGo.g:134:1: ruleIdentifier_Unicode_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LETTER_0= RULE_LETTER (this_IDENTIFIER_1= RULE_IDENTIFIER | this_Unicode_value_2= ruleUnicode_value ) ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier_Unicode_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_Unicode_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:140:2: ( (this_LETTER_0= RULE_LETTER (this_IDENTIFIER_1= RULE_IDENTIFIER | this_Unicode_value_2= ruleUnicode_value ) ) )
            // InternalGo.g:141:2: (this_LETTER_0= RULE_LETTER (this_IDENTIFIER_1= RULE_IDENTIFIER | this_Unicode_value_2= ruleUnicode_value ) )
            {
            // InternalGo.g:141:2: (this_LETTER_0= RULE_LETTER (this_IDENTIFIER_1= RULE_IDENTIFIER | this_Unicode_value_2= ruleUnicode_value ) )
            // InternalGo.g:142:3: this_LETTER_0= RULE_LETTER (this_IDENTIFIER_1= RULE_IDENTIFIER | this_Unicode_value_2= ruleUnicode_value )
            {
            this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_3); 

            			current.merge(this_LETTER_0);
            		

            			newLeafNode(this_LETTER_0, grammarAccess.getIdentifier_Unicode_ValueAccess().getLETTERTerminalRuleCall_0());
            		
            // InternalGo.g:149:3: (this_IDENTIFIER_1= RULE_IDENTIFIER | this_Unicode_value_2= ruleUnicode_value )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_IDENTIFIER) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGo.g:150:4: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                    				current.merge(this_IDENTIFIER_1);
                    			

                    				newLeafNode(this_IDENTIFIER_1, grammarAccess.getIdentifier_Unicode_ValueAccess().getIDENTIFIERTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGo.g:158:4: this_Unicode_value_2= ruleUnicode_value
                    {

                    				newCompositeNode(grammarAccess.getIdentifier_Unicode_ValueAccess().getUnicode_valueParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Unicode_value_2=ruleUnicode_value();

                    state._fsp--;


                    				current.merge(this_Unicode_value_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier_Unicode_Value"


    // $ANTLR start "entryRuleUnicode_value"
    // InternalGo.g:173:1: entryRuleUnicode_value returns [String current=null] : iv_ruleUnicode_value= ruleUnicode_value EOF ;
    public final String entryRuleUnicode_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnicode_value = null;


        try {
            // InternalGo.g:173:53: (iv_ruleUnicode_value= ruleUnicode_value EOF )
            // InternalGo.g:174:2: iv_ruleUnicode_value= ruleUnicode_value EOF
            {
             newCompositeNode(grammarAccess.getUnicode_valueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnicode_value=ruleUnicode_value();

            state._fsp--;

             current =iv_ruleUnicode_value.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnicode_value"


    // $ANTLR start "ruleUnicode_value"
    // InternalGo.g:180:1: ruleUnicode_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Little_u_value_0= ruleLittle_u_value | this_Big_u_value_1= ruleBig_u_value | this_Escaped_char_2= ruleEscaped_char ) ;
    public final AntlrDatatypeRuleToken ruleUnicode_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Little_u_value_0 = null;

        AntlrDatatypeRuleToken this_Big_u_value_1 = null;

        AntlrDatatypeRuleToken this_Escaped_char_2 = null;



        	enterRule();

        try {
            // InternalGo.g:186:2: ( (this_Little_u_value_0= ruleLittle_u_value | this_Big_u_value_1= ruleBig_u_value | this_Escaped_char_2= ruleEscaped_char ) )
            // InternalGo.g:187:2: (this_Little_u_value_0= ruleLittle_u_value | this_Big_u_value_1= ruleBig_u_value | this_Escaped_char_2= ruleEscaped_char )
            {
            // InternalGo.g:187:2: (this_Little_u_value_0= ruleLittle_u_value | this_Big_u_value_1= ruleBig_u_value | this_Escaped_char_2= ruleEscaped_char )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt2=2;
                    }
                    break;
                case 18:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    {
                    alt2=3;
                    }
                    break;
                case 28:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:188:3: this_Little_u_value_0= ruleLittle_u_value
                    {

                    			newCompositeNode(grammarAccess.getUnicode_valueAccess().getLittle_u_valueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Little_u_value_0=ruleLittle_u_value();

                    state._fsp--;


                    			current.merge(this_Little_u_value_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:199:3: this_Big_u_value_1= ruleBig_u_value
                    {

                    			newCompositeNode(grammarAccess.getUnicode_valueAccess().getBig_u_valueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Big_u_value_1=ruleBig_u_value();

                    state._fsp--;


                    			current.merge(this_Big_u_value_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGo.g:210:3: this_Escaped_char_2= ruleEscaped_char
                    {

                    			newCompositeNode(grammarAccess.getUnicode_valueAccess().getEscaped_charParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Escaped_char_2=ruleEscaped_char();

                    state._fsp--;


                    			current.merge(this_Escaped_char_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnicode_value"


    // $ANTLR start "entryRuleByte_value"
    // InternalGo.g:224:1: entryRuleByte_value returns [String current=null] : iv_ruleByte_value= ruleByte_value EOF ;
    public final String entryRuleByte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleByte_value = null;


        try {
            // InternalGo.g:224:50: (iv_ruleByte_value= ruleByte_value EOF )
            // InternalGo.g:225:2: iv_ruleByte_value= ruleByte_value EOF
            {
             newCompositeNode(grammarAccess.getByte_valueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleByte_value=ruleByte_value();

            state._fsp--;

             current =iv_ruleByte_value.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:231:1: ruleByte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Octal_byte_value_0= ruleOctal_byte_value | this_Hex_byte_value_1= ruleHex_byte_value ) ;
    public final AntlrDatatypeRuleToken ruleByte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Octal_byte_value_0 = null;

        AntlrDatatypeRuleToken this_Hex_byte_value_1 = null;



        	enterRule();

        try {
            // InternalGo.g:237:2: ( (this_Octal_byte_value_0= ruleOctal_byte_value | this_Hex_byte_value_1= ruleHex_byte_value ) )
            // InternalGo.g:238:2: (this_Octal_byte_value_0= ruleOctal_byte_value | this_Hex_byte_value_1= ruleHex_byte_value )
            {
            // InternalGo.g:238:2: (this_Octal_byte_value_0= ruleOctal_byte_value | this_Hex_byte_value_1= ruleHex_byte_value )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=19 && LA3_1<=26)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==27) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:239:3: this_Octal_byte_value_0= ruleOctal_byte_value
                    {

                    			newCompositeNode(grammarAccess.getByte_valueAccess().getOctal_byte_valueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Octal_byte_value_0=ruleOctal_byte_value();

                    state._fsp--;


                    			current.merge(this_Octal_byte_value_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:250:3: this_Hex_byte_value_1= ruleHex_byte_value
                    {

                    			newCompositeNode(grammarAccess.getByte_valueAccess().getHex_byte_valueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hex_byte_value_1=ruleHex_byte_value();

                    state._fsp--;


                    			current.merge(this_Hex_byte_value_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleOctal_byte_value"
    // InternalGo.g:264:1: entryRuleOctal_byte_value returns [String current=null] : iv_ruleOctal_byte_value= ruleOctal_byte_value EOF ;
    public final String entryRuleOctal_byte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOctal_byte_value = null;


        try {
            // InternalGo.g:264:56: (iv_ruleOctal_byte_value= ruleOctal_byte_value EOF )
            // InternalGo.g:265:2: iv_ruleOctal_byte_value= ruleOctal_byte_value EOF
            {
             newCompositeNode(grammarAccess.getOctal_byte_valueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOctal_byte_value=ruleOctal_byte_value();

            state._fsp--;

             current =iv_ruleOctal_byte_value.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOctal_byte_value"


    // $ANTLR start "ruleOctal_byte_value"
    // InternalGo.g:271:1: ruleOctal_byte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) ) ;
    public final AntlrDatatypeRuleToken ruleOctal_byte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:277:2: ( (kw= '\\\\' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) ) )
            // InternalGo.g:278:2: (kw= '\\\\' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) )
            {
            // InternalGo.g:278:2: (kw= '\\\\' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) )
            // InternalGo.g:279:3: kw= '\\\\' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )
            {
            kw=(Token)match(input,18,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getBackslashKeyword_0());
            		
            // InternalGo.g:284:3: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            case 24:
                {
                alt4=6;
                }
                break;
            case 25:
                {
                alt4=7;
                }
                break;
            case 26:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:285:4: kw= '0'
                    {
                    kw=(Token)match(input,19,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGo.g:291:4: kw= '1'
                    {
                    kw=(Token)match(input,20,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGo.g:297:4: kw= '2'
                    {
                    kw=(Token)match(input,21,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalGo.g:303:4: kw= '3'
                    {
                    kw=(Token)match(input,22,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalGo.g:309:4: kw= '4'
                    {
                    kw=(Token)match(input,23,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_1_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalGo.g:315:4: kw= '5'
                    {
                    kw=(Token)match(input,24,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_1_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalGo.g:321:4: kw= '6'
                    {
                    kw=(Token)match(input,25,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_1_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalGo.g:327:4: kw= '7'
                    {
                    kw=(Token)match(input,26,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_1_7());
                    			

                    }
                    break;

            }

            // InternalGo.g:333:3: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            case 24:
                {
                alt5=6;
                }
                break;
            case 25:
                {
                alt5=7;
                }
                break;
            case 26:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:334:4: kw= '0'
                    {
                    kw=(Token)match(input,19,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGo.g:340:4: kw= '1'
                    {
                    kw=(Token)match(input,20,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGo.g:346:4: kw= '2'
                    {
                    kw=(Token)match(input,21,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalGo.g:352:4: kw= '3'
                    {
                    kw=(Token)match(input,22,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_2_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalGo.g:358:4: kw= '4'
                    {
                    kw=(Token)match(input,23,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_2_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalGo.g:364:4: kw= '5'
                    {
                    kw=(Token)match(input,24,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_2_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalGo.g:370:4: kw= '6'
                    {
                    kw=(Token)match(input,25,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_2_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalGo.g:376:4: kw= '7'
                    {
                    kw=(Token)match(input,26,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_2_7());
                    			

                    }
                    break;

            }

            // InternalGo.g:382:3: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 26:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGo.g:383:4: kw= '0'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGo.g:389:4: kw= '1'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGo.g:395:4: kw= '2'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalGo.g:401:4: kw= '3'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_3_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalGo.g:407:4: kw= '4'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_3_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalGo.g:413:4: kw= '5'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_3_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalGo.g:419:4: kw= '6'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_3_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalGo.g:425:4: kw= '7'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_3_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOctal_byte_value"


    // $ANTLR start "entryRuleHex_byte_value"
    // InternalGo.g:435:1: entryRuleHex_byte_value returns [String current=null] : iv_ruleHex_byte_value= ruleHex_byte_value EOF ;
    public final String entryRuleHex_byte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHex_byte_value = null;


        try {
            // InternalGo.g:435:54: (iv_ruleHex_byte_value= ruleHex_byte_value EOF )
            // InternalGo.g:436:2: iv_ruleHex_byte_value= ruleHex_byte_value EOF
            {
             newCompositeNode(grammarAccess.getHex_byte_valueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHex_byte_value=ruleHex_byte_value();

            state._fsp--;

             current =iv_ruleHex_byte_value.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHex_byte_value"


    // $ANTLR start "ruleHex_byte_value"
    // InternalGo.g:442:1: ruleHex_byte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT ) ;
    public final AntlrDatatypeRuleToken ruleHex_byte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEX_DIGIT_2=null;
        Token this_HEX_DIGIT_3=null;


        	enterRule();

        try {
            // InternalGo.g:448:2: ( (kw= '\\\\' kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT ) )
            // InternalGo.g:449:2: (kw= '\\\\' kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT )
            {
            // InternalGo.g:449:2: (kw= '\\\\' kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT )
            // InternalGo.g:450:3: kw= '\\\\' kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT
            {
            kw=(Token)match(input,18,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHex_byte_valueAccess().getBackslashKeyword_0());
            		
            kw=(Token)match(input,27,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHex_byte_valueAccess().getXKeyword_1());
            		
            this_HEX_DIGIT_2=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_6); 

            			current.merge(this_HEX_DIGIT_2);
            		

            			newLeafNode(this_HEX_DIGIT_2, grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_2());
            		
            this_HEX_DIGIT_3=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_2); 

            			current.merge(this_HEX_DIGIT_3);
            		

            			newLeafNode(this_HEX_DIGIT_3, grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHex_byte_value"


    // $ANTLR start "entryRuleLittle_u_value"
    // InternalGo.g:478:1: entryRuleLittle_u_value returns [String current=null] : iv_ruleLittle_u_value= ruleLittle_u_value EOF ;
    public final String entryRuleLittle_u_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLittle_u_value = null;


        try {
            // InternalGo.g:478:54: (iv_ruleLittle_u_value= ruleLittle_u_value EOF )
            // InternalGo.g:479:2: iv_ruleLittle_u_value= ruleLittle_u_value EOF
            {
             newCompositeNode(grammarAccess.getLittle_u_valueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLittle_u_value=ruleLittle_u_value();

            state._fsp--;

             current =iv_ruleLittle_u_value.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLittle_u_value"


    // $ANTLR start "ruleLittle_u_value"
    // InternalGo.g:485:1: ruleLittle_u_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT ) ;
    public final AntlrDatatypeRuleToken ruleLittle_u_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEX_DIGIT_2=null;
        Token this_HEX_DIGIT_3=null;
        Token this_HEX_DIGIT_4=null;
        Token this_HEX_DIGIT_5=null;


        	enterRule();

        try {
            // InternalGo.g:491:2: ( (kw= '\\\\' kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT ) )
            // InternalGo.g:492:2: (kw= '\\\\' kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT )
            {
            // InternalGo.g:492:2: (kw= '\\\\' kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT )
            // InternalGo.g:493:3: kw= '\\\\' kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT
            {
            kw=(Token)match(input,18,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLittle_u_valueAccess().getBackslashKeyword_0());
            		
            kw=(Token)match(input,28,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLittle_u_valueAccess().getUKeyword_1());
            		
            this_HEX_DIGIT_2=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_6); 

            			current.merge(this_HEX_DIGIT_2);
            		

            			newLeafNode(this_HEX_DIGIT_2, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_2());
            		
            this_HEX_DIGIT_3=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_6); 

            			current.merge(this_HEX_DIGIT_3);
            		

            			newLeafNode(this_HEX_DIGIT_3, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_3());
            		
            this_HEX_DIGIT_4=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_6); 

            			current.merge(this_HEX_DIGIT_4);
            		

            			newLeafNode(this_HEX_DIGIT_4, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_4());
            		
            this_HEX_DIGIT_5=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_2); 

            			current.merge(this_HEX_DIGIT_5);
            		

            			newLeafNode(this_HEX_DIGIT_5, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLittle_u_value"


    // $ANTLR start "entryRuleBig_u_value"
    // InternalGo.g:535:1: entryRuleBig_u_value returns [String current=null] : iv_ruleBig_u_value= ruleBig_u_value EOF ;
    public final String entryRuleBig_u_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBig_u_value = null;


        try {
            // InternalGo.g:535:51: (iv_ruleBig_u_value= ruleBig_u_value EOF )
            // InternalGo.g:536:2: iv_ruleBig_u_value= ruleBig_u_value EOF
            {
             newCompositeNode(grammarAccess.getBig_u_valueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBig_u_value=ruleBig_u_value();

            state._fsp--;

             current =iv_ruleBig_u_value.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBig_u_value"


    // $ANTLR start "ruleBig_u_value"
    // InternalGo.g:542:1: ruleBig_u_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT ) ;
    public final AntlrDatatypeRuleToken ruleBig_u_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEX_DIGIT_2=null;
        Token this_HEX_DIGIT_3=null;
        Token this_HEX_DIGIT_4=null;
        Token this_HEX_DIGIT_5=null;


        	enterRule();

        try {
            // InternalGo.g:548:2: ( (kw= '\\\\' kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT ) )
            // InternalGo.g:549:2: (kw= '\\\\' kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT )
            {
            // InternalGo.g:549:2: (kw= '\\\\' kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT )
            // InternalGo.g:550:3: kw= '\\\\' kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT
            {
            kw=(Token)match(input,18,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBig_u_valueAccess().getBackslashKeyword_0());
            		
            kw=(Token)match(input,29,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBig_u_valueAccess().getUKeyword_1());
            		
            this_HEX_DIGIT_2=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_6); 

            			current.merge(this_HEX_DIGIT_2);
            		

            			newLeafNode(this_HEX_DIGIT_2, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_2());
            		
            this_HEX_DIGIT_3=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_6); 

            			current.merge(this_HEX_DIGIT_3);
            		

            			newLeafNode(this_HEX_DIGIT_3, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_3());
            		
            this_HEX_DIGIT_4=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_6); 

            			current.merge(this_HEX_DIGIT_4);
            		

            			newLeafNode(this_HEX_DIGIT_4, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_4());
            		
            this_HEX_DIGIT_5=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_2); 

            			current.merge(this_HEX_DIGIT_5);
            		

            			newLeafNode(this_HEX_DIGIT_5, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBig_u_value"


    // $ANTLR start "entryRuleEscaped_char"
    // InternalGo.g:592:1: entryRuleEscaped_char returns [String current=null] : iv_ruleEscaped_char= ruleEscaped_char EOF ;
    public final String entryRuleEscaped_char() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscaped_char = null;


        try {
            // InternalGo.g:592:52: (iv_ruleEscaped_char= ruleEscaped_char EOF )
            // InternalGo.g:593:2: iv_ruleEscaped_char= ruleEscaped_char EOF
            {
             newCompositeNode(grammarAccess.getEscaped_charRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscaped_char=ruleEscaped_char();

            state._fsp--;

             current =iv_ruleEscaped_char.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscaped_char"


    // $ANTLR start "ruleEscaped_char"
    // InternalGo.g:599:1: ruleEscaped_char returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | kw= '\\\\' | kw= '\\'' | kw= '\"' ) ) ;
    public final AntlrDatatypeRuleToken ruleEscaped_char() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:605:2: ( (kw= '\\\\' (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | kw= '\\\\' | kw= '\\'' | kw= '\"' ) ) )
            // InternalGo.g:606:2: (kw= '\\\\' (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | kw= '\\\\' | kw= '\\'' | kw= '\"' ) )
            {
            // InternalGo.g:606:2: (kw= '\\\\' (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | kw= '\\\\' | kw= '\\'' | kw= '\"' ) )
            // InternalGo.g:607:3: kw= '\\\\' (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | kw= '\\\\' | kw= '\\'' | kw= '\"' )
            {
            kw=(Token)match(input,18,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEscaped_charAccess().getBackslashKeyword_0());
            		
            // InternalGo.g:612:3: (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | kw= '\\\\' | kw= '\\'' | kw= '\"' )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 33:
                {
                alt7=4;
                }
                break;
            case 34:
                {
                alt7=5;
                }
                break;
            case 35:
                {
                alt7=6;
                }
                break;
            case 36:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            case 37:
                {
                alt7=9;
                }
                break;
            case 38:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGo.g:613:4: kw= 'a'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getAKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGo.g:619:4: kw= 'b'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getBKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGo.g:625:4: kw= 'f'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getFKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalGo.g:631:4: kw= 'n'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getNKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalGo.g:637:4: kw= 'r'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getRKeyword_1_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalGo.g:643:4: kw= 't'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getTKeyword_1_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalGo.g:649:4: kw= 'v'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getVKeyword_1_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalGo.g:655:4: kw= '\\\\'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getBackslashKeyword_1_7());
                    			

                    }
                    break;
                case 9 :
                    // InternalGo.g:661:4: kw= '\\''
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getApostropheKeyword_1_8());
                    			

                    }
                    break;
                case 10 :
                    // InternalGo.g:667:4: kw= '\"'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getQuotationMarkKeyword_1_9());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscaped_char"


    // $ANTLR start "entryRuleString_lit"
    // InternalGo.g:677:1: entryRuleString_lit returns [String current=null] : iv_ruleString_lit= ruleString_lit EOF ;
    public final String entryRuleString_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString_lit = null;


        try {
            // InternalGo.g:677:50: (iv_ruleString_lit= ruleString_lit EOF )
            // InternalGo.g:678:2: iv_ruleString_lit= ruleString_lit EOF
            {
             newCompositeNode(grammarAccess.getString_litRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString_lit=ruleString_lit();

            state._fsp--;

             current =iv_ruleString_lit.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:684:1: ruleString_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Raw_string_lit_0= ruleRaw_string_lit | this_Interpreted_string_lit_1= ruleInterpreted_string_lit ) ;
    public final AntlrDatatypeRuleToken ruleString_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Raw_string_lit_0 = null;

        AntlrDatatypeRuleToken this_Interpreted_string_lit_1 = null;



        	enterRule();

        try {
            // InternalGo.g:690:2: ( (this_Raw_string_lit_0= ruleRaw_string_lit | this_Interpreted_string_lit_1= ruleInterpreted_string_lit ) )
            // InternalGo.g:691:2: (this_Raw_string_lit_0= ruleRaw_string_lit | this_Interpreted_string_lit_1= ruleInterpreted_string_lit )
            {
            // InternalGo.g:691:2: (this_Raw_string_lit_0= ruleRaw_string_lit | this_Interpreted_string_lit_1= ruleInterpreted_string_lit )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:692:3: this_Raw_string_lit_0= ruleRaw_string_lit
                    {

                    			newCompositeNode(grammarAccess.getString_litAccess().getRaw_string_litParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Raw_string_lit_0=ruleRaw_string_lit();

                    state._fsp--;


                    			current.merge(this_Raw_string_lit_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:703:3: this_Interpreted_string_lit_1= ruleInterpreted_string_lit
                    {

                    			newCompositeNode(grammarAccess.getString_litAccess().getInterpreted_string_litParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interpreted_string_lit_1=ruleInterpreted_string_lit();

                    state._fsp--;


                    			current.merge(this_Interpreted_string_lit_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleRaw_string_lit"
    // InternalGo.g:717:1: entryRuleRaw_string_lit returns [String current=null] : iv_ruleRaw_string_lit= ruleRaw_string_lit EOF ;
    public final String entryRuleRaw_string_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRaw_string_lit = null;


        try {
            // InternalGo.g:717:54: (iv_ruleRaw_string_lit= ruleRaw_string_lit EOF )
            // InternalGo.g:718:2: iv_ruleRaw_string_lit= ruleRaw_string_lit EOF
            {
             newCompositeNode(grammarAccess.getRaw_string_litRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaw_string_lit=ruleRaw_string_lit();

            state._fsp--;

             current =iv_ruleRaw_string_lit.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRaw_string_lit"


    // $ANTLR start "ruleRaw_string_lit"
    // InternalGo.g:724:1: ruleRaw_string_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '`' (this_UNICODE_CHAR_1= RULE_UNICODE_CHAR | this_NEWLINE_2= RULE_NEWLINE )* kw= '`' ) ;
    public final AntlrDatatypeRuleToken ruleRaw_string_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_UNICODE_CHAR_1=null;
        Token this_NEWLINE_2=null;


        	enterRule();

        try {
            // InternalGo.g:730:2: ( (kw= '`' (this_UNICODE_CHAR_1= RULE_UNICODE_CHAR | this_NEWLINE_2= RULE_NEWLINE )* kw= '`' ) )
            // InternalGo.g:731:2: (kw= '`' (this_UNICODE_CHAR_1= RULE_UNICODE_CHAR | this_NEWLINE_2= RULE_NEWLINE )* kw= '`' )
            {
            // InternalGo.g:731:2: (kw= '`' (this_UNICODE_CHAR_1= RULE_UNICODE_CHAR | this_NEWLINE_2= RULE_NEWLINE )* kw= '`' )
            // InternalGo.g:732:3: kw= '`' (this_UNICODE_CHAR_1= RULE_UNICODE_CHAR | this_NEWLINE_2= RULE_NEWLINE )* kw= '`'
            {
            kw=(Token)match(input,39,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRaw_string_litAccess().getGraveAccentKeyword_0());
            		
            // InternalGo.g:737:3: (this_UNICODE_CHAR_1= RULE_UNICODE_CHAR | this_NEWLINE_2= RULE_NEWLINE )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_UNICODE_CHAR) ) {
                    alt9=1;
                }
                else if ( (LA9_0==RULE_NEWLINE) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:738:4: this_UNICODE_CHAR_1= RULE_UNICODE_CHAR
            	    {
            	    this_UNICODE_CHAR_1=(Token)match(input,RULE_UNICODE_CHAR,FOLLOW_10); 

            	    				current.merge(this_UNICODE_CHAR_1);
            	    			

            	    				newLeafNode(this_UNICODE_CHAR_1, grammarAccess.getRaw_string_litAccess().getUNICODE_CHARTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:746:4: this_NEWLINE_2= RULE_NEWLINE
            	    {
            	    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_10); 

            	    				current.merge(this_NEWLINE_2);
            	    			

            	    				newLeafNode(this_NEWLINE_2, grammarAccess.getRaw_string_litAccess().getNEWLINETerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            kw=(Token)match(input,39,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRaw_string_litAccess().getGraveAccentKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRaw_string_lit"


    // $ANTLR start "entryRuleInterpreted_string_lit"
    // InternalGo.g:763:1: entryRuleInterpreted_string_lit returns [String current=null] : iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF ;
    public final String entryRuleInterpreted_string_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterpreted_string_lit = null;


        try {
            // InternalGo.g:763:62: (iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF )
            // InternalGo.g:764:2: iv_ruleInterpreted_string_lit= ruleInterpreted_string_lit EOF
            {
             newCompositeNode(grammarAccess.getInterpreted_string_litRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterpreted_string_lit=ruleInterpreted_string_lit();

            state._fsp--;

             current =iv_ruleInterpreted_string_lit.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:770:1: ruleInterpreted_string_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' (this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value | this_Byte_value_2= ruleByte_value )* kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleInterpreted_string_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_Unicode_Value_1 = null;

        AntlrDatatypeRuleToken this_Byte_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:776:2: ( (kw= '\"' (this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value | this_Byte_value_2= ruleByte_value )* kw= '\"' ) )
            // InternalGo.g:777:2: (kw= '\"' (this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value | this_Byte_value_2= ruleByte_value )* kw= '\"' )
            {
            // InternalGo.g:777:2: (kw= '\"' (this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value | this_Byte_value_2= ruleByte_value )* kw= '\"' )
            // InternalGo.g:778:3: kw= '\"' (this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value | this_Byte_value_2= ruleByte_value )* kw= '\"'
            {
            kw=(Token)match(input,38,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0());
            		
            // InternalGo.g:783:3: (this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value | this_Byte_value_2= ruleByte_value )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_LETTER) ) {
                    alt10=1;
                }
                else if ( (LA10_0==18) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:784:4: this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value
            	    {

            	    				newCompositeNode(grammarAccess.getInterpreted_string_litAccess().getIdentifier_Unicode_ValueParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_11);
            	    this_Identifier_Unicode_Value_1=ruleIdentifier_Unicode_Value();

            	    state._fsp--;


            	    				current.merge(this_Identifier_Unicode_Value_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:795:4: this_Byte_value_2= ruleByte_value
            	    {

            	    				newCompositeNode(grammarAccess.getInterpreted_string_litAccess().getByte_valueParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_11);
            	    this_Byte_value_2=ruleByte_value();

            	    state._fsp--;


            	    				current.merge(this_Byte_value_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            kw=(Token)match(input,38,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleImport_decl"
    // InternalGo.g:815:1: entryRuleImport_decl returns [String current=null] : iv_ruleImport_decl= ruleImport_decl EOF ;
    public final String entryRuleImport_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport_decl = null;


        try {
            // InternalGo.g:815:51: (iv_ruleImport_decl= ruleImport_decl EOF )
            // InternalGo.g:816:2: iv_ruleImport_decl= ruleImport_decl EOF
            {
             newCompositeNode(grammarAccess.getImport_declRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport_decl=ruleImport_decl();

            state._fsp--;

             current =iv_ruleImport_decl.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:822:1: ruleImport_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImport_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken this_Import_spec_1 = null;

        AntlrDatatypeRuleToken this_Import_spec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:828:2: ( (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) ) )
            // InternalGo.g:829:2: (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) )
            {
            // InternalGo.g:829:2: (kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) ) )
            // InternalGo.g:830:3: kw= 'import' (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) )
            {
            kw=(Token)match(input,40,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImport_declAccess().getImportKeyword_0());
            		
            // InternalGo.g:835:3: (this_Import_spec_1= ruleImport_spec | (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LETTER||(LA12_0>=38 && LA12_0<=39)||LA12_0==43) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:836:4: this_Import_spec_1= ruleImport_spec
                    {

                    				newCompositeNode(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Import_spec_1=ruleImport_spec();

                    state._fsp--;


                    				current.merge(this_Import_spec_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGo.g:847:4: (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' )
                    {
                    // InternalGo.g:847:4: (kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')' )
                    // InternalGo.g:848:5: kw= '(' (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )* kw= ')'
                    {
                    kw=(Token)match(input,41,FOLLOW_13); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getImport_declAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    // InternalGo.g:853:5: (this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_LETTER||(LA11_0>=38 && LA11_0<=39)||LA11_0==43) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGo.g:854:6: this_Import_spec_3= ruleImport_spec this_SEMICOLON_4= RULE_SEMICOLON
                    	    {

                    	    						newCompositeNode(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    this_Import_spec_3=ruleImport_spec();

                    	    state._fsp--;


                    	    						current.merge(this_Import_spec_3);
                    	    					

                    	    						afterParserOrEnumRuleCall();
                    	    					
                    	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_13); 

                    	    						current.merge(this_SEMICOLON_4);
                    	    					

                    	    						newLeafNode(this_SEMICOLON_4, grammarAccess.getImport_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    kw=(Token)match(input,42,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getImport_declAccess().getRightParenthesisKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalGo.g:883:1: entryRuleImport_spec returns [String current=null] : iv_ruleImport_spec= ruleImport_spec EOF ;
    public final String entryRuleImport_spec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport_spec = null;


        try {
            // InternalGo.g:883:51: (iv_ruleImport_spec= ruleImport_spec EOF )
            // InternalGo.g:884:2: iv_ruleImport_spec= ruleImport_spec EOF
            {
             newCompositeNode(grammarAccess.getImport_specRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport_spec=ruleImport_spec();

            state._fsp--;

             current =iv_ruleImport_spec.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:890:1: ruleImport_spec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value )? this_String_lit_2= ruleString_lit ) ;
    public final AntlrDatatypeRuleToken ruleImport_spec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_Unicode_Value_1 = null;

        AntlrDatatypeRuleToken this_String_lit_2 = null;



        	enterRule();

        try {
            // InternalGo.g:896:2: ( ( (kw= '.' | this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value )? this_String_lit_2= ruleString_lit ) )
            // InternalGo.g:897:2: ( (kw= '.' | this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value )? this_String_lit_2= ruleString_lit )
            {
            // InternalGo.g:897:2: ( (kw= '.' | this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value )? this_String_lit_2= ruleString_lit )
            // InternalGo.g:898:3: (kw= '.' | this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value )? this_String_lit_2= ruleString_lit
            {
            // InternalGo.g:898:3: (kw= '.' | this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_LETTER) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:899:4: kw= '.'
                    {
                    kw=(Token)match(input,43,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImport_specAccess().getFullStopKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGo.g:905:4: this_Identifier_Unicode_Value_1= ruleIdentifier_Unicode_Value
                    {

                    				newCompositeNode(grammarAccess.getImport_specAccess().getIdentifier_Unicode_ValueParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Identifier_Unicode_Value_1=ruleIdentifier_Unicode_Value();

                    state._fsp--;


                    				current.merge(this_Identifier_Unicode_Value_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getImport_specAccess().getString_litParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_String_lit_2=ruleString_lit();

            state._fsp--;


            			current.merge(this_String_lit_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000007FC0040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000AC000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000CC000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000008C000000010L});

}