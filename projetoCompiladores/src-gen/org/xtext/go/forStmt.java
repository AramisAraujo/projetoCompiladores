/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.forStmt#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.go.forStmt#getClause <em>Clause</em>}</li>
 *   <li>{@link org.xtext.go.forStmt#getCodeBlock <em>Code Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getforStmt()
 * @model
 * @generated
 */
public interface forStmt extends EObject
{
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
   * @see org.xtext.go.GoPackage#getforStmt_Expr()
   * @model containment="true"
   * @generated
   */
  expression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.go.forStmt#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(expression value);

  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference.
   * @see #setClause(EObject)
   * @see org.xtext.go.GoPackage#getforStmt_Clause()
   * @model containment="true"
   * @generated
   */
  EObject getClause();

  /**
   * Sets the value of the '{@link org.xtext.go.forStmt#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(EObject value);

  /**
   * Returns the value of the '<em><b>Code Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Block</em>' containment reference.
   * @see #setCodeBlock(block)
   * @see org.xtext.go.GoPackage#getforStmt_CodeBlock()
   * @model containment="true"
   * @generated
   */
  block getCodeBlock();

  /**
   * Sets the value of the '{@link org.xtext.go.forStmt#getCodeBlock <em>Code Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code Block</em>' containment reference.
   * @see #getCodeBlock()
   * @generated
   */
  void setCodeBlock(block value);

} // forStmt
