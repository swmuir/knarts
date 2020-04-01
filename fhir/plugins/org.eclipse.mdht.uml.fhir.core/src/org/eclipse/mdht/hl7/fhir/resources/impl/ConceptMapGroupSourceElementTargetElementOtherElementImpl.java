/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CodeSystem;
import org.eclipse.mdht.hl7.fhir.resources.ConceptMapGroupSourceElementTargetElementOtherElement;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Group Source Element Target Element Other Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementOtherElementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementOtherElementImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementOtherElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementOtherElementImpl#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapGroupSourceElementTargetElementOtherElementImpl extends BackboneElementImpl implements ConceptMapGroupSourceElementTargetElementOtherElement {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Uri property;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected CodeSystem system;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String value;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String display;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapGroupSourceElementTargetElementOtherElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConceptMapGroupSourceElementTargetElementOtherElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(Uri newProperty, NotificationChain msgs) {
		Uri oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY, oldProperty, newProperty);
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
	public void setProperty(Uri newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystem getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(CodeSystem newSystem, NotificationChain msgs) {
		CodeSystem oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM, oldSystem, newSystem);
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
	public void setSystem(CodeSystem newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(org.eclipse.mdht.hl7.fhir.dataTypes.String newValue, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE, oldValue, newValue);
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
	public void setValue(org.eclipse.mdht.hl7.fhir.dataTypes.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.eclipse.mdht.hl7.fhir.dataTypes.String newDisplay, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(org.eclipse.mdht.hl7.fhir.dataTypes.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				return basicSetProperty(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				return basicSetSystem(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE:
				return basicSetValue(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY:
				return basicSetDisplay(null, msgs);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				return getProperty();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				return getSystem();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE:
				return getValue();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY:
				return getDisplay();
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				setProperty((Uri)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				setSystem((CodeSystem)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE:
				setValue((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY:
				setDisplay((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				setProperty((Uri)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				setSystem((CodeSystem)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE:
				setValue((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY:
				setDisplay((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				return property != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				return system != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__VALUE:
				return value != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__DISPLAY:
				return display != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapGroupSourceElementTargetElementOtherElementImpl
