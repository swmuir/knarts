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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ModuleMetadataContact1;
import org.hl7.fhir.ModuleMetadataContributor;
import org.hl7.fhir.ModuleMetadataContributorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Metadata Contributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataContributorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataContributorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataContributorImpl#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleMetadataContributorImpl extends ElementImpl implements ModuleMetadataContributor {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadataContributorType type;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleMetadataContact1> contact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleMetadataContributorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getModuleMetadataContributor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataContributorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ModuleMetadataContributorType newType, NotificationChain msgs) {
		ModuleMetadataContributorType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ModuleMetadataContributorType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMetadataContact1> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ModuleMetadataContact1>(ModuleMetadataContact1.class, this, FhirPackage.MODULE_METADATA_CONTRIBUTOR__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE:
				return getType();
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME:
				return getName();
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__CONTACT:
				return getContact();
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
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE:
				setType((ModuleMetadataContributorType)newValue);
				return;
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ModuleMetadataContact1>)newValue);
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
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE:
				setType((ModuleMetadataContributorType)null);
				return;
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__CONTACT:
				getContact().clear();
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
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__TYPE:
				return type != null;
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__NAME:
				return name != null;
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR__CONTACT:
				return contact != null && !contact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleMetadataContributorImpl
