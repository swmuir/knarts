/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesTranslation#getNeedsMap <em>Needs Map</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesTranslation()
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
	 * @see #setNeedsMap(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesTranslation_NeedsMap()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getNeedsMap();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesTranslation#getNeedsMap <em>Needs Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Map</em>' containment reference.
	 * @see #getNeedsMap()
	 * @generated
	 */
	void setNeedsMap(fhiRCore.dataTypes.Boolean value);

} // TerminologyCapabilitiesTranslation
