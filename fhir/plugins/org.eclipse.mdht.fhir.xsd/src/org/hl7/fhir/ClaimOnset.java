/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Onset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimOnset#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimOnset#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimOnset#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimOnset()
 * @model extendedMetaData="name='Claim.Onset' kind='elementOnly'"
 * @generated
 */
public interface ClaimOnset extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Date</em>' containment reference.
	 * @see #setTimeDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getClaimOnset_TimeDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getTimeDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimOnset#getTimeDate <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date</em>' containment reference.
	 * @see #getTimeDate()
	 * @generated
	 */
	void setTimeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getClaimOnset_TimePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimOnset#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Onset typifications eg. Start of pregnancy, start of illnes, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimOnset_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimOnset#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

} // ClaimOnset
