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
import org.xtext.go.conversion;
import org.xtext.go.operand;
import org.xtext.go.primaryExpr;
import org.xtext.go.primaryExprArguments;
import org.xtext.go.primaryExprIndex;
import org.xtext.go.primaryExprSelector;
import org.xtext.go.primaryExprSlice;
import org.xtext.go.primaryExprTypeAssertion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.primaryExprImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprImpl#getConversion <em>Conversion</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprImpl#getPrimaryExprSelector <em>Primary Expr Selector</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprImpl#getPrimaryExprIndex <em>Primary Expr Index</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprImpl#getPrimaryExprSlice <em>Primary Expr Slice</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprImpl#getPrimaryExprTypeAssertion <em>Primary Expr Type Assertion</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprImpl#getPrimaryExprArguments <em>Primary Expr Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primaryExprImpl extends MinimalEObjectImpl.Container implements primaryExpr
{
  /**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected operand operand;

  /**
   * The cached value of the '{@link #getConversion() <em>Conversion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConversion()
   * @generated
   * @ordered
   */
  protected conversion conversion;

  /**
   * The cached value of the '{@link #getPrimaryExprSelector() <em>Primary Expr Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprSelector()
   * @generated
   * @ordered
   */
  protected primaryExprSelector primaryExprSelector;

  /**
   * The cached value of the '{@link #getPrimaryExprIndex() <em>Primary Expr Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprIndex()
   * @generated
   * @ordered
   */
  protected primaryExprIndex primaryExprIndex;

  /**
   * The cached value of the '{@link #getPrimaryExprSlice() <em>Primary Expr Slice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprSlice()
   * @generated
   * @ordered
   */
  protected primaryExprSlice primaryExprSlice;

  /**
   * The cached value of the '{@link #getPrimaryExprTypeAssertion() <em>Primary Expr Type Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprTypeAssertion()
   * @generated
   * @ordered
   */
  protected primaryExprTypeAssertion primaryExprTypeAssertion;

  /**
   * The cached value of the '{@link #getPrimaryExprArguments() <em>Primary Expr Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprArguments()
   * @generated
   * @ordered
   */
  protected primaryExprArguments primaryExprArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected primaryExprImpl()
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
    return GoPackage.Literals.PRIMARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public operand getOperand()
  {
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand(operand newOperand, NotificationChain msgs)
  {
    operand oldOperand = operand;
    operand = newOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__OPERAND, oldOperand, newOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand(operand newOperand)
  {
    if (newOperand != operand)
    {
      NotificationChain msgs = null;
      if (operand != null)
        msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__OPERAND, null, msgs);
      if (newOperand != null)
        msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__OPERAND, null, msgs);
      msgs = basicSetOperand(newOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__OPERAND, newOperand, newOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conversion getConversion()
  {
    return conversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConversion(conversion newConversion, NotificationChain msgs)
  {
    conversion oldConversion = conversion;
    conversion = newConversion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__CONVERSION, oldConversion, newConversion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConversion(conversion newConversion)
  {
    if (newConversion != conversion)
    {
      NotificationChain msgs = null;
      if (conversion != null)
        msgs = ((InternalEObject)conversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__CONVERSION, null, msgs);
      if (newConversion != null)
        msgs = ((InternalEObject)newConversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__CONVERSION, null, msgs);
      msgs = basicSetConversion(newConversion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__CONVERSION, newConversion, newConversion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprSelector getPrimaryExprSelector()
  {
    return primaryExprSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprSelector(primaryExprSelector newPrimaryExprSelector, NotificationChain msgs)
  {
    primaryExprSelector oldPrimaryExprSelector = primaryExprSelector;
    primaryExprSelector = newPrimaryExprSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR, oldPrimaryExprSelector, newPrimaryExprSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprSelector(primaryExprSelector newPrimaryExprSelector)
  {
    if (newPrimaryExprSelector != primaryExprSelector)
    {
      NotificationChain msgs = null;
      if (primaryExprSelector != null)
        msgs = ((InternalEObject)primaryExprSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR, null, msgs);
      if (newPrimaryExprSelector != null)
        msgs = ((InternalEObject)newPrimaryExprSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR, null, msgs);
      msgs = basicSetPrimaryExprSelector(newPrimaryExprSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR, newPrimaryExprSelector, newPrimaryExprSelector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprIndex getPrimaryExprIndex()
  {
    return primaryExprIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprIndex(primaryExprIndex newPrimaryExprIndex, NotificationChain msgs)
  {
    primaryExprIndex oldPrimaryExprIndex = primaryExprIndex;
    primaryExprIndex = newPrimaryExprIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX, oldPrimaryExprIndex, newPrimaryExprIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprIndex(primaryExprIndex newPrimaryExprIndex)
  {
    if (newPrimaryExprIndex != primaryExprIndex)
    {
      NotificationChain msgs = null;
      if (primaryExprIndex != null)
        msgs = ((InternalEObject)primaryExprIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX, null, msgs);
      if (newPrimaryExprIndex != null)
        msgs = ((InternalEObject)newPrimaryExprIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX, null, msgs);
      msgs = basicSetPrimaryExprIndex(newPrimaryExprIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX, newPrimaryExprIndex, newPrimaryExprIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprSlice getPrimaryExprSlice()
  {
    return primaryExprSlice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprSlice(primaryExprSlice newPrimaryExprSlice, NotificationChain msgs)
  {
    primaryExprSlice oldPrimaryExprSlice = primaryExprSlice;
    primaryExprSlice = newPrimaryExprSlice;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE, oldPrimaryExprSlice, newPrimaryExprSlice);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprSlice(primaryExprSlice newPrimaryExprSlice)
  {
    if (newPrimaryExprSlice != primaryExprSlice)
    {
      NotificationChain msgs = null;
      if (primaryExprSlice != null)
        msgs = ((InternalEObject)primaryExprSlice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE, null, msgs);
      if (newPrimaryExprSlice != null)
        msgs = ((InternalEObject)newPrimaryExprSlice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE, null, msgs);
      msgs = basicSetPrimaryExprSlice(newPrimaryExprSlice, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE, newPrimaryExprSlice, newPrimaryExprSlice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprTypeAssertion getPrimaryExprTypeAssertion()
  {
    return primaryExprTypeAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprTypeAssertion(primaryExprTypeAssertion newPrimaryExprTypeAssertion, NotificationChain msgs)
  {
    primaryExprTypeAssertion oldPrimaryExprTypeAssertion = primaryExprTypeAssertion;
    primaryExprTypeAssertion = newPrimaryExprTypeAssertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION, oldPrimaryExprTypeAssertion, newPrimaryExprTypeAssertion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprTypeAssertion(primaryExprTypeAssertion newPrimaryExprTypeAssertion)
  {
    if (newPrimaryExprTypeAssertion != primaryExprTypeAssertion)
    {
      NotificationChain msgs = null;
      if (primaryExprTypeAssertion != null)
        msgs = ((InternalEObject)primaryExprTypeAssertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION, null, msgs);
      if (newPrimaryExprTypeAssertion != null)
        msgs = ((InternalEObject)newPrimaryExprTypeAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION, null, msgs);
      msgs = basicSetPrimaryExprTypeAssertion(newPrimaryExprTypeAssertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION, newPrimaryExprTypeAssertion, newPrimaryExprTypeAssertion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprArguments getPrimaryExprArguments()
  {
    return primaryExprArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprArguments(primaryExprArguments newPrimaryExprArguments, NotificationChain msgs)
  {
    primaryExprArguments oldPrimaryExprArguments = primaryExprArguments;
    primaryExprArguments = newPrimaryExprArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS, oldPrimaryExprArguments, newPrimaryExprArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprArguments(primaryExprArguments newPrimaryExprArguments)
  {
    if (newPrimaryExprArguments != primaryExprArguments)
    {
      NotificationChain msgs = null;
      if (primaryExprArguments != null)
        msgs = ((InternalEObject)primaryExprArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS, null, msgs);
      if (newPrimaryExprArguments != null)
        msgs = ((InternalEObject)newPrimaryExprArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS, null, msgs);
      msgs = basicSetPrimaryExprArguments(newPrimaryExprArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS, newPrimaryExprArguments, newPrimaryExprArguments));
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
      case GoPackage.PRIMARY_EXPR__OPERAND:
        return basicSetOperand(null, msgs);
      case GoPackage.PRIMARY_EXPR__CONVERSION:
        return basicSetConversion(null, msgs);
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR:
        return basicSetPrimaryExprSelector(null, msgs);
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX:
        return basicSetPrimaryExprIndex(null, msgs);
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE:
        return basicSetPrimaryExprSlice(null, msgs);
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION:
        return basicSetPrimaryExprTypeAssertion(null, msgs);
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS:
        return basicSetPrimaryExprArguments(null, msgs);
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
      case GoPackage.PRIMARY_EXPR__OPERAND:
        return getOperand();
      case GoPackage.PRIMARY_EXPR__CONVERSION:
        return getConversion();
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR:
        return getPrimaryExprSelector();
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX:
        return getPrimaryExprIndex();
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE:
        return getPrimaryExprSlice();
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION:
        return getPrimaryExprTypeAssertion();
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS:
        return getPrimaryExprArguments();
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
      case GoPackage.PRIMARY_EXPR__OPERAND:
        setOperand((operand)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__CONVERSION:
        setConversion((conversion)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR:
        setPrimaryExprSelector((primaryExprSelector)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX:
        setPrimaryExprIndex((primaryExprIndex)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE:
        setPrimaryExprSlice((primaryExprSlice)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION:
        setPrimaryExprTypeAssertion((primaryExprTypeAssertion)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS:
        setPrimaryExprArguments((primaryExprArguments)newValue);
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
      case GoPackage.PRIMARY_EXPR__OPERAND:
        setOperand((operand)null);
        return;
      case GoPackage.PRIMARY_EXPR__CONVERSION:
        setConversion((conversion)null);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR:
        setPrimaryExprSelector((primaryExprSelector)null);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX:
        setPrimaryExprIndex((primaryExprIndex)null);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE:
        setPrimaryExprSlice((primaryExprSlice)null);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION:
        setPrimaryExprTypeAssertion((primaryExprTypeAssertion)null);
        return;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS:
        setPrimaryExprArguments((primaryExprArguments)null);
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
      case GoPackage.PRIMARY_EXPR__OPERAND:
        return operand != null;
      case GoPackage.PRIMARY_EXPR__CONVERSION:
        return conversion != null;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SELECTOR:
        return primaryExprSelector != null;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_INDEX:
        return primaryExprIndex != null;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_SLICE:
        return primaryExprSlice != null;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_TYPE_ASSERTION:
        return primaryExprTypeAssertion != null;
      case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_ARGUMENTS:
        return primaryExprArguments != null;
    }
    return super.eIsSet(featureID);
  }

} //primaryExprImpl
