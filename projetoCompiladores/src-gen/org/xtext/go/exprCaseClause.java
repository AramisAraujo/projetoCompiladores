/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expr Case Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.exprCaseClause#getExprSwitchCase <em>Expr Switch Case</em>}</li>
 *   <li>{@link org.xtext.go.exprCaseClause#getStatementList <em>Statement List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getexprCaseClause()
 * @model
 * @generated
 */
public interface exprCaseClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Switch Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Switch Case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Switch Case</em>' containment reference.
   * @see #setExprSwitchCase(exprSwitchCase)
   * @see org.xtext.go.GoPackage#getexprCaseClause_ExprSwitchCase()
   * @model containment="true"
   * @generated
   */
  exprSwitchCase getExprSwitchCase();

  /**
   * Sets the value of the '{@link org.xtext.go.exprCaseClause#getExprSwitchCase <em>Expr Switch Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Switch Case</em>' containment reference.
   * @see #getExprSwitchCase()
   * @generated
   */
  void setExprSwitchCase(exprSwitchCase value);

  /**
   * Returns the value of the '<em><b>Statement List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement List</em>' containment reference.
   * @see #setStatementList(statementList)
   * @see org.xtext.go.GoPackage#getexprCaseClause_StatementList()
   * @model containment="true"
   * @generated
   */
  statementList getStatementList();

  /**
   * Sets the value of the '{@link org.xtext.go.exprCaseClause#getStatementList <em>Statement List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement List</em>' containment reference.
   * @see #getStatementList()
   * @generated
   */
  void setStatementList(statementList value);

} // exprCaseClause
