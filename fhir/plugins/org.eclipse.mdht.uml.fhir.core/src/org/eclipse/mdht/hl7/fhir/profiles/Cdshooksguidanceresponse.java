/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.resources.GuidanceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cdshooksguidanceresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Cdshooksguidanceresponse#getModuleUri <em>Module Uri</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getCdshooksguidanceresponse()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cdshooksguidanceresponse'"
 * @generated
 */
public interface Cdshooksguidanceresponse extends GuidanceResponse {
	/**
	 * Returns the value of the '<em><b>Module Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Uri</em>' containment reference.
	 * @see #setModuleUri(Uri)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getCdshooksguidanceresponse_ModuleUri()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getModuleUri();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Cdshooksguidanceresponse#getModuleUri <em>Module Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Uri</em>' containment reference.
	 * @see #getModuleUri()
	 * @generated
	 */
	void setModuleUri(Uri value);

} // Cdshooksguidanceresponse
