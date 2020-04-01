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

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.GraphDefinitionLink;
import org.eclipse.mdht.hl7.fhir.resources.GraphDefinitionLinkTarget;
import org.eclipse.mdht.hl7.fhir.resources.GraphDefinitionLinkTargetCompartment;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Definition Link Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetImpl#getCompartments <em>Compartment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetImpl#getLinks <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDefinitionLinkTargetImpl extends BackboneElementImpl implements GraphDefinitionLinkTarget {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String params;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition profile;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinitionLinkTargetCompartment> compartments;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinitionLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDefinitionLinkTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGraphDefinitionLinkTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE, oldType, newType);
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
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(org.eclipse.mdht.hl7.fhir.dataTypes.String newParams, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS, oldParams, newParams);
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
	public void setParams(org.eclipse.mdht.hl7.fhir.dataTypes.String newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinition getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(StructureDefinition newProfile, NotificationChain msgs) {
		StructureDefinition oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE, oldProfile, newProfile);
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
	public void setProfile(StructureDefinition newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphDefinitionLinkTargetCompartment> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectContainmentEList<GraphDefinitionLinkTargetCompartment>(GraphDefinitionLinkTargetCompartment.class, this, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__COMPARTMENT);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphDefinitionLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<GraphDefinitionLink>(GraphDefinitionLink.class, this, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS:
				return basicSetParams(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE:
				return basicSetProfile(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__COMPARTMENT:
				return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE:
				return getType();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS:
				return getParams();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE:
				return getProfile();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__COMPARTMENT:
				return getCompartments();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__LINK:
				return getLinks();
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS:
				setParams((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE:
				setProfile((StructureDefinition)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__COMPARTMENT:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends GraphDefinitionLinkTargetCompartment>)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends GraphDefinitionLink>)newValue);
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS:
				setParams((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE:
				setProfile((StructureDefinition)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__COMPARTMENT:
				getCompartments().clear();
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__LINK:
				getLinks().clear();
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__TYPE:
				return type != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PARAMS:
				return params != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__PROFILE:
				return profile != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__COMPARTMENT:
				return compartments != null && !compartments.isEmpty();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET__LINK:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphDefinitionLinkTargetImpl
