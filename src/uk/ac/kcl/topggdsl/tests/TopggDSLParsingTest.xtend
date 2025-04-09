/* 
package uk.ac.kcl.topggdsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import static org.junit.Assert.*
import uk.ac.kcl.topggdsl.topggDSL.Model

@RunWith(XtextRunner)
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
}
*/