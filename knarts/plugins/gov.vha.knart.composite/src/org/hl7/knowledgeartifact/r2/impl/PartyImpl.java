/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.AddressesType;
import org.hl7.knowledgeartifact.r2.ContactsType;
import org.hl7.knowledgeartifact.r2.Party;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.PartyImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.PartyImpl#getContacts <em>Contacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PartyImpl extends MinimalEObjectImpl.Container implements Party {
	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected AddressesType addresses;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected ContactsType contacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getParty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressesType getAddresses() {
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddresses(AddressesType newAddresses, NotificationChain msgs) {
		AddressesType oldAddresses = addresses;
		addresses = newAddresses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.PARTY__ADDRESSES, oldAddresses, newAddresses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddresses(AddressesType newAddresses) {
		if (newAddresses != addresses) {
			NotificationChain msgs = null;
			if (addresses != null)
				msgs = ((InternalEObject)addresses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.PARTY__ADDRESSES, null, msgs);
			if (newAddresses != null)
				msgs = ((InternalEObject)newAddresses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.PARTY__ADDRESSES, null, msgs);
			msgs = basicSetAddresses(newAddresses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PARTY__ADDRESSES, newAddresses, newAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactsType getContacts() {
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContacts(ContactsType newContacts, NotificationChain msgs) {
		ContactsType oldContacts = contacts;
		contacts = newContacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.PARTY__CONTACTS, oldContacts, newContacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContacts(ContactsType newContacts) {
		if (newContacts != contacts) {
			NotificationChain msgs = null;
			if (contacts != null)
				msgs = ((InternalEObject)contacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.PARTY__CONTACTS, null, msgs);
			if (newContacts != null)
				msgs = ((InternalEObject)newContacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.PARTY__CONTACTS, null, msgs);
			msgs = basicSetContacts(newContacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.PARTY__CONTACTS, newContacts, newContacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.PARTY__ADDRESSES:
				return basicSetAddresses(null, msgs);
			case R2Package.PARTY__CONTACTS:
				return basicSetContacts(null, msgs);
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
			case R2Package.PARTY__ADDRESSES:
				return getAddresses();
			case R2Package.PARTY__CONTACTS:
				return getContacts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case R2Package.PARTY__ADDRESSES:
				setAddresses((AddressesType)newValue);
				return;
			case R2Package.PARTY__CONTACTS:
				setContacts((ContactsType)newValue);
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
			case R2Package.PARTY__ADDRESSES:
				setAddresses((AddressesType)null);
				return;
			case R2Package.PARTY__CONTACTS:
				setContacts((ContactsType)null);
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
			case R2Package.PARTY__ADDRESSES:
				return addresses != null;
			case R2Package.PARTY__CONTACTS:
				return contacts != null;
		}
		return super.eIsSet(featureID);
	}

} //PartyImpl
