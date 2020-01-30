/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicationDispenseSubstitution;
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
 * An implementation of the model object '<em><b>Medication Dispense Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseSubstitutionImpl#getWasSubstituted <em>Was Substituted</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseSubstitutionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseSubstitutionImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseSubstitutionImpl#getResponsibleParties <em>Responsible Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationDispenseSubstitutionImpl extends BackboneElementImpl implements MedicationDispenseSubstitution {
	/**
	 * The cached value of the '{@link #getWasSubstituted() <em>Was Substituted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasSubstituted()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean wasSubstituted;

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
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasons;

	/**
	 * The cached value of the '{@link #getResponsibleParties() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParties()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> responsibleParties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationDispenseSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getWasSubstituted() {
		return wasSubstituted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasSubstituted(fhiRCore.dataTypes.Boolean newWasSubstituted, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldWasSubstituted = wasSubstituted;
		wasSubstituted = newWasSubstituted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, oldWasSubstituted, newWasSubstituted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasSubstituted(fhiRCore.dataTypes.Boolean newWasSubstituted) {
		if (newWasSubstituted != wasSubstituted) {
			NotificationChain msgs = null;
			if (wasSubstituted != null)
				msgs = ((InternalEObject)wasSubstituted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, null, msgs);
			if (newWasSubstituted != null)
				msgs = ((InternalEObject)newWasSubstituted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, null, msgs);
			msgs = basicSetWasSubstituted(newWasSubstituted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, newWasSubstituted, newWasSubstituted));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getResponsibleParties() {
		if (responsibleParties == null) {
			responsibleParties = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY);
		}
		return responsibleParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				return basicSetWasSubstituted(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return ((InternalEList<?>)getReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParties()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				return getWasSubstituted();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				return getType();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return getReasons();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return getResponsibleParties();
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
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				setWasSubstituted((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				getResponsibleParties().clear();
				getResponsibleParties().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				setWasSubstituted((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				getResponsibleParties().clear();
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
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				return wasSubstituted != null;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				return type != null;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return responsibleParties != null && !responsibleParties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseSubstitutionImpl
