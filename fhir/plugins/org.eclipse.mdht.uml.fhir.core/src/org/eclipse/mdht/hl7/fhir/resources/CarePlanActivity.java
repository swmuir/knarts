/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CarePlanActivity#getOutcomeCodeableConcepts <em>Outcome Codeable Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CarePlanActivity#getOutcomeReferences <em>Outcome Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CarePlanActivity#getProgresses <em>Progress</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CarePlanActivity#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CarePlanActivity#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCarePlanActivity()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CarePlan_Activity'"
 * @generated
 */
public interface CarePlanActivity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Outcome Codeable Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome Codeable Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Codeable Concept</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCarePlanActivity_OutcomeCodeableConcept()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getOutcomeCodeableConcepts();

	/**
	 * Returns the value of the '<em><b>Outcome Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Reference</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCarePlanActivity_OutcomeReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getOutcomeReferences();

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCarePlanActivity_Progress()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getProgresses();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCarePlanActivity_Reference()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CarePlanActivity#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(CarePlanActivityDetail)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCarePlanActivity_Detail()
	 * @model containment="true"
	 * @generated
	 */
	CarePlanActivityDetail getDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CarePlanActivity#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(CarePlanActivityDetail value);

} // CarePlanActivity
