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
import org.xtext.go.exprCaseClause;
import org.xtext.go.exprSwitchCase;
import org.xtext.go.statementList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expr Case Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.exprCaseClauseImpl#getExprSwitchCase <em>Expr Switch Case</em>}</li>
 *   <li>{@link org.xtext.go.impl.exprCaseClauseImpl#getStmtList <em>Stmt List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class exprCaseClauseImpl extends MinimalEObjectImpl.Container implements exprCaseClause
{
  /**
   * The cached value of the '{@link #getExprSwitchCase() <em>Expr Switch Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSwitchCase()
   * @generated
   * @ordered
   */
  protected exprSwitchCase exprSwitchCase;

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
  protected exprCaseClauseImpl()
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
    return GoPackage.Literals.EXPR_CASE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprSwitchCase getExprSwitchCase()
  {
    return exprSwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSwitchCase(exprSwitchCase newExprSwitchCase, NotificationChain msgs)
  {
    exprSwitchCase oldExprSwitchCase = exprSwitchCase;
    exprSwitchCase = newExprSwitchCase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE, oldExprSwitchCase, newExprSwitchCase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSwitchCase(exprSwitchCase newExprSwitchCase)
  {
    if (newExprSwitchCase != exprSwitchCase)
    {
      NotificationChain msgs = null;
      if (exprSwitchCase != null)
        msgs = ((InternalEObject)exprSwitchCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE, null, msgs);
      if (newExprSwitchCase != null)
        msgs = ((InternalEObject)newExprSwitchCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE, null, msgs);
      msgs = basicSetExprSwitchCase(newExprSwitchCase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE, newExprSwitchCase, newExprSwitchCase));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__STMT_LIST, oldStmtList, newStmtList);
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
        msgs = ((InternalEObject)stmtList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__STMT_LIST, null, msgs);
      if (newStmtList != null)
        msgs = ((InternalEObject)newStmtList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__STMT_LIST, null, msgs);
      msgs = basicSetStmtList(newStmtList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__STMT_LIST, newStmtList, newStmtList));
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE:
        return basicSetExprSwitchCase(null, msgs);
      case GoPackage.EXPR_CASE_CLAUSE__STMT_LIST:
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE:
        return getExprSwitchCase();
      case GoPackage.EXPR_CASE_CLAUSE__STMT_LIST:
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE:
        setExprSwitchCase((exprSwitchCase)newValue);
        return;
      case GoPackage.EXPR_CASE_CLAUSE__STMT_LIST:
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE:
        setExprSwitchCase((exprSwitchCase)null);
        return;
      case GoPackage.EXPR_CASE_CLAUSE__STMT_LIST:
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR_SWITCH_CASE:
        return exprSwitchCase != null;
      case GoPackage.EXPR_CASE_CLAUSE__STMT_LIST:
        return stmtList != null;
    }
    return super.eIsSet(featureID);
  }

} //exprCaseClauseImpl
