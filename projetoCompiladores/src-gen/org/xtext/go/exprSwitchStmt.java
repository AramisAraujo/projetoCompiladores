/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expr Switch Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.exprSwitchStmt#getSimpleStmt <em>Simple Stmt</em>}</li>
 *   <li>{@link org.xtext.go.exprSwitchStmt#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.go.exprSwitchStmt#getExprCaseClauses <em>Expr Case Clauses</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getexprSwitchStmt()
 * @model
 * @generated
 */
public interface exprSwitchStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Stmt</em>' containment reference.
   * @see #setSimpleStmt(simpleStmt)
   * @see org.xtext.go.GoPackage#getexprSwitchStmt_SimpleStmt()
   * @model containment="true"
   * @generated
   */
  simpleStmt getSimpleStmt();

  /**
   * Sets the value of the '{@link org.xtext.go.exprSwitchStmt#getSimpleStmt <em>Simple Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Stmt</em>' containment reference.
   * @see #getSimpleStmt()
   * @generated
   */
  void setSimpleStmt(simpleStmt value);

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
   * @see org.xtext.go.GoPackage#getexprSwitchStmt_Expr()
   * @model containment="true"
   * @generated
   */
  expression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.go.exprSwitchStmt#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(expression value);

  /**
   * Returns the value of the '<em><b>Expr Case Clauses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.exprCaseClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Case Clauses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Case Clauses</em>' containment reference list.
   * @see org.xtext.go.GoPackage#getexprSwitchStmt_ExprCaseClauses()
   * @model containment="true"
   * @generated
   */
  EList<exprCaseClause> getExprCaseClauses();

} // exprSwitchStmt
