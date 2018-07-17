/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.go.GoPackage;
import org.xtext.go.constDecl;
import org.xtext.go.constSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>const Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.constDeclImpl#getConstSpec <em>Const Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class constDeclImpl extends MinimalEObjectImpl.Container implements constDecl
{
  /**
   * The cached value of the '{@link #getConstSpec() <em>Const Spec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstSpec()
   * @generated
   * @ordered
   */
  protected EList<constSpec> constSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constDeclImpl()
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
    return GoPackage.Literals.CONST_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<constSpec> getConstSpec()
  {
    if (constSpec == null)
    {
      constSpec = new EObjectContainmentEList<constSpec>(constSpec.class, this, GoPackage.CONST_DECL__CONST_SPEC);
    }
    return constSpec;
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
      case GoPackage.CONST_DECL__CONST_SPEC:
        return ((InternalEList<?>)getConstSpec()).basicRemove(otherEnd, msgs);
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
      case GoPackage.CONST_DECL__CONST_SPEC:
        return getConstSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.CONST_DECL__CONST_SPEC:
        getConstSpec().clear();
        getConstSpec().addAll((Collection<? extends constSpec>)newValue);
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
      case GoPackage.CONST_DECL__CONST_SPEC:
        getConstSpec().clear();
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
      case GoPackage.CONST_DECL__CONST_SPEC:
        return constSpec != null && !constSpec.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //constDeclImpl
