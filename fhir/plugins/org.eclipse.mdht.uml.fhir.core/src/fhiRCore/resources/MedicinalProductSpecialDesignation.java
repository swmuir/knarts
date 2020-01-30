/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Special Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getIndicationx <em>Indicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProduct_SpecialDesignation'"
 * @generated
 */
public interface MedicinalProductSpecialDesignation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intended Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended Use</em>' containment reference.
	 * @see #setIntendedUse(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation_IntendedUse()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getIntendedUse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getIntendedUse <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Use</em>' containment reference.
	 * @see #getIntendedUse()
	 * @generated
	 */
	void setIntendedUse(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Indicationx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicationx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicationx</em>' containment reference.
	 * @see #setIndicationx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation_Indicationx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='indication[x]'"
	 * @generated
	 */
	DataType getIndicationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getIndicationx <em>Indicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicationx</em>' containment reference.
	 * @see #getIndicationx()
	 * @generated
	 */
	void setIndicationx(DataType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation_Status()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' containment reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductSpecialDesignation_Species()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductSpecialDesignation#getSpecies <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' containment reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

} // MedicinalProductSpecialDesignation
