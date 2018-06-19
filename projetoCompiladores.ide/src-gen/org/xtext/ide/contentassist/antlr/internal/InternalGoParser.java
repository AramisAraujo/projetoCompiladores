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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BINARY_OP", "RULE_SEMICOLON", "RULE_ASSIGN_OP", "RULE_INT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_UNICODE_VALUE", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_IDENTIFIER", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_UNARY_OP", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'='", "':='", "','", "'--'", "'...'", "'.'", "':'", "'E'", "'e'", "'+'", "'-'", "'i'", "'\\''", "'\"'", "'struct'", "'*'", "'oi'"
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
    // InternalGo.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGo.g:55:1: ( ruleModel EOF )
            // InternalGo.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:63:1: ruleModel : ( ( rule__Model__GreetingsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:67:2: ( ( ( rule__Model__GreetingsAssignment ) ) )
            // InternalGo.g:68:2: ( ( rule__Model__GreetingsAssignment ) )
            {
            // InternalGo.g:68:2: ( ( rule__Model__GreetingsAssignment ) )
            // InternalGo.g:69:3: ( rule__Model__GreetingsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            }
            // InternalGo.g:70:3: ( rule__Model__GreetingsAssignment )
            // InternalGo.g:70:4: rule__Model__GreetingsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__GreetingsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            }

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
    // InternalGo.g:80:1: ruleOPERATORS : ( ( rule__OPERATORS__Alternatives ) ) ;
    public final void ruleOPERATORS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:84:2: ( ( ( rule__OPERATORS__Alternatives ) ) )
            // InternalGo.g:85:2: ( ( rule__OPERATORS__Alternatives ) )
            {
            // InternalGo.g:85:2: ( ( rule__OPERATORS__Alternatives ) )
            // InternalGo.g:86:3: ( rule__OPERATORS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOPERATORSAccess().getAlternatives()); 
            }
            // InternalGo.g:87:3: ( rule__OPERATORS__Alternatives )
            // InternalGo.g:87:4: rule__OPERATORS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OPERATORS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOPERATORSAccess().getAlternatives()); 
            }

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
    // InternalGo.g:96:1: entryRuleInt_lit : ruleInt_lit EOF ;
    public final void entryRuleInt_lit() throws RecognitionException {
        try {
            // InternalGo.g:97:1: ( ruleInt_lit EOF )
            // InternalGo.g:98:1: ruleInt_lit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInt_litRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInt_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInt_litRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:105:1: ruleInt_lit : ( ( rule__Int_lit__Alternatives ) ) ;
    public final void ruleInt_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:109:2: ( ( ( rule__Int_lit__Alternatives ) ) )
            // InternalGo.g:110:2: ( ( rule__Int_lit__Alternatives ) )
            {
            // InternalGo.g:110:2: ( ( rule__Int_lit__Alternatives ) )
            // InternalGo.g:111:3: ( rule__Int_lit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInt_litAccess().getAlternatives()); 
            }
            // InternalGo.g:112:3: ( rule__Int_lit__Alternatives )
            // InternalGo.g:112:4: rule__Int_lit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Int_lit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInt_litAccess().getAlternatives()); 
            }

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
    // InternalGo.g:121:1: entryRuleFloat_lit : ruleFloat_lit EOF ;
    public final void entryRuleFloat_lit() throws RecognitionException {
        try {
            // InternalGo.g:122:1: ( ruleFloat_lit EOF )
            // InternalGo.g:123:1: ruleFloat_lit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFloat_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:130:1: ruleFloat_lit : ( ( rule__Float_lit__Group__0 ) ) ;
    public final void ruleFloat_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:134:2: ( ( ( rule__Float_lit__Group__0 ) ) )
            // InternalGo.g:135:2: ( ( rule__Float_lit__Group__0 ) )
            {
            // InternalGo.g:135:2: ( ( rule__Float_lit__Group__0 ) )
            // InternalGo.g:136:3: ( rule__Float_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getGroup()); 
            }
            // InternalGo.g:137:3: ( rule__Float_lit__Group__0 )
            // InternalGo.g:137:4: rule__Float_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getGroup()); 
            }

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
    // InternalGo.g:146:1: entryRuleExponent : ruleExponent EOF ;
    public final void entryRuleExponent() throws RecognitionException {
        try {
            // InternalGo.g:147:1: ( ruleExponent EOF )
            // InternalGo.g:148:1: ruleExponent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:155:1: ruleExponent : ( ( rule__Exponent__Group__0 ) ) ;
    public final void ruleExponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:159:2: ( ( ( rule__Exponent__Group__0 ) ) )
            // InternalGo.g:160:2: ( ( rule__Exponent__Group__0 ) )
            {
            // InternalGo.g:160:2: ( ( rule__Exponent__Group__0 ) )
            // InternalGo.g:161:3: ( rule__Exponent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getGroup()); 
            }
            // InternalGo.g:162:3: ( rule__Exponent__Group__0 )
            // InternalGo.g:162:4: rule__Exponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentAccess().getGroup()); 
            }

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
    // InternalGo.g:171:1: entryRuleImaginary_lit : ruleImaginary_lit EOF ;
    public final void entryRuleImaginary_lit() throws RecognitionException {
        try {
            // InternalGo.g:172:1: ( ruleImaginary_lit EOF )
            // InternalGo.g:173:1: ruleImaginary_lit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImaginary_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImaginary_litRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:180:1: ruleImaginary_lit : ( ( rule__Imaginary_lit__Group__0 ) ) ;
    public final void ruleImaginary_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:184:2: ( ( ( rule__Imaginary_lit__Group__0 ) ) )
            // InternalGo.g:185:2: ( ( rule__Imaginary_lit__Group__0 ) )
            {
            // InternalGo.g:185:2: ( ( rule__Imaginary_lit__Group__0 ) )
            // InternalGo.g:186:3: ( rule__Imaginary_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getGroup()); 
            }
            // InternalGo.g:187:3: ( rule__Imaginary_lit__Group__0 )
            // InternalGo.g:187:4: rule__Imaginary_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImaginary_litAccess().getGroup()); 
            }

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
    // InternalGo.g:196:1: entryRuleRune_lit : ruleRune_lit EOF ;
    public final void entryRuleRune_lit() throws RecognitionException {
        try {
            // InternalGo.g:197:1: ( ruleRune_lit EOF )
            // InternalGo.g:198:1: ruleRune_lit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRune_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRune_litRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:205:1: ruleRune_lit : ( ( rule__Rune_lit__Group__0 ) ) ;
    public final void ruleRune_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:209:2: ( ( ( rule__Rune_lit__Group__0 ) ) )
            // InternalGo.g:210:2: ( ( rule__Rune_lit__Group__0 ) )
            {
            // InternalGo.g:210:2: ( ( rule__Rune_lit__Group__0 ) )
            // InternalGo.g:211:3: ( rule__Rune_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getGroup()); 
            }
            // InternalGo.g:212:3: ( rule__Rune_lit__Group__0 )
            // InternalGo.g:212:4: rule__Rune_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRune_litAccess().getGroup()); 
            }

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
    // InternalGo.g:221:1: entryRuleByte_value : ruleByte_value EOF ;
    public final void entryRuleByte_value() throws RecognitionException {
        try {
            // InternalGo.g:222:1: ( ruleByte_value EOF )
            // InternalGo.g:223:1: ruleByte_value EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getByte_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleByte_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getByte_valueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:230:1: ruleByte_value : ( ( rule__Byte_value__Alternatives ) ) ;
    public final void ruleByte_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:234:2: ( ( ( rule__Byte_value__Alternatives ) ) )
            // InternalGo.g:235:2: ( ( rule__Byte_value__Alternatives ) )
            {
            // InternalGo.g:235:2: ( ( rule__Byte_value__Alternatives ) )
            // InternalGo.g:236:3: ( rule__Byte_value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getByte_valueAccess().getAlternatives()); 
            }
            // InternalGo.g:237:3: ( rule__Byte_value__Alternatives )
            // InternalGo.g:237:4: rule__Byte_value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Byte_value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getByte_valueAccess().getAlternatives()); 
            }

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
    // InternalGo.g:246:1: entryRuleString_lit : ruleString_lit EOF ;
    public final void entryRuleString_lit() throws RecognitionException {
        try {
            // InternalGo.g:247:1: ( ruleString_lit EOF )
            // InternalGo.g:248:1: ruleString_lit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getString_litRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleString_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getString_litRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:255:1: ruleString_lit : ( ( rule__String_lit__Alternatives ) ) ;
    public final void ruleString_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:259:2: ( ( ( rule__String_lit__Alternatives ) ) )
            // InternalGo.g:260:2: ( ( rule__String_lit__Alternatives ) )
            {
            // InternalGo.g:260:2: ( ( rule__String_lit__Alternatives ) )
            // InternalGo.g:261:3: ( rule__String_lit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getString_litAccess().getAlternatives()); 
            }
            // InternalGo.g:262:3: ( rule__String_lit__Alternatives )
            // InternalGo.g:262:4: rule__String_lit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__String_lit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getString_litAccess().getAlternatives()); 
            }

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
    // InternalGo.g:271:1: entryRuleInterpreted_string_lit : ruleInterpreted_string_lit EOF ;
    public final void entryRuleInterpreted_string_lit() throws RecognitionException {
        try {
            // InternalGo.g:272:1: ( ruleInterpreted_string_lit EOF )
            // InternalGo.g:273:1: ruleInterpreted_string_lit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterpreted_string_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterpreted_string_litRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:280:1: ruleInterpreted_string_lit : ( ( rule__Interpreted_string_lit__Group__0 ) ) ;
    public final void ruleInterpreted_string_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:284:2: ( ( ( rule__Interpreted_string_lit__Group__0 ) ) )
            // InternalGo.g:285:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            {
            // InternalGo.g:285:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            // InternalGo.g:286:3: ( rule__Interpreted_string_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getGroup()); 
            }
            // InternalGo.g:287:3: ( rule__Interpreted_string_lit__Group__0 )
            // InternalGo.g:287:4: rule__Interpreted_string_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterpreted_string_litAccess().getGroup()); 
            }

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
    // InternalGo.g:296:1: entryRuleLiterals : ruleLiterals EOF ;
    public final void entryRuleLiterals() throws RecognitionException {
        try {
            // InternalGo.g:297:1: ( ruleLiterals EOF )
            // InternalGo.g:298:1: ruleLiterals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiterals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:305:1: ruleLiterals : ( ( rule__Literals__Alternatives ) ) ;
    public final void ruleLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:309:2: ( ( ( rule__Literals__Alternatives ) ) )
            // InternalGo.g:310:2: ( ( rule__Literals__Alternatives ) )
            {
            // InternalGo.g:310:2: ( ( rule__Literals__Alternatives ) )
            // InternalGo.g:311:3: ( rule__Literals__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralsAccess().getAlternatives()); 
            }
            // InternalGo.g:312:3: ( rule__Literals__Alternatives )
            // InternalGo.g:312:4: rule__Literals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literals__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralsAccess().getAlternatives()); 
            }

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
    // InternalGo.g:321:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGo.g:322:1: ( ruleType EOF )
            // InternalGo.g:323:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:330:1: ruleType : ( ruleType_name ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:334:2: ( ( ruleType_name ) )
            // InternalGo.g:335:2: ( ruleType_name )
            {
            // InternalGo.g:335:2: ( ruleType_name )
            // InternalGo.g:336:3: ruleType_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getType_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleType_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getType_nameParserRuleCall()); 
            }

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
    // InternalGo.g:346:1: entryRuleType_name : ruleType_name EOF ;
    public final void entryRuleType_name() throws RecognitionException {
        try {
            // InternalGo.g:347:1: ( ruleType_name EOF )
            // InternalGo.g:348:1: ruleType_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_nameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:355:1: ruleType_name : ( ( rule__Type_name__Alternatives ) ) ;
    public final void ruleType_name() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:359:2: ( ( ( rule__Type_name__Alternatives ) ) )
            // InternalGo.g:360:2: ( ( rule__Type_name__Alternatives ) )
            {
            // InternalGo.g:360:2: ( ( rule__Type_name__Alternatives ) )
            // InternalGo.g:361:3: ( rule__Type_name__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_nameAccess().getAlternatives()); 
            }
            // InternalGo.g:362:3: ( rule__Type_name__Alternatives )
            // InternalGo.g:362:4: rule__Type_name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type_name__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_nameAccess().getAlternatives()); 
            }

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


    // $ANTLR start "entryRuleArray_type"
    // InternalGo.g:371:1: entryRuleArray_type : ruleArray_type EOF ;
    public final void entryRuleArray_type() throws RecognitionException {
        try {
            // InternalGo.g:372:1: ( ruleArray_type EOF )
            // InternalGo.g:373:1: ruleArray_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArray_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArray_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArray_type"


    // $ANTLR start "ruleArray_type"
    // InternalGo.g:380:1: ruleArray_type : ( ( rule__Array_type__Group__0 ) ) ;
    public final void ruleArray_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:384:2: ( ( ( rule__Array_type__Group__0 ) ) )
            // InternalGo.g:385:2: ( ( rule__Array_type__Group__0 ) )
            {
            // InternalGo.g:385:2: ( ( rule__Array_type__Group__0 ) )
            // InternalGo.g:386:3: ( rule__Array_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getGroup()); 
            }
            // InternalGo.g:387:3: ( rule__Array_type__Group__0 )
            // InternalGo.g:387:4: rule__Array_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArray_typeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleArray_type"


    // $ANTLR start "entryRuleStruct_type"
    // InternalGo.g:396:1: entryRuleStruct_type : ruleStruct_type EOF ;
    public final void entryRuleStruct_type() throws RecognitionException {
        try {
            // InternalGo.g:397:1: ( ruleStruct_type EOF )
            // InternalGo.g:398:1: ruleStruct_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStruct_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStruct_type"


    // $ANTLR start "ruleStruct_type"
    // InternalGo.g:405:1: ruleStruct_type : ( ( rule__Struct_type__Group__0 ) ) ;
    public final void ruleStruct_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:409:2: ( ( ( rule__Struct_type__Group__0 ) ) )
            // InternalGo.g:410:2: ( ( rule__Struct_type__Group__0 ) )
            {
            // InternalGo.g:410:2: ( ( rule__Struct_type__Group__0 ) )
            // InternalGo.g:411:3: ( rule__Struct_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getGroup()); 
            }
            // InternalGo.g:412:3: ( rule__Struct_type__Group__0 )
            // InternalGo.g:412:4: rule__Struct_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Struct_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleStruct_type"


    // $ANTLR start "entryRuleField_decl"
    // InternalGo.g:421:1: entryRuleField_decl : ruleField_decl EOF ;
    public final void entryRuleField_decl() throws RecognitionException {
        try {
            // InternalGo.g:422:1: ( ruleField_decl EOF )
            // InternalGo.g:423:1: ruleField_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleField_decl"


    // $ANTLR start "ruleField_decl"
    // InternalGo.g:430:1: ruleField_decl : ( ( rule__Field_decl__Group__0 ) ) ;
    public final void ruleField_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:434:2: ( ( ( rule__Field_decl__Group__0 ) ) )
            // InternalGo.g:435:2: ( ( rule__Field_decl__Group__0 ) )
            {
            // InternalGo.g:435:2: ( ( rule__Field_decl__Group__0 ) )
            // InternalGo.g:436:3: ( rule__Field_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getGroup()); 
            }
            // InternalGo.g:437:3: ( rule__Field_decl__Group__0 )
            // InternalGo.g:437:4: rule__Field_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleField_decl"


    // $ANTLR start "entryRuleEmbedded_field"
    // InternalGo.g:446:1: entryRuleEmbedded_field : ruleEmbedded_field EOF ;
    public final void entryRuleEmbedded_field() throws RecognitionException {
        try {
            // InternalGo.g:447:1: ( ruleEmbedded_field EOF )
            // InternalGo.g:448:1: ruleEmbedded_field EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEmbedded_field();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmbedded_field"


    // $ANTLR start "ruleEmbedded_field"
    // InternalGo.g:455:1: ruleEmbedded_field : ( ( rule__Embedded_field__Group__0 ) ) ;
    public final void ruleEmbedded_field() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:459:2: ( ( ( rule__Embedded_field__Group__0 ) ) )
            // InternalGo.g:460:2: ( ( rule__Embedded_field__Group__0 ) )
            {
            // InternalGo.g:460:2: ( ( rule__Embedded_field__Group__0 ) )
            // InternalGo.g:461:3: ( rule__Embedded_field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getGroup()); 
            }
            // InternalGo.g:462:3: ( rule__Embedded_field__Group__0 )
            // InternalGo.g:462:4: rule__Embedded_field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Embedded_field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEmbedded_field"


    // $ANTLR start "entryRulePointer_type"
    // InternalGo.g:471:1: entryRulePointer_type : rulePointer_type EOF ;
    public final void entryRulePointer_type() throws RecognitionException {
        try {
            // InternalGo.g:472:1: ( rulePointer_type EOF )
            // InternalGo.g:473:1: rulePointer_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePointer_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePointer_type"


    // $ANTLR start "rulePointer_type"
    // InternalGo.g:480:1: rulePointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulePointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:484:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // InternalGo.g:485:2: ( ( rule__Pointer_type__Group__0 ) )
            {
            // InternalGo.g:485:2: ( ( rule__Pointer_type__Group__0 ) )
            // InternalGo.g:486:3: ( rule__Pointer_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getGroup()); 
            }
            // InternalGo.g:487:3: ( rule__Pointer_type__Group__0 )
            // InternalGo.g:487:4: rule__Pointer_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePointer_type"


    // $ANTLR start "entryRuleParameter_list"
    // InternalGo.g:496:1: entryRuleParameter_list : ruleParameter_list EOF ;
    public final void entryRuleParameter_list() throws RecognitionException {
        try {
            // InternalGo.g:497:1: ( ruleParameter_list EOF )
            // InternalGo.g:498:1: ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:505:1: ruleParameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleParameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:509:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // InternalGo.g:510:2: ( ( rule__Parameter_list__Group__0 ) )
            {
            // InternalGo.g:510:2: ( ( rule__Parameter_list__Group__0 ) )
            // InternalGo.g:511:3: ( rule__Parameter_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup()); 
            }
            // InternalGo.g:512:3: ( rule__Parameter_list__Group__0 )
            // InternalGo.g:512:4: rule__Parameter_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getGroup()); 
            }

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


    // $ANTLR start "entryRuleParameter_decl"
    // InternalGo.g:521:1: entryRuleParameter_decl : ruleParameter_decl EOF ;
    public final void entryRuleParameter_decl() throws RecognitionException {
        try {
            // InternalGo.g:522:1: ( ruleParameter_decl EOF )
            // InternalGo.g:523:1: ruleParameter_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_declRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameter_decl"


    // $ANTLR start "ruleParameter_decl"
    // InternalGo.g:530:1: ruleParameter_decl : ( ( rule__Parameter_decl__Group__0 ) ) ;
    public final void ruleParameter_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:534:2: ( ( ( rule__Parameter_decl__Group__0 ) ) )
            // InternalGo.g:535:2: ( ( rule__Parameter_decl__Group__0 ) )
            {
            // InternalGo.g:535:2: ( ( rule__Parameter_decl__Group__0 ) )
            // InternalGo.g:536:3: ( rule__Parameter_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getGroup()); 
            }
            // InternalGo.g:537:3: ( rule__Parameter_decl__Group__0 )
            // InternalGo.g:537:4: rule__Parameter_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_declAccess().getGroup()); 
            }

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
    // InternalGo.g:546:1: entryRuleIdentifier_list : ruleIdentifier_list EOF ;
    public final void entryRuleIdentifier_list() throws RecognitionException {
        try {
            // InternalGo.g:547:1: ( ruleIdentifier_list EOF )
            // InternalGo.g:548:1: ruleIdentifier_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:555:1: ruleIdentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleIdentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:559:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalGo.g:560:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalGo.g:560:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalGo.g:561:3: ( rule__Identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            }
            // InternalGo.g:562:3: ( rule__Identifier_list__Group__0 )
            // InternalGo.g:562:4: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getGroup()); 
            }

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
    // InternalGo.g:571:1: entryRuleQualified_ident : ruleQualified_ident EOF ;
    public final void entryRuleQualified_ident() throws RecognitionException {
        try {
            // InternalGo.g:572:1: ( ruleQualified_ident EOF )
            // InternalGo.g:573:1: ruleQualified_ident EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualified_identRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualified_ident();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualified_identRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:580:1: ruleQualified_ident : ( ( rule__Qualified_ident__Group__0 ) ) ;
    public final void ruleQualified_ident() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:584:2: ( ( ( rule__Qualified_ident__Group__0 ) ) )
            // InternalGo.g:585:2: ( ( rule__Qualified_ident__Group__0 ) )
            {
            // InternalGo.g:585:2: ( ( rule__Qualified_ident__Group__0 ) )
            // InternalGo.g:586:3: ( rule__Qualified_ident__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualified_identAccess().getGroup()); 
            }
            // InternalGo.g:587:3: ( rule__Qualified_ident__Group__0 )
            // InternalGo.g:587:4: rule__Qualified_ident__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualified_identAccess().getGroup()); 
            }

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
    // InternalGo.g:596:1: entryRuleImport_spec : ruleImport_spec EOF ;
    public final void entryRuleImport_spec() throws RecognitionException {
        try {
            // InternalGo.g:597:1: ( ruleImport_spec EOF )
            // InternalGo.g:598:1: ruleImport_spec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_specRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:605:1: ruleImport_spec : ( ( rule__Import_spec__Group__0 ) ) ;
    public final void ruleImport_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:609:2: ( ( ( rule__Import_spec__Group__0 ) ) )
            // InternalGo.g:610:2: ( ( rule__Import_spec__Group__0 ) )
            {
            // InternalGo.g:610:2: ( ( rule__Import_spec__Group__0 ) )
            // InternalGo.g:611:3: ( rule__Import_spec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getGroup()); 
            }
            // InternalGo.g:612:3: ( rule__Import_spec__Group__0 )
            // InternalGo.g:612:4: rule__Import_spec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import_spec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_specAccess().getGroup()); 
            }

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
    // InternalGo.g:621:1: entryRuleImport_path : ruleImport_path EOF ;
    public final void entryRuleImport_path() throws RecognitionException {
        try {
            // InternalGo.g:622:1: ( ruleImport_path EOF )
            // InternalGo.g:623:1: ruleImport_path EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_pathRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport_path();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_pathRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:630:1: ruleImport_path : ( ruleString_lit ) ;
    public final void ruleImport_path() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:634:2: ( ( ruleString_lit ) )
            // InternalGo.g:635:2: ( ruleString_lit )
            {
            // InternalGo.g:635:2: ( ruleString_lit )
            // InternalGo.g:636:3: ruleString_lit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_pathAccess().getString_litParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleString_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_pathAccess().getString_litParserRuleCall()); 
            }

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
    // InternalGo.g:645:1: rule__OPERATORS__Alternatives : ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) );
    public final void rule__OPERATORS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:649:1: ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGo.g:650:2: ( RULE_BINARY_OP )
                    {
                    // InternalGo.g:650:2: ( RULE_BINARY_OP )
                    // InternalGo.g:651:3: RULE_BINARY_OP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getBINARY_OPTerminalRuleCall_0()); 
                    }
                    match(input,RULE_BINARY_OP,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getBINARY_OPTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:656:2: ( '(' )
                    {
                    // InternalGo.g:656:2: ( '(' )
                    // InternalGo.g:657:3: '('
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getLeftParenthesisKeyword_1()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getLeftParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:662:2: ( ')' )
                    {
                    // InternalGo.g:662:2: ( ')' )
                    // InternalGo.g:663:3: ')'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getRightParenthesisKeyword_2()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getRightParenthesisKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:668:2: ( '[' )
                    {
                    // InternalGo.g:668:2: ( '[' )
                    // InternalGo.g:669:3: '['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getLeftSquareBracketKeyword_3()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getLeftSquareBracketKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:674:2: ( ']' )
                    {
                    // InternalGo.g:674:2: ( ']' )
                    // InternalGo.g:675:3: ']'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getRightSquareBracketKeyword_4()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getRightSquareBracketKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:680:2: ( '{' )
                    {
                    // InternalGo.g:680:2: ( '{' )
                    // InternalGo.g:681:3: '{'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getLeftCurlyBracketKeyword_5()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getLeftCurlyBracketKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:686:2: ( '}' )
                    {
                    // InternalGo.g:686:2: ( '}' )
                    // InternalGo.g:687:3: '}'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getRightCurlyBracketKeyword_6()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getRightCurlyBracketKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:692:2: ( '++' )
                    {
                    // InternalGo.g:692:2: ( '++' )
                    // InternalGo.g:693:3: '++'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getPlusSignPlusSignKeyword_7()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getPlusSignPlusSignKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:698:2: ( '=' )
                    {
                    // InternalGo.g:698:2: ( '=' )
                    // InternalGo.g:699:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getEqualsSignKeyword_8()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getEqualsSignKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:704:2: ( ':=' )
                    {
                    // InternalGo.g:704:2: ( ':=' )
                    // InternalGo.g:705:3: ':='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getColonEqualsSignKeyword_9()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getColonEqualsSignKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalGo.g:710:2: ( ',' )
                    {
                    // InternalGo.g:710:2: ( ',' )
                    // InternalGo.g:711:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getCommaKeyword_10()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getCommaKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalGo.g:716:2: ( RULE_SEMICOLON )
                    {
                    // InternalGo.g:716:2: ( RULE_SEMICOLON )
                    // InternalGo.g:717:3: RULE_SEMICOLON
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getSEMICOLONTerminalRuleCall_11()); 
                    }
                    match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getSEMICOLONTerminalRuleCall_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalGo.g:722:2: ( '--' )
                    {
                    // InternalGo.g:722:2: ( '--' )
                    // InternalGo.g:723:3: '--'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getHyphenMinusHyphenMinusKeyword_12()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getHyphenMinusHyphenMinusKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalGo.g:728:2: ( '...' )
                    {
                    // InternalGo.g:728:2: ( '...' )
                    // InternalGo.g:729:3: '...'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getFullStopFullStopFullStopKeyword_13()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getFullStopFullStopFullStopKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalGo.g:734:2: ( '.' )
                    {
                    // InternalGo.g:734:2: ( '.' )
                    // InternalGo.g:735:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getFullStopKeyword_14()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getFullStopKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalGo.g:740:2: ( ':' )
                    {
                    // InternalGo.g:740:2: ( ':' )
                    // InternalGo.g:741:3: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getColonKeyword_15()); 
                    }
                    match(input,48,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getColonKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalGo.g:746:2: ( RULE_ASSIGN_OP )
                    {
                    // InternalGo.g:746:2: ( RULE_ASSIGN_OP )
                    // InternalGo.g:747:3: RULE_ASSIGN_OP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOPERATORSAccess().getASSIGN_OPTerminalRuleCall_16()); 
                    }
                    match(input,RULE_ASSIGN_OP,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOPERATORSAccess().getASSIGN_OPTerminalRuleCall_16()); 
                    }

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
    // InternalGo.g:756:1: rule__Int_lit__Alternatives : ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) );
    public final void rule__Int_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:760:1: ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:761:2: ( RULE_INT )
                    {
                    // InternalGo.g:761:2: ( RULE_INT )
                    // InternalGo.g:762:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInt_litAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInt_litAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:767:2: ( RULE_OCTAL_LIT )
                    {
                    // InternalGo.g:767:2: ( RULE_OCTAL_LIT )
                    // InternalGo.g:768:3: RULE_OCTAL_LIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInt_litAccess().getOCTAL_LITTerminalRuleCall_1()); 
                    }
                    match(input,RULE_OCTAL_LIT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInt_litAccess().getOCTAL_LITTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:773:2: ( RULE_HEX_LIT )
                    {
                    // InternalGo.g:773:2: ( RULE_HEX_LIT )
                    // InternalGo.g:774:3: RULE_HEX_LIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInt_litAccess().getHEX_LITTerminalRuleCall_2()); 
                    }
                    match(input,RULE_HEX_LIT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInt_litAccess().getHEX_LITTerminalRuleCall_2()); 
                    }

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
    // InternalGo.g:783:1: rule__Float_lit__Alternatives_1 : ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) );
    public final void rule__Float_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:787:1: ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==47) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=49 && LA3_0<=50)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:788:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    {
                    // InternalGo.g:788:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    // InternalGo.g:789:3: ( rule__Float_lit__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloat_litAccess().getGroup_1_0()); 
                    }
                    // InternalGo.g:790:3: ( rule__Float_lit__Group_1_0__0 )
                    // InternalGo.g:790:4: rule__Float_lit__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float_lit__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloat_litAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:794:2: ( ruleExponent )
                    {
                    // InternalGo.g:794:2: ( ruleExponent )
                    // InternalGo.g:795:3: ruleExponent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExponent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_1()); 
                    }

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
    // InternalGo.g:804:1: rule__Exponent__Alternatives_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Exponent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:808:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==50) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:809:2: ( 'E' )
                    {
                    // InternalGo.g:809:2: ( 'E' )
                    // InternalGo.g:810:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                    }
                    match(input,49,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:815:2: ( 'e' )
                    {
                    // InternalGo.g:815:2: ( 'e' )
                    // InternalGo.g:816:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExponentAccess().getEKeyword_0_1()); 
                    }
                    match(input,50,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExponentAccess().getEKeyword_0_1()); 
                    }

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
    // InternalGo.g:825:1: rule__Exponent__Alternatives_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Exponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:829:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==51) ) {
                alt5=1;
            }
            else if ( (LA5_0==52) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:830:2: ( '+' )
                    {
                    // InternalGo.g:830:2: ( '+' )
                    // InternalGo.g:831:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExponentAccess().getPlusSignKeyword_1_0()); 
                    }
                    match(input,51,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExponentAccess().getPlusSignKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:836:2: ( '-' )
                    {
                    // InternalGo.g:836:2: ( '-' )
                    // InternalGo.g:837:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExponentAccess().getHyphenMinusKeyword_1_1()); 
                    }
                    match(input,52,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExponentAccess().getHyphenMinusKeyword_1_1()); 
                    }

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
    // InternalGo.g:846:1: rule__Imaginary_lit__Alternatives_0 : ( ( RULE_INT ) | ( ruleFloat_lit ) );
    public final void rule__Imaginary_lit__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:850:1: ( ( RULE_INT ) | ( ruleFloat_lit ) )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:851:2: ( RULE_INT )
                    {
                    // InternalGo.g:851:2: ( RULE_INT )
                    // InternalGo.g:852:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImaginary_litAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImaginary_litAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:857:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:857:2: ( ruleFloat_lit )
                    // InternalGo.g:858:3: ruleFloat_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImaginary_litAccess().getFloat_litParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFloat_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImaginary_litAccess().getFloat_litParserRuleCall_0_1()); 
                    }

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
    // InternalGo.g:867:1: rule__Rune_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Rune_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:871:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_UNICODE_VALUE) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_OCTAL_BYTE_VALUE && LA7_0<=RULE_HEX_BYTE_VALUE)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:872:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:872:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:873:3: RULE_UNICODE_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRune_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_UNICODE_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRune_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:878:2: ( ruleByte_value )
                    {
                    // InternalGo.g:878:2: ( ruleByte_value )
                    // InternalGo.g:879:3: ruleByte_value
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRune_litAccess().getByte_valueParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleByte_value();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRune_litAccess().getByte_valueParserRuleCall_1_1()); 
                    }

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
    // InternalGo.g:888:1: rule__Byte_value__Alternatives : ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) );
    public final void rule__Byte_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:892:1: ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OCTAL_BYTE_VALUE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HEX_BYTE_VALUE) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:893:2: ( RULE_OCTAL_BYTE_VALUE )
                    {
                    // InternalGo.g:893:2: ( RULE_OCTAL_BYTE_VALUE )
                    // InternalGo.g:894:3: RULE_OCTAL_BYTE_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getByte_valueAccess().getOCTAL_BYTE_VALUETerminalRuleCall_0()); 
                    }
                    match(input,RULE_OCTAL_BYTE_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getByte_valueAccess().getOCTAL_BYTE_VALUETerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:899:2: ( RULE_HEX_BYTE_VALUE )
                    {
                    // InternalGo.g:899:2: ( RULE_HEX_BYTE_VALUE )
                    // InternalGo.g:900:3: RULE_HEX_BYTE_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getByte_valueAccess().getHEX_BYTE_VALUETerminalRuleCall_1()); 
                    }
                    match(input,RULE_HEX_BYTE_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getByte_valueAccess().getHEX_BYTE_VALUETerminalRuleCall_1()); 
                    }

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
    // InternalGo.g:909:1: rule__String_lit__Alternatives : ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) );
    public final void rule__String_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:913:1: ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_RAW_STRING_LIT) ) {
                alt9=1;
            }
            else if ( (LA9_0==55) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:914:2: ( RULE_RAW_STRING_LIT )
                    {
                    // InternalGo.g:914:2: ( RULE_RAW_STRING_LIT )
                    // InternalGo.g:915:3: RULE_RAW_STRING_LIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getString_litAccess().getRAW_STRING_LITTerminalRuleCall_0()); 
                    }
                    match(input,RULE_RAW_STRING_LIT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getString_litAccess().getRAW_STRING_LITTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:920:2: ( ruleInterpreted_string_lit )
                    {
                    // InternalGo.g:920:2: ( ruleInterpreted_string_lit )
                    // InternalGo.g:921:3: ruleInterpreted_string_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getString_litAccess().getInterpreted_string_litParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInterpreted_string_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getString_litAccess().getInterpreted_string_litParserRuleCall_1()); 
                    }

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
    // InternalGo.g:930:1: rule__Interpreted_string_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Interpreted_string_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:934:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_UNICODE_VALUE) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_OCTAL_BYTE_VALUE && LA10_0<=RULE_HEX_BYTE_VALUE)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:935:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:935:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:936:3: RULE_UNICODE_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterpreted_string_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_UNICODE_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterpreted_string_litAccess().getUNICODE_VALUETerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:941:2: ( ruleByte_value )
                    {
                    // InternalGo.g:941:2: ( ruleByte_value )
                    // InternalGo.g:942:3: ruleByte_value
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterpreted_string_litAccess().getByte_valueParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleByte_value();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterpreted_string_litAccess().getByte_valueParserRuleCall_1_1()); 
                    }

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
    // InternalGo.g:951:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );
    public final void rule__Literals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:955:1: ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) )
            int alt11=5;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalGo.g:956:2: ( ruleInt_lit )
                    {
                    // InternalGo.g:956:2: ( ruleInt_lit )
                    // InternalGo.g:957:3: ruleInt_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralsAccess().getInt_litParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInt_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralsAccess().getInt_litParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:962:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:962:2: ( ruleFloat_lit )
                    // InternalGo.g:963:3: ruleFloat_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralsAccess().getFloat_litParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFloat_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralsAccess().getFloat_litParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:968:2: ( ruleImaginary_lit )
                    {
                    // InternalGo.g:968:2: ( ruleImaginary_lit )
                    // InternalGo.g:969:3: ruleImaginary_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralsAccess().getImaginary_litParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleImaginary_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralsAccess().getImaginary_litParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:974:2: ( ruleRune_lit )
                    {
                    // InternalGo.g:974:2: ( ruleRune_lit )
                    // InternalGo.g:975:3: ruleRune_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralsAccess().getRune_litParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRune_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralsAccess().getRune_litParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:980:2: ( ruleString_lit )
                    {
                    // InternalGo.g:980:2: ( ruleString_lit )
                    // InternalGo.g:981:3: ruleString_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralsAccess().getString_litParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleString_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralsAccess().getString_litParserRuleCall_4()); 
                    }

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
    // InternalGo.g:990:1: rule__Type_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Type_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:994:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_IDENTIFIER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_SEMICOLON||LA12_1==RULE_RAW_STRING_LIT||LA12_1==38||LA12_1==44||LA12_1==55) ) {
                    alt12=1;
                }
                else if ( (LA12_1==47) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:995:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:995:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:996:3: RULE_IDENTIFIER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                    }
                    match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1001:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:1001:2: ( ruleQualified_ident )
                    // InternalGo.g:1002:3: ruleQualified_ident
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_nameAccess().getQualified_identParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualified_ident();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_nameAccess().getQualified_identParserRuleCall_1()); 
                    }

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


    // $ANTLR start "rule__Field_decl__Alternatives_0"
    // InternalGo.g:1011:1: rule__Field_decl__Alternatives_0 : ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) );
    public final void rule__Field_decl__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1015:1: ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_IDENTIFIER) ) {
                alt13=1;
            }
            else if ( (LA13_0==57) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:1016:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    {
                    // InternalGo.g:1016:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    // InternalGo.g:1017:3: ( rule__Field_decl__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declAccess().getGroup_0_0()); 
                    }
                    // InternalGo.g:1018:3: ( rule__Field_decl__Group_0_0__0 )
                    // InternalGo.g:1018:4: rule__Field_decl__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field_decl__Group_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declAccess().getGroup_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1022:2: ( ruleEmbedded_field )
                    {
                    // InternalGo.g:1022:2: ( ruleEmbedded_field )
                    // InternalGo.g:1023:3: ruleEmbedded_field
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declAccess().getEmbedded_fieldParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEmbedded_field();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declAccess().getEmbedded_fieldParserRuleCall_0_1()); 
                    }

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
    // $ANTLR end "rule__Field_decl__Alternatives_0"


    // $ANTLR start "rule__Import_spec__Alternatives_0"
    // InternalGo.g:1032:1: rule__Import_spec__Alternatives_0 : ( ( '.' ) | ( RULE_IDENTIFIER ) );
    public final void rule__Import_spec__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1036:1: ( ( '.' ) | ( RULE_IDENTIFIER ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_IDENTIFIER) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1037:2: ( '.' )
                    {
                    // InternalGo.g:1037:2: ( '.' )
                    // InternalGo.g:1038:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_specAccess().getFullStopKeyword_0_0()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_specAccess().getFullStopKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1043:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:1043:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:1044:3: RULE_IDENTIFIER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_specAccess().getIDENTIFIERTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_specAccess().getIDENTIFIERTerminalRuleCall_0_1()); 
                    }

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
    // InternalGo.g:1053:1: rule__Float_lit__Group__0 : rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 ;
    public final void rule__Float_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1057:1: ( rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 )
            // InternalGo.g:1058:2: rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Float_lit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1065:1: rule__Float_lit__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1069:1: ( ( RULE_INT ) )
            // InternalGo.g:1070:1: ( RULE_INT )
            {
            // InternalGo.g:1070:1: ( RULE_INT )
            // InternalGo.g:1071:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_0()); 
            }

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
    // InternalGo.g:1080:1: rule__Float_lit__Group__1 : rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 ;
    public final void rule__Float_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1084:1: ( rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 )
            // InternalGo.g:1085:2: rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Float_lit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1092:1: rule__Float_lit__Group__1__Impl : ( ( rule__Float_lit__Alternatives_1 ) ) ;
    public final void rule__Float_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1096:1: ( ( ( rule__Float_lit__Alternatives_1 ) ) )
            // InternalGo.g:1097:1: ( ( rule__Float_lit__Alternatives_1 ) )
            {
            // InternalGo.g:1097:1: ( ( rule__Float_lit__Alternatives_1 ) )
            // InternalGo.g:1098:2: ( rule__Float_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:1099:2: ( rule__Float_lit__Alternatives_1 )
            // InternalGo.g:1099:3: rule__Float_lit__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getAlternatives_1()); 
            }

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
    // InternalGo.g:1107:1: rule__Float_lit__Group__2 : rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 ;
    public final void rule__Float_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1111:1: ( rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 )
            // InternalGo.g:1112:2: rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Float_lit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1119:1: rule__Float_lit__Group__2__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1123:1: ( ( '.' ) )
            // InternalGo.g:1124:1: ( '.' )
            {
            // InternalGo.g:1124:1: ( '.' )
            // InternalGo.g:1125:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getFullStopKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getFullStopKeyword_2()); 
            }

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
    // InternalGo.g:1134:1: rule__Float_lit__Group__3 : rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 ;
    public final void rule__Float_lit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1138:1: ( rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 )
            // InternalGo.g:1139:2: rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Float_lit__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1146:1: rule__Float_lit__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1150:1: ( ( RULE_INT ) )
            // InternalGo.g:1151:1: ( RULE_INT )
            {
            // InternalGo.g:1151:1: ( RULE_INT )
            // InternalGo.g:1152:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_3()); 
            }

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
    // InternalGo.g:1161:1: rule__Float_lit__Group__4 : rule__Float_lit__Group__4__Impl ;
    public final void rule__Float_lit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1165:1: ( rule__Float_lit__Group__4__Impl )
            // InternalGo.g:1166:2: rule__Float_lit__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1172:1: rule__Float_lit__Group__4__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1176:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:1177:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:1177:1: ( ( ruleExponent )? )
            // InternalGo.g:1178:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4()); 
            }
            // InternalGo.g:1179:2: ( ruleExponent )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=49 && LA15_0<=50)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:1179:3: ruleExponent
                    {
                    pushFollow(FOLLOW_2);
                    ruleExponent();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4()); 
            }

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
    // InternalGo.g:1188:1: rule__Float_lit__Group_1_0__0 : rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 ;
    public final void rule__Float_lit__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1192:1: ( rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 )
            // InternalGo.g:1193:2: rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Float_lit__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1200:1: rule__Float_lit__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1204:1: ( ( '.' ) )
            // InternalGo.g:1205:1: ( '.' )
            {
            // InternalGo.g:1205:1: ( '.' )
            // InternalGo.g:1206:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getFullStopKeyword_1_0_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getFullStopKeyword_1_0_0()); 
            }

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
    // InternalGo.g:1215:1: rule__Float_lit__Group_1_0__1 : rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 ;
    public final void rule__Float_lit__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1219:1: ( rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 )
            // InternalGo.g:1220:2: rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Float_lit__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1227:1: rule__Float_lit__Group_1_0__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Float_lit__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1231:1: ( ( ( RULE_INT )? ) )
            // InternalGo.g:1232:1: ( ( RULE_INT )? )
            {
            // InternalGo.g:1232:1: ( ( RULE_INT )? )
            // InternalGo.g:1233:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1()); 
            }
            // InternalGo.g:1234:2: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1234:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1()); 
            }

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
    // InternalGo.g:1242:1: rule__Float_lit__Group_1_0__2 : rule__Float_lit__Group_1_0__2__Impl ;
    public final void rule__Float_lit__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1246:1: ( rule__Float_lit__Group_1_0__2__Impl )
            // InternalGo.g:1247:2: rule__Float_lit__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float_lit__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1253:1: rule__Float_lit__Group_1_0__2__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1257:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:1258:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:1258:1: ( ( ruleExponent )? )
            // InternalGo.g:1259:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2()); 
            }
            // InternalGo.g:1260:2: ( ruleExponent )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=49 && LA17_0<=50)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1260:3: ruleExponent
                    {
                    pushFollow(FOLLOW_2);
                    ruleExponent();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2()); 
            }

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
    // InternalGo.g:1269:1: rule__Exponent__Group__0 : rule__Exponent__Group__0__Impl rule__Exponent__Group__1 ;
    public final void rule__Exponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1273:1: ( rule__Exponent__Group__0__Impl rule__Exponent__Group__1 )
            // InternalGo.g:1274:2: rule__Exponent__Group__0__Impl rule__Exponent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Exponent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1281:1: rule__Exponent__Group__0__Impl : ( ( rule__Exponent__Alternatives_0 ) ) ;
    public final void rule__Exponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1285:1: ( ( ( rule__Exponent__Alternatives_0 ) ) )
            // InternalGo.g:1286:1: ( ( rule__Exponent__Alternatives_0 ) )
            {
            // InternalGo.g:1286:1: ( ( rule__Exponent__Alternatives_0 ) )
            // InternalGo.g:1287:2: ( rule__Exponent__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_0()); 
            }
            // InternalGo.g:1288:2: ( rule__Exponent__Alternatives_0 )
            // InternalGo.g:1288:3: rule__Exponent__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentAccess().getAlternatives_0()); 
            }

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
    // InternalGo.g:1296:1: rule__Exponent__Group__1 : rule__Exponent__Group__1__Impl rule__Exponent__Group__2 ;
    public final void rule__Exponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1300:1: ( rule__Exponent__Group__1__Impl rule__Exponent__Group__2 )
            // InternalGo.g:1301:2: rule__Exponent__Group__1__Impl rule__Exponent__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Exponent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1308:1: rule__Exponent__Group__1__Impl : ( ( rule__Exponent__Alternatives_1 )? ) ;
    public final void rule__Exponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1312:1: ( ( ( rule__Exponent__Alternatives_1 )? ) )
            // InternalGo.g:1313:1: ( ( rule__Exponent__Alternatives_1 )? )
            {
            // InternalGo.g:1313:1: ( ( rule__Exponent__Alternatives_1 )? )
            // InternalGo.g:1314:2: ( rule__Exponent__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_1()); 
            }
            // InternalGo.g:1315:2: ( rule__Exponent__Alternatives_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=51 && LA18_0<=52)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:1315:3: rule__Exponent__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exponent__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentAccess().getAlternatives_1()); 
            }

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
    // InternalGo.g:1323:1: rule__Exponent__Group__2 : rule__Exponent__Group__2__Impl ;
    public final void rule__Exponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1327:1: ( rule__Exponent__Group__2__Impl )
            // InternalGo.g:1328:2: rule__Exponent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1334:1: rule__Exponent__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Exponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1338:1: ( ( RULE_INT ) )
            // InternalGo.g:1339:1: ( RULE_INT )
            {
            // InternalGo.g:1339:1: ( RULE_INT )
            // InternalGo.g:1340:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentAccess().getINTTerminalRuleCall_2()); 
            }

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
    // InternalGo.g:1350:1: rule__Imaginary_lit__Group__0 : rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 ;
    public final void rule__Imaginary_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1354:1: ( rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 )
            // InternalGo.g:1355:2: rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Imaginary_lit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1362:1: rule__Imaginary_lit__Group__0__Impl : ( ( rule__Imaginary_lit__Alternatives_0 ) ) ;
    public final void rule__Imaginary_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1366:1: ( ( ( rule__Imaginary_lit__Alternatives_0 ) ) )
            // InternalGo.g:1367:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            {
            // InternalGo.g:1367:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            // InternalGo.g:1368:2: ( rule__Imaginary_lit__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getAlternatives_0()); 
            }
            // InternalGo.g:1369:2: ( rule__Imaginary_lit__Alternatives_0 )
            // InternalGo.g:1369:3: rule__Imaginary_lit__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImaginary_litAccess().getAlternatives_0()); 
            }

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
    // InternalGo.g:1377:1: rule__Imaginary_lit__Group__1 : rule__Imaginary_lit__Group__1__Impl ;
    public final void rule__Imaginary_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1381:1: ( rule__Imaginary_lit__Group__1__Impl )
            // InternalGo.g:1382:2: rule__Imaginary_lit__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imaginary_lit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1388:1: rule__Imaginary_lit__Group__1__Impl : ( 'i' ) ;
    public final void rule__Imaginary_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1392:1: ( ( 'i' ) )
            // InternalGo.g:1393:1: ( 'i' )
            {
            // InternalGo.g:1393:1: ( 'i' )
            // InternalGo.g:1394:2: 'i'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getIKeyword_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImaginary_litAccess().getIKeyword_1()); 
            }

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
    // InternalGo.g:1404:1: rule__Rune_lit__Group__0 : rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 ;
    public final void rule__Rune_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1408:1: ( rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 )
            // InternalGo.g:1409:2: rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rune_lit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1416:1: rule__Rune_lit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1420:1: ( ( '\\'' ) )
            // InternalGo.g:1421:1: ( '\\'' )
            {
            // InternalGo.g:1421:1: ( '\\'' )
            // InternalGo.g:1422:2: '\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getApostropheKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRune_litAccess().getApostropheKeyword_0()); 
            }

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
    // InternalGo.g:1431:1: rule__Rune_lit__Group__1 : rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 ;
    public final void rule__Rune_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1435:1: ( rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 )
            // InternalGo.g:1436:2: rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rune_lit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1443:1: rule__Rune_lit__Group__1__Impl : ( ( rule__Rune_lit__Alternatives_1 ) ) ;
    public final void rule__Rune_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1447:1: ( ( ( rule__Rune_lit__Alternatives_1 ) ) )
            // InternalGo.g:1448:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            {
            // InternalGo.g:1448:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            // InternalGo.g:1449:2: ( rule__Rune_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:1450:2: ( rule__Rune_lit__Alternatives_1 )
            // InternalGo.g:1450:3: rule__Rune_lit__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRune_litAccess().getAlternatives_1()); 
            }

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
    // InternalGo.g:1458:1: rule__Rune_lit__Group__2 : rule__Rune_lit__Group__2__Impl ;
    public final void rule__Rune_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1462:1: ( rule__Rune_lit__Group__2__Impl )
            // InternalGo.g:1463:2: rule__Rune_lit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rune_lit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1469:1: rule__Rune_lit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1473:1: ( ( '\\'' ) )
            // InternalGo.g:1474:1: ( '\\'' )
            {
            // InternalGo.g:1474:1: ( '\\'' )
            // InternalGo.g:1475:2: '\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getApostropheKeyword_2()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRune_litAccess().getApostropheKeyword_2()); 
            }

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
    // InternalGo.g:1485:1: rule__Interpreted_string_lit__Group__0 : rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 ;
    public final void rule__Interpreted_string_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1489:1: ( rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 )
            // InternalGo.g:1490:2: rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Interpreted_string_lit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1497:1: rule__Interpreted_string_lit__Group__0__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1501:1: ( ( '\"' ) )
            // InternalGo.g:1502:1: ( '\"' )
            {
            // InternalGo.g:1502:1: ( '\"' )
            // InternalGo.g:1503:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0()); 
            }

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
    // InternalGo.g:1512:1: rule__Interpreted_string_lit__Group__1 : rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 ;
    public final void rule__Interpreted_string_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1516:1: ( rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 )
            // InternalGo.g:1517:2: rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Interpreted_string_lit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1524:1: rule__Interpreted_string_lit__Group__1__Impl : ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) ;
    public final void rule__Interpreted_string_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1528:1: ( ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) )
            // InternalGo.g:1529:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            {
            // InternalGo.g:1529:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            // InternalGo.g:1530:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:1531:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_UNICODE_VALUE && LA19_0<=RULE_HEX_BYTE_VALUE)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:1531:3: rule__Interpreted_string_lit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Interpreted_string_lit__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 
            }

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
    // InternalGo.g:1539:1: rule__Interpreted_string_lit__Group__2 : rule__Interpreted_string_lit__Group__2__Impl ;
    public final void rule__Interpreted_string_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1543:1: ( rule__Interpreted_string_lit__Group__2__Impl )
            // InternalGo.g:1544:2: rule__Interpreted_string_lit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interpreted_string_lit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:1550:1: rule__Interpreted_string_lit__Group__2__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1554:1: ( ( '\"' ) )
            // InternalGo.g:1555:1: ( '\"' )
            {
            // InternalGo.g:1555:1: ( '\"' )
            // InternalGo.g:1556:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2()); 
            }

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


    // $ANTLR start "rule__Array_type__Group__0"
    // InternalGo.g:1566:1: rule__Array_type__Group__0 : rule__Array_type__Group__0__Impl rule__Array_type__Group__1 ;
    public final void rule__Array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1570:1: ( rule__Array_type__Group__0__Impl rule__Array_type__Group__1 )
            // InternalGo.g:1571:2: rule__Array_type__Group__0__Impl rule__Array_type__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Array_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array_type__Group__0"


    // $ANTLR start "rule__Array_type__Group__0__Impl"
    // InternalGo.g:1578:1: rule__Array_type__Group__0__Impl : ( '[' ) ;
    public final void rule__Array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1582:1: ( ( '[' ) )
            // InternalGo.g:1583:1: ( '[' )
            {
            // InternalGo.g:1583:1: ( '[' )
            // InternalGo.g:1584:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_0()); 
            }

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
    // $ANTLR end "rule__Array_type__Group__0__Impl"


    // $ANTLR start "rule__Array_type__Group__1"
    // InternalGo.g:1593:1: rule__Array_type__Group__1 : rule__Array_type__Group__1__Impl rule__Array_type__Group__2 ;
    public final void rule__Array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1597:1: ( rule__Array_type__Group__1__Impl rule__Array_type__Group__2 )
            // InternalGo.g:1598:2: rule__Array_type__Group__1__Impl rule__Array_type__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Array_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array_type__Group__1"


    // $ANTLR start "rule__Array_type__Group__1__Impl"
    // InternalGo.g:1605:1: rule__Array_type__Group__1__Impl : ( ( ruleParameter_list ) ) ;
    public final void rule__Array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1609:1: ( ( ( ruleParameter_list ) ) )
            // InternalGo.g:1610:1: ( ( ruleParameter_list ) )
            {
            // InternalGo.g:1610:1: ( ( ruleParameter_list ) )
            // InternalGo.g:1611:2: ( ruleParameter_list )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getParameter_listParserRuleCall_1()); 
            }
            // InternalGo.g:1612:2: ( ruleParameter_list )
            // InternalGo.g:1612:3: ruleParameter_list
            {
            pushFollow(FOLLOW_2);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArray_typeAccess().getParameter_listParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__Array_type__Group__1__Impl"


    // $ANTLR start "rule__Array_type__Group__2"
    // InternalGo.g:1620:1: rule__Array_type__Group__2 : rule__Array_type__Group__2__Impl rule__Array_type__Group__3 ;
    public final void rule__Array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1624:1: ( rule__Array_type__Group__2__Impl rule__Array_type__Group__3 )
            // InternalGo.g:1625:2: rule__Array_type__Group__2__Impl rule__Array_type__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Array_type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array_type__Group__2"


    // $ANTLR start "rule__Array_type__Group__2__Impl"
    // InternalGo.g:1632:1: rule__Array_type__Group__2__Impl : ( ']' ) ;
    public final void rule__Array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1636:1: ( ( ']' ) )
            // InternalGo.g:1637:1: ( ']' )
            {
            // InternalGo.g:1637:1: ( ']' )
            // InternalGo.g:1638:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_2()); 
            }

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
    // $ANTLR end "rule__Array_type__Group__2__Impl"


    // $ANTLR start "rule__Array_type__Group__3"
    // InternalGo.g:1647:1: rule__Array_type__Group__3 : rule__Array_type__Group__3__Impl ;
    public final void rule__Array_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1651:1: ( rule__Array_type__Group__3__Impl )
            // InternalGo.g:1652:2: rule__Array_type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array_type__Group__3"


    // $ANTLR start "rule__Array_type__Group__3__Impl"
    // InternalGo.g:1658:1: rule__Array_type__Group__3__Impl : ( ruleType ) ;
    public final void rule__Array_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1662:1: ( ( ruleType ) )
            // InternalGo.g:1663:1: ( ruleType )
            {
            // InternalGo.g:1663:1: ( ruleType )
            // InternalGo.g:1664:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getTypeParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArray_typeAccess().getTypeParserRuleCall_3()); 
            }

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
    // $ANTLR end "rule__Array_type__Group__3__Impl"


    // $ANTLR start "rule__Struct_type__Group__0"
    // InternalGo.g:1674:1: rule__Struct_type__Group__0 : rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 ;
    public final void rule__Struct_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1678:1: ( rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 )
            // InternalGo.g:1679:2: rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Struct_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Struct_type__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Struct_type__Group__0"


    // $ANTLR start "rule__Struct_type__Group__0__Impl"
    // InternalGo.g:1686:1: rule__Struct_type__Group__0__Impl : ( 'struct' ) ;
    public final void rule__Struct_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1690:1: ( ( 'struct' ) )
            // InternalGo.g:1691:1: ( 'struct' )
            {
            // InternalGo.g:1691:1: ( 'struct' )
            // InternalGo.g:1692:2: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getStructKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeAccess().getStructKeyword_0()); 
            }

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
    // $ANTLR end "rule__Struct_type__Group__0__Impl"


    // $ANTLR start "rule__Struct_type__Group__1"
    // InternalGo.g:1701:1: rule__Struct_type__Group__1 : rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 ;
    public final void rule__Struct_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1705:1: ( rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 )
            // InternalGo.g:1706:2: rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Struct_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Struct_type__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Struct_type__Group__1"


    // $ANTLR start "rule__Struct_type__Group__1__Impl"
    // InternalGo.g:1713:1: rule__Struct_type__Group__1__Impl : ( '{' ) ;
    public final void rule__Struct_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1717:1: ( ( '{' ) )
            // InternalGo.g:1718:1: ( '{' )
            {
            // InternalGo.g:1718:1: ( '{' )
            // InternalGo.g:1719:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeAccess().getLeftCurlyBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__Struct_type__Group__1__Impl"


    // $ANTLR start "rule__Struct_type__Group__2"
    // InternalGo.g:1728:1: rule__Struct_type__Group__2 : rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 ;
    public final void rule__Struct_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1732:1: ( rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 )
            // InternalGo.g:1733:2: rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Struct_type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Struct_type__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Struct_type__Group__2"


    // $ANTLR start "rule__Struct_type__Group__2__Impl"
    // InternalGo.g:1740:1: rule__Struct_type__Group__2__Impl : ( ( rule__Struct_type__Group_2__0 )* ) ;
    public final void rule__Struct_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1744:1: ( ( ( rule__Struct_type__Group_2__0 )* ) )
            // InternalGo.g:1745:1: ( ( rule__Struct_type__Group_2__0 )* )
            {
            // InternalGo.g:1745:1: ( ( rule__Struct_type__Group_2__0 )* )
            // InternalGo.g:1746:2: ( rule__Struct_type__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getGroup_2()); 
            }
            // InternalGo.g:1747:2: ( rule__Struct_type__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_IDENTIFIER||LA20_0==57) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGo.g:1747:3: rule__Struct_type__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Struct_type__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__Struct_type__Group__2__Impl"


    // $ANTLR start "rule__Struct_type__Group__3"
    // InternalGo.g:1755:1: rule__Struct_type__Group__3 : rule__Struct_type__Group__3__Impl ;
    public final void rule__Struct_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1759:1: ( rule__Struct_type__Group__3__Impl )
            // InternalGo.g:1760:2: rule__Struct_type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct_type__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Struct_type__Group__3"


    // $ANTLR start "rule__Struct_type__Group__3__Impl"
    // InternalGo.g:1766:1: rule__Struct_type__Group__3__Impl : ( '}' ) ;
    public final void rule__Struct_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1770:1: ( ( '}' ) )
            // InternalGo.g:1771:1: ( '}' )
            {
            // InternalGo.g:1771:1: ( '}' )
            // InternalGo.g:1772:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeAccess().getRightCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__Struct_type__Group__3__Impl"


    // $ANTLR start "rule__Struct_type__Group_2__0"
    // InternalGo.g:1782:1: rule__Struct_type__Group_2__0 : rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 ;
    public final void rule__Struct_type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1786:1: ( rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 )
            // InternalGo.g:1787:2: rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Struct_type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Struct_type__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Struct_type__Group_2__0"


    // $ANTLR start "rule__Struct_type__Group_2__0__Impl"
    // InternalGo.g:1794:1: rule__Struct_type__Group_2__0__Impl : ( ruleField_decl ) ;
    public final void rule__Struct_type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1798:1: ( ( ruleField_decl ) )
            // InternalGo.g:1799:1: ( ruleField_decl )
            {
            // InternalGo.g:1799:1: ( ruleField_decl )
            // InternalGo.g:1800:2: ruleField_decl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getField_declParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeAccess().getField_declParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Struct_type__Group_2__0__Impl"


    // $ANTLR start "rule__Struct_type__Group_2__1"
    // InternalGo.g:1809:1: rule__Struct_type__Group_2__1 : rule__Struct_type__Group_2__1__Impl ;
    public final void rule__Struct_type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1813:1: ( rule__Struct_type__Group_2__1__Impl )
            // InternalGo.g:1814:2: rule__Struct_type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct_type__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Struct_type__Group_2__1"


    // $ANTLR start "rule__Struct_type__Group_2__1__Impl"
    // InternalGo.g:1820:1: rule__Struct_type__Group_2__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Struct_type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1824:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:1825:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:1825:1: ( RULE_SEMICOLON )
            // InternalGo.g:1826:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getSEMICOLONTerminalRuleCall_2_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStruct_typeAccess().getSEMICOLONTerminalRuleCall_2_1()); 
            }

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
    // $ANTLR end "rule__Struct_type__Group_2__1__Impl"


    // $ANTLR start "rule__Field_decl__Group__0"
    // InternalGo.g:1836:1: rule__Field_decl__Group__0 : rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 ;
    public final void rule__Field_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1840:1: ( rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 )
            // InternalGo.g:1841:2: rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Field_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field_decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_decl__Group__0"


    // $ANTLR start "rule__Field_decl__Group__0__Impl"
    // InternalGo.g:1848:1: rule__Field_decl__Group__0__Impl : ( ( rule__Field_decl__Alternatives_0 ) ) ;
    public final void rule__Field_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1852:1: ( ( ( rule__Field_decl__Alternatives_0 ) ) )
            // InternalGo.g:1853:1: ( ( rule__Field_decl__Alternatives_0 ) )
            {
            // InternalGo.g:1853:1: ( ( rule__Field_decl__Alternatives_0 ) )
            // InternalGo.g:1854:2: ( rule__Field_decl__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getAlternatives_0()); 
            }
            // InternalGo.g:1855:2: ( rule__Field_decl__Alternatives_0 )
            // InternalGo.g:1855:3: rule__Field_decl__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Field_decl__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declAccess().getAlternatives_0()); 
            }

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
    // $ANTLR end "rule__Field_decl__Group__0__Impl"


    // $ANTLR start "rule__Field_decl__Group__1"
    // InternalGo.g:1863:1: rule__Field_decl__Group__1 : rule__Field_decl__Group__1__Impl ;
    public final void rule__Field_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1867:1: ( rule__Field_decl__Group__1__Impl )
            // InternalGo.g:1868:2: rule__Field_decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_decl__Group__1"


    // $ANTLR start "rule__Field_decl__Group__1__Impl"
    // InternalGo.g:1874:1: rule__Field_decl__Group__1__Impl : ( ( ruleString_lit )? ) ;
    public final void rule__Field_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1878:1: ( ( ( ruleString_lit )? ) )
            // InternalGo.g:1879:1: ( ( ruleString_lit )? )
            {
            // InternalGo.g:1879:1: ( ( ruleString_lit )? )
            // InternalGo.g:1880:2: ( ruleString_lit )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getString_litParserRuleCall_1()); 
            }
            // InternalGo.g:1881:2: ( ruleString_lit )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_RAW_STRING_LIT||LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1881:3: ruleString_lit
                    {
                    pushFollow(FOLLOW_2);
                    ruleString_lit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declAccess().getString_litParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__Field_decl__Group__1__Impl"


    // $ANTLR start "rule__Field_decl__Group_0_0__0"
    // InternalGo.g:1890:1: rule__Field_decl__Group_0_0__0 : rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 ;
    public final void rule__Field_decl__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1894:1: ( rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 )
            // InternalGo.g:1895:2: rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Field_decl__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field_decl__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_decl__Group_0_0__0"


    // $ANTLR start "rule__Field_decl__Group_0_0__0__Impl"
    // InternalGo.g:1902:1: rule__Field_decl__Group_0_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Field_decl__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1906:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:1907:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:1907:1: ( ruleIdentifier_list )
            // InternalGo.g:1908:2: ruleIdentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getIdentifier_listParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declAccess().getIdentifier_listParserRuleCall_0_0_0()); 
            }

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
    // $ANTLR end "rule__Field_decl__Group_0_0__0__Impl"


    // $ANTLR start "rule__Field_decl__Group_0_0__1"
    // InternalGo.g:1917:1: rule__Field_decl__Group_0_0__1 : rule__Field_decl__Group_0_0__1__Impl ;
    public final void rule__Field_decl__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1921:1: ( rule__Field_decl__Group_0_0__1__Impl )
            // InternalGo.g:1922:2: rule__Field_decl__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field_decl__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_decl__Group_0_0__1"


    // $ANTLR start "rule__Field_decl__Group_0_0__1__Impl"
    // InternalGo.g:1928:1: rule__Field_decl__Group_0_0__1__Impl : ( ruleType ) ;
    public final void rule__Field_decl__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1932:1: ( ( ruleType ) )
            // InternalGo.g:1933:1: ( ruleType )
            {
            // InternalGo.g:1933:1: ( ruleType )
            // InternalGo.g:1934:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getTypeParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declAccess().getTypeParserRuleCall_0_0_1()); 
            }

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
    // $ANTLR end "rule__Field_decl__Group_0_0__1__Impl"


    // $ANTLR start "rule__Embedded_field__Group__0"
    // InternalGo.g:1944:1: rule__Embedded_field__Group__0 : rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 ;
    public final void rule__Embedded_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1948:1: ( rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 )
            // InternalGo.g:1949:2: rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Embedded_field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Embedded_field__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Embedded_field__Group__0"


    // $ANTLR start "rule__Embedded_field__Group__0__Impl"
    // InternalGo.g:1956:1: rule__Embedded_field__Group__0__Impl : ( ( ( '*' ) ) ( ( '*' )* ) ) ;
    public final void rule__Embedded_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1960:1: ( ( ( ( '*' ) ) ( ( '*' )* ) ) )
            // InternalGo.g:1961:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            {
            // InternalGo.g:1961:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            // InternalGo.g:1962:2: ( ( '*' ) ) ( ( '*' )* )
            {
            // InternalGo.g:1962:2: ( ( '*' ) )
            // InternalGo.g:1963:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:1964:3: ( '*' )
            // InternalGo.g:1964:4: '*'
            {
            match(input,57,FOLLOW_20); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }

            }

            // InternalGo.g:1967:2: ( ( '*' )* )
            // InternalGo.g:1968:3: ( '*' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:1969:3: ( '*' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==57) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGo.g:1969:4: '*'
            	    {
            	    match(input,57,FOLLOW_20); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }

            }


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
    // $ANTLR end "rule__Embedded_field__Group__0__Impl"


    // $ANTLR start "rule__Embedded_field__Group__1"
    // InternalGo.g:1978:1: rule__Embedded_field__Group__1 : rule__Embedded_field__Group__1__Impl ;
    public final void rule__Embedded_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1982:1: ( rule__Embedded_field__Group__1__Impl )
            // InternalGo.g:1983:2: rule__Embedded_field__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Embedded_field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Embedded_field__Group__1"


    // $ANTLR start "rule__Embedded_field__Group__1__Impl"
    // InternalGo.g:1989:1: rule__Embedded_field__Group__1__Impl : ( ruleType_name ) ;
    public final void rule__Embedded_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1993:1: ( ( ruleType_name ) )
            // InternalGo.g:1994:1: ( ruleType_name )
            {
            // InternalGo.g:1994:1: ( ruleType_name )
            // InternalGo.g:1995:2: ruleType_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getType_nameParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleType_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldAccess().getType_nameParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__Embedded_field__Group__1__Impl"


    // $ANTLR start "rule__Pointer_type__Group__0"
    // InternalGo.g:2005:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2009:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalGo.g:2010:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Pointer_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pointer_type__Group__0"


    // $ANTLR start "rule__Pointer_type__Group__0__Impl"
    // InternalGo.g:2017:1: rule__Pointer_type__Group__0__Impl : ( '*' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2021:1: ( ( '*' ) )
            // InternalGo.g:2022:1: ( '*' )
            {
            // InternalGo.g:2022:1: ( '*' )
            // InternalGo.g:2023:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getAsteriskKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeAccess().getAsteriskKeyword_0()); 
            }

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
    // $ANTLR end "rule__Pointer_type__Group__0__Impl"


    // $ANTLR start "rule__Pointer_type__Group__1"
    // InternalGo.g:2032:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2036:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalGo.g:2037:2: rule__Pointer_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pointer_type__Group__1"


    // $ANTLR start "rule__Pointer_type__Group__1__Impl"
    // InternalGo.g:2043:1: rule__Pointer_type__Group__1__Impl : ( ruleType ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2047:1: ( ( ruleType ) )
            // InternalGo.g:2048:1: ( ruleType )
            {
            // InternalGo.g:2048:1: ( ruleType )
            // InternalGo.g:2049:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getTypeParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeAccess().getTypeParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__Pointer_type__Group__1__Impl"


    // $ANTLR start "rule__Parameter_list__Group__0"
    // InternalGo.g:2059:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2063:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // InternalGo.g:2064:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2071:1: rule__Parameter_list__Group__0__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2075:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:2076:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:2076:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:2077:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0()); 
            }
            // InternalGo.g:2078:2: ( ruleParameter_decl )
            // InternalGo.g:2078:3: ruleParameter_decl
            {
            pushFollow(FOLLOW_2);
            ruleParameter_decl();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0()); 
            }

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
    // InternalGo.g:2086:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2090:1: ( rule__Parameter_list__Group__1__Impl )
            // InternalGo.g:2091:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2097:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2101:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // InternalGo.g:2102:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // InternalGo.g:2102:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // InternalGo.g:2103:2: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // InternalGo.g:2104:2: ( rule__Parameter_list__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGo.g:2104:3: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }

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
    // InternalGo.g:2113:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2117:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // InternalGo.g:2118:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2125:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2129:1: ( ( ',' ) )
            // InternalGo.g:2130:1: ( ',' )
            {
            // InternalGo.g:2130:1: ( ',' )
            // InternalGo.g:2131:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }

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
    // InternalGo.g:2140:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2144:1: ( rule__Parameter_list__Group_1__1__Impl )
            // InternalGo.g:2145:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2151:1: rule__Parameter_list__Group_1__1__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2155:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:2156:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:2156:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:2157:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_1()); 
            }
            // InternalGo.g:2158:2: ( ruleParameter_decl )
            // InternalGo.g:2158:3: ruleParameter_decl
            {
            pushFollow(FOLLOW_2);
            ruleParameter_decl();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_1()); 
            }

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
    // InternalGo.g:2167:1: rule__Parameter_decl__Group__0 : rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 ;
    public final void rule__Parameter_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2171:1: ( rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 )
            // InternalGo.g:2172:2: rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Parameter_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2179:1: rule__Parameter_decl__Group__0__Impl : ( ( rule__Parameter_decl__Group_0__0 )? ) ;
    public final void rule__Parameter_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2183:1: ( ( ( rule__Parameter_decl__Group_0__0 )? ) )
            // InternalGo.g:2184:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            {
            // InternalGo.g:2184:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            // InternalGo.g:2185:2: ( rule__Parameter_decl__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getGroup_0()); 
            }
            // InternalGo.g:2186:2: ( rule__Parameter_decl__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENTIFIER) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==44) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==RULE_IDENTIFIER) ) {
                        int LA24_5 = input.LA(4);

                        if ( (synpred43_InternalGo()) ) {
                            alt24=1;
                        }
                    }
                }
                else if ( (LA24_1==RULE_IDENTIFIER||LA24_1==46) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:2186:3: rule__Parameter_decl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter_decl__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_declAccess().getGroup_0()); 
            }

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
    // InternalGo.g:2194:1: rule__Parameter_decl__Group__1 : rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 ;
    public final void rule__Parameter_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2198:1: ( rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 )
            // InternalGo.g:2199:2: rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Parameter_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2206:1: rule__Parameter_decl__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__Parameter_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2210:1: ( ( ( '...' )? ) )
            // InternalGo.g:2211:1: ( ( '...' )? )
            {
            // InternalGo.g:2211:1: ( ( '...' )? )
            // InternalGo.g:2212:2: ( '...' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1()); 
            }
            // InternalGo.g:2213:2: ( '...' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:2213:3: '...'
                    {
                    match(input,46,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1()); 
            }

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
    // InternalGo.g:2221:1: rule__Parameter_decl__Group__2 : rule__Parameter_decl__Group__2__Impl ;
    public final void rule__Parameter_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2225:1: ( rule__Parameter_decl__Group__2__Impl )
            // InternalGo.g:2226:2: rule__Parameter_decl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2232:1: rule__Parameter_decl__Group__2__Impl : ( ruleType ) ;
    public final void rule__Parameter_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2236:1: ( ( ruleType ) )
            // InternalGo.g:2237:1: ( ruleType )
            {
            // InternalGo.g:2237:1: ( ruleType )
            // InternalGo.g:2238:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getTypeParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_declAccess().getTypeParserRuleCall_2()); 
            }

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


    // $ANTLR start "rule__Parameter_decl__Group_0__0"
    // InternalGo.g:2248:1: rule__Parameter_decl__Group_0__0 : rule__Parameter_decl__Group_0__0__Impl ;
    public final void rule__Parameter_decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2252:1: ( rule__Parameter_decl__Group_0__0__Impl )
            // InternalGo.g:2253:2: rule__Parameter_decl__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_decl__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter_decl__Group_0__0"


    // $ANTLR start "rule__Parameter_decl__Group_0__0__Impl"
    // InternalGo.g:2259:1: rule__Parameter_decl__Group_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Parameter_decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2263:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:2264:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:2264:1: ( ruleIdentifier_list )
            // InternalGo.g:2265:2: ruleIdentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getIdentifier_listParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_declAccess().getIdentifier_listParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Parameter_decl__Group_0__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // InternalGo.g:2275:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2279:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalGo.g:2280:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2287:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2291:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:2292:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:2292:1: ( RULE_IDENTIFIER )
            // InternalGo.g:2293:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }

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
    // InternalGo.g:2302:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2306:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalGo.g:2307:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2313:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2317:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalGo.g:2318:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalGo.g:2318:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalGo.g:2319:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalGo.g:2320:2: ( rule__Identifier_list__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:2320:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }

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
    // InternalGo.g:2329:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2333:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalGo.g:2334:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2341:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2345:1: ( ( ',' ) )
            // InternalGo.g:2346:1: ( ',' )
            {
            // InternalGo.g:2346:1: ( ',' )
            // InternalGo.g:2347:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            }

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
    // InternalGo.g:2356:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2360:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalGo.g:2361:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2367:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2371:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:2372:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:2372:1: ( RULE_IDENTIFIER )
            // InternalGo.g:2373:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            }

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
    // InternalGo.g:2383:1: rule__Qualified_ident__Group__0 : rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 ;
    public final void rule__Qualified_ident__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2387:1: ( rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 )
            // InternalGo.g:2388:2: rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Qualified_ident__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2395:1: rule__Qualified_ident__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2399:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:2400:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:2400:1: ( RULE_IDENTIFIER )
            // InternalGo.g:2401:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }

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
    // InternalGo.g:2410:1: rule__Qualified_ident__Group__1 : rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 ;
    public final void rule__Qualified_ident__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2414:1: ( rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 )
            // InternalGo.g:2415:2: rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Qualified_ident__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2422:1: rule__Qualified_ident__Group__1__Impl : ( '.' ) ;
    public final void rule__Qualified_ident__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2426:1: ( ( '.' ) )
            // InternalGo.g:2427:1: ( '.' )
            {
            // InternalGo.g:2427:1: ( '.' )
            // InternalGo.g:2428:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualified_identAccess().getFullStopKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualified_identAccess().getFullStopKeyword_1()); 
            }

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
    // InternalGo.g:2437:1: rule__Qualified_ident__Group__2 : rule__Qualified_ident__Group__2__Impl ;
    public final void rule__Qualified_ident__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2441:1: ( rule__Qualified_ident__Group__2__Impl )
            // InternalGo.g:2442:2: rule__Qualified_ident__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified_ident__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2448:1: rule__Qualified_ident__Group__2__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2452:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:2453:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:2453:1: ( RULE_IDENTIFIER )
            // InternalGo.g:2454:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_2()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualified_identAccess().getIDENTIFIERTerminalRuleCall_2()); 
            }

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
    // InternalGo.g:2464:1: rule__Import_spec__Group__0 : rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 ;
    public final void rule__Import_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2468:1: ( rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 )
            // InternalGo.g:2469:2: rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Import_spec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import_spec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2476:1: rule__Import_spec__Group__0__Impl : ( ( rule__Import_spec__Alternatives_0 )? ) ;
    public final void rule__Import_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2480:1: ( ( ( rule__Import_spec__Alternatives_0 )? ) )
            // InternalGo.g:2481:1: ( ( rule__Import_spec__Alternatives_0 )? )
            {
            // InternalGo.g:2481:1: ( ( rule__Import_spec__Alternatives_0 )? )
            // InternalGo.g:2482:2: ( rule__Import_spec__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getAlternatives_0()); 
            }
            // InternalGo.g:2483:2: ( rule__Import_spec__Alternatives_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENTIFIER||LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:2483:3: rule__Import_spec__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import_spec__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_specAccess().getAlternatives_0()); 
            }

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
    // InternalGo.g:2491:1: rule__Import_spec__Group__1 : rule__Import_spec__Group__1__Impl ;
    public final void rule__Import_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2495:1: ( rule__Import_spec__Group__1__Impl )
            // InternalGo.g:2496:2: rule__Import_spec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_spec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:2502:1: rule__Import_spec__Group__1__Impl : ( ruleImport_path ) ;
    public final void rule__Import_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2506:1: ( ( ruleImport_path ) )
            // InternalGo.g:2507:1: ( ruleImport_path )
            {
            // InternalGo.g:2507:1: ( ruleImport_path )
            // InternalGo.g:2508:2: ruleImport_path
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getImport_pathParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport_path();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_specAccess().getImport_pathParserRuleCall_1()); 
            }

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
    // InternalGo.g:2518:1: rule__Model__GreetingsAssignment : ( ( 'oi' ) ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2522:1: ( ( ( 'oi' ) ) )
            // InternalGo.g:2523:2: ( ( 'oi' ) )
            {
            // InternalGo.g:2523:2: ( ( 'oi' ) )
            // InternalGo.g:2524:3: ( 'oi' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 
            }
            // InternalGo.g:2525:3: ( 'oi' )
            // InternalGo.g:2526:4: 'oi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsOiKeyword_0()); 
            }

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

    // $ANTLR start synpred43_InternalGo
    public final void synpred43_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2186:3: ( rule__Parameter_decl__Group_0__0 )
        // InternalGo.g:2186:3: rule__Parameter_decl__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__Parameter_decl__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalGo

    // Delegated rules

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
            return "951:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0200010000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0200000000004002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});

}