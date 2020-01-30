/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion;
import fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersionFilter;

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
 * An implementation of the model object '<em><b>Terminology Capabilities Code System Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemVersionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemVersionImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemVersionImpl#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemVersionImpl#getLanguages <em>Language</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemVersionImpl#getFilters <em>Filter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemVersionImpl#getProperties <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesCodeSystemVersionImpl extends BackboneElementImpl implements TerminologyCapabilitiesCodeSystemVersion {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String code;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean isDefault;

	/**
	 * The cached value of the '{@link #getCompositional() <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositional()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean compositional;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> languages;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesCodeSystemVersionFilter> filters;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesCodeSystemVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTerminologyCapabilitiesCodeSystemVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(fhiRCore.dataTypes.String newCode, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(fhiRCore.dataTypes.String newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefault(fhiRCore.dataTypes.Boolean newIsDefault, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT, oldIsDefault, newIsDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(fhiRCore.dataTypes.Boolean newIsDefault) {
		if (newIsDefault != isDefault) {
			NotificationChain msgs = null;
			if (isDefault != null)
				msgs = ((InternalEObject)isDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT, null, msgs);
			if (newIsDefault != null)
				msgs = ((InternalEObject)newIsDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT, null, msgs);
			msgs = basicSetIsDefault(newIsDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT, newIsDefault, newIsDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getCompositional() {
		return compositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositional(fhiRCore.dataTypes.Boolean newCompositional, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldCompositional = compositional;
		compositional = newCompositional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL, oldCompositional, newCompositional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositional(fhiRCore.dataTypes.Boolean newCompositional) {
		if (newCompositional != compositional) {
			NotificationChain msgs = null;
			if (compositional != null)
				msgs = ((InternalEObject)compositional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL, null, msgs);
			if (newCompositional != null)
				msgs = ((InternalEObject)newCompositional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL, null, msgs);
			msgs = basicSetCompositional(newCompositional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL, newCompositional, newCompositional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getLanguages() {
		if (languages == null) {
			languages = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__LANGUAGE);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyCapabilitiesCodeSystemVersionFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<TerminologyCapabilitiesCodeSystemVersionFilter>(TerminologyCapabilitiesCodeSystemVersionFilter.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__FILTER);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__PROPERTY);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT:
				return basicSetIsDefault(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL:
				return basicSetCompositional(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__LANGUAGE:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__FILTER:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE:
				return getCode();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT:
				return getIsDefault();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL:
				return getCompositional();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__LANGUAGE:
				return getLanguages();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__FILTER:
				return getFilters();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__PROPERTY:
				return getProperties();
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE:
				setCode((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT:
				setIsDefault((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL:
				setCompositional((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__LANGUAGE:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__FILTER:
				getFilters().clear();
				getFilters().addAll((Collection<? extends TerminologyCapabilitiesCodeSystemVersionFilter>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Code>)newValue);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE:
				setCode((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT:
				setIsDefault((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL:
				setCompositional((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__LANGUAGE:
				getLanguages().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__FILTER:
				getFilters().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__PROPERTY:
				getProperties().clear();
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__CODE:
				return code != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__IS_DEFAULT:
				return isDefault != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__COMPOSITIONAL:
				return compositional != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__LANGUAGE:
				return languages != null && !languages.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__FILTER:
				return filters != null && !filters.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION__PROPERTY:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesCodeSystemVersionImpl
