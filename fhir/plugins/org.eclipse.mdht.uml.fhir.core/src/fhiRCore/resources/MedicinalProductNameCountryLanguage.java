/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Name Country Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductNameCountryLanguage#getCountry <em>Country</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductNameCountryLanguage#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductNameCountryLanguage#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductNameCountryLanguage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Name_CountryLanguage'"
 * @generated
 */
public interface MedicinalProductNameCountryLanguage extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductNameCountryLanguage_Country()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCountry();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductNameCountryLanguage#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductNameCountryLanguage_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getJurisdiction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductNameCountryLanguage#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductNameCountryLanguage_Language()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getLanguage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductNameCountryLanguage#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CodeableConcept value);

} // MedicinalProductNameCountryLanguage
