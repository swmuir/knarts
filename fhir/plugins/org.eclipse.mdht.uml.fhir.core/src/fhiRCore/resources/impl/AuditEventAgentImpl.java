/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.AuditEventAgent;
import fhiRCore.resources.AuditEventAgentNetwork;
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
 * An implementation of the model object '<em><b>Audit Event Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getWho <em>Who</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getAltId <em>Alt Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getPolicies <em>Policy</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventAgentImpl#getPurposeOfUses <em>Purpose Of Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventAgentImpl extends BackboneElementImpl implements AuditEventAgent {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getRoles() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> roles;

	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Reference who;

	/**
	 * The cached value of the '{@link #getAltId() <em>Alt Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String altId;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean requestor;

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
	 * The cached value of the '{@link #getPolicies() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policies;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected Coding media;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected AuditEventAgentNetwork network;

	/**
	 * The cached value of the '{@link #getPurposeOfUses() <em>Purpose Of Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfUses()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> purposeOfUses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAuditEventAgent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.AUDIT_EVENT_AGENT__ROLE);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWho(Reference newWho, NotificationChain msgs) {
		Reference oldWho = who;
		who = newWho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__WHO, oldWho, newWho);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Reference newWho) {
		if (newWho != who) {
			NotificationChain msgs = null;
			if (who != null)
				msgs = ((InternalEObject)who).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__WHO, null, msgs);
			if (newWho != null)
				msgs = ((InternalEObject)newWho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__WHO, null, msgs);
			msgs = basicSetWho(newWho, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__WHO, newWho, newWho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getAltId() {
		return altId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltId(fhiRCore.dataTypes.String newAltId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldAltId = altId;
		altId = newAltId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID, oldAltId, newAltId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltId(fhiRCore.dataTypes.String newAltId) {
		if (newAltId != altId) {
			NotificationChain msgs = null;
			if (altId != null)
				msgs = ((InternalEObject)altId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID, null, msgs);
			if (newAltId != null)
				msgs = ((InternalEObject)newAltId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID, null, msgs);
			msgs = basicSetAltId(newAltId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID, newAltId, newAltId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestor(fhiRCore.dataTypes.Boolean newRequestor, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR, oldRequestor, newRequestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestor(fhiRCore.dataTypes.Boolean newRequestor) {
		if (newRequestor != requestor) {
			NotificationChain msgs = null;
			if (requestor != null)
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR, newRequestor, newRequestor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getPolicies() {
		if (policies == null) {
			policies = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.AUDIT_EVENT_AGENT__POLICY);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedia(Coding newMedia, NotificationChain msgs) {
		Coding oldMedia = media;
		media = newMedia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA, oldMedia, newMedia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(Coding newMedia) {
		if (newMedia != media) {
			NotificationChain msgs = null;
			if (media != null)
				msgs = ((InternalEObject)media).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA, null, msgs);
			if (newMedia != null)
				msgs = ((InternalEObject)newMedia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA, null, msgs);
			msgs = basicSetMedia(newMedia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA, newMedia, newMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetwork getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(AuditEventAgentNetwork newNetwork, NotificationChain msgs) {
		AuditEventAgentNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(AuditEventAgentNetwork newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPurposeOfUses() {
		if (purposeOfUses == null) {
			purposeOfUses = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE);
		}
		return purposeOfUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.AUDIT_EVENT_AGENT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__WHO:
				return basicSetWho(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				return basicSetAltId(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				return basicSetMedia(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				return basicSetNetwork(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				return ((InternalEList<?>)getPurposeOfUses()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__TYPE:
				return getType();
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				return getRoles();
			case ResourcesPackage.AUDIT_EVENT_AGENT__WHO:
				return getWho();
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				return getAltId();
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				return getName();
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				return getRequestor();
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				return getLocation();
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				return getPolicies();
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				return getMedia();
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				return getNetwork();
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				return getPurposeOfUses();
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				getRoles().clear();
				getRoles().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__WHO:
				setWho((Reference)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				setAltId((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				setRequestor((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				setMedia((Coding)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				setNetwork((AuditEventAgentNetwork)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				getPurposeOfUses().clear();
				getPurposeOfUses().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				getRoles().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__WHO:
				setWho((Reference)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				setAltId((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				setRequestor((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				getPolicies().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				setMedia((Coding)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				setNetwork((AuditEventAgentNetwork)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				getPurposeOfUses().clear();
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__TYPE:
				return type != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				return roles != null && !roles.isEmpty();
			case ResourcesPackage.AUDIT_EVENT_AGENT__WHO:
				return who != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				return altId != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				return name != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				return requestor != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				return location != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				return policies != null && !policies.isEmpty();
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				return media != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				return network != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				return purposeOfUses != null && !purposeOfUses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventAgentImpl
