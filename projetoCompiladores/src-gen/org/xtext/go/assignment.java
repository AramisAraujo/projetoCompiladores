/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.assignment#getExprList1 <em>Expr List1</em>}</li>
 *   <li>{@link org.xtext.go.assignment#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.xtext.go.assignment#getExprList2 <em>Expr List2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getassignment()
 * @model
 * @generated
 */
public interface assignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr List1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr List1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr List1</em>' containment reference.
   * @see #setExprList1(expressionList)
   * @see org.xtext.go.GoPackage#getassignment_ExprList1()
   * @model containment="true"
   * @generated
   */
  expressionList getExprList1();

  /**
   * Sets the value of the '{@link org.xtext.go.assignment#getExprList1 <em>Expr List1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr List1</em>' containment reference.
   * @see #getExprList1()
   * @generated
   */
  void setExprList1(expressionList value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see org.xtext.go.GoPackage#getassignment_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link org.xtext.go.assignment#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Expr List2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr List2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr List2</em>' containment reference.
   * @see #setExprList2(expressionList)
   * @see org.xtext.go.GoPackage#getassignment_ExprList2()
   * @model containment="true"
   * @generated
   */
  expressionList getExprList2();

  /**
   * Sets the value of the '{@link org.xtext.go.assignment#getExprList2 <em>Expr List2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr List2</em>' containment reference.
   * @see #getExprList2()
   * @generated
   */
  void setExprList2(expressionList value);

} // assignment
