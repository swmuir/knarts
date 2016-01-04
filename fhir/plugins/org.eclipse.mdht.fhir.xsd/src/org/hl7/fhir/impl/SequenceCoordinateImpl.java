/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SequenceCoordinate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceCoordinateImpl#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceCoordinateImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceCoordinateImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceCoordinateImpl#getGenomeBuild <em>Genome Build</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceCoordinateImpl extends BackboneElementImpl implements SequenceCoordinate {
	/**
	 * The cached value of the '{@link #getChromosome() <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromosome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept chromosome;

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
	 * The cached value of the '{@link #getGenomeBuild() <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeBuild()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genomeBuild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceCoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceCoordinate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getChromosome() {
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChromosome(CodeableConcept newChromosome, NotificationChain msgs) {
		CodeableConcept oldChromosome = chromosome;
		chromosome = newChromosome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME, oldChromosome, newChromosome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChromosome(CodeableConcept newChromosome) {
		if (newChromosome != chromosome) {
			NotificationChain msgs = null;
			if (chromosome != null)
				msgs = ((InternalEObject)chromosome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME, null, msgs);
			if (newChromosome != null)
				msgs = ((InternalEObject)newChromosome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME, null, msgs);
			msgs = basicSetChromosome(newChromosome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME, newChromosome, newChromosome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__START, oldStart, newStart);
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
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__START, newStart, newStart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenomeBuild() {
		return genomeBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenomeBuild(CodeableConcept newGenomeBuild, NotificationChain msgs) {
		CodeableConcept oldGenomeBuild = genomeBuild;
		genomeBuild = newGenomeBuild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD, oldGenomeBuild, newGenomeBuild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomeBuild(CodeableConcept newGenomeBuild) {
		if (newGenomeBuild != genomeBuild) {
			NotificationChain msgs = null;
			if (genomeBuild != null)
				msgs = ((InternalEObject)genomeBuild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD, null, msgs);
			if (newGenomeBuild != null)
				msgs = ((InternalEObject)newGenomeBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD, null, msgs);
			msgs = basicSetGenomeBuild(newGenomeBuild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD, newGenomeBuild, newGenomeBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME:
				return basicSetChromosome(null, msgs);
			case FhirPackage.SEQUENCE_COORDINATE__START:
				return basicSetStart(null, msgs);
			case FhirPackage.SEQUENCE_COORDINATE__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				return basicSetGenomeBuild(null, msgs);
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
			case FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME:
				return getChromosome();
			case FhirPackage.SEQUENCE_COORDINATE__START:
				return getStart();
			case FhirPackage.SEQUENCE_COORDINATE__END:
				return getEnd();
			case FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				return getGenomeBuild();
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
			case FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME:
				setChromosome((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE_COORDINATE__START:
				setStart((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_COORDINATE__END:
				setEnd((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				setGenomeBuild((CodeableConcept)newValue);
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
			case FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME:
				setChromosome((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE_COORDINATE__START:
				setStart((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_COORDINATE__END:
				setEnd((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				setGenomeBuild((CodeableConcept)null);
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
			case FhirPackage.SEQUENCE_COORDINATE__CHROMOSOME:
				return chromosome != null;
			case FhirPackage.SEQUENCE_COORDINATE__START:
				return start != null;
			case FhirPackage.SEQUENCE_COORDINATE__END:
				return end != null;
			case FhirPackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				return genomeBuild != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceCoordinateImpl
