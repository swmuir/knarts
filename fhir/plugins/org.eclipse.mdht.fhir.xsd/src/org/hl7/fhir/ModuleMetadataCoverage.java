/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Metadata Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ModuleMetadata structure defines the common metadata elements used by quality improvement artifacts. This information includes descriptive and topical metadata to enable repository searches, as well as governance and evidentiary support information.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ModuleMetadataCoverage#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleMetadataCoverage#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getModuleMetadataCoverage()
 * @model extendedMetaData="name='ModuleMetadata.Coverage' kind='elementOnly'"
 * @generated
 */
public interface ModuleMetadataCoverage extends Element {
	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the focus of the coverage attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Coding)
	 * @see org.hl7.fhir.FhirPackage#getModuleMetadataCoverage_Focus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleMetadataCoverage#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Coding value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a value for the coverage attribute. Different values are appropriate in different focus areas, as specified in the description of values for focus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getModuleMetadataCoverage_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleMetadataCoverage#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CodeableConcept value);

} // ModuleMetadataCoverage
