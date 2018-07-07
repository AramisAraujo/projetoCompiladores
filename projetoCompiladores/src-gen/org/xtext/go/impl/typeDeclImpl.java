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
import org.xtext.go.typeDecl;
import org.xtext.go.typeSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.typeDeclImpl#getTypeSpec <em>Type Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeDeclImpl extends MinimalEObjectImpl.Container implements typeDecl
{
  /**
   * The cached value of the '{@link #getTypeSpec() <em>Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpec()
   * @generated
   * @ordered
   */
  protected typeSpec typeSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeDeclImpl()
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
    return GoPackage.Literals.TYPE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeSpec getTypeSpec()
  {
    return typeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSpec(typeSpec newTypeSpec, NotificationChain msgs)
  {
    typeSpec oldTypeSpec = typeSpec;
    typeSpec = newTypeSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_DECL__TYPE_SPEC, oldTypeSpec, newTypeSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSpec(typeSpec newTypeSpec)
  {
    if (newTypeSpec != typeSpec)
    {
      NotificationChain msgs = null;
      if (typeSpec != null)
        msgs = ((InternalEObject)typeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_DECL__TYPE_SPEC, null, msgs);
      if (newTypeSpec != null)
        msgs = ((InternalEObject)newTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_DECL__TYPE_SPEC, null, msgs);
      msgs = basicSetTypeSpec(newTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_DECL__TYPE_SPEC, newTypeSpec, newTypeSpec));
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
      case GoPackage.TYPE_DECL__TYPE_SPEC:
        return basicSetTypeSpec(null, msgs);
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
      case GoPackage.TYPE_DECL__TYPE_SPEC:
        return getTypeSpec();
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
      case GoPackage.TYPE_DECL__TYPE_SPEC:
        setTypeSpec((typeSpec)newValue);
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
      case GoPackage.TYPE_DECL__TYPE_SPEC:
        setTypeSpec((typeSpec)null);
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
      case GoPackage.TYPE_DECL__TYPE_SPEC:
        return typeSpec != null;
    }
    return super.eIsSet(featureID);
  }

} //typeDeclImpl
