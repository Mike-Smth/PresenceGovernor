/**
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.rdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.rdl.rdl.ComponentInstance#getRange <em>Range</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.ComponentInstance#getReset <em>Reset</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.ComponentInstance#getAddress <em>Address</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.ComponentInstance#getAddrInc <em>Addr Inc</em>}</li>
 *   <li>{@link com.minres.rdl.rdl.ComponentInstance#getAddrMod <em>Addr Mod</em>}</li>
 * </ul>
 *
 * @see com.minres.rdl.rdl.RdlPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends Entity
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Range)
   * @see com.minres.rdl.rdl.RdlPackage#getComponentInstance_Range()
   * @model containment="true"
   * @generated
   */
  Range getRange();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ComponentInstance#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Range value);

  /**
   * Returns the value of the '<em><b>Reset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reset</em>' attribute.
   * @see #setReset(Object)
   * @see com.minres.rdl.rdl.RdlPackage#getComponentInstance_Reset()
   * @model
   * @generated
   */
  Object getReset();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ComponentInstance#getReset <em>Reset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reset</em>' attribute.
   * @see #getReset()
   * @generated
   */
  void setReset(Object value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(Object)
   * @see com.minres.rdl.rdl.RdlPackage#getComponentInstance_Address()
   * @model
   * @generated
   */
  Object getAddress();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ComponentInstance#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Object value);

  /**
   * Returns the value of the '<em><b>Addr Inc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr Inc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr Inc</em>' attribute.
   * @see #setAddrInc(Object)
   * @see com.minres.rdl.rdl.RdlPackage#getComponentInstance_AddrInc()
   * @model
   * @generated
   */
  Object getAddrInc();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ComponentInstance#getAddrInc <em>Addr Inc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr Inc</em>' attribute.
   * @see #getAddrInc()
   * @generated
   */
  void setAddrInc(Object value);

  /**
   * Returns the value of the '<em><b>Addr Mod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr Mod</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr Mod</em>' attribute.
   * @see #setAddrMod(Object)
   * @see com.minres.rdl.rdl.RdlPackage#getComponentInstance_AddrMod()
   * @model
   * @generated
   */
  Object getAddrMod();

  /**
   * Sets the value of the '{@link com.minres.rdl.rdl.ComponentInstance#getAddrMod <em>Addr Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr Mod</em>' attribute.
   * @see #getAddrMod()
   * @generated
   */
  void setAddrMod(Object value);

} // ComponentInstance
