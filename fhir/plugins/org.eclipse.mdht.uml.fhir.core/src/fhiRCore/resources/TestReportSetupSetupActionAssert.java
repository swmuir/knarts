/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Setup Setup Action Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestReportSetupSetupActionAssert#getResult <em>Result</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReportSetupSetupActionAssert#getMessage <em>Message</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReportSetupSetupActionAssert#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetupSetupActionAssert()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SetupAction_Assert'"
 * @generated
 */
public interface TestReportSetupSetupActionAssert extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetupSetupActionAssert_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getResult();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReportSetupSetupActionAssert#getResult <em>Result</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetupSetupActionAssert_Message()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getMessage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReportSetupSetupActionAssert#getMessage <em>Message</em>}' containment reference.
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
	 * @see #setDetail(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReportSetupSetupActionAssert_Detail()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDetail();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReportSetupSetupActionAssert#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(fhiRCore.dataTypes.String value);

} // TestReportSetupSetupActionAssert
