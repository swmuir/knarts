/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Example of workflow instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOption#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOption#getStep <em>Step</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOption#getPause <em>Pause</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOption()
 * @model extendedMetaData="name='ExampleScenario.Option' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioOption extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable description of each option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOption_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOption#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What happens in each alternative option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOption_Step()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioStep> getStep();

	/**
	 * Returns the value of the '<em><b>Pause</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is a pause in the flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pause</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOption_Pause()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pause' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.Boolean> getPause();

} // ExampleScenarioOption
