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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_BINARY_OP", "RULE_SEMICOLON", "RULE_ASSIGN_OP", "RULE_INT", "RULE_OCTAL_LIT", "RULE_HEX_LIT", "RULE_UNICODE_VALUE", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_IDENTIFIER", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_NEWLINE", "RULE_UNICODE_LETTER", "RULE_LETTER", "RULE_UNICODE_DIGIT", "RULE_HEX_DIGIT", "RULE_KEYWORDS", "RULE_UNICODE_CHAR", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'='", "':='", "','", "'--'", "'...'", "'.'", "':'", "'E'", "'e'", "'+'", "'-'", "'chan'", "'chan<-'", "'<-chan'", "'fallthrough'", "'i'", "'\\''", "'\"'", "'struct'", "'*'", "'func'", "'interface'", "'map'", "'const'", "'type'", "'var'", "'if'", "'else'", "'go'", "'return'", "'break'", "'continue'", "'goto'", "'defer'", "'package'", "'import'"
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
    public static final int T__77=77;
    public static final int RULE_HEX_LIT=10;
    public static final int RULE_UNICODE_CHAR=26;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=18;
    public static final int T__75=75;
    public static final int T__76=76;
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

                if ( (LA1_0==RULE_WS||LA1_0==RULE_IDENTIFIER||LA1_0==35||LA1_0==39||LA1_0==56||(LA1_0>=65 && LA1_0<=68)||(LA1_0>=70 && LA1_0<=75)) ) {
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
    // InternalGo.g:905:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:909:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalGo.g:910:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalGo.g:910:2: ( ( rule__Declaration__Alternatives ) )
            // InternalGo.g:911:3: ( rule__Declaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            }
            // InternalGo.g:912:3: ( rule__Declaration__Alternatives )
            // InternalGo.g:912:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleType_decl"
    // InternalGo.g:996:1: entryRuleType_decl : ruleType_decl EOF ;
    public final void entryRuleType_decl() throws RecognitionException {
        try {
            // InternalGo.g:997:1: ( ruleType_decl EOF )
            // InternalGo.g:998:1: ruleType_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declRule()); 
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
    // $ANTLR end "entryRuleType_decl"


    // $ANTLR start "ruleType_decl"
    // InternalGo.g:1005:1: ruleType_decl : ( ( rule__Type_decl__Group__0 ) ) ;
    public final void ruleType_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1009:2: ( ( ( rule__Type_decl__Group__0 ) ) )
            // InternalGo.g:1010:2: ( ( rule__Type_decl__Group__0 ) )
            {
            // InternalGo.g:1010:2: ( ( rule__Type_decl__Group__0 ) )
            // InternalGo.g:1011:3: ( rule__Type_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getGroup()); 
            }
            // InternalGo.g:1012:3: ( rule__Type_decl__Group__0 )
            // InternalGo.g:1012:4: rule__Type_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_decl"


    // $ANTLR start "entryRuleType_spec"
    // InternalGo.g:1021:1: entryRuleType_spec : ruleType_spec EOF ;
    public final void entryRuleType_spec() throws RecognitionException {
        try {
            // InternalGo.g:1022:1: ( ruleType_spec EOF )
            // InternalGo.g:1023:1: ruleType_spec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_specRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_specRule()); 
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
    // $ANTLR end "entryRuleType_spec"


    // $ANTLR start "ruleType_spec"
    // InternalGo.g:1030:1: ruleType_spec : ( ( rule__Type_spec__Alternatives ) ) ;
    public final void ruleType_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1034:2: ( ( ( rule__Type_spec__Alternatives ) ) )
            // InternalGo.g:1035:2: ( ( rule__Type_spec__Alternatives ) )
            {
            // InternalGo.g:1035:2: ( ( rule__Type_spec__Alternatives ) )
            // InternalGo.g:1036:3: ( rule__Type_spec__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_specAccess().getAlternatives()); 
            }
            // InternalGo.g:1037:3: ( rule__Type_spec__Alternatives )
            // InternalGo.g:1037:4: rule__Type_spec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type_spec__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_specAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_spec"


    // $ANTLR start "entryRuleAlias_decl"
    // InternalGo.g:1046:1: entryRuleAlias_decl : ruleAlias_decl EOF ;
    public final void entryRuleAlias_decl() throws RecognitionException {
        try {
            // InternalGo.g:1047:1: ( ruleAlias_decl EOF )
            // InternalGo.g:1048:1: ruleAlias_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlias_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAlias_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlias_declRule()); 
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
    // $ANTLR end "entryRuleAlias_decl"


    // $ANTLR start "ruleAlias_decl"
    // InternalGo.g:1055:1: ruleAlias_decl : ( ( rule__Alias_decl__Group__0 ) ) ;
    public final void ruleAlias_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1059:2: ( ( ( rule__Alias_decl__Group__0 ) ) )
            // InternalGo.g:1060:2: ( ( rule__Alias_decl__Group__0 ) )
            {
            // InternalGo.g:1060:2: ( ( rule__Alias_decl__Group__0 ) )
            // InternalGo.g:1061:3: ( rule__Alias_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlias_declAccess().getGroup()); 
            }
            // InternalGo.g:1062:3: ( rule__Alias_decl__Group__0 )
            // InternalGo.g:1062:4: rule__Alias_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alias_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlias_declAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlias_decl"


    // $ANTLR start "entryRuleType_def"
    // InternalGo.g:1071:1: entryRuleType_def : ruleType_def EOF ;
    public final void entryRuleType_def() throws RecognitionException {
        try {
            // InternalGo.g:1072:1: ( ruleType_def EOF )
            // InternalGo.g:1073:1: ruleType_def EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_defRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType_def();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_defRule()); 
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
    // $ANTLR end "entryRuleType_def"


    // $ANTLR start "ruleType_def"
    // InternalGo.g:1080:1: ruleType_def : ( ( rule__Type_def__Group__0 ) ) ;
    public final void ruleType_def() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1084:2: ( ( ( rule__Type_def__Group__0 ) ) )
            // InternalGo.g:1085:2: ( ( rule__Type_def__Group__0 ) )
            {
            // InternalGo.g:1085:2: ( ( rule__Type_def__Group__0 ) )
            // InternalGo.g:1086:3: ( rule__Type_def__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_defAccess().getGroup()); 
            }
            // InternalGo.g:1087:3: ( rule__Type_def__Group__0 )
            // InternalGo.g:1087:4: rule__Type_def__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_def__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_defAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_def"


    // $ANTLR start "entryRuleVar_decl"
    // InternalGo.g:1096:1: entryRuleVar_decl : ruleVar_decl EOF ;
    public final void entryRuleVar_decl() throws RecognitionException {
        try {
            // InternalGo.g:1097:1: ( ruleVar_decl EOF )
            // InternalGo.g:1098:1: ruleVar_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVar_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declRule()); 
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
    // $ANTLR end "entryRuleVar_decl"


    // $ANTLR start "ruleVar_decl"
    // InternalGo.g:1105:1: ruleVar_decl : ( ( rule__Var_decl__Group__0 ) ) ;
    public final void ruleVar_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1109:2: ( ( ( rule__Var_decl__Group__0 ) ) )
            // InternalGo.g:1110:2: ( ( rule__Var_decl__Group__0 ) )
            {
            // InternalGo.g:1110:2: ( ( rule__Var_decl__Group__0 ) )
            // InternalGo.g:1111:3: ( rule__Var_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getGroup()); 
            }
            // InternalGo.g:1112:3: ( rule__Var_decl__Group__0 )
            // InternalGo.g:1112:4: rule__Var_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar_decl"


    // $ANTLR start "entryRuleVar_spec"
    // InternalGo.g:1121:1: entryRuleVar_spec : ruleVar_spec EOF ;
    public final void entryRuleVar_spec() throws RecognitionException {
        try {
            // InternalGo.g:1122:1: ( ruleVar_spec EOF )
            // InternalGo.g:1123:1: ruleVar_spec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVar_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specRule()); 
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
    // $ANTLR end "entryRuleVar_spec"


    // $ANTLR start "ruleVar_spec"
    // InternalGo.g:1130:1: ruleVar_spec : ( ( rule__Var_spec__Group__0 ) ) ;
    public final void ruleVar_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1134:2: ( ( ( rule__Var_spec__Group__0 ) ) )
            // InternalGo.g:1135:2: ( ( rule__Var_spec__Group__0 ) )
            {
            // InternalGo.g:1135:2: ( ( rule__Var_spec__Group__0 ) )
            // InternalGo.g:1136:3: ( rule__Var_spec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getGroup()); 
            }
            // InternalGo.g:1137:3: ( rule__Var_spec__Group__0 )
            // InternalGo.g:1137:4: rule__Var_spec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar_spec"


    // $ANTLR start "entryRuleShort_var_decl"
    // InternalGo.g:1146:1: entryRuleShort_var_decl : ruleShort_var_decl EOF ;
    public final void entryRuleShort_var_decl() throws RecognitionException {
        try {
            // InternalGo.g:1147:1: ( ruleShort_var_decl EOF )
            // InternalGo.g:1148:1: ruleShort_var_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShort_var_declRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShort_var_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShort_var_declRule()); 
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
    // $ANTLR end "entryRuleShort_var_decl"


    // $ANTLR start "ruleShort_var_decl"
    // InternalGo.g:1155:1: ruleShort_var_decl : ( ( rule__Short_var_decl__Group__0 ) ) ;
    public final void ruleShort_var_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1159:2: ( ( ( rule__Short_var_decl__Group__0 ) ) )
            // InternalGo.g:1160:2: ( ( rule__Short_var_decl__Group__0 ) )
            {
            // InternalGo.g:1160:2: ( ( rule__Short_var_decl__Group__0 ) )
            // InternalGo.g:1161:3: ( rule__Short_var_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShort_var_declAccess().getGroup()); 
            }
            // InternalGo.g:1162:3: ( rule__Short_var_decl__Group__0 )
            // InternalGo.g:1162:4: rule__Short_var_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Short_var_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShort_var_declAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShort_var_decl"


    // $ANTLR start "entryRuleFunction_decl"
    // InternalGo.g:1171:1: entryRuleFunction_decl : ruleFunction_decl EOF ;
    public final void entryRuleFunction_decl() throws RecognitionException {
        try {
            // InternalGo.g:1172:1: ( ruleFunction_decl EOF )
            // InternalGo.g:1173:1: ruleFunction_decl EOF
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
    // InternalGo.g:1180:1: ruleFunction_decl : ( ( rule__Function_decl__Group__0 ) ) ;
    public final void ruleFunction_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1184:2: ( ( ( rule__Function_decl__Group__0 ) ) )
            // InternalGo.g:1185:2: ( ( rule__Function_decl__Group__0 ) )
            {
            // InternalGo.g:1185:2: ( ( rule__Function_decl__Group__0 ) )
            // InternalGo.g:1186:3: ( rule__Function_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getGroup()); 
            }
            // InternalGo.g:1187:3: ( rule__Function_decl__Group__0 )
            // InternalGo.g:1187:4: rule__Function_decl__Group__0
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
    // InternalGo.g:1196:1: entryRuleFunction_body : ruleFunction_body EOF ;
    public final void entryRuleFunction_body() throws RecognitionException {
        try {
            // InternalGo.g:1197:1: ( ruleFunction_body EOF )
            // InternalGo.g:1198:1: ruleFunction_body EOF
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
    // InternalGo.g:1205:1: ruleFunction_body : ( ruleBlock ) ;
    public final void ruleFunction_body() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1209:2: ( ( ruleBlock ) )
            // InternalGo.g:1210:2: ( ruleBlock )
            {
            // InternalGo.g:1210:2: ( ruleBlock )
            // InternalGo.g:1211:3: ruleBlock
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
    // InternalGo.g:1221:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalGo.g:1222:1: ( ruleOperand EOF )
            // InternalGo.g:1223:1: ruleOperand EOF
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
    // InternalGo.g:1230:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1234:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalGo.g:1235:2: ( ( rule__Operand__Alternatives ) )
            {
            // InternalGo.g:1235:2: ( ( rule__Operand__Alternatives ) )
            // InternalGo.g:1236:3: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // InternalGo.g:1237:3: ( rule__Operand__Alternatives )
            // InternalGo.g:1237:4: rule__Operand__Alternatives
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
    // InternalGo.g:1246:1: entryRuleOperand_name : ruleOperand_name EOF ;
    public final void entryRuleOperand_name() throws RecognitionException {
        try {
            // InternalGo.g:1247:1: ( ruleOperand_name EOF )
            // InternalGo.g:1248:1: ruleOperand_name EOF
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
    // InternalGo.g:1255:1: ruleOperand_name : ( ( rule__Operand_name__Alternatives ) ) ;
    public final void ruleOperand_name() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1259:2: ( ( ( rule__Operand_name__Alternatives ) ) )
            // InternalGo.g:1260:2: ( ( rule__Operand_name__Alternatives ) )
            {
            // InternalGo.g:1260:2: ( ( rule__Operand_name__Alternatives ) )
            // InternalGo.g:1261:3: ( rule__Operand_name__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperand_nameAccess().getAlternatives()); 
            }
            // InternalGo.g:1262:3: ( rule__Operand_name__Alternatives )
            // InternalGo.g:1262:4: rule__Operand_name__Alternatives
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
    // InternalGo.g:1271:1: entryRuleQualified_ident : ruleQualified_ident EOF ;
    public final void entryRuleQualified_ident() throws RecognitionException {
        try {
            // InternalGo.g:1272:1: ( ruleQualified_ident EOF )
            // InternalGo.g:1273:1: ruleQualified_ident EOF
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
    // InternalGo.g:1280:1: ruleQualified_ident : ( ( rule__Qualified_ident__Group__0 ) ) ;
    public final void ruleQualified_ident() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1284:2: ( ( ( rule__Qualified_ident__Group__0 ) ) )
            // InternalGo.g:1285:2: ( ( rule__Qualified_ident__Group__0 ) )
            {
            // InternalGo.g:1285:2: ( ( rule__Qualified_ident__Group__0 ) )
            // InternalGo.g:1286:3: ( rule__Qualified_ident__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualified_identAccess().getGroup()); 
            }
            // InternalGo.g:1287:3: ( rule__Qualified_ident__Group__0 )
            // InternalGo.g:1287:4: rule__Qualified_ident__Group__0
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
    // InternalGo.g:1296:1: entryRulePrimary_expr : rulePrimary_expr EOF ;
    public final void entryRulePrimary_expr() throws RecognitionException {
        try {
            // InternalGo.g:1297:1: ( rulePrimary_expr EOF )
            // InternalGo.g:1298:1: rulePrimary_expr EOF
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
    // InternalGo.g:1305:1: rulePrimary_expr : ( ruleOperand ) ;
    public final void rulePrimary_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1309:2: ( ( ruleOperand ) )
            // InternalGo.g:1310:2: ( ruleOperand )
            {
            // InternalGo.g:1310:2: ( ruleOperand )
            // InternalGo.g:1311:3: ruleOperand
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
    // InternalGo.g:1321:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGo.g:1322:1: ( ruleExpression EOF )
            // InternalGo.g:1323:1: ruleExpression EOF
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
    // InternalGo.g:1330:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1334:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalGo.g:1335:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalGo.g:1335:2: ( ( rule__Expression__Group__0 ) )
            // InternalGo.g:1336:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalGo.g:1337:3: ( rule__Expression__Group__0 )
            // InternalGo.g:1337:4: rule__Expression__Group__0
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
    // InternalGo.g:1346:1: entryRuleExpression_line : ruleExpression_line EOF ;
    public final void entryRuleExpression_line() throws RecognitionException {
        try {
            // InternalGo.g:1347:1: ( ruleExpression_line EOF )
            // InternalGo.g:1348:1: ruleExpression_line EOF
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
    // InternalGo.g:1355:1: ruleExpression_line : ( ( rule__Expression_line__Group__0 ) ) ;
    public final void ruleExpression_line() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1359:2: ( ( ( rule__Expression_line__Group__0 ) ) )
            // InternalGo.g:1360:2: ( ( rule__Expression_line__Group__0 ) )
            {
            // InternalGo.g:1360:2: ( ( rule__Expression_line__Group__0 ) )
            // InternalGo.g:1361:3: ( rule__Expression_line__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_lineAccess().getGroup()); 
            }
            // InternalGo.g:1362:3: ( rule__Expression_line__Group__0 )
            // InternalGo.g:1362:4: rule__Expression_line__Group__0
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
    // InternalGo.g:1371:1: entryRuleUnary_expr : ruleUnary_expr EOF ;
    public final void entryRuleUnary_expr() throws RecognitionException {
        try {
            // InternalGo.g:1372:1: ( ruleUnary_expr EOF )
            // InternalGo.g:1373:1: ruleUnary_expr EOF
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
    // InternalGo.g:1380:1: ruleUnary_expr : ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) ) ;
    public final void ruleUnary_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1384:2: ( ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) ) )
            // InternalGo.g:1385:2: ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) )
            {
            // InternalGo.g:1385:2: ( ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* ) )
            // InternalGo.g:1386:3: ( ( rule__Unary_expr__Alternatives ) ) ( ( rule__Unary_expr__Alternatives )* )
            {
            // InternalGo.g:1386:3: ( ( rule__Unary_expr__Alternatives ) )
            // InternalGo.g:1387:4: ( rule__Unary_expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnary_exprAccess().getAlternatives()); 
            }
            // InternalGo.g:1388:4: ( rule__Unary_expr__Alternatives )
            // InternalGo.g:1388:5: rule__Unary_expr__Alternatives
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

            // InternalGo.g:1391:3: ( ( rule__Unary_expr__Alternatives )* )
            // InternalGo.g:1392:4: ( rule__Unary_expr__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnary_exprAccess().getAlternatives()); 
            }
            // InternalGo.g:1393:4: ( rule__Unary_expr__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_HEX_LIT)||(LA2_0>=RULE_RAW_STRING_LIT && LA2_0<=RULE_UNARY_OP)||LA2_0==35||(LA2_0>=58 && LA2_0<=59)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGo.g:1393:5: rule__Unary_expr__Alternatives
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
    // InternalGo.g:1403:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalGo.g:1404:1: ( ruleStatement EOF )
            // InternalGo.g:1405:1: ruleStatement EOF
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
    // InternalGo.g:1412:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1416:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalGo.g:1417:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalGo.g:1417:2: ( ( rule__Statement__Alternatives ) )
            // InternalGo.g:1418:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalGo.g:1419:3: ( rule__Statement__Alternatives )
            // InternalGo.g:1419:4: rule__Statement__Alternatives
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
    // InternalGo.g:1428:1: entryRuleSimple_stmt : ruleSimple_stmt EOF ;
    public final void entryRuleSimple_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1429:1: ( ruleSimple_stmt EOF )
            // InternalGo.g:1430:1: ruleSimple_stmt EOF
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
    // InternalGo.g:1437:1: ruleSimple_stmt : ( ( rule__Simple_stmt__Alternatives ) ) ;
    public final void ruleSimple_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1441:2: ( ( ( rule__Simple_stmt__Alternatives ) ) )
            // InternalGo.g:1442:2: ( ( rule__Simple_stmt__Alternatives ) )
            {
            // InternalGo.g:1442:2: ( ( rule__Simple_stmt__Alternatives ) )
            // InternalGo.g:1443:3: ( rule__Simple_stmt__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_stmtAccess().getAlternatives()); 
            }
            // InternalGo.g:1444:3: ( rule__Simple_stmt__Alternatives )
            // InternalGo.g:1444:4: rule__Simple_stmt__Alternatives
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
    // InternalGo.g:1453:1: entryRuleEmpty_stmt : ruleEmpty_stmt EOF ;
    public final void entryRuleEmpty_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1454:1: ( ruleEmpty_stmt EOF )
            // InternalGo.g:1455:1: ruleEmpty_stmt EOF
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
    // InternalGo.g:1462:1: ruleEmpty_stmt : ( RULE_WS ) ;
    public final void ruleEmpty_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1466:2: ( ( RULE_WS ) )
            // InternalGo.g:1467:2: ( RULE_WS )
            {
            // InternalGo.g:1467:2: ( RULE_WS )
            // InternalGo.g:1468:3: RULE_WS
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
    // InternalGo.g:1478:1: entryRuleLabeled_stmt : ruleLabeled_stmt EOF ;
    public final void entryRuleLabeled_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1479:1: ( ruleLabeled_stmt EOF )
            // InternalGo.g:1480:1: ruleLabeled_stmt EOF
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
    // InternalGo.g:1487:1: ruleLabeled_stmt : ( ( rule__Labeled_stmt__Group__0 ) ) ;
    public final void ruleLabeled_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1491:2: ( ( ( rule__Labeled_stmt__Group__0 ) ) )
            // InternalGo.g:1492:2: ( ( rule__Labeled_stmt__Group__0 ) )
            {
            // InternalGo.g:1492:2: ( ( rule__Labeled_stmt__Group__0 ) )
            // InternalGo.g:1493:3: ( rule__Labeled_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeled_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1494:3: ( rule__Labeled_stmt__Group__0 )
            // InternalGo.g:1494:4: rule__Labeled_stmt__Group__0
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


    // $ANTLR start "entryRuleIf_stmt"
    // InternalGo.g:1503:1: entryRuleIf_stmt : ruleIf_stmt EOF ;
    public final void entryRuleIf_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1504:1: ( ruleIf_stmt EOF )
            // InternalGo.g:1505:1: ruleIf_stmt EOF
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
    // InternalGo.g:1512:1: ruleIf_stmt : ( ( rule__If_stmt__Group__0 ) ) ;
    public final void ruleIf_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1516:2: ( ( ( rule__If_stmt__Group__0 ) ) )
            // InternalGo.g:1517:2: ( ( rule__If_stmt__Group__0 ) )
            {
            // InternalGo.g:1517:2: ( ( rule__If_stmt__Group__0 ) )
            // InternalGo.g:1518:3: ( rule__If_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1519:3: ( rule__If_stmt__Group__0 )
            // InternalGo.g:1519:4: rule__If_stmt__Group__0
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
    // InternalGo.g:1528:1: entryRuleGo_stmt : ruleGo_stmt EOF ;
    public final void entryRuleGo_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1529:1: ( ruleGo_stmt EOF )
            // InternalGo.g:1530:1: ruleGo_stmt EOF
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
    // InternalGo.g:1537:1: ruleGo_stmt : ( ( rule__Go_stmt__Group__0 ) ) ;
    public final void ruleGo_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1541:2: ( ( ( rule__Go_stmt__Group__0 ) ) )
            // InternalGo.g:1542:2: ( ( rule__Go_stmt__Group__0 ) )
            {
            // InternalGo.g:1542:2: ( ( rule__Go_stmt__Group__0 ) )
            // InternalGo.g:1543:3: ( rule__Go_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGo_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1544:3: ( rule__Go_stmt__Group__0 )
            // InternalGo.g:1544:4: rule__Go_stmt__Group__0
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
    // InternalGo.g:1553:1: entryRuleReturn_stmt : ruleReturn_stmt EOF ;
    public final void entryRuleReturn_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1554:1: ( ruleReturn_stmt EOF )
            // InternalGo.g:1555:1: ruleReturn_stmt EOF
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
    // InternalGo.g:1562:1: ruleReturn_stmt : ( ( rule__Return_stmt__Group__0 ) ) ;
    public final void ruleReturn_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1566:2: ( ( ( rule__Return_stmt__Group__0 ) ) )
            // InternalGo.g:1567:2: ( ( rule__Return_stmt__Group__0 ) )
            {
            // InternalGo.g:1567:2: ( ( rule__Return_stmt__Group__0 ) )
            // InternalGo.g:1568:3: ( rule__Return_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturn_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1569:3: ( rule__Return_stmt__Group__0 )
            // InternalGo.g:1569:4: rule__Return_stmt__Group__0
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
    // InternalGo.g:1578:1: entryRuleBreak_stmt : ruleBreak_stmt EOF ;
    public final void entryRuleBreak_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1579:1: ( ruleBreak_stmt EOF )
            // InternalGo.g:1580:1: ruleBreak_stmt EOF
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
    // InternalGo.g:1587:1: ruleBreak_stmt : ( ( rule__Break_stmt__Group__0 ) ) ;
    public final void ruleBreak_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1591:2: ( ( ( rule__Break_stmt__Group__0 ) ) )
            // InternalGo.g:1592:2: ( ( rule__Break_stmt__Group__0 ) )
            {
            // InternalGo.g:1592:2: ( ( rule__Break_stmt__Group__0 ) )
            // InternalGo.g:1593:3: ( rule__Break_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreak_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1594:3: ( rule__Break_stmt__Group__0 )
            // InternalGo.g:1594:4: rule__Break_stmt__Group__0
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
    // InternalGo.g:1603:1: entryRuleContinue_stmt : ruleContinue_stmt EOF ;
    public final void entryRuleContinue_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1604:1: ( ruleContinue_stmt EOF )
            // InternalGo.g:1605:1: ruleContinue_stmt EOF
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
    // InternalGo.g:1612:1: ruleContinue_stmt : ( ( rule__Continue_stmt__Group__0 ) ) ;
    public final void ruleContinue_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1616:2: ( ( ( rule__Continue_stmt__Group__0 ) ) )
            // InternalGo.g:1617:2: ( ( rule__Continue_stmt__Group__0 ) )
            {
            // InternalGo.g:1617:2: ( ( rule__Continue_stmt__Group__0 ) )
            // InternalGo.g:1618:3: ( rule__Continue_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContinue_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1619:3: ( rule__Continue_stmt__Group__0 )
            // InternalGo.g:1619:4: rule__Continue_stmt__Group__0
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
    // InternalGo.g:1628:1: entryRuleGoto_stmt : ruleGoto_stmt EOF ;
    public final void entryRuleGoto_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1629:1: ( ruleGoto_stmt EOF )
            // InternalGo.g:1630:1: ruleGoto_stmt EOF
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
    // InternalGo.g:1637:1: ruleGoto_stmt : ( ( rule__Goto_stmt__Group__0 ) ) ;
    public final void ruleGoto_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1641:2: ( ( ( rule__Goto_stmt__Group__0 ) ) )
            // InternalGo.g:1642:2: ( ( rule__Goto_stmt__Group__0 ) )
            {
            // InternalGo.g:1642:2: ( ( rule__Goto_stmt__Group__0 ) )
            // InternalGo.g:1643:3: ( rule__Goto_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoto_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1644:3: ( rule__Goto_stmt__Group__0 )
            // InternalGo.g:1644:4: rule__Goto_stmt__Group__0
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
    // InternalGo.g:1653:1: entryRuleDefer_stmt : ruleDefer_stmt EOF ;
    public final void entryRuleDefer_stmt() throws RecognitionException {
        try {
            // InternalGo.g:1654:1: ( ruleDefer_stmt EOF )
            // InternalGo.g:1655:1: ruleDefer_stmt EOF
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
    // InternalGo.g:1662:1: ruleDefer_stmt : ( ( rule__Defer_stmt__Group__0 ) ) ;
    public final void ruleDefer_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1666:2: ( ( ( rule__Defer_stmt__Group__0 ) ) )
            // InternalGo.g:1667:2: ( ( rule__Defer_stmt__Group__0 ) )
            {
            // InternalGo.g:1667:2: ( ( rule__Defer_stmt__Group__0 ) )
            // InternalGo.g:1668:3: ( rule__Defer_stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefer_stmtAccess().getGroup()); 
            }
            // InternalGo.g:1669:3: ( rule__Defer_stmt__Group__0 )
            // InternalGo.g:1669:4: rule__Defer_stmt__Group__0
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
    // InternalGo.g:1678:1: entryRulePackage_clause : rulePackage_clause EOF ;
    public final void entryRulePackage_clause() throws RecognitionException {
        try {
            // InternalGo.g:1679:1: ( rulePackage_clause EOF )
            // InternalGo.g:1680:1: rulePackage_clause EOF
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
    // InternalGo.g:1687:1: rulePackage_clause : ( ( rule__Package_clause__Group__0 ) ) ;
    public final void rulePackage_clause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1691:2: ( ( ( rule__Package_clause__Group__0 ) ) )
            // InternalGo.g:1692:2: ( ( rule__Package_clause__Group__0 ) )
            {
            // InternalGo.g:1692:2: ( ( rule__Package_clause__Group__0 ) )
            // InternalGo.g:1693:3: ( rule__Package_clause__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseAccess().getGroup()); 
            }
            // InternalGo.g:1694:3: ( rule__Package_clause__Group__0 )
            // InternalGo.g:1694:4: rule__Package_clause__Group__0
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
    // InternalGo.g:1703:1: entryRuleImport_decl : ruleImport_decl EOF ;
    public final void entryRuleImport_decl() throws RecognitionException {
        try {
            // InternalGo.g:1704:1: ( ruleImport_decl EOF )
            // InternalGo.g:1705:1: ruleImport_decl EOF
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
    // InternalGo.g:1712:1: ruleImport_decl : ( ( rule__Import_decl__Group__0 ) ) ;
    public final void ruleImport_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1716:2: ( ( ( rule__Import_decl__Group__0 ) ) )
            // InternalGo.g:1717:2: ( ( rule__Import_decl__Group__0 ) )
            {
            // InternalGo.g:1717:2: ( ( rule__Import_decl__Group__0 ) )
            // InternalGo.g:1718:3: ( rule__Import_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getGroup()); 
            }
            // InternalGo.g:1719:3: ( rule__Import_decl__Group__0 )
            // InternalGo.g:1719:4: rule__Import_decl__Group__0
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
    // InternalGo.g:1728:1: entryRuleImport_spec : ruleImport_spec EOF ;
    public final void entryRuleImport_spec() throws RecognitionException {
        try {
            // InternalGo.g:1729:1: ( ruleImport_spec EOF )
            // InternalGo.g:1730:1: ruleImport_spec EOF
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
    // InternalGo.g:1737:1: ruleImport_spec : ( ( rule__Import_spec__Group__0 ) ) ;
    public final void ruleImport_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1741:2: ( ( ( rule__Import_spec__Group__0 ) ) )
            // InternalGo.g:1742:2: ( ( rule__Import_spec__Group__0 ) )
            {
            // InternalGo.g:1742:2: ( ( rule__Import_spec__Group__0 ) )
            // InternalGo.g:1743:3: ( rule__Import_spec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getGroup()); 
            }
            // InternalGo.g:1744:3: ( rule__Import_spec__Group__0 )
            // InternalGo.g:1744:4: rule__Import_spec__Group__0
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
    // InternalGo.g:1753:1: entryRuleImport_path : ruleImport_path EOF ;
    public final void entryRuleImport_path() throws RecognitionException {
        try {
            // InternalGo.g:1754:1: ( ruleImport_path EOF )
            // InternalGo.g:1755:1: ruleImport_path EOF
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
    // InternalGo.g:1762:1: ruleImport_path : ( ruleString_lit ) ;
    public final void ruleImport_path() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1766:2: ( ( ruleString_lit ) )
            // InternalGo.g:1767:2: ( ruleString_lit )
            {
            // InternalGo.g:1767:2: ( ruleString_lit )
            // InternalGo.g:1768:3: ruleString_lit
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
    // InternalGo.g:1777:1: rule__Program__Alternatives : ( ( ruleImport_decl ) | ( rulePackage_clause ) | ( ruleFunction_decl ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1781:1: ( ( ruleImport_decl ) | ( rulePackage_clause ) | ( ruleFunction_decl ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt3=1;
                }
                break;
            case 76:
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
                    // InternalGo.g:1782:2: ( ruleImport_decl )
                    {
                    // InternalGo.g:1782:2: ( ruleImport_decl )
                    // InternalGo.g:1783:3: ruleImport_decl
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
                    // InternalGo.g:1788:2: ( rulePackage_clause )
                    {
                    // InternalGo.g:1788:2: ( rulePackage_clause )
                    // InternalGo.g:1789:3: rulePackage_clause
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
                    // InternalGo.g:1794:2: ( ruleFunction_decl )
                    {
                    // InternalGo.g:1794:2: ( ruleFunction_decl )
                    // InternalGo.g:1795:3: ruleFunction_decl
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
    // InternalGo.g:1804:1: rule__OPERATORS__Alternatives : ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) );
    public final void rule__OPERATORS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1808:1: ( ( RULE_BINARY_OP ) | ( '(' ) | ( ')' ) | ( '[' ) | ( ']' ) | ( '{' ) | ( '}' ) | ( '++' ) | ( '=' ) | ( ':=' ) | ( ',' ) | ( RULE_SEMICOLON ) | ( '--' ) | ( '...' ) | ( '.' ) | ( ':' ) | ( RULE_ASSIGN_OP ) )
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
                    // InternalGo.g:1809:2: ( RULE_BINARY_OP )
                    {
                    // InternalGo.g:1809:2: ( RULE_BINARY_OP )
                    // InternalGo.g:1810:3: RULE_BINARY_OP
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
                    // InternalGo.g:1815:2: ( '(' )
                    {
                    // InternalGo.g:1815:2: ( '(' )
                    // InternalGo.g:1816:3: '('
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
                    // InternalGo.g:1821:2: ( ')' )
                    {
                    // InternalGo.g:1821:2: ( ')' )
                    // InternalGo.g:1822:3: ')'
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
                    // InternalGo.g:1827:2: ( '[' )
                    {
                    // InternalGo.g:1827:2: ( '[' )
                    // InternalGo.g:1828:3: '['
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
                    // InternalGo.g:1833:2: ( ']' )
                    {
                    // InternalGo.g:1833:2: ( ']' )
                    // InternalGo.g:1834:3: ']'
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
                    // InternalGo.g:1839:2: ( '{' )
                    {
                    // InternalGo.g:1839:2: ( '{' )
                    // InternalGo.g:1840:3: '{'
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
                    // InternalGo.g:1845:2: ( '}' )
                    {
                    // InternalGo.g:1845:2: ( '}' )
                    // InternalGo.g:1846:3: '}'
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
                    // InternalGo.g:1851:2: ( '++' )
                    {
                    // InternalGo.g:1851:2: ( '++' )
                    // InternalGo.g:1852:3: '++'
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
                    // InternalGo.g:1857:2: ( '=' )
                    {
                    // InternalGo.g:1857:2: ( '=' )
                    // InternalGo.g:1858:3: '='
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
                    // InternalGo.g:1863:2: ( ':=' )
                    {
                    // InternalGo.g:1863:2: ( ':=' )
                    // InternalGo.g:1864:3: ':='
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
                    // InternalGo.g:1869:2: ( ',' )
                    {
                    // InternalGo.g:1869:2: ( ',' )
                    // InternalGo.g:1870:3: ','
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
                    // InternalGo.g:1875:2: ( RULE_SEMICOLON )
                    {
                    // InternalGo.g:1875:2: ( RULE_SEMICOLON )
                    // InternalGo.g:1876:3: RULE_SEMICOLON
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
                    // InternalGo.g:1881:2: ( '--' )
                    {
                    // InternalGo.g:1881:2: ( '--' )
                    // InternalGo.g:1882:3: '--'
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
                    // InternalGo.g:1887:2: ( '...' )
                    {
                    // InternalGo.g:1887:2: ( '...' )
                    // InternalGo.g:1888:3: '...'
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
                    // InternalGo.g:1893:2: ( '.' )
                    {
                    // InternalGo.g:1893:2: ( '.' )
                    // InternalGo.g:1894:3: '.'
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
                    // InternalGo.g:1899:2: ( ':' )
                    {
                    // InternalGo.g:1899:2: ( ':' )
                    // InternalGo.g:1900:3: ':'
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
                    // InternalGo.g:1905:2: ( RULE_ASSIGN_OP )
                    {
                    // InternalGo.g:1905:2: ( RULE_ASSIGN_OP )
                    // InternalGo.g:1906:3: RULE_ASSIGN_OP
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
    // InternalGo.g:1915:1: rule__Int_lit__Alternatives : ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) );
    public final void rule__Int_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1919:1: ( ( RULE_INT ) | ( RULE_OCTAL_LIT ) | ( RULE_HEX_LIT ) )
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
                    // InternalGo.g:1920:2: ( RULE_INT )
                    {
                    // InternalGo.g:1920:2: ( RULE_INT )
                    // InternalGo.g:1921:3: RULE_INT
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
                    // InternalGo.g:1926:2: ( RULE_OCTAL_LIT )
                    {
                    // InternalGo.g:1926:2: ( RULE_OCTAL_LIT )
                    // InternalGo.g:1927:3: RULE_OCTAL_LIT
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
                    // InternalGo.g:1932:2: ( RULE_HEX_LIT )
                    {
                    // InternalGo.g:1932:2: ( RULE_HEX_LIT )
                    // InternalGo.g:1933:3: RULE_HEX_LIT
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
    // InternalGo.g:1942:1: rule__Float_lit__Alternatives_1 : ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) );
    public final void rule__Float_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1946:1: ( ( ( rule__Float_lit__Group_1_0__0 ) ) | ( ruleExponent ) )
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
                    // InternalGo.g:1947:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    {
                    // InternalGo.g:1947:2: ( ( rule__Float_lit__Group_1_0__0 ) )
                    // InternalGo.g:1948:3: ( rule__Float_lit__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloat_litAccess().getGroup_1_0()); 
                    }
                    // InternalGo.g:1949:3: ( rule__Float_lit__Group_1_0__0 )
                    // InternalGo.g:1949:4: rule__Float_lit__Group_1_0__0
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
                    // InternalGo.g:1953:2: ( ruleExponent )
                    {
                    // InternalGo.g:1953:2: ( ruleExponent )
                    // InternalGo.g:1954:3: ruleExponent
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
    // InternalGo.g:1963:1: rule__Exponent__Alternatives_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Exponent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1967:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalGo.g:1968:2: ( 'E' )
                    {
                    // InternalGo.g:1968:2: ( 'E' )
                    // InternalGo.g:1969:3: 'E'
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
                    // InternalGo.g:1974:2: ( 'e' )
                    {
                    // InternalGo.g:1974:2: ( 'e' )
                    // InternalGo.g:1975:3: 'e'
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
    // InternalGo.g:1984:1: rule__Exponent__Alternatives_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Exponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1988:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalGo.g:1989:2: ( '+' )
                    {
                    // InternalGo.g:1989:2: ( '+' )
                    // InternalGo.g:1990:3: '+'
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
                    // InternalGo.g:1995:2: ( '-' )
                    {
                    // InternalGo.g:1995:2: ( '-' )
                    // InternalGo.g:1996:3: '-'
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
    // InternalGo.g:2005:1: rule__Imaginary_lit__Alternatives_0 : ( ( RULE_INT ) | ( ruleFloat_lit ) );
    public final void rule__Imaginary_lit__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2009:1: ( ( RULE_INT ) | ( ruleFloat_lit ) )
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
                    // InternalGo.g:2010:2: ( RULE_INT )
                    {
                    // InternalGo.g:2010:2: ( RULE_INT )
                    // InternalGo.g:2011:3: RULE_INT
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
                    // InternalGo.g:2016:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:2016:2: ( ruleFloat_lit )
                    // InternalGo.g:2017:3: ruleFloat_lit
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
    // InternalGo.g:2026:1: rule__Rune_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Rune_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2030:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
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
                    // InternalGo.g:2031:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:2031:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:2032:3: RULE_UNICODE_VALUE
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
                    // InternalGo.g:2037:2: ( ruleByte_value )
                    {
                    // InternalGo.g:2037:2: ( ruleByte_value )
                    // InternalGo.g:2038:3: ruleByte_value
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
    // InternalGo.g:2047:1: rule__Byte_value__Alternatives : ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) );
    public final void rule__Byte_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2051:1: ( ( RULE_OCTAL_BYTE_VALUE ) | ( RULE_HEX_BYTE_VALUE ) )
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
                    // InternalGo.g:2052:2: ( RULE_OCTAL_BYTE_VALUE )
                    {
                    // InternalGo.g:2052:2: ( RULE_OCTAL_BYTE_VALUE )
                    // InternalGo.g:2053:3: RULE_OCTAL_BYTE_VALUE
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
                    // InternalGo.g:2058:2: ( RULE_HEX_BYTE_VALUE )
                    {
                    // InternalGo.g:2058:2: ( RULE_HEX_BYTE_VALUE )
                    // InternalGo.g:2059:3: RULE_HEX_BYTE_VALUE
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
    // InternalGo.g:2068:1: rule__String_lit__Alternatives : ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) );
    public final void rule__String_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2072:1: ( ( RULE_RAW_STRING_LIT ) | ( ruleInterpreted_string_lit ) )
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
                    // InternalGo.g:2073:2: ( RULE_RAW_STRING_LIT )
                    {
                    // InternalGo.g:2073:2: ( RULE_RAW_STRING_LIT )
                    // InternalGo.g:2074:3: RULE_RAW_STRING_LIT
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
                    // InternalGo.g:2079:2: ( ruleInterpreted_string_lit )
                    {
                    // InternalGo.g:2079:2: ( ruleInterpreted_string_lit )
                    // InternalGo.g:2080:3: ruleInterpreted_string_lit
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
    // InternalGo.g:2089:1: rule__Interpreted_string_lit__Alternatives_1 : ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) );
    public final void rule__Interpreted_string_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2093:1: ( ( RULE_UNICODE_VALUE ) | ( ruleByte_value ) )
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
                    // InternalGo.g:2094:2: ( RULE_UNICODE_VALUE )
                    {
                    // InternalGo.g:2094:2: ( RULE_UNICODE_VALUE )
                    // InternalGo.g:2095:3: RULE_UNICODE_VALUE
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
                    // InternalGo.g:2100:2: ( ruleByte_value )
                    {
                    // InternalGo.g:2100:2: ( ruleByte_value )
                    // InternalGo.g:2101:3: ruleByte_value
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
    // InternalGo.g:2110:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );
    public final void rule__Literals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2114:1: ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) )
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGo.g:2115:2: ( ruleInt_lit )
                    {
                    // InternalGo.g:2115:2: ( ruleInt_lit )
                    // InternalGo.g:2116:3: ruleInt_lit
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
                    // InternalGo.g:2121:2: ( ruleFloat_lit )
                    {
                    // InternalGo.g:2121:2: ( ruleFloat_lit )
                    // InternalGo.g:2122:3: ruleFloat_lit
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
                    // InternalGo.g:2127:2: ( ruleImaginary_lit )
                    {
                    // InternalGo.g:2127:2: ( ruleImaginary_lit )
                    // InternalGo.g:2128:3: ruleImaginary_lit
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
                    // InternalGo.g:2133:2: ( ruleRune_lit )
                    {
                    // InternalGo.g:2133:2: ( ruleRune_lit )
                    // InternalGo.g:2134:3: ruleRune_lit
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
                    // InternalGo.g:2139:2: ( ruleString_lit )
                    {
                    // InternalGo.g:2139:2: ( ruleString_lit )
                    // InternalGo.g:2140:3: ruleString_lit
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
    // InternalGo.g:2149:1: rule__Type__Alternatives : ( ( ruleType_name ) | ( ruleType_lit ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2153:1: ( ( ruleType_name ) | ( ruleType_lit ) | ( ( rule__Type__Group_2__0 ) ) )
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
                    // InternalGo.g:2154:2: ( ruleType_name )
                    {
                    // InternalGo.g:2154:2: ( ruleType_name )
                    // InternalGo.g:2155:3: ruleType_name
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
                    // InternalGo.g:2160:2: ( ruleType_lit )
                    {
                    // InternalGo.g:2160:2: ( ruleType_lit )
                    // InternalGo.g:2161:3: ruleType_lit
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
                    // InternalGo.g:2166:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalGo.g:2166:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalGo.g:2167:3: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // InternalGo.g:2168:3: ( rule__Type__Group_2__0 )
                    // InternalGo.g:2168:4: rule__Type__Group_2__0
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
    // InternalGo.g:2176:1: rule__Type_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Type_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2180:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
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
                    // InternalGo.g:2181:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:2181:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:2182:3: RULE_IDENTIFIER
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
                    // InternalGo.g:2187:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:2187:2: ( ruleQualified_ident )
                    // InternalGo.g:2188:3: ruleQualified_ident
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
    // InternalGo.g:2197:1: rule__Type_lit__Alternatives : ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) );
    public final void rule__Type_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2201:1: ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalGo.g:2202:2: ( ruleArray_type )
                    {
                    // InternalGo.g:2202:2: ( ruleArray_type )
                    // InternalGo.g:2203:3: ruleArray_type
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
                    // InternalGo.g:2208:2: ( ruleStruct_type )
                    {
                    // InternalGo.g:2208:2: ( ruleStruct_type )
                    // InternalGo.g:2209:3: ruleStruct_type
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
                    // InternalGo.g:2214:2: ( rulePointer_type )
                    {
                    // InternalGo.g:2214:2: ( rulePointer_type )
                    // InternalGo.g:2215:3: rulePointer_type
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
                    // InternalGo.g:2220:2: ( ruleFunction_type )
                    {
                    // InternalGo.g:2220:2: ( ruleFunction_type )
                    // InternalGo.g:2221:3: ruleFunction_type
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
                    // InternalGo.g:2226:2: ( ruleSlice_type )
                    {
                    // InternalGo.g:2226:2: ( ruleSlice_type )
                    // InternalGo.g:2227:3: ruleSlice_type
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
                    // InternalGo.g:2232:2: ( ruleMap_type )
                    {
                    // InternalGo.g:2232:2: ( ruleMap_type )
                    // InternalGo.g:2233:3: ruleMap_type
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
                    // InternalGo.g:2238:2: ( ruleInterface_type )
                    {
                    // InternalGo.g:2238:2: ( ruleInterface_type )
                    // InternalGo.g:2239:3: ruleInterface_type
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
                    // InternalGo.g:2244:2: ( ruleChannel_type )
                    {
                    // InternalGo.g:2244:2: ( ruleChannel_type )
                    // InternalGo.g:2245:3: ruleChannel_type
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
    // InternalGo.g:2254:1: rule__Field_decl__Alternatives_0 : ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) );
    public final void rule__Field_decl__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2258:1: ( ( ( rule__Field_decl__Group_0_0__0 ) ) | ( ruleEmbedded_field ) )
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
                    // InternalGo.g:2259:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    {
                    // InternalGo.g:2259:2: ( ( rule__Field_decl__Group_0_0__0 ) )
                    // InternalGo.g:2260:3: ( rule__Field_decl__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declAccess().getGroup_0_0()); 
                    }
                    // InternalGo.g:2261:3: ( rule__Field_decl__Group_0_0__0 )
                    // InternalGo.g:2261:4: rule__Field_decl__Group_0_0__0
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
                    // InternalGo.g:2265:2: ( ruleEmbedded_field )
                    {
                    // InternalGo.g:2265:2: ( ruleEmbedded_field )
                    // InternalGo.g:2266:3: ruleEmbedded_field
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
    // InternalGo.g:2275:1: rule__Result__Alternatives : ( ( ruleParameters ) | ( ( ruleType ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2279:1: ( ( ruleParameters ) | ( ( ruleType ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalGo.g:2280:2: ( ruleParameters )
                    {
                    // InternalGo.g:2280:2: ( ruleParameters )
                    // InternalGo.g:2281:3: ruleParameters
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
                    // InternalGo.g:2286:2: ( ( ruleType ) )
                    {
                    // InternalGo.g:2286:2: ( ( ruleType ) )
                    // InternalGo.g:2287:3: ( ruleType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultAccess().getTypeParserRuleCall_1()); 
                    }
                    // InternalGo.g:2288:3: ( ruleType )
                    // InternalGo.g:2288:4: ruleType
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
    // InternalGo.g:2296:1: rule__Method_spec__Alternatives : ( ( ( rule__Method_spec__Group_0__0 ) ) | ( ruleType_name ) );
    public final void rule__Method_spec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2300:1: ( ( ( rule__Method_spec__Group_0__0 ) ) | ( ruleType_name ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==35) ) {
                    alt20=1;
                }
                else if ( (LA20_1==EOF||LA20_1==RULE_SEMICOLON||LA20_1==47) ) {
                    alt20=2;
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
                    // InternalGo.g:2301:2: ( ( rule__Method_spec__Group_0__0 ) )
                    {
                    // InternalGo.g:2301:2: ( ( rule__Method_spec__Group_0__0 ) )
                    // InternalGo.g:2302:3: ( rule__Method_spec__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_specAccess().getGroup_0()); 
                    }
                    // InternalGo.g:2303:3: ( rule__Method_spec__Group_0__0 )
                    // InternalGo.g:2303:4: rule__Method_spec__Group_0__0
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
                    // InternalGo.g:2307:2: ( ruleType_name )
                    {
                    // InternalGo.g:2307:2: ( ruleType_name )
                    // InternalGo.g:2308:3: ruleType_name
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
    // InternalGo.g:2317:1: rule__Channel_type__Alternatives_0 : ( ( 'chan' ) | ( 'chan<-' ) | ( '<-chan' ) );
    public final void rule__Channel_type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2321:1: ( ( 'chan' ) | ( 'chan<-' ) | ( '<-chan' ) )
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
                    // InternalGo.g:2322:2: ( 'chan' )
                    {
                    // InternalGo.g:2322:2: ( 'chan' )
                    // InternalGo.g:2323:3: 'chan'
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
                    // InternalGo.g:2328:2: ( 'chan<-' )
                    {
                    // InternalGo.g:2328:2: ( 'chan<-' )
                    // InternalGo.g:2329:3: 'chan<-'
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
                    // InternalGo.g:2334:2: ( '<-chan' )
                    {
                    // InternalGo.g:2334:2: ( '<-chan' )
                    // InternalGo.g:2335:3: '<-chan'
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


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalGo.g:2344:1: rule__Declaration__Alternatives : ( ( ruleConst_decl ) | ( ruleType_decl ) | ( ruleVar_decl ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2348:1: ( ( ruleConst_decl ) | ( ruleType_decl ) | ( ruleVar_decl ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 35:
            case 65:
                {
                alt22=1;
                }
                break;
            case 66:
                {
                alt22=2;
                }
                break;
            case 67:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGo.g:2349:2: ( ruleConst_decl )
                    {
                    // InternalGo.g:2349:2: ( ruleConst_decl )
                    // InternalGo.g:2350:3: ruleConst_decl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getConst_declParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConst_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getConst_declParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2355:2: ( ruleType_decl )
                    {
                    // InternalGo.g:2355:2: ( ruleType_decl )
                    // InternalGo.g:2356:3: ruleType_decl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getType_declParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleType_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getType_declParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2361:2: ( ruleVar_decl )
                    {
                    // InternalGo.g:2361:2: ( ruleVar_decl )
                    // InternalGo.g:2362:3: ruleVar_decl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getVar_declParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVar_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getVar_declParserRuleCall_2()); 
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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Const_decl__Alternatives"
    // InternalGo.g:2371:1: rule__Const_decl__Alternatives : ( ( ( rule__Const_decl__Group_0__0 ) ) | ( ( rule__Const_decl__Group_1__0 ) ) );
    public final void rule__Const_decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2375:1: ( ( ( rule__Const_decl__Group_0__0 ) ) | ( ( rule__Const_decl__Group_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==65) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:2376:2: ( ( rule__Const_decl__Group_0__0 ) )
                    {
                    // InternalGo.g:2376:2: ( ( rule__Const_decl__Group_0__0 ) )
                    // InternalGo.g:2377:3: ( rule__Const_decl__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_declAccess().getGroup_0()); 
                    }
                    // InternalGo.g:2378:3: ( rule__Const_decl__Group_0__0 )
                    // InternalGo.g:2378:4: rule__Const_decl__Group_0__0
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
                    // InternalGo.g:2382:2: ( ( rule__Const_decl__Group_1__0 ) )
                    {
                    // InternalGo.g:2382:2: ( ( rule__Const_decl__Group_1__0 ) )
                    // InternalGo.g:2383:3: ( rule__Const_decl__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_declAccess().getGroup_1()); 
                    }
                    // InternalGo.g:2384:3: ( rule__Const_decl__Group_1__0 )
                    // InternalGo.g:2384:4: rule__Const_decl__Group_1__0
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


    // $ANTLR start "rule__Type_decl__Alternatives_1"
    // InternalGo.g:2392:1: rule__Type_decl__Alternatives_1 : ( ( ruleType_spec ) | ( ( rule__Type_decl__Group_1_1__0 ) ) );
    public final void rule__Type_decl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2396:1: ( ( ruleType_spec ) | ( ( rule__Type_decl__Group_1_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENTIFIER) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:2397:2: ( ruleType_spec )
                    {
                    // InternalGo.g:2397:2: ( ruleType_spec )
                    // InternalGo.g:2398:3: ruleType_spec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declAccess().getType_specParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleType_spec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_declAccess().getType_specParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2403:2: ( ( rule__Type_decl__Group_1_1__0 ) )
                    {
                    // InternalGo.g:2403:2: ( ( rule__Type_decl__Group_1_1__0 ) )
                    // InternalGo.g:2404:3: ( rule__Type_decl__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declAccess().getGroup_1_1()); 
                    }
                    // InternalGo.g:2405:3: ( rule__Type_decl__Group_1_1__0 )
                    // InternalGo.g:2405:4: rule__Type_decl__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_decl__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_declAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Type_decl__Alternatives_1"


    // $ANTLR start "rule__Type_spec__Alternatives"
    // InternalGo.g:2413:1: rule__Type_spec__Alternatives : ( ( ruleAlias_decl ) | ( ruleType_def ) );
    public final void rule__Type_spec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2417:1: ( ( ruleAlias_decl ) | ( ruleType_def ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_IDENTIFIER) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==42) ) {
                    alt25=1;
                }
                else if ( (LA25_1==RULE_IDENTIFIER||LA25_1==35||LA25_1==37||(LA25_1>=53 && LA25_1<=55)||(LA25_1>=60 && LA25_1<=64)) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:2418:2: ( ruleAlias_decl )
                    {
                    // InternalGo.g:2418:2: ( ruleAlias_decl )
                    // InternalGo.g:2419:3: ruleAlias_decl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specAccess().getAlias_declParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAlias_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specAccess().getAlias_declParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2424:2: ( ruleType_def )
                    {
                    // InternalGo.g:2424:2: ( ruleType_def )
                    // InternalGo.g:2425:3: ruleType_def
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specAccess().getType_defParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleType_def();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specAccess().getType_defParserRuleCall_1()); 
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
    // $ANTLR end "rule__Type_spec__Alternatives"


    // $ANTLR start "rule__Var_decl__Alternatives_1"
    // InternalGo.g:2434:1: rule__Var_decl__Alternatives_1 : ( ( ruleVar_spec ) | ( ( rule__Var_decl__Group_1_1__0 ) ) );
    public final void rule__Var_decl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2438:1: ( ( ruleVar_spec ) | ( ( rule__Var_decl__Group_1_1__0 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_IDENTIFIER) ) {
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
                    // InternalGo.g:2439:2: ( ruleVar_spec )
                    {
                    // InternalGo.g:2439:2: ( ruleVar_spec )
                    // InternalGo.g:2440:3: ruleVar_spec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_declAccess().getVar_specParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVar_spec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_declAccess().getVar_specParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2445:2: ( ( rule__Var_decl__Group_1_1__0 ) )
                    {
                    // InternalGo.g:2445:2: ( ( rule__Var_decl__Group_1_1__0 ) )
                    // InternalGo.g:2446:3: ( rule__Var_decl__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_declAccess().getGroup_1_1()); 
                    }
                    // InternalGo.g:2447:3: ( rule__Var_decl__Group_1_1__0 )
                    // InternalGo.g:2447:4: rule__Var_decl__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_decl__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_declAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Var_decl__Alternatives_1"


    // $ANTLR start "rule__Var_spec__Alternatives_1"
    // InternalGo.g:2455:1: rule__Var_spec__Alternatives_1 : ( ( ( rule__Var_spec__Group_1_0__0 ) ) | ( ( rule__Var_spec__Group_1_1__0 ) ) );
    public final void rule__Var_spec__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2459:1: ( ( ( rule__Var_spec__Group_1_0__0 ) ) | ( ( rule__Var_spec__Group_1_1__0 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENTIFIER||LA27_0==35||LA27_0==37||(LA27_0>=53 && LA27_0<=55)||(LA27_0>=60 && LA27_0<=64)) ) {
                alt27=1;
            }
            else if ( (LA27_0==42) ) {
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
                    // InternalGo.g:2460:2: ( ( rule__Var_spec__Group_1_0__0 ) )
                    {
                    // InternalGo.g:2460:2: ( ( rule__Var_spec__Group_1_0__0 ) )
                    // InternalGo.g:2461:3: ( rule__Var_spec__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_specAccess().getGroup_1_0()); 
                    }
                    // InternalGo.g:2462:3: ( rule__Var_spec__Group_1_0__0 )
                    // InternalGo.g:2462:4: rule__Var_spec__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_spec__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_specAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2466:2: ( ( rule__Var_spec__Group_1_1__0 ) )
                    {
                    // InternalGo.g:2466:2: ( ( rule__Var_spec__Group_1_1__0 ) )
                    // InternalGo.g:2467:3: ( rule__Var_spec__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_specAccess().getGroup_1_1()); 
                    }
                    // InternalGo.g:2468:3: ( rule__Var_spec__Group_1_1__0 )
                    // InternalGo.g:2468:4: rule__Var_spec__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_spec__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_specAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Var_spec__Alternatives_1"


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalGo.g:2476:1: rule__Operand__Alternatives : ( ( ruleLiterals ) | ( ruleOperand_name ) | ( ( rule__Operand__Group_2__0 ) ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2480:1: ( ( ruleLiterals ) | ( ruleOperand_name ) | ( ( rule__Operand__Group_2__0 ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_OCTAL_LIT:
            case RULE_HEX_LIT:
            case RULE_RAW_STRING_LIT:
            case 58:
            case 59:
                {
                alt28=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt28=2;
                }
                break;
            case 35:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalGo.g:2481:2: ( ruleLiterals )
                    {
                    // InternalGo.g:2481:2: ( ruleLiterals )
                    // InternalGo.g:2482:3: ruleLiterals
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
                    // InternalGo.g:2487:2: ( ruleOperand_name )
                    {
                    // InternalGo.g:2487:2: ( ruleOperand_name )
                    // InternalGo.g:2488:3: ruleOperand_name
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
                    // InternalGo.g:2493:2: ( ( rule__Operand__Group_2__0 ) )
                    {
                    // InternalGo.g:2493:2: ( ( rule__Operand__Group_2__0 ) )
                    // InternalGo.g:2494:3: ( rule__Operand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getGroup_2()); 
                    }
                    // InternalGo.g:2495:3: ( rule__Operand__Group_2__0 )
                    // InternalGo.g:2495:4: rule__Operand__Group_2__0
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
    // InternalGo.g:2503:1: rule__Operand_name__Alternatives : ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) );
    public final void rule__Operand_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2507:1: ( ( RULE_IDENTIFIER ) | ( ruleQualified_ident ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_IDENTIFIER) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==47) ) {
                    alt29=2;
                }
                else if ( (LA29_1==EOF||LA29_1==RULE_BINARY_OP||(LA29_1>=RULE_INT && LA29_1<=RULE_HEX_LIT)||(LA29_1>=RULE_RAW_STRING_LIT && LA29_1<=RULE_UNARY_OP)||LA29_1==35||(LA29_1>=58 && LA29_1<=59)) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:2508:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:2508:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:2509:3: RULE_IDENTIFIER
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
                    // InternalGo.g:2514:2: ( ruleQualified_ident )
                    {
                    // InternalGo.g:2514:2: ( ruleQualified_ident )
                    // InternalGo.g:2515:3: ruleQualified_ident
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
    // InternalGo.g:2524:1: rule__Unary_expr__Alternatives : ( ( rulePrimary_expr ) | ( RULE_UNARY_OP ) );
    public final void rule__Unary_expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2528:1: ( ( rulePrimary_expr ) | ( RULE_UNARY_OP ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_HEX_LIT)||(LA30_0>=RULE_RAW_STRING_LIT && LA30_0<=RULE_IDENTIFIER)||LA30_0==35||(LA30_0>=58 && LA30_0<=59)) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_UNARY_OP) ) {
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
                    // InternalGo.g:2529:2: ( rulePrimary_expr )
                    {
                    // InternalGo.g:2529:2: ( rulePrimary_expr )
                    // InternalGo.g:2530:3: rulePrimary_expr
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
                    // InternalGo.g:2535:2: ( RULE_UNARY_OP )
                    {
                    // InternalGo.g:2535:2: ( RULE_UNARY_OP )
                    // InternalGo.g:2536:3: RULE_UNARY_OP
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
    // InternalGo.g:2545:1: rule__Statement__Alternatives : ( ( ruleDeclaration ) | ( ruleLabeled_stmt ) | ( ruleGo_stmt ) | ( ruleReturn_stmt ) | ( ruleBreak_stmt ) | ( ruleContinue_stmt ) | ( ruleGoto_stmt ) | ( 'fallthrough' ) | ( ruleBlock ) | ( ruleIf_stmt ) | ( ruleDefer_stmt ) | ( ruleSimple_stmt ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2549:1: ( ( ruleDeclaration ) | ( ruleLabeled_stmt ) | ( ruleGo_stmt ) | ( ruleReturn_stmt ) | ( ruleBreak_stmt ) | ( ruleContinue_stmt ) | ( ruleGoto_stmt ) | ( 'fallthrough' ) | ( ruleBlock ) | ( ruleIf_stmt ) | ( ruleDefer_stmt ) | ( ruleSimple_stmt ) )
            int alt31=12;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalGo.g:2550:2: ( ruleDeclaration )
                    {
                    // InternalGo.g:2550:2: ( ruleDeclaration )
                    // InternalGo.g:2551:3: ruleDeclaration
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
                    // InternalGo.g:2556:2: ( ruleLabeled_stmt )
                    {
                    // InternalGo.g:2556:2: ( ruleLabeled_stmt )
                    // InternalGo.g:2557:3: ruleLabeled_stmt
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
                    // InternalGo.g:2562:2: ( ruleGo_stmt )
                    {
                    // InternalGo.g:2562:2: ( ruleGo_stmt )
                    // InternalGo.g:2563:3: ruleGo_stmt
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
                    // InternalGo.g:2568:2: ( ruleReturn_stmt )
                    {
                    // InternalGo.g:2568:2: ( ruleReturn_stmt )
                    // InternalGo.g:2569:3: ruleReturn_stmt
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
                    // InternalGo.g:2574:2: ( ruleBreak_stmt )
                    {
                    // InternalGo.g:2574:2: ( ruleBreak_stmt )
                    // InternalGo.g:2575:3: ruleBreak_stmt
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
                    // InternalGo.g:2580:2: ( ruleContinue_stmt )
                    {
                    // InternalGo.g:2580:2: ( ruleContinue_stmt )
                    // InternalGo.g:2581:3: ruleContinue_stmt
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
                    // InternalGo.g:2586:2: ( ruleGoto_stmt )
                    {
                    // InternalGo.g:2586:2: ( ruleGoto_stmt )
                    // InternalGo.g:2587:3: ruleGoto_stmt
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
                    // InternalGo.g:2592:2: ( 'fallthrough' )
                    {
                    // InternalGo.g:2592:2: ( 'fallthrough' )
                    // InternalGo.g:2593:3: 'fallthrough'
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
                    // InternalGo.g:2598:2: ( ruleBlock )
                    {
                    // InternalGo.g:2598:2: ( ruleBlock )
                    // InternalGo.g:2599:3: ruleBlock
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
                    // InternalGo.g:2604:2: ( ruleIf_stmt )
                    {
                    // InternalGo.g:2604:2: ( ruleIf_stmt )
                    // InternalGo.g:2605:3: ruleIf_stmt
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
                    // InternalGo.g:2610:2: ( ruleDefer_stmt )
                    {
                    // InternalGo.g:2610:2: ( ruleDefer_stmt )
                    // InternalGo.g:2611:3: ruleDefer_stmt
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
                case 12 :
                    // InternalGo.g:2616:2: ( ruleSimple_stmt )
                    {
                    // InternalGo.g:2616:2: ( ruleSimple_stmt )
                    // InternalGo.g:2617:3: ruleSimple_stmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSimple_stmtParserRuleCall_11()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSimple_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSimple_stmtParserRuleCall_11()); 
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
    // InternalGo.g:2626:1: rule__Simple_stmt__Alternatives : ( ( ruleEmpty_stmt ) | ( ruleShort_var_decl ) );
    public final void rule__Simple_stmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2630:1: ( ( ruleEmpty_stmt ) | ( ruleShort_var_decl ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_WS) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_IDENTIFIER) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:2631:2: ( ruleEmpty_stmt )
                    {
                    // InternalGo.g:2631:2: ( ruleEmpty_stmt )
                    // InternalGo.g:2632:3: ruleEmpty_stmt
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
                    // InternalGo.g:2637:2: ( ruleShort_var_decl )
                    {
                    // InternalGo.g:2637:2: ( ruleShort_var_decl )
                    // InternalGo.g:2638:3: ruleShort_var_decl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_stmtAccess().getShort_var_declParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShort_var_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_stmtAccess().getShort_var_declParserRuleCall_1()); 
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
    // InternalGo.g:2647:1: rule__If_stmt__Alternatives_4_1 : ( ( ruleIf_stmt ) | ( ruleBlock ) );
    public final void rule__If_stmt__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2651:1: ( ( ruleIf_stmt ) | ( ruleBlock ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==68) ) {
                alt33=1;
            }
            else if ( (LA33_0==39) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:2652:2: ( ruleIf_stmt )
                    {
                    // InternalGo.g:2652:2: ( ruleIf_stmt )
                    // InternalGo.g:2653:3: ruleIf_stmt
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
                    // InternalGo.g:2658:2: ( ruleBlock )
                    {
                    // InternalGo.g:2658:2: ( ruleBlock )
                    // InternalGo.g:2659:3: ruleBlock
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
    // InternalGo.g:2668:1: rule__Import_decl__Alternatives_1 : ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) );
    public final void rule__Import_decl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2672:1: ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_RAW_STRING_LIT && LA34_0<=RULE_IDENTIFIER)||LA34_0==47||LA34_0==59) ) {
                alt34=1;
            }
            else if ( (LA34_0==35) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:2673:2: ( ruleImport_spec )
                    {
                    // InternalGo.g:2673:2: ( ruleImport_spec )
                    // InternalGo.g:2674:3: ruleImport_spec
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
                    // InternalGo.g:2679:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    {
                    // InternalGo.g:2679:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    // InternalGo.g:2680:3: ( rule__Import_decl__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_declAccess().getGroup_1_1()); 
                    }
                    // InternalGo.g:2681:3: ( rule__Import_decl__Group_1_1__0 )
                    // InternalGo.g:2681:4: rule__Import_decl__Group_1_1__0
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
    // InternalGo.g:2689:1: rule__Import_spec__Alternatives_0 : ( ( '.' ) | ( RULE_IDENTIFIER ) );
    public final void rule__Import_spec__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2693:1: ( ( '.' ) | ( RULE_IDENTIFIER ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_IDENTIFIER) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGo.g:2694:2: ( '.' )
                    {
                    // InternalGo.g:2694:2: ( '.' )
                    // InternalGo.g:2695:3: '.'
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
                    // InternalGo.g:2700:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:2700:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:2701:3: RULE_IDENTIFIER
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
    // InternalGo.g:2710:1: rule__Float_lit__Group__0 : rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 ;
    public final void rule__Float_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2714:1: ( rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1 )
            // InternalGo.g:2715:2: rule__Float_lit__Group__0__Impl rule__Float_lit__Group__1
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
    // InternalGo.g:2722:1: rule__Float_lit__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2726:1: ( ( RULE_INT ) )
            // InternalGo.g:2727:1: ( RULE_INT )
            {
            // InternalGo.g:2727:1: ( RULE_INT )
            // InternalGo.g:2728:2: RULE_INT
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
    // InternalGo.g:2737:1: rule__Float_lit__Group__1 : rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 ;
    public final void rule__Float_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2741:1: ( rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2 )
            // InternalGo.g:2742:2: rule__Float_lit__Group__1__Impl rule__Float_lit__Group__2
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
    // InternalGo.g:2749:1: rule__Float_lit__Group__1__Impl : ( ( rule__Float_lit__Alternatives_1 ) ) ;
    public final void rule__Float_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2753:1: ( ( ( rule__Float_lit__Alternatives_1 ) ) )
            // InternalGo.g:2754:1: ( ( rule__Float_lit__Alternatives_1 ) )
            {
            // InternalGo.g:2754:1: ( ( rule__Float_lit__Alternatives_1 ) )
            // InternalGo.g:2755:2: ( rule__Float_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2756:2: ( rule__Float_lit__Alternatives_1 )
            // InternalGo.g:2756:3: rule__Float_lit__Alternatives_1
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
    // InternalGo.g:2764:1: rule__Float_lit__Group__2 : rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 ;
    public final void rule__Float_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2768:1: ( rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3 )
            // InternalGo.g:2769:2: rule__Float_lit__Group__2__Impl rule__Float_lit__Group__3
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
    // InternalGo.g:2776:1: rule__Float_lit__Group__2__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2780:1: ( ( '.' ) )
            // InternalGo.g:2781:1: ( '.' )
            {
            // InternalGo.g:2781:1: ( '.' )
            // InternalGo.g:2782:2: '.'
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
    // InternalGo.g:2791:1: rule__Float_lit__Group__3 : rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 ;
    public final void rule__Float_lit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2795:1: ( rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4 )
            // InternalGo.g:2796:2: rule__Float_lit__Group__3__Impl rule__Float_lit__Group__4
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
    // InternalGo.g:2803:1: rule__Float_lit__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float_lit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2807:1: ( ( RULE_INT ) )
            // InternalGo.g:2808:1: ( RULE_INT )
            {
            // InternalGo.g:2808:1: ( RULE_INT )
            // InternalGo.g:2809:2: RULE_INT
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
    // InternalGo.g:2818:1: rule__Float_lit__Group__4 : rule__Float_lit__Group__4__Impl ;
    public final void rule__Float_lit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2822:1: ( rule__Float_lit__Group__4__Impl )
            // InternalGo.g:2823:2: rule__Float_lit__Group__4__Impl
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
    // InternalGo.g:2829:1: rule__Float_lit__Group__4__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2833:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:2834:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:2834:1: ( ( ruleExponent )? )
            // InternalGo.g:2835:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_4()); 
            }
            // InternalGo.g:2836:2: ( ruleExponent )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=49 && LA36_0<=50)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGo.g:2836:3: ruleExponent
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
    // InternalGo.g:2845:1: rule__Float_lit__Group_1_0__0 : rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 ;
    public final void rule__Float_lit__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2849:1: ( rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1 )
            // InternalGo.g:2850:2: rule__Float_lit__Group_1_0__0__Impl rule__Float_lit__Group_1_0__1
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
    // InternalGo.g:2857:1: rule__Float_lit__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__Float_lit__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2861:1: ( ( '.' ) )
            // InternalGo.g:2862:1: ( '.' )
            {
            // InternalGo.g:2862:1: ( '.' )
            // InternalGo.g:2863:2: '.'
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
    // InternalGo.g:2872:1: rule__Float_lit__Group_1_0__1 : rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 ;
    public final void rule__Float_lit__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2876:1: ( rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2 )
            // InternalGo.g:2877:2: rule__Float_lit__Group_1_0__1__Impl rule__Float_lit__Group_1_0__2
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
    // InternalGo.g:2884:1: rule__Float_lit__Group_1_0__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Float_lit__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2888:1: ( ( ( RULE_INT )? ) )
            // InternalGo.g:2889:1: ( ( RULE_INT )? )
            {
            // InternalGo.g:2889:1: ( ( RULE_INT )? )
            // InternalGo.g:2890:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getINTTerminalRuleCall_1_0_1()); 
            }
            // InternalGo.g:2891:2: ( RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGo.g:2891:3: RULE_INT
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
    // InternalGo.g:2899:1: rule__Float_lit__Group_1_0__2 : rule__Float_lit__Group_1_0__2__Impl ;
    public final void rule__Float_lit__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2903:1: ( rule__Float_lit__Group_1_0__2__Impl )
            // InternalGo.g:2904:2: rule__Float_lit__Group_1_0__2__Impl
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
    // InternalGo.g:2910:1: rule__Float_lit__Group_1_0__2__Impl : ( ( ruleExponent )? ) ;
    public final void rule__Float_lit__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2914:1: ( ( ( ruleExponent )? ) )
            // InternalGo.g:2915:1: ( ( ruleExponent )? )
            {
            // InternalGo.g:2915:1: ( ( ruleExponent )? )
            // InternalGo.g:2916:2: ( ruleExponent )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_0_2()); 
            }
            // InternalGo.g:2917:2: ( ruleExponent )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=49 && LA38_0<=50)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGo.g:2917:3: ruleExponent
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
    // InternalGo.g:2926:1: rule__Exponent__Group__0 : rule__Exponent__Group__0__Impl rule__Exponent__Group__1 ;
    public final void rule__Exponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2930:1: ( rule__Exponent__Group__0__Impl rule__Exponent__Group__1 )
            // InternalGo.g:2931:2: rule__Exponent__Group__0__Impl rule__Exponent__Group__1
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
    // InternalGo.g:2938:1: rule__Exponent__Group__0__Impl : ( ( rule__Exponent__Alternatives_0 ) ) ;
    public final void rule__Exponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2942:1: ( ( ( rule__Exponent__Alternatives_0 ) ) )
            // InternalGo.g:2943:1: ( ( rule__Exponent__Alternatives_0 ) )
            {
            // InternalGo.g:2943:1: ( ( rule__Exponent__Alternatives_0 ) )
            // InternalGo.g:2944:2: ( rule__Exponent__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_0()); 
            }
            // InternalGo.g:2945:2: ( rule__Exponent__Alternatives_0 )
            // InternalGo.g:2945:3: rule__Exponent__Alternatives_0
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
    // InternalGo.g:2953:1: rule__Exponent__Group__1 : rule__Exponent__Group__1__Impl rule__Exponent__Group__2 ;
    public final void rule__Exponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2957:1: ( rule__Exponent__Group__1__Impl rule__Exponent__Group__2 )
            // InternalGo.g:2958:2: rule__Exponent__Group__1__Impl rule__Exponent__Group__2
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
    // InternalGo.g:2965:1: rule__Exponent__Group__1__Impl : ( ( rule__Exponent__Alternatives_1 )? ) ;
    public final void rule__Exponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2969:1: ( ( ( rule__Exponent__Alternatives_1 )? ) )
            // InternalGo.g:2970:1: ( ( rule__Exponent__Alternatives_1 )? )
            {
            // InternalGo.g:2970:1: ( ( rule__Exponent__Alternatives_1 )? )
            // InternalGo.g:2971:2: ( rule__Exponent__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2972:2: ( rule__Exponent__Alternatives_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=51 && LA39_0<=52)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGo.g:2972:3: rule__Exponent__Alternatives_1
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
    // InternalGo.g:2980:1: rule__Exponent__Group__2 : rule__Exponent__Group__2__Impl ;
    public final void rule__Exponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2984:1: ( rule__Exponent__Group__2__Impl )
            // InternalGo.g:2985:2: rule__Exponent__Group__2__Impl
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
    // InternalGo.g:2991:1: rule__Exponent__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Exponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2995:1: ( ( RULE_INT ) )
            // InternalGo.g:2996:1: ( RULE_INT )
            {
            // InternalGo.g:2996:1: ( RULE_INT )
            // InternalGo.g:2997:2: RULE_INT
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
    // InternalGo.g:3007:1: rule__Imaginary_lit__Group__0 : rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 ;
    public final void rule__Imaginary_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3011:1: ( rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1 )
            // InternalGo.g:3012:2: rule__Imaginary_lit__Group__0__Impl rule__Imaginary_lit__Group__1
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
    // InternalGo.g:3019:1: rule__Imaginary_lit__Group__0__Impl : ( ( rule__Imaginary_lit__Alternatives_0 ) ) ;
    public final void rule__Imaginary_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3023:1: ( ( ( rule__Imaginary_lit__Alternatives_0 ) ) )
            // InternalGo.g:3024:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            {
            // InternalGo.g:3024:1: ( ( rule__Imaginary_lit__Alternatives_0 ) )
            // InternalGo.g:3025:2: ( rule__Imaginary_lit__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImaginary_litAccess().getAlternatives_0()); 
            }
            // InternalGo.g:3026:2: ( rule__Imaginary_lit__Alternatives_0 )
            // InternalGo.g:3026:3: rule__Imaginary_lit__Alternatives_0
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
    // InternalGo.g:3034:1: rule__Imaginary_lit__Group__1 : rule__Imaginary_lit__Group__1__Impl ;
    public final void rule__Imaginary_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3038:1: ( rule__Imaginary_lit__Group__1__Impl )
            // InternalGo.g:3039:2: rule__Imaginary_lit__Group__1__Impl
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
    // InternalGo.g:3045:1: rule__Imaginary_lit__Group__1__Impl : ( 'i' ) ;
    public final void rule__Imaginary_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3049:1: ( ( 'i' ) )
            // InternalGo.g:3050:1: ( 'i' )
            {
            // InternalGo.g:3050:1: ( 'i' )
            // InternalGo.g:3051:2: 'i'
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
    // InternalGo.g:3061:1: rule__Rune_lit__Group__0 : rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 ;
    public final void rule__Rune_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3065:1: ( rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1 )
            // InternalGo.g:3066:2: rule__Rune_lit__Group__0__Impl rule__Rune_lit__Group__1
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
    // InternalGo.g:3073:1: rule__Rune_lit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3077:1: ( ( '\\'' ) )
            // InternalGo.g:3078:1: ( '\\'' )
            {
            // InternalGo.g:3078:1: ( '\\'' )
            // InternalGo.g:3079:2: '\\''
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
    // InternalGo.g:3088:1: rule__Rune_lit__Group__1 : rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 ;
    public final void rule__Rune_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3092:1: ( rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2 )
            // InternalGo.g:3093:2: rule__Rune_lit__Group__1__Impl rule__Rune_lit__Group__2
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
    // InternalGo.g:3100:1: rule__Rune_lit__Group__1__Impl : ( ( rule__Rune_lit__Alternatives_1 ) ) ;
    public final void rule__Rune_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3104:1: ( ( ( rule__Rune_lit__Alternatives_1 ) ) )
            // InternalGo.g:3105:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            {
            // InternalGo.g:3105:1: ( ( rule__Rune_lit__Alternatives_1 ) )
            // InternalGo.g:3106:2: ( rule__Rune_lit__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRune_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:3107:2: ( rule__Rune_lit__Alternatives_1 )
            // InternalGo.g:3107:3: rule__Rune_lit__Alternatives_1
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
    // InternalGo.g:3115:1: rule__Rune_lit__Group__2 : rule__Rune_lit__Group__2__Impl ;
    public final void rule__Rune_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3119:1: ( rule__Rune_lit__Group__2__Impl )
            // InternalGo.g:3120:2: rule__Rune_lit__Group__2__Impl
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
    // InternalGo.g:3126:1: rule__Rune_lit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Rune_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3130:1: ( ( '\\'' ) )
            // InternalGo.g:3131:1: ( '\\'' )
            {
            // InternalGo.g:3131:1: ( '\\'' )
            // InternalGo.g:3132:2: '\\''
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
    // InternalGo.g:3142:1: rule__Interpreted_string_lit__Group__0 : rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 ;
    public final void rule__Interpreted_string_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3146:1: ( rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 )
            // InternalGo.g:3147:2: rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1
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
    // InternalGo.g:3154:1: rule__Interpreted_string_lit__Group__0__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3158:1: ( ( '\"' ) )
            // InternalGo.g:3159:1: ( '\"' )
            {
            // InternalGo.g:3159:1: ( '\"' )
            // InternalGo.g:3160:2: '\"'
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
    // InternalGo.g:3169:1: rule__Interpreted_string_lit__Group__1 : rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 ;
    public final void rule__Interpreted_string_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3173:1: ( rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 )
            // InternalGo.g:3174:2: rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2
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
    // InternalGo.g:3181:1: rule__Interpreted_string_lit__Group__1__Impl : ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) ;
    public final void rule__Interpreted_string_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3185:1: ( ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) )
            // InternalGo.g:3186:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            {
            // InternalGo.g:3186:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            // InternalGo.g:3187:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 
            }
            // InternalGo.g:3188:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_UNICODE_VALUE && LA40_0<=RULE_HEX_BYTE_VALUE)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGo.g:3188:3: rule__Interpreted_string_lit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interpreted_string_lit__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalGo.g:3196:1: rule__Interpreted_string_lit__Group__2 : rule__Interpreted_string_lit__Group__2__Impl ;
    public final void rule__Interpreted_string_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3200:1: ( rule__Interpreted_string_lit__Group__2__Impl )
            // InternalGo.g:3201:2: rule__Interpreted_string_lit__Group__2__Impl
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
    // InternalGo.g:3207:1: rule__Interpreted_string_lit__Group__2__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3211:1: ( ( '\"' ) )
            // InternalGo.g:3212:1: ( '\"' )
            {
            // InternalGo.g:3212:1: ( '\"' )
            // InternalGo.g:3213:2: '\"'
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
    // InternalGo.g:3223:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3227:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalGo.g:3228:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalGo.g:3235:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3239:1: ( ( '(' ) )
            // InternalGo.g:3240:1: ( '(' )
            {
            // InternalGo.g:3240:1: ( '(' )
            // InternalGo.g:3241:2: '('
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
    // InternalGo.g:3250:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3254:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalGo.g:3255:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalGo.g:3262:1: rule__Type__Group_2__1__Impl : ( ruleType ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3266:1: ( ( ruleType ) )
            // InternalGo.g:3267:1: ( ruleType )
            {
            // InternalGo.g:3267:1: ( ruleType )
            // InternalGo.g:3268:2: ruleType
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
    // InternalGo.g:3277:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3281:1: ( rule__Type__Group_2__2__Impl )
            // InternalGo.g:3282:2: rule__Type__Group_2__2__Impl
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
    // InternalGo.g:3288:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3292:1: ( ( ')' ) )
            // InternalGo.g:3293:1: ( ')' )
            {
            // InternalGo.g:3293:1: ( ')' )
            // InternalGo.g:3294:2: ')'
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
    // InternalGo.g:3304:1: rule__Array_type__Group__0 : rule__Array_type__Group__0__Impl rule__Array_type__Group__1 ;
    public final void rule__Array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3308:1: ( rule__Array_type__Group__0__Impl rule__Array_type__Group__1 )
            // InternalGo.g:3309:2: rule__Array_type__Group__0__Impl rule__Array_type__Group__1
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
    // InternalGo.g:3316:1: rule__Array_type__Group__0__Impl : ( '[' ) ;
    public final void rule__Array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3320:1: ( ( '[' ) )
            // InternalGo.g:3321:1: ( '[' )
            {
            // InternalGo.g:3321:1: ( '[' )
            // InternalGo.g:3322:2: '['
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
    // InternalGo.g:3331:1: rule__Array_type__Group__1 : rule__Array_type__Group__1__Impl rule__Array_type__Group__2 ;
    public final void rule__Array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3335:1: ( rule__Array_type__Group__1__Impl rule__Array_type__Group__2 )
            // InternalGo.g:3336:2: rule__Array_type__Group__1__Impl rule__Array_type__Group__2
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
    // InternalGo.g:3343:1: rule__Array_type__Group__1__Impl : ( ( ruleParameter_list ) ) ;
    public final void rule__Array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3347:1: ( ( ( ruleParameter_list ) ) )
            // InternalGo.g:3348:1: ( ( ruleParameter_list ) )
            {
            // InternalGo.g:3348:1: ( ( ruleParameter_list ) )
            // InternalGo.g:3349:2: ( ruleParameter_list )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArray_typeAccess().getParameter_listParserRuleCall_1()); 
            }
            // InternalGo.g:3350:2: ( ruleParameter_list )
            // InternalGo.g:3350:3: ruleParameter_list
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
    // InternalGo.g:3358:1: rule__Array_type__Group__2 : rule__Array_type__Group__2__Impl rule__Array_type__Group__3 ;
    public final void rule__Array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3362:1: ( rule__Array_type__Group__2__Impl rule__Array_type__Group__3 )
            // InternalGo.g:3363:2: rule__Array_type__Group__2__Impl rule__Array_type__Group__3
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
    // InternalGo.g:3370:1: rule__Array_type__Group__2__Impl : ( ']' ) ;
    public final void rule__Array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3374:1: ( ( ']' ) )
            // InternalGo.g:3375:1: ( ']' )
            {
            // InternalGo.g:3375:1: ( ']' )
            // InternalGo.g:3376:2: ']'
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
    // InternalGo.g:3385:1: rule__Array_type__Group__3 : rule__Array_type__Group__3__Impl ;
    public final void rule__Array_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3389:1: ( rule__Array_type__Group__3__Impl )
            // InternalGo.g:3390:2: rule__Array_type__Group__3__Impl
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
    // InternalGo.g:3396:1: rule__Array_type__Group__3__Impl : ( ruleType ) ;
    public final void rule__Array_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3400:1: ( ( ruleType ) )
            // InternalGo.g:3401:1: ( ruleType )
            {
            // InternalGo.g:3401:1: ( ruleType )
            // InternalGo.g:3402:2: ruleType
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
    // InternalGo.g:3412:1: rule__Struct_type__Group__0 : rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 ;
    public final void rule__Struct_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3416:1: ( rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1 )
            // InternalGo.g:3417:2: rule__Struct_type__Group__0__Impl rule__Struct_type__Group__1
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
    // InternalGo.g:3424:1: rule__Struct_type__Group__0__Impl : ( 'struct' ) ;
    public final void rule__Struct_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3428:1: ( ( 'struct' ) )
            // InternalGo.g:3429:1: ( 'struct' )
            {
            // InternalGo.g:3429:1: ( 'struct' )
            // InternalGo.g:3430:2: 'struct'
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
    // InternalGo.g:3439:1: rule__Struct_type__Group__1 : rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 ;
    public final void rule__Struct_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3443:1: ( rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2 )
            // InternalGo.g:3444:2: rule__Struct_type__Group__1__Impl rule__Struct_type__Group__2
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
    // InternalGo.g:3451:1: rule__Struct_type__Group__1__Impl : ( '{' ) ;
    public final void rule__Struct_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3455:1: ( ( '{' ) )
            // InternalGo.g:3456:1: ( '{' )
            {
            // InternalGo.g:3456:1: ( '{' )
            // InternalGo.g:3457:2: '{'
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
    // InternalGo.g:3466:1: rule__Struct_type__Group__2 : rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 ;
    public final void rule__Struct_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3470:1: ( rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3 )
            // InternalGo.g:3471:2: rule__Struct_type__Group__2__Impl rule__Struct_type__Group__3
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
    // InternalGo.g:3478:1: rule__Struct_type__Group__2__Impl : ( ( rule__Struct_type__Group_2__0 )* ) ;
    public final void rule__Struct_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3482:1: ( ( ( rule__Struct_type__Group_2__0 )* ) )
            // InternalGo.g:3483:1: ( ( rule__Struct_type__Group_2__0 )* )
            {
            // InternalGo.g:3483:1: ( ( rule__Struct_type__Group_2__0 )* )
            // InternalGo.g:3484:2: ( rule__Struct_type__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStruct_typeAccess().getGroup_2()); 
            }
            // InternalGo.g:3485:2: ( rule__Struct_type__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_IDENTIFIER||LA41_0==61) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGo.g:3485:3: rule__Struct_type__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Struct_type__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalGo.g:3493:1: rule__Struct_type__Group__3 : rule__Struct_type__Group__3__Impl ;
    public final void rule__Struct_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3497:1: ( rule__Struct_type__Group__3__Impl )
            // InternalGo.g:3498:2: rule__Struct_type__Group__3__Impl
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
    // InternalGo.g:3504:1: rule__Struct_type__Group__3__Impl : ( '}' ) ;
    public final void rule__Struct_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3508:1: ( ( '}' ) )
            // InternalGo.g:3509:1: ( '}' )
            {
            // InternalGo.g:3509:1: ( '}' )
            // InternalGo.g:3510:2: '}'
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
    // InternalGo.g:3520:1: rule__Struct_type__Group_2__0 : rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 ;
    public final void rule__Struct_type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3524:1: ( rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1 )
            // InternalGo.g:3525:2: rule__Struct_type__Group_2__0__Impl rule__Struct_type__Group_2__1
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
    // InternalGo.g:3532:1: rule__Struct_type__Group_2__0__Impl : ( ruleField_decl ) ;
    public final void rule__Struct_type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3536:1: ( ( ruleField_decl ) )
            // InternalGo.g:3537:1: ( ruleField_decl )
            {
            // InternalGo.g:3537:1: ( ruleField_decl )
            // InternalGo.g:3538:2: ruleField_decl
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
    // InternalGo.g:3547:1: rule__Struct_type__Group_2__1 : rule__Struct_type__Group_2__1__Impl ;
    public final void rule__Struct_type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3551:1: ( rule__Struct_type__Group_2__1__Impl )
            // InternalGo.g:3552:2: rule__Struct_type__Group_2__1__Impl
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
    // InternalGo.g:3558:1: rule__Struct_type__Group_2__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Struct_type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3562:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:3563:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:3563:1: ( RULE_SEMICOLON )
            // InternalGo.g:3564:2: RULE_SEMICOLON
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
    // InternalGo.g:3574:1: rule__Field_decl__Group__0 : rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 ;
    public final void rule__Field_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3578:1: ( rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1 )
            // InternalGo.g:3579:2: rule__Field_decl__Group__0__Impl rule__Field_decl__Group__1
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
    // InternalGo.g:3586:1: rule__Field_decl__Group__0__Impl : ( ( rule__Field_decl__Alternatives_0 ) ) ;
    public final void rule__Field_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3590:1: ( ( ( rule__Field_decl__Alternatives_0 ) ) )
            // InternalGo.g:3591:1: ( ( rule__Field_decl__Alternatives_0 ) )
            {
            // InternalGo.g:3591:1: ( ( rule__Field_decl__Alternatives_0 ) )
            // InternalGo.g:3592:2: ( rule__Field_decl__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getAlternatives_0()); 
            }
            // InternalGo.g:3593:2: ( rule__Field_decl__Alternatives_0 )
            // InternalGo.g:3593:3: rule__Field_decl__Alternatives_0
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
    // InternalGo.g:3601:1: rule__Field_decl__Group__1 : rule__Field_decl__Group__1__Impl ;
    public final void rule__Field_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3605:1: ( rule__Field_decl__Group__1__Impl )
            // InternalGo.g:3606:2: rule__Field_decl__Group__1__Impl
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
    // InternalGo.g:3612:1: rule__Field_decl__Group__1__Impl : ( ( ruleString_lit )? ) ;
    public final void rule__Field_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3616:1: ( ( ( ruleString_lit )? ) )
            // InternalGo.g:3617:1: ( ( ruleString_lit )? )
            {
            // InternalGo.g:3617:1: ( ( ruleString_lit )? )
            // InternalGo.g:3618:2: ( ruleString_lit )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declAccess().getString_litParserRuleCall_1()); 
            }
            // InternalGo.g:3619:2: ( ruleString_lit )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_RAW_STRING_LIT||LA42_0==59) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGo.g:3619:3: ruleString_lit
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
    // InternalGo.g:3628:1: rule__Field_decl__Group_0_0__0 : rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 ;
    public final void rule__Field_decl__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3632:1: ( rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1 )
            // InternalGo.g:3633:2: rule__Field_decl__Group_0_0__0__Impl rule__Field_decl__Group_0_0__1
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
    // InternalGo.g:3640:1: rule__Field_decl__Group_0_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Field_decl__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3644:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:3645:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:3645:1: ( ruleIdentifier_list )
            // InternalGo.g:3646:2: ruleIdentifier_list
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
    // InternalGo.g:3655:1: rule__Field_decl__Group_0_0__1 : rule__Field_decl__Group_0_0__1__Impl ;
    public final void rule__Field_decl__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3659:1: ( rule__Field_decl__Group_0_0__1__Impl )
            // InternalGo.g:3660:2: rule__Field_decl__Group_0_0__1__Impl
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
    // InternalGo.g:3666:1: rule__Field_decl__Group_0_0__1__Impl : ( ruleType ) ;
    public final void rule__Field_decl__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3670:1: ( ( ruleType ) )
            // InternalGo.g:3671:1: ( ruleType )
            {
            // InternalGo.g:3671:1: ( ruleType )
            // InternalGo.g:3672:2: ruleType
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
    // InternalGo.g:3682:1: rule__Embedded_field__Group__0 : rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 ;
    public final void rule__Embedded_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3686:1: ( rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1 )
            // InternalGo.g:3687:2: rule__Embedded_field__Group__0__Impl rule__Embedded_field__Group__1
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
    // InternalGo.g:3694:1: rule__Embedded_field__Group__0__Impl : ( ( ( '*' ) ) ( ( '*' )* ) ) ;
    public final void rule__Embedded_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3698:1: ( ( ( ( '*' ) ) ( ( '*' )* ) ) )
            // InternalGo.g:3699:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            {
            // InternalGo.g:3699:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            // InternalGo.g:3700:2: ( ( '*' ) ) ( ( '*' )* )
            {
            // InternalGo.g:3700:2: ( ( '*' ) )
            // InternalGo.g:3701:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:3702:3: ( '*' )
            // InternalGo.g:3702:4: '*'
            {
            match(input,61,FOLLOW_25); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }

            }

            // InternalGo.g:3705:2: ( ( '*' )* )
            // InternalGo.g:3706:3: ( '*' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmbedded_fieldAccess().getAsteriskKeyword_0()); 
            }
            // InternalGo.g:3707:3: ( '*' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==61) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGo.g:3707:4: '*'
            	    {
            	    match(input,61,FOLLOW_25); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalGo.g:3716:1: rule__Embedded_field__Group__1 : rule__Embedded_field__Group__1__Impl ;
    public final void rule__Embedded_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3720:1: ( rule__Embedded_field__Group__1__Impl )
            // InternalGo.g:3721:2: rule__Embedded_field__Group__1__Impl
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
    // InternalGo.g:3727:1: rule__Embedded_field__Group__1__Impl : ( ruleType_name ) ;
    public final void rule__Embedded_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3731:1: ( ( ruleType_name ) )
            // InternalGo.g:3732:1: ( ruleType_name )
            {
            // InternalGo.g:3732:1: ( ruleType_name )
            // InternalGo.g:3733:2: ruleType_name
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
    // InternalGo.g:3743:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3747:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalGo.g:3748:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
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
    // InternalGo.g:3755:1: rule__Pointer_type__Group__0__Impl : ( '*' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3759:1: ( ( '*' ) )
            // InternalGo.g:3760:1: ( '*' )
            {
            // InternalGo.g:3760:1: ( '*' )
            // InternalGo.g:3761:2: '*'
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
    // InternalGo.g:3770:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3774:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalGo.g:3775:2: rule__Pointer_type__Group__1__Impl
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
    // InternalGo.g:3781:1: rule__Pointer_type__Group__1__Impl : ( ruleType ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3785:1: ( ( ruleType ) )
            // InternalGo.g:3786:1: ( ruleType )
            {
            // InternalGo.g:3786:1: ( ruleType )
            // InternalGo.g:3787:2: ruleType
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
    // InternalGo.g:3797:1: rule__Function_type__Group__0 : rule__Function_type__Group__0__Impl rule__Function_type__Group__1 ;
    public final void rule__Function_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3801:1: ( rule__Function_type__Group__0__Impl rule__Function_type__Group__1 )
            // InternalGo.g:3802:2: rule__Function_type__Group__0__Impl rule__Function_type__Group__1
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
    // InternalGo.g:3809:1: rule__Function_type__Group__0__Impl : ( 'func' ) ;
    public final void rule__Function_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3813:1: ( ( 'func' ) )
            // InternalGo.g:3814:1: ( 'func' )
            {
            // InternalGo.g:3814:1: ( 'func' )
            // InternalGo.g:3815:2: 'func'
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
    // InternalGo.g:3824:1: rule__Function_type__Group__1 : rule__Function_type__Group__1__Impl ;
    public final void rule__Function_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3828:1: ( rule__Function_type__Group__1__Impl )
            // InternalGo.g:3829:2: rule__Function_type__Group__1__Impl
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
    // InternalGo.g:3835:1: rule__Function_type__Group__1__Impl : ( ruleSignature ) ;
    public final void rule__Function_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3839:1: ( ( ruleSignature ) )
            // InternalGo.g:3840:1: ( ruleSignature )
            {
            // InternalGo.g:3840:1: ( ruleSignature )
            // InternalGo.g:3841:2: ruleSignature
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
    // InternalGo.g:3851:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3855:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalGo.g:3856:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalGo.g:3863:1: rule__Signature__Group__0__Impl : ( ruleParameters ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3867:1: ( ( ruleParameters ) )
            // InternalGo.g:3868:1: ( ruleParameters )
            {
            // InternalGo.g:3868:1: ( ruleParameters )
            // InternalGo.g:3869:2: ruleParameters
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
    // InternalGo.g:3878:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3882:1: ( rule__Signature__Group__1__Impl )
            // InternalGo.g:3883:2: rule__Signature__Group__1__Impl
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
    // InternalGo.g:3889:1: rule__Signature__Group__1__Impl : ( ( ( ruleResult ) ) ( ( ruleResult )* ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3893:1: ( ( ( ( ruleResult ) ) ( ( ruleResult )* ) ) )
            // InternalGo.g:3894:1: ( ( ( ruleResult ) ) ( ( ruleResult )* ) )
            {
            // InternalGo.g:3894:1: ( ( ( ruleResult ) ) ( ( ruleResult )* ) )
            // InternalGo.g:3895:2: ( ( ruleResult ) ) ( ( ruleResult )* )
            {
            // InternalGo.g:3895:2: ( ( ruleResult ) )
            // InternalGo.g:3896:3: ( ruleResult )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
            }
            // InternalGo.g:3897:3: ( ruleResult )
            // InternalGo.g:3897:4: ruleResult
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

            // InternalGo.g:3900:2: ( ( ruleResult )* )
            // InternalGo.g:3901:3: ( ruleResult )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getResultParserRuleCall_1()); 
            }
            // InternalGo.g:3902:3: ( ruleResult )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // InternalGo.g:3902:4: ruleResult
            	    {
            	    pushFollow(FOLLOW_27);
            	    ruleResult();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalGo.g:3912:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3916:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalGo.g:3917:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
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
    // InternalGo.g:3924:1: rule__Parameters__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3928:1: ( ( '(' ) )
            // InternalGo.g:3929:1: ( '(' )
            {
            // InternalGo.g:3929:1: ( '(' )
            // InternalGo.g:3930:2: '('
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
    // InternalGo.g:3939:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3943:1: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
            // InternalGo.g:3944:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
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
    // InternalGo.g:3951:1: rule__Parameters__Group__1__Impl : ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3955:1: ( ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) ) )
            // InternalGo.g:3956:1: ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) )
            {
            // InternalGo.g:3956:1: ( ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalGo.g:3957:2: ( ( rule__Parameters__Group_1__0 ) ) ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalGo.g:3957:2: ( ( rule__Parameters__Group_1__0 ) )
            // InternalGo.g:3958:3: ( rule__Parameters__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup_1()); 
            }
            // InternalGo.g:3959:3: ( rule__Parameters__Group_1__0 )
            // InternalGo.g:3959:4: rule__Parameters__Group_1__0
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

            // InternalGo.g:3962:2: ( ( rule__Parameters__Group_1__0 )* )
            // InternalGo.g:3963:3: ( rule__Parameters__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup_1()); 
            }
            // InternalGo.g:3964:3: ( rule__Parameters__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_IDENTIFIER||LA45_0==35||LA45_0==37||LA45_0==46||(LA45_0>=53 && LA45_0<=55)||(LA45_0>=60 && LA45_0<=64)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGo.g:3964:4: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalGo.g:3973:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl ;
    public final void rule__Parameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3977:1: ( rule__Parameters__Group__2__Impl )
            // InternalGo.g:3978:2: rule__Parameters__Group__2__Impl
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
    // InternalGo.g:3984:1: rule__Parameters__Group__2__Impl : ( ')' ) ;
    public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3988:1: ( ( ')' ) )
            // InternalGo.g:3989:1: ( ')' )
            {
            // InternalGo.g:3989:1: ( ')' )
            // InternalGo.g:3990:2: ')'
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
    // InternalGo.g:4000:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4004:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalGo.g:4005:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
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
    // InternalGo.g:4012:1: rule__Parameters__Group_1__0__Impl : ( ( ruleParameter_list ) ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4016:1: ( ( ( ruleParameter_list ) ) )
            // InternalGo.g:4017:1: ( ( ruleParameter_list ) )
            {
            // InternalGo.g:4017:1: ( ( ruleParameter_list ) )
            // InternalGo.g:4018:2: ( ruleParameter_list )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getParameter_listParserRuleCall_1_0()); 
            }
            // InternalGo.g:4019:2: ( ruleParameter_list )
            // InternalGo.g:4019:3: ruleParameter_list
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
    // InternalGo.g:4027:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4031:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalGo.g:4032:2: rule__Parameters__Group_1__1__Impl
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
    // InternalGo.g:4038:1: rule__Parameters__Group_1__1__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4042:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalGo.g:4043:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalGo.g:4043:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalGo.g:4044:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalGo.g:4044:2: ( ( ',' ) )
            // InternalGo.g:4045:3: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }
            // InternalGo.g:4046:3: ( ',' )
            // InternalGo.g:4046:4: ','
            {
            match(input,44,FOLLOW_30); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }

            }

            // InternalGo.g:4049:2: ( ( ',' )* )
            // InternalGo.g:4050:3: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getCommaKeyword_1_1()); 
            }
            // InternalGo.g:4051:3: ( ',' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==44) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGo.g:4051:4: ','
            	    {
            	    match(input,44,FOLLOW_30); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalGo.g:4061:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4065:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // InternalGo.g:4066:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
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
    // InternalGo.g:4073:1: rule__Parameter_list__Group__0__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4077:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:4078:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:4078:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:4079:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_0()); 
            }
            // InternalGo.g:4080:2: ( ruleParameter_decl )
            // InternalGo.g:4080:3: ruleParameter_decl
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
    // InternalGo.g:4088:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4092:1: ( rule__Parameter_list__Group__1__Impl )
            // InternalGo.g:4093:2: rule__Parameter_list__Group__1__Impl
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
    // InternalGo.g:4099:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4103:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // InternalGo.g:4104:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // InternalGo.g:4104:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // InternalGo.g:4105:2: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // InternalGo.g:4106:2: ( rule__Parameter_list__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==44) ) {
                    int LA47_3 = input.LA(2);

                    if ( (synpred87_InternalGo()) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalGo.g:4106:3: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalGo.g:4115:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4119:1: ( rule__Parameter_list__Group_1__0__Impl )
            // InternalGo.g:4120:2: rule__Parameter_list__Group_1__0__Impl
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
    // InternalGo.g:4126:1: rule__Parameter_list__Group_1__0__Impl : ( ( rule__Parameter_list__Group_1_0__0 ) ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4130:1: ( ( ( rule__Parameter_list__Group_1_0__0 ) ) )
            // InternalGo.g:4131:1: ( ( rule__Parameter_list__Group_1_0__0 ) )
            {
            // InternalGo.g:4131:1: ( ( rule__Parameter_list__Group_1_0__0 ) )
            // InternalGo.g:4132:2: ( rule__Parameter_list__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1_0()); 
            }
            // InternalGo.g:4133:2: ( rule__Parameter_list__Group_1_0__0 )
            // InternalGo.g:4133:3: rule__Parameter_list__Group_1_0__0
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
    // InternalGo.g:4142:1: rule__Parameter_list__Group_1_0__0 : rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1 ;
    public final void rule__Parameter_list__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4146:1: ( rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1 )
            // InternalGo.g:4147:2: rule__Parameter_list__Group_1_0__0__Impl rule__Parameter_list__Group_1_0__1
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
    // InternalGo.g:4154:1: rule__Parameter_list__Group_1_0__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4158:1: ( ( ',' ) )
            // InternalGo.g:4159:1: ( ',' )
            {
            // InternalGo.g:4159:1: ( ',' )
            // InternalGo.g:4160:2: ','
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
    // InternalGo.g:4169:1: rule__Parameter_list__Group_1_0__1 : rule__Parameter_list__Group_1_0__1__Impl ;
    public final void rule__Parameter_list__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4173:1: ( rule__Parameter_list__Group_1_0__1__Impl )
            // InternalGo.g:4174:2: rule__Parameter_list__Group_1_0__1__Impl
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
    // InternalGo.g:4180:1: rule__Parameter_list__Group_1_0__1__Impl : ( ( ruleParameter_decl ) ) ;
    public final void rule__Parameter_list__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4184:1: ( ( ( ruleParameter_decl ) ) )
            // InternalGo.g:4185:1: ( ( ruleParameter_decl ) )
            {
            // InternalGo.g:4185:1: ( ( ruleParameter_decl ) )
            // InternalGo.g:4186:2: ( ruleParameter_decl )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameter_declParserRuleCall_1_0_1()); 
            }
            // InternalGo.g:4187:2: ( ruleParameter_decl )
            // InternalGo.g:4187:3: ruleParameter_decl
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
    // InternalGo.g:4196:1: rule__Parameter_decl__Group__0 : rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 ;
    public final void rule__Parameter_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4200:1: ( rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1 )
            // InternalGo.g:4201:2: rule__Parameter_decl__Group__0__Impl rule__Parameter_decl__Group__1
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
    // InternalGo.g:4208:1: rule__Parameter_decl__Group__0__Impl : ( ( rule__Parameter_decl__Group_0__0 )? ) ;
    public final void rule__Parameter_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4212:1: ( ( ( rule__Parameter_decl__Group_0__0 )? ) )
            // InternalGo.g:4213:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            {
            // InternalGo.g:4213:1: ( ( rule__Parameter_decl__Group_0__0 )? )
            // InternalGo.g:4214:2: ( rule__Parameter_decl__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getGroup_0()); 
            }
            // InternalGo.g:4215:2: ( rule__Parameter_decl__Group_0__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_IDENTIFIER) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==44) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==RULE_IDENTIFIER) ) {
                        int LA48_5 = input.LA(4);

                        if ( (synpred88_InternalGo()) ) {
                            alt48=1;
                        }
                    }
                }
                else if ( (LA48_1==RULE_IDENTIFIER||LA48_1==35||LA48_1==37||LA48_1==46||(LA48_1>=53 && LA48_1<=55)||(LA48_1>=60 && LA48_1<=64)) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:4215:3: rule__Parameter_decl__Group_0__0
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
    // InternalGo.g:4223:1: rule__Parameter_decl__Group__1 : rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 ;
    public final void rule__Parameter_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4227:1: ( rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2 )
            // InternalGo.g:4228:2: rule__Parameter_decl__Group__1__Impl rule__Parameter_decl__Group__2
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
    // InternalGo.g:4235:1: rule__Parameter_decl__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__Parameter_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4239:1: ( ( ( '...' )? ) )
            // InternalGo.g:4240:1: ( ( '...' )? )
            {
            // InternalGo.g:4240:1: ( ( '...' )? )
            // InternalGo.g:4241:2: ( '...' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_declAccess().getFullStopFullStopFullStopKeyword_1()); 
            }
            // InternalGo.g:4242:2: ( '...' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:4242:3: '...'
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
    // InternalGo.g:4250:1: rule__Parameter_decl__Group__2 : rule__Parameter_decl__Group__2__Impl ;
    public final void rule__Parameter_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4254:1: ( rule__Parameter_decl__Group__2__Impl )
            // InternalGo.g:4255:2: rule__Parameter_decl__Group__2__Impl
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
    // InternalGo.g:4261:1: rule__Parameter_decl__Group__2__Impl : ( ruleType ) ;
    public final void rule__Parameter_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4265:1: ( ( ruleType ) )
            // InternalGo.g:4266:1: ( ruleType )
            {
            // InternalGo.g:4266:1: ( ruleType )
            // InternalGo.g:4267:2: ruleType
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
    // InternalGo.g:4277:1: rule__Parameter_decl__Group_0__0 : rule__Parameter_decl__Group_0__0__Impl ;
    public final void rule__Parameter_decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4281:1: ( rule__Parameter_decl__Group_0__0__Impl )
            // InternalGo.g:4282:2: rule__Parameter_decl__Group_0__0__Impl
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
    // InternalGo.g:4288:1: rule__Parameter_decl__Group_0__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Parameter_decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4292:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:4293:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:4293:1: ( ruleIdentifier_list )
            // InternalGo.g:4294:2: ruleIdentifier_list
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
    // InternalGo.g:4304:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4308:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalGo.g:4309:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
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
    // InternalGo.g:4316:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4320:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:4321:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:4321:1: ( RULE_IDENTIFIER )
            // InternalGo.g:4322:2: RULE_IDENTIFIER
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
    // InternalGo.g:4331:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4335:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalGo.g:4336:2: rule__Identifier_list__Group__1__Impl
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
    // InternalGo.g:4342:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4346:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalGo.g:4347:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalGo.g:4347:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalGo.g:4348:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalGo.g:4349:2: ( rule__Identifier_list__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==44) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGo.g:4349:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalGo.g:4358:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4362:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalGo.g:4363:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalGo.g:4370:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4374:1: ( ( ',' ) )
            // InternalGo.g:4375:1: ( ',' )
            {
            // InternalGo.g:4375:1: ( ',' )
            // InternalGo.g:4376:2: ','
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
    // InternalGo.g:4385:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4389:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalGo.g:4390:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalGo.g:4396:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4400:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:4401:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:4401:1: ( RULE_IDENTIFIER )
            // InternalGo.g:4402:2: RULE_IDENTIFIER
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
    // InternalGo.g:4412:1: rule__Interface_type__Group__0 : rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1 ;
    public final void rule__Interface_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4416:1: ( rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1 )
            // InternalGo.g:4417:2: rule__Interface_type__Group__0__Impl rule__Interface_type__Group__1
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
    // InternalGo.g:4424:1: rule__Interface_type__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4428:1: ( ( 'interface' ) )
            // InternalGo.g:4429:1: ( 'interface' )
            {
            // InternalGo.g:4429:1: ( 'interface' )
            // InternalGo.g:4430:2: 'interface'
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
    // InternalGo.g:4439:1: rule__Interface_type__Group__1 : rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2 ;
    public final void rule__Interface_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4443:1: ( rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2 )
            // InternalGo.g:4444:2: rule__Interface_type__Group__1__Impl rule__Interface_type__Group__2
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
    // InternalGo.g:4451:1: rule__Interface_type__Group__1__Impl : ( '{' ) ;
    public final void rule__Interface_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4455:1: ( ( '{' ) )
            // InternalGo.g:4456:1: ( '{' )
            {
            // InternalGo.g:4456:1: ( '{' )
            // InternalGo.g:4457:2: '{'
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
    // InternalGo.g:4466:1: rule__Interface_type__Group__2 : rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3 ;
    public final void rule__Interface_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4470:1: ( rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3 )
            // InternalGo.g:4471:2: rule__Interface_type__Group__2__Impl rule__Interface_type__Group__3
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
    // InternalGo.g:4478:1: rule__Interface_type__Group__2__Impl : ( ( rule__Interface_type__Group_2__0 )* ) ;
    public final void rule__Interface_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4482:1: ( ( ( rule__Interface_type__Group_2__0 )* ) )
            // InternalGo.g:4483:1: ( ( rule__Interface_type__Group_2__0 )* )
            {
            // InternalGo.g:4483:1: ( ( rule__Interface_type__Group_2__0 )* )
            // InternalGo.g:4484:2: ( rule__Interface_type__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_typeAccess().getGroup_2()); 
            }
            // InternalGo.g:4485:2: ( rule__Interface_type__Group_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_IDENTIFIER) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGo.g:4485:3: rule__Interface_type__Group_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Interface_type__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalGo.g:4493:1: rule__Interface_type__Group__3 : rule__Interface_type__Group__3__Impl ;
    public final void rule__Interface_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4497:1: ( rule__Interface_type__Group__3__Impl )
            // InternalGo.g:4498:2: rule__Interface_type__Group__3__Impl
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
    // InternalGo.g:4504:1: rule__Interface_type__Group__3__Impl : ( '}' ) ;
    public final void rule__Interface_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4508:1: ( ( '}' ) )
            // InternalGo.g:4509:1: ( '}' )
            {
            // InternalGo.g:4509:1: ( '}' )
            // InternalGo.g:4510:2: '}'
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
    // InternalGo.g:4520:1: rule__Interface_type__Group_2__0 : rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1 ;
    public final void rule__Interface_type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4524:1: ( rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1 )
            // InternalGo.g:4525:2: rule__Interface_type__Group_2__0__Impl rule__Interface_type__Group_2__1
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
    // InternalGo.g:4532:1: rule__Interface_type__Group_2__0__Impl : ( ruleMethod_spec ) ;
    public final void rule__Interface_type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4536:1: ( ( ruleMethod_spec ) )
            // InternalGo.g:4537:1: ( ruleMethod_spec )
            {
            // InternalGo.g:4537:1: ( ruleMethod_spec )
            // InternalGo.g:4538:2: ruleMethod_spec
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
    // InternalGo.g:4547:1: rule__Interface_type__Group_2__1 : rule__Interface_type__Group_2__1__Impl ;
    public final void rule__Interface_type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4551:1: ( rule__Interface_type__Group_2__1__Impl )
            // InternalGo.g:4552:2: rule__Interface_type__Group_2__1__Impl
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
    // InternalGo.g:4558:1: rule__Interface_type__Group_2__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Interface_type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4562:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:4563:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:4563:1: ( RULE_SEMICOLON )
            // InternalGo.g:4564:2: RULE_SEMICOLON
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
    // InternalGo.g:4574:1: rule__Method_spec__Group_0__0 : rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1 ;
    public final void rule__Method_spec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4578:1: ( rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1 )
            // InternalGo.g:4579:2: rule__Method_spec__Group_0__0__Impl rule__Method_spec__Group_0__1
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
    // InternalGo.g:4586:1: rule__Method_spec__Group_0__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Method_spec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4590:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:4591:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:4591:1: ( RULE_IDENTIFIER )
            // InternalGo.g:4592:2: RULE_IDENTIFIER
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
    // InternalGo.g:4601:1: rule__Method_spec__Group_0__1 : rule__Method_spec__Group_0__1__Impl ;
    public final void rule__Method_spec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4605:1: ( rule__Method_spec__Group_0__1__Impl )
            // InternalGo.g:4606:2: rule__Method_spec__Group_0__1__Impl
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
    // InternalGo.g:4612:1: rule__Method_spec__Group_0__1__Impl : ( ruleSignature ) ;
    public final void rule__Method_spec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4616:1: ( ( ruleSignature ) )
            // InternalGo.g:4617:1: ( ruleSignature )
            {
            // InternalGo.g:4617:1: ( ruleSignature )
            // InternalGo.g:4618:2: ruleSignature
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
    // InternalGo.g:4628:1: rule__Slice_type__Group__0 : rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1 ;
    public final void rule__Slice_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4632:1: ( rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1 )
            // InternalGo.g:4633:2: rule__Slice_type__Group__0__Impl rule__Slice_type__Group__1
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
    // InternalGo.g:4640:1: rule__Slice_type__Group__0__Impl : ( '[' ) ;
    public final void rule__Slice_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4644:1: ( ( '[' ) )
            // InternalGo.g:4645:1: ( '[' )
            {
            // InternalGo.g:4645:1: ( '[' )
            // InternalGo.g:4646:2: '['
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
    // InternalGo.g:4655:1: rule__Slice_type__Group__1 : rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2 ;
    public final void rule__Slice_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4659:1: ( rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2 )
            // InternalGo.g:4660:2: rule__Slice_type__Group__1__Impl rule__Slice_type__Group__2
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
    // InternalGo.g:4667:1: rule__Slice_type__Group__1__Impl : ( ']' ) ;
    public final void rule__Slice_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4671:1: ( ( ']' ) )
            // InternalGo.g:4672:1: ( ']' )
            {
            // InternalGo.g:4672:1: ( ']' )
            // InternalGo.g:4673:2: ']'
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
    // InternalGo.g:4682:1: rule__Slice_type__Group__2 : rule__Slice_type__Group__2__Impl ;
    public final void rule__Slice_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4686:1: ( rule__Slice_type__Group__2__Impl )
            // InternalGo.g:4687:2: rule__Slice_type__Group__2__Impl
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
    // InternalGo.g:4693:1: rule__Slice_type__Group__2__Impl : ( ruleType ) ;
    public final void rule__Slice_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4697:1: ( ( ruleType ) )
            // InternalGo.g:4698:1: ( ruleType )
            {
            // InternalGo.g:4698:1: ( ruleType )
            // InternalGo.g:4699:2: ruleType
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
    // InternalGo.g:4709:1: rule__Map_type__Group__0 : rule__Map_type__Group__0__Impl rule__Map_type__Group__1 ;
    public final void rule__Map_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4713:1: ( rule__Map_type__Group__0__Impl rule__Map_type__Group__1 )
            // InternalGo.g:4714:2: rule__Map_type__Group__0__Impl rule__Map_type__Group__1
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
    // InternalGo.g:4721:1: rule__Map_type__Group__0__Impl : ( 'map' ) ;
    public final void rule__Map_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4725:1: ( ( 'map' ) )
            // InternalGo.g:4726:1: ( 'map' )
            {
            // InternalGo.g:4726:1: ( 'map' )
            // InternalGo.g:4727:2: 'map'
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
    // InternalGo.g:4736:1: rule__Map_type__Group__1 : rule__Map_type__Group__1__Impl rule__Map_type__Group__2 ;
    public final void rule__Map_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4740:1: ( rule__Map_type__Group__1__Impl rule__Map_type__Group__2 )
            // InternalGo.g:4741:2: rule__Map_type__Group__1__Impl rule__Map_type__Group__2
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
    // InternalGo.g:4748:1: rule__Map_type__Group__1__Impl : ( '[' ) ;
    public final void rule__Map_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4752:1: ( ( '[' ) )
            // InternalGo.g:4753:1: ( '[' )
            {
            // InternalGo.g:4753:1: ( '[' )
            // InternalGo.g:4754:2: '['
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
    // InternalGo.g:4763:1: rule__Map_type__Group__2 : rule__Map_type__Group__2__Impl rule__Map_type__Group__3 ;
    public final void rule__Map_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4767:1: ( rule__Map_type__Group__2__Impl rule__Map_type__Group__3 )
            // InternalGo.g:4768:2: rule__Map_type__Group__2__Impl rule__Map_type__Group__3
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
    // InternalGo.g:4775:1: rule__Map_type__Group__2__Impl : ( ruleType ) ;
    public final void rule__Map_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4779:1: ( ( ruleType ) )
            // InternalGo.g:4780:1: ( ruleType )
            {
            // InternalGo.g:4780:1: ( ruleType )
            // InternalGo.g:4781:2: ruleType
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
    // InternalGo.g:4790:1: rule__Map_type__Group__3 : rule__Map_type__Group__3__Impl rule__Map_type__Group__4 ;
    public final void rule__Map_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4794:1: ( rule__Map_type__Group__3__Impl rule__Map_type__Group__4 )
            // InternalGo.g:4795:2: rule__Map_type__Group__3__Impl rule__Map_type__Group__4
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
    // InternalGo.g:4802:1: rule__Map_type__Group__3__Impl : ( ']' ) ;
    public final void rule__Map_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4806:1: ( ( ']' ) )
            // InternalGo.g:4807:1: ( ']' )
            {
            // InternalGo.g:4807:1: ( ']' )
            // InternalGo.g:4808:2: ']'
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
    // InternalGo.g:4817:1: rule__Map_type__Group__4 : rule__Map_type__Group__4__Impl ;
    public final void rule__Map_type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4821:1: ( rule__Map_type__Group__4__Impl )
            // InternalGo.g:4822:2: rule__Map_type__Group__4__Impl
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
    // InternalGo.g:4828:1: rule__Map_type__Group__4__Impl : ( ruleType ) ;
    public final void rule__Map_type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4832:1: ( ( ruleType ) )
            // InternalGo.g:4833:1: ( ruleType )
            {
            // InternalGo.g:4833:1: ( ruleType )
            // InternalGo.g:4834:2: ruleType
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
    // InternalGo.g:4844:1: rule__Channel_type__Group__0 : rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1 ;
    public final void rule__Channel_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4848:1: ( rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1 )
            // InternalGo.g:4849:2: rule__Channel_type__Group__0__Impl rule__Channel_type__Group__1
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
    // InternalGo.g:4856:1: rule__Channel_type__Group__0__Impl : ( ( rule__Channel_type__Alternatives_0 ) ) ;
    public final void rule__Channel_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4860:1: ( ( ( rule__Channel_type__Alternatives_0 ) ) )
            // InternalGo.g:4861:1: ( ( rule__Channel_type__Alternatives_0 ) )
            {
            // InternalGo.g:4861:1: ( ( rule__Channel_type__Alternatives_0 ) )
            // InternalGo.g:4862:2: ( rule__Channel_type__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannel_typeAccess().getAlternatives_0()); 
            }
            // InternalGo.g:4863:2: ( rule__Channel_type__Alternatives_0 )
            // InternalGo.g:4863:3: rule__Channel_type__Alternatives_0
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
    // InternalGo.g:4871:1: rule__Channel_type__Group__1 : rule__Channel_type__Group__1__Impl ;
    public final void rule__Channel_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4875:1: ( rule__Channel_type__Group__1__Impl )
            // InternalGo.g:4876:2: rule__Channel_type__Group__1__Impl
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
    // InternalGo.g:4882:1: rule__Channel_type__Group__1__Impl : ( ruleType ) ;
    public final void rule__Channel_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4886:1: ( ( ruleType ) )
            // InternalGo.g:4887:1: ( ruleType )
            {
            // InternalGo.g:4887:1: ( ruleType )
            // InternalGo.g:4888:2: ruleType
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
    // InternalGo.g:4898:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4902:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalGo.g:4903:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalGo.g:4910:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4914:1: ( ( '{' ) )
            // InternalGo.g:4915:1: ( '{' )
            {
            // InternalGo.g:4915:1: ( '{' )
            // InternalGo.g:4916:2: '{'
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
    // InternalGo.g:4925:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4929:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalGo.g:4930:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalGo.g:4937:1: rule__Block__Group__1__Impl : ( ruleStatement_list ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4941:1: ( ( ruleStatement_list ) )
            // InternalGo.g:4942:1: ( ruleStatement_list )
            {
            // InternalGo.g:4942:1: ( ruleStatement_list )
            // InternalGo.g:4943:2: ruleStatement_list
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
    // InternalGo.g:4952:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4956:1: ( rule__Block__Group__2__Impl )
            // InternalGo.g:4957:2: rule__Block__Group__2__Impl
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
    // InternalGo.g:4963:1: rule__Block__Group__2__Impl : ( '}' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4967:1: ( ( '}' ) )
            // InternalGo.g:4968:1: ( '}' )
            {
            // InternalGo.g:4968:1: ( '}' )
            // InternalGo.g:4969:2: '}'
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
    // InternalGo.g:4979:1: rule__Statement_list__Group__0 : rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1 ;
    public final void rule__Statement_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4983:1: ( rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1 )
            // InternalGo.g:4984:2: rule__Statement_list__Group__0__Impl rule__Statement_list__Group__1
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
    // InternalGo.g:4991:1: rule__Statement_list__Group__0__Impl : ( ruleStatement ) ;
    public final void rule__Statement_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4995:1: ( ( ruleStatement ) )
            // InternalGo.g:4996:1: ( ruleStatement )
            {
            // InternalGo.g:4996:1: ( ruleStatement )
            // InternalGo.g:4997:2: ruleStatement
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
    // InternalGo.g:5006:1: rule__Statement_list__Group__1 : rule__Statement_list__Group__1__Impl ;
    public final void rule__Statement_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5010:1: ( rule__Statement_list__Group__1__Impl )
            // InternalGo.g:5011:2: rule__Statement_list__Group__1__Impl
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
    // InternalGo.g:5017:1: rule__Statement_list__Group__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Statement_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5021:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:5022:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:5022:1: ( RULE_SEMICOLON )
            // InternalGo.g:5023:2: RULE_SEMICOLON
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
    // InternalGo.g:5033:1: rule__Const_decl__Group_0__0 : rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1 ;
    public final void rule__Const_decl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5037:1: ( rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1 )
            // InternalGo.g:5038:2: rule__Const_decl__Group_0__0__Impl rule__Const_decl__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalGo.g:5045:1: rule__Const_decl__Group_0__0__Impl : ( 'const' ) ;
    public final void rule__Const_decl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5049:1: ( ( 'const' ) )
            // InternalGo.g:5050:1: ( 'const' )
            {
            // InternalGo.g:5050:1: ( 'const' )
            // InternalGo.g:5051:2: 'const'
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
    // InternalGo.g:5060:1: rule__Const_decl__Group_0__1 : rule__Const_decl__Group_0__1__Impl ;
    public final void rule__Const_decl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5064:1: ( rule__Const_decl__Group_0__1__Impl )
            // InternalGo.g:5065:2: rule__Const_decl__Group_0__1__Impl
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
    // InternalGo.g:5071:1: rule__Const_decl__Group_0__1__Impl : ( ruleConst_spec ) ;
    public final void rule__Const_decl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5075:1: ( ( ruleConst_spec ) )
            // InternalGo.g:5076:1: ( ruleConst_spec )
            {
            // InternalGo.g:5076:1: ( ruleConst_spec )
            // InternalGo.g:5077:2: ruleConst_spec
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
    // InternalGo.g:5087:1: rule__Const_decl__Group_1__0 : rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1 ;
    public final void rule__Const_decl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5091:1: ( rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1 )
            // InternalGo.g:5092:2: rule__Const_decl__Group_1__0__Impl rule__Const_decl__Group_1__1
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
    // InternalGo.g:5099:1: rule__Const_decl__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Const_decl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5103:1: ( ( '(' ) )
            // InternalGo.g:5104:1: ( '(' )
            {
            // InternalGo.g:5104:1: ( '(' )
            // InternalGo.g:5105:2: '('
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
    // InternalGo.g:5114:1: rule__Const_decl__Group_1__1 : rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2 ;
    public final void rule__Const_decl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5118:1: ( rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2 )
            // InternalGo.g:5119:2: rule__Const_decl__Group_1__1__Impl rule__Const_decl__Group_1__2
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
    // InternalGo.g:5126:1: rule__Const_decl__Group_1__1__Impl : ( ( rule__Const_decl__Group_1_1__0 )* ) ;
    public final void rule__Const_decl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5130:1: ( ( ( rule__Const_decl__Group_1_1__0 )* ) )
            // InternalGo.g:5131:1: ( ( rule__Const_decl__Group_1_1__0 )* )
            {
            // InternalGo.g:5131:1: ( ( rule__Const_decl__Group_1_1__0 )* )
            // InternalGo.g:5132:2: ( rule__Const_decl__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_declAccess().getGroup_1_1()); 
            }
            // InternalGo.g:5133:2: ( rule__Const_decl__Group_1_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_IDENTIFIER) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalGo.g:5133:3: rule__Const_decl__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Const_decl__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalGo.g:5141:1: rule__Const_decl__Group_1__2 : rule__Const_decl__Group_1__2__Impl ;
    public final void rule__Const_decl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5145:1: ( rule__Const_decl__Group_1__2__Impl )
            // InternalGo.g:5146:2: rule__Const_decl__Group_1__2__Impl
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
    // InternalGo.g:5152:1: rule__Const_decl__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Const_decl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5156:1: ( ( ')' ) )
            // InternalGo.g:5157:1: ( ')' )
            {
            // InternalGo.g:5157:1: ( ')' )
            // InternalGo.g:5158:2: ')'
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
    // InternalGo.g:5168:1: rule__Const_decl__Group_1_1__0 : rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1 ;
    public final void rule__Const_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5172:1: ( rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1 )
            // InternalGo.g:5173:2: rule__Const_decl__Group_1_1__0__Impl rule__Const_decl__Group_1_1__1
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
    // InternalGo.g:5180:1: rule__Const_decl__Group_1_1__0__Impl : ( ruleConst_spec ) ;
    public final void rule__Const_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5184:1: ( ( ruleConst_spec ) )
            // InternalGo.g:5185:1: ( ruleConst_spec )
            {
            // InternalGo.g:5185:1: ( ruleConst_spec )
            // InternalGo.g:5186:2: ruleConst_spec
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
    // InternalGo.g:5195:1: rule__Const_decl__Group_1_1__1 : rule__Const_decl__Group_1_1__1__Impl ;
    public final void rule__Const_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5199:1: ( rule__Const_decl__Group_1_1__1__Impl )
            // InternalGo.g:5200:2: rule__Const_decl__Group_1_1__1__Impl
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
    // InternalGo.g:5206:1: rule__Const_decl__Group_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Const_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5210:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:5211:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:5211:1: ( RULE_SEMICOLON )
            // InternalGo.g:5212:2: RULE_SEMICOLON
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
    // InternalGo.g:5222:1: rule__Const_spec__Group__0 : rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1 ;
    public final void rule__Const_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5226:1: ( rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1 )
            // InternalGo.g:5227:2: rule__Const_spec__Group__0__Impl rule__Const_spec__Group__1
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
    // InternalGo.g:5234:1: rule__Const_spec__Group__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Const_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5238:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:5239:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:5239:1: ( ruleIdentifier_list )
            // InternalGo.g:5240:2: ruleIdentifier_list
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
    // InternalGo.g:5249:1: rule__Const_spec__Group__1 : rule__Const_spec__Group__1__Impl ;
    public final void rule__Const_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5253:1: ( rule__Const_spec__Group__1__Impl )
            // InternalGo.g:5254:2: rule__Const_spec__Group__1__Impl
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
    // InternalGo.g:5260:1: rule__Const_spec__Group__1__Impl : ( ( rule__Const_spec__Group_1__0 )? ) ;
    public final void rule__Const_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5264:1: ( ( ( rule__Const_spec__Group_1__0 )? ) )
            // InternalGo.g:5265:1: ( ( rule__Const_spec__Group_1__0 )? )
            {
            // InternalGo.g:5265:1: ( ( rule__Const_spec__Group_1__0 )? )
            // InternalGo.g:5266:2: ( rule__Const_spec__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getGroup_1()); 
            }
            // InternalGo.g:5267:2: ( rule__Const_spec__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_IDENTIFIER||LA53_0==35||LA53_0==37||LA53_0==42||(LA53_0>=53 && LA53_0<=55)||(LA53_0>=60 && LA53_0<=64)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGo.g:5267:3: rule__Const_spec__Group_1__0
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
    // InternalGo.g:5276:1: rule__Const_spec__Group_1__0 : rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1 ;
    public final void rule__Const_spec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5280:1: ( rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1 )
            // InternalGo.g:5281:2: rule__Const_spec__Group_1__0__Impl rule__Const_spec__Group_1__1
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
    // InternalGo.g:5288:1: rule__Const_spec__Group_1__0__Impl : ( ( ruleType )? ) ;
    public final void rule__Const_spec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5292:1: ( ( ( ruleType )? ) )
            // InternalGo.g:5293:1: ( ( ruleType )? )
            {
            // InternalGo.g:5293:1: ( ( ruleType )? )
            // InternalGo.g:5294:2: ( ruleType )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_specAccess().getTypeParserRuleCall_1_0()); 
            }
            // InternalGo.g:5295:2: ( ruleType )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_IDENTIFIER||LA54_0==35||LA54_0==37||(LA54_0>=53 && LA54_0<=55)||(LA54_0>=60 && LA54_0<=64)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGo.g:5295:3: ruleType
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
    // InternalGo.g:5303:1: rule__Const_spec__Group_1__1 : rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2 ;
    public final void rule__Const_spec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5307:1: ( rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2 )
            // InternalGo.g:5308:2: rule__Const_spec__Group_1__1__Impl rule__Const_spec__Group_1__2
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
    // InternalGo.g:5315:1: rule__Const_spec__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Const_spec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5319:1: ( ( '=' ) )
            // InternalGo.g:5320:1: ( '=' )
            {
            // InternalGo.g:5320:1: ( '=' )
            // InternalGo.g:5321:2: '='
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
    // InternalGo.g:5330:1: rule__Const_spec__Group_1__2 : rule__Const_spec__Group_1__2__Impl ;
    public final void rule__Const_spec__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5334:1: ( rule__Const_spec__Group_1__2__Impl )
            // InternalGo.g:5335:2: rule__Const_spec__Group_1__2__Impl
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
    // InternalGo.g:5341:1: rule__Const_spec__Group_1__2__Impl : ( ruleExpression_list ) ;
    public final void rule__Const_spec__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5345:1: ( ( ruleExpression_list ) )
            // InternalGo.g:5346:1: ( ruleExpression_list )
            {
            // InternalGo.g:5346:1: ( ruleExpression_list )
            // InternalGo.g:5347:2: ruleExpression_list
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
    // InternalGo.g:5357:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5361:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalGo.g:5362:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
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
    // InternalGo.g:5369:1: rule__Expression_list__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5373:1: ( ( ruleExpression ) )
            // InternalGo.g:5374:1: ( ruleExpression )
            {
            // InternalGo.g:5374:1: ( ruleExpression )
            // InternalGo.g:5375:2: ruleExpression
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
    // InternalGo.g:5384:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5388:1: ( rule__Expression_list__Group__1__Impl )
            // InternalGo.g:5389:2: rule__Expression_list__Group__1__Impl
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
    // InternalGo.g:5395:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5399:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalGo.g:5400:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalGo.g:5400:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalGo.g:5401:2: ( rule__Expression_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            }
            // InternalGo.g:5402:2: ( rule__Expression_list__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==44) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalGo.g:5402:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalGo.g:5411:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5415:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalGo.g:5416:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
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
    // InternalGo.g:5423:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5427:1: ( ( ',' ) )
            // InternalGo.g:5428:1: ( ',' )
            {
            // InternalGo.g:5428:1: ( ',' )
            // InternalGo.g:5429:2: ','
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
    // InternalGo.g:5438:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5442:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalGo.g:5443:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalGo.g:5449:1: rule__Expression_list__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5453:1: ( ( ruleExpression ) )
            // InternalGo.g:5454:1: ( ruleExpression )
            {
            // InternalGo.g:5454:1: ( ruleExpression )
            // InternalGo.g:5455:2: ruleExpression
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


    // $ANTLR start "rule__Type_decl__Group__0"
    // InternalGo.g:5465:1: rule__Type_decl__Group__0 : rule__Type_decl__Group__0__Impl rule__Type_decl__Group__1 ;
    public final void rule__Type_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5469:1: ( rule__Type_decl__Group__0__Impl rule__Type_decl__Group__1 )
            // InternalGo.g:5470:2: rule__Type_decl__Group__0__Impl rule__Type_decl__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Type_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group__0"


    // $ANTLR start "rule__Type_decl__Group__0__Impl"
    // InternalGo.g:5477:1: rule__Type_decl__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5481:1: ( ( 'type' ) )
            // InternalGo.g:5482:1: ( 'type' )
            {
            // InternalGo.g:5482:1: ( 'type' )
            // InternalGo.g:5483:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getTypeKeyword_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group__0__Impl"


    // $ANTLR start "rule__Type_decl__Group__1"
    // InternalGo.g:5492:1: rule__Type_decl__Group__1 : rule__Type_decl__Group__1__Impl ;
    public final void rule__Type_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5496:1: ( rule__Type_decl__Group__1__Impl )
            // InternalGo.g:5497:2: rule__Type_decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group__1"


    // $ANTLR start "rule__Type_decl__Group__1__Impl"
    // InternalGo.g:5503:1: rule__Type_decl__Group__1__Impl : ( ( rule__Type_decl__Alternatives_1 ) ) ;
    public final void rule__Type_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5507:1: ( ( ( rule__Type_decl__Alternatives_1 ) ) )
            // InternalGo.g:5508:1: ( ( rule__Type_decl__Alternatives_1 ) )
            {
            // InternalGo.g:5508:1: ( ( rule__Type_decl__Alternatives_1 ) )
            // InternalGo.g:5509:2: ( rule__Type_decl__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getAlternatives_1()); 
            }
            // InternalGo.g:5510:2: ( rule__Type_decl__Alternatives_1 )
            // InternalGo.g:5510:3: rule__Type_decl__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Type_decl__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group__1__Impl"


    // $ANTLR start "rule__Type_decl__Group_1_1__0"
    // InternalGo.g:5519:1: rule__Type_decl__Group_1_1__0 : rule__Type_decl__Group_1_1__0__Impl rule__Type_decl__Group_1_1__1 ;
    public final void rule__Type_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5523:1: ( rule__Type_decl__Group_1_1__0__Impl rule__Type_decl__Group_1_1__1 )
            // InternalGo.g:5524:2: rule__Type_decl__Group_1_1__0__Impl rule__Type_decl__Group_1_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Type_decl__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1__0"


    // $ANTLR start "rule__Type_decl__Group_1_1__0__Impl"
    // InternalGo.g:5531:1: rule__Type_decl__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Type_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5535:1: ( ( '(' ) )
            // InternalGo.g:5536:1: ( '(' )
            {
            // InternalGo.g:5536:1: ( '(' )
            // InternalGo.g:5537:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getLeftParenthesisKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1__0__Impl"


    // $ANTLR start "rule__Type_decl__Group_1_1__1"
    // InternalGo.g:5546:1: rule__Type_decl__Group_1_1__1 : rule__Type_decl__Group_1_1__1__Impl rule__Type_decl__Group_1_1__2 ;
    public final void rule__Type_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5550:1: ( rule__Type_decl__Group_1_1__1__Impl rule__Type_decl__Group_1_1__2 )
            // InternalGo.g:5551:2: rule__Type_decl__Group_1_1__1__Impl rule__Type_decl__Group_1_1__2
            {
            pushFollow(FOLLOW_40);
            rule__Type_decl__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1__1"


    // $ANTLR start "rule__Type_decl__Group_1_1__1__Impl"
    // InternalGo.g:5558:1: rule__Type_decl__Group_1_1__1__Impl : ( ( rule__Type_decl__Group_1_1_1__0 )* ) ;
    public final void rule__Type_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5562:1: ( ( ( rule__Type_decl__Group_1_1_1__0 )* ) )
            // InternalGo.g:5563:1: ( ( rule__Type_decl__Group_1_1_1__0 )* )
            {
            // InternalGo.g:5563:1: ( ( rule__Type_decl__Group_1_1_1__0 )* )
            // InternalGo.g:5564:2: ( rule__Type_decl__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getGroup_1_1_1()); 
            }
            // InternalGo.g:5565:2: ( rule__Type_decl__Group_1_1_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_IDENTIFIER) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGo.g:5565:3: rule__Type_decl__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Type_decl__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1__1__Impl"


    // $ANTLR start "rule__Type_decl__Group_1_1__2"
    // InternalGo.g:5573:1: rule__Type_decl__Group_1_1__2 : rule__Type_decl__Group_1_1__2__Impl ;
    public final void rule__Type_decl__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5577:1: ( rule__Type_decl__Group_1_1__2__Impl )
            // InternalGo.g:5578:2: rule__Type_decl__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1__2"


    // $ANTLR start "rule__Type_decl__Group_1_1__2__Impl"
    // InternalGo.g:5584:1: rule__Type_decl__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Type_decl__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5588:1: ( ( ')' ) )
            // InternalGo.g:5589:1: ( ')' )
            {
            // InternalGo.g:5589:1: ( ')' )
            // InternalGo.g:5590:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getRightParenthesisKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1__2__Impl"


    // $ANTLR start "rule__Type_decl__Group_1_1_1__0"
    // InternalGo.g:5600:1: rule__Type_decl__Group_1_1_1__0 : rule__Type_decl__Group_1_1_1__0__Impl rule__Type_decl__Group_1_1_1__1 ;
    public final void rule__Type_decl__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5604:1: ( rule__Type_decl__Group_1_1_1__0__Impl rule__Type_decl__Group_1_1_1__1 )
            // InternalGo.g:5605:2: rule__Type_decl__Group_1_1_1__0__Impl rule__Type_decl__Group_1_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Type_decl__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1_1__0"


    // $ANTLR start "rule__Type_decl__Group_1_1_1__0__Impl"
    // InternalGo.g:5612:1: rule__Type_decl__Group_1_1_1__0__Impl : ( ruleType_spec ) ;
    public final void rule__Type_decl__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5616:1: ( ( ruleType_spec ) )
            // InternalGo.g:5617:1: ( ruleType_spec )
            {
            // InternalGo.g:5617:1: ( ruleType_spec )
            // InternalGo.g:5618:2: ruleType_spec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getType_specParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getType_specParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Type_decl__Group_1_1_1__1"
    // InternalGo.g:5627:1: rule__Type_decl__Group_1_1_1__1 : rule__Type_decl__Group_1_1_1__1__Impl ;
    public final void rule__Type_decl__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5631:1: ( rule__Type_decl__Group_1_1_1__1__Impl )
            // InternalGo.g:5632:2: rule__Type_decl__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_decl__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1_1__1"


    // $ANTLR start "rule__Type_decl__Group_1_1_1__1__Impl"
    // InternalGo.g:5638:1: rule__Type_decl__Group_1_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Type_decl__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5642:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:5643:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:5643:1: ( RULE_SEMICOLON )
            // InternalGo.g:5644:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_decl__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Alias_decl__Group__0"
    // InternalGo.g:5654:1: rule__Alias_decl__Group__0 : rule__Alias_decl__Group__0__Impl rule__Alias_decl__Group__1 ;
    public final void rule__Alias_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5658:1: ( rule__Alias_decl__Group__0__Impl rule__Alias_decl__Group__1 )
            // InternalGo.g:5659:2: rule__Alias_decl__Group__0__Impl rule__Alias_decl__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Alias_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alias_decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias_decl__Group__0"


    // $ANTLR start "rule__Alias_decl__Group__0__Impl"
    // InternalGo.g:5666:1: rule__Alias_decl__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Alias_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5670:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5671:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5671:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5672:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlias_declAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlias_declAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias_decl__Group__0__Impl"


    // $ANTLR start "rule__Alias_decl__Group__1"
    // InternalGo.g:5681:1: rule__Alias_decl__Group__1 : rule__Alias_decl__Group__1__Impl rule__Alias_decl__Group__2 ;
    public final void rule__Alias_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5685:1: ( rule__Alias_decl__Group__1__Impl rule__Alias_decl__Group__2 )
            // InternalGo.g:5686:2: rule__Alias_decl__Group__1__Impl rule__Alias_decl__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Alias_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alias_decl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias_decl__Group__1"


    // $ANTLR start "rule__Alias_decl__Group__1__Impl"
    // InternalGo.g:5693:1: rule__Alias_decl__Group__1__Impl : ( '=' ) ;
    public final void rule__Alias_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5697:1: ( ( '=' ) )
            // InternalGo.g:5698:1: ( '=' )
            {
            // InternalGo.g:5698:1: ( '=' )
            // InternalGo.g:5699:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlias_declAccess().getEqualsSignKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlias_declAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias_decl__Group__1__Impl"


    // $ANTLR start "rule__Alias_decl__Group__2"
    // InternalGo.g:5708:1: rule__Alias_decl__Group__2 : rule__Alias_decl__Group__2__Impl ;
    public final void rule__Alias_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5712:1: ( rule__Alias_decl__Group__2__Impl )
            // InternalGo.g:5713:2: rule__Alias_decl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alias_decl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias_decl__Group__2"


    // $ANTLR start "rule__Alias_decl__Group__2__Impl"
    // InternalGo.g:5719:1: rule__Alias_decl__Group__2__Impl : ( ruleType ) ;
    public final void rule__Alias_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5723:1: ( ( ruleType ) )
            // InternalGo.g:5724:1: ( ruleType )
            {
            // InternalGo.g:5724:1: ( ruleType )
            // InternalGo.g:5725:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlias_declAccess().getTypeParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlias_declAccess().getTypeParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias_decl__Group__2__Impl"


    // $ANTLR start "rule__Type_def__Group__0"
    // InternalGo.g:5735:1: rule__Type_def__Group__0 : rule__Type_def__Group__0__Impl rule__Type_def__Group__1 ;
    public final void rule__Type_def__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5739:1: ( rule__Type_def__Group__0__Impl rule__Type_def__Group__1 )
            // InternalGo.g:5740:2: rule__Type_def__Group__0__Impl rule__Type_def__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Type_def__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_def__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_def__Group__0"


    // $ANTLR start "rule__Type_def__Group__0__Impl"
    // InternalGo.g:5747:1: rule__Type_def__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Type_def__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5751:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:5752:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:5752:1: ( RULE_IDENTIFIER )
            // InternalGo.g:5753:2: RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_defAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_defAccess().getIDENTIFIERTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_def__Group__0__Impl"


    // $ANTLR start "rule__Type_def__Group__1"
    // InternalGo.g:5762:1: rule__Type_def__Group__1 : rule__Type_def__Group__1__Impl ;
    public final void rule__Type_def__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5766:1: ( rule__Type_def__Group__1__Impl )
            // InternalGo.g:5767:2: rule__Type_def__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_def__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_def__Group__1"


    // $ANTLR start "rule__Type_def__Group__1__Impl"
    // InternalGo.g:5773:1: rule__Type_def__Group__1__Impl : ( ruleType ) ;
    public final void rule__Type_def__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5777:1: ( ( ruleType ) )
            // InternalGo.g:5778:1: ( ruleType )
            {
            // InternalGo.g:5778:1: ( ruleType )
            // InternalGo.g:5779:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_defAccess().getTypeParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_defAccess().getTypeParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_def__Group__1__Impl"


    // $ANTLR start "rule__Var_decl__Group__0"
    // InternalGo.g:5789:1: rule__Var_decl__Group__0 : rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 ;
    public final void rule__Var_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5793:1: ( rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 )
            // InternalGo.g:5794:2: rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Var_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__0"


    // $ANTLR start "rule__Var_decl__Group__0__Impl"
    // InternalGo.g:5801:1: rule__Var_decl__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5805:1: ( ( 'var' ) )
            // InternalGo.g:5806:1: ( 'var' )
            {
            // InternalGo.g:5806:1: ( 'var' )
            // InternalGo.g:5807:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVarKeyword_0()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__0__Impl"


    // $ANTLR start "rule__Var_decl__Group__1"
    // InternalGo.g:5816:1: rule__Var_decl__Group__1 : rule__Var_decl__Group__1__Impl ;
    public final void rule__Var_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5820:1: ( rule__Var_decl__Group__1__Impl )
            // InternalGo.g:5821:2: rule__Var_decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__1"


    // $ANTLR start "rule__Var_decl__Group__1__Impl"
    // InternalGo.g:5827:1: rule__Var_decl__Group__1__Impl : ( ( rule__Var_decl__Alternatives_1 ) ) ;
    public final void rule__Var_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5831:1: ( ( ( rule__Var_decl__Alternatives_1 ) ) )
            // InternalGo.g:5832:1: ( ( rule__Var_decl__Alternatives_1 ) )
            {
            // InternalGo.g:5832:1: ( ( rule__Var_decl__Alternatives_1 ) )
            // InternalGo.g:5833:2: ( rule__Var_decl__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getAlternatives_1()); 
            }
            // InternalGo.g:5834:2: ( rule__Var_decl__Alternatives_1 )
            // InternalGo.g:5834:3: rule__Var_decl__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__1__Impl"


    // $ANTLR start "rule__Var_decl__Group_1_1__0"
    // InternalGo.g:5843:1: rule__Var_decl__Group_1_1__0 : rule__Var_decl__Group_1_1__0__Impl rule__Var_decl__Group_1_1__1 ;
    public final void rule__Var_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5847:1: ( rule__Var_decl__Group_1_1__0__Impl rule__Var_decl__Group_1_1__1 )
            // InternalGo.g:5848:2: rule__Var_decl__Group_1_1__0__Impl rule__Var_decl__Group_1_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Var_decl__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1__0"


    // $ANTLR start "rule__Var_decl__Group_1_1__0__Impl"
    // InternalGo.g:5855:1: rule__Var_decl__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Var_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5859:1: ( ( '(' ) )
            // InternalGo.g:5860:1: ( '(' )
            {
            // InternalGo.g:5860:1: ( '(' )
            // InternalGo.g:5861:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getLeftParenthesisKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1__0__Impl"


    // $ANTLR start "rule__Var_decl__Group_1_1__1"
    // InternalGo.g:5870:1: rule__Var_decl__Group_1_1__1 : rule__Var_decl__Group_1_1__1__Impl rule__Var_decl__Group_1_1__2 ;
    public final void rule__Var_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5874:1: ( rule__Var_decl__Group_1_1__1__Impl rule__Var_decl__Group_1_1__2 )
            // InternalGo.g:5875:2: rule__Var_decl__Group_1_1__1__Impl rule__Var_decl__Group_1_1__2
            {
            pushFollow(FOLLOW_36);
            rule__Var_decl__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1__1"


    // $ANTLR start "rule__Var_decl__Group_1_1__1__Impl"
    // InternalGo.g:5882:1: rule__Var_decl__Group_1_1__1__Impl : ( ( rule__Var_decl__Group_1_1_1__0 )* ) ;
    public final void rule__Var_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5886:1: ( ( ( rule__Var_decl__Group_1_1_1__0 )* ) )
            // InternalGo.g:5887:1: ( ( rule__Var_decl__Group_1_1_1__0 )* )
            {
            // InternalGo.g:5887:1: ( ( rule__Var_decl__Group_1_1_1__0 )* )
            // InternalGo.g:5888:2: ( rule__Var_decl__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getGroup_1_1_1()); 
            }
            // InternalGo.g:5889:2: ( rule__Var_decl__Group_1_1_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_IDENTIFIER) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGo.g:5889:3: rule__Var_decl__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Var_decl__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1__1__Impl"


    // $ANTLR start "rule__Var_decl__Group_1_1__2"
    // InternalGo.g:5897:1: rule__Var_decl__Group_1_1__2 : rule__Var_decl__Group_1_1__2__Impl ;
    public final void rule__Var_decl__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5901:1: ( rule__Var_decl__Group_1_1__2__Impl )
            // InternalGo.g:5902:2: rule__Var_decl__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1__2"


    // $ANTLR start "rule__Var_decl__Group_1_1__2__Impl"
    // InternalGo.g:5908:1: rule__Var_decl__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Var_decl__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5912:1: ( ( ')' ) )
            // InternalGo.g:5913:1: ( ')' )
            {
            // InternalGo.g:5913:1: ( ')' )
            // InternalGo.g:5914:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getRightParenthesisKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1__2__Impl"


    // $ANTLR start "rule__Var_decl__Group_1_1_1__0"
    // InternalGo.g:5924:1: rule__Var_decl__Group_1_1_1__0 : rule__Var_decl__Group_1_1_1__0__Impl rule__Var_decl__Group_1_1_1__1 ;
    public final void rule__Var_decl__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5928:1: ( rule__Var_decl__Group_1_1_1__0__Impl rule__Var_decl__Group_1_1_1__1 )
            // InternalGo.g:5929:2: rule__Var_decl__Group_1_1_1__0__Impl rule__Var_decl__Group_1_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Var_decl__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1_1__0"


    // $ANTLR start "rule__Var_decl__Group_1_1_1__0__Impl"
    // InternalGo.g:5936:1: rule__Var_decl__Group_1_1_1__0__Impl : ( ruleVar_spec ) ;
    public final void rule__Var_decl__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5940:1: ( ( ruleVar_spec ) )
            // InternalGo.g:5941:1: ( ruleVar_spec )
            {
            // InternalGo.g:5941:1: ( ruleVar_spec )
            // InternalGo.g:5942:2: ruleVar_spec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVar_specParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVar_spec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVar_specParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Var_decl__Group_1_1_1__1"
    // InternalGo.g:5951:1: rule__Var_decl__Group_1_1_1__1 : rule__Var_decl__Group_1_1_1__1__Impl ;
    public final void rule__Var_decl__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5955:1: ( rule__Var_decl__Group_1_1_1__1__Impl )
            // InternalGo.g:5956:2: rule__Var_decl__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1_1__1"


    // $ANTLR start "rule__Var_decl__Group_1_1_1__1__Impl"
    // InternalGo.g:5962:1: rule__Var_decl__Group_1_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Var_decl__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5966:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:5967:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:5967:1: ( RULE_SEMICOLON )
            // InternalGo.g:5968:2: RULE_SEMICOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_SEMICOLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Var_spec__Group__0"
    // InternalGo.g:5978:1: rule__Var_spec__Group__0 : rule__Var_spec__Group__0__Impl rule__Var_spec__Group__1 ;
    public final void rule__Var_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5982:1: ( rule__Var_spec__Group__0__Impl rule__Var_spec__Group__1 )
            // InternalGo.g:5983:2: rule__Var_spec__Group__0__Impl rule__Var_spec__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Var_spec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group__0"


    // $ANTLR start "rule__Var_spec__Group__0__Impl"
    // InternalGo.g:5990:1: rule__Var_spec__Group__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Var_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5994:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:5995:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:5995:1: ( ruleIdentifier_list )
            // InternalGo.g:5996:2: ruleIdentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getIdentifier_listParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getIdentifier_listParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group__0__Impl"


    // $ANTLR start "rule__Var_spec__Group__1"
    // InternalGo.g:6005:1: rule__Var_spec__Group__1 : rule__Var_spec__Group__1__Impl ;
    public final void rule__Var_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6009:1: ( rule__Var_spec__Group__1__Impl )
            // InternalGo.g:6010:2: rule__Var_spec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group__1"


    // $ANTLR start "rule__Var_spec__Group__1__Impl"
    // InternalGo.g:6016:1: rule__Var_spec__Group__1__Impl : ( ( rule__Var_spec__Alternatives_1 ) ) ;
    public final void rule__Var_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6020:1: ( ( ( rule__Var_spec__Alternatives_1 ) ) )
            // InternalGo.g:6021:1: ( ( rule__Var_spec__Alternatives_1 ) )
            {
            // InternalGo.g:6021:1: ( ( rule__Var_spec__Alternatives_1 ) )
            // InternalGo.g:6022:2: ( rule__Var_spec__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getAlternatives_1()); 
            }
            // InternalGo.g:6023:2: ( rule__Var_spec__Alternatives_1 )
            // InternalGo.g:6023:3: rule__Var_spec__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Var_spec__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group__1__Impl"


    // $ANTLR start "rule__Var_spec__Group_1_0__0"
    // InternalGo.g:6032:1: rule__Var_spec__Group_1_0__0 : rule__Var_spec__Group_1_0__0__Impl rule__Var_spec__Group_1_0__1 ;
    public final void rule__Var_spec__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6036:1: ( rule__Var_spec__Group_1_0__0__Impl rule__Var_spec__Group_1_0__1 )
            // InternalGo.g:6037:2: rule__Var_spec__Group_1_0__0__Impl rule__Var_spec__Group_1_0__1
            {
            pushFollow(FOLLOW_41);
            rule__Var_spec__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0__0"


    // $ANTLR start "rule__Var_spec__Group_1_0__0__Impl"
    // InternalGo.g:6044:1: rule__Var_spec__Group_1_0__0__Impl : ( ruleType ) ;
    public final void rule__Var_spec__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6048:1: ( ( ruleType ) )
            // InternalGo.g:6049:1: ( ruleType )
            {
            // InternalGo.g:6049:1: ( ruleType )
            // InternalGo.g:6050:2: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getTypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getTypeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0__0__Impl"


    // $ANTLR start "rule__Var_spec__Group_1_0__1"
    // InternalGo.g:6059:1: rule__Var_spec__Group_1_0__1 : rule__Var_spec__Group_1_0__1__Impl ;
    public final void rule__Var_spec__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6063:1: ( rule__Var_spec__Group_1_0__1__Impl )
            // InternalGo.g:6064:2: rule__Var_spec__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0__1"


    // $ANTLR start "rule__Var_spec__Group_1_0__1__Impl"
    // InternalGo.g:6070:1: rule__Var_spec__Group_1_0__1__Impl : ( ( rule__Var_spec__Group_1_0_1__0 )? ) ;
    public final void rule__Var_spec__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6074:1: ( ( ( rule__Var_spec__Group_1_0_1__0 )? ) )
            // InternalGo.g:6075:1: ( ( rule__Var_spec__Group_1_0_1__0 )? )
            {
            // InternalGo.g:6075:1: ( ( rule__Var_spec__Group_1_0_1__0 )? )
            // InternalGo.g:6076:2: ( rule__Var_spec__Group_1_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getGroup_1_0_1()); 
            }
            // InternalGo.g:6077:2: ( rule__Var_spec__Group_1_0_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==42) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalGo.g:6077:3: rule__Var_spec__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_spec__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getGroup_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0__1__Impl"


    // $ANTLR start "rule__Var_spec__Group_1_0_1__0"
    // InternalGo.g:6086:1: rule__Var_spec__Group_1_0_1__0 : rule__Var_spec__Group_1_0_1__0__Impl rule__Var_spec__Group_1_0_1__1 ;
    public final void rule__Var_spec__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6090:1: ( rule__Var_spec__Group_1_0_1__0__Impl rule__Var_spec__Group_1_0_1__1 )
            // InternalGo.g:6091:2: rule__Var_spec__Group_1_0_1__0__Impl rule__Var_spec__Group_1_0_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Var_spec__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0_1__0"


    // $ANTLR start "rule__Var_spec__Group_1_0_1__0__Impl"
    // InternalGo.g:6098:1: rule__Var_spec__Group_1_0_1__0__Impl : ( '=' ) ;
    public final void rule__Var_spec__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6102:1: ( ( '=' ) )
            // InternalGo.g:6103:1: ( '=' )
            {
            // InternalGo.g:6103:1: ( '=' )
            // InternalGo.g:6104:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getEqualsSignKeyword_1_0_1_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getEqualsSignKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Var_spec__Group_1_0_1__1"
    // InternalGo.g:6113:1: rule__Var_spec__Group_1_0_1__1 : rule__Var_spec__Group_1_0_1__1__Impl ;
    public final void rule__Var_spec__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6117:1: ( rule__Var_spec__Group_1_0_1__1__Impl )
            // InternalGo.g:6118:2: rule__Var_spec__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0_1__1"


    // $ANTLR start "rule__Var_spec__Group_1_0_1__1__Impl"
    // InternalGo.g:6124:1: rule__Var_spec__Group_1_0_1__1__Impl : ( ruleExpression_list ) ;
    public final void rule__Var_spec__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6128:1: ( ( ruleExpression_list ) )
            // InternalGo.g:6129:1: ( ruleExpression_list )
            {
            // InternalGo.g:6129:1: ( ruleExpression_list )
            // InternalGo.g:6130:2: ruleExpression_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getExpression_listParserRuleCall_1_0_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getExpression_listParserRuleCall_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Var_spec__Group_1_1__0"
    // InternalGo.g:6140:1: rule__Var_spec__Group_1_1__0 : rule__Var_spec__Group_1_1__0__Impl rule__Var_spec__Group_1_1__1 ;
    public final void rule__Var_spec__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6144:1: ( rule__Var_spec__Group_1_1__0__Impl rule__Var_spec__Group_1_1__1 )
            // InternalGo.g:6145:2: rule__Var_spec__Group_1_1__0__Impl rule__Var_spec__Group_1_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Var_spec__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_1__0"


    // $ANTLR start "rule__Var_spec__Group_1_1__0__Impl"
    // InternalGo.g:6152:1: rule__Var_spec__Group_1_1__0__Impl : ( '=' ) ;
    public final void rule__Var_spec__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6156:1: ( ( '=' ) )
            // InternalGo.g:6157:1: ( '=' )
            {
            // InternalGo.g:6157:1: ( '=' )
            // InternalGo.g:6158:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getEqualsSignKeyword_1_1_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getEqualsSignKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_1__0__Impl"


    // $ANTLR start "rule__Var_spec__Group_1_1__1"
    // InternalGo.g:6167:1: rule__Var_spec__Group_1_1__1 : rule__Var_spec__Group_1_1__1__Impl ;
    public final void rule__Var_spec__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6171:1: ( rule__Var_spec__Group_1_1__1__Impl )
            // InternalGo.g:6172:2: rule__Var_spec__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_spec__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_1__1"


    // $ANTLR start "rule__Var_spec__Group_1_1__1__Impl"
    // InternalGo.g:6178:1: rule__Var_spec__Group_1_1__1__Impl : ( ruleExpression_list ) ;
    public final void rule__Var_spec__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6182:1: ( ( ruleExpression_list ) )
            // InternalGo.g:6183:1: ( ruleExpression_list )
            {
            // InternalGo.g:6183:1: ( ruleExpression_list )
            // InternalGo.g:6184:2: ruleExpression_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_specAccess().getExpression_listParserRuleCall_1_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_specAccess().getExpression_listParserRuleCall_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_spec__Group_1_1__1__Impl"


    // $ANTLR start "rule__Short_var_decl__Group__0"
    // InternalGo.g:6194:1: rule__Short_var_decl__Group__0 : rule__Short_var_decl__Group__0__Impl rule__Short_var_decl__Group__1 ;
    public final void rule__Short_var_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6198:1: ( rule__Short_var_decl__Group__0__Impl rule__Short_var_decl__Group__1 )
            // InternalGo.g:6199:2: rule__Short_var_decl__Group__0__Impl rule__Short_var_decl__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Short_var_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Short_var_decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Short_var_decl__Group__0"


    // $ANTLR start "rule__Short_var_decl__Group__0__Impl"
    // InternalGo.g:6206:1: rule__Short_var_decl__Group__0__Impl : ( ruleIdentifier_list ) ;
    public final void rule__Short_var_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6210:1: ( ( ruleIdentifier_list ) )
            // InternalGo.g:6211:1: ( ruleIdentifier_list )
            {
            // InternalGo.g:6211:1: ( ruleIdentifier_list )
            // InternalGo.g:6212:2: ruleIdentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShort_var_declAccess().getIdentifier_listParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShort_var_declAccess().getIdentifier_listParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Short_var_decl__Group__0__Impl"


    // $ANTLR start "rule__Short_var_decl__Group__1"
    // InternalGo.g:6221:1: rule__Short_var_decl__Group__1 : rule__Short_var_decl__Group__1__Impl rule__Short_var_decl__Group__2 ;
    public final void rule__Short_var_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6225:1: ( rule__Short_var_decl__Group__1__Impl rule__Short_var_decl__Group__2 )
            // InternalGo.g:6226:2: rule__Short_var_decl__Group__1__Impl rule__Short_var_decl__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Short_var_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Short_var_decl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Short_var_decl__Group__1"


    // $ANTLR start "rule__Short_var_decl__Group__1__Impl"
    // InternalGo.g:6233:1: rule__Short_var_decl__Group__1__Impl : ( ':=' ) ;
    public final void rule__Short_var_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6237:1: ( ( ':=' ) )
            // InternalGo.g:6238:1: ( ':=' )
            {
            // InternalGo.g:6238:1: ( ':=' )
            // InternalGo.g:6239:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShort_var_declAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShort_var_declAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Short_var_decl__Group__1__Impl"


    // $ANTLR start "rule__Short_var_decl__Group__2"
    // InternalGo.g:6248:1: rule__Short_var_decl__Group__2 : rule__Short_var_decl__Group__2__Impl ;
    public final void rule__Short_var_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6252:1: ( rule__Short_var_decl__Group__2__Impl )
            // InternalGo.g:6253:2: rule__Short_var_decl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Short_var_decl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Short_var_decl__Group__2"


    // $ANTLR start "rule__Short_var_decl__Group__2__Impl"
    // InternalGo.g:6259:1: rule__Short_var_decl__Group__2__Impl : ( ruleExpression_list ) ;
    public final void rule__Short_var_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6263:1: ( ( ruleExpression_list ) )
            // InternalGo.g:6264:1: ( ruleExpression_list )
            {
            // InternalGo.g:6264:1: ( ruleExpression_list )
            // InternalGo.g:6265:2: ruleExpression_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShort_var_declAccess().getExpression_listParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShort_var_declAccess().getExpression_listParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Short_var_decl__Group__2__Impl"


    // $ANTLR start "rule__Function_decl__Group__0"
    // InternalGo.g:6275:1: rule__Function_decl__Group__0 : rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1 ;
    public final void rule__Function_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6279:1: ( rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1 )
            // InternalGo.g:6280:2: rule__Function_decl__Group__0__Impl rule__Function_decl__Group__1
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
    // InternalGo.g:6287:1: rule__Function_decl__Group__0__Impl : ( 'func' ) ;
    public final void rule__Function_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6291:1: ( ( 'func' ) )
            // InternalGo.g:6292:1: ( 'func' )
            {
            // InternalGo.g:6292:1: ( 'func' )
            // InternalGo.g:6293:2: 'func'
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
    // InternalGo.g:6302:1: rule__Function_decl__Group__1 : rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2 ;
    public final void rule__Function_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6306:1: ( rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2 )
            // InternalGo.g:6307:2: rule__Function_decl__Group__1__Impl rule__Function_decl__Group__2
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
    // InternalGo.g:6314:1: rule__Function_decl__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Function_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6318:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:6319:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:6319:1: ( RULE_IDENTIFIER )
            // InternalGo.g:6320:2: RULE_IDENTIFIER
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
    // InternalGo.g:6329:1: rule__Function_decl__Group__2 : rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3 ;
    public final void rule__Function_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6333:1: ( rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3 )
            // InternalGo.g:6334:2: rule__Function_decl__Group__2__Impl rule__Function_decl__Group__3
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
    // InternalGo.g:6341:1: rule__Function_decl__Group__2__Impl : ( ruleSignature ) ;
    public final void rule__Function_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6345:1: ( ( ruleSignature ) )
            // InternalGo.g:6346:1: ( ruleSignature )
            {
            // InternalGo.g:6346:1: ( ruleSignature )
            // InternalGo.g:6347:2: ruleSignature
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
    // InternalGo.g:6356:1: rule__Function_decl__Group__3 : rule__Function_decl__Group__3__Impl ;
    public final void rule__Function_decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6360:1: ( rule__Function_decl__Group__3__Impl )
            // InternalGo.g:6361:2: rule__Function_decl__Group__3__Impl
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
    // InternalGo.g:6367:1: rule__Function_decl__Group__3__Impl : ( ( ruleFunction_body )? ) ;
    public final void rule__Function_decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6371:1: ( ( ( ruleFunction_body )? ) )
            // InternalGo.g:6372:1: ( ( ruleFunction_body )? )
            {
            // InternalGo.g:6372:1: ( ( ruleFunction_body )? )
            // InternalGo.g:6373:2: ( ruleFunction_body )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declAccess().getFunction_bodyParserRuleCall_3()); 
            }
            // InternalGo.g:6374:2: ( ruleFunction_body )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalGo.g:6374:3: ruleFunction_body
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
    // InternalGo.g:6383:1: rule__Operand__Group_2__0 : rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1 ;
    public final void rule__Operand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6387:1: ( rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1 )
            // InternalGo.g:6388:2: rule__Operand__Group_2__0__Impl rule__Operand__Group_2__1
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
    // InternalGo.g:6395:1: rule__Operand__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Operand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6399:1: ( ( '(' ) )
            // InternalGo.g:6400:1: ( '(' )
            {
            // InternalGo.g:6400:1: ( '(' )
            // InternalGo.g:6401:2: '('
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
    // InternalGo.g:6410:1: rule__Operand__Group_2__1 : rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2 ;
    public final void rule__Operand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6414:1: ( rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2 )
            // InternalGo.g:6415:2: rule__Operand__Group_2__1__Impl rule__Operand__Group_2__2
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
    // InternalGo.g:6422:1: rule__Operand__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Operand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6426:1: ( ( ruleExpression ) )
            // InternalGo.g:6427:1: ( ruleExpression )
            {
            // InternalGo.g:6427:1: ( ruleExpression )
            // InternalGo.g:6428:2: ruleExpression
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
    // InternalGo.g:6437:1: rule__Operand__Group_2__2 : rule__Operand__Group_2__2__Impl ;
    public final void rule__Operand__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6441:1: ( rule__Operand__Group_2__2__Impl )
            // InternalGo.g:6442:2: rule__Operand__Group_2__2__Impl
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
    // InternalGo.g:6448:1: rule__Operand__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Operand__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6452:1: ( ( ')' ) )
            // InternalGo.g:6453:1: ( ')' )
            {
            // InternalGo.g:6453:1: ( ')' )
            // InternalGo.g:6454:2: ')'
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
    // InternalGo.g:6464:1: rule__Qualified_ident__Group__0 : rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 ;
    public final void rule__Qualified_ident__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6468:1: ( rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1 )
            // InternalGo.g:6469:2: rule__Qualified_ident__Group__0__Impl rule__Qualified_ident__Group__1
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
    // InternalGo.g:6476:1: rule__Qualified_ident__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6480:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:6481:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:6481:1: ( RULE_IDENTIFIER )
            // InternalGo.g:6482:2: RULE_IDENTIFIER
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
    // InternalGo.g:6491:1: rule__Qualified_ident__Group__1 : rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 ;
    public final void rule__Qualified_ident__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6495:1: ( rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2 )
            // InternalGo.g:6496:2: rule__Qualified_ident__Group__1__Impl rule__Qualified_ident__Group__2
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
    // InternalGo.g:6503:1: rule__Qualified_ident__Group__1__Impl : ( '.' ) ;
    public final void rule__Qualified_ident__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6507:1: ( ( '.' ) )
            // InternalGo.g:6508:1: ( '.' )
            {
            // InternalGo.g:6508:1: ( '.' )
            // InternalGo.g:6509:2: '.'
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
    // InternalGo.g:6518:1: rule__Qualified_ident__Group__2 : rule__Qualified_ident__Group__2__Impl ;
    public final void rule__Qualified_ident__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6522:1: ( rule__Qualified_ident__Group__2__Impl )
            // InternalGo.g:6523:2: rule__Qualified_ident__Group__2__Impl
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
    // InternalGo.g:6529:1: rule__Qualified_ident__Group__2__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Qualified_ident__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6533:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:6534:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:6534:1: ( RULE_IDENTIFIER )
            // InternalGo.g:6535:2: RULE_IDENTIFIER
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
    // InternalGo.g:6545:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6549:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalGo.g:6550:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalGo.g:6557:1: rule__Expression__Group__0__Impl : ( ruleUnary_expr ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6561:1: ( ( ruleUnary_expr ) )
            // InternalGo.g:6562:1: ( ruleUnary_expr )
            {
            // InternalGo.g:6562:1: ( ruleUnary_expr )
            // InternalGo.g:6563:2: ruleUnary_expr
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
    // InternalGo.g:6572:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6576:1: ( rule__Expression__Group__1__Impl )
            // InternalGo.g:6577:2: rule__Expression__Group__1__Impl
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
    // InternalGo.g:6583:1: rule__Expression__Group__1__Impl : ( ruleExpression_line ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6587:1: ( ( ruleExpression_line ) )
            // InternalGo.g:6588:1: ( ruleExpression_line )
            {
            // InternalGo.g:6588:1: ( ruleExpression_line )
            // InternalGo.g:6589:2: ruleExpression_line
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
    // InternalGo.g:6599:1: rule__Expression_line__Group__0 : rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1 ;
    public final void rule__Expression_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6603:1: ( rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1 )
            // InternalGo.g:6604:2: rule__Expression_line__Group__0__Impl rule__Expression_line__Group__1
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
    // InternalGo.g:6611:1: rule__Expression_line__Group__0__Impl : ( RULE_BINARY_OP ) ;
    public final void rule__Expression_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6615:1: ( ( RULE_BINARY_OP ) )
            // InternalGo.g:6616:1: ( RULE_BINARY_OP )
            {
            // InternalGo.g:6616:1: ( RULE_BINARY_OP )
            // InternalGo.g:6617:2: RULE_BINARY_OP
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
    // InternalGo.g:6626:1: rule__Expression_line__Group__1 : rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2 ;
    public final void rule__Expression_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6630:1: ( rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2 )
            // InternalGo.g:6631:2: rule__Expression_line__Group__1__Impl rule__Expression_line__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalGo.g:6638:1: rule__Expression_line__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6642:1: ( ( ruleExpression ) )
            // InternalGo.g:6643:1: ( ruleExpression )
            {
            // InternalGo.g:6643:1: ( ruleExpression )
            // InternalGo.g:6644:2: ruleExpression
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
    // InternalGo.g:6653:1: rule__Expression_line__Group__2 : rule__Expression_line__Group__2__Impl ;
    public final void rule__Expression_line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6657:1: ( rule__Expression_line__Group__2__Impl )
            // InternalGo.g:6658:2: rule__Expression_line__Group__2__Impl
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
    // InternalGo.g:6664:1: rule__Expression_line__Group__2__Impl : ( ruleExpression_line ) ;
    public final void rule__Expression_line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6668:1: ( ( ruleExpression_line ) )
            // InternalGo.g:6669:1: ( ruleExpression_line )
            {
            // InternalGo.g:6669:1: ( ruleExpression_line )
            // InternalGo.g:6670:2: ruleExpression_line
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
    // InternalGo.g:6680:1: rule__Labeled_stmt__Group__0 : rule__Labeled_stmt__Group__0__Impl rule__Labeled_stmt__Group__1 ;
    public final void rule__Labeled_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6684:1: ( rule__Labeled_stmt__Group__0__Impl rule__Labeled_stmt__Group__1 )
            // InternalGo.g:6685:2: rule__Labeled_stmt__Group__0__Impl rule__Labeled_stmt__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalGo.g:6692:1: rule__Labeled_stmt__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Labeled_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6696:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:6697:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:6697:1: ( RULE_IDENTIFIER )
            // InternalGo.g:6698:2: RULE_IDENTIFIER
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
    // InternalGo.g:6707:1: rule__Labeled_stmt__Group__1 : rule__Labeled_stmt__Group__1__Impl rule__Labeled_stmt__Group__2 ;
    public final void rule__Labeled_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6711:1: ( rule__Labeled_stmt__Group__1__Impl rule__Labeled_stmt__Group__2 )
            // InternalGo.g:6712:2: rule__Labeled_stmt__Group__1__Impl rule__Labeled_stmt__Group__2
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
    // InternalGo.g:6719:1: rule__Labeled_stmt__Group__1__Impl : ( ':' ) ;
    public final void rule__Labeled_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6723:1: ( ( ':' ) )
            // InternalGo.g:6724:1: ( ':' )
            {
            // InternalGo.g:6724:1: ( ':' )
            // InternalGo.g:6725:2: ':'
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
    // InternalGo.g:6734:1: rule__Labeled_stmt__Group__2 : rule__Labeled_stmt__Group__2__Impl ;
    public final void rule__Labeled_stmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6738:1: ( rule__Labeled_stmt__Group__2__Impl )
            // InternalGo.g:6739:2: rule__Labeled_stmt__Group__2__Impl
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
    // InternalGo.g:6745:1: rule__Labeled_stmt__Group__2__Impl : ( ruleStatement ) ;
    public final void rule__Labeled_stmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6749:1: ( ( ruleStatement ) )
            // InternalGo.g:6750:1: ( ruleStatement )
            {
            // InternalGo.g:6750:1: ( ruleStatement )
            // InternalGo.g:6751:2: ruleStatement
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
    // InternalGo.g:6761:1: rule__If_stmt__Group__0 : rule__If_stmt__Group__0__Impl rule__If_stmt__Group__1 ;
    public final void rule__If_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6765:1: ( rule__If_stmt__Group__0__Impl rule__If_stmt__Group__1 )
            // InternalGo.g:6766:2: rule__If_stmt__Group__0__Impl rule__If_stmt__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalGo.g:6773:1: rule__If_stmt__Group__0__Impl : ( 'if' ) ;
    public final void rule__If_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6777:1: ( ( 'if' ) )
            // InternalGo.g:6778:1: ( 'if' )
            {
            // InternalGo.g:6778:1: ( 'if' )
            // InternalGo.g:6779:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getIfKeyword_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:6788:1: rule__If_stmt__Group__1 : rule__If_stmt__Group__1__Impl rule__If_stmt__Group__2 ;
    public final void rule__If_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6792:1: ( rule__If_stmt__Group__1__Impl rule__If_stmt__Group__2 )
            // InternalGo.g:6793:2: rule__If_stmt__Group__1__Impl rule__If_stmt__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalGo.g:6800:1: rule__If_stmt__Group__1__Impl : ( ( rule__If_stmt__Group_1__0 )? ) ;
    public final void rule__If_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6804:1: ( ( ( rule__If_stmt__Group_1__0 )? ) )
            // InternalGo.g:6805:1: ( ( rule__If_stmt__Group_1__0 )? )
            {
            // InternalGo.g:6805:1: ( ( rule__If_stmt__Group_1__0 )? )
            // InternalGo.g:6806:2: ( rule__If_stmt__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getGroup_1()); 
            }
            // InternalGo.g:6807:2: ( rule__If_stmt__Group_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_WS) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_IDENTIFIER) ) {
                int LA60_2 = input.LA(2);

                if ( ((LA60_2>=43 && LA60_2<=44)) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalGo.g:6807:3: rule__If_stmt__Group_1__0
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
    // InternalGo.g:6815:1: rule__If_stmt__Group__2 : rule__If_stmt__Group__2__Impl rule__If_stmt__Group__3 ;
    public final void rule__If_stmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6819:1: ( rule__If_stmt__Group__2__Impl rule__If_stmt__Group__3 )
            // InternalGo.g:6820:2: rule__If_stmt__Group__2__Impl rule__If_stmt__Group__3
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
    // InternalGo.g:6827:1: rule__If_stmt__Group__2__Impl : ( ( ruleExpression ) ) ;
    public final void rule__If_stmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6831:1: ( ( ( ruleExpression ) ) )
            // InternalGo.g:6832:1: ( ( ruleExpression ) )
            {
            // InternalGo.g:6832:1: ( ( ruleExpression ) )
            // InternalGo.g:6833:2: ( ruleExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getExpressionParserRuleCall_2()); 
            }
            // InternalGo.g:6834:2: ( ruleExpression )
            // InternalGo.g:6834:3: ruleExpression
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
    // InternalGo.g:6842:1: rule__If_stmt__Group__3 : rule__If_stmt__Group__3__Impl rule__If_stmt__Group__4 ;
    public final void rule__If_stmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6846:1: ( rule__If_stmt__Group__3__Impl rule__If_stmt__Group__4 )
            // InternalGo.g:6847:2: rule__If_stmt__Group__3__Impl rule__If_stmt__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalGo.g:6854:1: rule__If_stmt__Group__3__Impl : ( ruleBlock ) ;
    public final void rule__If_stmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6858:1: ( ( ruleBlock ) )
            // InternalGo.g:6859:1: ( ruleBlock )
            {
            // InternalGo.g:6859:1: ( ruleBlock )
            // InternalGo.g:6860:2: ruleBlock
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
    // InternalGo.g:6869:1: rule__If_stmt__Group__4 : rule__If_stmt__Group__4__Impl ;
    public final void rule__If_stmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6873:1: ( rule__If_stmt__Group__4__Impl )
            // InternalGo.g:6874:2: rule__If_stmt__Group__4__Impl
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
    // InternalGo.g:6880:1: rule__If_stmt__Group__4__Impl : ( ( rule__If_stmt__Group_4__0 )? ) ;
    public final void rule__If_stmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6884:1: ( ( ( rule__If_stmt__Group_4__0 )? ) )
            // InternalGo.g:6885:1: ( ( rule__If_stmt__Group_4__0 )? )
            {
            // InternalGo.g:6885:1: ( ( rule__If_stmt__Group_4__0 )? )
            // InternalGo.g:6886:2: ( rule__If_stmt__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getGroup_4()); 
            }
            // InternalGo.g:6887:2: ( rule__If_stmt__Group_4__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==69) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalGo.g:6887:3: rule__If_stmt__Group_4__0
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
    // InternalGo.g:6896:1: rule__If_stmt__Group_1__0 : rule__If_stmt__Group_1__0__Impl rule__If_stmt__Group_1__1 ;
    public final void rule__If_stmt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6900:1: ( rule__If_stmt__Group_1__0__Impl rule__If_stmt__Group_1__1 )
            // InternalGo.g:6901:2: rule__If_stmt__Group_1__0__Impl rule__If_stmt__Group_1__1
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
    // InternalGo.g:6908:1: rule__If_stmt__Group_1__0__Impl : ( ruleSimple_stmt ) ;
    public final void rule__If_stmt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6912:1: ( ( ruleSimple_stmt ) )
            // InternalGo.g:6913:1: ( ruleSimple_stmt )
            {
            // InternalGo.g:6913:1: ( ruleSimple_stmt )
            // InternalGo.g:6914:2: ruleSimple_stmt
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
    // InternalGo.g:6923:1: rule__If_stmt__Group_1__1 : rule__If_stmt__Group_1__1__Impl ;
    public final void rule__If_stmt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6927:1: ( rule__If_stmt__Group_1__1__Impl )
            // InternalGo.g:6928:2: rule__If_stmt__Group_1__1__Impl
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
    // InternalGo.g:6934:1: rule__If_stmt__Group_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__If_stmt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6938:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:6939:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:6939:1: ( RULE_SEMICOLON )
            // InternalGo.g:6940:2: RULE_SEMICOLON
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
    // InternalGo.g:6950:1: rule__If_stmt__Group_4__0 : rule__If_stmt__Group_4__0__Impl rule__If_stmt__Group_4__1 ;
    public final void rule__If_stmt__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6954:1: ( rule__If_stmt__Group_4__0__Impl rule__If_stmt__Group_4__1 )
            // InternalGo.g:6955:2: rule__If_stmt__Group_4__0__Impl rule__If_stmt__Group_4__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalGo.g:6962:1: rule__If_stmt__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__If_stmt__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6966:1: ( ( 'else' ) )
            // InternalGo.g:6967:1: ( 'else' )
            {
            // InternalGo.g:6967:1: ( 'else' )
            // InternalGo.g:6968:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getElseKeyword_4_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:6977:1: rule__If_stmt__Group_4__1 : rule__If_stmt__Group_4__1__Impl ;
    public final void rule__If_stmt__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6981:1: ( rule__If_stmt__Group_4__1__Impl )
            // InternalGo.g:6982:2: rule__If_stmt__Group_4__1__Impl
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
    // InternalGo.g:6988:1: rule__If_stmt__Group_4__1__Impl : ( ( rule__If_stmt__Alternatives_4_1 ) ) ;
    public final void rule__If_stmt__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:6992:1: ( ( ( rule__If_stmt__Alternatives_4_1 ) ) )
            // InternalGo.g:6993:1: ( ( rule__If_stmt__Alternatives_4_1 ) )
            {
            // InternalGo.g:6993:1: ( ( rule__If_stmt__Alternatives_4_1 ) )
            // InternalGo.g:6994:2: ( rule__If_stmt__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_stmtAccess().getAlternatives_4_1()); 
            }
            // InternalGo.g:6995:2: ( rule__If_stmt__Alternatives_4_1 )
            // InternalGo.g:6995:3: rule__If_stmt__Alternatives_4_1
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
    // InternalGo.g:7004:1: rule__Go_stmt__Group__0 : rule__Go_stmt__Group__0__Impl rule__Go_stmt__Group__1 ;
    public final void rule__Go_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7008:1: ( rule__Go_stmt__Group__0__Impl rule__Go_stmt__Group__1 )
            // InternalGo.g:7009:2: rule__Go_stmt__Group__0__Impl rule__Go_stmt__Group__1
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
    // InternalGo.g:7016:1: rule__Go_stmt__Group__0__Impl : ( 'go' ) ;
    public final void rule__Go_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7020:1: ( ( 'go' ) )
            // InternalGo.g:7021:1: ( 'go' )
            {
            // InternalGo.g:7021:1: ( 'go' )
            // InternalGo.g:7022:2: 'go'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGo_stmtAccess().getGoKeyword_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7031:1: rule__Go_stmt__Group__1 : rule__Go_stmt__Group__1__Impl ;
    public final void rule__Go_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7035:1: ( rule__Go_stmt__Group__1__Impl )
            // InternalGo.g:7036:2: rule__Go_stmt__Group__1__Impl
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
    // InternalGo.g:7042:1: rule__Go_stmt__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Go_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7046:1: ( ( ruleExpression ) )
            // InternalGo.g:7047:1: ( ruleExpression )
            {
            // InternalGo.g:7047:1: ( ruleExpression )
            // InternalGo.g:7048:2: ruleExpression
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
    // InternalGo.g:7058:1: rule__Return_stmt__Group__0 : rule__Return_stmt__Group__0__Impl rule__Return_stmt__Group__1 ;
    public final void rule__Return_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7062:1: ( rule__Return_stmt__Group__0__Impl rule__Return_stmt__Group__1 )
            // InternalGo.g:7063:2: rule__Return_stmt__Group__0__Impl rule__Return_stmt__Group__1
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
    // InternalGo.g:7070:1: rule__Return_stmt__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7074:1: ( ( 'return' ) )
            // InternalGo.g:7075:1: ( 'return' )
            {
            // InternalGo.g:7075:1: ( 'return' )
            // InternalGo.g:7076:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturn_stmtAccess().getReturnKeyword_0()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7085:1: rule__Return_stmt__Group__1 : rule__Return_stmt__Group__1__Impl ;
    public final void rule__Return_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7089:1: ( rule__Return_stmt__Group__1__Impl )
            // InternalGo.g:7090:2: rule__Return_stmt__Group__1__Impl
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
    // InternalGo.g:7096:1: rule__Return_stmt__Group__1__Impl : ( ( ruleExpression_list )? ) ;
    public final void rule__Return_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7100:1: ( ( ( ruleExpression_list )? ) )
            // InternalGo.g:7101:1: ( ( ruleExpression_list )? )
            {
            // InternalGo.g:7101:1: ( ( ruleExpression_list )? )
            // InternalGo.g:7102:2: ( ruleExpression_list )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturn_stmtAccess().getExpression_listParserRuleCall_1()); 
            }
            // InternalGo.g:7103:2: ( ruleExpression_list )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_INT && LA62_0<=RULE_HEX_LIT)||(LA62_0>=RULE_RAW_STRING_LIT && LA62_0<=RULE_UNARY_OP)||LA62_0==35||(LA62_0>=58 && LA62_0<=59)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalGo.g:7103:3: ruleExpression_list
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
    // InternalGo.g:7112:1: rule__Break_stmt__Group__0 : rule__Break_stmt__Group__0__Impl rule__Break_stmt__Group__1 ;
    public final void rule__Break_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7116:1: ( rule__Break_stmt__Group__0__Impl rule__Break_stmt__Group__1 )
            // InternalGo.g:7117:2: rule__Break_stmt__Group__0__Impl rule__Break_stmt__Group__1
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
    // InternalGo.g:7124:1: rule__Break_stmt__Group__0__Impl : ( 'break' ) ;
    public final void rule__Break_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7128:1: ( ( 'break' ) )
            // InternalGo.g:7129:1: ( 'break' )
            {
            // InternalGo.g:7129:1: ( 'break' )
            // InternalGo.g:7130:2: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreak_stmtAccess().getBreakKeyword_0()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7139:1: rule__Break_stmt__Group__1 : rule__Break_stmt__Group__1__Impl ;
    public final void rule__Break_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7143:1: ( rule__Break_stmt__Group__1__Impl )
            // InternalGo.g:7144:2: rule__Break_stmt__Group__1__Impl
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
    // InternalGo.g:7150:1: rule__Break_stmt__Group__1__Impl : ( ( RULE_IDENTIFIER )? ) ;
    public final void rule__Break_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7154:1: ( ( ( RULE_IDENTIFIER )? ) )
            // InternalGo.g:7155:1: ( ( RULE_IDENTIFIER )? )
            {
            // InternalGo.g:7155:1: ( ( RULE_IDENTIFIER )? )
            // InternalGo.g:7156:2: ( RULE_IDENTIFIER )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreak_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }
            // InternalGo.g:7157:2: ( RULE_IDENTIFIER )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_IDENTIFIER) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalGo.g:7157:3: RULE_IDENTIFIER
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
    // InternalGo.g:7166:1: rule__Continue_stmt__Group__0 : rule__Continue_stmt__Group__0__Impl rule__Continue_stmt__Group__1 ;
    public final void rule__Continue_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7170:1: ( rule__Continue_stmt__Group__0__Impl rule__Continue_stmt__Group__1 )
            // InternalGo.g:7171:2: rule__Continue_stmt__Group__0__Impl rule__Continue_stmt__Group__1
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
    // InternalGo.g:7178:1: rule__Continue_stmt__Group__0__Impl : ( 'continue' ) ;
    public final void rule__Continue_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7182:1: ( ( 'continue' ) )
            // InternalGo.g:7183:1: ( 'continue' )
            {
            // InternalGo.g:7183:1: ( 'continue' )
            // InternalGo.g:7184:2: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContinue_stmtAccess().getContinueKeyword_0()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7193:1: rule__Continue_stmt__Group__1 : rule__Continue_stmt__Group__1__Impl ;
    public final void rule__Continue_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7197:1: ( rule__Continue_stmt__Group__1__Impl )
            // InternalGo.g:7198:2: rule__Continue_stmt__Group__1__Impl
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
    // InternalGo.g:7204:1: rule__Continue_stmt__Group__1__Impl : ( ( RULE_IDENTIFIER )? ) ;
    public final void rule__Continue_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7208:1: ( ( ( RULE_IDENTIFIER )? ) )
            // InternalGo.g:7209:1: ( ( RULE_IDENTIFIER )? )
            {
            // InternalGo.g:7209:1: ( ( RULE_IDENTIFIER )? )
            // InternalGo.g:7210:2: ( RULE_IDENTIFIER )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContinue_stmtAccess().getIDENTIFIERTerminalRuleCall_1()); 
            }
            // InternalGo.g:7211:2: ( RULE_IDENTIFIER )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_IDENTIFIER) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalGo.g:7211:3: RULE_IDENTIFIER
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
    // InternalGo.g:7220:1: rule__Goto_stmt__Group__0 : rule__Goto_stmt__Group__0__Impl rule__Goto_stmt__Group__1 ;
    public final void rule__Goto_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7224:1: ( rule__Goto_stmt__Group__0__Impl rule__Goto_stmt__Group__1 )
            // InternalGo.g:7225:2: rule__Goto_stmt__Group__0__Impl rule__Goto_stmt__Group__1
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
    // InternalGo.g:7232:1: rule__Goto_stmt__Group__0__Impl : ( 'goto' ) ;
    public final void rule__Goto_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7236:1: ( ( 'goto' ) )
            // InternalGo.g:7237:1: ( 'goto' )
            {
            // InternalGo.g:7237:1: ( 'goto' )
            // InternalGo.g:7238:2: 'goto'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoto_stmtAccess().getGotoKeyword_0()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7247:1: rule__Goto_stmt__Group__1 : rule__Goto_stmt__Group__1__Impl ;
    public final void rule__Goto_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7251:1: ( rule__Goto_stmt__Group__1__Impl )
            // InternalGo.g:7252:2: rule__Goto_stmt__Group__1__Impl
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
    // InternalGo.g:7258:1: rule__Goto_stmt__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Goto_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7262:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:7263:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:7263:1: ( RULE_IDENTIFIER )
            // InternalGo.g:7264:2: RULE_IDENTIFIER
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
    // InternalGo.g:7274:1: rule__Defer_stmt__Group__0 : rule__Defer_stmt__Group__0__Impl rule__Defer_stmt__Group__1 ;
    public final void rule__Defer_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7278:1: ( rule__Defer_stmt__Group__0__Impl rule__Defer_stmt__Group__1 )
            // InternalGo.g:7279:2: rule__Defer_stmt__Group__0__Impl rule__Defer_stmt__Group__1
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
    // InternalGo.g:7286:1: rule__Defer_stmt__Group__0__Impl : ( 'defer' ) ;
    public final void rule__Defer_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7290:1: ( ( 'defer' ) )
            // InternalGo.g:7291:1: ( 'defer' )
            {
            // InternalGo.g:7291:1: ( 'defer' )
            // InternalGo.g:7292:2: 'defer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefer_stmtAccess().getDeferKeyword_0()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7301:1: rule__Defer_stmt__Group__1 : rule__Defer_stmt__Group__1__Impl ;
    public final void rule__Defer_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7305:1: ( rule__Defer_stmt__Group__1__Impl )
            // InternalGo.g:7306:2: rule__Defer_stmt__Group__1__Impl
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
    // InternalGo.g:7312:1: rule__Defer_stmt__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Defer_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7316:1: ( ( ruleExpression ) )
            // InternalGo.g:7317:1: ( ruleExpression )
            {
            // InternalGo.g:7317:1: ( ruleExpression )
            // InternalGo.g:7318:2: ruleExpression
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
    // InternalGo.g:7328:1: rule__Package_clause__Group__0 : rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1 ;
    public final void rule__Package_clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7332:1: ( rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1 )
            // InternalGo.g:7333:2: rule__Package_clause__Group__0__Impl rule__Package_clause__Group__1
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
    // InternalGo.g:7340:1: rule__Package_clause__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7344:1: ( ( 'package' ) )
            // InternalGo.g:7345:1: ( 'package' )
            {
            // InternalGo.g:7345:1: ( 'package' )
            // InternalGo.g:7346:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_clauseAccess().getPackageKeyword_0()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7355:1: rule__Package_clause__Group__1 : rule__Package_clause__Group__1__Impl ;
    public final void rule__Package_clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7359:1: ( rule__Package_clause__Group__1__Impl )
            // InternalGo.g:7360:2: rule__Package_clause__Group__1__Impl
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
    // InternalGo.g:7366:1: rule__Package_clause__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Package_clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7370:1: ( ( RULE_IDENTIFIER ) )
            // InternalGo.g:7371:1: ( RULE_IDENTIFIER )
            {
            // InternalGo.g:7371:1: ( RULE_IDENTIFIER )
            // InternalGo.g:7372:2: RULE_IDENTIFIER
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
    // InternalGo.g:7382:1: rule__Import_decl__Group__0 : rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 ;
    public final void rule__Import_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7386:1: ( rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 )
            // InternalGo.g:7387:2: rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalGo.g:7394:1: rule__Import_decl__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7398:1: ( ( 'import' ) )
            // InternalGo.g:7399:1: ( 'import' )
            {
            // InternalGo.g:7399:1: ( 'import' )
            // InternalGo.g:7400:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getImportKeyword_0()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:7409:1: rule__Import_decl__Group__1 : rule__Import_decl__Group__1__Impl ;
    public final void rule__Import_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7413:1: ( rule__Import_decl__Group__1__Impl )
            // InternalGo.g:7414:2: rule__Import_decl__Group__1__Impl
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
    // InternalGo.g:7420:1: rule__Import_decl__Group__1__Impl : ( ( rule__Import_decl__Alternatives_1 ) ) ;
    public final void rule__Import_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7424:1: ( ( ( rule__Import_decl__Alternatives_1 ) ) )
            // InternalGo.g:7425:1: ( ( rule__Import_decl__Alternatives_1 ) )
            {
            // InternalGo.g:7425:1: ( ( rule__Import_decl__Alternatives_1 ) )
            // InternalGo.g:7426:2: ( rule__Import_decl__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getAlternatives_1()); 
            }
            // InternalGo.g:7427:2: ( rule__Import_decl__Alternatives_1 )
            // InternalGo.g:7427:3: rule__Import_decl__Alternatives_1
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
    // InternalGo.g:7436:1: rule__Import_decl__Group_1_1__0 : rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 ;
    public final void rule__Import_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7440:1: ( rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 )
            // InternalGo.g:7441:2: rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalGo.g:7448:1: rule__Import_decl__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Import_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7452:1: ( ( '(' ) )
            // InternalGo.g:7453:1: ( '(' )
            {
            // InternalGo.g:7453:1: ( '(' )
            // InternalGo.g:7454:2: '('
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
    // InternalGo.g:7463:1: rule__Import_decl__Group_1_1__1 : rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 ;
    public final void rule__Import_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7467:1: ( rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 )
            // InternalGo.g:7468:2: rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalGo.g:7475:1: rule__Import_decl__Group_1_1__1__Impl : ( ( rule__Import_decl__Group_1_1_1__0 )* ) ;
    public final void rule__Import_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7479:1: ( ( ( rule__Import_decl__Group_1_1_1__0 )* ) )
            // InternalGo.g:7480:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            {
            // InternalGo.g:7480:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            // InternalGo.g:7481:2: ( rule__Import_decl__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_declAccess().getGroup_1_1_1()); 
            }
            // InternalGo.g:7482:2: ( rule__Import_decl__Group_1_1_1__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_RAW_STRING_LIT && LA65_0<=RULE_IDENTIFIER)||LA65_0==47||LA65_0==59) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalGo.g:7482:3: rule__Import_decl__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Import_decl__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalGo.g:7490:1: rule__Import_decl__Group_1_1__2 : rule__Import_decl__Group_1_1__2__Impl ;
    public final void rule__Import_decl__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7494:1: ( rule__Import_decl__Group_1_1__2__Impl )
            // InternalGo.g:7495:2: rule__Import_decl__Group_1_1__2__Impl
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
    // InternalGo.g:7501:1: rule__Import_decl__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Import_decl__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7505:1: ( ( ')' ) )
            // InternalGo.g:7506:1: ( ')' )
            {
            // InternalGo.g:7506:1: ( ')' )
            // InternalGo.g:7507:2: ')'
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
    // InternalGo.g:7517:1: rule__Import_decl__Group_1_1_1__0 : rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 ;
    public final void rule__Import_decl__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7521:1: ( rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 )
            // InternalGo.g:7522:2: rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1
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
    // InternalGo.g:7529:1: rule__Import_decl__Group_1_1_1__0__Impl : ( ruleImport_spec ) ;
    public final void rule__Import_decl__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7533:1: ( ( ruleImport_spec ) )
            // InternalGo.g:7534:1: ( ruleImport_spec )
            {
            // InternalGo.g:7534:1: ( ruleImport_spec )
            // InternalGo.g:7535:2: ruleImport_spec
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
    // InternalGo.g:7544:1: rule__Import_decl__Group_1_1_1__1 : rule__Import_decl__Group_1_1_1__1__Impl ;
    public final void rule__Import_decl__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7548:1: ( rule__Import_decl__Group_1_1_1__1__Impl )
            // InternalGo.g:7549:2: rule__Import_decl__Group_1_1_1__1__Impl
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
    // InternalGo.g:7555:1: rule__Import_decl__Group_1_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Import_decl__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7559:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:7560:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:7560:1: ( RULE_SEMICOLON )
            // InternalGo.g:7561:2: RULE_SEMICOLON
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
    // InternalGo.g:7571:1: rule__Import_spec__Group__0 : rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 ;
    public final void rule__Import_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7575:1: ( rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 )
            // InternalGo.g:7576:2: rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalGo.g:7583:1: rule__Import_spec__Group__0__Impl : ( ( rule__Import_spec__Alternatives_0 )? ) ;
    public final void rule__Import_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7587:1: ( ( ( rule__Import_spec__Alternatives_0 )? ) )
            // InternalGo.g:7588:1: ( ( rule__Import_spec__Alternatives_0 )? )
            {
            // InternalGo.g:7588:1: ( ( rule__Import_spec__Alternatives_0 )? )
            // InternalGo.g:7589:2: ( rule__Import_spec__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_specAccess().getAlternatives_0()); 
            }
            // InternalGo.g:7590:2: ( rule__Import_spec__Alternatives_0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_IDENTIFIER||LA66_0==47) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalGo.g:7590:3: rule__Import_spec__Alternatives_0
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
    // InternalGo.g:7598:1: rule__Import_spec__Group__1 : rule__Import_spec__Group__1__Impl ;
    public final void rule__Import_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7602:1: ( rule__Import_spec__Group__1__Impl )
            // InternalGo.g:7603:2: rule__Import_spec__Group__1__Impl
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
    // InternalGo.g:7609:1: rule__Import_spec__Group__1__Impl : ( ruleImport_path ) ;
    public final void rule__Import_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7613:1: ( ( ruleImport_path ) )
            // InternalGo.g:7614:1: ( ruleImport_path )
            {
            // InternalGo.g:7614:1: ( ruleImport_path )
            // InternalGo.g:7615:2: ruleImport_path
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
    // InternalGo.g:7625:1: rule__Model__GreetingsAssignment : ( ruleprogram ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:7629:1: ( ( ruleprogram ) )
            // InternalGo.g:7630:2: ( ruleprogram )
            {
            // InternalGo.g:7630:2: ( ruleprogram )
            // InternalGo.g:7631:3: ruleprogram
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
        // InternalGo.g:2280:2: ( ( ruleParameters ) )
        // InternalGo.g:2280:2: ( ruleParameters )
        {
        // InternalGo.g:2280:2: ( ruleParameters )
        // InternalGo.g:2281:3: ruleParameters
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

    // $ANTLR start synpred84_InternalGo
    public final void synpred84_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3902:4: ( ruleResult )
        // InternalGo.g:3902:4: ruleResult
        {
        pushFollow(FOLLOW_2);
        ruleResult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_InternalGo

    // $ANTLR start synpred87_InternalGo
    public final void synpred87_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:4106:3: ( rule__Parameter_list__Group_1__0 )
        // InternalGo.g:4106:3: rule__Parameter_list__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Parameter_list__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalGo

    // $ANTLR start synpred88_InternalGo
    public final void synpred88_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:4215:3: ( rule__Parameter_decl__Group_0__0 )
        // InternalGo.g:4215:3: rule__Parameter_decl__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__Parameter_decl__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalGo

    // Delegated rules

    public final boolean synpred84_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred87_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalGo_fragment(); // can never throw exception
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
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\uffff\1\2\21\uffff\1\26\5\uffff\1\26";
    static final String dfa_3s = "\1\10\1\5\3\uffff\3\10\1\uffff\1\57\5\10\1\57\2\10\1\57\1\5\2\10\1\uffff\2\10\1\5";
    static final String dfa_4s = "\2\73\3\uffff\1\62\2\64\1\uffff\1\62\2\64\3\10\1\57\2\10\1\57\1\73\2\64\1\uffff\2\10\1\73";
    static final String dfa_5s = "\2\uffff\1\1\1\4\1\5\3\uffff\1\3\15\uffff\1\2\3\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\4\53\uffff\1\3\1\4",
            "\1\2\2\uffff\3\2\3\uffff\3\2\22\uffff\1\2\13\uffff\1\5\1\uffff\1\6\1\7\6\uffff\1\10\2\2",
            "",
            "",
            "",
            "\1\11\46\uffff\1\14\1\uffff\1\12\1\13",
            "\1\17\52\uffff\1\15\1\16",
            "\1\17\52\uffff\1\15\1\16",
            "",
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
            "\1\26\2\uffff\3\26\3\uffff\3\26\22\uffff\1\26\15\uffff\1\24\1\25\6\uffff\1\10\2\26",
            "\1\31\52\uffff\1\27\1\30",
            "\1\31\52\uffff\1\27\1\30",
            "",
            "\1\31",
            "\1\31",
            "\1\26\2\uffff\3\26\3\uffff\3\26\22\uffff\1\26\25\uffff\1\10\2\26"
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
            return "2110:1: rule__Literals__Alternatives : ( ( ruleInt_lit ) | ( ruleFloat_lit ) | ( ruleImaginary_lit ) | ( ruleRune_lit ) | ( ruleString_lit ) );";
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
            return "2197:1: rule__Type_lit__Alternatives : ( ( ruleArray_type ) | ( ruleStruct_type ) | ( rulePointer_type ) | ( ruleFunction_type ) | ( ruleSlice_type ) | ( ruleMap_type ) | ( ruleInterface_type ) | ( ruleChannel_type ) );";
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
            return "2275:1: rule__Result__Alternatives : ( ( ruleParameters ) | ( ( ruleType ) ) );";
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
    static final String dfa_20s = "\16\uffff";
    static final String dfa_21s = "\1\4\1\uffff\1\53\13\uffff";
    static final String dfa_22s = "\1\113\1\uffff\1\60\13\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\2";
    static final String dfa_24s = "\16\uffff}>";
    static final String[] dfa_25s = {
            "\1\14\12\uffff\1\2\23\uffff\1\1\3\uffff\1\11\20\uffff\1\10\10\uffff\3\1\1\12\1\uffff\1\3\1\4\1\5\1\6\1\7\1\13",
            "",
            "\2\14\3\uffff\1\15",
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

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2545:1: rule__Statement__Alternatives : ( ( ruleDeclaration ) | ( ruleLabeled_stmt ) | ( ruleGo_stmt ) | ( ruleReturn_stmt ) | ( ruleBreak_stmt ) | ( ruleContinue_stmt ) | ( ruleGoto_stmt ) | ( 'fallthrough' ) | ( ruleBlock ) | ( ruleIf_stmt ) | ( ruleDefer_stmt ) | ( ruleSimple_stmt ) );";
        }
    }
    static final String dfa_26s = "\26\uffff";
    static final String dfa_27s = "\1\1\25\uffff";
    static final String dfa_28s = "\1\6\1\uffff\13\0\11\uffff";
    static final String dfa_29s = "\1\100\1\uffff\13\0\11\uffff";
    static final String dfa_30s = "\1\uffff\1\2\23\uffff\1\1";
    static final String dfa_31s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\11\uffff}>";
    static final String[] dfa_32s = {
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
            return "()* loopback of 3902:3: ( ruleResult )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_4 = input.LA(1);

                         
                        int index44_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_8 = input.LA(1);

                         
                        int index44_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_12);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0100008800008012L,0x0000000000000FDEL});
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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xF1E040A800008010L,0x0000000000000FDFL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2100018800008010L,0x0000000000000FDEL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2100008800008012L,0x0000000000000FDEL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0C00000000004700L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF0E0002800008002L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xF1E040A800008012L,0x0000000000000FDFL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100008800008010L,0x0000000000000FDEL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100009800008010L,0x0000000000000FDEL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xF0E0042800008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0C0000080001C700L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0D0000880001C710L,0x0000000000000FDEL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0C0080080000C700L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0C0080100000C700L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0C0080000000C702L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0C0080000000C700L});

}