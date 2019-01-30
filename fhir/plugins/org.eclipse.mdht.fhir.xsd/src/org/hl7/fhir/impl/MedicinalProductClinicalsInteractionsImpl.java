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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductClinicalsInteractions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Clinicals Interactions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsInteractionsImpl#getInteractant <em>Interactant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsInteractionsImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsInteractionsImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsInteractionsImpl#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsInteractionsImpl#getManagement <em>Management</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductClinicalsInteractionsImpl extends BackboneElementImpl implements MedicinalProductClinicalsInteractions {
	/**
	 * The cached value of the '{@link #getInteractant() <em>Interactant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractant()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> interactant;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept effect;

	/**
	 * The cached value of the '{@link #getIncidence() <em>Incidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept incidence;

	/**
	 * The cached value of the '{@link #getManagement() <em>Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagement()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept management;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductClinicalsInteractionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductClinicalsInteractions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getInteractant() {
		if (interactant == null) {
			interactant = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INTERACTANT);
		}
		return interactant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(CodeableConcept newEffect, NotificationChain msgs) {
		CodeableConcept oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(CodeableConcept newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getIncidence() {
		return incidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncidence(CodeableConcept newIncidence, NotificationChain msgs) {
		CodeableConcept oldIncidence = incidence;
		incidence = newIncidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE, oldIncidence, newIncidence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence(CodeableConcept newIncidence) {
		if (newIncidence != incidence) {
			NotificationChain msgs = null;
			if (incidence != null)
				msgs = ((InternalEObject)incidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE, null, msgs);
			if (newIncidence != null)
				msgs = ((InternalEObject)newIncidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE, null, msgs);
			msgs = basicSetIncidence(newIncidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE, newIncidence, newIncidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getManagement() {
		return management;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagement(CodeableConcept newManagement, NotificationChain msgs) {
		CodeableConcept oldManagement = management;
		management = newManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT, oldManagement, newManagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagement(CodeableConcept newManagement) {
		if (newManagement != management) {
			NotificationChain msgs = null;
			if (management != null)
				msgs = ((InternalEObject)management).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT, null, msgs);
			if (newManagement != null)
				msgs = ((InternalEObject)newManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT, null, msgs);
			msgs = basicSetManagement(newManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT, newManagement, newManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INTERACTANT:
				return ((InternalEList<?>)getInteractant()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT:
				return basicSetEffect(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE:
				return basicSetIncidence(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT:
				return basicSetManagement(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INTERACTANT:
				return getInteractant();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT:
				return getEffect();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE:
				return getIncidence();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT:
				return getManagement();
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INTERACTANT:
				getInteractant().clear();
				getInteractant().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT:
				setEffect((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE:
				setIncidence((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT:
				setManagement((CodeableConcept)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INTERACTANT:
				getInteractant().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT:
				setEffect((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE:
				setIncidence((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT:
				setManagement((CodeableConcept)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INTERACTANT:
				return interactant != null && !interactant.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__EFFECT:
				return effect != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__INCIDENCE:
				return incidence != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_INTERACTIONS__MANAGEMENT:
				return management != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductClinicalsInteractionsImpl
