/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occupational Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Patient’s or family member's work information.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OccupationalData#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getEmploymentStatus <em>Employment Status</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getRetirementStatus <em>Retirement Status</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getCombatZoneHazardousDuty <em>Combat Zone Hazardous Duty</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getUsualOccupation <em>Usual Occupation</em>}</li>
 *   <li>{@link org.hl7.fhir.OccupationalData#getPastOrPresentOccupation <em>Past Or Present Occupation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOccupationalData()
 * @model extendedMetaData="name='OccupationalData' kind='elementOnly'"
 * @generated
 */
public interface OccupationalData extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier assigned to the occupational data record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this {{title}}. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who the occupational data is collected about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Occupational Data author time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Occupational Data author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_Author()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthor();

	/**
	 * Returns the value of the '<em><b>Employment Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Employment status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Status</em>' containment reference.
	 * @see #setEmploymentStatus(OccupationalDataEmploymentStatus)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_EmploymentStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='employmentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	OccupationalDataEmploymentStatus getEmploymentStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getEmploymentStatus <em>Employment Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment Status</em>' containment reference.
	 * @see #getEmploymentStatus()
	 * @generated
	 */
	void setEmploymentStatus(OccupationalDataEmploymentStatus value);

	/**
	 * Returns the value of the '<em><b>Retirement Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retirement status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retirement Status</em>' containment reference.
	 * @see #setRetirementStatus(OccupationalDataRetirementStatus)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_RetirementStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='retirementStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	OccupationalDataRetirementStatus getRetirementStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getRetirementStatus <em>Retirement Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retirement Status</em>' containment reference.
	 * @see #getRetirementStatus()
	 * @generated
	 */
	void setRetirementStatus(OccupationalDataRetirementStatus value);

	/**
	 * Returns the value of the '<em><b>Combat Zone Hazardous Duty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.OccupationalDataCombatZoneHazardousDuty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Combat Zone Hazardous Duty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combat Zone Hazardous Duty</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_CombatZoneHazardousDuty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combatZoneHazardousDuty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OccupationalDataCombatZoneHazardousDuty> getCombatZoneHazardousDuty();

	/**
	 * Returns the value of the '<em><b>Usual Occupation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usual Occupation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usual Occupation</em>' containment reference.
	 * @see #setUsualOccupation(OccupationalDataUsualOccupation)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_UsualOccupation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usualOccupation' namespace='##targetNamespace'"
	 * @generated
	 */
	OccupationalDataUsualOccupation getUsualOccupation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getUsualOccupation <em>Usual Occupation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usual Occupation</em>' containment reference.
	 * @see #getUsualOccupation()
	 * @generated
	 */
	void setUsualOccupation(OccupationalDataUsualOccupation value);

	/**
	 * Returns the value of the '<em><b>Past Or Present Occupation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Past Or Present Occupation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Past Or Present Occupation</em>' containment reference.
	 * @see #setPastOrPresentOccupation(OccupationalDataPastOrPresentOccupation)
	 * @see org.hl7.fhir.FhirPackage#getOccupationalData_PastOrPresentOccupation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pastOrPresentOccupation' namespace='##targetNamespace'"
	 * @generated
	 */
	OccupationalDataPastOrPresentOccupation getPastOrPresentOccupation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OccupationalData#getPastOrPresentOccupation <em>Past Or Present Occupation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past Or Present Occupation</em>' containment reference.
	 * @see #getPastOrPresentOccupation()
	 * @generated
	 */
	void setPastOrPresentOccupation(OccupationalDataPastOrPresentOccupation value);

} // OccupationalData
