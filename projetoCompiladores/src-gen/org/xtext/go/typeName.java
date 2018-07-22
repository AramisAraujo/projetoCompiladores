/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.typeName#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.typeName#getQualIdent <em>Qual Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#gettypeName()
 * @model
 * @generated
 */
public interface typeName extends EObject
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
   * @see org.xtext.go.GoPackage#gettypeName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.go.typeName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Qual Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qual Ident</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qual Ident</em>' containment reference.
   * @see #setQualIdent(qualifiedIdent)
   * @see org.xtext.go.GoPackage#gettypeName_QualIdent()
   * @model containment="true"
   * @generated
   */
  qualifiedIdent getQualIdent();

  /**
   * Sets the value of the '{@link org.xtext.go.typeName#getQualIdent <em>Qual Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qual Ident</em>' containment reference.
   * @see #getQualIdent()
   * @generated
   */
  void setQualIdent(qualifiedIdent value);

} // typeName
