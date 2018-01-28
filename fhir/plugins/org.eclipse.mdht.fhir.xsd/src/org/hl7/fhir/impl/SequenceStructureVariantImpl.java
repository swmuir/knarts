/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SequenceInner;
import org.hl7.fhir.SequenceOuter;
import org.hl7.fhir.SequenceStructureVariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Structure Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getReportedaCGHRatio <em>Reporteda CGH Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceStructureVariantImpl extends BackboneElementImpl implements SequenceStructureVariant {
	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String precision;

	/**
	 * The cached value of the '{@link #getReportedaCGHRatio() <em>Reporteda CGH Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedaCGHRatio()
	 * @generated
	 * @ordered
	 */
	protected Decimal reportedaCGHRatio;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer length;

	/**
	 * The cached value of the '{@link #getOuter() <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter()
	 * @generated
	 * @ordered
	 */
	protected SequenceOuter outer;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected SequenceInner inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceStructureVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceStructureVariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecision(org.hl7.fhir.String newPrecision, NotificationChain msgs) {
		org.hl7.fhir.String oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION, oldPrecision, newPrecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(org.hl7.fhir.String newPrecision) {
		if (newPrecision != precision) {
			NotificationChain msgs = null;
			if (precision != null)
				msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION, null, msgs);
			if (newPrecision != null)
				msgs = ((InternalEObject)newPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION, null, msgs);
			msgs = basicSetPrecision(newPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION, newPrecision, newPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getReportedaCGHRatio() {
		return reportedaCGHRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedaCGHRatio(Decimal newReportedaCGHRatio, NotificationChain msgs) {
		Decimal oldReportedaCGHRatio = reportedaCGHRatio;
		reportedaCGHRatio = newReportedaCGHRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, oldReportedaCGHRatio, newReportedaCGHRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedaCGHRatio(Decimal newReportedaCGHRatio) {
		if (newReportedaCGHRatio != reportedaCGHRatio) {
			NotificationChain msgs = null;
			if (reportedaCGHRatio != null)
				msgs = ((InternalEObject)reportedaCGHRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, null, msgs);
			if (newReportedaCGHRatio != null)
				msgs = ((InternalEObject)newReportedaCGHRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, null, msgs);
			msgs = basicSetReportedaCGHRatio(newReportedaCGHRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, newReportedaCGHRatio, newReportedaCGHRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(org.hl7.fhir.Integer newLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(org.hl7.fhir.Integer newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceOuter getOuter() {
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuter(SequenceOuter newOuter, NotificationChain msgs) {
		SequenceOuter oldOuter = outer;
		outer = newOuter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, oldOuter, newOuter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter(SequenceOuter newOuter) {
		if (newOuter != outer) {
			NotificationChain msgs = null;
			if (outer != null)
				msgs = ((InternalEObject)outer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			if (newOuter != null)
				msgs = ((InternalEObject)newOuter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			msgs = basicSetOuter(newOuter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, newOuter, newOuter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceInner getInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInner(SequenceInner newInner, NotificationChain msgs) {
		SequenceInner oldInner = inner;
		inner = newInner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, oldInner, newInner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInner(SequenceInner newInner) {
		if (newInner != inner) {
			NotificationChain msgs = null;
			if (inner != null)
				msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			if (newInner != null)
				msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			msgs = basicSetInner(newInner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, newInner, newInner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION:
				return basicSetPrecision(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				return basicSetReportedaCGHRatio(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return basicSetOuter(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION:
				return getPrecision();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				return getReportedaCGHRatio();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return getLength();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return getOuter();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION:
				setPrecision((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				setReportedaCGHRatio((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((SequenceOuter)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((SequenceInner)newValue);
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION:
				setPrecision((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				setReportedaCGHRatio((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((SequenceOuter)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((SequenceInner)null);
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION:
				return precision != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				return reportedaCGHRatio != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return length != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return outer != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				return inner != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceStructureVariantImpl
