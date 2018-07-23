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
import org.xtext.go.compositeLit;
import org.xtext.go.literalType;
import org.xtext.go.literalValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>composite Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.compositeLitImpl#getLiteralType <em>Literal Type</em>}</li>
 *   <li>{@link org.xtext.go.impl.compositeLitImpl#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class compositeLitImpl extends MinimalEObjectImpl.Container implements compositeLit
{
  /**
   * The cached value of the '{@link #getLiteralType() <em>Literal Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralType()
   * @generated
   * @ordered
   */
  protected literalType literalType;

  /**
   * The cached value of the '{@link #getLiteralValue() <em>Literal Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralValue()
   * @generated
   * @ordered
   */
  protected literalValue literalValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compositeLitImpl()
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
    return GoPackage.Literals.COMPOSITE_LIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literalType getLiteralType()
  {
    return literalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteralType(literalType newLiteralType, NotificationChain msgs)
  {
    literalType oldLiteralType = literalType;
    literalType = newLiteralType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERAL_TYPE, oldLiteralType, newLiteralType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralType(literalType newLiteralType)
  {
    if (newLiteralType != literalType)
    {
      NotificationChain msgs = null;
      if (literalType != null)
        msgs = ((InternalEObject)literalType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERAL_TYPE, null, msgs);
      if (newLiteralType != null)
        msgs = ((InternalEObject)newLiteralType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERAL_TYPE, null, msgs);
      msgs = basicSetLiteralType(newLiteralType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERAL_TYPE, newLiteralType, newLiteralType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literalValue getLiteralValue()
  {
    return literalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteralValue(literalValue newLiteralValue, NotificationChain msgs)
  {
    literalValue oldLiteralValue = literalValue;
    literalValue = newLiteralValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERAL_VALUE, oldLiteralValue, newLiteralValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralValue(literalValue newLiteralValue)
  {
    if (newLiteralValue != literalValue)
    {
      NotificationChain msgs = null;
      if (literalValue != null)
        msgs = ((InternalEObject)literalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERAL_VALUE, null, msgs);
      if (newLiteralValue != null)
        msgs = ((InternalEObject)newLiteralValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERAL_VALUE, null, msgs);
      msgs = basicSetLiteralValue(newLiteralValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERAL_VALUE, newLiteralValue, newLiteralValue));
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
      case GoPackage.COMPOSITE_LIT__LITERAL_TYPE:
        return basicSetLiteralType(null, msgs);
      case GoPackage.COMPOSITE_LIT__LITERAL_VALUE:
        return basicSetLiteralValue(null, msgs);
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
      case GoPackage.COMPOSITE_LIT__LITERAL_TYPE:
        return getLiteralType();
      case GoPackage.COMPOSITE_LIT__LITERAL_VALUE:
        return getLiteralValue();
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
      case GoPackage.COMPOSITE_LIT__LITERAL_TYPE:
        setLiteralType((literalType)newValue);
        return;
      case GoPackage.COMPOSITE_LIT__LITERAL_VALUE:
        setLiteralValue((literalValue)newValue);
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
      case GoPackage.COMPOSITE_LIT__LITERAL_TYPE:
        setLiteralType((literalType)null);
        return;
      case GoPackage.COMPOSITE_LIT__LITERAL_VALUE:
        setLiteralValue((literalValue)null);
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
      case GoPackage.COMPOSITE_LIT__LITERAL_TYPE:
        return literalType != null;
      case GoPackage.COMPOSITE_LIT__LITERAL_VALUE:
        return literalValue != null;
    }
    return super.eIsSet(featureID);
  }

} //compositeLitImpl