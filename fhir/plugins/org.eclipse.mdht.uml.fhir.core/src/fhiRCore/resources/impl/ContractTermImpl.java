/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ContractTerm;
import fhiRCore.resources.ContractTermAction;
import fhiRCore.resources.ContractTermContractAsset;
import fhiRCore.resources.ContractTermContractOffer;
import fhiRCore.resources.ContractTermSecurityLabel;
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
 * An implementation of the model object '<em><b>Contract Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getTopicx <em>Topicx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getOffer <em>Offer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getAssets <em>Asset</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getActions <em>Action</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermImpl#getGroups <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermImpl extends BackboneElementImpl implements ContractTerm {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Period applies;

	/**
	 * The cached value of the '{@link #getTopicx() <em>Topicx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicx()
	 * @generated
	 * @ordered
	 */
	protected DataType topicx;

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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subType;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getSecurityLabels() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermSecurityLabel> securityLabels;

	/**
	 * The cached value of the '{@link #getOffer() <em>Offer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected ContractTermContractOffer offer;

	/**
	 * The cached value of the '{@link #getAssets() <em>Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermContractAsset> assets;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermAction> actions;

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTerm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateTime newIssued, NotificationChain msgs) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(DateTime newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplies(Period newApplies, NotificationChain msgs) {
		Period oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__APPLIES, oldApplies, newApplies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplies(Period newApplies) {
		if (newApplies != applies) {
			NotificationChain msgs = null;
			if (applies != null)
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__APPLIES, newApplies, newApplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTopicx() {
		return topicx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicx(DataType newTopicx, NotificationChain msgs) {
		DataType oldTopicx = topicx;
		topicx = newTopicx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__TOPICX, oldTopicx, newTopicx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicx(DataType newTopicx) {
		if (newTopicx != topicx) {
			NotificationChain msgs = null;
			if (topicx != null)
				msgs = ((InternalEObject)topicx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__TOPICX, null, msgs);
			if (newTopicx != null)
				msgs = ((InternalEObject)newTopicx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__TOPICX, null, msgs);
			msgs = basicSetTopicx(newTopicx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__TOPICX, newTopicx, newTopicx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubType(CodeableConcept newSubType, NotificationChain msgs) {
		CodeableConcept oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__SUB_TYPE, oldSubType, newSubType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(CodeableConcept newSubType) {
		if (newSubType != subType) {
			NotificationChain msgs = null;
			if (subType != null)
				msgs = ((InternalEObject)subType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__SUB_TYPE, null, msgs);
			if (newSubType != null)
				msgs = ((InternalEObject)newSubType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__SUB_TYPE, null, msgs);
			msgs = basicSetSubType(newSubType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__SUB_TYPE, newSubType, newSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(fhiRCore.dataTypes.String newText, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(fhiRCore.dataTypes.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermSecurityLabel> getSecurityLabels() {
		if (securityLabels == null) {
			securityLabels = new EObjectContainmentEList<ContractTermSecurityLabel>(ContractTermSecurityLabel.class, this, ResourcesPackage.CONTRACT_TERM__SECURITY_LABEL);
		}
		return securityLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermContractOffer getOffer() {
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffer(ContractTermContractOffer newOffer, NotificationChain msgs) {
		ContractTermContractOffer oldOffer = offer;
		offer = newOffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__OFFER, oldOffer, newOffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffer(ContractTermContractOffer newOffer) {
		if (newOffer != offer) {
			NotificationChain msgs = null;
			if (offer != null)
				msgs = ((InternalEObject)offer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__OFFER, null, msgs);
			if (newOffer != null)
				msgs = ((InternalEObject)newOffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM__OFFER, null, msgs);
			msgs = basicSetOffer(newOffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM__OFFER, newOffer, newOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermContractAsset> getAssets() {
		if (assets == null) {
			assets = new EObjectContainmentEList<ContractTermContractAsset>(ContractTermContractAsset.class, this, ResourcesPackage.CONTRACT_TERM__ASSET);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ContractTermAction>(ContractTermAction.class, this, ResourcesPackage.CONTRACT_TERM__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTerm> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, ResourcesPackage.CONTRACT_TERM__GROUP);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__ISSUED:
				return basicSetIssued(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__APPLIES:
				return basicSetApplies(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__TOPICX:
				return basicSetTopicx(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__SUB_TYPE:
				return basicSetSubType(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__TEXT:
				return basicSetText(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabels()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM__OFFER:
				return basicSetOffer(null, msgs);
			case ResourcesPackage.CONTRACT_TERM__ASSET:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM__GROUP:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT_TERM__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.CONTRACT_TERM__ISSUED:
				return getIssued();
			case ResourcesPackage.CONTRACT_TERM__APPLIES:
				return getApplies();
			case ResourcesPackage.CONTRACT_TERM__TOPICX:
				return getTopicx();
			case ResourcesPackage.CONTRACT_TERM__TYPE:
				return getType();
			case ResourcesPackage.CONTRACT_TERM__SUB_TYPE:
				return getSubType();
			case ResourcesPackage.CONTRACT_TERM__TEXT:
				return getText();
			case ResourcesPackage.CONTRACT_TERM__SECURITY_LABEL:
				return getSecurityLabels();
			case ResourcesPackage.CONTRACT_TERM__OFFER:
				return getOffer();
			case ResourcesPackage.CONTRACT_TERM__ASSET:
				return getAssets();
			case ResourcesPackage.CONTRACT_TERM__ACTION:
				return getActions();
			case ResourcesPackage.CONTRACT_TERM__GROUP:
				return getGroups();
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
			case ResourcesPackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__TOPICX:
				setTopicx((DataType)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__TEXT:
				setText((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__SECURITY_LABEL:
				getSecurityLabels().clear();
				getSecurityLabels().addAll((Collection<? extends ContractTermSecurityLabel>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__OFFER:
				setOffer((ContractTermContractOffer)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__ASSET:
				getAssets().clear();
				getAssets().addAll((Collection<? extends ContractTermContractAsset>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends ContractTermAction>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM__GROUP:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ContractTerm>)newValue);
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
			case ResourcesPackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__TOPICX:
				setTopicx((DataType)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__TEXT:
				setText((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__SECURITY_LABEL:
				getSecurityLabels().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM__OFFER:
				setOffer((ContractTermContractOffer)null);
				return;
			case ResourcesPackage.CONTRACT_TERM__ASSET:
				getAssets().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM__ACTION:
				getActions().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM__GROUP:
				getGroups().clear();
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
			case ResourcesPackage.CONTRACT_TERM__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.CONTRACT_TERM__ISSUED:
				return issued != null;
			case ResourcesPackage.CONTRACT_TERM__APPLIES:
				return applies != null;
			case ResourcesPackage.CONTRACT_TERM__TOPICX:
				return topicx != null;
			case ResourcesPackage.CONTRACT_TERM__TYPE:
				return type != null;
			case ResourcesPackage.CONTRACT_TERM__SUB_TYPE:
				return subType != null;
			case ResourcesPackage.CONTRACT_TERM__TEXT:
				return text != null;
			case ResourcesPackage.CONTRACT_TERM__SECURITY_LABEL:
				return securityLabels != null && !securityLabels.isEmpty();
			case ResourcesPackage.CONTRACT_TERM__OFFER:
				return offer != null;
			case ResourcesPackage.CONTRACT_TERM__ASSET:
				return assets != null && !assets.isEmpty();
			case ResourcesPackage.CONTRACT_TERM__ACTION:
				return actions != null && !actions.isEmpty();
			case ResourcesPackage.CONTRACT_TERM__GROUP:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermImpl
