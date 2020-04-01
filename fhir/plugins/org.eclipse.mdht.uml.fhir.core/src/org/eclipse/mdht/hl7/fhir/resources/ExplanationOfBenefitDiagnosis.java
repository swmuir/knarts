/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getDiagnosisx <em>Diagnosisx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getOnAdmission <em>On Admission</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getPackageCode <em>Package Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitDiagnosis()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_Diagnosis'"
 * @generated
 */
public interface ExplanationOfBenefitDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitDiagnosis_Sequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Diagnosisx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosisx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosisx</em>' containment reference.
	 * @see #setDiagnosisx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitDiagnosis_Diagnosisx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='diagnosis[x]'"
	 * @generated
	 */
	DataType getDiagnosisx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getDiagnosisx <em>Diagnosisx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosisx</em>' containment reference.
	 * @see #getDiagnosisx()
	 * @generated
	 */
	void setDiagnosisx(DataType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitDiagnosis_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>On Admission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Admission</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Admission</em>' containment reference.
	 * @see #setOnAdmission(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitDiagnosis_OnAdmission()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOnAdmission();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getOnAdmission <em>On Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Admission</em>' containment reference.
	 * @see #getOnAdmission()
	 * @generated
	 */
	void setOnAdmission(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Package Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Code</em>' containment reference.
	 * @see #setPackageCode(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getExplanationOfBenefitDiagnosis_PackageCode()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPackageCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitDiagnosis#getPackageCode <em>Package Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Code</em>' containment reference.
	 * @see #getPackageCode()
	 * @generated
	 */
	void setPackageCode(CodeableConcept value);

} // ExplanationOfBenefitDiagnosis
