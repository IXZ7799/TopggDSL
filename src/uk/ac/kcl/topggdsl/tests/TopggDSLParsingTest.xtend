package uk.ac.kcl.topggdsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import static org.junit.Assert.*
import uk.ac.kcl.topggdsl.TopggDSLInjectorProvider
import uk.ac.kcl.topggdsl.topggDSL.Model
import uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage
import uk.ac.kcl.topggdsl.topggDSL.Bot
import uk.ac.kcl.topggdsl.topggDSL.Review

@RunWith(XtextRunner)
@InjectWith(TopggDSLInjectorProvider)
@SuppressWarnings("all")
class TopggDSLParsingTest {

    @Inject extension ParseHelper<Model>
    @Inject extension ValidationTestHelper

    @Test
    def void testValidExample() {
        val input = '''
            name Music
            prefix "!"
            tags "fun", "music"
            description "Chill lo-fi bot."

            review "123"
            refersTo Music
            status approved
            reason "Works as expected"
            reviewer "IXZ"
        '''

        val model = input.parse
        assertNotNull(model)
        assertNoErrors(model)
    }

    @Test
    def void testMissingTagsTriggersError() {
        val input = '''
            name TestBot
            prefix "!"
            tags
            description "Missing tags"
        '''

        val model = input.parse
        assertNotNull(model)
        assertError(model, TopggDSLPackage.Literals.BOT, null, "A bot must have at least one tag.")
    }

    @Test
    def void testDeclinedReviewWithEmptyReasonWarning() {
        val input = '''
            name MyBot
            prefix "!"
            tags "mod"
            description "Moderator tool"

            review "r1"
            refersTo MyBot
            status declined
            reason ""
            reviewer "Admin"
        '''

        val model = input.parse
        assertNotNull(model)
        assertWarning(model, TopggDSLPackage.Literals.REVIEW, null, "Reviews that are not approved must include a reason.")
    }

    @Test
    def void testConflictingReviews() {
        val input = '''
            name Bot1
            prefix "!"
            tags "general"
            description "A general bot"

            review "r1"
            refersTo Bot1
            status approved
            reason "Good bot"
            reviewer "Tester1"
            
            review "r2"
            refersTo Bot1
            status declined
            reason "Bad bot"
            reviewer "Tester2"
        '''

        val model = input.parse
        assertNotNull(model)
        assertWarning(model, TopggDSLPackage.Literals.REVIEW, null, "Bot 'Bot1' has conflicting reviews: both APPROVED and DECLINED.")
    }
}