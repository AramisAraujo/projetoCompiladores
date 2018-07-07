/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.simpleStmt#getSendStmt <em>Send Stmt</em>}</li>
 *   <li>{@link org.xtext.go.simpleStmt#getExpressionStmt <em>Expression Stmt</em>}</li>
 *   <li>{@link org.xtext.go.simpleStmt#getIncDecStmt <em>Inc Dec Stmt</em>}</li>
 *   <li>{@link org.xtext.go.simpleStmt#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.go.simpleStmt#getShortVarDecl <em>Short Var Decl</em>}</li>
 *   <li>{@link org.xtext.go.simpleStmt#getEmptyStmt <em>Empty Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getsimpleStmt()
 * @model
 * @generated
 */
public interface simpleStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Send Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Send Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Send Stmt</em>' containment reference.
   * @see #setSendStmt(sendStmt)
   * @see org.xtext.go.GoPackage#getsimpleStmt_SendStmt()
   * @model containment="true"
   * @generated
   */
  sendStmt getSendStmt();

  /**
   * Sets the value of the '{@link org.xtext.go.simpleStmt#getSendStmt <em>Send Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Send Stmt</em>' containment reference.
   * @see #getSendStmt()
   * @generated
   */
  void setSendStmt(sendStmt value);

  /**
   * Returns the value of the '<em><b>Expression Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Stmt</em>' containment reference.
   * @see #setExpressionStmt(expressionStmt)
   * @see org.xtext.go.GoPackage#getsimpleStmt_ExpressionStmt()
   * @model containment="true"
   * @generated
   */
  expressionStmt getExpressionStmt();

  /**
   * Sets the value of the '{@link org.xtext.go.simpleStmt#getExpressionStmt <em>Expression Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Stmt</em>' containment reference.
   * @see #getExpressionStmt()
   * @generated
   */
  void setExpressionStmt(expressionStmt value);

  /**
   * Returns the value of the '<em><b>Inc Dec Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc Dec Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc Dec Stmt</em>' containment reference.
   * @see #setIncDecStmt(incDecStmt)
   * @see org.xtext.go.GoPackage#getsimpleStmt_IncDecStmt()
   * @model containment="true"
   * @generated
   */
  incDecStmt getIncDecStmt();

  /**
   * Sets the value of the '{@link org.xtext.go.simpleStmt#getIncDecStmt <em>Inc Dec Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Dec Stmt</em>' containment reference.
   * @see #getIncDecStmt()
   * @generated
   */
  void setIncDecStmt(incDecStmt value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(assignment)
   * @see org.xtext.go.GoPackage#getsimpleStmt_Assignment()
   * @model containment="true"
   * @generated
   */
  assignment getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.go.simpleStmt#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(assignment value);

  /**
   * Returns the value of the '<em><b>Short Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Var Decl</em>' containment reference.
   * @see #setShortVarDecl(shortVarDecl)
   * @see org.xtext.go.GoPackage#getsimpleStmt_ShortVarDecl()
   * @model containment="true"
   * @generated
   */
  shortVarDecl getShortVarDecl();

  /**
   * Sets the value of the '{@link org.xtext.go.simpleStmt#getShortVarDecl <em>Short Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Var Decl</em>' containment reference.
   * @see #getShortVarDecl()
   * @generated
   */
  void setShortVarDecl(shortVarDecl value);

  /**
   * Returns the value of the '<em><b>Empty Stmt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Stmt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Stmt</em>' attribute.
   * @see #setEmptyStmt(String)
   * @see org.xtext.go.GoPackage#getsimpleStmt_EmptyStmt()
   * @model
   * @generated
   */
  String getEmptyStmt();

  /**
   * Sets the value of the '{@link org.xtext.go.simpleStmt#getEmptyStmt <em>Empty Stmt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Stmt</em>' attribute.
   * @see #getEmptyStmt()
   * @generated
   */
  void setEmptyStmt(String value);

} // simpleStmt
