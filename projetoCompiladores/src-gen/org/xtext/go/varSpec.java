/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.varSpec#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.go.varSpec#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.go.varSpec#getExprList <em>Expr List</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getvarSpec()
 * @model
 * @generated
 */
public interface varSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List</em>' containment reference.
   * @see #setIdList(identifierList)
   * @see org.xtext.go.GoPackage#getvarSpec_IdList()
   * @model containment="true"
   * @generated
   */
  identifierList getIdList();

  /**
   * Sets the value of the '{@link org.xtext.go.varSpec#getIdList <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id List</em>' containment reference.
   * @see #getIdList()
   * @generated
   */
  void setIdList(identifierList value);

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
   * @see org.xtext.go.GoPackage#getvarSpec_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.go.varSpec#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

  /**
   * Returns the value of the '<em><b>Expr List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.expressionList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr List</em>' containment reference list.
   * @see org.xtext.go.GoPackage#getvarSpec_ExprList()
   * @model containment="true"
   * @generated
   */
  EList<expressionList> getExprList();

} // varSpec
