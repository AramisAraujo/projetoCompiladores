/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>return Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.returnStmt#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getreturnStmt()
 * @model
 * @generated
 */
public interface returnStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression List</em>' containment reference.
   * @see #setExpressionList(expressionList)
   * @see org.xtext.go.GoPackage#getreturnStmt_ExpressionList()
   * @model containment="true"
   * @generated
   */
  expressionList getExpressionList();

  /**
   * Sets the value of the '{@link org.xtext.go.returnStmt#getExpressionList <em>Expression List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression List</em>' containment reference.
   * @see #getExpressionList()
   * @generated
   */
  void setExpressionList(expressionList value);

} // returnStmt
