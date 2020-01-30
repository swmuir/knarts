/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ContractTermContractOffer;
import fhiRCore.resources.ContractTermContractOfferAnswer;
import fhiRCore.resources.ContractTermContractOfferContractParty;
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
 * An implementation of the model object '<em><b>Contract Term Contract Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getParties <em>Party</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getDecisionModes <em>Decision Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getAnswers <em>Answer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferImpl#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermContractOfferImpl extends BackboneElementImpl implements ContractTermContractOffer {
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
	 * The cached value of the '{@link #getParties() <em>Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParties()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermContractOfferContractParty> parties;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Reference topic;

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
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept decision;

	/**
	 * The cached value of the '{@link #getDecisionModes() <em>Decision Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionModes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> decisionModes;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermContractOfferAnswer> answers;

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
	 * The cached value of the '{@link #getLinkIds() <em>Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> linkIds;

	/**
	 * The cached value of the '{@link #getSecurityLabelNumbers() <em>Security Label Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> securityLabelNumbers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermContractOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTermContractOffer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermContractOfferContractParty> getParties() {
		if (parties == null) {
			parties = new EObjectContainmentEList<ContractTermContractOfferContractParty>(ContractTermContractOfferContractParty.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__PARTY);
		}
		return parties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(Reference newTopic, NotificationChain msgs) {
		Reference oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC, oldTopic, newTopic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(Reference newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC, null, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC, null, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC, newTopic, newTopic));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(CodeableConcept newDecision, NotificationChain msgs) {
		CodeableConcept oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION, oldDecision, newDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(CodeableConcept newDecision) {
		if (newDecision != decision) {
			NotificationChain msgs = null;
			if (decision != null)
				msgs = ((InternalEObject)decision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION, null, msgs);
			if (newDecision != null)
				msgs = ((InternalEObject)newDecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION, null, msgs);
			msgs = basicSetDecision(newDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION, newDecision, newDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getDecisionModes() {
		if (decisionModes == null) {
			decisionModes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION_MODE);
		}
		return decisionModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermContractOfferAnswer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<ContractTermContractOfferAnswer>(ContractTermContractOfferAnswer.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__ANSWER);
		}
		return answers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getLinkIds() {
		if (linkIds == null) {
			linkIds = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__LINK_ID);
		}
		return linkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getSecurityLabelNumbers() {
		if (securityLabelNumbers == null) {
			securityLabelNumbers = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__PARTY:
				return ((InternalEList<?>)getParties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC:
				return basicSetTopic(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION:
				return basicSetDecision(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION_MODE:
				return ((InternalEList<?>)getDecisionModes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__ANSWER:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT:
				return basicSetText(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__LINK_ID:
				return ((InternalEList<?>)getLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumbers()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__PARTY:
				return getParties();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC:
				return getTopic();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE:
				return getType();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION:
				return getDecision();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION_MODE:
				return getDecisionModes();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__ANSWER:
				return getAnswers();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT:
				return getText();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__LINK_ID:
				return getLinkIds();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumbers();
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__PARTY:
				getParties().clear();
				getParties().addAll((Collection<? extends ContractTermContractOfferContractParty>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC:
				setTopic((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION:
				setDecision((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION_MODE:
				getDecisionModes().clear();
				getDecisionModes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__ANSWER:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends ContractTermContractOfferAnswer>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT:
				setText((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__LINK_ID:
				getLinkIds().clear();
				getLinkIds().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
				getSecurityLabelNumbers().addAll((Collection<? extends UnsignedInt>)newValue);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__PARTY:
				getParties().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC:
				setTopic((Reference)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION:
				setDecision((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION_MODE:
				getDecisionModes().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__ANSWER:
				getAnswers().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT:
				setText((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__LINK_ID:
				getLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__PARTY:
				return parties != null && !parties.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TOPIC:
				return topic != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TYPE:
				return type != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION:
				return decision != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__DECISION_MODE:
				return decisionModes != null && !decisionModes.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__ANSWER:
				return answers != null && !answers.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__TEXT:
				return text != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__LINK_ID:
				return linkIds != null && !linkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				return securityLabelNumbers != null && !securityLabelNumbers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermContractOfferImpl
