/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Results By Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getExposureState <em>Exposure State</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getVariantState <em>Variant State</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisResultsByExposure()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EffectEvidenceSynthesis_ResultsByExposure'"
 * @generated
 */
public interface EffectEvidenceSynthesisResultsByExposure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisResultsByExposure_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Exposure State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure State</em>' containment reference.
	 * @see #setExposureState(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisResultsByExposure_ExposureState()
	 * @model containment="true"
	 * @generated
	 */
	Code getExposureState();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getExposureState <em>Exposure State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure State</em>' containment reference.
	 * @see #getExposureState()
	 * @generated
	 */
	void setExposureState(Code value);

	/**
	 * Returns the value of the '<em><b>Variant State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant State</em>' containment reference.
	 * @see #setVariantState(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisResultsByExposure_VariantState()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getVariantState();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getVariantState <em>Variant State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant State</em>' containment reference.
	 * @see #getVariantState()
	 * @generated
	 */
	void setVariantState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Risk Evidence Synthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Evidence Synthesis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Evidence Synthesis</em>' containment reference.
	 * @see #setRiskEvidenceSynthesis(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisResultsByExposure_RiskEvidenceSynthesis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getRiskEvidenceSynthesis();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Evidence Synthesis</em>' containment reference.
	 * @see #getRiskEvidenceSynthesis()
	 * @generated
	 */
	void setRiskEvidenceSynthesis(Reference value);

} // EffectEvidenceSynthesisResultsByExposure
