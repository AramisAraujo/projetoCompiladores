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
import org.xtext.go.elementList;
import org.xtext.go.keyedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.elementListImpl#getKeyedElements <em>Keyed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elementListImpl extends MinimalEObjectImpl.Container implements elementList
{
  /**
   * The cached value of the '{@link #getKeyedElements() <em>Keyed Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyedElements()
   * @generated
   * @ordered
   */
  protected EList<keyedElement> keyedElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected elementListImpl()
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
    return GoPackage.Literals.ELEMENT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<keyedElement> getKeyedElements()
  {
    if (keyedElements == null)
    {
      keyedElements = new EObjectContainmentEList<keyedElement>(keyedElement.class, this, GoPackage.ELEMENT_LIST__KEYED_ELEMENTS);
    }
    return keyedElements;
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
      case GoPackage.ELEMENT_LIST__KEYED_ELEMENTS:
        return ((InternalEList<?>)getKeyedElements()).basicRemove(otherEnd, msgs);
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
      case GoPackage.ELEMENT_LIST__KEYED_ELEMENTS:
        return getKeyedElements();
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
      case GoPackage.ELEMENT_LIST__KEYED_ELEMENTS:
        getKeyedElements().clear();
        getKeyedElements().addAll((Collection<? extends keyedElement>)newValue);
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
      case GoPackage.ELEMENT_LIST__KEYED_ELEMENTS:
        getKeyedElements().clear();
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
      case GoPackage.ELEMENT_LIST__KEYED_ELEMENTS:
        return keyedElements != null && !keyedElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //elementListImpl
