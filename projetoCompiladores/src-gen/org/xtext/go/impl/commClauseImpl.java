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
import org.xtext.go.commCase;
import org.xtext.go.commClause;
import org.xtext.go.statementList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>comm Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.commClauseImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.xtext.go.impl.commClauseImpl#getStmtList <em>Stmt List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class commClauseImpl extends MinimalEObjectImpl.Container implements commClause
{
  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected commCase case_;

  /**
   * The cached value of the '{@link #getStmtList() <em>Stmt List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmtList()
   * @generated
   * @ordered
   */
  protected statementList stmtList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected commClauseImpl()
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
    return GoPackage.Literals.COMM_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commCase getCase()
  {
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCase(commCase newCase, NotificationChain msgs)
  {
    commCase oldCase = case_;
    case_ = newCase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CLAUSE__CASE, oldCase, newCase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase(commCase newCase)
  {
    if (newCase != case_)
    {
      NotificationChain msgs = null;
      if (case_ != null)
        msgs = ((InternalEObject)case_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CLAUSE__CASE, null, msgs);
      if (newCase != null)
        msgs = ((InternalEObject)newCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CLAUSE__CASE, null, msgs);
      msgs = basicSetCase(newCase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CLAUSE__CASE, newCase, newCase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statementList getStmtList()
  {
    return stmtList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmtList(statementList newStmtList, NotificationChain msgs)
  {
    statementList oldStmtList = stmtList;
    stmtList = newStmtList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CLAUSE__STMT_LIST, oldStmtList, newStmtList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmtList(statementList newStmtList)
  {
    if (newStmtList != stmtList)
    {
      NotificationChain msgs = null;
      if (stmtList != null)
        msgs = ((InternalEObject)stmtList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CLAUSE__STMT_LIST, null, msgs);
      if (newStmtList != null)
        msgs = ((InternalEObject)newStmtList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CLAUSE__STMT_LIST, null, msgs);
      msgs = basicSetStmtList(newStmtList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CLAUSE__STMT_LIST, newStmtList, newStmtList));
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
      case GoPackage.COMM_CLAUSE__CASE:
        return basicSetCase(null, msgs);
      case GoPackage.COMM_CLAUSE__STMT_LIST:
        return basicSetStmtList(null, msgs);
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
      case GoPackage.COMM_CLAUSE__CASE:
        return getCase();
      case GoPackage.COMM_CLAUSE__STMT_LIST:
        return getStmtList();
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
      case GoPackage.COMM_CLAUSE__CASE:
        setCase((commCase)newValue);
        return;
      case GoPackage.COMM_CLAUSE__STMT_LIST:
        setStmtList((statementList)newValue);
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
      case GoPackage.COMM_CLAUSE__CASE:
        setCase((commCase)null);
        return;
      case GoPackage.COMM_CLAUSE__STMT_LIST:
        setStmtList((statementList)null);
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
      case GoPackage.COMM_CLAUSE__CASE:
        return case_ != null;
      case GoPackage.COMM_CLAUSE__STMT_LIST:
        return stmtList != null;
    }
    return super.eIsSet(featureID);
  }

} //commClauseImpl
