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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.typeSwitchGuardImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.impl.typeSwitchGuardImpl#getPrimaryExpression <em>Primary Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typeSwitchGuardImpl extends MinimalEObjectImpl.Container implements typeSwitchGuard
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrimaryExpression() <em>Primary Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExpression()
   * @generated
   * @ordered
   */
  protected primaryExpr primaryExpression;

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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_GUARD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExpr getPrimaryExpression()
  {
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExpression(primaryExpr newPrimaryExpression, NotificationChain msgs)
  {
    primaryExpr oldPrimaryExpression = primaryExpression;
    primaryExpression = newPrimaryExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION, oldPrimaryExpression, newPrimaryExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExpression(primaryExpr newPrimaryExpression)
  {
    if (newPrimaryExpression != primaryExpression)
    {
      NotificationChain msgs = null;
      if (primaryExpression != null)
        msgs = ((InternalEObject)primaryExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION, null, msgs);
      if (newPrimaryExpression != null)
        msgs = ((InternalEObject)newPrimaryExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION, null, msgs);
      msgs = basicSetPrimaryExpression(newPrimaryExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION, newPrimaryExpression, newPrimaryExpression));
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
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION:
        return basicSetPrimaryExpression(null, msgs);
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
      case GoPackage.TYPE_SWITCH_GUARD__NAME:
        return getName();
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION:
        return getPrimaryExpression();
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
      case GoPackage.TYPE_SWITCH_GUARD__NAME:
        setName((String)newValue);
        return;
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION:
        setPrimaryExpression((primaryExpr)newValue);
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
      case GoPackage.TYPE_SWITCH_GUARD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION:
        setPrimaryExpression((primaryExpr)null);
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
      case GoPackage.TYPE_SWITCH_GUARD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GoPackage.TYPE_SWITCH_GUARD__PRIMARY_EXPRESSION:
        return primaryExpression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //typeSwitchGuardImpl
