/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PersonLink#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PersonLink#getAssurance <em>Assurance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPersonLink()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Person_Link'"
 * @generated
 */
public interface PersonLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPersonLink_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.PersonLink#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Assurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance</em>' containment reference.
	 * @see #setAssurance(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPersonLink_Assurance()
	 * @model containment="true"
	 * @generated
	 */
	Code getAssurance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.PersonLink#getAssurance <em>Assurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance</em>' containment reference.
	 * @see #getAssurance()
	 * @generated
	 */
	void setAssurance(Code value);

} // PersonLink
