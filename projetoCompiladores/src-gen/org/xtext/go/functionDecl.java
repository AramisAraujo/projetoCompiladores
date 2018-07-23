/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.functionDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.functionDecl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.go.functionDecl#getSig <em>Sig</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getfunctionDecl()
 * @model
 * @generated
 */
public interface functionDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.go.GoPackage#getfunctionDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.go.functionDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(function)
   * @see org.xtext.go.GoPackage#getfunctionDecl_Func()
   * @model containment="true"
   * @generated
   */
  function getFunc();

  /**
   * Sets the value of the '{@link org.xtext.go.functionDecl#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(function value);

  /**
   * Returns the value of the '<em><b>Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig</em>' containment reference.
   * @see #setSig(signature)
   * @see org.xtext.go.GoPackage#getfunctionDecl_Sig()
   * @model containment="true"
   * @generated
   */
  signature getSig();

  /**
   * Sets the value of the '{@link org.xtext.go.functionDecl#getSig <em>Sig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig</em>' containment reference.
   * @see #getSig()
   * @generated
   */
  void setSig(signature value);

} // functionDecl