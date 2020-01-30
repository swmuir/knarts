/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstanceNucleicAcidSubunit;
import fhiRCore.resources.SubstanceNucleicAcidSubunitLinkage;
import fhiRCore.resources.SubstanceNucleicAcidSubunitSugar;

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
 * An implementation of the model object '<em><b>Substance Nucleic Acid Subunit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getLength <em>Length</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getFivePrime <em>Five Prime</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getThreePrime <em>Three Prime</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getLinkages <em>Linkage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidSubunitImpl#getSugars <em>Sugar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceNucleicAcidSubunitImpl extends BackboneElementImpl implements SubstanceNucleicAcidSubunit {
	/**
	 * The cached value of the '{@link #getSubunit() <em>Subunit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunit()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer subunit;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String sequence;

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
	 * The cached value of the '{@link #getSequenceAttachment() <em>Sequence Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment sequenceAttachment;

	/**
	 * The cached value of the '{@link #getFivePrime() <em>Five Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFivePrime()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fivePrime;

	/**
	 * The cached value of the '{@link #getThreePrime() <em>Three Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreePrime()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept threePrime;

	/**
	 * The cached value of the '{@link #getLinkages() <em>Linkage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkages()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceNucleicAcidSubunitLinkage> linkages;

	/**
	 * The cached value of the '{@link #getSugars() <em>Sugar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSugars()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceNucleicAcidSubunitSugar> sugars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceNucleicAcidSubunitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceNucleicAcidSubunit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getSubunit() {
		return subunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubunit(fhiRCore.dataTypes.Integer newSubunit, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldSubunit = subunit;
		subunit = newSubunit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, oldSubunit, newSubunit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubunit(fhiRCore.dataTypes.Integer newSubunit) {
		if (newSubunit != subunit) {
			NotificationChain msgs = null;
			if (subunit != null)
				msgs = ((InternalEObject)subunit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, null, msgs);
			if (newSubunit != null)
				msgs = ((InternalEObject)newSubunit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, null, msgs);
			msgs = basicSetSubunit(newSubunit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, newSubunit, newSubunit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(fhiRCore.dataTypes.String newSequence, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(fhiRCore.dataTypes.String newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, newSequence, newSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, oldLength, newLength);
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
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, oldSequenceAttachment, newSequenceAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceAttachment(Attachment newSequenceAttachment) {
		if (newSequenceAttachment != sequenceAttachment) {
			NotificationChain msgs = null;
			if (sequenceAttachment != null)
				msgs = ((InternalEObject)sequenceAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			if (newSequenceAttachment != null)
				msgs = ((InternalEObject)newSequenceAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			msgs = basicSetSequenceAttachment(newSequenceAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, newSequenceAttachment, newSequenceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFivePrime() {
		return fivePrime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFivePrime(CodeableConcept newFivePrime, NotificationChain msgs) {
		CodeableConcept oldFivePrime = fivePrime;
		fivePrime = newFivePrime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, oldFivePrime, newFivePrime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFivePrime(CodeableConcept newFivePrime) {
		if (newFivePrime != fivePrime) {
			NotificationChain msgs = null;
			if (fivePrime != null)
				msgs = ((InternalEObject)fivePrime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, null, msgs);
			if (newFivePrime != null)
				msgs = ((InternalEObject)newFivePrime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, null, msgs);
			msgs = basicSetFivePrime(newFivePrime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, newFivePrime, newFivePrime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getThreePrime() {
		return threePrime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreePrime(CodeableConcept newThreePrime, NotificationChain msgs) {
		CodeableConcept oldThreePrime = threePrime;
		threePrime = newThreePrime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, oldThreePrime, newThreePrime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreePrime(CodeableConcept newThreePrime) {
		if (newThreePrime != threePrime) {
			NotificationChain msgs = null;
			if (threePrime != null)
				msgs = ((InternalEObject)threePrime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, null, msgs);
			if (newThreePrime != null)
				msgs = ((InternalEObject)newThreePrime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, null, msgs);
			msgs = basicSetThreePrime(newThreePrime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, newThreePrime, newThreePrime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceNucleicAcidSubunitLinkage> getLinkages() {
		if (linkages == null) {
			linkages = new EObjectContainmentEList<SubstanceNucleicAcidSubunitLinkage>(SubstanceNucleicAcidSubunitLinkage.class, this, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE);
		}
		return linkages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceNucleicAcidSubunitSugar> getSugars() {
		if (sugars == null) {
			sugars = new EObjectContainmentEList<SubstanceNucleicAcidSubunitSugar>(SubstanceNucleicAcidSubunitSugar.class, this, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR);
		}
		return sugars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				return basicSetSubunit(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				return basicSetLength(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				return basicSetSequenceAttachment(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				return basicSetFivePrime(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				return basicSetThreePrime(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				return ((InternalEList<?>)getLinkages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				return ((InternalEList<?>)getSugars()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				return getSubunit();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				return getSequence();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				return getLength();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				return getSequenceAttachment();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				return getFivePrime();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				return getThreePrime();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				return getLinkages();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				return getSugars();
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				setSubunit((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				setSequence((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				setLength((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				setFivePrime((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				setThreePrime((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				getLinkages().clear();
				getLinkages().addAll((Collection<? extends SubstanceNucleicAcidSubunitLinkage>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				getSugars().clear();
				getSugars().addAll((Collection<? extends SubstanceNucleicAcidSubunitSugar>)newValue);
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				setSubunit((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				setSequence((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				setLength((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				setFivePrime((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				setThreePrime((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				getLinkages().clear();
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				getSugars().clear();
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				return subunit != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				return length != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				return sequenceAttachment != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				return fivePrime != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				return threePrime != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				return linkages != null && !linkages.isEmpty();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				return sugars != null && !sugars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceNucleicAcidSubunitImpl
