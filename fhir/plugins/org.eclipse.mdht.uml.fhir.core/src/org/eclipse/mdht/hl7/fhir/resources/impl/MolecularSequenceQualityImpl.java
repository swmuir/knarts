/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceQuality;
import org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceQualityRoc;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getStandardSequence <em>Standard Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getTruthTp <em>Truth Tp</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getQueryTp <em>Query Tp</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getTruthFn <em>Truth Fn</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getQueryFp <em>Query Fp</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getGtFp <em>Gt Fp</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getRecall <em>Recall</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getFScore <em>FScore</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityImpl#getRoc <em>Roc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceQualityImpl extends BackboneElementImpl implements MolecularSequenceQuality {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getStandardSequence() <em>Standard Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSequence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept standardSequence;

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
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Quantity score;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getTruthTp() <em>Truth Tp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthTp()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthTp;

	/**
	 * The cached value of the '{@link #getQueryTp() <em>Query Tp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryTp()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryTp;

	/**
	 * The cached value of the '{@link #getTruthFn() <em>Truth Fn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthFn()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthFn;

	/**
	 * The cached value of the '{@link #getQueryFp() <em>Query Fp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryFp()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryFp;

	/**
	 * The cached value of the '{@link #getGtFp() <em>Gt Fp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGtFp()
	 * @generated
	 * @ordered
	 */
	protected Decimal gtFp;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Decimal precision;

	/**
	 * The cached value of the '{@link #getRecall() <em>Recall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecall()
	 * @generated
	 * @ordered
	 */
	protected Decimal recall;

	/**
	 * The cached value of the '{@link #getFScore() <em>FScore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal fScore;

	/**
	 * The cached value of the '{@link #getRoc() <em>Roc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoc()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceQualityRoc roc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequenceQuality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, oldType, newType);
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
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStandardSequence() {
		return standardSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardSequence(CodeableConcept newStandardSequence, NotificationChain msgs) {
		CodeableConcept oldStandardSequence = standardSequence;
		standardSequence = newStandardSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, oldStandardSequence, newStandardSequence);
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
	public void setStandardSequence(CodeableConcept newStandardSequence) {
		if (newStandardSequence != standardSequence) {
			NotificationChain msgs = null;
			if (standardSequence != null)
				msgs = ((InternalEObject)standardSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, null, msgs);
			if (newStandardSequence != null)
				msgs = ((InternalEObject)newStandardSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, null, msgs);
			msgs = basicSetStandardSequence(newStandardSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, newStandardSequence, newStandardSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START, oldStart, newStart);
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
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START, newStart, newStart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Quantity newScore, NotificationChain msgs) {
		Quantity oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, oldScore, newScore);
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
	public void setScore(Quantity newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, oldMethod, newMethod);
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
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getTruthTp() {
		return truthTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruthTp(Decimal newTruthTp, NotificationChain msgs) {
		Decimal oldTruthTp = truthTp;
		truthTp = newTruthTp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, oldTruthTp, newTruthTp);
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
	public void setTruthTp(Decimal newTruthTp) {
		if (newTruthTp != truthTp) {
			NotificationChain msgs = null;
			if (truthTp != null)
				msgs = ((InternalEObject)truthTp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, null, msgs);
			if (newTruthTp != null)
				msgs = ((InternalEObject)newTruthTp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, null, msgs);
			msgs = basicSetTruthTp(newTruthTp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, newTruthTp, newTruthTp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getQueryTp() {
		return queryTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryTp(Decimal newQueryTp, NotificationChain msgs) {
		Decimal oldQueryTp = queryTp;
		queryTp = newQueryTp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, oldQueryTp, newQueryTp);
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
	public void setQueryTp(Decimal newQueryTp) {
		if (newQueryTp != queryTp) {
			NotificationChain msgs = null;
			if (queryTp != null)
				msgs = ((InternalEObject)queryTp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, null, msgs);
			if (newQueryTp != null)
				msgs = ((InternalEObject)newQueryTp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, null, msgs);
			msgs = basicSetQueryTp(newQueryTp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, newQueryTp, newQueryTp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getTruthFn() {
		return truthFn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruthFn(Decimal newTruthFn, NotificationChain msgs) {
		Decimal oldTruthFn = truthFn;
		truthFn = newTruthFn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, oldTruthFn, newTruthFn);
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
	public void setTruthFn(Decimal newTruthFn) {
		if (newTruthFn != truthFn) {
			NotificationChain msgs = null;
			if (truthFn != null)
				msgs = ((InternalEObject)truthFn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, null, msgs);
			if (newTruthFn != null)
				msgs = ((InternalEObject)newTruthFn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, null, msgs);
			msgs = basicSetTruthFn(newTruthFn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, newTruthFn, newTruthFn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getQueryFp() {
		return queryFp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFp(Decimal newQueryFp, NotificationChain msgs) {
		Decimal oldQueryFp = queryFp;
		queryFp = newQueryFp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, oldQueryFp, newQueryFp);
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
	public void setQueryFp(Decimal newQueryFp) {
		if (newQueryFp != queryFp) {
			NotificationChain msgs = null;
			if (queryFp != null)
				msgs = ((InternalEObject)queryFp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, null, msgs);
			if (newQueryFp != null)
				msgs = ((InternalEObject)newQueryFp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, null, msgs);
			msgs = basicSetQueryFp(newQueryFp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, newQueryFp, newQueryFp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getGtFp() {
		return gtFp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGtFp(Decimal newGtFp, NotificationChain msgs) {
		Decimal oldGtFp = gtFp;
		gtFp = newGtFp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, oldGtFp, newGtFp);
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
	public void setGtFp(Decimal newGtFp) {
		if (newGtFp != gtFp) {
			NotificationChain msgs = null;
			if (gtFp != null)
				msgs = ((InternalEObject)gtFp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, null, msgs);
			if (newGtFp != null)
				msgs = ((InternalEObject)newGtFp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, null, msgs);
			msgs = basicSetGtFp(newGtFp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, newGtFp, newGtFp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecision(Decimal newPrecision, NotificationChain msgs) {
		Decimal oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, oldPrecision, newPrecision);
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
	public void setPrecision(Decimal newPrecision) {
		if (newPrecision != precision) {
			NotificationChain msgs = null;
			if (precision != null)
				msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, null, msgs);
			if (newPrecision != null)
				msgs = ((InternalEObject)newPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, null, msgs);
			msgs = basicSetPrecision(newPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, newPrecision, newPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getRecall() {
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecall(Decimal newRecall, NotificationChain msgs) {
		Decimal oldRecall = recall;
		recall = newRecall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, oldRecall, newRecall);
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
	public void setRecall(Decimal newRecall) {
		if (newRecall != recall) {
			NotificationChain msgs = null;
			if (recall != null)
				msgs = ((InternalEObject)recall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, null, msgs);
			if (newRecall != null)
				msgs = ((InternalEObject)newRecall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, null, msgs);
			msgs = basicSetRecall(newRecall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, newRecall, newRecall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFScore() {
		return fScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFScore(Decimal newFScore, NotificationChain msgs) {
		Decimal oldFScore = fScore;
		fScore = newFScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, oldFScore, newFScore);
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
	public void setFScore(Decimal newFScore) {
		if (newFScore != fScore) {
			NotificationChain msgs = null;
			if (fScore != null)
				msgs = ((InternalEObject)fScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, null, msgs);
			if (newFScore != null)
				msgs = ((InternalEObject)newFScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, null, msgs);
			msgs = basicSetFScore(newFScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, newFScore, newFScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceQualityRoc getRoc() {
		return roc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoc(MolecularSequenceQualityRoc newRoc, NotificationChain msgs) {
		MolecularSequenceQualityRoc oldRoc = roc;
		roc = newRoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, oldRoc, newRoc);
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
	public void setRoc(MolecularSequenceQualityRoc newRoc) {
		if (newRoc != roc) {
			NotificationChain msgs = null;
			if (roc != null)
				msgs = ((InternalEObject)roc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, null, msgs);
			if (newRoc != null)
				msgs = ((InternalEObject)newRoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, null, msgs);
			msgs = basicSetRoc(newRoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, newRoc, newRoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return basicSetStandardSequence(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				return basicSetStart(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				return basicSetEnd(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				return basicSetScore(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				return basicSetMethod(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				return basicSetTruthTp(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				return basicSetQueryTp(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				return basicSetTruthFn(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				return basicSetQueryFp(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				return basicSetGtFp(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				return basicSetPrecision(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				return basicSetRecall(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				return basicSetFScore(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				return basicSetRoc(null, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				return getType();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return getStandardSequence();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				return getStart();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				return getEnd();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				return getScore();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				return getMethod();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				return getTruthTp();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				return getQueryTp();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				return getTruthFn();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				return getQueryFp();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				return getGtFp();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				return getPrecision();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				return getRecall();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				return getFScore();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				return getRoc();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				setStart((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				setEnd((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTp((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				setQueryTp((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFn((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				setQueryFp((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				setGtFp((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				setRoc((MolecularSequenceQualityRoc)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				setStart((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				setEnd((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTp((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				setQueryTp((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFn((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				setQueryFp((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				setGtFp((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				setRoc((MolecularSequenceQualityRoc)null);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				return type != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return standardSequence != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				return start != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				return end != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				return score != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				return method != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				return truthTp != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				return queryTp != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				return truthFn != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				return queryFp != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				return gtFp != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				return precision != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				return recall != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				return fScore != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				return roc != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceQualityImpl
