/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Teardown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptTeardown#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptTeardown()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestScript_Teardown'"
 * @generated
 */
public interface TestScriptTeardown extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TestScriptTeardownTeardownAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptTeardown_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TestScriptTeardownTeardownAction> getActions();

} // TestScriptTeardown
