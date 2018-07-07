/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.typeLit#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.xtext.go.typeLit#getStructType <em>Struct Type</em>}</li>
 *   <li>{@link org.xtext.go.typeLit#getPointerType <em>Pointer Type</em>}</li>
 *   <li>{@link org.xtext.go.typeLit#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link org.xtext.go.typeLit#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.xtext.go.typeLit#getSliceType <em>Slice Type</em>}</li>
 *   <li>{@link org.xtext.go.typeLit#getMapType <em>Map Type</em>}</li>
 *   <li>{@link org.xtext.go.typeLit#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.GoPackage#gettypeLit()
 * @model
 * @generated
 */
public interface typeLit extends EObject
{
  /**
   * Returns the value of the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Type</em>' containment reference.
   * @see #setArrayType(arrayType)
   * @see org.xtext.go.GoPackage#gettypeLit_ArrayType()
   * @model containment="true"
   * @generated
   */
  arrayType getArrayType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getArrayType <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Type</em>' containment reference.
   * @see #getArrayType()
   * @generated
   */
  void setArrayType(arrayType value);

  /**
   * Returns the value of the '<em><b>Struct Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Type</em>' containment reference.
   * @see #setStructType(structType)
   * @see org.xtext.go.GoPackage#gettypeLit_StructType()
   * @model containment="true"
   * @generated
   */
  structType getStructType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getStructType <em>Struct Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct Type</em>' containment reference.
   * @see #getStructType()
   * @generated
   */
  void setStructType(structType value);

  /**
   * Returns the value of the '<em><b>Pointer Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer Type</em>' containment reference.
   * @see #setPointerType(pointerType)
   * @see org.xtext.go.GoPackage#gettypeLit_PointerType()
   * @model containment="true"
   * @generated
   */
  pointerType getPointerType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getPointerType <em>Pointer Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer Type</em>' containment reference.
   * @see #getPointerType()
   * @generated
   */
  void setPointerType(pointerType value);

  /**
   * Returns the value of the '<em><b>Function Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Type</em>' containment reference.
   * @see #setFunctionType(functionType)
   * @see org.xtext.go.GoPackage#gettypeLit_FunctionType()
   * @model containment="true"
   * @generated
   */
  functionType getFunctionType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getFunctionType <em>Function Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Type</em>' containment reference.
   * @see #getFunctionType()
   * @generated
   */
  void setFunctionType(functionType value);

  /**
   * Returns the value of the '<em><b>Interface Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Type</em>' containment reference.
   * @see #setInterfaceType(interfaceType)
   * @see org.xtext.go.GoPackage#gettypeLit_InterfaceType()
   * @model containment="true"
   * @generated
   */
  interfaceType getInterfaceType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getInterfaceType <em>Interface Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Type</em>' containment reference.
   * @see #getInterfaceType()
   * @generated
   */
  void setInterfaceType(interfaceType value);

  /**
   * Returns the value of the '<em><b>Slice Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slice Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slice Type</em>' containment reference.
   * @see #setSliceType(sliceType)
   * @see org.xtext.go.GoPackage#gettypeLit_SliceType()
   * @model containment="true"
   * @generated
   */
  sliceType getSliceType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getSliceType <em>Slice Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slice Type</em>' containment reference.
   * @see #getSliceType()
   * @generated
   */
  void setSliceType(sliceType value);

  /**
   * Returns the value of the '<em><b>Map Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Type</em>' containment reference.
   * @see #setMapType(mapType)
   * @see org.xtext.go.GoPackage#gettypeLit_MapType()
   * @model containment="true"
   * @generated
   */
  mapType getMapType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getMapType <em>Map Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Type</em>' containment reference.
   * @see #getMapType()
   * @generated
   */
  void setMapType(mapType value);

  /**
   * Returns the value of the '<em><b>Channel Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel Type</em>' containment reference.
   * @see #setChannelType(channelType)
   * @see org.xtext.go.GoPackage#gettypeLit_ChannelType()
   * @model containment="true"
   * @generated
   */
  channelType getChannelType();

  /**
   * Sets the value of the '{@link org.xtext.go.typeLit#getChannelType <em>Channel Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel Type</em>' containment reference.
   * @see #getChannelType()
   * @generated
   */
  void setChannelType(channelType value);

} // typeLit
