/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Base64Binary;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Udi Carrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DeviceUdiCarrier#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceUdiCarrier#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceUdiCarrier#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceUdiCarrier#getCarrierAidc <em>Carrier Aidc</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceUdiCarrier#getCarrierHrf <em>Carrier Hrf</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceUdiCarrier#getEntryType <em>Entry Type</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceUdiCarrier()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device_UdiCarrier'"
 * @generated
 */
public interface DeviceUdiCarrier extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceUdiCarrier_DeviceIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDeviceIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceUdiCarrier#getDeviceIdentifier <em>Device Identifier</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceUdiCarrier_Issuer()
	 * @model containment="true"
	 * @generated
	 */
	Uri getIssuer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceUdiCarrier#getIssuer <em>Issuer</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceUdiCarrier_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	Uri getJurisdiction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceUdiCarrier#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(Uri value);

	/**
	 * Returns the value of the '<em><b>Carrier Aidc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Aidc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Aidc</em>' containment reference.
	 * @see #setCarrierAidc(Base64Binary)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceUdiCarrier_CarrierAidc()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='carrierAIDC'"
	 * @generated
	 */
	Base64Binary getCarrierAidc();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceUdiCarrier#getCarrierAidc <em>Carrier Aidc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Aidc</em>' containment reference.
	 * @see #getCarrierAidc()
	 * @generated
	 */
	void setCarrierAidc(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Carrier Hrf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Hrf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Hrf</em>' containment reference.
	 * @see #setCarrierHrf(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceUdiCarrier_CarrierHrf()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='carrierHRF'"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCarrierHrf();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceUdiCarrier#getCarrierHrf <em>Carrier Hrf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Hrf</em>' containment reference.
	 * @see #getCarrierHrf()
	 * @generated
	 */
	void setCarrierHrf(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Type</em>' containment reference.
	 * @see #setEntryType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceUdiCarrier_EntryType()
	 * @model containment="true"
	 * @generated
	 */
	Code getEntryType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceUdiCarrier#getEntryType <em>Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Type</em>' containment reference.
	 * @see #getEntryType()
	 * @generated
	 */
	void setEntryType(Code value);

} // DeviceUdiCarrier
