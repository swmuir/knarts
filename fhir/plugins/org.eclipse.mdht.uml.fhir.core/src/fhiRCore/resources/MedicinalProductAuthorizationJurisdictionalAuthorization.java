/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Authorization Jurisdictional Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getCountry <em>Country</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getValidityPeriod <em>Validity Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationJurisdictionalAuthorization()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductAuthorization_JurisdictionalAuthorization'"
 * @generated
 */
public interface MedicinalProductAuthorizationJurisdictionalAuthorization extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationJurisdictionalAuthorization_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationJurisdictionalAuthorization_Country()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCountry();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationJurisdictionalAuthorization_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdictions();

	/**
	 * Returns the value of the '<em><b>Legal Status Of Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal Status Of Supply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #setLegalStatusOfSupply(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationJurisdictionalAuthorization_LegalStatusOfSupply()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getLegalStatusOfSupply();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 */
	void setLegalStatusOfSupply(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationJurisdictionalAuthorization_ValidityPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

} // MedicinalProductAuthorizationJurisdictionalAuthorization
