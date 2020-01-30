/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Signature;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Provenance#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getOccurredx <em>Occurredx</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getPolicies <em>Policy</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getActivity <em>Activity</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getAgents <em>Agent</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getEntities <em>Entity</em>}</li>
 *   <li>{@link fhiRCore.resources.Provenance#getSignatures <em>Signature</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getProvenance()
 * @model
 * @generated
 */
public interface Provenance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reference> getTargets();

	/**
	 * Returns the value of the '<em><b>Occurredx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurredx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurredx</em>' containment reference.
	 * @see #setOccurredx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Occurredx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='occurred[x]'"
	 * @generated
	 */
	DataType getOccurredx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Provenance#getOccurredx <em>Occurredx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurredx</em>' containment reference.
	 * @see #getOccurredx()
	 * @generated
	 */
	void setOccurredx(DataType value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Recorded()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instant getRecorded();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Provenance#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(Instant value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Policy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getPolicies();

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
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Provenance#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Reason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasons();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Activity()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getActivity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Provenance#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ProvenanceAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Agent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProvenanceAgent> getAgents();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ProvenanceEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvenanceEntity> getEntities();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getProvenance_Signature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // Provenance
