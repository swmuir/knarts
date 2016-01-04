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

import org.hl7.fhir.Code;
import org.hl7.fhir.DecisionSupportServiceModuleCodeFilter;
import org.hl7.fhir.DecisionSupportServiceModuleDateFilter;
import org.hl7.fhir.DecisionSupportServiceModuleParameter;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Service Module Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getCodeFilter <em>Code Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleParameterImpl#getDateFilter <em>Date Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportServiceModuleParameterImpl extends BackboneElementImpl implements DecisionSupportServiceModuleParameter {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Code name;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String documentation;

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
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Reference profile;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> mustSupport;

	/**
	 * The cached value of the '{@link #getCodeFilter() <em>Code Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportServiceModuleCodeFilter> codeFilter;

	/**
	 * The cached value of the '{@link #getDateFilter() <em>Date Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportServiceModuleDateFilter> dateFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportServiceModuleParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDecisionSupportServiceModuleParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Code newName, NotificationChain msgs) {
		Code oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Code newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Code newUse, NotificationChain msgs) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.hl7.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Reference newProfile, NotificationChain msgs) {
		Reference oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Reference newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getMustSupport() {
		if (mustSupport == null) {
			mustSupport = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT);
		}
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportServiceModuleCodeFilter> getCodeFilter() {
		if (codeFilter == null) {
			codeFilter = new EObjectContainmentEList<DecisionSupportServiceModuleCodeFilter>(DecisionSupportServiceModuleCodeFilter.class, this, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER);
		}
		return codeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportServiceModuleDateFilter> getDateFilter() {
		if (dateFilter == null) {
			dateFilter = new EObjectContainmentEList<DecisionSupportServiceModuleDateFilter>(DecisionSupportServiceModuleDateFilter.class, this, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER);
		}
		return dateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				return basicSetUse(null, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				return basicSetProfile(null, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				return ((InternalEList<?>)getMustSupport()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				return ((InternalEList<?>)getCodeFilter()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
				return ((InternalEList<?>)getDateFilter()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				return getName();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				return getUse();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				return getType();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				return getProfile();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				return getMustSupport();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				return getCodeFilter();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
				return getDateFilter();
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				setName((Code)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				setUse((Code)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				setType((Code)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				setProfile((Reference)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				getMustSupport().clear();
				getMustSupport().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				getCodeFilter().clear();
				getCodeFilter().addAll((Collection<? extends DecisionSupportServiceModuleCodeFilter>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
				getDateFilter().clear();
				getDateFilter().addAll((Collection<? extends DecisionSupportServiceModuleDateFilter>)newValue);
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				setName((Code)null);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				setUse((Code)null);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				setType((Code)null);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				setProfile((Reference)null);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				getMustSupport().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				getCodeFilter().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
				getDateFilter().clear();
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				return name != null;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				return use != null;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				return type != null;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				return profile != null;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				return mustSupport != null && !mustSupport.isEmpty();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				return codeFilter != null && !codeFilter.isEmpty();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
				return dateFilter != null && !dateFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportServiceModuleParameterImpl
