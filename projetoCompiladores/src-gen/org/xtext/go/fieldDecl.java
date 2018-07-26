/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.fieldDecl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.go.fieldDecl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.go.fieldDecl#getAnonymousField <em>Anonymous Field</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getfieldDecl()
 * @model
 * @generated
 */
public interface fieldDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' containment reference.
   * @see #setIdentifierList(identifierList)
   * @see org.xtext.go.GoPackage#getfieldDecl_IdentifierList()
   * @model containment="true"
   * @generated
   */
  identifierList getIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.go.fieldDecl#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(identifierList value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type)
   * @see org.xtext.go.GoPackage#getfieldDecl_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.go.fieldDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

  /**
   * Returns the value of the '<em><b>Anonymous Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Field</em>' containment reference.
   * @see #setAnonymousField(anonymousField)
   * @see org.xtext.go.GoPackage#getfieldDecl_AnonymousField()
   * @model containment="true"
   * @generated
   */
  anonymousField getAnonymousField();

  /**
   * Sets the value of the '{@link org.xtext.go.fieldDecl#getAnonymousField <em>Anonymous Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Field</em>' containment reference.
   * @see #getAnonymousField()
   * @generated
   */
  void setAnonymousField(anonymousField value);

} // fieldDecl
