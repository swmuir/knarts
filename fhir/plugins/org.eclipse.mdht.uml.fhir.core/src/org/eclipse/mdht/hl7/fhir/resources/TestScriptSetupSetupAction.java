/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Setup Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupAction#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestScriptSetupSetupAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Setup_SetupAction'"
 * @generated
 */
public interface TestScriptSetupSetupAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestScriptSetupSetupActionOperation)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestScriptSetupSetupAction_Operation()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupSetupActionOperation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupAction#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestScriptSetupSetupActionOperation value);

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference.
	 * @see #setAssert(TestScriptSetupSetupActionAssert)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestScriptSetupSetupAction_Assert()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupSetupActionAssert getAssert();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TestScriptSetupSetupAction#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(TestScriptSetupSetupActionAssert value);

} // TestScriptSetupSetupAction
