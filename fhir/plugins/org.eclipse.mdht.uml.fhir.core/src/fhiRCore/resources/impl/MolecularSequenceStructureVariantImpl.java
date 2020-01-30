/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MolecularSequenceStructureVariant;
import fhiRCore.resources.MolecularSequenceStructureVariantInner;
import fhiRCore.resources.MolecularSequenceStructureVariantOuter;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Structure Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceStructureVariantImpl#getVariantType <em>Variant Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceStructureVariantImpl#getExact <em>Exact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceStructureVariantImpl#getLength <em>Length</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceStructureVariantImpl#getOuter <em>Outer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceStructureVariantImpl#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceStructureVariantImpl extends BackboneElementImpl implements MolecularSequenceStructureVariant {
	/**
	 * The cached value of the '{@link #getVariantType() <em>Variant Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept variantType;

	/**
	 * The cached value of the '{@link #getExact() <em>Exact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExact()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean exact;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer length;

	/**
	 * The cached value of the '{@link #getOuter() <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceStructureVariantOuter outer;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceStructureVariantInner inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceStructureVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequenceStructureVariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVariantType() {
		return variantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantType(CodeableConcept newVariantType, NotificationChain msgs) {
		CodeableConcept oldVariantType = variantType;
		variantType = newVariantType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, oldVariantType, newVariantType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantType(CodeableConcept newVariantType) {
		if (newVariantType != variantType) {
			NotificationChain msgs = null;
			if (variantType != null)
				msgs = ((InternalEObject)variantType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, null, msgs);
			if (newVariantType != null)
				msgs = ((InternalEObject)newVariantType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, null, msgs);
			msgs = basicSetVariantType(newVariantType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, newVariantType, newVariantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getExact() {
		return exact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExact(fhiRCore.dataTypes.Boolean newExact, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldExact = exact;
		exact = newExact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, oldExact, newExact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExact(fhiRCore.dataTypes.Boolean newExact) {
		if (newExact != exact) {
			NotificationChain msgs = null;
			if (exact != null)
				msgs = ((InternalEObject)exact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, null, msgs);
			if (newExact != null)
				msgs = ((InternalEObject)newExact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, null, msgs);
			msgs = basicSetExact(newExact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, newExact, newExact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(fhiRCore.dataTypes.Integer newLength, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(fhiRCore.dataTypes.Integer newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequenceStructureVariantOuter getOuter() {
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuter(MolecularSequenceStructureVariantOuter newOuter, NotificationChain msgs) {
		MolecularSequenceStructureVariantOuter oldOuter = outer;
		outer = newOuter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, oldOuter, newOuter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter(MolecularSequenceStructureVariantOuter newOuter) {
		if (newOuter != outer) {
			NotificationChain msgs = null;
			if (outer != null)
				msgs = ((InternalEObject)outer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			if (newOuter != null)
				msgs = ((InternalEObject)newOuter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			msgs = basicSetOuter(newOuter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, newOuter, newOuter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequenceStructureVariantInner getInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInner(MolecularSequenceStructureVariantInner newInner, NotificationChain msgs) {
		MolecularSequenceStructureVariantInner oldInner = inner;
		inner = newInner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, oldInner, newInner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInner(MolecularSequenceStructureVariantInner newInner) {
		if (newInner != inner) {
			NotificationChain msgs = null;
			if (inner != null)
				msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			if (newInner != null)
				msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			msgs = basicSetInner(newInner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, newInner, newInner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				return basicSetVariantType(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				return basicSetExact(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return basicSetLength(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return basicSetOuter(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				return basicSetInner(null, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				return getVariantType();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				return getExact();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return getLength();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return getOuter();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				return getInner();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				setVariantType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				setExact((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((MolecularSequenceStructureVariantOuter)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((MolecularSequenceStructureVariantInner)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				setVariantType((CodeableConcept)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				setExact((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((MolecularSequenceStructureVariantOuter)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((MolecularSequenceStructureVariantInner)null);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				return variantType != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				return exact != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return length != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return outer != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				return inner != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceStructureVariantImpl
