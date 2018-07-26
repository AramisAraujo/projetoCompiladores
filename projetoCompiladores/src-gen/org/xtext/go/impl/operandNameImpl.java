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
import org.xtext.go.operandName;
import org.xtext.go.qualifiedIdent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operand Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.impl.operandNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.impl.operandNameImpl#getQualIdent <em>Qual Ident</em>}</li>
 * </ul>
 *
 * @generated
 */
public class operandNameImpl extends MinimalEObjectImpl.Container implements operandName
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getQualIdent() <em>Qual Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualIdent()
   * @generated
   * @ordered
   */
  protected qualifiedIdent qualIdent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected operandNameImpl()
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
    return GoPackage.Literals.OPERAND_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND_NAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifiedIdent getQualIdent()
  {
    return qualIdent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualIdent(qualifiedIdent newQualIdent, NotificationChain msgs)
  {
    qualifiedIdent oldQualIdent = qualIdent;
    qualIdent = newQualIdent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND_NAME__QUAL_IDENT, oldQualIdent, newQualIdent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualIdent(qualifiedIdent newQualIdent)
  {
    if (newQualIdent != qualIdent)
    {
      NotificationChain msgs = null;
      if (qualIdent != null)
        msgs = ((InternalEObject)qualIdent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND_NAME__QUAL_IDENT, null, msgs);
      if (newQualIdent != null)
        msgs = ((InternalEObject)newQualIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.OPERAND_NAME__QUAL_IDENT, null, msgs);
      msgs = basicSetQualIdent(newQualIdent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.OPERAND_NAME__QUAL_IDENT, newQualIdent, newQualIdent));
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
      case GoPackage.OPERAND_NAME__QUAL_IDENT:
        return basicSetQualIdent(null, msgs);
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
      case GoPackage.OPERAND_NAME__NAME:
        return getName();
      case GoPackage.OPERAND_NAME__QUAL_IDENT:
        return getQualIdent();
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
      case GoPackage.OPERAND_NAME__NAME:
        setName((String)newValue);
        return;
      case GoPackage.OPERAND_NAME__QUAL_IDENT:
        setQualIdent((qualifiedIdent)newValue);
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
      case GoPackage.OPERAND_NAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GoPackage.OPERAND_NAME__QUAL_IDENT:
        setQualIdent((qualifiedIdent)null);
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
      case GoPackage.OPERAND_NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GoPackage.OPERAND_NAME__QUAL_IDENT:
        return qualIdent != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //operandNameImpl
