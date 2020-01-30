/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Teardown Teardown Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptTeardownTeardownAction#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptTeardownTeardownAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Teardown_TeardownAction'"
 * @generated
 */
public interface TestScriptTeardownTeardownAction extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptTeardownTeardownAction_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TestScriptSetupSetupActionOperation getOperation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptTeardownTeardownAction#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestScriptSetupSetupActionOperation value);

} // TestScriptTeardownTeardownAction
