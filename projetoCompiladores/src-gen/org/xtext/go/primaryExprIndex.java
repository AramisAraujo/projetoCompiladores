/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>primary Expr Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.primaryExprIndex#getContent <em>Content</em>}</li>
 *   <li>{@link org.xtext.go.primaryExprIndex#getPrimaryExprIndex <em>Primary Expr Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getprimaryExprIndex()
 * @model
 * @generated
 */
public interface primaryExprIndex extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(primaryExprStuff)
   * @see org.xtext.go.GoPackage#getprimaryExprIndex_Content()
   * @model containment="true"
   * @generated
   */
  primaryExprStuff getContent();

  /**
   * Sets the value of the '{@link org.xtext.go.primaryExprIndex#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(primaryExprStuff value);

  /**
   * Returns the value of the '<em><b>Primary Expr Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Expr Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Expr Index</em>' containment reference.
   * @see #setPrimaryExprIndex(primaryExprIndex)
   * @see org.xtext.go.GoPackage#getprimaryExprIndex_PrimaryExprIndex()
   * @model containment="true"
   * @generated
   */
  primaryExprIndex getPrimaryExprIndex();

  /**
   * Sets the value of the '{@link org.xtext.go.primaryExprIndex#getPrimaryExprIndex <em>Primary Expr Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Expr Index</em>' containment reference.
   * @see #getPrimaryExprIndex()
   * @generated
   */
  void setPrimaryExprIndex(primaryExprIndex value);

} // primaryExprIndex