package co.edu.uniandes.ide.contentassist.antlr.internal;

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
import co.edu.uniandes.services.GramaticajmeterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGramaticajmeterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_COMMA", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stimulus'", "'minresponsetime'", "'maxresponsetime'", "'averagetime'", "'errorcount'", "'totalreq'", "'threads'", "'averagelatency'", "'minlatency'", "'maxlatency'", "'percentageerror'", "'throughput'", "'timeStamp'", "'elapsed'", "'label'", "'responseCode'", "'responseMessage'", "'threadName'", "'dataType'", "'success'", "'bytes'", "'grpThreads'", "'allThreads'", "'Latency'", "'architecture='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_COMMA=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGramaticajmeterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGramaticajmeterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGramaticajmeterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGramaticajmeter.g"; }


    	private GramaticajmeterGrammarAccess grammarAccess;

    	public void setGrammarAccess(GramaticajmeterGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJMeter"
    // InternalGramaticajmeter.g:53:1: entryRuleJMeter : ruleJMeter EOF ;
    public final void entryRuleJMeter() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:54:1: ( ruleJMeter EOF )
            // InternalGramaticajmeter.g:55:1: ruleJMeter EOF
            {
             before(grammarAccess.getJMeterRule()); 
            pushFollow(FOLLOW_1);
            ruleJMeter();

            state._fsp--;

             after(grammarAccess.getJMeterRule()); 
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
    // $ANTLR end "entryRuleJMeter"


    // $ANTLR start "ruleJMeter"
    // InternalGramaticajmeter.g:62:1: ruleJMeter : ( ( rule__JMeter__Group__0 ) ) ;
    public final void ruleJMeter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:66:2: ( ( ( rule__JMeter__Group__0 ) ) )
            // InternalGramaticajmeter.g:67:2: ( ( rule__JMeter__Group__0 ) )
            {
            // InternalGramaticajmeter.g:67:2: ( ( rule__JMeter__Group__0 ) )
            // InternalGramaticajmeter.g:68:3: ( rule__JMeter__Group__0 )
            {
             before(grammarAccess.getJMeterAccess().getGroup()); 
            // InternalGramaticajmeter.g:69:3: ( rule__JMeter__Group__0 )
            // InternalGramaticajmeter.g:69:4: rule__JMeter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JMeter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJMeterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJMeter"


    // $ANTLR start "entryRuleArchitectureResults"
    // InternalGramaticajmeter.g:78:1: entryRuleArchitectureResults : ruleArchitectureResults EOF ;
    public final void entryRuleArchitectureResults() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:79:1: ( ruleArchitectureResults EOF )
            // InternalGramaticajmeter.g:80:1: ruleArchitectureResults EOF
            {
             before(grammarAccess.getArchitectureResultsRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitectureResults();

            state._fsp--;

             after(grammarAccess.getArchitectureResultsRule()); 
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
    // $ANTLR end "entryRuleArchitectureResults"


    // $ANTLR start "ruleArchitectureResults"
    // InternalGramaticajmeter.g:87:1: ruleArchitectureResults : ( ( rule__ArchitectureResults__Group__0 ) ) ;
    public final void ruleArchitectureResults() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:91:2: ( ( ( rule__ArchitectureResults__Group__0 ) ) )
            // InternalGramaticajmeter.g:92:2: ( ( rule__ArchitectureResults__Group__0 ) )
            {
            // InternalGramaticajmeter.g:92:2: ( ( rule__ArchitectureResults__Group__0 ) )
            // InternalGramaticajmeter.g:93:3: ( rule__ArchitectureResults__Group__0 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getGroup()); 
            // InternalGramaticajmeter.g:94:3: ( rule__ArchitectureResults__Group__0 )
            // InternalGramaticajmeter.g:94:4: rule__ArchitectureResults__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitectureResults"


    // $ANTLR start "entryRuleHeader"
    // InternalGramaticajmeter.g:103:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:104:1: ( ruleHeader EOF )
            // InternalGramaticajmeter.g:105:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalGramaticajmeter.g:112:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:116:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalGramaticajmeter.g:117:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalGramaticajmeter.g:117:2: ( ( rule__Header__Group__0 ) )
            // InternalGramaticajmeter.g:118:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalGramaticajmeter.g:119:3: ( rule__Header__Group__0 )
            // InternalGramaticajmeter.g:119:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleResults"
    // InternalGramaticajmeter.g:128:1: entryRuleResults : ruleResults EOF ;
    public final void entryRuleResults() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:129:1: ( ruleResults EOF )
            // InternalGramaticajmeter.g:130:1: ruleResults EOF
            {
             before(grammarAccess.getResultsRule()); 
            pushFollow(FOLLOW_1);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getResultsRule()); 
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
    // $ANTLR end "entryRuleResults"


    // $ANTLR start "ruleResults"
    // InternalGramaticajmeter.g:137:1: ruleResults : ( ( rule__Results__Group__0 ) ) ;
    public final void ruleResults() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:141:2: ( ( ( rule__Results__Group__0 ) ) )
            // InternalGramaticajmeter.g:142:2: ( ( rule__Results__Group__0 ) )
            {
            // InternalGramaticajmeter.g:142:2: ( ( rule__Results__Group__0 ) )
            // InternalGramaticajmeter.g:143:3: ( rule__Results__Group__0 )
            {
             before(grammarAccess.getResultsAccess().getGroup()); 
            // InternalGramaticajmeter.g:144:3: ( rule__Results__Group__0 )
            // InternalGramaticajmeter.g:144:4: rule__Results__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Results__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResults"


    // $ANTLR start "entryRuleColumnHeader"
    // InternalGramaticajmeter.g:153:1: entryRuleColumnHeader : ruleColumnHeader EOF ;
    public final void entryRuleColumnHeader() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:154:1: ( ruleColumnHeader EOF )
            // InternalGramaticajmeter.g:155:1: ruleColumnHeader EOF
            {
             before(grammarAccess.getColumnHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnHeader();

            state._fsp--;

             after(grammarAccess.getColumnHeaderRule()); 
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
    // $ANTLR end "entryRuleColumnHeader"


    // $ANTLR start "ruleColumnHeader"
    // InternalGramaticajmeter.g:162:1: ruleColumnHeader : ( ( rule__ColumnHeader__Alternatives ) ) ;
    public final void ruleColumnHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:166:2: ( ( ( rule__ColumnHeader__Alternatives ) ) )
            // InternalGramaticajmeter.g:167:2: ( ( rule__ColumnHeader__Alternatives ) )
            {
            // InternalGramaticajmeter.g:167:2: ( ( rule__ColumnHeader__Alternatives ) )
            // InternalGramaticajmeter.g:168:3: ( rule__ColumnHeader__Alternatives )
            {
             before(grammarAccess.getColumnHeaderAccess().getAlternatives()); 
            // InternalGramaticajmeter.g:169:3: ( rule__ColumnHeader__Alternatives )
            // InternalGramaticajmeter.g:169:4: rule__ColumnHeader__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnHeader__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnHeaderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnHeader"


    // $ANTLR start "entryRuleResult"
    // InternalGramaticajmeter.g:178:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:179:1: ( ruleResult EOF )
            // InternalGramaticajmeter.g:180:1: ruleResult EOF
            {
             before(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultRule()); 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGramaticajmeter.g:187:1: ruleResult : ( ( rule__Result__ValueAssignment ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:191:2: ( ( ( rule__Result__ValueAssignment ) ) )
            // InternalGramaticajmeter.g:192:2: ( ( rule__Result__ValueAssignment ) )
            {
            // InternalGramaticajmeter.g:192:2: ( ( rule__Result__ValueAssignment ) )
            // InternalGramaticajmeter.g:193:3: ( rule__Result__ValueAssignment )
            {
             before(grammarAccess.getResultAccess().getValueAssignment()); 
            // InternalGramaticajmeter.g:194:3: ( rule__Result__ValueAssignment )
            // InternalGramaticajmeter.g:194:4: rule__Result__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Result__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleHeaderJMeter"
    // InternalGramaticajmeter.g:203:1: entryRuleHeaderJMeter : ruleHeaderJMeter EOF ;
    public final void entryRuleHeaderJMeter() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:204:1: ( ruleHeaderJMeter EOF )
            // InternalGramaticajmeter.g:205:1: ruleHeaderJMeter EOF
            {
             before(grammarAccess.getHeaderJMeterRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderJMeter();

            state._fsp--;

             after(grammarAccess.getHeaderJMeterRule()); 
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
    // $ANTLR end "entryRuleHeaderJMeter"


    // $ANTLR start "ruleHeaderJMeter"
    // InternalGramaticajmeter.g:212:1: ruleHeaderJMeter : ( ( rule__HeaderJMeter__Group__0 ) ) ;
    public final void ruleHeaderJMeter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:216:2: ( ( ( rule__HeaderJMeter__Group__0 ) ) )
            // InternalGramaticajmeter.g:217:2: ( ( rule__HeaderJMeter__Group__0 ) )
            {
            // InternalGramaticajmeter.g:217:2: ( ( rule__HeaderJMeter__Group__0 ) )
            // InternalGramaticajmeter.g:218:3: ( rule__HeaderJMeter__Group__0 )
            {
             before(grammarAccess.getHeaderJMeterAccess().getGroup()); 
            // InternalGramaticajmeter.g:219:3: ( rule__HeaderJMeter__Group__0 )
            // InternalGramaticajmeter.g:219:4: rule__HeaderJMeter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderJMeter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderJMeterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeaderJMeter"


    // $ANTLR start "entryRuleColumnHeaderJMeter"
    // InternalGramaticajmeter.g:228:1: entryRuleColumnHeaderJMeter : ruleColumnHeaderJMeter EOF ;
    public final void entryRuleColumnHeaderJMeter() throws RecognitionException {
        try {
            // InternalGramaticajmeter.g:229:1: ( ruleColumnHeaderJMeter EOF )
            // InternalGramaticajmeter.g:230:1: ruleColumnHeaderJMeter EOF
            {
             before(grammarAccess.getColumnHeaderJMeterRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnHeaderJMeter();

            state._fsp--;

             after(grammarAccess.getColumnHeaderJMeterRule()); 
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
    // $ANTLR end "entryRuleColumnHeaderJMeter"


    // $ANTLR start "ruleColumnHeaderJMeter"
    // InternalGramaticajmeter.g:237:1: ruleColumnHeaderJMeter : ( ( rule__ColumnHeaderJMeter__Alternatives ) ) ;
    public final void ruleColumnHeaderJMeter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:241:2: ( ( ( rule__ColumnHeaderJMeter__Alternatives ) ) )
            // InternalGramaticajmeter.g:242:2: ( ( rule__ColumnHeaderJMeter__Alternatives ) )
            {
            // InternalGramaticajmeter.g:242:2: ( ( rule__ColumnHeaderJMeter__Alternatives ) )
            // InternalGramaticajmeter.g:243:3: ( rule__ColumnHeaderJMeter__Alternatives )
            {
             before(grammarAccess.getColumnHeaderJMeterAccess().getAlternatives()); 
            // InternalGramaticajmeter.g:244:3: ( rule__ColumnHeaderJMeter__Alternatives )
            // InternalGramaticajmeter.g:244:4: rule__ColumnHeaderJMeter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnHeaderJMeter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnHeaderJMeterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnHeaderJMeter"


    // $ANTLR start "rule__ColumnHeader__Alternatives"
    // InternalGramaticajmeter.g:252:1: rule__ColumnHeader__Alternatives : ( ( 'stimulus' ) | ( 'minresponsetime' ) | ( 'maxresponsetime' ) | ( 'averagetime' ) | ( 'errorcount' ) | ( 'totalreq' ) | ( 'threads' ) | ( 'averagelatency' ) | ( 'minlatency' ) | ( 'maxlatency' ) | ( 'percentageerror' ) | ( 'throughput' ) );
    public final void rule__ColumnHeader__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:256:1: ( ( 'stimulus' ) | ( 'minresponsetime' ) | ( 'maxresponsetime' ) | ( 'averagetime' ) | ( 'errorcount' ) | ( 'totalreq' ) | ( 'threads' ) | ( 'averagelatency' ) | ( 'minlatency' ) | ( 'maxlatency' ) | ( 'percentageerror' ) | ( 'throughput' ) )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 17:
                {
                alt1=5;
                }
                break;
            case 18:
                {
                alt1=6;
                }
                break;
            case 19:
                {
                alt1=7;
                }
                break;
            case 20:
                {
                alt1=8;
                }
                break;
            case 21:
                {
                alt1=9;
                }
                break;
            case 22:
                {
                alt1=10;
                }
                break;
            case 23:
                {
                alt1=11;
                }
                break;
            case 24:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGramaticajmeter.g:257:2: ( 'stimulus' )
                    {
                    // InternalGramaticajmeter.g:257:2: ( 'stimulus' )
                    // InternalGramaticajmeter.g:258:3: 'stimulus'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getStimulusKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getStimulusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramaticajmeter.g:263:2: ( 'minresponsetime' )
                    {
                    // InternalGramaticajmeter.g:263:2: ( 'minresponsetime' )
                    // InternalGramaticajmeter.g:264:3: 'minresponsetime'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getMinresponsetimeKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getMinresponsetimeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramaticajmeter.g:269:2: ( 'maxresponsetime' )
                    {
                    // InternalGramaticajmeter.g:269:2: ( 'maxresponsetime' )
                    // InternalGramaticajmeter.g:270:3: 'maxresponsetime'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getMaxresponsetimeKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getMaxresponsetimeKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramaticajmeter.g:275:2: ( 'averagetime' )
                    {
                    // InternalGramaticajmeter.g:275:2: ( 'averagetime' )
                    // InternalGramaticajmeter.g:276:3: 'averagetime'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getAveragetimeKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getAveragetimeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramaticajmeter.g:281:2: ( 'errorcount' )
                    {
                    // InternalGramaticajmeter.g:281:2: ( 'errorcount' )
                    // InternalGramaticajmeter.g:282:3: 'errorcount'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getErrorcountKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getErrorcountKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramaticajmeter.g:287:2: ( 'totalreq' )
                    {
                    // InternalGramaticajmeter.g:287:2: ( 'totalreq' )
                    // InternalGramaticajmeter.g:288:3: 'totalreq'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getTotalreqKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getTotalreqKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramaticajmeter.g:293:2: ( 'threads' )
                    {
                    // InternalGramaticajmeter.g:293:2: ( 'threads' )
                    // InternalGramaticajmeter.g:294:3: 'threads'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getThreadsKeyword_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getThreadsKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGramaticajmeter.g:299:2: ( 'averagelatency' )
                    {
                    // InternalGramaticajmeter.g:299:2: ( 'averagelatency' )
                    // InternalGramaticajmeter.g:300:3: 'averagelatency'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getAveragelatencyKeyword_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getAveragelatencyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGramaticajmeter.g:305:2: ( 'minlatency' )
                    {
                    // InternalGramaticajmeter.g:305:2: ( 'minlatency' )
                    // InternalGramaticajmeter.g:306:3: 'minlatency'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getMinlatencyKeyword_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getMinlatencyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGramaticajmeter.g:311:2: ( 'maxlatency' )
                    {
                    // InternalGramaticajmeter.g:311:2: ( 'maxlatency' )
                    // InternalGramaticajmeter.g:312:3: 'maxlatency'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getMaxlatencyKeyword_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getMaxlatencyKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGramaticajmeter.g:317:2: ( 'percentageerror' )
                    {
                    // InternalGramaticajmeter.g:317:2: ( 'percentageerror' )
                    // InternalGramaticajmeter.g:318:3: 'percentageerror'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getPercentageerrorKeyword_10()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getPercentageerrorKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGramaticajmeter.g:323:2: ( 'throughput' )
                    {
                    // InternalGramaticajmeter.g:323:2: ( 'throughput' )
                    // InternalGramaticajmeter.g:324:3: 'throughput'
                    {
                     before(grammarAccess.getColumnHeaderAccess().getThroughputKeyword_11()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderAccess().getThroughputKeyword_11()); 

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
    // $ANTLR end "rule__ColumnHeader__Alternatives"


    // $ANTLR start "rule__ColumnHeaderJMeter__Alternatives"
    // InternalGramaticajmeter.g:333:1: rule__ColumnHeaderJMeter__Alternatives : ( ( 'timeStamp' ) | ( 'elapsed' ) | ( 'label' ) | ( 'responseCode' ) | ( 'responseMessage' ) | ( 'threadName' ) | ( 'dataType' ) | ( 'success' ) | ( 'bytes' ) | ( 'grpThreads' ) | ( 'allThreads' ) | ( 'Latency' ) );
    public final void rule__ColumnHeaderJMeter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:337:1: ( ( 'timeStamp' ) | ( 'elapsed' ) | ( 'label' ) | ( 'responseCode' ) | ( 'responseMessage' ) | ( 'threadName' ) | ( 'dataType' ) | ( 'success' ) | ( 'bytes' ) | ( 'grpThreads' ) | ( 'allThreads' ) | ( 'Latency' ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            case 31:
                {
                alt2=7;
                }
                break;
            case 32:
                {
                alt2=8;
                }
                break;
            case 33:
                {
                alt2=9;
                }
                break;
            case 34:
                {
                alt2=10;
                }
                break;
            case 35:
                {
                alt2=11;
                }
                break;
            case 36:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGramaticajmeter.g:338:2: ( 'timeStamp' )
                    {
                    // InternalGramaticajmeter.g:338:2: ( 'timeStamp' )
                    // InternalGramaticajmeter.g:339:3: 'timeStamp'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getTimeStampKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getTimeStampKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGramaticajmeter.g:344:2: ( 'elapsed' )
                    {
                    // InternalGramaticajmeter.g:344:2: ( 'elapsed' )
                    // InternalGramaticajmeter.g:345:3: 'elapsed'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getElapsedKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getElapsedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGramaticajmeter.g:350:2: ( 'label' )
                    {
                    // InternalGramaticajmeter.g:350:2: ( 'label' )
                    // InternalGramaticajmeter.g:351:3: 'label'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getLabelKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getLabelKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGramaticajmeter.g:356:2: ( 'responseCode' )
                    {
                    // InternalGramaticajmeter.g:356:2: ( 'responseCode' )
                    // InternalGramaticajmeter.g:357:3: 'responseCode'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getResponseCodeKeyword_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getResponseCodeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGramaticajmeter.g:362:2: ( 'responseMessage' )
                    {
                    // InternalGramaticajmeter.g:362:2: ( 'responseMessage' )
                    // InternalGramaticajmeter.g:363:3: 'responseMessage'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getResponseMessageKeyword_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getResponseMessageKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGramaticajmeter.g:368:2: ( 'threadName' )
                    {
                    // InternalGramaticajmeter.g:368:2: ( 'threadName' )
                    // InternalGramaticajmeter.g:369:3: 'threadName'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getThreadNameKeyword_5()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getThreadNameKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGramaticajmeter.g:374:2: ( 'dataType' )
                    {
                    // InternalGramaticajmeter.g:374:2: ( 'dataType' )
                    // InternalGramaticajmeter.g:375:3: 'dataType'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getDataTypeKeyword_6()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getDataTypeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGramaticajmeter.g:380:2: ( 'success' )
                    {
                    // InternalGramaticajmeter.g:380:2: ( 'success' )
                    // InternalGramaticajmeter.g:381:3: 'success'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getSuccessKeyword_7()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getSuccessKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGramaticajmeter.g:386:2: ( 'bytes' )
                    {
                    // InternalGramaticajmeter.g:386:2: ( 'bytes' )
                    // InternalGramaticajmeter.g:387:3: 'bytes'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getBytesKeyword_8()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getBytesKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGramaticajmeter.g:392:2: ( 'grpThreads' )
                    {
                    // InternalGramaticajmeter.g:392:2: ( 'grpThreads' )
                    // InternalGramaticajmeter.g:393:3: 'grpThreads'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getGrpThreadsKeyword_9()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getGrpThreadsKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGramaticajmeter.g:398:2: ( 'allThreads' )
                    {
                    // InternalGramaticajmeter.g:398:2: ( 'allThreads' )
                    // InternalGramaticajmeter.g:399:3: 'allThreads'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getAllThreadsKeyword_10()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getAllThreadsKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGramaticajmeter.g:404:2: ( 'Latency' )
                    {
                    // InternalGramaticajmeter.g:404:2: ( 'Latency' )
                    // InternalGramaticajmeter.g:405:3: 'Latency'
                    {
                     before(grammarAccess.getColumnHeaderJMeterAccess().getLatencyKeyword_11()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getColumnHeaderJMeterAccess().getLatencyKeyword_11()); 

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
    // $ANTLR end "rule__ColumnHeaderJMeter__Alternatives"


    // $ANTLR start "rule__JMeter__Group__0"
    // InternalGramaticajmeter.g:414:1: rule__JMeter__Group__0 : rule__JMeter__Group__0__Impl rule__JMeter__Group__1 ;
    public final void rule__JMeter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:418:1: ( rule__JMeter__Group__0__Impl rule__JMeter__Group__1 )
            // InternalGramaticajmeter.g:419:2: rule__JMeter__Group__0__Impl rule__JMeter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JMeter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JMeter__Group__1();

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
    // $ANTLR end "rule__JMeter__Group__0"


    // $ANTLR start "rule__JMeter__Group__0__Impl"
    // InternalGramaticajmeter.g:426:1: rule__JMeter__Group__0__Impl : ( ( rule__JMeter__ArchitectureResultsAssignment_0 ) ) ;
    public final void rule__JMeter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:430:1: ( ( ( rule__JMeter__ArchitectureResultsAssignment_0 ) ) )
            // InternalGramaticajmeter.g:431:1: ( ( rule__JMeter__ArchitectureResultsAssignment_0 ) )
            {
            // InternalGramaticajmeter.g:431:1: ( ( rule__JMeter__ArchitectureResultsAssignment_0 ) )
            // InternalGramaticajmeter.g:432:2: ( rule__JMeter__ArchitectureResultsAssignment_0 )
            {
             before(grammarAccess.getJMeterAccess().getArchitectureResultsAssignment_0()); 
            // InternalGramaticajmeter.g:433:2: ( rule__JMeter__ArchitectureResultsAssignment_0 )
            // InternalGramaticajmeter.g:433:3: rule__JMeter__ArchitectureResultsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JMeter__ArchitectureResultsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJMeterAccess().getArchitectureResultsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JMeter__Group__0__Impl"


    // $ANTLR start "rule__JMeter__Group__1"
    // InternalGramaticajmeter.g:441:1: rule__JMeter__Group__1 : rule__JMeter__Group__1__Impl rule__JMeter__Group__2 ;
    public final void rule__JMeter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:445:1: ( rule__JMeter__Group__1__Impl rule__JMeter__Group__2 )
            // InternalGramaticajmeter.g:446:2: rule__JMeter__Group__1__Impl rule__JMeter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__JMeter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JMeter__Group__2();

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
    // $ANTLR end "rule__JMeter__Group__1"


    // $ANTLR start "rule__JMeter__Group__1__Impl"
    // InternalGramaticajmeter.g:453:1: rule__JMeter__Group__1__Impl : ( ( rule__JMeter__Group_1__0 )* ) ;
    public final void rule__JMeter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:457:1: ( ( ( rule__JMeter__Group_1__0 )* ) )
            // InternalGramaticajmeter.g:458:1: ( ( rule__JMeter__Group_1__0 )* )
            {
            // InternalGramaticajmeter.g:458:1: ( ( rule__JMeter__Group_1__0 )* )
            // InternalGramaticajmeter.g:459:2: ( rule__JMeter__Group_1__0 )*
            {
             before(grammarAccess.getJMeterAccess().getGroup_1()); 
            // InternalGramaticajmeter.g:460:2: ( rule__JMeter__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NL) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==37) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalGramaticajmeter.g:460:3: rule__JMeter__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__JMeter__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getJMeterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JMeter__Group__1__Impl"


    // $ANTLR start "rule__JMeter__Group__2"
    // InternalGramaticajmeter.g:468:1: rule__JMeter__Group__2 : rule__JMeter__Group__2__Impl ;
    public final void rule__JMeter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:472:1: ( rule__JMeter__Group__2__Impl )
            // InternalGramaticajmeter.g:473:2: rule__JMeter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JMeter__Group__2__Impl();

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
    // $ANTLR end "rule__JMeter__Group__2"


    // $ANTLR start "rule__JMeter__Group__2__Impl"
    // InternalGramaticajmeter.g:479:1: rule__JMeter__Group__2__Impl : ( ( RULE_NL )? ) ;
    public final void rule__JMeter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:483:1: ( ( ( RULE_NL )? ) )
            // InternalGramaticajmeter.g:484:1: ( ( RULE_NL )? )
            {
            // InternalGramaticajmeter.g:484:1: ( ( RULE_NL )? )
            // InternalGramaticajmeter.g:485:2: ( RULE_NL )?
            {
             before(grammarAccess.getJMeterAccess().getNLTerminalRuleCall_2()); 
            // InternalGramaticajmeter.g:486:2: ( RULE_NL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGramaticajmeter.g:486:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJMeterAccess().getNLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JMeter__Group__2__Impl"


    // $ANTLR start "rule__JMeter__Group_1__0"
    // InternalGramaticajmeter.g:495:1: rule__JMeter__Group_1__0 : rule__JMeter__Group_1__0__Impl rule__JMeter__Group_1__1 ;
    public final void rule__JMeter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:499:1: ( rule__JMeter__Group_1__0__Impl rule__JMeter__Group_1__1 )
            // InternalGramaticajmeter.g:500:2: rule__JMeter__Group_1__0__Impl rule__JMeter__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__JMeter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JMeter__Group_1__1();

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
    // $ANTLR end "rule__JMeter__Group_1__0"


    // $ANTLR start "rule__JMeter__Group_1__0__Impl"
    // InternalGramaticajmeter.g:507:1: rule__JMeter__Group_1__0__Impl : ( RULE_NL ) ;
    public final void rule__JMeter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:511:1: ( ( RULE_NL ) )
            // InternalGramaticajmeter.g:512:1: ( RULE_NL )
            {
            // InternalGramaticajmeter.g:512:1: ( RULE_NL )
            // InternalGramaticajmeter.g:513:2: RULE_NL
            {
             before(grammarAccess.getJMeterAccess().getNLTerminalRuleCall_1_0()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getJMeterAccess().getNLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JMeter__Group_1__0__Impl"


    // $ANTLR start "rule__JMeter__Group_1__1"
    // InternalGramaticajmeter.g:522:1: rule__JMeter__Group_1__1 : rule__JMeter__Group_1__1__Impl ;
    public final void rule__JMeter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:526:1: ( rule__JMeter__Group_1__1__Impl )
            // InternalGramaticajmeter.g:527:2: rule__JMeter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JMeter__Group_1__1__Impl();

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
    // $ANTLR end "rule__JMeter__Group_1__1"


    // $ANTLR start "rule__JMeter__Group_1__1__Impl"
    // InternalGramaticajmeter.g:533:1: rule__JMeter__Group_1__1__Impl : ( ( rule__JMeter__ArchitectureResultsAssignment_1_1 ) ) ;
    public final void rule__JMeter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:537:1: ( ( ( rule__JMeter__ArchitectureResultsAssignment_1_1 ) ) )
            // InternalGramaticajmeter.g:538:1: ( ( rule__JMeter__ArchitectureResultsAssignment_1_1 ) )
            {
            // InternalGramaticajmeter.g:538:1: ( ( rule__JMeter__ArchitectureResultsAssignment_1_1 ) )
            // InternalGramaticajmeter.g:539:2: ( rule__JMeter__ArchitectureResultsAssignment_1_1 )
            {
             before(grammarAccess.getJMeterAccess().getArchitectureResultsAssignment_1_1()); 
            // InternalGramaticajmeter.g:540:2: ( rule__JMeter__ArchitectureResultsAssignment_1_1 )
            // InternalGramaticajmeter.g:540:3: rule__JMeter__ArchitectureResultsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JMeter__ArchitectureResultsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJMeterAccess().getArchitectureResultsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JMeter__Group_1__1__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__0"
    // InternalGramaticajmeter.g:549:1: rule__ArchitectureResults__Group__0 : rule__ArchitectureResults__Group__0__Impl rule__ArchitectureResults__Group__1 ;
    public final void rule__ArchitectureResults__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:553:1: ( rule__ArchitectureResults__Group__0__Impl rule__ArchitectureResults__Group__1 )
            // InternalGramaticajmeter.g:554:2: rule__ArchitectureResults__Group__0__Impl rule__ArchitectureResults__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ArchitectureResults__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__1();

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
    // $ANTLR end "rule__ArchitectureResults__Group__0"


    // $ANTLR start "rule__ArchitectureResults__Group__0__Impl"
    // InternalGramaticajmeter.g:561:1: rule__ArchitectureResults__Group__0__Impl : ( 'architecture=' ) ;
    public final void rule__ArchitectureResults__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:565:1: ( ( 'architecture=' ) )
            // InternalGramaticajmeter.g:566:1: ( 'architecture=' )
            {
            // InternalGramaticajmeter.g:566:1: ( 'architecture=' )
            // InternalGramaticajmeter.g:567:2: 'architecture='
            {
             before(grammarAccess.getArchitectureResultsAccess().getArchitectureKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getArchitectureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__0__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__1"
    // InternalGramaticajmeter.g:576:1: rule__ArchitectureResults__Group__1 : rule__ArchitectureResults__Group__1__Impl rule__ArchitectureResults__Group__2 ;
    public final void rule__ArchitectureResults__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:580:1: ( rule__ArchitectureResults__Group__1__Impl rule__ArchitectureResults__Group__2 )
            // InternalGramaticajmeter.g:581:2: rule__ArchitectureResults__Group__1__Impl rule__ArchitectureResults__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureResults__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__2();

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
    // $ANTLR end "rule__ArchitectureResults__Group__1"


    // $ANTLR start "rule__ArchitectureResults__Group__1__Impl"
    // InternalGramaticajmeter.g:588:1: rule__ArchitectureResults__Group__1__Impl : ( ( rule__ArchitectureResults__ArchitectureAssignment_1 ) ) ;
    public final void rule__ArchitectureResults__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:592:1: ( ( ( rule__ArchitectureResults__ArchitectureAssignment_1 ) ) )
            // InternalGramaticajmeter.g:593:1: ( ( rule__ArchitectureResults__ArchitectureAssignment_1 ) )
            {
            // InternalGramaticajmeter.g:593:1: ( ( rule__ArchitectureResults__ArchitectureAssignment_1 ) )
            // InternalGramaticajmeter.g:594:2: ( rule__ArchitectureResults__ArchitectureAssignment_1 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getArchitectureAssignment_1()); 
            // InternalGramaticajmeter.g:595:2: ( rule__ArchitectureResults__ArchitectureAssignment_1 )
            // InternalGramaticajmeter.g:595:3: rule__ArchitectureResults__ArchitectureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__ArchitectureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getArchitectureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__1__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__2"
    // InternalGramaticajmeter.g:603:1: rule__ArchitectureResults__Group__2 : rule__ArchitectureResults__Group__2__Impl rule__ArchitectureResults__Group__3 ;
    public final void rule__ArchitectureResults__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:607:1: ( rule__ArchitectureResults__Group__2__Impl rule__ArchitectureResults__Group__3 )
            // InternalGramaticajmeter.g:608:2: rule__ArchitectureResults__Group__2__Impl rule__ArchitectureResults__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ArchitectureResults__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__3();

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
    // $ANTLR end "rule__ArchitectureResults__Group__2"


    // $ANTLR start "rule__ArchitectureResults__Group__2__Impl"
    // InternalGramaticajmeter.g:615:1: rule__ArchitectureResults__Group__2__Impl : ( RULE_NL ) ;
    public final void rule__ArchitectureResults__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:619:1: ( ( RULE_NL ) )
            // InternalGramaticajmeter.g:620:1: ( RULE_NL )
            {
            // InternalGramaticajmeter.g:620:1: ( RULE_NL )
            // InternalGramaticajmeter.g:621:2: RULE_NL
            {
             before(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_2()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__2__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__3"
    // InternalGramaticajmeter.g:630:1: rule__ArchitectureResults__Group__3 : rule__ArchitectureResults__Group__3__Impl rule__ArchitectureResults__Group__4 ;
    public final void rule__ArchitectureResults__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:634:1: ( rule__ArchitectureResults__Group__3__Impl rule__ArchitectureResults__Group__4 )
            // InternalGramaticajmeter.g:635:2: rule__ArchitectureResults__Group__3__Impl rule__ArchitectureResults__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureResults__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__4();

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
    // $ANTLR end "rule__ArchitectureResults__Group__3"


    // $ANTLR start "rule__ArchitectureResults__Group__3__Impl"
    // InternalGramaticajmeter.g:642:1: rule__ArchitectureResults__Group__3__Impl : ( ( rule__ArchitectureResults__HeaderAssignment_3 ) ) ;
    public final void rule__ArchitectureResults__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:646:1: ( ( ( rule__ArchitectureResults__HeaderAssignment_3 ) ) )
            // InternalGramaticajmeter.g:647:1: ( ( rule__ArchitectureResults__HeaderAssignment_3 ) )
            {
            // InternalGramaticajmeter.g:647:1: ( ( rule__ArchitectureResults__HeaderAssignment_3 ) )
            // InternalGramaticajmeter.g:648:2: ( rule__ArchitectureResults__HeaderAssignment_3 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getHeaderAssignment_3()); 
            // InternalGramaticajmeter.g:649:2: ( rule__ArchitectureResults__HeaderAssignment_3 )
            // InternalGramaticajmeter.g:649:3: rule__ArchitectureResults__HeaderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__HeaderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getHeaderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__3__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__4"
    // InternalGramaticajmeter.g:657:1: rule__ArchitectureResults__Group__4 : rule__ArchitectureResults__Group__4__Impl rule__ArchitectureResults__Group__5 ;
    public final void rule__ArchitectureResults__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:661:1: ( rule__ArchitectureResults__Group__4__Impl rule__ArchitectureResults__Group__5 )
            // InternalGramaticajmeter.g:662:2: rule__ArchitectureResults__Group__4__Impl rule__ArchitectureResults__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ArchitectureResults__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__5();

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
    // $ANTLR end "rule__ArchitectureResults__Group__4"


    // $ANTLR start "rule__ArchitectureResults__Group__4__Impl"
    // InternalGramaticajmeter.g:669:1: rule__ArchitectureResults__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__ArchitectureResults__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:673:1: ( ( RULE_NL ) )
            // InternalGramaticajmeter.g:674:1: ( RULE_NL )
            {
            // InternalGramaticajmeter.g:674:1: ( RULE_NL )
            // InternalGramaticajmeter.g:675:2: RULE_NL
            {
             before(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_4()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__4__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__5"
    // InternalGramaticajmeter.g:684:1: rule__ArchitectureResults__Group__5 : rule__ArchitectureResults__Group__5__Impl rule__ArchitectureResults__Group__6 ;
    public final void rule__ArchitectureResults__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:688:1: ( rule__ArchitectureResults__Group__5__Impl rule__ArchitectureResults__Group__6 )
            // InternalGramaticajmeter.g:689:2: rule__ArchitectureResults__Group__5__Impl rule__ArchitectureResults__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureResults__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__6();

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
    // $ANTLR end "rule__ArchitectureResults__Group__5"


    // $ANTLR start "rule__ArchitectureResults__Group__5__Impl"
    // InternalGramaticajmeter.g:696:1: rule__ArchitectureResults__Group__5__Impl : ( ( rule__ArchitectureResults__ResultsAssignment_5 ) ) ;
    public final void rule__ArchitectureResults__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:700:1: ( ( ( rule__ArchitectureResults__ResultsAssignment_5 ) ) )
            // InternalGramaticajmeter.g:701:1: ( ( rule__ArchitectureResults__ResultsAssignment_5 ) )
            {
            // InternalGramaticajmeter.g:701:1: ( ( rule__ArchitectureResults__ResultsAssignment_5 ) )
            // InternalGramaticajmeter.g:702:2: ( rule__ArchitectureResults__ResultsAssignment_5 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsAssignment_5()); 
            // InternalGramaticajmeter.g:703:2: ( rule__ArchitectureResults__ResultsAssignment_5 )
            // InternalGramaticajmeter.g:703:3: rule__ArchitectureResults__ResultsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__ResultsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getResultsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__5__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__6"
    // InternalGramaticajmeter.g:711:1: rule__ArchitectureResults__Group__6 : rule__ArchitectureResults__Group__6__Impl rule__ArchitectureResults__Group__7 ;
    public final void rule__ArchitectureResults__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:715:1: ( rule__ArchitectureResults__Group__6__Impl rule__ArchitectureResults__Group__7 )
            // InternalGramaticajmeter.g:716:2: rule__ArchitectureResults__Group__6__Impl rule__ArchitectureResults__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureResults__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__7();

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
    // $ANTLR end "rule__ArchitectureResults__Group__6"


    // $ANTLR start "rule__ArchitectureResults__Group__6__Impl"
    // InternalGramaticajmeter.g:723:1: rule__ArchitectureResults__Group__6__Impl : ( ( rule__ArchitectureResults__Group_6__0 )* ) ;
    public final void rule__ArchitectureResults__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:727:1: ( ( ( rule__ArchitectureResults__Group_6__0 )* ) )
            // InternalGramaticajmeter.g:728:1: ( ( rule__ArchitectureResults__Group_6__0 )* )
            {
            // InternalGramaticajmeter.g:728:1: ( ( rule__ArchitectureResults__Group_6__0 )* )
            // InternalGramaticajmeter.g:729:2: ( rule__ArchitectureResults__Group_6__0 )*
            {
             before(grammarAccess.getArchitectureResultsAccess().getGroup_6()); 
            // InternalGramaticajmeter.g:730:2: ( rule__ArchitectureResults__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_NL) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_STRING) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalGramaticajmeter.g:730:3: rule__ArchitectureResults__Group_6__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ArchitectureResults__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getArchitectureResultsAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__6__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__7"
    // InternalGramaticajmeter.g:738:1: rule__ArchitectureResults__Group__7 : rule__ArchitectureResults__Group__7__Impl rule__ArchitectureResults__Group__8 ;
    public final void rule__ArchitectureResults__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:742:1: ( rule__ArchitectureResults__Group__7__Impl rule__ArchitectureResults__Group__8 )
            // InternalGramaticajmeter.g:743:2: rule__ArchitectureResults__Group__7__Impl rule__ArchitectureResults__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__ArchitectureResults__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__8();

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
    // $ANTLR end "rule__ArchitectureResults__Group__7"


    // $ANTLR start "rule__ArchitectureResults__Group__7__Impl"
    // InternalGramaticajmeter.g:750:1: rule__ArchitectureResults__Group__7__Impl : ( RULE_NL ) ;
    public final void rule__ArchitectureResults__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:754:1: ( ( RULE_NL ) )
            // InternalGramaticajmeter.g:755:1: ( RULE_NL )
            {
            // InternalGramaticajmeter.g:755:1: ( RULE_NL )
            // InternalGramaticajmeter.g:756:2: RULE_NL
            {
             before(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_7()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__7__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__8"
    // InternalGramaticajmeter.g:765:1: rule__ArchitectureResults__Group__8 : rule__ArchitectureResults__Group__8__Impl rule__ArchitectureResults__Group__9 ;
    public final void rule__ArchitectureResults__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:769:1: ( rule__ArchitectureResults__Group__8__Impl rule__ArchitectureResults__Group__9 )
            // InternalGramaticajmeter.g:770:2: rule__ArchitectureResults__Group__8__Impl rule__ArchitectureResults__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureResults__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__9();

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
    // $ANTLR end "rule__ArchitectureResults__Group__8"


    // $ANTLR start "rule__ArchitectureResults__Group__8__Impl"
    // InternalGramaticajmeter.g:777:1: rule__ArchitectureResults__Group__8__Impl : ( ( rule__ArchitectureResults__HeaderJMeterAssignment_8 ) ) ;
    public final void rule__ArchitectureResults__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:781:1: ( ( ( rule__ArchitectureResults__HeaderJMeterAssignment_8 ) ) )
            // InternalGramaticajmeter.g:782:1: ( ( rule__ArchitectureResults__HeaderJMeterAssignment_8 ) )
            {
            // InternalGramaticajmeter.g:782:1: ( ( rule__ArchitectureResults__HeaderJMeterAssignment_8 ) )
            // InternalGramaticajmeter.g:783:2: ( rule__ArchitectureResults__HeaderJMeterAssignment_8 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getHeaderJMeterAssignment_8()); 
            // InternalGramaticajmeter.g:784:2: ( rule__ArchitectureResults__HeaderJMeterAssignment_8 )
            // InternalGramaticajmeter.g:784:3: rule__ArchitectureResults__HeaderJMeterAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__HeaderJMeterAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getHeaderJMeterAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__8__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__9"
    // InternalGramaticajmeter.g:792:1: rule__ArchitectureResults__Group__9 : rule__ArchitectureResults__Group__9__Impl rule__ArchitectureResults__Group__10 ;
    public final void rule__ArchitectureResults__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:796:1: ( rule__ArchitectureResults__Group__9__Impl rule__ArchitectureResults__Group__10 )
            // InternalGramaticajmeter.g:797:2: rule__ArchitectureResults__Group__9__Impl rule__ArchitectureResults__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__ArchitectureResults__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__10();

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
    // $ANTLR end "rule__ArchitectureResults__Group__9"


    // $ANTLR start "rule__ArchitectureResults__Group__9__Impl"
    // InternalGramaticajmeter.g:804:1: rule__ArchitectureResults__Group__9__Impl : ( RULE_NL ) ;
    public final void rule__ArchitectureResults__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:808:1: ( ( RULE_NL ) )
            // InternalGramaticajmeter.g:809:1: ( RULE_NL )
            {
            // InternalGramaticajmeter.g:809:1: ( RULE_NL )
            // InternalGramaticajmeter.g:810:2: RULE_NL
            {
             before(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_9()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__9__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__10"
    // InternalGramaticajmeter.g:819:1: rule__ArchitectureResults__Group__10 : rule__ArchitectureResults__Group__10__Impl rule__ArchitectureResults__Group__11 ;
    public final void rule__ArchitectureResults__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:823:1: ( rule__ArchitectureResults__Group__10__Impl rule__ArchitectureResults__Group__11 )
            // InternalGramaticajmeter.g:824:2: rule__ArchitectureResults__Group__10__Impl rule__ArchitectureResults__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureResults__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__11();

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
    // $ANTLR end "rule__ArchitectureResults__Group__10"


    // $ANTLR start "rule__ArchitectureResults__Group__10__Impl"
    // InternalGramaticajmeter.g:831:1: rule__ArchitectureResults__Group__10__Impl : ( ( rule__ArchitectureResults__ResultsJMeterAssignment_10 ) ) ;
    public final void rule__ArchitectureResults__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:835:1: ( ( ( rule__ArchitectureResults__ResultsJMeterAssignment_10 ) ) )
            // InternalGramaticajmeter.g:836:1: ( ( rule__ArchitectureResults__ResultsJMeterAssignment_10 ) )
            {
            // InternalGramaticajmeter.g:836:1: ( ( rule__ArchitectureResults__ResultsJMeterAssignment_10 ) )
            // InternalGramaticajmeter.g:837:2: ( rule__ArchitectureResults__ResultsJMeterAssignment_10 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsJMeterAssignment_10()); 
            // InternalGramaticajmeter.g:838:2: ( rule__ArchitectureResults__ResultsJMeterAssignment_10 )
            // InternalGramaticajmeter.g:838:3: rule__ArchitectureResults__ResultsJMeterAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__ResultsJMeterAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getResultsJMeterAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__10__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group__11"
    // InternalGramaticajmeter.g:846:1: rule__ArchitectureResults__Group__11 : rule__ArchitectureResults__Group__11__Impl ;
    public final void rule__ArchitectureResults__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:850:1: ( rule__ArchitectureResults__Group__11__Impl )
            // InternalGramaticajmeter.g:851:2: rule__ArchitectureResults__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group__11__Impl();

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
    // $ANTLR end "rule__ArchitectureResults__Group__11"


    // $ANTLR start "rule__ArchitectureResults__Group__11__Impl"
    // InternalGramaticajmeter.g:857:1: rule__ArchitectureResults__Group__11__Impl : ( ( rule__ArchitectureResults__Group_11__0 )* ) ;
    public final void rule__ArchitectureResults__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:861:1: ( ( ( rule__ArchitectureResults__Group_11__0 )* ) )
            // InternalGramaticajmeter.g:862:1: ( ( rule__ArchitectureResults__Group_11__0 )* )
            {
            // InternalGramaticajmeter.g:862:1: ( ( rule__ArchitectureResults__Group_11__0 )* )
            // InternalGramaticajmeter.g:863:2: ( rule__ArchitectureResults__Group_11__0 )*
            {
             before(grammarAccess.getArchitectureResultsAccess().getGroup_11()); 
            // InternalGramaticajmeter.g:864:2: ( rule__ArchitectureResults__Group_11__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_NL) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_STRING) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalGramaticajmeter.g:864:3: rule__ArchitectureResults__Group_11__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ArchitectureResults__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArchitectureResultsAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group__11__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group_6__0"
    // InternalGramaticajmeter.g:873:1: rule__ArchitectureResults__Group_6__0 : rule__ArchitectureResults__Group_6__0__Impl rule__ArchitectureResults__Group_6__1 ;
    public final void rule__ArchitectureResults__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:877:1: ( rule__ArchitectureResults__Group_6__0__Impl rule__ArchitectureResults__Group_6__1 )
            // InternalGramaticajmeter.g:878:2: rule__ArchitectureResults__Group_6__0__Impl rule__ArchitectureResults__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__ArchitectureResults__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group_6__1();

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
    // $ANTLR end "rule__ArchitectureResults__Group_6__0"


    // $ANTLR start "rule__ArchitectureResults__Group_6__0__Impl"
    // InternalGramaticajmeter.g:885:1: rule__ArchitectureResults__Group_6__0__Impl : ( RULE_NL ) ;
    public final void rule__ArchitectureResults__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:889:1: ( ( RULE_NL ) )
            // InternalGramaticajmeter.g:890:1: ( RULE_NL )
            {
            // InternalGramaticajmeter.g:890:1: ( RULE_NL )
            // InternalGramaticajmeter.g:891:2: RULE_NL
            {
             before(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_6_0()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group_6__0__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group_6__1"
    // InternalGramaticajmeter.g:900:1: rule__ArchitectureResults__Group_6__1 : rule__ArchitectureResults__Group_6__1__Impl ;
    public final void rule__ArchitectureResults__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:904:1: ( rule__ArchitectureResults__Group_6__1__Impl )
            // InternalGramaticajmeter.g:905:2: rule__ArchitectureResults__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group_6__1__Impl();

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
    // $ANTLR end "rule__ArchitectureResults__Group_6__1"


    // $ANTLR start "rule__ArchitectureResults__Group_6__1__Impl"
    // InternalGramaticajmeter.g:911:1: rule__ArchitectureResults__Group_6__1__Impl : ( ( rule__ArchitectureResults__ResultsAssignment_6_1 ) ) ;
    public final void rule__ArchitectureResults__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:915:1: ( ( ( rule__ArchitectureResults__ResultsAssignment_6_1 ) ) )
            // InternalGramaticajmeter.g:916:1: ( ( rule__ArchitectureResults__ResultsAssignment_6_1 ) )
            {
            // InternalGramaticajmeter.g:916:1: ( ( rule__ArchitectureResults__ResultsAssignment_6_1 ) )
            // InternalGramaticajmeter.g:917:2: ( rule__ArchitectureResults__ResultsAssignment_6_1 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsAssignment_6_1()); 
            // InternalGramaticajmeter.g:918:2: ( rule__ArchitectureResults__ResultsAssignment_6_1 )
            // InternalGramaticajmeter.g:918:3: rule__ArchitectureResults__ResultsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__ResultsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getResultsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group_6__1__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group_11__0"
    // InternalGramaticajmeter.g:927:1: rule__ArchitectureResults__Group_11__0 : rule__ArchitectureResults__Group_11__0__Impl rule__ArchitectureResults__Group_11__1 ;
    public final void rule__ArchitectureResults__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:931:1: ( rule__ArchitectureResults__Group_11__0__Impl rule__ArchitectureResults__Group_11__1 )
            // InternalGramaticajmeter.g:932:2: rule__ArchitectureResults__Group_11__0__Impl rule__ArchitectureResults__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__ArchitectureResults__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group_11__1();

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
    // $ANTLR end "rule__ArchitectureResults__Group_11__0"


    // $ANTLR start "rule__ArchitectureResults__Group_11__0__Impl"
    // InternalGramaticajmeter.g:939:1: rule__ArchitectureResults__Group_11__0__Impl : ( RULE_NL ) ;
    public final void rule__ArchitectureResults__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:943:1: ( ( RULE_NL ) )
            // InternalGramaticajmeter.g:944:1: ( RULE_NL )
            {
            // InternalGramaticajmeter.g:944:1: ( RULE_NL )
            // InternalGramaticajmeter.g:945:2: RULE_NL
            {
             before(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_11_0()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group_11__0__Impl"


    // $ANTLR start "rule__ArchitectureResults__Group_11__1"
    // InternalGramaticajmeter.g:954:1: rule__ArchitectureResults__Group_11__1 : rule__ArchitectureResults__Group_11__1__Impl ;
    public final void rule__ArchitectureResults__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:958:1: ( rule__ArchitectureResults__Group_11__1__Impl )
            // InternalGramaticajmeter.g:959:2: rule__ArchitectureResults__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__Group_11__1__Impl();

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
    // $ANTLR end "rule__ArchitectureResults__Group_11__1"


    // $ANTLR start "rule__ArchitectureResults__Group_11__1__Impl"
    // InternalGramaticajmeter.g:965:1: rule__ArchitectureResults__Group_11__1__Impl : ( ( rule__ArchitectureResults__ResultsJMeterAssignment_11_1 ) ) ;
    public final void rule__ArchitectureResults__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:969:1: ( ( ( rule__ArchitectureResults__ResultsJMeterAssignment_11_1 ) ) )
            // InternalGramaticajmeter.g:970:1: ( ( rule__ArchitectureResults__ResultsJMeterAssignment_11_1 ) )
            {
            // InternalGramaticajmeter.g:970:1: ( ( rule__ArchitectureResults__ResultsJMeterAssignment_11_1 ) )
            // InternalGramaticajmeter.g:971:2: ( rule__ArchitectureResults__ResultsJMeterAssignment_11_1 )
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsJMeterAssignment_11_1()); 
            // InternalGramaticajmeter.g:972:2: ( rule__ArchitectureResults__ResultsJMeterAssignment_11_1 )
            // InternalGramaticajmeter.g:972:3: rule__ArchitectureResults__ResultsJMeterAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureResults__ResultsJMeterAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureResultsAccess().getResultsJMeterAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__Group_11__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalGramaticajmeter.g:981:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:985:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalGramaticajmeter.g:986:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalGramaticajmeter.g:993:1: rule__Header__Group__0__Impl : ( ( rule__Header__HeaderAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:997:1: ( ( ( rule__Header__HeaderAssignment_0 ) ) )
            // InternalGramaticajmeter.g:998:1: ( ( rule__Header__HeaderAssignment_0 ) )
            {
            // InternalGramaticajmeter.g:998:1: ( ( rule__Header__HeaderAssignment_0 ) )
            // InternalGramaticajmeter.g:999:2: ( rule__Header__HeaderAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getHeaderAssignment_0()); 
            // InternalGramaticajmeter.g:1000:2: ( rule__Header__HeaderAssignment_0 )
            // InternalGramaticajmeter.g:1000:3: rule__Header__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Header__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getHeaderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalGramaticajmeter.g:1008:1: rule__Header__Group__1 : rule__Header__Group__1__Impl ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1012:1: ( rule__Header__Group__1__Impl )
            // InternalGramaticajmeter.g:1013:2: rule__Header__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__1__Impl();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalGramaticajmeter.g:1019:1: rule__Header__Group__1__Impl : ( ( rule__Header__Group_1__0 )* ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1023:1: ( ( ( rule__Header__Group_1__0 )* ) )
            // InternalGramaticajmeter.g:1024:1: ( ( rule__Header__Group_1__0 )* )
            {
            // InternalGramaticajmeter.g:1024:1: ( ( rule__Header__Group_1__0 )* )
            // InternalGramaticajmeter.g:1025:2: ( rule__Header__Group_1__0 )*
            {
             before(grammarAccess.getHeaderAccess().getGroup_1()); 
            // InternalGramaticajmeter.g:1026:2: ( rule__Header__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGramaticajmeter.g:1026:3: rule__Header__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Header__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getHeaderAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group_1__0"
    // InternalGramaticajmeter.g:1035:1: rule__Header__Group_1__0 : rule__Header__Group_1__0__Impl rule__Header__Group_1__1 ;
    public final void rule__Header__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1039:1: ( rule__Header__Group_1__0__Impl rule__Header__Group_1__1 )
            // InternalGramaticajmeter.g:1040:2: rule__Header__Group_1__0__Impl rule__Header__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Header__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group_1__1();

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
    // $ANTLR end "rule__Header__Group_1__0"


    // $ANTLR start "rule__Header__Group_1__0__Impl"
    // InternalGramaticajmeter.g:1047:1: rule__Header__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Header__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1051:1: ( ( RULE_COMMA ) )
            // InternalGramaticajmeter.g:1052:1: ( RULE_COMMA )
            {
            // InternalGramaticajmeter.g:1052:1: ( RULE_COMMA )
            // InternalGramaticajmeter.g:1053:2: RULE_COMMA
            {
             before(grammarAccess.getHeaderAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_1__0__Impl"


    // $ANTLR start "rule__Header__Group_1__1"
    // InternalGramaticajmeter.g:1062:1: rule__Header__Group_1__1 : rule__Header__Group_1__1__Impl ;
    public final void rule__Header__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1066:1: ( rule__Header__Group_1__1__Impl )
            // InternalGramaticajmeter.g:1067:2: rule__Header__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group_1__1__Impl();

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
    // $ANTLR end "rule__Header__Group_1__1"


    // $ANTLR start "rule__Header__Group_1__1__Impl"
    // InternalGramaticajmeter.g:1073:1: rule__Header__Group_1__1__Impl : ( ( rule__Header__HeaderAssignment_1_1 ) ) ;
    public final void rule__Header__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1077:1: ( ( ( rule__Header__HeaderAssignment_1_1 ) ) )
            // InternalGramaticajmeter.g:1078:1: ( ( rule__Header__HeaderAssignment_1_1 ) )
            {
            // InternalGramaticajmeter.g:1078:1: ( ( rule__Header__HeaderAssignment_1_1 ) )
            // InternalGramaticajmeter.g:1079:2: ( rule__Header__HeaderAssignment_1_1 )
            {
             before(grammarAccess.getHeaderAccess().getHeaderAssignment_1_1()); 
            // InternalGramaticajmeter.g:1080:2: ( rule__Header__HeaderAssignment_1_1 )
            // InternalGramaticajmeter.g:1080:3: rule__Header__HeaderAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Header__HeaderAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getHeaderAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_1__1__Impl"


    // $ANTLR start "rule__Results__Group__0"
    // InternalGramaticajmeter.g:1089:1: rule__Results__Group__0 : rule__Results__Group__0__Impl rule__Results__Group__1 ;
    public final void rule__Results__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1093:1: ( rule__Results__Group__0__Impl rule__Results__Group__1 )
            // InternalGramaticajmeter.g:1094:2: rule__Results__Group__0__Impl rule__Results__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Results__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__1();

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
    // $ANTLR end "rule__Results__Group__0"


    // $ANTLR start "rule__Results__Group__0__Impl"
    // InternalGramaticajmeter.g:1101:1: rule__Results__Group__0__Impl : ( ( rule__Results__ResultAssignment_0 ) ) ;
    public final void rule__Results__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1105:1: ( ( ( rule__Results__ResultAssignment_0 ) ) )
            // InternalGramaticajmeter.g:1106:1: ( ( rule__Results__ResultAssignment_0 ) )
            {
            // InternalGramaticajmeter.g:1106:1: ( ( rule__Results__ResultAssignment_0 ) )
            // InternalGramaticajmeter.g:1107:2: ( rule__Results__ResultAssignment_0 )
            {
             before(grammarAccess.getResultsAccess().getResultAssignment_0()); 
            // InternalGramaticajmeter.g:1108:2: ( rule__Results__ResultAssignment_0 )
            // InternalGramaticajmeter.g:1108:3: rule__Results__ResultAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Results__ResultAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getResultAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__0__Impl"


    // $ANTLR start "rule__Results__Group__1"
    // InternalGramaticajmeter.g:1116:1: rule__Results__Group__1 : rule__Results__Group__1__Impl ;
    public final void rule__Results__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1120:1: ( rule__Results__Group__1__Impl )
            // InternalGramaticajmeter.g:1121:2: rule__Results__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Results__Group__1__Impl();

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
    // $ANTLR end "rule__Results__Group__1"


    // $ANTLR start "rule__Results__Group__1__Impl"
    // InternalGramaticajmeter.g:1127:1: rule__Results__Group__1__Impl : ( ( rule__Results__Group_1__0 )* ) ;
    public final void rule__Results__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1131:1: ( ( ( rule__Results__Group_1__0 )* ) )
            // InternalGramaticajmeter.g:1132:1: ( ( rule__Results__Group_1__0 )* )
            {
            // InternalGramaticajmeter.g:1132:1: ( ( rule__Results__Group_1__0 )* )
            // InternalGramaticajmeter.g:1133:2: ( rule__Results__Group_1__0 )*
            {
             before(grammarAccess.getResultsAccess().getGroup_1()); 
            // InternalGramaticajmeter.g:1134:2: ( rule__Results__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGramaticajmeter.g:1134:3: rule__Results__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Results__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getResultsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__1__Impl"


    // $ANTLR start "rule__Results__Group_1__0"
    // InternalGramaticajmeter.g:1143:1: rule__Results__Group_1__0 : rule__Results__Group_1__0__Impl rule__Results__Group_1__1 ;
    public final void rule__Results__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1147:1: ( rule__Results__Group_1__0__Impl rule__Results__Group_1__1 )
            // InternalGramaticajmeter.g:1148:2: rule__Results__Group_1__0__Impl rule__Results__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Results__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group_1__1();

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
    // $ANTLR end "rule__Results__Group_1__0"


    // $ANTLR start "rule__Results__Group_1__0__Impl"
    // InternalGramaticajmeter.g:1155:1: rule__Results__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Results__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1159:1: ( ( RULE_COMMA ) )
            // InternalGramaticajmeter.g:1160:1: ( RULE_COMMA )
            {
            // InternalGramaticajmeter.g:1160:1: ( RULE_COMMA )
            // InternalGramaticajmeter.g:1161:2: RULE_COMMA
            {
             before(grammarAccess.getResultsAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_1__0__Impl"


    // $ANTLR start "rule__Results__Group_1__1"
    // InternalGramaticajmeter.g:1170:1: rule__Results__Group_1__1 : rule__Results__Group_1__1__Impl ;
    public final void rule__Results__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1174:1: ( rule__Results__Group_1__1__Impl )
            // InternalGramaticajmeter.g:1175:2: rule__Results__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Results__Group_1__1__Impl();

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
    // $ANTLR end "rule__Results__Group_1__1"


    // $ANTLR start "rule__Results__Group_1__1__Impl"
    // InternalGramaticajmeter.g:1181:1: rule__Results__Group_1__1__Impl : ( ( rule__Results__ResultAssignment_1_1 ) ) ;
    public final void rule__Results__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1185:1: ( ( ( rule__Results__ResultAssignment_1_1 ) ) )
            // InternalGramaticajmeter.g:1186:1: ( ( rule__Results__ResultAssignment_1_1 ) )
            {
            // InternalGramaticajmeter.g:1186:1: ( ( rule__Results__ResultAssignment_1_1 ) )
            // InternalGramaticajmeter.g:1187:2: ( rule__Results__ResultAssignment_1_1 )
            {
             before(grammarAccess.getResultsAccess().getResultAssignment_1_1()); 
            // InternalGramaticajmeter.g:1188:2: ( rule__Results__ResultAssignment_1_1 )
            // InternalGramaticajmeter.g:1188:3: rule__Results__ResultAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Results__ResultAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getResultAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_1__1__Impl"


    // $ANTLR start "rule__HeaderJMeter__Group__0"
    // InternalGramaticajmeter.g:1197:1: rule__HeaderJMeter__Group__0 : rule__HeaderJMeter__Group__0__Impl rule__HeaderJMeter__Group__1 ;
    public final void rule__HeaderJMeter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1201:1: ( rule__HeaderJMeter__Group__0__Impl rule__HeaderJMeter__Group__1 )
            // InternalGramaticajmeter.g:1202:2: rule__HeaderJMeter__Group__0__Impl rule__HeaderJMeter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__HeaderJMeter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderJMeter__Group__1();

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
    // $ANTLR end "rule__HeaderJMeter__Group__0"


    // $ANTLR start "rule__HeaderJMeter__Group__0__Impl"
    // InternalGramaticajmeter.g:1209:1: rule__HeaderJMeter__Group__0__Impl : ( ( rule__HeaderJMeter__HeaderAssignment_0 ) ) ;
    public final void rule__HeaderJMeter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1213:1: ( ( ( rule__HeaderJMeter__HeaderAssignment_0 ) ) )
            // InternalGramaticajmeter.g:1214:1: ( ( rule__HeaderJMeter__HeaderAssignment_0 ) )
            {
            // InternalGramaticajmeter.g:1214:1: ( ( rule__HeaderJMeter__HeaderAssignment_0 ) )
            // InternalGramaticajmeter.g:1215:2: ( rule__HeaderJMeter__HeaderAssignment_0 )
            {
             before(grammarAccess.getHeaderJMeterAccess().getHeaderAssignment_0()); 
            // InternalGramaticajmeter.g:1216:2: ( rule__HeaderJMeter__HeaderAssignment_0 )
            // InternalGramaticajmeter.g:1216:3: rule__HeaderJMeter__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderJMeter__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderJMeterAccess().getHeaderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderJMeter__Group__0__Impl"


    // $ANTLR start "rule__HeaderJMeter__Group__1"
    // InternalGramaticajmeter.g:1224:1: rule__HeaderJMeter__Group__1 : rule__HeaderJMeter__Group__1__Impl ;
    public final void rule__HeaderJMeter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1228:1: ( rule__HeaderJMeter__Group__1__Impl )
            // InternalGramaticajmeter.g:1229:2: rule__HeaderJMeter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderJMeter__Group__1__Impl();

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
    // $ANTLR end "rule__HeaderJMeter__Group__1"


    // $ANTLR start "rule__HeaderJMeter__Group__1__Impl"
    // InternalGramaticajmeter.g:1235:1: rule__HeaderJMeter__Group__1__Impl : ( ( rule__HeaderJMeter__Group_1__0 )* ) ;
    public final void rule__HeaderJMeter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1239:1: ( ( ( rule__HeaderJMeter__Group_1__0 )* ) )
            // InternalGramaticajmeter.g:1240:1: ( ( rule__HeaderJMeter__Group_1__0 )* )
            {
            // InternalGramaticajmeter.g:1240:1: ( ( rule__HeaderJMeter__Group_1__0 )* )
            // InternalGramaticajmeter.g:1241:2: ( rule__HeaderJMeter__Group_1__0 )*
            {
             before(grammarAccess.getHeaderJMeterAccess().getGroup_1()); 
            // InternalGramaticajmeter.g:1242:2: ( rule__HeaderJMeter__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGramaticajmeter.g:1242:3: rule__HeaderJMeter__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__HeaderJMeter__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getHeaderJMeterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderJMeter__Group__1__Impl"


    // $ANTLR start "rule__HeaderJMeter__Group_1__0"
    // InternalGramaticajmeter.g:1251:1: rule__HeaderJMeter__Group_1__0 : rule__HeaderJMeter__Group_1__0__Impl rule__HeaderJMeter__Group_1__1 ;
    public final void rule__HeaderJMeter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1255:1: ( rule__HeaderJMeter__Group_1__0__Impl rule__HeaderJMeter__Group_1__1 )
            // InternalGramaticajmeter.g:1256:2: rule__HeaderJMeter__Group_1__0__Impl rule__HeaderJMeter__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__HeaderJMeter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderJMeter__Group_1__1();

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
    // $ANTLR end "rule__HeaderJMeter__Group_1__0"


    // $ANTLR start "rule__HeaderJMeter__Group_1__0__Impl"
    // InternalGramaticajmeter.g:1263:1: rule__HeaderJMeter__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__HeaderJMeter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1267:1: ( ( RULE_COMMA ) )
            // InternalGramaticajmeter.g:1268:1: ( RULE_COMMA )
            {
            // InternalGramaticajmeter.g:1268:1: ( RULE_COMMA )
            // InternalGramaticajmeter.g:1269:2: RULE_COMMA
            {
             before(grammarAccess.getHeaderJMeterAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getHeaderJMeterAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderJMeter__Group_1__0__Impl"


    // $ANTLR start "rule__HeaderJMeter__Group_1__1"
    // InternalGramaticajmeter.g:1278:1: rule__HeaderJMeter__Group_1__1 : rule__HeaderJMeter__Group_1__1__Impl ;
    public final void rule__HeaderJMeter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1282:1: ( rule__HeaderJMeter__Group_1__1__Impl )
            // InternalGramaticajmeter.g:1283:2: rule__HeaderJMeter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderJMeter__Group_1__1__Impl();

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
    // $ANTLR end "rule__HeaderJMeter__Group_1__1"


    // $ANTLR start "rule__HeaderJMeter__Group_1__1__Impl"
    // InternalGramaticajmeter.g:1289:1: rule__HeaderJMeter__Group_1__1__Impl : ( ( rule__HeaderJMeter__HeaderAssignment_1_1 ) ) ;
    public final void rule__HeaderJMeter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1293:1: ( ( ( rule__HeaderJMeter__HeaderAssignment_1_1 ) ) )
            // InternalGramaticajmeter.g:1294:1: ( ( rule__HeaderJMeter__HeaderAssignment_1_1 ) )
            {
            // InternalGramaticajmeter.g:1294:1: ( ( rule__HeaderJMeter__HeaderAssignment_1_1 ) )
            // InternalGramaticajmeter.g:1295:2: ( rule__HeaderJMeter__HeaderAssignment_1_1 )
            {
             before(grammarAccess.getHeaderJMeterAccess().getHeaderAssignment_1_1()); 
            // InternalGramaticajmeter.g:1296:2: ( rule__HeaderJMeter__HeaderAssignment_1_1 )
            // InternalGramaticajmeter.g:1296:3: rule__HeaderJMeter__HeaderAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderJMeter__HeaderAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderJMeterAccess().getHeaderAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderJMeter__Group_1__1__Impl"


    // $ANTLR start "rule__JMeter__ArchitectureResultsAssignment_0"
    // InternalGramaticajmeter.g:1305:1: rule__JMeter__ArchitectureResultsAssignment_0 : ( ruleArchitectureResults ) ;
    public final void rule__JMeter__ArchitectureResultsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1309:1: ( ( ruleArchitectureResults ) )
            // InternalGramaticajmeter.g:1310:2: ( ruleArchitectureResults )
            {
            // InternalGramaticajmeter.g:1310:2: ( ruleArchitectureResults )
            // InternalGramaticajmeter.g:1311:3: ruleArchitectureResults
            {
             before(grammarAccess.getJMeterAccess().getArchitectureResultsArchitectureResultsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitectureResults();

            state._fsp--;

             after(grammarAccess.getJMeterAccess().getArchitectureResultsArchitectureResultsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JMeter__ArchitectureResultsAssignment_0"


    // $ANTLR start "rule__JMeter__ArchitectureResultsAssignment_1_1"
    // InternalGramaticajmeter.g:1320:1: rule__JMeter__ArchitectureResultsAssignment_1_1 : ( ruleArchitectureResults ) ;
    public final void rule__JMeter__ArchitectureResultsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1324:1: ( ( ruleArchitectureResults ) )
            // InternalGramaticajmeter.g:1325:2: ( ruleArchitectureResults )
            {
            // InternalGramaticajmeter.g:1325:2: ( ruleArchitectureResults )
            // InternalGramaticajmeter.g:1326:3: ruleArchitectureResults
            {
             before(grammarAccess.getJMeterAccess().getArchitectureResultsArchitectureResultsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitectureResults();

            state._fsp--;

             after(grammarAccess.getJMeterAccess().getArchitectureResultsArchitectureResultsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JMeter__ArchitectureResultsAssignment_1_1"


    // $ANTLR start "rule__ArchitectureResults__ArchitectureAssignment_1"
    // InternalGramaticajmeter.g:1335:1: rule__ArchitectureResults__ArchitectureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ArchitectureResults__ArchitectureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1339:1: ( ( RULE_STRING ) )
            // InternalGramaticajmeter.g:1340:2: ( RULE_STRING )
            {
            // InternalGramaticajmeter.g:1340:2: ( RULE_STRING )
            // InternalGramaticajmeter.g:1341:3: RULE_STRING
            {
             before(grammarAccess.getArchitectureResultsAccess().getArchitectureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArchitectureResultsAccess().getArchitectureSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__ArchitectureAssignment_1"


    // $ANTLR start "rule__ArchitectureResults__HeaderAssignment_3"
    // InternalGramaticajmeter.g:1350:1: rule__ArchitectureResults__HeaderAssignment_3 : ( ruleHeader ) ;
    public final void rule__ArchitectureResults__HeaderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1354:1: ( ( ruleHeader ) )
            // InternalGramaticajmeter.g:1355:2: ( ruleHeader )
            {
            // InternalGramaticajmeter.g:1355:2: ( ruleHeader )
            // InternalGramaticajmeter.g:1356:3: ruleHeader
            {
             before(grammarAccess.getArchitectureResultsAccess().getHeaderHeaderParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getArchitectureResultsAccess().getHeaderHeaderParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__HeaderAssignment_3"


    // $ANTLR start "rule__ArchitectureResults__ResultsAssignment_5"
    // InternalGramaticajmeter.g:1365:1: rule__ArchitectureResults__ResultsAssignment_5 : ( ruleResults ) ;
    public final void rule__ArchitectureResults__ResultsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1369:1: ( ( ruleResults ) )
            // InternalGramaticajmeter.g:1370:2: ( ruleResults )
            {
            // InternalGramaticajmeter.g:1370:2: ( ruleResults )
            // InternalGramaticajmeter.g:1371:3: ruleResults
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsResultsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getArchitectureResultsAccess().getResultsResultsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__ResultsAssignment_5"


    // $ANTLR start "rule__ArchitectureResults__ResultsAssignment_6_1"
    // InternalGramaticajmeter.g:1380:1: rule__ArchitectureResults__ResultsAssignment_6_1 : ( ruleResults ) ;
    public final void rule__ArchitectureResults__ResultsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1384:1: ( ( ruleResults ) )
            // InternalGramaticajmeter.g:1385:2: ( ruleResults )
            {
            // InternalGramaticajmeter.g:1385:2: ( ruleResults )
            // InternalGramaticajmeter.g:1386:3: ruleResults
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsResultsParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getArchitectureResultsAccess().getResultsResultsParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__ResultsAssignment_6_1"


    // $ANTLR start "rule__ArchitectureResults__HeaderJMeterAssignment_8"
    // InternalGramaticajmeter.g:1395:1: rule__ArchitectureResults__HeaderJMeterAssignment_8 : ( ruleHeaderJMeter ) ;
    public final void rule__ArchitectureResults__HeaderJMeterAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1399:1: ( ( ruleHeaderJMeter ) )
            // InternalGramaticajmeter.g:1400:2: ( ruleHeaderJMeter )
            {
            // InternalGramaticajmeter.g:1400:2: ( ruleHeaderJMeter )
            // InternalGramaticajmeter.g:1401:3: ruleHeaderJMeter
            {
             before(grammarAccess.getArchitectureResultsAccess().getHeaderJMeterHeaderJMeterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleHeaderJMeter();

            state._fsp--;

             after(grammarAccess.getArchitectureResultsAccess().getHeaderJMeterHeaderJMeterParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__HeaderJMeterAssignment_8"


    // $ANTLR start "rule__ArchitectureResults__ResultsJMeterAssignment_10"
    // InternalGramaticajmeter.g:1410:1: rule__ArchitectureResults__ResultsJMeterAssignment_10 : ( ruleResults ) ;
    public final void rule__ArchitectureResults__ResultsJMeterAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1414:1: ( ( ruleResults ) )
            // InternalGramaticajmeter.g:1415:2: ( ruleResults )
            {
            // InternalGramaticajmeter.g:1415:2: ( ruleResults )
            // InternalGramaticajmeter.g:1416:3: ruleResults
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsJMeterResultsParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getArchitectureResultsAccess().getResultsJMeterResultsParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__ResultsJMeterAssignment_10"


    // $ANTLR start "rule__ArchitectureResults__ResultsJMeterAssignment_11_1"
    // InternalGramaticajmeter.g:1425:1: rule__ArchitectureResults__ResultsJMeterAssignment_11_1 : ( ruleResults ) ;
    public final void rule__ArchitectureResults__ResultsJMeterAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1429:1: ( ( ruleResults ) )
            // InternalGramaticajmeter.g:1430:2: ( ruleResults )
            {
            // InternalGramaticajmeter.g:1430:2: ( ruleResults )
            // InternalGramaticajmeter.g:1431:3: ruleResults
            {
             before(grammarAccess.getArchitectureResultsAccess().getResultsJMeterResultsParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getArchitectureResultsAccess().getResultsJMeterResultsParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureResults__ResultsJMeterAssignment_11_1"


    // $ANTLR start "rule__Header__HeaderAssignment_0"
    // InternalGramaticajmeter.g:1440:1: rule__Header__HeaderAssignment_0 : ( ruleColumnHeader ) ;
    public final void rule__Header__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1444:1: ( ( ruleColumnHeader ) )
            // InternalGramaticajmeter.g:1445:2: ( ruleColumnHeader )
            {
            // InternalGramaticajmeter.g:1445:2: ( ruleColumnHeader )
            // InternalGramaticajmeter.g:1446:3: ruleColumnHeader
            {
             before(grammarAccess.getHeaderAccess().getHeaderColumnHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnHeader();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getHeaderColumnHeaderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__HeaderAssignment_0"


    // $ANTLR start "rule__Header__HeaderAssignment_1_1"
    // InternalGramaticajmeter.g:1455:1: rule__Header__HeaderAssignment_1_1 : ( ruleColumnHeader ) ;
    public final void rule__Header__HeaderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1459:1: ( ( ruleColumnHeader ) )
            // InternalGramaticajmeter.g:1460:2: ( ruleColumnHeader )
            {
            // InternalGramaticajmeter.g:1460:2: ( ruleColumnHeader )
            // InternalGramaticajmeter.g:1461:3: ruleColumnHeader
            {
             before(grammarAccess.getHeaderAccess().getHeaderColumnHeaderParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnHeader();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getHeaderColumnHeaderParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__HeaderAssignment_1_1"


    // $ANTLR start "rule__Results__ResultAssignment_0"
    // InternalGramaticajmeter.g:1470:1: rule__Results__ResultAssignment_0 : ( ruleResult ) ;
    public final void rule__Results__ResultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1474:1: ( ( ruleResult ) )
            // InternalGramaticajmeter.g:1475:2: ( ruleResult )
            {
            // InternalGramaticajmeter.g:1475:2: ( ruleResult )
            // InternalGramaticajmeter.g:1476:3: ruleResult
            {
             before(grammarAccess.getResultsAccess().getResultResultParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultsAccess().getResultResultParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__ResultAssignment_0"


    // $ANTLR start "rule__Results__ResultAssignment_1_1"
    // InternalGramaticajmeter.g:1485:1: rule__Results__ResultAssignment_1_1 : ( ruleResult ) ;
    public final void rule__Results__ResultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1489:1: ( ( ruleResult ) )
            // InternalGramaticajmeter.g:1490:2: ( ruleResult )
            {
            // InternalGramaticajmeter.g:1490:2: ( ruleResult )
            // InternalGramaticajmeter.g:1491:3: ruleResult
            {
             before(grammarAccess.getResultsAccess().getResultResultParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultsAccess().getResultResultParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__ResultAssignment_1_1"


    // $ANTLR start "rule__Result__ValueAssignment"
    // InternalGramaticajmeter.g:1500:1: rule__Result__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Result__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1504:1: ( ( RULE_STRING ) )
            // InternalGramaticajmeter.g:1505:2: ( RULE_STRING )
            {
            // InternalGramaticajmeter.g:1505:2: ( RULE_STRING )
            // InternalGramaticajmeter.g:1506:3: RULE_STRING
            {
             before(grammarAccess.getResultAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResultAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__ValueAssignment"


    // $ANTLR start "rule__HeaderJMeter__HeaderAssignment_0"
    // InternalGramaticajmeter.g:1515:1: rule__HeaderJMeter__HeaderAssignment_0 : ( ruleColumnHeaderJMeter ) ;
    public final void rule__HeaderJMeter__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1519:1: ( ( ruleColumnHeaderJMeter ) )
            // InternalGramaticajmeter.g:1520:2: ( ruleColumnHeaderJMeter )
            {
            // InternalGramaticajmeter.g:1520:2: ( ruleColumnHeaderJMeter )
            // InternalGramaticajmeter.g:1521:3: ruleColumnHeaderJMeter
            {
             before(grammarAccess.getHeaderJMeterAccess().getHeaderColumnHeaderJMeterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnHeaderJMeter();

            state._fsp--;

             after(grammarAccess.getHeaderJMeterAccess().getHeaderColumnHeaderJMeterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderJMeter__HeaderAssignment_0"


    // $ANTLR start "rule__HeaderJMeter__HeaderAssignment_1_1"
    // InternalGramaticajmeter.g:1530:1: rule__HeaderJMeter__HeaderAssignment_1_1 : ( ruleColumnHeaderJMeter ) ;
    public final void rule__HeaderJMeter__HeaderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGramaticajmeter.g:1534:1: ( ( ruleColumnHeaderJMeter ) )
            // InternalGramaticajmeter.g:1535:2: ( ruleColumnHeaderJMeter )
            {
            // InternalGramaticajmeter.g:1535:2: ( ruleColumnHeaderJMeter )
            // InternalGramaticajmeter.g:1536:3: ruleColumnHeaderJMeter
            {
             before(grammarAccess.getHeaderJMeterAccess().getHeaderColumnHeaderJMeterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnHeaderJMeter();

            state._fsp--;

             after(grammarAccess.getHeaderJMeterAccess().getHeaderColumnHeaderJMeterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderJMeter__HeaderAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001FFE000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001FFE000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});

}