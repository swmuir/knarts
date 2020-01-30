/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Request Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SupplyRequestParameter#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequestParameter#getValuex <em>Valuex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequestParameter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SupplyRequest_Parameter'"
 * @generated
 */
public interface SupplyRequestParameter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequestParameter_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequestParameter#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuex</em>' containment reference.
	 * @see #setValuex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequestParameter_Valuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	DataType getValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequestParameter#getValuex <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' containment reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(DataType value);

} // SupplyRequestParameter
