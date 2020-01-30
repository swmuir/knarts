/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.PatientCommunication#getLanguage <em>Language</em>}</li>
 *   <li>{@link fhiRCore.resources.PatientCommunication#getPreferred <em>Preferred</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPatientCommunication()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Patient_Communication'"
 * @generated
 */
public interface PatientCommunication extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getPatientCommunication_Language()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getLanguage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PatientCommunication#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred</em>' containment reference.
	 * @see #setPreferred(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getPatientCommunication_Preferred()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getPreferred();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PatientCommunication#getPreferred <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' containment reference.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(fhiRCore.dataTypes.Boolean value);

} // PatientCommunication
