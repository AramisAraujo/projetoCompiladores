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
import org.xtext.go.primaryExprArguments;
import org.xtext.go.primaryExprStuff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primary Expr Arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.primaryExprArgumentsImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprArgumentsImpl#getPrimaryExprArguments <em>Primary Expr Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class primaryExprArgumentsImpl extends MinimalEObjectImpl.Container implements primaryExprArguments
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
   * The cached value of the '{@link #getPrimaryExprArguments() <em>Primary Expr Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprArguments()
   * @generated
   * @ordered
   */
  protected primaryExprArguments primaryExprArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected primaryExprArgumentsImpl()
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
    return GoPackage.Literals.PRIMARY_EXPR_ARGUMENTS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT, oldContent, newContent);
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
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT, newContent, newContent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprArguments getPrimaryExprArguments()
  {
    return primaryExprArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprArguments(primaryExprArguments newPrimaryExprArguments, NotificationChain msgs)
  {
    primaryExprArguments oldPrimaryExprArguments = primaryExprArguments;
    primaryExprArguments = newPrimaryExprArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS, oldPrimaryExprArguments, newPrimaryExprArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprArguments(primaryExprArguments newPrimaryExprArguments)
  {
    if (newPrimaryExprArguments != primaryExprArguments)
    {
      NotificationChain msgs = null;
      if (primaryExprArguments != null)
        msgs = ((InternalEObject)primaryExprArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS, null, msgs);
      if (newPrimaryExprArguments != null)
        msgs = ((InternalEObject)newPrimaryExprArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS, null, msgs);
      msgs = basicSetPrimaryExprArguments(newPrimaryExprArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS, newPrimaryExprArguments, newPrimaryExprArguments));
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
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT:
        return basicSetContent(null, msgs);
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS:
        return basicSetPrimaryExprArguments(null, msgs);
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
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT:
        return getContent();
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS:
        return getPrimaryExprArguments();
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
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT:
        setContent((primaryExprStuff)newValue);
        return;
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS:
        setPrimaryExprArguments((primaryExprArguments)newValue);
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
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT:
        setContent((primaryExprStuff)null);
        return;
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS:
        setPrimaryExprArguments((primaryExprArguments)null);
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
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__CONTENT:
        return content != null;
      case GoPackage.PRIMARY_EXPR_ARGUMENTS__PRIMARY_EXPR_ARGUMENTS:
        return primaryExprArguments != null;
    }
    return super.eIsSet(featureID);
  }

} //primaryExprArgumentsImpl
