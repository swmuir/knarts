/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Service Module Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DecisionSupportServiceModule resource describes decision support functionality that is available as a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getCodeFilter <em>Code Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getDateFilter <em>Date Filter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter()
 * @model extendedMetaData="name='DecisionSupportServiceModule.Parameter' kind='elementOnly'"
 * @generated
 */
public interface DecisionSupportServiceModuleParameter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Code)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Code value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the parameter is input or output for the module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Code)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_Use()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief discussion of what the parameter is for and how it is used by the module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If specified, this indicates a profile that the input data must conform to, or that the output data will conform to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleParameter#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Reference value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_MustSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mustSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getMustSupport();

	/**
	 * Returns the value of the '<em><b>Code Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that incoming data for this parameter is expected to match the given code filter. In other words, every instance should have a value for the path element that comes from the specified value set (or list of concepts).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_CodeFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DecisionSupportServiceModuleCodeFilter> getCodeFilter();

	/**
	 * Returns the value of the '<em><b>Date Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DecisionSupportServiceModuleDateFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that incoming data for this parameter is expected to match the given date filter. In other words, every instance should have a value for the path element that is equal to the given datetime (or within the given Period).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleParameter_DateFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DecisionSupportServiceModuleDateFilter> getDateFilter();

} // DecisionSupportServiceModuleParameter
