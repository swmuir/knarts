/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription Lens Specification Prism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VisionPrescriptionLensSpecificationPrism#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VisionPrescriptionLensSpecificationPrism#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVisionPrescriptionLensSpecificationPrism()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LensSpecification_Prism'"
 * @generated
 */
public interface VisionPrescriptionLensSpecificationPrism extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVisionPrescriptionLensSpecificationPrism_Amount()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Decimal getAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VisionPrescriptionLensSpecificationPrism#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Decimal value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVisionPrescriptionLensSpecificationPrism_Base()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getBase();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VisionPrescriptionLensSpecificationPrism#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Code value);

} // VisionPrescriptionLensSpecificationPrism
