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
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRest;
import org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResource;
import org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceOperation;
import org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceSearchParam;
import org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestSecurity;
import org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestSystemInteraction;
import org.eclipse.mdht.hl7.fhir.resources.CompartmentDefinition;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getResources <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getSearchParams <em>Search Param</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getOperations <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CapabilityStatementRestImpl#getCompartments <em>Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementRestImpl extends BackboneElementImpl implements CapabilityStatementRest {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementRestSecurity security;

	/**
	 * The cached value of the '{@link #getResources() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResource> resources;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestSystemInteraction> interactions;

	/**
	 * The cached value of the '{@link #getSearchParams() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParams()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResourceSearchParam> searchParams;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResourceOperation> operations;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<CompartmentDefinition> compartments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementRestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementRest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(Code newMode, NotificationChain msgs) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE, oldMode, newMode);
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
	public void setMode(Code newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, oldDocumentation, newDocumentation);
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
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRestSecurity getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(CapabilityStatementRestSecurity newSecurity, NotificationChain msgs) {
		CapabilityStatementRestSecurity oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, oldSecurity, newSecurity);
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
	public void setSecurity(CapabilityStatementRestSecurity newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementRestResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<CapabilityStatementRestResource>(CapabilityStatementRestResource.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementRestSystemInteraction> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<CapabilityStatementRestSystemInteraction>(CapabilityStatementRestSystemInteraction.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementRestResourceSearchParam> getSearchParams() {
		if (searchParams == null) {
			searchParams = new EObjectContainmentEList<CapabilityStatementRestResourceSearchParam>(CapabilityStatementRestResourceSearchParam.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM);
		}
		return searchParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementRestResourceOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<CapabilityStatementRestResourceOperation>(CapabilityStatementRestResourceOperation.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompartmentDefinition> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectContainmentEList<CompartmentDefinition>(CompartmentDefinition.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				return basicSetMode(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return basicSetSecurity(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParams()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				return getMode();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				return getDocumentation();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return getSecurity();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return getResources();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return getInteractions();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return getSearchParams();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return getOperations();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return getCompartments();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				setMode((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				setSecurity((CapabilityStatementRestSecurity)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				getResources().clear();
				getResources().addAll((Collection<? extends CapabilityStatementRestResource>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends CapabilityStatementRestSystemInteraction>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				getSearchParams().clear();
				getSearchParams().addAll((Collection<? extends CapabilityStatementRestResourceSearchParam>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				getOperations().clear();
				getOperations().addAll((Collection<? extends CapabilityStatementRestResourceOperation>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends CompartmentDefinition>)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				setMode((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				setDocumentation((Markdown)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				setSecurity((CapabilityStatementRestSecurity)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				getResources().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				getInteractions().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				getSearchParams().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				getOperations().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				getCompartments().clear();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				return mode != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return security != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return resources != null && !resources.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return interactions != null && !interactions.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return searchParams != null && !searchParams.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return operations != null && !operations.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return compartments != null && !compartments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementRestImpl
