/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.declaration#getConstDecl <em>Const Decl</em>}</li>
 *   <li>{@link org.xtext.go.declaration#getTypeDecl <em>Type Decl</em>}</li>
 *   <li>{@link org.xtext.go.declaration#getVarDecl <em>Var Decl</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getdeclaration()
 * @model
 * @generated
 */
public interface declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Const Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Decl</em>' containment reference.
   * @see #setConstDecl(constDecl)
   * @see org.xtext.go.GoPackage#getdeclaration_ConstDecl()
   * @model containment="true"
   * @generated
   */
  constDecl getConstDecl();

  /**
   * Sets the value of the '{@link org.xtext.go.declaration#getConstDecl <em>Const Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Decl</em>' containment reference.
   * @see #getConstDecl()
   * @generated
   */
  void setConstDecl(constDecl value);

  /**
   * Returns the value of the '<em><b>Type Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Decl</em>' containment reference.
   * @see #setTypeDecl(typeDecl)
   * @see org.xtext.go.GoPackage#getdeclaration_TypeDecl()
   * @model containment="true"
   * @generated
   */
  typeDecl getTypeDecl();

  /**
   * Sets the value of the '{@link org.xtext.go.declaration#getTypeDecl <em>Type Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Decl</em>' containment reference.
   * @see #getTypeDecl()
   * @generated
   */
  void setTypeDecl(typeDecl value);

  /**
   * Returns the value of the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decl</em>' containment reference.
   * @see #setVarDecl(varDecl)
   * @see org.xtext.go.GoPackage#getdeclaration_VarDecl()
   * @model containment="true"
   * @generated
   */
  varDecl getVarDecl();

  /**
   * Sets the value of the '{@link org.xtext.go.declaration#getVarDecl <em>Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Decl</em>' containment reference.
   * @see #getVarDecl()
   * @generated
   */
  void setVarDecl(varDecl value);

} // declaration
