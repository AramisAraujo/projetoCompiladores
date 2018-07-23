/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>import Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.importDecl#getSpecs <em>Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getimportDecl()
 * @model
 * @generated
 */
public interface importDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Specs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.importSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specs</em>' containment reference list.
   * @see org.xtext.go.GoPackage#getimportDecl_Specs()
   * @model containment="true"
   * @generated
   */
  EList<importSpec> getSpecs();

} // importDecl