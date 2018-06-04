/**
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.rdl.impl;

import com.minres.rdl.rdl.ExplicitPropertyAssignment;
import com.minres.rdl.rdl.PropertyAssignmentRhs;
import com.minres.rdl.rdl.PropertyEnum;
import com.minres.rdl.rdl.PropertyModifier;
import com.minres.rdl.rdl.RdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.rdl.rdl.impl.ExplicitPropertyAssignmentImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.impl.ExplicitPropertyAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.impl.ExplicitPropertyAssignmentImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplicitPropertyAssignmentImpl extends PropertyAssignmentImpl implements ExplicitPropertyAssignment
{
  /**
   * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected static final PropertyModifier MODIFIER_EDEFAULT = PropertyModifier.UNDEFINED;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected PropertyModifier modifier = MODIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final PropertyEnum NAME_EDEFAULT = PropertyEnum.UNSPECIFIED;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected PropertyEnum name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected PropertyAssignmentRhs rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExplicitPropertyAssignmentImpl()
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
    return RdlPackage.Literals.EXPLICIT_PROPERTY_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyModifier getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(PropertyModifier newModifier)
  {
    PropertyModifier oldModifier = modifier;
    modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyEnum getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(PropertyEnum newName)
  {
    PropertyEnum oldName = name;
    name = newName == null ? NAME_EDEFAULT : newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAssignmentRhs getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(PropertyAssignmentRhs newRhs, NotificationChain msgs)
  {
    PropertyAssignmentRhs oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(PropertyAssignmentRhs newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS, newRhs, newRhs));
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
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS:
        return basicSetRhs(null, msgs);
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
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__MODIFIER:
        return getModifier();
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__NAME:
        return getName();
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS:
        return getRhs();
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
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__MODIFIER:
        setModifier((PropertyModifier)newValue);
        return;
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__NAME:
        setName((PropertyEnum)newValue);
        return;
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS:
        setRhs((PropertyAssignmentRhs)newValue);
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
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__MODIFIER:
        setModifier(MODIFIER_EDEFAULT);
        return;
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS:
        setRhs((PropertyAssignmentRhs)null);
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
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__MODIFIER:
        return modifier != MODIFIER_EDEFAULT;
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__NAME:
        return name != NAME_EDEFAULT;
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT__RHS:
        return rhs != null;
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
    result.append(" (modifier: ");
    result.append(modifier);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExplicitPropertyAssignmentImpl
