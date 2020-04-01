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

import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CapabilityStatement;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.TestScriptMetadataCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Metadata Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataCapabilityImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataCapabilityImpl#getValidated <em>Validated</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataCapabilityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataCapabilityImpl#getOrigins <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataCapabilityImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataCapabilityImpl#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataCapabilityImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptMetadataCapabilityImpl extends BackboneElementImpl implements TestScriptMetadataCapability {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean required;

	/**
	 * The cached value of the '{@link #getValidated() <em>Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidated()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean validated;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getOrigins() <em>Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigins()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> origins;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer destination;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> links;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatement capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptMetadataCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptMetadataCapability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newRequired, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, oldRequired, newRequired);
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
	public void setRequired(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getValidated() {
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidated(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newValidated, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldValidated = validated;
		validated = newValidated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, oldValidated, newValidated);
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
	public void setValidated(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newValidated) {
		if (newValidated != validated) {
			NotificationChain msgs = null;
			if (validated != null)
				msgs = ((InternalEObject)validated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, null, msgs);
			if (newValidated != null)
				msgs = ((InternalEObject)newValidated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, null, msgs);
			msgs = basicSetValidated(newValidated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, newValidated, newValidated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> getOrigins() {
		if (origins == null) {
			origins = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer>(org.eclipse.mdht.hl7.fhir.dataTypes.Integer.class, this, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN);
		}
		return origins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newDestination, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatement getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilities(CapabilityStatement newCapabilities, NotificationChain msgs) {
		CapabilityStatement oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES, oldCapabilities, newCapabilities);
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
	public void setCapabilities(CapabilityStatement newCapabilities) {
		if (newCapabilities != capabilities) {
			NotificationChain msgs = null;
			if (capabilities != null)
				msgs = ((InternalEObject)capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES, null, msgs);
			if (newCapabilities != null)
				msgs = ((InternalEObject)newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES, null, msgs);
			msgs = basicSetCapabilities(newCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES, newCapabilities, newCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				return basicSetRequired(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				return basicSetValidated(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				return ((InternalEList<?>)getOrigins()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				return basicSetDestination(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				return basicSetCapabilities(null, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				return getRequired();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				return getValidated();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				return getOrigins();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				return getDestination();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				return getLinks();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				return getCapabilities();
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
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				setRequired((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				setValidated((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				getOrigins().clear();
				getOrigins().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.Integer>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				setDestination((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				setCapabilities((CapabilityStatement)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				setRequired((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				setValidated((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				getOrigins().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				setDestination((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				getLinks().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				setCapabilities((CapabilityStatement)null);
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
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				return required != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				return validated != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				return origins != null && !origins.isEmpty();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				return destination != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				return links != null && !links.isEmpty();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				return capabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptMetadataCapabilityImpl
