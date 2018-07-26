/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.structType#getFieldsDecl <em>Fields Decl</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getstructType()
 * @model
 * @generated
 */
public interface structType extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.fieldDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields Decl</em>' containment reference list.
   * @see org.xtext.go.GoPackage#getstructType_FieldsDecl()
   * @model containment="true"
   * @generated
   */
  EList<fieldDecl> getFieldsDecl();

} // structType
