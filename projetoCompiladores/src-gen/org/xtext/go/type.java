/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.type#getContentT <em>Content T</em>}</li>
 *   <li>{@link org.xtext.go.type#getContentL <em>Content L</em>}</li>
 *   <li>{@link org.xtext.go.type#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#gettype()
 * @model
 * @generated
 */
public interface type extends EObject
{
  /**
   * Returns the value of the '<em><b>Content T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content T</em>' containment reference.
   * @see #setContentT(typeName)
   * @see org.xtext.go.GoPackage#gettype_ContentT()
   * @model containment="true"
   * @generated
   */
  typeName getContentT();

  /**
   * Sets the value of the '{@link org.xtext.go.type#getContentT <em>Content T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content T</em>' containment reference.
   * @see #getContentT()
   * @generated
   */
  void setContentT(typeName value);

  /**
   * Returns the value of the '<em><b>Content L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content L</em>' containment reference.
   * @see #setContentL(typeLit)
   * @see org.xtext.go.GoPackage#gettype_ContentL()
   * @model containment="true"
   * @generated
   */
  typeLit getContentL();

  /**
   * Sets the value of the '{@link org.xtext.go.type#getContentL <em>Content L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content L</em>' containment reference.
   * @see #getContentL()
   * @generated
   */
  void setContentL(typeLit value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(type)
   * @see org.xtext.go.GoPackage#gettype_Content()
   * @model containment="true"
   * @generated
   */
  type getContent();

  /**
   * Sets the value of the '{@link org.xtext.go.type#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(type value);

} // type
