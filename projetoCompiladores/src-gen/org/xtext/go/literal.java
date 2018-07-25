/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.literal#getLitBasic <em>Lit Basic</em>}</li>
 *   <li>{@link org.xtext.go.literal#getLitComposite <em>Lit Composite</em>}</li>
 *   <li>{@link org.xtext.go.literal#getLitFunc <em>Lit Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getliteral()
 * @model
 * @generated
 */
public interface literal extends EObject
{
  /**
   * Returns the value of the '<em><b>Lit Basic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit Basic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit Basic</em>' containment reference.
   * @see #setLitBasic(basicLit)
   * @see org.xtext.go.GoPackage#getliteral_LitBasic()
   * @model containment="true"
   * @generated
   */
  basicLit getLitBasic();

  /**
   * Sets the value of the '{@link org.xtext.go.literal#getLitBasic <em>Lit Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit Basic</em>' containment reference.
   * @see #getLitBasic()
   * @generated
   */
  void setLitBasic(basicLit value);

  /**
   * Returns the value of the '<em><b>Lit Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit Composite</em>' containment reference.
   * @see #setLitComposite(compositeLit)
   * @see org.xtext.go.GoPackage#getliteral_LitComposite()
   * @model containment="true"
   * @generated
   */
  compositeLit getLitComposite();

  /**
   * Sets the value of the '{@link org.xtext.go.literal#getLitComposite <em>Lit Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit Composite</em>' containment reference.
   * @see #getLitComposite()
   * @generated
   */
  void setLitComposite(compositeLit value);

  /**
   * Returns the value of the '<em><b>Lit Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit Func</em>' containment reference.
   * @see #setLitFunc(functionLit)
   * @see org.xtext.go.GoPackage#getliteral_LitFunc()
   * @model containment="true"
   * @generated
   */
  functionLit getLitFunc();

  /**
   * Sets the value of the '{@link org.xtext.go.literal#getLitFunc <em>Lit Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit Func</em>' containment reference.
   * @see #getLitFunc()
   * @generated
   */
  void setLitFunc(functionLit value);

} // literal
