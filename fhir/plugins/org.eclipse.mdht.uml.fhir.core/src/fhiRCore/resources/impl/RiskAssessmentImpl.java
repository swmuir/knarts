/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.RiskAssessment;
import fhiRCore.resources.RiskAssessmentPrediction;

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
 * An implementation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getPredictions <em>Prediction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getMitigation <em>Mitigation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskAssessmentImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentImpl extends DomainResourceImpl implements RiskAssessment {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected Reference basedOn;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Reference parent;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getOccurrencex() <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencex()
	 * @generated
	 * @ordered
	 */
	protected DataType occurrencex;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Reference condition;

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
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basis;

	/**
	 * The cached value of the '{@link #getPredictions() <em>Prediction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictions()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskAssessmentPrediction> predictions;

	/**
	 * The cached value of the '{@link #getMitigation() <em>Mitigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigation()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String mitigation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRiskAssessment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.RISK_ASSESSMENT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBasedOn() {
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasedOn(Reference newBasedOn, NotificationChain msgs) {
		Reference oldBasedOn = basedOn;
		basedOn = newBasedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__BASED_ON, oldBasedOn, newBasedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOn(Reference newBasedOn) {
		if (newBasedOn != basedOn) {
			NotificationChain msgs = null;
			if (basedOn != null)
				msgs = ((InternalEObject)basedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__BASED_ON, null, msgs);
			if (newBasedOn != null)
				msgs = ((InternalEObject)newBasedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__BASED_ON, null, msgs);
			msgs = basicSetBasedOn(newBasedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__BASED_ON, newBasedOn, newBasedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Reference newParent, NotificationChain msgs) {
		Reference oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Reference newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__PARENT, newParent, newParent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOccurrencex() {
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencex(DataType newOccurrencex, NotificationChain msgs) {
		DataType oldOccurrencex = occurrencex;
		occurrencex = newOccurrencex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX, oldOccurrencex, newOccurrencex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Reference newCondition, NotificationChain msgs) {
		Reference oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Reference newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__CONDITION, newCondition, newCondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__PERFORMER, oldPerformer, newPerformer);
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
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RISK_ASSESSMENT__REASON_CODE);
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
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.RISK_ASSESSMENT__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasis() {
		if (basis == null) {
			basis = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.RISK_ASSESSMENT__BASIS);
		}
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskAssessmentPrediction> getPredictions() {
		if (predictions == null) {
			predictions = new EObjectContainmentEList<RiskAssessmentPrediction>(RiskAssessmentPrediction.class, this, ResourcesPackage.RISK_ASSESSMENT__PREDICTION);
		}
		return predictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMitigation() {
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMitigation(fhiRCore.dataTypes.String newMitigation, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMitigation = mitigation;
		mitigation = newMitigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__MITIGATION, oldMitigation, newMitigation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMitigation(fhiRCore.dataTypes.String newMitigation) {
		if (newMitigation != mitigation) {
			NotificationChain msgs = null;
			if (mitigation != null)
				msgs = ((InternalEObject)mitigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__MITIGATION, null, msgs);
			if (newMitigation != null)
				msgs = ((InternalEObject)newMitigation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT__MITIGATION, null, msgs);
			msgs = basicSetMitigation(newMitigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT__MITIGATION, newMitigation, newMitigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.RISK_ASSESSMENT__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RISK_ASSESSMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__BASED_ON:
				return basicSetBasedOn(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__PARENT:
				return basicSetParent(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__METHOD:
				return basicSetMethod(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__PERFORMER:
				return basicSetPerformer(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__BASIS:
				return ((InternalEList<?>)getBasis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__PREDICTION:
				return ((InternalEList<?>)getPredictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__MITIGATION:
				return basicSetMitigation(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RISK_ASSESSMENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.RISK_ASSESSMENT__BASED_ON:
				return getBasedOn();
			case ResourcesPackage.RISK_ASSESSMENT__PARENT:
				return getParent();
			case ResourcesPackage.RISK_ASSESSMENT__STATUS:
				return getStatus();
			case ResourcesPackage.RISK_ASSESSMENT__METHOD:
				return getMethod();
			case ResourcesPackage.RISK_ASSESSMENT__CODE:
				return getCode();
			case ResourcesPackage.RISK_ASSESSMENT__SUBJECT:
				return getSubject();
			case ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.RISK_ASSESSMENT__CONDITION:
				return getCondition();
			case ResourcesPackage.RISK_ASSESSMENT__PERFORMER:
				return getPerformer();
			case ResourcesPackage.RISK_ASSESSMENT__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.RISK_ASSESSMENT__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.RISK_ASSESSMENT__BASIS:
				return getBasis();
			case ResourcesPackage.RISK_ASSESSMENT__PREDICTION:
				return getPredictions();
			case ResourcesPackage.RISK_ASSESSMENT__MITIGATION:
				return getMitigation();
			case ResourcesPackage.RISK_ASSESSMENT__NOTE:
				return getNotes();
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
			case ResourcesPackage.RISK_ASSESSMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__BASED_ON:
				setBasedOn((Reference)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__PARENT:
				setParent((Reference)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__CONDITION:
				setCondition((Reference)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__BASIS:
				getBasis().clear();
				getBasis().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__PREDICTION:
				getPredictions().clear();
				getPredictions().addAll((Collection<? extends RiskAssessmentPrediction>)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__MITIGATION:
				setMitigation((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.RISK_ASSESSMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.RISK_ASSESSMENT__BASED_ON:
				setBasedOn((Reference)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__PARENT:
				setParent((Reference)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__CONDITION:
				setCondition((Reference)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__PERFORMER:
				setPerformer((Reference)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.RISK_ASSESSMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.RISK_ASSESSMENT__BASIS:
				getBasis().clear();
				return;
			case ResourcesPackage.RISK_ASSESSMENT__PREDICTION:
				getPredictions().clear();
				return;
			case ResourcesPackage.RISK_ASSESSMENT__MITIGATION:
				setMitigation((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.RISK_ASSESSMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.RISK_ASSESSMENT__BASED_ON:
				return basedOn != null;
			case ResourcesPackage.RISK_ASSESSMENT__PARENT:
				return parent != null;
			case ResourcesPackage.RISK_ASSESSMENT__STATUS:
				return status != null;
			case ResourcesPackage.RISK_ASSESSMENT__METHOD:
				return method != null;
			case ResourcesPackage.RISK_ASSESSMENT__CODE:
				return code != null;
			case ResourcesPackage.RISK_ASSESSMENT__SUBJECT:
				return subject != null;
			case ResourcesPackage.RISK_ASSESSMENT__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.RISK_ASSESSMENT__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.RISK_ASSESSMENT__CONDITION:
				return condition != null;
			case ResourcesPackage.RISK_ASSESSMENT__PERFORMER:
				return performer != null;
			case ResourcesPackage.RISK_ASSESSMENT__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.RISK_ASSESSMENT__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.RISK_ASSESSMENT__BASIS:
				return basis != null && !basis.isEmpty();
			case ResourcesPackage.RISK_ASSESSMENT__PREDICTION:
				return predictions != null && !predictions.isEmpty();
			case ResourcesPackage.RISK_ASSESSMENT__MITIGATION:
				return mitigation != null;
			case ResourcesPackage.RISK_ASSESSMENT__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessmentImpl
