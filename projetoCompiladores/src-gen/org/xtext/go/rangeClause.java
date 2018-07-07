/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>range Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.rangeClause#getExpressionList <em>Expression List</em>}</li>
 *   <li>{@link org.xtext.go.rangeClause#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.go.rangeClause#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getrangeClause()
 * @model
 * @generated
 */
public interface rangeClause extends EObject
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
   * @see org.xtext.go.GoPackage#getrangeClause_ExpressionList()
   * @model containment="true"
   * @generated
   */
  expressionList getExpressionList();

  /**
   * Sets the value of the '{@link org.xtext.go.rangeClause#getExpressionList <em>Expression List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression List</em>' containment reference.
   * @see #getExpressionList()
   * @generated
   */
  void setExpressionList(expressionList value);

  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' attribute.
   * @see #setIdentifierList(String)
   * @see org.xtext.go.GoPackage#getrangeClause_IdentifierList()
   * @model
   * @generated
   */
  String getIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.go.rangeClause#getIdentifierList <em>Identifier List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' attribute.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.go.GoPackage#getrangeClause_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.go.rangeClause#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

} // rangeClause
