/**
 */
package org.hl7.cdsdt.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.cdsdt.r2.CD;
import org.hl7.cdsdt.r2.R2Package;
import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getOriginalText <em>Original Text</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getCodeSystemName <em>Code System Name</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getCodeSystemVersion <em>Code System Version</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.CDImpl#getValueSetVersion <em>Value Set Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDImpl extends ANYImpl implements CD {
	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected ST displayName;

	/**
	 * The cached value of the '{@link #getOriginalText() <em>Original Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalText()
	 * @generated
	 * @ordered
	 */
	protected ST originalText;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> translation;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected String codeSystem = CODE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemName = CODE_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemVersion = CODE_SYSTEM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSet() <em>Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected String valueSet = VALUE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSetVersion() <em>Value Set Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSetVersion() <em>Value Set Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetVersion()
	 * @generated
	 * @ordered
	 */
	protected String valueSetVersion = VALUE_SET_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.CD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(ST newDisplayName, NotificationChain msgs) {
		ST oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CD__DISPLAY_NAME, oldDisplayName, newDisplayName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(ST newDisplayName) {
		if (newDisplayName != displayName) {
			NotificationChain msgs = null;
			if (displayName != null)
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CD__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CD__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__DISPLAY_NAME, newDisplayName, newDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getOriginalText() {
		return originalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalText(ST newOriginalText, NotificationChain msgs) {
		ST oldOriginalText = originalText;
		originalText = newOriginalText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CD__ORIGINAL_TEXT, oldOriginalText, newOriginalText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalText(ST newOriginalText) {
		if (newOriginalText != originalText) {
			NotificationChain msgs = null;
			if (originalText != null)
				msgs = ((InternalEObject)originalText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CD__ORIGINAL_TEXT, null, msgs);
			if (newOriginalText != null)
				msgs = ((InternalEObject)newOriginalText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CD__ORIGINAL_TEXT, null, msgs);
			msgs = basicSetOriginalText(newOriginalText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__ORIGINAL_TEXT, newOriginalText, newOriginalText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getTranslation() {
		if (translation == null) {
			translation = new EObjectContainmentEList<CD>(CD.class, this, R2Package.CD__TRANSLATION);
		}
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(String newCodeSystem) {
		String oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__CODE_SYSTEM, oldCodeSystem, codeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystemName() {
		return codeSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystemName(String newCodeSystemName) {
		String oldCodeSystemName = codeSystemName;
		codeSystemName = newCodeSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__CODE_SYSTEM_NAME, oldCodeSystemName, codeSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystemVersion() {
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystemVersion(String newCodeSystemVersion) {
		String oldCodeSystemVersion = codeSystemVersion;
		codeSystemVersion = newCodeSystemVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__CODE_SYSTEM_VERSION, oldCodeSystemVersion, codeSystemVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(String newValueSet) {
		String oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__VALUE_SET, oldValueSet, valueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSetVersion() {
		return valueSetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetVersion(String newValueSetVersion) {
		String oldValueSetVersion = valueSetVersion;
		valueSetVersion = newValueSetVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CD__VALUE_SET_VERSION, oldValueSetVersion, valueSetVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.CD__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case R2Package.CD__ORIGINAL_TEXT:
				return basicSetOriginalText(null, msgs);
			case R2Package.CD__TRANSLATION:
				return ((InternalEList<?>)getTranslation()).basicRemove(otherEnd, msgs);
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
			case R2Package.CD__DISPLAY_NAME:
				return getDisplayName();
			case R2Package.CD__ORIGINAL_TEXT:
				return getOriginalText();
			case R2Package.CD__TRANSLATION:
				return getTranslation();
			case R2Package.CD__CODE:
				return getCode();
			case R2Package.CD__CODE_SYSTEM:
				return getCodeSystem();
			case R2Package.CD__CODE_SYSTEM_NAME:
				return getCodeSystemName();
			case R2Package.CD__CODE_SYSTEM_VERSION:
				return getCodeSystemVersion();
			case R2Package.CD__VALUE_SET:
				return getValueSet();
			case R2Package.CD__VALUE_SET_VERSION:
				return getValueSetVersion();
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
			case R2Package.CD__DISPLAY_NAME:
				setDisplayName((ST)newValue);
				return;
			case R2Package.CD__ORIGINAL_TEXT:
				setOriginalText((ST)newValue);
				return;
			case R2Package.CD__TRANSLATION:
				getTranslation().clear();
				getTranslation().addAll((Collection<? extends CD>)newValue);
				return;
			case R2Package.CD__CODE:
				setCode((String)newValue);
				return;
			case R2Package.CD__CODE_SYSTEM:
				setCodeSystem((String)newValue);
				return;
			case R2Package.CD__CODE_SYSTEM_NAME:
				setCodeSystemName((String)newValue);
				return;
			case R2Package.CD__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((String)newValue);
				return;
			case R2Package.CD__VALUE_SET:
				setValueSet((String)newValue);
				return;
			case R2Package.CD__VALUE_SET_VERSION:
				setValueSetVersion((String)newValue);
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
			case R2Package.CD__DISPLAY_NAME:
				setDisplayName((ST)null);
				return;
			case R2Package.CD__ORIGINAL_TEXT:
				setOriginalText((ST)null);
				return;
			case R2Package.CD__TRANSLATION:
				getTranslation().clear();
				return;
			case R2Package.CD__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case R2Package.CD__CODE_SYSTEM:
				setCodeSystem(CODE_SYSTEM_EDEFAULT);
				return;
			case R2Package.CD__CODE_SYSTEM_NAME:
				setCodeSystemName(CODE_SYSTEM_NAME_EDEFAULT);
				return;
			case R2Package.CD__CODE_SYSTEM_VERSION:
				setCodeSystemVersion(CODE_SYSTEM_VERSION_EDEFAULT);
				return;
			case R2Package.CD__VALUE_SET:
				setValueSet(VALUE_SET_EDEFAULT);
				return;
			case R2Package.CD__VALUE_SET_VERSION:
				setValueSetVersion(VALUE_SET_VERSION_EDEFAULT);
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
			case R2Package.CD__DISPLAY_NAME:
				return displayName != null;
			case R2Package.CD__ORIGINAL_TEXT:
				return originalText != null;
			case R2Package.CD__TRANSLATION:
				return translation != null && !translation.isEmpty();
			case R2Package.CD__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case R2Package.CD__CODE_SYSTEM:
				return CODE_SYSTEM_EDEFAULT == null ? codeSystem != null : !CODE_SYSTEM_EDEFAULT.equals(codeSystem);
			case R2Package.CD__CODE_SYSTEM_NAME:
				return CODE_SYSTEM_NAME_EDEFAULT == null ? codeSystemName != null : !CODE_SYSTEM_NAME_EDEFAULT.equals(codeSystemName);
			case R2Package.CD__CODE_SYSTEM_VERSION:
				return CODE_SYSTEM_VERSION_EDEFAULT == null ? codeSystemVersion != null : !CODE_SYSTEM_VERSION_EDEFAULT.equals(codeSystemVersion);
			case R2Package.CD__VALUE_SET:
				return VALUE_SET_EDEFAULT == null ? valueSet != null : !VALUE_SET_EDEFAULT.equals(valueSet);
			case R2Package.CD__VALUE_SET_VERSION:
				return VALUE_SET_VERSION_EDEFAULT == null ? valueSetVersion != null : !VALUE_SET_VERSION_EDEFAULT.equals(valueSetVersion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", codeSystem: ");
		result.append(codeSystem);
		result.append(", codeSystemName: ");
		result.append(codeSystemName);
		result.append(", codeSystemVersion: ");
		result.append(codeSystemVersion);
		result.append(", valueSet: ");
		result.append(valueSet);
		result.append(", valueSetVersion: ");
		result.append(valueSetVersion);
		result.append(')');
		return result.toString();
	}

} //CDImpl
