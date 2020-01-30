/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionMaterial#getSubstance <em>Substance</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionMaterial#getAlternate <em>Alternate</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionMaterial#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionMaterial()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceDefinition_Material'"
 * @generated
 */
public interface DeviceDefinitionMaterial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionMaterial_Substance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinitionMaterial#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Alternate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate</em>' containment reference.
	 * @see #setAlternate(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionMaterial_Alternate()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAlternate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinitionMaterial#getAlternate <em>Alternate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate</em>' containment reference.
	 * @see #getAlternate()
	 * @generated
	 */
	void setAlternate(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Allergenic Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allergenic Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #setAllergenicIndicator(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionMaterial_AllergenicIndicator()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAllergenicIndicator();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinitionMaterial#getAllergenicIndicator <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #getAllergenicIndicator()
	 * @generated
	 */
	void setAllergenicIndicator(fhiRCore.dataTypes.Boolean value);

} // DeviceDefinitionMaterial
