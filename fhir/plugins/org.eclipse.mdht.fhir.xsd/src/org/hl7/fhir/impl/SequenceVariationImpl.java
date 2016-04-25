/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SequenceVariation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Variation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceVariationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceVariationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceVariationImpl#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceVariationImpl#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceVariationImpl#getCigar <em>Cigar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceVariationImpl extends BackboneElementImpl implements SequenceVariation {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer end;

	/**
	 * The cached value of the '{@link #getObservedAllele() <em>Observed Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedAllele()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String observedAllele;

	/**
	 * The cached value of the '{@link #getReferenceAllele() <em>Reference Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAllele()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String referenceAllele;

	/**
	 * The cached value of the '{@link #getCigar() <em>Cigar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCigar()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String cigar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceVariationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceVariation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(org.hl7.fhir.Integer newStart, NotificationChain msgs) {
		org.hl7.fhir.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(org.hl7.fhir.Integer newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(org.hl7.fhir.Integer newEnd, NotificationChain msgs) {
		org.hl7.fhir.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(org.hl7.fhir.Integer newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getObservedAllele() {
		return observedAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedAllele(org.hl7.fhir.String newObservedAllele, NotificationChain msgs) {
		org.hl7.fhir.String oldObservedAllele = observedAllele;
		observedAllele = newObservedAllele;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE, oldObservedAllele, newObservedAllele);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedAllele(org.hl7.fhir.String newObservedAllele) {
		if (newObservedAllele != observedAllele) {
			NotificationChain msgs = null;
			if (observedAllele != null)
				msgs = ((InternalEObject)observedAllele).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE, null, msgs);
			if (newObservedAllele != null)
				msgs = ((InternalEObject)newObservedAllele).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE, null, msgs);
			msgs = basicSetObservedAllele(newObservedAllele, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE, newObservedAllele, newObservedAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReferenceAllele() {
		return referenceAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAllele(org.hl7.fhir.String newReferenceAllele, NotificationChain msgs) {
		org.hl7.fhir.String oldReferenceAllele = referenceAllele;
		referenceAllele = newReferenceAllele;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE, oldReferenceAllele, newReferenceAllele);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAllele(org.hl7.fhir.String newReferenceAllele) {
		if (newReferenceAllele != referenceAllele) {
			NotificationChain msgs = null;
			if (referenceAllele != null)
				msgs = ((InternalEObject)referenceAllele).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE, null, msgs);
			if (newReferenceAllele != null)
				msgs = ((InternalEObject)newReferenceAllele).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE, null, msgs);
			msgs = basicSetReferenceAllele(newReferenceAllele, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE, newReferenceAllele, newReferenceAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCigar() {
		return cigar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCigar(org.hl7.fhir.String newCigar, NotificationChain msgs) {
		org.hl7.fhir.String oldCigar = cigar;
		cigar = newCigar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__CIGAR, oldCigar, newCigar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCigar(org.hl7.fhir.String newCigar) {
		if (newCigar != cigar) {
			NotificationChain msgs = null;
			if (cigar != null)
				msgs = ((InternalEObject)cigar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__CIGAR, null, msgs);
			if (newCigar != null)
				msgs = ((InternalEObject)newCigar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_VARIATION__CIGAR, null, msgs);
			msgs = basicSetCigar(newCigar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_VARIATION__CIGAR, newCigar, newCigar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_VARIATION__START:
				return basicSetStart(null, msgs);
			case FhirPackage.SEQUENCE_VARIATION__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE:
				return basicSetObservedAllele(null, msgs);
			case FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE:
				return basicSetReferenceAllele(null, msgs);
			case FhirPackage.SEQUENCE_VARIATION__CIGAR:
				return basicSetCigar(null, msgs);
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
			case FhirPackage.SEQUENCE_VARIATION__START:
				return getStart();
			case FhirPackage.SEQUENCE_VARIATION__END:
				return getEnd();
			case FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE:
				return getObservedAllele();
			case FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE:
				return getReferenceAllele();
			case FhirPackage.SEQUENCE_VARIATION__CIGAR:
				return getCigar();
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
			case FhirPackage.SEQUENCE_VARIATION__START:
				setStart((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_VARIATION__END:
				setEnd((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE:
				setObservedAllele((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE:
				setReferenceAllele((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_VARIATION__CIGAR:
				setCigar((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SEQUENCE_VARIATION__START:
				setStart((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_VARIATION__END:
				setEnd((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE:
				setObservedAllele((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE:
				setReferenceAllele((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_VARIATION__CIGAR:
				setCigar((org.hl7.fhir.String)null);
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
			case FhirPackage.SEQUENCE_VARIATION__START:
				return start != null;
			case FhirPackage.SEQUENCE_VARIATION__END:
				return end != null;
			case FhirPackage.SEQUENCE_VARIATION__OBSERVED_ALLELE:
				return observedAllele != null;
			case FhirPackage.SEQUENCE_VARIATION__REFERENCE_ALLELE:
				return referenceAllele != null;
			case FhirPackage.SEQUENCE_VARIATION__CIGAR:
				return cigar != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceVariationImpl
