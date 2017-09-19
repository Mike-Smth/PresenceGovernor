/**
 * generated by Xtext 2.12.0
 */
package com.minres.rdl.rdl.impl;

import com.minres.rdl.rdl.ComponentDefinition;
import com.minres.rdl.rdl.ComponentDefinitionType;
import com.minres.rdl.rdl.EnumDefinition;
import com.minres.rdl.rdl.Instantiation;
import com.minres.rdl.rdl.PropertyAssignment;
import com.minres.rdl.rdl.RdlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.rdl.rdl.impl.ComponentDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.impl.ComponentDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.impl.ComponentDefinitionImpl#getComponentDefinitions <em>Component Definitions</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.impl.ComponentDefinitionImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.impl.ComponentDefinitionImpl#getPropertyAssignments <em>Property Assignments</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.impl.ComponentDefinitionImpl#getEnumDefinitions <em>Enum Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionImpl extends MinimalEObjectImpl.Container implements ComponentDefinition
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ComponentDefinitionType TYPE_EDEFAULT = ComponentDefinitionType.SIGNAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ComponentDefinitionType type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getComponentDefinitions() <em>Component Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentDefinitions()
   * @generated
   * @ordered
   */
  protected EList<ComponentDefinition> componentDefinitions;

  /**
   * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstantiations()
   * @generated
   * @ordered
   */
  protected EList<Instantiation> instantiations;

  /**
   * The cached value of the '{@link #getPropertyAssignments() <em>Property Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyAssignments()
   * @generated
   * @ordered
   */
  protected EList<PropertyAssignment> propertyAssignments;

  /**
   * The cached value of the '{@link #getEnumDefinitions() <em>Enum Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumDefinitions()
   * @generated
   * @ordered
   */
  protected EList<EnumDefinition> enumDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentDefinitionImpl()
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
    return RdlPackage.Literals.COMPONENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinitionType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ComponentDefinitionType newType)
  {
    ComponentDefinitionType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.COMPONENT_DEFINITION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.COMPONENT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentDefinition> getComponentDefinitions()
  {
    if (componentDefinitions == null)
    {
      componentDefinitions = new EObjectContainmentEList<ComponentDefinition>(ComponentDefinition.class, this, RdlPackage.COMPONENT_DEFINITION__COMPONENT_DEFINITIONS);
    }
    return componentDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instantiation> getInstantiations()
  {
    if (instantiations == null)
    {
      instantiations = new EObjectContainmentEList<Instantiation>(Instantiation.class, this, RdlPackage.COMPONENT_DEFINITION__INSTANTIATIONS);
    }
    return instantiations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyAssignment> getPropertyAssignments()
  {
    if (propertyAssignments == null)
    {
      propertyAssignments = new EObjectContainmentEList<PropertyAssignment>(PropertyAssignment.class, this, RdlPackage.COMPONENT_DEFINITION__PROPERTY_ASSIGNMENTS);
    }
    return propertyAssignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumDefinition> getEnumDefinitions()
  {
    if (enumDefinitions == null)
    {
      enumDefinitions = new EObjectContainmentEList<EnumDefinition>(EnumDefinition.class, this, RdlPackage.COMPONENT_DEFINITION__ENUM_DEFINITIONS);
    }
    return enumDefinitions;
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
      case RdlPackage.COMPONENT_DEFINITION__COMPONENT_DEFINITIONS:
        return ((InternalEList<?>)getComponentDefinitions()).basicRemove(otherEnd, msgs);
      case RdlPackage.COMPONENT_DEFINITION__INSTANTIATIONS:
        return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
      case RdlPackage.COMPONENT_DEFINITION__PROPERTY_ASSIGNMENTS:
        return ((InternalEList<?>)getPropertyAssignments()).basicRemove(otherEnd, msgs);
      case RdlPackage.COMPONENT_DEFINITION__ENUM_DEFINITIONS:
        return ((InternalEList<?>)getEnumDefinitions()).basicRemove(otherEnd, msgs);
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
      case RdlPackage.COMPONENT_DEFINITION__TYPE:
        return getType();
      case RdlPackage.COMPONENT_DEFINITION__NAME:
        return getName();
      case RdlPackage.COMPONENT_DEFINITION__COMPONENT_DEFINITIONS:
        return getComponentDefinitions();
      case RdlPackage.COMPONENT_DEFINITION__INSTANTIATIONS:
        return getInstantiations();
      case RdlPackage.COMPONENT_DEFINITION__PROPERTY_ASSIGNMENTS:
        return getPropertyAssignments();
      case RdlPackage.COMPONENT_DEFINITION__ENUM_DEFINITIONS:
        return getEnumDefinitions();
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
      case RdlPackage.COMPONENT_DEFINITION__TYPE:
        setType((ComponentDefinitionType)newValue);
        return;
      case RdlPackage.COMPONENT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case RdlPackage.COMPONENT_DEFINITION__COMPONENT_DEFINITIONS:
        getComponentDefinitions().clear();
        getComponentDefinitions().addAll((Collection<? extends ComponentDefinition>)newValue);
        return;
      case RdlPackage.COMPONENT_DEFINITION__INSTANTIATIONS:
        getInstantiations().clear();
        getInstantiations().addAll((Collection<? extends Instantiation>)newValue);
        return;
      case RdlPackage.COMPONENT_DEFINITION__PROPERTY_ASSIGNMENTS:
        getPropertyAssignments().clear();
        getPropertyAssignments().addAll((Collection<? extends PropertyAssignment>)newValue);
        return;
      case RdlPackage.COMPONENT_DEFINITION__ENUM_DEFINITIONS:
        getEnumDefinitions().clear();
        getEnumDefinitions().addAll((Collection<? extends EnumDefinition>)newValue);
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
      case RdlPackage.COMPONENT_DEFINITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RdlPackage.COMPONENT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RdlPackage.COMPONENT_DEFINITION__COMPONENT_DEFINITIONS:
        getComponentDefinitions().clear();
        return;
      case RdlPackage.COMPONENT_DEFINITION__INSTANTIATIONS:
        getInstantiations().clear();
        return;
      case RdlPackage.COMPONENT_DEFINITION__PROPERTY_ASSIGNMENTS:
        getPropertyAssignments().clear();
        return;
      case RdlPackage.COMPONENT_DEFINITION__ENUM_DEFINITIONS:
        getEnumDefinitions().clear();
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
      case RdlPackage.COMPONENT_DEFINITION__TYPE:
        return type != TYPE_EDEFAULT;
      case RdlPackage.COMPONENT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RdlPackage.COMPONENT_DEFINITION__COMPONENT_DEFINITIONS:
        return componentDefinitions != null && !componentDefinitions.isEmpty();
      case RdlPackage.COMPONENT_DEFINITION__INSTANTIATIONS:
        return instantiations != null && !instantiations.isEmpty();
      case RdlPackage.COMPONENT_DEFINITION__PROPERTY_ASSIGNMENTS:
        return propertyAssignments != null && !propertyAssignments.isEmpty();
      case RdlPackage.COMPONENT_DEFINITION__ENUM_DEFINITIONS:
        return enumDefinitions != null && !enumDefinitions.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ComponentDefinitionImpl
