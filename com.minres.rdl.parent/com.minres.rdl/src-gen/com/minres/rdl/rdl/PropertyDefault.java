/**
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.rdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.rdl.rdl.PropertyDefault#getString <em>String</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.PropertyDefault#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.minres.rdl.rdl.RdlPackage#getPropertyDefault()
 * @model
 * @generated
 */
public interface PropertyDefault extends EObject
{
  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see com.minres.rdl.rdl.RdlPackage#getPropertyDefault_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.PropertyDefault#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Object)
   * @see com.minres.rdl.rdl.RdlPackage#getPropertyDefault_Value()
   * @model
   * @generated
   */
  Object getValue();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.PropertyDefault#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Object value);

} // PropertyDefault
