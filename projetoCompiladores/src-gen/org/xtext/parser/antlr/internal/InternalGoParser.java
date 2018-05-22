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

public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NEWLINE", "RULE_UNICODE_CHAR", "RULE_UNICODE_LETTER", "RULE_UNICODE_DIGIT", "RULE_LETTER", "RULE_DECIMAL_DIGIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_IDENTIFIER", "RULE_ASSIGN_OP", "RULE_OPERATORS", "RULE_DECIMAL_LIT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_INT_LIT", "RULE_DECIMALS", "RULE_EXPONENT", "RULE_FLOAT_LIT", "RULE_IMAGINARY_LIT", "RULE_UNICODE_VALUE", "RULE_BYTE_VALUE", "RULE_RUNE_LIT", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_INTERPRETED_STRING_LIT", "RULE_STRING_LIT", "RULE_LITERALS", "RULE_COMMENT", "RULE_SEMICOLON", "RULE_TOKEN", "RULE_TYPE_NAME", "RULE_TYPE_LIT", "RULE_TYPE", "RULE_QUALIFIED_IDENT", "RULE_ARRAY_TYPE", "RULE_STRUCT_TYPE", "RULE_POINTER_TYPE", "RULE_FUNCTION_TYPE", "RULE_INTERFACE_TYPE", "RULE_SLICE_TYPE", "RULE_MAP_TYPE", "RULE_PARAMETER_LIST", "RULE_ARRAY_LENTGH", "RULE_ELEMENT_TYPE", "RULE_FIELD_DECL", "RULE_IDENTIFIER_LIST", "RULE_EMBEDDED_FIELD", "RULE_TAG", "RULE_BASE_TYPE", "RULE_SIGNATURE", "RULE_PARAMETERS", "RULE_RESULT", "RULE_PARAMETER_DECL", "RULE_TYPE_PARAMETER_DECL", "RULE_METHOD_SPEC", "RULE_METHOD_NAME", "RULE_INTERFACE_TYPE_NAME", "RULE_KEY_TYPE", "RULE_CHANNEL_TYPE", "RULE_STATEMENT_LIST", "RULE_BLOCK", "RULE_STATEMENT", "RULE_CONST_DECL", "RULE_TYPE_DECL", "RULE_VAR_DECL", "RULE_DECLARATION", "RULE_FUNCTION_DECL", "RULE_METHOD_DECL", "RULE_TOP_LEVEL_DECL", "RULE_CONST_SPEC", "RULE_EXPRESSION_LIST", "RULE_EXPRESSION", "RULE_TYPE_SPEC", "RULE_ALIAS_DECL", "RULE_TYPE_DEF", "RULE_VAR_SPEC", "RULE_SHORT_VAR_DECL", "RULE_FUNCTION_NAME", "RULE_FUNCTION_BODY", "RULE_RECIEVER", "RULE_LITERAL", "RULE_OPERAND_NAME", "RULE_OPERAND", "RULE_BASIC_LIT", "RULE_COMPOSITE_LIT", "RULE_FUNCTION_LIT", "RULE_PACKAGE_NAME", "RULE_LITERAL_TYPE", "RULE_LITERAL_VALUE", "RULE_ELEMENT_LIST", "RULE_KEYED_ELEMENT", "RULE_KEY", "RULE_ELEMENT", "RULE_FIELD_NAME", "RULE_CONVERSION", "RULE_METHOD_EXPR", "RULE_PRIMARY_EXPR_LINE", "RULE_SELECTOR", "RULE_INDEX", "RULE_SLICE", "RULE_TYPE_ASSERTION", "RULE_ARGUMENTS", "RULE_PRIMARY_EXPR", "RULE_RECIEVER_TYPE", "RULE_UNARY_EXPR", "RULE_EXPRESSION_LINE", "RULE_BINARY_OP", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_LABELED_STMT", "RULE_SIMPLE_STMT", "RULE_GO_STMT", "RULE_RETURN_STMT", "RULE_BREAK_STMT", "RULE_CONTINUE_STMT", "RULE_GOTO_STMT", "RULE_FALLTHROUGH_STMT", "RULE_IF_STMT", "RULE_SWITCH_STMT", "RULE_SELECT_STMT", "RULE_FOR_STMT", "RULE_DEFER_STMT", "RULE_EMPTY_STMT", "RULE_EXPRESSION_STMT", "RULE_SEND_STMT", "RULE_INC_DEC_STMT", "RULE_ASSIGNMENT", "RULE_LABEL", "RULE_CHANNEL", "RULE_EXPR_SWITCH_STMT", "RULE_TYPE_SWITCH_STMT", "RULE_EXPR_CASE_CLAUSE", "RULE_EXPR_SWITCH_CASE", "RULE_TYPE_SWITCH_GUARD", "RULE_TYPE_CASE_CLAUSE", "RULE_TYPE_SWITCH_CASE", "RULE_TYPE_LIST", "RULE_CONDITION", "RULE_FOR_CLAUSE", "RULE_RANGE_CLAUSE", "RULE_INIT_STMT", "RULE_POST_STMT", "RULE_COMM_CLAUSE", "RULE_COMM_CASE", "RULE_RECV_STMT", "RULE_RECV_EXPR", "RULE_PACKAGE_CLAUSE", "RULE_IMPORT_DECL", "RULE_SOURCE_FILE", "RULE_IMPORT_SPEC", "RULE_IMPORT_PATH", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int RULE_RECV_EXPR=157;
    public static final int RULE_RECIEVER_TYPE=113;
    public static final int RULE_PACKAGE_NAME=96;
    public static final int RULE_IMPORT_DECL=159;
    public static final int RULE_DECIMAL_DIGIT=10;
    public static final int RULE_TYPE_SWITCH_STMT=142;
    public static final int RULE_FUNCTION_LIT=95;
    public static final int RULE_EXPR_SWITCH_STMT=141;
    public static final int RULE_TYPE_NAME=40;
    public static final int RULE_CHANNEL_TYPE=68;
    public static final int RULE_STATEMENT_LIST=69;
    public static final int RULE_METHOD_NAME=65;
    public static final int RULE_LITERAL=90;
    public static final int RULE_FALLTHROUGH_STMT=128;
    public static final int RULE_FOR_CLAUSE=150;
    public static final int RULE_IMPORT_SPEC=161;
    public static final int RULE_INC_DEC_STMT=137;
    public static final int RULE_ID=4;
    public static final int RULE_CONTINUE_STMT=126;
    public static final int RULE_STRUCT_TYPE=45;
    public static final int RULE_TYPE_DEF=84;
    public static final int RULE_TYPE_PARAMETER_DECL=63;
    public static final int RULE_STATEMENT=71;
    public static final int RULE_LITERAL_VALUE=98;
    public static final int RULE_RESULT=61;
    public static final int RULE_INT=163;
    public static final int RULE_ML_COMMENT=165;
    public static final int RULE_ELEMENT_TYPE=53;
    public static final int RULE_SEND_STMT=136;
    public static final int RULE_PARAMETER_DECL=62;
    public static final int RULE_DECIMALS=21;
    public static final int RULE_SLICE_TYPE=49;
    public static final int RULE_ARGUMENTS=111;
    public static final int RULE_LABEL=139;
    public static final int RULE_NEWLINE=5;
    public static final int RULE_PRIMARY_EXPR=112;
    public static final int RULE_IF_STMT=129;
    public static final int RULE_BIG_U_VALUE=29;
    public static final int RULE_ESCAPED_CHAR=30;
    public static final int RULE_KEY=101;
    public static final int RULE_PARAMETER_LIST=51;
    public static final int RULE_FUNCTION_NAME=87;
    public static final int RULE_KEY_TYPE=67;
    public static final int RULE_ALIAS_DECL=83;
    public static final int RULE_COMPOSITE_LIT=94;
    public static final int RULE_RANGE_CLAUSE=151;
    public static final int RULE_BYTE_VALUE=26;
    public static final int RULE_OPERAND=92;
    public static final int RULE_INTERFACE_TYPE=48;
    public static final int RULE_TOP_LEVEL_DECL=78;
    public static final int RULE_BASIC_LIT=93;
    public static final int RULE_KEYWORDS=13;
    public static final int RULE_LITERALS=36;
    public static final int RULE_UNICODE_LETTER=7;
    public static final int RULE_SIGNATURE=59;
    public static final int RULE_ASSIGNMENT=138;
    public static final int RULE_UNICODE_CHAR=6;
    public static final int RULE_ARRAY_TYPE=44;
    public static final int RULE_OCTAL_DIGIT=11;
    public static final int RULE_SIMPLE_STMT=122;
    public static final int RULE_MAP_TYPE=50;
    public static final int RULE_BLOCK=70;
    public static final int RULE_EXPR_SWITCH_CASE=144;
    public static final int RULE_KEYED_ELEMENT=100;
    public static final int RULE_FUNCTION_BODY=88;
    public static final int RULE_INTERFACE_TYPE_NAME=66;
    public static final int RULE_FUNCTION_DECL=76;
    public static final int RULE_TYPE_CASE_CLAUSE=146;
    public static final int RULE_FIELD_NAME=103;
    public static final int RULE_LETTER=9;
    public static final int RULE_EXPONENT=22;
    public static final int RULE_RAW_STRING_LIT=33;
    public static final int RULE_FOR_STMT=132;
    public static final int RULE_SELECTOR=107;
    public static final int RULE_UNARY_OP=117;
    public static final int RULE_HEX_DIGIT=12;
    public static final int RULE_ASSIGN_OP=15;
    public static final int RULE_RUNE_LIT=27;
    public static final int RULE_CONVERSION=104;
    public static final int RULE_DECIMAL_LIT=17;
    public static final int RULE_DECLARATION=75;
    public static final int RULE_FIELD_DECL=54;
    public static final int RULE_PRIMARY_EXPR_LINE=106;
    public static final int RULE_TAG=57;
    public static final int RULE_CONST_DECL=72;
    public static final int RULE_ELEMENT_LIST=99;
    public static final int RULE_LABELED_STMT=121;
    public static final int RULE_COMM_CASE=155;
    public static final int RULE_QUALIFIED_IDENT=43;
    public static final int RULE_SLICE=109;
    public static final int RULE_CONDITION=149;
    public static final int RULE_EXPRESSION_LIST=80;
    public static final int RULE_TYPE_ASSERTION=110;
    public static final int RULE_BINARY_OP=116;
    public static final int RULE_SWITCH_STMT=130;
    public static final int RULE_RETURN_STMT=124;
    public static final int RULE_IMAGINARY_LIT=24;
    public static final int RULE_STRING_LIT=35;
    public static final int RULE_EMPTY_STMT=134;
    public static final int RULE_BASE_TYPE=58;
    public static final int RULE_VAR_SPEC=85;
    public static final int RULE_BREAK_STMT=125;
    public static final int RULE_TYPE_SWITCH_GUARD=145;
    public static final int RULE_INTERPRETED_STRING_LIT=34;
    public static final int RULE_TYPE_LIT=41;
    public static final int RULE_METHOD_EXPR=105;
    public static final int RULE_UNICODE_VALUE=25;
    public static final int T__170=170;
    public static final int RULE_LITTLE_U_VALUE=28;
    public static final int RULE_VAR_DECL=74;
    public static final int RULE_COMM_CLAUSE=154;
    public static final int RULE_HEX_BYTE_VALUE=32;
    public static final int RULE_OCTAL_BYTE_VALUE=31;
    public static final int RULE_MUL_OP=120;
    public static final int RULE_TYPE=42;
    public static final int RULE_ARRAY_LENTGH=52;
    public static final int RULE_CONST_SPEC=79;
    public static final int RULE_INIT_STMT=152;
    public static final int RULE_SEMICOLON=38;
    public static final int RULE_UNARY_EXPR=114;
    public static final int T__169=169;
    public static final int RULE_GOTO_STMT=127;
    public static final int RULE_EXPRESSION_LINE=115;
    public static final int RULE_LITERAL_TYPE=97;
    public static final int RULE_INDEX=108;
    public static final int RULE_IDENTIFIER=14;
    public static final int RULE_STRING=164;
    public static final int RULE_OPERATORS=16;
    public static final int RULE_EXPRESSION=81;
    public static final int RULE_GO_STMT=123;
    public static final int RULE_ELEMENT=102;
    public static final int RULE_DEFER_STMT=133;
    public static final int RULE_SL_COMMENT=166;
    public static final int RULE_RECV_STMT=156;
    public static final int RULE_TOKEN=39;
    public static final int RULE_HEX_LIT=19;
    public static final int RULE_OPERAND_NAME=91;
    public static final int RULE_CHANNEL=140;
    public static final int EOF=-1;
    public static final int RULE_ADD_OP=119;
    public static final int RULE_PARAMETERS=60;
    public static final int RULE_TYPE_SPEC=82;
    public static final int RULE_IDENTIFIER_LIST=55;
    public static final int RULE_UNICODE_DIGIT=8;
    public static final int RULE_WS=167;
    public static final int RULE_EXPR_CASE_CLAUSE=143;
    public static final int RULE_METHOD_SPEC=64;
    public static final int RULE_RECIEVER=89;
    public static final int RULE_COMMENT=37;
    public static final int RULE_ANY_OTHER=168;
    public static final int RULE_OCTAL_LIT=18;
    public static final int RULE_SHORT_VAR_DECL=86;
    public static final int RULE_TYPE_SWITCH_CASE=147;
    public static final int RULE_POST_STMT=153;
    public static final int RULE_PACKAGE_CLAUSE=158;
    public static final int RULE_FLOAT_LIT=23;
    public static final int RULE_SOURCE_FILE=160;
    public static final int RULE_METHOD_DECL=77;
    public static final int RULE_EXPRESSION_STMT=135;
    public static final int RULE_INT_LIT=20;
    public static final int RULE_FUNCTION_TYPE=47;
    public static final int RULE_IMPORT_PATH=162;
    public static final int RULE_EMBEDDED_FIELD=56;
    public static final int RULE_REL_OP=118;
    public static final int RULE_TYPE_DECL=73;
    public static final int RULE_TYPE_LIST=148;
    public static final int RULE_POINTER_TYPE=46;
    public static final int RULE_SELECT_STMT=131;

    // delegates
    // delegators


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g"; }



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
    // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:64:46: (iv_ruleModel= ruleModel EOF )
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel66);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel72); 

            }

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
    // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==169) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:80:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel111);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.Go.Greeting");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleGreeting"
    // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting143);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting149); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:113:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:114:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:114:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:115:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,169,FOLLOW_169_in_ruleGreeting178); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
            		
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:120:4: (lv_name_1_0= RULE_ID )
            // ../projetoCompiladores/src-gen/org/xtext/parser/antlr/internal/InternalGo.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting199); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,170,FOLLOW_170_in_ruleGreeting226); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
            		

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
    // $ANTLR end "ruleGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleGreeting178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_170_in_ruleGreeting226 = new BitSet(new long[]{0x0000000000000002L});

}