/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataRequirement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.GuidanceResponse;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getModulex <em>Modulex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getEvaluationMessages <em>Evaluation Message</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getResult <em>Result</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GuidanceResponseImpl#getDataRequirements <em>Data Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseImpl extends DomainResourceImpl implements GuidanceResponse {
	/**
	 * The cached value of the '{@link #getRequestIdentifier() <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier requestIdentifier;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getModulex() <em>Modulex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulex()
	 * @generated
	 * @ordered
	 */
	protected DataType modulex;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReferences;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getEvaluationMessages() <em>Evaluation Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> evaluationMessages;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected Reference outputParameters;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Reference result;

	/**
	 * The cached value of the '{@link #getDataRequirements() <em>Data Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> dataRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGuidanceResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestIdentifier(Identifier newRequestIdentifier, NotificationChain msgs) {
		Identifier oldRequestIdentifier = requestIdentifier;
		requestIdentifier = newRequestIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, oldRequestIdentifier, newRequestIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestIdentifier(Identifier newRequestIdentifier) {
		if (newRequestIdentifier != requestIdentifier) {
			NotificationChain msgs = null;
			if (requestIdentifier != null)
				msgs = ((InternalEObject)requestIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, null, msgs);
			if (newRequestIdentifier != null)
				msgs = ((InternalEObject)newRequestIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, null, msgs);
			msgs = basicSetRequestIdentifier(newRequestIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, newRequestIdentifier, newRequestIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getModulex() {
		return modulex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModulex(DataType newModulex, NotificationChain msgs) {
		DataType oldModulex = modulex;
		modulex = newModulex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__MODULEX, oldModulex, newModulex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulex(DataType newModulex) {
		if (newModulex != modulex) {
			NotificationChain msgs = null;
			if (modulex != null)
				msgs = ((InternalEObject)modulex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__MODULEX, null, msgs);
			if (newModulex != null)
				msgs = ((InternalEObject)newModulex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__MODULEX, null, msgs);
			msgs = basicSetModulex(newModulex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__MODULEX, newModulex, newModulex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.GUIDANCE_RESPONSE__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.GUIDANCE_RESPONSE__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.GUIDANCE_RESPONSE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEvaluationMessages() {
		if (evaluationMessages == null) {
			evaluationMessages = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE);
		}
		return evaluationMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputParameters(Reference newOutputParameters, NotificationChain msgs) {
		Reference oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameters(Reference newOutputParameters) {
		if (newOutputParameters != outputParameters) {
			NotificationChain msgs = null;
			if (outputParameters != null)
				msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			if (newOutputParameters != null)
				msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			msgs = basicSetOutputParameters(newOutputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Reference newResult, NotificationChain msgs) {
		Reference oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Reference newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GUIDANCE_RESPONSE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getDataRequirements() {
		if (dataRequirements == null) {
			dataRequirements = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT);
		}
		return dataRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				return basicSetRequestIdentifier(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULEX:
				return basicSetModulex(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				return basicSetPerformer(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return ((InternalEList<?>)getEvaluationMessages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return basicSetOutputParameters(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				return basicSetResult(null, msgs);
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return ((InternalEList<?>)getDataRequirements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				return getRequestIdentifier();
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULEX:
				return getModulex();
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				return getStatus();
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				return getSubject();
			case ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				return getPerformer();
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				return getNotes();
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return getEvaluationMessages();
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return getOutputParameters();
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				return getResult();
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return getDataRequirements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULEX:
				setModulex((DataType)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessages().clear();
				getEvaluationMessages().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				setResult((Reference)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirements().clear();
				getDataRequirements().addAll((Collection<? extends DataRequirement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULEX:
				setModulex((DataType)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Reference)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessages().clear();
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				setResult((Reference)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				return requestIdentifier != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULEX:
				return modulex != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				return subject != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				return performer != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return evaluationMessages != null && !evaluationMessages.isEmpty();
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				return result != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return dataRequirements != null && !dataRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseImpl
