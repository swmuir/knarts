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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionResource;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Definition Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionResourceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionResourceImpl#getFhirVersions <em>Fhir Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionResourceImpl#getExamplex <em>Examplex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionResourceImpl#getGroupingId <em>Grouping Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideDefinitionResourceImpl extends BackboneElementImpl implements ImplementationGuideDefinitionResource {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getFhirVersions() <em>Fhir Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> fhirVersions;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String name;

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
	 * The cached value of the '{@link #getExamplex() <em>Examplex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamplex()
	 * @generated
	 * @ordered
	 */
	protected DataType examplex;

	/**
	 * The cached value of the '{@link #getGroupingId() <em>Grouping Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingId()
	 * @generated
	 * @ordered
	 */
	protected Id groupingId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideDefinitionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuideDefinitionResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE, oldReference, newReference);
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
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getFhirVersions() {
		if (fhirVersions == null) {
			fhirVersions = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__FHIR_VERSION);
		}
		return fhirVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME, oldName, newName);
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
	public void setName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getExamplex() {
		return examplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamplex(DataType newExamplex, NotificationChain msgs) {
		DataType oldExamplex = examplex;
		examplex = newExamplex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX, oldExamplex, newExamplex);
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
	public void setExamplex(DataType newExamplex) {
		if (newExamplex != examplex) {
			NotificationChain msgs = null;
			if (examplex != null)
				msgs = ((InternalEObject)examplex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX, null, msgs);
			if (newExamplex != null)
				msgs = ((InternalEObject)newExamplex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX, null, msgs);
			msgs = basicSetExamplex(newExamplex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX, newExamplex, newExamplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getGroupingId() {
		return groupingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingId(Id newGroupingId, NotificationChain msgs) {
		Id oldGroupingId = groupingId;
		groupingId = newGroupingId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID, oldGroupingId, newGroupingId);
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
	public void setGroupingId(Id newGroupingId) {
		if (newGroupingId != groupingId) {
			NotificationChain msgs = null;
			if (groupingId != null)
				msgs = ((InternalEObject)groupingId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID, null, msgs);
			if (newGroupingId != null)
				msgs = ((InternalEObject)newGroupingId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID, null, msgs);
			msgs = basicSetGroupingId(newGroupingId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID, newGroupingId, newGroupingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE:
				return basicSetReference(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__FHIR_VERSION:
				return ((InternalEList<?>)getFhirVersions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX:
				return basicSetExamplex(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID:
				return basicSetGroupingId(null, msgs);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE:
				return getReference();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__FHIR_VERSION:
				return getFhirVersions();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME:
				return getName();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX:
				return getExamplex();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID:
				return getGroupingId();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE:
				setReference((Reference)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__FHIR_VERSION:
				getFhirVersions().clear();
				getFhirVersions().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX:
				setExamplex((DataType)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID:
				setGroupingId((Id)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE:
				setReference((Reference)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__FHIR_VERSION:
				getFhirVersions().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX:
				setExamplex((DataType)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID:
				setGroupingId((Id)null);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__REFERENCE:
				return reference != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__FHIR_VERSION:
				return fhirVersions != null && !fhirVersions.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__NAME:
				return name != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__EXAMPLEX:
				return examplex != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE__GROUPING_ID:
				return groupingId != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideDefinitionResourceImpl
