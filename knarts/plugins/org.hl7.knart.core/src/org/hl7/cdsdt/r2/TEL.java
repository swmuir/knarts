/**
 */
package org.hl7.cdsdt.r2;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A locatable resource that is identified by a URI, such as a web page, a telephone number (voice, fax or some other resource mediated by telecommunication equipment), an e-mail address, or any other locatable resource that can be specified by a URL.
 * 
 * The address is specified as a Universal Resource Locator (URL) qualified by time specification and use codes that help in deciding which address to use for a given time and purpose.
 * 
 * The value attribute is constrained to be a uniform resource locator specified according to IETF RFCs 1738 and 2806 when used in this datatype. 
 * 
 * Note:  The intent of this datatype is to be a locator, not an identifier; this datatype is used to refer to a locatable resource using a URL, and knowing the URL allows one to locate the object. However some use cases have arisen where a URI is used to refer to a locatable resource. Though this datatype allows for URIs to be used, the resource identified SHOULD always be locatable. A common use of locatable URIs is to refer to SOAP attachments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.TEL#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.TEL#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.TEL#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getTEL()
 * @model extendedMetaData="name='TEL' kind='empty'"
 * @generated
 */
public interface TEL extends ANY {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more codes advising a system or user what telecommunication capabilities are known to be associated with the telecommunication address. 
	 * If populated, the values contained in this attribute SHALL be taken from the HL7 TelecommunicationCapability code system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute.
	 * @see #setCapabilities(List)
	 * @see org.hl7.cdsdt.r2.R2Package#getTEL_Capabilities()
	 * @model dataType="org.hl7.cdsdt.r2.SetTelecommunicationCapability" many="false"
	 *        extendedMetaData="kind='attribute' name='capabilities'"
	 * @generated
	 */
	List<TelecommunicationCapability> getCapabilities();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.TEL#getCapabilities <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' attribute.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(List<TelecommunicationCapability> value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more codes advising system or user which telecommunication address in a set of like addresses to select for a given telecommunication need. 
	 * The telecommunication use code is not a complete classification for equipment types or locations. Its main purpose is to suggest or discourage the use of a particular telecommunication address. There are no easily defined rules that govern the selection of a telecommunication address. Conformance statements may clarify what rules may apply or how additional rules are applied.
	 * If populated, the values contained in this attribute SHALL be taken from the HL7 TelecommunicationAddressUse code system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see #setUse(List)
	 * @see org.hl7.cdsdt.r2.R2Package#getTEL_Use()
	 * @model dataType="org.hl7.cdsdt.r2.SetTelecommunicationAddressUse" many="false"
	 *        extendedMetaData="kind='attribute' name='use'"
	 * @generated
	 */
	List<TelecommunicationAddressUse> getUse();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.TEL#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(List<TelecommunicationAddressUse> value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A uniform resource identifier specified according to IETF RFC 2396. 
	 * The URI specifies the protocol and the contact point defined by that protocol for the resource. 
	 * Examples:  Notable uses of the telecommunication address datatype are for telephone and telefax numbers, e-mail addresses, Hypertext references, FTP references, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getTEL_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.TEL#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TEL
