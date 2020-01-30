/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Setup Setup Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestReportSetupSetupAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReportSetupSetupAction#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetupSetupAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Setup_SetupAction'"
 * @generated
 */
public interface TestReportSetupSetupAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestReportSetupSetupActionOperation)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetupSetupAction_Operation()
	 * @model containment="true"
	 * @generated
	 */
	TestReportSetupSetupActionOperation getOperation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReportSetupSetupAction#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestReportSetupSetupActionOperation value);

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference.
	 * @see #setAssert(TestReportSetupSetupActionAssert)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetupSetupAction_Assert()
	 * @model containment="true"
	 * @generated
	 */
	TestReportSetupSetupActionAssert getAssert();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReportSetupSetupAction#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(TestReportSetupSetupActionAssert value);

} // TestReportSetupSetupAction
