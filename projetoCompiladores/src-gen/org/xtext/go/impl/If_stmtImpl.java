/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.go.Block;
import org.xtext.go.Expression;
import org.xtext.go.GoPackage;
import org.xtext.go.If_stmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.If_stmtImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.go.impl.If_stmtImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.go.impl.If_stmtImpl#getIf_stmt <em>If stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class If_stmtImpl extends StatementImpl implements If_stmt
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * The cached value of the '{@link #getIf_stmt() <em>If stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_stmt()
   * @generated
   * @ordered
   */
  protected If_stmt if_stmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected If_stmtImpl()
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
    return GoPackage.Literals.IF_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If_stmt getIf_stmt()
  {
    return if_stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_stmt(If_stmt newIf_stmt, NotificationChain msgs)
  {
    If_stmt oldIf_stmt = if_stmt;
    if_stmt = newIf_stmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__IF_STMT, oldIf_stmt, newIf_stmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf_stmt(If_stmt newIf_stmt)
  {
    if (newIf_stmt != if_stmt)
    {
      NotificationChain msgs = null;
      if (if_stmt != null)
        msgs = ((InternalEObject)if_stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__IF_STMT, null, msgs);
      if (newIf_stmt != null)
        msgs = ((InternalEObject)newIf_stmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__IF_STMT, null, msgs);
      msgs = basicSetIf_stmt(newIf_stmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__IF_STMT, newIf_stmt, newIf_stmt));
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
      case GoPackage.IF_STMT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case GoPackage.IF_STMT__BLOCK:
        return basicSetBlock(null, msgs);
      case GoPackage.IF_STMT__IF_STMT:
        return basicSetIf_stmt(null, msgs);
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
      case GoPackage.IF_STMT__EXPRESSION:
        return getExpression();
      case GoPackage.IF_STMT__BLOCK:
        return getBlock();
      case GoPackage.IF_STMT__IF_STMT:
        return getIf_stmt();
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
      case GoPackage.IF_STMT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case GoPackage.IF_STMT__BLOCK:
        setBlock((Block)newValue);
        return;
      case GoPackage.IF_STMT__IF_STMT:
        setIf_stmt((If_stmt)newValue);
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
      case GoPackage.IF_STMT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case GoPackage.IF_STMT__BLOCK:
        setBlock((Block)null);
        return;
      case GoPackage.IF_STMT__IF_STMT:
        setIf_stmt((If_stmt)null);
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
      case GoPackage.IF_STMT__EXPRESSION:
        return expression != null;
      case GoPackage.IF_STMT__BLOCK:
        return block != null;
      case GoPackage.IF_STMT__IF_STMT:
        return if_stmt != null;
    }
    return super.eIsSet(featureID);
  }

} //If_stmtImpl
