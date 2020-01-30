/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.UnsignedInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MessageDefinitionFocus;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Definition Focus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionFocusImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionFocusImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionFocusImpl#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionFocusImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDefinitionFocusImpl extends BackboneElementImpl implements MessageDefinitionFocus {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

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
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDefinitionFocusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMessageDefinitionFocus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(StructureDefinition newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(UnsignedInt newMin, NotificationChain msgs) {
		UnsignedInt oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(UnsignedInt newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(fhiRCore.dataTypes.String newMax, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(fhiRCore.dataTypes.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE:
				return basicSetProfile(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN:
				return basicSetMin(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX:
				return basicSetMax(null, msgs);
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
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE:
				return getCode();
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE:
				return getProfile();
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN:
				return getMin();
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX:
				return getMax();
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
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE:
				setProfile((StructureDefinition)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN:
				setMin((UnsignedInt)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX:
				setMax((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE:
				setProfile((StructureDefinition)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN:
				setMin((UnsignedInt)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX:
				setMax((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__CODE:
				return code != null;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__PROFILE:
				return profile != null;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MIN:
				return min != null;
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageDefinitionFocusImpl
