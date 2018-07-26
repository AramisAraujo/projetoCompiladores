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
import org.xtext.go.methodExpr;
import org.xtext.go.receiverType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.methodExprImpl#getReceiverType <em>Receiver Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class methodExprImpl extends MinimalEObjectImpl.Container implements methodExpr
{
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
  protected methodExprImpl()
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
    return GoPackage.Literals.METHOD_EXPR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_EXPR__RECEIVER_TYPE, oldReceiverType, newReceiverType);
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
        msgs = ((InternalEObject)receiverType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_EXPR__RECEIVER_TYPE, null, msgs);
      if (newReceiverType != null)
        msgs = ((InternalEObject)newReceiverType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_EXPR__RECEIVER_TYPE, null, msgs);
      msgs = basicSetReceiverType(newReceiverType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_EXPR__RECEIVER_TYPE, newReceiverType, newReceiverType));
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
      case GoPackage.METHOD_EXPR__RECEIVER_TYPE:
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
      case GoPackage.METHOD_EXPR__RECEIVER_TYPE:
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
      case GoPackage.METHOD_EXPR__RECEIVER_TYPE:
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
      case GoPackage.METHOD_EXPR__RECEIVER_TYPE:
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
      case GoPackage.METHOD_EXPR__RECEIVER_TYPE:
        return receiverType != null;
    }
    return super.eIsSet(featureID);
  }

} //methodExprImpl
