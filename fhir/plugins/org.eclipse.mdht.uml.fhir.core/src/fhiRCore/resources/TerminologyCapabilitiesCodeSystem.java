/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Code System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystem#getUri <em>Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystem#getVersions <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystem#getSubsumption <em>Subsumption</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TerminologyCapabilities_CodeSystem'"
 * @generated
 */
public interface TerminologyCapabilitiesCodeSystem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(CodeSystem)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystem_Uri()
	 * @model containment="true"
	 * @generated
	 */
	CodeSystem getUri();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystem#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(CodeSystem value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystem_Version()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyCapabilitiesCodeSystemVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Subsumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsumption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsumption</em>' containment reference.
	 * @see #setSubsumption(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystem_Subsumption()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getSubsumption();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystem#getSubsumption <em>Subsumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsumption</em>' containment reference.
	 * @see #getSubsumption()
	 * @generated
	 */
	void setSubsumption(fhiRCore.dataTypes.Boolean value);

} // TerminologyCapabilitiesCodeSystem
