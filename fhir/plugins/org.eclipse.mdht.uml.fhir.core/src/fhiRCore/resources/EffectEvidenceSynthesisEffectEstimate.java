/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Effect Estimate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getVariantState <em>Variant State</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getPrecisionEstimates <em>Precision Estimate</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimate()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EffectEvidenceSynthesis_EffectEstimate'"
 * @generated
 */
public interface EffectEvidenceSynthesisEffectEstimate extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimate_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimate_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimate_VariantState()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getVariantState();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getVariantState <em>Variant State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant State</em>' containment reference.
	 * @see #getVariantState()
	 * @generated
	 */
	void setVariantState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimate_Value()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #setUnitOfMeasure(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimate_UnitOfMeasure()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Precision Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Estimate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Estimate</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisEffectEstimate_PrecisionEstimate()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimate> getPrecisionEstimates();

} // EffectEvidenceSynthesisEffectEstimate
