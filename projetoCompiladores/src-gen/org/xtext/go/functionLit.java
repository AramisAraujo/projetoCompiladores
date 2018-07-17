/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.functionLit#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getfunctionLit()
 * @model
 * @generated
 */
public interface functionLit extends EObject
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(function)
   * @see org.xtext.go.GoPackage#getfunctionLit_Function()
   * @model containment="true"
   * @generated
   */
  function getFunction();

  /**
   * Sets the value of the '{@link org.xtext.go.functionLit#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(function value);

} // functionLit
