/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.Unary_expr#getPrimary_expr <em>Primary expr</em>}</li>
 *   <li>{@link org.xtext.go.Unary_expr#getUnary_op <em>Unary op</em>}</li>
 *   <li>{@link org.xtext.go.Unary_expr#getUnary_expr <em>Unary expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getUnary_expr()
 * @model
 * @generated
 */
public interface Unary_expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Primary expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary expr</em>' containment reference.
   * @see #setPrimary_expr(Primary_expr)
   * @see org.xtext.go.GoPackage#getUnary_expr_Primary_expr()
   * @model containment="true"
   * @generated
   */
  Primary_expr getPrimary_expr();

  /**
   * Sets the value of the '{@link org.xtext.go.Unary_expr#getPrimary_expr <em>Primary expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary expr</em>' containment reference.
   * @see #getPrimary_expr()
   * @generated
   */
  void setPrimary_expr(Primary_expr value);

  /**
   * Returns the value of the '<em><b>Unary op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary op</em>' attribute.
   * @see #setUnary_op(String)
   * @see org.xtext.go.GoPackage#getUnary_expr_Unary_op()
   * @model
   * @generated
   */
  String getUnary_op();

  /**
   * Sets the value of the '{@link org.xtext.go.Unary_expr#getUnary_op <em>Unary op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary op</em>' attribute.
   * @see #getUnary_op()
   * @generated
   */
  void setUnary_op(String value);

  /**
   * Returns the value of the '<em><b>Unary expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary expr</em>' containment reference.
   * @see #setUnary_expr(Unary_expr)
   * @see org.xtext.go.GoPackage#getUnary_expr_Unary_expr()
   * @model containment="true"
   * @generated
   */
  Unary_expr getUnary_expr();

  /**
   * Sets the value of the '{@link org.xtext.go.Unary_expr#getUnary_expr <em>Unary expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary expr</em>' containment reference.
   * @see #getUnary_expr()
   * @generated
   */
  void setUnary_expr(Unary_expr value);

} // Unary_expr
