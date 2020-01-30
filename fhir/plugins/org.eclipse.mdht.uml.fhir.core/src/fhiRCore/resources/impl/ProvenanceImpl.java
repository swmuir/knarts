/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Signature;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.Provenance;
import fhiRCore.resources.ProvenanceAgent;
import fhiRCore.resources.ProvenanceEntity;
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
 * An implementation of the model object '<em><b>Provenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getOccurredx <em>Occurredx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getPolicies <em>Policy</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getAgents <em>Agent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getEntities <em>Entity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ProvenanceImpl#getSignatures <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceImpl extends DomainResourceImpl implements Provenance {
	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> targets;

	/**
	 * The cached value of the '{@link #getOccurredx() <em>Occurredx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurredx()
	 * @generated
	 * @ordered
	 */
	protected DataType occurredx;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected Instant recorded;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policies;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasons;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept activity;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceAgent> agents;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceEntity> entities;

	/**
	 * The cached value of the '{@link #getSignatures() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getProvenance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PROVENANCE__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOccurredx() {
		return occurredx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurredx(DataType newOccurredx, NotificationChain msgs) {
		DataType oldOccurredx = occurredx;
		occurredx = newOccurredx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__OCCURREDX, oldOccurredx, newOccurredx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurredx(DataType newOccurredx) {
		if (newOccurredx != occurredx) {
			NotificationChain msgs = null;
			if (occurredx != null)
				msgs = ((InternalEObject)occurredx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__OCCURREDX, null, msgs);
			if (newOccurredx != null)
				msgs = ((InternalEObject)newOccurredx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__OCCURREDX, null, msgs);
			msgs = basicSetOccurredx(newOccurredx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__OCCURREDX, newOccurredx, newOccurredx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(Instant newRecorded, NotificationChain msgs) {
		Instant oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__RECORDED, oldRecorded, newRecorded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(Instant newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getPolicies() {
		if (policies == null) {
			policies = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.PROVENANCE__POLICY);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROVENANCE__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(CodeableConcept newActivity, NotificationChain msgs) {
		CodeableConcept oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(CodeableConcept newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROVENANCE__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceAgent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<ProvenanceAgent>(ProvenanceAgent.class, this, ResourcesPackage.PROVENANCE__AGENT);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<ProvenanceEntity>(ProvenanceEntity.class, this, ResourcesPackage.PROVENANCE__ENTITY);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentEList<Signature>(Signature.class, this, ResourcesPackage.PROVENANCE__SIGNATURE);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PROVENANCE__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROVENANCE__OCCURREDX:
				return basicSetOccurredx(null, msgs);
			case ResourcesPackage.PROVENANCE__RECORDED:
				return basicSetRecorded(null, msgs);
			case ResourcesPackage.PROVENANCE__POLICY:
				return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROVENANCE__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.PROVENANCE__REASON:
				return ((InternalEList<?>)getReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case ResourcesPackage.PROVENANCE__AGENT:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROVENANCE__ENTITY:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PROVENANCE__TARGET:
				return getTargets();
			case ResourcesPackage.PROVENANCE__OCCURREDX:
				return getOccurredx();
			case ResourcesPackage.PROVENANCE__RECORDED:
				return getRecorded();
			case ResourcesPackage.PROVENANCE__POLICY:
				return getPolicies();
			case ResourcesPackage.PROVENANCE__LOCATION:
				return getLocation();
			case ResourcesPackage.PROVENANCE__REASON:
				return getReasons();
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				return getActivity();
			case ResourcesPackage.PROVENANCE__AGENT:
				return getAgents();
			case ResourcesPackage.PROVENANCE__ENTITY:
				return getEntities();
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				return getSignatures();
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
			case ResourcesPackage.PROVENANCE__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__OCCURREDX:
				setOccurredx((DataType)newValue);
				return;
			case ResourcesPackage.PROVENANCE__RECORDED:
				setRecorded((Instant)newValue);
				return;
			case ResourcesPackage.PROVENANCE__POLICY:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.PROVENANCE__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				setActivity((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROVENANCE__AGENT:
				getAgents().clear();
				getAgents().addAll((Collection<? extends ProvenanceAgent>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__ENTITY:
				getEntities().clear();
				getEntities().addAll((Collection<? extends ProvenanceEntity>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
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
			case ResourcesPackage.PROVENANCE__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.PROVENANCE__OCCURREDX:
				setOccurredx((DataType)null);
				return;
			case ResourcesPackage.PROVENANCE__RECORDED:
				setRecorded((Instant)null);
				return;
			case ResourcesPackage.PROVENANCE__POLICY:
				getPolicies().clear();
				return;
			case ResourcesPackage.PROVENANCE__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.PROVENANCE__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				setActivity((CodeableConcept)null);
				return;
			case ResourcesPackage.PROVENANCE__AGENT:
				getAgents().clear();
				return;
			case ResourcesPackage.PROVENANCE__ENTITY:
				getEntities().clear();
				return;
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				getSignatures().clear();
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
			case ResourcesPackage.PROVENANCE__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.PROVENANCE__OCCURREDX:
				return occurredx != null;
			case ResourcesPackage.PROVENANCE__RECORDED:
				return recorded != null;
			case ResourcesPackage.PROVENANCE__POLICY:
				return policies != null && !policies.isEmpty();
			case ResourcesPackage.PROVENANCE__LOCATION:
				return location != null;
			case ResourcesPackage.PROVENANCE__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				return activity != null;
			case ResourcesPackage.PROVENANCE__AGENT:
				return agents != null && !agents.isEmpty();
			case ResourcesPackage.PROVENANCE__ENTITY:
				return entities != null && !entities.isEmpty();
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				return signatures != null && !signatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceImpl
