/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.receiver#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.GoPackage#getreceiver()
 * @model
 * @generated
 */
public interface receiver extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(parameters)
   * @see org.xtext.go.GoPackage#getreceiver_Parameters()
   * @model containment="true"
   * @generated
   */
  parameters getParameters();

  /**
   * Sets the value of the '{@link org.xtext.go.receiver#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(parameters value);

} // receiver
