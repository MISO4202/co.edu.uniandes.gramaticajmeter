package co.edu.uniandes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGramaticajmeterLexer extends Lexer {
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

    public InternalGramaticajmeterLexer() {;} 
    public InternalGramaticajmeterLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGramaticajmeterLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGramaticajmeter.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:11:7: ( 'architecture=' )
            // InternalGramaticajmeter.g:11:9: 'architecture='
            {
            match("architecture="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:12:7: ( 'stimulus' )
            // InternalGramaticajmeter.g:12:9: 'stimulus'
            {
            match("stimulus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:13:7: ( 'minresponsetime' )
            // InternalGramaticajmeter.g:13:9: 'minresponsetime'
            {
            match("minresponsetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:14:7: ( 'maxresponsetime' )
            // InternalGramaticajmeter.g:14:9: 'maxresponsetime'
            {
            match("maxresponsetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:15:7: ( 'averagetime' )
            // InternalGramaticajmeter.g:15:9: 'averagetime'
            {
            match("averagetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:16:7: ( 'errorcount' )
            // InternalGramaticajmeter.g:16:9: 'errorcount'
            {
            match("errorcount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:17:7: ( 'totalreq' )
            // InternalGramaticajmeter.g:17:9: 'totalreq'
            {
            match("totalreq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:18:7: ( 'threads' )
            // InternalGramaticajmeter.g:18:9: 'threads'
            {
            match("threads"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:19:7: ( 'averagelatency' )
            // InternalGramaticajmeter.g:19:9: 'averagelatency'
            {
            match("averagelatency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:20:7: ( 'minlatency' )
            // InternalGramaticajmeter.g:20:9: 'minlatency'
            {
            match("minlatency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:21:7: ( 'maxlatency' )
            // InternalGramaticajmeter.g:21:9: 'maxlatency'
            {
            match("maxlatency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:22:7: ( 'percentageerror' )
            // InternalGramaticajmeter.g:22:9: 'percentageerror'
            {
            match("percentageerror"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:23:7: ( 'throughput' )
            // InternalGramaticajmeter.g:23:9: 'throughput'
            {
            match("throughput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:24:7: ( 'timeStamp' )
            // InternalGramaticajmeter.g:24:9: 'timeStamp'
            {
            match("timeStamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:25:7: ( 'elapsed' )
            // InternalGramaticajmeter.g:25:9: 'elapsed'
            {
            match("elapsed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:26:7: ( 'label' )
            // InternalGramaticajmeter.g:26:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:27:7: ( 'responseCode' )
            // InternalGramaticajmeter.g:27:9: 'responseCode'
            {
            match("responseCode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:28:7: ( 'responseMessage' )
            // InternalGramaticajmeter.g:28:9: 'responseMessage'
            {
            match("responseMessage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:29:7: ( 'threadName' )
            // InternalGramaticajmeter.g:29:9: 'threadName'
            {
            match("threadName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:30:7: ( 'dataType' )
            // InternalGramaticajmeter.g:30:9: 'dataType'
            {
            match("dataType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:31:7: ( 'success' )
            // InternalGramaticajmeter.g:31:9: 'success'
            {
            match("success"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:32:7: ( 'bytes' )
            // InternalGramaticajmeter.g:32:9: 'bytes'
            {
            match("bytes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:33:7: ( 'grpThreads' )
            // InternalGramaticajmeter.g:33:9: 'grpThreads'
            {
            match("grpThreads"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:34:7: ( 'allThreads' )
            // InternalGramaticajmeter.g:34:9: 'allThreads'
            {
            match("allThreads"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:35:7: ( 'Latency' )
            // InternalGramaticajmeter.g:35:9: 'Latency'
            {
            match("Latency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:719:12: ( ',' )
            // InternalGramaticajmeter.g:719:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:721:9: ( ( '\\r' )? '\\n' )
            // InternalGramaticajmeter.g:721:11: ( '\\r' )? '\\n'
            {
            // InternalGramaticajmeter.g:721:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGramaticajmeter.g:721:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:723:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGramaticajmeter.g:723:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGramaticajmeter.g:723:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGramaticajmeter.g:723:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGramaticajmeter.g:723:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGramaticajmeter.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:725:10: ( ( '0' .. '9' )+ )
            // InternalGramaticajmeter.g:725:12: ( '0' .. '9' )+
            {
            // InternalGramaticajmeter.g:725:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGramaticajmeter.g:725:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:727:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGramaticajmeter.g:727:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGramaticajmeter.g:727:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGramaticajmeter.g:727:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGramaticajmeter.g:727:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGramaticajmeter.g:727:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGramaticajmeter.g:727:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGramaticajmeter.g:727:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGramaticajmeter.g:727:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGramaticajmeter.g:727:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGramaticajmeter.g:727:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:729:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGramaticajmeter.g:729:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGramaticajmeter.g:729:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGramaticajmeter.g:729:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:731:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGramaticajmeter.g:731:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGramaticajmeter.g:731:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGramaticajmeter.g:731:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGramaticajmeter.g:731:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGramaticajmeter.g:731:41: ( '\\r' )? '\\n'
                    {
                    // InternalGramaticajmeter.g:731:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGramaticajmeter.g:731:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:733:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGramaticajmeter.g:733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGramaticajmeter.g:733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGramaticajmeter.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGramaticajmeter.g:735:16: ( . )
            // InternalGramaticajmeter.g:735:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGramaticajmeter.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_COMMA | RULE_NL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=34;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalGramaticajmeter.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalGramaticajmeter.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalGramaticajmeter.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalGramaticajmeter.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalGramaticajmeter.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalGramaticajmeter.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalGramaticajmeter.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalGramaticajmeter.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalGramaticajmeter.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalGramaticajmeter.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalGramaticajmeter.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalGramaticajmeter.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalGramaticajmeter.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalGramaticajmeter.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalGramaticajmeter.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalGramaticajmeter.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalGramaticajmeter.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalGramaticajmeter.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalGramaticajmeter.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalGramaticajmeter.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalGramaticajmeter.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalGramaticajmeter.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalGramaticajmeter.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalGramaticajmeter.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalGramaticajmeter.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalGramaticajmeter.g:1:160: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 27 :
                // InternalGramaticajmeter.g:1:171: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 28 :
                // InternalGramaticajmeter.g:1:179: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalGramaticajmeter.g:1:187: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalGramaticajmeter.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalGramaticajmeter.g:1:208: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalGramaticajmeter.g:1:224: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalGramaticajmeter.g:1:240: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalGramaticajmeter.g:1:248: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\14\33\1\uffff\1\55\1\57\1\27\2\uffff\3\27\2\uffff\3\33\1\uffff\20\33\2\uffff\1\57\5\uffff\71\33\1\u0083\2\33\1\u0086\22\33\1\uffff\2\33\1\uffff\6\33\1\u00a3\5\33\1\u00a9\1\33\1\u00ab\7\33\1\u00b3\4\33\1\u00b8\1\uffff\5\33\1\uffff\1\u00be\1\uffff\5\33\1\u00c5\1\33\1\uffff\4\33\1\uffff\5\33\1\uffff\2\33\1\u00d2\3\33\1\uffff\4\33\1\u00da\1\33\1\u00dc\1\33\1\u00de\1\u00df\1\u00e0\1\u00e1\1\uffff\3\33\1\u00e5\1\33\1\u00e7\1\33\1\uffff\1\33\1\uffff\1\33\4\uffff\3\33\1\uffff\1\33\1\uffff\4\33\1\u00f3\1\33\1\uffff\4\33\1\uffff\1\33\1\u00fa\4\33\1\uffff\1\u00ff\1\u0100\1\u0101\1\u0102\4\uffff";
    static final String DFA13_eofS =
        "\u0103\uffff";
    static final String DFA13_minS =
        "\1\0\1\154\1\164\1\141\1\154\1\150\1\145\1\141\1\145\1\141\1\171\1\162\1\141\1\uffff\1\12\1\11\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\145\1\154\1\uffff\1\151\1\143\1\156\1\170\1\162\1\141\1\164\1\162\1\155\1\162\1\142\1\163\2\164\1\160\1\164\2\uffff\1\11\5\uffff\1\150\1\162\1\124\1\155\1\143\2\154\1\157\1\160\1\141\2\145\1\143\1\145\1\160\1\141\1\145\1\124\1\145\1\151\1\141\1\150\1\165\2\145\1\141\1\145\1\141\1\162\1\163\1\154\1\141\1\165\1\123\1\145\1\154\1\157\1\124\1\163\1\150\1\156\1\164\1\147\1\162\1\154\2\163\1\164\1\163\1\164\1\143\1\145\1\162\1\144\1\147\1\164\1\156\1\60\1\156\1\171\1\60\1\162\1\143\3\145\1\165\1\163\1\160\1\145\1\160\1\145\1\157\1\144\1\145\1\116\1\150\1\141\1\164\1\uffff\1\163\1\160\1\uffff\1\145\1\171\1\143\1\154\1\141\1\163\1\60\1\157\1\156\1\157\1\156\1\165\1\60\1\161\1\60\1\141\1\160\1\155\1\141\2\145\1\141\1\60\1\164\1\151\1\141\1\144\1\60\1\uffff\1\156\1\143\1\156\1\143\1\156\1\uffff\1\60\1\uffff\1\155\1\165\1\160\1\147\1\103\1\60\1\144\1\uffff\1\165\1\155\1\164\1\163\1\uffff\1\163\1\171\1\163\1\171\1\164\1\uffff\1\145\1\164\1\60\1\145\1\157\1\145\1\uffff\1\163\1\162\2\145\1\60\1\145\1\60\1\145\4\60\1\uffff\1\145\1\144\1\163\1\60\1\145\1\60\1\156\1\uffff\1\164\1\uffff\1\164\4\uffff\1\162\1\145\1\163\1\uffff\1\75\1\uffff\1\143\2\151\1\162\1\60\1\141\1\uffff\1\171\2\155\1\157\1\uffff\1\147\1\60\2\145\1\162\1\145\1\uffff\4\60\4\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\166\1\165\1\151\1\162\1\157\1\145\1\141\1\145\1\141\1\171\1\162\1\141\1\uffff\1\12\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\145\1\154\1\uffff\1\151\1\143\1\156\1\170\1\162\1\141\1\164\1\162\1\155\1\162\1\142\1\163\2\164\1\160\1\164\2\uffff\1\40\5\uffff\1\150\1\162\1\124\1\155\1\143\2\162\1\157\1\160\1\141\1\157\1\145\1\143\1\145\1\160\1\141\1\145\1\124\1\145\1\151\1\141\1\150\1\165\2\145\1\141\1\145\1\141\1\162\1\163\1\154\1\141\1\165\1\123\1\145\1\154\1\157\1\124\1\163\1\150\1\156\1\164\1\147\1\162\1\154\2\163\1\164\1\163\1\164\1\143\1\145\1\162\1\144\1\147\1\164\1\156\1\172\1\156\1\171\1\172\1\162\1\143\3\145\1\165\1\163\1\160\1\145\1\160\1\145\1\157\1\144\1\145\1\163\1\150\1\141\1\164\1\uffff\1\163\1\160\1\uffff\1\145\1\171\1\143\1\164\1\141\1\163\1\172\1\157\1\156\1\157\1\156\1\165\1\172\1\161\1\172\1\141\1\160\1\155\1\141\2\145\1\141\1\172\1\164\1\151\1\141\1\144\1\172\1\uffff\1\156\1\143\1\156\1\143\1\156\1\uffff\1\172\1\uffff\1\155\1\165\1\160\1\147\1\115\1\172\1\144\1\uffff\1\165\1\155\1\164\1\163\1\uffff\1\163\1\171\1\163\1\171\1\164\1\uffff\1\145\1\164\1\172\1\145\1\157\1\145\1\uffff\1\163\1\162\2\145\1\172\1\145\1\172\1\145\4\172\1\uffff\1\145\1\144\1\163\1\172\1\145\1\172\1\156\1\uffff\1\164\1\uffff\1\164\4\uffff\1\162\1\145\1\163\1\uffff\1\75\1\uffff\1\143\2\151\1\162\1\172\1\141\1\uffff\1\171\2\155\1\157\1\uffff\1\147\1\172\2\145\1\162\1\145\1\uffff\4\172\4\uffff";
    static final String DFA13_acceptS =
        "\15\uffff\1\32\3\uffff\1\34\1\35\3\uffff\1\41\1\42\3\uffff\1\34\20\uffff\1\32\1\41\1\uffff\1\33\1\35\1\36\1\37\1\40\117\uffff\1\20\2\uffff\1\26\34\uffff\1\25\5\uffff\1\17\1\uffff\1\10\7\uffff\1\31\4\uffff\1\2\5\uffff\1\7\6\uffff\1\24\14\uffff\1\16\7\uffff\1\30\1\uffff\1\12\1\uffff\1\13\1\6\1\23\1\15\3\uffff\1\27\1\uffff\1\5\6\uffff\1\1\4\uffff\1\21\6\uffff\1\11\4\uffff\1\3\1\4\1\14\1\22";
    static final String DFA13_specialS =
        "\1\0\22\uffff\1\1\1\2\u00ee\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\1\26\1\17\2\27\1\16\22\27\1\26\1\27\1\23\4\27\1\24\4\27\1\15\2\27\1\25\12\22\7\27\13\21\1\14\16\21\3\27\1\20\1\21\1\27\1\1\1\12\1\21\1\11\1\4\1\21\1\13\4\21\1\7\1\3\2\21\1\6\1\21\1\10\1\2\1\5\6\21\uff85\27",
            "\1\32\5\uffff\1\30\3\uffff\1\31",
            "\1\34\1\35",
            "\1\37\7\uffff\1\36",
            "\1\41\5\uffff\1\40",
            "\1\43\1\44\5\uffff\1\42",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "\1\56",
            "\2\55\2\uffff\1\55\22\uffff\1\55",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\61",
            "\0\61",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "\2\55\2\uffff\1\55\22\uffff\1\55",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\5\uffff\1\114",
            "\1\117\5\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\11\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0084",
            "\1\u0085",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0096\44\uffff\1\u0095",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\7\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00aa",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\11\uffff\1\u00c4",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00db",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00dd",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00e6",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "",
            "",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_COMMA | RULE_NL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='a') ) {s = 1;}

                        else if ( (LA13_0=='s') ) {s = 2;}

                        else if ( (LA13_0=='m') ) {s = 3;}

                        else if ( (LA13_0=='e') ) {s = 4;}

                        else if ( (LA13_0=='t') ) {s = 5;}

                        else if ( (LA13_0=='p') ) {s = 6;}

                        else if ( (LA13_0=='l') ) {s = 7;}

                        else if ( (LA13_0=='r') ) {s = 8;}

                        else if ( (LA13_0=='d') ) {s = 9;}

                        else if ( (LA13_0=='b') ) {s = 10;}

                        else if ( (LA13_0=='g') ) {s = 11;}

                        else if ( (LA13_0=='L') ) {s = 12;}

                        else if ( (LA13_0==',') ) {s = 13;}

                        else if ( (LA13_0=='\r') ) {s = 14;}

                        else if ( (LA13_0=='\n') ) {s = 15;}

                        else if ( (LA13_0=='^') ) {s = 16;}

                        else if ( ((LA13_0>='A' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='c'||LA13_0=='f'||(LA13_0>='h' && LA13_0<='k')||(LA13_0>='n' && LA13_0<='o')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='z')) ) {s = 17;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='\'') ) {s = 20;}

                        else if ( (LA13_0=='/') ) {s = 21;}

                        else if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 49;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 49;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}