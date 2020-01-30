/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Test Test Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptTestTestAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptTestTestAction#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptTestTestAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Test_TestAction'"
 * @generated
 */
public interface TestScriptTestTestAction extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptTestTestAction_Operation()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupSetupActionOperation getOperation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptTestTestAction#getOperation <em>Operation</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptTestTestAction_Assert()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupSetupActionAssert getAssert();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptTestTestAction#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(TestScriptSetupSetupActionAssert value);

} // TestScriptTestTestAction
