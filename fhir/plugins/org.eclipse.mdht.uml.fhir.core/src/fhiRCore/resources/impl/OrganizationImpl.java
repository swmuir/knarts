/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Organization;
import fhiRCore.resources.OrganizationContact;
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
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationImpl#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends DomainResourceImpl implements Organization {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean active;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> alias;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecoms;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

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
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationContact> contacts;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOrganization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ORGANIZATION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(fhiRCore.dataTypes.Boolean newActive, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(fhiRCore.dataTypes.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ORGANIZATION__TYPE);
		}
		return types;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.ORGANIZATION__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.ORGANIZATION__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, ResourcesPackage.ORGANIZATION__ADDRESS);
		}
		return addresses;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION__PART_OF, oldPartOf, newPartOf);
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
				msgs = ((InternalEObject)partOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION__PART_OF, null, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION__PART_OF, null, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<OrganizationContact>(OrganizationContact.class, this, ResourcesPackage.ORGANIZATION__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ORGANIZATION__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ORGANIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.ORGANIZATION__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.ORGANIZATION__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION__ADDRESS:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case ResourcesPackage.ORGANIZATION__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ORGANIZATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ORGANIZATION__ACTIVE:
				return getActive();
			case ResourcesPackage.ORGANIZATION__TYPE:
				return getTypes();
			case ResourcesPackage.ORGANIZATION__NAME:
				return getName();
			case ResourcesPackage.ORGANIZATION__ALIAS:
				return getAlias();
			case ResourcesPackage.ORGANIZATION__TELECOM:
				return getTelecoms();
			case ResourcesPackage.ORGANIZATION__ADDRESS:
				return getAddresses();
			case ResourcesPackage.ORGANIZATION__PART_OF:
				return getPartOf();
			case ResourcesPackage.ORGANIZATION__CONTACT:
				return getContacts();
			case ResourcesPackage.ORGANIZATION__ENDPOINT:
				return getEndpoints();
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
			case ResourcesPackage.ORGANIZATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__PART_OF:
				setPartOf((Reference)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends OrganizationContact>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.ORGANIZATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ORGANIZATION__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ORGANIZATION__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.ORGANIZATION__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ORGANIZATION__ALIAS:
				getAlias().clear();
				return;
			case ResourcesPackage.ORGANIZATION__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.ORGANIZATION__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.ORGANIZATION__PART_OF:
				setPartOf((Reference)null);
				return;
			case ResourcesPackage.ORGANIZATION__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.ORGANIZATION__ENDPOINT:
				getEndpoints().clear();
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
			case ResourcesPackage.ORGANIZATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ORGANIZATION__ACTIVE:
				return active != null;
			case ResourcesPackage.ORGANIZATION__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.ORGANIZATION__NAME:
				return name != null;
			case ResourcesPackage.ORGANIZATION__ALIAS:
				return alias != null && !alias.isEmpty();
			case ResourcesPackage.ORGANIZATION__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.ORGANIZATION__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.ORGANIZATION__PART_OF:
				return partOf != null;
			case ResourcesPackage.ORGANIZATION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.ORGANIZATION__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
