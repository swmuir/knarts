/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContact#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContact#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductContact()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProduct_Contact'"
 * @generated
 */
public interface MedicinalProductContact extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductContact_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContact#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductContact_Contact()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getContact();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContact#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(Reference value);

} // MedicinalProductContact
