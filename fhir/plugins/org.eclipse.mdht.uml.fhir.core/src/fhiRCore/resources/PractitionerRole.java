/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner Role</b></em>'.
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
 *   <li>{@link fhiRCore.resources.PractitionerRole#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getOrganization <em>Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getHealthcareServices <em>Healthcare Service</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getAvailableTimes <em>Available Time</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getNotAvailables <em>Not Available</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRole#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole()
 * @model
 * @generated
 */
public interface PractitionerRole extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Active()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRole#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRole#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practitioner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practitioner</em>' containment reference.
	 * @see #setPractitioner(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Practitioner()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPractitioner();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRole#getPractitioner <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner</em>' containment reference.
	 * @see #getPractitioner()
	 * @generated
	 */
	void setPractitioner(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Organization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRole#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCodes();

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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Specialty()
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getLocations();

	/**
	 * Returns the value of the '<em><b>Healthcare Service</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Healthcare Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Healthcare Service</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_HealthcareService()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getHealthcareServices();

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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Telecom()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getTelecoms();

	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PractitionerRoleAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_AvailableTime()
	 * @model containment="true"
	 * @generated
	 */
	EList<PractitionerRoleAvailableTime> getAvailableTimes();

	/**
	 * Returns the value of the '<em><b>Not Available</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PractitionerRoleNotAvailable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Available</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Available</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_NotAvailable()
	 * @model containment="true"
	 * @generated
	 */
	EList<PractitionerRoleNotAvailable> getNotAvailables();

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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_AvailabilityExceptions()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAvailabilityExceptions();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRole#getAvailabilityExceptions <em>Availability Exceptions</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRole_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEndpoints();

} // PractitionerRole
