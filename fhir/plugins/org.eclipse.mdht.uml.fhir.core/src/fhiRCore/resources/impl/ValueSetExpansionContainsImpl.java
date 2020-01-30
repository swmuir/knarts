/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation;
import fhiRCore.resources.ValueSetExpansionContains;

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
 * An implementation of the model object '<em><b>Value Set Expansion Contains</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getInactive <em>Inactive</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getDesignations <em>Designation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionContainsImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetExpansionContainsImpl extends BackboneElementImpl implements ValueSetExpansionContains {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean abstract_;

	/**
	 * The cached value of the '{@link #getInactive() <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean inactive;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String version;

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
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String display;

	/**
	 * The cached value of the '{@link #getDesignations() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignations()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSetConceptReferenceDesignation> designations;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetExpansionContains> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetExpansionContainsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getValueSetExpansionContains();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(fhiRCore.dataTypes.Boolean newAbstract, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT, oldAbstract, newAbstract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(fhiRCore.dataTypes.Boolean newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getInactive() {
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInactive(fhiRCore.dataTypes.Boolean newInactive, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE, oldInactive, newInactive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive(fhiRCore.dataTypes.Boolean newInactive) {
		if (newInactive != inactive) {
			NotificationChain msgs = null;
			if (inactive != null)
				msgs = ((InternalEObject)inactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE, null, msgs);
			if (newInactive != null)
				msgs = ((InternalEObject)newInactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE, null, msgs);
			msgs = basicSetInactive(newInactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE, newInactive, newInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(fhiRCore.dataTypes.String newVersion, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(fhiRCore.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(fhiRCore.dataTypes.String newDisplay, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(fhiRCore.dataTypes.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSetConceptReferenceDesignation> getDesignations() {
		if (designations == null) {
			designations = new EObjectContainmentEList<ValueSetComposeConceptSetConceptReferenceDesignation>(ValueSetComposeConceptSetConceptReferenceDesignation.class, this, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DESIGNATION);
		}
		return designations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetExpansionContains> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ValueSetExpansionContains>(ValueSetExpansionContains.class, this, ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				return basicSetSystem(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE:
				return basicSetInactive(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				return basicSetDisplay(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DESIGNATION:
				return ((InternalEList<?>)getDesignations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				return getSystem();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				return getAbstract();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE:
				return getInactive();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				return getVersion();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				return getCode();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				return getDisplay();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DESIGNATION:
				return getDesignations();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
				return getContains();
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
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				setAbstract((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE:
				setInactive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DESIGNATION:
				getDesignations().clear();
				getDesignations().addAll((Collection<? extends ValueSetComposeConceptSetConceptReferenceDesignation>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends ValueSetExpansionContains>)newValue);
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
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				setSystem((Uri)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				setAbstract((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE:
				setInactive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DESIGNATION:
				getDesignations().clear();
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
				getContains().clear();
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
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				return system != null;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				return abstract_ != null;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__INACTIVE:
				return inactive != null;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				return version != null;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				return code != null;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				return display != null;
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__DESIGNATION:
				return designations != null && !designations.isEmpty();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetExpansionContainsImpl
