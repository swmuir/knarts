/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Url;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Header Message Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageSource#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageSource#getSoftware <em>Software</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageSource#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageSource#getContact <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageSource#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageSource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MessageHeader_MessageSource'"
 * @generated
 */
public interface MessageHeaderMessageSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageSource_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageSource#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageSource_Software()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSoftware();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageSource#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageSource_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageSource#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(ContactPoint)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageSource_Contact()
	 * @model containment="true"
	 * @generated
	 */
	ContactPoint getContact();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageSource#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Url)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageSource_Endpoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Url getEndpoint();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageSource#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Url value);

} // MessageHeaderMessageSource
