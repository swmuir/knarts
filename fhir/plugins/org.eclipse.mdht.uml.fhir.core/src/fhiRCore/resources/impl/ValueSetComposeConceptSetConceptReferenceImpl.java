/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.ValueSetComposeConceptSetConceptReference;
import fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation;

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
 * An implementation of the model object '<em><b>Value Set Compose Concept Set Concept Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetConceptReferenceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetConceptReferenceImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetConceptReferenceImpl#getDesignations <em>Designation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetComposeConceptSetConceptReferenceImpl extends BackboneElementImpl implements ValueSetComposeConceptSetConceptReference {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeConceptSetConceptReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getValueSetComposeConceptSetConceptReference();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY, oldDisplay, newDisplay);
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
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSetConceptReferenceDesignation> getDesignations() {
		if (designations == null) {
			designations = new EObjectContainmentEList<ValueSetComposeConceptSetConceptReferenceDesignation>(ValueSetComposeConceptSetConceptReferenceDesignation.class, this, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DESIGNATION);
		}
		return designations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY:
				return basicSetDisplay(null, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DESIGNATION:
				return ((InternalEList<?>)getDesignations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE:
				return getCode();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY:
				return getDisplay();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DESIGNATION:
				return getDesignations();
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DESIGNATION:
				getDesignations().clear();
				getDesignations().addAll((Collection<? extends ValueSetComposeConceptSetConceptReferenceDesignation>)newValue);
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DESIGNATION:
				getDesignations().clear();
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__CODE:
				return code != null;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DISPLAY:
				return display != null;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE__DESIGNATION:
				return designations != null && !designations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeConceptSetConceptReferenceImpl
