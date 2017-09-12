/**
 * generated by Xtext 2.12.0
 */
package com.minres.rdl.rdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.rdl.rdl.Concat#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.minres.rdl.rdl.RdlPackage#getConcat()
 * @model
 * @generated
 */
public interface Concat extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.minres.rdl.rdl.ConcatElem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.minres.rdl.rdl.RdlPackage#getConcat_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ConcatElem> getElements();

} // Concat
