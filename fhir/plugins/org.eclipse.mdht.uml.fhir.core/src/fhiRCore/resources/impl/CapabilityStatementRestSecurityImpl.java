/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Markdown;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CapabilityStatementRestSecurity;
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
 * An implementation of the model object '<em><b>Capability Statement Rest Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestSecurityImpl#getCors <em>Cors</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestSecurityImpl#getServices <em>Service</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestSecurityImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementRestSecurityImpl extends BackboneElementImpl implements CapabilityStatementRestSecurity {
	/**
	 * The cached value of the '{@link #getCors() <em>Cors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCors()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean cors;

	/**
	 * The cached value of the '{@link #getServices() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> services;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementRestSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementRestSecurity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getCors() {
		return cors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCors(fhiRCore.dataTypes.Boolean newCors, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldCors = cors;
		cors = newCors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS, oldCors, newCors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCors(fhiRCore.dataTypes.Boolean newCors) {
		if (newCors != cors) {
			NotificationChain msgs = null;
			if (cors != null)
				msgs = ((InternalEObject)cors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS, null, msgs);
			if (newCors != null)
				msgs = ((InternalEObject)newCors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS, null, msgs);
			msgs = basicSetCors(newCors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS, newCors, newCors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				return basicSetCors(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				return getCors();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				return getServices();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				return getDescription();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				setCors((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				getServices().clear();
				getServices().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				setDescription((Markdown)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				setCors((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				getServices().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				setDescription((Markdown)null);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				return cors != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				return services != null && !services.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementRestSecurityImpl
