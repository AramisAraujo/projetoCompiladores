/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.result#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.go.result#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getresult()
 * @model
 * @generated
 */
public interface result extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(parameters)
   * @see org.xtext.go.GoPackage#getresult_Params()
   * @model containment="true"
   * @generated
   */
  parameters getParams();

  /**
   * Sets the value of the '{@link org.xtext.go.result#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(parameters value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type)
   * @see org.xtext.go.GoPackage#getresult_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.go.result#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

} // result
