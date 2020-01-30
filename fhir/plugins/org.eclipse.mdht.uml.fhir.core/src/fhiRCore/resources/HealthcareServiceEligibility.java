/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcare Service Eligibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.HealthcareServiceEligibility#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareServiceEligibility#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getHealthcareServiceEligibility()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HealthcareService_Eligibility'"
 * @generated
 */
public interface HealthcareServiceEligibility extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareServiceEligibility_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareServiceEligibility#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareServiceEligibility_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareServiceEligibility#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Markdown value);

} // HealthcareServiceEligibility
