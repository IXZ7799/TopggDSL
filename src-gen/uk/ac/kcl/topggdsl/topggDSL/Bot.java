/**
 * generated by Xtext 2.38.0
 */
package uk.ac.kcl.topggdsl.topggDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.topggdsl.topggDSL.Bot#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.topggdsl.topggDSL.Bot#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link uk.ac.kcl.topggdsl.topggDSL.Bot#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.kcl.topggdsl.topggDSL.Bot#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage#getBot()
 * @model
 * @generated
 */
public interface Bot extends Entry
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage#getBot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.topggdsl.topggDSL.Bot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage#getBot_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link uk.ac.kcl.topggdsl.topggDSL.Bot#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute list.
   * @see uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage#getBot_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage#getBot_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link uk.ac.kcl.topggdsl.topggDSL.Bot#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Bot
