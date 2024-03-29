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
import org.xtext.go.receiverType;
import org.xtext.go.typeName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>receiver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.receiverTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.go.impl.receiverTypeImpl#getReceiverType <em>Receiver Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class receiverTypeImpl extends MinimalEObjectImpl.Container implements receiverType
{
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
   * The cached value of the '{@link #getReceiverType() <em>Receiver Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiverType()
   * @generated
   * @ordered
   */
  protected receiverType receiverType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected receiverTypeImpl()
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
    return GoPackage.Literals.RECEIVER_TYPE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RECEIVER_TYPE__TYPE_NAME, oldTypeName, newTypeName);
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
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECEIVER_TYPE__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECEIVER_TYPE__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RECEIVER_TYPE__TYPE_NAME, newTypeName, newTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public receiverType getReceiverType()
  {
    return receiverType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReceiverType(receiverType newReceiverType, NotificationChain msgs)
  {
    receiverType oldReceiverType = receiverType;
    receiverType = newReceiverType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RECEIVER_TYPE__RECEIVER_TYPE, oldReceiverType, newReceiverType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiverType(receiverType newReceiverType)
  {
    if (newReceiverType != receiverType)
    {
      NotificationChain msgs = null;
      if (receiverType != null)
        msgs = ((InternalEObject)receiverType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECEIVER_TYPE__RECEIVER_TYPE, null, msgs);
      if (newReceiverType != null)
        msgs = ((InternalEObject)newReceiverType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECEIVER_TYPE__RECEIVER_TYPE, null, msgs);
      msgs = basicSetReceiverType(newReceiverType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RECEIVER_TYPE__RECEIVER_TYPE, newReceiverType, newReceiverType));
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
      case GoPackage.RECEIVER_TYPE__TYPE_NAME:
        return basicSetTypeName(null, msgs);
      case GoPackage.RECEIVER_TYPE__RECEIVER_TYPE:
        return basicSetReceiverType(null, msgs);
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
      case GoPackage.RECEIVER_TYPE__TYPE_NAME:
        return getTypeName();
      case GoPackage.RECEIVER_TYPE__RECEIVER_TYPE:
        return getReceiverType();
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
      case GoPackage.RECEIVER_TYPE__TYPE_NAME:
        setTypeName((typeName)newValue);
        return;
      case GoPackage.RECEIVER_TYPE__RECEIVER_TYPE:
        setReceiverType((receiverType)newValue);
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
      case GoPackage.RECEIVER_TYPE__TYPE_NAME:
        setTypeName((typeName)null);
        return;
      case GoPackage.RECEIVER_TYPE__RECEIVER_TYPE:
        setReceiverType((receiverType)null);
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
      case GoPackage.RECEIVER_TYPE__TYPE_NAME:
        return typeName != null;
      case GoPackage.RECEIVER_TYPE__RECEIVER_TYPE:
        return receiverType != null;
    }
    return super.eIsSet(featureID);
  }

} //receiverTypeImpl
