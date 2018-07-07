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
import org.xtext.go.primaryExpr;
import org.xtext.go.typeSwitchGuard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Switch Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.typeSwitchGuardImpl#getPrimaryExpr <em>Primary Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeSwitchGuardImpl extends MinimalEObjectImpl.Container implements typeSwitchGuard
{
  /**
   * The cached value of the '{@link #getPrimaryExpr() <em>Primary Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExpr()
   * @generated
   * @ordered
   */
  protected primaryExpr primaryExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeSwitchGuardImpl()
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
    return GoPackage.Literals.TYPE_SWITCH_GUARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExpr getPrimaryExpr()
  {
    return primaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExpr(primaryExpr newPrimaryExpr, NotificationChain msgs)
  {
    primaryExpr oldPrimaryExpr = primaryExpr;
    primaryExpr = newPrimaryExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR, oldPrimaryExpr, newPrimaryExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExpr(primaryExpr newPrimaryExpr)
  {
    if (newPrimaryExpr != primaryExpr)
    {
      NotificationChain msgs = null;
      if (primaryExpr != null)
        msgs = ((InternalEObject)primaryExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR, null, msgs);
      if (newPrimaryExpr != null)
        msgs = ((InternalEObject)newPrimaryExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR, null, msgs);
      msgs = basicSetPrimaryExpr(newPrimaryExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR, newPrimaryExpr, newPrimaryExpr));
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
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR:
        return basicSetPrimaryExpr(null, msgs);
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
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR:
        return getPrimaryExpr();
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
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR:
        setPrimaryExpr((primaryExpr)newValue);
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
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR:
        setPrimaryExpr((primaryExpr)null);
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
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPR:
        return primaryExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //typeSwitchGuardImpl
