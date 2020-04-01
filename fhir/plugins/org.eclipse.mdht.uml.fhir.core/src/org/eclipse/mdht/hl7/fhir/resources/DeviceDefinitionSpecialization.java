/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionSpecialization#getSystemType <em>System Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionSpecialization#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getDeviceDefinitionSpecialization()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceDefinition_Specialization'"
 * @generated
 */
public interface DeviceDefinitionSpecialization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' containment reference.
	 * @see #setSystemType(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getDeviceDefinitionSpecialization_SystemType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getSystemType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionSpecialization#getSystemType <em>System Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' containment reference.
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getDeviceDefinitionSpecialization_Version()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionSpecialization#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // DeviceDefinitionSpecialization
