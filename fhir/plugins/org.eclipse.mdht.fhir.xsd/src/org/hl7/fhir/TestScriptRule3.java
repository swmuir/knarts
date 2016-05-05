/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Rule3</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestScriptRule3#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptRule3()
 * @model extendedMetaData="name='TestScript.Rule3' kind='elementOnly'"
 * @generated
 */
public interface TestScriptRule3 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptParam3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each rule template can take one or more parameters for rule evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRule3_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptParam3> getParam();

} // TestScriptRule3