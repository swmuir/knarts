/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Contraindication Other Therapy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContraindicationOtherTherapy#getTherapyRelationshipType <em>Therapy Relationship Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContraindicationOtherTherapy#getMedicationx <em>Medicationx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductContraindicationOtherTherapy()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductContraindication_OtherTherapy'"
 * @generated
 */
public interface MedicinalProductContraindicationOtherTherapy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Therapy Relationship Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Therapy Relationship Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Therapy Relationship Type</em>' containment reference.
	 * @see #setTherapyRelationshipType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductContraindicationOtherTherapy_TherapyRelationshipType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getTherapyRelationshipType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContraindicationOtherTherapy#getTherapyRelationshipType <em>Therapy Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Therapy Relationship Type</em>' containment reference.
	 * @see #getTherapyRelationshipType()
	 * @generated
	 */
	void setTherapyRelationshipType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medicationx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicationx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicationx</em>' containment reference.
	 * @see #setMedicationx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductContraindicationOtherTherapy_Medicationx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medication[x]'"
	 * @generated
	 */
	DataType getMedicationx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContraindicationOtherTherapy#getMedicationx <em>Medicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' containment reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(DataType value);

} // MedicinalProductContraindicationOtherTherapy
