/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.go.Expression;
import org.xtext.go.Expression_line;
import org.xtext.go.GoPackage;
import org.xtext.go.Unary_expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.ExpressionImpl#getUnary_expr <em>Unary expr</em>}</li>
 *   <li>{@link org.xtext.go.impl.ExpressionImpl#getExpression_line <em>Expression line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends OperandImpl implements Expression
{
  /**
   * The cached value of the '{@link #getUnary_expr() <em>Unary expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_expr()
   * @generated
   * @ordered
   */
  protected Unary_expr unary_expr;

  /**
   * The cached value of the '{@link #getExpression_line() <em>Expression line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_line()
   * @generated
   * @ordered
   */
  protected Expression_line expression_line;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return GoPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary_expr getUnary_expr()
  {
    return unary_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnary_expr(Unary_expr newUnary_expr, NotificationChain msgs)
  {
    Unary_expr oldUnary_expr = unary_expr;
    unary_expr = newUnary_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__UNARY_EXPR, oldUnary_expr, newUnary_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnary_expr(Unary_expr newUnary_expr)
  {
    if (newUnary_expr != unary_expr)
    {
      NotificationChain msgs = null;
      if (unary_expr != null)
        msgs = ((InternalEObject)unary_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__UNARY_EXPR, null, msgs);
      if (newUnary_expr != null)
        msgs = ((InternalEObject)newUnary_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__UNARY_EXPR, null, msgs);
      msgs = basicSetUnary_expr(newUnary_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__UNARY_EXPR, newUnary_expr, newUnary_expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_line getExpression_line()
  {
    return expression_line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_line(Expression_line newExpression_line, NotificationChain msgs)
  {
    Expression_line oldExpression_line = expression_line;
    expression_line = newExpression_line;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__EXPRESSION_LINE, oldExpression_line, newExpression_line);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_line(Expression_line newExpression_line)
  {
    if (newExpression_line != expression_line)
    {
      NotificationChain msgs = null;
      if (expression_line != null)
        msgs = ((InternalEObject)expression_line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__EXPRESSION_LINE, null, msgs);
      if (newExpression_line != null)
        msgs = ((InternalEObject)newExpression_line).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__EXPRESSION_LINE, null, msgs);
      msgs = basicSetExpression_line(newExpression_line, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__EXPRESSION_LINE, newExpression_line, newExpression_line));
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
      case GoPackage.EXPRESSION__UNARY_EXPR:
        return basicSetUnary_expr(null, msgs);
      case GoPackage.EXPRESSION__EXPRESSION_LINE:
        return basicSetExpression_line(null, msgs);
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
      case GoPackage.EXPRESSION__UNARY_EXPR:
        return getUnary_expr();
      case GoPackage.EXPRESSION__EXPRESSION_LINE:
        return getExpression_line();
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
      case GoPackage.EXPRESSION__UNARY_EXPR:
        setUnary_expr((Unary_expr)newValue);
        return;
      case GoPackage.EXPRESSION__EXPRESSION_LINE:
        setExpression_line((Expression_line)newValue);
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
      case GoPackage.EXPRESSION__UNARY_EXPR:
        setUnary_expr((Unary_expr)null);
        return;
      case GoPackage.EXPRESSION__EXPRESSION_LINE:
        setExpression_line((Expression_line)null);
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
      case GoPackage.EXPRESSION__UNARY_EXPR:
        return unary_expr != null;
      case GoPackage.EXPRESSION__EXPRESSION_LINE:
        return expression_line != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
