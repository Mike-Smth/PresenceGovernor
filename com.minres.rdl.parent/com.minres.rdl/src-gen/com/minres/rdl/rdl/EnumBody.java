/**
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.rdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.rdl.rdl.EnumBody#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see com.minres.rdl.rdl.RdlPackage#getEnumBody()
 * @model
 * @generated
 */
public interface EnumBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link com.minres.rdl.rdl.EnumEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see com.minres.rdl.rdl.RdlPackage#getEnumBody_Entries()
   * @model containment="true"
   * @generated
   */
  EList<EnumEntry> getEntries();

} // EnumBody
