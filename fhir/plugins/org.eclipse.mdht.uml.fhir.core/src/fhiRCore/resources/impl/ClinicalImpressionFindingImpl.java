/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ClinicalImpressionFinding;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionFindingImpl#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionFindingImpl#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionFindingImpl#getBasis <em>Basis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalImpressionFindingImpl extends BackboneElementImpl implements ClinicalImpressionFinding {
	/**
	 * The cached value of the '{@link #getItemCodeableConcept() <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept itemCodeableConcept;

	/**
	 * The cached value of the '{@link #getItemReference() <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReference()
	 * @generated
	 * @ordered
	 */
	protected Reference itemReference;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String basis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClinicalImpressionFinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getItemCodeableConcept() {
		return itemCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemCodeableConcept(CodeableConcept newItemCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldItemCodeableConcept = itemCodeableConcept;
		itemCodeableConcept = newItemCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, oldItemCodeableConcept, newItemCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemCodeableConcept(CodeableConcept newItemCodeableConcept) {
		if (newItemCodeableConcept != itemCodeableConcept) {
			NotificationChain msgs = null;
			if (itemCodeableConcept != null)
				msgs = ((InternalEObject)itemCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, null, msgs);
			if (newItemCodeableConcept != null)
				msgs = ((InternalEObject)newItemCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetItemCodeableConcept(newItemCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, newItemCodeableConcept, newItemCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getItemReference() {
		return itemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReference(Reference newItemReference, NotificationChain msgs) {
		Reference oldItemReference = itemReference;
		itemReference = newItemReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, oldItemReference, newItemReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReference(Reference newItemReference) {
		if (newItemReference != itemReference) {
			NotificationChain msgs = null;
			if (itemReference != null)
				msgs = ((InternalEObject)itemReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, null, msgs);
			if (newItemReference != null)
				msgs = ((InternalEObject)newItemReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, null, msgs);
			msgs = basicSetItemReference(newItemReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, newItemReference, newItemReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasis(fhiRCore.dataTypes.String newBasis, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS, oldBasis, newBasis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasis(fhiRCore.dataTypes.String newBasis) {
		if (newBasis != basis) {
			NotificationChain msgs = null;
			if (basis != null)
				msgs = ((InternalEObject)basis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS, null, msgs);
			if (newBasis != null)
				msgs = ((InternalEObject)newBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS, null, msgs);
			msgs = basicSetBasis(newBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS, newBasis, newBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				return basicSetItemCodeableConcept(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				return basicSetItemReference(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				return basicSetBasis(null, msgs);
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
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				return getItemCodeableConcept();
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				return getItemReference();
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				return getBasis();
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
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				setItemReference((Reference)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				setBasis((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				setItemReference((Reference)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				setBasis((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				return itemCodeableConcept != null;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				return itemReference != null;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				return basis != null;
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionFindingImpl
