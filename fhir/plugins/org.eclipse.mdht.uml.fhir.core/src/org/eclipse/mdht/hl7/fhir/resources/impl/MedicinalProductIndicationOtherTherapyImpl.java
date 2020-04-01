/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductIndicationOtherTherapy;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Indication Other Therapy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationOtherTherapyImpl#getTherapyRelationshipType <em>Therapy Relationship Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationOtherTherapyImpl#getMedicationx <em>Medicationx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIndicationOtherTherapyImpl extends BackboneElementImpl implements MedicinalProductIndicationOtherTherapy {
	/**
	 * The cached value of the '{@link #getTherapyRelationshipType() <em>Therapy Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTherapyRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept therapyRelationshipType;

	/**
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected DataType medicationx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIndicationOtherTherapyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductIndicationOtherTherapy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTherapyRelationshipType() {
		return therapyRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTherapyRelationshipType(CodeableConcept newTherapyRelationshipType, NotificationChain msgs) {
		CodeableConcept oldTherapyRelationshipType = therapyRelationshipType;
		therapyRelationshipType = newTherapyRelationshipType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, oldTherapyRelationshipType, newTherapyRelationshipType);
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
	public void setTherapyRelationshipType(CodeableConcept newTherapyRelationshipType) {
		if (newTherapyRelationshipType != therapyRelationshipType) {
			NotificationChain msgs = null;
			if (therapyRelationshipType != null)
				msgs = ((InternalEObject)therapyRelationshipType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, null, msgs);
			if (newTherapyRelationshipType != null)
				msgs = ((InternalEObject)newTherapyRelationshipType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, null, msgs);
			msgs = basicSetTherapyRelationshipType(newTherapyRelationshipType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, newTherapyRelationshipType, newTherapyRelationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getMedicationx() {
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationx(DataType newMedicationx, NotificationChain msgs) {
		DataType oldMedicationx = medicationx;
		medicationx = newMedicationx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX, oldMedicationx, newMedicationx);
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
	public void setMedicationx(DataType newMedicationx) {
		if (newMedicationx != medicationx) {
			NotificationChain msgs = null;
			if (medicationx != null)
				msgs = ((InternalEObject)medicationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX, null, msgs);
			if (newMedicationx != null)
				msgs = ((InternalEObject)newMedicationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX, null, msgs);
			msgs = basicSetMedicationx(newMedicationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX, newMedicationx, newMedicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				return basicSetTherapyRelationshipType(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX:
				return basicSetMedicationx(null, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				return getTherapyRelationshipType();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX:
				return getMedicationx();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				setTherapyRelationshipType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX:
				setMedicationx((DataType)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				setTherapyRelationshipType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX:
				setMedicationx((DataType)null);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				return therapyRelationshipType != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY__MEDICATIONX:
				return medicationx != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIndicationOtherTherapyImpl
