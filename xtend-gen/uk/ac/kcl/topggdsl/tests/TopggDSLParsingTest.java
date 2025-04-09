package uk.ac.kcl.topggdsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import uk.ac.kcl.topggdsl.topggDSL.Model;

/* @RunWith(_XtextRunner)
@InjectWith(_TopggDSLInjectorProvider) */@SuppressWarnings("all")
public class TopggDSLParsingTest {
  @Inject
  @Extension
  private /* ParseHelper<Model> */Object _parseHelper;

  @Inject
  @Extension
  private /* ValidationTestHelper */Object _validationTestHelper;

  /* @Test
   */public void testValidExample() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field parse is undefined for the type String"
      + "\nThe method assertNotNull(Object) is undefined"
      + "\nThe method assertNoErrors(Object) is undefined");
  }

  /* @Test
   */public void testMissingTagsTriggersError() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field parse is undefined for the type String"
      + "\nThe method assertNotNull(Object) is undefined"
      + "\nThe method assertError(Object, EClass, Object, String) is undefined");
  }

  /* @Test
   */public void testDeclinedReviewWithEmptyReasonWarning() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field parse is undefined for the type String"
      + "\nThe method assertNotNull(Object) is undefined"
      + "\nThe method assertWarning(Object, EClass, Object, String) is undefined");
  }

  /* @Test
   */public void testConflictingReviews() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field parse is undefined for the type String"
      + "\nThe method assertNotNull(Object) is undefined"
      + "\nThe method assertWarning(Object, EClass, Object, String) is undefined");
  }
}
