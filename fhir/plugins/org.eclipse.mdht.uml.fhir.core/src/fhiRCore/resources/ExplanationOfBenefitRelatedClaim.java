/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Related Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim#getClaim <em>Claim</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitRelatedClaim()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_RelatedClaim'"
 * @generated
 */
public interface ExplanationOfBenefitRelatedClaim extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitRelatedClaim_Claim()
	 * @model containment="true"
	 * @generated
	 */
	Reference getClaim();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Reference value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitRelatedClaim_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitRelatedClaim_Reference()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Identifier value);

} // ExplanationOfBenefitRelatedClaim
