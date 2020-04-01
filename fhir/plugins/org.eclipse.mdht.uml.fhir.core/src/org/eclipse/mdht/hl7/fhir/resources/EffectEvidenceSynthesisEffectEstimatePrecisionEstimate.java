/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Effect Estimate Precision Estimate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimatePrecisionEstimate()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EffectEstimate_PrecisionEstimate'"
 * @generated
 */
public interface EffectEvidenceSynthesisEffectEstimatePrecisionEstimate extends BackboneElement {
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimatePrecisionEstimate_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference.
	 * @see #setLevel(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimatePrecisionEstimate_Level()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getLevel <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' containment reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Decimal value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimatePrecisionEstimate_From()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Decimal value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimatePrecisionEstimate_To()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Decimal value);

} // EffectEvidenceSynthesisEffectEstimatePrecisionEstimate
