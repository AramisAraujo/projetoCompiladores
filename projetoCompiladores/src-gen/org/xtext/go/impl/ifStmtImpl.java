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
import org.xtext.go.block;
import org.xtext.go.expression;
import org.xtext.go.ifStmt;
import org.xtext.go.simpleStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>if Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.ifStmtImpl#getSimplStatement <em>Simpl Statement</em>}</li>
 *   <li>{@link org.xtext.go.impl.ifStmtImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.go.impl.ifStmtImpl#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link org.xtext.go.impl.ifStmtImpl#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.go.impl.ifStmtImpl#getCodeBlockIf <em>Code Block If</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ifStmtImpl extends MinimalEObjectImpl.Container implements ifStmt
{
  /**
   * The cached value of the '{@link #getSimplStatement() <em>Simpl Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimplStatement()
   * @generated
   * @ordered
   */
  protected simpleStmt simplStatement;

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
   * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeBlock()
   * @generated
   * @ordered
   */
  protected block codeBlock;

  /**
   * The cached value of the '{@link #getIfStatement() <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStatement()
   * @generated
   * @ordered
   */
  protected ifStmt ifStatement;

  /**
   * The cached value of the '{@link #getCodeBlockIf() <em>Code Block If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeBlockIf()
   * @generated
   * @ordered
   */
  protected block codeBlockIf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ifStmtImpl()
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
  public simpleStmt getSimplStatement()
  {
    return simplStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimplStatement(simpleStmt newSimplStatement, NotificationChain msgs)
  {
    simpleStmt oldSimplStatement = simplStatement;
    simplStatement = newSimplStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__SIMPL_STATEMENT, oldSimplStatement, newSimplStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimplStatement(simpleStmt newSimplStatement)
  {
    if (newSimplStatement != simplStatement)
    {
      NotificationChain msgs = null;
      if (simplStatement != null)
        msgs = ((InternalEObject)simplStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__SIMPL_STATEMENT, null, msgs);
      if (newSimplStatement != null)
        msgs = ((InternalEObject)newSimplStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__SIMPL_STATEMENT, null, msgs);
      msgs = basicSetSimplStatement(newSimplStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__SIMPL_STATEMENT, newSimplStatement, newSimplStatement));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getCodeBlock()
  {
    return codeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeBlock(block newCodeBlock, NotificationChain msgs)
  {
    block oldCodeBlock = codeBlock;
    codeBlock = newCodeBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__CODE_BLOCK, oldCodeBlock, newCodeBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeBlock(block newCodeBlock)
  {
    if (newCodeBlock != codeBlock)
    {
      NotificationChain msgs = null;
      if (codeBlock != null)
        msgs = ((InternalEObject)codeBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__CODE_BLOCK, null, msgs);
      if (newCodeBlock != null)
        msgs = ((InternalEObject)newCodeBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__CODE_BLOCK, null, msgs);
      msgs = basicSetCodeBlock(newCodeBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__CODE_BLOCK, newCodeBlock, newCodeBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifStmt getIfStatement()
  {
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStatement(ifStmt newIfStatement, NotificationChain msgs)
  {
    ifStmt oldIfStatement = ifStatement;
    ifStatement = newIfStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__IF_STATEMENT, oldIfStatement, newIfStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStatement(ifStmt newIfStatement)
  {
    if (newIfStatement != ifStatement)
    {
      NotificationChain msgs = null;
      if (ifStatement != null)
        msgs = ((InternalEObject)ifStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__IF_STATEMENT, null, msgs);
      if (newIfStatement != null)
        msgs = ((InternalEObject)newIfStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__IF_STATEMENT, null, msgs);
      msgs = basicSetIfStatement(newIfStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__IF_STATEMENT, newIfStatement, newIfStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getCodeBlockIf()
  {
    return codeBlockIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeBlockIf(block newCodeBlockIf, NotificationChain msgs)
  {
    block oldCodeBlockIf = codeBlockIf;
    codeBlockIf = newCodeBlockIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__CODE_BLOCK_IF, oldCodeBlockIf, newCodeBlockIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeBlockIf(block newCodeBlockIf)
  {
    if (newCodeBlockIf != codeBlockIf)
    {
      NotificationChain msgs = null;
      if (codeBlockIf != null)
        msgs = ((InternalEObject)codeBlockIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__CODE_BLOCK_IF, null, msgs);
      if (newCodeBlockIf != null)
        msgs = ((InternalEObject)newCodeBlockIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.IF_STMT__CODE_BLOCK_IF, null, msgs);
      msgs = basicSetCodeBlockIf(newCodeBlockIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.IF_STMT__CODE_BLOCK_IF, newCodeBlockIf, newCodeBlockIf));
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
      case GoPackage.IF_STMT__SIMPL_STATEMENT:
        return basicSetSimplStatement(null, msgs);
      case GoPackage.IF_STMT__EXPR:
        return basicSetExpr(null, msgs);
      case GoPackage.IF_STMT__CODE_BLOCK:
        return basicSetCodeBlock(null, msgs);
      case GoPackage.IF_STMT__IF_STATEMENT:
        return basicSetIfStatement(null, msgs);
      case GoPackage.IF_STMT__CODE_BLOCK_IF:
        return basicSetCodeBlockIf(null, msgs);
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
      case GoPackage.IF_STMT__SIMPL_STATEMENT:
        return getSimplStatement();
      case GoPackage.IF_STMT__EXPR:
        return getExpr();
      case GoPackage.IF_STMT__CODE_BLOCK:
        return getCodeBlock();
      case GoPackage.IF_STMT__IF_STATEMENT:
        return getIfStatement();
      case GoPackage.IF_STMT__CODE_BLOCK_IF:
        return getCodeBlockIf();
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
      case GoPackage.IF_STMT__SIMPL_STATEMENT:
        setSimplStatement((simpleStmt)newValue);
        return;
      case GoPackage.IF_STMT__EXPR:
        setExpr((expression)newValue);
        return;
      case GoPackage.IF_STMT__CODE_BLOCK:
        setCodeBlock((block)newValue);
        return;
      case GoPackage.IF_STMT__IF_STATEMENT:
        setIfStatement((ifStmt)newValue);
        return;
      case GoPackage.IF_STMT__CODE_BLOCK_IF:
        setCodeBlockIf((block)newValue);
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
      case GoPackage.IF_STMT__SIMPL_STATEMENT:
        setSimplStatement((simpleStmt)null);
        return;
      case GoPackage.IF_STMT__EXPR:
        setExpr((expression)null);
        return;
      case GoPackage.IF_STMT__CODE_BLOCK:
        setCodeBlock((block)null);
        return;
      case GoPackage.IF_STMT__IF_STATEMENT:
        setIfStatement((ifStmt)null);
        return;
      case GoPackage.IF_STMT__CODE_BLOCK_IF:
        setCodeBlockIf((block)null);
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
      case GoPackage.IF_STMT__SIMPL_STATEMENT:
        return simplStatement != null;
      case GoPackage.IF_STMT__EXPR:
        return expr != null;
      case GoPackage.IF_STMT__CODE_BLOCK:
        return codeBlock != null;
      case GoPackage.IF_STMT__IF_STATEMENT:
        return ifStatement != null;
      case GoPackage.IF_STMT__CODE_BLOCK_IF:
        return codeBlockIf != null;
    }
    return super.eIsSet(featureID);
  }

} //ifStmtImpl