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
import org.xtext.go.declaration;
import org.xtext.go.functionDecl;
import org.xtext.go.methodDecl;
import org.xtext.go.topLevelDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>top Level Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.impl.topLevelDeclImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.go.impl.topLevelDeclImpl#getFunctionDecl <em>Function Decl</em>}</li>
 *   <li>{@link org.xtext.go.impl.topLevelDeclImpl#getMethodDecl <em>Method Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class topLevelDeclImpl extends MinimalEObjectImpl.Container implements topLevelDecl
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected declaration declaration;

  /**
   * The cached value of the '{@link #getFunctionDecl() <em>Function Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionDecl()
   * @generated
   * @ordered
   */
  protected functionDecl functionDecl;

  /**
   * The cached value of the '{@link #getMethodDecl() <em>Method Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodDecl()
   * @generated
   * @ordered
   */
  protected methodDecl methodDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected topLevelDeclImpl()
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
    return GoPackage.Literals.TOP_LEVEL_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(declaration newDeclaration, NotificationChain msgs)
  {
    declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionDecl getFunctionDecl()
  {
    return functionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionDecl(functionDecl newFunctionDecl, NotificationChain msgs)
  {
    functionDecl oldFunctionDecl = functionDecl;
    functionDecl = newFunctionDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL, oldFunctionDecl, newFunctionDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionDecl(functionDecl newFunctionDecl)
  {
    if (newFunctionDecl != functionDecl)
    {
      NotificationChain msgs = null;
      if (functionDecl != null)
        msgs = ((InternalEObject)functionDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL, null, msgs);
      if (newFunctionDecl != null)
        msgs = ((InternalEObject)newFunctionDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL, null, msgs);
      msgs = basicSetFunctionDecl(newFunctionDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL, newFunctionDecl, newFunctionDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public methodDecl getMethodDecl()
  {
    return methodDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodDecl(methodDecl newMethodDecl, NotificationChain msgs)
  {
    methodDecl oldMethodDecl = methodDecl;
    methodDecl = newMethodDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__METHOD_DECL, oldMethodDecl, newMethodDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodDecl(methodDecl newMethodDecl)
  {
    if (newMethodDecl != methodDecl)
    {
      NotificationChain msgs = null;
      if (methodDecl != null)
        msgs = ((InternalEObject)methodDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__METHOD_DECL, null, msgs);
      if (newMethodDecl != null)
        msgs = ((InternalEObject)newMethodDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__METHOD_DECL, null, msgs);
      msgs = basicSetMethodDecl(newMethodDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__METHOD_DECL, newMethodDecl, newMethodDecl));
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        return basicSetFunctionDecl(null, msgs);
      case GoPackage.TOP_LEVEL_DECL__METHOD_DECL:
        return basicSetMethodDecl(null, msgs);
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        return getDeclaration();
      case GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        return getFunctionDecl();
      case GoPackage.TOP_LEVEL_DECL__METHOD_DECL:
        return getMethodDecl();
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        setDeclaration((declaration)newValue);
        return;
      case GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        setFunctionDecl((functionDecl)newValue);
        return;
      case GoPackage.TOP_LEVEL_DECL__METHOD_DECL:
        setMethodDecl((methodDecl)newValue);
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        setDeclaration((declaration)null);
        return;
      case GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        setFunctionDecl((functionDecl)null);
        return;
      case GoPackage.TOP_LEVEL_DECL__METHOD_DECL:
        setMethodDecl((methodDecl)null);
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        return declaration != null;
      case GoPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        return functionDecl != null;
      case GoPackage.TOP_LEVEL_DECL__METHOD_DECL:
        return methodDecl != null;
    }
    return super.eIsSet(featureID);
  }

} //topLevelDeclImpl
