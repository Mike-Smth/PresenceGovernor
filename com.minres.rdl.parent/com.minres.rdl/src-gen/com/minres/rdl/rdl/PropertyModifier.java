/**
 * generated by Xtext 2.12.0
 */
package com.minres.rdl.rdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Modifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.minres.rdl.rdl.RdlPackage#getPropertyModifier()
 * @model
 * @generated
 */
public enum PropertyModifier implements Enumerator
{
  /**
   * The '<em><b>UNDEFINED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED_VALUE
   * @generated
   * @ordered
   */
  UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

  /**
   * The '<em><b>POSEDGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSEDGE_VALUE
   * @generated
   * @ordered
   */
  POSEDGE(1, "POSEDGE", "posedge"),

  /**
   * The '<em><b>NEGEDGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEGEDGE_VALUE
   * @generated
   * @ordered
   */
  NEGEDGE(2, "NEGEDGE", "negedge"),

  /**
   * The '<em><b>BOTHEDGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOTHEDGE_VALUE
   * @generated
   * @ordered
   */
  BOTHEDGE(3, "BOTHEDGE", "bothedge"),

  /**
   * The '<em><b>LEVEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEVEL_VALUE
   * @generated
   * @ordered
   */
  LEVEL(4, "LEVEL", "level"),

  /**
   * The '<em><b>NONSTICKY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONSTICKY_VALUE
   * @generated
   * @ordered
   */
  NONSTICKY(5, "NONSTICKY", "nonsticky");

  /**
   * The '<em><b>UNDEFINED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDEFINED
   * @model
   * @generated
   * @ordered
   */
  public static final int UNDEFINED_VALUE = 0;

  /**
   * The '<em><b>POSEDGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POSEDGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSEDGE
   * @model literal="posedge"
   * @generated
   * @ordered
   */
  public static final int POSEDGE_VALUE = 1;

  /**
   * The '<em><b>NEGEDGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEGEDGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEGEDGE
   * @model literal="negedge"
   * @generated
   * @ordered
   */
  public static final int NEGEDGE_VALUE = 2;

  /**
   * The '<em><b>BOTHEDGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOTHEDGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOTHEDGE
   * @model literal="bothedge"
   * @generated
   * @ordered
   */
  public static final int BOTHEDGE_VALUE = 3;

  /**
   * The '<em><b>LEVEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEVEL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEVEL
   * @model literal="level"
   * @generated
   * @ordered
   */
  public static final int LEVEL_VALUE = 4;

  /**
   * The '<em><b>NONSTICKY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONSTICKY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONSTICKY
   * @model literal="nonsticky"
   * @generated
   * @ordered
   */
  public static final int NONSTICKY_VALUE = 5;

  /**
   * An array of all the '<em><b>Property Modifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PropertyModifier[] VALUES_ARRAY =
    new PropertyModifier[]
    {
      UNDEFINED,
      POSEDGE,
      NEGEDGE,
      BOTHEDGE,
      LEVEL,
      NONSTICKY,
    };

  /**
   * A public read-only list of all the '<em><b>Property Modifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PropertyModifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Property Modifier</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropertyModifier get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyModifier result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Modifier</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropertyModifier getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyModifier result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Modifier</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropertyModifier get(int value)
  {
    switch (value)
    {
      case UNDEFINED_VALUE: return UNDEFINED;
      case POSEDGE_VALUE: return POSEDGE;
      case NEGEDGE_VALUE: return NEGEDGE;
      case BOTHEDGE_VALUE: return BOTHEDGE;
      case LEVEL_VALUE: return LEVEL;
      case NONSTICKY_VALUE: return NONSTICKY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private PropertyModifier(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PropertyModifier
