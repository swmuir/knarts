/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription</b></em>'.
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
 *   <li>{@link fhiRCore.resources.VisionPrescription#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescription#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescription#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescription#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescription#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescription#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescription#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescription#getLensSpecifications <em>Lens Specification</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription()
 * @model
 * @generated
 */
public interface VisionPrescription extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescription#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_Created()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescription#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescription#getPatient <em>Patient</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescription#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Written</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Written</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Written</em>' containment reference.
	 * @see #setDateWritten(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_DateWritten()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getDateWritten();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescription#getDateWritten <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Written</em>' containment reference.
	 * @see #getDateWritten()
	 * @generated
	 */
	void setDateWritten(DateTime value);

	/**
	 * Returns the value of the '<em><b>Prescriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber</em>' containment reference.
	 * @see #setPrescriber(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_Prescriber()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPrescriber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescription#getPrescriber <em>Prescriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriber</em>' containment reference.
	 * @see #getPrescriber()
	 * @generated
	 */
	void setPrescriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Lens Specification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.VisionPrescriptionLensSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lens Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lens Specification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescription_LensSpecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VisionPrescriptionLensSpecification> getLensSpecifications();

} // VisionPrescription
