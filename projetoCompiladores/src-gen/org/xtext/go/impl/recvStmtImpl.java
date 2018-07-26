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
import org.xtext.go.expression;
import org.xtext.go.expressionList;
import org.xtext.go.identifierList;
import org.xtext.go.recvStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>recv Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.recvStmtImpl#getExprList <em>Expr List</em>}</li>
 *   <li>{@link org.xtext.go.impl.recvStmtImpl#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.go.impl.recvStmtImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class recvStmtImpl extends MinimalEObjectImpl.Container implements recvStmt
{
  /**
   * The cached value of the '{@link #getExprList() <em>Expr List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprList()
   * @generated
   * @ordered
   */
  protected expressionList exprList;

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
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected expression expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected recvStmtImpl()
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
    return GoPackage.Literals.RECV_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionList getExprList()
  {
    return exprList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprList(expressionList newExprList, NotificationChain msgs)
  {
    expressionList oldExprList = exprList;
    exprList = newExprList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__EXPR_LIST, oldExprList, newExprList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprList(expressionList newExprList)
  {
    if (newExprList != exprList)
    {
      NotificationChain msgs = null;
      if (exprList != null)
        msgs = ((InternalEObject)exprList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__EXPR_LIST, null, msgs);
      if (newExprList != null)
        msgs = ((InternalEObject)newExprList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__EXPR_LIST, null, msgs);
      msgs = basicSetExprList(newExprList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__EXPR_LIST, newExprList, newExprList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__ID_LIST, oldIdList, newIdList);
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
        msgs = ((InternalEObject)idList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__ID_LIST, null, msgs);
      if (newIdList != null)
        msgs = ((InternalEObject)newIdList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__ID_LIST, null, msgs);
      msgs = basicSetIdList(newIdList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__ID_LIST, newIdList, newIdList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(expression newExpr, NotificationChain msgs)
  {
    expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__EXPR, newExpr, newExpr));
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
      case GoPackage.RECV_STMT__EXPR_LIST:
        return basicSetExprList(null, msgs);
      case GoPackage.RECV_STMT__ID_LIST:
        return basicSetIdList(null, msgs);
      case GoPackage.RECV_STMT__EXPR:
        return basicSetExpr(null, msgs);
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
      case GoPackage.RECV_STMT__EXPR_LIST:
        return getExprList();
      case GoPackage.RECV_STMT__ID_LIST:
        return getIdList();
      case GoPackage.RECV_STMT__EXPR:
        return getExpr();
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
      case GoPackage.RECV_STMT__EXPR_LIST:
        setExprList((expressionList)newValue);
        return;
      case GoPackage.RECV_STMT__ID_LIST:
        setIdList((identifierList)newValue);
        return;
      case GoPackage.RECV_STMT__EXPR:
        setExpr((expression)newValue);
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
      case GoPackage.RECV_STMT__EXPR_LIST:
        setExprList((expressionList)null);
        return;
      case GoPackage.RECV_STMT__ID_LIST:
        setIdList((identifierList)null);
        return;
      case GoPackage.RECV_STMT__EXPR:
        setExpr((expression)null);
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
      case GoPackage.RECV_STMT__EXPR_LIST:
        return exprList != null;
      case GoPackage.RECV_STMT__ID_LIST:
        return idList != null;
      case GoPackage.RECV_STMT__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //recvStmtImpl
