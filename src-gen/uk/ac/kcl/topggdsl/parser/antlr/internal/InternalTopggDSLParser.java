package uk.ac.kcl.topggdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.topggdsl.services.TopggDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTopggDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'prefix'", "'tags'", "','", "'description'", "'review'", "'refersTo'", "'status'", "'reason'", "'reviewer'", "'APPROVED'", "'DECLINED'", "'REVIEW'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTopggDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTopggDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTopggDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTopggDSL.g"; }



     	private TopggDSLGrammarAccess grammarAccess;

        public InternalTopggDSLParser(TokenStream input, TopggDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TopggDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTopggDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTopggDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalTopggDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTopggDSL.g:72:1: ruleModel returns [EObject current=null] : ( (lv_entries_0_0= ruleEntry ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalTopggDSL.g:78:2: ( ( (lv_entries_0_0= ruleEntry ) )* )
            // InternalTopggDSL.g:79:2: ( (lv_entries_0_0= ruleEntry ) )*
            {
            // InternalTopggDSL.g:79:2: ( (lv_entries_0_0= ruleEntry ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTopggDSL.g:80:3: (lv_entries_0_0= ruleEntry )
            	    {
            	    // InternalTopggDSL.g:80:3: (lv_entries_0_0= ruleEntry )
            	    // InternalTopggDSL.g:81:4: lv_entries_0_0= ruleEntry
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEntriesEntryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entries_0_0=ruleEntry();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entries",
            	    					lv_entries_0_0,
            	    					"uk.ac.kcl.topggdsl.TopggDSL.Entry");
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


    // $ANTLR start "entryRuleEntry"
    // InternalTopggDSL.g:101:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalTopggDSL.g:101:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalTopggDSL.g:102:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalTopggDSL.g:108:1: ruleEntry returns [EObject current=null] : (this_Bot_0= ruleBot | this_Review_1= ruleReview ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_Bot_0 = null;

        EObject this_Review_1 = null;



        	enterRule();

        try {
            // InternalTopggDSL.g:114:2: ( (this_Bot_0= ruleBot | this_Review_1= ruleReview ) )
            // InternalTopggDSL.g:115:2: (this_Bot_0= ruleBot | this_Review_1= ruleReview )
            {
            // InternalTopggDSL.g:115:2: (this_Bot_0= ruleBot | this_Review_1= ruleReview )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTopggDSL.g:116:3: this_Bot_0= ruleBot
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getBotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bot_0=ruleBot();

                    state._fsp--;


                    			current = this_Bot_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTopggDSL.g:125:3: this_Review_1= ruleReview
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getReviewParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Review_1=ruleReview();

                    state._fsp--;


                    			current = this_Review_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleBot"
    // InternalTopggDSL.g:137:1: entryRuleBot returns [EObject current=null] : iv_ruleBot= ruleBot EOF ;
    public final EObject entryRuleBot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBot = null;


        try {
            // InternalTopggDSL.g:137:44: (iv_ruleBot= ruleBot EOF )
            // InternalTopggDSL.g:138:2: iv_ruleBot= ruleBot EOF
            {
             newCompositeNode(grammarAccess.getBotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBot=ruleBot();

            state._fsp--;

             current =iv_ruleBot; 
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
    // $ANTLR end "entryRuleBot"


    // $ANTLR start "ruleBot"
    // InternalTopggDSL.g:144:1: ruleBot returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'prefix' ( (lv_prefix_3_0= RULE_STRING ) ) otherlv_4= 'tags' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleBot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_prefix_3_0=null;
        Token otherlv_4=null;
        Token lv_tags_5_0=null;
        Token otherlv_6=null;
        Token lv_tags_7_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;


        	enterRule();

        try {
            // InternalTopggDSL.g:150:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'prefix' ( (lv_prefix_3_0= RULE_STRING ) ) otherlv_4= 'tags' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ) )
            // InternalTopggDSL.g:151:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'prefix' ( (lv_prefix_3_0= RULE_STRING ) ) otherlv_4= 'tags' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )
            {
            // InternalTopggDSL.g:151:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'prefix' ( (lv_prefix_3_0= RULE_STRING ) ) otherlv_4= 'tags' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )
            // InternalTopggDSL.g:152:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'prefix' ( (lv_prefix_3_0= RULE_STRING ) ) otherlv_4= 'tags' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBotAccess().getNameKeyword_0());
            		
            // InternalTopggDSL.g:156:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalTopggDSL.g:157:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalTopggDSL.g:157:4: (lv_name_1_0= RULE_STRING )
            // InternalTopggDSL.g:158:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBotAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBotAccess().getPrefixKeyword_2());
            		
            // InternalTopggDSL.g:178:3: ( (lv_prefix_3_0= RULE_STRING ) )
            // InternalTopggDSL.g:179:4: (lv_prefix_3_0= RULE_STRING )
            {
            // InternalTopggDSL.g:179:4: (lv_prefix_3_0= RULE_STRING )
            // InternalTopggDSL.g:180:5: lv_prefix_3_0= RULE_STRING
            {
            lv_prefix_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_prefix_3_0, grammarAccess.getBotAccess().getPrefixSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prefix",
            						lv_prefix_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getBotAccess().getTagsKeyword_4());
            		
            // InternalTopggDSL.g:200:3: ( (lv_tags_5_0= RULE_STRING ) )
            // InternalTopggDSL.g:201:4: (lv_tags_5_0= RULE_STRING )
            {
            // InternalTopggDSL.g:201:4: (lv_tags_5_0= RULE_STRING )
            // InternalTopggDSL.g:202:5: lv_tags_5_0= RULE_STRING
            {
            lv_tags_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_tags_5_0, grammarAccess.getBotAccess().getTagsSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBotRule());
            					}
            					addWithLastConsumed(
            						current,
            						"tags",
            						lv_tags_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTopggDSL.g:218:3: (otherlv_6= ',' ( (lv_tags_7_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTopggDSL.g:219:4: otherlv_6= ',' ( (lv_tags_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBotAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalTopggDSL.g:223:4: ( (lv_tags_7_0= RULE_STRING ) )
            	    // InternalTopggDSL.g:224:5: (lv_tags_7_0= RULE_STRING )
            	    {
            	    // InternalTopggDSL.g:224:5: (lv_tags_7_0= RULE_STRING )
            	    // InternalTopggDSL.g:225:6: lv_tags_7_0= RULE_STRING
            	    {
            	    lv_tags_7_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    						newLeafNode(lv_tags_7_0, grammarAccess.getBotAccess().getTagsSTRINGTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBotRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tags",
            	    							lv_tags_7_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getBotAccess().getDescriptionKeyword_7());
            		
            // InternalTopggDSL.g:246:3: ( (lv_description_9_0= RULE_STRING ) )
            // InternalTopggDSL.g:247:4: (lv_description_9_0= RULE_STRING )
            {
            // InternalTopggDSL.g:247:4: (lv_description_9_0= RULE_STRING )
            // InternalTopggDSL.g:248:5: lv_description_9_0= RULE_STRING
            {
            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_9_0, grammarAccess.getBotAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleBot"


    // $ANTLR start "entryRuleReview"
    // InternalTopggDSL.g:268:1: entryRuleReview returns [EObject current=null] : iv_ruleReview= ruleReview EOF ;
    public final EObject entryRuleReview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReview = null;


        try {
            // InternalTopggDSL.g:268:47: (iv_ruleReview= ruleReview EOF )
            // InternalTopggDSL.g:269:2: iv_ruleReview= ruleReview EOF
            {
             newCompositeNode(grammarAccess.getReviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReview=ruleReview();

            state._fsp--;

             current =iv_ruleReview; 
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
    // $ANTLR end "entryRuleReview"


    // $ANTLR start "ruleReview"
    // InternalTopggDSL.g:275:1: ruleReview returns [EObject current=null] : (otherlv_0= 'review' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'refersTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'status' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'reason' ( (lv_reason_7_0= RULE_STRING ) ) otherlv_8= 'reviewer' ( (lv_reviewer_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleReview() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_reason_7_0=null;
        Token otherlv_8=null;
        Token lv_reviewer_9_0=null;
        Enumerator lv_status_5_0 = null;



        	enterRule();

        try {
            // InternalTopggDSL.g:281:2: ( (otherlv_0= 'review' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'refersTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'status' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'reason' ( (lv_reason_7_0= RULE_STRING ) ) otherlv_8= 'reviewer' ( (lv_reviewer_9_0= RULE_STRING ) ) ) )
            // InternalTopggDSL.g:282:2: (otherlv_0= 'review' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'refersTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'status' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'reason' ( (lv_reason_7_0= RULE_STRING ) ) otherlv_8= 'reviewer' ( (lv_reviewer_9_0= RULE_STRING ) ) )
            {
            // InternalTopggDSL.g:282:2: (otherlv_0= 'review' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'refersTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'status' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'reason' ( (lv_reason_7_0= RULE_STRING ) ) otherlv_8= 'reviewer' ( (lv_reviewer_9_0= RULE_STRING ) ) )
            // InternalTopggDSL.g:283:3: otherlv_0= 'review' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= 'refersTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'status' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'reason' ( (lv_reason_7_0= RULE_STRING ) ) otherlv_8= 'reviewer' ( (lv_reviewer_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReviewAccess().getReviewKeyword_0());
            		
            // InternalTopggDSL.g:287:3: ( (lv_id_1_0= RULE_STRING ) )
            // InternalTopggDSL.g:288:4: (lv_id_1_0= RULE_STRING )
            {
            // InternalTopggDSL.g:288:4: (lv_id_1_0= RULE_STRING )
            // InternalTopggDSL.g:289:5: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_id_1_0, grammarAccess.getReviewAccess().getIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getReviewAccess().getRefersToKeyword_2());
            		
            // InternalTopggDSL.g:309:3: ( (otherlv_3= RULE_ID ) )
            // InternalTopggDSL.g:310:4: (otherlv_3= RULE_ID )
            {
            // InternalTopggDSL.g:310:4: (otherlv_3= RULE_ID )
            // InternalTopggDSL.g:311:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getReviewAccess().getBotRefBotCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getReviewAccess().getStatusKeyword_4());
            		
            // InternalTopggDSL.g:326:3: ( (lv_status_5_0= ruleStatus ) )
            // InternalTopggDSL.g:327:4: (lv_status_5_0= ruleStatus )
            {
            // InternalTopggDSL.g:327:4: (lv_status_5_0= ruleStatus )
            // InternalTopggDSL.g:328:5: lv_status_5_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getReviewAccess().getStatusStatusEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_status_5_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReviewRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_5_0,
            						"uk.ac.kcl.topggdsl.TopggDSL.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getReviewAccess().getReasonKeyword_6());
            		
            // InternalTopggDSL.g:349:3: ( (lv_reason_7_0= RULE_STRING ) )
            // InternalTopggDSL.g:350:4: (lv_reason_7_0= RULE_STRING )
            {
            // InternalTopggDSL.g:350:4: (lv_reason_7_0= RULE_STRING )
            // InternalTopggDSL.g:351:5: lv_reason_7_0= RULE_STRING
            {
            lv_reason_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_reason_7_0, grammarAccess.getReviewAccess().getReasonSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"reason",
            						lv_reason_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getReviewAccess().getReviewerKeyword_8());
            		
            // InternalTopggDSL.g:371:3: ( (lv_reviewer_9_0= RULE_STRING ) )
            // InternalTopggDSL.g:372:4: (lv_reviewer_9_0= RULE_STRING )
            {
            // InternalTopggDSL.g:372:4: (lv_reviewer_9_0= RULE_STRING )
            // InternalTopggDSL.g:373:5: lv_reviewer_9_0= RULE_STRING
            {
            lv_reviewer_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_reviewer_9_0, grammarAccess.getReviewAccess().getReviewerSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"reviewer",
            						lv_reviewer_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleReview"


    // $ANTLR start "ruleStatus"
    // InternalTopggDSL.g:393:1: ruleStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'DECLINED' ) | (enumLiteral_2= 'REVIEW' ) ) ;
    public final Enumerator ruleStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTopggDSL.g:399:2: ( ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'DECLINED' ) | (enumLiteral_2= 'REVIEW' ) ) )
            // InternalTopggDSL.g:400:2: ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'DECLINED' ) | (enumLiteral_2= 'REVIEW' ) )
            {
            // InternalTopggDSL.g:400:2: ( (enumLiteral_0= 'APPROVED' ) | (enumLiteral_1= 'DECLINED' ) | (enumLiteral_2= 'REVIEW' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTopggDSL.g:401:3: (enumLiteral_0= 'APPROVED' )
                    {
                    // InternalTopggDSL.g:401:3: (enumLiteral_0= 'APPROVED' )
                    // InternalTopggDSL.g:402:4: enumLiteral_0= 'APPROVED'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getAPPROVEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatusAccess().getAPPROVEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTopggDSL.g:409:3: (enumLiteral_1= 'DECLINED' )
                    {
                    // InternalTopggDSL.g:409:3: (enumLiteral_1= 'DECLINED' )
                    // InternalTopggDSL.g:410:4: enumLiteral_1= 'DECLINED'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getDECLINEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatusAccess().getDECLINEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTopggDSL.g:417:3: (enumLiteral_2= 'REVIEW' )
                    {
                    // InternalTopggDSL.g:417:3: (enumLiteral_2= 'REVIEW' )
                    // InternalTopggDSL.g:418:4: enumLiteral_2= 'REVIEW'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}