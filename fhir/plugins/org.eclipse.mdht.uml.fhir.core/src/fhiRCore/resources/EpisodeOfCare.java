/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care</b></em>'.
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
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getStatusHistories <em>Status History</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getReferralRequests <em>Referral Request</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getCareManager <em>Care Manager</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getTeams <em>Team</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCare#getAccounts <em>Account</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare()
 * @model
 * @generated
 */
public interface EpisodeOfCare extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCare#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status History</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.EpisodeOfCareStatusHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status History</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_StatusHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<EpisodeOfCareStatusHistory> getStatusHistories();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.EpisodeOfCareDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Diagnosis()
	 * @model containment="true"
	 * @generated
	 */
	EList<EpisodeOfCareDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCare#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managing Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_ManagingOrganization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCare#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCare#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Referral Request</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referral Request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referral Request</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_ReferralRequest()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferralRequests();

	/**
	 * Returns the value of the '<em><b>Care Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Manager</em>' containment reference.
	 * @see #setCareManager(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_CareManager()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCareManager();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCare#getCareManager <em>Care Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Manager</em>' containment reference.
	 * @see #getCareManager()
	 * @generated
	 */
	void setCareManager(Reference value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Team()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getTeams();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCare_Account()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAccounts();

} // EpisodeOfCare
