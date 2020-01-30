/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Account;
import fhiRCore.resources.AccountCoverage;
import fhiRCore.resources.AccountGuarantor;
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
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getServicePeriod <em>Service Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getCoverages <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getGuarantors <em>Guarantor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AccountImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends DomainResourceImpl implements Account {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjects;

	/**
	 * The cached value of the '{@link #getServicePeriod() <em>Service Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicePeriod;

	/**
	 * The cached value of the '{@link #getCoverages() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverages()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountCoverage> coverages;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getGuarantors() <em>Guarantor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuarantors()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountGuarantor> guarantors;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Reference partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAccount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ACCOUNT__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ACCOUNT__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getServicePeriod() {
		return servicePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicePeriod(Period newServicePeriod, NotificationChain msgs) {
		Period oldServicePeriod = servicePeriod;
		servicePeriod = newServicePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__SERVICE_PERIOD, oldServicePeriod, newServicePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePeriod(Period newServicePeriod) {
		if (newServicePeriod != servicePeriod) {
			NotificationChain msgs = null;
			if (servicePeriod != null)
				msgs = ((InternalEObject)servicePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__SERVICE_PERIOD, null, msgs);
			if (newServicePeriod != null)
				msgs = ((InternalEObject)newServicePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__SERVICE_PERIOD, null, msgs);
			msgs = basicSetServicePeriod(newServicePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__SERVICE_PERIOD, newServicePeriod, newServicePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccountCoverage> getCoverages() {
		if (coverages == null) {
			coverages = new EObjectContainmentEList<AccountCoverage>(AccountCoverage.class, this, ResourcesPackage.ACCOUNT__COVERAGE);
		}
		return coverages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccountGuarantor> getGuarantors() {
		if (guarantors == null) {
			guarantors = new EObjectContainmentEList<AccountGuarantor>(AccountGuarantor.class, this, ResourcesPackage.ACCOUNT__GUARANTOR);
		}
		return guarantors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Reference newPartOf, NotificationChain msgs) {
		Reference oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__PART_OF, oldPartOf, newPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Reference newPartOf) {
		if (newPartOf != partOf) {
			NotificationChain msgs = null;
			if (partOf != null)
				msgs = ((InternalEObject)partOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__PART_OF, null, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT__PART_OF, null, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ACCOUNT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACCOUNT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.ACCOUNT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.ACCOUNT__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.ACCOUNT__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACCOUNT__SERVICE_PERIOD:
				return basicSetServicePeriod(null, msgs);
			case ResourcesPackage.ACCOUNT__COVERAGE:
				return ((InternalEList<?>)getCoverages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACCOUNT__OWNER:
				return basicSetOwner(null, msgs);
			case ResourcesPackage.ACCOUNT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.ACCOUNT__GUARANTOR:
				return ((InternalEList<?>)getGuarantors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACCOUNT__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case ResourcesPackage.ACCOUNT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ACCOUNT__STATUS:
				return getStatus();
			case ResourcesPackage.ACCOUNT__TYPE:
				return getType();
			case ResourcesPackage.ACCOUNT__NAME:
				return getName();
			case ResourcesPackage.ACCOUNT__SUBJECT:
				return getSubjects();
			case ResourcesPackage.ACCOUNT__SERVICE_PERIOD:
				return getServicePeriod();
			case ResourcesPackage.ACCOUNT__COVERAGE:
				return getCoverages();
			case ResourcesPackage.ACCOUNT__OWNER:
				return getOwner();
			case ResourcesPackage.ACCOUNT__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.ACCOUNT__GUARANTOR:
				return getGuarantors();
			case ResourcesPackage.ACCOUNT__PART_OF:
				return getPartOf();
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
			case ResourcesPackage.ACCOUNT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ACCOUNT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ACCOUNT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ACCOUNT__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACCOUNT__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ACCOUNT__SERVICE_PERIOD:
				setServicePeriod((Period)newValue);
				return;
			case ResourcesPackage.ACCOUNT__COVERAGE:
				getCoverages().clear();
				getCoverages().addAll((Collection<? extends AccountCoverage>)newValue);
				return;
			case ResourcesPackage.ACCOUNT__OWNER:
				setOwner((Reference)newValue);
				return;
			case ResourcesPackage.ACCOUNT__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACCOUNT__GUARANTOR:
				getGuarantors().clear();
				getGuarantors().addAll((Collection<? extends AccountGuarantor>)newValue);
				return;
			case ResourcesPackage.ACCOUNT__PART_OF:
				setPartOf((Reference)newValue);
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
			case ResourcesPackage.ACCOUNT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ACCOUNT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ACCOUNT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.ACCOUNT__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACCOUNT__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.ACCOUNT__SERVICE_PERIOD:
				setServicePeriod((Period)null);
				return;
			case ResourcesPackage.ACCOUNT__COVERAGE:
				getCoverages().clear();
				return;
			case ResourcesPackage.ACCOUNT__OWNER:
				setOwner((Reference)null);
				return;
			case ResourcesPackage.ACCOUNT__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACCOUNT__GUARANTOR:
				getGuarantors().clear();
				return;
			case ResourcesPackage.ACCOUNT__PART_OF:
				setPartOf((Reference)null);
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
			case ResourcesPackage.ACCOUNT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ACCOUNT__STATUS:
				return status != null;
			case ResourcesPackage.ACCOUNT__TYPE:
				return type != null;
			case ResourcesPackage.ACCOUNT__NAME:
				return name != null;
			case ResourcesPackage.ACCOUNT__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.ACCOUNT__SERVICE_PERIOD:
				return servicePeriod != null;
			case ResourcesPackage.ACCOUNT__COVERAGE:
				return coverages != null && !coverages.isEmpty();
			case ResourcesPackage.ACCOUNT__OWNER:
				return owner != null;
			case ResourcesPackage.ACCOUNT__DESCRIPTION:
				return description != null;
			case ResourcesPackage.ACCOUNT__GUARANTOR:
				return guarantors != null && !guarantors.isEmpty();
			case ResourcesPackage.ACCOUNT__PART_OF:
				return partOf != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountImpl
