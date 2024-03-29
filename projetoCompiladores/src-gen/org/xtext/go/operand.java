/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.operand#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.go.operand#getOperandName <em>Operand Name</em>}</li>
 *   <li>{@link org.xtext.go.operand#getMethodExpr <em>Method Expr</em>}</li>
 *   <li>{@link org.xtext.go.operand#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getoperand()
 * @model
 * @generated
 */
public interface operand extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(literal)
   * @see org.xtext.go.GoPackage#getoperand_Literal()
   * @model containment="true"
   * @generated
   */
  literal getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.go.operand#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(literal value);

  /**
   * Returns the value of the '<em><b>Operand Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand Name</em>' containment reference.
   * @see #setOperandName(operandName)
   * @see org.xtext.go.GoPackage#getoperand_OperandName()
   * @model containment="true"
   * @generated
   */
  operandName getOperandName();

  /**
   * Sets the value of the '{@link org.xtext.go.operand#getOperandName <em>Operand Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand Name</em>' containment reference.
   * @see #getOperandName()
   * @generated
   */
  void setOperandName(operandName value);

  /**
   * Returns the value of the '<em><b>Method Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Expr</em>' containment reference.
   * @see #setMethodExpr(methodExpr)
   * @see org.xtext.go.GoPackage#getoperand_MethodExpr()
   * @model containment="true"
   * @generated
   */
  methodExpr getMethodExpr();

  /**
   * Sets the value of the '{@link org.xtext.go.operand#getMethodExpr <em>Method Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Expr</em>' containment reference.
   * @see #getMethodExpr()
   * @generated
   */
  void setMethodExpr(methodExpr value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(expression)
   * @see org.xtext.go.GoPackage#getoperand_Expr()
   * @model containment="true"
   * @generated
   */
  expression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.go.operand#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(expression value);

} // operand
