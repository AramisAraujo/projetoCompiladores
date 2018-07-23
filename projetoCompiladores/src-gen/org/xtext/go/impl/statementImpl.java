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
import org.xtext.go.breakStmt;
import org.xtext.go.continueStmt;
import org.xtext.go.declaration;
import org.xtext.go.deferStmt;
import org.xtext.go.fallthroughStmt;
import org.xtext.go.forStmt;
import org.xtext.go.goStmt;
import org.xtext.go.gotoStmt;
import org.xtext.go.ifStmt;
import org.xtext.go.labeledStmt;
import org.xtext.go.returnStmt;
import org.xtext.go.selectStmt;
import org.xtext.go.simpleStmt;
import org.xtext.go.statement;
import org.xtext.go.switchStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.statementImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getLabeledStmt <em>Labeled Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getSimpleStmt <em>Simple Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getGoStmt <em>Go Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getReturnStmt <em>Return Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getBreakStmt <em>Break Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getContinueStmt <em>Continue Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getGotoStmt <em>Goto Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getFallthroughStmt <em>Fallthrough Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getIfStmt <em>If Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getSwitchStmt <em>Switch Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getSelectStmt <em>Select Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getForStmt <em>For Stmt</em>}</li>
 *   <li>{@link org.xtext.go.impl.statementImpl#getDeferStmt <em>Defer Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statementImpl extends MinimalEObjectImpl.Container implements statement
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected declaration declaration;

  /**
   * The cached value of the '{@link #getLabeledStmt() <em>Labeled Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabeledStmt()
   * @generated
   * @ordered
   */
  protected labeledStmt labeledStmt;

  /**
   * The cached value of the '{@link #getSimpleStmt() <em>Simple Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleStmt()
   * @generated
   * @ordered
   */
  protected simpleStmt simpleStmt;

  /**
   * The cached value of the '{@link #getGoStmt() <em>Go Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoStmt()
   * @generated
   * @ordered
   */
  protected goStmt goStmt;

  /**
   * The cached value of the '{@link #getReturnStmt() <em>Return Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnStmt()
   * @generated
   * @ordered
   */
  protected returnStmt returnStmt;

  /**
   * The cached value of the '{@link #getBreakStmt() <em>Break Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreakStmt()
   * @generated
   * @ordered
   */
  protected breakStmt breakStmt;

  /**
   * The cached value of the '{@link #getContinueStmt() <em>Continue Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContinueStmt()
   * @generated
   * @ordered
   */
  protected continueStmt continueStmt;

  /**
   * The cached value of the '{@link #getGotoStmt() <em>Goto Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGotoStmt()
   * @generated
   * @ordered
   */
  protected gotoStmt gotoStmt;

  /**
   * The cached value of the '{@link #getFallthroughStmt() <em>Fallthrough Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFallthroughStmt()
   * @generated
   * @ordered
   */
  protected fallthroughStmt fallthroughStmt;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected block block;

  /**
   * The cached value of the '{@link #getIfStmt() <em>If Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStmt()
   * @generated
   * @ordered
   */
  protected ifStmt ifStmt;

  /**
   * The cached value of the '{@link #getSwitchStmt() <em>Switch Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchStmt()
   * @generated
   * @ordered
   */
  protected switchStmt switchStmt;

  /**
   * The cached value of the '{@link #getSelectStmt() <em>Select Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectStmt()
   * @generated
   * @ordered
   */
  protected selectStmt selectStmt;

  /**
   * The cached value of the '{@link #getForStmt() <em>For Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForStmt()
   * @generated
   * @ordered
   */
  protected forStmt forStmt;

  /**
   * The cached value of the '{@link #getDeferStmt() <em>Defer Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeferStmt()
   * @generated
   * @ordered
   */
  protected deferStmt deferStmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementImpl()
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
    return GoPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(declaration newDeclaration, NotificationChain msgs)
  {
    declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public labeledStmt getLabeledStmt()
  {
    return labeledStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabeledStmt(labeledStmt newLabeledStmt, NotificationChain msgs)
  {
    labeledStmt oldLabeledStmt = labeledStmt;
    labeledStmt = newLabeledStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__LABELED_STMT, oldLabeledStmt, newLabeledStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabeledStmt(labeledStmt newLabeledStmt)
  {
    if (newLabeledStmt != labeledStmt)
    {
      NotificationChain msgs = null;
      if (labeledStmt != null)
        msgs = ((InternalEObject)labeledStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__LABELED_STMT, null, msgs);
      if (newLabeledStmt != null)
        msgs = ((InternalEObject)newLabeledStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__LABELED_STMT, null, msgs);
      msgs = basicSetLabeledStmt(newLabeledStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__LABELED_STMT, newLabeledStmt, newLabeledStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleStmt getSimpleStmt()
  {
    return simpleStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleStmt(simpleStmt newSimpleStmt, NotificationChain msgs)
  {
    simpleStmt oldSimpleStmt = simpleStmt;
    simpleStmt = newSimpleStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__SIMPLE_STMT, oldSimpleStmt, newSimpleStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleStmt(simpleStmt newSimpleStmt)
  {
    if (newSimpleStmt != simpleStmt)
    {
      NotificationChain msgs = null;
      if (simpleStmt != null)
        msgs = ((InternalEObject)simpleStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__SIMPLE_STMT, null, msgs);
      if (newSimpleStmt != null)
        msgs = ((InternalEObject)newSimpleStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__SIMPLE_STMT, null, msgs);
      msgs = basicSetSimpleStmt(newSimpleStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__SIMPLE_STMT, newSimpleStmt, newSimpleStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public goStmt getGoStmt()
  {
    return goStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoStmt(goStmt newGoStmt, NotificationChain msgs)
  {
    goStmt oldGoStmt = goStmt;
    goStmt = newGoStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__GO_STMT, oldGoStmt, newGoStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoStmt(goStmt newGoStmt)
  {
    if (newGoStmt != goStmt)
    {
      NotificationChain msgs = null;
      if (goStmt != null)
        msgs = ((InternalEObject)goStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__GO_STMT, null, msgs);
      if (newGoStmt != null)
        msgs = ((InternalEObject)newGoStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__GO_STMT, null, msgs);
      msgs = basicSetGoStmt(newGoStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__GO_STMT, newGoStmt, newGoStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public returnStmt getReturnStmt()
  {
    return returnStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnStmt(returnStmt newReturnStmt, NotificationChain msgs)
  {
    returnStmt oldReturnStmt = returnStmt;
    returnStmt = newReturnStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__RETURN_STMT, oldReturnStmt, newReturnStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnStmt(returnStmt newReturnStmt)
  {
    if (newReturnStmt != returnStmt)
    {
      NotificationChain msgs = null;
      if (returnStmt != null)
        msgs = ((InternalEObject)returnStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__RETURN_STMT, null, msgs);
      if (newReturnStmt != null)
        msgs = ((InternalEObject)newReturnStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__RETURN_STMT, null, msgs);
      msgs = basicSetReturnStmt(newReturnStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__RETURN_STMT, newReturnStmt, newReturnStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public breakStmt getBreakStmt()
  {
    return breakStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBreakStmt(breakStmt newBreakStmt, NotificationChain msgs)
  {
    breakStmt oldBreakStmt = breakStmt;
    breakStmt = newBreakStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__BREAK_STMT, oldBreakStmt, newBreakStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBreakStmt(breakStmt newBreakStmt)
  {
    if (newBreakStmt != breakStmt)
    {
      NotificationChain msgs = null;
      if (breakStmt != null)
        msgs = ((InternalEObject)breakStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__BREAK_STMT, null, msgs);
      if (newBreakStmt != null)
        msgs = ((InternalEObject)newBreakStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__BREAK_STMT, null, msgs);
      msgs = basicSetBreakStmt(newBreakStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__BREAK_STMT, newBreakStmt, newBreakStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public continueStmt getContinueStmt()
  {
    return continueStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContinueStmt(continueStmt newContinueStmt, NotificationChain msgs)
  {
    continueStmt oldContinueStmt = continueStmt;
    continueStmt = newContinueStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__CONTINUE_STMT, oldContinueStmt, newContinueStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContinueStmt(continueStmt newContinueStmt)
  {
    if (newContinueStmt != continueStmt)
    {
      NotificationChain msgs = null;
      if (continueStmt != null)
        msgs = ((InternalEObject)continueStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__CONTINUE_STMT, null, msgs);
      if (newContinueStmt != null)
        msgs = ((InternalEObject)newContinueStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__CONTINUE_STMT, null, msgs);
      msgs = basicSetContinueStmt(newContinueStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__CONTINUE_STMT, newContinueStmt, newContinueStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public gotoStmt getGotoStmt()
  {
    return gotoStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGotoStmt(gotoStmt newGotoStmt, NotificationChain msgs)
  {
    gotoStmt oldGotoStmt = gotoStmt;
    gotoStmt = newGotoStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__GOTO_STMT, oldGotoStmt, newGotoStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGotoStmt(gotoStmt newGotoStmt)
  {
    if (newGotoStmt != gotoStmt)
    {
      NotificationChain msgs = null;
      if (gotoStmt != null)
        msgs = ((InternalEObject)gotoStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__GOTO_STMT, null, msgs);
      if (newGotoStmt != null)
        msgs = ((InternalEObject)newGotoStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__GOTO_STMT, null, msgs);
      msgs = basicSetGotoStmt(newGotoStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__GOTO_STMT, newGotoStmt, newGotoStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fallthroughStmt getFallthroughStmt()
  {
    return fallthroughStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFallthroughStmt(fallthroughStmt newFallthroughStmt, NotificationChain msgs)
  {
    fallthroughStmt oldFallthroughStmt = fallthroughStmt;
    fallthroughStmt = newFallthroughStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__FALLTHROUGH_STMT, oldFallthroughStmt, newFallthroughStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFallthroughStmt(fallthroughStmt newFallthroughStmt)
  {
    if (newFallthroughStmt != fallthroughStmt)
    {
      NotificationChain msgs = null;
      if (fallthroughStmt != null)
        msgs = ((InternalEObject)fallthroughStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__FALLTHROUGH_STMT, null, msgs);
      if (newFallthroughStmt != null)
        msgs = ((InternalEObject)newFallthroughStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__FALLTHROUGH_STMT, null, msgs);
      msgs = basicSetFallthroughStmt(newFallthroughStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__FALLTHROUGH_STMT, newFallthroughStmt, newFallthroughStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(block newBlock, NotificationChain msgs)
  {
    block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifStmt getIfStmt()
  {
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStmt(ifStmt newIfStmt, NotificationChain msgs)
  {
    ifStmt oldIfStmt = ifStmt;
    ifStmt = newIfStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__IF_STMT, oldIfStmt, newIfStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStmt(ifStmt newIfStmt)
  {
    if (newIfStmt != ifStmt)
    {
      NotificationChain msgs = null;
      if (ifStmt != null)
        msgs = ((InternalEObject)ifStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__IF_STMT, null, msgs);
      if (newIfStmt != null)
        msgs = ((InternalEObject)newIfStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__IF_STMT, null, msgs);
      msgs = basicSetIfStmt(newIfStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__IF_STMT, newIfStmt, newIfStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switchStmt getSwitchStmt()
  {
    return switchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitchStmt(switchStmt newSwitchStmt, NotificationChain msgs)
  {
    switchStmt oldSwitchStmt = switchStmt;
    switchStmt = newSwitchStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__SWITCH_STMT, oldSwitchStmt, newSwitchStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitchStmt(switchStmt newSwitchStmt)
  {
    if (newSwitchStmt != switchStmt)
    {
      NotificationChain msgs = null;
      if (switchStmt != null)
        msgs = ((InternalEObject)switchStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__SWITCH_STMT, null, msgs);
      if (newSwitchStmt != null)
        msgs = ((InternalEObject)newSwitchStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__SWITCH_STMT, null, msgs);
      msgs = basicSetSwitchStmt(newSwitchStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__SWITCH_STMT, newSwitchStmt, newSwitchStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selectStmt getSelectStmt()
  {
    return selectStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectStmt(selectStmt newSelectStmt, NotificationChain msgs)
  {
    selectStmt oldSelectStmt = selectStmt;
    selectStmt = newSelectStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__SELECT_STMT, oldSelectStmt, newSelectStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectStmt(selectStmt newSelectStmt)
  {
    if (newSelectStmt != selectStmt)
    {
      NotificationChain msgs = null;
      if (selectStmt != null)
        msgs = ((InternalEObject)selectStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__SELECT_STMT, null, msgs);
      if (newSelectStmt != null)
        msgs = ((InternalEObject)newSelectStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__SELECT_STMT, null, msgs);
      msgs = basicSetSelectStmt(newSelectStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__SELECT_STMT, newSelectStmt, newSelectStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forStmt getForStmt()
  {
    return forStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForStmt(forStmt newForStmt, NotificationChain msgs)
  {
    forStmt oldForStmt = forStmt;
    forStmt = newForStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__FOR_STMT, oldForStmt, newForStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForStmt(forStmt newForStmt)
  {
    if (newForStmt != forStmt)
    {
      NotificationChain msgs = null;
      if (forStmt != null)
        msgs = ((InternalEObject)forStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__FOR_STMT, null, msgs);
      if (newForStmt != null)
        msgs = ((InternalEObject)newForStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__FOR_STMT, null, msgs);
      msgs = basicSetForStmt(newForStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__FOR_STMT, newForStmt, newForStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public deferStmt getDeferStmt()
  {
    return deferStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeferStmt(deferStmt newDeferStmt, NotificationChain msgs)
  {
    deferStmt oldDeferStmt = deferStmt;
    deferStmt = newDeferStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__DEFER_STMT, oldDeferStmt, newDeferStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeferStmt(deferStmt newDeferStmt)
  {
    if (newDeferStmt != deferStmt)
    {
      NotificationChain msgs = null;
      if (deferStmt != null)
        msgs = ((InternalEObject)deferStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__DEFER_STMT, null, msgs);
      if (newDeferStmt != null)
        msgs = ((InternalEObject)newDeferStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.STATEMENT__DEFER_STMT, null, msgs);
      msgs = basicSetDeferStmt(newDeferStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.STATEMENT__DEFER_STMT, newDeferStmt, newDeferStmt));
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
      case GoPackage.STATEMENT__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case GoPackage.STATEMENT__LABELED_STMT:
        return basicSetLabeledStmt(null, msgs);
      case GoPackage.STATEMENT__SIMPLE_STMT:
        return basicSetSimpleStmt(null, msgs);
      case GoPackage.STATEMENT__GO_STMT:
        return basicSetGoStmt(null, msgs);
      case GoPackage.STATEMENT__RETURN_STMT:
        return basicSetReturnStmt(null, msgs);
      case GoPackage.STATEMENT__BREAK_STMT:
        return basicSetBreakStmt(null, msgs);
      case GoPackage.STATEMENT__CONTINUE_STMT:
        return basicSetContinueStmt(null, msgs);
      case GoPackage.STATEMENT__GOTO_STMT:
        return basicSetGotoStmt(null, msgs);
      case GoPackage.STATEMENT__FALLTHROUGH_STMT:
        return basicSetFallthroughStmt(null, msgs);
      case GoPackage.STATEMENT__BLOCK:
        return basicSetBlock(null, msgs);
      case GoPackage.STATEMENT__IF_STMT:
        return basicSetIfStmt(null, msgs);
      case GoPackage.STATEMENT__SWITCH_STMT:
        return basicSetSwitchStmt(null, msgs);
      case GoPackage.STATEMENT__SELECT_STMT:
        return basicSetSelectStmt(null, msgs);
      case GoPackage.STATEMENT__FOR_STMT:
        return basicSetForStmt(null, msgs);
      case GoPackage.STATEMENT__DEFER_STMT:
        return basicSetDeferStmt(null, msgs);
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
      case GoPackage.STATEMENT__DECLARATION:
        return getDeclaration();
      case GoPackage.STATEMENT__LABELED_STMT:
        return getLabeledStmt();
      case GoPackage.STATEMENT__SIMPLE_STMT:
        return getSimpleStmt();
      case GoPackage.STATEMENT__GO_STMT:
        return getGoStmt();
      case GoPackage.STATEMENT__RETURN_STMT:
        return getReturnStmt();
      case GoPackage.STATEMENT__BREAK_STMT:
        return getBreakStmt();
      case GoPackage.STATEMENT__CONTINUE_STMT:
        return getContinueStmt();
      case GoPackage.STATEMENT__GOTO_STMT:
        return getGotoStmt();
      case GoPackage.STATEMENT__FALLTHROUGH_STMT:
        return getFallthroughStmt();
      case GoPackage.STATEMENT__BLOCK:
        return getBlock();
      case GoPackage.STATEMENT__IF_STMT:
        return getIfStmt();
      case GoPackage.STATEMENT__SWITCH_STMT:
        return getSwitchStmt();
      case GoPackage.STATEMENT__SELECT_STMT:
        return getSelectStmt();
      case GoPackage.STATEMENT__FOR_STMT:
        return getForStmt();
      case GoPackage.STATEMENT__DEFER_STMT:
        return getDeferStmt();
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
      case GoPackage.STATEMENT__DECLARATION:
        setDeclaration((declaration)newValue);
        return;
      case GoPackage.STATEMENT__LABELED_STMT:
        setLabeledStmt((labeledStmt)newValue);
        return;
      case GoPackage.STATEMENT__SIMPLE_STMT:
        setSimpleStmt((simpleStmt)newValue);
        return;
      case GoPackage.STATEMENT__GO_STMT:
        setGoStmt((goStmt)newValue);
        return;
      case GoPackage.STATEMENT__RETURN_STMT:
        setReturnStmt((returnStmt)newValue);
        return;
      case GoPackage.STATEMENT__BREAK_STMT:
        setBreakStmt((breakStmt)newValue);
        return;
      case GoPackage.STATEMENT__CONTINUE_STMT:
        setContinueStmt((continueStmt)newValue);
        return;
      case GoPackage.STATEMENT__GOTO_STMT:
        setGotoStmt((gotoStmt)newValue);
        return;
      case GoPackage.STATEMENT__FALLTHROUGH_STMT:
        setFallthroughStmt((fallthroughStmt)newValue);
        return;
      case GoPackage.STATEMENT__BLOCK:
        setBlock((block)newValue);
        return;
      case GoPackage.STATEMENT__IF_STMT:
        setIfStmt((ifStmt)newValue);
        return;
      case GoPackage.STATEMENT__SWITCH_STMT:
        setSwitchStmt((switchStmt)newValue);
        return;
      case GoPackage.STATEMENT__SELECT_STMT:
        setSelectStmt((selectStmt)newValue);
        return;
      case GoPackage.STATEMENT__FOR_STMT:
        setForStmt((forStmt)newValue);
        return;
      case GoPackage.STATEMENT__DEFER_STMT:
        setDeferStmt((deferStmt)newValue);
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
      case GoPackage.STATEMENT__DECLARATION:
        setDeclaration((declaration)null);
        return;
      case GoPackage.STATEMENT__LABELED_STMT:
        setLabeledStmt((labeledStmt)null);
        return;
      case GoPackage.STATEMENT__SIMPLE_STMT:
        setSimpleStmt((simpleStmt)null);
        return;
      case GoPackage.STATEMENT__GO_STMT:
        setGoStmt((goStmt)null);
        return;
      case GoPackage.STATEMENT__RETURN_STMT:
        setReturnStmt((returnStmt)null);
        return;
      case GoPackage.STATEMENT__BREAK_STMT:
        setBreakStmt((breakStmt)null);
        return;
      case GoPackage.STATEMENT__CONTINUE_STMT:
        setContinueStmt((continueStmt)null);
        return;
      case GoPackage.STATEMENT__GOTO_STMT:
        setGotoStmt((gotoStmt)null);
        return;
      case GoPackage.STATEMENT__FALLTHROUGH_STMT:
        setFallthroughStmt((fallthroughStmt)null);
        return;
      case GoPackage.STATEMENT__BLOCK:
        setBlock((block)null);
        return;
      case GoPackage.STATEMENT__IF_STMT:
        setIfStmt((ifStmt)null);
        return;
      case GoPackage.STATEMENT__SWITCH_STMT:
        setSwitchStmt((switchStmt)null);
        return;
      case GoPackage.STATEMENT__SELECT_STMT:
        setSelectStmt((selectStmt)null);
        return;
      case GoPackage.STATEMENT__FOR_STMT:
        setForStmt((forStmt)null);
        return;
      case GoPackage.STATEMENT__DEFER_STMT:
        setDeferStmt((deferStmt)null);
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
      case GoPackage.STATEMENT__DECLARATION:
        return declaration != null;
      case GoPackage.STATEMENT__LABELED_STMT:
        return labeledStmt != null;
      case GoPackage.STATEMENT__SIMPLE_STMT:
        return simpleStmt != null;
      case GoPackage.STATEMENT__GO_STMT:
        return goStmt != null;
      case GoPackage.STATEMENT__RETURN_STMT:
        return returnStmt != null;
      case GoPackage.STATEMENT__BREAK_STMT:
        return breakStmt != null;
      case GoPackage.STATEMENT__CONTINUE_STMT:
        return continueStmt != null;
      case GoPackage.STATEMENT__GOTO_STMT:
        return gotoStmt != null;
      case GoPackage.STATEMENT__FALLTHROUGH_STMT:
        return fallthroughStmt != null;
      case GoPackage.STATEMENT__BLOCK:
        return block != null;
      case GoPackage.STATEMENT__IF_STMT:
        return ifStmt != null;
      case GoPackage.STATEMENT__SWITCH_STMT:
        return switchStmt != null;
      case GoPackage.STATEMENT__SELECT_STMT:
        return selectStmt != null;
      case GoPackage.STATEMENT__FOR_STMT:
        return forStmt != null;
      case GoPackage.STATEMENT__DEFER_STMT:
        return deferStmt != null;
    }
    return super.eIsSet(featureID);
  }

} //statementImpl
