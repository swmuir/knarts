/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupInput()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Group_Input'"
 * @generated
 */
public interface StructureMapGroupInput extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Id)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupInput_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Id value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupInput_Type()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupInput_Mode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupInput_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupInput#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // StructureMapGroupInput
