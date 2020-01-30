/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Period;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event</b></em>'.
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
 *   <li>{@link fhiRCore.resources.AuditEvent#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getAction <em>Action</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getPurposeOfEvents <em>Purpose Of Event</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getAgents <em>Agent</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEvent#getEntities <em>Entity</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent()
 * @model
 * @generated
 */
public interface AuditEvent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEvent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Subtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getSubtypes();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Action()
	 * @model containment="true"
	 * @generated
	 */
	Code getAction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEvent#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEvent#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Recorded()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instant getRecorded();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEvent#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(Instant value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Outcome()
	 * @model containment="true"
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEvent#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Code value);

	/**
	 * Returns the value of the '<em><b>Outcome Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome Desc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Desc</em>' containment reference.
	 * @see #setOutcomeDesc(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_OutcomeDesc()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getOutcomeDesc();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEvent#getOutcomeDesc <em>Outcome Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome Desc</em>' containment reference.
	 * @see #getOutcomeDesc()
	 * @generated
	 */
	void setOutcomeDesc(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Purpose Of Event</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Of Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Of Event</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_PurposeOfEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPurposeOfEvents();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.AuditEventAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Agent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AuditEventAgent> getAgents();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(AuditEventSource)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AuditEventSource getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEvent#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AuditEventSource value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.AuditEventEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEvent_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuditEventEntity> getEntities();

} // AuditEvent
