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
import org.xtext.go.arguments;
import org.xtext.go.index;
import org.xtext.go.primaryExprStuff;
import org.xtext.go.slice;
import org.xtext.go.typeAssertion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primary Expr Stuff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.primaryExprStuffImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprStuffImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprStuffImpl#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprStuffImpl#getTypeAssertion <em>Type Assertion</em>}</li>
 *   <li>{@link org.xtext.go.impl.primaryExprStuffImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primaryExprStuffImpl extends MinimalEObjectImpl.Container implements primaryExprStuff
{
  /**
   * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected static final String SELECTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected String selector = SELECTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected index index;

  /**
   * The cached value of the '{@link #getSlice() <em>Slice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlice()
   * @generated
   * @ordered
   */
  protected slice slice;

  /**
   * The cached value of the '{@link #getTypeAssertion() <em>Type Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeAssertion()
   * @generated
   * @ordered
   */
  protected typeAssertion typeAssertion;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected arguments arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected primaryExprStuffImpl()
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
    return GoPackage.Literals.PRIMARY_EXPR_STUFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelector(String newSelector)
  {
    String oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__SELECTOR, oldSelector, selector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public index getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(index newIndex, NotificationChain msgs)
  {
    index oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(index newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__INDEX, newIndex, newIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public slice getSlice()
  {
    return slice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSlice(slice newSlice, NotificationChain msgs)
  {
    slice oldSlice = slice;
    slice = newSlice;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__SLICE, oldSlice, newSlice);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlice(slice newSlice)
  {
    if (newSlice != slice)
    {
      NotificationChain msgs = null;
      if (slice != null)
        msgs = ((InternalEObject)slice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__SLICE, null, msgs);
      if (newSlice != null)
        msgs = ((InternalEObject)newSlice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__SLICE, null, msgs);
      msgs = basicSetSlice(newSlice, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__SLICE, newSlice, newSlice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeAssertion getTypeAssertion()
  {
    return typeAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeAssertion(typeAssertion newTypeAssertion, NotificationChain msgs)
  {
    typeAssertion oldTypeAssertion = typeAssertion;
    typeAssertion = newTypeAssertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION, oldTypeAssertion, newTypeAssertion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeAssertion(typeAssertion newTypeAssertion)
  {
    if (newTypeAssertion != typeAssertion)
    {
      NotificationChain msgs = null;
      if (typeAssertion != null)
        msgs = ((InternalEObject)typeAssertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION, null, msgs);
      if (newTypeAssertion != null)
        msgs = ((InternalEObject)newTypeAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION, null, msgs);
      msgs = basicSetTypeAssertion(newTypeAssertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION, newTypeAssertion, newTypeAssertion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arguments getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArguments(arguments newArguments, NotificationChain msgs)
  {
    arguments oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS, oldArguments, newArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArguments(arguments newArguments)
  {
    if (newArguments != arguments)
    {
      NotificationChain msgs = null;
      if (arguments != null)
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS, newArguments, newArguments));
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
      case GoPackage.PRIMARY_EXPR_STUFF__INDEX:
        return basicSetIndex(null, msgs);
      case GoPackage.PRIMARY_EXPR_STUFF__SLICE:
        return basicSetSlice(null, msgs);
      case GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION:
        return basicSetTypeAssertion(null, msgs);
      case GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS:
        return basicSetArguments(null, msgs);
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
      case GoPackage.PRIMARY_EXPR_STUFF__SELECTOR:
        return getSelector();
      case GoPackage.PRIMARY_EXPR_STUFF__INDEX:
        return getIndex();
      case GoPackage.PRIMARY_EXPR_STUFF__SLICE:
        return getSlice();
      case GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION:
        return getTypeAssertion();
      case GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS:
        return getArguments();
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
      case GoPackage.PRIMARY_EXPR_STUFF__SELECTOR:
        setSelector((String)newValue);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__INDEX:
        setIndex((index)newValue);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__SLICE:
        setSlice((slice)newValue);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION:
        setTypeAssertion((typeAssertion)newValue);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS:
        setArguments((arguments)newValue);
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
      case GoPackage.PRIMARY_EXPR_STUFF__SELECTOR:
        setSelector(SELECTOR_EDEFAULT);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__INDEX:
        setIndex((index)null);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__SLICE:
        setSlice((slice)null);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION:
        setTypeAssertion((typeAssertion)null);
        return;
      case GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS:
        setArguments((arguments)null);
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
      case GoPackage.PRIMARY_EXPR_STUFF__SELECTOR:
        return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
      case GoPackage.PRIMARY_EXPR_STUFF__INDEX:
        return index != null;
      case GoPackage.PRIMARY_EXPR_STUFF__SLICE:
        return slice != null;
      case GoPackage.PRIMARY_EXPR_STUFF__TYPE_ASSERTION:
        return typeAssertion != null;
      case GoPackage.PRIMARY_EXPR_STUFF__ARGUMENTS:
        return arguments != null;
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
    result.append(" (selector: ");
    result.append(selector);
    result.append(')');
    return result.toString();
  }

} //primaryExprStuffImpl
