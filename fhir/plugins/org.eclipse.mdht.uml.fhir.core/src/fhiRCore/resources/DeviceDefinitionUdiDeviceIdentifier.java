/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Udi Device Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionUdiDeviceIdentifier()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceDefinition_UdiDeviceIdentifier'"
 * @generated
 */
public interface DeviceDefinitionUdiDeviceIdentifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Device Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Identifier</em>' containment reference.
	 * @see #setDeviceIdentifier(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionUdiDeviceIdentifier_DeviceIdentifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDeviceIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier#getDeviceIdentifier <em>Device Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Identifier</em>' containment reference.
	 * @see #getDeviceIdentifier()
	 * @generated
	 */
	void setDeviceIdentifier(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionUdiDeviceIdentifier_Issuer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getIssuer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Uri value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionUdiDeviceIdentifier_Jurisdiction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getJurisdiction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(Uri value);

} // DeviceDefinitionUdiDeviceIdentifier
