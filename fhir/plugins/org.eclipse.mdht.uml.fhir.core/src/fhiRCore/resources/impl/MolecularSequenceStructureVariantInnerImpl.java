/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MolecularSequenceStructureVariantInner;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Structure Variant Inner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceStructureVariantInnerImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceStructureVariantInnerImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceStructureVariantInnerImpl extends BackboneElementImpl implements MolecularSequenceStructureVariantInner {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceStructureVariantInnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequenceStructureVariantInner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(fhiRCore.dataTypes.Integer newStart, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(fhiRCore.dataTypes.Integer newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(fhiRCore.dataTypes.Integer newEnd, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(fhiRCore.dataTypes.Integer newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START:
				return basicSetStart(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END:
				return basicSetEnd(null, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START:
				return getStart();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END:
				return getEnd();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START:
				setStart((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END:
				setEnd((fhiRCore.dataTypes.Integer)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START:
				setStart((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END:
				setEnd((fhiRCore.dataTypes.Integer)null);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__START:
				return start != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceStructureVariantInnerImpl
