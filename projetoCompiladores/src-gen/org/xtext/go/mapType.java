/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.mapType#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.go.mapType#getElemType <em>Elem Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getmapType()
 * @model
 * @generated
 */
public interface mapType extends EObject
{
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
   * @see org.xtext.go.GoPackage#getmapType_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.go.mapType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

  /**
   * Returns the value of the '<em><b>Elem Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Type</em>' containment reference.
   * @see #setElemType(elementType)
   * @see org.xtext.go.GoPackage#getmapType_ElemType()
   * @model containment="true"
   * @generated
   */
  elementType getElemType();

  /**
   * Sets the value of the '{@link org.xtext.go.mapType#getElemType <em>Elem Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem Type</em>' containment reference.
   * @see #getElemType()
   * @generated
   */
  void setElemType(elementType value);

} // mapType
