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
import org.xtext.go.statementList;
import org.xtext.go.typeCaseClause;
import org.xtext.go.typeSwitchCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Case Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.typeCaseClauseImpl#getTypeSwitchCase <em>Type Switch Case</em>}</li>
 *   <li>{@link org.xtext.go.impl.typeCaseClauseImpl#getStatementList <em>Statement List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeCaseClauseImpl extends MinimalEObjectImpl.Container implements typeCaseClause
{
  /**
   * The cached value of the '{@link #getTypeSwitchCase() <em>Type Switch Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSwitchCase()
   * @generated
   * @ordered
   */
  protected typeSwitchCase typeSwitchCase;

  /**
   * The cached value of the '{@link #getStatementList() <em>Statement List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementList()
   * @generated
   * @ordered
   */
  protected statementList statementList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeCaseClauseImpl()
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
    return GoPackage.Literals.TYPE_CASE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeSwitchCase getTypeSwitchCase()
  {
    return typeSwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSwitchCase(typeSwitchCase newTypeSwitchCase, NotificationChain msgs)
  {
    typeSwitchCase oldTypeSwitchCase = typeSwitchCase;
    typeSwitchCase = newTypeSwitchCase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE, oldTypeSwitchCase, newTypeSwitchCase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSwitchCase(typeSwitchCase newTypeSwitchCase)
  {
    if (newTypeSwitchCase != typeSwitchCase)
    {
      NotificationChain msgs = null;
      if (typeSwitchCase != null)
        msgs = ((InternalEObject)typeSwitchCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE, null, msgs);
      if (newTypeSwitchCase != null)
        msgs = ((InternalEObject)newTypeSwitchCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE, null, msgs);
      msgs = basicSetTypeSwitchCase(newTypeSwitchCase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE, newTypeSwitchCase, newTypeSwitchCase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statementList getStatementList()
  {
    return statementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementList(statementList newStatementList, NotificationChain msgs)
  {
    statementList oldStatementList = statementList;
    statementList = newStatementList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST, oldStatementList, newStatementList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementList(statementList newStatementList)
  {
    if (newStatementList != statementList)
    {
      NotificationChain msgs = null;
      if (statementList != null)
        msgs = ((InternalEObject)statementList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST, null, msgs);
      if (newStatementList != null)
        msgs = ((InternalEObject)newStatementList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST, null, msgs);
      msgs = basicSetStatementList(newStatementList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST, newStatementList, newStatementList));
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
      case GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE:
        return basicSetTypeSwitchCase(null, msgs);
      case GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST:
        return basicSetStatementList(null, msgs);
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
      case GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE:
        return getTypeSwitchCase();
      case GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST:
        return getStatementList();
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
      case GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE:
        setTypeSwitchCase((typeSwitchCase)newValue);
        return;
      case GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST:
        setStatementList((statementList)newValue);
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
      case GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE:
        setTypeSwitchCase((typeSwitchCase)null);
        return;
      case GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST:
        setStatementList((statementList)null);
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
      case GoPackage.TYPE_CASE_CLAUSE__TYPE_SWITCH_CASE:
        return typeSwitchCase != null;
      case GoPackage.TYPE_CASE_CLAUSE__STATEMENT_LIST:
        return statementList != null;
    }
    return super.eIsSet(featureID);
  }

} //typeCaseClauseImpl