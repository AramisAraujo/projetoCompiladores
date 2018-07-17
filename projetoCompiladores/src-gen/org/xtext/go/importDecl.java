/**
 * generated by Xtext 2.13.0
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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.importDecl#getImportSpec <em>Import Spec</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getimportDecl()
 * @model
 * @generated
 */
public interface importDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Spec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.importSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Spec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Spec</em>' containment reference list.
   * @see org.xtext.go.GoPackage#getimportDecl_ImportSpec()
   * @model containment="true"
   * @generated
   */
  EList<importSpec> getImportSpec();

} // importDecl
