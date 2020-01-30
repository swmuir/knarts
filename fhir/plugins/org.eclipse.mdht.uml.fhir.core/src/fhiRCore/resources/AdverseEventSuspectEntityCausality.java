/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Suspect Entity Causality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getProductRelatedness <em>Product Relatedness</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getAuthor <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality()
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
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_Assessment()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAssessment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getAssessment <em>Assessment</em>}' containment reference.
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
	 * @see #setProductRelatedness(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_ProductRelatedness()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getProductRelatedness();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getProductRelatedness <em>Product Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Relatedness</em>' containment reference.
	 * @see #getProductRelatedness()
	 * @generated
	 */
	void setProductRelatedness(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_Author()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getAuthor <em>Author</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEventSuspectEntityCausality_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEventSuspectEntityCausality#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

} // AdverseEventSuspectEntityCausality
