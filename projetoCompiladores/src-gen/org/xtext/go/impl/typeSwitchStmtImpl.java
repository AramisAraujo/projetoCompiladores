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
import org.xtext.go.simpleStmt;
import org.xtext.go.typeCaseClause;
import org.xtext.go.typeSwitchGuard;
import org.xtext.go.typeSwitchStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Switch Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.typeSwitchStmtImpl#getSimpleStatement <em>Simple Statement</em>}</li>
 *   <li>{@link org.xtext.go.impl.typeSwitchStmtImpl#getTypeSwitchGuard <em>Type Switch Guard</em>}</li>
 *   <li>{@link org.xtext.go.impl.typeSwitchStmtImpl#getTypeCaseClauses <em>Type Case Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeSwitchStmtImpl extends MinimalEObjectImpl.Container implements typeSwitchStmt
{
  /**
   * The cached value of the '{@link #getSimpleStatement() <em>Simple Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleStatement()
   * @generated
   * @ordered
   */
  protected simpleStmt simpleStatement;

  /**
   * The cached value of the '{@link #getTypeSwitchGuard() <em>Type Switch Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSwitchGuard()
   * @generated
   * @ordered
   */
  protected typeSwitchGuard typeSwitchGuard;

  /**
   * The cached value of the '{@link #getTypeCaseClauses() <em>Type Case Clauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeCaseClauses()
   * @generated
   * @ordered
   */
  protected EList<typeCaseClause> typeCaseClauses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeSwitchStmtImpl()
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
    return GoPackage.Literals.TYPE_SWITCH_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleStmt getSimpleStatement()
  {
    return simpleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleStatement(simpleStmt newSimpleStatement, NotificationChain msgs)
  {
    simpleStmt oldSimpleStatement = simpleStatement;
    simpleStatement = newSimpleStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT, oldSimpleStatement, newSimpleStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleStatement(simpleStmt newSimpleStatement)
  {
    if (newSimpleStatement != simpleStatement)
    {
      NotificationChain msgs = null;
      if (simpleStatement != null)
        msgs = ((InternalEObject)simpleStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT, null, msgs);
      if (newSimpleStatement != null)
        msgs = ((InternalEObject)newSimpleStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT, null, msgs);
      msgs = basicSetSimpleStatement(newSimpleStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT, newSimpleStatement, newSimpleStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeSwitchGuard getTypeSwitchGuard()
  {
    return typeSwitchGuard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSwitchGuard(typeSwitchGuard newTypeSwitchGuard, NotificationChain msgs)
  {
    typeSwitchGuard oldTypeSwitchGuard = typeSwitchGuard;
    typeSwitchGuard = newTypeSwitchGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD, oldTypeSwitchGuard, newTypeSwitchGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSwitchGuard(typeSwitchGuard newTypeSwitchGuard)
  {
    if (newTypeSwitchGuard != typeSwitchGuard)
    {
      NotificationChain msgs = null;
      if (typeSwitchGuard != null)
        msgs = ((InternalEObject)typeSwitchGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD, null, msgs);
      if (newTypeSwitchGuard != null)
        msgs = ((InternalEObject)newTypeSwitchGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD, null, msgs);
      msgs = basicSetTypeSwitchGuard(newTypeSwitchGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD, newTypeSwitchGuard, newTypeSwitchGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<typeCaseClause> getTypeCaseClauses()
  {
    if (typeCaseClauses == null)
    {
      typeCaseClauses = new EObjectContainmentEList<typeCaseClause>(typeCaseClause.class, this, GoPackage.TYPE_SWITCH_STMT__TYPE_CASE_CLAUSES);
    }
    return typeCaseClauses;
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
      case GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT:
        return basicSetSimpleStatement(null, msgs);
      case GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD:
        return basicSetTypeSwitchGuard(null, msgs);
      case GoPackage.TYPE_SWITCH_STMT__TYPE_CASE_CLAUSES:
        return ((InternalEList<?>)getTypeCaseClauses()).basicRemove(otherEnd, msgs);
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
      case GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT:
        return getSimpleStatement();
      case GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD:
        return getTypeSwitchGuard();
      case GoPackage.TYPE_SWITCH_STMT__TYPE_CASE_CLAUSES:
        return getTypeCaseClauses();
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
      case GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT:
        setSimpleStatement((simpleStmt)newValue);
        return;
      case GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD:
        setTypeSwitchGuard((typeSwitchGuard)newValue);
        return;
      case GoPackage.TYPE_SWITCH_STMT__TYPE_CASE_CLAUSES:
        getTypeCaseClauses().clear();
        getTypeCaseClauses().addAll((Collection<? extends typeCaseClause>)newValue);
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
      case GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT:
        setSimpleStatement((simpleStmt)null);
        return;
      case GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD:
        setTypeSwitchGuard((typeSwitchGuard)null);
        return;
      case GoPackage.TYPE_SWITCH_STMT__TYPE_CASE_CLAUSES:
        getTypeCaseClauses().clear();
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
      case GoPackage.TYPE_SWITCH_STMT__SIMPLE_STATEMENT:
        return simpleStatement != null;
      case GoPackage.TYPE_SWITCH_STMT__TYPE_SWITCH_GUARD:
        return typeSwitchGuard != null;
      case GoPackage.TYPE_SWITCH_STMT__TYPE_CASE_CLAUSES:
        return typeCaseClauses != null && !typeCaseClauses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //typeSwitchStmtImpl