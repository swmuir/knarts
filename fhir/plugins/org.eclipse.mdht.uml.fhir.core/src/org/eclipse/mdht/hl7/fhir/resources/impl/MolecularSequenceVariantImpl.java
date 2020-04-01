/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceVariantImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceVariantImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceVariantImpl#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceVariantImpl#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceVariantImpl#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceVariantImpl#getVariantPointer <em>Variant Pointer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceVariantImpl extends BackboneElementImpl implements MolecularSequenceVariant {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer end;

	/**
	 * The cached value of the '{@link #getObservedAllele() <em>Observed Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedAllele()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String observedAllele;

	/**
	 * The cached value of the '{@link #getReferenceAllele() <em>Reference Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAllele()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String referenceAllele;

	/**
	 * The cached value of the '{@link #getCigar() <em>Cigar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCigar()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String cigar;

	/**
	 * The cached value of the '{@link #getVariantPointer() <em>Variant Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantPointer()
	 * @generated
	 * @ordered
	 */
	protected Reference variantPointer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequenceVariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newStart, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START, oldStart, newStart);
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
	public void setStart(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newEnd, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END, oldEnd, newEnd);
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
	public void setEnd(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getObservedAllele() {
		return observedAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String newObservedAllele, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldObservedAllele = observedAllele;
		observedAllele = newObservedAllele;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE, oldObservedAllele, newObservedAllele);
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
	public void setObservedAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String newObservedAllele) {
		if (newObservedAllele != observedAllele) {
			NotificationChain msgs = null;
			if (observedAllele != null)
				msgs = ((InternalEObject)observedAllele).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE, null, msgs);
			if (newObservedAllele != null)
				msgs = ((InternalEObject)newObservedAllele).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE, null, msgs);
			msgs = basicSetObservedAllele(newObservedAllele, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE, newObservedAllele, newObservedAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getReferenceAllele() {
		return referenceAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String newReferenceAllele, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldReferenceAllele = referenceAllele;
		referenceAllele = newReferenceAllele;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE, oldReferenceAllele, newReferenceAllele);
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
	public void setReferenceAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String newReferenceAllele) {
		if (newReferenceAllele != referenceAllele) {
			NotificationChain msgs = null;
			if (referenceAllele != null)
				msgs = ((InternalEObject)referenceAllele).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE, null, msgs);
			if (newReferenceAllele != null)
				msgs = ((InternalEObject)newReferenceAllele).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE, null, msgs);
			msgs = basicSetReferenceAllele(newReferenceAllele, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE, newReferenceAllele, newReferenceAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getCigar() {
		return cigar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCigar(org.eclipse.mdht.hl7.fhir.dataTypes.String newCigar, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldCigar = cigar;
		cigar = newCigar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR, oldCigar, newCigar);
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
	public void setCigar(org.eclipse.mdht.hl7.fhir.dataTypes.String newCigar) {
		if (newCigar != cigar) {
			NotificationChain msgs = null;
			if (cigar != null)
				msgs = ((InternalEObject)cigar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR, null, msgs);
			if (newCigar != null)
				msgs = ((InternalEObject)newCigar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR, null, msgs);
			msgs = basicSetCigar(newCigar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR, newCigar, newCigar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getVariantPointer() {
		return variantPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantPointer(Reference newVariantPointer, NotificationChain msgs) {
		Reference oldVariantPointer = variantPointer;
		variantPointer = newVariantPointer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER, oldVariantPointer, newVariantPointer);
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
	public void setVariantPointer(Reference newVariantPointer) {
		if (newVariantPointer != variantPointer) {
			NotificationChain msgs = null;
			if (variantPointer != null)
				msgs = ((InternalEObject)variantPointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER, null, msgs);
			if (newVariantPointer != null)
				msgs = ((InternalEObject)newVariantPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER, null, msgs);
			msgs = basicSetVariantPointer(newVariantPointer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER, newVariantPointer, newVariantPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START:
				return basicSetStart(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END:
				return basicSetEnd(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE:
				return basicSetObservedAllele(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE:
				return basicSetReferenceAllele(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR:
				return basicSetCigar(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER:
				return basicSetVariantPointer(null, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START:
				return getStart();
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END:
				return getEnd();
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE:
				return getObservedAllele();
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE:
				return getReferenceAllele();
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR:
				return getCigar();
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER:
				return getVariantPointer();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START:
				setStart((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END:
				setEnd((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE:
				setObservedAllele((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE:
				setReferenceAllele((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR:
				setCigar((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER:
				setVariantPointer((Reference)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START:
				setStart((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END:
				setEnd((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE:
				setObservedAllele((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE:
				setReferenceAllele((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR:
				setCigar((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER:
				setVariantPointer((Reference)null);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__START:
				return start != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__END:
				return end != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__OBSERVED_ALLELE:
				return observedAllele != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__REFERENCE_ALLELE:
				return referenceAllele != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__CIGAR:
				return cigar != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT__VARIANT_POINTER:
				return variantPointer != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceVariantImpl
