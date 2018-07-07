/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.go.GoPackage;
import org.xtext.go.sourceFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>source File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.sourceFileImpl#getPackageClause <em>Package Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class sourceFileImpl extends MinimalEObjectImpl.Container implements sourceFile
{
  /**
   * The default value of the '{@link #getPackageClause() <em>Package Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageClause()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_CLAUSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageClause() <em>Package Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageClause()
   * @generated
   * @ordered
   */
  protected String packageClause = PACKAGE_CLAUSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected sourceFileImpl()
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
    return GoPackage.Literals.SOURCE_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageClause()
  {
    return packageClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageClause(String newPackageClause)
  {
    String oldPackageClause = packageClause;
    packageClause = newPackageClause;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SOURCE_FILE__PACKAGE_CLAUSE, oldPackageClause, packageClause));
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
      case GoPackage.SOURCE_FILE__PACKAGE_CLAUSE:
        return getPackageClause();
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
      case GoPackage.SOURCE_FILE__PACKAGE_CLAUSE:
        setPackageClause((String)newValue);
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
      case GoPackage.SOURCE_FILE__PACKAGE_CLAUSE:
        setPackageClause(PACKAGE_CLAUSE_EDEFAULT);
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
      case GoPackage.SOURCE_FILE__PACKAGE_CLAUSE:
        return PACKAGE_CLAUSE_EDEFAULT == null ? packageClause != null : !PACKAGE_CLAUSE_EDEFAULT.equals(packageClause);
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
    result.append(" (packageClause: ");
    result.append(packageClause);
    result.append(')');
    return result.toString();
  }

} //sourceFileImpl
