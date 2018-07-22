/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.function#getSig <em>Sig</em>}</li>
 *   <li>{@link org.xtext.go.function#getCodeBlock <em>Code Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getfunction()
 * @model
 * @generated
 */
public interface function extends EObject
{
  /**
   * Returns the value of the '<em><b>Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig</em>' containment reference.
   * @see #setSig(signature)
   * @see org.xtext.go.GoPackage#getfunction_Sig()
   * @model containment="true"
   * @generated
   */
  signature getSig();

  /**
   * Sets the value of the '{@link org.xtext.go.function#getSig <em>Sig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig</em>' containment reference.
   * @see #getSig()
   * @generated
   */
  void setSig(signature value);

  /**
   * Returns the value of the '<em><b>Code Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Block</em>' containment reference.
   * @see #setCodeBlock(block)
   * @see org.xtext.go.GoPackage#getfunction_CodeBlock()
   * @model containment="true"
   * @generated
   */
  block getCodeBlock();

  /**
   * Sets the value of the '{@link org.xtext.go.function#getCodeBlock <em>Code Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code Block</em>' containment reference.
   * @see #getCodeBlock()
   * @generated
   */
  void setCodeBlock(block value);

} // function
