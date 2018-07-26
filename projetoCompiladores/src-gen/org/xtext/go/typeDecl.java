/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.typeDecl#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#gettypeDecl()
 * @model
 * @generated
 */
public interface typeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.typeSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference list.
   * @see org.xtext.go.GoPackage#gettypeDecl_Spec()
   * @model containment="true"
   * @generated
   */
  EList<typeSpec> getSpec();

} // typeDecl
