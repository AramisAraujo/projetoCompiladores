/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.go.GoPackage;
import org.xtext.go.expressionList;
import org.xtext.go.identifierList;
import org.xtext.go.type;
import org.xtext.go.varSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>var Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.varSpecImpl#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.go.impl.varSpecImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.go.impl.varSpecImpl#getExprList <em>Expr List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class varSpecImpl extends MinimalEObjectImpl.Container implements varSpec
{
  /**
   * The cached value of the '{@link #getIdList() <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdList()
   * @generated
   * @ordered
   */
  protected identifierList idList;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type type;

  /**
   * The cached value of the '{@link #getExprList() <em>Expr List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprList()
   * @generated
   * @ordered
   */
  protected EList<expressionList> exprList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected varSpecImpl()
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
    return GoPackage.Literals.VAR_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifierList getIdList()
  {
    return idList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdList(identifierList newIdList, NotificationChain msgs)
  {
    identifierList oldIdList = idList;
    idList = newIdList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__ID_LIST, oldIdList, newIdList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdList(identifierList newIdList)
  {
    if (newIdList != idList)
    {
      NotificationChain msgs = null;
      if (idList != null)
        msgs = ((InternalEObject)idList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__ID_LIST, null, msgs);
      if (newIdList != null)
        msgs = ((InternalEObject)newIdList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__ID_LIST, null, msgs);
      msgs = basicSetIdList(newIdList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__ID_LIST, newIdList, newIdList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type newType, NotificationChain msgs)
  {
    type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expressionList> getExprList()
  {
    if (exprList == null)
    {
      exprList = new EObjectContainmentEList<expressionList>(expressionList.class, this, GoPackage.VAR_SPEC__EXPR_LIST);
    }
    return exprList;
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
      case GoPackage.VAR_SPEC__ID_LIST:
        return basicSetIdList(null, msgs);
      case GoPackage.VAR_SPEC__TYPE:
        return basicSetType(null, msgs);
      case GoPackage.VAR_SPEC__EXPR_LIST:
        return ((InternalEList<?>)getExprList()).basicRemove(otherEnd, msgs);
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
      case GoPackage.VAR_SPEC__ID_LIST:
        return getIdList();
      case GoPackage.VAR_SPEC__TYPE:
        return getType();
      case GoPackage.VAR_SPEC__EXPR_LIST:
        return getExprList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.VAR_SPEC__ID_LIST:
        setIdList((identifierList)newValue);
        return;
      case GoPackage.VAR_SPEC__TYPE:
        setType((type)newValue);
        return;
      case GoPackage.VAR_SPEC__EXPR_LIST:
        getExprList().clear();
        getExprList().addAll((Collection<? extends expressionList>)newValue);
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
      case GoPackage.VAR_SPEC__ID_LIST:
        setIdList((identifierList)null);
        return;
      case GoPackage.VAR_SPEC__TYPE:
        setType((type)null);
        return;
      case GoPackage.VAR_SPEC__EXPR_LIST:
        getExprList().clear();
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
      case GoPackage.VAR_SPEC__ID_LIST:
        return idList != null;
      case GoPackage.VAR_SPEC__TYPE:
        return type != null;
      case GoPackage.VAR_SPEC__EXPR_LIST:
        return exprList != null && !exprList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //varSpecImpl
