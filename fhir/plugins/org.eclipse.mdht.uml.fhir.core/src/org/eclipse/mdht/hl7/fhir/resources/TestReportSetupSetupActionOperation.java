/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Setup Setup Action Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionOperation#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionOperation#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionOperation#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestReportSetupSetupActionOperation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SetupAction_Operation'"
 * @generated
 */
public interface TestReportSetupSetupActionOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestReportSetupSetupActionOperation_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionOperation#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Code value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Markdown)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestReportSetupSetupActionOperation_Message()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionOperation#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Markdown value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(Uri)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTestReportSetupSetupActionOperation_Detail()
	 * @model containment="true"
	 * @generated
	 */
	Uri getDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionOperation#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Uri value);

} // TestReportSetupSetupActionOperation
