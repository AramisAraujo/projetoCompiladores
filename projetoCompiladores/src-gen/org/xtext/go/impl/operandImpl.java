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
import org.xtext.go.literal;
import org.xtext.go.methodExpr;
import org.xtext.go.operand;
import org.xtext.go.operandName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.operandImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.go.impl.operandImpl#getOperandName <em>Operand Name</em>}</li>
 *   <li>{@link org.xtext.go.impl.operandImpl#getMethodExpr <em>Method Expr</em>}</li>
 *   <li>{@link org.xtext.go.impl.operandImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class operandImpl extends MinimalEObjectImpl.Container implements operand
{
  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected literal literal;

  /**
   * The cached value of the '{@link #getOperandName() <em>Operand Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperandName()
   * @generated
   * @ordered
   */
  protected operandName operandName;

  /**
   * The cached value of the '{@link #getMethodExpr() <em>Method Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodExpr()
   * @generated
   * @ordered
   */
  protected methodExpr methodExpr;

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
  protected operandImpl()
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
    return GoPackage.Literals.OPERAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literal getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(literal newLiteral, NotificationChain msgs)
  {
    literal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(literal newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__LITERAL, newLiteral, newLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public operandName getOperandName()
  {
    return operandName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperandName(operandName newOperandName, NotificationChain msgs)
  {
    operandName oldOperandName = operandName;
    operandName = newOperandName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__OPERAND_NAME, oldOperandName, newOperandName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperandName(operandName newOperandName)
  {
    if (newOperandName != operandName)
    {
      NotificationChain msgs = null;
      if (operandName != null)
        msgs = ((InternalEObject)operandName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__OPERAND_NAME, null, msgs);
      if (newOperandName != null)
        msgs = ((InternalEObject)newOperandName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__OPERAND_NAME, null, msgs);
      msgs = basicSetOperandName(newOperandName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__OPERAND_NAME, newOperandName, newOperandName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public methodExpr getMethodExpr()
  {
    return methodExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodExpr(methodExpr newMethodExpr, NotificationChain msgs)
  {
    methodExpr oldMethodExpr = methodExpr;
    methodExpr = newMethodExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__METHOD_EXPR, oldMethodExpr, newMethodExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodExpr(methodExpr newMethodExpr)
  {
    if (newMethodExpr != methodExpr)
    {
      NotificationChain msgs = null;
      if (methodExpr != null)
        msgs = ((InternalEObject)methodExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__METHOD_EXPR, null, msgs);
      if (newMethodExpr != null)
        msgs = ((InternalEObject)newMethodExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__METHOD_EXPR, null, msgs);
      msgs = basicSetMethodExpr(newMethodExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__METHOD_EXPR, newMethodExpr, newMethodExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND__EXPR, newExpr, newExpr));
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
      case GoPackage.OPERAND__LITERAL:
        return basicSetLiteral(null, msgs);
      case GoPackage.OPERAND__OPERAND_NAME:
        return basicSetOperandName(null, msgs);
      case GoPackage.OPERAND__METHOD_EXPR:
        return basicSetMethodExpr(null, msgs);
      case GoPackage.OPERAND__EXPR:
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
      case GoPackage.OPERAND__LITERAL:
        return getLiteral();
      case GoPackage.OPERAND__OPERAND_NAME:
        return getOperandName();
      case GoPackage.OPERAND__METHOD_EXPR:
        return getMethodExpr();
      case GoPackage.OPERAND__EXPR:
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
      case GoPackage.OPERAND__LITERAL:
        setLiteral((literal)newValue);
        return;
      case GoPackage.OPERAND__OPERAND_NAME:
        setOperandName((operandName)newValue);
        return;
      case GoPackage.OPERAND__METHOD_EXPR:
        setMethodExpr((methodExpr)newValue);
        return;
      case GoPackage.OPERAND__EXPR:
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
      case GoPackage.OPERAND__LITERAL:
        setLiteral((literal)null);
        return;
      case GoPackage.OPERAND__OPERAND_NAME:
        setOperandName((operandName)null);
        return;
      case GoPackage.OPERAND__METHOD_EXPR:
        setMethodExpr((methodExpr)null);
        return;
      case GoPackage.OPERAND__EXPR:
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
      case GoPackage.OPERAND__LITERAL:
        return literal != null;
      case GoPackage.OPERAND__OPERAND_NAME:
        return operandName != null;
      case GoPackage.OPERAND__METHOD_EXPR:
        return methodExpr != null;
      case GoPackage.OPERAND__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //operandImpl
