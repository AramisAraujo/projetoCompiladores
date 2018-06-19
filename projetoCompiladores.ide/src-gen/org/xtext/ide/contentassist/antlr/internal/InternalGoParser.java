package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BINARY_OP", "RULE_SEMICOLON", "RULE_ASSIGN_OP", "RULE_INT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_UNICODE_VALUE", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_IDENTIFIER", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_UNARY_OP", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'='", "':='", "','", "'--'", "'...'", "'.'", "':'", "'E'", "'e'", "'+'", "'-'", "'i'", "'\\''", "'\"'", "'oi'"
    };
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


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }


    	private GoGrammarAccess grammarAccess;

    	public void setGrammarAccess(GoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGo.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGo.g:54:1: ( ruleModel EOF )
            // InternalGo.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGo.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:66:2: ( ( ( rule__Model__GreetingsAssignment ) ) )
            // InternalGo.g:67:2: ( ( rule__Model__GreetingsAssignment ) )
            {
            // InternalGo.g:67:2: ( ( rule__Model__GreetingsAssignment ) )
            // InternalGo.g:68:3: ( rule__Model__GreetingsAssignment )
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalGo.g:69:3: ( rule__Model__GreetingsAssignment )
            // InternalGo.g:69:4: rule__Model__GreetingsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__GreetingsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "ruleOPERATORS"
    // InternalGo.g:79:1: ruleOPERATORS : ( ( rule__OPERATORS__Alternatives ) ) ;
    public final void ruleOPERATORS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:83:2: ( ( ( rule__OPERATORS__Alternatives ) ) )
            // InternalGo.g:84:2: ( ( rule__OPERATORS__Alternatives ) )
            {
            // InternalGo.g:84:2: ( ( rule__OPERATORS__Alternatives ) )
            // InternalGo.g:85:3: ( rule__OPERATORS__Alternatives )
            {
             before(grammarAccess.getOPERATORSAccess().getAlternatives()); 
            // InternalGo.g:86:3: ( rule__OPERATORS__Alternatives )
            // InternalGo.g:86:4: rule__OPERATORS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OPERATORS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOPERATORSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPERATORS"


    // $ANTLR start "entryRuleInt_lit"
    // InternalGo.g:95:1: entryRuleInt_lit : ruleInt_lit EOF ;
    public final void entryRuleInt_lit() throws RecognitionException {
        try {
            // InternalGo.g:96:1: ( ruleInt_lit EOF )
            // InternalGo.g:97:1: ruleInt_lit EOF
            {
             before(grammarAccess.getInt_litRule()); 
            pushFollow(FOLLOW_1);
            ruleInt_lit();

            state._fsp--;

             after(grammarAccess.getInt_litRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt_lit"


    // $ANTLR start "ruleInt_lit"
    // InternalGo.g:104:1: ruleInt_lit : ( ( rule__Int_lit__Alternatives ) ) ;
    public final void ruleInt_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:108:2: ( ( ( rule__Int_lit__Alternatives ) ) )
            // InternalGo.g:109:2: ( ( rule__Int_lit__Alternatives ) )
            {
            // InternalGo.g:109:2: ( ( rule__Int_lit__Alternatives ) )
            // InternalGo.g:110:3: ( rule__Int_lit__Alternatives )
            {
             before(grammarAccess.getInt_litAccess().getAlternatives()); 
            // InternalGo.g:111:3: ( rule__Int_lit__Alternatives )
            // InternalGo.g:111:4: rule__Int_lit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Int_lit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInt_litAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt_lit"


    // $ANTLR start "entryRuleFloat_lit"
    // InternalGo.g:120:1: entryRuleFloat_lit : ruleFloat_lit EOF ;
    public final void entryRuleFloat_lit() throws RecognitionException {
        try {
            // InternalGo.g:121:1: ( ruleFloat_lit EOF )
            // InternalGo.g:122:1: ruleFloat_lit EOF
            {
             before(grammarAccess.getFloat_litRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat_lit();

            state._fsp--;

             after(grammarAccess.getFloat_litRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat_lit"


    // $ANTLR start "ruleFloat_lit"
    // InternalGo.g:129:1: ruleFloat_lit : ( ( rule__Float_lit__Group__0 ) ) ;
    public final void ruleFloat_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:133:2: ( ( ( rule__Float_lit__Group__0 ) ) )
            // InternalGo.g:134:2: ( ( rule__Float_lit__Group__0 ) )
            {
            // InternalGo.g:134:2: ( ( rule__Float_lit__Group__0 ) )
            // InternalGo.g:135:3: ( rule__Float_lit__Group__0 )
            {
             before(grammarAccess.getFloat_litAccess().getGroup()); 
            // InternalGo.g:136:3: ( rule__Float_lit__Group__0 )
            // InternalGo.g:136:4: rule__Float_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat_litAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat_lit"


    // $ANTLR start "entryRuleExponent"
    // InternalGo.g:145:1: entryRuleExponent : ruleExponent EOF ;
    public final void entryRuleExponent() throws RecognitionException {
        try {
            // InternalGo.g:146:1: ( ruleExponent EOF )
            // InternalGo.g:147:1: ruleExponent EOF
            {
             before(grammarAccess.getExponentRule()); 
            pushFollow(FOLLOW_1);
            ruleExponent();

            state._fsp--;

             after(grammarAccess.getExponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponent"


    // $ANTLR start "ruleExponent"
    // InternalGo.g:154:1: ruleExponent : ( ( rule__Exponent__Group__0 ) ) ;
    public final void ruleExponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:158:2: ( ( ( rule__Exponent__Group__0 ) ) )
            // InternalGo.g:159:2: ( ( rule__Exponent__Group__0 ) )
            {
            // InternalGo.g:159:2: ( ( rule__Exponent__Group__0 ) )
            // InternalGo.g:160:3: ( rule__Exponent__Group__0 )
            {
             before(grammarAccess.getExponentAccess().getGroup()); 
            // InternalGo.g:161:3: ( rule__Exponent__Group__0 )
            // InternalGo.g:161:4: rule__Exponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleImaginary_lit"
    // InternalGo.g:170:1: entryRuleImaginary_lit : ruleImaginary_lit EOF ;
    public final void entryRuleImaginary_lit() throws RecognitionException {
        try {
            // InternalGo.g:171:1: ( ruleImaginary_lit EOF )
            // InternalGo.g:172:1: ruleImaginary_lit EOF
            {
             before(grammarAccess.getImaginary_litRule()); 
            pushFollow(FOLLOW_1);
            ruleImaginary_lit();

            state._fsp--;

             after(grammarAccess.getImaginary_litRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImaginary_lit"


    // $ANTLR start "ruleImaginary_lit"
    // InternalGo.g:179:1: ruleImaginary_lit : ( ( rule__Imaginary_lit__Group__0 ) ) ;
    public final void ruleImaginary_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:183:2: ( ( ( rule__Imaginary_lit__Group__0 ) ) )
            // InternalGo.g:184:2: ( ( rule__Imaginary_lit__Group__0 ) )
            {
            // InternalGo.g:184:2: ( ( rule__Imaginary_lit__Group__0 ) )
            // InternalGo.g:185:3: ( rule__Imaginary_lit__Group__0 )
            {
             before(grammarAccess.getImaginary_litAccess().getGroup()); 
            // InternalGo.g:186:3: ( rule__Imaginary_lit__Group__0 )
            // InternalGo.g:186:4: rule__Imaginary_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImaginary_litAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImaginary_lit"


    // $ANTLR start "entryRuleRune_lit"
    // InternalGo.g:195:1: entryRuleRune_lit : ruleRune_lit EOF ;
    public final void entryRuleRune_lit() throws RecognitionException {
        try {
            // InternalGo.g:196:1: ( ruleRune_lit EOF )
            // InternalGo.g:197:1: ruleRune_lit EOF
            {
             before(grammarAccess.getRune_litRule()); 
            pushFollow(FOLLOW_1);
            ruleRune_lit();

            state._fsp--;

             after(grammarAccess.getRune_litRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRune_lit"


    // $ANTLR start "ruleRune_lit"
    // InternalGo.g:204:1: ruleRune_lit : ( ( rule__Rune_lit__Group__0 ) ) ;
    public final void ruleRune_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:208:2: ( ( ( rule__Rune_lit__Group__0 ) ) )
            // InternalGo.g:209:2: ( ( rule__Rune_lit__Group__0 ) )
            {
            // InternalGo.g:209:2: ( ( rule__Rune_lit__Group__0 ) )
            // InternalGo.g:210:3: ( rule__Rune_lit__Group__0 )
            {
             before(grammarAccess.getRune_litAccess().getGroup()); 
            // InternalGo.g:211:3: ( rule__Rune_lit__Group__0 )
            // InternalGo.g:211:4: rule__Rune_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRune_litAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRune_lit"


    // $ANTLR start "entryRuleByte_value"
    // InternalGo.g:220:1: entryRuleByte_value : ruleByte_value EOF ;
    public final void entryRuleByte_value() throws RecognitionException {
        try {
            // InternalGo.g:221:1: ( ruleByte_value EOF )
            // InternalGo.g:222:1: ruleByte_value EOF
            {
             before(grammarAccess.getByte_valueRule()); 
            pushFollow(FOLLOW_1);
            ruleByte_value();

            state._fsp--;

             after(grammarAccess.getByte_valueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleByte_value"


    // $ANTLR start "ruleByte_value"
    // InternalGo.g:229:1: ruleByte_value : ( ( rule__Byte_value__Alternatives ) ) ;
    public final void ruleByte_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:233:2: ( ( ( rule__Byte_value__Alternatives ) ) )
            // InternalGo.g:234:2: ( ( rule__Byte_value__Alternatives ) )
            {
            // InternalGo.g:234:2: ( ( rule__Byte_value__Alternatives ) )
            // InternalGo.g:235:3: ( rule__Byte_value__Alternatives )
            {
             before(grammarAccess.getByte_valueAccess().getAlternatives()); 
            // InternalGo.g:236:3: ( rule__Byte_value__Alternatives )
            // InternalGo.g:236:4: rule__Byte_value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Byte_value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getByte_valueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleByte_value"


    // $ANTLR start "entryRuleString_lit"
    // InternalGo.g:245:1: entryRuleString_lit : ruleString_lit EOF ;
    public final void entryRuleString_lit() throws RecognitionException {
        try {
            // InternalGo.g:246:1: ( ruleString_lit EOF )
            // InternalGo.g:247:1: ruleString_lit EOF
            {
             before(grammarAccess.getString_litRule()); 
            pushFollow(FOLLOW_1);
            ruleString_lit();

            state._fsp--;

             after(grammarAccess.getString_litRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString_lit"


    // $ANTLR start "ruleString_lit"
    // InternalGo.g:254:1: ruleString_lit : ( ( rule__String_lit__Alternatives ) ) ;
    public final void ruleString_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:258:2: ( ( ( rule__String_lit__Alternatives ) ) )
            // InternalGo.g:259:2: ( ( rule__String_lit__Alternatives ) )
            {
            // InternalGo.g:259:2: ( ( rule__String_lit__Alternatives ) )
            // InternalGo.g:260:3: ( rule__String_lit__Alternatives )
            {
             before(grammarAccess.getString_litAccess().getAlternatives()); 
            // InternalGo.g:261:3: ( rule__String_lit__Alternatives )
            // InternalGo.g:261:4: rule__String_lit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__String_lit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getString_litAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString_lit"


    // $ANTLR start "entryRuleInterpreted_string_lit"
    // InternalGo.g:270:1: entryRuleInterpreted_string_lit : ruleInterpreted_string_lit EOF ;
    public final void entryRuleInterpreted_string_lit() throws RecognitionException {
        try {
            // InternalGo.g:271:1: ( ruleInterpreted_string_lit EOF )
            // InternalGo.g:272:1: ruleInterpreted_string_lit EOF
            {
             before(grammarAccess.getInterpreted_string_litRule()); 
            pushFollow(FOLLOW_1);
            ruleInterpreted_string_lit();

            state._fsp--;

             after(grammarAccess.getInterpreted_string_litRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterpreted_string_lit"


    // $ANTLR start "ruleInterpreted_string_lit"
    // InternalGo.g:279:1: ruleInterpreted_string_lit : ( ( rule__Interpreted_string_lit__Group__0 ) ) ;
    public final void ruleInterpreted_string_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:283:2: ( ( ( rule__Interpreted_string_lit__Group__0 ) ) )
            // InternalGo.g:284:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            {
            // InternalGo.g:284:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            // InternalGo.g:285:3: ( rule__Interpreted_string_lit__Group__0 )
            {
             before(grammarAccess.getInterpreted_string_litAccess().getGroup()); 
            // InternalGo.g:286:3: ( rule__Interpreted_string_lit__Group__0 )
            // InternalGo.g:286:4: rule__Interpreted_string_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterpreted_string_litAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterpreted_string_lit"


    // $ANTLR start "entryRuleLiterals"
    // InternalGo.g:295:1: entryRuleLiterals : ruleLiterals EOF ;
    public final void entryRuleLiterals() throws RecognitionException {
        try {
            // InternalGo.g:296:1: ( ruleLiterals EOF )
            // InternalGo.g:297:1: ruleLiterals EOF
            {
             before(grammarAccess.getLiteralsRule()); 
            pushFollow(FOLLOW_1);
            ruleLiterals();

            state._fsp--;

             after(grammarAccess.getLiteralsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiterals"


    // $ANTLR start "ruleLiterals"
    // InternalGo.g:304:1: ruleLiterals : ( ( rule__Literals__Alternatives ) ) ;
    public final void ruleLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:308:2: ( ( ( rule__Literals__Alternatives ) ) )
            // InternalGo.g:309:2: ( ( rule__Literals__Alternatives ) )
            {
            // InternalGo.g:309:2: ( ( rule__Literals__Alternatives ) )
            // InternalGo.g:310:3: ( rule__Literals__Alternatives )
            {
             before(grammarAccess.getLiteralsAccess().getAlternatives()); 
            // InternalGo.g:311:3: ( rule__Literals__Alternatives )
            // InternalGo.g:311:4: rule__Literals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiterals"


    // $ANTLR start "entryRuleType"
    // InternalGo.g:320:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGo.g:321:1: ( ruleType EOF )
            // InternalGo.g:322:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGo.g:329:1: ruleType : ( ruleType_name ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:333:2: ( ( ruleType_name ) )
            // InternalGo.g:334:2: ( ruleType_name )
            {
            // InternalGo.g:334:2: ( ruleType_name )
            // InternalGo.g:335:3: ruleType_name
            {
             before(grammarAccess.getTypeAccess().getType_nameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleType_name();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getType_nameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_name"
    // InternalGo.g:345:1: entryRuleType_name : ruleType_name EOF ;
    public final void entryRuleType_name() throws RecognitionException {
        try {
            // InternalGo.g:346:1: ( ruleType_name EOF )
            // InternalGo.g:347:1: ruleType_name EOF
            {
             before(grammarAccess.getType_nameRule()); 
            pushFollow(FOLLOW_1);
            ruleType_name();

            state._fsp--;

             after(grammarAccess.getType_nameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType_name"


    // $ANTLR start "ruleType_name"
    // InternalGo.g:354:1: ruleType_name : ( ( rule__Type_name__Alternatives ) ) ;
    public final void ruleType_name() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:358:2: ( ( ( rule__Type_name__Alternatives ) ) )
            // InternalGo.g:359:2: ( ( rule__Type_name__Alternatives ) )
            {
            // InternalGo.g:359:2: ( ( rule__Type_name__Alternatives ) )
            // InternalGo.g:360:3: ( rule__Type_name__Alternatives )
            {
             before(grammarAccess.getType_nameAccess().getAlternatives()); 
            // InternalGo.g:361:3: ( rule__Type_name__Alternatives )
            // InternalGo.g:361:4: rule__Type_name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type_name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getType_nameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_name"


    // $ANTLR start "entryRuleParameter_list"
    // InternalGo.g:370:1: entryRuleParameter_list : ruleParameter_list EOF ;
    public final void entryRuleParameter_list() throws RecognitionException {
        try {
            // InternalGo.g:371:1: ( ruleParameter_list EOF )
            // InternalGo.g:372:1: ruleParameter_list EOF
            {
             before(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter_list();

            state._fsp--;

             after(grammarAccess.getParameter_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // InternalGo.g:379:1: ruleParameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleParameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:383:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // InternalGo.g:384:2: ( ( rule__Parameter_list__Group__0 ) )
            {
            // InternalGo.g:384:2: ( ( rule__Parameter_list__Group__0 ) )
            // InternalGo.g:385:3: ( rule__Parameter_list__Group__0 )
            {
             before(grammarAccess.getParameter_listAccess().getGroup()); 
            // InternalGo.g:386:3: ( rule__Parameter_list__Group__0 )
            // InternalGo.g:386:4: rule__Parameter_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "ruleParameter_decl"
    // InternalGo.g:396:1: ruleParameter_decl : ( ( rule__Parameter_decl__Group__0 ) ) ;
    public final void ruleParameter_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:400:2: ( ( ( rule__Parameter_decl__Group__0 ) ) )
            // InternalGo.g:401:2: ( ( rule__Parameter_decl__Group__0 ) )
            {
            // InternalGo.g:401:2: ( ( rule__Parameter_decl__Group__0 ) )
            // InternalGo.g:402:3: ( rule__Parameter_decl__Group__0 )
            {
             before(grammarAccess.getParameter_declAccess().getGroup()); 
            // InternalGo.g:403:3: ( rule__Parameter_decl__Group__0 )
            // InternalGo.g:403:4: rule__Parameter_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_declAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter_decl"


    // $ANTLR start "entryRuleIdentifier_list"
    // InternalGo.g:412:1: entryRuleIdentifier_list : ruleIdentifier_list EOF ;
    public final void entryRuleIdentifier_list() throws RecognitionException {
        try {
            // InternalGo.g:413:1: ( ruleIdentifier_list EOF )
            // InternalGo.g:414:1: ruleIdentifier_list EOF
            {
             before(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier_list();

            state._fsp--;

             after(grammarAccess.getIdentifier_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier_list"


    // $ANTLR start "ruleIdentifier_list"
    // InternalGo.g:421:1: ruleIdentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleIdentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:425:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalGo.g:426:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalGo.g:426:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalGo.g:427:3: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // InternalGo.g:428:3: ( rule__Identifier_list__Group__0 )
            // InternalGo.g:428:4: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier_list"


    // $ANTLR start "entryRuleQualified_ident"
    // InternalGo.g:437:1: entryRuleQualified_ident : ruleQualified_ident EOF ;
    public final void entryRuleQualified_ident() throws RecognitionException {
        try {
            // InternalGo.g:438:1: ( ruleQualified_ident EOF )
            // InternalGo.g:439:1: ruleQualified_ident EOF
            {
             before(grammarAccess.getQualified_identRule()); 
            pushFollow(FOLLOW_1);
            ruleQualified_ident();

            state._fsp--;

             after(grammarAccess.getQualified_identRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualified_ident"


    // $ANTLR start "ruleQualified_ident"
    // InternalGo.g:446:1: ruleQualified_ident : ( ( rule__Qualified_ident__Group__0 ) ) ;
    public final void ruleQualified_ident() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:450:2: ( ( ( rule__Qualified_ident__Group__0 ) ) )
            // InternalGo.g:451:2: ( ( rule__Qualified_ident__Group__0 ) )
            {
            // InternalGo.g:451:2: ( ( rule__Qualified_ident__Group__0 ) )
            // InternalGo.g:452:3: ( rule__Qualified_ident__Group__0 )
            {
             before(grammarAccess.getQualified_identAccess().getGroup()); 
            // InternalGo.g:453:3: ( rule__Qualified_ident__Group__0 )
            // InternalGo.g:453:4: rule__Qualified_ident__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualified_identAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualified_ident"


    // $ANTLR start "entryRuleImport_spec"
    // InternalGo.g:462:1: entryRuleImport_spec : ruleImport_spec EOF ;
    public final void entryRuleImport_spec() throws RecognitionException {
        try {
            // InternalGo.g:463:1: ( ruleImport_spec EOF )
            // InternalGo.g:464:1: ruleImport_spec EOF
            {
             before(grammarAccess.getImport_specRule()); 
            pushFollow(FOLLOW_1);
            ruleImport_spec();

            state._fsp--;

             after(grammarAccess.getImport_specRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport_spec"


    // $ANTLR start "ruleImport_spec"
    // InternalGo.g:471:1: ruleImport_spec : ( ( rule__Import_spec__Group__0 ) ) ;
    public final void ruleImport_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:475:2: ( ( ( rule__Import_spec__Group__0 ) ) )
            // InternalGo.g:476:2: ( ( rule__Import_spec__Group__0 ) )
            {
            // InternalGo.g:476:2: ( ( rule__Import_spec__Group__0 ) )
            // InternalGo.g:477:3: ( rule__Import_spec__Group__0 )
            {
             before(grammarAccess.getImport_specAccess().getGroup()); 
            // InternalGo.g:478:3: ( rule__Import_spec__Group__0 )
            // InternalGo.g:478:4: rule__Import_spec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import_spec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImport_specAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport_spec"


    // $ANTLR start "entryRuleImport_path"
    // InternalGo.g:487:1: entryRuleImport_path : ruleImport_path EOF ;
    public final void entryRuleImport_path() throws RecognitionException {
        try {
            // InternalGo.g:488:1: ( ruleImport_path EOF )
            // InternalGo.g:489:1: ruleImport_path EOF
            {
             before(grammarAccess.getImport_pathRule()); 
            pushFollow(FOLLOW_1);
            ruleImport_path();

            state._fsp--;

             after(grammarAccess.getImport_pathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport_path"


    // $ANTLR start "ruleImport_path"
    // InternalGo.g:496:1: ruleImport_path : ( ruleString_lit ) ;
    public final void ruleImport_path() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:500:2: ( ( ruleString_lit ) )
            // InternalGo.g:501:2: ( ruleString_lit )
            {
            // InternalGo.g:501:2: ( ruleString_lit )
            // InternalGo.g:502:3: ruleString_lit
            {
             before(grammarAccess.getImport_pathAccess().getString_litParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleString_lit();

            state._fsp--;

             after(grammarAccess.getImport_pathAccess().getString_litParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport_path"


    // $ANTLR start "rule__OPERATORS__Alternatives"
    // InternalGo.g:511:1: rule__OPERATORS__Alternatives : ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) );
    public final void rule__OPERATORS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:515:1: ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) )
            int alt1=17;
            switch ( input.LA(1) ) {
            case RULE_BINARY_OP:
                {
                alt1=1;
                }
                break;
            case 35:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            case 37:
                {
                alt1=4;
                }
                break;
            case 38:
                {
                alt1=5;
                }
                break;
            case 39:
                {
                alt1=6;
                }
                break;
            case 40:
                {
                alt1=7;
                }
                break;
            case 41:
                {
                alt1=8;
                }
                break;
            case 42:
                {
                alt1=9;
                }
                break;
            case 43:
                {
                alt1=10;
                }
                break;
            case 44:
                {
                alt1=11;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt1=12;
                }
                break;
            case 45:
                {
                alt1=13;
                }
                break;
            case 46:
                {
                alt1=14;
                }
                break;
            case 47:
                {
                alt1=15;
                }
                break;
            case 48:
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
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGo.g:516:2: ( RULE_BINARY_OP )
                    {
                    // InternalGo.g:516:2: ( RULE_BINARY_OP )
                    // InternalGo.g:517:3: RULE_BINARY_OP
                    {
                     before(grammarAccess.getOPERATORSAccess().getBINARY_OPTerminalRuleCall_0()); 
                    match(input,RULE_BINARY_OP,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getBINARY_OPTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:522:2: ( '(' )
                    {
                    // InternalGo.g:522:2: ( '(' )
                    // InternalGo.g:523:3: '('
                    {
                     before(grammarAccess.getOPERATORSAccess().getLeftParenthesisKeyword_1()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getLeftParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:528:2: ( ')' )
                    {
                    // InternalGo.g:528:2: ( ')' )
                    // InternalGo.g:529:3: ')'
                    {
                     before(grammarAccess.getOPERATORSAccess().getRightParenthesisKeyword_2()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getRightParenthesisKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:534:2: ( '[' )
                    {
                    // InternalGo.g:534:2: ( '[' )
                    // InternalGo.g:535:3: '['
                    {
                     before(grammarAccess.getOPERATORSAccess().getLeftSquareBracketKeyword_3()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getLeftSquareBracketKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:540:2: ( ']' )
                    {
                    // InternalGo.g:540:2: ( ']' )
                    // InternalGo.g:541:3: ']'
                    {
                     before(grammarAccess.getOPERATORSAccess().getRightSquareBracketKeyword_4()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getRightSquareBracketKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:546:2: ( '{' )
                    {
                    // InternalGo.g:546:2: ( '{' )
                    // InternalGo.g:547:3: '{'
                    {
                     before(grammarAccess.getOPERATORSAccess().getLeftCurlyBracketKeyword_5()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getLeftCurlyBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:552:2: ( '}' )
                    {
                    // InternalGo.g:552:2: ( '}' )
                    // InternalGo.g:553:3: '}'
                    {
                     before(grammarAccess.getOPERATORSAccess().getRightCurlyBracketKeyword_6()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getRightCurlyBracketKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:558:2: ( '++' )
                    {
                    // InternalGo.g:558:2: ( '++' )
                    // InternalGo.g:559:3: '++'
                    {
                     before(grammarAccess.getOPERATORSAccess().getPlusSignPlusSignKeyword_7()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getPlusSignPlusSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:564:2: ( '=' )
                    {
                    // InternalGo.g:564:2: ( '=' )
                    // InternalGo.g:565:3: '='
                    {
                     before(grammarAccess.getOPERATORSAccess().getEqualsSignKeyword_8()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getEqualsSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:570:2: ( ':=' )
                    {
                    // InternalGo.g:570:2: ( ':=' )
                    // InternalGo.g:571:3: ':='
                    {
                     before(grammarAccess.getOPERATORSAccess().getColonEqualsSignKeyword_9()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getColonEqualsSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGo.g:576:2: ( ',' )
                    {
                    // InternalGo.g:576:2: ( ',' )
                    // InternalGo.g:577:3: ','
                    {
                     before(grammarAccess.getOPERATORSAccess().getCommaKeyword_10()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getCommaKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGo.g:582:2: ( RULE_SEMICOLON )
                    {
                    // InternalGo.g:582:2: ( RULE_SEMICOLON )
                    // InternalGo.g:583:3: RULE_SEMICOLON
                    {
                     before(grammarAccess.getOPERATORSAccess().getSEMICOLONTerminalRuleCall_11()); 
                    match(input,RULE_SEMICOLON,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getSEMICOLONTerminalRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGo.g:588:2: ( '--' )
                    {
                    // InternalGo.g:588:2: ( '--' )
                    // InternalGo.g:589:3: '--'
                    {
                     before(grammarAccess.getOPERATORSAccess().getHyphenMinusHyphenMinusKeyword_12()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getHyphenMinusHyphenMinusKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGo.g:594:2: ( '...' )
                    {
                    // InternalGo.g:594:2: ( '...' )
                    // InternalGo.g:595:3: '...'
                    {
                     before(grammarAccess.getOPERATORSAccess().getFullStopFullStopFullStopKeyword_13()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getFullStopFullStopFullStopKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGo.g:600:2: ( '.' )
                    {
                    // InternalGo.g:600:2: ( '.' )
                    // InternalGo.g:601:3: '.'
                    {
                     before(grammarAccess.getOPERATORSAccess().getFullStopKeyword_14()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getFullStopKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalGo.g:606:2: ( ':' )
                    {
                    // InternalGo.g:606:2: ( ':' )
                    // InternalGo.g:607:3: ':'
                    {
                     before(grammarAccess.getOPERATORSAccess().getColonKeyword_15()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getColonKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalGo.g:612:2: ( RULE_ASSIGN_OP )
                    {
                    // InternalGo.g:612:2: ( RULE_ASSIGN_OP )
                    // InternalGo.g:613:3: RULE_ASSIGN_OP
                    {
                     before(grammarAccess.getOPERATORSAccess().getASSIGN_OPTerminalRuleCall_16()); 
                    match(input,RULE_ASSIGN_OP,FOLLOW_2); 
                     after(grammarAccess.getOPERATORSAccess().getASSIGN_OPTerminalRuleCall_16()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPERATORS__Alternatives"


    // $ANTLR start "rule__Int_lit__Alternatives"
    // InternalGo.g:622:1: rule__Int_lit__Alternatives : ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) );
    public final void rule__Int_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:626:1: ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:627:2: ( RULE_INT )
                    {
                    // InternalGo.g:627:2: ( RULE_INT )
                    // InternalGo.g:628:3: RULE_INT
                    {
                     before(grammarAccess.getInt_litAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getInt_litAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:633:2: ( RULE_OCTAL_LIT )
                    {
                    // InternalGo.g:633:2: ( RULE_OCTAL_LIT )
                    // InternalGo.g:634:3: RULE_OCTAL_LIT
                    {
                     before(grammarAccess.getInt_litAccess().getOCTAL_LITTerminalRuleCall_1()); 
                    match(input,RULE_OCTAL_LIT,FOLLOW_2); 
                     after(grammarAccess.getInt_litAccess().getOCTAL_LITTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:639:2: ( RULE_HEX_LIT )
                    {
                    // InternalGo.g:639:2: ( RULE_HEX_LIT )
                    // InternalGo.g:640:3: RULE_HEX_LIT
                    {
                     before(grammarAccess.getInt_litAccess().getHEX_LITTerminalRuleCall_2()); 
                    match(input,RULE_HEX_LIT,FOLLOW_2); 
                     after(grammarAccess.getInt_litAccess().getHEX_LITTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int_lit__Alternatives"


    // $ANTLR start "rule__Float_lit__Alternatives_1"
    // InternalGo.g:649:1: rule__Float_lit__Alternatives_1 : ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) );
    public final void rule__Float_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:653:1: ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==47) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=49 && LA3_0<=50)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:654:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    {
                    // InternalGo.g:654:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    // InternalGo.g:655:3: ( rule__Float_lit__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloat_litAccess().getGroup_1_0()); 
                    // InternalGo.g:656:3: ( rule__Float_lit__Group_1_0__0 )
                    // InternalGo.g:656:4: rule__Float_lit__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float_lit__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloat_litAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:660:2: ( ruleExponent )
                    {
                    // InternalGo.g:660:2: ( ruleExponent )
                    // InternalGo.g:661:3: ruleExponent
                    {
                     before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExponent();

                    state._fsp--;

                     after(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Alternatives_1"


    // $ANTLR start "rule__Exponent__Alternatives_0"
    // InternalGo.g:670:1: rule__Exponent__Alternatives_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Exponent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:674:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==50) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:675:2: ( 'E' )
                    {
                    // InternalGo.g:675:2: ( 'E' )
                    // InternalGo.g:676:3: 'E'
                    {
                     before(grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getExponentAccess().getEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:681:2: ( 'e' )
                    {
                    // InternalGo.g:681:2: ( 'e' )
                    // InternalGo.g:682:3: 'e'
                    {
                     before(grammarAccess.getExponentAccess().getEKeyword_0_1()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getExponentAccess().getEKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Alternatives_0"


    // $ANTLR start "rule__Exponent__Alternatives_1"
    // InternalGo.g:691:1: rule__Exponent__Alternatives_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Exponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:695:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==51) ) {
                alt5=1;
            }
            else if ( (LA5_0==52) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:696:2: ( '+' )
                    {
                    // InternalGo.g:696:2: ( '+' )
                    // InternalGo.g:697:3: '+'
                    {
                     before(grammarAccess.getExponentAccess().getPlusSignKeyword_1_0()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getExponentAccess().getPlusSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:702:2: ( '-' )
                    {
                    // InternalGo.g:702:2: ( '-' )
                    // InternalGo.g:703:3: '-'
                    {
                     before(grammarAccess.getExponentAccess().getHyphenMinusKeyword_1_1()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getExponentAccess().getHyphenMinusKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Alternatives_1"


    // $ANTLR start "rule__Imaginary_lit__Alternatives_0"
    // InternalGo.g:712:1: rule__Imaginary_lit__Alternatives_0 : ( ( RULE_INT ) | ( ruleFloat_lit ) );
    public final void rule__Imaginary_lit__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:716:1: ( ( RULE_INT ) | ( ruleFloat_lit ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==47||(LA6_1>=49 && LA6_1<=50)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==53) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:717:2: ( RULE_INT )
                    {
                    // InternalGo.g:717:2: ( RULE_INT )
                    // InternalGo.g:718:3: RULE_INT
                    {
                     before(grammarAccess.getImaginary_litAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getImaginary_litAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:723:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:723:2: ( ruleFloat_lit )
                    // InternalGo.g:724:3: ruleFloat_lit
                    {
                     before(grammarAccess.getImaginary_litAccess().getFloat_litParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat_lit();

                    state._fsp--;

                     after(grammarAccess.getImaginary_litAccess().getFloat_litParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imaginary_lit__Alternatives_0"


    // $ANTLR start "rule__Rune_lit__Alternatives_1"
    // InternalGo.g:733:1: rule__Rune_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Rune_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:737:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_UNICODE_VALUE) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_OCTAL_BYTE_VALUE && LA7_0<=RULE_HEX_BYTE_VALUE)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:738:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:738:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:739:3: RULE_UNICODE_VALUE
                    {
                     before(grammarAccess.getRune_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 
                    match(input,RULE_UNICODE_VALUE,FOLLOW_2); 
                     after(grammarAccess.getRune_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:744:2: ( ruleByte_value )
                    {
                    // InternalGo.g:744:2: ( ruleByte_value )
                    // InternalGo.g:745:3: ruleByte_value
                    {
                     before(grammarAccess.getRune_litAccess().getByte_valueParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleByte_value();

                    state._fsp--;

                     after(grammarAccess.getRune_litAccess().getByte_valueParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rune_lit__Alternatives_1"


    // $ANTLR start "rule__Byte_value__Alternatives"
    // InternalGo.g:754:1: rule__Byte_value__Alternatives : ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) );
    public final void rule__Byte_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:758:1: ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OCTAL_BYTE_VALUE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HEX_BYTE_VALUE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:759:2: ( RULE_OCTAL_BYTE_VALUE )
                    {
                    // InternalGo.g:759:2: ( RULE_OCTAL_BYTE_VALUE )
                    // InternalGo.g:760:3: RULE_OCTAL_BYTE_VALUE
                    {
                     before(grammarAccess.getByte_valueAccess().getOCTAL_BYTE_VALUETerminalRuleCall_0()); 
                    match(input,RULE_OCTAL_BYTE_VALUE,FOLLOW_2); 
                     after(grammarAccess.getByte_valueAccess().getOCTAL_BYTE_VALUETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:765:2: ( RULE_HEX_BYTE_VALUE )
                    {
                    // InternalGo.g:765:2: ( RULE_HEX_BYTE_VALUE )
                    // InternalGo.g:766:3: RULE_HEX_BYTE_VALUE
                    {
                     before(grammarAccess.getByte_valueAccess().getHEX_BYTE_VALUETerminalRuleCall_1()); 
                    match(input,RULE_HEX_BYTE_VALUE,FOLLOW_2); 
                     after(grammarAccess.getByte_valueAccess().getHEX_BYTE_VALUETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte_value__Alternatives"


    // $ANTLR start "rule__String_lit__Alternatives"
    // InternalGo.g:775:1: rule__String_lit__Alternatives : ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) );
    public final void rule__String_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:779:1: ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_RAW_STRING_LIT) ) {
                alt9=1;
            }
            else if ( (LA9_0==55) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:780:2: ( RULE_RAW_STRING_LIT )
                    {
                    // InternalGo.g:780:2: ( RULE_RAW_STRING_LIT )
                    // InternalGo.g:781:3: RULE_RAW_STRING_LIT
                    {
                     before(grammarAccess.getString_litAccess().getRAW_STRING_LITTerminalRuleCall_0()); 
                    match(input,RULE_RAW_STRING_LIT,FOLLOW_2); 
                     after(grammarAccess.getString_litAccess().getRAW_STRING_LITTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:786:2: ( ruleInterpreted_string_lit )
                    {
                    // InternalGo.g:786:2: ( ruleInterpreted_string_lit )
                    // InternalGo.g:787:3: ruleInterpreted_string_lit
                    {
                     before(grammarAccess.getString_litAccess().getInterpreted_string_litParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInterpreted_string_lit();

                    state._fsp--;

                     after(grammarAccess.getString_litAccess().getInterpreted_string_litParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_lit__Alternatives"


    // $ANTLR start "rule__Interpreted_string_lit__Alternatives_1"
    // InternalGo.g:796:1: rule__Interpreted_string_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Interpreted_string_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:800:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_UNICODE_VALUE) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_OCTAL_BYTE_VALUE && LA10_0<=RULE_HEX_BYTE_VALUE)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:801:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:801:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:802:3: RULE_UNICODE_VALUE
                    {
                     before(grammarAccess.getInterpreted_string_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 
                    match(input,RULE_UNICODE_VALUE,FOLLOW_2); 
                     after(grammarAccess.getInterpreted_string_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:807:2: ( ruleByte_value )
                    {
                    // InternalGo.g:807:2: ( ruleByte_value )
                    // InternalGo.g:808:3: ruleByte_value
                    {
                     before(grammarAccess.getInterpreted_string_litAccess().getByte_valueParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleByte_value();

                    state._fsp--;

                     after(grammarAccess.getInterpreted_string_litAccess().getByte_valueParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpreted_string_lit__Alternatives_1"


    // $ANTLR start "rule__Literals__Alternatives"
    // InternalGo.g:817:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );
    public final void rule__Literals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:821:1: ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) )
            int alt11=5;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalGo.g:822:2: ( ruleInt_lit )
                    {
                    // InternalGo.g:822:2: ( ruleInt_lit )
                    // InternalGo.g:823:3: ruleInt_lit
                    {
                     before(grammarAccess.getLiteralsAccess().getInt_litParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInt_lit();

                    state._fsp--;

                     after(grammarAccess.getLiteralsAccess().getInt_litParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:828:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:828:2: ( ruleFloat_lit )
                    // InternalGo.g:829:3: ruleFloat_lit
                    {
                     before(grammarAccess.getLiteralsAccess().getFloat_litParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat_lit();

                    state._fsp--;

                     after(grammarAccess.getLiteralsAccess().getFloat_litParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:834:2: ( ruleImaginary_lit )
                    {
                    // InternalGo.g:834:2: ( ruleImaginary_lit )
                    // InternalGo.g:835:3: ruleImaginary_lit
                    {
                     before(grammarAccess.getLiteralsAccess().getImaginary_litParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImaginary_lit();

                    state._fsp--;

                     after(grammarAccess.getLiteralsAccess().getImaginary_litParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:840:2: ( ruleRune_lit )
                    {
                    // InternalGo.g:840:2: ( ruleRune_lit )
                    // InternalGo.g:841:3: ruleRune_lit
                    {
                     before(grammarAccess.getLiteralsAccess().getRune_litParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRune_lit();

                    state._fsp--;

                     after(grammarAccess.getLiteralsAccess().getRune_litParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:846:2: ( ruleString_lit )
                    {
                    // InternalGo.g:846:2: ( ruleString_lit )
                    // InternalGo.g:847:3: ruleString_lit
                    {
                     before(grammarAccess.getLiteralsAccess().getString_litParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleString_lit();

                    state._fsp--;

                     after(grammarAccess.getLiteralsAccess().getString_litParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literals__Alternatives"


    // $ANTLR start "rule__Type_name__Alternatives"
    // InternalGo.g:856:1: rule__Type_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Type_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:860:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_IDENTIFIER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==47) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||LA12_1==44) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:861:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:861:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:862:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getType_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getType_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:867:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:867:2: ( ruleQualified_ident )
                    // InternalGo.g:868:3: ruleQualified_ident
                    {
                     before(grammarAccess.getType_nameAccess().getQualified_identParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQualified_ident();

                    state._fsp--;

                     after(grammarAccess.getType_nameAccess().getQualified_identParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_name__Alternatives"


    // $ANTLR start "rule__Import_spec__Alternatives_0"
    // InternalGo.g:877:1: rule__Import_spec__Alternatives_0 : ( ( '.' ) | ( RULE_IDENTIFIER ) );
    public final void rule__Import_spec__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:881:1: ( ( '.' ) | ( RULE_IDENTIFIER ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_IDENTIFIER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:882:2: ( '.' )
                    {
                    // InternalGo.g:882:2: ( '.' )
                    // InternalGo.g:883:3: '.'
                    {
                     before(grammarAccess.getImport_specAccess().getFullStopKeyword_0_0()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getImport_specAccess().getFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:888:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:888:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:889:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getImport_specAccess().getIDENTIFIERTerminalRuleCall_0_1()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getImport_specAccess().getIDENTIFIERTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_spec__Alternatives_0"


    // $ANTLR start "rule__Float_lit__Group__0"
    // InternalGo.g:898:1: rule__Float_lit__Group__0 : rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 ;
    public final void rule__Float_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:902:1: ( rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 )
            // InternalGo.g:903:2: rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Float_lit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__0"


    // $ANTLR start "rule__Float_lit__Group__0__Impl"
    // InternalGo.g:910:1: rule__Float_lit__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:914:1: ( ( RULE_INT ) )
            // InternalGo.g:915:1: ( RULE_INT )
            {
            // InternalGo.g:915:1: ( RULE_INT )
            // InternalGo.g:916:2: RULE_INT
            {
             before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__0__Impl"


    // $ANTLR start "rule__Float_lit__Group__1"
    // InternalGo.g:925:1: rule__Float_lit__Group__1 : rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 ;
    public final void rule__Float_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:929:1: ( rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 )
            // InternalGo.g:930:2: rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Float_lit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__1"


    // $ANTLR start "rule__Float_lit__Group__1__Impl"
    // InternalGo.g:937:1: rule__Float_lit__Group__1__Impl : ( ( rule__Float_lit__Alternatives_1 ) ) ;
    public final void rule__Float_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:941:1: ( ( ( rule__Float_lit__Alternatives_1 ) ) )
            // InternalGo.g:942:1: ( ( rule__Float_lit__Alternatives_1 ) )
            {
            // InternalGo.g:942:1: ( ( rule__Float_lit__Alternatives_1 ) )
            // InternalGo.g:943:2: ( rule__Float_lit__Alternatives_1 )
            {
             before(grammarAccess.getFloat_litAccess().getAlternatives_1()); 
            // InternalGo.g:944:2: ( rule__Float_lit__Alternatives_1 )
            // InternalGo.g:944:3: rule__Float_lit__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFloat_litAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__1__Impl"


    // $ANTLR start "rule__Float_lit__Group__2"
    // InternalGo.g:952:1: rule__Float_lit__Group__2 : rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 ;
    public final void rule__Float_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:956:1: ( rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 )
            // InternalGo.g:957:2: rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Float_lit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__2"


    // $ANTLR start "rule__Float_lit__Group__2__Impl"
    // InternalGo.g:964:1: rule__Float_lit__Group__2__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:968:1: ( ( '.' ) )
            // InternalGo.g:969:1: ( '.' )
            {
            // InternalGo.g:969:1: ( '.' )
            // InternalGo.g:970:2: '.'
            {
             before(grammarAccess.getFloat_litAccess().getFullStopKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFloat_litAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__2__Impl"


    // $ANTLR start "rule__Float_lit__Group__3"
    // InternalGo.g:979:1: rule__Float_lit__Group__3 : rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 ;
    public final void rule__Float_lit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:983:1: ( rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 )
            // InternalGo.g:984:2: rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Float_lit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__3"


    // $ANTLR start "rule__Float_lit__Group__3__Impl"
    // InternalGo.g:991:1: rule__Float_lit__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:995:1: ( ( RULE_INT ) )
            // InternalGo.g:996:1: ( RULE_INT )
            {
            // InternalGo.g:996:1: ( RULE_INT )
            // InternalGo.g:997:2: RULE_INT
            {
             before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__3__Impl"


    // $ANTLR start "rule__Float_lit__Group__4"
    // InternalGo.g:1006:1: rule__Float_lit__Group__4 : rule__Float_lit__Group__4__Impl ;
    public final void rule__Float_lit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1010:1: ( rule__Float_lit__Group__4__Impl )
            // InternalGo.g:1011:2: rule__Float_lit__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__4"


    // $ANTLR start "rule__Float_lit__Group__4__Impl"
    // InternalGo.g:1017:1: rule__Float_lit__Group__4__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1021:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:1022:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:1022:1: ( ( ruleExponent )? )
            // InternalGo.g:1023:2: ( ruleExponent )?
            {
             before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4()); 
            // InternalGo.g:1024:2: ( ruleExponent )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=49 && LA14_0<=50)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1024:3: ruleExponent
                    {
                    pushFollow(FOLLOW_2);
                    ruleExponent();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group__4__Impl"


    // $ANTLR start "rule__Float_lit__Group_1_0__0"
    // InternalGo.g:1033:1: rule__Float_lit__Group_1_0__0 : rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 ;
    public final void rule__Float_lit__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1037:1: ( rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 )
            // InternalGo.g:1038:2: rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Float_lit__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float_lit__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group_1_0__0"


    // $ANTLR start "rule__Float_lit__Group_1_0__0__Impl"
    // InternalGo.g:1045:1: rule__Float_lit__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1049:1: ( ( '.' ) )
            // InternalGo.g:1050:1: ( '.' )
            {
            // InternalGo.g:1050:1: ( '.' )
            // InternalGo.g:1051:2: '.'
            {
             before(grammarAccess.getFloat_litAccess().getFullStopKeyword_1_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFloat_litAccess().getFullStopKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group_1_0__0__Impl"


    // $ANTLR start "rule__Float_lit__Group_1_0__1"
    // InternalGo.g:1060:1: rule__Float_lit__Group_1_0__1 : rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 ;
    public final void rule__Float_lit__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1064:1: ( rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 )
            // InternalGo.g:1065:2: rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Float_lit__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float_lit__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group_1_0__1"


    // $ANTLR start "rule__Float_lit__Group_1_0__1__Impl"
    // InternalGo.g:1072:1: rule__Float_lit__Group_1_0__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Float_lit__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1076:1: ( ( ( RULE_INT )? ) )
            // InternalGo.g:1077:1: ( ( RULE_INT )? )
            {
            // InternalGo.g:1077:1: ( ( RULE_INT )? )
            // InternalGo.g:1078:2: ( RULE_INT )?
            {
             before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1()); 
            // InternalGo.g:1079:2: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:1079:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group_1_0__1__Impl"


    // $ANTLR start "rule__Float_lit__Group_1_0__2"
    // InternalGo.g:1087:1: rule__Float_lit__Group_1_0__2 : rule__Float_lit__Group_1_0__2__Impl ;
    public final void rule__Float_lit__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1091:1: ( rule__Float_lit__Group_1_0__2__Impl )
            // InternalGo.g:1092:2: rule__Float_lit__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group_1_0__2"


    // $ANTLR start "rule__Float_lit__Group_1_0__2__Impl"
    // InternalGo.g:1098:1: rule__Float_lit__Group_1_0__2__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1102:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:1103:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:1103:1: ( ( ruleExponent )? )
            // InternalGo.g:1104:2: ( ruleExponent )?
            {
             before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2()); 
            // InternalGo.g:1105:2: ( ruleExponent )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=49 && LA16_0<=50)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1105:3: ruleExponent
                    {
                    pushFollow(FOLLOW_2);
                    ruleExponent();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_lit__Group_1_0__2__Impl"


    // $ANTLR start "rule__Exponent__Group__0"
    // InternalGo.g:1114:1: rule__Exponent__Group__0 : rule__Exponent__Group__0__Impl rule__Exponent__Group__1 ;
    public final void rule__Exponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1118:1: ( rule__Exponent__Group__0__Impl rule__Exponent__Group__1 )
            // InternalGo.g:1119:2: rule__Exponent__Group__0__Impl rule__Exponent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Exponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__0"


    // $ANTLR start "rule__Exponent__Group__0__Impl"
    // InternalGo.g:1126:1: rule__Exponent__Group__0__Impl : ( ( rule__Exponent__Alternatives_0 ) ) ;
    public final void rule__Exponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1130:1: ( ( ( rule__Exponent__Alternatives_0 ) ) )
            // InternalGo.g:1131:1: ( ( rule__Exponent__Alternatives_0 ) )
            {
            // InternalGo.g:1131:1: ( ( rule__Exponent__Alternatives_0 ) )
            // InternalGo.g:1132:2: ( rule__Exponent__Alternatives_0 )
            {
             before(grammarAccess.getExponentAccess().getAlternatives_0()); 
            // InternalGo.g:1133:2: ( rule__Exponent__Alternatives_0 )
            // InternalGo.g:1133:3: rule__Exponent__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExponentAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__0__Impl"


    // $ANTLR start "rule__Exponent__Group__1"
    // InternalGo.g:1141:1: rule__Exponent__Group__1 : rule__Exponent__Group__1__Impl rule__Exponent__Group__2 ;
    public final void rule__Exponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1145:1: ( rule__Exponent__Group__1__Impl rule__Exponent__Group__2 )
            // InternalGo.g:1146:2: rule__Exponent__Group__1__Impl rule__Exponent__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Exponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__1"


    // $ANTLR start "rule__Exponent__Group__1__Impl"
    // InternalGo.g:1153:1: rule__Exponent__Group__1__Impl : ( ( rule__Exponent__Alternatives_1 )? ) ;
    public final void rule__Exponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1157:1: ( ( ( rule__Exponent__Alternatives_1 )? ) )
            // InternalGo.g:1158:1: ( ( rule__Exponent__Alternatives_1 )? )
            {
            // InternalGo.g:1158:1: ( ( rule__Exponent__Alternatives_1 )? )
            // InternalGo.g:1159:2: ( rule__Exponent__Alternatives_1 )?
            {
             before(grammarAccess.getExponentAccess().getAlternatives_1()); 
            // InternalGo.g:1160:2: ( rule__Exponent__Alternatives_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=51 && LA17_0<=52)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1160:3: rule__Exponent__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exponent__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExponentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__1__Impl"


    // $ANTLR start "rule__Exponent__Group__2"
    // InternalGo.g:1168:1: rule__Exponent__Group__2 : rule__Exponent__Group__2__Impl ;
    public final void rule__Exponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1172:1: ( rule__Exponent__Group__2__Impl )
            // InternalGo.g:1173:2: rule__Exponent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__2"


    // $ANTLR start "rule__Exponent__Group__2__Impl"
    // InternalGo.g:1179:1: rule__Exponent__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Exponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1183:1: ( ( RULE_INT ) )
            // InternalGo.g:1184:1: ( RULE_INT )
            {
            // InternalGo.g:1184:1: ( RULE_INT )
            // InternalGo.g:1185:2: RULE_INT
            {
             before(grammarAccess.getExponentAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExponentAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__2__Impl"


    // $ANTLR start "rule__Imaginary_lit__Group__0"
    // InternalGo.g:1195:1: rule__Imaginary_lit__Group__0 : rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 ;
    public final void rule__Imaginary_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1199:1: ( rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 )
            // InternalGo.g:1200:2: rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Imaginary_lit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imaginary_lit__Group__0"


    // $ANTLR start "rule__Imaginary_lit__Group__0__Impl"
    // InternalGo.g:1207:1: rule__Imaginary_lit__Group__0__Impl : ( ( rule__Imaginary_lit__Alternatives_0 ) ) ;
    public final void rule__Imaginary_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1211:1: ( ( ( rule__Imaginary_lit__Alternatives_0 ) ) )
            // InternalGo.g:1212:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            {
            // InternalGo.g:1212:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            // InternalGo.g:1213:2: ( rule__Imaginary_lit__Alternatives_0 )
            {
             before(grammarAccess.getImaginary_litAccess().getAlternatives_0()); 
            // InternalGo.g:1214:2: ( rule__Imaginary_lit__Alternatives_0 )
            // InternalGo.g:1214:3: rule__Imaginary_lit__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getImaginary_litAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imaginary_lit__Group__0__Impl"


    // $ANTLR start "rule__Imaginary_lit__Group__1"
    // InternalGo.g:1222:1: rule__Imaginary_lit__Group__1 : rule__Imaginary_lit__Group__1__Impl ;
    public final void rule__Imaginary_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1226:1: ( rule__Imaginary_lit__Group__1__Impl )
            // InternalGo.g:1227:2: rule__Imaginary_lit__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imaginary_lit__Group__1"


    // $ANTLR start "rule__Imaginary_lit__Group__1__Impl"
    // InternalGo.g:1233:1: rule__Imaginary_lit__Group__1__Impl : ( 'i' ) ;
    public final void rule__Imaginary_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1237:1: ( ( 'i' ) )
            // InternalGo.g:1238:1: ( 'i' )
            {
            // InternalGo.g:1238:1: ( 'i' )
            // InternalGo.g:1239:2: 'i'
            {
             before(grammarAccess.getImaginary_litAccess().getIKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getImaginary_litAccess().getIKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imaginary_lit__Group__1__Impl"


    // $ANTLR start "rule__Rune_lit__Group__0"
    // InternalGo.g:1249:1: rule__Rune_lit__Group__0 : rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 ;
    public final void rule__Rune_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1253:1: ( rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 )
            // InternalGo.g:1254:2: rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rune_lit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rune_lit__Group__0"


    // $ANTLR start "rule__Rune_lit__Group__0__Impl"
    // InternalGo.g:1261:1: rule__Rune_lit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1265:1: ( ( '\\'' ) )
            // InternalGo.g:1266:1: ( '\\'' )
            {
            // InternalGo.g:1266:1: ( '\\'' )
            // InternalGo.g:1267:2: '\\''
            {
             before(grammarAccess.getRune_litAccess().getApostropheKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRune_litAccess().getApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rune_lit__Group__0__Impl"


    // $ANTLR start "rule__Rune_lit__Group__1"
    // InternalGo.g:1276:1: rule__Rune_lit__Group__1 : rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 ;
    public final void rule__Rune_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1280:1: ( rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 )
            // InternalGo.g:1281:2: rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rune_lit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rune_lit__Group__1"


    // $ANTLR start "rule__Rune_lit__Group__1__Impl"
    // InternalGo.g:1288:1: rule__Rune_lit__Group__1__Impl : ( ( rule__Rune_lit__Alternatives_1 ) ) ;
    public final void rule__Rune_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1292:1: ( ( ( rule__Rune_lit__Alternatives_1 ) ) )
            // InternalGo.g:1293:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            {
            // InternalGo.g:1293:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            // InternalGo.g:1294:2: ( rule__Rune_lit__Alternatives_1 )
            {
             before(grammarAccess.getRune_litAccess().getAlternatives_1()); 
            // InternalGo.g:1295:2: ( rule__Rune_lit__Alternatives_1 )
            // InternalGo.g:1295:3: rule__Rune_lit__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRune_litAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rune_lit__Group__1__Impl"


    // $ANTLR start "rule__Rune_lit__Group__2"
    // InternalGo.g:1303:1: rule__Rune_lit__Group__2 : rule__Rune_lit__Group__2__Impl ;
    public final void rule__Rune_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1307:1: ( rule__Rune_lit__Group__2__Impl )
            // InternalGo.g:1308:2: rule__Rune_lit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rune_lit__Group__2"


    // $ANTLR start "rule__Rune_lit__Group__2__Impl"
    // InternalGo.g:1314:1: rule__Rune_lit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1318:1: ( ( '\\'' ) )
            // InternalGo.g:1319:1: ( '\\'' )
            {
            // InternalGo.g:1319:1: ( '\\'' )
            // InternalGo.g:1320:2: '\\''
            {
             before(grammarAccess.getRune_litAccess().getApostropheKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRune_litAccess().getApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rune_lit__Group__2__Impl"


    // $ANTLR start "rule__Interpreted_string_lit__Group__0"
    // InternalGo.g:1330:1: rule__Interpreted_string_lit__Group__0 : rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 ;
    public final void rule__Interpreted_string_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1334:1: ( rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 )
            // InternalGo.g:1335:2: rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Interpreted_string_lit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpreted_string_lit__Group__0"


    // $ANTLR start "rule__Interpreted_string_lit__Group__0__Impl"
    // InternalGo.g:1342:1: rule__Interpreted_string_lit__Group__0__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1346:1: ( ( '\"' ) )
            // InternalGo.g:1347:1: ( '\"' )
            {
            // InternalGo.g:1347:1: ( '\"' )
            // InternalGo.g:1348:2: '\"'
            {
             before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpreted_string_lit__Group__0__Impl"


    // $ANTLR start "rule__Interpreted_string_lit__Group__1"
    // InternalGo.g:1357:1: rule__Interpreted_string_lit__Group__1 : rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 ;
    public final void rule__Interpreted_string_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1361:1: ( rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 )
            // InternalGo.g:1362:2: rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Interpreted_string_lit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpreted_string_lit__Group__1"


    // $ANTLR start "rule__Interpreted_string_lit__Group__1__Impl"
    // InternalGo.g:1369:1: rule__Interpreted_string_lit__Group__1__Impl : ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) ;
    public final void rule__Interpreted_string_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1373:1: ( ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) )
            // InternalGo.g:1374:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            {
            // InternalGo.g:1374:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            // InternalGo.g:1375:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            {
             before(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 
            // InternalGo.g:1376:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_UNICODE_VALUE && LA18_0<=RULE_HEX_BYTE_VALUE)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGo.g:1376:3: rule__Interpreted_string_lit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Interpreted_string_lit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpreted_string_lit__Group__1__Impl"


    // $ANTLR start "rule__Interpreted_string_lit__Group__2"
    // InternalGo.g:1384:1: rule__Interpreted_string_lit__Group__2 : rule__Interpreted_string_lit__Group__2__Impl ;
    public final void rule__Interpreted_string_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1388:1: ( rule__Interpreted_string_lit__Group__2__Impl )
            // InternalGo.g:1389:2: rule__Interpreted_string_lit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpreted_string_lit__Group__2"


    // $ANTLR start "rule__Interpreted_string_lit__Group__2__Impl"
    // InternalGo.g:1395:1: rule__Interpreted_string_lit__Group__2__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1399:1: ( ( '\"' ) )
            // InternalGo.g:1400:1: ( '\"' )
            {
            // InternalGo.g:1400:1: ( '\"' )
            // InternalGo.g:1401:2: '\"'
            {
             before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpreted_string_lit__Group__2__Impl"


    // $ANTLR start "rule__Parameter_list__Group__0"
    // InternalGo.g:1411:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1415:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // InternalGo.g:1416:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0"


    // $ANTLR start "rule__Parameter_list__Group__0__Impl"
    // InternalGo.g:1423:1: rule__Parameter_list__Group__0__Impl : ( ruleParameter_decl ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1427:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:1428:1: ( ruleParameter_decl )
            {
            // InternalGo.g:1428:1: ( ruleParameter_decl )
            // InternalGo.g:1429:2: ruleParameter_decl
            {
             before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter_decl();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group__1"
    // InternalGo.g:1438:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1442:1: ( rule__Parameter_list__Group__1__Impl )
            // InternalGo.g:1443:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1"


    // $ANTLR start "rule__Parameter_list__Group__1__Impl"
    // InternalGo.g:1449:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1453:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // InternalGo.g:1454:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // InternalGo.g:1454:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // InternalGo.g:1455:2: ( rule__Parameter_list__Group_1__0 )*
            {
             before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            // InternalGo.g:1456:2: ( rule__Parameter_list__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:1456:3: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getParameter_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__0"
    // InternalGo.g:1465:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1469:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // InternalGo.g:1470:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0"


    // $ANTLR start "rule__Parameter_list__Group_1__0__Impl"
    // InternalGo.g:1477:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1481:1: ( ( ',' ) )
            // InternalGo.g:1482:1: ( ',' )
            {
            // InternalGo.g:1482:1: ( ',' )
            // InternalGo.g:1483:2: ','
            {
             before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__1"
    // InternalGo.g:1492:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1496:1: ( rule__Parameter_list__Group_1__1__Impl )
            // InternalGo.g:1497:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1"


    // $ANTLR start "rule__Parameter_list__Group_1__1__Impl"
    // InternalGo.g:1503:1: rule__Parameter_list__Group_1__1__Impl : ( ruleParameter_decl ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1507:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:1508:1: ( ruleParameter_decl )
            {
            // InternalGo.g:1508:1: ( ruleParameter_decl )
            // InternalGo.g:1509:2: ruleParameter_decl
            {
             before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleParameter_decl();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter_decl__Group__0"
    // InternalGo.g:1519:1: rule__Parameter_decl__Group__0 : rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 ;
    public final void rule__Parameter_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1523:1: ( rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 )
            // InternalGo.g:1524:2: rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Parameter_decl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_decl__Group__0"


    // $ANTLR start "rule__Parameter_decl__Group__0__Impl"
    // InternalGo.g:1531:1: rule__Parameter_decl__Group__0__Impl : ( ( ruleIdentifier_list )? ) ;
    public final void rule__Parameter_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1535:1: ( ( ( ruleIdentifier_list )? ) )
            // InternalGo.g:1536:1: ( ( ruleIdentifier_list )? )
            {
            // InternalGo.g:1536:1: ( ( ruleIdentifier_list )? )
            // InternalGo.g:1537:2: ( ruleIdentifier_list )?
            {
             before(grammarAccess.getParameter_declAccess().getIdentifier_listParserRuleCall_0()); 
            // InternalGo.g:1538:2: ( ruleIdentifier_list )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==44) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==RULE_IDENTIFIER) ) {
                        alt20=1;
                    }
                }
                else if ( (LA20_1==RULE_IDENTIFIER||LA20_1==46) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:1538:3: ruleIdentifier_list
                    {
                    pushFollow(FOLLOW_2);
                    ruleIdentifier_list();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameter_declAccess().getIdentifier_listParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_decl__Group__0__Impl"


    // $ANTLR start "rule__Parameter_decl__Group__1"
    // InternalGo.g:1546:1: rule__Parameter_decl__Group__1 : rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 ;
    public final void rule__Parameter_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1550:1: ( rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 )
            // InternalGo.g:1551:2: rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Parameter_decl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_decl__Group__1"


    // $ANTLR start "rule__Parameter_decl__Group__1__Impl"
    // InternalGo.g:1558:1: rule__Parameter_decl__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__Parameter_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1562:1: ( ( ( '...' )? ) )
            // InternalGo.g:1563:1: ( ( '...' )? )
            {
            // InternalGo.g:1563:1: ( ( '...' )? )
            // InternalGo.g:1564:2: ( '...' )?
            {
             before(grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1()); 
            // InternalGo.g:1565:2: ( '...' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1565:3: '...'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_decl__Group__1__Impl"


    // $ANTLR start "rule__Parameter_decl__Group__2"
    // InternalGo.g:1573:1: rule__Parameter_decl__Group__2 : rule__Parameter_decl__Group__2__Impl ;
    public final void rule__Parameter_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1577:1: ( rule__Parameter_decl__Group__2__Impl )
            // InternalGo.g:1578:2: rule__Parameter_decl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_decl__Group__2"


    // $ANTLR start "rule__Parameter_decl__Group__2__Impl"
    // InternalGo.g:1584:1: rule__Parameter_decl__Group__2__Impl : ( ruleType ) ;
    public final void rule__Parameter_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1588:1: ( ( ruleType ) )
            // InternalGo.g:1589:1: ( ruleType )
            {
            // InternalGo.g:1589:1: ( ruleType )
            // InternalGo.g:1590:2: ruleType
            {
             before(grammarAccess.getParameter_declAccess().getTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameter_declAccess().getTypeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_decl__Group__2__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // InternalGo.g:1600:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1604:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalGo.g:1605:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0"


    // $ANTLR start "rule__Identifier_list__Group__0__Impl"
    // InternalGo.g:1612:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1616:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:1617:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:1617:1: ( RULE_IDENTIFIER )
            // InternalGo.g:1618:2: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__1"
    // InternalGo.g:1627:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1631:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalGo.g:1632:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1"


    // $ANTLR start "rule__Identifier_list__Group__1__Impl"
    // InternalGo.g:1638:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1642:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalGo.g:1643:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalGo.g:1643:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalGo.g:1644:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalGo.g:1645:2: ( rule__Identifier_list__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGo.g:1645:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__0"
    // InternalGo.g:1654:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1658:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalGo.g:1659:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0"


    // $ANTLR start "rule__Identifier_list__Group_1__0__Impl"
    // InternalGo.g:1666:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1670:1: ( ( ',' ) )
            // InternalGo.g:1671:1: ( ',' )
            {
            // InternalGo.g:1671:1: ( ',' )
            // InternalGo.g:1672:2: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__1"
    // InternalGo.g:1681:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1685:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalGo.g:1686:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1"


    // $ANTLR start "rule__Identifier_list__Group_1__1__Impl"
    // InternalGo.g:1692:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1696:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:1697:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:1697:1: ( RULE_IDENTIFIER )
            // InternalGo.g:1698:2: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Qualified_ident__Group__0"
    // InternalGo.g:1708:1: rule__Qualified_ident__Group__0 : rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 ;
    public final void rule__Qualified_ident__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1712:1: ( rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 )
            // InternalGo.g:1713:2: rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Qualified_ident__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified_ident__Group__0"


    // $ANTLR start "rule__Qualified_ident__Group__0__Impl"
    // InternalGo.g:1720:1: rule__Qualified_ident__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1724:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:1725:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:1725:1: ( RULE_IDENTIFIER )
            // InternalGo.g:1726:2: RULE_IDENTIFIER
            {
             before(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified_ident__Group__0__Impl"


    // $ANTLR start "rule__Qualified_ident__Group__1"
    // InternalGo.g:1735:1: rule__Qualified_ident__Group__1 : rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 ;
    public final void rule__Qualified_ident__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1739:1: ( rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 )
            // InternalGo.g:1740:2: rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Qualified_ident__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified_ident__Group__1"


    // $ANTLR start "rule__Qualified_ident__Group__1__Impl"
    // InternalGo.g:1747:1: rule__Qualified_ident__Group__1__Impl : ( '.' ) ;
    public final void rule__Qualified_ident__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1751:1: ( ( '.' ) )
            // InternalGo.g:1752:1: ( '.' )
            {
            // InternalGo.g:1752:1: ( '.' )
            // InternalGo.g:1753:2: '.'
            {
             before(grammarAccess.getQualified_identAccess().getFullStopKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getQualified_identAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified_ident__Group__1__Impl"


    // $ANTLR start "rule__Qualified_ident__Group__2"
    // InternalGo.g:1762:1: rule__Qualified_ident__Group__2 : rule__Qualified_ident__Group__2__Impl ;
    public final void rule__Qualified_ident__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1766:1: ( rule__Qualified_ident__Group__2__Impl )
            // InternalGo.g:1767:2: rule__Qualified_ident__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified_ident__Group__2"


    // $ANTLR start "rule__Qualified_ident__Group__2__Impl"
    // InternalGo.g:1773:1: rule__Qualified_ident__Group__2__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1777:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:1778:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:1778:1: ( RULE_IDENTIFIER )
            // InternalGo.g:1779:2: RULE_IDENTIFIER
            {
             before(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_2()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified_ident__Group__2__Impl"


    // $ANTLR start "rule__Import_spec__Group__0"
    // InternalGo.g:1789:1: rule__Import_spec__Group__0 : rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 ;
    public final void rule__Import_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1793:1: ( rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 )
            // InternalGo.g:1794:2: rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Import_spec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import_spec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_spec__Group__0"


    // $ANTLR start "rule__Import_spec__Group__0__Impl"
    // InternalGo.g:1801:1: rule__Import_spec__Group__0__Impl : ( ( rule__Import_spec__Alternatives_0 )? ) ;
    public final void rule__Import_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1805:1: ( ( ( rule__Import_spec__Alternatives_0 )? ) )
            // InternalGo.g:1806:1: ( ( rule__Import_spec__Alternatives_0 )? )
            {
            // InternalGo.g:1806:1: ( ( rule__Import_spec__Alternatives_0 )? )
            // InternalGo.g:1807:2: ( rule__Import_spec__Alternatives_0 )?
            {
             before(grammarAccess.getImport_specAccess().getAlternatives_0()); 
            // InternalGo.g:1808:2: ( rule__Import_spec__Alternatives_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_IDENTIFIER||LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:1808:3: rule__Import_spec__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import_spec__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImport_specAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_spec__Group__0__Impl"


    // $ANTLR start "rule__Import_spec__Group__1"
    // InternalGo.g:1816:1: rule__Import_spec__Group__1 : rule__Import_spec__Group__1__Impl ;
    public final void rule__Import_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1820:1: ( rule__Import_spec__Group__1__Impl )
            // InternalGo.g:1821:2: rule__Import_spec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_spec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_spec__Group__1"


    // $ANTLR start "rule__Import_spec__Group__1__Impl"
    // InternalGo.g:1827:1: rule__Import_spec__Group__1__Impl : ( ruleImport_path ) ;
    public final void rule__Import_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1831:1: ( ( ruleImport_path ) )
            // InternalGo.g:1832:1: ( ruleImport_path )
            {
            // InternalGo.g:1832:1: ( ruleImport_path )
            // InternalGo.g:1833:2: ruleImport_path
            {
             before(grammarAccess.getImport_specAccess().getImport_pathParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleImport_path();

            state._fsp--;

             after(grammarAccess.getImport_specAccess().getImport_pathParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_spec__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalGo.g:1843:1: rule__Model__GreetingsAssignment : ( ( 'oi' ) ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1847:1: ( ( ( 'oi' ) ) )
            // InternalGo.g:1848:2: ( ( 'oi' ) )
            {
            // InternalGo.g:1848:2: ( ( 'oi' ) )
            // InternalGo.g:1849:3: ( 'oi' )
            {
             before(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 
            // InternalGo.g:1850:3: ( 'oi' )
            // InternalGo.g:1851:4: 'oi'
            {
             before(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 

            }

             after(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\uffff\1\2\21\uffff\1\26\5\uffff\1\26";
    static final String dfa_3s = "\1\7\1\57\3\uffff\3\7\1\uffff\1\57\5\7\1\57\2\7\1\57\1\61\2\7\1\uffff\2\7\1\65";
    static final String dfa_4s = "\1\67\1\65\3\uffff\1\62\2\64\1\uffff\1\62\2\64\3\7\1\57\2\7\1\57\1\65\2\64\1\uffff\2\7\1\65";
    static final String dfa_5s = "\2\uffff\1\1\1\4\1\5\3\uffff\1\3\15\uffff\1\2\3\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\4\50\uffff\1\3\1\4",
            "\1\5\1\uffff\1\6\1\7\2\uffff\1\10",
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
            "\1\24\1\25\2\uffff\1\10",
            "\1\31\53\uffff\1\27\1\30",
            "\1\31\53\uffff\1\27\1\30",
            "",
            "\1\31",
            "\1\31",
            "\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "817:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0006800000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0006800000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0018000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0080000000001C00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000000002000L});

}