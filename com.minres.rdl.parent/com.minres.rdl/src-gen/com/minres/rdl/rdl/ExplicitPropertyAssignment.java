/**
 * generated by Xtext 2.12.0
 */
package com.minres.rdl.rdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.rdl.rdl.ExplicitPropertyAssignment#getModifier <em>Modifier</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.ExplicitPropertyAssignment#getName <em>Name</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.ExplicitPropertyAssignment#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see com.minres.rdl.rdl.RdlPackage#getExplicitPropertyAssignment()
 * @model
 * @generated
 */
public interface ExplicitPropertyAssignment extends PropertyAssignment, DefaultProperyAssignment
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link com.minres.rdl.rdl.PropertyModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see com.minres.rdl.rdl.PropertyModifier
   * @see #setModifier(PropertyModifier)
   * @see com.minres.rdl.rdl.RdlPackage#getExplicitPropertyAssignment_Modifier()
   * @model
   * @generated
   */
  PropertyModifier getModifier();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ExplicitPropertyAssignment#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see com.minres.rdl.rdl.PropertyModifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(PropertyModifier value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link com.minres.rdl.rdl.PropertyEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see com.minres.rdl.rdl.PropertyEnum
   * @see #setName(PropertyEnum)
   * @see com.minres.rdl.rdl.RdlPackage#getExplicitPropertyAssignment_Name()
   * @model
   * @generated
   */
  PropertyEnum getName();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ExplicitPropertyAssignment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see com.minres.rdl.rdl.PropertyEnum
   * @see #getName()
   * @generated
   */
  void setName(PropertyEnum value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(PropertyAssignmentRhs)
   * @see com.minres.rdl.rdl.RdlPackage#getExplicitPropertyAssignment_Rhs()
   * @model containment="true"
   * @generated
   */
  PropertyAssignmentRhs getRhs();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ExplicitPropertyAssignment#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(PropertyAssignmentRhs value);

} // ExplicitPropertyAssignment
