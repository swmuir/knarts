/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Population;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Undesirable Effect</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getSymptomConditionEffect <em>Symptom Condition Effect</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getClassification <em>Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getPopulations <em>Population</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductUndesirableEffect()
 * @model
 * @generated
 */
public interface MedicinalProductUndesirableEffect extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductUndesirableEffect_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSubjects();

	/**
	 * Returns the value of the '<em><b>Symptom Condition Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symptom Condition Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptom Condition Effect</em>' containment reference.
	 * @see #setSymptomConditionEffect(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductUndesirableEffect_SymptomConditionEffect()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSymptomConditionEffect();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getSymptomConditionEffect <em>Symptom Condition Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symptom Condition Effect</em>' containment reference.
	 * @see #getSymptomConditionEffect()
	 * @generated
	 */
	void setSymptomConditionEffect(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductUndesirableEffect_Classification()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getClassification();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Frequency Of Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Of Occurrence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Of Occurrence</em>' containment reference.
	 * @see #setFrequencyOfOccurrence(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductUndesirableEffect_FrequencyOfOccurrence()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFrequencyOfOccurrence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductUndesirableEffect#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Of Occurrence</em>' containment reference.
	 * @see #getFrequencyOfOccurrence()
	 * @generated
	 */
	void setFrequencyOfOccurrence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Population}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductUndesirableEffect_Population()
	 * @model containment="true"
	 * @generated
	 */
	EList<Population> getPopulations();

} // MedicinalProductUndesirableEffect
