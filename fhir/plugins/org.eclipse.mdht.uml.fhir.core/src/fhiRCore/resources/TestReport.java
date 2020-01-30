/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestReport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getResult <em>Result</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getScore <em>Score</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getTester <em>Tester</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getIssued <em>Issued</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getParticipants <em>Participant</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getSetup <em>Setup</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getTests <em>Test</em>}</li>
 *   <li>{@link fhiRCore.resources.TestReport#getTeardown <em>Teardown</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestReport()
 * @model
 * @generated
 */
public interface TestReport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_TestScript()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getTestScript();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getTestScript <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Script</em>' containment reference.
	 * @see #getTestScript()
	 * @generated
	 */
	void setTestScript(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getResult();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Code value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Score()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getScore();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Decimal value);

	/**
	 * Returns the value of the '<em><b>Tester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tester</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tester</em>' containment reference.
	 * @see #setTester(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Tester()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTester();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getTester <em>Tester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tester</em>' containment reference.
	 * @see #getTester()
	 * @generated
	 */
	void setTester(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Issued()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateTime value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TestReportParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestReportParticipant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference.
	 * @see #setSetup(TestReportSetup)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Setup()
	 * @model containment="true"
	 * @generated
	 */
	TestReportSetup getSetup();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getSetup <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' containment reference.
	 * @see #getSetup()
	 * @generated
	 */
	void setSetup(TestReportSetup value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TestReportTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Test()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestReportTest> getTests();

	/**
	 * Returns the value of the '<em><b>Teardown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teardown</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teardown</em>' containment reference.
	 * @see #setTeardown(TestReportTeardown)
	 * @see fhiRCore.resources.ResourcesPackage#getTestReport_Teardown()
	 * @model containment="true"
	 * @generated
	 */
	TestReportTeardown getTeardown();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestReport#getTeardown <em>Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teardown</em>' containment reference.
	 * @see #getTeardown()
	 * @generated
	 */
	void setTeardown(TestReportTeardown value);

} // TestReport
