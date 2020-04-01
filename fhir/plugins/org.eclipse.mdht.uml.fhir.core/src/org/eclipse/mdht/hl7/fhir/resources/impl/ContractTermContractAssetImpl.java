/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ContractTermContractAsset;
import org.eclipse.mdht.hl7.fhir.resources.ContractTermContractAssetAssetContext;
import org.eclipse.mdht.hl7.fhir.resources.ContractTermContractAssetValuedItem;
import org.eclipse.mdht.hl7.fhir.resources.ContractTermContractOfferAnswer;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Term Contract Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getTypeReferences <em>Type Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getContexts <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getPeriodTypes <em>Period Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getPeriods <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getUsePeriods <em>Use Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getAnswers <em>Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractTermContractAssetImpl#getValuedItems <em>Valued Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermContractAssetImpl extends BackboneElementImpl implements ContractTermContractAsset {
	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scope;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getTypeReferences() <em>Type Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> typeReferences;

	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subtypes;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Coding relationship;

	/**
	 * The cached value of the '{@link #getContexts() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermContractAssetAssetContext> contexts;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String condition;

	/**
	 * The cached value of the '{@link #getPeriodTypes() <em>Period Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> periodTypes;

	/**
	 * The cached value of the '{@link #getPeriods() <em>Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriods()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> periods;

	/**
	 * The cached value of the '{@link #getUsePeriods() <em>Use Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePeriods()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> usePeriods;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getLinkIds() <em>Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> linkIds;

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
	 * The cached value of the '{@link #getSecurityLabelNumbers() <em>Security Label Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> securityLabelNumbers;

	/**
	 * The cached value of the '{@link #getValuedItems() <em>Valued Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermContractAssetValuedItem> valuedItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermContractAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTermContractAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(CodeableConcept newScope, NotificationChain msgs) {
		CodeableConcept oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(CodeableConcept newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getTypeReferences() {
		if (typeReferences == null) {
			typeReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE_REFERENCE);
		}
		return typeReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubtypes() {
		if (subtypes == null) {
			subtypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SUBTYPE);
		}
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Coding newRelationship, NotificationChain msgs) {
		Coding oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationship(Coding newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractTermContractAssetAssetContext> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<ContractTermContractAssetAssetContext>(ContractTermContractAssetAssetContext.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONTEXT);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(org.eclipse.mdht.hl7.fhir.dataTypes.String newCondition, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(org.eclipse.mdht.hl7.fhir.dataTypes.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPeriodTypes() {
		if (periodTypes == null) {
			periodTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD_TYPE);
		}
		return periodTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getPeriods() {
		if (periods == null) {
			periods = new EObjectContainmentEList<Period>(Period.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD);
		}
		return periods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getUsePeriods() {
		if (usePeriods == null) {
			usePeriods = new EObjectContainmentEList<Period>(Period.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__USE_PERIOD);
		}
		return usePeriods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.eclipse.mdht.hl7.fhir.dataTypes.String newText, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(org.eclipse.mdht.hl7.fhir.dataTypes.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getLinkIds() {
		if (linkIds == null) {
			linkIds = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__LINK_ID);
		}
		return linkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractTermContractOfferAnswer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<ContractTermContractOfferAnswer>(ContractTermContractOfferAnswer.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__ANSWER);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnsignedInt> getSecurityLabelNumbers() {
		if (securityLabelNumbers == null) {
			securityLabelNumbers = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractTermContractAssetValuedItem> getValuedItems() {
		if (valuedItems == null) {
			valuedItems = new EObjectContainmentEList<ContractTermContractAssetValuedItem>(ContractTermContractAssetValuedItem.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__VALUED_ITEM);
		}
		return valuedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE:
				return basicSetScope(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE_REFERENCE:
				return ((InternalEList<?>)getTypeReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SUBTYPE:
				return ((InternalEList<?>)getSubtypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONTEXT:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION:
				return basicSetCondition(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD_TYPE:
				return ((InternalEList<?>)getPeriodTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD:
				return ((InternalEList<?>)getPeriods()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__USE_PERIOD:
				return ((InternalEList<?>)getUsePeriods()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT:
				return basicSetText(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__LINK_ID:
				return ((InternalEList<?>)getLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__ANSWER:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumbers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__VALUED_ITEM:
				return ((InternalEList<?>)getValuedItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE:
				return getScope();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE:
				return getTypes();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE_REFERENCE:
				return getTypeReferences();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SUBTYPE:
				return getSubtypes();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP:
				return getRelationship();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONTEXT:
				return getContexts();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION:
				return getCondition();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD_TYPE:
				return getPeriodTypes();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD:
				return getPeriods();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__USE_PERIOD:
				return getUsePeriods();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT:
				return getText();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__LINK_ID:
				return getLinkIds();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__ANSWER:
				return getAnswers();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumbers();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__VALUED_ITEM:
				return getValuedItems();
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE:
				setScope((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE_REFERENCE:
				getTypeReferences().clear();
				getTypeReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SUBTYPE:
				getSubtypes().clear();
				getSubtypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP:
				setRelationship((Coding)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONTEXT:
				getContexts().clear();
				getContexts().addAll((Collection<? extends ContractTermContractAssetAssetContext>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION:
				setCondition((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD_TYPE:
				getPeriodTypes().clear();
				getPeriodTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD:
				getPeriods().clear();
				getPeriods().addAll((Collection<? extends Period>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__USE_PERIOD:
				getUsePeriods().clear();
				getUsePeriods().addAll((Collection<? extends Period>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT:
				setText((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__LINK_ID:
				getLinkIds().clear();
				getLinkIds().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__ANSWER:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends ContractTermContractOfferAnswer>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
				getSecurityLabelNumbers().addAll((Collection<? extends UnsignedInt>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__VALUED_ITEM:
				getValuedItems().clear();
				getValuedItems().addAll((Collection<? extends ContractTermContractAssetValuedItem>)newValue);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE:
				setScope((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE_REFERENCE:
				getTypeReferences().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SUBTYPE:
				getSubtypes().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP:
				setRelationship((Coding)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONTEXT:
				getContexts().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION:
				setCondition((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD_TYPE:
				getPeriodTypes().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD:
				getPeriods().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__USE_PERIOD:
				getUsePeriods().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT:
				setText((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__LINK_ID:
				getLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__ANSWER:
				getAnswers().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__VALUED_ITEM:
				getValuedItems().clear();
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SCOPE:
				return scope != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TYPE_REFERENCE:
				return typeReferences != null && !typeReferences.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SUBTYPE:
				return subtypes != null && !subtypes.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__RELATIONSHIP:
				return relationship != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONTEXT:
				return contexts != null && !contexts.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__CONDITION:
				return condition != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD_TYPE:
				return periodTypes != null && !periodTypes.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__PERIOD:
				return periods != null && !periods.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__USE_PERIOD:
				return usePeriods != null && !usePeriods.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__TEXT:
				return text != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__LINK_ID:
				return linkIds != null && !linkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__ANSWER:
				return answers != null && !answers.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				return securityLabelNumbers != null && !securityLabelNumbers.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET__VALUED_ITEM:
				return valuedItems != null && !valuedItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermContractAssetImpl
