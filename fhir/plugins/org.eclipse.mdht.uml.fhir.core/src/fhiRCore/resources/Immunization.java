/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Immunization#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getReportOrigin <em>Report Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getSite <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getRoute <em>Route</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getIsSubpotent <em>Is Subpotent</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getSubpotentReasons <em>Subpotent Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getEducations <em>Education</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getProgramEligibilities <em>Program Eligibility</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getReactions <em>Reaction</em>}</li>
 *   <li>{@link fhiRCore.resources.Immunization#getProtocolApplieds <em>Protocol Applied</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImmunization()
 * @model
 * @generated
 */
public interface Immunization extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Vaccine Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccine Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccine Code</em>' containment reference.
	 * @see #setVaccineCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_VaccineCode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getVaccineCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getVaccineCode <em>Vaccine Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccine Code</em>' containment reference.
	 * @see #getVaccineCode()
	 * @generated
	 */
	void setVaccineCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Occurrencex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrencex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrencex</em>' containment reference.
	 * @see #setOccurrencex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Occurrencex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='occurrence[x]'"
	 * @generated
	 */
	DataType getOccurrencex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getOccurrencex <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrencex</em>' containment reference.
	 * @see #getOccurrencex()
	 * @generated
	 */
	void setOccurrencex(DataType value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Recorded()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getRecorded();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(DateTime value);

	/**
	 * Returns the value of the '<em><b>Primary Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Source</em>' containment reference.
	 * @see #setPrimarySource(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_PrimarySource()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getPrimarySource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getPrimarySource <em>Primary Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Source</em>' containment reference.
	 * @see #getPrimarySource()
	 * @generated
	 */
	void setPrimarySource(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Report Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Origin</em>' containment reference.
	 * @see #setReportOrigin(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_ReportOrigin()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getReportOrigin();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getReportOrigin <em>Report Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Origin</em>' containment reference.
	 * @see #getReportOrigin()
	 * @generated
	 */
	void setReportOrigin(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_LotNumber()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLotNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_ExpirationDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Site()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Route()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #setDoseQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_DoseQuantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getDoseQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getDoseQuantity <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #getDoseQuantity()
	 * @generated
	 */
	void setDoseQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImmunizationPerformer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Performer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImmunizationPerformer> getPerformers();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_ReasonCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCodes();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Is Subpotent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Subpotent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Subpotent</em>' containment reference.
	 * @see #setIsSubpotent(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_IsSubpotent()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsSubpotent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getIsSubpotent <em>Is Subpotent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subpotent</em>' containment reference.
	 * @see #getIsSubpotent()
	 * @generated
	 */
	void setIsSubpotent(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Subpotent Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpotent Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpotent Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_SubpotentReason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSubpotentReasons();

	/**
	 * Returns the value of the '<em><b>Education</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImmunizationEducation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Education</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Education()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImmunizationEducation> getEducations();

	/**
	 * Returns the value of the '<em><b>Program Eligibility</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Eligibility</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Eligibility</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_ProgramEligibility()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getProgramEligibilities();

	/**
	 * Returns the value of the '<em><b>Funding Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funding Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funding Source</em>' containment reference.
	 * @see #setFundingSource(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_FundingSource()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFundingSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Immunization#getFundingSource <em>Funding Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funding Source</em>' containment reference.
	 * @see #getFundingSource()
	 * @generated
	 */
	void setFundingSource(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImmunizationReaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_Reaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImmunizationReaction> getReactions();

	/**
	 * Returns the value of the '<em><b>Protocol Applied</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImmunizationProtocolApplied}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Applied</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Applied</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunization_ProtocolApplied()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImmunizationProtocolApplied> getProtocolApplieds();

} // Immunization
