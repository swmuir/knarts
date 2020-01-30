/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Name Official</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionNameOfficial()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Name_Official'"
 * @generated
 */
public interface SubstanceDefinitionNameOfficial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionNameOfficial_Authority()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAuthority();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(CodeableConcept value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionNameOfficial_Status()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getStatus <em>Status</em>}' containment reference.
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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionNameOfficial_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

} // SubstanceDefinitionNameOfficial
