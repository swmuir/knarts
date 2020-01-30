/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition Quantitative Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getCustomaryUnit <em>Customary Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getUnit <em>Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getDecimalPrecision <em>Decimal Precision</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQuantitativeDetails()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ObservationDefinition_QuantitativeDetails'"
 * @generated
 */
public interface ObservationDefinitionQuantitativeDetails extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Customary Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customary Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customary Unit</em>' containment reference.
	 * @see #setCustomaryUnit(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQuantitativeDetails_CustomaryUnit()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCustomaryUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getCustomaryUnit <em>Customary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customary Unit</em>' containment reference.
	 * @see #getCustomaryUnit()
	 * @generated
	 */
	void setCustomaryUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQuantitativeDetails_Unit()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' containment reference.
	 * @see #setConversionFactor(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQuantitativeDetails_ConversionFactor()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getConversionFactor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getConversionFactor <em>Conversion Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' containment reference.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Decimal Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Precision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Precision</em>' containment reference.
	 * @see #setDecimalPrecision(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQuantitativeDetails_DecimalPrecision()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getDecimalPrecision();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails#getDecimalPrecision <em>Decimal Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Precision</em>' containment reference.
	 * @see #getDecimalPrecision()
	 * @generated
	 */
	void setDecimalPrecision(fhiRCore.dataTypes.Integer value);

} // ObservationDefinitionQuantitativeDetails
