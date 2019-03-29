package co.edu.uniandes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.services.GramaticajmeterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGramaticajmeterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_STRING", "RULE_COMMA", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architecture='", "'stimulus'", "'minresponsetime'", "'maxresponsetime'", "'averagetime'", "'errorcount'", "'totalreq'", "'threads'", "'averagelatency'", "'minlatency'", "'maxlatency'", "'percentageerror'", "'throughput'", "'timeStamp'", "'elapsed'", "'label'", "'responseCode'", "'responseMessage'", "'threadName'", "'dataType'", "'success'", "'bytes'", "'grpThreads'", "'allThreads'", "'Latency'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_COMMA=6;
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

        public InternalGramaticajmeterParser(TokenStream input, GramaticajmeterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JMeter";
       	}

       	@Override
       	protected GramaticajmeterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJMeter"
    // InternalGramaticajmeter.g:64:1: entryRuleJMeter returns [EObject current=null] : iv_ruleJMeter= ruleJMeter EOF ;
    public final EObject entryRuleJMeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJMeter = null;


        try {
            // InternalGramaticajmeter.g:64:47: (iv_ruleJMeter= ruleJMeter EOF )
            // InternalGramaticajmeter.g:65:2: iv_ruleJMeter= ruleJMeter EOF
            {
             newCompositeNode(grammarAccess.getJMeterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJMeter=ruleJMeter();

            state._fsp--;

             current =iv_ruleJMeter; 
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
    // $ANTLR end "entryRuleJMeter"


    // $ANTLR start "ruleJMeter"
    // InternalGramaticajmeter.g:71:1: ruleJMeter returns [EObject current=null] : ( ( (lv_architectureResults_0_0= ruleArchitectureResults ) ) (this_NL_1= RULE_NL ( (lv_architectureResults_2_0= ruleArchitectureResults ) ) )* (this_NL_3= RULE_NL )? ) ;
    public final EObject ruleJMeter() throws RecognitionException {
        EObject current = null;

        Token this_NL_1=null;
        Token this_NL_3=null;
        EObject lv_architectureResults_0_0 = null;

        EObject lv_architectureResults_2_0 = null;



        	enterRule();

        try {
            // InternalGramaticajmeter.g:77:2: ( ( ( (lv_architectureResults_0_0= ruleArchitectureResults ) ) (this_NL_1= RULE_NL ( (lv_architectureResults_2_0= ruleArchitectureResults ) ) )* (this_NL_3= RULE_NL )? ) )
            // InternalGramaticajmeter.g:78:2: ( ( (lv_architectureResults_0_0= ruleArchitectureResults ) ) (this_NL_1= RULE_NL ( (lv_architectureResults_2_0= ruleArchitectureResults ) ) )* (this_NL_3= RULE_NL )? )
            {
            // InternalGramaticajmeter.g:78:2: ( ( (lv_architectureResults_0_0= ruleArchitectureResults ) ) (this_NL_1= RULE_NL ( (lv_architectureResults_2_0= ruleArchitectureResults ) ) )* (this_NL_3= RULE_NL )? )
            // InternalGramaticajmeter.g:79:3: ( (lv_architectureResults_0_0= ruleArchitectureResults ) ) (this_NL_1= RULE_NL ( (lv_architectureResults_2_0= ruleArchitectureResults ) ) )* (this_NL_3= RULE_NL )?
            {
            // InternalGramaticajmeter.g:79:3: ( (lv_architectureResults_0_0= ruleArchitectureResults ) )
            // InternalGramaticajmeter.g:80:4: (lv_architectureResults_0_0= ruleArchitectureResults )
            {
            // InternalGramaticajmeter.g:80:4: (lv_architectureResults_0_0= ruleArchitectureResults )
            // InternalGramaticajmeter.g:81:5: lv_architectureResults_0_0= ruleArchitectureResults
            {

            					newCompositeNode(grammarAccess.getJMeterAccess().getArchitectureResultsArchitectureResultsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_architectureResults_0_0=ruleArchitectureResults();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJMeterRule());
            					}
            					add(
            						current,
            						"architectureResults",
            						lv_architectureResults_0_0,
            						"co.edu.uniandes.Gramaticajmeter.ArchitectureResults");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramaticajmeter.g:98:3: (this_NL_1= RULE_NL ( (lv_architectureResults_2_0= ruleArchitectureResults ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NL) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==13) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalGramaticajmeter.g:99:4: this_NL_1= RULE_NL ( (lv_architectureResults_2_0= ruleArchitectureResults ) )
            	    {
            	    this_NL_1=(Token)match(input,RULE_NL,FOLLOW_4); 

            	    				newLeafNode(this_NL_1, grammarAccess.getJMeterAccess().getNLTerminalRuleCall_1_0());
            	    			
            	    // InternalGramaticajmeter.g:103:4: ( (lv_architectureResults_2_0= ruleArchitectureResults ) )
            	    // InternalGramaticajmeter.g:104:5: (lv_architectureResults_2_0= ruleArchitectureResults )
            	    {
            	    // InternalGramaticajmeter.g:104:5: (lv_architectureResults_2_0= ruleArchitectureResults )
            	    // InternalGramaticajmeter.g:105:6: lv_architectureResults_2_0= ruleArchitectureResults
            	    {

            	    						newCompositeNode(grammarAccess.getJMeterAccess().getArchitectureResultsArchitectureResultsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_architectureResults_2_0=ruleArchitectureResults();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJMeterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"architectureResults",
            	    							lv_architectureResults_2_0,
            	    							"co.edu.uniandes.Gramaticajmeter.ArchitectureResults");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGramaticajmeter.g:123:3: (this_NL_3= RULE_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramaticajmeter.g:124:4: this_NL_3= RULE_NL
                    {
                    this_NL_3=(Token)match(input,RULE_NL,FOLLOW_2); 

                    				newLeafNode(this_NL_3, grammarAccess.getJMeterAccess().getNLTerminalRuleCall_2());
                    			

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
    // $ANTLR end "ruleJMeter"


    // $ANTLR start "entryRuleArchitectureResults"
    // InternalGramaticajmeter.g:133:1: entryRuleArchitectureResults returns [EObject current=null] : iv_ruleArchitectureResults= ruleArchitectureResults EOF ;
    public final EObject entryRuleArchitectureResults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureResults = null;


        try {
            // InternalGramaticajmeter.g:133:60: (iv_ruleArchitectureResults= ruleArchitectureResults EOF )
            // InternalGramaticajmeter.g:134:2: iv_ruleArchitectureResults= ruleArchitectureResults EOF
            {
             newCompositeNode(grammarAccess.getArchitectureResultsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureResults=ruleArchitectureResults();

            state._fsp--;

             current =iv_ruleArchitectureResults; 
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
    // $ANTLR end "entryRuleArchitectureResults"


    // $ANTLR start "ruleArchitectureResults"
    // InternalGramaticajmeter.g:140:1: ruleArchitectureResults returns [EObject current=null] : (otherlv_0= 'architecture=' ( (lv_architecture_1_0= RULE_STRING ) ) this_NL_2= RULE_NL ( (lv_header_3_0= ruleHeader ) ) this_NL_4= RULE_NL ( (lv_results_5_0= ruleResults ) ) (this_NL_6= RULE_NL ( (lv_results_7_0= ruleResults ) ) )* this_NL_8= RULE_NL ( (lv_headerJMeter_9_0= ruleHeaderJMeter ) ) this_NL_10= RULE_NL ( (lv_resultsJMeter_11_0= ruleResults ) ) (this_NL_12= RULE_NL ( (lv_resultsJMeter_13_0= ruleResults ) ) )* ) ;
    public final EObject ruleArchitectureResults() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_architecture_1_0=null;
        Token this_NL_2=null;
        Token this_NL_4=null;
        Token this_NL_6=null;
        Token this_NL_8=null;
        Token this_NL_10=null;
        Token this_NL_12=null;
        EObject lv_header_3_0 = null;

        EObject lv_results_5_0 = null;

        EObject lv_results_7_0 = null;

        EObject lv_headerJMeter_9_0 = null;

        EObject lv_resultsJMeter_11_0 = null;

        EObject lv_resultsJMeter_13_0 = null;



        	enterRule();

        try {
            // InternalGramaticajmeter.g:146:2: ( (otherlv_0= 'architecture=' ( (lv_architecture_1_0= RULE_STRING ) ) this_NL_2= RULE_NL ( (lv_header_3_0= ruleHeader ) ) this_NL_4= RULE_NL ( (lv_results_5_0= ruleResults ) ) (this_NL_6= RULE_NL ( (lv_results_7_0= ruleResults ) ) )* this_NL_8= RULE_NL ( (lv_headerJMeter_9_0= ruleHeaderJMeter ) ) this_NL_10= RULE_NL ( (lv_resultsJMeter_11_0= ruleResults ) ) (this_NL_12= RULE_NL ( (lv_resultsJMeter_13_0= ruleResults ) ) )* ) )
            // InternalGramaticajmeter.g:147:2: (otherlv_0= 'architecture=' ( (lv_architecture_1_0= RULE_STRING ) ) this_NL_2= RULE_NL ( (lv_header_3_0= ruleHeader ) ) this_NL_4= RULE_NL ( (lv_results_5_0= ruleResults ) ) (this_NL_6= RULE_NL ( (lv_results_7_0= ruleResults ) ) )* this_NL_8= RULE_NL ( (lv_headerJMeter_9_0= ruleHeaderJMeter ) ) this_NL_10= RULE_NL ( (lv_resultsJMeter_11_0= ruleResults ) ) (this_NL_12= RULE_NL ( (lv_resultsJMeter_13_0= ruleResults ) ) )* )
            {
            // InternalGramaticajmeter.g:147:2: (otherlv_0= 'architecture=' ( (lv_architecture_1_0= RULE_STRING ) ) this_NL_2= RULE_NL ( (lv_header_3_0= ruleHeader ) ) this_NL_4= RULE_NL ( (lv_results_5_0= ruleResults ) ) (this_NL_6= RULE_NL ( (lv_results_7_0= ruleResults ) ) )* this_NL_8= RULE_NL ( (lv_headerJMeter_9_0= ruleHeaderJMeter ) ) this_NL_10= RULE_NL ( (lv_resultsJMeter_11_0= ruleResults ) ) (this_NL_12= RULE_NL ( (lv_resultsJMeter_13_0= ruleResults ) ) )* )
            // InternalGramaticajmeter.g:148:3: otherlv_0= 'architecture=' ( (lv_architecture_1_0= RULE_STRING ) ) this_NL_2= RULE_NL ( (lv_header_3_0= ruleHeader ) ) this_NL_4= RULE_NL ( (lv_results_5_0= ruleResults ) ) (this_NL_6= RULE_NL ( (lv_results_7_0= ruleResults ) ) )* this_NL_8= RULE_NL ( (lv_headerJMeter_9_0= ruleHeaderJMeter ) ) this_NL_10= RULE_NL ( (lv_resultsJMeter_11_0= ruleResults ) ) (this_NL_12= RULE_NL ( (lv_resultsJMeter_13_0= ruleResults ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureResultsAccess().getArchitectureKeyword_0());
            		
            // InternalGramaticajmeter.g:152:3: ( (lv_architecture_1_0= RULE_STRING ) )
            // InternalGramaticajmeter.g:153:4: (lv_architecture_1_0= RULE_STRING )
            {
            // InternalGramaticajmeter.g:153:4: (lv_architecture_1_0= RULE_STRING )
            // InternalGramaticajmeter.g:154:5: lv_architecture_1_0= RULE_STRING
            {
            lv_architecture_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_architecture_1_0, grammarAccess.getArchitectureResultsAccess().getArchitectureSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchitectureResultsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"architecture",
            						lv_architecture_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_NL_2=(Token)match(input,RULE_NL,FOLLOW_7); 

            			newLeafNode(this_NL_2, grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_2());
            		
            // InternalGramaticajmeter.g:174:3: ( (lv_header_3_0= ruleHeader ) )
            // InternalGramaticajmeter.g:175:4: (lv_header_3_0= ruleHeader )
            {
            // InternalGramaticajmeter.g:175:4: (lv_header_3_0= ruleHeader )
            // InternalGramaticajmeter.g:176:5: lv_header_3_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getArchitectureResultsAccess().getHeaderHeaderParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_header_3_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureResultsRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_3_0,
            						"co.edu.uniandes.Gramaticajmeter.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_NL_4=(Token)match(input,RULE_NL,FOLLOW_5); 

            			newLeafNode(this_NL_4, grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_4());
            		
            // InternalGramaticajmeter.g:197:3: ( (lv_results_5_0= ruleResults ) )
            // InternalGramaticajmeter.g:198:4: (lv_results_5_0= ruleResults )
            {
            // InternalGramaticajmeter.g:198:4: (lv_results_5_0= ruleResults )
            // InternalGramaticajmeter.g:199:5: lv_results_5_0= ruleResults
            {

            					newCompositeNode(grammarAccess.getArchitectureResultsAccess().getResultsResultsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_results_5_0=ruleResults();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureResultsRule());
            					}
            					add(
            						current,
            						"results",
            						lv_results_5_0,
            						"co.edu.uniandes.Gramaticajmeter.Results");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramaticajmeter.g:216:3: (this_NL_6= RULE_NL ( (lv_results_7_0= ruleResults ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NL) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_STRING) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalGramaticajmeter.g:217:4: this_NL_6= RULE_NL ( (lv_results_7_0= ruleResults ) )
            	    {
            	    this_NL_6=(Token)match(input,RULE_NL,FOLLOW_5); 

            	    				newLeafNode(this_NL_6, grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_6_0());
            	    			
            	    // InternalGramaticajmeter.g:221:4: ( (lv_results_7_0= ruleResults ) )
            	    // InternalGramaticajmeter.g:222:5: (lv_results_7_0= ruleResults )
            	    {
            	    // InternalGramaticajmeter.g:222:5: (lv_results_7_0= ruleResults )
            	    // InternalGramaticajmeter.g:223:6: lv_results_7_0= ruleResults
            	    {

            	    						newCompositeNode(grammarAccess.getArchitectureResultsAccess().getResultsResultsParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_results_7_0=ruleResults();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArchitectureResultsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"results",
            	    							lv_results_7_0,
            	    							"co.edu.uniandes.Gramaticajmeter.Results");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_NL_8=(Token)match(input,RULE_NL,FOLLOW_8); 

            			newLeafNode(this_NL_8, grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_7());
            		
            // InternalGramaticajmeter.g:245:3: ( (lv_headerJMeter_9_0= ruleHeaderJMeter ) )
            // InternalGramaticajmeter.g:246:4: (lv_headerJMeter_9_0= ruleHeaderJMeter )
            {
            // InternalGramaticajmeter.g:246:4: (lv_headerJMeter_9_0= ruleHeaderJMeter )
            // InternalGramaticajmeter.g:247:5: lv_headerJMeter_9_0= ruleHeaderJMeter
            {

            					newCompositeNode(grammarAccess.getArchitectureResultsAccess().getHeaderJMeterHeaderJMeterParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_headerJMeter_9_0=ruleHeaderJMeter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureResultsRule());
            					}
            					set(
            						current,
            						"headerJMeter",
            						lv_headerJMeter_9_0,
            						"co.edu.uniandes.Gramaticajmeter.HeaderJMeter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_NL_10=(Token)match(input,RULE_NL,FOLLOW_5); 

            			newLeafNode(this_NL_10, grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_9());
            		
            // InternalGramaticajmeter.g:268:3: ( (lv_resultsJMeter_11_0= ruleResults ) )
            // InternalGramaticajmeter.g:269:4: (lv_resultsJMeter_11_0= ruleResults )
            {
            // InternalGramaticajmeter.g:269:4: (lv_resultsJMeter_11_0= ruleResults )
            // InternalGramaticajmeter.g:270:5: lv_resultsJMeter_11_0= ruleResults
            {

            					newCompositeNode(grammarAccess.getArchitectureResultsAccess().getResultsJMeterResultsParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_3);
            lv_resultsJMeter_11_0=ruleResults();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureResultsRule());
            					}
            					add(
            						current,
            						"resultsJMeter",
            						lv_resultsJMeter_11_0,
            						"co.edu.uniandes.Gramaticajmeter.Results");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramaticajmeter.g:287:3: (this_NL_12= RULE_NL ( (lv_resultsJMeter_13_0= ruleResults ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NL) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_STRING) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalGramaticajmeter.g:288:4: this_NL_12= RULE_NL ( (lv_resultsJMeter_13_0= ruleResults ) )
            	    {
            	    this_NL_12=(Token)match(input,RULE_NL,FOLLOW_5); 

            	    				newLeafNode(this_NL_12, grammarAccess.getArchitectureResultsAccess().getNLTerminalRuleCall_11_0());
            	    			
            	    // InternalGramaticajmeter.g:292:4: ( (lv_resultsJMeter_13_0= ruleResults ) )
            	    // InternalGramaticajmeter.g:293:5: (lv_resultsJMeter_13_0= ruleResults )
            	    {
            	    // InternalGramaticajmeter.g:293:5: (lv_resultsJMeter_13_0= ruleResults )
            	    // InternalGramaticajmeter.g:294:6: lv_resultsJMeter_13_0= ruleResults
            	    {

            	    						newCompositeNode(grammarAccess.getArchitectureResultsAccess().getResultsJMeterResultsParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_resultsJMeter_13_0=ruleResults();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArchitectureResultsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"resultsJMeter",
            	    							lv_resultsJMeter_13_0,
            	    							"co.edu.uniandes.Gramaticajmeter.Results");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleArchitectureResults"


    // $ANTLR start "entryRuleHeader"
    // InternalGramaticajmeter.g:316:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalGramaticajmeter.g:316:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalGramaticajmeter.g:317:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalGramaticajmeter.g:323:1: ruleHeader returns [EObject current=null] : ( ( (lv_header_0_0= ruleColumnHeader ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeader ) ) )* ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken lv_header_0_0 = null;

        AntlrDatatypeRuleToken lv_header_2_0 = null;



        	enterRule();

        try {
            // InternalGramaticajmeter.g:329:2: ( ( ( (lv_header_0_0= ruleColumnHeader ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeader ) ) )* ) )
            // InternalGramaticajmeter.g:330:2: ( ( (lv_header_0_0= ruleColumnHeader ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeader ) ) )* )
            {
            // InternalGramaticajmeter.g:330:2: ( ( (lv_header_0_0= ruleColumnHeader ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeader ) ) )* )
            // InternalGramaticajmeter.g:331:3: ( (lv_header_0_0= ruleColumnHeader ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeader ) ) )*
            {
            // InternalGramaticajmeter.g:331:3: ( (lv_header_0_0= ruleColumnHeader ) )
            // InternalGramaticajmeter.g:332:4: (lv_header_0_0= ruleColumnHeader )
            {
            // InternalGramaticajmeter.g:332:4: (lv_header_0_0= ruleColumnHeader )
            // InternalGramaticajmeter.g:333:5: lv_header_0_0= ruleColumnHeader
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getHeaderColumnHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_header_0_0=ruleColumnHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					add(
            						current,
            						"header",
            						lv_header_0_0,
            						"co.edu.uniandes.Gramaticajmeter.ColumnHeader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramaticajmeter.g:350:3: (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeader ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGramaticajmeter.g:351:4: this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeader ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            	    				newLeafNode(this_COMMA_1, grammarAccess.getHeaderAccess().getCOMMATerminalRuleCall_1_0());
            	    			
            	    // InternalGramaticajmeter.g:355:4: ( (lv_header_2_0= ruleColumnHeader ) )
            	    // InternalGramaticajmeter.g:356:5: (lv_header_2_0= ruleColumnHeader )
            	    {
            	    // InternalGramaticajmeter.g:356:5: (lv_header_2_0= ruleColumnHeader )
            	    // InternalGramaticajmeter.g:357:6: lv_header_2_0= ruleColumnHeader
            	    {

            	    						newCompositeNode(grammarAccess.getHeaderAccess().getHeaderColumnHeaderParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_header_2_0=ruleColumnHeader();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"header",
            	    							lv_header_2_0,
            	    							"co.edu.uniandes.Gramaticajmeter.ColumnHeader");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleResults"
    // InternalGramaticajmeter.g:379:1: entryRuleResults returns [EObject current=null] : iv_ruleResults= ruleResults EOF ;
    public final EObject entryRuleResults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResults = null;


        try {
            // InternalGramaticajmeter.g:379:48: (iv_ruleResults= ruleResults EOF )
            // InternalGramaticajmeter.g:380:2: iv_ruleResults= ruleResults EOF
            {
             newCompositeNode(grammarAccess.getResultsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResults=ruleResults();

            state._fsp--;

             current =iv_ruleResults; 
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
    // $ANTLR end "entryRuleResults"


    // $ANTLR start "ruleResults"
    // InternalGramaticajmeter.g:386:1: ruleResults returns [EObject current=null] : ( ( (lv_result_0_0= ruleResult ) ) (this_COMMA_1= RULE_COMMA ( (lv_result_2_0= ruleResult ) ) )* ) ;
    public final EObject ruleResults() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_result_0_0 = null;

        EObject lv_result_2_0 = null;



        	enterRule();

        try {
            // InternalGramaticajmeter.g:392:2: ( ( ( (lv_result_0_0= ruleResult ) ) (this_COMMA_1= RULE_COMMA ( (lv_result_2_0= ruleResult ) ) )* ) )
            // InternalGramaticajmeter.g:393:2: ( ( (lv_result_0_0= ruleResult ) ) (this_COMMA_1= RULE_COMMA ( (lv_result_2_0= ruleResult ) ) )* )
            {
            // InternalGramaticajmeter.g:393:2: ( ( (lv_result_0_0= ruleResult ) ) (this_COMMA_1= RULE_COMMA ( (lv_result_2_0= ruleResult ) ) )* )
            // InternalGramaticajmeter.g:394:3: ( (lv_result_0_0= ruleResult ) ) (this_COMMA_1= RULE_COMMA ( (lv_result_2_0= ruleResult ) ) )*
            {
            // InternalGramaticajmeter.g:394:3: ( (lv_result_0_0= ruleResult ) )
            // InternalGramaticajmeter.g:395:4: (lv_result_0_0= ruleResult )
            {
            // InternalGramaticajmeter.g:395:4: (lv_result_0_0= ruleResult )
            // InternalGramaticajmeter.g:396:5: lv_result_0_0= ruleResult
            {

            					newCompositeNode(grammarAccess.getResultsAccess().getResultResultParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_result_0_0=ruleResult();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResultsRule());
            					}
            					add(
            						current,
            						"result",
            						lv_result_0_0,
            						"co.edu.uniandes.Gramaticajmeter.Result");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramaticajmeter.g:413:3: (this_COMMA_1= RULE_COMMA ( (lv_result_2_0= ruleResult ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGramaticajmeter.g:414:4: this_COMMA_1= RULE_COMMA ( (lv_result_2_0= ruleResult ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_5); 

            	    				newLeafNode(this_COMMA_1, grammarAccess.getResultsAccess().getCOMMATerminalRuleCall_1_0());
            	    			
            	    // InternalGramaticajmeter.g:418:4: ( (lv_result_2_0= ruleResult ) )
            	    // InternalGramaticajmeter.g:419:5: (lv_result_2_0= ruleResult )
            	    {
            	    // InternalGramaticajmeter.g:419:5: (lv_result_2_0= ruleResult )
            	    // InternalGramaticajmeter.g:420:6: lv_result_2_0= ruleResult
            	    {

            	    						newCompositeNode(grammarAccess.getResultsAccess().getResultResultParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_result_2_0=ruleResult();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResultsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"result",
            	    							lv_result_2_0,
            	    							"co.edu.uniandes.Gramaticajmeter.Result");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleResults"


    // $ANTLR start "entryRuleColumnHeader"
    // InternalGramaticajmeter.g:442:1: entryRuleColumnHeader returns [String current=null] : iv_ruleColumnHeader= ruleColumnHeader EOF ;
    public final String entryRuleColumnHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColumnHeader = null;


        try {
            // InternalGramaticajmeter.g:442:52: (iv_ruleColumnHeader= ruleColumnHeader EOF )
            // InternalGramaticajmeter.g:443:2: iv_ruleColumnHeader= ruleColumnHeader EOF
            {
             newCompositeNode(grammarAccess.getColumnHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnHeader=ruleColumnHeader();

            state._fsp--;

             current =iv_ruleColumnHeader.getText(); 
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
    // $ANTLR end "entryRuleColumnHeader"


    // $ANTLR start "ruleColumnHeader"
    // InternalGramaticajmeter.g:449:1: ruleColumnHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'stimulus' | kw= 'minresponsetime' | kw= 'maxresponsetime' | kw= 'averagetime' | kw= 'errorcount' | kw= 'totalreq' | kw= 'threads' | kw= 'averagelatency' | kw= 'minlatency' | kw= 'maxlatency' | kw= 'percentageerror' | kw= 'throughput' ) ;
    public final AntlrDatatypeRuleToken ruleColumnHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramaticajmeter.g:455:2: ( (kw= 'stimulus' | kw= 'minresponsetime' | kw= 'maxresponsetime' | kw= 'averagetime' | kw= 'errorcount' | kw= 'totalreq' | kw= 'threads' | kw= 'averagelatency' | kw= 'minlatency' | kw= 'maxlatency' | kw= 'percentageerror' | kw= 'throughput' ) )
            // InternalGramaticajmeter.g:456:2: (kw= 'stimulus' | kw= 'minresponsetime' | kw= 'maxresponsetime' | kw= 'averagetime' | kw= 'errorcount' | kw= 'totalreq' | kw= 'threads' | kw= 'averagelatency' | kw= 'minlatency' | kw= 'maxlatency' | kw= 'percentageerror' | kw= 'throughput' )
            {
            // InternalGramaticajmeter.g:456:2: (kw= 'stimulus' | kw= 'minresponsetime' | kw= 'maxresponsetime' | kw= 'averagetime' | kw= 'errorcount' | kw= 'totalreq' | kw= 'threads' | kw= 'averagelatency' | kw= 'minlatency' | kw= 'maxlatency' | kw= 'percentageerror' | kw= 'throughput' )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 20:
                {
                alt7=7;
                }
                break;
            case 21:
                {
                alt7=8;
                }
                break;
            case 22:
                {
                alt7=9;
                }
                break;
            case 23:
                {
                alt7=10;
                }
                break;
            case 24:
                {
                alt7=11;
                }
                break;
            case 25:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGramaticajmeter.g:457:3: kw= 'stimulus'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getStimulusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGramaticajmeter.g:463:3: kw= 'minresponsetime'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getMinresponsetimeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGramaticajmeter.g:469:3: kw= 'maxresponsetime'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getMaxresponsetimeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGramaticajmeter.g:475:3: kw= 'averagetime'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getAveragetimeKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGramaticajmeter.g:481:3: kw= 'errorcount'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getErrorcountKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGramaticajmeter.g:487:3: kw= 'totalreq'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getTotalreqKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGramaticajmeter.g:493:3: kw= 'threads'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getThreadsKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalGramaticajmeter.g:499:3: kw= 'averagelatency'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getAveragelatencyKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalGramaticajmeter.g:505:3: kw= 'minlatency'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getMinlatencyKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalGramaticajmeter.g:511:3: kw= 'maxlatency'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getMaxlatencyKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalGramaticajmeter.g:517:3: kw= 'percentageerror'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getPercentageerrorKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalGramaticajmeter.g:523:3: kw= 'throughput'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderAccess().getThroughputKeyword_11());
                    		

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
    // $ANTLR end "ruleColumnHeader"


    // $ANTLR start "entryRuleResult"
    // InternalGramaticajmeter.g:532:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalGramaticajmeter.g:532:47: (iv_ruleResult= ruleResult EOF )
            // InternalGramaticajmeter.g:533:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGramaticajmeter.g:539:1: ruleResult returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGramaticajmeter.g:545:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalGramaticajmeter.g:546:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalGramaticajmeter.g:546:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalGramaticajmeter.g:547:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalGramaticajmeter.g:547:3: (lv_value_0_0= RULE_STRING )
            // InternalGramaticajmeter.g:548:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getResultAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getResultRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleHeaderJMeter"
    // InternalGramaticajmeter.g:567:1: entryRuleHeaderJMeter returns [EObject current=null] : iv_ruleHeaderJMeter= ruleHeaderJMeter EOF ;
    public final EObject entryRuleHeaderJMeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderJMeter = null;


        try {
            // InternalGramaticajmeter.g:567:53: (iv_ruleHeaderJMeter= ruleHeaderJMeter EOF )
            // InternalGramaticajmeter.g:568:2: iv_ruleHeaderJMeter= ruleHeaderJMeter EOF
            {
             newCompositeNode(grammarAccess.getHeaderJMeterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderJMeter=ruleHeaderJMeter();

            state._fsp--;

             current =iv_ruleHeaderJMeter; 
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
    // $ANTLR end "entryRuleHeaderJMeter"


    // $ANTLR start "ruleHeaderJMeter"
    // InternalGramaticajmeter.g:574:1: ruleHeaderJMeter returns [EObject current=null] : ( ( (lv_header_0_0= ruleColumnHeaderJMeter ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeaderJMeter ) ) )* ) ;
    public final EObject ruleHeaderJMeter() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken lv_header_0_0 = null;

        AntlrDatatypeRuleToken lv_header_2_0 = null;



        	enterRule();

        try {
            // InternalGramaticajmeter.g:580:2: ( ( ( (lv_header_0_0= ruleColumnHeaderJMeter ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeaderJMeter ) ) )* ) )
            // InternalGramaticajmeter.g:581:2: ( ( (lv_header_0_0= ruleColumnHeaderJMeter ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeaderJMeter ) ) )* )
            {
            // InternalGramaticajmeter.g:581:2: ( ( (lv_header_0_0= ruleColumnHeaderJMeter ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeaderJMeter ) ) )* )
            // InternalGramaticajmeter.g:582:3: ( (lv_header_0_0= ruleColumnHeaderJMeter ) ) (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeaderJMeter ) ) )*
            {
            // InternalGramaticajmeter.g:582:3: ( (lv_header_0_0= ruleColumnHeaderJMeter ) )
            // InternalGramaticajmeter.g:583:4: (lv_header_0_0= ruleColumnHeaderJMeter )
            {
            // InternalGramaticajmeter.g:583:4: (lv_header_0_0= ruleColumnHeaderJMeter )
            // InternalGramaticajmeter.g:584:5: lv_header_0_0= ruleColumnHeaderJMeter
            {

            					newCompositeNode(grammarAccess.getHeaderJMeterAccess().getHeaderColumnHeaderJMeterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_header_0_0=ruleColumnHeaderJMeter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderJMeterRule());
            					}
            					add(
            						current,
            						"header",
            						lv_header_0_0,
            						"co.edu.uniandes.Gramaticajmeter.ColumnHeaderJMeter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGramaticajmeter.g:601:3: (this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeaderJMeter ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGramaticajmeter.g:602:4: this_COMMA_1= RULE_COMMA ( (lv_header_2_0= ruleColumnHeaderJMeter ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_1, grammarAccess.getHeaderJMeterAccess().getCOMMATerminalRuleCall_1_0());
            	    			
            	    // InternalGramaticajmeter.g:606:4: ( (lv_header_2_0= ruleColumnHeaderJMeter ) )
            	    // InternalGramaticajmeter.g:607:5: (lv_header_2_0= ruleColumnHeaderJMeter )
            	    {
            	    // InternalGramaticajmeter.g:607:5: (lv_header_2_0= ruleColumnHeaderJMeter )
            	    // InternalGramaticajmeter.g:608:6: lv_header_2_0= ruleColumnHeaderJMeter
            	    {

            	    						newCompositeNode(grammarAccess.getHeaderJMeterAccess().getHeaderColumnHeaderJMeterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_header_2_0=ruleColumnHeaderJMeter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHeaderJMeterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"header",
            	    							lv_header_2_0,
            	    							"co.edu.uniandes.Gramaticajmeter.ColumnHeaderJMeter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleHeaderJMeter"


    // $ANTLR start "entryRuleColumnHeaderJMeter"
    // InternalGramaticajmeter.g:630:1: entryRuleColumnHeaderJMeter returns [String current=null] : iv_ruleColumnHeaderJMeter= ruleColumnHeaderJMeter EOF ;
    public final String entryRuleColumnHeaderJMeter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColumnHeaderJMeter = null;


        try {
            // InternalGramaticajmeter.g:630:58: (iv_ruleColumnHeaderJMeter= ruleColumnHeaderJMeter EOF )
            // InternalGramaticajmeter.g:631:2: iv_ruleColumnHeaderJMeter= ruleColumnHeaderJMeter EOF
            {
             newCompositeNode(grammarAccess.getColumnHeaderJMeterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnHeaderJMeter=ruleColumnHeaderJMeter();

            state._fsp--;

             current =iv_ruleColumnHeaderJMeter.getText(); 
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
    // $ANTLR end "entryRuleColumnHeaderJMeter"


    // $ANTLR start "ruleColumnHeaderJMeter"
    // InternalGramaticajmeter.g:637:1: ruleColumnHeaderJMeter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'timeStamp' | kw= 'elapsed' | kw= 'label' | kw= 'responseCode' | kw= 'responseMessage' | kw= 'threadName' | kw= 'dataType' | kw= 'success' | kw= 'bytes' | kw= 'grpThreads' | kw= 'allThreads' | kw= 'Latency' ) ;
    public final AntlrDatatypeRuleToken ruleColumnHeaderJMeter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGramaticajmeter.g:643:2: ( (kw= 'timeStamp' | kw= 'elapsed' | kw= 'label' | kw= 'responseCode' | kw= 'responseMessage' | kw= 'threadName' | kw= 'dataType' | kw= 'success' | kw= 'bytes' | kw= 'grpThreads' | kw= 'allThreads' | kw= 'Latency' ) )
            // InternalGramaticajmeter.g:644:2: (kw= 'timeStamp' | kw= 'elapsed' | kw= 'label' | kw= 'responseCode' | kw= 'responseMessage' | kw= 'threadName' | kw= 'dataType' | kw= 'success' | kw= 'bytes' | kw= 'grpThreads' | kw= 'allThreads' | kw= 'Latency' )
            {
            // InternalGramaticajmeter.g:644:2: (kw= 'timeStamp' | kw= 'elapsed' | kw= 'label' | kw= 'responseCode' | kw= 'responseMessage' | kw= 'threadName' | kw= 'dataType' | kw= 'success' | kw= 'bytes' | kw= 'grpThreads' | kw= 'allThreads' | kw= 'Latency' )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            case 31:
                {
                alt9=6;
                }
                break;
            case 32:
                {
                alt9=7;
                }
                break;
            case 33:
                {
                alt9=8;
                }
                break;
            case 34:
                {
                alt9=9;
                }
                break;
            case 35:
                {
                alt9=10;
                }
                break;
            case 36:
                {
                alt9=11;
                }
                break;
            case 37:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGramaticajmeter.g:645:3: kw= 'timeStamp'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getTimeStampKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGramaticajmeter.g:651:3: kw= 'elapsed'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getElapsedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGramaticajmeter.g:657:3: kw= 'label'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getLabelKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGramaticajmeter.g:663:3: kw= 'responseCode'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getResponseCodeKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGramaticajmeter.g:669:3: kw= 'responseMessage'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getResponseMessageKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGramaticajmeter.g:675:3: kw= 'threadName'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getThreadNameKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGramaticajmeter.g:681:3: kw= 'dataType'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getDataTypeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalGramaticajmeter.g:687:3: kw= 'success'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getSuccessKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalGramaticajmeter.g:693:3: kw= 'bytes'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getBytesKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalGramaticajmeter.g:699:3: kw= 'grpThreads'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getGrpThreadsKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalGramaticajmeter.g:705:3: kw= 'allThreads'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getAllThreadsKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalGramaticajmeter.g:711:3: kw= 'Latency'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnHeaderJMeterAccess().getLatencyKeyword_11());
                    		

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
    // $ANTLR end "ruleColumnHeaderJMeter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003FFC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003FFC000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});

}