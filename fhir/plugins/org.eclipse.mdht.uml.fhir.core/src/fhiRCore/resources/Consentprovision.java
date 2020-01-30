/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Period;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consentprovision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.Consentprovision#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getActors <em>Actor</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getActions <em>Action</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getPurposes <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getClasses <em>Class</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getData <em>Data</em>}</li>
 *   <li>{@link fhiRCore.resources.Consentprovision#getProvisions <em>Provision</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consent_Provision'"
 * @generated
 */
public interface Consentprovision extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Type()
	 * @model containment="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consentprovision#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consentprovision#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConsentprovisionprovisionActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConsentprovisionprovisionActor> getActors();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getActions();

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_SecurityLabel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getSecurityLabels();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Purpose()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getPurposes();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getClasses();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCodes();

	/**
	 * Returns the value of the '<em><b>Data Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Period</em>' containment reference.
	 * @see #setDataPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_DataPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getDataPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consentprovision#getDataPeriod <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Period</em>' containment reference.
	 * @see #getDataPeriod()
	 * @generated
	 */
	void setDataPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConsentprovisionprovisionData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConsentprovisionprovisionData> getData();

	/**
	 * Returns the value of the '<em><b>Provision</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.Consentprovision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provision</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovision_Provision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Consentprovision> getProvisions();

} // Consentprovision
