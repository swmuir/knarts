/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Indication Other Therapy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductIndicationOtherTherapy#getTherapyRelationshipType <em>Therapy Relationship Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIndicationOtherTherapy#getMedicationx <em>Medicationx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIndicationOtherTherapy()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductIndication_OtherTherapy'"
 * @generated
 */
public interface MedicinalProductIndicationOtherTherapy extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIndicationOtherTherapy_TherapyRelationshipType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getTherapyRelationshipType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIndicationOtherTherapy#getTherapyRelationshipType <em>Therapy Relationship Type</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIndicationOtherTherapy_Medicationx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medication[x]'"
	 * @generated
	 */
	DataType getMedicationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIndicationOtherTherapy#getMedicationx <em>Medicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' containment reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(DataType value);

} // MedicinalProductIndicationOtherTherapy
