/**
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.rdl.impl;

import com.minres.rdl.rdl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdlFactoryImpl extends EFactoryImpl implements RdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RdlFactory init()
  {
    try
    {
      RdlFactory theRdlFactory = (RdlFactory)EPackage.Registry.INSTANCE.getEFactory(RdlPackage.eNS_URI);
      if (theRdlFactory != null)
      {
        return theRdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RdlPackage.ROOT: return createRoot();
      case RdlPackage.INCLUDE: return createInclude();
      case RdlPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
      case RdlPackage.PROPERTY_DEFAULT: return createPropertyDefault();
      case RdlPackage.PROPERTY_USAGE: return createPropertyUsage();
      case RdlPackage.COMPONENT_DEFINITION: return createComponentDefinition();
      case RdlPackage.INSTANTIATION: return createInstantiation();
      case RdlPackage.COMPONENT_INSTANCE: return createComponentInstance();
      case RdlPackage.RANGE: return createRange();
      case RdlPackage.PROPERTY_ASSIGNMENT: return createPropertyAssignment();
      case RdlPackage.DEFAULT_PROPERY_ASSIGNMENT: return createDefaultProperyAssignment();
      case RdlPackage.EXPLICIT_PROPERTY_ASSIGNMENT: return createExplicitPropertyAssignment();
      case RdlPackage.POST_PROPERTY_ASSIGNMENT: return createPostPropertyAssignment();
      case RdlPackage.INSTANCE_PROPERTY_REF: return createInstancePropertyRef();
      case RdlPackage.ENTITY: return createEntity();
      case RdlPackage.INSTANCE_REF: return createInstanceRef();
      case RdlPackage.PROPERTY_ASSIGNMENT_RHS: return createPropertyAssignmentRhs();
      case RdlPackage.CONCAT: return createConcat();
      case RdlPackage.CONCAT_ELEM: return createConcatElem();
      case RdlPackage.RVALUE: return createRValue();
      case RdlPackage.ENUM_DEFINITION: return createEnumDefinition();
      case RdlPackage.ENUM_BODY: return createEnumBody();
      case RdlPackage.ENUM_ENTRY: return createEnumEntry();
      case RdlPackage.ENUM_PROPERTY: return createEnumProperty();
      case RdlPackage.ENUM_INSTANCE_TYPE: return createEnumInstanceType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RdlPackage.PROPERTY_TYPE_NAME:
        return createPropertyTypeNameFromString(eDataType, initialValue);
      case RdlPackage.PROPERTY_COMPONENT:
        return createPropertyComponentFromString(eDataType, initialValue);
      case RdlPackage.COMPONENT_DEFINITION_TYPE:
        return createComponentDefinitionTypeFromString(eDataType, initialValue);
      case RdlPackage.PROPERTY_ENUM:
        return createPropertyEnumFromString(eDataType, initialValue);
      case RdlPackage.RVALUE_CONSTANT:
        return createRValueConstantFromString(eDataType, initialValue);
      case RdlPackage.PROPERTY_MODIFIER:
        return createPropertyModifierFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RdlPackage.PROPERTY_TYPE_NAME:
        return convertPropertyTypeNameToString(eDataType, instanceValue);
      case RdlPackage.PROPERTY_COMPONENT:
        return convertPropertyComponentToString(eDataType, instanceValue);
      case RdlPackage.COMPONENT_DEFINITION_TYPE:
        return convertComponentDefinitionTypeToString(eDataType, instanceValue);
      case RdlPackage.PROPERTY_ENUM:
        return convertPropertyEnumToString(eDataType, instanceValue);
      case RdlPackage.RVALUE_CONSTANT:
        return convertRValueConstantToString(eDataType, instanceValue);
      case RdlPackage.PROPERTY_MODIFIER:
        return convertPropertyModifierToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDefinition createPropertyDefinition()
  {
    PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
    return propertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDefault createPropertyDefault()
  {
    PropertyDefaultImpl propertyDefault = new PropertyDefaultImpl();
    return propertyDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyUsage createPropertyUsage()
  {
    PropertyUsageImpl propertyUsage = new PropertyUsageImpl();
    return propertyUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition createComponentDefinition()
  {
    ComponentDefinitionImpl componentDefinition = new ComponentDefinitionImpl();
    return componentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instantiation createInstantiation()
  {
    InstantiationImpl instantiation = new InstantiationImpl();
    return instantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentInstance createComponentInstance()
  {
    ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
    return componentInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAssignment createPropertyAssignment()
  {
    PropertyAssignmentImpl propertyAssignment = new PropertyAssignmentImpl();
    return propertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultProperyAssignment createDefaultProperyAssignment()
  {
    DefaultProperyAssignmentImpl defaultProperyAssignment = new DefaultProperyAssignmentImpl();
    return defaultProperyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitPropertyAssignment createExplicitPropertyAssignment()
  {
    ExplicitPropertyAssignmentImpl explicitPropertyAssignment = new ExplicitPropertyAssignmentImpl();
    return explicitPropertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostPropertyAssignment createPostPropertyAssignment()
  {
    PostPropertyAssignmentImpl postPropertyAssignment = new PostPropertyAssignmentImpl();
    return postPropertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstancePropertyRef createInstancePropertyRef()
  {
    InstancePropertyRefImpl instancePropertyRef = new InstancePropertyRefImpl();
    return instancePropertyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceRef createInstanceRef()
  {
    InstanceRefImpl instanceRef = new InstanceRefImpl();
    return instanceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAssignmentRhs createPropertyAssignmentRhs()
  {
    PropertyAssignmentRhsImpl propertyAssignmentRhs = new PropertyAssignmentRhsImpl();
    return propertyAssignmentRhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concat createConcat()
  {
    ConcatImpl concat = new ConcatImpl();
    return concat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcatElem createConcatElem()
  {
    ConcatElemImpl concatElem = new ConcatElemImpl();
    return concatElem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RValue createRValue()
  {
    RValueImpl rValue = new RValueImpl();
    return rValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDefinition createEnumDefinition()
  {
    EnumDefinitionImpl enumDefinition = new EnumDefinitionImpl();
    return enumDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumBody createEnumBody()
  {
    EnumBodyImpl enumBody = new EnumBodyImpl();
    return enumBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumEntry createEnumEntry()
  {
    EnumEntryImpl enumEntry = new EnumEntryImpl();
    return enumEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumProperty createEnumProperty()
  {
    EnumPropertyImpl enumProperty = new EnumPropertyImpl();
    return enumProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumInstanceType createEnumInstanceType()
  {
    EnumInstanceTypeImpl enumInstanceType = new EnumInstanceTypeImpl();
    return enumInstanceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyTypeName createPropertyTypeNameFromString(EDataType eDataType, String initialValue)
  {
    PropertyTypeName result = PropertyTypeName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropertyTypeNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyComponent createPropertyComponentFromString(EDataType eDataType, String initialValue)
  {
    PropertyComponent result = PropertyComponent.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropertyComponentToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinitionType createComponentDefinitionTypeFromString(EDataType eDataType, String initialValue)
  {
    ComponentDefinitionType result = ComponentDefinitionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComponentDefinitionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyEnum createPropertyEnumFromString(EDataType eDataType, String initialValue)
  {
    PropertyEnum result = PropertyEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropertyEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RValueConstant createRValueConstantFromString(EDataType eDataType, String initialValue)
  {
    RValueConstant result = RValueConstant.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRValueConstantToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyModifier createPropertyModifierFromString(EDataType eDataType, String initialValue)
  {
    PropertyModifier result = PropertyModifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropertyModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RdlPackage getRdlPackage()
  {
    return (RdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RdlPackage getPackage()
  {
    return RdlPackage.eINSTANCE;
  }

} //RdlFactoryImpl
