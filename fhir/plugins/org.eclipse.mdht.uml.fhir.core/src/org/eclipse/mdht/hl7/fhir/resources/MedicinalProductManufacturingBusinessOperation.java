/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Manufacturing Business Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getAuthorisationReferenceNumber <em>Authorisation Reference Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getConfidentialityIndicator <em>Confidentiality Indicator</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getManufacturers <em>Manufacturer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getRegulator <em>Regulator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductManufacturingBusinessOperation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProduct_ManufacturingBusinessOperation'"
 * @generated
 */
public interface MedicinalProductManufacturingBusinessOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' containment reference.
	 * @see #setOperationType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductManufacturingBusinessOperation_OperationType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOperationType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getOperationType <em>Operation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' containment reference.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Authorisation Reference Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorisation Reference Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorisation Reference Number</em>' containment reference.
	 * @see #setAuthorisationReferenceNumber(Identifier)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductManufacturingBusinessOperation_AuthorisationReferenceNumber()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getAuthorisationReferenceNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getAuthorisationReferenceNumber <em>Authorisation Reference Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorisation Reference Number</em>' containment reference.
	 * @see #getAuthorisationReferenceNumber()
	 * @generated
	 */
	void setAuthorisationReferenceNumber(Identifier value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' containment reference.
	 * @see #setEffectiveDate(DateTime)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductManufacturingBusinessOperation_EffectiveDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getEffectiveDate <em>Effective Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' containment reference.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Confidentiality Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidentiality Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality Indicator</em>' containment reference.
	 * @see #setConfidentialityIndicator(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductManufacturingBusinessOperation_ConfidentialityIndicator()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getConfidentialityIndicator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getConfidentialityIndicator <em>Confidentiality Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality Indicator</em>' containment reference.
	 * @see #getConfidentialityIndicator()
	 * @generated
	 */
	void setConfidentialityIndicator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductManufacturingBusinessOperation_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getManufacturers();

	/**
	 * Returns the value of the '<em><b>Regulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulator</em>' containment reference.
	 * @see #setRegulator(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductManufacturingBusinessOperation_Regulator()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRegulator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation#getRegulator <em>Regulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulator</em>' containment reference.
	 * @see #getRegulator()
	 * @generated
	 */
	void setRegulator(Reference value);

} // MedicinalProductManufacturingBusinessOperation
