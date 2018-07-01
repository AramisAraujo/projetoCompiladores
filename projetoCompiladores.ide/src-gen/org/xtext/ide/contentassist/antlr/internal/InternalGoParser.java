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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_BINARY_OP", "RULE_SEMICOLON", "RULE_ASSIGN_OP", "RULE_INT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_UNICODE_VALUE", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_IDENTIFIER", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'='", "':='", "','", "'--'", "'...'", "'.'", "':'", "'E'", "'e'", "'+'", "'-'", "'chan'", "'chan<-'", "'<-chan'", "'fallthrough'", "'i'", "'\\''", "'\"'", "'struct'", "'*'", "'func'", "'interface'", "'map'", "'const'", "'if'", "'else'", "'go'", "'return'", "'break'", "'continue'", "'goto'", "'defer'", "'package'", "'import'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_BINARY_OP=5;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=30;
    public static final int RULE_UNICODE_VALUE=11;
    public static final int RULE_LITTLE_U_VALUE=27;
    public static final int RULE_HEX_BYTE_VALUE=13;
    public static final int RULE_OCTAL_BYTE_VALUE=12;
    public static final int RULE_MUL_OP=19;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=32;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=6;
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
    public static final int RULE_IDENTIFIER=15;
    public static final int RULE_STRING=31;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_KEYWORDS=25;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNICODE_LETTER=21;
    public static final int RULE_HEX_LIT=10;
    public static final int RULE_UNICODE_CHAR=26;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=18;
    public static final int T__75=75;
    public static final int RULE_UNICODE_DIGIT=23;
    public static final int RULE_WS=4;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_OCTAL_LIT=9;
    public static final int RULE_LETTER=22;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=14;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=16;
    public static final int T__45=45;
    public static final int RULE_REL_OP=17;
    public static final int RULE_HEX_DIGIT=24;
    public static final int T__46=46;
    public static final int RULE_ASSIGN_OP=7;
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

                if ( (LA1_0==RULE_IDENTIFIER||LA1_0==35||LA1_0==39||LA1_0==56||(LA1_0>=65 && LA1_0<=66)||(LA1_0>=68 && LA1_0<=73)) ) {
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

                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_HEX_LIT)||(LA2_0>=RULE_RAW_STRING_LIT && LA2_0<=RULE_UNARY_OP)||LA2_0==35||(LA2_0>=58 && LA2_0<=59)) ) {
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
    // InternalGo.g:1237:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1241:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalGo.g:1242:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalGo.g:1242:2: ( ( rule__Statement__Alternatives ) )
            // InternalGo.g:1243:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalGo.g:1244:3: ( rule__Statement__Alternatives )
            // InternalGo.g:1244:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleSimple_stmt"
    // InternalGo.g:1253:1: entryRuleSimple_stmt : ruleSimple_stmt EOF ;
    public final void entryRuleSimple_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1254:1: ( ruleSimple_stmt EOF )
            // InternalGo.g:1255:1: ruleSimple_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimple_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_stmtRule()); 
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
    // $ANTLR end "entryRuleSimple_stmt"


    // $ANTLR start "ruleSimple_stmt"
    // InternalGo.g:1262:1: ruleSimple_stmt : ( ( rule__Simple_stmt__Alternatives ) ) ;
    public final void ruleSimple_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1266:2: ( ( ( rule__Simple_stmt__Alternatives ) ) )
            // InternalGo.g:1267:2: ( ( rule__Simple_stmt__Alternatives ) )
            {
            // InternalGo.g:1267:2: ( ( rule__Simple_stmt__Alternatives ) )
            // InternalGo.g:1268:3: ( rule__Simple_stmt__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_stmtAccess().getAlternatives()); 
            }
            // InternalGo.g:1269:3: ( rule__Simple_stmt__Alternatives )
            // InternalGo.g:1269:4: rule__Simple_stmt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Simple_stmt__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_stmtAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimple_stmt"


    // $ANTLR start "entryRuleEmpty_stmt"
    // InternalGo.g:1278:1: entryRuleEmpty_stmt : ruleEmpty_stmt EOF ;
    public final void entryRuleEmpty_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1279:1: ( ruleEmpty_stmt EOF )
            // InternalGo.g:1280:1: ruleEmpty_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmpty_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEmpty_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmpty_stmtRule()); 
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
    // $ANTLR end "entryRuleEmpty_stmt"


    // $ANTLR start "ruleEmpty_stmt"
    // InternalGo.g:1287:1: ruleEmpty_stmt : ( RULE_WS ) ;
    public final void ruleEmpty_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1291:2: ( ( RULE_WS ) )
            // InternalGo.g:1292:2: ( RULE_WS )
            {
            // InternalGo.g:1292:2: ( RULE_WS )
            // InternalGo.g:1293:3: RULE_WS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmpty_stmtAccess().getWSTerminalRuleCall()); 
            }
            match(input,RULE_WS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmpty_stmtAccess().getWSTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmpty_stmt"


    // $ANTLR start "entryRuleLabeled_stmt"
    // InternalGo.g:1303:1: entryRuleLabeled_stmt : ruleLabeled_stmt EOF ;
    public final void entryRuleLabeled_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1304:1: ( ruleLabeled_stmt EOF )
            // InternalGo.g:1305:1: ruleLabeled_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeled_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLabeled_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeled_stmtRule()); 
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
    // $ANTLR end "entryRuleLabeled_stmt"


    // $ANTLR start "ruleLabeled_stmt"
    // InternalGo.g:1312:1: ruleLabeled_stmt : ( ( rule__Labeled_stmt__Group__0 ) ) ;
    public final void ruleLabeled_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1316:2: ( ( ( rule__Labeled_stmt__Group__0 ) ) )
            // InternalGo.g:1317:2: ( ( rule__Labeled_stmt__Group__0 ) )
            {
            // InternalGo.g:1317:2: ( ( rule__Labeled_stmt__Group__0 ) )
            // InternalGo.g:1318:3: ( rule__Labeled_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeled_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1319:3: ( rule__Labeled_stmt__Group__0 )
            // InternalGo.g:1319:4: rule__Labeled_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Labeled_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeled_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabeled_stmt"


    // $ANTLR start "entryRuleExpression_stmt"
    // InternalGo.g:1328:1: entryRuleExpression_stmt : ruleExpression_stmt EOF ;
    public final void entryRuleExpression_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1329:1: ( ruleExpression_stmt EOF )
            // InternalGo.g:1330:1: ruleExpression_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_stmtRule()); 
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
    // $ANTLR end "entryRuleExpression_stmt"


    // $ANTLR start "ruleExpression_stmt"
    // InternalGo.g:1337:1: ruleExpression_stmt : ( ruleExpression ) ;
    public final void ruleExpression_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1341:2: ( ( ruleExpression ) )
            // InternalGo.g:1342:2: ( ruleExpression )
            {
            // InternalGo.g:1342:2: ( ruleExpression )
            // InternalGo.g:1343:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_stmtAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_stmtAccess().getExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_stmt"


    // $ANTLR start "entryRuleIf_stmt"
    // InternalGo.g:1353:1: entryRuleIf_stmt : ruleIf_stmt EOF ;
    public final void entryRuleIf_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1354:1: ( ruleIf_stmt EOF )
            // InternalGo.g:1355:1: ruleIf_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIf_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtRule()); 
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
    // $ANTLR end "entryRuleIf_stmt"


    // $ANTLR start "ruleIf_stmt"
    // InternalGo.g:1362:1: ruleIf_stmt : ( ( rule__If_stmt__Group__0 ) ) ;
    public final void ruleIf_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1366:2: ( ( ( rule__If_stmt__Group__0 ) ) )
            // InternalGo.g:1367:2: ( ( rule__If_stmt__Group__0 ) )
            {
            // InternalGo.g:1367:2: ( ( rule__If_stmt__Group__0 ) )
            // InternalGo.g:1368:3: ( rule__If_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1369:3: ( rule__If_stmt__Group__0 )
            // InternalGo.g:1369:4: rule__If_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf_stmt"


    // $ANTLR start "entryRuleGo_stmt"
    // InternalGo.g:1378:1: entryRuleGo_stmt : ruleGo_stmt EOF ;
    public final void entryRuleGo_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1379:1: ( ruleGo_stmt EOF )
            // InternalGo.g:1380:1: ruleGo_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGo_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGo_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGo_stmtRule()); 
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
    // $ANTLR end "entryRuleGo_stmt"


    // $ANTLR start "ruleGo_stmt"
    // InternalGo.g:1387:1: ruleGo_stmt : ( ( rule__Go_stmt__Group__0 ) ) ;
    public final void ruleGo_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1391:2: ( ( ( rule__Go_stmt__Group__0 ) ) )
            // InternalGo.g:1392:2: ( ( rule__Go_stmt__Group__0 ) )
            {
            // InternalGo.g:1392:2: ( ( rule__Go_stmt__Group__0 ) )
            // InternalGo.g:1393:3: ( rule__Go_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGo_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1394:3: ( rule__Go_stmt__Group__0 )
            // InternalGo.g:1394:4: rule__Go_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Go_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGo_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGo_stmt"


    // $ANTLR start "entryRuleReturn_stmt"
    // InternalGo.g:1403:1: entryRuleReturn_stmt : ruleReturn_stmt EOF ;
    public final void entryRuleReturn_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1404:1: ( ruleReturn_stmt EOF )
            // InternalGo.g:1405:1: ruleReturn_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturn_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturn_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturn_stmtRule()); 
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
    // $ANTLR end "entryRuleReturn_stmt"


    // $ANTLR start "ruleReturn_stmt"
    // InternalGo.g:1412:1: ruleReturn_stmt : ( ( rule__Return_stmt__Group__0 ) ) ;
    public final void ruleReturn_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1416:2: ( ( ( rule__Return_stmt__Group__0 ) ) )
            // InternalGo.g:1417:2: ( ( rule__Return_stmt__Group__0 ) )
            {
            // InternalGo.g:1417:2: ( ( rule__Return_stmt__Group__0 ) )
            // InternalGo.g:1418:3: ( rule__Return_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturn_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1419:3: ( rule__Return_stmt__Group__0 )
            // InternalGo.g:1419:4: rule__Return_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Return_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturn_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturn_stmt"


    // $ANTLR start "entryRuleBreak_stmt"
    // InternalGo.g:1428:1: entryRuleBreak_stmt : ruleBreak_stmt EOF ;
    public final void entryRuleBreak_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1429:1: ( ruleBreak_stmt EOF )
            // InternalGo.g:1430:1: ruleBreak_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreak_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBreak_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreak_stmtRule()); 
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
    // $ANTLR end "entryRuleBreak_stmt"


    // $ANTLR start "ruleBreak_stmt"
    // InternalGo.g:1437:1: ruleBreak_stmt : ( ( rule__Break_stmt__Group__0 ) ) ;
    public final void ruleBreak_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1441:2: ( ( ( rule__Break_stmt__Group__0 ) ) )
            // InternalGo.g:1442:2: ( ( rule__Break_stmt__Group__0 ) )
            {
            // InternalGo.g:1442:2: ( ( rule__Break_stmt__Group__0 ) )
            // InternalGo.g:1443:3: ( rule__Break_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreak_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1444:3: ( rule__Break_stmt__Group__0 )
            // InternalGo.g:1444:4: rule__Break_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Break_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreak_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBreak_stmt"


    // $ANTLR start "entryRuleContinue_stmt"
    // InternalGo.g:1453:1: entryRuleContinue_stmt : ruleContinue_stmt EOF ;
    public final void entryRuleContinue_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1454:1: ( ruleContinue_stmt EOF )
            // InternalGo.g:1455:1: ruleContinue_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContinue_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleContinue_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContinue_stmtRule()); 
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
    // $ANTLR end "entryRuleContinue_stmt"


    // $ANTLR start "ruleContinue_stmt"
    // InternalGo.g:1462:1: ruleContinue_stmt : ( ( rule__Continue_stmt__Group__0 ) ) ;
    public final void ruleContinue_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1466:2: ( ( ( rule__Continue_stmt__Group__0 ) ) )
            // InternalGo.g:1467:2: ( ( rule__Continue_stmt__Group__0 ) )
            {
            // InternalGo.g:1467:2: ( ( rule__Continue_stmt__Group__0 ) )
            // InternalGo.g:1468:3: ( rule__Continue_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContinue_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1469:3: ( rule__Continue_stmt__Group__0 )
            // InternalGo.g:1469:4: rule__Continue_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Continue_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContinue_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContinue_stmt"


    // $ANTLR start "entryRuleGoto_stmt"
    // InternalGo.g:1478:1: entryRuleGoto_stmt : ruleGoto_stmt EOF ;
    public final void entryRuleGoto_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1479:1: ( ruleGoto_stmt EOF )
            // InternalGo.g:1480:1: ruleGoto_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoto_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGoto_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoto_stmtRule()); 
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
    // $ANTLR end "entryRuleGoto_stmt"


    // $ANTLR start "ruleGoto_stmt"
    // InternalGo.g:1487:1: ruleGoto_stmt : ( ( rule__Goto_stmt__Group__0 ) ) ;
    public final void ruleGoto_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1491:2: ( ( ( rule__Goto_stmt__Group__0 ) ) )
            // InternalGo.g:1492:2: ( ( rule__Goto_stmt__Group__0 ) )
            {
            // InternalGo.g:1492:2: ( ( rule__Goto_stmt__Group__0 ) )
            // InternalGo.g:1493:3: ( rule__Goto_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoto_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1494:3: ( rule__Goto_stmt__Group__0 )
            // InternalGo.g:1494:4: rule__Goto_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goto_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoto_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoto_stmt"


    // $ANTLR start "entryRuleDefer_stmt"
    // InternalGo.g:1503:1: entryRuleDefer_stmt : ruleDefer_stmt EOF ;
    public final void entryRuleDefer_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1504:1: ( ruleDefer_stmt EOF )
            // InternalGo.g:1505:1: ruleDefer_stmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefer_stmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefer_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefer_stmtRule()); 
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
    // $ANTLR end "entryRuleDefer_stmt"


    // $ANTLR start "ruleDefer_stmt"
    // InternalGo.g:1512:1: ruleDefer_stmt : ( ( rule__Defer_stmt__Group__0 ) ) ;
    public final void ruleDefer_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1516:2: ( ( ( rule__Defer_stmt__Group__0 ) ) )
            // InternalGo.g:1517:2: ( ( rule__Defer_stmt__Group__0 ) )
            {
            // InternalGo.g:1517:2: ( ( rule__Defer_stmt__Group__0 ) )
            // InternalGo.g:1518:3: ( rule__Defer_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefer_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1519:3: ( rule__Defer_stmt__Group__0 )
            // InternalGo.g:1519:4: rule__Defer_stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Defer_stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefer_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefer_stmt"


    // $ANTLR start "entryRulePackage_clause"
    // InternalGo.g:1528:1: entryRulePackage_clause : rulePackage_clause EOF ;
    public final void entryRulePackage_clause() throws RecognitionException {
        try {
            // InternalGo.g:1529:1: ( rulePackage_clause EOF )
            // InternalGo.g:1530:1: rulePackage_clause EOF
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
    // InternalGo.g:1537:1: rulePackage_clause : ( ( rule__Package_clause__Group__0 ) ) ;
    public final void rulePackage_clause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1541:2: ( ( ( rule__Package_clause__Group__0 ) ) )
            // InternalGo.g:1542:2: ( ( rule__Package_clause__Group__0 ) )
            {
            // InternalGo.g:1542:2: ( ( rule__Package_clause__Group__0 ) )
            // InternalGo.g:1543:3: ( rule__Package_clause__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseAccess().getGroup()); 
            }
            // InternalGo.g:1544:3: ( rule__Package_clause__Group__0 )
            // InternalGo.g:1544:4: rule__Package_clause__Group__0
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
    // InternalGo.g:1553:1: entryRuleImport_decl : ruleImport_decl EOF ;
    public final void entryRuleImport_decl() throws RecognitionException {
        try {
            // InternalGo.g:1554:1: ( ruleImport_decl EOF )
            // InternalGo.g:1555:1: ruleImport_decl EOF
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
    // InternalGo.g:1562:1: ruleImport_decl : ( ( rule__Import_decl__Group__0 ) ) ;
    public final void ruleImport_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1566:2: ( ( ( rule__Import_decl__Group__0 ) ) )
            // InternalGo.g:1567:2: ( ( rule__Import_decl__Group__0 ) )
            {
            // InternalGo.g:1567:2: ( ( rule__Import_decl__Group__0 ) )
            // InternalGo.g:1568:3: ( rule__Import_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getGroup()); 
            }
            // InternalGo.g:1569:3: ( rule__Import_decl__Group__0 )
            // InternalGo.g:1569:4: rule__Import_decl__Group__0
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
    // InternalGo.g:1578:1: entryRuleImport_spec : ruleImport_spec EOF ;
    public final void entryRuleImport_spec() throws RecognitionException {
        try {
            // InternalGo.g:1579:1: ( ruleImport_spec EOF )
            // InternalGo.g:1580:1: ruleImport_spec EOF
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
    // InternalGo.g:1587:1: ruleImport_spec : ( ( rule__Import_spec__Group__0 ) ) ;
    public final void ruleImport_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1591:2: ( ( ( rule__Import_spec__Group__0 ) ) )
            // InternalGo.g:1592:2: ( ( rule__Import_spec__Group__0 ) )
            {
            // InternalGo.g:1592:2: ( ( rule__Import_spec__Group__0 ) )
            // InternalGo.g:1593:3: ( rule__Import_spec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getGroup()); 
            }
            // InternalGo.g:1594:3: ( rule__Import_spec__Group__0 )
            // InternalGo.g:1594:4: rule__Import_spec__Group__0
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
    // InternalGo.g:1603:1: entryRuleImport_path : ruleImport_path EOF ;
    public final void entryRuleImport_path() throws RecognitionException {
        try {
            // InternalGo.g:1604:1: ( ruleImport_path EOF )
            // InternalGo.g:1605:1: ruleImport_path EOF
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
    // InternalGo.g:1612:1: ruleImport_path : ( ruleString_lit ) ;
    public final void ruleImport_path() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1616:2: ( ( ruleString_lit ) )
            // InternalGo.g:1617:2: ( ruleString_lit )
            {
            // InternalGo.g:1617:2: ( ruleString_lit )
            // InternalGo.g:1618:3: ruleString_lit
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
    // InternalGo.g:1627:1: rule__Program__Alternatives : ( ( ruleImport_decl ) | ( rulePackage_clause ) | ( ruleFunction_decl ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1631:1: ( ( ruleImport_decl ) | ( rulePackage_clause ) | ( ruleFunction_decl ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt3=1;
                }
                break;
            case 74:
                {
                alt3=2;
                }
                break;
            case 62:
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
                    // InternalGo.g:1632:2: ( ruleImport_decl )
                    {
                    // InternalGo.g:1632:2: ( ruleImport_decl )
                    // InternalGo.g:1633:3: ruleImport_decl
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
                    // InternalGo.g:1638:2: ( rulePackage_clause )
                    {
                    // InternalGo.g:1638:2: ( rulePackage_clause )
                    // InternalGo.g:1639:3: rulePackage_clause
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
                    // InternalGo.g:1644:2: ( ruleFunction_decl )
                    {
                    // InternalGo.g:1644:2: ( ruleFunction_decl )
                    // InternalGo.g:1645:3: ruleFunction_decl
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
    // InternalGo.g:1654:1: rule__OPERATORS__Alternatives : ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) );
    public final void rule__OPERATORS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1658:1: ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) )
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
                    // InternalGo.g:1659:2: ( RULE_BINARY_OP )
                    {
                    // InternalGo.g:1659:2: ( RULE_BINARY_OP )
                    // InternalGo.g:1660:3: RULE_BINARY_OP
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
                    // InternalGo.g:1665:2: ( '(' )
                    {
                    // InternalGo.g:1665:2: ( '(' )
                    // InternalGo.g:1666:3: '('
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
                    // InternalGo.g:1671:2: ( ')' )
                    {
                    // InternalGo.g:1671:2: ( ')' )
                    // InternalGo.g:1672:3: ')'
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
                    // InternalGo.g:1677:2: ( '[' )
                    {
                    // InternalGo.g:1677:2: ( '[' )
                    // InternalGo.g:1678:3: '['
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
                    // InternalGo.g:1683:2: ( ']' )
                    {
                    // InternalGo.g:1683:2: ( ']' )
                    // InternalGo.g:1684:3: ']'
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
                    // InternalGo.g:1689:2: ( '{' )
                    {
                    // InternalGo.g:1689:2: ( '{' )
                    // InternalGo.g:1690:3: '{'
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
                    // InternalGo.g:1695:2: ( '}' )
                    {
                    // InternalGo.g:1695:2: ( '}' )
                    // InternalGo.g:1696:3: '}'
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
                    // InternalGo.g:1701:2: ( '++' )
                    {
                    // InternalGo.g:1701:2: ( '++' )
                    // InternalGo.g:1702:3: '++'
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
                    // InternalGo.g:1707:2: ( '=' )
                    {
                    // InternalGo.g:1707:2: ( '=' )
                    // InternalGo.g:1708:3: '='
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
                    // InternalGo.g:1713:2: ( ':=' )
                    {
                    // InternalGo.g:1713:2: ( ':=' )
                    // InternalGo.g:1714:3: ':='
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
                    // InternalGo.g:1719:2: ( ',' )
                    {
                    // InternalGo.g:1719:2: ( ',' )
                    // InternalGo.g:1720:3: ','
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
                    // InternalGo.g:1725:2: ( RULE_SEMICOLON )
                    {
                    // InternalGo.g:1725:2: ( RULE_SEMICOLON )
                    // InternalGo.g:1726:3: RULE_SEMICOLON
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
                    // InternalGo.g:1731:2: ( '--' )
                    {
                    // InternalGo.g:1731:2: ( '--' )
                    // InternalGo.g:1732:3: '--'
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
                    // InternalGo.g:1737:2: ( '...' )
                    {
                    // InternalGo.g:1737:2: ( '...' )
                    // InternalGo.g:1738:3: '...'
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
                    // InternalGo.g:1743:2: ( '.' )
                    {
                    // InternalGo.g:1743:2: ( '.' )
                    // InternalGo.g:1744:3: '.'
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
                    // InternalGo.g:1749:2: ( ':' )
                    {
                    // InternalGo.g:1749:2: ( ':' )
                    // InternalGo.g:1750:3: ':'
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
                    // InternalGo.g:1755:2: ( RULE_ASSIGN_OP )
                    {
                    // InternalGo.g:1755:2: ( RULE_ASSIGN_OP )
                    // InternalGo.g:1756:3: RULE_ASSIGN_OP
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
    // InternalGo.g:1765:1: rule__Int_lit__Alternatives : ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) );
    public final void rule__Int_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1769:1: ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) )
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
                    // InternalGo.g:1770:2: ( RULE_INT )
                    {
                    // InternalGo.g:1770:2: ( RULE_INT )
                    // InternalGo.g:1771:3: RULE_INT
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
                    // InternalGo.g:1776:2: ( RULE_OCTAL_LIT )
                    {
                    // InternalGo.g:1776:2: ( RULE_OCTAL_LIT )
                    // InternalGo.g:1777:3: RULE_OCTAL_LIT
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
                    // InternalGo.g:1782:2: ( RULE_HEX_LIT )
                    {
                    // InternalGo.g:1782:2: ( RULE_HEX_LIT )
                    // InternalGo.g:1783:3: RULE_HEX_LIT
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
    // InternalGo.g:1792:1: rule__Float_lit__Alternatives_1 : ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) );
    public final void rule__Float_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1796:1: ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) )
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
                    // InternalGo.g:1797:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    {
                    // InternalGo.g:1797:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    // InternalGo.g:1798:3: ( rule__Float_lit__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloat_litAccess().getGroup_1_0()); 
                    }
                    // InternalGo.g:1799:3: ( rule__Float_lit__Group_1_0__0 )
                    // InternalGo.g:1799:4: rule__Float_lit__Group_1_0__0
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
                    // InternalGo.g:1803:2: ( ruleExponent )
                    {
                    // InternalGo.g:1803:2: ( ruleExponent )
                    // InternalGo.g:1804:3: ruleExponent
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
    // InternalGo.g:1813:1: rule__Exponent__Alternatives_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Exponent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1817:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalGo.g:1818:2: ( 'E' )
                    {
                    // InternalGo.g:1818:2: ( 'E' )
                    // InternalGo.g:1819:3: 'E'
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
                    // InternalGo.g:1824:2: ( 'e' )
                    {
                    // InternalGo.g:1824:2: ( 'e' )
                    // InternalGo.g:1825:3: 'e'
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
    // InternalGo.g:1834:1: rule__Exponent__Alternatives_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Exponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1838:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalGo.g:1839:2: ( '+' )
                    {
                    // InternalGo.g:1839:2: ( '+' )
                    // InternalGo.g:1840:3: '+'
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
                    // InternalGo.g:1845:2: ( '-' )
                    {
                    // InternalGo.g:1845:2: ( '-' )
                    // InternalGo.g:1846:3: '-'
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
    // InternalGo.g:1855:1: rule__Imaginary_lit__Alternatives_0 : ( ( RULE_INT ) | ( ruleFloat_lit ) );
    public final void rule__Imaginary_lit__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1859:1: ( ( RULE_INT ) | ( ruleFloat_lit ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==47||(LA9_1>=49 && LA9_1<=50)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==57) ) {
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
                    // InternalGo.g:1860:2: ( RULE_INT )
                    {
                    // InternalGo.g:1860:2: ( RULE_INT )
                    // InternalGo.g:1861:3: RULE_INT
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
                    // InternalGo.g:1866:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:1866:2: ( ruleFloat_lit )
                    // InternalGo.g:1867:3: ruleFloat_lit
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
    // InternalGo.g:1876:1: rule__Rune_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Rune_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1880:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
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
                    // InternalGo.g:1881:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:1881:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:1882:3: RULE_UNICODE_VALUE
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
                    // InternalGo.g:1887:2: ( ruleByte_value )
                    {
                    // InternalGo.g:1887:2: ( ruleByte_value )
                    // InternalGo.g:1888:3: ruleByte_value
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
    // InternalGo.g:1897:1: rule__Byte_value__Alternatives : ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) );
    public final void rule__Byte_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1901:1: ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) )
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
                    // InternalGo.g:1902:2: ( RULE_OCTAL_BYTE_VALUE )
                    {
                    // InternalGo.g:1902:2: ( RULE_OCTAL_BYTE_VALUE )
                    // InternalGo.g:1903:3: RULE_OCTAL_BYTE_VALUE
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
                    // InternalGo.g:1908:2: ( RULE_HEX_BYTE_VALUE )
                    {
                    // InternalGo.g:1908:2: ( RULE_HEX_BYTE_VALUE )
                    // InternalGo.g:1909:3: RULE_HEX_BYTE_VALUE
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
    // InternalGo.g:1918:1: rule__String_lit__Alternatives : ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) );
    public final void rule__String_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1922:1: ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_RAW_STRING_LIT) ) {
                alt12=1;
            }
            else if ( (LA12_0==59) ) {
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
                    // InternalGo.g:1923:2: ( RULE_RAW_STRING_LIT )
                    {
                    // InternalGo.g:1923:2: ( RULE_RAW_STRING_LIT )
                    // InternalGo.g:1924:3: RULE_RAW_STRING_LIT
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
                    // InternalGo.g:1929:2: ( ruleInterpreted_string_lit )
                    {
                    // InternalGo.g:1929:2: ( ruleInterpreted_string_lit )
                    // InternalGo.g:1930:3: ruleInterpreted_string_lit
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
    // InternalGo.g:1939:1: rule__Interpreted_string_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Interpreted_string_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1943:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
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
                    // InternalGo.g:1944:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:1944:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:1945:3: RULE_UNICODE_VALUE
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
                    // InternalGo.g:1950:2: ( ruleByte_value )
                    {
                    // InternalGo.g:1950:2: ( ruleByte_value )
                    // InternalGo.g:1951:3: ruleByte_value
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
    // InternalGo.g:1960:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );
    public final void rule__Literals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1964:1: ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) )
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1965:2: ( ruleInt_lit )
                    {
                    // InternalGo.g:1965:2: ( ruleInt_lit )
                    // InternalGo.g:1966:3: ruleInt_lit
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
                    // InternalGo.g:1971:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:1971:2: ( ruleFloat_lit )
                    // InternalGo.g:1972:3: ruleFloat_lit
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
                    // InternalGo.g:1977:2: ( ruleImaginary_lit )
                    {
                    // InternalGo.g:1977:2: ( ruleImaginary_lit )
                    // InternalGo.g:1978:3: ruleImaginary_lit
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
                    // InternalGo.g:1983:2: ( ruleRune_lit )
                    {
                    // InternalGo.g:1983:2: ( ruleRune_lit )
                    // InternalGo.g:1984:3: ruleRune_lit
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
                    // InternalGo.g:1989:2: ( ruleString_lit )
                    {
                    // InternalGo.g:1989:2: ( ruleString_lit )
                    // InternalGo.g:1990:3: ruleString_lit
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
    // InternalGo.g:1999:1: rule__Type__Alternatives : ( ( ruleType_name ) | ( ruleType_lit ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2003:1: ( ( ruleType_name ) | ( ruleType_lit ) | ( ( rule__Type__Group_2__0 ) ) )
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
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
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
                    // InternalGo.g:2004:2: ( ruleType_name )
                    {
                    // InternalGo.g:2004:2: ( ruleType_name )
                    // InternalGo.g:2005:3: ruleType_name
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
                    // InternalGo.g:2010:2: ( ruleType_lit )
                    {
                    // InternalGo.g:2010:2: ( ruleType_lit )
                    // InternalGo.g:2011:3: ruleType_lit
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
                    // InternalGo.g:2016:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalGo.g:2016:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalGo.g:2017:3: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // InternalGo.g:2018:3: ( rule__Type__Group_2__0 )
                    // InternalGo.g:2018:4: rule__Type__Group_2__0
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
    // InternalGo.g:2026:1: rule__Type_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Type_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2030:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENTIFIER) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==47) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EOF||LA16_1==RULE_SEMICOLON||(LA16_1>=RULE_RAW_STRING_LIT && LA16_1<=RULE_IDENTIFIER)||(LA16_1>=35 && LA16_1<=39)||LA16_1==42||LA16_1==44||(LA16_1>=53 && LA16_1<=55)||(LA16_1>=59 && LA16_1<=64)) ) {
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
                    // InternalGo.g:2031:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:2031:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:2032:3: RULE_IDENTIFIER
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
                    // InternalGo.g:2037:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:2037:2: ( ruleQualified_ident )
                    // InternalGo.g:2038:3: ruleQualified_ident
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
    // InternalGo.g:2047:1: rule__Type_lit__Alternatives : ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) );
    public final void rule__Type_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2051:1: ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalGo.g:2052:2: ( ruleArray_type )
                    {
                    // InternalGo.g:2052:2: ( ruleArray_type )
                    // InternalGo.g:2053:3: ruleArray_type
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
                    // InternalGo.g:2058:2: ( ruleStruct_type )
                    {
                    // InternalGo.g:2058:2: ( ruleStruct_type )
                    // InternalGo.g:2059:3: ruleStruct_type
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
                    // InternalGo.g:2064:2: ( rulePointer_type )
                    {
                    // InternalGo.g:2064:2: ( rulePointer_type )
                    // InternalGo.g:2065:3: rulePointer_type
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
                    // InternalGo.g:2070:2: ( ruleFunction_type )
                    {
                    // InternalGo.g:2070:2: ( ruleFunction_type )
                    // InternalGo.g:2071:3: ruleFunction_type
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
                    // InternalGo.g:2076:2: ( ruleSlice_type )
                    {
                    // InternalGo.g:2076:2: ( ruleSlice_type )
                    // InternalGo.g:2077:3: ruleSlice_type
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
                    // InternalGo.g:2082:2: ( ruleMap_type )
                    {
                    // InternalGo.g:2082:2: ( ruleMap_type )
                    // InternalGo.g:2083:3: ruleMap_type
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
                    // InternalGo.g:2088:2: ( ruleInterface_type )
                    {
                    // InternalGo.g:2088:2: ( ruleInterface_type )
                    // InternalGo.g:2089:3: ruleInterface_type
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
                    // InternalGo.g:2094:2: ( ruleChannel_type )
                    {
                    // InternalGo.g:2094:2: ( ruleChannel_type )
                    // InternalGo.g:2095:3: ruleChannel_type
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
    // InternalGo.g:2104:1: rule__Field_decl__Alternatives_0 : ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) );
    public final void rule__Field_decl__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2108:1: ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_IDENTIFIER) ) {
                alt18=1;
            }
            else if ( (LA18_0==61) ) {
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
                    // InternalGo.g:2109:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    {
                    // InternalGo.g:2109:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    // InternalGo.g:2110:3: ( rule__Field_decl__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declAccess().getGroup_0_0()); 
                    }
                    // InternalGo.g:2111:3: ( rule__Field_decl__Group_0_0__0 )
                    // InternalGo.g:2111:4: rule__Field_decl__Group_0_0__0
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
                    // InternalGo.g:2115:2: ( ruleEmbedded_field )
                    {
                    // InternalGo.g:2115:2: ( ruleEmbedded_field )
                    // InternalGo.g:2116:3: ruleEmbedded_field
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
    // InternalGo.g:2125:1: rule__Result__Alternatives : ( ( ruleParameters ) | ( ( ruleType ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2129:1: ( ( ruleParameters ) | ( ( ruleType ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalGo.g:2130:2: ( ruleParameters )
                    {
                    // InternalGo.g:2130:2: ( ruleParameters )
                    // InternalGo.g:2131:3: ruleParameters
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
                    // InternalGo.g:2136:2: ( ( ruleType ) )
                    {
                    // InternalGo.g:2136:2: ( ( ruleType ) )
                    // InternalGo.g:2137:3: ( ruleType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultAccess().getTypeParserRuleCall_1()); 
                    }
                    // InternalGo.g:2138:3: ( ruleType )
                    // InternalGo.g:2138:4: ruleType
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
    // InternalGo.g:2146:1: rule__Method_spec__Alternatives : ( ( ( rule__Method_spec__Group_0__0 ) ) | ( ruleType_name ) );
    public final void rule__Method_spec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2150:1: ( ( ( rule__Method_spec__Group_0__0 ) ) | ( ruleType_name ) )
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
                    // InternalGo.g:2151:2: ( ( rule__Method_spec__Group_0__0 ) )
                    {
                    // InternalGo.g:2151:2: ( ( rule__Method_spec__Group_0__0 ) )
                    // InternalGo.g:2152:3: ( rule__Method_spec__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_specAccess().getGroup_0()); 
                    }
                    // InternalGo.g:2153:3: ( rule__Method_spec__Group_0__0 )
                    // InternalGo.g:2153:4: rule__Method_spec__Group_0__0
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
                    // InternalGo.g:2157:2: ( ruleType_name )
                    {
                    // InternalGo.g:2157:2: ( ruleType_name )
                    // InternalGo.g:2158:3: ruleType_name
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
    // InternalGo.g:2167:1: rule__Channel_type__Alternatives_0 : ( ( 'chan' ) | ( 'chan<-' ) | ( '<-chan' ) );
    public final void rule__Channel_type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2171:1: ( ( 'chan' ) | ( 'chan<-' ) | ( '<-chan' ) )
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
                    // InternalGo.g:2172:2: ( 'chan' )
                    {
                    // InternalGo.g:2172:2: ( 'chan' )
                    // InternalGo.g:2173:3: 'chan'
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
                    // InternalGo.g:2178:2: ( 'chan<-' )
                    {
                    // InternalGo.g:2178:2: ( 'chan<-' )
                    // InternalGo.g:2179:3: 'chan<-'
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
                    // InternalGo.g:2184:2: ( '<-chan' )
                    {
                    // InternalGo.g:2184:2: ( '<-chan' )
                    // InternalGo.g:2185:3: '<-chan'
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
    // InternalGo.g:2194:1: rule__Const_decl__Alternatives : ( ( ( rule__Const_decl__Group_0__0 ) ) | ( ( rule__Const_decl__Group_1__0 ) ) );
    public final void rule__Const_decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2198:1: ( ( ( rule__Const_decl__Group_0__0 ) ) | ( ( rule__Const_decl__Group_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==65) ) {
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
                    // InternalGo.g:2199:2: ( ( rule__Const_decl__Group_0__0 ) )
                    {
                    // InternalGo.g:2199:2: ( ( rule__Const_decl__Group_0__0 ) )
                    // InternalGo.g:2200:3: ( rule__Const_decl__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_declAccess().getGroup_0()); 
                    }
                    // InternalGo.g:2201:3: ( rule__Const_decl__Group_0__0 )
                    // InternalGo.g:2201:4: rule__Const_decl__Group_0__0
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
                    // InternalGo.g:2205:2: ( ( rule__Const_decl__Group_1__0 ) )
                    {
                    // InternalGo.g:2205:2: ( ( rule__Const_decl__Group_1__0 ) )
                    // InternalGo.g:2206:3: ( rule__Const_decl__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_declAccess().getGroup_1()); 
                    }
                    // InternalGo.g:2207:3: ( rule__Const_decl__Group_1__0 )
                    // InternalGo.g:2207:4: rule__Const_decl__Group_1__0
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
    // InternalGo.g:2215:1: rule__Operand__Alternatives : ( ( ruleLiterals ) | ( ruleOperand_name ) | ( ( rule__Operand__Group_2__0 ) ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2219:1: ( ( ruleLiterals ) | ( ruleOperand_name ) | ( ( rule__Operand__Group_2__0 ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_OCTAL_LIT:
            case RULE_HEX_LIT:
            case RULE_RAW_STRING_LIT:
            case 58:
            case 59:
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
                    // InternalGo.g:2220:2: ( ruleLiterals )
                    {
                    // InternalGo.g:2220:2: ( ruleLiterals )
                    // InternalGo.g:2221:3: ruleLiterals
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
                    // InternalGo.g:2226:2: ( ruleOperand_name )
                    {
                    // InternalGo.g:2226:2: ( ruleOperand_name )
                    // InternalGo.g:2227:3: ruleOperand_name
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
                    // InternalGo.g:2232:2: ( ( rule__Operand__Group_2__0 ) )
                    {
                    // InternalGo.g:2232:2: ( ( rule__Operand__Group_2__0 ) )
                    // InternalGo.g:2233:3: ( rule__Operand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getGroup_2()); 
                    }
                    // InternalGo.g:2234:3: ( rule__Operand__Group_2__0 )
                    // InternalGo.g:2234:4: rule__Operand__Group_2__0
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
    // InternalGo.g:2242:1: rule__Operand_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Operand_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2246:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENTIFIER) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==47) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==RULE_BINARY_OP||(LA24_1>=RULE_INT && LA24_1<=RULE_HEX_LIT)||(LA24_1>=RULE_RAW_STRING_LIT && LA24_1<=RULE_UNARY_OP)||LA24_1==35||(LA24_1>=58 && LA24_1<=59)) ) {
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
                    // InternalGo.g:2247:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:2247:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:2248:3: RULE_IDENTIFIER
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
                    // InternalGo.g:2253:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:2253:2: ( ruleQualified_ident )
                    // InternalGo.g:2254:3: ruleQualified_ident
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
    // InternalGo.g:2263:1: rule__Unary_expr__Alternatives : ( ( rulePrimary_expr ) | ( RULE_UNARY_OP ) );
    public final void rule__Unary_expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2267:1: ( ( rulePrimary_expr ) | ( RULE_UNARY_OP ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_HEX_LIT)||(LA25_0>=RULE_RAW_STRING_LIT && LA25_0<=RULE_IDENTIFIER)||LA25_0==35||(LA25_0>=58 && LA25_0<=59)) ) {
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
                    // InternalGo.g:2268:2: ( rulePrimary_expr )
                    {
                    // InternalGo.g:2268:2: ( rulePrimary_expr )
                    // InternalGo.g:2269:3: rulePrimary_expr
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
                    // InternalGo.g:2274:2: ( RULE_UNARY_OP )
                    {
                    // InternalGo.g:2274:2: ( RULE_UNARY_OP )
                    // InternalGo.g:2275:3: RULE_UNARY_OP
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalGo.g:2284:1: rule__Statement__Alternatives : ( ( ruleDeclaration ) | ( ruleLabeled_stmt ) | ( ruleGo_stmt ) | ( ruleReturn_stmt ) | ( ruleBreak_stmt ) | ( ruleContinue_stmt ) | ( ruleGoto_stmt ) | ( 'fallthrough' ) | ( ruleBlock ) | ( ruleIf_stmt ) | ( ruleDefer_stmt ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2288:1: ( ( ruleDeclaration ) | ( ruleLabeled_stmt ) | ( ruleGo_stmt ) | ( ruleReturn_stmt ) | ( ruleBreak_stmt ) | ( ruleContinue_stmt ) | ( ruleGoto_stmt ) | ( 'fallthrough' ) | ( ruleBlock ) | ( ruleIf_stmt ) | ( ruleDefer_stmt ) )
            int alt26=11;
            switch ( input.LA(1) ) {
            case 35:
            case 65:
                {
                alt26=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt26=2;
                }
                break;
            case 68:
                {
                alt26=3;
                }
                break;
            case 69:
                {
                alt26=4;
                }
                break;
            case 70:
                {
                alt26=5;
                }
                break;
            case 71:
                {
                alt26=6;
                }
                break;
            case 72:
                {
                alt26=7;
                }
                break;
            case 56:
                {
                alt26=8;
                }
                break;
            case 39:
                {
                alt26=9;
                }
                break;
            case 66:
                {
                alt26=10;
                }
                break;
            case 73:
                {
                alt26=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalGo.g:2289:2: ( ruleDeclaration )
                    {
                    // InternalGo.g:2289:2: ( ruleDeclaration )
                    // InternalGo.g:2290:3: ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2295:2: ( ruleLabeled_stmt )
                    {
                    // InternalGo.g:2295:2: ( ruleLabeled_stmt )
                    // InternalGo.g:2296:3: ruleLabeled_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLabeled_stmtParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLabeled_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLabeled_stmtParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2301:2: ( ruleGo_stmt )
                    {
                    // InternalGo.g:2301:2: ( ruleGo_stmt )
                    // InternalGo.g:2302:3: ruleGo_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGo_stmtParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGo_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGo_stmtParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:2307:2: ( ruleReturn_stmt )
                    {
                    // InternalGo.g:2307:2: ( ruleReturn_stmt )
                    // InternalGo.g:2308:3: ruleReturn_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getReturn_stmtParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReturn_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getReturn_stmtParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:2313:2: ( ruleBreak_stmt )
                    {
                    // InternalGo.g:2313:2: ( ruleBreak_stmt )
                    // InternalGo.g:2314:3: ruleBreak_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBreak_stmtParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBreak_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getBreak_stmtParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:2319:2: ( ruleContinue_stmt )
                    {
                    // InternalGo.g:2319:2: ( ruleContinue_stmt )
                    // InternalGo.g:2320:3: ruleContinue_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getContinue_stmtParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleContinue_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getContinue_stmtParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:2325:2: ( ruleGoto_stmt )
                    {
                    // InternalGo.g:2325:2: ( ruleGoto_stmt )
                    // InternalGo.g:2326:3: ruleGoto_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGoto_stmtParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGoto_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGoto_stmtParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:2331:2: ( 'fallthrough' )
                    {
                    // InternalGo.g:2331:2: ( 'fallthrough' )
                    // InternalGo.g:2332:3: 'fallthrough'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getFallthroughKeyword_7()); 
                    }
                    match(input,56,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getFallthroughKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:2337:2: ( ruleBlock )
                    {
                    // InternalGo.g:2337:2: ( ruleBlock )
                    // InternalGo.g:2338:3: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:2343:2: ( ruleIf_stmt )
                    {
                    // InternalGo.g:2343:2: ( ruleIf_stmt )
                    // InternalGo.g:2344:3: ruleIf_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIf_stmtParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIf_stmtParserRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalGo.g:2349:2: ( ruleDefer_stmt )
                    {
                    // InternalGo.g:2349:2: ( ruleDefer_stmt )
                    // InternalGo.g:2350:3: ruleDefer_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDefer_stmtParserRuleCall_10()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDefer_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDefer_stmtParserRuleCall_10()); 
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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Simple_stmt__Alternatives"
    // InternalGo.g:2359:1: rule__Simple_stmt__Alternatives : ( ( ruleEmpty_stmt ) | ( ruleExpression_stmt ) );
    public final void rule__Simple_stmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2363:1: ( ( ruleEmpty_stmt ) | ( ruleExpression_stmt ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_WS) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_HEX_LIT)||(LA27_0>=RULE_RAW_STRING_LIT && LA27_0<=RULE_UNARY_OP)||LA27_0==35||(LA27_0>=58 && LA27_0<=59)) ) {
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
                    // InternalGo.g:2364:2: ( ruleEmpty_stmt )
                    {
                    // InternalGo.g:2364:2: ( ruleEmpty_stmt )
                    // InternalGo.g:2365:3: ruleEmpty_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_stmtAccess().getEmpty_stmtParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEmpty_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_stmtAccess().getEmpty_stmtParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2370:2: ( ruleExpression_stmt )
                    {
                    // InternalGo.g:2370:2: ( ruleExpression_stmt )
                    // InternalGo.g:2371:3: ruleExpression_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_stmtAccess().getExpression_stmtParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_stmtAccess().getExpression_stmtParserRuleCall_1()); 
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
    // $ANTLR end "rule__Simple_stmt__Alternatives"


    // $ANTLR start "rule__If_stmt__Alternatives_4_1"
    // InternalGo.g:2380:1: rule__If_stmt__Alternatives_4_1 : ( ( ruleIf_stmt ) | ( ruleBlock ) );
    public final void rule__If_stmt__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2384:1: ( ( ruleIf_stmt ) | ( ruleBlock ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:2385:2: ( ruleIf_stmt )
                    {
                    // InternalGo.g:2385:2: ( ruleIf_stmt )
                    // InternalGo.g:2386:3: ruleIf_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIf_stmtAccess().getIf_stmtParserRuleCall_4_1_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIf_stmtAccess().getIf_stmtParserRuleCall_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2391:2: ( ruleBlock )
                    {
                    // InternalGo.g:2391:2: ( ruleBlock )
                    // InternalGo.g:2392:3: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIf_stmtAccess().getBlockParserRuleCall_4_1_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIf_stmtAccess().getBlockParserRuleCall_4_1_1()); 
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
    // $ANTLR end "rule__If_stmt__Alternatives_4_1"


    // $ANTLR start "rule__Import_decl__Alternatives_1"
    // InternalGo.g:2401:1: rule__Import_decl__Alternatives_1 : ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) );
    public final void rule__Import_decl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2405:1: ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_RAW_STRING_LIT && LA29_0<=RULE_IDENTIFIER)||LA29_0==47||LA29_0==59) ) {
                alt29=1;
            }
            else if ( (LA29_0==35) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:2406:2: ( ruleImport_spec )
                    {
                    // InternalGo.g:2406:2: ( ruleImport_spec )
                    // InternalGo.g:2407:3: ruleImport_spec
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
                    // InternalGo.g:2412:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    {
                    // InternalGo.g:2412:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    // InternalGo.g:2413:3: ( rule__Import_decl__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_declAccess().getGroup_1_1()); 
                    }
                    // InternalGo.g:2414:3: ( rule__Import_decl__Group_1_1__0 )
                    // InternalGo.g:2414:4: rule__Import_decl__Group_1_1__0
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
    // InternalGo.g:2422:1: rule__Import_spec__Alternatives_0 : ( ( '.' ) | ( RULE_IDENTIFIER ) );
    public final void rule__Import_spec__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2426:1: ( ( '.' ) | ( RULE_IDENTIFIER ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_IDENTIFIER) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:2427:2: ( '.' )
                    {
                    // InternalGo.g:2427:2: ( '.' )
                    // InternalGo.g:2428:3: '.'
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
                    // InternalGo.g:2433:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:2433:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:2434:3: RULE_IDENTIFIER
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
    // InternalGo.g:2443:1: rule__Float_lit__Group__0 : rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 ;
    public final void rule__Float_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2447:1: ( rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 )
            // InternalGo.g:2448:2: rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1
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
    // InternalGo.g:2455:1: rule__Float_lit__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2459:1: ( ( RULE_INT ) )
            // InternalGo.g:2460:1: ( RULE_INT )
            {
            // InternalGo.g:2460:1: ( RULE_INT )
            // InternalGo.g:2461:2: RULE_INT
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
    // InternalGo.g:2470:1: rule__Float_lit__Group__1 : rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 ;
    public final void rule__Float_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2474:1: ( rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 )
            // InternalGo.g:2475:2: rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2
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
    // InternalGo.g:2482:1: rule__Float_lit__Group__1__Impl : ( ( rule__Float_lit__Alternatives_1 ) ) ;
    public final void rule__Float_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2486:1: ( ( ( rule__Float_lit__Alternatives_1 ) ) )
            // InternalGo.g:2487:1: ( ( rule__Float_lit__Alternatives_1 ) )
            {
            // InternalGo.g:2487:1: ( ( rule__Float_lit__Alternatives_1 ) )
            // InternalGo.g:2488:2: ( rule__Float_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2489:2: ( rule__Float_lit__Alternatives_1 )
            // InternalGo.g:2489:3: rule__Float_lit__Alternatives_1
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
    // InternalGo.g:2497:1: rule__Float_lit__Group__2 : rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 ;
    public final void rule__Float_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2501:1: ( rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 )
            // InternalGo.g:2502:2: rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3
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
    // InternalGo.g:2509:1: rule__Float_lit__Group__2__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2513:1: ( ( '.' ) )
            // InternalGo.g:2514:1: ( '.' )
            {
            // InternalGo.g:2514:1: ( '.' )
            // InternalGo.g:2515:2: '.'
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
    // InternalGo.g:2524:1: rule__Float_lit__Group__3 : rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 ;
    public final void rule__Float_lit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2528:1: ( rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 )
            // InternalGo.g:2529:2: rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4
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
    // InternalGo.g:2536:1: rule__Float_lit__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2540:1: ( ( RULE_INT ) )
            // InternalGo.g:2541:1: ( RULE_INT )
            {
            // InternalGo.g:2541:1: ( RULE_INT )
            // InternalGo.g:2542:2: RULE_INT
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
    // InternalGo.g:2551:1: rule__Float_lit__Group__4 : rule__Float_lit__Group__4__Impl ;
    public final void rule__Float_lit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2555:1: ( rule__Float_lit__Group__4__Impl )
            // InternalGo.g:2556:2: rule__Float_lit__Group__4__Impl
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
    // InternalGo.g:2562:1: rule__Float_lit__Group__4__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2566:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:2567:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:2567:1: ( ( ruleExponent )? )
            // InternalGo.g:2568:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4()); 
            }
            // InternalGo.g:2569:2: ( ruleExponent )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=49 && LA31_0<=50)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGo.g:2569:3: ruleExponent
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
    // InternalGo.g:2578:1: rule__Float_lit__Group_1_0__0 : rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 ;
    public final void rule__Float_lit__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2582:1: ( rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 )
            // InternalGo.g:2583:2: rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1
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
    // InternalGo.g:2590:1: rule__Float_lit__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2594:1: ( ( '.' ) )
            // InternalGo.g:2595:1: ( '.' )
            {
            // InternalGo.g:2595:1: ( '.' )
            // InternalGo.g:2596:2: '.'
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
    // InternalGo.g:2605:1: rule__Float_lit__Group_1_0__1 : rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 ;
    public final void rule__Float_lit__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2609:1: ( rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 )
            // InternalGo.g:2610:2: rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2
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
    // InternalGo.g:2617:1: rule__Float_lit__Group_1_0__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Float_lit__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2621:1: ( ( ( RULE_INT )? ) )
            // InternalGo.g:2622:1: ( ( RULE_INT )? )
            {
            // InternalGo.g:2622:1: ( ( RULE_INT )? )
            // InternalGo.g:2623:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1()); 
            }
            // InternalGo.g:2624:2: ( RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:2624:3: RULE_INT
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
    // InternalGo.g:2632:1: rule__Float_lit__Group_1_0__2 : rule__Float_lit__Group_1_0__2__Impl ;
    public final void rule__Float_lit__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2636:1: ( rule__Float_lit__Group_1_0__2__Impl )
            // InternalGo.g:2637:2: rule__Float_lit__Group_1_0__2__Impl
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
    // InternalGo.g:2643:1: rule__Float_lit__Group_1_0__2__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2647:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:2648:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:2648:1: ( ( ruleExponent )? )
            // InternalGo.g:2649:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2()); 
            }
            // InternalGo.g:2650:2: ( ruleExponent )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=49 && LA33_0<=50)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:2650:3: ruleExponent
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
    // InternalGo.g:2659:1: rule__Exponent__Group__0 : rule__Exponent__Group__0__Impl rule__Exponent__Group__1 ;
    public final void rule__Exponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2663:1: ( rule__Exponent__Group__0__Impl rule__Exponent__Group__1 )
            // InternalGo.g:2664:2: rule__Exponent__Group__0__Impl rule__Exponent__Group__1
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
    // InternalGo.g:2671:1: rule__Exponent__Group__0__Impl : ( ( rule__Exponent__Alternatives_0 ) ) ;
    public final void rule__Exponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2675:1: ( ( ( rule__Exponent__Alternatives_0 ) ) )
            // InternalGo.g:2676:1: ( ( rule__Exponent__Alternatives_0 ) )
            {
            // InternalGo.g:2676:1: ( ( rule__Exponent__Alternatives_0 ) )
            // InternalGo.g:2677:2: ( rule__Exponent__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_0()); 
            }
            // InternalGo.g:2678:2: ( rule__Exponent__Alternatives_0 )
            // InternalGo.g:2678:3: rule__Exponent__Alternatives_0
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
    // InternalGo.g:2686:1: rule__Exponent__Group__1 : rule__Exponent__Group__1__Impl rule__Exponent__Group__2 ;
    public final void rule__Exponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2690:1: ( rule__Exponent__Group__1__Impl rule__Exponent__Group__2 )
            // InternalGo.g:2691:2: rule__Exponent__Group__1__Impl rule__Exponent__Group__2
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
    // InternalGo.g:2698:1: rule__Exponent__Group__1__Impl : ( ( rule__Exponent__Alternatives_1 )? ) ;
    public final void rule__Exponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2702:1: ( ( ( rule__Exponent__Alternatives_1 )? ) )
            // InternalGo.g:2703:1: ( ( rule__Exponent__Alternatives_1 )? )
            {
            // InternalGo.g:2703:1: ( ( rule__Exponent__Alternatives_1 )? )
            // InternalGo.g:2704:2: ( rule__Exponent__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2705:2: ( rule__Exponent__Alternatives_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=51 && LA34_0<=52)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:2705:3: rule__Exponent__Alternatives_1
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
    // InternalGo.g:2713:1: rule__Exponent__Group__2 : rule__Exponent__Group__2__Impl ;
    public final void rule__Exponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2717:1: ( rule__Exponent__Group__2__Impl )
            // InternalGo.g:2718:2: rule__Exponent__Group__2__Impl
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
    // InternalGo.g:2724:1: rule__Exponent__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Exponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2728:1: ( ( RULE_INT ) )
            // InternalGo.g:2729:1: ( RULE_INT )
            {
            // InternalGo.g:2729:1: ( RULE_INT )
            // InternalGo.g:2730:2: RULE_INT
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
    // InternalGo.g:2740:1: rule__Imaginary_lit__Group__0 : rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 ;
    public final void rule__Imaginary_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2744:1: ( rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 )
            // InternalGo.g:2745:2: rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1
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
    // InternalGo.g:2752:1: rule__Imaginary_lit__Group__0__Impl : ( ( rule__Imaginary_lit__Alternatives_0 ) ) ;
    public final void rule__Imaginary_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2756:1: ( ( ( rule__Imaginary_lit__Alternatives_0 ) ) )
            // InternalGo.g:2757:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            {
            // InternalGo.g:2757:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            // InternalGo.g:2758:2: ( rule__Imaginary_lit__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getAlternatives_0()); 
            }
            // InternalGo.g:2759:2: ( rule__Imaginary_lit__Alternatives_0 )
            // InternalGo.g:2759:3: rule__Imaginary_lit__Alternatives_0
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
    // InternalGo.g:2767:1: rule__Imaginary_lit__Group__1 : rule__Imaginary_lit__Group__1__Impl ;
    public final void rule__Imaginary_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2771:1: ( rule__Imaginary_lit__Group__1__Impl )
            // InternalGo.g:2772:2: rule__Imaginary_lit__Group__1__Impl
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
    // InternalGo.g:2778:1: rule__Imaginary_lit__Group__1__Impl : ( 'i' ) ;
    public final void rule__Imaginary_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2782:1: ( ( 'i' ) )
            // InternalGo.g:2783:1: ( 'i' )
            {
            // InternalGo.g:2783:1: ( 'i' )
            // InternalGo.g:2784:2: 'i'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getIKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2794:1: rule__Rune_lit__Group__0 : rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 ;
    public final void rule__Rune_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2798:1: ( rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 )
            // InternalGo.g:2799:2: rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1
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
    // InternalGo.g:2806:1: rule__Rune_lit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2810:1: ( ( '\\'' ) )
            // InternalGo.g:2811:1: ( '\\'' )
            {
            // InternalGo.g:2811:1: ( '\\'' )
            // InternalGo.g:2812:2: '\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getApostropheKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2821:1: rule__Rune_lit__Group__1 : rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 ;
    public final void rule__Rune_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2825:1: ( rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 )
            // InternalGo.g:2826:2: rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2
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
    // InternalGo.g:2833:1: rule__Rune_lit__Group__1__Impl : ( ( rule__Rune_lit__Alternatives_1 ) ) ;
    public final void rule__Rune_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2837:1: ( ( ( rule__Rune_lit__Alternatives_1 ) ) )
            // InternalGo.g:2838:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            {
            // InternalGo.g:2838:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            // InternalGo.g:2839:2: ( rule__Rune_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2840:2: ( rule__Rune_lit__Alternatives_1 )
            // InternalGo.g:2840:3: rule__Rune_lit__Alternatives_1
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
    // InternalGo.g:2848:1: rule__Rune_lit__Group__2 : rule__Rune_lit__Group__2__Impl ;
    public final void rule__Rune_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2852:1: ( rule__Rune_lit__Group__2__Impl )
            // InternalGo.g:2853:2: rule__Rune_lit__Group__2__Impl
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
    // InternalGo.g:2859:1: rule__Rune_lit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2863:1: ( ( '\\'' ) )
            // InternalGo.g:2864:1: ( '\\'' )
            {
            // InternalGo.g:2864:1: ( '\\'' )
            // InternalGo.g:2865:2: '\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getApostropheKeyword_2()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2875:1: rule__Interpreted_string_lit__Group__0 : rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 ;
    public final void rule__Interpreted_string_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2879:1: ( rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 )
            // InternalGo.g:2880:2: rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1
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
    // InternalGo.g:2887:1: rule__Interpreted_string_lit__Group__0__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2891:1: ( ( '\"' ) )
            // InternalGo.g:2892:1: ( '\"' )
            {
            // InternalGo.g:2892:1: ( '\"' )
            // InternalGo.g:2893:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2902:1: rule__Interpreted_string_lit__Group__1 : rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 ;
    public final void rule__Interpreted_string_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2906:1: ( rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 )
            // InternalGo.g:2907:2: rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2
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
    // InternalGo.g:2914:1: rule__Interpreted_string_lit__Group__1__Impl : ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) ;
    public final void rule__Interpreted_string_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2918:1: ( ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) )
            // InternalGo.g:2919:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            {
            // InternalGo.g:2919:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            // InternalGo.g:2920:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2921:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_UNICODE_VALUE && LA35_0<=RULE_HEX_BYTE_VALUE)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGo.g:2921:3: rule__Interpreted_string_lit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interpreted_string_lit__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalGo.g:2929:1: rule__Interpreted_string_lit__Group__2 : rule__Interpreted_string_lit__Group__2__Impl ;
    public final void rule__Interpreted_string_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2933:1: ( rule__Interpreted_string_lit__Group__2__Impl )
            // InternalGo.g:2934:2: rule__Interpreted_string_lit__Group__2__Impl
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
    // InternalGo.g:2940:1: rule__Interpreted_string_lit__Group__2__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2944:1: ( ( '\"' ) )
            // InternalGo.g:2945:1: ( '\"' )
            {
            // InternalGo.g:2945:1: ( '\"' )
            // InternalGo.g:2946:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2956:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2960:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalGo.g:2961:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalGo.g:2968:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2972:1: ( ( '(' ) )
            // InternalGo.g:2973:1: ( '(' )
            {
            // InternalGo.g:2973:1: ( '(' )
            // InternalGo.g:2974:2: '('
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
    // InternalGo.g:2983:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2987:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalGo.g:2988:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalGo.g:2995:1: rule__Type__Group_2__1__Impl : ( ruleType ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2999:1: ( ( ruleType ) )
            // InternalGo.g:3000:1: ( ruleType )
            {
            // InternalGo.g:3000:1: ( ruleType )
            // InternalGo.g:3001:2: ruleType
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
    // InternalGo.g:3010:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3014:1: ( rule__Type__Group_2__2__Impl )
            // InternalGo.g:3015:2: rule__Type__Group_2__2__Impl
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
    // InternalGo.g:3021:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3025:1: ( ( ')' ) )
            // InternalGo.g:3026:1: ( ')' )
            {
            // InternalGo.g:3026:1: ( ')' )
            // InternalGo.g:3027:2: ')'
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
    // InternalGo.g:3037:1: rule__Array_type__Group__0 : rule__Array_type__Group__0__Impl rule__Array_type__Group__1 ;
    public final void rule__Array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3041:1: ( rule__Array_type__Group__0__Impl rule__Array_type__Group__1 )
            // InternalGo.g:3042:2: rule__Array_type__Group__0__Impl rule__Array_type__Group__1
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
    // InternalGo.g:3049:1: rule__Array_type__Group__0__Impl : ( '[' ) ;
    public final void rule__Array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3053:1: ( ( '[' ) )
            // InternalGo.g:3054:1: ( '[' )
            {
            // InternalGo.g:3054:1: ( '[' )
            // InternalGo.g:3055:2: '['
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
    // InternalGo.g:3064:1: rule__Array_type__Group__1 : rule__Array_type__Group__1__Impl rule__Array_type__Group__2 ;
    public final void rule__Array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3068:1: ( rule__Array_type__Group__1__Impl rule__Array_type__Group__2 )
            // InternalGo.g:3069:2: rule__Array_type__Group__1__Impl rule__Array_type__Group__2
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
    // InternalGo.g:3076:1: rule__Array_type__Group__1__Impl : ( ( ruleParameter_list ) ) ;
    public final void rule__Array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3080:1: ( ( ( ruleParameter_list ) ) )
            // InternalGo.g:3081:1: ( ( ruleParameter_list ) )
            {
            // InternalGo.g:3081:1: ( ( ruleParameter_list ) )
            // InternalGo.g:3082:2: ( ruleParameter_list )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getParameter_listParserRuleCall_1()); 
            }
            // InternalGo.g:3083:2: ( ruleParameter_list )
            // InternalGo.g:3083:3: ruleParameter_list
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
    // InternalGo.g:3091:1: rule__Array_type__Group__2 : rule__Array_type__Group__2__Impl rule__Array_type__Group__3 ;
    public final void rule__Array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3095:1: ( rule__Array_type__Group__2__Impl rule__Array_type__Group__3 )
            // InternalGo.g:3096:2: rule__Array_type__Group__2__Impl rule__Array_type__Group__3
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
    // InternalGo.g:3103:1: rule__Array_type__Group__2__Impl : ( ']' ) ;
    public final void rule__Array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3107:1: ( ( ']' ) )
            // InternalGo.g:3108:1: ( ']' )
            {
            // InternalGo.g:3108:1: ( ']' )
            // InternalGo.g:3109:2: ']'
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
    // InternalGo.g:3118:1: rule__Array_type__Group__3 : rule__Array_type__Group__3__Impl ;
    public final void rule__Array_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3122:1: ( rule__Array_type__Group__3__Impl )
            // InternalGo.g:3123:2: rule__Array_type__Group__3__Impl
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
    // InternalGo.g:3129:1: rule__Array_type__Group__3__Impl : ( ruleType ) ;
    public final void rule__Array_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3133:1: ( ( ruleType ) )
            // InternalGo.g:3134:1: ( ruleType )
            {
            // InternalGo.g:3134:1: ( ruleType )
            // InternalGo.g:3135:2: ruleType
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
    // InternalGo.g:3145:1: rule__Struct_type__Group__0 : rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 ;
    public final void rule__Struct_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3149:1: ( rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 )
            // InternalGo.g:3150:2: rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1
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
    // InternalGo.g:3157:1: rule__Struct_type__Group__0__Impl : ( 'struct' ) ;
    public final void rule__Struct_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3161:1: ( ( 'struct' ) )
            // InternalGo.g:3162:1: ( 'struct' )
            {
            // InternalGo.g:3162:1: ( 'struct' )
            // InternalGo.g:3163:2: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getStructKeyword_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:3172:1: rule__Struct_type__Group__1 : rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 ;
    public final void rule__Struct_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3176:1: ( rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 )
            // InternalGo.g:3177:2: rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2
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
    // InternalGo.g:3184:1: rule__Struct_type__Group__1__Impl : ( '{' ) ;
    public final void rule__Struct_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3188:1: ( ( '{' ) )
            // InternalGo.g:3189:1: ( '{' )
            {
            // InternalGo.g:3189:1: ( '{' )
            // InternalGo.g:3190:2: '{'
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
    // InternalGo.g:3199:1: rule__Struct_type__Group__2 : rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 ;
    public final void rule__Struct_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3203:1: ( rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 )
            // InternalGo.g:3204:2: rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3
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
    // InternalGo.g:3211:1: rule__Struct_type__Group__2__Impl : ( ( rule__Struct_type__Group_2__0 )* ) ;
    public final void rule__Struct_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3215:1: ( ( ( rule__Struct_type__Group_2__0 )* ) )
            // InternalGo.g:3216:1: ( ( rule__Struct_type__Group_2__0 )* )
            {
            // InternalGo.g:3216:1: ( ( rule__Struct_type__Group_2__0 )* )
            // InternalGo.g:3217:2: ( rule__Struct_type__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getGroup_2()); 
            }
            // InternalGo.g:3218:2: ( rule__Struct_type__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_IDENTIFIER||LA36_0==61) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:3218:3: rule__Struct_type__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Struct_type__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalGo.g:3226:1: rule__Struct_type__Group__3 : rule__Struct_type__Group__3__Impl ;
    public final void rule__Struct_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3230:1: ( rule__Struct_type__Group__3__Impl )
            // InternalGo.g:3231:2: rule__Struct_type__Group__3__Impl
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
    // InternalGo.g:3237:1: rule__Struct_type__Group__3__Impl : ( '}' ) ;
    public final void rule__Struct_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3241:1: ( ( '}' ) )
            // InternalGo.g:3242:1: ( '}' )
            {
            // InternalGo.g:3242:1: ( '}' )
            // InternalGo.g:3243:2: '}'
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
    // InternalGo.g:3253:1: rule__Struct_type__Group_2__0 : rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 ;
    public final void rule__Struct_type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3257:1: ( rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 )
            // InternalGo.g:3258:2: rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1
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
    // InternalGo.g:3265:1: rule__Struct_type__Group_2__0__Impl : ( ruleField_decl ) ;
    public final void rule__Struct_type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3269:1: ( ( ruleField_decl ) )
            // InternalGo.g:3270:1: ( ruleField_decl )
            {
            // InternalGo.g:3270:1: ( ruleField_decl )
            // InternalGo.g:3271:2: ruleField_decl
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
    // InternalGo.g:3280:1: rule__Struct_type__Group_2__1 : rule__Struct_type__Group_2__1__Impl ;
    public final void rule__Struct_type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3284:1: ( rule__Struct_type__Group_2__1__Impl )
            // InternalGo.g:3285:2: rule__Struct_type__Group_2__1__Impl
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
    // InternalGo.g:3291:1: rule__Struct_type__Group_2__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Struct_type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3295:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:3296:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:3296:1: ( RULE_SEMICOLON )
            // InternalGo.g:3297:2: RULE_SEMICOLON
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
    // InternalGo.g:3307:1: rule__Field_decl__Group__0 : rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 ;
    public final void rule__Field_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3311:1: ( rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 )
            // InternalGo.g:3312:2: rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1
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
    // InternalGo.g:3319:1: rule__Field_decl__Group__0__Impl : ( ( rule__Field_decl__Alternatives_0 ) ) ;
    public final void rule__Field_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3323:1: ( ( ( rule__Field_decl__Alternatives_0 ) ) )
            // InternalGo.g:3324:1: ( ( rule__Field_decl__Alternatives_0 ) )
            {
            // InternalGo.g:3324:1: ( ( rule__Field_decl__Alternatives_0 ) )
            // InternalGo.g:3325:2: ( rule__Field_decl__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getAlternatives_0()); 
            }
            // InternalGo.g:3326:2: ( rule__Field_decl__Alternatives_0 )
            // InternalGo.g:3326:3: rule__Field_decl__Alternatives_0
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
    // InternalGo.g:3334:1: rule__Field_decl__Group__1 : rule__Field_decl__Group__1__Impl ;
    public final void rule__Field_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3338:1: ( rule__Field_decl__Group__1__Impl )
            // InternalGo.g:3339:2: rule__Field_decl__Group__1__Impl
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
    // InternalGo.g:3345:1: rule__Field_decl__Group__1__Impl : ( ( ruleString_lit )? ) ;
    public final void rule__Field_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3349:1: ( ( ( ruleString_lit )? ) )
            // InternalGo.g:3350:1: ( ( ruleString_lit )? )
            {
            // InternalGo.g:3350:1: ( ( ruleString_lit )? )
            // InternalGo.g:3351:2: ( ruleString_lit )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getString_litParserRuleCall_1()); 
            }
            // InternalGo.g:3352:2: ( ruleString_lit )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_RAW_STRING_LIT||LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGo.g:3352:3: ruleString_lit
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
    // InternalGo.g:3361:1: rule__Field_decl__Group_0_0__0 : rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 ;
    public final void rule__Field_decl__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3365:1: ( rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 )
            // InternalGo.g:3366:2: rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1
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
    // InternalGo.g:3373:1: rule__Field_decl__Group_0_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Field_decl__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3377:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:3378:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:3378:1: ( ruleIdentifier_list )
            // InternalGo.g:3379:2: ruleIdentifier_list
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
    // InternalGo.g:3388:1: rule__Field_decl__Group_0_0__1 : rule__Field_decl__Group_0_0__1__Impl ;
    public final void rule__Field_decl__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3392:1: ( rule__Field_decl__Group_0_0__1__Impl )
            // InternalGo.g:3393:2: rule__Field_decl__Group_0_0__1__Impl
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
    // InternalGo.g:3399:1: rule__Field_decl__Group_0_0__1__Impl : ( ruleType ) ;
    public final void rule__Field_decl__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3403:1: ( ( ruleType ) )
            // InternalGo.g:3404:1: ( ruleType )
            {
            // InternalGo.g:3404:1: ( ruleType )
            // InternalGo.g:3405:2: ruleType
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
    // InternalGo.g:3415:1: rule__Embedded_field__Group__0 : rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 ;
    public final void rule__Embedded_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3419:1: ( rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 )
            // InternalGo.g:3420:2: rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1
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
    // InternalGo.g:3427:1: rule__Embedded_field__Group__0__Impl : ( ( ( '*' ) ) ( ( '*' )* ) ) ;
    public final void rule__Embedded_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3431:1: ( ( ( ( '*' ) ) ( ( '*' )* ) ) )
            // InternalGo.g:3432:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            {
            // InternalGo.g:3432:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            // InternalGo.g:3433:2: ( ( '*' ) ) ( ( '*' )* )
            {
            // InternalGo.g:3433:2: ( ( '*' ) )
            // InternalGo.g:3434:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:3435:3: ( '*' )
            // InternalGo.g:3435:4: '*'
            {
            match(input,61,FOLLOW_25); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }

            }

            // InternalGo.g:3438:2: ( ( '*' )* )
            // InternalGo.g:3439:3: ( '*' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:3440:3: ( '*' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==61) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGo.g:3440:4: '*'
            	    {
            	    match(input,61,FOLLOW_25); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalGo.g:3449:1: rule__Embedded_field__Group__1 : rule__Embedded_field__Group__1__Impl ;
    public final void rule__Embedded_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3453:1: ( rule__Embedded_field__Group__1__Impl )
            // InternalGo.g:3454:2: rule__Embedded_field__Group__1__Impl
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
    // InternalGo.g:3460:1: rule__Embedded_field__Group__1__Impl : ( ruleType_name ) ;
    public final void rule__Embedded_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3464:1: ( ( ruleType_name ) )
            // InternalGo.g:3465:1: ( ruleType_name )
            {
            // InternalGo.g:3465:1: ( ruleType_name )
            // InternalGo.g:3466:2: ruleType_name
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
    // InternalGo.g:3476:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3480:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalGo.g:3481:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
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
    // InternalGo.g:3488:1: rule__Pointer_type__Group__0__Impl : ( '*' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3492:1: ( ( '*' ) )
            // InternalGo.g:3493:1: ( '*' )
            {
            // InternalGo.g:3493:1: ( '*' )
            // InternalGo.g:3494:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getAsteriskKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:3503:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3507:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalGo.g:3508:2: rule__Pointer_type__Group__1__Impl
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
    // InternalGo.g:3514:1: rule__Pointer_type__Group__1__Impl : ( ruleType ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3518:1: ( ( ruleType ) )
            // InternalGo.g:3519:1: ( ruleType )
            {
            // InternalGo.g:3519:1: ( ruleType )
            // InternalGo.g:3520:2: ruleType
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
    // InternalGo.g:3530:1: rule__Function_type__Group__0 : rule__Function_type__Group__0__Impl rule__Function_type__Group__1 ;
    public final void rule__Function_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3534:1: ( rule__Function_type__Group__0__Impl rule__Function_type__Group__1 )
            // InternalGo.g:3535:2: rule__Function_type__Group__0__Impl rule__Function_type__Group__1
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
    // InternalGo.g:3542:1: rule__Function_type__Group__0__Impl : ( 'func' ) ;
    public final void rule__Function_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3546:1: ( ( 'func' ) )
            // InternalGo.g:3547:1: ( 'func' )
            {
            // InternalGo.g:3547:1: ( 'func' )
            // InternalGo.g:3548:2: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_typeAccess().getFuncKeyword_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:3557:1: rule__Function_type__Group__1 : rule__Function_type__Group__1__Impl ;
    public final void rule__Function_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3561:1: ( rule__Function_type__Group__1__Impl )
            // InternalGo.g:3562:2: rule__Function_type__Group__1__Impl
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
    // InternalGo.g:3568:1: rule__Function_type__Group__1__Impl : ( ruleSignature ) ;
    public final void rule__Function_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3572:1: ( ( ruleSignature ) )
            // InternalGo.g:3573:1: ( ruleSignature )
            {
            // InternalGo.g:3573:1: ( ruleSignature )
            // InternalGo.g:3574:2: ruleSignature
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
    // InternalGo.g:3584:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3588:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalGo.g:3589:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalGo.g:3596:1: rule__Signature__Group__0__Impl : ( ruleParameters ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3600:1: ( ( ruleParameters ) )
            // InternalGo.g:3601:1: ( ruleParameters )
            {
            // InternalGo.g:3601:1: ( ruleParameters )
            // InternalGo.g:3602:2: ruleParameters
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
    // InternalGo.g:3611:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3615:1: ( rule__Signature__Group__1__Impl )
            // InternalGo.g:3616:2: rule__Signature__Group__1__Impl
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
    // InternalGo.g:3622:1: rule__Signature__Group__1__Impl : ( ( ( ruleResult ) ) ( ( ruleResult )* ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3626:1: ( ( ( ( ruleResult ) ) ( ( ruleResult )* ) ) )
            // InternalGo.g:3627:1: ( ( ( ruleResult ) ) ( ( ruleResult )* ) )
            {
            // InternalGo.g:3627:1: ( ( ( ruleResult ) ) ( ( ruleResult )* ) )
            // InternalGo.g:3628:2: ( ( ruleResult ) ) ( ( ruleResult )* )
            {
            // InternalGo.g:3628:2: ( ( ruleResult ) )
            // InternalGo.g:3629:3: ( ruleResult )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
            }
            // InternalGo.g:3630:3: ( ruleResult )
            // InternalGo.g:3630:4: ruleResult
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

            // InternalGo.g:3633:2: ( ( ruleResult )* )
            // InternalGo.g:3634:3: ( ruleResult )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
            }
            // InternalGo.g:3635:3: ( ruleResult )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:3635:4: ruleResult
            	    {
            	    pushFollow(FOLLOW_27);
            	    ruleResult();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalGo.g:3645:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3649:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalGo.g:3650:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
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
    // InternalGo.g:3657:1: rule__Parameters__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3661:1: ( ( '(' ) )
            // InternalGo.g:3662:1: ( '(' )
            {
            // InternalGo.g:3662:1: ( '(' )
            // InternalGo.g:3663:2: '('
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
    // InternalGo.g:3672:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3676:1: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
            // InternalGo.g:3677:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
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
    // InternalGo.g:3684:1: rule__Parameters__Group__1__Impl : ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3688:1: ( ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) ) )
            // InternalGo.g:3689:1: ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) )
            {
            // InternalGo.g:3689:1: ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalGo.g:3690:2: ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalGo.g:3690:2: ( ( rule__Parameters__Group_1__0 ) )
            // InternalGo.g:3691:3: ( rule__Parameters__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup_1()); 
            }
            // InternalGo.g:3692:3: ( rule__Parameters__Group_1__0 )
            // InternalGo.g:3692:4: rule__Parameters__Group_1__0
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

            // InternalGo.g:3695:2: ( ( rule__Parameters__Group_1__0 )* )
            // InternalGo.g:3696:3: ( rule__Parameters__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup_1()); 
            }
            // InternalGo.g:3697:3: ( rule__Parameters__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_IDENTIFIER||LA40_0==35||LA40_0==37||LA40_0==46||(LA40_0>=53 && LA40_0<=55)||(LA40_0>=60 && LA40_0<=64)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGo.g:3697:4: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalGo.g:3706:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl ;
    public final void rule__Parameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3710:1: ( rule__Parameters__Group__2__Impl )
            // InternalGo.g:3711:2: rule__Parameters__Group__2__Impl
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
    // InternalGo.g:3717:1: rule__Parameters__Group__2__Impl : ( ')' ) ;
    public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3721:1: ( ( ')' ) )
            // InternalGo.g:3722:1: ( ')' )
            {
            // InternalGo.g:3722:1: ( ')' )
            // InternalGo.g:3723:2: ')'
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
    // InternalGo.g:3733:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3737:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalGo.g:3738:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
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
    // InternalGo.g:3745:1: rule__Parameters__Group_1__0__Impl : ( ( ruleParameter_list ) ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3749:1: ( ( ( ruleParameter_list ) ) )
            // InternalGo.g:3750:1: ( ( ruleParameter_list ) )
            {
            // InternalGo.g:3750:1: ( ( ruleParameter_list ) )
            // InternalGo.g:3751:2: ( ruleParameter_list )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getParameter_listParserRuleCall_1_0()); 
            }
            // InternalGo.g:3752:2: ( ruleParameter_list )
            // InternalGo.g:3752:3: ruleParameter_list
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
    // InternalGo.g:3760:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3764:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalGo.g:3765:2: rule__Parameters__Group_1__1__Impl
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
    // InternalGo.g:3771:1: rule__Parameters__Group_1__1__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3775:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalGo.g:3776:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalGo.g:3776:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalGo.g:3777:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalGo.g:3777:2: ( ( ',' ) )
            // InternalGo.g:3778:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }
            // InternalGo.g:3779:3: ( ',' )
            // InternalGo.g:3779:4: ','
            {
            match(input,44,FOLLOW_30); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }

            }

            // InternalGo.g:3782:2: ( ( ',' )* )
            // InternalGo.g:3783:3: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }
            // InternalGo.g:3784:3: ( ',' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==44) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGo.g:3784:4: ','
            	    {
            	    match(input,44,FOLLOW_30); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalGo.g:3794:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3798:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // InternalGo.g:3799:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
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
    // InternalGo.g:3806:1: rule__Parameter_list__Group__0__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3810:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:3811:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:3811:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:3812:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0()); 
            }
            // InternalGo.g:3813:2: ( ruleParameter_decl )
            // InternalGo.g:3813:3: ruleParameter_decl
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
    // InternalGo.g:3821:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3825:1: ( rule__Parameter_list__Group__1__Impl )
            // InternalGo.g:3826:2: rule__Parameter_list__Group__1__Impl
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
    // InternalGo.g:3832:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3836:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // InternalGo.g:3837:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // InternalGo.g:3837:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // InternalGo.g:3838:2: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // InternalGo.g:3839:2: ( rule__Parameter_list__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==44) ) {
                    int LA42_3 = input.LA(2);

                    if ( (synpred80_InternalGo()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalGo.g:3839:3: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalGo.g:3848:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3852:1: ( rule__Parameter_list__Group_1__0__Impl )
            // InternalGo.g:3853:2: rule__Parameter_list__Group_1__0__Impl
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
    // InternalGo.g:3859:1: rule__Parameter_list__Group_1__0__Impl : ( ( rule__Parameter_list__Group_1_0__0 ) ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3863:1: ( ( ( rule__Parameter_list__Group_1_0__0 ) ) )
            // InternalGo.g:3864:1: ( ( rule__Parameter_list__Group_1_0__0 ) )
            {
            // InternalGo.g:3864:1: ( ( rule__Parameter_list__Group_1_0__0 ) )
            // InternalGo.g:3865:2: ( rule__Parameter_list__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1_0()); 
            }
            // InternalGo.g:3866:2: ( rule__Parameter_list__Group_1_0__0 )
            // InternalGo.g:3866:3: rule__Parameter_list__Group_1_0__0
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
    // InternalGo.g:3875:1: rule__Parameter_list__Group_1_0__0 : rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1 ;
    public final void rule__Parameter_list__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3879:1: ( rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1 )
            // InternalGo.g:3880:2: rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1
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
    // InternalGo.g:3887:1: rule__Parameter_list__Group_1_0__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3891:1: ( ( ',' ) )
            // InternalGo.g:3892:1: ( ',' )
            {
            // InternalGo.g:3892:1: ( ',' )
            // InternalGo.g:3893:2: ','
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
    // InternalGo.g:3902:1: rule__Parameter_list__Group_1_0__1 : rule__Parameter_list__Group_1_0__1__Impl ;
    public final void rule__Parameter_list__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3906:1: ( rule__Parameter_list__Group_1_0__1__Impl )
            // InternalGo.g:3907:2: rule__Parameter_list__Group_1_0__1__Impl
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
    // InternalGo.g:3913:1: rule__Parameter_list__Group_1_0__1__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3917:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:3918:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:3918:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:3919:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_0_1()); 
            }
            // InternalGo.g:3920:2: ( ruleParameter_decl )
            // InternalGo.g:3920:3: ruleParameter_decl
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
    // InternalGo.g:3929:1: rule__Parameter_decl__Group__0 : rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 ;
    public final void rule__Parameter_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3933:1: ( rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 )
            // InternalGo.g:3934:2: rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1
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
    // InternalGo.g:3941:1: rule__Parameter_decl__Group__0__Impl : ( ( rule__Parameter_decl__Group_0__0 )? ) ;
    public final void rule__Parameter_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3945:1: ( ( ( rule__Parameter_decl__Group_0__0 )? ) )
            // InternalGo.g:3946:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            {
            // InternalGo.g:3946:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            // InternalGo.g:3947:2: ( rule__Parameter_decl__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getGroup_0()); 
            }
            // InternalGo.g:3948:2: ( rule__Parameter_decl__Group_0__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_IDENTIFIER) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==44) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==RULE_IDENTIFIER) ) {
                        int LA43_5 = input.LA(4);

                        if ( (synpred81_InternalGo()) ) {
                            alt43=1;
                        }
                    }
                }
                else if ( (LA43_1==RULE_IDENTIFIER||LA43_1==35||LA43_1==37||LA43_1==46||(LA43_1>=53 && LA43_1<=55)||(LA43_1>=60 && LA43_1<=64)) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalGo.g:3948:3: rule__Parameter_decl__Group_0__0
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
    // InternalGo.g:3956:1: rule__Parameter_decl__Group__1 : rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 ;
    public final void rule__Parameter_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3960:1: ( rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 )
            // InternalGo.g:3961:2: rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2
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
    // InternalGo.g:3968:1: rule__Parameter_decl__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__Parameter_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3972:1: ( ( ( '...' )? ) )
            // InternalGo.g:3973:1: ( ( '...' )? )
            {
            // InternalGo.g:3973:1: ( ( '...' )? )
            // InternalGo.g:3974:2: ( '...' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1()); 
            }
            // InternalGo.g:3975:2: ( '...' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGo.g:3975:3: '...'
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
    // InternalGo.g:3983:1: rule__Parameter_decl__Group__2 : rule__Parameter_decl__Group__2__Impl ;
    public final void rule__Parameter_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3987:1: ( rule__Parameter_decl__Group__2__Impl )
            // InternalGo.g:3988:2: rule__Parameter_decl__Group__2__Impl
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
    // InternalGo.g:3994:1: rule__Parameter_decl__Group__2__Impl : ( ruleType ) ;
    public final void rule__Parameter_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3998:1: ( ( ruleType ) )
            // InternalGo.g:3999:1: ( ruleType )
            {
            // InternalGo.g:3999:1: ( ruleType )
            // InternalGo.g:4000:2: ruleType
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
    // InternalGo.g:4010:1: rule__Parameter_decl__Group_0__0 : rule__Parameter_decl__Group_0__0__Impl ;
    public final void rule__Parameter_decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4014:1: ( rule__Parameter_decl__Group_0__0__Impl )
            // InternalGo.g:4015:2: rule__Parameter_decl__Group_0__0__Impl
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
    // InternalGo.g:4021:1: rule__Parameter_decl__Group_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Parameter_decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4025:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:4026:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:4026:1: ( ruleIdentifier_list )
            // InternalGo.g:4027:2: ruleIdentifier_list
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
    // InternalGo.g:4037:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4041:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalGo.g:4042:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
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
    // InternalGo.g:4049:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4053:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:4054:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:4054:1: ( RULE_IDENTIFIER )
            // InternalGo.g:4055:2: RULE_IDENTIFIER
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
    // InternalGo.g:4064:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4068:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalGo.g:4069:2: rule__Identifier_list__Group__1__Impl
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
    // InternalGo.g:4075:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4079:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalGo.g:4080:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalGo.g:4080:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalGo.g:4081:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalGo.g:4082:2: ( rule__Identifier_list__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==44) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGo.g:4082:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalGo.g:4091:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4095:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalGo.g:4096:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalGo.g:4103:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4107:1: ( ( ',' ) )
            // InternalGo.g:4108:1: ( ',' )
            {
            // InternalGo.g:4108:1: ( ',' )
            // InternalGo.g:4109:2: ','
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
    // InternalGo.g:4118:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4122:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalGo.g:4123:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalGo.g:4129:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4133:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:4134:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:4134:1: ( RULE_IDENTIFIER )
            // InternalGo.g:4135:2: RULE_IDENTIFIER
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
    // InternalGo.g:4145:1: rule__Interface_type__Group__0 : rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1 ;
    public final void rule__Interface_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4149:1: ( rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1 )
            // InternalGo.g:4150:2: rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1
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
    // InternalGo.g:4157:1: rule__Interface_type__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4161:1: ( ( 'interface' ) )
            // InternalGo.g:4162:1: ( 'interface' )
            {
            // InternalGo.g:4162:1: ( 'interface' )
            // InternalGo.g:4163:2: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getInterfaceKeyword_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:4172:1: rule__Interface_type__Group__1 : rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2 ;
    public final void rule__Interface_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4176:1: ( rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2 )
            // InternalGo.g:4177:2: rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2
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
    // InternalGo.g:4184:1: rule__Interface_type__Group__1__Impl : ( '{' ) ;
    public final void rule__Interface_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4188:1: ( ( '{' ) )
            // InternalGo.g:4189:1: ( '{' )
            {
            // InternalGo.g:4189:1: ( '{' )
            // InternalGo.g:4190:2: '{'
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
    // InternalGo.g:4199:1: rule__Interface_type__Group__2 : rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3 ;
    public final void rule__Interface_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4203:1: ( rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3 )
            // InternalGo.g:4204:2: rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3
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
    // InternalGo.g:4211:1: rule__Interface_type__Group__2__Impl : ( ( rule__Interface_type__Group_2__0 )* ) ;
    public final void rule__Interface_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4215:1: ( ( ( rule__Interface_type__Group_2__0 )* ) )
            // InternalGo.g:4216:1: ( ( rule__Interface_type__Group_2__0 )* )
            {
            // InternalGo.g:4216:1: ( ( rule__Interface_type__Group_2__0 )* )
            // InternalGo.g:4217:2: ( rule__Interface_type__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getGroup_2()); 
            }
            // InternalGo.g:4218:2: ( rule__Interface_type__Group_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_IDENTIFIER) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGo.g:4218:3: rule__Interface_type__Group_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Interface_type__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalGo.g:4226:1: rule__Interface_type__Group__3 : rule__Interface_type__Group__3__Impl ;
    public final void rule__Interface_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4230:1: ( rule__Interface_type__Group__3__Impl )
            // InternalGo.g:4231:2: rule__Interface_type__Group__3__Impl
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
    // InternalGo.g:4237:1: rule__Interface_type__Group__3__Impl : ( '}' ) ;
    public final void rule__Interface_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4241:1: ( ( '}' ) )
            // InternalGo.g:4242:1: ( '}' )
            {
            // InternalGo.g:4242:1: ( '}' )
            // InternalGo.g:4243:2: '}'
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
    // InternalGo.g:4253:1: rule__Interface_type__Group_2__0 : rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1 ;
    public final void rule__Interface_type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4257:1: ( rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1 )
            // InternalGo.g:4258:2: rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1
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
    // InternalGo.g:4265:1: rule__Interface_type__Group_2__0__Impl : ( ruleMethod_spec ) ;
    public final void rule__Interface_type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4269:1: ( ( ruleMethod_spec ) )
            // InternalGo.g:4270:1: ( ruleMethod_spec )
            {
            // InternalGo.g:4270:1: ( ruleMethod_spec )
            // InternalGo.g:4271:2: ruleMethod_spec
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
    // InternalGo.g:4280:1: rule__Interface_type__Group_2__1 : rule__Interface_type__Group_2__1__Impl ;
    public final void rule__Interface_type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4284:1: ( rule__Interface_type__Group_2__1__Impl )
            // InternalGo.g:4285:2: rule__Interface_type__Group_2__1__Impl
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
    // InternalGo.g:4291:1: rule__Interface_type__Group_2__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Interface_type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4295:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:4296:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:4296:1: ( RULE_SEMICOLON )
            // InternalGo.g:4297:2: RULE_SEMICOLON
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
    // InternalGo.g:4307:1: rule__Method_spec__Group_0__0 : rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1 ;
    public final void rule__Method_spec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4311:1: ( rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1 )
            // InternalGo.g:4312:2: rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1
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
    // InternalGo.g:4319:1: rule__Method_spec__Group_0__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Method_spec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4323:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:4324:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:4324:1: ( RULE_IDENTIFIER )
            // InternalGo.g:4325:2: RULE_IDENTIFIER
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
    // InternalGo.g:4334:1: rule__Method_spec__Group_0__1 : rule__Method_spec__Group_0__1__Impl ;
    public final void rule__Method_spec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4338:1: ( rule__Method_spec__Group_0__1__Impl )
            // InternalGo.g:4339:2: rule__Method_spec__Group_0__1__Impl
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
    // InternalGo.g:4345:1: rule__Method_spec__Group_0__1__Impl : ( ruleSignature ) ;
    public final void rule__Method_spec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4349:1: ( ( ruleSignature ) )
            // InternalGo.g:4350:1: ( ruleSignature )
            {
            // InternalGo.g:4350:1: ( ruleSignature )
            // InternalGo.g:4351:2: ruleSignature
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
    // InternalGo.g:4361:1: rule__Slice_type__Group__0 : rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1 ;
    public final void rule__Slice_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4365:1: ( rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1 )
            // InternalGo.g:4366:2: rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1
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
    // InternalGo.g:4373:1: rule__Slice_type__Group__0__Impl : ( '[' ) ;
    public final void rule__Slice_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4377:1: ( ( '[' ) )
            // InternalGo.g:4378:1: ( '[' )
            {
            // InternalGo.g:4378:1: ( '[' )
            // InternalGo.g:4379:2: '['
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
    // InternalGo.g:4388:1: rule__Slice_type__Group__1 : rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2 ;
    public final void rule__Slice_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4392:1: ( rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2 )
            // InternalGo.g:4393:2: rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2
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
    // InternalGo.g:4400:1: rule__Slice_type__Group__1__Impl : ( ']' ) ;
    public final void rule__Slice_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4404:1: ( ( ']' ) )
            // InternalGo.g:4405:1: ( ']' )
            {
            // InternalGo.g:4405:1: ( ']' )
            // InternalGo.g:4406:2: ']'
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
    // InternalGo.g:4415:1: rule__Slice_type__Group__2 : rule__Slice_type__Group__2__Impl ;
    public final void rule__Slice_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4419:1: ( rule__Slice_type__Group__2__Impl )
            // InternalGo.g:4420:2: rule__Slice_type__Group__2__Impl
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
    // InternalGo.g:4426:1: rule__Slice_type__Group__2__Impl : ( ruleType ) ;
    public final void rule__Slice_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4430:1: ( ( ruleType ) )
            // InternalGo.g:4431:1: ( ruleType )
            {
            // InternalGo.g:4431:1: ( ruleType )
            // InternalGo.g:4432:2: ruleType
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
    // InternalGo.g:4442:1: rule__Map_type__Group__0 : rule__Map_type__Group__0__Impl rule__Map_type__Group__1 ;
    public final void rule__Map_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4446:1: ( rule__Map_type__Group__0__Impl rule__Map_type__Group__1 )
            // InternalGo.g:4447:2: rule__Map_type__Group__0__Impl rule__Map_type__Group__1
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
    // InternalGo.g:4454:1: rule__Map_type__Group__0__Impl : ( 'map' ) ;
    public final void rule__Map_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4458:1: ( ( 'map' ) )
            // InternalGo.g:4459:1: ( 'map' )
            {
            // InternalGo.g:4459:1: ( 'map' )
            // InternalGo.g:4460:2: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMap_typeAccess().getMapKeyword_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:4469:1: rule__Map_type__Group__1 : rule__Map_type__Group__1__Impl rule__Map_type__Group__2 ;
    public final void rule__Map_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4473:1: ( rule__Map_type__Group__1__Impl rule__Map_type__Group__2 )
            // InternalGo.g:4474:2: rule__Map_type__Group__1__Impl rule__Map_type__Group__2
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
    // InternalGo.g:4481:1: rule__Map_type__Group__1__Impl : ( '[' ) ;
    public final void rule__Map_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4485:1: ( ( '[' ) )
            // InternalGo.g:4486:1: ( '[' )
            {
            // InternalGo.g:4486:1: ( '[' )
            // InternalGo.g:4487:2: '['
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
    // InternalGo.g:4496:1: rule__Map_type__Group__2 : rule__Map_type__Group__2__Impl rule__Map_type__Group__3 ;
    public final void rule__Map_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4500:1: ( rule__Map_type__Group__2__Impl rule__Map_type__Group__3 )
            // InternalGo.g:4501:2: rule__Map_type__Group__2__Impl rule__Map_type__Group__3
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
    // InternalGo.g:4508:1: rule__Map_type__Group__2__Impl : ( ruleType ) ;
    public final void rule__Map_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4512:1: ( ( ruleType ) )
            // InternalGo.g:4513:1: ( ruleType )
            {
            // InternalGo.g:4513:1: ( ruleType )
            // InternalGo.g:4514:2: ruleType
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
    // InternalGo.g:4523:1: rule__Map_type__Group__3 : rule__Map_type__Group__3__Impl rule__Map_type__Group__4 ;
    public final void rule__Map_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4527:1: ( rule__Map_type__Group__3__Impl rule__Map_type__Group__4 )
            // InternalGo.g:4528:2: rule__Map_type__Group__3__Impl rule__Map_type__Group__4
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
    // InternalGo.g:4535:1: rule__Map_type__Group__3__Impl : ( ']' ) ;
    public final void rule__Map_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4539:1: ( ( ']' ) )
            // InternalGo.g:4540:1: ( ']' )
            {
            // InternalGo.g:4540:1: ( ']' )
            // InternalGo.g:4541:2: ']'
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
    // InternalGo.g:4550:1: rule__Map_type__Group__4 : rule__Map_type__Group__4__Impl ;
    public final void rule__Map_type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4554:1: ( rule__Map_type__Group__4__Impl )
            // InternalGo.g:4555:2: rule__Map_type__Group__4__Impl
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
    // InternalGo.g:4561:1: rule__Map_type__Group__4__Impl : ( ruleType ) ;
    public final void rule__Map_type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4565:1: ( ( ruleType ) )
            // InternalGo.g:4566:1: ( ruleType )
            {
            // InternalGo.g:4566:1: ( ruleType )
            // InternalGo.g:4567:2: ruleType
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
    // InternalGo.g:4577:1: rule__Channel_type__Group__0 : rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1 ;
    public final void rule__Channel_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4581:1: ( rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1 )
            // InternalGo.g:4582:2: rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1
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
    // InternalGo.g:4589:1: rule__Channel_type__Group__0__Impl : ( ( rule__Channel_type__Alternatives_0 ) ) ;
    public final void rule__Channel_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4593:1: ( ( ( rule__Channel_type__Alternatives_0 ) ) )
            // InternalGo.g:4594:1: ( ( rule__Channel_type__Alternatives_0 ) )
            {
            // InternalGo.g:4594:1: ( ( rule__Channel_type__Alternatives_0 ) )
            // InternalGo.g:4595:2: ( rule__Channel_type__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannel_typeAccess().getAlternatives_0()); 
            }
            // InternalGo.g:4596:2: ( rule__Channel_type__Alternatives_0 )
            // InternalGo.g:4596:3: rule__Channel_type__Alternatives_0
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
    // InternalGo.g:4604:1: rule__Channel_type__Group__1 : rule__Channel_type__Group__1__Impl ;
    public final void rule__Channel_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4608:1: ( rule__Channel_type__Group__1__Impl )
            // InternalGo.g:4609:2: rule__Channel_type__Group__1__Impl
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
    // InternalGo.g:4615:1: rule__Channel_type__Group__1__Impl : ( ruleType ) ;
    public final void rule__Channel_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4619:1: ( ( ruleType ) )
            // InternalGo.g:4620:1: ( ruleType )
            {
            // InternalGo.g:4620:1: ( ruleType )
            // InternalGo.g:4621:2: ruleType
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
    // InternalGo.g:4631:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4635:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalGo.g:4636:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalGo.g:4643:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4647:1: ( ( '{' ) )
            // InternalGo.g:4648:1: ( '{' )
            {
            // InternalGo.g:4648:1: ( '{' )
            // InternalGo.g:4649:2: '{'
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
    // InternalGo.g:4658:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4662:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalGo.g:4663:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalGo.g:4670:1: rule__Block__Group__1__Impl : ( ruleStatement_list ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4674:1: ( ( ruleStatement_list ) )
            // InternalGo.g:4675:1: ( ruleStatement_list )
            {
            // InternalGo.g:4675:1: ( ruleStatement_list )
            // InternalGo.g:4676:2: ruleStatement_list
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
    // InternalGo.g:4685:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4689:1: ( rule__Block__Group__2__Impl )
            // InternalGo.g:4690:2: rule__Block__Group__2__Impl
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
    // InternalGo.g:4696:1: rule__Block__Group__2__Impl : ( '}' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4700:1: ( ( '}' ) )
            // InternalGo.g:4701:1: ( '}' )
            {
            // InternalGo.g:4701:1: ( '}' )
            // InternalGo.g:4702:2: '}'
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
    // InternalGo.g:4712:1: rule__Statement_list__Group__0 : rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1 ;
    public final void rule__Statement_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4716:1: ( rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1 )
            // InternalGo.g:4717:2: rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1
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
    // InternalGo.g:4724:1: rule__Statement_list__Group__0__Impl : ( ruleStatement ) ;
    public final void rule__Statement_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4728:1: ( ( ruleStatement ) )
            // InternalGo.g:4729:1: ( ruleStatement )
            {
            // InternalGo.g:4729:1: ( ruleStatement )
            // InternalGo.g:4730:2: ruleStatement
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
    // InternalGo.g:4739:1: rule__Statement_list__Group__1 : rule__Statement_list__Group__1__Impl ;
    public final void rule__Statement_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4743:1: ( rule__Statement_list__Group__1__Impl )
            // InternalGo.g:4744:2: rule__Statement_list__Group__1__Impl
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
    // InternalGo.g:4750:1: rule__Statement_list__Group__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Statement_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4754:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:4755:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:4755:1: ( RULE_SEMICOLON )
            // InternalGo.g:4756:2: RULE_SEMICOLON
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
    // InternalGo.g:4766:1: rule__Const_decl__Group_0__0 : rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1 ;
    public final void rule__Const_decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4770:1: ( rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1 )
            // InternalGo.g:4771:2: rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1
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
    // InternalGo.g:4778:1: rule__Const_decl__Group_0__0__Impl : ( 'const' ) ;
    public final void rule__Const_decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4782:1: ( ( 'const' ) )
            // InternalGo.g:4783:1: ( 'const' )
            {
            // InternalGo.g:4783:1: ( 'const' )
            // InternalGo.g:4784:2: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getConstKeyword_0_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:4793:1: rule__Const_decl__Group_0__1 : rule__Const_decl__Group_0__1__Impl ;
    public final void rule__Const_decl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4797:1: ( rule__Const_decl__Group_0__1__Impl )
            // InternalGo.g:4798:2: rule__Const_decl__Group_0__1__Impl
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
    // InternalGo.g:4804:1: rule__Const_decl__Group_0__1__Impl : ( ruleConst_spec ) ;
    public final void rule__Const_decl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4808:1: ( ( ruleConst_spec ) )
            // InternalGo.g:4809:1: ( ruleConst_spec )
            {
            // InternalGo.g:4809:1: ( ruleConst_spec )
            // InternalGo.g:4810:2: ruleConst_spec
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
    // InternalGo.g:4820:1: rule__Const_decl__Group_1__0 : rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1 ;
    public final void rule__Const_decl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4824:1: ( rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1 )
            // InternalGo.g:4825:2: rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1
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
    // InternalGo.g:4832:1: rule__Const_decl__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Const_decl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4836:1: ( ( '(' ) )
            // InternalGo.g:4837:1: ( '(' )
            {
            // InternalGo.g:4837:1: ( '(' )
            // InternalGo.g:4838:2: '('
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
    // InternalGo.g:4847:1: rule__Const_decl__Group_1__1 : rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2 ;
    public final void rule__Const_decl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4851:1: ( rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2 )
            // InternalGo.g:4852:2: rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2
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
    // InternalGo.g:4859:1: rule__Const_decl__Group_1__1__Impl : ( ( rule__Const_decl__Group_1_1__0 )* ) ;
    public final void rule__Const_decl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4863:1: ( ( ( rule__Const_decl__Group_1_1__0 )* ) )
            // InternalGo.g:4864:1: ( ( rule__Const_decl__Group_1_1__0 )* )
            {
            // InternalGo.g:4864:1: ( ( rule__Const_decl__Group_1_1__0 )* )
            // InternalGo.g:4865:2: ( rule__Const_decl__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getGroup_1_1()); 
            }
            // InternalGo.g:4866:2: ( rule__Const_decl__Group_1_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_IDENTIFIER) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGo.g:4866:3: rule__Const_decl__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Const_decl__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalGo.g:4874:1: rule__Const_decl__Group_1__2 : rule__Const_decl__Group_1__2__Impl ;
    public final void rule__Const_decl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4878:1: ( rule__Const_decl__Group_1__2__Impl )
            // InternalGo.g:4879:2: rule__Const_decl__Group_1__2__Impl
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
    // InternalGo.g:4885:1: rule__Const_decl__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Const_decl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4889:1: ( ( ')' ) )
            // InternalGo.g:4890:1: ( ')' )
            {
            // InternalGo.g:4890:1: ( ')' )
            // InternalGo.g:4891:2: ')'
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
    // InternalGo.g:4901:1: rule__Const_decl__Group_1_1__0 : rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1 ;
    public final void rule__Const_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4905:1: ( rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1 )
            // InternalGo.g:4906:2: rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1
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
    // InternalGo.g:4913:1: rule__Const_decl__Group_1_1__0__Impl : ( ruleConst_spec ) ;
    public final void rule__Const_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4917:1: ( ( ruleConst_spec ) )
            // InternalGo.g:4918:1: ( ruleConst_spec )
            {
            // InternalGo.g:4918:1: ( ruleConst_spec )
            // InternalGo.g:4919:2: ruleConst_spec
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
    // InternalGo.g:4928:1: rule__Const_decl__Group_1_1__1 : rule__Const_decl__Group_1_1__1__Impl ;
    public final void rule__Const_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4932:1: ( rule__Const_decl__Group_1_1__1__Impl )
            // InternalGo.g:4933:2: rule__Const_decl__Group_1_1__1__Impl
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
    // InternalGo.g:4939:1: rule__Const_decl__Group_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Const_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4943:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:4944:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:4944:1: ( RULE_SEMICOLON )
            // InternalGo.g:4945:2: RULE_SEMICOLON
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
    // InternalGo.g:4955:1: rule__Const_spec__Group__0 : rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1 ;
    public final void rule__Const_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4959:1: ( rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1 )
            // InternalGo.g:4960:2: rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1
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
    // InternalGo.g:4967:1: rule__Const_spec__Group__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Const_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4971:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:4972:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:4972:1: ( ruleIdentifier_list )
            // InternalGo.g:4973:2: ruleIdentifier_list
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
    // InternalGo.g:4982:1: rule__Const_spec__Group__1 : rule__Const_spec__Group__1__Impl ;
    public final void rule__Const_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4986:1: ( rule__Const_spec__Group__1__Impl )
            // InternalGo.g:4987:2: rule__Const_spec__Group__1__Impl
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
    // InternalGo.g:4993:1: rule__Const_spec__Group__1__Impl : ( ( rule__Const_spec__Group_1__0 )? ) ;
    public final void rule__Const_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4997:1: ( ( ( rule__Const_spec__Group_1__0 )? ) )
            // InternalGo.g:4998:1: ( ( rule__Const_spec__Group_1__0 )? )
            {
            // InternalGo.g:4998:1: ( ( rule__Const_spec__Group_1__0 )? )
            // InternalGo.g:4999:2: ( rule__Const_spec__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getGroup_1()); 
            }
            // InternalGo.g:5000:2: ( rule__Const_spec__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_IDENTIFIER||LA48_0==35||LA48_0==37||LA48_0==42||(LA48_0>=53 && LA48_0<=55)||(LA48_0>=60 && LA48_0<=64)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:5000:3: rule__Const_spec__Group_1__0
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
    // InternalGo.g:5009:1: rule__Const_spec__Group_1__0 : rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1 ;
    public final void rule__Const_spec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5013:1: ( rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1 )
            // InternalGo.g:5014:2: rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1
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
    // InternalGo.g:5021:1: rule__Const_spec__Group_1__0__Impl : ( ( ruleType )? ) ;
    public final void rule__Const_spec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5025:1: ( ( ( ruleType )? ) )
            // InternalGo.g:5026:1: ( ( ruleType )? )
            {
            // InternalGo.g:5026:1: ( ( ruleType )? )
            // InternalGo.g:5027:2: ( ruleType )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getTypeParserRuleCall_1_0()); 
            }
            // InternalGo.g:5028:2: ( ruleType )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_IDENTIFIER||LA49_0==35||LA49_0==37||(LA49_0>=53 && LA49_0<=55)||(LA49_0>=60 && LA49_0<=64)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:5028:3: ruleType
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
    // InternalGo.g:5036:1: rule__Const_spec__Group_1__1 : rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2 ;
    public final void rule__Const_spec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5040:1: ( rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2 )
            // InternalGo.g:5041:2: rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2
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
    // InternalGo.g:5048:1: rule__Const_spec__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Const_spec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5052:1: ( ( '=' ) )
            // InternalGo.g:5053:1: ( '=' )
            {
            // InternalGo.g:5053:1: ( '=' )
            // InternalGo.g:5054:2: '='
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
    // InternalGo.g:5063:1: rule__Const_spec__Group_1__2 : rule__Const_spec__Group_1__2__Impl ;
    public final void rule__Const_spec__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5067:1: ( rule__Const_spec__Group_1__2__Impl )
            // InternalGo.g:5068:2: rule__Const_spec__Group_1__2__Impl
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
    // InternalGo.g:5074:1: rule__Const_spec__Group_1__2__Impl : ( ruleExpression_list ) ;
    public final void rule__Const_spec__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5078:1: ( ( ruleExpression_list ) )
            // InternalGo.g:5079:1: ( ruleExpression_list )
            {
            // InternalGo.g:5079:1: ( ruleExpression_list )
            // InternalGo.g:5080:2: ruleExpression_list
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
    // InternalGo.g:5090:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5094:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalGo.g:5095:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
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
    // InternalGo.g:5102:1: rule__Expression_list__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5106:1: ( ( ruleExpression ) )
            // InternalGo.g:5107:1: ( ruleExpression )
            {
            // InternalGo.g:5107:1: ( ruleExpression )
            // InternalGo.g:5108:2: ruleExpression
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
    // InternalGo.g:5117:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5121:1: ( rule__Expression_list__Group__1__Impl )
            // InternalGo.g:5122:2: rule__Expression_list__Group__1__Impl
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
    // InternalGo.g:5128:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5132:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalGo.g:5133:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalGo.g:5133:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalGo.g:5134:2: ( rule__Expression_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            }
            // InternalGo.g:5135:2: ( rule__Expression_list__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==44) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGo.g:5135:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalGo.g:5144:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5148:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalGo.g:5149:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
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
    // InternalGo.g:5156:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5160:1: ( ( ',' ) )
            // InternalGo.g:5161:1: ( ',' )
            {
            // InternalGo.g:5161:1: ( ',' )
            // InternalGo.g:5162:2: ','
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
    // InternalGo.g:5171:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5175:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalGo.g:5176:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalGo.g:5182:1: rule__Expression_list__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5186:1: ( ( ruleExpression ) )
            // InternalGo.g:5187:1: ( ruleExpression )
            {
            // InternalGo.g:5187:1: ( ruleExpression )
            // InternalGo.g:5188:2: ruleExpression
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
    // InternalGo.g:5198:1: rule__Function_decl__Group__0 : rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1 ;
    public final void rule__Function_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5202:1: ( rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1 )
            // InternalGo.g:5203:2: rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1
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
    // InternalGo.g:5210:1: rule__Function_decl__Group__0__Impl : ( 'func' ) ;
    public final void rule__Function_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5214:1: ( ( 'func' ) )
            // InternalGo.g:5215:1: ( 'func' )
            {
            // InternalGo.g:5215:1: ( 'func' )
            // InternalGo.g:5216:2: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getFuncKeyword_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:5225:1: rule__Function_decl__Group__1 : rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2 ;
    public final void rule__Function_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5229:1: ( rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2 )
            // InternalGo.g:5230:2: rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2
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
    // InternalGo.g:5237:1: rule__Function_decl__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Function_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5241:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5242:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5242:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5243:2: RULE_IDENTIFIER
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
    // InternalGo.g:5252:1: rule__Function_decl__Group__2 : rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3 ;
    public final void rule__Function_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5256:1: ( rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3 )
            // InternalGo.g:5257:2: rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3
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
    // InternalGo.g:5264:1: rule__Function_decl__Group__2__Impl : ( ruleSignature ) ;
    public final void rule__Function_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5268:1: ( ( ruleSignature ) )
            // InternalGo.g:5269:1: ( ruleSignature )
            {
            // InternalGo.g:5269:1: ( ruleSignature )
            // InternalGo.g:5270:2: ruleSignature
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
    // InternalGo.g:5279:1: rule__Function_decl__Group__3 : rule__Function_decl__Group__3__Impl ;
    public final void rule__Function_decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5283:1: ( rule__Function_decl__Group__3__Impl )
            // InternalGo.g:5284:2: rule__Function_decl__Group__3__Impl
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
    // InternalGo.g:5290:1: rule__Function_decl__Group__3__Impl : ( ( ruleFunction_body )? ) ;
    public final void rule__Function_decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5294:1: ( ( ( ruleFunction_body )? ) )
            // InternalGo.g:5295:1: ( ( ruleFunction_body )? )
            {
            // InternalGo.g:5295:1: ( ( ruleFunction_body )? )
            // InternalGo.g:5296:2: ( ruleFunction_body )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getFunction_bodyParserRuleCall_3()); 
            }
            // InternalGo.g:5297:2: ( ruleFunction_body )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGo.g:5297:3: ruleFunction_body
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
    // InternalGo.g:5306:1: rule__Operand__Group_2__0 : rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1 ;
    public final void rule__Operand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5310:1: ( rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1 )
            // InternalGo.g:5311:2: rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1
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
    // InternalGo.g:5318:1: rule__Operand__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Operand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5322:1: ( ( '(' ) )
            // InternalGo.g:5323:1: ( '(' )
            {
            // InternalGo.g:5323:1: ( '(' )
            // InternalGo.g:5324:2: '('
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
    // InternalGo.g:5333:1: rule__Operand__Group_2__1 : rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2 ;
    public final void rule__Operand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5337:1: ( rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2 )
            // InternalGo.g:5338:2: rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2
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
    // InternalGo.g:5345:1: rule__Operand__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Operand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5349:1: ( ( ruleExpression ) )
            // InternalGo.g:5350:1: ( ruleExpression )
            {
            // InternalGo.g:5350:1: ( ruleExpression )
            // InternalGo.g:5351:2: ruleExpression
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
    // InternalGo.g:5360:1: rule__Operand__Group_2__2 : rule__Operand__Group_2__2__Impl ;
    public final void rule__Operand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5364:1: ( rule__Operand__Group_2__2__Impl )
            // InternalGo.g:5365:2: rule__Operand__Group_2__2__Impl
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
    // InternalGo.g:5371:1: rule__Operand__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Operand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5375:1: ( ( ')' ) )
            // InternalGo.g:5376:1: ( ')' )
            {
            // InternalGo.g:5376:1: ( ')' )
            // InternalGo.g:5377:2: ')'
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
    // InternalGo.g:5387:1: rule__Qualified_ident__Group__0 : rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 ;
    public final void rule__Qualified_ident__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5391:1: ( rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 )
            // InternalGo.g:5392:2: rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1
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
    // InternalGo.g:5399:1: rule__Qualified_ident__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5403:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5404:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5404:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5405:2: RULE_IDENTIFIER
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
    // InternalGo.g:5414:1: rule__Qualified_ident__Group__1 : rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 ;
    public final void rule__Qualified_ident__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5418:1: ( rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 )
            // InternalGo.g:5419:2: rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2
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
    // InternalGo.g:5426:1: rule__Qualified_ident__Group__1__Impl : ( '.' ) ;
    public final void rule__Qualified_ident__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5430:1: ( ( '.' ) )
            // InternalGo.g:5431:1: ( '.' )
            {
            // InternalGo.g:5431:1: ( '.' )
            // InternalGo.g:5432:2: '.'
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
    // InternalGo.g:5441:1: rule__Qualified_ident__Group__2 : rule__Qualified_ident__Group__2__Impl ;
    public final void rule__Qualified_ident__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5445:1: ( rule__Qualified_ident__Group__2__Impl )
            // InternalGo.g:5446:2: rule__Qualified_ident__Group__2__Impl
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
    // InternalGo.g:5452:1: rule__Qualified_ident__Group__2__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5456:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5457:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5457:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5458:2: RULE_IDENTIFIER
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
    // InternalGo.g:5468:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5472:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalGo.g:5473:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalGo.g:5480:1: rule__Expression__Group__0__Impl : ( ruleUnary_expr ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5484:1: ( ( ruleUnary_expr ) )
            // InternalGo.g:5485:1: ( ruleUnary_expr )
            {
            // InternalGo.g:5485:1: ( ruleUnary_expr )
            // InternalGo.g:5486:2: ruleUnary_expr
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
    // InternalGo.g:5495:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5499:1: ( rule__Expression__Group__1__Impl )
            // InternalGo.g:5500:2: rule__Expression__Group__1__Impl
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
    // InternalGo.g:5506:1: rule__Expression__Group__1__Impl : ( ruleExpression_line ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5510:1: ( ( ruleExpression_line ) )
            // InternalGo.g:5511:1: ( ruleExpression_line )
            {
            // InternalGo.g:5511:1: ( ruleExpression_line )
            // InternalGo.g:5512:2: ruleExpression_line
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
    // InternalGo.g:5522:1: rule__Expression_line__Group__0 : rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1 ;
    public final void rule__Expression_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5526:1: ( rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1 )
            // InternalGo.g:5527:2: rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1
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
    // InternalGo.g:5534:1: rule__Expression_line__Group__0__Impl : ( RULE_BINARY_OP ) ;
    public final void rule__Expression_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5538:1: ( ( RULE_BINARY_OP ) )
            // InternalGo.g:5539:1: ( RULE_BINARY_OP )
            {
            // InternalGo.g:5539:1: ( RULE_BINARY_OP )
            // InternalGo.g:5540:2: RULE_BINARY_OP
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
    // InternalGo.g:5549:1: rule__Expression_line__Group__1 : rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2 ;
    public final void rule__Expression_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5553:1: ( rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2 )
            // InternalGo.g:5554:2: rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2
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
    // InternalGo.g:5561:1: rule__Expression_line__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5565:1: ( ( ruleExpression ) )
            // InternalGo.g:5566:1: ( ruleExpression )
            {
            // InternalGo.g:5566:1: ( ruleExpression )
            // InternalGo.g:5567:2: ruleExpression
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
    // InternalGo.g:5576:1: rule__Expression_line__Group__2 : rule__Expression_line__Group__2__Impl ;
    public final void rule__Expression_line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5580:1: ( rule__Expression_line__Group__2__Impl )
            // InternalGo.g:5581:2: rule__Expression_line__Group__2__Impl
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
    // InternalGo.g:5587:1: rule__Expression_line__Group__2__Impl : ( ruleExpression_line ) ;
    public final void rule__Expression_line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5591:1: ( ( ruleExpression_line ) )
            // InternalGo.g:5592:1: ( ruleExpression_line )
            {
            // InternalGo.g:5592:1: ( ruleExpression_line )
            // InternalGo.g:5593:2: ruleExpression_line
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


    // $ANTLR start "rule__Labeled_stmt__Group__0"
    // InternalGo.g:5603:1: rule__Labeled_stmt__Group__0 : rule__Labeled_stmt__Group__0__Impl rule__Labeled_stmt__Group__1 ;
    public final void rule__Labeled_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5607:1: ( rule__Labeled_stmt__Group__0__Impl rule__Labeled_stmt__Group__1 )
            // InternalGo.g:5608:2: rule__Labeled_stmt__Group__0__Impl rule__Labeled_stmt__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Labeled_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Labeled_stmt__Group__1();

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
    // $ANTLR end "rule__Labeled_stmt__Group__0"


    // $ANTLR start "rule__Labeled_stmt__Group__0__Impl"
    // InternalGo.g:5615:1: rule__Labeled_stmt__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Labeled_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5619:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5620:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5620:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5621:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeled_stmtAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeled_stmtAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labeled_stmt__Group__0__Impl"


    // $ANTLR start "rule__Labeled_stmt__Group__1"
    // InternalGo.g:5630:1: rule__Labeled_stmt__Group__1 : rule__Labeled_stmt__Group__1__Impl rule__Labeled_stmt__Group__2 ;
    public final void rule__Labeled_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5634:1: ( rule__Labeled_stmt__Group__1__Impl rule__Labeled_stmt__Group__2 )
            // InternalGo.g:5635:2: rule__Labeled_stmt__Group__1__Impl rule__Labeled_stmt__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Labeled_stmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Labeled_stmt__Group__2();

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
    // $ANTLR end "rule__Labeled_stmt__Group__1"


    // $ANTLR start "rule__Labeled_stmt__Group__1__Impl"
    // InternalGo.g:5642:1: rule__Labeled_stmt__Group__1__Impl : ( ':' ) ;
    public final void rule__Labeled_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5646:1: ( ( ':' ) )
            // InternalGo.g:5647:1: ( ':' )
            {
            // InternalGo.g:5647:1: ( ':' )
            // InternalGo.g:5648:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeled_stmtAccess().getColonKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeled_stmtAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labeled_stmt__Group__1__Impl"


    // $ANTLR start "rule__Labeled_stmt__Group__2"
    // InternalGo.g:5657:1: rule__Labeled_stmt__Group__2 : rule__Labeled_stmt__Group__2__Impl ;
    public final void rule__Labeled_stmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5661:1: ( rule__Labeled_stmt__Group__2__Impl )
            // InternalGo.g:5662:2: rule__Labeled_stmt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Labeled_stmt__Group__2__Impl();

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
    // $ANTLR end "rule__Labeled_stmt__Group__2"


    // $ANTLR start "rule__Labeled_stmt__Group__2__Impl"
    // InternalGo.g:5668:1: rule__Labeled_stmt__Group__2__Impl : ( ruleStatement ) ;
    public final void rule__Labeled_stmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5672:1: ( ( ruleStatement ) )
            // InternalGo.g:5673:1: ( ruleStatement )
            {
            // InternalGo.g:5673:1: ( ruleStatement )
            // InternalGo.g:5674:2: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeled_stmtAccess().getStatementParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeled_stmtAccess().getStatementParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labeled_stmt__Group__2__Impl"


    // $ANTLR start "rule__If_stmt__Group__0"
    // InternalGo.g:5684:1: rule__If_stmt__Group__0 : rule__If_stmt__Group__0__Impl rule__If_stmt__Group__1 ;
    public final void rule__If_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5688:1: ( rule__If_stmt__Group__0__Impl rule__If_stmt__Group__1 )
            // InternalGo.g:5689:2: rule__If_stmt__Group__0__Impl rule__If_stmt__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__If_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group__1();

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
    // $ANTLR end "rule__If_stmt__Group__0"


    // $ANTLR start "rule__If_stmt__Group__0__Impl"
    // InternalGo.g:5696:1: rule__If_stmt__Group__0__Impl : ( 'if' ) ;
    public final void rule__If_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5700:1: ( ( 'if' ) )
            // InternalGo.g:5701:1: ( 'if' )
            {
            // InternalGo.g:5701:1: ( 'if' )
            // InternalGo.g:5702:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getIfKeyword_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group__0__Impl"


    // $ANTLR start "rule__If_stmt__Group__1"
    // InternalGo.g:5711:1: rule__If_stmt__Group__1 : rule__If_stmt__Group__1__Impl rule__If_stmt__Group__2 ;
    public final void rule__If_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5715:1: ( rule__If_stmt__Group__1__Impl rule__If_stmt__Group__2 )
            // InternalGo.g:5716:2: rule__If_stmt__Group__1__Impl rule__If_stmt__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__If_stmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group__2();

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
    // $ANTLR end "rule__If_stmt__Group__1"


    // $ANTLR start "rule__If_stmt__Group__1__Impl"
    // InternalGo.g:5723:1: rule__If_stmt__Group__1__Impl : ( ( rule__If_stmt__Group_1__0 )? ) ;
    public final void rule__If_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5727:1: ( ( ( rule__If_stmt__Group_1__0 )? ) )
            // InternalGo.g:5728:1: ( ( rule__If_stmt__Group_1__0 )? )
            {
            // InternalGo.g:5728:1: ( ( rule__If_stmt__Group_1__0 )? )
            // InternalGo.g:5729:2: ( rule__If_stmt__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getGroup_1()); 
            }
            // InternalGo.g:5730:2: ( rule__If_stmt__Group_1__0 )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalGo.g:5730:3: rule__If_stmt__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If_stmt__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group__1__Impl"


    // $ANTLR start "rule__If_stmt__Group__2"
    // InternalGo.g:5738:1: rule__If_stmt__Group__2 : rule__If_stmt__Group__2__Impl rule__If_stmt__Group__3 ;
    public final void rule__If_stmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5742:1: ( rule__If_stmt__Group__2__Impl rule__If_stmt__Group__3 )
            // InternalGo.g:5743:2: rule__If_stmt__Group__2__Impl rule__If_stmt__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__If_stmt__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group__3();

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
    // $ANTLR end "rule__If_stmt__Group__2"


    // $ANTLR start "rule__If_stmt__Group__2__Impl"
    // InternalGo.g:5750:1: rule__If_stmt__Group__2__Impl : ( ( ruleExpression ) ) ;
    public final void rule__If_stmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5754:1: ( ( ( ruleExpression ) ) )
            // InternalGo.g:5755:1: ( ( ruleExpression ) )
            {
            // InternalGo.g:5755:1: ( ( ruleExpression ) )
            // InternalGo.g:5756:2: ( ruleExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getExpressionParserRuleCall_2()); 
            }
            // InternalGo.g:5757:2: ( ruleExpression )
            // InternalGo.g:5757:3: ruleExpression
            {
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getExpressionParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group__2__Impl"


    // $ANTLR start "rule__If_stmt__Group__3"
    // InternalGo.g:5765:1: rule__If_stmt__Group__3 : rule__If_stmt__Group__3__Impl rule__If_stmt__Group__4 ;
    public final void rule__If_stmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5769:1: ( rule__If_stmt__Group__3__Impl rule__If_stmt__Group__4 )
            // InternalGo.g:5770:2: rule__If_stmt__Group__3__Impl rule__If_stmt__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__If_stmt__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group__4();

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
    // $ANTLR end "rule__If_stmt__Group__3"


    // $ANTLR start "rule__If_stmt__Group__3__Impl"
    // InternalGo.g:5777:1: rule__If_stmt__Group__3__Impl : ( ruleBlock ) ;
    public final void rule__If_stmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5781:1: ( ( ruleBlock ) )
            // InternalGo.g:5782:1: ( ruleBlock )
            {
            // InternalGo.g:5782:1: ( ruleBlock )
            // InternalGo.g:5783:2: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getBlockParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getBlockParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group__3__Impl"


    // $ANTLR start "rule__If_stmt__Group__4"
    // InternalGo.g:5792:1: rule__If_stmt__Group__4 : rule__If_stmt__Group__4__Impl ;
    public final void rule__If_stmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5796:1: ( rule__If_stmt__Group__4__Impl )
            // InternalGo.g:5797:2: rule__If_stmt__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group__4__Impl();

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
    // $ANTLR end "rule__If_stmt__Group__4"


    // $ANTLR start "rule__If_stmt__Group__4__Impl"
    // InternalGo.g:5803:1: rule__If_stmt__Group__4__Impl : ( ( rule__If_stmt__Group_4__0 )? ) ;
    public final void rule__If_stmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5807:1: ( ( ( rule__If_stmt__Group_4__0 )? ) )
            // InternalGo.g:5808:1: ( ( rule__If_stmt__Group_4__0 )? )
            {
            // InternalGo.g:5808:1: ( ( rule__If_stmt__Group_4__0 )? )
            // InternalGo.g:5809:2: ( rule__If_stmt__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getGroup_4()); 
            }
            // InternalGo.g:5810:2: ( rule__If_stmt__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==67) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGo.g:5810:3: rule__If_stmt__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If_stmt__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group__4__Impl"


    // $ANTLR start "rule__If_stmt__Group_1__0"
    // InternalGo.g:5819:1: rule__If_stmt__Group_1__0 : rule__If_stmt__Group_1__0__Impl rule__If_stmt__Group_1__1 ;
    public final void rule__If_stmt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5823:1: ( rule__If_stmt__Group_1__0__Impl rule__If_stmt__Group_1__1 )
            // InternalGo.g:5824:2: rule__If_stmt__Group_1__0__Impl rule__If_stmt__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__If_stmt__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group_1__1();

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
    // $ANTLR end "rule__If_stmt__Group_1__0"


    // $ANTLR start "rule__If_stmt__Group_1__0__Impl"
    // InternalGo.g:5831:1: rule__If_stmt__Group_1__0__Impl : ( ruleSimple_stmt ) ;
    public final void rule__If_stmt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5835:1: ( ( ruleSimple_stmt ) )
            // InternalGo.g:5836:1: ( ruleSimple_stmt )
            {
            // InternalGo.g:5836:1: ( ruleSimple_stmt )
            // InternalGo.g:5837:2: ruleSimple_stmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getSimple_stmtParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimple_stmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getSimple_stmtParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group_1__0__Impl"


    // $ANTLR start "rule__If_stmt__Group_1__1"
    // InternalGo.g:5846:1: rule__If_stmt__Group_1__1 : rule__If_stmt__Group_1__1__Impl ;
    public final void rule__If_stmt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5850:1: ( rule__If_stmt__Group_1__1__Impl )
            // InternalGo.g:5851:2: rule__If_stmt__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group_1__1__Impl();

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
    // $ANTLR end "rule__If_stmt__Group_1__1"


    // $ANTLR start "rule__If_stmt__Group_1__1__Impl"
    // InternalGo.g:5857:1: rule__If_stmt__Group_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__If_stmt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5861:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:5862:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:5862:1: ( RULE_SEMICOLON )
            // InternalGo.g:5863:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getSEMICOLONTerminalRuleCall_1_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getSEMICOLONTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group_1__1__Impl"


    // $ANTLR start "rule__If_stmt__Group_4__0"
    // InternalGo.g:5873:1: rule__If_stmt__Group_4__0 : rule__If_stmt__Group_4__0__Impl rule__If_stmt__Group_4__1 ;
    public final void rule__If_stmt__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5877:1: ( rule__If_stmt__Group_4__0__Impl rule__If_stmt__Group_4__1 )
            // InternalGo.g:5878:2: rule__If_stmt__Group_4__0__Impl rule__If_stmt__Group_4__1
            {
            pushFollow(FOLLOW_43);
            rule__If_stmt__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group_4__1();

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
    // $ANTLR end "rule__If_stmt__Group_4__0"


    // $ANTLR start "rule__If_stmt__Group_4__0__Impl"
    // InternalGo.g:5885:1: rule__If_stmt__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__If_stmt__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5889:1: ( ( 'else' ) )
            // InternalGo.g:5890:1: ( 'else' )
            {
            // InternalGo.g:5890:1: ( 'else' )
            // InternalGo.g:5891:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getElseKeyword_4_0()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getElseKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group_4__0__Impl"


    // $ANTLR start "rule__If_stmt__Group_4__1"
    // InternalGo.g:5900:1: rule__If_stmt__Group_4__1 : rule__If_stmt__Group_4__1__Impl ;
    public final void rule__If_stmt__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5904:1: ( rule__If_stmt__Group_4__1__Impl )
            // InternalGo.g:5905:2: rule__If_stmt__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If_stmt__Group_4__1__Impl();

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
    // $ANTLR end "rule__If_stmt__Group_4__1"


    // $ANTLR start "rule__If_stmt__Group_4__1__Impl"
    // InternalGo.g:5911:1: rule__If_stmt__Group_4__1__Impl : ( ( rule__If_stmt__Alternatives_4_1 ) ) ;
    public final void rule__If_stmt__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5915:1: ( ( ( rule__If_stmt__Alternatives_4_1 ) ) )
            // InternalGo.g:5916:1: ( ( rule__If_stmt__Alternatives_4_1 ) )
            {
            // InternalGo.g:5916:1: ( ( rule__If_stmt__Alternatives_4_1 ) )
            // InternalGo.g:5917:2: ( rule__If_stmt__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getAlternatives_4_1()); 
            }
            // InternalGo.g:5918:2: ( rule__If_stmt__Alternatives_4_1 )
            // InternalGo.g:5918:3: rule__If_stmt__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__If_stmt__Alternatives_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_stmtAccess().getAlternatives_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_stmt__Group_4__1__Impl"


    // $ANTLR start "rule__Go_stmt__Group__0"
    // InternalGo.g:5927:1: rule__Go_stmt__Group__0 : rule__Go_stmt__Group__0__Impl rule__Go_stmt__Group__1 ;
    public final void rule__Go_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5931:1: ( rule__Go_stmt__Group__0__Impl rule__Go_stmt__Group__1 )
            // InternalGo.g:5932:2: rule__Go_stmt__Group__0__Impl rule__Go_stmt__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Go_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Go_stmt__Group__1();

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
    // $ANTLR end "rule__Go_stmt__Group__0"


    // $ANTLR start "rule__Go_stmt__Group__0__Impl"
    // InternalGo.g:5939:1: rule__Go_stmt__Group__0__Impl : ( 'go' ) ;
    public final void rule__Go_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5943:1: ( ( 'go' ) )
            // InternalGo.g:5944:1: ( 'go' )
            {
            // InternalGo.g:5944:1: ( 'go' )
            // InternalGo.g:5945:2: 'go'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGo_stmtAccess().getGoKeyword_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGo_stmtAccess().getGoKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go_stmt__Group__0__Impl"


    // $ANTLR start "rule__Go_stmt__Group__1"
    // InternalGo.g:5954:1: rule__Go_stmt__Group__1 : rule__Go_stmt__Group__1__Impl ;
    public final void rule__Go_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5958:1: ( rule__Go_stmt__Group__1__Impl )
            // InternalGo.g:5959:2: rule__Go_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Go_stmt__Group__1__Impl();

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
    // $ANTLR end "rule__Go_stmt__Group__1"


    // $ANTLR start "rule__Go_stmt__Group__1__Impl"
    // InternalGo.g:5965:1: rule__Go_stmt__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Go_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5969:1: ( ( ruleExpression ) )
            // InternalGo.g:5970:1: ( ruleExpression )
            {
            // InternalGo.g:5970:1: ( ruleExpression )
            // InternalGo.g:5971:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGo_stmtAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGo_stmtAccess().getExpressionParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go_stmt__Group__1__Impl"


    // $ANTLR start "rule__Return_stmt__Group__0"
    // InternalGo.g:5981:1: rule__Return_stmt__Group__0 : rule__Return_stmt__Group__0__Impl rule__Return_stmt__Group__1 ;
    public final void rule__Return_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5985:1: ( rule__Return_stmt__Group__0__Impl rule__Return_stmt__Group__1 )
            // InternalGo.g:5986:2: rule__Return_stmt__Group__0__Impl rule__Return_stmt__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Return_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Return_stmt__Group__1();

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
    // $ANTLR end "rule__Return_stmt__Group__0"


    // $ANTLR start "rule__Return_stmt__Group__0__Impl"
    // InternalGo.g:5993:1: rule__Return_stmt__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5997:1: ( ( 'return' ) )
            // InternalGo.g:5998:1: ( 'return' )
            {
            // InternalGo.g:5998:1: ( 'return' )
            // InternalGo.g:5999:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturn_stmtAccess().getReturnKeyword_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturn_stmtAccess().getReturnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return_stmt__Group__0__Impl"


    // $ANTLR start "rule__Return_stmt__Group__1"
    // InternalGo.g:6008:1: rule__Return_stmt__Group__1 : rule__Return_stmt__Group__1__Impl ;
    public final void rule__Return_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6012:1: ( rule__Return_stmt__Group__1__Impl )
            // InternalGo.g:6013:2: rule__Return_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Return_stmt__Group__1__Impl();

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
    // $ANTLR end "rule__Return_stmt__Group__1"


    // $ANTLR start "rule__Return_stmt__Group__1__Impl"
    // InternalGo.g:6019:1: rule__Return_stmt__Group__1__Impl : ( ( ruleExpression_list )? ) ;
    public final void rule__Return_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6023:1: ( ( ( ruleExpression_list )? ) )
            // InternalGo.g:6024:1: ( ( ruleExpression_list )? )
            {
            // InternalGo.g:6024:1: ( ( ruleExpression_list )? )
            // InternalGo.g:6025:2: ( ruleExpression_list )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturn_stmtAccess().getExpression_listParserRuleCall_1()); 
            }
            // InternalGo.g:6026:2: ( ruleExpression_list )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_HEX_LIT)||(LA54_0>=RULE_RAW_STRING_LIT && LA54_0<=RULE_UNARY_OP)||LA54_0==35||(LA54_0>=58 && LA54_0<=59)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGo.g:6026:3: ruleExpression_list
                    {
                    pushFollow(FOLLOW_2);
                    ruleExpression_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturn_stmtAccess().getExpression_listParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return_stmt__Group__1__Impl"


    // $ANTLR start "rule__Break_stmt__Group__0"
    // InternalGo.g:6035:1: rule__Break_stmt__Group__0 : rule__Break_stmt__Group__0__Impl rule__Break_stmt__Group__1 ;
    public final void rule__Break_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6039:1: ( rule__Break_stmt__Group__0__Impl rule__Break_stmt__Group__1 )
            // InternalGo.g:6040:2: rule__Break_stmt__Group__0__Impl rule__Break_stmt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Break_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Break_stmt__Group__1();

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
    // $ANTLR end "rule__Break_stmt__Group__0"


    // $ANTLR start "rule__Break_stmt__Group__0__Impl"
    // InternalGo.g:6047:1: rule__Break_stmt__Group__0__Impl : ( 'break' ) ;
    public final void rule__Break_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6051:1: ( ( 'break' ) )
            // InternalGo.g:6052:1: ( 'break' )
            {
            // InternalGo.g:6052:1: ( 'break' )
            // InternalGo.g:6053:2: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreak_stmtAccess().getBreakKeyword_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreak_stmtAccess().getBreakKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break_stmt__Group__0__Impl"


    // $ANTLR start "rule__Break_stmt__Group__1"
    // InternalGo.g:6062:1: rule__Break_stmt__Group__1 : rule__Break_stmt__Group__1__Impl ;
    public final void rule__Break_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6066:1: ( rule__Break_stmt__Group__1__Impl )
            // InternalGo.g:6067:2: rule__Break_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break_stmt__Group__1__Impl();

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
    // $ANTLR end "rule__Break_stmt__Group__1"


    // $ANTLR start "rule__Break_stmt__Group__1__Impl"
    // InternalGo.g:6073:1: rule__Break_stmt__Group__1__Impl : ( ( RULE_IDENTIFIER )? ) ;
    public final void rule__Break_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6077:1: ( ( ( RULE_IDENTIFIER )? ) )
            // InternalGo.g:6078:1: ( ( RULE_IDENTIFIER )? )
            {
            // InternalGo.g:6078:1: ( ( RULE_IDENTIFIER )? )
            // InternalGo.g:6079:2: ( RULE_IDENTIFIER )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreak_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }
            // InternalGo.g:6080:2: ( RULE_IDENTIFIER )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_IDENTIFIER) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGo.g:6080:3: RULE_IDENTIFIER
                    {
                    match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreak_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break_stmt__Group__1__Impl"


    // $ANTLR start "rule__Continue_stmt__Group__0"
    // InternalGo.g:6089:1: rule__Continue_stmt__Group__0 : rule__Continue_stmt__Group__0__Impl rule__Continue_stmt__Group__1 ;
    public final void rule__Continue_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6093:1: ( rule__Continue_stmt__Group__0__Impl rule__Continue_stmt__Group__1 )
            // InternalGo.g:6094:2: rule__Continue_stmt__Group__0__Impl rule__Continue_stmt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Continue_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Continue_stmt__Group__1();

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
    // $ANTLR end "rule__Continue_stmt__Group__0"


    // $ANTLR start "rule__Continue_stmt__Group__0__Impl"
    // InternalGo.g:6101:1: rule__Continue_stmt__Group__0__Impl : ( 'continue' ) ;
    public final void rule__Continue_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6105:1: ( ( 'continue' ) )
            // InternalGo.g:6106:1: ( 'continue' )
            {
            // InternalGo.g:6106:1: ( 'continue' )
            // InternalGo.g:6107:2: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContinue_stmtAccess().getContinueKeyword_0()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContinue_stmtAccess().getContinueKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue_stmt__Group__0__Impl"


    // $ANTLR start "rule__Continue_stmt__Group__1"
    // InternalGo.g:6116:1: rule__Continue_stmt__Group__1 : rule__Continue_stmt__Group__1__Impl ;
    public final void rule__Continue_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6120:1: ( rule__Continue_stmt__Group__1__Impl )
            // InternalGo.g:6121:2: rule__Continue_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Continue_stmt__Group__1__Impl();

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
    // $ANTLR end "rule__Continue_stmt__Group__1"


    // $ANTLR start "rule__Continue_stmt__Group__1__Impl"
    // InternalGo.g:6127:1: rule__Continue_stmt__Group__1__Impl : ( ( RULE_IDENTIFIER )? ) ;
    public final void rule__Continue_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6131:1: ( ( ( RULE_IDENTIFIER )? ) )
            // InternalGo.g:6132:1: ( ( RULE_IDENTIFIER )? )
            {
            // InternalGo.g:6132:1: ( ( RULE_IDENTIFIER )? )
            // InternalGo.g:6133:2: ( RULE_IDENTIFIER )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContinue_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }
            // InternalGo.g:6134:2: ( RULE_IDENTIFIER )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_IDENTIFIER) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalGo.g:6134:3: RULE_IDENTIFIER
                    {
                    match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContinue_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue_stmt__Group__1__Impl"


    // $ANTLR start "rule__Goto_stmt__Group__0"
    // InternalGo.g:6143:1: rule__Goto_stmt__Group__0 : rule__Goto_stmt__Group__0__Impl rule__Goto_stmt__Group__1 ;
    public final void rule__Goto_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6147:1: ( rule__Goto_stmt__Group__0__Impl rule__Goto_stmt__Group__1 )
            // InternalGo.g:6148:2: rule__Goto_stmt__Group__0__Impl rule__Goto_stmt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Goto_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Goto_stmt__Group__1();

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
    // $ANTLR end "rule__Goto_stmt__Group__0"


    // $ANTLR start "rule__Goto_stmt__Group__0__Impl"
    // InternalGo.g:6155:1: rule__Goto_stmt__Group__0__Impl : ( 'goto' ) ;
    public final void rule__Goto_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6159:1: ( ( 'goto' ) )
            // InternalGo.g:6160:1: ( 'goto' )
            {
            // InternalGo.g:6160:1: ( 'goto' )
            // InternalGo.g:6161:2: 'goto'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoto_stmtAccess().getGotoKeyword_0()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoto_stmtAccess().getGotoKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goto_stmt__Group__0__Impl"


    // $ANTLR start "rule__Goto_stmt__Group__1"
    // InternalGo.g:6170:1: rule__Goto_stmt__Group__1 : rule__Goto_stmt__Group__1__Impl ;
    public final void rule__Goto_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6174:1: ( rule__Goto_stmt__Group__1__Impl )
            // InternalGo.g:6175:2: rule__Goto_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goto_stmt__Group__1__Impl();

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
    // $ANTLR end "rule__Goto_stmt__Group__1"


    // $ANTLR start "rule__Goto_stmt__Group__1__Impl"
    // InternalGo.g:6181:1: rule__Goto_stmt__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Goto_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6185:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:6186:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:6186:1: ( RULE_IDENTIFIER )
            // InternalGo.g:6187:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoto_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoto_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goto_stmt__Group__1__Impl"


    // $ANTLR start "rule__Defer_stmt__Group__0"
    // InternalGo.g:6197:1: rule__Defer_stmt__Group__0 : rule__Defer_stmt__Group__0__Impl rule__Defer_stmt__Group__1 ;
    public final void rule__Defer_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6201:1: ( rule__Defer_stmt__Group__0__Impl rule__Defer_stmt__Group__1 )
            // InternalGo.g:6202:2: rule__Defer_stmt__Group__0__Impl rule__Defer_stmt__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Defer_stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Defer_stmt__Group__1();

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
    // $ANTLR end "rule__Defer_stmt__Group__0"


    // $ANTLR start "rule__Defer_stmt__Group__0__Impl"
    // InternalGo.g:6209:1: rule__Defer_stmt__Group__0__Impl : ( 'defer' ) ;
    public final void rule__Defer_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6213:1: ( ( 'defer' ) )
            // InternalGo.g:6214:1: ( 'defer' )
            {
            // InternalGo.g:6214:1: ( 'defer' )
            // InternalGo.g:6215:2: 'defer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefer_stmtAccess().getDeferKeyword_0()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefer_stmtAccess().getDeferKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defer_stmt__Group__0__Impl"


    // $ANTLR start "rule__Defer_stmt__Group__1"
    // InternalGo.g:6224:1: rule__Defer_stmt__Group__1 : rule__Defer_stmt__Group__1__Impl ;
    public final void rule__Defer_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6228:1: ( rule__Defer_stmt__Group__1__Impl )
            // InternalGo.g:6229:2: rule__Defer_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defer_stmt__Group__1__Impl();

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
    // $ANTLR end "rule__Defer_stmt__Group__1"


    // $ANTLR start "rule__Defer_stmt__Group__1__Impl"
    // InternalGo.g:6235:1: rule__Defer_stmt__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Defer_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6239:1: ( ( ruleExpression ) )
            // InternalGo.g:6240:1: ( ruleExpression )
            {
            // InternalGo.g:6240:1: ( ruleExpression )
            // InternalGo.g:6241:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefer_stmtAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefer_stmtAccess().getExpressionParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defer_stmt__Group__1__Impl"


    // $ANTLR start "rule__Package_clause__Group__0"
    // InternalGo.g:6251:1: rule__Package_clause__Group__0 : rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1 ;
    public final void rule__Package_clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6255:1: ( rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1 )
            // InternalGo.g:6256:2: rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1
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
    // InternalGo.g:6263:1: rule__Package_clause__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6267:1: ( ( 'package' ) )
            // InternalGo.g:6268:1: ( 'package' )
            {
            // InternalGo.g:6268:1: ( 'package' )
            // InternalGo.g:6269:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseAccess().getPackageKeyword_0()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:6278:1: rule__Package_clause__Group__1 : rule__Package_clause__Group__1__Impl ;
    public final void rule__Package_clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6282:1: ( rule__Package_clause__Group__1__Impl )
            // InternalGo.g:6283:2: rule__Package_clause__Group__1__Impl
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
    // InternalGo.g:6289:1: rule__Package_clause__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Package_clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6293:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:6294:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:6294:1: ( RULE_IDENTIFIER )
            // InternalGo.g:6295:2: RULE_IDENTIFIER
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
    // InternalGo.g:6305:1: rule__Import_decl__Group__0 : rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 ;
    public final void rule__Import_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6309:1: ( rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 )
            // InternalGo.g:6310:2: rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalGo.g:6317:1: rule__Import_decl__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6321:1: ( ( 'import' ) )
            // InternalGo.g:6322:1: ( 'import' )
            {
            // InternalGo.g:6322:1: ( 'import' )
            // InternalGo.g:6323:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getImportKeyword_0()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:6332:1: rule__Import_decl__Group__1 : rule__Import_decl__Group__1__Impl ;
    public final void rule__Import_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6336:1: ( rule__Import_decl__Group__1__Impl )
            // InternalGo.g:6337:2: rule__Import_decl__Group__1__Impl
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
    // InternalGo.g:6343:1: rule__Import_decl__Group__1__Impl : ( ( rule__Import_decl__Alternatives_1 ) ) ;
    public final void rule__Import_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6347:1: ( ( ( rule__Import_decl__Alternatives_1 ) ) )
            // InternalGo.g:6348:1: ( ( rule__Import_decl__Alternatives_1 ) )
            {
            // InternalGo.g:6348:1: ( ( rule__Import_decl__Alternatives_1 ) )
            // InternalGo.g:6349:2: ( rule__Import_decl__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getAlternatives_1()); 
            }
            // InternalGo.g:6350:2: ( rule__Import_decl__Alternatives_1 )
            // InternalGo.g:6350:3: rule__Import_decl__Alternatives_1
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
    // InternalGo.g:6359:1: rule__Import_decl__Group_1_1__0 : rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 ;
    public final void rule__Import_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6363:1: ( rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 )
            // InternalGo.g:6364:2: rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalGo.g:6371:1: rule__Import_decl__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Import_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6375:1: ( ( '(' ) )
            // InternalGo.g:6376:1: ( '(' )
            {
            // InternalGo.g:6376:1: ( '(' )
            // InternalGo.g:6377:2: '('
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
    // InternalGo.g:6386:1: rule__Import_decl__Group_1_1__1 : rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 ;
    public final void rule__Import_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6390:1: ( rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 )
            // InternalGo.g:6391:2: rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalGo.g:6398:1: rule__Import_decl__Group_1_1__1__Impl : ( ( rule__Import_decl__Group_1_1_1__0 )* ) ;
    public final void rule__Import_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6402:1: ( ( ( rule__Import_decl__Group_1_1_1__0 )* ) )
            // InternalGo.g:6403:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            {
            // InternalGo.g:6403:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            // InternalGo.g:6404:2: ( rule__Import_decl__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getGroup_1_1_1()); 
            }
            // InternalGo.g:6405:2: ( rule__Import_decl__Group_1_1_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_RAW_STRING_LIT && LA57_0<=RULE_IDENTIFIER)||LA57_0==47||LA57_0==59) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGo.g:6405:3: rule__Import_decl__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Import_decl__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalGo.g:6413:1: rule__Import_decl__Group_1_1__2 : rule__Import_decl__Group_1_1__2__Impl ;
    public final void rule__Import_decl__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6417:1: ( rule__Import_decl__Group_1_1__2__Impl )
            // InternalGo.g:6418:2: rule__Import_decl__Group_1_1__2__Impl
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
    // InternalGo.g:6424:1: rule__Import_decl__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Import_decl__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6428:1: ( ( ')' ) )
            // InternalGo.g:6429:1: ( ')' )
            {
            // InternalGo.g:6429:1: ( ')' )
            // InternalGo.g:6430:2: ')'
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
    // InternalGo.g:6440:1: rule__Import_decl__Group_1_1_1__0 : rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 ;
    public final void rule__Import_decl__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6444:1: ( rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 )
            // InternalGo.g:6445:2: rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1
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
    // InternalGo.g:6452:1: rule__Import_decl__Group_1_1_1__0__Impl : ( ruleImport_spec ) ;
    public final void rule__Import_decl__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6456:1: ( ( ruleImport_spec ) )
            // InternalGo.g:6457:1: ( ruleImport_spec )
            {
            // InternalGo.g:6457:1: ( ruleImport_spec )
            // InternalGo.g:6458:2: ruleImport_spec
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
    // InternalGo.g:6467:1: rule__Import_decl__Group_1_1_1__1 : rule__Import_decl__Group_1_1_1__1__Impl ;
    public final void rule__Import_decl__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6471:1: ( rule__Import_decl__Group_1_1_1__1__Impl )
            // InternalGo.g:6472:2: rule__Import_decl__Group_1_1_1__1__Impl
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
    // InternalGo.g:6478:1: rule__Import_decl__Group_1_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Import_decl__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6482:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:6483:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:6483:1: ( RULE_SEMICOLON )
            // InternalGo.g:6484:2: RULE_SEMICOLON
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
    // InternalGo.g:6494:1: rule__Import_spec__Group__0 : rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 ;
    public final void rule__Import_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6498:1: ( rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 )
            // InternalGo.g:6499:2: rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalGo.g:6506:1: rule__Import_spec__Group__0__Impl : ( ( rule__Import_spec__Alternatives_0 )? ) ;
    public final void rule__Import_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6510:1: ( ( ( rule__Import_spec__Alternatives_0 )? ) )
            // InternalGo.g:6511:1: ( ( rule__Import_spec__Alternatives_0 )? )
            {
            // InternalGo.g:6511:1: ( ( rule__Import_spec__Alternatives_0 )? )
            // InternalGo.g:6512:2: ( rule__Import_spec__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getAlternatives_0()); 
            }
            // InternalGo.g:6513:2: ( rule__Import_spec__Alternatives_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_IDENTIFIER||LA58_0==47) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalGo.g:6513:3: rule__Import_spec__Alternatives_0
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
    // InternalGo.g:6521:1: rule__Import_spec__Group__1 : rule__Import_spec__Group__1__Impl ;
    public final void rule__Import_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6525:1: ( rule__Import_spec__Group__1__Impl )
            // InternalGo.g:6526:2: rule__Import_spec__Group__1__Impl
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
    // InternalGo.g:6532:1: rule__Import_spec__Group__1__Impl : ( ruleImport_path ) ;
    public final void rule__Import_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6536:1: ( ( ruleImport_path ) )
            // InternalGo.g:6537:1: ( ruleImport_path )
            {
            // InternalGo.g:6537:1: ( ruleImport_path )
            // InternalGo.g:6538:2: ruleImport_path
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
    // InternalGo.g:6548:1: rule__Model__GreetingsAssignment : ( ruleprogram ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6552:1: ( ( ruleprogram ) )
            // InternalGo.g:6553:2: ( ruleprogram )
            {
            // InternalGo.g:6553:2: ( ruleprogram )
            // InternalGo.g:6554:3: ruleprogram
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
        // InternalGo.g:2130:2: ( ( ruleParameters ) )
        // InternalGo.g:2130:2: ( ruleParameters )
        {
        // InternalGo.g:2130:2: ( ruleParameters )
        // InternalGo.g:2131:3: ruleParameters
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

    // $ANTLR start synpred77_InternalGo
    public final void synpred77_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3635:4: ( ruleResult )
        // InternalGo.g:3635:4: ruleResult
        {
        pushFollow(FOLLOW_2);
        ruleResult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_InternalGo

    // $ANTLR start synpred80_InternalGo
    public final void synpred80_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3839:3: ( rule__Parameter_list__Group_1__0 )
        // InternalGo.g:3839:3: rule__Parameter_list__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Parameter_list__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_InternalGo

    // $ANTLR start synpred81_InternalGo
    public final void synpred81_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3948:3: ( rule__Parameter_decl__Group_0__0 )
        // InternalGo.g:3948:3: rule__Parameter_decl__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__Parameter_decl__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_InternalGo

    // $ANTLR start synpred90_InternalGo
    public final void synpred90_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:5730:3: ( rule__If_stmt__Group_1__0 )
        // InternalGo.g:5730:3: rule__If_stmt__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__If_stmt__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_InternalGo

    // Delegated rules

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
    public final boolean synpred90_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalGo_fragment(); // can never throw exception
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
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\uffff\1\2\21\uffff\1\26\5\uffff\1\26";
    static final String dfa_3s = "\1\10\1\5\4\uffff\3\10\1\57\5\10\1\57\2\10\1\57\1\5\2\10\1\uffff\2\10\1\5";
    static final String dfa_4s = "\2\73\4\uffff\1\62\2\64\1\62\2\64\3\10\1\57\2\10\1\57\1\73\2\64\1\uffff\2\10\1\73";
    static final String dfa_5s = "\2\uffff\1\1\1\4\1\5\1\3\20\uffff\1\2\3\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\4\53\uffff\1\3\1\4",
            "\1\2\2\uffff\3\2\3\uffff\3\2\22\uffff\1\2\13\uffff\1\6\1\uffff\1\7\1\10\6\uffff\1\5\2\2",
            "",
            "",
            "",
            "",
            "\1\11\46\uffff\1\14\1\uffff\1\12\1\13",
            "\1\17\52\uffff\1\15\1\16",
            "\1\17\52\uffff\1\15\1\16",
            "\1\14\1\uffff\1\12\1\13",
            "\1\22\52\uffff\1\20\1\21",
            "\1\22\52\uffff\1\20\1\21",
            "\1\23",
            "\1\17",
            "\1\17",
            "\1\14",
            "\1\22",
            "\1\22",
            "\1\14",
            "\1\26\2\uffff\3\26\3\uffff\3\26\22\uffff\1\26\15\uffff\1\24\1\25\6\uffff\1\5\2\26",
            "\1\31\52\uffff\1\27\1\30",
            "\1\31\52\uffff\1\27\1\30",
            "",
            "\1\31",
            "\1\31",
            "\1\26\2\uffff\3\26\3\uffff\3\26\22\uffff\1\26\25\uffff\1\5\2\26"
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
            return "1960:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\45\1\17\10\uffff";
    static final String dfa_10s = "\2\100\10\uffff";
    static final String dfa_11s = "\2\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\5\1\1";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\17\uffff\3\7\4\uffff\1\2\1\3\1\4\1\6\1\5",
            "\1\11\23\uffff\1\11\1\uffff\1\11\1\10\7\uffff\1\11\6\uffff\3\11\4\uffff\5\11",
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
            return "2047:1: rule__Type_lit__Alternatives : ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) );";
        }
    }
    static final String dfa_14s = "\15\uffff";
    static final String dfa_15s = "\1\17\1\0\13\uffff";
    static final String dfa_16s = "\1\100\1\0\13\uffff";
    static final String dfa_17s = "\2\uffff\1\2\11\uffff\1\1";
    static final String dfa_18s = "\1\uffff\1\0\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\23\uffff\1\1\1\uffff\1\2\17\uffff\3\2\4\uffff\5\2",
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
            return "2125:1: rule__Result__Alternatives : ( ( ruleParameters ) | ( ( ruleType ) ) );";
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
    static final String dfa_22s = "\1\6\1\uffff\13\0\11\uffff";
    static final String dfa_23s = "\1\100\1\uffff\13\0\11\uffff";
    static final String dfa_24s = "\1\uffff\1\2\23\uffff\1\1";
    static final String dfa_25s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\11\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\7\uffff\1\1\1\3\23\uffff\1\2\1\1\1\4\2\1\2\uffff\1\1\1\uffff\1\1\10\uffff\1\12\1\13\1\14\3\uffff\1\1\1\5\1\6\1\7\1\11\1\10",
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

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 3635:3: ( ruleResult )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_9 = input.LA(1);

                         
                        int index39_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_10 = input.LA(1);

                         
                        int index39_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA39_11 = input.LA(1);

                         
                        int index39_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA39_12 = input.LA(1);

                         
                        int index39_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\14\uffff";
    static final String dfa_28s = "\1\4\1\uffff\11\0\1\uffff";
    static final String dfa_29s = "\1\73\1\uffff\11\0\1\uffff";
    static final String dfa_30s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_31s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\3\uffff\1\2\1\3\1\4\3\uffff\1\6\1\10\1\12\22\uffff\1\11\26\uffff\1\5\1\7",
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

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "5730:2: ( rule__If_stmt__Group_1__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_4 = input.LA(1);

                         
                        int index52_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_5 = input.LA(1);

                         
                        int index52_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_7 = input.LA(1);

                         
                        int index52_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_8 = input.LA(1);

                         
                        int index52_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_9 = input.LA(1);

                         
                        int index52_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_10 = input.LA(1);

                         
                        int index52_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0100008800008002L,0x00000000000003F6L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0C0000080001C702L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0006800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0006800000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0018000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800000000003800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xF0E0002800008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xF0E0402800008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2000010000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2000000000008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0C00000000004700L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF0E0002800008002L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xF0E0402800008002L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100008800008000L,0x00000000000003F6L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xF0E0042800008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0C0000080001C700L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0C0000080001C710L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0C0080080000C700L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0C0080100000C700L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0C0080000000C702L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0C0080000000C700L});

}