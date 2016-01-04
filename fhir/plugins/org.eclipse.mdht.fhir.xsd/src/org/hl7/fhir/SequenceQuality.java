/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variation and Sequence data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getPlatform <em>Platform</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceQuality()
 * @model extendedMetaData="name='Sequence.Quality' kind='elementOnly'"
 * @generated
 */
public interface SequenceQuality extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0-based start position (inclusive) of the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0-based end position (exclusive) of the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quality score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Score()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Quantity value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Platform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Platform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='platform' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPlatform();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(CodeableConcept value);

} // SequenceQuality
