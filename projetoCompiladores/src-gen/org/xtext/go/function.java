/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.function#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.go.function#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getfunction()
 * @model
 * @generated
 */
public interface function extends EObject
{
  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(signature)
   * @see org.xtext.go.GoPackage#getfunction_Signature()
   * @model containment="true"
   * @generated
   */
  signature getSignature();

  /**
   * Sets the value of the '{@link org.xtext.go.function#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(signature value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(block)
   * @see org.xtext.go.GoPackage#getfunction_Block()
   * @model containment="true"
   * @generated
   */
  block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.go.function#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(block value);

} // function
