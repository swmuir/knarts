/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Suspect Entity Causality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getProductRelatedness <em>Product Relatedness</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SuspectEntity_Causality'"
 * @generated
 */
public interface AdverseEventSuspectEntityCausality extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' containment reference.
	 * @see #setAssessment(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_Assessment()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAssessment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getAssessment <em>Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' containment reference.
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Relatedness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Relatedness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Relatedness</em>' containment reference.
	 * @see #setProductRelatedness(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_ProductRelatedness()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getProductRelatedness();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getProductRelatedness <em>Product Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Relatedness</em>' containment reference.
	 * @see #getProductRelatedness()
	 * @generated
	 */
	void setProductRelatedness(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_Author()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

} // AdverseEventSuspectEntityCausality
