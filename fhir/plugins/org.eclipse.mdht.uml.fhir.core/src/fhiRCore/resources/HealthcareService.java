/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcare Service</b></em>'.
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
 *   <li>{@link fhiRCore.resources.HealthcareService#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getExtraDetails <em>Extra Details</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getPhoto <em>Photo</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getCoverageAreas <em>Coverage Area</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getServiceProvisionCodes <em>Service Provision Code</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getEligibilities <em>Eligibility</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getPrograms <em>Program</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getCharacteristics <em>Characteristic</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getCommunications <em>Communication</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getReferralMethods <em>Referral Method</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getAppointmentRequired <em>Appointment Required</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getAvailableTimes <em>Available Time</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getNotAvailables <em>Not Available</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareService#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService()
 * @model
 * @generated
 */
public interface HealthcareService extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Active()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By</em>' containment reference.
	 * @see #setProvidedBy(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_ProvidedBy()
	 * @model containment="true"
	 * @generated
	 */
	Reference getProvidedBy();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getProvidedBy <em>Provided By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided By</em>' containment reference.
	 * @see #getProvidedBy()
	 * @generated
	 */
	void setProvidedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Specialty()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialties();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getLocations();

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
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Extra Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Details</em>' containment reference.
	 * @see #setExtraDetails(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_ExtraDetails()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getExtraDetails();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getExtraDetails <em>Extra Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Details</em>' containment reference.
	 * @see #getExtraDetails()
	 * @generated
	 */
	void setExtraDetails(Markdown value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference.
	 * @see #setPhoto(Attachment)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Photo()
	 * @model containment="true"
	 * @generated
	 */
	Attachment getPhoto();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getPhoto <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' containment reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Attachment value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Telecom()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getTelecoms();

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_CoverageArea()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getCoverageAreas();

	/**
	 * Returns the value of the '<em><b>Service Provision Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provision Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provision Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_ServiceProvisionCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServiceProvisionCodes();

	/**
	 * Returns the value of the '<em><b>Eligibility</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.HealthcareServiceEligibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eligibility</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligibility</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Eligibility()
	 * @model containment="true"
	 * @generated
	 */
	EList<HealthcareServiceEligibility> getEligibilities();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Program()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPrograms();

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Characteristic()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCommunications();

	/**
	 * Returns the value of the '<em><b>Referral Method</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referral Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referral Method</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_ReferralMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReferralMethods();

	/**
	 * Returns the value of the '<em><b>Appointment Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment Required</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Required</em>' containment reference.
	 * @see #setAppointmentRequired(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_AppointmentRequired()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAppointmentRequired();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getAppointmentRequired <em>Appointment Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Required</em>' containment reference.
	 * @see #getAppointmentRequired()
	 * @generated
	 */
	void setAppointmentRequired(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.HealthcareServiceAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_AvailableTime()
	 * @model containment="true"
	 * @generated
	 */
	EList<HealthcareServiceAvailableTime> getAvailableTimes();

	/**
	 * Returns the value of the '<em><b>Not Available</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.HealthcareServiceNotAvailable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Available</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Available</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_NotAvailable()
	 * @model containment="true"
	 * @generated
	 */
	EList<HealthcareServiceNotAvailable> getNotAvailables();

	/**
	 * Returns the value of the '<em><b>Availability Exceptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability Exceptions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #setAvailabilityExceptions(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_AvailabilityExceptions()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAvailabilityExceptions();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareService#getAvailabilityExceptions <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #getAvailabilityExceptions()
	 * @generated
	 */
	void setAvailabilityExceptions(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareService_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEndpoints();

} // HealthcareService
