/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.TerminologyCapabilitiesTranslation#getNeedsMap <em>Needs Map</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTerminologyCapabilitiesTranslation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TerminologyCapabilities_Translation'"
 * @generated
 */
public interface TerminologyCapabilitiesTranslation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Needs Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Map</em>' containment reference.
	 * @see #setNeedsMap(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getTerminologyCapabilitiesTranslation_NeedsMap()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getNeedsMap();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.TerminologyCapabilitiesTranslation#getNeedsMap <em>Needs Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Map</em>' containment reference.
	 * @see #getNeedsMap()
	 * @generated
	 */
	void setNeedsMap(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

} // TerminologyCapabilitiesTranslation
