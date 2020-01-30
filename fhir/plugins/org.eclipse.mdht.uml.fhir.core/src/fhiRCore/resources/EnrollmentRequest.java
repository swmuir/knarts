/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment Request</b></em>'.
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
 *   <li>{@link fhiRCore.resources.EnrollmentRequest#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.EnrollmentRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.EnrollmentRequest#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.EnrollmentRequest#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link fhiRCore.resources.EnrollmentRequest#getProvider <em>Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.EnrollmentRequest#getCandidate <em>Candidate</em>}</li>
 *   <li>{@link fhiRCore.resources.EnrollmentRequest#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest()
 * @model
 * @generated
 */
public interface EnrollmentRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EnrollmentRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest_Created()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EnrollmentRequest#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Insurer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurer</em>' containment reference.
	 * @see #setInsurer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest_Insurer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getInsurer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EnrollmentRequest#getInsurer <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' containment reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest_Provider()
	 * @model containment="true"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EnrollmentRequest#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Candidate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate</em>' containment reference.
	 * @see #setCandidate(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest_Candidate()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCandidate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EnrollmentRequest#getCandidate <em>Candidate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate</em>' containment reference.
	 * @see #getCandidate()
	 * @generated
	 */
	void setCandidate(Reference value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEnrollmentRequest_Coverage()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EnrollmentRequest#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

} // EnrollmentRequest
