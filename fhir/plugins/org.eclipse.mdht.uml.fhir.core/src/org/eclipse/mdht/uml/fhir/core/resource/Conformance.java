/**
 */
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getAcceptUnknown <em>Accept Unknown</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getFormats <em>Format</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getProfiles <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getRests <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getMessagings <em>Messaging</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getDocuments <em>Document</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance()
 * @model
 * @generated
 */
public interface Conformance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' reference.
	 * @see #setUrl(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Url()
	 * @model
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getUrl <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Version()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Name()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Status()
	 * @model
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experimental</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experimental</em>' reference.
	 * @see #setExperimental(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Experimental()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getExperimental <em>Experimental</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Publisher()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getPublisher();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceContact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConformanceContact> getContacts();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' reference.
	 * @see #setDate(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Date()
	 * @model required="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getDate <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference.
	 * @see #setRequirements(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Requirements()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getRequirements();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getRequirements <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' reference.
	 * @see #setCopyright(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Copyright()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getCopyright();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getCopyright <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Kind()
	 * @model required="true"
	 * @generated
	 */
	Code getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Code value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(ConformanceSoftware)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Software()
	 * @model containment="true"
	 * @generated
	 */
	ConformanceSoftware getSoftware();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(ConformanceSoftware value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(ConformanceImplementation)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	ConformanceImplementation getImplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(ConformanceImplementation value);

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fhir Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fhir Version</em>' reference.
	 * @see #setFhirVersion(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_FhirVersion()
	 * @model required="true"
	 * @generated
	 */
	Id getFhirVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getFhirVersion <em>Fhir Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Version</em>' reference.
	 * @see #getFhirVersion()
	 * @generated
	 */
	void setFhirVersion(Id value);

	/**
	 * Returns the value of the '<em><b>Accept Unknown</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Unknown</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Unknown</em>' reference.
	 * @see #setAcceptUnknown(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_AcceptUnknown()
	 * @model required="true"
	 * @generated
	 */
	Code getAcceptUnknown();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Conformance#getAcceptUnknown <em>Accept Unknown</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Unknown</em>' reference.
	 * @see #getAcceptUnknown()
	 * @generated
	 */
	void setAcceptUnknown(Code value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Format()
	 * @model required="true"
	 * @generated
	 */
	EList<Code> getFormats();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Profile()
	 * @model
	 * @generated
	 */
	EList<StructureDefinition> getProfiles();

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Rest()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConformanceRest> getRests();

	/**
	 * Returns the value of the '<em><b>Messaging</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceMessaging}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messaging</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messaging</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Messaging()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConformanceMessaging> getMessagings();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformance_Document()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConformanceDocument> getDocuments();

} // Conformance
