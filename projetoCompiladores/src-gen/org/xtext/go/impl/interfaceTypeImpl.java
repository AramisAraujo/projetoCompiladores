/**
 * generated by Xtext 2.14.0
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
import org.xtext.go.interfaceType;
import org.xtext.go.methodSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.interfaceTypeImpl#getMethodSpecs <em>Method Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interfaceTypeImpl extends MinimalEObjectImpl.Container implements interfaceType
{
  /**
   * The cached value of the '{@link #getMethodSpecs() <em>Method Specs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodSpecs()
   * @generated
   * @ordered
   */
  protected EList<methodSpec> methodSpecs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected interfaceTypeImpl()
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
    return GoPackage.Literals.INTERFACE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<methodSpec> getMethodSpecs()
  {
    if (methodSpecs == null)
    {
      methodSpecs = new EObjectContainmentEList<methodSpec>(methodSpec.class, this, GoPackage.INTERFACE_TYPE__METHOD_SPECS);
    }
    return methodSpecs;
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
      case GoPackage.INTERFACE_TYPE__METHOD_SPECS:
        return ((InternalEList<?>)getMethodSpecs()).basicRemove(otherEnd, msgs);
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
      case GoPackage.INTERFACE_TYPE__METHOD_SPECS:
        return getMethodSpecs();
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
      case GoPackage.INTERFACE_TYPE__METHOD_SPECS:
        getMethodSpecs().clear();
        getMethodSpecs().addAll((Collection<? extends methodSpec>)newValue);
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
      case GoPackage.INTERFACE_TYPE__METHOD_SPECS:
        getMethodSpecs().clear();
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
      case GoPackage.INTERFACE_TYPE__METHOD_SPECS:
        return methodSpecs != null && !methodSpecs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //interfaceTypeImpl
