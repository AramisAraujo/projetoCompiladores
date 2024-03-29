/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>composite Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.compositeLit#getLiteralType <em>Literal Type</em>}</li>
 *   <li>{@link org.xtext.go.compositeLit#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getcompositeLit()
 * @model
 * @generated
 */
public interface compositeLit extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal Type</em>' containment reference.
   * @see #setLiteralType(literalType)
   * @see org.xtext.go.GoPackage#getcompositeLit_LiteralType()
   * @model containment="true"
   * @generated
   */
  literalType getLiteralType();

  /**
   * Sets the value of the '{@link org.xtext.go.compositeLit#getLiteralType <em>Literal Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal Type</em>' containment reference.
   * @see #getLiteralType()
   * @generated
   */
  void setLiteralType(literalType value);

  /**
   * Returns the value of the '<em><b>Literal Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal Value</em>' containment reference.
   * @see #setLiteralValue(literalValue)
   * @see org.xtext.go.GoPackage#getcompositeLit_LiteralValue()
   * @model containment="true"
   * @generated
   */
  literalValue getLiteralValue();

  /**
   * Sets the value of the '{@link org.xtext.go.compositeLit#getLiteralValue <em>Literal Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal Value</em>' containment reference.
   * @see #getLiteralValue()
   * @generated
   */
  void setLiteralValue(literalValue value);

} // compositeLit
