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
import org.xtext.go.rangeClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>range Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.rangeClauseImpl#getExpressionList <em>Expression List</em>}</li>
 *   <li>{@link org.xtext.go.impl.rangeClauseImpl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.go.impl.rangeClauseImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class rangeClauseImpl extends MinimalEObjectImpl.Container implements rangeClause
{
  /**
   * The cached value of the '{@link #getExpressionList() <em>Expression List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionList()
   * @generated
   * @ordered
   */
  protected expressionList expressionList;

  /**
   * The default value of the '{@link #getIdentifierList() <em>Identifier List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierList()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_LIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifierList() <em>Identifier List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierList()
   * @generated
   * @ordered
   */
  protected String identifierList = IDENTIFIER_LIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rangeClauseImpl()
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
    return GoPackage.Literals.RANGE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionList getExpressionList()
  {
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionList(expressionList newExpressionList, NotificationChain msgs)
  {
    expressionList oldExpressionList = expressionList;
    expressionList = newExpressionList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSION_LIST, oldExpressionList, newExpressionList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionList(expressionList newExpressionList)
  {
    if (newExpressionList != expressionList)
    {
      NotificationChain msgs = null;
      if (expressionList != null)
        msgs = ((InternalEObject)expressionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSION_LIST, null, msgs);
      if (newExpressionList != null)
        msgs = ((InternalEObject)newExpressionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSION_LIST, null, msgs);
      msgs = basicSetExpressionList(newExpressionList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSION_LIST, newExpressionList, newExpressionList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifierList()
  {
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierList(String newIdentifierList)
  {
    String oldIdentifierList = identifierList;
    identifierList = newIdentifierList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__IDENTIFIER_LIST, oldIdentifierList, identifierList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSION, newExpression, newExpression));
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
      case GoPackage.RANGE_CLAUSE__EXPRESSION_LIST:
        return basicSetExpressionList(null, msgs);
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case GoPackage.RANGE_CLAUSE__EXPRESSION_LIST:
        return getExpressionList();
      case GoPackage.RANGE_CLAUSE__IDENTIFIER_LIST:
        return getIdentifierList();
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        return getExpression();
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
      case GoPackage.RANGE_CLAUSE__EXPRESSION_LIST:
        setExpressionList((expressionList)newValue);
        return;
      case GoPackage.RANGE_CLAUSE__IDENTIFIER_LIST:
        setIdentifierList((String)newValue);
        return;
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        setExpression((expression)newValue);
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
      case GoPackage.RANGE_CLAUSE__EXPRESSION_LIST:
        setExpressionList((expressionList)null);
        return;
      case GoPackage.RANGE_CLAUSE__IDENTIFIER_LIST:
        setIdentifierList(IDENTIFIER_LIST_EDEFAULT);
        return;
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        setExpression((expression)null);
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
      case GoPackage.RANGE_CLAUSE__EXPRESSION_LIST:
        return expressionList != null;
      case GoPackage.RANGE_CLAUSE__IDENTIFIER_LIST:
        return IDENTIFIER_LIST_EDEFAULT == null ? identifierList != null : !IDENTIFIER_LIST_EDEFAULT.equals(identifierList);
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        return expression != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (identifierList: ");
    result.append(identifierList);
    result.append(')');
    return result.toString();
  }

} //rangeClauseImpl
