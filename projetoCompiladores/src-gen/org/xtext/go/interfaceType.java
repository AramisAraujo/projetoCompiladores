/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.interfaceType#getMethodSpecs <em>Method Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getinterfaceType()
 * @model
 * @generated
 */
public interface interfaceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Method Specs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.methodSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Specs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Specs</em>' containment reference list.
   * @see org.xtext.go.GoPackage#getinterfaceType_MethodSpecs()
   * @model containment="true"
   * @generated
   */
  EList<methodSpec> getMethodSpecs();

} // interfaceType
