/**
 */
package org.eclipse.mdht.uml.fhir;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.types.CodeableConcept;
import org.eclipse.mdht.uml.fhir.types.ContactDetail;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformace Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#isExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource()
 * @model abstract="true"
 * @generated
 */
public interface ConformanceResource extends Element {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Uri()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Version()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Status()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experimental</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experimental</em>' attribute.
	 * @see #setExperimental(boolean)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Experimental()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isExperimental();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#isExperimental <em>Experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' attribute.
	 * @see #isExperimental()
	 * @generated
	 */
	void setExperimental(boolean value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Publisher()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.types.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Contact()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ContactDetail> getContacts();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Date()
	 * @model ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.types.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_UseContext()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CodeableConcept> getUseContexts();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getConformanceResource_Copyright()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

} // ConformanceResource
