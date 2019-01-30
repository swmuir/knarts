/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getContentDerivative <em>Content Derivative</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSigner <em>Signer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getFriendly <em>Friendly</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegal <em>Legal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegallyBindingAttachment <em>Legally Binding Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegallyBindingReference <em>Legally Binding Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends DomainResourceImpl implements Contract {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ContractResourceStatusCodes status;

	/**
	 * The cached value of the '{@link #getContentDerivative() <em>Content Derivative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDerivative()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept contentDerivative;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authority;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> domain;

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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subType;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> term;

	/**
	 * The cached value of the '{@link #getSigner() <em>Signer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigner()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractSigner> signer;

	/**
	 * The cached value of the '{@link #getFriendly() <em>Friendly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendly()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractFriendly> friendly;

	/**
	 * The cached value of the '{@link #getLegal() <em>Legal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegal()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractLegal> legal;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected ContractRule rule;

	/**
	 * The cached value of the '{@link #getLegallyBindingAttachment() <em>Legally Binding Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegallyBindingAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment legallyBindingAttachment;

	/**
	 * The cached value of the '{@link #getLegallyBindingReference() <em>Legally Binding Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegallyBindingReference()
	 * @generated
	 * @ordered
	 */
	protected Reference legallyBindingReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContract();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ContractResourceStatusCodes newStatus, NotificationChain msgs) {
		ContractResourceStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ContractResourceStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getContentDerivative() {
		return contentDerivative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentDerivative(CodeableConcept newContentDerivative, NotificationChain msgs) {
		CodeableConcept oldContentDerivative = contentDerivative;
		contentDerivative = newContentDerivative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__CONTENT_DERIVATIVE, oldContentDerivative, newContentDerivative);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentDerivative(CodeableConcept newContentDerivative) {
		if (newContentDerivative != contentDerivative) {
			NotificationChain msgs = null;
			if (contentDerivative != null)
				msgs = ((InternalEObject)contentDerivative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__CONTENT_DERIVATIVE, null, msgs);
			if (newContentDerivative != null)
				msgs = ((InternalEObject)newContentDerivative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__CONTENT_DERIVATIVE, null, msgs);
			msgs = basicSetContentDerivative(newContentDerivative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__CONTENT_DERIVATIVE, newContentDerivative, newContentDerivative));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__ISSUED, oldIssued, newIssued);
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
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__ISSUED, newIssued, newIssued));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__APPLIES, oldApplies, newApplies);
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
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__APPLIES, newApplies, newApplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthority() {
		if (authority == null) {
			authority = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__AUTHORITY);
		}
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__DOMAIN);
		}
		return domain;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubType() {
		if (subType == null) {
			subType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT__SUB_TYPE);
		}
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTerm> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, FhirPackage.CONTRACT__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractSigner> getSigner() {
		if (signer == null) {
			signer = new EObjectContainmentEList<ContractSigner>(ContractSigner.class, this, FhirPackage.CONTRACT__SIGNER);
		}
		return signer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractFriendly> getFriendly() {
		if (friendly == null) {
			friendly = new EObjectContainmentEList<ContractFriendly>(ContractFriendly.class, this, FhirPackage.CONTRACT__FRIENDLY);
		}
		return friendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractLegal> getLegal() {
		if (legal == null) {
			legal = new EObjectContainmentEList<ContractLegal>(ContractLegal.class, this, FhirPackage.CONTRACT__LEGAL);
		}
		return legal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractRule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(ContractRule newRule, NotificationChain msgs) {
		ContractRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(ContractRule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getLegallyBindingAttachment() {
		return legallyBindingAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegallyBindingAttachment(Attachment newLegallyBindingAttachment, NotificationChain msgs) {
		Attachment oldLegallyBindingAttachment = legallyBindingAttachment;
		legallyBindingAttachment = newLegallyBindingAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, oldLegallyBindingAttachment, newLegallyBindingAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegallyBindingAttachment(Attachment newLegallyBindingAttachment) {
		if (newLegallyBindingAttachment != legallyBindingAttachment) {
			NotificationChain msgs = null;
			if (legallyBindingAttachment != null)
				msgs = ((InternalEObject)legallyBindingAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, null, msgs);
			if (newLegallyBindingAttachment != null)
				msgs = ((InternalEObject)newLegallyBindingAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, null, msgs);
			msgs = basicSetLegallyBindingAttachment(newLegallyBindingAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, newLegallyBindingAttachment, newLegallyBindingAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLegallyBindingReference() {
		return legallyBindingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegallyBindingReference(Reference newLegallyBindingReference, NotificationChain msgs) {
		Reference oldLegallyBindingReference = legallyBindingReference;
		legallyBindingReference = newLegallyBindingReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, oldLegallyBindingReference, newLegallyBindingReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegallyBindingReference(Reference newLegallyBindingReference) {
		if (newLegallyBindingReference != legallyBindingReference) {
			NotificationChain msgs = null;
			if (legallyBindingReference != null)
				msgs = ((InternalEObject)legallyBindingReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, null, msgs);
			if (newLegallyBindingReference != null)
				msgs = ((InternalEObject)newLegallyBindingReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, null, msgs);
			msgs = basicSetLegallyBindingReference(newLegallyBindingReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, newLegallyBindingReference, newLegallyBindingReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONTRACT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				return basicSetContentDerivative(null, msgs);
			case FhirPackage.CONTRACT__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.CONTRACT__APPLIES:
				return basicSetApplies(null, msgs);
			case FhirPackage.CONTRACT__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__AUTHORITY:
				return ((InternalEList<?>)getAuthority()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONTRACT__SUB_TYPE:
				return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__SIGNER:
				return ((InternalEList<?>)getSigner()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__FRIENDLY:
				return ((InternalEList<?>)getFriendly()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__LEGAL:
				return ((InternalEList<?>)getLegal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__RULE:
				return basicSetRule(null, msgs);
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				return basicSetLegallyBindingAttachment(null, msgs);
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				return basicSetLegallyBindingReference(null, msgs);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRACT__STATUS:
				return getStatus();
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				return getContentDerivative();
			case FhirPackage.CONTRACT__ISSUED:
				return getIssued();
			case FhirPackage.CONTRACT__APPLIES:
				return getApplies();
			case FhirPackage.CONTRACT__SUBJECT:
				return getSubject();
			case FhirPackage.CONTRACT__AUTHORITY:
				return getAuthority();
			case FhirPackage.CONTRACT__DOMAIN:
				return getDomain();
			case FhirPackage.CONTRACT__TYPE:
				return getType();
			case FhirPackage.CONTRACT__SUB_TYPE:
				return getSubType();
			case FhirPackage.CONTRACT__TERM:
				return getTerm();
			case FhirPackage.CONTRACT__SIGNER:
				return getSigner();
			case FhirPackage.CONTRACT__FRIENDLY:
				return getFriendly();
			case FhirPackage.CONTRACT__LEGAL:
				return getLegal();
			case FhirPackage.CONTRACT__RULE:
				return getRule();
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				return getLegallyBindingAttachment();
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				return getLegallyBindingReference();
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONTRACT__STATUS:
				setStatus((ContractResourceStatusCodes)newValue);
				return;
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				setContentDerivative((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT__APPLIES:
				setApplies((Period)newValue);
				return;
			case FhirPackage.CONTRACT__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__AUTHORITY:
				getAuthority().clear();
				getAuthority().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__SUB_TYPE:
				getSubType().clear();
				getSubType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends ContractTerm>)newValue);
				return;
			case FhirPackage.CONTRACT__SIGNER:
				getSigner().clear();
				getSigner().addAll((Collection<? extends ContractSigner>)newValue);
				return;
			case FhirPackage.CONTRACT__FRIENDLY:
				getFriendly().clear();
				getFriendly().addAll((Collection<? extends ContractFriendly>)newValue);
				return;
			case FhirPackage.CONTRACT__LEGAL:
				getLegal().clear();
				getLegal().addAll((Collection<? extends ContractLegal>)newValue);
				return;
			case FhirPackage.CONTRACT__RULE:
				setRule((ContractRule)newValue);
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				setLegallyBindingAttachment((Attachment)newValue);
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				setLegallyBindingReference((Reference)newValue);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONTRACT__STATUS:
				setStatus((ContractResourceStatusCodes)null);
				return;
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				setContentDerivative((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirPackage.CONTRACT__APPLIES:
				setApplies((Period)null);
				return;
			case FhirPackage.CONTRACT__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.CONTRACT__AUTHORITY:
				getAuthority().clear();
				return;
			case FhirPackage.CONTRACT__DOMAIN:
				getDomain().clear();
				return;
			case FhirPackage.CONTRACT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__SUB_TYPE:
				getSubType().clear();
				return;
			case FhirPackage.CONTRACT__TERM:
				getTerm().clear();
				return;
			case FhirPackage.CONTRACT__SIGNER:
				getSigner().clear();
				return;
			case FhirPackage.CONTRACT__FRIENDLY:
				getFriendly().clear();
				return;
			case FhirPackage.CONTRACT__LEGAL:
				getLegal().clear();
				return;
			case FhirPackage.CONTRACT__RULE:
				setRule((ContractRule)null);
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				setLegallyBindingAttachment((Attachment)null);
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				setLegallyBindingReference((Reference)null);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONTRACT__STATUS:
				return status != null;
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				return contentDerivative != null;
			case FhirPackage.CONTRACT__ISSUED:
				return issued != null;
			case FhirPackage.CONTRACT__APPLIES:
				return applies != null;
			case FhirPackage.CONTRACT__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.CONTRACT__AUTHORITY:
				return authority != null && !authority.isEmpty();
			case FhirPackage.CONTRACT__DOMAIN:
				return domain != null && !domain.isEmpty();
			case FhirPackage.CONTRACT__TYPE:
				return type != null;
			case FhirPackage.CONTRACT__SUB_TYPE:
				return subType != null && !subType.isEmpty();
			case FhirPackage.CONTRACT__TERM:
				return term != null && !term.isEmpty();
			case FhirPackage.CONTRACT__SIGNER:
				return signer != null && !signer.isEmpty();
			case FhirPackage.CONTRACT__FRIENDLY:
				return friendly != null && !friendly.isEmpty();
			case FhirPackage.CONTRACT__LEGAL:
				return legal != null && !legal.isEmpty();
			case FhirPackage.CONTRACT__RULE:
				return rule != null;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				return legallyBindingAttachment != null;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				return legallyBindingReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
