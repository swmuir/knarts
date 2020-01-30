/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestReportSetup#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetup()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestReport_Setup'"
 * @generated
 */
public interface TestReportSetup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TestReportSetupSetupAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetup_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TestReportSetupSetupAction> getActions();

} // TestReportSetup
