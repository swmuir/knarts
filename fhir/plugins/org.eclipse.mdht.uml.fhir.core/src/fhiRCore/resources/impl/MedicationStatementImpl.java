/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.MedicationStatement;
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
 * An implementation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getStatusReasons <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationStatementImpl#getDosages <em>Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationStatementImpl extends DomainResourceImpl implements MedicationStatement {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

	/**
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOfs;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getStatusReasons() <em>Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReasons;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

	/**
	 * The cached value of the '{@link #getDateAsserted() <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAsserted()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAsserted;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected Reference informationSource;

	/**
	 * The cached value of the '{@link #getDerivedFroms() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFroms()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> derivedFroms;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReferences;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getDosages() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosages()
	 * @generated
	 * @ordered
	 */
	protected EList<Dosage> dosages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_STATEMENT__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_STATEMENT__PART_OF);
		}
		return partOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getStatusReasons() {
		if (statusReasons == null) {
			statusReasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_STATEMENT__STATUS_REASON);
		}
		return statusReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX, oldMedicationx, newMedicationx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationx(DataType newMedicationx) {
		if (newMedicationx != medicationx) {
			NotificationChain msgs = null;
			if (medicationx != null)
				msgs = ((InternalEObject)medicationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX, null, msgs);
			if (newMedicationx != null)
				msgs = ((InternalEObject)newMedicationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX, null, msgs);
			msgs = basicSetMedicationx(newMedicationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX, newMedicationx, newMedicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEffectivex() {
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivex(DataType newEffectivex, NotificationChain msgs) {
		DataType oldEffectivex = effectivex;
		effectivex = newEffectivex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX, oldEffectivex, newEffectivex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivex(DataType newEffectivex) {
		if (newEffectivex != effectivex) {
			NotificationChain msgs = null;
			if (effectivex != null)
				msgs = ((InternalEObject)effectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX, null, msgs);
			if (newEffectivex != null)
				msgs = ((InternalEObject)newEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX, null, msgs);
			msgs = basicSetEffectivex(newEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX, newEffectivex, newEffectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateAsserted() {
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAsserted(DateTime newDateAsserted, NotificationChain msgs) {
		DateTime oldDateAsserted = dateAsserted;
		dateAsserted = newDateAsserted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, newDateAsserted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAsserted(DateTime newDateAsserted) {
		if (newDateAsserted != dateAsserted) {
			NotificationChain msgs = null;
			if (dateAsserted != null)
				msgs = ((InternalEObject)dateAsserted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			if (newDateAsserted != null)
				msgs = ((InternalEObject)newDateAsserted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			msgs = basicSetDateAsserted(newDateAsserted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED, newDateAsserted, newDateAsserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInformationSource() {
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationSource(Reference newInformationSource, NotificationChain msgs) {
		Reference oldInformationSource = informationSource;
		informationSource = newInformationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, oldInformationSource, newInformationSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSource(Reference newInformationSource) {
		if (newInformationSource != informationSource) {
			NotificationChain msgs = null;
			if (informationSource != null)
				msgs = ((InternalEObject)informationSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, null, msgs);
			if (newInformationSource != null)
				msgs = ((InternalEObject)newInformationSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, null, msgs);
			msgs = basicSetInformationSource(newInformationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, newInformationSource, newInformationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDerivedFroms() {
		if (derivedFroms == null) {
			derivedFroms = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM);
		}
		return derivedFroms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_STATEMENT__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_STATEMENT__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDICATION_STATEMENT__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dosage> getDosages() {
		if (dosages == null) {
			dosages = new EObjectContainmentEList<Dosage>(Dosage.class, this, ResourcesPackage.MEDICATION_STATEMENT__DOSAGE);
		}
		return dosages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS_REASON:
				return ((InternalEList<?>)getStatusReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				return basicSetMedicationx(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				return basicSetEffectivex(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return basicSetDateAsserted(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return basicSetInformationSource(null, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFroms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				return ((InternalEList<?>)getDosages()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICATION_STATEMENT__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.MEDICATION_STATEMENT__PART_OF:
				return getPartOfs();
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				return getStatus();
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS_REASON:
				return getStatusReasons();
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				return getCategory();
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				return getMedicationx();
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				return getSubject();
			case ResourcesPackage.MEDICATION_STATEMENT__CONTEXT:
				return getContext();
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				return getEffectivex();
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return getDateAsserted();
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return getInformationSource();
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return getDerivedFroms();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				return getNotes();
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				return getDosages();
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
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS_REASON:
				getStatusReasons().clear();
				getStatusReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				setMedicationx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__CONTEXT:
				setContext((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFroms().clear();
				getDerivedFroms().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosages().clear();
				getDosages().addAll((Collection<? extends Dosage>)newValue);
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
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS_REASON:
				getStatusReasons().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				setMedicationx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__CONTEXT:
				setContext((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFroms().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosages().clear();
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
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS_REASON:
				return statusReasons != null && !statusReasons.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				return category != null;
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				return medicationx != null;
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				return subject != null;
			case ResourcesPackage.MEDICATION_STATEMENT__CONTEXT:
				return context != null;
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return dateAsserted != null;
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return informationSource != null;
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return derivedFroms != null && !derivedFroms.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				return dosages != null && !dosages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementImpl
