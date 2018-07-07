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
import org.xtext.go.varDecl;
import org.xtext.go.varSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.varDeclImpl#getVarSpec <em>Var Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class varDeclImpl extends MinimalEObjectImpl.Container implements varDecl
{
  /**
   * The cached value of the '{@link #getVarSpec() <em>Var Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSpec()
   * @generated
   * @ordered
   */
  protected varSpec varSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected varDeclImpl()
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
    return GoPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varSpec getVarSpec()
  {
    return varSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarSpec(varSpec newVarSpec, NotificationChain msgs)
  {
    varSpec oldVarSpec = varSpec;
    varSpec = newVarSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_DECL__VAR_SPEC, oldVarSpec, newVarSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarSpec(varSpec newVarSpec)
  {
    if (newVarSpec != varSpec)
    {
      NotificationChain msgs = null;
      if (varSpec != null)
        msgs = ((InternalEObject)varSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_DECL__VAR_SPEC, null, msgs);
      if (newVarSpec != null)
        msgs = ((InternalEObject)newVarSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_DECL__VAR_SPEC, null, msgs);
      msgs = basicSetVarSpec(newVarSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_DECL__VAR_SPEC, newVarSpec, newVarSpec));
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        return basicSetVarSpec(null, msgs);
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        return getVarSpec();
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        setVarSpec((varSpec)newValue);
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        setVarSpec((varSpec)null);
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        return varSpec != null;
    }
    return super.eIsSet(featureID);
  }

} //varDeclImpl
