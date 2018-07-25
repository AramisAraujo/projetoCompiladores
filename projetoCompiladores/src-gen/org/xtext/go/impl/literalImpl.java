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
import org.xtext.go.basicLit;
import org.xtext.go.compositeLit;
import org.xtext.go.functionLit;
import org.xtext.go.literal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.literalImpl#getLitBasic <em>Lit Basic</em>}</li>
 *   <li>{@link org.xtext.go.impl.literalImpl#getLitComposite <em>Lit Composite</em>}</li>
 *   <li>{@link org.xtext.go.impl.literalImpl#getLitFunc <em>Lit Func</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class literalImpl extends MinimalEObjectImpl.Container implements literal
{
  /**
   * The cached value of the '{@link #getLitBasic() <em>Lit Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitBasic()
   * @generated
   * @ordered
   */
  protected basicLit litBasic;

  /**
   * The cached value of the '{@link #getLitComposite() <em>Lit Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitComposite()
   * @generated
   * @ordered
   */
  protected compositeLit litComposite;

  /**
   * The cached value of the '{@link #getLitFunc() <em>Lit Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitFunc()
   * @generated
   * @ordered
   */
  protected functionLit litFunc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected literalImpl()
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
    return GoPackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public basicLit getLitBasic()
  {
    return litBasic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLitBasic(basicLit newLitBasic, NotificationChain msgs)
  {
    basicLit oldLitBasic = litBasic;
    litBasic = newLitBasic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL__LIT_BASIC, oldLitBasic, newLitBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLitBasic(basicLit newLitBasic)
  {
    if (newLitBasic != litBasic)
    {
      NotificationChain msgs = null;
      if (litBasic != null)
        msgs = ((InternalEObject)litBasic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL__LIT_BASIC, null, msgs);
      if (newLitBasic != null)
        msgs = ((InternalEObject)newLitBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL__LIT_BASIC, null, msgs);
      msgs = basicSetLitBasic(newLitBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL__LIT_BASIC, newLitBasic, newLitBasic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compositeLit getLitComposite()
  {
    return litComposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLitComposite(compositeLit newLitComposite, NotificationChain msgs)
  {
    compositeLit oldLitComposite = litComposite;
    litComposite = newLitComposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL__LIT_COMPOSITE, oldLitComposite, newLitComposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLitComposite(compositeLit newLitComposite)
  {
    if (newLitComposite != litComposite)
    {
      NotificationChain msgs = null;
      if (litComposite != null)
        msgs = ((InternalEObject)litComposite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL__LIT_COMPOSITE, null, msgs);
      if (newLitComposite != null)
        msgs = ((InternalEObject)newLitComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL__LIT_COMPOSITE, null, msgs);
      msgs = basicSetLitComposite(newLitComposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL__LIT_COMPOSITE, newLitComposite, newLitComposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionLit getLitFunc()
  {
    return litFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLitFunc(functionLit newLitFunc, NotificationChain msgs)
  {
    functionLit oldLitFunc = litFunc;
    litFunc = newLitFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL__LIT_FUNC, oldLitFunc, newLitFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLitFunc(functionLit newLitFunc)
  {
    if (newLitFunc != litFunc)
    {
      NotificationChain msgs = null;
      if (litFunc != null)
        msgs = ((InternalEObject)litFunc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL__LIT_FUNC, null, msgs);
      if (newLitFunc != null)
        msgs = ((InternalEObject)newLitFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL__LIT_FUNC, null, msgs);
      msgs = basicSetLitFunc(newLitFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL__LIT_FUNC, newLitFunc, newLitFunc));
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
      case GoPackage.LITERAL__LIT_BASIC:
        return basicSetLitBasic(null, msgs);
      case GoPackage.LITERAL__LIT_COMPOSITE:
        return basicSetLitComposite(null, msgs);
      case GoPackage.LITERAL__LIT_FUNC:
        return basicSetLitFunc(null, msgs);
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
      case GoPackage.LITERAL__LIT_BASIC:
        return getLitBasic();
      case GoPackage.LITERAL__LIT_COMPOSITE:
        return getLitComposite();
      case GoPackage.LITERAL__LIT_FUNC:
        return getLitFunc();
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
      case GoPackage.LITERAL__LIT_BASIC:
        setLitBasic((basicLit)newValue);
        return;
      case GoPackage.LITERAL__LIT_COMPOSITE:
        setLitComposite((compositeLit)newValue);
        return;
      case GoPackage.LITERAL__LIT_FUNC:
        setLitFunc((functionLit)newValue);
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
      case GoPackage.LITERAL__LIT_BASIC:
        setLitBasic((basicLit)null);
        return;
      case GoPackage.LITERAL__LIT_COMPOSITE:
        setLitComposite((compositeLit)null);
        return;
      case GoPackage.LITERAL__LIT_FUNC:
        setLitFunc((functionLit)null);
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
      case GoPackage.LITERAL__LIT_BASIC:
        return litBasic != null;
      case GoPackage.LITERAL__LIT_COMPOSITE:
        return litComposite != null;
      case GoPackage.LITERAL__LIT_FUNC:
        return litFunc != null;
    }
    return super.eIsSet(featureID);
  }

} //literalImpl
