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
import org.xtext.go.primaryExprSelector;
import org.xtext.go.primaryExprStuff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primary Expr Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.primaryExprSelectorImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprSelectorImpl#getPrimaryExprSelector <em>Primary Expr Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primaryExprSelectorImpl extends MinimalEObjectImpl.Container implements primaryExprSelector
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected primaryExprStuff content;

  /**
   * The cached value of the '{@link #getPrimaryExprSelector() <em>Primary Expr Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprSelector()
   * @generated
   * @ordered
   */
  protected primaryExprSelector primaryExprSelector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected primaryExprSelectorImpl()
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
    return GoPackage.Literals.PRIMARY_EXPR_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprStuff getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(primaryExprStuff newContent, NotificationChain msgs)
  {
    primaryExprStuff oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(primaryExprStuff newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT, newContent, newContent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprSelector getPrimaryExprSelector()
  {
    return primaryExprSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprSelector(primaryExprSelector newPrimaryExprSelector, NotificationChain msgs)
  {
    primaryExprSelector oldPrimaryExprSelector = primaryExprSelector;
    primaryExprSelector = newPrimaryExprSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR, oldPrimaryExprSelector, newPrimaryExprSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprSelector(primaryExprSelector newPrimaryExprSelector)
  {
    if (newPrimaryExprSelector != primaryExprSelector)
    {
      NotificationChain msgs = null;
      if (primaryExprSelector != null)
        msgs = ((InternalEObject)primaryExprSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR, null, msgs);
      if (newPrimaryExprSelector != null)
        msgs = ((InternalEObject)newPrimaryExprSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR, null, msgs);
      msgs = basicSetPrimaryExprSelector(newPrimaryExprSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR, newPrimaryExprSelector, newPrimaryExprSelector));
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
      case GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT:
        return basicSetContent(null, msgs);
      case GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR:
        return basicSetPrimaryExprSelector(null, msgs);
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
      case GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT:
        return getContent();
      case GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR:
        return getPrimaryExprSelector();
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
      case GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT:
        setContent((primaryExprStuff)newValue);
        return;
      case GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR:
        setPrimaryExprSelector((primaryExprSelector)newValue);
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
      case GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT:
        setContent((primaryExprStuff)null);
        return;
      case GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR:
        setPrimaryExprSelector((primaryExprSelector)null);
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
      case GoPackage.PRIMARY_EXPR_SELECTOR__CONTENT:
        return content != null;
      case GoPackage.PRIMARY_EXPR_SELECTOR__PRIMARY_EXPR_SELECTOR:
        return primaryExprSelector != null;
    }
    return super.eIsSet(featureID);
  }

} //primaryExprSelectorImpl