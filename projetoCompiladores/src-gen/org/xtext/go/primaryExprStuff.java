/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>primary Expr Stuff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.primaryExprStuff#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.xtext.go.primaryExprStuff#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.go.primaryExprStuff#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.xtext.go.primaryExprStuff#getTypeAssertion <em>Type Assertion</em>}</li>
 *   <li>{@link org.xtext.go.primaryExprStuff#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#getprimaryExprStuff()
 * @model
 * @generated
 */
public interface primaryExprStuff extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' attribute.
   * @see #setSelector(String)
   * @see org.xtext.go.GoPackage#getprimaryExprStuff_Selector()
   * @model
   * @generated
   */
  String getSelector();

  /**
   * Sets the value of the '{@link org.xtext.go.primaryExprStuff#getSelector <em>Selector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' attribute.
   * @see #getSelector()
   * @generated
   */
  void setSelector(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(index)
   * @see org.xtext.go.GoPackage#getprimaryExprStuff_Index()
   * @model containment="true"
   * @generated
   */
  index getIndex();

  /**
   * Sets the value of the '{@link org.xtext.go.primaryExprStuff#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(index value);

  /**
   * Returns the value of the '<em><b>Slice</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slice</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slice</em>' containment reference.
   * @see #setSlice(slice)
   * @see org.xtext.go.GoPackage#getprimaryExprStuff_Slice()
   * @model containment="true"
   * @generated
   */
  slice getSlice();

  /**
   * Sets the value of the '{@link org.xtext.go.primaryExprStuff#getSlice <em>Slice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slice</em>' containment reference.
   * @see #getSlice()
   * @generated
   */
  void setSlice(slice value);

  /**
   * Returns the value of the '<em><b>Type Assertion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Assertion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Assertion</em>' containment reference.
   * @see #setTypeAssertion(typeAssertion)
   * @see org.xtext.go.GoPackage#getprimaryExprStuff_TypeAssertion()
   * @model containment="true"
   * @generated
   */
  typeAssertion getTypeAssertion();

  /**
   * Sets the value of the '{@link org.xtext.go.primaryExprStuff#getTypeAssertion <em>Type Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Assertion</em>' containment reference.
   * @see #getTypeAssertion()
   * @generated
   */
  void setTypeAssertion(typeAssertion value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(arguments)
   * @see org.xtext.go.GoPackage#getprimaryExprStuff_Arguments()
   * @model containment="true"
   * @generated
   */
  arguments getArguments();

  /**
   * Sets the value of the '{@link org.xtext.go.primaryExprStuff#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(arguments value);

} // primaryExprStuff
