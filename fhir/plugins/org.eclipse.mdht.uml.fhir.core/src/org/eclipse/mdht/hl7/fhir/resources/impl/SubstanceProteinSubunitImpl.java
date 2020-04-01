/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Attachment;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceProteinSubunit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Protein Subunit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getNTerminalModificationId <em>NTerminal Modification Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getNTerminalModification <em>NTerminal Modification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getCTerminalModificationId <em>CTerminal Modification Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceProteinSubunitImpl#getCTerminalModification <em>CTerminal Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceProteinSubunitImpl extends BackboneElementImpl implements SubstanceProteinSubunit {
	/**
	 * The cached value of the '{@link #getSubunit() <em>Subunit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunit()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer subunit;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String sequence;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer length;

	/**
	 * The cached value of the '{@link #getSequenceAttachment() <em>Sequence Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment sequenceAttachment;

	/**
	 * The cached value of the '{@link #getNTerminalModificationId() <em>NTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTerminalModificationId()
	 * @generated
	 * @ordered
	 */
	protected Identifier nTerminalModificationId;

	/**
	 * The cached value of the '{@link #getNTerminalModification() <em>NTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTerminalModification()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String nTerminalModification;

	/**
	 * The cached value of the '{@link #getCTerminalModificationId() <em>CTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTerminalModificationId()
	 * @generated
	 * @ordered
	 */
	protected Identifier cTerminalModificationId;

	/**
	 * The cached value of the '{@link #getCTerminalModification() <em>CTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTerminalModification()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String cTerminalModification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceProteinSubunitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceProteinSubunit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getSubunit() {
		return subunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubunit(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newSubunit, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldSubunit = subunit;
		subunit = newSubunit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, oldSubunit, newSubunit);
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
	public void setSubunit(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newSubunit) {
		if (newSubunit != subunit) {
			NotificationChain msgs = null;
			if (subunit != null)
				msgs = ((InternalEObject)subunit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, null, msgs);
			if (newSubunit != null)
				msgs = ((InternalEObject)newSubunit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, null, msgs);
			msgs = basicSetSubunit(newSubunit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, newSubunit, newSubunit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(org.eclipse.mdht.hl7.fhir.dataTypes.String newSequence, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(org.eclipse.mdht.hl7.fhir.dataTypes.String newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newLength, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, oldLength, newLength);
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
	public void setLength(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getSequenceAttachment() {
		return sequenceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceAttachment(Attachment newSequenceAttachment, NotificationChain msgs) {
		Attachment oldSequenceAttachment = sequenceAttachment;
		sequenceAttachment = newSequenceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, oldSequenceAttachment, newSequenceAttachment);
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
	public void setSequenceAttachment(Attachment newSequenceAttachment) {
		if (newSequenceAttachment != sequenceAttachment) {
			NotificationChain msgs = null;
			if (sequenceAttachment != null)
				msgs = ((InternalEObject)sequenceAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			if (newSequenceAttachment != null)
				msgs = ((InternalEObject)newSequenceAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			msgs = basicSetSequenceAttachment(newSequenceAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, newSequenceAttachment, newSequenceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getNTerminalModificationId() {
		return nTerminalModificationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNTerminalModificationId(Identifier newNTerminalModificationId, NotificationChain msgs) {
		Identifier oldNTerminalModificationId = nTerminalModificationId;
		nTerminalModificationId = newNTerminalModificationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, oldNTerminalModificationId, newNTerminalModificationId);
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
	public void setNTerminalModificationId(Identifier newNTerminalModificationId) {
		if (newNTerminalModificationId != nTerminalModificationId) {
			NotificationChain msgs = null;
			if (nTerminalModificationId != null)
				msgs = ((InternalEObject)nTerminalModificationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, null, msgs);
			if (newNTerminalModificationId != null)
				msgs = ((InternalEObject)newNTerminalModificationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, null, msgs);
			msgs = basicSetNTerminalModificationId(newNTerminalModificationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, newNTerminalModificationId, newNTerminalModificationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getNTerminalModification() {
		return nTerminalModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNTerminalModification(org.eclipse.mdht.hl7.fhir.dataTypes.String newNTerminalModification, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldNTerminalModification = nTerminalModification;
		nTerminalModification = newNTerminalModification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, oldNTerminalModification, newNTerminalModification);
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
	public void setNTerminalModification(org.eclipse.mdht.hl7.fhir.dataTypes.String newNTerminalModification) {
		if (newNTerminalModification != nTerminalModification) {
			NotificationChain msgs = null;
			if (nTerminalModification != null)
				msgs = ((InternalEObject)nTerminalModification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, null, msgs);
			if (newNTerminalModification != null)
				msgs = ((InternalEObject)newNTerminalModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, null, msgs);
			msgs = basicSetNTerminalModification(newNTerminalModification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, newNTerminalModification, newNTerminalModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getCTerminalModificationId() {
		return cTerminalModificationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTerminalModificationId(Identifier newCTerminalModificationId, NotificationChain msgs) {
		Identifier oldCTerminalModificationId = cTerminalModificationId;
		cTerminalModificationId = newCTerminalModificationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, oldCTerminalModificationId, newCTerminalModificationId);
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
	public void setCTerminalModificationId(Identifier newCTerminalModificationId) {
		if (newCTerminalModificationId != cTerminalModificationId) {
			NotificationChain msgs = null;
			if (cTerminalModificationId != null)
				msgs = ((InternalEObject)cTerminalModificationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, null, msgs);
			if (newCTerminalModificationId != null)
				msgs = ((InternalEObject)newCTerminalModificationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, null, msgs);
			msgs = basicSetCTerminalModificationId(newCTerminalModificationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, newCTerminalModificationId, newCTerminalModificationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getCTerminalModification() {
		return cTerminalModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTerminalModification(org.eclipse.mdht.hl7.fhir.dataTypes.String newCTerminalModification, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldCTerminalModification = cTerminalModification;
		cTerminalModification = newCTerminalModification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, oldCTerminalModification, newCTerminalModification);
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
	public void setCTerminalModification(org.eclipse.mdht.hl7.fhir.dataTypes.String newCTerminalModification) {
		if (newCTerminalModification != cTerminalModification) {
			NotificationChain msgs = null;
			if (cTerminalModification != null)
				msgs = ((InternalEObject)cTerminalModification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, null, msgs);
			if (newCTerminalModification != null)
				msgs = ((InternalEObject)newCTerminalModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, null, msgs);
			msgs = basicSetCTerminalModification(newCTerminalModification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, newCTerminalModification, newCTerminalModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				return basicSetSubunit(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				return basicSetLength(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				return basicSetSequenceAttachment(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				return basicSetNTerminalModificationId(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				return basicSetNTerminalModification(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				return basicSetCTerminalModificationId(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				return basicSetCTerminalModification(null, msgs);
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
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				return getSubunit();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				return getSequence();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				return getLength();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				return getSequenceAttachment();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				return getNTerminalModificationId();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				return getNTerminalModification();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				return getCTerminalModificationId();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				return getCTerminalModification();
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
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				setSubunit((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				setSequence((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				setLength((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				setNTerminalModificationId((Identifier)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				setNTerminalModification((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				setCTerminalModificationId((Identifier)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				setCTerminalModification((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				setSubunit((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				setSequence((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				setLength((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				setNTerminalModificationId((Identifier)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				setNTerminalModification((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				setCTerminalModificationId((Identifier)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				setCTerminalModification((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				return subunit != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				return length != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				return sequenceAttachment != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				return nTerminalModificationId != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				return nTerminalModification != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				return cTerminalModificationId != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				return cTerminalModification != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceProteinSubunitImpl
