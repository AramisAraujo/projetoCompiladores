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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BINARY_OP", "RULE_SEMICOLON", "RULE_ASSIGN_OP", "RULE_INT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_UNICODE_VALUE", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_IDENTIFIER", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'='", "':='", "','", "'--'", "'...'", "'.'", "':'", "'E'", "'e'", "'+'", "'-'", "'chan'", "'chan<-'", "'<-chan'", "'i'", "'\\''", "'\"'", "'struct'", "'*'", "'func'", "'interface'", "'map'", "'const'", "'package'", "'import'"
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
    public static final int RULE_ID=29;
    public static final int RULE_UNICODE_VALUE=10;
    public static final int RULE_LITTLE_U_VALUE=26;
    public static final int RULE_HEX_BYTE_VALUE=12;
    public static final int RULE_OCTAL_BYTE_VALUE=11;
    public static final int RULE_MUL_OP=18;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int RULE_ADD_OP=17;
    public static final int RULE_UNICODE_DIGIT=22;
    public static final int RULE_WS=33;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_OCTAL_LIT=8;
    public static final int RULE_LETTER=21;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=13;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=15;
    public static final int T__45=45;
    public static final int RULE_REL_OP=16;
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


    // $ANTLR start "entryRuleprogram"
    // InternalGo.g:79:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalGo.g:80:1: ( ruleprogram EOF )
            // InternalGo.g:81:1: ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalGo.g:88:1: ruleprogram : ( ( rule__Program__Alternatives ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:92:2: ( ( ( rule__Program__Alternatives ) ) )
            // InternalGo.g:93:2: ( ( rule__Program__Alternatives ) )
            {
            // InternalGo.g:93:2: ( ( rule__Program__Alternatives ) )
            // InternalGo.g:94:3: ( rule__Program__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getAlternatives()); 
            }
            // InternalGo.g:95:3: ( rule__Program__Alternatives )
            // InternalGo.g:95:4: rule__Program__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Program__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getAlternatives()); 
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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "ruleOPERATORS"
    // InternalGo.g:105:1: ruleOPERATORS : ( ( rule__OPERATORS__Alternatives ) ) ;
    public final void ruleOPERATORS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:109:2: ( ( ( rule__OPERATORS__Alternatives ) ) )
            // InternalGo.g:110:2: ( ( rule__OPERATORS__Alternatives ) )
            {
            // InternalGo.g:110:2: ( ( rule__OPERATORS__Alternatives ) )
            // InternalGo.g:111:3: ( rule__OPERATORS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOPERATORSAccess().getAlternatives()); 
            }
            // InternalGo.g:112:3: ( rule__OPERATORS__Alternatives )
            // InternalGo.g:112:4: rule__OPERATORS__Alternatives
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
    // InternalGo.g:121:1: entryRuleInt_lit : ruleInt_lit EOF ;
    public final void entryRuleInt_lit() throws RecognitionException {
        try {
            // InternalGo.g:122:1: ( ruleInt_lit EOF )
            // InternalGo.g:123:1: ruleInt_lit EOF
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
    // InternalGo.g:130:1: ruleInt_lit : ( ( rule__Int_lit__Alternatives ) ) ;
    public final void ruleInt_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:134:2: ( ( ( rule__Int_lit__Alternatives ) ) )
            // InternalGo.g:135:2: ( ( rule__Int_lit__Alternatives ) )
            {
            // InternalGo.g:135:2: ( ( rule__Int_lit__Alternatives ) )
            // InternalGo.g:136:3: ( rule__Int_lit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInt_litAccess().getAlternatives()); 
            }
            // InternalGo.g:137:3: ( rule__Int_lit__Alternatives )
            // InternalGo.g:137:4: rule__Int_lit__Alternatives
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
    // InternalGo.g:146:1: entryRuleFloat_lit : ruleFloat_lit EOF ;
    public final void entryRuleFloat_lit() throws RecognitionException {
        try {
            // InternalGo.g:147:1: ( ruleFloat_lit EOF )
            // InternalGo.g:148:1: ruleFloat_lit EOF
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
    // InternalGo.g:155:1: ruleFloat_lit : ( ( rule__Float_lit__Group__0 ) ) ;
    public final void ruleFloat_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:159:2: ( ( ( rule__Float_lit__Group__0 ) ) )
            // InternalGo.g:160:2: ( ( rule__Float_lit__Group__0 ) )
            {
            // InternalGo.g:160:2: ( ( rule__Float_lit__Group__0 ) )
            // InternalGo.g:161:3: ( rule__Float_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getGroup()); 
            }
            // InternalGo.g:162:3: ( rule__Float_lit__Group__0 )
            // InternalGo.g:162:4: rule__Float_lit__Group__0
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
    // InternalGo.g:171:1: entryRuleExponent : ruleExponent EOF ;
    public final void entryRuleExponent() throws RecognitionException {
        try {
            // InternalGo.g:172:1: ( ruleExponent EOF )
            // InternalGo.g:173:1: ruleExponent EOF
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
    // InternalGo.g:180:1: ruleExponent : ( ( rule__Exponent__Group__0 ) ) ;
    public final void ruleExponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:184:2: ( ( ( rule__Exponent__Group__0 ) ) )
            // InternalGo.g:185:2: ( ( rule__Exponent__Group__0 ) )
            {
            // InternalGo.g:185:2: ( ( rule__Exponent__Group__0 ) )
            // InternalGo.g:186:3: ( rule__Exponent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getGroup()); 
            }
            // InternalGo.g:187:3: ( rule__Exponent__Group__0 )
            // InternalGo.g:187:4: rule__Exponent__Group__0
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
    // InternalGo.g:196:1: entryRuleImaginary_lit : ruleImaginary_lit EOF ;
    public final void entryRuleImaginary_lit() throws RecognitionException {
        try {
            // InternalGo.g:197:1: ( ruleImaginary_lit EOF )
            // InternalGo.g:198:1: ruleImaginary_lit EOF
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
    // InternalGo.g:205:1: ruleImaginary_lit : ( ( rule__Imaginary_lit__Group__0 ) ) ;
    public final void ruleImaginary_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:209:2: ( ( ( rule__Imaginary_lit__Group__0 ) ) )
            // InternalGo.g:210:2: ( ( rule__Imaginary_lit__Group__0 ) )
            {
            // InternalGo.g:210:2: ( ( rule__Imaginary_lit__Group__0 ) )
            // InternalGo.g:211:3: ( rule__Imaginary_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getGroup()); 
            }
            // InternalGo.g:212:3: ( rule__Imaginary_lit__Group__0 )
            // InternalGo.g:212:4: rule__Imaginary_lit__Group__0
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
    // InternalGo.g:221:1: entryRuleRune_lit : ruleRune_lit EOF ;
    public final void entryRuleRune_lit() throws RecognitionException {
        try {
            // InternalGo.g:222:1: ( ruleRune_lit EOF )
            // InternalGo.g:223:1: ruleRune_lit EOF
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
    // InternalGo.g:230:1: ruleRune_lit : ( ( rule__Rune_lit__Group__0 ) ) ;
    public final void ruleRune_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:234:2: ( ( ( rule__Rune_lit__Group__0 ) ) )
            // InternalGo.g:235:2: ( ( rule__Rune_lit__Group__0 ) )
            {
            // InternalGo.g:235:2: ( ( rule__Rune_lit__Group__0 ) )
            // InternalGo.g:236:3: ( rule__Rune_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getGroup()); 
            }
            // InternalGo.g:237:3: ( rule__Rune_lit__Group__0 )
            // InternalGo.g:237:4: rule__Rune_lit__Group__0
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
    // InternalGo.g:246:1: entryRuleByte_value : ruleByte_value EOF ;
    public final void entryRuleByte_value() throws RecognitionException {
        try {
            // InternalGo.g:247:1: ( ruleByte_value EOF )
            // InternalGo.g:248:1: ruleByte_value EOF
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
    // InternalGo.g:255:1: ruleByte_value : ( ( rule__Byte_value__Alternatives ) ) ;
    public final void ruleByte_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:259:2: ( ( ( rule__Byte_value__Alternatives ) ) )
            // InternalGo.g:260:2: ( ( rule__Byte_value__Alternatives ) )
            {
            // InternalGo.g:260:2: ( ( rule__Byte_value__Alternatives ) )
            // InternalGo.g:261:3: ( rule__Byte_value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getByte_valueAccess().getAlternatives()); 
            }
            // InternalGo.g:262:3: ( rule__Byte_value__Alternatives )
            // InternalGo.g:262:4: rule__Byte_value__Alternatives
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
    // InternalGo.g:271:1: entryRuleString_lit : ruleString_lit EOF ;
    public final void entryRuleString_lit() throws RecognitionException {
        try {
            // InternalGo.g:272:1: ( ruleString_lit EOF )
            // InternalGo.g:273:1: ruleString_lit EOF
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
    // InternalGo.g:280:1: ruleString_lit : ( ( rule__String_lit__Alternatives ) ) ;
    public final void ruleString_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:284:2: ( ( ( rule__String_lit__Alternatives ) ) )
            // InternalGo.g:285:2: ( ( rule__String_lit__Alternatives ) )
            {
            // InternalGo.g:285:2: ( ( rule__String_lit__Alternatives ) )
            // InternalGo.g:286:3: ( rule__String_lit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getString_litAccess().getAlternatives()); 
            }
            // InternalGo.g:287:3: ( rule__String_lit__Alternatives )
            // InternalGo.g:287:4: rule__String_lit__Alternatives
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
    // InternalGo.g:296:1: entryRuleInterpreted_string_lit : ruleInterpreted_string_lit EOF ;
    public final void entryRuleInterpreted_string_lit() throws RecognitionException {
        try {
            // InternalGo.g:297:1: ( ruleInterpreted_string_lit EOF )
            // InternalGo.g:298:1: ruleInterpreted_string_lit EOF
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
    // InternalGo.g:305:1: ruleInterpreted_string_lit : ( ( rule__Interpreted_string_lit__Group__0 ) ) ;
    public final void ruleInterpreted_string_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:309:2: ( ( ( rule__Interpreted_string_lit__Group__0 ) ) )
            // InternalGo.g:310:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            {
            // InternalGo.g:310:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            // InternalGo.g:311:3: ( rule__Interpreted_string_lit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getGroup()); 
            }
            // InternalGo.g:312:3: ( rule__Interpreted_string_lit__Group__0 )
            // InternalGo.g:312:4: rule__Interpreted_string_lit__Group__0
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
    // InternalGo.g:321:1: entryRuleLiterals : ruleLiterals EOF ;
    public final void entryRuleLiterals() throws RecognitionException {
        try {
            // InternalGo.g:322:1: ( ruleLiterals EOF )
            // InternalGo.g:323:1: ruleLiterals EOF
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
    // InternalGo.g:330:1: ruleLiterals : ( ( rule__Literals__Alternatives ) ) ;
    public final void ruleLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:334:2: ( ( ( rule__Literals__Alternatives ) ) )
            // InternalGo.g:335:2: ( ( rule__Literals__Alternatives ) )
            {
            // InternalGo.g:335:2: ( ( rule__Literals__Alternatives ) )
            // InternalGo.g:336:3: ( rule__Literals__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralsAccess().getAlternatives()); 
            }
            // InternalGo.g:337:3: ( rule__Literals__Alternatives )
            // InternalGo.g:337:4: rule__Literals__Alternatives
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
    // InternalGo.g:346:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGo.g:347:1: ( ruleType EOF )
            // InternalGo.g:348:1: ruleType EOF
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
    // InternalGo.g:355:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:359:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGo.g:360:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGo.g:360:2: ( ( rule__Type__Alternatives ) )
            // InternalGo.g:361:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalGo.g:362:3: ( rule__Type__Alternatives )
            // InternalGo.g:362:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // InternalGo.g:371:1: entryRuleType_name : ruleType_name EOF ;
    public final void entryRuleType_name() throws RecognitionException {
        try {
            // InternalGo.g:372:1: ( ruleType_name EOF )
            // InternalGo.g:373:1: ruleType_name EOF
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
    // InternalGo.g:380:1: ruleType_name : ( ( rule__Type_name__Alternatives ) ) ;
    public final void ruleType_name() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:384:2: ( ( ( rule__Type_name__Alternatives ) ) )
            // InternalGo.g:385:2: ( ( rule__Type_name__Alternatives ) )
            {
            // InternalGo.g:385:2: ( ( rule__Type_name__Alternatives ) )
            // InternalGo.g:386:3: ( rule__Type_name__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_nameAccess().getAlternatives()); 
            }
            // InternalGo.g:387:3: ( rule__Type_name__Alternatives )
            // InternalGo.g:387:4: rule__Type_name__Alternatives
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


    // $ANTLR start "entryRuleType_lit"
    // InternalGo.g:396:1: entryRuleType_lit : ruleType_lit EOF ;
    public final void entryRuleType_lit() throws RecognitionException {
        try {
            // InternalGo.g:397:1: ( ruleType_lit EOF )
            // InternalGo.g:398:1: ruleType_lit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_litRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType_lit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_litRule()); 
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
    // $ANTLR end "entryRuleType_lit"


    // $ANTLR start "ruleType_lit"
    // InternalGo.g:405:1: ruleType_lit : ( ( rule__Type_lit__Alternatives ) ) ;
    public final void ruleType_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:409:2: ( ( ( rule__Type_lit__Alternatives ) ) )
            // InternalGo.g:410:2: ( ( rule__Type_lit__Alternatives ) )
            {
            // InternalGo.g:410:2: ( ( rule__Type_lit__Alternatives ) )
            // InternalGo.g:411:3: ( rule__Type_lit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_litAccess().getAlternatives()); 
            }
            // InternalGo.g:412:3: ( rule__Type_lit__Alternatives )
            // InternalGo.g:412:4: rule__Type_lit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type_lit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_litAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType_lit"


    // $ANTLR start "entryRuleArray_type"
    // InternalGo.g:421:1: entryRuleArray_type : ruleArray_type EOF ;
    public final void entryRuleArray_type() throws RecognitionException {
        try {
            // InternalGo.g:422:1: ( ruleArray_type EOF )
            // InternalGo.g:423:1: ruleArray_type EOF
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
    // InternalGo.g:430:1: ruleArray_type : ( ( rule__Array_type__Group__0 ) ) ;
    public final void ruleArray_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:434:2: ( ( ( rule__Array_type__Group__0 ) ) )
            // InternalGo.g:435:2: ( ( rule__Array_type__Group__0 ) )
            {
            // InternalGo.g:435:2: ( ( rule__Array_type__Group__0 ) )
            // InternalGo.g:436:3: ( rule__Array_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getGroup()); 
            }
            // InternalGo.g:437:3: ( rule__Array_type__Group__0 )
            // InternalGo.g:437:4: rule__Array_type__Group__0
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
    // InternalGo.g:446:1: entryRuleStruct_type : ruleStruct_type EOF ;
    public final void entryRuleStruct_type() throws RecognitionException {
        try {
            // InternalGo.g:447:1: ( ruleStruct_type EOF )
            // InternalGo.g:448:1: ruleStruct_type EOF
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
    // InternalGo.g:455:1: ruleStruct_type : ( ( rule__Struct_type__Group__0 ) ) ;
    public final void ruleStruct_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:459:2: ( ( ( rule__Struct_type__Group__0 ) ) )
            // InternalGo.g:460:2: ( ( rule__Struct_type__Group__0 ) )
            {
            // InternalGo.g:460:2: ( ( rule__Struct_type__Group__0 ) )
            // InternalGo.g:461:3: ( rule__Struct_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getGroup()); 
            }
            // InternalGo.g:462:3: ( rule__Struct_type__Group__0 )
            // InternalGo.g:462:4: rule__Struct_type__Group__0
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
    // InternalGo.g:471:1: entryRuleField_decl : ruleField_decl EOF ;
    public final void entryRuleField_decl() throws RecognitionException {
        try {
            // InternalGo.g:472:1: ( ruleField_decl EOF )
            // InternalGo.g:473:1: ruleField_decl EOF
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
    // InternalGo.g:480:1: ruleField_decl : ( ( rule__Field_decl__Group__0 ) ) ;
    public final void ruleField_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:484:2: ( ( ( rule__Field_decl__Group__0 ) ) )
            // InternalGo.g:485:2: ( ( rule__Field_decl__Group__0 ) )
            {
            // InternalGo.g:485:2: ( ( rule__Field_decl__Group__0 ) )
            // InternalGo.g:486:3: ( rule__Field_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getGroup()); 
            }
            // InternalGo.g:487:3: ( rule__Field_decl__Group__0 )
            // InternalGo.g:487:4: rule__Field_decl__Group__0
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
    // InternalGo.g:496:1: entryRuleEmbedded_field : ruleEmbedded_field EOF ;
    public final void entryRuleEmbedded_field() throws RecognitionException {
        try {
            // InternalGo.g:497:1: ( ruleEmbedded_field EOF )
            // InternalGo.g:498:1: ruleEmbedded_field EOF
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
    // InternalGo.g:505:1: ruleEmbedded_field : ( ( rule__Embedded_field__Group__0 ) ) ;
    public final void ruleEmbedded_field() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:509:2: ( ( ( rule__Embedded_field__Group__0 ) ) )
            // InternalGo.g:510:2: ( ( rule__Embedded_field__Group__0 ) )
            {
            // InternalGo.g:510:2: ( ( rule__Embedded_field__Group__0 ) )
            // InternalGo.g:511:3: ( rule__Embedded_field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getGroup()); 
            }
            // InternalGo.g:512:3: ( rule__Embedded_field__Group__0 )
            // InternalGo.g:512:4: rule__Embedded_field__Group__0
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
    // InternalGo.g:521:1: entryRulePointer_type : rulePointer_type EOF ;
    public final void entryRulePointer_type() throws RecognitionException {
        try {
            // InternalGo.g:522:1: ( rulePointer_type EOF )
            // InternalGo.g:523:1: rulePointer_type EOF
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
    // InternalGo.g:530:1: rulePointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulePointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:534:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // InternalGo.g:535:2: ( ( rule__Pointer_type__Group__0 ) )
            {
            // InternalGo.g:535:2: ( ( rule__Pointer_type__Group__0 ) )
            // InternalGo.g:536:3: ( rule__Pointer_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getGroup()); 
            }
            // InternalGo.g:537:3: ( rule__Pointer_type__Group__0 )
            // InternalGo.g:537:4: rule__Pointer_type__Group__0
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


    // $ANTLR start "entryRuleFunction_type"
    // InternalGo.g:546:1: entryRuleFunction_type : ruleFunction_type EOF ;
    public final void entryRuleFunction_type() throws RecognitionException {
        try {
            // InternalGo.g:547:1: ( ruleFunction_type EOF )
            // InternalGo.g:548:1: ruleFunction_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunction_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_typeRule()); 
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
    // $ANTLR end "entryRuleFunction_type"


    // $ANTLR start "ruleFunction_type"
    // InternalGo.g:555:1: ruleFunction_type : ( ( rule__Function_type__Group__0 ) ) ;
    public final void ruleFunction_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:559:2: ( ( ( rule__Function_type__Group__0 ) ) )
            // InternalGo.g:560:2: ( ( rule__Function_type__Group__0 ) )
            {
            // InternalGo.g:560:2: ( ( rule__Function_type__Group__0 ) )
            // InternalGo.g:561:3: ( rule__Function_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_typeAccess().getGroup()); 
            }
            // InternalGo.g:562:3: ( rule__Function_type__Group__0 )
            // InternalGo.g:562:4: rule__Function_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_typeAccess().getGroup()); 
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
    // $ANTLR end "ruleFunction_type"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:571:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalGo.g:572:1: ( ruleSignature EOF )
            // InternalGo.g:573:1: ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureRule()); 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:580:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:584:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalGo.g:585:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalGo.g:585:2: ( ( rule__Signature__Group__0 ) )
            // InternalGo.g:586:3: ( rule__Signature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup()); 
            }
            // InternalGo.g:587:3: ( rule__Signature__Group__0 )
            // InternalGo.g:587:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup()); 
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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalGo.g:596:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalGo.g:597:1: ( ruleResult EOF )
            // InternalGo.g:598:1: ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultRule()); 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGo.g:605:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:609:2: ( ( ( rule__Result__Alternatives ) ) )
            // InternalGo.g:610:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalGo.g:610:2: ( ( rule__Result__Alternatives ) )
            // InternalGo.g:611:3: ( rule__Result__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getAlternatives()); 
            }
            // InternalGo.g:612:3: ( rule__Result__Alternatives )
            // InternalGo.g:612:4: rule__Result__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Result__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getAlternatives()); 
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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:621:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalGo.g:622:1: ( ruleParameters EOF )
            // InternalGo.g:623:1: ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersRule()); 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:630:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:634:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // InternalGo.g:635:2: ( ( rule__Parameters__Group__0 ) )
            {
            // InternalGo.g:635:2: ( ( rule__Parameters__Group__0 ) )
            // InternalGo.g:636:3: ( rule__Parameters__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup()); 
            }
            // InternalGo.g:637:3: ( rule__Parameters__Group__0 )
            // InternalGo.g:637:4: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getGroup()); 
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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter_list"
    // InternalGo.g:646:1: entryRuleParameter_list : ruleParameter_list EOF ;
    public final void entryRuleParameter_list() throws RecognitionException {
        try {
            // InternalGo.g:647:1: ( ruleParameter_list EOF )
            // InternalGo.g:648:1: ruleParameter_list EOF
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
    // InternalGo.g:655:1: ruleParameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleParameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:659:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // InternalGo.g:660:2: ( ( rule__Parameter_list__Group__0 ) )
            {
            // InternalGo.g:660:2: ( ( rule__Parameter_list__Group__0 ) )
            // InternalGo.g:661:3: ( rule__Parameter_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup()); 
            }
            // InternalGo.g:662:3: ( rule__Parameter_list__Group__0 )
            // InternalGo.g:662:4: rule__Parameter_list__Group__0
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
    // InternalGo.g:671:1: entryRuleParameter_decl : ruleParameter_decl EOF ;
    public final void entryRuleParameter_decl() throws RecognitionException {
        try {
            // InternalGo.g:672:1: ( ruleParameter_decl EOF )
            // InternalGo.g:673:1: ruleParameter_decl EOF
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
    // InternalGo.g:680:1: ruleParameter_decl : ( ( rule__Parameter_decl__Group__0 ) ) ;
    public final void ruleParameter_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:684:2: ( ( ( rule__Parameter_decl__Group__0 ) ) )
            // InternalGo.g:685:2: ( ( rule__Parameter_decl__Group__0 ) )
            {
            // InternalGo.g:685:2: ( ( rule__Parameter_decl__Group__0 ) )
            // InternalGo.g:686:3: ( rule__Parameter_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getGroup()); 
            }
            // InternalGo.g:687:3: ( rule__Parameter_decl__Group__0 )
            // InternalGo.g:687:4: rule__Parameter_decl__Group__0
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
    // InternalGo.g:696:1: entryRuleIdentifier_list : ruleIdentifier_list EOF ;
    public final void entryRuleIdentifier_list() throws RecognitionException {
        try {
            // InternalGo.g:697:1: ( ruleIdentifier_list EOF )
            // InternalGo.g:698:1: ruleIdentifier_list EOF
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
    // InternalGo.g:705:1: ruleIdentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleIdentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:709:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalGo.g:710:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalGo.g:710:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalGo.g:711:3: ( rule__Identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            }
            // InternalGo.g:712:3: ( rule__Identifier_list__Group__0 )
            // InternalGo.g:712:4: rule__Identifier_list__Group__0
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


    // $ANTLR start "entryRuleInterface_type"
    // InternalGo.g:721:1: entryRuleInterface_type : ruleInterface_type EOF ;
    public final void entryRuleInterface_type() throws RecognitionException {
        try {
            // InternalGo.g:722:1: ( ruleInterface_type EOF )
            // InternalGo.g:723:1: ruleInterface_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterface_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeRule()); 
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
    // $ANTLR end "entryRuleInterface_type"


    // $ANTLR start "ruleInterface_type"
    // InternalGo.g:730:1: ruleInterface_type : ( ( rule__Interface_type__Group__0 ) ) ;
    public final void ruleInterface_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:734:2: ( ( ( rule__Interface_type__Group__0 ) ) )
            // InternalGo.g:735:2: ( ( rule__Interface_type__Group__0 ) )
            {
            // InternalGo.g:735:2: ( ( rule__Interface_type__Group__0 ) )
            // InternalGo.g:736:3: ( rule__Interface_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getGroup()); 
            }
            // InternalGo.g:737:3: ( rule__Interface_type__Group__0 )
            // InternalGo.g:737:4: rule__Interface_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeAccess().getGroup()); 
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
    // $ANTLR end "ruleInterface_type"


    // $ANTLR start "entryRuleMethod_spec"
    // InternalGo.g:746:1: entryRuleMethod_spec : ruleMethod_spec EOF ;
    public final void entryRuleMethod_spec() throws RecognitionException {
        try {
            // InternalGo.g:747:1: ( ruleMethod_spec EOF )
            // InternalGo.g:748:1: ruleMethod_spec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_specRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_specRule()); 
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
    // $ANTLR end "entryRuleMethod_spec"


    // $ANTLR start "ruleMethod_spec"
    // InternalGo.g:755:1: ruleMethod_spec : ( ( rule__Method_spec__Alternatives ) ) ;
    public final void ruleMethod_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:759:2: ( ( ( rule__Method_spec__Alternatives ) ) )
            // InternalGo.g:760:2: ( ( rule__Method_spec__Alternatives ) )
            {
            // InternalGo.g:760:2: ( ( rule__Method_spec__Alternatives ) )
            // InternalGo.g:761:3: ( rule__Method_spec__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_specAccess().getAlternatives()); 
            }
            // InternalGo.g:762:3: ( rule__Method_spec__Alternatives )
            // InternalGo.g:762:4: rule__Method_spec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method_spec__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_specAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMethod_spec"


    // $ANTLR start "entryRuleSlice_type"
    // InternalGo.g:771:1: entryRuleSlice_type : ruleSlice_type EOF ;
    public final void entryRuleSlice_type() throws RecognitionException {
        try {
            // InternalGo.g:772:1: ( ruleSlice_type EOF )
            // InternalGo.g:773:1: ruleSlice_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlice_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSlice_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlice_typeRule()); 
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
    // $ANTLR end "entryRuleSlice_type"


    // $ANTLR start "ruleSlice_type"
    // InternalGo.g:780:1: ruleSlice_type : ( ( rule__Slice_type__Group__0 ) ) ;
    public final void ruleSlice_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:784:2: ( ( ( rule__Slice_type__Group__0 ) ) )
            // InternalGo.g:785:2: ( ( rule__Slice_type__Group__0 ) )
            {
            // InternalGo.g:785:2: ( ( rule__Slice_type__Group__0 ) )
            // InternalGo.g:786:3: ( rule__Slice_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlice_typeAccess().getGroup()); 
            }
            // InternalGo.g:787:3: ( rule__Slice_type__Group__0 )
            // InternalGo.g:787:4: rule__Slice_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slice_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlice_typeAccess().getGroup()); 
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
    // $ANTLR end "ruleSlice_type"


    // $ANTLR start "entryRuleMap_type"
    // InternalGo.g:796:1: entryRuleMap_type : ruleMap_type EOF ;
    public final void entryRuleMap_type() throws RecognitionException {
        try {
            // InternalGo.g:797:1: ( ruleMap_type EOF )
            // InternalGo.g:798:1: ruleMap_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMap_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMap_typeRule()); 
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
    // $ANTLR end "entryRuleMap_type"


    // $ANTLR start "ruleMap_type"
    // InternalGo.g:805:1: ruleMap_type : ( ( rule__Map_type__Group__0 ) ) ;
    public final void ruleMap_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:809:2: ( ( ( rule__Map_type__Group__0 ) ) )
            // InternalGo.g:810:2: ( ( rule__Map_type__Group__0 ) )
            {
            // InternalGo.g:810:2: ( ( rule__Map_type__Group__0 ) )
            // InternalGo.g:811:3: ( rule__Map_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeAccess().getGroup()); 
            }
            // InternalGo.g:812:3: ( rule__Map_type__Group__0 )
            // InternalGo.g:812:4: rule__Map_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Map_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMap_typeAccess().getGroup()); 
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
    // $ANTLR end "ruleMap_type"


    // $ANTLR start "entryRuleChannel_type"
    // InternalGo.g:821:1: entryRuleChannel_type : ruleChannel_type EOF ;
    public final void entryRuleChannel_type() throws RecognitionException {
        try {
            // InternalGo.g:822:1: ( ruleChannel_type EOF )
            // InternalGo.g:823:1: ruleChannel_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannel_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChannel_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannel_typeRule()); 
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
    // $ANTLR end "entryRuleChannel_type"


    // $ANTLR start "ruleChannel_type"
    // InternalGo.g:830:1: ruleChannel_type : ( ( rule__Channel_type__Group__0 ) ) ;
    public final void ruleChannel_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:834:2: ( ( ( rule__Channel_type__Group__0 ) ) )
            // InternalGo.g:835:2: ( ( rule__Channel_type__Group__0 ) )
            {
            // InternalGo.g:835:2: ( ( rule__Channel_type__Group__0 ) )
            // InternalGo.g:836:3: ( rule__Channel_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannel_typeAccess().getGroup()); 
            }
            // InternalGo.g:837:3: ( rule__Channel_type__Group__0 )
            // InternalGo.g:837:4: rule__Channel_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Channel_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannel_typeAccess().getGroup()); 
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
    // $ANTLR end "ruleChannel_type"


    // $ANTLR start "entryRuleBlock"
    // InternalGo.g:846:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalGo.g:847:1: ( ruleBlock EOF )
            // InternalGo.g:848:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalGo.g:855:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:859:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalGo.g:860:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalGo.g:860:2: ( ( rule__Block__Group__0 ) )
            // InternalGo.g:861:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalGo.g:862:3: ( rule__Block__Group__0 )
            // InternalGo.g:862:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement_list"
    // InternalGo.g:871:1: entryRuleStatement_list : ruleStatement_list EOF ;
    public final void entryRuleStatement_list() throws RecognitionException {
        try {
            // InternalGo.g:872:1: ( ruleStatement_list EOF )
            // InternalGo.g:873:1: ruleStatement_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_listRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_listRule()); 
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
    // $ANTLR end "entryRuleStatement_list"


    // $ANTLR start "ruleStatement_list"
    // InternalGo.g:880:1: ruleStatement_list : ( ( rule__Statement_list__Group__0 )* ) ;
    public final void ruleStatement_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:884:2: ( ( ( rule__Statement_list__Group__0 )* ) )
            // InternalGo.g:885:2: ( ( rule__Statement_list__Group__0 )* )
            {
            // InternalGo.g:885:2: ( ( rule__Statement_list__Group__0 )* )
            // InternalGo.g:886:3: ( rule__Statement_list__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_listAccess().getGroup()); 
            }
            // InternalGo.g:887:3: ( rule__Statement_list__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==35||LA1_0==64) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:887:4: rule__Statement_list__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Statement_list__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_listAccess().getGroup()); 
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
    // $ANTLR end "ruleStatement_list"


    // $ANTLR start "entryRuleDeclaration"
    // InternalGo.g:896:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalGo.g:897:1: ( ruleDeclaration EOF )
            // InternalGo.g:898:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalGo.g:905:1: ruleDeclaration : ( ruleConst_decl ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:909:2: ( ( ruleConst_decl ) )
            // InternalGo.g:910:2: ( ruleConst_decl )
            {
            // InternalGo.g:910:2: ( ruleConst_decl )
            // InternalGo.g:911:3: ruleConst_decl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getConst_declParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleConst_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getConst_declParserRuleCall()); 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleConst_decl"
    // InternalGo.g:921:1: entryRuleConst_decl : ruleConst_decl EOF ;
    public final void entryRuleConst_decl() throws RecognitionException {
        try {
            // InternalGo.g:922:1: ( ruleConst_decl EOF )
            // InternalGo.g:923:1: ruleConst_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConst_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declRule()); 
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
    // $ANTLR end "entryRuleConst_decl"


    // $ANTLR start "ruleConst_decl"
    // InternalGo.g:930:1: ruleConst_decl : ( ( rule__Const_decl__Alternatives ) ) ;
    public final void ruleConst_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:934:2: ( ( ( rule__Const_decl__Alternatives ) ) )
            // InternalGo.g:935:2: ( ( rule__Const_decl__Alternatives ) )
            {
            // InternalGo.g:935:2: ( ( rule__Const_decl__Alternatives ) )
            // InternalGo.g:936:3: ( rule__Const_decl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getAlternatives()); 
            }
            // InternalGo.g:937:3: ( rule__Const_decl__Alternatives )
            // InternalGo.g:937:4: rule__Const_decl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Const_decl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getAlternatives()); 
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
    // $ANTLR end "ruleConst_decl"


    // $ANTLR start "entryRuleConst_spec"
    // InternalGo.g:946:1: entryRuleConst_spec : ruleConst_spec EOF ;
    public final void entryRuleConst_spec() throws RecognitionException {
        try {
            // InternalGo.g:947:1: ( ruleConst_spec EOF )
            // InternalGo.g:948:1: ruleConst_spec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConst_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_specRule()); 
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
    // $ANTLR end "entryRuleConst_spec"


    // $ANTLR start "ruleConst_spec"
    // InternalGo.g:955:1: ruleConst_spec : ( ( rule__Const_spec__Group__0 ) ) ;
    public final void ruleConst_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:959:2: ( ( ( rule__Const_spec__Group__0 ) ) )
            // InternalGo.g:960:2: ( ( rule__Const_spec__Group__0 ) )
            {
            // InternalGo.g:960:2: ( ( rule__Const_spec__Group__0 ) )
            // InternalGo.g:961:3: ( rule__Const_spec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getGroup()); 
            }
            // InternalGo.g:962:3: ( rule__Const_spec__Group__0 )
            // InternalGo.g:962:4: rule__Const_spec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Const_spec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_specAccess().getGroup()); 
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
    // $ANTLR end "ruleConst_spec"


    // $ANTLR start "entryRuleExpression_list"
    // InternalGo.g:971:1: entryRuleExpression_list : ruleExpression_list EOF ;
    public final void entryRuleExpression_list() throws RecognitionException {
        try {
            // InternalGo.g:972:1: ( ruleExpression_list EOF )
            // InternalGo.g:973:1: ruleExpression_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listRule()); 
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
    // $ANTLR end "entryRuleExpression_list"


    // $ANTLR start "ruleExpression_list"
    // InternalGo.g:980:1: ruleExpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleExpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:984:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalGo.g:985:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalGo.g:985:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalGo.g:986:3: ( rule__Expression_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup()); 
            }
            // InternalGo.g:987:3: ( rule__Expression_list__Group__0 )
            // InternalGo.g:987:4: rule__Expression_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getGroup()); 
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
    // $ANTLR end "ruleExpression_list"


    // $ANTLR start "entryRuleFunction_decl"
    // InternalGo.g:996:1: entryRuleFunction_decl : ruleFunction_decl EOF ;
    public final void entryRuleFunction_decl() throws RecognitionException {
        try {
            // InternalGo.g:997:1: ( ruleFunction_decl EOF )
            // InternalGo.g:998:1: ruleFunction_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunction_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declRule()); 
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
    // $ANTLR end "entryRuleFunction_decl"


    // $ANTLR start "ruleFunction_decl"
    // InternalGo.g:1005:1: ruleFunction_decl : ( ( rule__Function_decl__Group__0 ) ) ;
    public final void ruleFunction_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1009:2: ( ( ( rule__Function_decl__Group__0 ) ) )
            // InternalGo.g:1010:2: ( ( rule__Function_decl__Group__0 ) )
            {
            // InternalGo.g:1010:2: ( ( rule__Function_decl__Group__0 ) )
            // InternalGo.g:1011:3: ( rule__Function_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getGroup()); 
            }
            // InternalGo.g:1012:3: ( rule__Function_decl__Group__0 )
            // InternalGo.g:1012:4: rule__Function_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declAccess().getGroup()); 
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
    // $ANTLR end "ruleFunction_decl"


    // $ANTLR start "entryRuleFunction_body"
    // InternalGo.g:1021:1: entryRuleFunction_body : ruleFunction_body EOF ;
    public final void entryRuleFunction_body() throws RecognitionException {
        try {
            // InternalGo.g:1022:1: ( ruleFunction_body EOF )
            // InternalGo.g:1023:1: ruleFunction_body EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_bodyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunction_body();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_bodyRule()); 
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
    // $ANTLR end "entryRuleFunction_body"


    // $ANTLR start "ruleFunction_body"
    // InternalGo.g:1030:1: ruleFunction_body : ( ruleBlock ) ;
    public final void ruleFunction_body() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1034:2: ( ( ruleBlock ) )
            // InternalGo.g:1035:2: ( ruleBlock )
            {
            // InternalGo.g:1035:2: ( ruleBlock )
            // InternalGo.g:1036:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_bodyAccess().getBlockParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_bodyAccess().getBlockParserRuleCall()); 
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
    // $ANTLR end "ruleFunction_body"


    // $ANTLR start "entryRuleOperand"
    // InternalGo.g:1046:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalGo.g:1047:1: ( ruleOperand EOF )
            // InternalGo.g:1048:1: ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandRule()); 
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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalGo.g:1055:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1059:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalGo.g:1060:2: ( ( rule__Operand__Alternatives ) )
            {
            // InternalGo.g:1060:2: ( ( rule__Operand__Alternatives ) )
            // InternalGo.g:1061:3: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // InternalGo.g:1062:3: ( rule__Operand__Alternatives )
            // InternalGo.g:1062:4: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operand__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleOperand_name"
    // InternalGo.g:1071:1: entryRuleOperand_name : ruleOperand_name EOF ;
    public final void entryRuleOperand_name() throws RecognitionException {
        try {
            // InternalGo.g:1072:1: ( ruleOperand_name EOF )
            // InternalGo.g:1073:1: ruleOperand_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperand_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperand_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperand_nameRule()); 
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
    // $ANTLR end "entryRuleOperand_name"


    // $ANTLR start "ruleOperand_name"
    // InternalGo.g:1080:1: ruleOperand_name : ( ( rule__Operand_name__Alternatives ) ) ;
    public final void ruleOperand_name() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1084:2: ( ( ( rule__Operand_name__Alternatives ) ) )
            // InternalGo.g:1085:2: ( ( rule__Operand_name__Alternatives ) )
            {
            // InternalGo.g:1085:2: ( ( rule__Operand_name__Alternatives ) )
            // InternalGo.g:1086:3: ( rule__Operand_name__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperand_nameAccess().getAlternatives()); 
            }
            // InternalGo.g:1087:3: ( rule__Operand_name__Alternatives )
            // InternalGo.g:1087:4: rule__Operand_name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operand_name__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperand_nameAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOperand_name"


    // $ANTLR start "entryRuleQualified_ident"
    // InternalGo.g:1096:1: entryRuleQualified_ident : ruleQualified_ident EOF ;
    public final void entryRuleQualified_ident() throws RecognitionException {
        try {
            // InternalGo.g:1097:1: ( ruleQualified_ident EOF )
            // InternalGo.g:1098:1: ruleQualified_ident EOF
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
    // InternalGo.g:1105:1: ruleQualified_ident : ( ( rule__Qualified_ident__Group__0 ) ) ;
    public final void ruleQualified_ident() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1109:2: ( ( ( rule__Qualified_ident__Group__0 ) ) )
            // InternalGo.g:1110:2: ( ( rule__Qualified_ident__Group__0 ) )
            {
            // InternalGo.g:1110:2: ( ( rule__Qualified_ident__Group__0 ) )
            // InternalGo.g:1111:3: ( rule__Qualified_ident__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualified_identAccess().getGroup()); 
            }
            // InternalGo.g:1112:3: ( rule__Qualified_ident__Group__0 )
            // InternalGo.g:1112:4: rule__Qualified_ident__Group__0
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


    // $ANTLR start "entryRulePrimary_expr"
    // InternalGo.g:1121:1: entryRulePrimary_expr : rulePrimary_expr EOF ;
    public final void entryRulePrimary_expr() throws RecognitionException {
        try {
            // InternalGo.g:1122:1: ( rulePrimary_expr EOF )
            // InternalGo.g:1123:1: rulePrimary_expr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprRule()); 
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
    // $ANTLR end "entryRulePrimary_expr"


    // $ANTLR start "rulePrimary_expr"
    // InternalGo.g:1130:1: rulePrimary_expr : ( ruleOperand ) ;
    public final void rulePrimary_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1134:2: ( ( ruleOperand ) )
            // InternalGo.g:1135:2: ( ruleOperand )
            {
            // InternalGo.g:1135:2: ( ruleOperand )
            // InternalGo.g:1136:3: ruleOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getOperandParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getOperandParserRuleCall()); 
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
    // $ANTLR end "rulePrimary_expr"


    // $ANTLR start "entryRuleExpression"
    // InternalGo.g:1146:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGo.g:1147:1: ( ruleExpression EOF )
            // InternalGo.g:1148:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGo.g:1155:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1159:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalGo.g:1160:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalGo.g:1160:2: ( ( rule__Expression__Group__0 ) )
            // InternalGo.g:1161:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalGo.g:1162:3: ( rule__Expression__Group__0 )
            // InternalGo.g:1162:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_line"
    // InternalGo.g:1171:1: entryRuleExpression_line : ruleExpression_line EOF ;
    public final void entryRuleExpression_line() throws RecognitionException {
        try {
            // InternalGo.g:1172:1: ( ruleExpression_line EOF )
            // InternalGo.g:1173:1: ruleExpression_line EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_lineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression_line();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_lineRule()); 
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
    // $ANTLR end "entryRuleExpression_line"


    // $ANTLR start "ruleExpression_line"
    // InternalGo.g:1180:1: ruleExpression_line : ( ( rule__Expression_line__Group__0 ) ) ;
    public final void ruleExpression_line() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1184:2: ( ( ( rule__Expression_line__Group__0 ) ) )
            // InternalGo.g:1185:2: ( ( rule__Expression_line__Group__0 ) )
            {
            // InternalGo.g:1185:2: ( ( rule__Expression_line__Group__0 ) )
            // InternalGo.g:1186:3: ( rule__Expression_line__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_lineAccess().getGroup()); 
            }
            // InternalGo.g:1187:3: ( rule__Expression_line__Group__0 )
            // InternalGo.g:1187:4: rule__Expression_line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_line__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_lineAccess().getGroup()); 
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
    // $ANTLR end "ruleExpression_line"


    // $ANTLR start "entryRuleUnary_expr"
    // InternalGo.g:1196:1: entryRuleUnary_expr : ruleUnary_expr EOF ;
    public final void entryRuleUnary_expr() throws RecognitionException {
        try {
            // InternalGo.g:1197:1: ( ruleUnary_expr EOF )
            // InternalGo.g:1198:1: ruleUnary_expr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnary_exprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnary_exprRule()); 
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
    // $ANTLR end "entryRuleUnary_expr"


    // $ANTLR start "ruleUnary_expr"
    // InternalGo.g:1205:1: ruleUnary_expr : ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) ) ;
    public final void ruleUnary_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1209:2: ( ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) ) )
            // InternalGo.g:1210:2: ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) )
            {
            // InternalGo.g:1210:2: ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) )
            // InternalGo.g:1211:3: ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* )
            {
            // InternalGo.g:1211:3: ( ( rule__Unary_expr__Alternatives ) )
            // InternalGo.g:1212:4: ( rule__Unary_expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnary_exprAccess().getAlternatives()); 
            }
            // InternalGo.g:1213:4: ( rule__Unary_expr__Alternatives )
            // InternalGo.g:1213:5: rule__Unary_expr__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__Unary_expr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnary_exprAccess().getAlternatives()); 
            }

            }

            // InternalGo.g:1216:3: ( ( rule__Unary_expr__Alternatives )* )
            // InternalGo.g:1217:4: ( rule__Unary_expr__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnary_exprAccess().getAlternatives()); 
            }
            // InternalGo.g:1218:4: ( rule__Unary_expr__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_HEX_LIT)||(LA2_0>=RULE_RAW_STRING_LIT && LA2_0<=RULE_UNARY_OP)||LA2_0==35||(LA2_0>=57 && LA2_0<=58)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGo.g:1218:5: rule__Unary_expr__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Unary_expr__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnary_exprAccess().getAlternatives()); 
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
    // $ANTLR end "ruleUnary_expr"


    // $ANTLR start "entryRuleStatement"
    // InternalGo.g:1228:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalGo.g:1229:1: ( ruleStatement EOF )
            // InternalGo.g:1230:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGo.g:1237:1: ruleStatement : ( ruleDeclaration ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1241:2: ( ( ruleDeclaration ) )
            // InternalGo.g:1242:2: ( ruleDeclaration )
            {
            // InternalGo.g:1242:2: ( ruleDeclaration )
            // InternalGo.g:1243:3: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDeclarationParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDeclarationParserRuleCall()); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePackage_clause"
    // InternalGo.g:1253:1: entryRulePackage_clause : rulePackage_clause EOF ;
    public final void entryRulePackage_clause() throws RecognitionException {
        try {
            // InternalGo.g:1254:1: ( rulePackage_clause EOF )
            // InternalGo.g:1255:1: rulePackage_clause EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackage_clause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_clauseRule()); 
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
    // $ANTLR end "entryRulePackage_clause"


    // $ANTLR start "rulePackage_clause"
    // InternalGo.g:1262:1: rulePackage_clause : ( ( rule__Package_clause__Group__0 ) ) ;
    public final void rulePackage_clause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1266:2: ( ( ( rule__Package_clause__Group__0 ) ) )
            // InternalGo.g:1267:2: ( ( rule__Package_clause__Group__0 ) )
            {
            // InternalGo.g:1267:2: ( ( rule__Package_clause__Group__0 ) )
            // InternalGo.g:1268:3: ( rule__Package_clause__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseAccess().getGroup()); 
            }
            // InternalGo.g:1269:3: ( rule__Package_clause__Group__0 )
            // InternalGo.g:1269:4: rule__Package_clause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package_clause__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_clauseAccess().getGroup()); 
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
    // $ANTLR end "rulePackage_clause"


    // $ANTLR start "entryRuleImport_decl"
    // InternalGo.g:1278:1: entryRuleImport_decl : ruleImport_decl EOF ;
    public final void entryRuleImport_decl() throws RecognitionException {
        try {
            // InternalGo.g:1279:1: ( ruleImport_decl EOF )
            // InternalGo.g:1280:1: ruleImport_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declRule()); 
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
    // $ANTLR end "entryRuleImport_decl"


    // $ANTLR start "ruleImport_decl"
    // InternalGo.g:1287:1: ruleImport_decl : ( ( rule__Import_decl__Group__0 ) ) ;
    public final void ruleImport_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1291:2: ( ( ( rule__Import_decl__Group__0 ) ) )
            // InternalGo.g:1292:2: ( ( rule__Import_decl__Group__0 ) )
            {
            // InternalGo.g:1292:2: ( ( rule__Import_decl__Group__0 ) )
            // InternalGo.g:1293:3: ( rule__Import_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getGroup()); 
            }
            // InternalGo.g:1294:3: ( rule__Import_decl__Group__0 )
            // InternalGo.g:1294:4: rule__Import_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getGroup()); 
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
    // $ANTLR end "ruleImport_decl"


    // $ANTLR start "entryRuleImport_spec"
    // InternalGo.g:1303:1: entryRuleImport_spec : ruleImport_spec EOF ;
    public final void entryRuleImport_spec() throws RecognitionException {
        try {
            // InternalGo.g:1304:1: ( ruleImport_spec EOF )
            // InternalGo.g:1305:1: ruleImport_spec EOF
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
    // InternalGo.g:1312:1: ruleImport_spec : ( ( rule__Import_spec__Group__0 ) ) ;
    public final void ruleImport_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1316:2: ( ( ( rule__Import_spec__Group__0 ) ) )
            // InternalGo.g:1317:2: ( ( rule__Import_spec__Group__0 ) )
            {
            // InternalGo.g:1317:2: ( ( rule__Import_spec__Group__0 ) )
            // InternalGo.g:1318:3: ( rule__Import_spec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getGroup()); 
            }
            // InternalGo.g:1319:3: ( rule__Import_spec__Group__0 )
            // InternalGo.g:1319:4: rule__Import_spec__Group__0
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
    // InternalGo.g:1328:1: entryRuleImport_path : ruleImport_path EOF ;
    public final void entryRuleImport_path() throws RecognitionException {
        try {
            // InternalGo.g:1329:1: ( ruleImport_path EOF )
            // InternalGo.g:1330:1: ruleImport_path EOF
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
    // InternalGo.g:1337:1: ruleImport_path : ( ruleString_lit ) ;
    public final void ruleImport_path() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1341:2: ( ( ruleString_lit ) )
            // InternalGo.g:1342:2: ( ruleString_lit )
            {
            // InternalGo.g:1342:2: ( ruleString_lit )
            // InternalGo.g:1343:3: ruleString_lit
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


    // $ANTLR start "rule__Program__Alternatives"
    // InternalGo.g:1352:1: rule__Program__Alternatives : ( ( ruleImport_decl ) | ( rulePackage_clause ) | ( ruleFunction_decl ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1356:1: ( ( ruleImport_decl ) | ( rulePackage_clause ) | ( ruleFunction_decl ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt3=1;
                }
                break;
            case 65:
                {
                alt3=2;
                }
                break;
            case 61:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:1357:2: ( ruleImport_decl )
                    {
                    // InternalGo.g:1357:2: ( ruleImport_decl )
                    // InternalGo.g:1358:3: ruleImport_decl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getImport_declParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleImport_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getImport_declParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1363:2: ( rulePackage_clause )
                    {
                    // InternalGo.g:1363:2: ( rulePackage_clause )
                    // InternalGo.g:1364:3: rulePackage_clause
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getPackage_clauseParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePackage_clause();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getPackage_clauseParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1369:2: ( ruleFunction_decl )
                    {
                    // InternalGo.g:1369:2: ( ruleFunction_decl )
                    // InternalGo.g:1370:3: ruleFunction_decl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getFunction_declParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunction_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getFunction_declParserRuleCall_2()); 
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
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__OPERATORS__Alternatives"
    // InternalGo.g:1379:1: rule__OPERATORS__Alternatives : ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) );
    public final void rule__OPERATORS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1383:1: ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) )
            int alt4=17;
            switch ( input.LA(1) ) {
            case RULE_BINARY_OP:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            case 37:
                {
                alt4=4;
                }
                break;
            case 38:
                {
                alt4=5;
                }
                break;
            case 39:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            case 41:
                {
                alt4=8;
                }
                break;
            case 42:
                {
                alt4=9;
                }
                break;
            case 43:
                {
                alt4=10;
                }
                break;
            case 44:
                {
                alt4=11;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt4=12;
                }
                break;
            case 45:
                {
                alt4=13;
                }
                break;
            case 46:
                {
                alt4=14;
                }
                break;
            case 47:
                {
                alt4=15;
                }
                break;
            case 48:
                {
                alt4=16;
                }
                break;
            case RULE_ASSIGN_OP:
                {
                alt4=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:1384:2: ( RULE_BINARY_OP )
                    {
                    // InternalGo.g:1384:2: ( RULE_BINARY_OP )
                    // InternalGo.g:1385:3: RULE_BINARY_OP
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
                    // InternalGo.g:1390:2: ( '(' )
                    {
                    // InternalGo.g:1390:2: ( '(' )
                    // InternalGo.g:1391:3: '('
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
                    // InternalGo.g:1396:2: ( ')' )
                    {
                    // InternalGo.g:1396:2: ( ')' )
                    // InternalGo.g:1397:3: ')'
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
                    // InternalGo.g:1402:2: ( '[' )
                    {
                    // InternalGo.g:1402:2: ( '[' )
                    // InternalGo.g:1403:3: '['
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
                    // InternalGo.g:1408:2: ( ']' )
                    {
                    // InternalGo.g:1408:2: ( ']' )
                    // InternalGo.g:1409:3: ']'
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
                    // InternalGo.g:1414:2: ( '{' )
                    {
                    // InternalGo.g:1414:2: ( '{' )
                    // InternalGo.g:1415:3: '{'
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
                    // InternalGo.g:1420:2: ( '}' )
                    {
                    // InternalGo.g:1420:2: ( '}' )
                    // InternalGo.g:1421:3: '}'
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
                    // InternalGo.g:1426:2: ( '++' )
                    {
                    // InternalGo.g:1426:2: ( '++' )
                    // InternalGo.g:1427:3: '++'
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
                    // InternalGo.g:1432:2: ( '=' )
                    {
                    // InternalGo.g:1432:2: ( '=' )
                    // InternalGo.g:1433:3: '='
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
                    // InternalGo.g:1438:2: ( ':=' )
                    {
                    // InternalGo.g:1438:2: ( ':=' )
                    // InternalGo.g:1439:3: ':='
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
                    // InternalGo.g:1444:2: ( ',' )
                    {
                    // InternalGo.g:1444:2: ( ',' )
                    // InternalGo.g:1445:3: ','
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
                    // InternalGo.g:1450:2: ( RULE_SEMICOLON )
                    {
                    // InternalGo.g:1450:2: ( RULE_SEMICOLON )
                    // InternalGo.g:1451:3: RULE_SEMICOLON
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
                    // InternalGo.g:1456:2: ( '--' )
                    {
                    // InternalGo.g:1456:2: ( '--' )
                    // InternalGo.g:1457:3: '--'
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
                    // InternalGo.g:1462:2: ( '...' )
                    {
                    // InternalGo.g:1462:2: ( '...' )
                    // InternalGo.g:1463:3: '...'
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
                    // InternalGo.g:1468:2: ( '.' )
                    {
                    // InternalGo.g:1468:2: ( '.' )
                    // InternalGo.g:1469:3: '.'
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
                    // InternalGo.g:1474:2: ( ':' )
                    {
                    // InternalGo.g:1474:2: ( ':' )
                    // InternalGo.g:1475:3: ':'
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
                    // InternalGo.g:1480:2: ( RULE_ASSIGN_OP )
                    {
                    // InternalGo.g:1480:2: ( RULE_ASSIGN_OP )
                    // InternalGo.g:1481:3: RULE_ASSIGN_OP
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
    // InternalGo.g:1490:1: rule__Int_lit__Alternatives : ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) );
    public final void rule__Int_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1494:1: ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_OCTAL_LIT:
                {
                alt5=2;
                }
                break;
            case RULE_HEX_LIT:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:1495:2: ( RULE_INT )
                    {
                    // InternalGo.g:1495:2: ( RULE_INT )
                    // InternalGo.g:1496:3: RULE_INT
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
                    // InternalGo.g:1501:2: ( RULE_OCTAL_LIT )
                    {
                    // InternalGo.g:1501:2: ( RULE_OCTAL_LIT )
                    // InternalGo.g:1502:3: RULE_OCTAL_LIT
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
                    // InternalGo.g:1507:2: ( RULE_HEX_LIT )
                    {
                    // InternalGo.g:1507:2: ( RULE_HEX_LIT )
                    // InternalGo.g:1508:3: RULE_HEX_LIT
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
    // InternalGo.g:1517:1: rule__Float_lit__Alternatives_1 : ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) );
    public final void rule__Float_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1521:1: ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=49 && LA6_0<=50)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:1522:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    {
                    // InternalGo.g:1522:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    // InternalGo.g:1523:3: ( rule__Float_lit__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloat_litAccess().getGroup_1_0()); 
                    }
                    // InternalGo.g:1524:3: ( rule__Float_lit__Group_1_0__0 )
                    // InternalGo.g:1524:4: rule__Float_lit__Group_1_0__0
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
                    // InternalGo.g:1528:2: ( ruleExponent )
                    {
                    // InternalGo.g:1528:2: ( ruleExponent )
                    // InternalGo.g:1529:3: ruleExponent
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
    // InternalGo.g:1538:1: rule__Exponent__Alternatives_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Exponent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1542:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==49) ) {
                alt7=1;
            }
            else if ( (LA7_0==50) ) {
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
                    // InternalGo.g:1543:2: ( 'E' )
                    {
                    // InternalGo.g:1543:2: ( 'E' )
                    // InternalGo.g:1544:3: 'E'
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
                    // InternalGo.g:1549:2: ( 'e' )
                    {
                    // InternalGo.g:1549:2: ( 'e' )
                    // InternalGo.g:1550:3: 'e'
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
    // InternalGo.g:1559:1: rule__Exponent__Alternatives_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Exponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1563:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==51) ) {
                alt8=1;
            }
            else if ( (LA8_0==52) ) {
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
                    // InternalGo.g:1564:2: ( '+' )
                    {
                    // InternalGo.g:1564:2: ( '+' )
                    // InternalGo.g:1565:3: '+'
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
                    // InternalGo.g:1570:2: ( '-' )
                    {
                    // InternalGo.g:1570:2: ( '-' )
                    // InternalGo.g:1571:3: '-'
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
    // InternalGo.g:1580:1: rule__Imaginary_lit__Alternatives_0 : ( ( RULE_INT ) | ( ruleFloat_lit ) );
    public final void rule__Imaginary_lit__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1584:1: ( ( RULE_INT ) | ( ruleFloat_lit ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==47||(LA9_1>=49 && LA9_1<=50)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==56) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:1585:2: ( RULE_INT )
                    {
                    // InternalGo.g:1585:2: ( RULE_INT )
                    // InternalGo.g:1586:3: RULE_INT
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
                    // InternalGo.g:1591:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:1591:2: ( ruleFloat_lit )
                    // InternalGo.g:1592:3: ruleFloat_lit
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
    // InternalGo.g:1601:1: rule__Rune_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Rune_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1605:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
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
                    // InternalGo.g:1606:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:1606:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:1607:3: RULE_UNICODE_VALUE
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
                    // InternalGo.g:1612:2: ( ruleByte_value )
                    {
                    // InternalGo.g:1612:2: ( ruleByte_value )
                    // InternalGo.g:1613:3: ruleByte_value
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
    // InternalGo.g:1622:1: rule__Byte_value__Alternatives : ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) );
    public final void rule__Byte_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1626:1: ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OCTAL_BYTE_VALUE) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_HEX_BYTE_VALUE) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:1627:2: ( RULE_OCTAL_BYTE_VALUE )
                    {
                    // InternalGo.g:1627:2: ( RULE_OCTAL_BYTE_VALUE )
                    // InternalGo.g:1628:3: RULE_OCTAL_BYTE_VALUE
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
                    // InternalGo.g:1633:2: ( RULE_HEX_BYTE_VALUE )
                    {
                    // InternalGo.g:1633:2: ( RULE_HEX_BYTE_VALUE )
                    // InternalGo.g:1634:3: RULE_HEX_BYTE_VALUE
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
    // InternalGo.g:1643:1: rule__String_lit__Alternatives : ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) );
    public final void rule__String_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1647:1: ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_RAW_STRING_LIT) ) {
                alt12=1;
            }
            else if ( (LA12_0==58) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:1648:2: ( RULE_RAW_STRING_LIT )
                    {
                    // InternalGo.g:1648:2: ( RULE_RAW_STRING_LIT )
                    // InternalGo.g:1649:3: RULE_RAW_STRING_LIT
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
                    // InternalGo.g:1654:2: ( ruleInterpreted_string_lit )
                    {
                    // InternalGo.g:1654:2: ( ruleInterpreted_string_lit )
                    // InternalGo.g:1655:3: ruleInterpreted_string_lit
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
    // InternalGo.g:1664:1: rule__Interpreted_string_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Interpreted_string_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1668:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_UNICODE_VALUE) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_OCTAL_BYTE_VALUE && LA13_0<=RULE_HEX_BYTE_VALUE)) ) {
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
                    // InternalGo.g:1669:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:1669:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:1670:3: RULE_UNICODE_VALUE
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
                    // InternalGo.g:1675:2: ( ruleByte_value )
                    {
                    // InternalGo.g:1675:2: ( ruleByte_value )
                    // InternalGo.g:1676:3: ruleByte_value
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
    // InternalGo.g:1685:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );
    public final void rule__Literals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1689:1: ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) )
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1690:2: ( ruleInt_lit )
                    {
                    // InternalGo.g:1690:2: ( ruleInt_lit )
                    // InternalGo.g:1691:3: ruleInt_lit
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
                    // InternalGo.g:1696:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:1696:2: ( ruleFloat_lit )
                    // InternalGo.g:1697:3: ruleFloat_lit
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
                    // InternalGo.g:1702:2: ( ruleImaginary_lit )
                    {
                    // InternalGo.g:1702:2: ( ruleImaginary_lit )
                    // InternalGo.g:1703:3: ruleImaginary_lit
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
                    // InternalGo.g:1708:2: ( ruleRune_lit )
                    {
                    // InternalGo.g:1708:2: ( ruleRune_lit )
                    // InternalGo.g:1709:3: ruleRune_lit
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
                    // InternalGo.g:1714:2: ( ruleString_lit )
                    {
                    // InternalGo.g:1714:2: ( ruleString_lit )
                    // InternalGo.g:1715:3: ruleString_lit
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGo.g:1724:1: rule__Type__Alternatives : ( ( ruleType_name ) | ( ruleType_lit ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1728:1: ( ( ruleType_name ) | ( ruleType_lit ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt15=1;
                }
                break;
            case 37:
            case 53:
            case 54:
            case 55:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalGo.g:1729:2: ( ruleType_name )
                    {
                    // InternalGo.g:1729:2: ( ruleType_name )
                    // InternalGo.g:1730:3: ruleType_name
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getType_nameParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleType_name();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getType_nameParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1735:2: ( ruleType_lit )
                    {
                    // InternalGo.g:1735:2: ( ruleType_lit )
                    // InternalGo.g:1736:3: ruleType_lit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getType_litParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleType_lit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getType_litParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1741:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalGo.g:1741:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalGo.g:1742:3: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // InternalGo.g:1743:3: ( rule__Type__Group_2__0 )
                    // InternalGo.g:1743:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Type_name__Alternatives"
    // InternalGo.g:1751:1: rule__Type_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Type_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1755:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENTIFIER) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==47) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EOF||LA16_1==RULE_SEMICOLON||(LA16_1>=RULE_RAW_STRING_LIT && LA16_1<=RULE_IDENTIFIER)||(LA16_1>=35 && LA16_1<=39)||LA16_1==42||LA16_1==44||(LA16_1>=53 && LA16_1<=55)||(LA16_1>=58 && LA16_1<=63)) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1756:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:1756:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:1757:3: RULE_IDENTIFIER
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
                    // InternalGo.g:1762:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:1762:2: ( ruleQualified_ident )
                    // InternalGo.g:1763:3: ruleQualified_ident
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


    // $ANTLR start "rule__Type_lit__Alternatives"
    // InternalGo.g:1772:1: rule__Type_lit__Alternatives : ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) );
    public final void rule__Type_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1776:1: ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1777:2: ( ruleArray_type )
                    {
                    // InternalGo.g:1777:2: ( ruleArray_type )
                    // InternalGo.g:1778:3: ruleArray_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getArray_typeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArray_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getArray_typeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1783:2: ( ruleStruct_type )
                    {
                    // InternalGo.g:1783:2: ( ruleStruct_type )
                    // InternalGo.g:1784:3: ruleStruct_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getStruct_typeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStruct_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getStruct_typeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1789:2: ( rulePointer_type )
                    {
                    // InternalGo.g:1789:2: ( rulePointer_type )
                    // InternalGo.g:1790:3: rulePointer_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getPointer_typeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePointer_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getPointer_typeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1795:2: ( ruleFunction_type )
                    {
                    // InternalGo.g:1795:2: ( ruleFunction_type )
                    // InternalGo.g:1796:3: ruleFunction_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getFunction_typeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunction_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getFunction_typeParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1801:2: ( ruleSlice_type )
                    {
                    // InternalGo.g:1801:2: ( ruleSlice_type )
                    // InternalGo.g:1802:3: ruleSlice_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getSlice_typeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSlice_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getSlice_typeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:1807:2: ( ruleMap_type )
                    {
                    // InternalGo.g:1807:2: ( ruleMap_type )
                    // InternalGo.g:1808:3: ruleMap_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getMap_typeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMap_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getMap_typeParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:1813:2: ( ruleInterface_type )
                    {
                    // InternalGo.g:1813:2: ( ruleInterface_type )
                    // InternalGo.g:1814:3: ruleInterface_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getInterface_typeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInterface_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getInterface_typeParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:1819:2: ( ruleChannel_type )
                    {
                    // InternalGo.g:1819:2: ( ruleChannel_type )
                    // InternalGo.g:1820:3: ruleChannel_type
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_litAccess().getChannel_typeParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChannel_type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_litAccess().getChannel_typeParserRuleCall_7()); 
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
    // $ANTLR end "rule__Type_lit__Alternatives"


    // $ANTLR start "rule__Field_decl__Alternatives_0"
    // InternalGo.g:1829:1: rule__Field_decl__Alternatives_0 : ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) );
    public final void rule__Field_decl__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1833:1: ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_IDENTIFIER) ) {
                alt18=1;
            }
            else if ( (LA18_0==60) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:1834:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    {
                    // InternalGo.g:1834:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    // InternalGo.g:1835:3: ( rule__Field_decl__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declAccess().getGroup_0_0()); 
                    }
                    // InternalGo.g:1836:3: ( rule__Field_decl__Group_0_0__0 )
                    // InternalGo.g:1836:4: rule__Field_decl__Group_0_0__0
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
                    // InternalGo.g:1840:2: ( ruleEmbedded_field )
                    {
                    // InternalGo.g:1840:2: ( ruleEmbedded_field )
                    // InternalGo.g:1841:3: ruleEmbedded_field
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


    // $ANTLR start "rule__Result__Alternatives"
    // InternalGo.g:1850:1: rule__Result__Alternatives : ( ( ruleParameters ) | ( ( ruleType ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1854:1: ( ( ruleParameters ) | ( ( ruleType ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalGo.g:1855:2: ( ruleParameters )
                    {
                    // InternalGo.g:1855:2: ( ruleParameters )
                    // InternalGo.g:1856:3: ruleParameters
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultAccess().getParametersParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameters();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getResultAccess().getParametersParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1861:2: ( ( ruleType ) )
                    {
                    // InternalGo.g:1861:2: ( ( ruleType ) )
                    // InternalGo.g:1862:3: ( ruleType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultAccess().getTypeParserRuleCall_1()); 
                    }
                    // InternalGo.g:1863:3: ( ruleType )
                    // InternalGo.g:1863:4: ruleType
                    {
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getResultAccess().getTypeParserRuleCall_1()); 
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
    // $ANTLR end "rule__Result__Alternatives"


    // $ANTLR start "rule__Method_spec__Alternatives"
    // InternalGo.g:1871:1: rule__Method_spec__Alternatives : ( ( ( rule__Method_spec__Group_0__0 ) ) | ( ruleType_name ) );
    public final void rule__Method_spec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1875:1: ( ( ( rule__Method_spec__Group_0__0 ) ) | ( ruleType_name ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==RULE_SEMICOLON||LA20_1==47) ) {
                    alt20=2;
                }
                else if ( (LA20_1==35) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:1876:2: ( ( rule__Method_spec__Group_0__0 ) )
                    {
                    // InternalGo.g:1876:2: ( ( rule__Method_spec__Group_0__0 ) )
                    // InternalGo.g:1877:3: ( rule__Method_spec__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_specAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1878:3: ( rule__Method_spec__Group_0__0 )
                    // InternalGo.g:1878:4: rule__Method_spec__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method_spec__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethod_specAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1882:2: ( ruleType_name )
                    {
                    // InternalGo.g:1882:2: ( ruleType_name )
                    // InternalGo.g:1883:3: ruleType_name
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_specAccess().getType_nameParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleType_name();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethod_specAccess().getType_nameParserRuleCall_1()); 
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
    // $ANTLR end "rule__Method_spec__Alternatives"


    // $ANTLR start "rule__Channel_type__Alternatives_0"
    // InternalGo.g:1892:1: rule__Channel_type__Alternatives_0 : ( ( 'chan' ) | ( 'chan<-' ) | ( '<-chan' ) );
    public final void rule__Channel_type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1896:1: ( ( 'chan' ) | ( 'chan<-' ) | ( '<-chan' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt21=1;
                }
                break;
            case 54:
                {
                alt21=2;
                }
                break;
            case 55:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalGo.g:1897:2: ( 'chan' )
                    {
                    // InternalGo.g:1897:2: ( 'chan' )
                    // InternalGo.g:1898:3: 'chan'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannel_typeAccess().getChanKeyword_0_0()); 
                    }
                    match(input,53,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChannel_typeAccess().getChanKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1903:2: ( 'chan<-' )
                    {
                    // InternalGo.g:1903:2: ( 'chan<-' )
                    // InternalGo.g:1904:3: 'chan<-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannel_typeAccess().getChanKeyword_0_1()); 
                    }
                    match(input,54,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChannel_typeAccess().getChanKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1909:2: ( '<-chan' )
                    {
                    // InternalGo.g:1909:2: ( '<-chan' )
                    // InternalGo.g:1910:3: '<-chan'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannel_typeAccess().getChanKeyword_0_2()); 
                    }
                    match(input,55,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChannel_typeAccess().getChanKeyword_0_2()); 
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
    // $ANTLR end "rule__Channel_type__Alternatives_0"


    // $ANTLR start "rule__Const_decl__Alternatives"
    // InternalGo.g:1919:1: rule__Const_decl__Alternatives : ( ( ( rule__Const_decl__Group_0__0 ) ) | ( ( rule__Const_decl__Group_1__0 ) ) );
    public final void rule__Const_decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1923:1: ( ( ( rule__Const_decl__Group_0__0 ) ) | ( ( rule__Const_decl__Group_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==64) ) {
                alt22=1;
            }
            else if ( (LA22_0==35) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:1924:2: ( ( rule__Const_decl__Group_0__0 ) )
                    {
                    // InternalGo.g:1924:2: ( ( rule__Const_decl__Group_0__0 ) )
                    // InternalGo.g:1925:3: ( rule__Const_decl__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_declAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1926:3: ( rule__Const_decl__Group_0__0 )
                    // InternalGo.g:1926:4: rule__Const_decl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Const_decl__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConst_declAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1930:2: ( ( rule__Const_decl__Group_1__0 ) )
                    {
                    // InternalGo.g:1930:2: ( ( rule__Const_decl__Group_1__0 ) )
                    // InternalGo.g:1931:3: ( rule__Const_decl__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_declAccess().getGroup_1()); 
                    }
                    // InternalGo.g:1932:3: ( rule__Const_decl__Group_1__0 )
                    // InternalGo.g:1932:4: rule__Const_decl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Const_decl__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConst_declAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Const_decl__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalGo.g:1940:1: rule__Operand__Alternatives : ( ( ruleLiterals ) | ( ruleOperand_name ) | ( ( rule__Operand__Group_2__0 ) ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1944:1: ( ( ruleLiterals ) | ( ruleOperand_name ) | ( ( rule__Operand__Group_2__0 ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_OCTAL_LIT:
            case RULE_HEX_LIT:
            case RULE_RAW_STRING_LIT:
            case 57:
            case 58:
                {
                alt23=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalGo.g:1945:2: ( ruleLiterals )
                    {
                    // InternalGo.g:1945:2: ( ruleLiterals )
                    // InternalGo.g:1946:3: ruleLiterals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getLiteralsParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiterals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getLiteralsParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1951:2: ( ruleOperand_name )
                    {
                    // InternalGo.g:1951:2: ( ruleOperand_name )
                    // InternalGo.g:1952:3: ruleOperand_name
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getOperand_nameParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOperand_name();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getOperand_nameParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1957:2: ( ( rule__Operand__Group_2__0 ) )
                    {
                    // InternalGo.g:1957:2: ( ( rule__Operand__Group_2__0 ) )
                    // InternalGo.g:1958:3: ( rule__Operand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getGroup_2()); 
                    }
                    // InternalGo.g:1959:3: ( rule__Operand__Group_2__0 )
                    // InternalGo.g:1959:4: rule__Operand__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operand__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__Operand_name__Alternatives"
    // InternalGo.g:1967:1: rule__Operand_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Operand_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1971:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENTIFIER) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==47) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==RULE_BINARY_OP||(LA24_1>=RULE_INT && LA24_1<=RULE_HEX_LIT)||(LA24_1>=RULE_RAW_STRING_LIT && LA24_1<=RULE_UNARY_OP)||LA24_1==35||(LA24_1>=57 && LA24_1<=58)) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1972:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:1972:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:1973:3: RULE_IDENTIFIER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperand_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                    }
                    match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperand_nameAccess().getIDENTIFIERTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1978:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:1978:2: ( ruleQualified_ident )
                    // InternalGo.g:1979:3: ruleQualified_ident
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperand_nameAccess().getQualified_identParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualified_ident();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperand_nameAccess().getQualified_identParserRuleCall_1()); 
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
    // $ANTLR end "rule__Operand_name__Alternatives"


    // $ANTLR start "rule__Unary_expr__Alternatives"
    // InternalGo.g:1988:1: rule__Unary_expr__Alternatives : ( ( rulePrimary_expr ) | ( RULE_UNARY_OP ) );
    public final void rule__Unary_expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1992:1: ( ( rulePrimary_expr ) | ( RULE_UNARY_OP ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_HEX_LIT)||(LA25_0>=RULE_RAW_STRING_LIT && LA25_0<=RULE_IDENTIFIER)||LA25_0==35||(LA25_0>=57 && LA25_0<=58)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_UNARY_OP) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:1993:2: ( rulePrimary_expr )
                    {
                    // InternalGo.g:1993:2: ( rulePrimary_expr )
                    // InternalGo.g:1994:3: rulePrimary_expr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimary_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1999:2: ( RULE_UNARY_OP )
                    {
                    // InternalGo.g:1999:2: ( RULE_UNARY_OP )
                    // InternalGo.g:2000:3: RULE_UNARY_OP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnary_exprAccess().getUNARY_OPTerminalRuleCall_1()); 
                    }
                    match(input,RULE_UNARY_OP,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnary_exprAccess().getUNARY_OPTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Unary_expr__Alternatives"


    // $ANTLR start "rule__Import_decl__Alternatives_1"
    // InternalGo.g:2009:1: rule__Import_decl__Alternatives_1 : ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) );
    public final void rule__Import_decl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2013:1: ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_RAW_STRING_LIT && LA26_0<=RULE_IDENTIFIER)||LA26_0==47||LA26_0==58) ) {
                alt26=1;
            }
            else if ( (LA26_0==35) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:2014:2: ( ruleImport_spec )
                    {
                    // InternalGo.g:2014:2: ( ruleImport_spec )
                    // InternalGo.g:2015:3: ruleImport_spec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleImport_spec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2020:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    {
                    // InternalGo.g:2020:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    // InternalGo.g:2021:3: ( rule__Import_decl__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_declAccess().getGroup_1_1()); 
                    }
                    // InternalGo.g:2022:3: ( rule__Import_decl__Group_1_1__0 )
                    // InternalGo.g:2022:4: rule__Import_decl__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import_decl__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_declAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Import_decl__Alternatives_1"


    // $ANTLR start "rule__Import_spec__Alternatives_0"
    // InternalGo.g:2030:1: rule__Import_spec__Alternatives_0 : ( ( '.' ) | ( RULE_IDENTIFIER ) );
    public final void rule__Import_spec__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2034:1: ( ( '.' ) | ( RULE_IDENTIFIER ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_IDENTIFIER) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:2035:2: ( '.' )
                    {
                    // InternalGo.g:2035:2: ( '.' )
                    // InternalGo.g:2036:3: '.'
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
                    // InternalGo.g:2041:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:2041:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:2042:3: RULE_IDENTIFIER
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
    // InternalGo.g:2051:1: rule__Float_lit__Group__0 : rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 ;
    public final void rule__Float_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2055:1: ( rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 )
            // InternalGo.g:2056:2: rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGo.g:2063:1: rule__Float_lit__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2067:1: ( ( RULE_INT ) )
            // InternalGo.g:2068:1: ( RULE_INT )
            {
            // InternalGo.g:2068:1: ( RULE_INT )
            // InternalGo.g:2069:2: RULE_INT
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
    // InternalGo.g:2078:1: rule__Float_lit__Group__1 : rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 ;
    public final void rule__Float_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2082:1: ( rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 )
            // InternalGo.g:2083:2: rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalGo.g:2090:1: rule__Float_lit__Group__1__Impl : ( ( rule__Float_lit__Alternatives_1 ) ) ;
    public final void rule__Float_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2094:1: ( ( ( rule__Float_lit__Alternatives_1 ) ) )
            // InternalGo.g:2095:1: ( ( rule__Float_lit__Alternatives_1 ) )
            {
            // InternalGo.g:2095:1: ( ( rule__Float_lit__Alternatives_1 ) )
            // InternalGo.g:2096:2: ( rule__Float_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2097:2: ( rule__Float_lit__Alternatives_1 )
            // InternalGo.g:2097:3: rule__Float_lit__Alternatives_1
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
    // InternalGo.g:2105:1: rule__Float_lit__Group__2 : rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 ;
    public final void rule__Float_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2109:1: ( rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 )
            // InternalGo.g:2110:2: rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalGo.g:2117:1: rule__Float_lit__Group__2__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2121:1: ( ( '.' ) )
            // InternalGo.g:2122:1: ( '.' )
            {
            // InternalGo.g:2122:1: ( '.' )
            // InternalGo.g:2123:2: '.'
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
    // InternalGo.g:2132:1: rule__Float_lit__Group__3 : rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 ;
    public final void rule__Float_lit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2136:1: ( rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 )
            // InternalGo.g:2137:2: rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalGo.g:2144:1: rule__Float_lit__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2148:1: ( ( RULE_INT ) )
            // InternalGo.g:2149:1: ( RULE_INT )
            {
            // InternalGo.g:2149:1: ( RULE_INT )
            // InternalGo.g:2150:2: RULE_INT
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
    // InternalGo.g:2159:1: rule__Float_lit__Group__4 : rule__Float_lit__Group__4__Impl ;
    public final void rule__Float_lit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2163:1: ( rule__Float_lit__Group__4__Impl )
            // InternalGo.g:2164:2: rule__Float_lit__Group__4__Impl
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
    // InternalGo.g:2170:1: rule__Float_lit__Group__4__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2174:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:2175:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:2175:1: ( ( ruleExponent )? )
            // InternalGo.g:2176:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4()); 
            }
            // InternalGo.g:2177:2: ( ruleExponent )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=49 && LA28_0<=50)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:2177:3: ruleExponent
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
    // InternalGo.g:2186:1: rule__Float_lit__Group_1_0__0 : rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 ;
    public final void rule__Float_lit__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2190:1: ( rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 )
            // InternalGo.g:2191:2: rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGo.g:2198:1: rule__Float_lit__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2202:1: ( ( '.' ) )
            // InternalGo.g:2203:1: ( '.' )
            {
            // InternalGo.g:2203:1: ( '.' )
            // InternalGo.g:2204:2: '.'
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
    // InternalGo.g:2213:1: rule__Float_lit__Group_1_0__1 : rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 ;
    public final void rule__Float_lit__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2217:1: ( rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 )
            // InternalGo.g:2218:2: rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGo.g:2225:1: rule__Float_lit__Group_1_0__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Float_lit__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2229:1: ( ( ( RULE_INT )? ) )
            // InternalGo.g:2230:1: ( ( RULE_INT )? )
            {
            // InternalGo.g:2230:1: ( ( RULE_INT )? )
            // InternalGo.g:2231:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1()); 
            }
            // InternalGo.g:2232:2: ( RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:2232:3: RULE_INT
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
    // InternalGo.g:2240:1: rule__Float_lit__Group_1_0__2 : rule__Float_lit__Group_1_0__2__Impl ;
    public final void rule__Float_lit__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2244:1: ( rule__Float_lit__Group_1_0__2__Impl )
            // InternalGo.g:2245:2: rule__Float_lit__Group_1_0__2__Impl
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
    // InternalGo.g:2251:1: rule__Float_lit__Group_1_0__2__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2255:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:2256:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:2256:1: ( ( ruleExponent )? )
            // InternalGo.g:2257:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2()); 
            }
            // InternalGo.g:2258:2: ( ruleExponent )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=49 && LA30_0<=50)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:2258:3: ruleExponent
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
    // InternalGo.g:2267:1: rule__Exponent__Group__0 : rule__Exponent__Group__0__Impl rule__Exponent__Group__1 ;
    public final void rule__Exponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2271:1: ( rule__Exponent__Group__0__Impl rule__Exponent__Group__1 )
            // InternalGo.g:2272:2: rule__Exponent__Group__0__Impl rule__Exponent__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGo.g:2279:1: rule__Exponent__Group__0__Impl : ( ( rule__Exponent__Alternatives_0 ) ) ;
    public final void rule__Exponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2283:1: ( ( ( rule__Exponent__Alternatives_0 ) ) )
            // InternalGo.g:2284:1: ( ( rule__Exponent__Alternatives_0 ) )
            {
            // InternalGo.g:2284:1: ( ( rule__Exponent__Alternatives_0 ) )
            // InternalGo.g:2285:2: ( rule__Exponent__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_0()); 
            }
            // InternalGo.g:2286:2: ( rule__Exponent__Alternatives_0 )
            // InternalGo.g:2286:3: rule__Exponent__Alternatives_0
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
    // InternalGo.g:2294:1: rule__Exponent__Group__1 : rule__Exponent__Group__1__Impl rule__Exponent__Group__2 ;
    public final void rule__Exponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2298:1: ( rule__Exponent__Group__1__Impl rule__Exponent__Group__2 )
            // InternalGo.g:2299:2: rule__Exponent__Group__1__Impl rule__Exponent__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGo.g:2306:1: rule__Exponent__Group__1__Impl : ( ( rule__Exponent__Alternatives_1 )? ) ;
    public final void rule__Exponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2310:1: ( ( ( rule__Exponent__Alternatives_1 )? ) )
            // InternalGo.g:2311:1: ( ( rule__Exponent__Alternatives_1 )? )
            {
            // InternalGo.g:2311:1: ( ( rule__Exponent__Alternatives_1 )? )
            // InternalGo.g:2312:2: ( rule__Exponent__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2313:2: ( rule__Exponent__Alternatives_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=51 && LA31_0<=52)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGo.g:2313:3: rule__Exponent__Alternatives_1
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
    // InternalGo.g:2321:1: rule__Exponent__Group__2 : rule__Exponent__Group__2__Impl ;
    public final void rule__Exponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2325:1: ( rule__Exponent__Group__2__Impl )
            // InternalGo.g:2326:2: rule__Exponent__Group__2__Impl
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
    // InternalGo.g:2332:1: rule__Exponent__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Exponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2336:1: ( ( RULE_INT ) )
            // InternalGo.g:2337:1: ( RULE_INT )
            {
            // InternalGo.g:2337:1: ( RULE_INT )
            // InternalGo.g:2338:2: RULE_INT
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
    // InternalGo.g:2348:1: rule__Imaginary_lit__Group__0 : rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 ;
    public final void rule__Imaginary_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2352:1: ( rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 )
            // InternalGo.g:2353:2: rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGo.g:2360:1: rule__Imaginary_lit__Group__0__Impl : ( ( rule__Imaginary_lit__Alternatives_0 ) ) ;
    public final void rule__Imaginary_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2364:1: ( ( ( rule__Imaginary_lit__Alternatives_0 ) ) )
            // InternalGo.g:2365:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            {
            // InternalGo.g:2365:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            // InternalGo.g:2366:2: ( rule__Imaginary_lit__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getAlternatives_0()); 
            }
            // InternalGo.g:2367:2: ( rule__Imaginary_lit__Alternatives_0 )
            // InternalGo.g:2367:3: rule__Imaginary_lit__Alternatives_0
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
    // InternalGo.g:2375:1: rule__Imaginary_lit__Group__1 : rule__Imaginary_lit__Group__1__Impl ;
    public final void rule__Imaginary_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2379:1: ( rule__Imaginary_lit__Group__1__Impl )
            // InternalGo.g:2380:2: rule__Imaginary_lit__Group__1__Impl
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
    // InternalGo.g:2386:1: rule__Imaginary_lit__Group__1__Impl : ( 'i' ) ;
    public final void rule__Imaginary_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2390:1: ( ( 'i' ) )
            // InternalGo.g:2391:1: ( 'i' )
            {
            // InternalGo.g:2391:1: ( 'i' )
            // InternalGo.g:2392:2: 'i'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getIKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2402:1: rule__Rune_lit__Group__0 : rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 ;
    public final void rule__Rune_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2406:1: ( rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 )
            // InternalGo.g:2407:2: rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGo.g:2414:1: rule__Rune_lit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2418:1: ( ( '\\'' ) )
            // InternalGo.g:2419:1: ( '\\'' )
            {
            // InternalGo.g:2419:1: ( '\\'' )
            // InternalGo.g:2420:2: '\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getApostropheKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2429:1: rule__Rune_lit__Group__1 : rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 ;
    public final void rule__Rune_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2433:1: ( rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 )
            // InternalGo.g:2434:2: rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:2441:1: rule__Rune_lit__Group__1__Impl : ( ( rule__Rune_lit__Alternatives_1 ) ) ;
    public final void rule__Rune_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2445:1: ( ( ( rule__Rune_lit__Alternatives_1 ) ) )
            // InternalGo.g:2446:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            {
            // InternalGo.g:2446:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            // InternalGo.g:2447:2: ( rule__Rune_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2448:2: ( rule__Rune_lit__Alternatives_1 )
            // InternalGo.g:2448:3: rule__Rune_lit__Alternatives_1
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
    // InternalGo.g:2456:1: rule__Rune_lit__Group__2 : rule__Rune_lit__Group__2__Impl ;
    public final void rule__Rune_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2460:1: ( rule__Rune_lit__Group__2__Impl )
            // InternalGo.g:2461:2: rule__Rune_lit__Group__2__Impl
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
    // InternalGo.g:2467:1: rule__Rune_lit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2471:1: ( ( '\\'' ) )
            // InternalGo.g:2472:1: ( '\\'' )
            {
            // InternalGo.g:2472:1: ( '\\'' )
            // InternalGo.g:2473:2: '\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getApostropheKeyword_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2483:1: rule__Interpreted_string_lit__Group__0 : rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 ;
    public final void rule__Interpreted_string_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2487:1: ( rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 )
            // InternalGo.g:2488:2: rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalGo.g:2495:1: rule__Interpreted_string_lit__Group__0__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2499:1: ( ( '\"' ) )
            // InternalGo.g:2500:1: ( '\"' )
            {
            // InternalGo.g:2500:1: ( '\"' )
            // InternalGo.g:2501:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2510:1: rule__Interpreted_string_lit__Group__1 : rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 ;
    public final void rule__Interpreted_string_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2514:1: ( rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 )
            // InternalGo.g:2515:2: rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGo.g:2522:1: rule__Interpreted_string_lit__Group__1__Impl : ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) ;
    public final void rule__Interpreted_string_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2526:1: ( ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) )
            // InternalGo.g:2527:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            {
            // InternalGo.g:2527:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            // InternalGo.g:2528:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2529:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_UNICODE_VALUE && LA32_0<=RULE_HEX_BYTE_VALUE)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:2529:3: rule__Interpreted_string_lit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interpreted_string_lit__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalGo.g:2537:1: rule__Interpreted_string_lit__Group__2 : rule__Interpreted_string_lit__Group__2__Impl ;
    public final void rule__Interpreted_string_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2541:1: ( rule__Interpreted_string_lit__Group__2__Impl )
            // InternalGo.g:2542:2: rule__Interpreted_string_lit__Group__2__Impl
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
    // InternalGo.g:2548:1: rule__Interpreted_string_lit__Group__2__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2552:1: ( ( '\"' ) )
            // InternalGo.g:2553:1: ( '\"' )
            {
            // InternalGo.g:2553:1: ( '\"' )
            // InternalGo.g:2554:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalGo.g:2564:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2568:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalGo.g:2569:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

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
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalGo.g:2576:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2580:1: ( ( '(' ) )
            // InternalGo.g:2581:1: ( '(' )
            {
            // InternalGo.g:2581:1: ( '(' )
            // InternalGo.g:2582:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalGo.g:2591:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2595:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalGo.g:2596:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

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
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalGo.g:2603:1: rule__Type__Group_2__1__Impl : ( ruleType ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2607:1: ( ( ruleType ) )
            // InternalGo.g:2608:1: ( ruleType )
            {
            // InternalGo.g:2608:1: ( ruleType )
            // InternalGo.g:2609:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1()); 
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
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalGo.g:2618:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2622:1: ( rule__Type__Group_2__2__Impl )
            // InternalGo.g:2623:2: rule__Type__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2__Impl();

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
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalGo.g:2629:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2633:1: ( ( ')' ) )
            // InternalGo.g:2634:1: ( ')' )
            {
            // InternalGo.g:2634:1: ( ')' )
            // InternalGo.g:2635:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Array_type__Group__0"
    // InternalGo.g:2645:1: rule__Array_type__Group__0 : rule__Array_type__Group__0__Impl rule__Array_type__Group__1 ;
    public final void rule__Array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2649:1: ( rule__Array_type__Group__0__Impl rule__Array_type__Group__1 )
            // InternalGo.g:2650:2: rule__Array_type__Group__0__Impl rule__Array_type__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGo.g:2657:1: rule__Array_type__Group__0__Impl : ( '[' ) ;
    public final void rule__Array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2661:1: ( ( '[' ) )
            // InternalGo.g:2662:1: ( '[' )
            {
            // InternalGo.g:2662:1: ( '[' )
            // InternalGo.g:2663:2: '['
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
    // InternalGo.g:2672:1: rule__Array_type__Group__1 : rule__Array_type__Group__1__Impl rule__Array_type__Group__2 ;
    public final void rule__Array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2676:1: ( rule__Array_type__Group__1__Impl rule__Array_type__Group__2 )
            // InternalGo.g:2677:2: rule__Array_type__Group__1__Impl rule__Array_type__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalGo.g:2684:1: rule__Array_type__Group__1__Impl : ( ( ruleParameter_list ) ) ;
    public final void rule__Array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2688:1: ( ( ( ruleParameter_list ) ) )
            // InternalGo.g:2689:1: ( ( ruleParameter_list ) )
            {
            // InternalGo.g:2689:1: ( ( ruleParameter_list ) )
            // InternalGo.g:2690:2: ( ruleParameter_list )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getParameter_listParserRuleCall_1()); 
            }
            // InternalGo.g:2691:2: ( ruleParameter_list )
            // InternalGo.g:2691:3: ruleParameter_list
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
    // InternalGo.g:2699:1: rule__Array_type__Group__2 : rule__Array_type__Group__2__Impl rule__Array_type__Group__3 ;
    public final void rule__Array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2703:1: ( rule__Array_type__Group__2__Impl rule__Array_type__Group__3 )
            // InternalGo.g:2704:2: rule__Array_type__Group__2__Impl rule__Array_type__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGo.g:2711:1: rule__Array_type__Group__2__Impl : ( ']' ) ;
    public final void rule__Array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2715:1: ( ( ']' ) )
            // InternalGo.g:2716:1: ( ']' )
            {
            // InternalGo.g:2716:1: ( ']' )
            // InternalGo.g:2717:2: ']'
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
    // InternalGo.g:2726:1: rule__Array_type__Group__3 : rule__Array_type__Group__3__Impl ;
    public final void rule__Array_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2730:1: ( rule__Array_type__Group__3__Impl )
            // InternalGo.g:2731:2: rule__Array_type__Group__3__Impl
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
    // InternalGo.g:2737:1: rule__Array_type__Group__3__Impl : ( ruleType ) ;
    public final void rule__Array_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2741:1: ( ( ruleType ) )
            // InternalGo.g:2742:1: ( ruleType )
            {
            // InternalGo.g:2742:1: ( ruleType )
            // InternalGo.g:2743:2: ruleType
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
    // InternalGo.g:2753:1: rule__Struct_type__Group__0 : rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 ;
    public final void rule__Struct_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2757:1: ( rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 )
            // InternalGo.g:2758:2: rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGo.g:2765:1: rule__Struct_type__Group__0__Impl : ( 'struct' ) ;
    public final void rule__Struct_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2769:1: ( ( 'struct' ) )
            // InternalGo.g:2770:1: ( 'struct' )
            {
            // InternalGo.g:2770:1: ( 'struct' )
            // InternalGo.g:2771:2: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getStructKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2780:1: rule__Struct_type__Group__1 : rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 ;
    public final void rule__Struct_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2784:1: ( rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 )
            // InternalGo.g:2785:2: rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalGo.g:2792:1: rule__Struct_type__Group__1__Impl : ( '{' ) ;
    public final void rule__Struct_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2796:1: ( ( '{' ) )
            // InternalGo.g:2797:1: ( '{' )
            {
            // InternalGo.g:2797:1: ( '{' )
            // InternalGo.g:2798:2: '{'
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
    // InternalGo.g:2807:1: rule__Struct_type__Group__2 : rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 ;
    public final void rule__Struct_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2811:1: ( rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 )
            // InternalGo.g:2812:2: rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalGo.g:2819:1: rule__Struct_type__Group__2__Impl : ( ( rule__Struct_type__Group_2__0 )* ) ;
    public final void rule__Struct_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2823:1: ( ( ( rule__Struct_type__Group_2__0 )* ) )
            // InternalGo.g:2824:1: ( ( rule__Struct_type__Group_2__0 )* )
            {
            // InternalGo.g:2824:1: ( ( rule__Struct_type__Group_2__0 )* )
            // InternalGo.g:2825:2: ( rule__Struct_type__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getGroup_2()); 
            }
            // InternalGo.g:2826:2: ( rule__Struct_type__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_IDENTIFIER||LA33_0==60) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGo.g:2826:3: rule__Struct_type__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Struct_type__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalGo.g:2834:1: rule__Struct_type__Group__3 : rule__Struct_type__Group__3__Impl ;
    public final void rule__Struct_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2838:1: ( rule__Struct_type__Group__3__Impl )
            // InternalGo.g:2839:2: rule__Struct_type__Group__3__Impl
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
    // InternalGo.g:2845:1: rule__Struct_type__Group__3__Impl : ( '}' ) ;
    public final void rule__Struct_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2849:1: ( ( '}' ) )
            // InternalGo.g:2850:1: ( '}' )
            {
            // InternalGo.g:2850:1: ( '}' )
            // InternalGo.g:2851:2: '}'
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
    // InternalGo.g:2861:1: rule__Struct_type__Group_2__0 : rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 ;
    public final void rule__Struct_type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2865:1: ( rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 )
            // InternalGo.g:2866:2: rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalGo.g:2873:1: rule__Struct_type__Group_2__0__Impl : ( ruleField_decl ) ;
    public final void rule__Struct_type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2877:1: ( ( ruleField_decl ) )
            // InternalGo.g:2878:1: ( ruleField_decl )
            {
            // InternalGo.g:2878:1: ( ruleField_decl )
            // InternalGo.g:2879:2: ruleField_decl
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
    // InternalGo.g:2888:1: rule__Struct_type__Group_2__1 : rule__Struct_type__Group_2__1__Impl ;
    public final void rule__Struct_type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2892:1: ( rule__Struct_type__Group_2__1__Impl )
            // InternalGo.g:2893:2: rule__Struct_type__Group_2__1__Impl
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
    // InternalGo.g:2899:1: rule__Struct_type__Group_2__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Struct_type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2903:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:2904:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:2904:1: ( RULE_SEMICOLON )
            // InternalGo.g:2905:2: RULE_SEMICOLON
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
    // InternalGo.g:2915:1: rule__Field_decl__Group__0 : rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 ;
    public final void rule__Field_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2919:1: ( rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 )
            // InternalGo.g:2920:2: rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalGo.g:2927:1: rule__Field_decl__Group__0__Impl : ( ( rule__Field_decl__Alternatives_0 ) ) ;
    public final void rule__Field_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2931:1: ( ( ( rule__Field_decl__Alternatives_0 ) ) )
            // InternalGo.g:2932:1: ( ( rule__Field_decl__Alternatives_0 ) )
            {
            // InternalGo.g:2932:1: ( ( rule__Field_decl__Alternatives_0 ) )
            // InternalGo.g:2933:2: ( rule__Field_decl__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getAlternatives_0()); 
            }
            // InternalGo.g:2934:2: ( rule__Field_decl__Alternatives_0 )
            // InternalGo.g:2934:3: rule__Field_decl__Alternatives_0
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
    // InternalGo.g:2942:1: rule__Field_decl__Group__1 : rule__Field_decl__Group__1__Impl ;
    public final void rule__Field_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2946:1: ( rule__Field_decl__Group__1__Impl )
            // InternalGo.g:2947:2: rule__Field_decl__Group__1__Impl
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
    // InternalGo.g:2953:1: rule__Field_decl__Group__1__Impl : ( ( ruleString_lit )? ) ;
    public final void rule__Field_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2957:1: ( ( ( ruleString_lit )? ) )
            // InternalGo.g:2958:1: ( ( ruleString_lit )? )
            {
            // InternalGo.g:2958:1: ( ( ruleString_lit )? )
            // InternalGo.g:2959:2: ( ruleString_lit )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getString_litParserRuleCall_1()); 
            }
            // InternalGo.g:2960:2: ( ruleString_lit )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_RAW_STRING_LIT||LA34_0==58) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:2960:3: ruleString_lit
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
    // InternalGo.g:2969:1: rule__Field_decl__Group_0_0__0 : rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 ;
    public final void rule__Field_decl__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2973:1: ( rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 )
            // InternalGo.g:2974:2: rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGo.g:2981:1: rule__Field_decl__Group_0_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Field_decl__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2985:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:2986:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:2986:1: ( ruleIdentifier_list )
            // InternalGo.g:2987:2: ruleIdentifier_list
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
    // InternalGo.g:2996:1: rule__Field_decl__Group_0_0__1 : rule__Field_decl__Group_0_0__1__Impl ;
    public final void rule__Field_decl__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3000:1: ( rule__Field_decl__Group_0_0__1__Impl )
            // InternalGo.g:3001:2: rule__Field_decl__Group_0_0__1__Impl
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
    // InternalGo.g:3007:1: rule__Field_decl__Group_0_0__1__Impl : ( ruleType ) ;
    public final void rule__Field_decl__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3011:1: ( ( ruleType ) )
            // InternalGo.g:3012:1: ( ruleType )
            {
            // InternalGo.g:3012:1: ( ruleType )
            // InternalGo.g:3013:2: ruleType
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
    // InternalGo.g:3023:1: rule__Embedded_field__Group__0 : rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 ;
    public final void rule__Embedded_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3027:1: ( rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 )
            // InternalGo.g:3028:2: rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGo.g:3035:1: rule__Embedded_field__Group__0__Impl : ( ( ( '*' ) ) ( ( '*' )* ) ) ;
    public final void rule__Embedded_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3039:1: ( ( ( ( '*' ) ) ( ( '*' )* ) ) )
            // InternalGo.g:3040:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            {
            // InternalGo.g:3040:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            // InternalGo.g:3041:2: ( ( '*' ) ) ( ( '*' )* )
            {
            // InternalGo.g:3041:2: ( ( '*' ) )
            // InternalGo.g:3042:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:3043:3: ( '*' )
            // InternalGo.g:3043:4: '*'
            {
            match(input,60,FOLLOW_25); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }

            }

            // InternalGo.g:3046:2: ( ( '*' )* )
            // InternalGo.g:3047:3: ( '*' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:3048:3: ( '*' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==60) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGo.g:3048:4: '*'
            	    {
            	    match(input,60,FOLLOW_25); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalGo.g:3057:1: rule__Embedded_field__Group__1 : rule__Embedded_field__Group__1__Impl ;
    public final void rule__Embedded_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3061:1: ( rule__Embedded_field__Group__1__Impl )
            // InternalGo.g:3062:2: rule__Embedded_field__Group__1__Impl
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
    // InternalGo.g:3068:1: rule__Embedded_field__Group__1__Impl : ( ruleType_name ) ;
    public final void rule__Embedded_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3072:1: ( ( ruleType_name ) )
            // InternalGo.g:3073:1: ( ruleType_name )
            {
            // InternalGo.g:3073:1: ( ruleType_name )
            // InternalGo.g:3074:2: ruleType_name
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
    // InternalGo.g:3084:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3088:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalGo.g:3089:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGo.g:3096:1: rule__Pointer_type__Group__0__Impl : ( '*' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3100:1: ( ( '*' ) )
            // InternalGo.g:3101:1: ( '*' )
            {
            // InternalGo.g:3101:1: ( '*' )
            // InternalGo.g:3102:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getAsteriskKeyword_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:3111:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3115:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalGo.g:3116:2: rule__Pointer_type__Group__1__Impl
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
    // InternalGo.g:3122:1: rule__Pointer_type__Group__1__Impl : ( ruleType ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3126:1: ( ( ruleType ) )
            // InternalGo.g:3127:1: ( ruleType )
            {
            // InternalGo.g:3127:1: ( ruleType )
            // InternalGo.g:3128:2: ruleType
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


    // $ANTLR start "rule__Function_type__Group__0"
    // InternalGo.g:3138:1: rule__Function_type__Group__0 : rule__Function_type__Group__0__Impl rule__Function_type__Group__1 ;
    public final void rule__Function_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3142:1: ( rule__Function_type__Group__0__Impl rule__Function_type__Group__1 )
            // InternalGo.g:3143:2: rule__Function_type__Group__0__Impl rule__Function_type__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Function_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_type__Group__1();

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
    // $ANTLR end "rule__Function_type__Group__0"


    // $ANTLR start "rule__Function_type__Group__0__Impl"
    // InternalGo.g:3150:1: rule__Function_type__Group__0__Impl : ( 'func' ) ;
    public final void rule__Function_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3154:1: ( ( 'func' ) )
            // InternalGo.g:3155:1: ( 'func' )
            {
            // InternalGo.g:3155:1: ( 'func' )
            // InternalGo.g:3156:2: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_typeAccess().getFuncKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_typeAccess().getFuncKeyword_0()); 
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
    // $ANTLR end "rule__Function_type__Group__0__Impl"


    // $ANTLR start "rule__Function_type__Group__1"
    // InternalGo.g:3165:1: rule__Function_type__Group__1 : rule__Function_type__Group__1__Impl ;
    public final void rule__Function_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3169:1: ( rule__Function_type__Group__1__Impl )
            // InternalGo.g:3170:2: rule__Function_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_type__Group__1__Impl();

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
    // $ANTLR end "rule__Function_type__Group__1"


    // $ANTLR start "rule__Function_type__Group__1__Impl"
    // InternalGo.g:3176:1: rule__Function_type__Group__1__Impl : ( ruleSignature ) ;
    public final void rule__Function_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3180:1: ( ( ruleSignature ) )
            // InternalGo.g:3181:1: ( ruleSignature )
            {
            // InternalGo.g:3181:1: ( ruleSignature )
            // InternalGo.g:3182:2: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_typeAccess().getSignatureParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_typeAccess().getSignatureParserRuleCall_1()); 
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
    // $ANTLR end "rule__Function_type__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalGo.g:3192:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3196:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalGo.g:3197:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Signature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

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
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalGo.g:3204:1: rule__Signature__Group__0__Impl : ( ruleParameters ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3208:1: ( ( ruleParameters ) )
            // InternalGo.g:3209:1: ( ruleParameters )
            {
            // InternalGo.g:3209:1: ( ruleParameters )
            // InternalGo.g:3210:2: ruleParameters
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0()); 
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
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalGo.g:3219:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3223:1: ( rule__Signature__Group__1__Impl )
            // InternalGo.g:3224:2: rule__Signature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__1__Impl();

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
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalGo.g:3230:1: rule__Signature__Group__1__Impl : ( ( ( ruleResult ) ) ( ( ruleResult )* ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3234:1: ( ( ( ( ruleResult ) ) ( ( ruleResult )* ) ) )
            // InternalGo.g:3235:1: ( ( ( ruleResult ) ) ( ( ruleResult )* ) )
            {
            // InternalGo.g:3235:1: ( ( ( ruleResult ) ) ( ( ruleResult )* ) )
            // InternalGo.g:3236:2: ( ( ruleResult ) ) ( ( ruleResult )* )
            {
            // InternalGo.g:3236:2: ( ( ruleResult ) )
            // InternalGo.g:3237:3: ( ruleResult )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
            }
            // InternalGo.g:3238:3: ( ruleResult )
            // InternalGo.g:3238:4: ruleResult
            {
            pushFollow(FOLLOW_27);
            ruleResult();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
            }

            }

            // InternalGo.g:3241:2: ( ( ruleResult )* )
            // InternalGo.g:3242:3: ( ruleResult )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
            }
            // InternalGo.g:3243:3: ( ruleResult )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:3243:4: ruleResult
            	    {
            	    pushFollow(FOLLOW_27);
            	    ruleResult();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
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
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // InternalGo.g:3253:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3257:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalGo.g:3258:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Parameters__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1();

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
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // InternalGo.g:3265:1: rule__Parameters__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3269:1: ( ( '(' ) )
            // InternalGo.g:3270:1: ( '(' )
            {
            // InternalGo.g:3270:1: ( '(' )
            // InternalGo.g:3271:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // InternalGo.g:3280:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3284:1: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
            // InternalGo.g:3285:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Parameters__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__2();

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
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // InternalGo.g:3292:1: rule__Parameters__Group__1__Impl : ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3296:1: ( ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) ) )
            // InternalGo.g:3297:1: ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) )
            {
            // InternalGo.g:3297:1: ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalGo.g:3298:2: ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalGo.g:3298:2: ( ( rule__Parameters__Group_1__0 ) )
            // InternalGo.g:3299:3: ( rule__Parameters__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup_1()); 
            }
            // InternalGo.g:3300:3: ( rule__Parameters__Group_1__0 )
            // InternalGo.g:3300:4: rule__Parameters__Group_1__0
            {
            pushFollow(FOLLOW_28);
            rule__Parameters__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getGroup_1()); 
            }

            }

            // InternalGo.g:3303:2: ( ( rule__Parameters__Group_1__0 )* )
            // InternalGo.g:3304:3: ( rule__Parameters__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup_1()); 
            }
            // InternalGo.g:3305:3: ( rule__Parameters__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_IDENTIFIER||LA37_0==35||LA37_0==37||LA37_0==46||(LA37_0>=53 && LA37_0<=55)||(LA37_0>=59 && LA37_0<=63)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGo.g:3305:4: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group__2"
    // InternalGo.g:3314:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl ;
    public final void rule__Parameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3318:1: ( rule__Parameters__Group__2__Impl )
            // InternalGo.g:3319:2: rule__Parameters__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__2__Impl();

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
    // $ANTLR end "rule__Parameters__Group__2"


    // $ANTLR start "rule__Parameters__Group__2__Impl"
    // InternalGo.g:3325:1: rule__Parameters__Group__2__Impl : ( ')' ) ;
    public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3329:1: ( ( ')' ) )
            // InternalGo.g:3330:1: ( ')' )
            {
            // InternalGo.g:3330:1: ( ')' )
            // InternalGo.g:3331:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Parameters__Group__2__Impl"


    // $ANTLR start "rule__Parameters__Group_1__0"
    // InternalGo.g:3341:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3345:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalGo.g:3346:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Parameters__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1();

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
    // $ANTLR end "rule__Parameters__Group_1__0"


    // $ANTLR start "rule__Parameters__Group_1__0__Impl"
    // InternalGo.g:3353:1: rule__Parameters__Group_1__0__Impl : ( ( ruleParameter_list ) ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3357:1: ( ( ( ruleParameter_list ) ) )
            // InternalGo.g:3358:1: ( ( ruleParameter_list ) )
            {
            // InternalGo.g:3358:1: ( ( ruleParameter_list ) )
            // InternalGo.g:3359:2: ( ruleParameter_list )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getParameter_listParserRuleCall_1_0()); 
            }
            // InternalGo.g:3360:2: ( ruleParameter_list )
            // InternalGo.g:3360:3: ruleParameter_list
            {
            pushFollow(FOLLOW_2);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getParameter_listParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Parameters__Group_1__0__Impl"


    // $ANTLR start "rule__Parameters__Group_1__1"
    // InternalGo.g:3368:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3372:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalGo.g:3373:2: rule__Parameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1__Impl();

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
    // $ANTLR end "rule__Parameters__Group_1__1"


    // $ANTLR start "rule__Parameters__Group_1__1__Impl"
    // InternalGo.g:3379:1: rule__Parameters__Group_1__1__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3383:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalGo.g:3384:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalGo.g:3384:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalGo.g:3385:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalGo.g:3385:2: ( ( ',' ) )
            // InternalGo.g:3386:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }
            // InternalGo.g:3387:3: ( ',' )
            // InternalGo.g:3387:4: ','
            {
            match(input,44,FOLLOW_30); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }

            }

            // InternalGo.g:3390:2: ( ( ',' )* )
            // InternalGo.g:3391:3: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }
            // InternalGo.g:3392:3: ( ',' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==44) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGo.g:3392:4: ','
            	    {
            	    match(input,44,FOLLOW_30); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
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
    // $ANTLR end "rule__Parameters__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter_list__Group__0"
    // InternalGo.g:3402:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3406:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // InternalGo.g:3407:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGo.g:3414:1: rule__Parameter_list__Group__0__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3418:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:3419:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:3419:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:3420:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0()); 
            }
            // InternalGo.g:3421:2: ( ruleParameter_decl )
            // InternalGo.g:3421:3: ruleParameter_decl
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
    // InternalGo.g:3429:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3433:1: ( rule__Parameter_list__Group__1__Impl )
            // InternalGo.g:3434:2: rule__Parameter_list__Group__1__Impl
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
    // InternalGo.g:3440:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3444:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // InternalGo.g:3445:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // InternalGo.g:3445:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // InternalGo.g:3446:2: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // InternalGo.g:3447:2: ( rule__Parameter_list__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==44) ) {
                    int LA39_3 = input.LA(2);

                    if ( (synpred68_InternalGo()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:3447:3: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalGo.g:3456:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3460:1: ( rule__Parameter_list__Group_1__0__Impl )
            // InternalGo.g:3461:2: rule__Parameter_list__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1__0__Impl();

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
    // InternalGo.g:3467:1: rule__Parameter_list__Group_1__0__Impl : ( ( rule__Parameter_list__Group_1_0__0 ) ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3471:1: ( ( ( rule__Parameter_list__Group_1_0__0 ) ) )
            // InternalGo.g:3472:1: ( ( rule__Parameter_list__Group_1_0__0 ) )
            {
            // InternalGo.g:3472:1: ( ( rule__Parameter_list__Group_1_0__0 ) )
            // InternalGo.g:3473:2: ( rule__Parameter_list__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1_0()); 
            }
            // InternalGo.g:3474:2: ( rule__Parameter_list__Group_1_0__0 )
            // InternalGo.g:3474:3: rule__Parameter_list__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getGroup_1_0()); 
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


    // $ANTLR start "rule__Parameter_list__Group_1_0__0"
    // InternalGo.g:3483:1: rule__Parameter_list__Group_1_0__0 : rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1 ;
    public final void rule__Parameter_list__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3487:1: ( rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1 )
            // InternalGo.g:3488:2: rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Parameter_list__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1_0__1();

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
    // $ANTLR end "rule__Parameter_list__Group_1_0__0"


    // $ANTLR start "rule__Parameter_list__Group_1_0__0__Impl"
    // InternalGo.g:3495:1: rule__Parameter_list__Group_1_0__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3499:1: ( ( ',' ) )
            // InternalGo.g:3500:1: ( ',' )
            {
            // InternalGo.g:3500:1: ( ',' )
            // InternalGo.g:3501:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0_0()); 
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
    // $ANTLR end "rule__Parameter_list__Group_1_0__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1_0__1"
    // InternalGo.g:3510:1: rule__Parameter_list__Group_1_0__1 : rule__Parameter_list__Group_1_0__1__Impl ;
    public final void rule__Parameter_list__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3514:1: ( rule__Parameter_list__Group_1_0__1__Impl )
            // InternalGo.g:3515:2: rule__Parameter_list__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Parameter_list__Group_1_0__1"


    // $ANTLR start "rule__Parameter_list__Group_1_0__1__Impl"
    // InternalGo.g:3521:1: rule__Parameter_list__Group_1_0__1__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3525:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:3526:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:3526:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:3527:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_0_1()); 
            }
            // InternalGo.g:3528:2: ( ruleParameter_decl )
            // InternalGo.g:3528:3: ruleParameter_decl
            {
            pushFollow(FOLLOW_2);
            ruleParameter_decl();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__Parameter_list__Group_1_0__1__Impl"


    // $ANTLR start "rule__Parameter_decl__Group__0"
    // InternalGo.g:3537:1: rule__Parameter_decl__Group__0 : rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 ;
    public final void rule__Parameter_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3541:1: ( rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 )
            // InternalGo.g:3542:2: rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGo.g:3549:1: rule__Parameter_decl__Group__0__Impl : ( ( rule__Parameter_decl__Group_0__0 )? ) ;
    public final void rule__Parameter_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3553:1: ( ( ( rule__Parameter_decl__Group_0__0 )? ) )
            // InternalGo.g:3554:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            {
            // InternalGo.g:3554:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            // InternalGo.g:3555:2: ( rule__Parameter_decl__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getGroup_0()); 
            }
            // InternalGo.g:3556:2: ( rule__Parameter_decl__Group_0__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_IDENTIFIER) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==44) ) {
                    int LA40_3 = input.LA(3);

                    if ( (LA40_3==RULE_IDENTIFIER) ) {
                        int LA40_5 = input.LA(4);

                        if ( (synpred69_InternalGo()) ) {
                            alt40=1;
                        }
                    }
                }
                else if ( (LA40_1==RULE_IDENTIFIER||LA40_1==35||LA40_1==37||LA40_1==46||(LA40_1>=53 && LA40_1<=55)||(LA40_1>=59 && LA40_1<=63)) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalGo.g:3556:3: rule__Parameter_decl__Group_0__0
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
    // InternalGo.g:3564:1: rule__Parameter_decl__Group__1 : rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 ;
    public final void rule__Parameter_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3568:1: ( rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 )
            // InternalGo.g:3569:2: rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGo.g:3576:1: rule__Parameter_decl__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__Parameter_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3580:1: ( ( ( '...' )? ) )
            // InternalGo.g:3581:1: ( ( '...' )? )
            {
            // InternalGo.g:3581:1: ( ( '...' )? )
            // InternalGo.g:3582:2: ( '...' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1()); 
            }
            // InternalGo.g:3583:2: ( '...' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGo.g:3583:3: '...'
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
    // InternalGo.g:3591:1: rule__Parameter_decl__Group__2 : rule__Parameter_decl__Group__2__Impl ;
    public final void rule__Parameter_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3595:1: ( rule__Parameter_decl__Group__2__Impl )
            // InternalGo.g:3596:2: rule__Parameter_decl__Group__2__Impl
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
    // InternalGo.g:3602:1: rule__Parameter_decl__Group__2__Impl : ( ruleType ) ;
    public final void rule__Parameter_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3606:1: ( ( ruleType ) )
            // InternalGo.g:3607:1: ( ruleType )
            {
            // InternalGo.g:3607:1: ( ruleType )
            // InternalGo.g:3608:2: ruleType
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
    // InternalGo.g:3618:1: rule__Parameter_decl__Group_0__0 : rule__Parameter_decl__Group_0__0__Impl ;
    public final void rule__Parameter_decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3622:1: ( rule__Parameter_decl__Group_0__0__Impl )
            // InternalGo.g:3623:2: rule__Parameter_decl__Group_0__0__Impl
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
    // InternalGo.g:3629:1: rule__Parameter_decl__Group_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Parameter_decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3633:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:3634:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:3634:1: ( ruleIdentifier_list )
            // InternalGo.g:3635:2: ruleIdentifier_list
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
    // InternalGo.g:3645:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3649:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalGo.g:3650:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGo.g:3657:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3661:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:3662:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:3662:1: ( RULE_IDENTIFIER )
            // InternalGo.g:3663:2: RULE_IDENTIFIER
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
    // InternalGo.g:3672:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3676:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalGo.g:3677:2: rule__Identifier_list__Group__1__Impl
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
    // InternalGo.g:3683:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3687:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalGo.g:3688:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalGo.g:3688:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalGo.g:3689:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalGo.g:3690:2: ( rule__Identifier_list__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==44) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGo.g:3690:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalGo.g:3699:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3703:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalGo.g:3704:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalGo.g:3711:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3715:1: ( ( ',' ) )
            // InternalGo.g:3716:1: ( ',' )
            {
            // InternalGo.g:3716:1: ( ',' )
            // InternalGo.g:3717:2: ','
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
    // InternalGo.g:3726:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3730:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalGo.g:3731:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalGo.g:3737:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3741:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:3742:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:3742:1: ( RULE_IDENTIFIER )
            // InternalGo.g:3743:2: RULE_IDENTIFIER
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


    // $ANTLR start "rule__Interface_type__Group__0"
    // InternalGo.g:3753:1: rule__Interface_type__Group__0 : rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1 ;
    public final void rule__Interface_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3757:1: ( rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1 )
            // InternalGo.g:3758:2: rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Interface_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface_type__Group__1();

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
    // $ANTLR end "rule__Interface_type__Group__0"


    // $ANTLR start "rule__Interface_type__Group__0__Impl"
    // InternalGo.g:3765:1: rule__Interface_type__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3769:1: ( ( 'interface' ) )
            // InternalGo.g:3770:1: ( 'interface' )
            {
            // InternalGo.g:3770:1: ( 'interface' )
            // InternalGo.g:3771:2: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getInterfaceKeyword_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeAccess().getInterfaceKeyword_0()); 
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
    // $ANTLR end "rule__Interface_type__Group__0__Impl"


    // $ANTLR start "rule__Interface_type__Group__1"
    // InternalGo.g:3780:1: rule__Interface_type__Group__1 : rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2 ;
    public final void rule__Interface_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3784:1: ( rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2 )
            // InternalGo.g:3785:2: rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Interface_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface_type__Group__2();

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
    // $ANTLR end "rule__Interface_type__Group__1"


    // $ANTLR start "rule__Interface_type__Group__1__Impl"
    // InternalGo.g:3792:1: rule__Interface_type__Group__1__Impl : ( '{' ) ;
    public final void rule__Interface_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3796:1: ( ( '{' ) )
            // InternalGo.g:3797:1: ( '{' )
            {
            // InternalGo.g:3797:1: ( '{' )
            // InternalGo.g:3798:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__Interface_type__Group__1__Impl"


    // $ANTLR start "rule__Interface_type__Group__2"
    // InternalGo.g:3807:1: rule__Interface_type__Group__2 : rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3 ;
    public final void rule__Interface_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3811:1: ( rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3 )
            // InternalGo.g:3812:2: rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Interface_type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface_type__Group__3();

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
    // $ANTLR end "rule__Interface_type__Group__2"


    // $ANTLR start "rule__Interface_type__Group__2__Impl"
    // InternalGo.g:3819:1: rule__Interface_type__Group__2__Impl : ( ( rule__Interface_type__Group_2__0 )* ) ;
    public final void rule__Interface_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3823:1: ( ( ( rule__Interface_type__Group_2__0 )* ) )
            // InternalGo.g:3824:1: ( ( rule__Interface_type__Group_2__0 )* )
            {
            // InternalGo.g:3824:1: ( ( rule__Interface_type__Group_2__0 )* )
            // InternalGo.g:3825:2: ( rule__Interface_type__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getGroup_2()); 
            }
            // InternalGo.g:3826:2: ( rule__Interface_type__Group_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_IDENTIFIER) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGo.g:3826:3: rule__Interface_type__Group_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Interface_type__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Interface_type__Group__2__Impl"


    // $ANTLR start "rule__Interface_type__Group__3"
    // InternalGo.g:3834:1: rule__Interface_type__Group__3 : rule__Interface_type__Group__3__Impl ;
    public final void rule__Interface_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3838:1: ( rule__Interface_type__Group__3__Impl )
            // InternalGo.g:3839:2: rule__Interface_type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface_type__Group__3__Impl();

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
    // $ANTLR end "rule__Interface_type__Group__3"


    // $ANTLR start "rule__Interface_type__Group__3__Impl"
    // InternalGo.g:3845:1: rule__Interface_type__Group__3__Impl : ( '}' ) ;
    public final void rule__Interface_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3849:1: ( ( '}' ) )
            // InternalGo.g:3850:1: ( '}' )
            {
            // InternalGo.g:3850:1: ( '}' )
            // InternalGo.g:3851:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Interface_type__Group__3__Impl"


    // $ANTLR start "rule__Interface_type__Group_2__0"
    // InternalGo.g:3861:1: rule__Interface_type__Group_2__0 : rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1 ;
    public final void rule__Interface_type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3865:1: ( rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1 )
            // InternalGo.g:3866:2: rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Interface_type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface_type__Group_2__1();

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
    // $ANTLR end "rule__Interface_type__Group_2__0"


    // $ANTLR start "rule__Interface_type__Group_2__0__Impl"
    // InternalGo.g:3873:1: rule__Interface_type__Group_2__0__Impl : ( ruleMethod_spec ) ;
    public final void rule__Interface_type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3877:1: ( ( ruleMethod_spec ) )
            // InternalGo.g:3878:1: ( ruleMethod_spec )
            {
            // InternalGo.g:3878:1: ( ruleMethod_spec )
            // InternalGo.g:3879:2: ruleMethod_spec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getMethod_specParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeAccess().getMethod_specParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Interface_type__Group_2__0__Impl"


    // $ANTLR start "rule__Interface_type__Group_2__1"
    // InternalGo.g:3888:1: rule__Interface_type__Group_2__1 : rule__Interface_type__Group_2__1__Impl ;
    public final void rule__Interface_type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3892:1: ( rule__Interface_type__Group_2__1__Impl )
            // InternalGo.g:3893:2: rule__Interface_type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface_type__Group_2__1__Impl();

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
    // $ANTLR end "rule__Interface_type__Group_2__1"


    // $ANTLR start "rule__Interface_type__Group_2__1__Impl"
    // InternalGo.g:3899:1: rule__Interface_type__Group_2__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Interface_type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3903:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:3904:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:3904:1: ( RULE_SEMICOLON )
            // InternalGo.g:3905:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getSEMICOLONTerminalRuleCall_2_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_typeAccess().getSEMICOLONTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__Interface_type__Group_2__1__Impl"


    // $ANTLR start "rule__Method_spec__Group_0__0"
    // InternalGo.g:3915:1: rule__Method_spec__Group_0__0 : rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1 ;
    public final void rule__Method_spec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3919:1: ( rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1 )
            // InternalGo.g:3920:2: rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Method_spec__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method_spec__Group_0__1();

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
    // $ANTLR end "rule__Method_spec__Group_0__0"


    // $ANTLR start "rule__Method_spec__Group_0__0__Impl"
    // InternalGo.g:3927:1: rule__Method_spec__Group_0__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Method_spec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3931:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:3932:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:3932:1: ( RULE_IDENTIFIER )
            // InternalGo.g:3933:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_specAccess().getIDENTIFIERTerminalRuleCall_0_0()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_specAccess().getIDENTIFIERTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Method_spec__Group_0__0__Impl"


    // $ANTLR start "rule__Method_spec__Group_0__1"
    // InternalGo.g:3942:1: rule__Method_spec__Group_0__1 : rule__Method_spec__Group_0__1__Impl ;
    public final void rule__Method_spec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3946:1: ( rule__Method_spec__Group_0__1__Impl )
            // InternalGo.g:3947:2: rule__Method_spec__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method_spec__Group_0__1__Impl();

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
    // $ANTLR end "rule__Method_spec__Group_0__1"


    // $ANTLR start "rule__Method_spec__Group_0__1__Impl"
    // InternalGo.g:3953:1: rule__Method_spec__Group_0__1__Impl : ( ruleSignature ) ;
    public final void rule__Method_spec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3957:1: ( ( ruleSignature ) )
            // InternalGo.g:3958:1: ( ruleSignature )
            {
            // InternalGo.g:3958:1: ( ruleSignature )
            // InternalGo.g:3959:2: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_specAccess().getSignatureParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_specAccess().getSignatureParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Method_spec__Group_0__1__Impl"


    // $ANTLR start "rule__Slice_type__Group__0"
    // InternalGo.g:3969:1: rule__Slice_type__Group__0 : rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1 ;
    public final void rule__Slice_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3973:1: ( rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1 )
            // InternalGo.g:3974:2: rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Slice_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slice_type__Group__1();

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
    // $ANTLR end "rule__Slice_type__Group__0"


    // $ANTLR start "rule__Slice_type__Group__0__Impl"
    // InternalGo.g:3981:1: rule__Slice_type__Group__0__Impl : ( '[' ) ;
    public final void rule__Slice_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3985:1: ( ( '[' ) )
            // InternalGo.g:3986:1: ( '[' )
            {
            // InternalGo.g:3986:1: ( '[' )
            // InternalGo.g:3987:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlice_typeAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlice_typeAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__Slice_type__Group__0__Impl"


    // $ANTLR start "rule__Slice_type__Group__1"
    // InternalGo.g:3996:1: rule__Slice_type__Group__1 : rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2 ;
    public final void rule__Slice_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4000:1: ( rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2 )
            // InternalGo.g:4001:2: rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Slice_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slice_type__Group__2();

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
    // $ANTLR end "rule__Slice_type__Group__1"


    // $ANTLR start "rule__Slice_type__Group__1__Impl"
    // InternalGo.g:4008:1: rule__Slice_type__Group__1__Impl : ( ']' ) ;
    public final void rule__Slice_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4012:1: ( ( ']' ) )
            // InternalGo.g:4013:1: ( ']' )
            {
            // InternalGo.g:4013:1: ( ']' )
            // InternalGo.g:4014:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlice_typeAccess().getRightSquareBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlice_typeAccess().getRightSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__Slice_type__Group__1__Impl"


    // $ANTLR start "rule__Slice_type__Group__2"
    // InternalGo.g:4023:1: rule__Slice_type__Group__2 : rule__Slice_type__Group__2__Impl ;
    public final void rule__Slice_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4027:1: ( rule__Slice_type__Group__2__Impl )
            // InternalGo.g:4028:2: rule__Slice_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slice_type__Group__2__Impl();

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
    // $ANTLR end "rule__Slice_type__Group__2"


    // $ANTLR start "rule__Slice_type__Group__2__Impl"
    // InternalGo.g:4034:1: rule__Slice_type__Group__2__Impl : ( ruleType ) ;
    public final void rule__Slice_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4038:1: ( ( ruleType ) )
            // InternalGo.g:4039:1: ( ruleType )
            {
            // InternalGo.g:4039:1: ( ruleType )
            // InternalGo.g:4040:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlice_typeAccess().getTypeParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlice_typeAccess().getTypeParserRuleCall_2()); 
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
    // $ANTLR end "rule__Slice_type__Group__2__Impl"


    // $ANTLR start "rule__Map_type__Group__0"
    // InternalGo.g:4050:1: rule__Map_type__Group__0 : rule__Map_type__Group__0__Impl rule__Map_type__Group__1 ;
    public final void rule__Map_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4054:1: ( rule__Map_type__Group__0__Impl rule__Map_type__Group__1 )
            // InternalGo.g:4055:2: rule__Map_type__Group__0__Impl rule__Map_type__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Map_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Map_type__Group__1();

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
    // $ANTLR end "rule__Map_type__Group__0"


    // $ANTLR start "rule__Map_type__Group__0__Impl"
    // InternalGo.g:4062:1: rule__Map_type__Group__0__Impl : ( 'map' ) ;
    public final void rule__Map_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4066:1: ( ( 'map' ) )
            // InternalGo.g:4067:1: ( 'map' )
            {
            // InternalGo.g:4067:1: ( 'map' )
            // InternalGo.g:4068:2: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeAccess().getMapKeyword_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMap_typeAccess().getMapKeyword_0()); 
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
    // $ANTLR end "rule__Map_type__Group__0__Impl"


    // $ANTLR start "rule__Map_type__Group__1"
    // InternalGo.g:4077:1: rule__Map_type__Group__1 : rule__Map_type__Group__1__Impl rule__Map_type__Group__2 ;
    public final void rule__Map_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4081:1: ( rule__Map_type__Group__1__Impl rule__Map_type__Group__2 )
            // InternalGo.g:4082:2: rule__Map_type__Group__1__Impl rule__Map_type__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Map_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Map_type__Group__2();

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
    // $ANTLR end "rule__Map_type__Group__1"


    // $ANTLR start "rule__Map_type__Group__1__Impl"
    // InternalGo.g:4089:1: rule__Map_type__Group__1__Impl : ( '[' ) ;
    public final void rule__Map_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4093:1: ( ( '[' ) )
            // InternalGo.g:4094:1: ( '[' )
            {
            // InternalGo.g:4094:1: ( '[' )
            // InternalGo.g:4095:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMap_typeAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__Map_type__Group__1__Impl"


    // $ANTLR start "rule__Map_type__Group__2"
    // InternalGo.g:4104:1: rule__Map_type__Group__2 : rule__Map_type__Group__2__Impl rule__Map_type__Group__3 ;
    public final void rule__Map_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4108:1: ( rule__Map_type__Group__2__Impl rule__Map_type__Group__3 )
            // InternalGo.g:4109:2: rule__Map_type__Group__2__Impl rule__Map_type__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Map_type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Map_type__Group__3();

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
    // $ANTLR end "rule__Map_type__Group__2"


    // $ANTLR start "rule__Map_type__Group__2__Impl"
    // InternalGo.g:4116:1: rule__Map_type__Group__2__Impl : ( ruleType ) ;
    public final void rule__Map_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4120:1: ( ( ruleType ) )
            // InternalGo.g:4121:1: ( ruleType )
            {
            // InternalGo.g:4121:1: ( ruleType )
            // InternalGo.g:4122:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeAccess().getTypeParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMap_typeAccess().getTypeParserRuleCall_2()); 
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
    // $ANTLR end "rule__Map_type__Group__2__Impl"


    // $ANTLR start "rule__Map_type__Group__3"
    // InternalGo.g:4131:1: rule__Map_type__Group__3 : rule__Map_type__Group__3__Impl rule__Map_type__Group__4 ;
    public final void rule__Map_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4135:1: ( rule__Map_type__Group__3__Impl rule__Map_type__Group__4 )
            // InternalGo.g:4136:2: rule__Map_type__Group__3__Impl rule__Map_type__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Map_type__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Map_type__Group__4();

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
    // $ANTLR end "rule__Map_type__Group__3"


    // $ANTLR start "rule__Map_type__Group__3__Impl"
    // InternalGo.g:4143:1: rule__Map_type__Group__3__Impl : ( ']' ) ;
    public final void rule__Map_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4147:1: ( ( ']' ) )
            // InternalGo.g:4148:1: ( ']' )
            {
            // InternalGo.g:4148:1: ( ']' )
            // InternalGo.g:4149:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMap_typeAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__Map_type__Group__3__Impl"


    // $ANTLR start "rule__Map_type__Group__4"
    // InternalGo.g:4158:1: rule__Map_type__Group__4 : rule__Map_type__Group__4__Impl ;
    public final void rule__Map_type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4162:1: ( rule__Map_type__Group__4__Impl )
            // InternalGo.g:4163:2: rule__Map_type__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map_type__Group__4__Impl();

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
    // $ANTLR end "rule__Map_type__Group__4"


    // $ANTLR start "rule__Map_type__Group__4__Impl"
    // InternalGo.g:4169:1: rule__Map_type__Group__4__Impl : ( ruleType ) ;
    public final void rule__Map_type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4173:1: ( ( ruleType ) )
            // InternalGo.g:4174:1: ( ruleType )
            {
            // InternalGo.g:4174:1: ( ruleType )
            // InternalGo.g:4175:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeAccess().getTypeParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMap_typeAccess().getTypeParserRuleCall_4()); 
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
    // $ANTLR end "rule__Map_type__Group__4__Impl"


    // $ANTLR start "rule__Channel_type__Group__0"
    // InternalGo.g:4185:1: rule__Channel_type__Group__0 : rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1 ;
    public final void rule__Channel_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4189:1: ( rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1 )
            // InternalGo.g:4190:2: rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Channel_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Channel_type__Group__1();

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
    // $ANTLR end "rule__Channel_type__Group__0"


    // $ANTLR start "rule__Channel_type__Group__0__Impl"
    // InternalGo.g:4197:1: rule__Channel_type__Group__0__Impl : ( ( rule__Channel_type__Alternatives_0 ) ) ;
    public final void rule__Channel_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4201:1: ( ( ( rule__Channel_type__Alternatives_0 ) ) )
            // InternalGo.g:4202:1: ( ( rule__Channel_type__Alternatives_0 ) )
            {
            // InternalGo.g:4202:1: ( ( rule__Channel_type__Alternatives_0 ) )
            // InternalGo.g:4203:2: ( rule__Channel_type__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannel_typeAccess().getAlternatives_0()); 
            }
            // InternalGo.g:4204:2: ( rule__Channel_type__Alternatives_0 )
            // InternalGo.g:4204:3: rule__Channel_type__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Channel_type__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannel_typeAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Channel_type__Group__0__Impl"


    // $ANTLR start "rule__Channel_type__Group__1"
    // InternalGo.g:4212:1: rule__Channel_type__Group__1 : rule__Channel_type__Group__1__Impl ;
    public final void rule__Channel_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4216:1: ( rule__Channel_type__Group__1__Impl )
            // InternalGo.g:4217:2: rule__Channel_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel_type__Group__1__Impl();

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
    // $ANTLR end "rule__Channel_type__Group__1"


    // $ANTLR start "rule__Channel_type__Group__1__Impl"
    // InternalGo.g:4223:1: rule__Channel_type__Group__1__Impl : ( ruleType ) ;
    public final void rule__Channel_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4227:1: ( ( ruleType ) )
            // InternalGo.g:4228:1: ( ruleType )
            {
            // InternalGo.g:4228:1: ( ruleType )
            // InternalGo.g:4229:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannel_typeAccess().getTypeParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannel_typeAccess().getTypeParserRuleCall_1()); 
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
    // $ANTLR end "rule__Channel_type__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalGo.g:4239:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4243:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalGo.g:4244:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalGo.g:4251:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4255:1: ( ( '{' ) )
            // InternalGo.g:4256:1: ( '{' )
            {
            // InternalGo.g:4256:1: ( '{' )
            // InternalGo.g:4257:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalGo.g:4266:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4270:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalGo.g:4271:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalGo.g:4278:1: rule__Block__Group__1__Impl : ( ruleStatement_list ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4282:1: ( ( ruleStatement_list ) )
            // InternalGo.g:4283:1: ( ruleStatement_list )
            {
            // InternalGo.g:4283:1: ( ruleStatement_list )
            // InternalGo.g:4284:2: ruleStatement_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatement_listParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatement_listParserRuleCall_1()); 
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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalGo.g:4293:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4297:1: ( rule__Block__Group__2__Impl )
            // InternalGo.g:4298:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__2__Impl();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalGo.g:4304:1: rule__Block__Group__2__Impl : ( '}' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4308:1: ( ( '}' ) )
            // InternalGo.g:4309:1: ( '}' )
            {
            // InternalGo.g:4309:1: ( '}' )
            // InternalGo.g:4310:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Statement_list__Group__0"
    // InternalGo.g:4320:1: rule__Statement_list__Group__0 : rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1 ;
    public final void rule__Statement_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4324:1: ( rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1 )
            // InternalGo.g:4325:2: rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Statement_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement_list__Group__1();

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
    // $ANTLR end "rule__Statement_list__Group__0"


    // $ANTLR start "rule__Statement_list__Group__0__Impl"
    // InternalGo.g:4332:1: rule__Statement_list__Group__0__Impl : ( ruleStatement ) ;
    public final void rule__Statement_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4336:1: ( ( ruleStatement ) )
            // InternalGo.g:4337:1: ( ruleStatement )
            {
            // InternalGo.g:4337:1: ( ruleStatement )
            // InternalGo.g:4338:2: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_listAccess().getStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_listAccess().getStatementParserRuleCall_0()); 
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
    // $ANTLR end "rule__Statement_list__Group__0__Impl"


    // $ANTLR start "rule__Statement_list__Group__1"
    // InternalGo.g:4347:1: rule__Statement_list__Group__1 : rule__Statement_list__Group__1__Impl ;
    public final void rule__Statement_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4351:1: ( rule__Statement_list__Group__1__Impl )
            // InternalGo.g:4352:2: rule__Statement_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_list__Group__1__Impl();

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
    // $ANTLR end "rule__Statement_list__Group__1"


    // $ANTLR start "rule__Statement_list__Group__1__Impl"
    // InternalGo.g:4358:1: rule__Statement_list__Group__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Statement_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4362:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:4363:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:4363:1: ( RULE_SEMICOLON )
            // InternalGo.g:4364:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_listAccess().getSEMICOLONTerminalRuleCall_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_listAccess().getSEMICOLONTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Statement_list__Group__1__Impl"


    // $ANTLR start "rule__Const_decl__Group_0__0"
    // InternalGo.g:4374:1: rule__Const_decl__Group_0__0 : rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1 ;
    public final void rule__Const_decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4378:1: ( rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1 )
            // InternalGo.g:4379:2: rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Const_decl__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Const_decl__Group_0__1();

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
    // $ANTLR end "rule__Const_decl__Group_0__0"


    // $ANTLR start "rule__Const_decl__Group_0__0__Impl"
    // InternalGo.g:4386:1: rule__Const_decl__Group_0__0__Impl : ( 'const' ) ;
    public final void rule__Const_decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4390:1: ( ( 'const' ) )
            // InternalGo.g:4391:1: ( 'const' )
            {
            // InternalGo.g:4391:1: ( 'const' )
            // InternalGo.g:4392:2: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getConstKeyword_0_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getConstKeyword_0_0()); 
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
    // $ANTLR end "rule__Const_decl__Group_0__0__Impl"


    // $ANTLR start "rule__Const_decl__Group_0__1"
    // InternalGo.g:4401:1: rule__Const_decl__Group_0__1 : rule__Const_decl__Group_0__1__Impl ;
    public final void rule__Const_decl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4405:1: ( rule__Const_decl__Group_0__1__Impl )
            // InternalGo.g:4406:2: rule__Const_decl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const_decl__Group_0__1__Impl();

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
    // $ANTLR end "rule__Const_decl__Group_0__1"


    // $ANTLR start "rule__Const_decl__Group_0__1__Impl"
    // InternalGo.g:4412:1: rule__Const_decl__Group_0__1__Impl : ( ruleConst_spec ) ;
    public final void rule__Const_decl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4416:1: ( ( ruleConst_spec ) )
            // InternalGo.g:4417:1: ( ruleConst_spec )
            {
            // InternalGo.g:4417:1: ( ruleConst_spec )
            // InternalGo.g:4418:2: ruleConst_spec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getConst_specParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleConst_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getConst_specParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Const_decl__Group_0__1__Impl"


    // $ANTLR start "rule__Const_decl__Group_1__0"
    // InternalGo.g:4428:1: rule__Const_decl__Group_1__0 : rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1 ;
    public final void rule__Const_decl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4432:1: ( rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1 )
            // InternalGo.g:4433:2: rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Const_decl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Const_decl__Group_1__1();

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
    // $ANTLR end "rule__Const_decl__Group_1__0"


    // $ANTLR start "rule__Const_decl__Group_1__0__Impl"
    // InternalGo.g:4440:1: rule__Const_decl__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Const_decl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4444:1: ( ( '(' ) )
            // InternalGo.g:4445:1: ( '(' )
            {
            // InternalGo.g:4445:1: ( '(' )
            // InternalGo.g:4446:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__Const_decl__Group_1__0__Impl"


    // $ANTLR start "rule__Const_decl__Group_1__1"
    // InternalGo.g:4455:1: rule__Const_decl__Group_1__1 : rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2 ;
    public final void rule__Const_decl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4459:1: ( rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2 )
            // InternalGo.g:4460:2: rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2
            {
            pushFollow(FOLLOW_36);
            rule__Const_decl__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Const_decl__Group_1__2();

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
    // $ANTLR end "rule__Const_decl__Group_1__1"


    // $ANTLR start "rule__Const_decl__Group_1__1__Impl"
    // InternalGo.g:4467:1: rule__Const_decl__Group_1__1__Impl : ( ( rule__Const_decl__Group_1_1__0 )* ) ;
    public final void rule__Const_decl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4471:1: ( ( ( rule__Const_decl__Group_1_1__0 )* ) )
            // InternalGo.g:4472:1: ( ( rule__Const_decl__Group_1_1__0 )* )
            {
            // InternalGo.g:4472:1: ( ( rule__Const_decl__Group_1_1__0 )* )
            // InternalGo.g:4473:2: ( rule__Const_decl__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getGroup_1_1()); 
            }
            // InternalGo.g:4474:2: ( rule__Const_decl__Group_1_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_IDENTIFIER) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGo.g:4474:3: rule__Const_decl__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Const_decl__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Const_decl__Group_1__1__Impl"


    // $ANTLR start "rule__Const_decl__Group_1__2"
    // InternalGo.g:4482:1: rule__Const_decl__Group_1__2 : rule__Const_decl__Group_1__2__Impl ;
    public final void rule__Const_decl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4486:1: ( rule__Const_decl__Group_1__2__Impl )
            // InternalGo.g:4487:2: rule__Const_decl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const_decl__Group_1__2__Impl();

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
    // $ANTLR end "rule__Const_decl__Group_1__2"


    // $ANTLR start "rule__Const_decl__Group_1__2__Impl"
    // InternalGo.g:4493:1: rule__Const_decl__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Const_decl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4497:1: ( ( ')' ) )
            // InternalGo.g:4498:1: ( ')' )
            {
            // InternalGo.g:4498:1: ( ')' )
            // InternalGo.g:4499:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getRightParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__Const_decl__Group_1__2__Impl"


    // $ANTLR start "rule__Const_decl__Group_1_1__0"
    // InternalGo.g:4509:1: rule__Const_decl__Group_1_1__0 : rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1 ;
    public final void rule__Const_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4513:1: ( rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1 )
            // InternalGo.g:4514:2: rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Const_decl__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Const_decl__Group_1_1__1();

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
    // $ANTLR end "rule__Const_decl__Group_1_1__0"


    // $ANTLR start "rule__Const_decl__Group_1_1__0__Impl"
    // InternalGo.g:4521:1: rule__Const_decl__Group_1_1__0__Impl : ( ruleConst_spec ) ;
    public final void rule__Const_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4525:1: ( ( ruleConst_spec ) )
            // InternalGo.g:4526:1: ( ruleConst_spec )
            {
            // InternalGo.g:4526:1: ( ruleConst_spec )
            // InternalGo.g:4527:2: ruleConst_spec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getConst_specParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConst_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getConst_specParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Const_decl__Group_1_1__0__Impl"


    // $ANTLR start "rule__Const_decl__Group_1_1__1"
    // InternalGo.g:4536:1: rule__Const_decl__Group_1_1__1 : rule__Const_decl__Group_1_1__1__Impl ;
    public final void rule__Const_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4540:1: ( rule__Const_decl__Group_1_1__1__Impl )
            // InternalGo.g:4541:2: rule__Const_decl__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const_decl__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Const_decl__Group_1_1__1"


    // $ANTLR start "rule__Const_decl__Group_1_1__1__Impl"
    // InternalGo.g:4547:1: rule__Const_decl__Group_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Const_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4551:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:4552:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:4552:1: ( RULE_SEMICOLON )
            // InternalGo.g:4553:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getSEMICOLONTerminalRuleCall_1_1_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_declAccess().getSEMICOLONTerminalRuleCall_1_1_1()); 
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
    // $ANTLR end "rule__Const_decl__Group_1_1__1__Impl"


    // $ANTLR start "rule__Const_spec__Group__0"
    // InternalGo.g:4563:1: rule__Const_spec__Group__0 : rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1 ;
    public final void rule__Const_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4567:1: ( rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1 )
            // InternalGo.g:4568:2: rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Const_spec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Const_spec__Group__1();

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
    // $ANTLR end "rule__Const_spec__Group__0"


    // $ANTLR start "rule__Const_spec__Group__0__Impl"
    // InternalGo.g:4575:1: rule__Const_spec__Group__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Const_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4579:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:4580:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:4580:1: ( ruleIdentifier_list )
            // InternalGo.g:4581:2: ruleIdentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getIdentifier_listParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_specAccess().getIdentifier_listParserRuleCall_0()); 
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
    // $ANTLR end "rule__Const_spec__Group__0__Impl"


    // $ANTLR start "rule__Const_spec__Group__1"
    // InternalGo.g:4590:1: rule__Const_spec__Group__1 : rule__Const_spec__Group__1__Impl ;
    public final void rule__Const_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4594:1: ( rule__Const_spec__Group__1__Impl )
            // InternalGo.g:4595:2: rule__Const_spec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const_spec__Group__1__Impl();

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
    // $ANTLR end "rule__Const_spec__Group__1"


    // $ANTLR start "rule__Const_spec__Group__1__Impl"
    // InternalGo.g:4601:1: rule__Const_spec__Group__1__Impl : ( ( rule__Const_spec__Group_1__0 )? ) ;
    public final void rule__Const_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4605:1: ( ( ( rule__Const_spec__Group_1__0 )? ) )
            // InternalGo.g:4606:1: ( ( rule__Const_spec__Group_1__0 )? )
            {
            // InternalGo.g:4606:1: ( ( rule__Const_spec__Group_1__0 )? )
            // InternalGo.g:4607:2: ( rule__Const_spec__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getGroup_1()); 
            }
            // InternalGo.g:4608:2: ( rule__Const_spec__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_IDENTIFIER||LA45_0==35||LA45_0==37||LA45_0==42||(LA45_0>=53 && LA45_0<=55)||(LA45_0>=59 && LA45_0<=63)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGo.g:4608:3: rule__Const_spec__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Const_spec__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_specAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Const_spec__Group__1__Impl"


    // $ANTLR start "rule__Const_spec__Group_1__0"
    // InternalGo.g:4617:1: rule__Const_spec__Group_1__0 : rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1 ;
    public final void rule__Const_spec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4621:1: ( rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1 )
            // InternalGo.g:4622:2: rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__Const_spec__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Const_spec__Group_1__1();

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
    // $ANTLR end "rule__Const_spec__Group_1__0"


    // $ANTLR start "rule__Const_spec__Group_1__0__Impl"
    // InternalGo.g:4629:1: rule__Const_spec__Group_1__0__Impl : ( ( ruleType )? ) ;
    public final void rule__Const_spec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4633:1: ( ( ( ruleType )? ) )
            // InternalGo.g:4634:1: ( ( ruleType )? )
            {
            // InternalGo.g:4634:1: ( ( ruleType )? )
            // InternalGo.g:4635:2: ( ruleType )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getTypeParserRuleCall_1_0()); 
            }
            // InternalGo.g:4636:2: ( ruleType )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_IDENTIFIER||LA46_0==35||LA46_0==37||(LA46_0>=53 && LA46_0<=55)||(LA46_0>=59 && LA46_0<=63)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGo.g:4636:3: ruleType
                    {
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_specAccess().getTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Const_spec__Group_1__0__Impl"


    // $ANTLR start "rule__Const_spec__Group_1__1"
    // InternalGo.g:4644:1: rule__Const_spec__Group_1__1 : rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2 ;
    public final void rule__Const_spec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4648:1: ( rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2 )
            // InternalGo.g:4649:2: rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__Const_spec__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Const_spec__Group_1__2();

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
    // $ANTLR end "rule__Const_spec__Group_1__1"


    // $ANTLR start "rule__Const_spec__Group_1__1__Impl"
    // InternalGo.g:4656:1: rule__Const_spec__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Const_spec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4660:1: ( ( '=' ) )
            // InternalGo.g:4661:1: ( '=' )
            {
            // InternalGo.g:4661:1: ( '=' )
            // InternalGo.g:4662:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_specAccess().getEqualsSignKeyword_1_1()); 
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
    // $ANTLR end "rule__Const_spec__Group_1__1__Impl"


    // $ANTLR start "rule__Const_spec__Group_1__2"
    // InternalGo.g:4671:1: rule__Const_spec__Group_1__2 : rule__Const_spec__Group_1__2__Impl ;
    public final void rule__Const_spec__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4675:1: ( rule__Const_spec__Group_1__2__Impl )
            // InternalGo.g:4676:2: rule__Const_spec__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const_spec__Group_1__2__Impl();

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
    // $ANTLR end "rule__Const_spec__Group_1__2"


    // $ANTLR start "rule__Const_spec__Group_1__2__Impl"
    // InternalGo.g:4682:1: rule__Const_spec__Group_1__2__Impl : ( ruleExpression_list ) ;
    public final void rule__Const_spec__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4686:1: ( ( ruleExpression_list ) )
            // InternalGo.g:4687:1: ( ruleExpression_list )
            {
            // InternalGo.g:4687:1: ( ruleExpression_list )
            // InternalGo.g:4688:2: ruleExpression_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getExpression_listParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_specAccess().getExpression_listParserRuleCall_1_2()); 
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
    // $ANTLR end "rule__Const_spec__Group_1__2__Impl"


    // $ANTLR start "rule__Expression_list__Group__0"
    // InternalGo.g:4698:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4702:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalGo.g:4703:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Expression_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1();

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
    // $ANTLR end "rule__Expression_list__Group__0"


    // $ANTLR start "rule__Expression_list__Group__0__Impl"
    // InternalGo.g:4710:1: rule__Expression_list__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4714:1: ( ( ruleExpression ) )
            // InternalGo.g:4715:1: ( ruleExpression )
            {
            // InternalGo.g:4715:1: ( ruleExpression )
            // InternalGo.g:4716:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Expression_list__Group__0__Impl"


    // $ANTLR start "rule__Expression_list__Group__1"
    // InternalGo.g:4725:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4729:1: ( rule__Expression_list__Group__1__Impl )
            // InternalGo.g:4730:2: rule__Expression_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1__Impl();

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
    // $ANTLR end "rule__Expression_list__Group__1"


    // $ANTLR start "rule__Expression_list__Group__1__Impl"
    // InternalGo.g:4736:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4740:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalGo.g:4741:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalGo.g:4741:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalGo.g:4742:2: ( rule__Expression_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            }
            // InternalGo.g:4743:2: ( rule__Expression_list__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==44) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGo.g:4743:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Expression_list__Group__1__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__0"
    // InternalGo.g:4752:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4756:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalGo.g:4757:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Expression_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1();

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
    // $ANTLR end "rule__Expression_list__Group_1__0"


    // $ANTLR start "rule__Expression_list__Group_1__0__Impl"
    // InternalGo.g:4764:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4768:1: ( ( ',' ) )
            // InternalGo.g:4769:1: ( ',' )
            {
            // InternalGo.g:4769:1: ( ',' )
            // InternalGo.g:4770:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Expression_list__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__1"
    // InternalGo.g:4779:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4783:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalGo.g:4784:2: rule__Expression_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression_list__Group_1__1"


    // $ANTLR start "rule__Expression_list__Group_1__1__Impl"
    // InternalGo.g:4790:1: rule__Expression_list__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4794:1: ( ( ruleExpression ) )
            // InternalGo.g:4795:1: ( ruleExpression )
            {
            // InternalGo.g:4795:1: ( ruleExpression )
            // InternalGo.g:4796:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Expression_list__Group_1__1__Impl"


    // $ANTLR start "rule__Function_decl__Group__0"
    // InternalGo.g:4806:1: rule__Function_decl__Group__0 : rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1 ;
    public final void rule__Function_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4810:1: ( rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1 )
            // InternalGo.g:4811:2: rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Function_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_decl__Group__1();

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
    // $ANTLR end "rule__Function_decl__Group__0"


    // $ANTLR start "rule__Function_decl__Group__0__Impl"
    // InternalGo.g:4818:1: rule__Function_decl__Group__0__Impl : ( 'func' ) ;
    public final void rule__Function_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4822:1: ( ( 'func' ) )
            // InternalGo.g:4823:1: ( 'func' )
            {
            // InternalGo.g:4823:1: ( 'func' )
            // InternalGo.g:4824:2: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getFuncKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declAccess().getFuncKeyword_0()); 
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
    // $ANTLR end "rule__Function_decl__Group__0__Impl"


    // $ANTLR start "rule__Function_decl__Group__1"
    // InternalGo.g:4833:1: rule__Function_decl__Group__1 : rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2 ;
    public final void rule__Function_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4837:1: ( rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2 )
            // InternalGo.g:4838:2: rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Function_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_decl__Group__2();

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
    // $ANTLR end "rule__Function_decl__Group__1"


    // $ANTLR start "rule__Function_decl__Group__1__Impl"
    // InternalGo.g:4845:1: rule__Function_decl__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Function_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4849:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:4850:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:4850:1: ( RULE_IDENTIFIER )
            // InternalGo.g:4851:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declAccess().getIDENTIFIERTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Function_decl__Group__1__Impl"


    // $ANTLR start "rule__Function_decl__Group__2"
    // InternalGo.g:4860:1: rule__Function_decl__Group__2 : rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3 ;
    public final void rule__Function_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4864:1: ( rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3 )
            // InternalGo.g:4865:2: rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Function_decl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_decl__Group__3();

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
    // $ANTLR end "rule__Function_decl__Group__2"


    // $ANTLR start "rule__Function_decl__Group__2__Impl"
    // InternalGo.g:4872:1: rule__Function_decl__Group__2__Impl : ( ruleSignature ) ;
    public final void rule__Function_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4876:1: ( ( ruleSignature ) )
            // InternalGo.g:4877:1: ( ruleSignature )
            {
            // InternalGo.g:4877:1: ( ruleSignature )
            // InternalGo.g:4878:2: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getSignatureParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declAccess().getSignatureParserRuleCall_2()); 
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
    // $ANTLR end "rule__Function_decl__Group__2__Impl"


    // $ANTLR start "rule__Function_decl__Group__3"
    // InternalGo.g:4887:1: rule__Function_decl__Group__3 : rule__Function_decl__Group__3__Impl ;
    public final void rule__Function_decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4891:1: ( rule__Function_decl__Group__3__Impl )
            // InternalGo.g:4892:2: rule__Function_decl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_decl__Group__3__Impl();

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
    // $ANTLR end "rule__Function_decl__Group__3"


    // $ANTLR start "rule__Function_decl__Group__3__Impl"
    // InternalGo.g:4898:1: rule__Function_decl__Group__3__Impl : ( ( ruleFunction_body )? ) ;
    public final void rule__Function_decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4902:1: ( ( ( ruleFunction_body )? ) )
            // InternalGo.g:4903:1: ( ( ruleFunction_body )? )
            {
            // InternalGo.g:4903:1: ( ( ruleFunction_body )? )
            // InternalGo.g:4904:2: ( ruleFunction_body )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getFunction_bodyParserRuleCall_3()); 
            }
            // InternalGo.g:4905:2: ( ruleFunction_body )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:4905:3: ruleFunction_body
                    {
                    pushFollow(FOLLOW_2);
                    ruleFunction_body();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declAccess().getFunction_bodyParserRuleCall_3()); 
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
    // $ANTLR end "rule__Function_decl__Group__3__Impl"


    // $ANTLR start "rule__Operand__Group_2__0"
    // InternalGo.g:4914:1: rule__Operand__Group_2__0 : rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1 ;
    public final void rule__Operand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4918:1: ( rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1 )
            // InternalGo.g:4919:2: rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Operand__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operand__Group_2__1();

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
    // $ANTLR end "rule__Operand__Group_2__0"


    // $ANTLR start "rule__Operand__Group_2__0__Impl"
    // InternalGo.g:4926:1: rule__Operand__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Operand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4930:1: ( ( '(' ) )
            // InternalGo.g:4931:1: ( '(' )
            {
            // InternalGo.g:4931:1: ( '(' )
            // InternalGo.g:4932:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__Operand__Group_2__0__Impl"


    // $ANTLR start "rule__Operand__Group_2__1"
    // InternalGo.g:4941:1: rule__Operand__Group_2__1 : rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2 ;
    public final void rule__Operand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4945:1: ( rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2 )
            // InternalGo.g:4946:2: rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Operand__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operand__Group_2__2();

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
    // $ANTLR end "rule__Operand__Group_2__1"


    // $ANTLR start "rule__Operand__Group_2__1__Impl"
    // InternalGo.g:4953:1: rule__Operand__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Operand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4957:1: ( ( ruleExpression ) )
            // InternalGo.g:4958:1: ( ruleExpression )
            {
            // InternalGo.g:4958:1: ( ruleExpression )
            // InternalGo.g:4959:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getExpressionParserRuleCall_2_1()); 
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
    // $ANTLR end "rule__Operand__Group_2__1__Impl"


    // $ANTLR start "rule__Operand__Group_2__2"
    // InternalGo.g:4968:1: rule__Operand__Group_2__2 : rule__Operand__Group_2__2__Impl ;
    public final void rule__Operand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4972:1: ( rule__Operand__Group_2__2__Impl )
            // InternalGo.g:4973:2: rule__Operand__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operand__Group_2__2__Impl();

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
    // $ANTLR end "rule__Operand__Group_2__2"


    // $ANTLR start "rule__Operand__Group_2__2__Impl"
    // InternalGo.g:4979:1: rule__Operand__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Operand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4983:1: ( ( ')' ) )
            // InternalGo.g:4984:1: ( ')' )
            {
            // InternalGo.g:4984:1: ( ')' )
            // InternalGo.g:4985:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__Operand__Group_2__2__Impl"


    // $ANTLR start "rule__Qualified_ident__Group__0"
    // InternalGo.g:4995:1: rule__Qualified_ident__Group__0 : rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 ;
    public final void rule__Qualified_ident__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4999:1: ( rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 )
            // InternalGo.g:5000:2: rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGo.g:5007:1: rule__Qualified_ident__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5011:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5012:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5012:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5013:2: RULE_IDENTIFIER
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
    // InternalGo.g:5022:1: rule__Qualified_ident__Group__1 : rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 ;
    public final void rule__Qualified_ident__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5026:1: ( rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 )
            // InternalGo.g:5027:2: rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalGo.g:5034:1: rule__Qualified_ident__Group__1__Impl : ( '.' ) ;
    public final void rule__Qualified_ident__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5038:1: ( ( '.' ) )
            // InternalGo.g:5039:1: ( '.' )
            {
            // InternalGo.g:5039:1: ( '.' )
            // InternalGo.g:5040:2: '.'
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
    // InternalGo.g:5049:1: rule__Qualified_ident__Group__2 : rule__Qualified_ident__Group__2__Impl ;
    public final void rule__Qualified_ident__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5053:1: ( rule__Qualified_ident__Group__2__Impl )
            // InternalGo.g:5054:2: rule__Qualified_ident__Group__2__Impl
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
    // InternalGo.g:5060:1: rule__Qualified_ident__Group__2__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5064:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5065:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5065:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5066:2: RULE_IDENTIFIER
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalGo.g:5076:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5080:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalGo.g:5081:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalGo.g:5088:1: rule__Expression__Group__0__Impl : ( ruleUnary_expr ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5092:1: ( ( ruleUnary_expr ) )
            // InternalGo.g:5093:1: ( ruleUnary_expr )
            {
            // InternalGo.g:5093:1: ( ruleUnary_expr )
            // InternalGo.g:5094:2: ruleUnary_expr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getUnary_exprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getUnary_exprParserRuleCall_0()); 
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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalGo.g:5103:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5107:1: ( rule__Expression__Group__1__Impl )
            // InternalGo.g:5108:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalGo.g:5114:1: rule__Expression__Group__1__Impl : ( ruleExpression_line ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5118:1: ( ( ruleExpression_line ) )
            // InternalGo.g:5119:1: ( ruleExpression_line )
            {
            // InternalGo.g:5119:1: ( ruleExpression_line )
            // InternalGo.g:5120:2: ruleExpression_line
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpression_lineParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression_line();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpression_lineParserRuleCall_1()); 
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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression_line__Group__0"
    // InternalGo.g:5130:1: rule__Expression_line__Group__0 : rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1 ;
    public final void rule__Expression_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5134:1: ( rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1 )
            // InternalGo.g:5135:2: rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Expression_line__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression_line__Group__1();

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
    // $ANTLR end "rule__Expression_line__Group__0"


    // $ANTLR start "rule__Expression_line__Group__0__Impl"
    // InternalGo.g:5142:1: rule__Expression_line__Group__0__Impl : ( RULE_BINARY_OP ) ;
    public final void rule__Expression_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5146:1: ( ( RULE_BINARY_OP ) )
            // InternalGo.g:5147:1: ( RULE_BINARY_OP )
            {
            // InternalGo.g:5147:1: ( RULE_BINARY_OP )
            // InternalGo.g:5148:2: RULE_BINARY_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_lineAccess().getBINARY_OPTerminalRuleCall_0()); 
            }
            match(input,RULE_BINARY_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_lineAccess().getBINARY_OPTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Expression_line__Group__0__Impl"


    // $ANTLR start "rule__Expression_line__Group__1"
    // InternalGo.g:5157:1: rule__Expression_line__Group__1 : rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2 ;
    public final void rule__Expression_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5161:1: ( rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2 )
            // InternalGo.g:5162:2: rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Expression_line__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression_line__Group__2();

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
    // $ANTLR end "rule__Expression_line__Group__1"


    // $ANTLR start "rule__Expression_line__Group__1__Impl"
    // InternalGo.g:5169:1: rule__Expression_line__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5173:1: ( ( ruleExpression ) )
            // InternalGo.g:5174:1: ( ruleExpression )
            {
            // InternalGo.g:5174:1: ( ruleExpression )
            // InternalGo.g:5175:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_lineAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_lineAccess().getExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__Expression_line__Group__1__Impl"


    // $ANTLR start "rule__Expression_line__Group__2"
    // InternalGo.g:5184:1: rule__Expression_line__Group__2 : rule__Expression_line__Group__2__Impl ;
    public final void rule__Expression_line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5188:1: ( rule__Expression_line__Group__2__Impl )
            // InternalGo.g:5189:2: rule__Expression_line__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_line__Group__2__Impl();

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
    // $ANTLR end "rule__Expression_line__Group__2"


    // $ANTLR start "rule__Expression_line__Group__2__Impl"
    // InternalGo.g:5195:1: rule__Expression_line__Group__2__Impl : ( ruleExpression_line ) ;
    public final void rule__Expression_line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5199:1: ( ( ruleExpression_line ) )
            // InternalGo.g:5200:1: ( ruleExpression_line )
            {
            // InternalGo.g:5200:1: ( ruleExpression_line )
            // InternalGo.g:5201:2: ruleExpression_line
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_lineAccess().getExpression_lineParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression_line();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_lineAccess().getExpression_lineParserRuleCall_2()); 
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
    // $ANTLR end "rule__Expression_line__Group__2__Impl"


    // $ANTLR start "rule__Package_clause__Group__0"
    // InternalGo.g:5211:1: rule__Package_clause__Group__0 : rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1 ;
    public final void rule__Package_clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5215:1: ( rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1 )
            // InternalGo.g:5216:2: rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Package_clause__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package_clause__Group__1();

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
    // $ANTLR end "rule__Package_clause__Group__0"


    // $ANTLR start "rule__Package_clause__Group__0__Impl"
    // InternalGo.g:5223:1: rule__Package_clause__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5227:1: ( ( 'package' ) )
            // InternalGo.g:5228:1: ( 'package' )
            {
            // InternalGo.g:5228:1: ( 'package' )
            // InternalGo.g:5229:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseAccess().getPackageKeyword_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_clauseAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__Package_clause__Group__0__Impl"


    // $ANTLR start "rule__Package_clause__Group__1"
    // InternalGo.g:5238:1: rule__Package_clause__Group__1 : rule__Package_clause__Group__1__Impl ;
    public final void rule__Package_clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5242:1: ( rule__Package_clause__Group__1__Impl )
            // InternalGo.g:5243:2: rule__Package_clause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package_clause__Group__1__Impl();

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
    // $ANTLR end "rule__Package_clause__Group__1"


    // $ANTLR start "rule__Package_clause__Group__1__Impl"
    // InternalGo.g:5249:1: rule__Package_clause__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Package_clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5253:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5254:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5254:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5255:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_clauseAccess().getIDENTIFIERTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Package_clause__Group__1__Impl"


    // $ANTLR start "rule__Import_decl__Group__0"
    // InternalGo.g:5265:1: rule__Import_decl__Group__0 : rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 ;
    public final void rule__Import_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5269:1: ( rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 )
            // InternalGo.g:5270:2: rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Import_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group__1();

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
    // $ANTLR end "rule__Import_decl__Group__0"


    // $ANTLR start "rule__Import_decl__Group__0__Impl"
    // InternalGo.g:5277:1: rule__Import_decl__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5281:1: ( ( 'import' ) )
            // InternalGo.g:5282:1: ( 'import' )
            {
            // InternalGo.g:5282:1: ( 'import' )
            // InternalGo.g:5283:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getImportKeyword_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import_decl__Group__0__Impl"


    // $ANTLR start "rule__Import_decl__Group__1"
    // InternalGo.g:5292:1: rule__Import_decl__Group__1 : rule__Import_decl__Group__1__Impl ;
    public final void rule__Import_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5296:1: ( rule__Import_decl__Group__1__Impl )
            // InternalGo.g:5297:2: rule__Import_decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group__1__Impl();

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
    // $ANTLR end "rule__Import_decl__Group__1"


    // $ANTLR start "rule__Import_decl__Group__1__Impl"
    // InternalGo.g:5303:1: rule__Import_decl__Group__1__Impl : ( ( rule__Import_decl__Alternatives_1 ) ) ;
    public final void rule__Import_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5307:1: ( ( ( rule__Import_decl__Alternatives_1 ) ) )
            // InternalGo.g:5308:1: ( ( rule__Import_decl__Alternatives_1 ) )
            {
            // InternalGo.g:5308:1: ( ( rule__Import_decl__Alternatives_1 ) )
            // InternalGo.g:5309:2: ( rule__Import_decl__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getAlternatives_1()); 
            }
            // InternalGo.g:5310:2: ( rule__Import_decl__Alternatives_1 )
            // InternalGo.g:5310:3: rule__Import_decl__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Import_decl__Group__1__Impl"


    // $ANTLR start "rule__Import_decl__Group_1_1__0"
    // InternalGo.g:5319:1: rule__Import_decl__Group_1_1__0 : rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 ;
    public final void rule__Import_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5323:1: ( rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 )
            // InternalGo.g:5324:2: rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Import_decl__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1__1();

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
    // $ANTLR end "rule__Import_decl__Group_1_1__0"


    // $ANTLR start "rule__Import_decl__Group_1_1__0__Impl"
    // InternalGo.g:5331:1: rule__Import_decl__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Import_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5335:1: ( ( '(' ) )
            // InternalGo.g:5336:1: ( '(' )
            {
            // InternalGo.g:5336:1: ( '(' )
            // InternalGo.g:5337:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getLeftParenthesisKeyword_1_1_0()); 
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
    // $ANTLR end "rule__Import_decl__Group_1_1__0__Impl"


    // $ANTLR start "rule__Import_decl__Group_1_1__1"
    // InternalGo.g:5346:1: rule__Import_decl__Group_1_1__1 : rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 ;
    public final void rule__Import_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5350:1: ( rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 )
            // InternalGo.g:5351:2: rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2
            {
            pushFollow(FOLLOW_41);
            rule__Import_decl__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1__2();

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
    // $ANTLR end "rule__Import_decl__Group_1_1__1"


    // $ANTLR start "rule__Import_decl__Group_1_1__1__Impl"
    // InternalGo.g:5358:1: rule__Import_decl__Group_1_1__1__Impl : ( ( rule__Import_decl__Group_1_1_1__0 )* ) ;
    public final void rule__Import_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5362:1: ( ( ( rule__Import_decl__Group_1_1_1__0 )* ) )
            // InternalGo.g:5363:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            {
            // InternalGo.g:5363:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            // InternalGo.g:5364:2: ( rule__Import_decl__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getGroup_1_1_1()); 
            }
            // InternalGo.g:5365:2: ( rule__Import_decl__Group_1_1_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_RAW_STRING_LIT && LA49_0<=RULE_IDENTIFIER)||LA49_0==47||LA49_0==58) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGo.g:5365:3: rule__Import_decl__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Import_decl__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__Import_decl__Group_1_1__1__Impl"


    // $ANTLR start "rule__Import_decl__Group_1_1__2"
    // InternalGo.g:5373:1: rule__Import_decl__Group_1_1__2 : rule__Import_decl__Group_1_1__2__Impl ;
    public final void rule__Import_decl__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5377:1: ( rule__Import_decl__Group_1_1__2__Impl )
            // InternalGo.g:5378:2: rule__Import_decl__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Import_decl__Group_1_1__2"


    // $ANTLR start "rule__Import_decl__Group_1_1__2__Impl"
    // InternalGo.g:5384:1: rule__Import_decl__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Import_decl__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5388:1: ( ( ')' ) )
            // InternalGo.g:5389:1: ( ')' )
            {
            // InternalGo.g:5389:1: ( ')' )
            // InternalGo.g:5390:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getRightParenthesisKeyword_1_1_2()); 
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
    // $ANTLR end "rule__Import_decl__Group_1_1__2__Impl"


    // $ANTLR start "rule__Import_decl__Group_1_1_1__0"
    // InternalGo.g:5400:1: rule__Import_decl__Group_1_1_1__0 : rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 ;
    public final void rule__Import_decl__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5404:1: ( rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 )
            // InternalGo.g:5405:2: rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Import_decl__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1_1__1();

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
    // $ANTLR end "rule__Import_decl__Group_1_1_1__0"


    // $ANTLR start "rule__Import_decl__Group_1_1_1__0__Impl"
    // InternalGo.g:5412:1: rule__Import_decl__Group_1_1_1__0__Impl : ( ruleImport_spec ) ;
    public final void rule__Import_decl__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5416:1: ( ( ruleImport_spec ) )
            // InternalGo.g:5417:1: ( ruleImport_spec )
            {
            // InternalGo.g:5417:1: ( ruleImport_spec )
            // InternalGo.g:5418:2: ruleImport_spec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__Import_decl__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Import_decl__Group_1_1_1__1"
    // InternalGo.g:5427:1: rule__Import_decl__Group_1_1_1__1 : rule__Import_decl__Group_1_1_1__1__Impl ;
    public final void rule__Import_decl__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5431:1: ( rule__Import_decl__Group_1_1_1__1__Impl )
            // InternalGo.g:5432:2: rule__Import_decl__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Import_decl__Group_1_1_1__1"


    // $ANTLR start "rule__Import_decl__Group_1_1_1__1__Impl"
    // InternalGo.g:5438:1: rule__Import_decl__Group_1_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Import_decl__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5442:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:5443:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:5443:1: ( RULE_SEMICOLON )
            // InternalGo.g:5444:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 
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
    // $ANTLR end "rule__Import_decl__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Import_spec__Group__0"
    // InternalGo.g:5454:1: rule__Import_spec__Group__0 : rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 ;
    public final void rule__Import_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5458:1: ( rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 )
            // InternalGo.g:5459:2: rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalGo.g:5466:1: rule__Import_spec__Group__0__Impl : ( ( rule__Import_spec__Alternatives_0 )? ) ;
    public final void rule__Import_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5470:1: ( ( ( rule__Import_spec__Alternatives_0 )? ) )
            // InternalGo.g:5471:1: ( ( rule__Import_spec__Alternatives_0 )? )
            {
            // InternalGo.g:5471:1: ( ( rule__Import_spec__Alternatives_0 )? )
            // InternalGo.g:5472:2: ( rule__Import_spec__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getAlternatives_0()); 
            }
            // InternalGo.g:5473:2: ( rule__Import_spec__Alternatives_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_IDENTIFIER||LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGo.g:5473:3: rule__Import_spec__Alternatives_0
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
    // InternalGo.g:5481:1: rule__Import_spec__Group__1 : rule__Import_spec__Group__1__Impl ;
    public final void rule__Import_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5485:1: ( rule__Import_spec__Group__1__Impl )
            // InternalGo.g:5486:2: rule__Import_spec__Group__1__Impl
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
    // InternalGo.g:5492:1: rule__Import_spec__Group__1__Impl : ( ruleImport_path ) ;
    public final void rule__Import_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5496:1: ( ( ruleImport_path ) )
            // InternalGo.g:5497:1: ( ruleImport_path )
            {
            // InternalGo.g:5497:1: ( ruleImport_path )
            // InternalGo.g:5498:2: ruleImport_path
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
    // InternalGo.g:5508:1: rule__Model__GreetingsAssignment : ( ruleprogram ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5512:1: ( ( ruleprogram ) )
            // InternalGo.g:5513:2: ( ruleprogram )
            {
            // InternalGo.g:5513:2: ( ruleprogram )
            // InternalGo.g:5514:3: ruleprogram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0()); 
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

    // $ANTLR start synpred46_InternalGo
    public final void synpred46_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1855:2: ( ( ruleParameters ) )
        // InternalGo.g:1855:2: ( ruleParameters )
        {
        // InternalGo.g:1855:2: ( ruleParameters )
        // InternalGo.g:1856:3: ruleParameters
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getResultAccess().getParametersParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleParameters();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred46_InternalGo

    // $ANTLR start synpred65_InternalGo
    public final void synpred65_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3243:4: ( ruleResult )
        // InternalGo.g:3243:4: ruleResult
        {
        pushFollow(FOLLOW_2);
        ruleResult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalGo

    // $ANTLR start synpred68_InternalGo
    public final void synpred68_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3447:3: ( rule__Parameter_list__Group_1__0 )
        // InternalGo.g:3447:3: rule__Parameter_list__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Parameter_list__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalGo

    // $ANTLR start synpred69_InternalGo
    public final void synpred69_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3556:3: ( rule__Parameter_decl__Group_0__0 )
        // InternalGo.g:3556:3: rule__Parameter_decl__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__Parameter_decl__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalGo

    // Delegated rules

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
    public final boolean synpred69_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalGo_fragment(); // can never throw exception
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
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\uffff\1\2\21\uffff\1\26\5\uffff\1\26";
    static final String dfa_3s = "\1\7\1\4\3\uffff\3\7\1\uffff\1\57\5\7\1\57\2\7\1\57\1\4\2\7\1\uffff\2\7\1\4";
    static final String dfa_4s = "\2\72\3\uffff\1\62\2\64\1\uffff\1\62\2\64\3\7\1\57\2\7\1\57\1\72\2\64\1\uffff\2\7\1\72";
    static final String dfa_5s = "\2\uffff\1\1\1\4\1\5\3\uffff\1\3\15\uffff\1\2\3\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\4\53\uffff\1\3\1\4",
            "\1\2\2\uffff\3\2\3\uffff\3\2\23\uffff\1\2\13\uffff\1\5\1\uffff\1\6\1\7\5\uffff\1\10\2\2",
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
            "\1\26\2\uffff\3\26\3\uffff\3\26\23\uffff\1\26\15\uffff\1\24\1\25\5\uffff\1\10\2\26",
            "\1\31\53\uffff\1\27\1\30",
            "\1\31\53\uffff\1\27\1\30",
            "",
            "\1\31",
            "\1\31",
            "\1\26\2\uffff\3\26\3\uffff\3\26\23\uffff\1\26\24\uffff\1\10\2\26"
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
            return "1685:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\45\1\16\10\uffff";
    static final String dfa_10s = "\2\77\10\uffff";
    static final String dfa_11s = "\2\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\5\1\1";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\17\uffff\3\7\3\uffff\1\2\1\3\1\4\1\6\1\5",
            "\1\11\24\uffff\1\11\1\uffff\1\11\1\10\7\uffff\1\11\6\uffff\3\11\3\uffff\5\11",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1772:1: rule__Type_lit__Alternatives : ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) );";
        }
    }
    static final String dfa_14s = "\15\uffff";
    static final String dfa_15s = "\1\16\1\0\13\uffff";
    static final String dfa_16s = "\1\77\1\0\13\uffff";
    static final String dfa_17s = "\2\uffff\1\2\11\uffff\1\1";
    static final String dfa_18s = "\1\uffff\1\0\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\24\uffff\1\1\1\uffff\1\2\17\uffff\3\2\3\uffff\5\2",
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

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1850:1: rule__Result__Alternatives : ( ( ruleParameters ) | ( ( ruleType ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\26\uffff";
    static final String dfa_21s = "\1\1\25\uffff";
    static final String dfa_22s = "\1\5\1\uffff\13\0\11\uffff";
    static final String dfa_23s = "\1\77\1\uffff\13\0\11\uffff";
    static final String dfa_24s = "\1\uffff\1\2\23\uffff\1\1";
    static final String dfa_25s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\11\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\7\uffff\1\1\1\3\24\uffff\1\2\1\1\1\4\2\1\2\uffff\1\1\1\uffff\1\1\10\uffff\1\12\1\13\1\14\2\uffff\1\1\1\5\1\6\1\7\1\11\1\10",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 3243:3: ( ruleResult )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_11 = input.LA(1);

                         
                        int index36_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_12 = input.LA(1);

                         
                        int index36_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x060000080000E382L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0006800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0006800000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0018000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400000000001C00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xF8E0002800004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xF8E0402800004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1000010000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1000000000004002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0600000000002380L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF8E0002800004002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xF8E0402800004002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xF8E0042800004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x060000080000E380L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0600800800006380L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0600801000006380L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0600800000006382L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0600800000006380L});

}