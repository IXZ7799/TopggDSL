/**
 * generated by Xtext 2.38.0
 */
package uk.ac.kcl.topggdsl.topggDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage
 * @generated
 */
public interface TopggDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TopggDSLFactory eINSTANCE = uk.ac.kcl.topggdsl.topggDSL.impl.TopggDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry</em>'.
   * @generated
   */
  Entry createEntry();

  /**
   * Returns a new object of class '<em>Bot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bot</em>'.
   * @generated
   */
  Bot createBot();

  /**
   * Returns a new object of class '<em>Review</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Review</em>'.
   * @generated
   */
  Review createReview();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TopggDSLPackage getTopggDSLPackage();

} //TopggDSLFactory
