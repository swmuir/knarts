/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Service Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DecisionSupportServiceModule resource describes decision support functionality that is available as a service.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModule#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModule#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModule()
 * @model extendedMetaData="name='DecisionSupportServiceModule' kind='elementOnly'"
 * @generated
 */
public interface DecisionSupportServiceModule extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Module Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a ModuleMetadata resource describing the metadata for the decision support service module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Metadata</em>' containment reference.
	 * @see #setModuleMetadata(ModuleMetadata)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModule_ModuleMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleMetadata getModuleMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModule#getModuleMetadata <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Metadata</em>' containment reference.
	 * @see #getModuleMetadata()
	 * @generated
	 */
	void setModuleMetadata(ModuleMetadata value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DecisionSupportServiceModuleParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModule_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DecisionSupportServiceModuleParameter> getParameter();

} // DecisionSupportServiceModule
