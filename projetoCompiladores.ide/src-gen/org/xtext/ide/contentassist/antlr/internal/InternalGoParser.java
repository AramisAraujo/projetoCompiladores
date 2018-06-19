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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_UNICODE_CHAR", "RULE_NEWLINE", "RULE_LETTER", "RULE_HEX_DIGIT", "RULE_SEMICOLON", "RULE_UNICODE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'a'", "'b'", "'f'", "'n'", "'r'", "'t'", "'v'", "'\\\\'", "'\\''", "'\"'", "'.'", "'x'", "'u'", "'U'", "'`'", "'import'", "'('", "')'"
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
    public static final int RULE_NEWLINE=6;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_UNICODE_CHAR=5;
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
    public static final int RULE_LETTER=7;
    public static final int RULE_HEX_DIGIT=8;
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


    // $ANTLR start "entryRuleprogram"
    // InternalGo.g:78:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalGo.g:79:1: ( ruleprogram EOF )
            // InternalGo.g:80:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalGo.g:87:1: ruleprogram : ( ruleImport_decl ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:91:2: ( ( ruleImport_decl ) )
            // InternalGo.g:92:2: ( ruleImport_decl )
            {
            // InternalGo.g:92:2: ( ruleImport_decl )
            // InternalGo.g:93:3: ruleImport_decl
            {
             before(grammarAccess.getProgramAccess().getImport_declParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleImport_decl();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getImport_declParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleIdentifier_Unicode_Value"
    // InternalGo.g:103:1: entryRuleIdentifier_Unicode_Value : ruleIdentifier_Unicode_Value EOF ;
    public final void entryRuleIdentifier_Unicode_Value() throws RecognitionException {
        try {
            // InternalGo.g:104:1: ( ruleIdentifier_Unicode_Value EOF )
            // InternalGo.g:105:1: ruleIdentifier_Unicode_Value EOF
            {
             before(grammarAccess.getIdentifier_Unicode_ValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier_Unicode_Value();

            state._fsp--;

             after(grammarAccess.getIdentifier_Unicode_ValueRule()); 
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
    // $ANTLR end "entryRuleIdentifier_Unicode_Value"


    // $ANTLR start "ruleIdentifier_Unicode_Value"
    // InternalGo.g:112:1: ruleIdentifier_Unicode_Value : ( ( rule__Identifier_Unicode_Value__Group__0 ) ) ;
    public final void ruleIdentifier_Unicode_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:116:2: ( ( ( rule__Identifier_Unicode_Value__Group__0 ) ) )
            // InternalGo.g:117:2: ( ( rule__Identifier_Unicode_Value__Group__0 ) )
            {
            // InternalGo.g:117:2: ( ( rule__Identifier_Unicode_Value__Group__0 ) )
            // InternalGo.g:118:3: ( rule__Identifier_Unicode_Value__Group__0 )
            {
             before(grammarAccess.getIdentifier_Unicode_ValueAccess().getGroup()); 
            // InternalGo.g:119:3: ( rule__Identifier_Unicode_Value__Group__0 )
            // InternalGo.g:119:4: rule__Identifier_Unicode_Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_Unicode_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_Unicode_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier_Unicode_Value"


    // $ANTLR start "entryRuleUnicode_value"
    // InternalGo.g:128:1: entryRuleUnicode_value : ruleUnicode_value EOF ;
    public final void entryRuleUnicode_value() throws RecognitionException {
        try {
            // InternalGo.g:129:1: ( ruleUnicode_value EOF )
            // InternalGo.g:130:1: ruleUnicode_value EOF
            {
             before(grammarAccess.getUnicode_valueRule()); 
            pushFollow(FOLLOW_1);
            ruleUnicode_value();

            state._fsp--;

             after(grammarAccess.getUnicode_valueRule()); 
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
    // $ANTLR end "entryRuleUnicode_value"


    // $ANTLR start "ruleUnicode_value"
    // InternalGo.g:137:1: ruleUnicode_value : ( ( rule__Unicode_value__Alternatives ) ) ;
    public final void ruleUnicode_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:141:2: ( ( ( rule__Unicode_value__Alternatives ) ) )
            // InternalGo.g:142:2: ( ( rule__Unicode_value__Alternatives ) )
            {
            // InternalGo.g:142:2: ( ( rule__Unicode_value__Alternatives ) )
            // InternalGo.g:143:3: ( rule__Unicode_value__Alternatives )
            {
             before(grammarAccess.getUnicode_valueAccess().getAlternatives()); 
            // InternalGo.g:144:3: ( rule__Unicode_value__Alternatives )
            // InternalGo.g:144:4: rule__Unicode_value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unicode_value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnicode_valueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnicode_value"


    // $ANTLR start "entryRuleByte_value"
    // InternalGo.g:153:1: entryRuleByte_value : ruleByte_value EOF ;
    public final void entryRuleByte_value() throws RecognitionException {
        try {
            // InternalGo.g:154:1: ( ruleByte_value EOF )
            // InternalGo.g:155:1: ruleByte_value EOF
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
    // InternalGo.g:162:1: ruleByte_value : ( ( rule__Byte_value__Alternatives ) ) ;
    public final void ruleByte_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:166:2: ( ( ( rule__Byte_value__Alternatives ) ) )
            // InternalGo.g:167:2: ( ( rule__Byte_value__Alternatives ) )
            {
            // InternalGo.g:167:2: ( ( rule__Byte_value__Alternatives ) )
            // InternalGo.g:168:3: ( rule__Byte_value__Alternatives )
            {
             before(grammarAccess.getByte_valueAccess().getAlternatives()); 
            // InternalGo.g:169:3: ( rule__Byte_value__Alternatives )
            // InternalGo.g:169:4: rule__Byte_value__Alternatives
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


    // $ANTLR start "entryRuleOctal_byte_value"
    // InternalGo.g:178:1: entryRuleOctal_byte_value : ruleOctal_byte_value EOF ;
    public final void entryRuleOctal_byte_value() throws RecognitionException {
        try {
            // InternalGo.g:179:1: ( ruleOctal_byte_value EOF )
            // InternalGo.g:180:1: ruleOctal_byte_value EOF
            {
             before(grammarAccess.getOctal_byte_valueRule()); 
            pushFollow(FOLLOW_1);
            ruleOctal_byte_value();

            state._fsp--;

             after(grammarAccess.getOctal_byte_valueRule()); 
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
    // $ANTLR end "entryRuleOctal_byte_value"


    // $ANTLR start "ruleOctal_byte_value"
    // InternalGo.g:187:1: ruleOctal_byte_value : ( ( rule__Octal_byte_value__Group__0 ) ) ;
    public final void ruleOctal_byte_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:191:2: ( ( ( rule__Octal_byte_value__Group__0 ) ) )
            // InternalGo.g:192:2: ( ( rule__Octal_byte_value__Group__0 ) )
            {
            // InternalGo.g:192:2: ( ( rule__Octal_byte_value__Group__0 ) )
            // InternalGo.g:193:3: ( rule__Octal_byte_value__Group__0 )
            {
             before(grammarAccess.getOctal_byte_valueAccess().getGroup()); 
            // InternalGo.g:194:3: ( rule__Octal_byte_value__Group__0 )
            // InternalGo.g:194:4: rule__Octal_byte_value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOctal_byte_valueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOctal_byte_value"


    // $ANTLR start "entryRuleHex_byte_value"
    // InternalGo.g:203:1: entryRuleHex_byte_value : ruleHex_byte_value EOF ;
    public final void entryRuleHex_byte_value() throws RecognitionException {
        try {
            // InternalGo.g:204:1: ( ruleHex_byte_value EOF )
            // InternalGo.g:205:1: ruleHex_byte_value EOF
            {
             before(grammarAccess.getHex_byte_valueRule()); 
            pushFollow(FOLLOW_1);
            ruleHex_byte_value();

            state._fsp--;

             after(grammarAccess.getHex_byte_valueRule()); 
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
    // $ANTLR end "entryRuleHex_byte_value"


    // $ANTLR start "ruleHex_byte_value"
    // InternalGo.g:212:1: ruleHex_byte_value : ( ( rule__Hex_byte_value__Group__0 ) ) ;
    public final void ruleHex_byte_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:216:2: ( ( ( rule__Hex_byte_value__Group__0 ) ) )
            // InternalGo.g:217:2: ( ( rule__Hex_byte_value__Group__0 ) )
            {
            // InternalGo.g:217:2: ( ( rule__Hex_byte_value__Group__0 ) )
            // InternalGo.g:218:3: ( rule__Hex_byte_value__Group__0 )
            {
             before(grammarAccess.getHex_byte_valueAccess().getGroup()); 
            // InternalGo.g:219:3: ( rule__Hex_byte_value__Group__0 )
            // InternalGo.g:219:4: rule__Hex_byte_value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hex_byte_value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHex_byte_valueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHex_byte_value"


    // $ANTLR start "entryRuleLittle_u_value"
    // InternalGo.g:228:1: entryRuleLittle_u_value : ruleLittle_u_value EOF ;
    public final void entryRuleLittle_u_value() throws RecognitionException {
        try {
            // InternalGo.g:229:1: ( ruleLittle_u_value EOF )
            // InternalGo.g:230:1: ruleLittle_u_value EOF
            {
             before(grammarAccess.getLittle_u_valueRule()); 
            pushFollow(FOLLOW_1);
            ruleLittle_u_value();

            state._fsp--;

             after(grammarAccess.getLittle_u_valueRule()); 
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
    // $ANTLR end "entryRuleLittle_u_value"


    // $ANTLR start "ruleLittle_u_value"
    // InternalGo.g:237:1: ruleLittle_u_value : ( ( rule__Little_u_value__Group__0 ) ) ;
    public final void ruleLittle_u_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:241:2: ( ( ( rule__Little_u_value__Group__0 ) ) )
            // InternalGo.g:242:2: ( ( rule__Little_u_value__Group__0 ) )
            {
            // InternalGo.g:242:2: ( ( rule__Little_u_value__Group__0 ) )
            // InternalGo.g:243:3: ( rule__Little_u_value__Group__0 )
            {
             before(grammarAccess.getLittle_u_valueAccess().getGroup()); 
            // InternalGo.g:244:3: ( rule__Little_u_value__Group__0 )
            // InternalGo.g:244:4: rule__Little_u_value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Little_u_value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLittle_u_valueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLittle_u_value"


    // $ANTLR start "entryRuleBig_u_value"
    // InternalGo.g:253:1: entryRuleBig_u_value : ruleBig_u_value EOF ;
    public final void entryRuleBig_u_value() throws RecognitionException {
        try {
            // InternalGo.g:254:1: ( ruleBig_u_value EOF )
            // InternalGo.g:255:1: ruleBig_u_value EOF
            {
             before(grammarAccess.getBig_u_valueRule()); 
            pushFollow(FOLLOW_1);
            ruleBig_u_value();

            state._fsp--;

             after(grammarAccess.getBig_u_valueRule()); 
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
    // $ANTLR end "entryRuleBig_u_value"


    // $ANTLR start "ruleBig_u_value"
    // InternalGo.g:262:1: ruleBig_u_value : ( ( rule__Big_u_value__Group__0 ) ) ;
    public final void ruleBig_u_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:266:2: ( ( ( rule__Big_u_value__Group__0 ) ) )
            // InternalGo.g:267:2: ( ( rule__Big_u_value__Group__0 ) )
            {
            // InternalGo.g:267:2: ( ( rule__Big_u_value__Group__0 ) )
            // InternalGo.g:268:3: ( rule__Big_u_value__Group__0 )
            {
             before(grammarAccess.getBig_u_valueAccess().getGroup()); 
            // InternalGo.g:269:3: ( rule__Big_u_value__Group__0 )
            // InternalGo.g:269:4: rule__Big_u_value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Big_u_value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBig_u_valueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBig_u_value"


    // $ANTLR start "entryRuleEscaped_char"
    // InternalGo.g:278:1: entryRuleEscaped_char : ruleEscaped_char EOF ;
    public final void entryRuleEscaped_char() throws RecognitionException {
        try {
            // InternalGo.g:279:1: ( ruleEscaped_char EOF )
            // InternalGo.g:280:1: ruleEscaped_char EOF
            {
             before(grammarAccess.getEscaped_charRule()); 
            pushFollow(FOLLOW_1);
            ruleEscaped_char();

            state._fsp--;

             after(grammarAccess.getEscaped_charRule()); 
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
    // $ANTLR end "entryRuleEscaped_char"


    // $ANTLR start "ruleEscaped_char"
    // InternalGo.g:287:1: ruleEscaped_char : ( ( rule__Escaped_char__Group__0 ) ) ;
    public final void ruleEscaped_char() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:291:2: ( ( ( rule__Escaped_char__Group__0 ) ) )
            // InternalGo.g:292:2: ( ( rule__Escaped_char__Group__0 ) )
            {
            // InternalGo.g:292:2: ( ( rule__Escaped_char__Group__0 ) )
            // InternalGo.g:293:3: ( rule__Escaped_char__Group__0 )
            {
             before(grammarAccess.getEscaped_charAccess().getGroup()); 
            // InternalGo.g:294:3: ( rule__Escaped_char__Group__0 )
            // InternalGo.g:294:4: rule__Escaped_char__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Escaped_char__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscaped_charAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscaped_char"


    // $ANTLR start "entryRuleString_lit"
    // InternalGo.g:303:1: entryRuleString_lit : ruleString_lit EOF ;
    public final void entryRuleString_lit() throws RecognitionException {
        try {
            // InternalGo.g:304:1: ( ruleString_lit EOF )
            // InternalGo.g:305:1: ruleString_lit EOF
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
    // InternalGo.g:312:1: ruleString_lit : ( ( rule__String_lit__Alternatives ) ) ;
    public final void ruleString_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:316:2: ( ( ( rule__String_lit__Alternatives ) ) )
            // InternalGo.g:317:2: ( ( rule__String_lit__Alternatives ) )
            {
            // InternalGo.g:317:2: ( ( rule__String_lit__Alternatives ) )
            // InternalGo.g:318:3: ( rule__String_lit__Alternatives )
            {
             before(grammarAccess.getString_litAccess().getAlternatives()); 
            // InternalGo.g:319:3: ( rule__String_lit__Alternatives )
            // InternalGo.g:319:4: rule__String_lit__Alternatives
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


    // $ANTLR start "entryRuleRaw_string_lit"
    // InternalGo.g:328:1: entryRuleRaw_string_lit : ruleRaw_string_lit EOF ;
    public final void entryRuleRaw_string_lit() throws RecognitionException {
        try {
            // InternalGo.g:329:1: ( ruleRaw_string_lit EOF )
            // InternalGo.g:330:1: ruleRaw_string_lit EOF
            {
             before(grammarAccess.getRaw_string_litRule()); 
            pushFollow(FOLLOW_1);
            ruleRaw_string_lit();

            state._fsp--;

             after(grammarAccess.getRaw_string_litRule()); 
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
    // $ANTLR end "entryRuleRaw_string_lit"


    // $ANTLR start "ruleRaw_string_lit"
    // InternalGo.g:337:1: ruleRaw_string_lit : ( ( rule__Raw_string_lit__Group__0 ) ) ;
    public final void ruleRaw_string_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:341:2: ( ( ( rule__Raw_string_lit__Group__0 ) ) )
            // InternalGo.g:342:2: ( ( rule__Raw_string_lit__Group__0 ) )
            {
            // InternalGo.g:342:2: ( ( rule__Raw_string_lit__Group__0 ) )
            // InternalGo.g:343:3: ( rule__Raw_string_lit__Group__0 )
            {
             before(grammarAccess.getRaw_string_litAccess().getGroup()); 
            // InternalGo.g:344:3: ( rule__Raw_string_lit__Group__0 )
            // InternalGo.g:344:4: rule__Raw_string_lit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Raw_string_lit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaw_string_litAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRaw_string_lit"


    // $ANTLR start "entryRuleInterpreted_string_lit"
    // InternalGo.g:353:1: entryRuleInterpreted_string_lit : ruleInterpreted_string_lit EOF ;
    public final void entryRuleInterpreted_string_lit() throws RecognitionException {
        try {
            // InternalGo.g:354:1: ( ruleInterpreted_string_lit EOF )
            // InternalGo.g:355:1: ruleInterpreted_string_lit EOF
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
    // InternalGo.g:362:1: ruleInterpreted_string_lit : ( ( rule__Interpreted_string_lit__Group__0 ) ) ;
    public final void ruleInterpreted_string_lit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:366:2: ( ( ( rule__Interpreted_string_lit__Group__0 ) ) )
            // InternalGo.g:367:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            {
            // InternalGo.g:367:2: ( ( rule__Interpreted_string_lit__Group__0 ) )
            // InternalGo.g:368:3: ( rule__Interpreted_string_lit__Group__0 )
            {
             before(grammarAccess.getInterpreted_string_litAccess().getGroup()); 
            // InternalGo.g:369:3: ( rule__Interpreted_string_lit__Group__0 )
            // InternalGo.g:369:4: rule__Interpreted_string_lit__Group__0
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


    // $ANTLR start "entryRuleImport_decl"
    // InternalGo.g:378:1: entryRuleImport_decl : ruleImport_decl EOF ;
    public final void entryRuleImport_decl() throws RecognitionException {
        try {
            // InternalGo.g:379:1: ( ruleImport_decl EOF )
            // InternalGo.g:380:1: ruleImport_decl EOF
            {
             before(grammarAccess.getImport_declRule()); 
            pushFollow(FOLLOW_1);
            ruleImport_decl();

            state._fsp--;

             after(grammarAccess.getImport_declRule()); 
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
    // $ANTLR end "entryRuleImport_decl"


    // $ANTLR start "ruleImport_decl"
    // InternalGo.g:387:1: ruleImport_decl : ( ( rule__Import_decl__Group__0 ) ) ;
    public final void ruleImport_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:391:2: ( ( ( rule__Import_decl__Group__0 ) ) )
            // InternalGo.g:392:2: ( ( rule__Import_decl__Group__0 ) )
            {
            // InternalGo.g:392:2: ( ( rule__Import_decl__Group__0 ) )
            // InternalGo.g:393:3: ( rule__Import_decl__Group__0 )
            {
             before(grammarAccess.getImport_declAccess().getGroup()); 
            // InternalGo.g:394:3: ( rule__Import_decl__Group__0 )
            // InternalGo.g:394:4: rule__Import_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImport_declAccess().getGroup()); 

            }


            }

        }
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
    // InternalGo.g:403:1: entryRuleImport_spec : ruleImport_spec EOF ;
    public final void entryRuleImport_spec() throws RecognitionException {
        try {
            // InternalGo.g:404:1: ( ruleImport_spec EOF )
            // InternalGo.g:405:1: ruleImport_spec EOF
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
    // InternalGo.g:412:1: ruleImport_spec : ( ( rule__Import_spec__Group__0 ) ) ;
    public final void ruleImport_spec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:416:2: ( ( ( rule__Import_spec__Group__0 ) ) )
            // InternalGo.g:417:2: ( ( rule__Import_spec__Group__0 ) )
            {
            // InternalGo.g:417:2: ( ( rule__Import_spec__Group__0 ) )
            // InternalGo.g:418:3: ( rule__Import_spec__Group__0 )
            {
             before(grammarAccess.getImport_specAccess().getGroup()); 
            // InternalGo.g:419:3: ( rule__Import_spec__Group__0 )
            // InternalGo.g:419:4: rule__Import_spec__Group__0
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


    // $ANTLR start "rule__Identifier_Unicode_Value__Alternatives_1"
    // InternalGo.g:427:1: rule__Identifier_Unicode_Value__Alternatives_1 : ( ( RULE_IDENTIFIER ) | ( ruleUnicode_value ) );
    public final void rule__Identifier_Unicode_Value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:431:1: ( ( RULE_IDENTIFIER ) | ( ruleUnicode_value ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_IDENTIFIER) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGo.g:432:2: ( RULE_IDENTIFIER )
                    {
                    // InternalGo.g:432:2: ( RULE_IDENTIFIER )
                    // InternalGo.g:433:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getIdentifier_Unicode_ValueAccess().getIDENTIFIERTerminalRuleCall_1_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getIdentifier_Unicode_ValueAccess().getIDENTIFIERTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:438:2: ( ruleUnicode_value )
                    {
                    // InternalGo.g:438:2: ( ruleUnicode_value )
                    // InternalGo.g:439:3: ruleUnicode_value
                    {
                     before(grammarAccess.getIdentifier_Unicode_ValueAccess().getUnicode_valueParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnicode_value();

                    state._fsp--;

                     after(grammarAccess.getIdentifier_Unicode_ValueAccess().getUnicode_valueParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Identifier_Unicode_Value__Alternatives_1"


    // $ANTLR start "rule__Unicode_value__Alternatives"
    // InternalGo.g:448:1: rule__Unicode_value__Alternatives : ( ( ruleLittle_u_value ) | ( ruleBig_u_value ) | ( ruleEscaped_char ) );
    public final void rule__Unicode_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:452:1: ( ( ruleLittle_u_value ) | ( ruleBig_u_value ) | ( ruleEscaped_char ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt2=1;
                    }
                    break;
                case 39:
                    {
                    alt2=2;
                    }
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    {
                    alt2=3;
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
                    // InternalGo.g:453:2: ( ruleLittle_u_value )
                    {
                    // InternalGo.g:453:2: ( ruleLittle_u_value )
                    // InternalGo.g:454:3: ruleLittle_u_value
                    {
                     before(grammarAccess.getUnicode_valueAccess().getLittle_u_valueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLittle_u_value();

                    state._fsp--;

                     after(grammarAccess.getUnicode_valueAccess().getLittle_u_valueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:459:2: ( ruleBig_u_value )
                    {
                    // InternalGo.g:459:2: ( ruleBig_u_value )
                    // InternalGo.g:460:3: ruleBig_u_value
                    {
                     before(grammarAccess.getUnicode_valueAccess().getBig_u_valueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBig_u_value();

                    state._fsp--;

                     after(grammarAccess.getUnicode_valueAccess().getBig_u_valueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:465:2: ( ruleEscaped_char )
                    {
                    // InternalGo.g:465:2: ( ruleEscaped_char )
                    // InternalGo.g:466:3: ruleEscaped_char
                    {
                     before(grammarAccess.getUnicode_valueAccess().getEscaped_charParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEscaped_char();

                    state._fsp--;

                     after(grammarAccess.getUnicode_valueAccess().getEscaped_charParserRuleCall_2()); 

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
    // $ANTLR end "rule__Unicode_value__Alternatives"


    // $ANTLR start "rule__Byte_value__Alternatives"
    // InternalGo.g:475:1: rule__Byte_value__Alternatives : ( ( ruleOctal_byte_value ) | ( ruleHex_byte_value ) );
    public final void rule__Byte_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:479:1: ( ( ruleOctal_byte_value ) | ( ruleHex_byte_value ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=18 && LA3_1<=25)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==37) ) {
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
                    // InternalGo.g:480:2: ( ruleOctal_byte_value )
                    {
                    // InternalGo.g:480:2: ( ruleOctal_byte_value )
                    // InternalGo.g:481:3: ruleOctal_byte_value
                    {
                     before(grammarAccess.getByte_valueAccess().getOctal_byte_valueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOctal_byte_value();

                    state._fsp--;

                     after(grammarAccess.getByte_valueAccess().getOctal_byte_valueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:486:2: ( ruleHex_byte_value )
                    {
                    // InternalGo.g:486:2: ( ruleHex_byte_value )
                    // InternalGo.g:487:3: ruleHex_byte_value
                    {
                     before(grammarAccess.getByte_valueAccess().getHex_byte_valueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHex_byte_value();

                    state._fsp--;

                     after(grammarAccess.getByte_valueAccess().getHex_byte_valueParserRuleCall_1()); 

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


    // $ANTLR start "rule__Octal_byte_value__Alternatives_1"
    // InternalGo.g:496:1: rule__Octal_byte_value__Alternatives_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) );
    public final void rule__Octal_byte_value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:500:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            case 25:
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
                    // InternalGo.g:501:2: ( '0' )
                    {
                    // InternalGo.g:501:2: ( '0' )
                    // InternalGo.g:502:3: '0'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:507:2: ( '1' )
                    {
                    // InternalGo.g:507:2: ( '1' )
                    // InternalGo.g:508:3: '1'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:513:2: ( '2' )
                    {
                    // InternalGo.g:513:2: ( '2' )
                    // InternalGo.g:514:3: '2'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_1_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:519:2: ( '3' )
                    {
                    // InternalGo.g:519:2: ( '3' )
                    // InternalGo.g:520:3: '3'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_1_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:525:2: ( '4' )
                    {
                    // InternalGo.g:525:2: ( '4' )
                    // InternalGo.g:526:3: '4'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_1_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:531:2: ( '5' )
                    {
                    // InternalGo.g:531:2: ( '5' )
                    // InternalGo.g:532:3: '5'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_1_5()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:537:2: ( '6' )
                    {
                    // InternalGo.g:537:2: ( '6' )
                    // InternalGo.g:538:3: '6'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_1_6()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:543:2: ( '7' )
                    {
                    // InternalGo.g:543:2: ( '7' )
                    // InternalGo.g:544:3: '7'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_1_7()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_1_7()); 

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
    // $ANTLR end "rule__Octal_byte_value__Alternatives_1"


    // $ANTLR start "rule__Octal_byte_value__Alternatives_2"
    // InternalGo.g:553:1: rule__Octal_byte_value__Alternatives_2 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) );
    public final void rule__Octal_byte_value__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:557:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 24:
                {
                alt5=7;
                }
                break;
            case 25:
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
                    // InternalGo.g:558:2: ( '0' )
                    {
                    // InternalGo.g:558:2: ( '0' )
                    // InternalGo.g:559:3: '0'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:564:2: ( '1' )
                    {
                    // InternalGo.g:564:2: ( '1' )
                    // InternalGo.g:565:3: '1'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_2_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:570:2: ( '2' )
                    {
                    // InternalGo.g:570:2: ( '2' )
                    // InternalGo.g:571:3: '2'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_2_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:576:2: ( '3' )
                    {
                    // InternalGo.g:576:2: ( '3' )
                    // InternalGo.g:577:3: '3'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_2_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:582:2: ( '4' )
                    {
                    // InternalGo.g:582:2: ( '4' )
                    // InternalGo.g:583:3: '4'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_2_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:588:2: ( '5' )
                    {
                    // InternalGo.g:588:2: ( '5' )
                    // InternalGo.g:589:3: '5'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_2_5()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_2_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:594:2: ( '6' )
                    {
                    // InternalGo.g:594:2: ( '6' )
                    // InternalGo.g:595:3: '6'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_2_6()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_2_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:600:2: ( '7' )
                    {
                    // InternalGo.g:600:2: ( '7' )
                    // InternalGo.g:601:3: '7'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_2_7()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_2_7()); 

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
    // $ANTLR end "rule__Octal_byte_value__Alternatives_2"


    // $ANTLR start "rule__Octal_byte_value__Alternatives_3"
    // InternalGo.g:610:1: rule__Octal_byte_value__Alternatives_3 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) );
    public final void rule__Octal_byte_value__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:614:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            case 25:
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
                    // InternalGo.g:615:2: ( '0' )
                    {
                    // InternalGo.g:615:2: ( '0' )
                    // InternalGo.g:616:3: '0'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_3_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitZeroKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:621:2: ( '1' )
                    {
                    // InternalGo.g:621:2: ( '1' )
                    // InternalGo.g:622:3: '1'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_3_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitOneKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:627:2: ( '2' )
                    {
                    // InternalGo.g:627:2: ( '2' )
                    // InternalGo.g:628:3: '2'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_3_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitTwoKeyword_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:633:2: ( '3' )
                    {
                    // InternalGo.g:633:2: ( '3' )
                    // InternalGo.g:634:3: '3'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_3_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitThreeKeyword_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:639:2: ( '4' )
                    {
                    // InternalGo.g:639:2: ( '4' )
                    // InternalGo.g:640:3: '4'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_3_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitFourKeyword_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:645:2: ( '5' )
                    {
                    // InternalGo.g:645:2: ( '5' )
                    // InternalGo.g:646:3: '5'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_3_5()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitFiveKeyword_3_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:651:2: ( '6' )
                    {
                    // InternalGo.g:651:2: ( '6' )
                    // InternalGo.g:652:3: '6'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_3_6()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitSixKeyword_3_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:657:2: ( '7' )
                    {
                    // InternalGo.g:657:2: ( '7' )
                    // InternalGo.g:658:3: '7'
                    {
                     before(grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_3_7()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOctal_byte_valueAccess().getDigitSevenKeyword_3_7()); 

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
    // $ANTLR end "rule__Octal_byte_value__Alternatives_3"


    // $ANTLR start "rule__Escaped_char__Alternatives_1"
    // InternalGo.g:667:1: rule__Escaped_char__Alternatives_1 : ( ( 'a' ) | ( 'b' ) | ( 'f' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( 'v' ) | ( '\\\\' ) | ( '\\'' ) | ( '\"' ) );
    public final void rule__Escaped_char__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:671:1: ( ( 'a' ) | ( 'b' ) | ( 'f' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( 'v' ) | ( '\\\\' ) | ( '\\'' ) | ( '\"' ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            case 31:
                {
                alt7=6;
                }
                break;
            case 32:
                {
                alt7=7;
                }
                break;
            case 33:
                {
                alt7=8;
                }
                break;
            case 34:
                {
                alt7=9;
                }
                break;
            case 35:
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
                    // InternalGo.g:672:2: ( 'a' )
                    {
                    // InternalGo.g:672:2: ( 'a' )
                    // InternalGo.g:673:3: 'a'
                    {
                     before(grammarAccess.getEscaped_charAccess().getAKeyword_1_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getAKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:678:2: ( 'b' )
                    {
                    // InternalGo.g:678:2: ( 'b' )
                    // InternalGo.g:679:3: 'b'
                    {
                     before(grammarAccess.getEscaped_charAccess().getBKeyword_1_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getBKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:684:2: ( 'f' )
                    {
                    // InternalGo.g:684:2: ( 'f' )
                    // InternalGo.g:685:3: 'f'
                    {
                     before(grammarAccess.getEscaped_charAccess().getFKeyword_1_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getFKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:690:2: ( 'n' )
                    {
                    // InternalGo.g:690:2: ( 'n' )
                    // InternalGo.g:691:3: 'n'
                    {
                     before(grammarAccess.getEscaped_charAccess().getNKeyword_1_3()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getNKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:696:2: ( 'r' )
                    {
                    // InternalGo.g:696:2: ( 'r' )
                    // InternalGo.g:697:3: 'r'
                    {
                     before(grammarAccess.getEscaped_charAccess().getRKeyword_1_4()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getRKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:702:2: ( 't' )
                    {
                    // InternalGo.g:702:2: ( 't' )
                    // InternalGo.g:703:3: 't'
                    {
                     before(grammarAccess.getEscaped_charAccess().getTKeyword_1_5()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getTKeyword_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:708:2: ( 'v' )
                    {
                    // InternalGo.g:708:2: ( 'v' )
                    // InternalGo.g:709:3: 'v'
                    {
                     before(grammarAccess.getEscaped_charAccess().getVKeyword_1_6()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getVKeyword_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:714:2: ( '\\\\' )
                    {
                    // InternalGo.g:714:2: ( '\\\\' )
                    // InternalGo.g:715:3: '\\\\'
                    {
                     before(grammarAccess.getEscaped_charAccess().getBackslashKeyword_1_7()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getBackslashKeyword_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:720:2: ( '\\'' )
                    {
                    // InternalGo.g:720:2: ( '\\'' )
                    // InternalGo.g:721:3: '\\''
                    {
                     before(grammarAccess.getEscaped_charAccess().getApostropheKeyword_1_8()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getApostropheKeyword_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:726:2: ( '\"' )
                    {
                    // InternalGo.g:726:2: ( '\"' )
                    // InternalGo.g:727:3: '\"'
                    {
                     before(grammarAccess.getEscaped_charAccess().getQuotationMarkKeyword_1_9()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getEscaped_charAccess().getQuotationMarkKeyword_1_9()); 

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
    // $ANTLR end "rule__Escaped_char__Alternatives_1"


    // $ANTLR start "rule__String_lit__Alternatives"
    // InternalGo.g:736:1: rule__String_lit__Alternatives : ( ( ruleRaw_string_lit ) | ( ruleInterpreted_string_lit ) );
    public final void rule__String_lit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:740:1: ( ( ruleRaw_string_lit ) | ( ruleInterpreted_string_lit ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:741:2: ( ruleRaw_string_lit )
                    {
                    // InternalGo.g:741:2: ( ruleRaw_string_lit )
                    // InternalGo.g:742:3: ruleRaw_string_lit
                    {
                     before(grammarAccess.getString_litAccess().getRaw_string_litParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRaw_string_lit();

                    state._fsp--;

                     after(grammarAccess.getString_litAccess().getRaw_string_litParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:747:2: ( ruleInterpreted_string_lit )
                    {
                    // InternalGo.g:747:2: ( ruleInterpreted_string_lit )
                    // InternalGo.g:748:3: ruleInterpreted_string_lit
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


    // $ANTLR start "rule__Raw_string_lit__Alternatives_1"
    // InternalGo.g:757:1: rule__Raw_string_lit__Alternatives_1 : ( ( RULE_UNICODE_CHAR ) | ( RULE_NEWLINE ) );
    public final void rule__Raw_string_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:761:1: ( ( RULE_UNICODE_CHAR ) | ( RULE_NEWLINE ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_UNICODE_CHAR) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_NEWLINE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:762:2: ( RULE_UNICODE_CHAR )
                    {
                    // InternalGo.g:762:2: ( RULE_UNICODE_CHAR )
                    // InternalGo.g:763:3: RULE_UNICODE_CHAR
                    {
                     before(grammarAccess.getRaw_string_litAccess().getUNICODE_CHARTerminalRuleCall_1_0()); 
                    match(input,RULE_UNICODE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getRaw_string_litAccess().getUNICODE_CHARTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:768:2: ( RULE_NEWLINE )
                    {
                    // InternalGo.g:768:2: ( RULE_NEWLINE )
                    // InternalGo.g:769:3: RULE_NEWLINE
                    {
                     before(grammarAccess.getRaw_string_litAccess().getNEWLINETerminalRuleCall_1_1()); 
                    match(input,RULE_NEWLINE,FOLLOW_2); 
                     after(grammarAccess.getRaw_string_litAccess().getNEWLINETerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Raw_string_lit__Alternatives_1"


    // $ANTLR start "rule__Interpreted_string_lit__Alternatives_1"
    // InternalGo.g:778:1: rule__Interpreted_string_lit__Alternatives_1 : ( ( ruleIdentifier_Unicode_Value ) | ( ruleByte_value ) );
    public final void rule__Interpreted_string_lit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:782:1: ( ( ruleIdentifier_Unicode_Value ) | ( ruleByte_value ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_LETTER) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:783:2: ( ruleIdentifier_Unicode_Value )
                    {
                    // InternalGo.g:783:2: ( ruleIdentifier_Unicode_Value )
                    // InternalGo.g:784:3: ruleIdentifier_Unicode_Value
                    {
                     before(grammarAccess.getInterpreted_string_litAccess().getIdentifier_Unicode_ValueParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier_Unicode_Value();

                    state._fsp--;

                     after(grammarAccess.getInterpreted_string_litAccess().getIdentifier_Unicode_ValueParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:789:2: ( ruleByte_value )
                    {
                    // InternalGo.g:789:2: ( ruleByte_value )
                    // InternalGo.g:790:3: ruleByte_value
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


    // $ANTLR start "rule__Import_decl__Alternatives_1"
    // InternalGo.g:799:1: rule__Import_decl__Alternatives_1 : ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) );
    public final void rule__Import_decl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:803:1: ( ( ruleImport_spec ) | ( ( rule__Import_decl__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_LETTER||(LA11_0>=35 && LA11_0<=36)||LA11_0==40) ) {
                alt11=1;
            }
            else if ( (LA11_0==42) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:804:2: ( ruleImport_spec )
                    {
                    // InternalGo.g:804:2: ( ruleImport_spec )
                    // InternalGo.g:805:3: ruleImport_spec
                    {
                     before(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImport_spec();

                    state._fsp--;

                     after(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:810:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    {
                    // InternalGo.g:810:2: ( ( rule__Import_decl__Group_1_1__0 ) )
                    // InternalGo.g:811:3: ( rule__Import_decl__Group_1_1__0 )
                    {
                     before(grammarAccess.getImport_declAccess().getGroup_1_1()); 
                    // InternalGo.g:812:3: ( rule__Import_decl__Group_1_1__0 )
                    // InternalGo.g:812:4: rule__Import_decl__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import_decl__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImport_declAccess().getGroup_1_1()); 

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
    // InternalGo.g:820:1: rule__Import_spec__Alternatives_0 : ( ( '.' ) | ( ruleIdentifier_Unicode_Value ) );
    public final void rule__Import_spec__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:824:1: ( ( '.' ) | ( ruleIdentifier_Unicode_Value ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_LETTER) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:825:2: ( '.' )
                    {
                    // InternalGo.g:825:2: ( '.' )
                    // InternalGo.g:826:3: '.'
                    {
                     before(grammarAccess.getImport_specAccess().getFullStopKeyword_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getImport_specAccess().getFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:831:2: ( ruleIdentifier_Unicode_Value )
                    {
                    // InternalGo.g:831:2: ( ruleIdentifier_Unicode_Value )
                    // InternalGo.g:832:3: ruleIdentifier_Unicode_Value
                    {
                     before(grammarAccess.getImport_specAccess().getIdentifier_Unicode_ValueParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier_Unicode_Value();

                    state._fsp--;

                     after(grammarAccess.getImport_specAccess().getIdentifier_Unicode_ValueParserRuleCall_0_1()); 

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


    // $ANTLR start "rule__Identifier_Unicode_Value__Group__0"
    // InternalGo.g:841:1: rule__Identifier_Unicode_Value__Group__0 : rule__Identifier_Unicode_Value__Group__0__Impl rule__Identifier_Unicode_Value__Group__1 ;
    public final void rule__Identifier_Unicode_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:845:1: ( rule__Identifier_Unicode_Value__Group__0__Impl rule__Identifier_Unicode_Value__Group__1 )
            // InternalGo.g:846:2: rule__Identifier_Unicode_Value__Group__0__Impl rule__Identifier_Unicode_Value__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Identifier_Unicode_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_Unicode_Value__Group__1();

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
    // $ANTLR end "rule__Identifier_Unicode_Value__Group__0"


    // $ANTLR start "rule__Identifier_Unicode_Value__Group__0__Impl"
    // InternalGo.g:853:1: rule__Identifier_Unicode_Value__Group__0__Impl : ( RULE_LETTER ) ;
    public final void rule__Identifier_Unicode_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:857:1: ( ( RULE_LETTER ) )
            // InternalGo.g:858:1: ( RULE_LETTER )
            {
            // InternalGo.g:858:1: ( RULE_LETTER )
            // InternalGo.g:859:2: RULE_LETTER
            {
             before(grammarAccess.getIdentifier_Unicode_ValueAccess().getLETTERTerminalRuleCall_0()); 
            match(input,RULE_LETTER,FOLLOW_2); 
             after(grammarAccess.getIdentifier_Unicode_ValueAccess().getLETTERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_Unicode_Value__Group__0__Impl"


    // $ANTLR start "rule__Identifier_Unicode_Value__Group__1"
    // InternalGo.g:868:1: rule__Identifier_Unicode_Value__Group__1 : rule__Identifier_Unicode_Value__Group__1__Impl ;
    public final void rule__Identifier_Unicode_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:872:1: ( rule__Identifier_Unicode_Value__Group__1__Impl )
            // InternalGo.g:873:2: rule__Identifier_Unicode_Value__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_Unicode_Value__Group__1__Impl();

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
    // $ANTLR end "rule__Identifier_Unicode_Value__Group__1"


    // $ANTLR start "rule__Identifier_Unicode_Value__Group__1__Impl"
    // InternalGo.g:879:1: rule__Identifier_Unicode_Value__Group__1__Impl : ( ( rule__Identifier_Unicode_Value__Alternatives_1 ) ) ;
    public final void rule__Identifier_Unicode_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:883:1: ( ( ( rule__Identifier_Unicode_Value__Alternatives_1 ) ) )
            // InternalGo.g:884:1: ( ( rule__Identifier_Unicode_Value__Alternatives_1 ) )
            {
            // InternalGo.g:884:1: ( ( rule__Identifier_Unicode_Value__Alternatives_1 ) )
            // InternalGo.g:885:2: ( rule__Identifier_Unicode_Value__Alternatives_1 )
            {
             before(grammarAccess.getIdentifier_Unicode_ValueAccess().getAlternatives_1()); 
            // InternalGo.g:886:2: ( rule__Identifier_Unicode_Value__Alternatives_1 )
            // InternalGo.g:886:3: rule__Identifier_Unicode_Value__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_Unicode_Value__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_Unicode_ValueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_Unicode_Value__Group__1__Impl"


    // $ANTLR start "rule__Octal_byte_value__Group__0"
    // InternalGo.g:895:1: rule__Octal_byte_value__Group__0 : rule__Octal_byte_value__Group__0__Impl rule__Octal_byte_value__Group__1 ;
    public final void rule__Octal_byte_value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:899:1: ( rule__Octal_byte_value__Group__0__Impl rule__Octal_byte_value__Group__1 )
            // InternalGo.g:900:2: rule__Octal_byte_value__Group__0__Impl rule__Octal_byte_value__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Octal_byte_value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Group__1();

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
    // $ANTLR end "rule__Octal_byte_value__Group__0"


    // $ANTLR start "rule__Octal_byte_value__Group__0__Impl"
    // InternalGo.g:907:1: rule__Octal_byte_value__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__Octal_byte_value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:911:1: ( ( '\\\\' ) )
            // InternalGo.g:912:1: ( '\\\\' )
            {
            // InternalGo.g:912:1: ( '\\\\' )
            // InternalGo.g:913:2: '\\\\'
            {
             before(grammarAccess.getOctal_byte_valueAccess().getBackslashKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOctal_byte_valueAccess().getBackslashKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octal_byte_value__Group__0__Impl"


    // $ANTLR start "rule__Octal_byte_value__Group__1"
    // InternalGo.g:922:1: rule__Octal_byte_value__Group__1 : rule__Octal_byte_value__Group__1__Impl rule__Octal_byte_value__Group__2 ;
    public final void rule__Octal_byte_value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:926:1: ( rule__Octal_byte_value__Group__1__Impl rule__Octal_byte_value__Group__2 )
            // InternalGo.g:927:2: rule__Octal_byte_value__Group__1__Impl rule__Octal_byte_value__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Octal_byte_value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Group__2();

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
    // $ANTLR end "rule__Octal_byte_value__Group__1"


    // $ANTLR start "rule__Octal_byte_value__Group__1__Impl"
    // InternalGo.g:934:1: rule__Octal_byte_value__Group__1__Impl : ( ( rule__Octal_byte_value__Alternatives_1 ) ) ;
    public final void rule__Octal_byte_value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:938:1: ( ( ( rule__Octal_byte_value__Alternatives_1 ) ) )
            // InternalGo.g:939:1: ( ( rule__Octal_byte_value__Alternatives_1 ) )
            {
            // InternalGo.g:939:1: ( ( rule__Octal_byte_value__Alternatives_1 ) )
            // InternalGo.g:940:2: ( rule__Octal_byte_value__Alternatives_1 )
            {
             before(grammarAccess.getOctal_byte_valueAccess().getAlternatives_1()); 
            // InternalGo.g:941:2: ( rule__Octal_byte_value__Alternatives_1 )
            // InternalGo.g:941:3: rule__Octal_byte_value__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getOctal_byte_valueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octal_byte_value__Group__1__Impl"


    // $ANTLR start "rule__Octal_byte_value__Group__2"
    // InternalGo.g:949:1: rule__Octal_byte_value__Group__2 : rule__Octal_byte_value__Group__2__Impl rule__Octal_byte_value__Group__3 ;
    public final void rule__Octal_byte_value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:953:1: ( rule__Octal_byte_value__Group__2__Impl rule__Octal_byte_value__Group__3 )
            // InternalGo.g:954:2: rule__Octal_byte_value__Group__2__Impl rule__Octal_byte_value__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Octal_byte_value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Group__3();

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
    // $ANTLR end "rule__Octal_byte_value__Group__2"


    // $ANTLR start "rule__Octal_byte_value__Group__2__Impl"
    // InternalGo.g:961:1: rule__Octal_byte_value__Group__2__Impl : ( ( rule__Octal_byte_value__Alternatives_2 ) ) ;
    public final void rule__Octal_byte_value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:965:1: ( ( ( rule__Octal_byte_value__Alternatives_2 ) ) )
            // InternalGo.g:966:1: ( ( rule__Octal_byte_value__Alternatives_2 ) )
            {
            // InternalGo.g:966:1: ( ( rule__Octal_byte_value__Alternatives_2 ) )
            // InternalGo.g:967:2: ( rule__Octal_byte_value__Alternatives_2 )
            {
             before(grammarAccess.getOctal_byte_valueAccess().getAlternatives_2()); 
            // InternalGo.g:968:2: ( rule__Octal_byte_value__Alternatives_2 )
            // InternalGo.g:968:3: rule__Octal_byte_value__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOctal_byte_valueAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octal_byte_value__Group__2__Impl"


    // $ANTLR start "rule__Octal_byte_value__Group__3"
    // InternalGo.g:976:1: rule__Octal_byte_value__Group__3 : rule__Octal_byte_value__Group__3__Impl ;
    public final void rule__Octal_byte_value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:980:1: ( rule__Octal_byte_value__Group__3__Impl )
            // InternalGo.g:981:2: rule__Octal_byte_value__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Group__3__Impl();

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
    // $ANTLR end "rule__Octal_byte_value__Group__3"


    // $ANTLR start "rule__Octal_byte_value__Group__3__Impl"
    // InternalGo.g:987:1: rule__Octal_byte_value__Group__3__Impl : ( ( rule__Octal_byte_value__Alternatives_3 ) ) ;
    public final void rule__Octal_byte_value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:991:1: ( ( ( rule__Octal_byte_value__Alternatives_3 ) ) )
            // InternalGo.g:992:1: ( ( rule__Octal_byte_value__Alternatives_3 ) )
            {
            // InternalGo.g:992:1: ( ( rule__Octal_byte_value__Alternatives_3 ) )
            // InternalGo.g:993:2: ( rule__Octal_byte_value__Alternatives_3 )
            {
             before(grammarAccess.getOctal_byte_valueAccess().getAlternatives_3()); 
            // InternalGo.g:994:2: ( rule__Octal_byte_value__Alternatives_3 )
            // InternalGo.g:994:3: rule__Octal_byte_value__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Octal_byte_value__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getOctal_byte_valueAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octal_byte_value__Group__3__Impl"


    // $ANTLR start "rule__Hex_byte_value__Group__0"
    // InternalGo.g:1003:1: rule__Hex_byte_value__Group__0 : rule__Hex_byte_value__Group__0__Impl rule__Hex_byte_value__Group__1 ;
    public final void rule__Hex_byte_value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1007:1: ( rule__Hex_byte_value__Group__0__Impl rule__Hex_byte_value__Group__1 )
            // InternalGo.g:1008:2: rule__Hex_byte_value__Group__0__Impl rule__Hex_byte_value__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Hex_byte_value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hex_byte_value__Group__1();

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
    // $ANTLR end "rule__Hex_byte_value__Group__0"


    // $ANTLR start "rule__Hex_byte_value__Group__0__Impl"
    // InternalGo.g:1015:1: rule__Hex_byte_value__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__Hex_byte_value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1019:1: ( ( '\\\\' ) )
            // InternalGo.g:1020:1: ( '\\\\' )
            {
            // InternalGo.g:1020:1: ( '\\\\' )
            // InternalGo.g:1021:2: '\\\\'
            {
             before(grammarAccess.getHex_byte_valueAccess().getBackslashKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHex_byte_valueAccess().getBackslashKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex_byte_value__Group__0__Impl"


    // $ANTLR start "rule__Hex_byte_value__Group__1"
    // InternalGo.g:1030:1: rule__Hex_byte_value__Group__1 : rule__Hex_byte_value__Group__1__Impl rule__Hex_byte_value__Group__2 ;
    public final void rule__Hex_byte_value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1034:1: ( rule__Hex_byte_value__Group__1__Impl rule__Hex_byte_value__Group__2 )
            // InternalGo.g:1035:2: rule__Hex_byte_value__Group__1__Impl rule__Hex_byte_value__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Hex_byte_value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hex_byte_value__Group__2();

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
    // $ANTLR end "rule__Hex_byte_value__Group__1"


    // $ANTLR start "rule__Hex_byte_value__Group__1__Impl"
    // InternalGo.g:1042:1: rule__Hex_byte_value__Group__1__Impl : ( 'x' ) ;
    public final void rule__Hex_byte_value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1046:1: ( ( 'x' ) )
            // InternalGo.g:1047:1: ( 'x' )
            {
            // InternalGo.g:1047:1: ( 'x' )
            // InternalGo.g:1048:2: 'x'
            {
             before(grammarAccess.getHex_byte_valueAccess().getXKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHex_byte_valueAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex_byte_value__Group__1__Impl"


    // $ANTLR start "rule__Hex_byte_value__Group__2"
    // InternalGo.g:1057:1: rule__Hex_byte_value__Group__2 : rule__Hex_byte_value__Group__2__Impl rule__Hex_byte_value__Group__3 ;
    public final void rule__Hex_byte_value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1061:1: ( rule__Hex_byte_value__Group__2__Impl rule__Hex_byte_value__Group__3 )
            // InternalGo.g:1062:2: rule__Hex_byte_value__Group__2__Impl rule__Hex_byte_value__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Hex_byte_value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hex_byte_value__Group__3();

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
    // $ANTLR end "rule__Hex_byte_value__Group__2"


    // $ANTLR start "rule__Hex_byte_value__Group__2__Impl"
    // InternalGo.g:1069:1: rule__Hex_byte_value__Group__2__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Hex_byte_value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1073:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1074:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1074:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1075:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_2()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex_byte_value__Group__2__Impl"


    // $ANTLR start "rule__Hex_byte_value__Group__3"
    // InternalGo.g:1084:1: rule__Hex_byte_value__Group__3 : rule__Hex_byte_value__Group__3__Impl ;
    public final void rule__Hex_byte_value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1088:1: ( rule__Hex_byte_value__Group__3__Impl )
            // InternalGo.g:1089:2: rule__Hex_byte_value__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hex_byte_value__Group__3__Impl();

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
    // $ANTLR end "rule__Hex_byte_value__Group__3"


    // $ANTLR start "rule__Hex_byte_value__Group__3__Impl"
    // InternalGo.g:1095:1: rule__Hex_byte_value__Group__3__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Hex_byte_value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1099:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1100:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1100:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1101:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_3()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex_byte_value__Group__3__Impl"


    // $ANTLR start "rule__Little_u_value__Group__0"
    // InternalGo.g:1111:1: rule__Little_u_value__Group__0 : rule__Little_u_value__Group__0__Impl rule__Little_u_value__Group__1 ;
    public final void rule__Little_u_value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1115:1: ( rule__Little_u_value__Group__0__Impl rule__Little_u_value__Group__1 )
            // InternalGo.g:1116:2: rule__Little_u_value__Group__0__Impl rule__Little_u_value__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Little_u_value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Little_u_value__Group__1();

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
    // $ANTLR end "rule__Little_u_value__Group__0"


    // $ANTLR start "rule__Little_u_value__Group__0__Impl"
    // InternalGo.g:1123:1: rule__Little_u_value__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__Little_u_value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1127:1: ( ( '\\\\' ) )
            // InternalGo.g:1128:1: ( '\\\\' )
            {
            // InternalGo.g:1128:1: ( '\\\\' )
            // InternalGo.g:1129:2: '\\\\'
            {
             before(grammarAccess.getLittle_u_valueAccess().getBackslashKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLittle_u_valueAccess().getBackslashKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Little_u_value__Group__0__Impl"


    // $ANTLR start "rule__Little_u_value__Group__1"
    // InternalGo.g:1138:1: rule__Little_u_value__Group__1 : rule__Little_u_value__Group__1__Impl rule__Little_u_value__Group__2 ;
    public final void rule__Little_u_value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1142:1: ( rule__Little_u_value__Group__1__Impl rule__Little_u_value__Group__2 )
            // InternalGo.g:1143:2: rule__Little_u_value__Group__1__Impl rule__Little_u_value__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Little_u_value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Little_u_value__Group__2();

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
    // $ANTLR end "rule__Little_u_value__Group__1"


    // $ANTLR start "rule__Little_u_value__Group__1__Impl"
    // InternalGo.g:1150:1: rule__Little_u_value__Group__1__Impl : ( 'u' ) ;
    public final void rule__Little_u_value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1154:1: ( ( 'u' ) )
            // InternalGo.g:1155:1: ( 'u' )
            {
            // InternalGo.g:1155:1: ( 'u' )
            // InternalGo.g:1156:2: 'u'
            {
             before(grammarAccess.getLittle_u_valueAccess().getUKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLittle_u_valueAccess().getUKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Little_u_value__Group__1__Impl"


    // $ANTLR start "rule__Little_u_value__Group__2"
    // InternalGo.g:1165:1: rule__Little_u_value__Group__2 : rule__Little_u_value__Group__2__Impl rule__Little_u_value__Group__3 ;
    public final void rule__Little_u_value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1169:1: ( rule__Little_u_value__Group__2__Impl rule__Little_u_value__Group__3 )
            // InternalGo.g:1170:2: rule__Little_u_value__Group__2__Impl rule__Little_u_value__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Little_u_value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Little_u_value__Group__3();

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
    // $ANTLR end "rule__Little_u_value__Group__2"


    // $ANTLR start "rule__Little_u_value__Group__2__Impl"
    // InternalGo.g:1177:1: rule__Little_u_value__Group__2__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Little_u_value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1181:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1182:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1182:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1183:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_2()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Little_u_value__Group__2__Impl"


    // $ANTLR start "rule__Little_u_value__Group__3"
    // InternalGo.g:1192:1: rule__Little_u_value__Group__3 : rule__Little_u_value__Group__3__Impl rule__Little_u_value__Group__4 ;
    public final void rule__Little_u_value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1196:1: ( rule__Little_u_value__Group__3__Impl rule__Little_u_value__Group__4 )
            // InternalGo.g:1197:2: rule__Little_u_value__Group__3__Impl rule__Little_u_value__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Little_u_value__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Little_u_value__Group__4();

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
    // $ANTLR end "rule__Little_u_value__Group__3"


    // $ANTLR start "rule__Little_u_value__Group__3__Impl"
    // InternalGo.g:1204:1: rule__Little_u_value__Group__3__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Little_u_value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1208:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1209:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1209:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1210:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_3()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Little_u_value__Group__3__Impl"


    // $ANTLR start "rule__Little_u_value__Group__4"
    // InternalGo.g:1219:1: rule__Little_u_value__Group__4 : rule__Little_u_value__Group__4__Impl rule__Little_u_value__Group__5 ;
    public final void rule__Little_u_value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1223:1: ( rule__Little_u_value__Group__4__Impl rule__Little_u_value__Group__5 )
            // InternalGo.g:1224:2: rule__Little_u_value__Group__4__Impl rule__Little_u_value__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Little_u_value__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Little_u_value__Group__5();

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
    // $ANTLR end "rule__Little_u_value__Group__4"


    // $ANTLR start "rule__Little_u_value__Group__4__Impl"
    // InternalGo.g:1231:1: rule__Little_u_value__Group__4__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Little_u_value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1235:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1236:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1236:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1237:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_4()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Little_u_value__Group__4__Impl"


    // $ANTLR start "rule__Little_u_value__Group__5"
    // InternalGo.g:1246:1: rule__Little_u_value__Group__5 : rule__Little_u_value__Group__5__Impl ;
    public final void rule__Little_u_value__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1250:1: ( rule__Little_u_value__Group__5__Impl )
            // InternalGo.g:1251:2: rule__Little_u_value__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Little_u_value__Group__5__Impl();

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
    // $ANTLR end "rule__Little_u_value__Group__5"


    // $ANTLR start "rule__Little_u_value__Group__5__Impl"
    // InternalGo.g:1257:1: rule__Little_u_value__Group__5__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Little_u_value__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1261:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1262:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1262:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1263:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_5()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Little_u_value__Group__5__Impl"


    // $ANTLR start "rule__Big_u_value__Group__0"
    // InternalGo.g:1273:1: rule__Big_u_value__Group__0 : rule__Big_u_value__Group__0__Impl rule__Big_u_value__Group__1 ;
    public final void rule__Big_u_value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1277:1: ( rule__Big_u_value__Group__0__Impl rule__Big_u_value__Group__1 )
            // InternalGo.g:1278:2: rule__Big_u_value__Group__0__Impl rule__Big_u_value__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Big_u_value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Big_u_value__Group__1();

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
    // $ANTLR end "rule__Big_u_value__Group__0"


    // $ANTLR start "rule__Big_u_value__Group__0__Impl"
    // InternalGo.g:1285:1: rule__Big_u_value__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__Big_u_value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1289:1: ( ( '\\\\' ) )
            // InternalGo.g:1290:1: ( '\\\\' )
            {
            // InternalGo.g:1290:1: ( '\\\\' )
            // InternalGo.g:1291:2: '\\\\'
            {
             before(grammarAccess.getBig_u_valueAccess().getBackslashKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBig_u_valueAccess().getBackslashKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Big_u_value__Group__0__Impl"


    // $ANTLR start "rule__Big_u_value__Group__1"
    // InternalGo.g:1300:1: rule__Big_u_value__Group__1 : rule__Big_u_value__Group__1__Impl rule__Big_u_value__Group__2 ;
    public final void rule__Big_u_value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1304:1: ( rule__Big_u_value__Group__1__Impl rule__Big_u_value__Group__2 )
            // InternalGo.g:1305:2: rule__Big_u_value__Group__1__Impl rule__Big_u_value__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Big_u_value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Big_u_value__Group__2();

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
    // $ANTLR end "rule__Big_u_value__Group__1"


    // $ANTLR start "rule__Big_u_value__Group__1__Impl"
    // InternalGo.g:1312:1: rule__Big_u_value__Group__1__Impl : ( 'U' ) ;
    public final void rule__Big_u_value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1316:1: ( ( 'U' ) )
            // InternalGo.g:1317:1: ( 'U' )
            {
            // InternalGo.g:1317:1: ( 'U' )
            // InternalGo.g:1318:2: 'U'
            {
             before(grammarAccess.getBig_u_valueAccess().getUKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBig_u_valueAccess().getUKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Big_u_value__Group__1__Impl"


    // $ANTLR start "rule__Big_u_value__Group__2"
    // InternalGo.g:1327:1: rule__Big_u_value__Group__2 : rule__Big_u_value__Group__2__Impl rule__Big_u_value__Group__3 ;
    public final void rule__Big_u_value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1331:1: ( rule__Big_u_value__Group__2__Impl rule__Big_u_value__Group__3 )
            // InternalGo.g:1332:2: rule__Big_u_value__Group__2__Impl rule__Big_u_value__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Big_u_value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Big_u_value__Group__3();

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
    // $ANTLR end "rule__Big_u_value__Group__2"


    // $ANTLR start "rule__Big_u_value__Group__2__Impl"
    // InternalGo.g:1339:1: rule__Big_u_value__Group__2__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Big_u_value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1343:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1344:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1344:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1345:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_2()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Big_u_value__Group__2__Impl"


    // $ANTLR start "rule__Big_u_value__Group__3"
    // InternalGo.g:1354:1: rule__Big_u_value__Group__3 : rule__Big_u_value__Group__3__Impl rule__Big_u_value__Group__4 ;
    public final void rule__Big_u_value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1358:1: ( rule__Big_u_value__Group__3__Impl rule__Big_u_value__Group__4 )
            // InternalGo.g:1359:2: rule__Big_u_value__Group__3__Impl rule__Big_u_value__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Big_u_value__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Big_u_value__Group__4();

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
    // $ANTLR end "rule__Big_u_value__Group__3"


    // $ANTLR start "rule__Big_u_value__Group__3__Impl"
    // InternalGo.g:1366:1: rule__Big_u_value__Group__3__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Big_u_value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1370:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1371:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1371:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1372:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_3()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Big_u_value__Group__3__Impl"


    // $ANTLR start "rule__Big_u_value__Group__4"
    // InternalGo.g:1381:1: rule__Big_u_value__Group__4 : rule__Big_u_value__Group__4__Impl rule__Big_u_value__Group__5 ;
    public final void rule__Big_u_value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1385:1: ( rule__Big_u_value__Group__4__Impl rule__Big_u_value__Group__5 )
            // InternalGo.g:1386:2: rule__Big_u_value__Group__4__Impl rule__Big_u_value__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Big_u_value__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Big_u_value__Group__5();

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
    // $ANTLR end "rule__Big_u_value__Group__4"


    // $ANTLR start "rule__Big_u_value__Group__4__Impl"
    // InternalGo.g:1393:1: rule__Big_u_value__Group__4__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Big_u_value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1397:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1398:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1398:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1399:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_4()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Big_u_value__Group__4__Impl"


    // $ANTLR start "rule__Big_u_value__Group__5"
    // InternalGo.g:1408:1: rule__Big_u_value__Group__5 : rule__Big_u_value__Group__5__Impl ;
    public final void rule__Big_u_value__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1412:1: ( rule__Big_u_value__Group__5__Impl )
            // InternalGo.g:1413:2: rule__Big_u_value__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Big_u_value__Group__5__Impl();

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
    // $ANTLR end "rule__Big_u_value__Group__5"


    // $ANTLR start "rule__Big_u_value__Group__5__Impl"
    // InternalGo.g:1419:1: rule__Big_u_value__Group__5__Impl : ( RULE_HEX_DIGIT ) ;
    public final void rule__Big_u_value__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1423:1: ( ( RULE_HEX_DIGIT ) )
            // InternalGo.g:1424:1: ( RULE_HEX_DIGIT )
            {
            // InternalGo.g:1424:1: ( RULE_HEX_DIGIT )
            // InternalGo.g:1425:2: RULE_HEX_DIGIT
            {
             before(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_5()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_2); 
             after(grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Big_u_value__Group__5__Impl"


    // $ANTLR start "rule__Escaped_char__Group__0"
    // InternalGo.g:1435:1: rule__Escaped_char__Group__0 : rule__Escaped_char__Group__0__Impl rule__Escaped_char__Group__1 ;
    public final void rule__Escaped_char__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1439:1: ( rule__Escaped_char__Group__0__Impl rule__Escaped_char__Group__1 )
            // InternalGo.g:1440:2: rule__Escaped_char__Group__0__Impl rule__Escaped_char__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Escaped_char__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escaped_char__Group__1();

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
    // $ANTLR end "rule__Escaped_char__Group__0"


    // $ANTLR start "rule__Escaped_char__Group__0__Impl"
    // InternalGo.g:1447:1: rule__Escaped_char__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__Escaped_char__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1451:1: ( ( '\\\\' ) )
            // InternalGo.g:1452:1: ( '\\\\' )
            {
            // InternalGo.g:1452:1: ( '\\\\' )
            // InternalGo.g:1453:2: '\\\\'
            {
             before(grammarAccess.getEscaped_charAccess().getBackslashKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEscaped_charAccess().getBackslashKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped_char__Group__0__Impl"


    // $ANTLR start "rule__Escaped_char__Group__1"
    // InternalGo.g:1462:1: rule__Escaped_char__Group__1 : rule__Escaped_char__Group__1__Impl ;
    public final void rule__Escaped_char__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1466:1: ( rule__Escaped_char__Group__1__Impl )
            // InternalGo.g:1467:2: rule__Escaped_char__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escaped_char__Group__1__Impl();

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
    // $ANTLR end "rule__Escaped_char__Group__1"


    // $ANTLR start "rule__Escaped_char__Group__1__Impl"
    // InternalGo.g:1473:1: rule__Escaped_char__Group__1__Impl : ( ( rule__Escaped_char__Alternatives_1 ) ) ;
    public final void rule__Escaped_char__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1477:1: ( ( ( rule__Escaped_char__Alternatives_1 ) ) )
            // InternalGo.g:1478:1: ( ( rule__Escaped_char__Alternatives_1 ) )
            {
            // InternalGo.g:1478:1: ( ( rule__Escaped_char__Alternatives_1 ) )
            // InternalGo.g:1479:2: ( rule__Escaped_char__Alternatives_1 )
            {
             before(grammarAccess.getEscaped_charAccess().getAlternatives_1()); 
            // InternalGo.g:1480:2: ( rule__Escaped_char__Alternatives_1 )
            // InternalGo.g:1480:3: rule__Escaped_char__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Escaped_char__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEscaped_charAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped_char__Group__1__Impl"


    // $ANTLR start "rule__Raw_string_lit__Group__0"
    // InternalGo.g:1489:1: rule__Raw_string_lit__Group__0 : rule__Raw_string_lit__Group__0__Impl rule__Raw_string_lit__Group__1 ;
    public final void rule__Raw_string_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1493:1: ( rule__Raw_string_lit__Group__0__Impl rule__Raw_string_lit__Group__1 )
            // InternalGo.g:1494:2: rule__Raw_string_lit__Group__0__Impl rule__Raw_string_lit__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Raw_string_lit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raw_string_lit__Group__1();

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
    // $ANTLR end "rule__Raw_string_lit__Group__0"


    // $ANTLR start "rule__Raw_string_lit__Group__0__Impl"
    // InternalGo.g:1501:1: rule__Raw_string_lit__Group__0__Impl : ( '`' ) ;
    public final void rule__Raw_string_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1505:1: ( ( '`' ) )
            // InternalGo.g:1506:1: ( '`' )
            {
            // InternalGo.g:1506:1: ( '`' )
            // InternalGo.g:1507:2: '`'
            {
             before(grammarAccess.getRaw_string_litAccess().getGraveAccentKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRaw_string_litAccess().getGraveAccentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raw_string_lit__Group__0__Impl"


    // $ANTLR start "rule__Raw_string_lit__Group__1"
    // InternalGo.g:1516:1: rule__Raw_string_lit__Group__1 : rule__Raw_string_lit__Group__1__Impl rule__Raw_string_lit__Group__2 ;
    public final void rule__Raw_string_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1520:1: ( rule__Raw_string_lit__Group__1__Impl rule__Raw_string_lit__Group__2 )
            // InternalGo.g:1521:2: rule__Raw_string_lit__Group__1__Impl rule__Raw_string_lit__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Raw_string_lit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raw_string_lit__Group__2();

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
    // $ANTLR end "rule__Raw_string_lit__Group__1"


    // $ANTLR start "rule__Raw_string_lit__Group__1__Impl"
    // InternalGo.g:1528:1: rule__Raw_string_lit__Group__1__Impl : ( ( rule__Raw_string_lit__Alternatives_1 )* ) ;
    public final void rule__Raw_string_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1532:1: ( ( ( rule__Raw_string_lit__Alternatives_1 )* ) )
            // InternalGo.g:1533:1: ( ( rule__Raw_string_lit__Alternatives_1 )* )
            {
            // InternalGo.g:1533:1: ( ( rule__Raw_string_lit__Alternatives_1 )* )
            // InternalGo.g:1534:2: ( rule__Raw_string_lit__Alternatives_1 )*
            {
             before(grammarAccess.getRaw_string_litAccess().getAlternatives_1()); 
            // InternalGo.g:1535:2: ( rule__Raw_string_lit__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_UNICODE_CHAR && LA13_0<=RULE_NEWLINE)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:1535:3: rule__Raw_string_lit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Raw_string_lit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRaw_string_litAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raw_string_lit__Group__1__Impl"


    // $ANTLR start "rule__Raw_string_lit__Group__2"
    // InternalGo.g:1543:1: rule__Raw_string_lit__Group__2 : rule__Raw_string_lit__Group__2__Impl ;
    public final void rule__Raw_string_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1547:1: ( rule__Raw_string_lit__Group__2__Impl )
            // InternalGo.g:1548:2: rule__Raw_string_lit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Raw_string_lit__Group__2__Impl();

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
    // $ANTLR end "rule__Raw_string_lit__Group__2"


    // $ANTLR start "rule__Raw_string_lit__Group__2__Impl"
    // InternalGo.g:1554:1: rule__Raw_string_lit__Group__2__Impl : ( '`' ) ;
    public final void rule__Raw_string_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1558:1: ( ( '`' ) )
            // InternalGo.g:1559:1: ( '`' )
            {
            // InternalGo.g:1559:1: ( '`' )
            // InternalGo.g:1560:2: '`'
            {
             before(grammarAccess.getRaw_string_litAccess().getGraveAccentKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRaw_string_litAccess().getGraveAccentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raw_string_lit__Group__2__Impl"


    // $ANTLR start "rule__Interpreted_string_lit__Group__0"
    // InternalGo.g:1570:1: rule__Interpreted_string_lit__Group__0 : rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 ;
    public final void rule__Interpreted_string_lit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1574:1: ( rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1 )
            // InternalGo.g:1575:2: rule__Interpreted_string_lit__Group__0__Impl rule__Interpreted_string_lit__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:1582:1: rule__Interpreted_string_lit__Group__0__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1586:1: ( ( '\"' ) )
            // InternalGo.g:1587:1: ( '\"' )
            {
            // InternalGo.g:1587:1: ( '\"' )
            // InternalGo.g:1588:2: '\"'
            {
             before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGo.g:1597:1: rule__Interpreted_string_lit__Group__1 : rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 ;
    public final void rule__Interpreted_string_lit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1601:1: ( rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2 )
            // InternalGo.g:1602:2: rule__Interpreted_string_lit__Group__1__Impl rule__Interpreted_string_lit__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:1609:1: rule__Interpreted_string_lit__Group__1__Impl : ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) ;
    public final void rule__Interpreted_string_lit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1613:1: ( ( ( rule__Interpreted_string_lit__Alternatives_1 )* ) )
            // InternalGo.g:1614:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            {
            // InternalGo.g:1614:1: ( ( rule__Interpreted_string_lit__Alternatives_1 )* )
            // InternalGo.g:1615:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            {
             before(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1()); 
            // InternalGo.g:1616:2: ( rule__Interpreted_string_lit__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_LETTER||LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:1616:3: rule__Interpreted_string_lit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Interpreted_string_lit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGo.g:1624:1: rule__Interpreted_string_lit__Group__2 : rule__Interpreted_string_lit__Group__2__Impl ;
    public final void rule__Interpreted_string_lit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1628:1: ( rule__Interpreted_string_lit__Group__2__Impl )
            // InternalGo.g:1629:2: rule__Interpreted_string_lit__Group__2__Impl
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
    // InternalGo.g:1635:1: rule__Interpreted_string_lit__Group__2__Impl : ( '\"' ) ;
    public final void rule__Interpreted_string_lit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1639:1: ( ( '\"' ) )
            // InternalGo.g:1640:1: ( '\"' )
            {
            // InternalGo.g:1640:1: ( '\"' )
            // InternalGo.g:1641:2: '\"'
            {
             before(grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__Import_decl__Group__0"
    // InternalGo.g:1651:1: rule__Import_decl__Group__0 : rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 ;
    public final void rule__Import_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1655:1: ( rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1 )
            // InternalGo.g:1656:2: rule__Import_decl__Group__0__Impl rule__Import_decl__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Import_decl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import_decl__Group__1();

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
    // $ANTLR end "rule__Import_decl__Group__0"


    // $ANTLR start "rule__Import_decl__Group__0__Impl"
    // InternalGo.g:1663:1: rule__Import_decl__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1667:1: ( ( 'import' ) )
            // InternalGo.g:1668:1: ( 'import' )
            {
            // InternalGo.g:1668:1: ( 'import' )
            // InternalGo.g:1669:2: 'import'
            {
             before(grammarAccess.getImport_declAccess().getImportKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getImport_declAccess().getImportKeyword_0()); 

            }


            }

        }
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
    // InternalGo.g:1678:1: rule__Import_decl__Group__1 : rule__Import_decl__Group__1__Impl ;
    public final void rule__Import_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1682:1: ( rule__Import_decl__Group__1__Impl )
            // InternalGo.g:1683:2: rule__Import_decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group__1__Impl();

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
    // $ANTLR end "rule__Import_decl__Group__1"


    // $ANTLR start "rule__Import_decl__Group__1__Impl"
    // InternalGo.g:1689:1: rule__Import_decl__Group__1__Impl : ( ( rule__Import_decl__Alternatives_1 ) ) ;
    public final void rule__Import_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1693:1: ( ( ( rule__Import_decl__Alternatives_1 ) ) )
            // InternalGo.g:1694:1: ( ( rule__Import_decl__Alternatives_1 ) )
            {
            // InternalGo.g:1694:1: ( ( rule__Import_decl__Alternatives_1 ) )
            // InternalGo.g:1695:2: ( rule__Import_decl__Alternatives_1 )
            {
             before(grammarAccess.getImport_declAccess().getAlternatives_1()); 
            // InternalGo.g:1696:2: ( rule__Import_decl__Alternatives_1 )
            // InternalGo.g:1696:3: rule__Import_decl__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getImport_declAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalGo.g:1705:1: rule__Import_decl__Group_1_1__0 : rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 ;
    public final void rule__Import_decl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1709:1: ( rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1 )
            // InternalGo.g:1710:2: rule__Import_decl__Group_1_1__0__Impl rule__Import_decl__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Import_decl__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1__1();

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
    // $ANTLR end "rule__Import_decl__Group_1_1__0"


    // $ANTLR start "rule__Import_decl__Group_1_1__0__Impl"
    // InternalGo.g:1717:1: rule__Import_decl__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Import_decl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1721:1: ( ( '(' ) )
            // InternalGo.g:1722:1: ( '(' )
            {
            // InternalGo.g:1722:1: ( '(' )
            // InternalGo.g:1723:2: '('
            {
             before(grammarAccess.getImport_declAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getImport_declAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
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
    // InternalGo.g:1732:1: rule__Import_decl__Group_1_1__1 : rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 ;
    public final void rule__Import_decl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1736:1: ( rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2 )
            // InternalGo.g:1737:2: rule__Import_decl__Group_1_1__1__Impl rule__Import_decl__Group_1_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Import_decl__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1__2();

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
    // $ANTLR end "rule__Import_decl__Group_1_1__1"


    // $ANTLR start "rule__Import_decl__Group_1_1__1__Impl"
    // InternalGo.g:1744:1: rule__Import_decl__Group_1_1__1__Impl : ( ( rule__Import_decl__Group_1_1_1__0 )* ) ;
    public final void rule__Import_decl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1748:1: ( ( ( rule__Import_decl__Group_1_1_1__0 )* ) )
            // InternalGo.g:1749:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            {
            // InternalGo.g:1749:1: ( ( rule__Import_decl__Group_1_1_1__0 )* )
            // InternalGo.g:1750:2: ( rule__Import_decl__Group_1_1_1__0 )*
            {
             before(grammarAccess.getImport_declAccess().getGroup_1_1_1()); 
            // InternalGo.g:1751:2: ( rule__Import_decl__Group_1_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_LETTER||(LA15_0>=35 && LA15_0<=36)||LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGo.g:1751:3: rule__Import_decl__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Import_decl__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getImport_declAccess().getGroup_1_1_1()); 

            }


            }

        }
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
    // InternalGo.g:1759:1: rule__Import_decl__Group_1_1__2 : rule__Import_decl__Group_1_1__2__Impl ;
    public final void rule__Import_decl__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1763:1: ( rule__Import_decl__Group_1_1__2__Impl )
            // InternalGo.g:1764:2: rule__Import_decl__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Import_decl__Group_1_1__2"


    // $ANTLR start "rule__Import_decl__Group_1_1__2__Impl"
    // InternalGo.g:1770:1: rule__Import_decl__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Import_decl__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1774:1: ( ( ')' ) )
            // InternalGo.g:1775:1: ( ')' )
            {
            // InternalGo.g:1775:1: ( ')' )
            // InternalGo.g:1776:2: ')'
            {
             before(grammarAccess.getImport_declAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getImport_declAccess().getRightParenthesisKeyword_1_1_2()); 

            }


            }

        }
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
    // InternalGo.g:1786:1: rule__Import_decl__Group_1_1_1__0 : rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 ;
    public final void rule__Import_decl__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1790:1: ( rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1 )
            // InternalGo.g:1791:2: rule__Import_decl__Group_1_1_1__0__Impl rule__Import_decl__Group_1_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Import_decl__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1_1__1();

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
    // $ANTLR end "rule__Import_decl__Group_1_1_1__0"


    // $ANTLR start "rule__Import_decl__Group_1_1_1__0__Impl"
    // InternalGo.g:1798:1: rule__Import_decl__Group_1_1_1__0__Impl : ( ruleImport_spec ) ;
    public final void rule__Import_decl__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1802:1: ( ( ruleImport_spec ) )
            // InternalGo.g:1803:1: ( ruleImport_spec )
            {
            // InternalGo.g:1803:1: ( ruleImport_spec )
            // InternalGo.g:1804:2: ruleImport_spec
            {
             before(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport_spec();

            state._fsp--;

             after(grammarAccess.getImport_declAccess().getImport_specParserRuleCall_1_1_1_0()); 

            }


            }

        }
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
    // InternalGo.g:1813:1: rule__Import_decl__Group_1_1_1__1 : rule__Import_decl__Group_1_1_1__1__Impl ;
    public final void rule__Import_decl__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1817:1: ( rule__Import_decl__Group_1_1_1__1__Impl )
            // InternalGo.g:1818:2: rule__Import_decl__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import_decl__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Import_decl__Group_1_1_1__1"


    // $ANTLR start "rule__Import_decl__Group_1_1_1__1__Impl"
    // InternalGo.g:1824:1: rule__Import_decl__Group_1_1_1__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Import_decl__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1828:1: ( ( RULE_SEMICOLON ) )
            // InternalGo.g:1829:1: ( RULE_SEMICOLON )
            {
            // InternalGo.g:1829:1: ( RULE_SEMICOLON )
            // InternalGo.g:1830:2: RULE_SEMICOLON
            {
             before(grammarAccess.getImport_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getImport_declAccess().getSEMICOLONTerminalRuleCall_1_1_1_1()); 

            }


            }

        }
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
    // InternalGo.g:1840:1: rule__Import_spec__Group__0 : rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 ;
    public final void rule__Import_spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1844:1: ( rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1 )
            // InternalGo.g:1845:2: rule__Import_spec__Group__0__Impl rule__Import_spec__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGo.g:1852:1: rule__Import_spec__Group__0__Impl : ( ( rule__Import_spec__Alternatives_0 )? ) ;
    public final void rule__Import_spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1856:1: ( ( ( rule__Import_spec__Alternatives_0 )? ) )
            // InternalGo.g:1857:1: ( ( rule__Import_spec__Alternatives_0 )? )
            {
            // InternalGo.g:1857:1: ( ( rule__Import_spec__Alternatives_0 )? )
            // InternalGo.g:1858:2: ( rule__Import_spec__Alternatives_0 )?
            {
             before(grammarAccess.getImport_specAccess().getAlternatives_0()); 
            // InternalGo.g:1859:2: ( rule__Import_spec__Alternatives_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LETTER||LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1859:3: rule__Import_spec__Alternatives_0
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
    // InternalGo.g:1867:1: rule__Import_spec__Group__1 : rule__Import_spec__Group__1__Impl ;
    public final void rule__Import_spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1871:1: ( rule__Import_spec__Group__1__Impl )
            // InternalGo.g:1872:2: rule__Import_spec__Group__1__Impl
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
    // InternalGo.g:1878:1: rule__Import_spec__Group__1__Impl : ( ruleString_lit ) ;
    public final void rule__Import_spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1882:1: ( ( ruleString_lit ) )
            // InternalGo.g:1883:1: ( ruleString_lit )
            {
            // InternalGo.g:1883:1: ( ruleString_lit )
            // InternalGo.g:1884:2: ruleString_lit
            {
             before(grammarAccess.getImport_specAccess().getString_litParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleString_lit();

            state._fsp--;

             after(grammarAccess.getImport_specAccess().getString_litParserRuleCall_1()); 

            }


            }

        }
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
    // InternalGo.g:1894:1: rule__Model__GreetingsAssignment : ( ruleprogram ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1898:1: ( ( ruleprogram ) )
            // InternalGo.g:1899:2: ( ruleprogram )
            {
            // InternalGo.g:1899:2: ( ruleprogram )
            // InternalGo.g:1900:3: ruleprogram
            {
             before(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0()); 

            }


            }

        }
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003FC0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000A00000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000051800000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000091800000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000011800000082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000011800000080L});

}