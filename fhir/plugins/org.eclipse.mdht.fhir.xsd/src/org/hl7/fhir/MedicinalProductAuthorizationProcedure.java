/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Authorization Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The regulatory authorization of a medicinal product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure()
 * @model extendedMetaData="name='MedicinalProductAuthorization.Procedure' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductAuthorizationProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for this procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Period value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductAuthorizationApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applcations submitted to obtain a marketing authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_Application()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='application' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductAuthorizationApplication> getApplication();

} // MedicinalProductAuthorizationProcedure
