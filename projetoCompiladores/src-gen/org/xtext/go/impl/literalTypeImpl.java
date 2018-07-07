/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.go.GoPackage;
import org.xtext.go.arrayType;
import org.xtext.go.elementType;
import org.xtext.go.literalType;
import org.xtext.go.mapType;
import org.xtext.go.sliceType;
import org.xtext.go.structType;
import org.xtext.go.typeName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>literal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.literalTypeImpl#getStructType <em>Struct Type</em>}</li>
 *   <li>{@link org.xtext.go.impl.literalTypeImpl#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.xtext.go.impl.literalTypeImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.xtext.go.impl.literalTypeImpl#getSliceType <em>Slice Type</em>}</li>
 *   <li>{@link org.xtext.go.impl.literalTypeImpl#getMapType <em>Map Type</em>}</li>
 *   <li>{@link org.xtext.go.impl.literalTypeImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class literalTypeImpl extends MinimalEObjectImpl.Container implements literalType
{
  /**
   * The cached value of the '{@link #getStructType() <em>Struct Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructType()
   * @generated
   * @ordered
   */
  protected structType structType;

  /**
   * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayType()
   * @generated
   * @ordered
   */
  protected arrayType arrayType;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected elementType elementType;

  /**
   * The cached value of the '{@link #getSliceType() <em>Slice Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSliceType()
   * @generated
   * @ordered
   */
  protected sliceType sliceType;

  /**
   * The cached value of the '{@link #getMapType() <em>Map Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapType()
   * @generated
   * @ordered
   */
  protected mapType mapType;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected typeName typeName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected literalTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoPackage.Literals.LITERAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structType getStructType()
  {
    return structType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructType(structType newStructType, NotificationChain msgs)
  {
    structType oldStructType = structType;
    structType = newStructType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__STRUCT_TYPE, oldStructType, newStructType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructType(structType newStructType)
  {
    if (newStructType != structType)
    {
      NotificationChain msgs = null;
      if (structType != null)
        msgs = ((InternalEObject)structType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__STRUCT_TYPE, null, msgs);
      if (newStructType != null)
        msgs = ((InternalEObject)newStructType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__STRUCT_TYPE, null, msgs);
      msgs = basicSetStructType(newStructType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__STRUCT_TYPE, newStructType, newStructType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arrayType getArrayType()
  {
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayType(arrayType newArrayType, NotificationChain msgs)
  {
    arrayType oldArrayType = arrayType;
    arrayType = newArrayType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__ARRAY_TYPE, oldArrayType, newArrayType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayType(arrayType newArrayType)
  {
    if (newArrayType != arrayType)
    {
      NotificationChain msgs = null;
      if (arrayType != null)
        msgs = ((InternalEObject)arrayType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__ARRAY_TYPE, null, msgs);
      if (newArrayType != null)
        msgs = ((InternalEObject)newArrayType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__ARRAY_TYPE, null, msgs);
      msgs = basicSetArrayType(newArrayType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__ARRAY_TYPE, newArrayType, newArrayType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elementType getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementType(elementType newElementType, NotificationChain msgs)
  {
    elementType oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__ELEMENT_TYPE, oldElementType, newElementType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(elementType newElementType)
  {
    if (newElementType != elementType)
    {
      NotificationChain msgs = null;
      if (elementType != null)
        msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__ELEMENT_TYPE, null, msgs);
      if (newElementType != null)
        msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__ELEMENT_TYPE, null, msgs);
      msgs = basicSetElementType(newElementType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__ELEMENT_TYPE, newElementType, newElementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sliceType getSliceType()
  {
    return sliceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSliceType(sliceType newSliceType, NotificationChain msgs)
  {
    sliceType oldSliceType = sliceType;
    sliceType = newSliceType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__SLICE_TYPE, oldSliceType, newSliceType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSliceType(sliceType newSliceType)
  {
    if (newSliceType != sliceType)
    {
      NotificationChain msgs = null;
      if (sliceType != null)
        msgs = ((InternalEObject)sliceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__SLICE_TYPE, null, msgs);
      if (newSliceType != null)
        msgs = ((InternalEObject)newSliceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__SLICE_TYPE, null, msgs);
      msgs = basicSetSliceType(newSliceType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__SLICE_TYPE, newSliceType, newSliceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mapType getMapType()
  {
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapType(mapType newMapType, NotificationChain msgs)
  {
    mapType oldMapType = mapType;
    mapType = newMapType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__MAP_TYPE, oldMapType, newMapType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapType(mapType newMapType)
  {
    if (newMapType != mapType)
    {
      NotificationChain msgs = null;
      if (mapType != null)
        msgs = ((InternalEObject)mapType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__MAP_TYPE, null, msgs);
      if (newMapType != null)
        msgs = ((InternalEObject)newMapType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__MAP_TYPE, null, msgs);
      msgs = basicSetMapType(newMapType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__MAP_TYPE, newMapType, newMapType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeName getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeName(typeName newTypeName, NotificationChain msgs)
  {
    typeName oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__TYPE_NAME, oldTypeName, newTypeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(typeName newTypeName)
  {
    if (newTypeName != typeName)
    {
      NotificationChain msgs = null;
      if (typeName != null)
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_TYPE__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_TYPE__TYPE_NAME, newTypeName, newTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.LITERAL_TYPE__STRUCT_TYPE:
        return basicSetStructType(null, msgs);
      case GoPackage.LITERAL_TYPE__ARRAY_TYPE:
        return basicSetArrayType(null, msgs);
      case GoPackage.LITERAL_TYPE__ELEMENT_TYPE:
        return basicSetElementType(null, msgs);
      case GoPackage.LITERAL_TYPE__SLICE_TYPE:
        return basicSetSliceType(null, msgs);
      case GoPackage.LITERAL_TYPE__MAP_TYPE:
        return basicSetMapType(null, msgs);
      case GoPackage.LITERAL_TYPE__TYPE_NAME:
        return basicSetTypeName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoPackage.LITERAL_TYPE__STRUCT_TYPE:
        return getStructType();
      case GoPackage.LITERAL_TYPE__ARRAY_TYPE:
        return getArrayType();
      case GoPackage.LITERAL_TYPE__ELEMENT_TYPE:
        return getElementType();
      case GoPackage.LITERAL_TYPE__SLICE_TYPE:
        return getSliceType();
      case GoPackage.LITERAL_TYPE__MAP_TYPE:
        return getMapType();
      case GoPackage.LITERAL_TYPE__TYPE_NAME:
        return getTypeName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.LITERAL_TYPE__STRUCT_TYPE:
        setStructType((structType)newValue);
        return;
      case GoPackage.LITERAL_TYPE__ARRAY_TYPE:
        setArrayType((arrayType)newValue);
        return;
      case GoPackage.LITERAL_TYPE__ELEMENT_TYPE:
        setElementType((elementType)newValue);
        return;
      case GoPackage.LITERAL_TYPE__SLICE_TYPE:
        setSliceType((sliceType)newValue);
        return;
      case GoPackage.LITERAL_TYPE__MAP_TYPE:
        setMapType((mapType)newValue);
        return;
      case GoPackage.LITERAL_TYPE__TYPE_NAME:
        setTypeName((typeName)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.LITERAL_TYPE__STRUCT_TYPE:
        setStructType((structType)null);
        return;
      case GoPackage.LITERAL_TYPE__ARRAY_TYPE:
        setArrayType((arrayType)null);
        return;
      case GoPackage.LITERAL_TYPE__ELEMENT_TYPE:
        setElementType((elementType)null);
        return;
      case GoPackage.LITERAL_TYPE__SLICE_TYPE:
        setSliceType((sliceType)null);
        return;
      case GoPackage.LITERAL_TYPE__MAP_TYPE:
        setMapType((mapType)null);
        return;
      case GoPackage.LITERAL_TYPE__TYPE_NAME:
        setTypeName((typeName)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.LITERAL_TYPE__STRUCT_TYPE:
        return structType != null;
      case GoPackage.LITERAL_TYPE__ARRAY_TYPE:
        return arrayType != null;
      case GoPackage.LITERAL_TYPE__ELEMENT_TYPE:
        return elementType != null;
      case GoPackage.LITERAL_TYPE__SLICE_TYPE:
        return sliceType != null;
      case GoPackage.LITERAL_TYPE__MAP_TYPE:
        return mapType != null;
      case GoPackage.LITERAL_TYPE__TYPE_NAME:
        return typeName != null;
    }
    return super.eIsSet(featureID);
  }

} //literalTypeImpl
