/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Setup Action Operation Request Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupActionOperationRequestHeader#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupActionOperationRequestHeader#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestScriptSetupSetupActionOperationRequestHeader()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Operation_RequestHeader'"
 * @generated
 */
public interface TestScriptSetupSetupActionOperationRequestHeader extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestScriptSetupSetupActionOperationRequestHeader_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getField();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupActionOperationRequestHeader#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestScriptSetupSetupActionOperationRequestHeader_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupActionOperationRequestHeader#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // TestScriptSetupSetupActionOperationRequestHeader
