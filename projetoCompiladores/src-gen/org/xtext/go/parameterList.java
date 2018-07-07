/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.parameterList#getParameterDecl <em>Parameter Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getparameterList()
 * @model
 * @generated
 */
public interface parameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.parameterDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Decl</em>' containment reference list.
   * @see org.xtext.go.GoPackage#getparameterList_ParameterDecl()
   * @model containment="true"
   * @generated
   */
  EList<parameterDecl> getParameterDecl();

} // parameterList
