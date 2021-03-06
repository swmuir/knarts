/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Closure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TerminologyCapabilitiesClosure#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTerminologyCapabilitiesClosure()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TerminologyCapabilities_Closure'"
 * @generated
 */
public interface TerminologyCapabilitiesClosure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTerminologyCapabilitiesClosure_Translation()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getTranslation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TerminologyCapabilitiesClosure#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

} // TerminologyCapabilitiesClosure
