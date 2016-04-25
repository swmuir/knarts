/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Ruleset1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptRuleset1#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptRuleset1()
 * @model extendedMetaData="name='TestScript.Ruleset1' kind='elementOnly'"
 * @generated
 */
public interface TestScriptRuleset1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptRule3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the referenced rule within the external ruleset template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRuleset1_Rule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptRule3> getRule();

} // TestScriptRuleset1
