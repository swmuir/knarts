/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstanceNucleicAcid;
import fhiRCore.resources.SubstanceNucleicAcidSubunit;

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
 * An implementation of the model object '<em><b>Substance Nucleic Acid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidImpl#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidImpl#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidImpl#getAreaOfHybridisation <em>Area Of Hybridisation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidImpl#getOligoNucleotideType <em>Oligo Nucleotide Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceNucleicAcidImpl#getSubunits <em>Subunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceNucleicAcidImpl extends DomainResourceImpl implements SubstanceNucleicAcid {
	/**
	 * The cached value of the '{@link #getSequenceType() <em>Sequence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sequenceType;

	/**
	 * The cached value of the '{@link #getNumberOfSubunits() <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSubunits()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer numberOfSubunits;

	/**
	 * The cached value of the '{@link #getAreaOfHybridisation() <em>Area Of Hybridisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaOfHybridisation()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String areaOfHybridisation;

	/**
	 * The cached value of the '{@link #getOligoNucleotideType() <em>Oligo Nucleotide Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOligoNucleotideType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept oligoNucleotideType;

	/**
	 * The cached value of the '{@link #getSubunits() <em>Subunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunits()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceNucleicAcidSubunit> subunits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceNucleicAcidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceNucleicAcid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSequenceType() {
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceType(CodeableConcept newSequenceType, NotificationChain msgs) {
		CodeableConcept oldSequenceType = sequenceType;
		sequenceType = newSequenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, oldSequenceType, newSequenceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceType(CodeableConcept newSequenceType) {
		if (newSequenceType != sequenceType) {
			NotificationChain msgs = null;
			if (sequenceType != null)
				msgs = ((InternalEObject)sequenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, null, msgs);
			if (newSequenceType != null)
				msgs = ((InternalEObject)newSequenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, null, msgs);
			msgs = basicSetSequenceType(newSequenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, newSequenceType, newSequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getNumberOfSubunits() {
		return numberOfSubunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSubunits(fhiRCore.dataTypes.Integer newNumberOfSubunits, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldNumberOfSubunits = numberOfSubunits;
		numberOfSubunits = newNumberOfSubunits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, oldNumberOfSubunits, newNumberOfSubunits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSubunits(fhiRCore.dataTypes.Integer newNumberOfSubunits) {
		if (newNumberOfSubunits != numberOfSubunits) {
			NotificationChain msgs = null;
			if (numberOfSubunits != null)
				msgs = ((InternalEObject)numberOfSubunits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, null, msgs);
			if (newNumberOfSubunits != null)
				msgs = ((InternalEObject)newNumberOfSubunits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, null, msgs);
			msgs = basicSetNumberOfSubunits(newNumberOfSubunits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, newNumberOfSubunits, newNumberOfSubunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getAreaOfHybridisation() {
		return areaOfHybridisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaOfHybridisation(fhiRCore.dataTypes.String newAreaOfHybridisation, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldAreaOfHybridisation = areaOfHybridisation;
		areaOfHybridisation = newAreaOfHybridisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, oldAreaOfHybridisation, newAreaOfHybridisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaOfHybridisation(fhiRCore.dataTypes.String newAreaOfHybridisation) {
		if (newAreaOfHybridisation != areaOfHybridisation) {
			NotificationChain msgs = null;
			if (areaOfHybridisation != null)
				msgs = ((InternalEObject)areaOfHybridisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, null, msgs);
			if (newAreaOfHybridisation != null)
				msgs = ((InternalEObject)newAreaOfHybridisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, null, msgs);
			msgs = basicSetAreaOfHybridisation(newAreaOfHybridisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, newAreaOfHybridisation, newAreaOfHybridisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOligoNucleotideType() {
		return oligoNucleotideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOligoNucleotideType(CodeableConcept newOligoNucleotideType, NotificationChain msgs) {
		CodeableConcept oldOligoNucleotideType = oligoNucleotideType;
		oligoNucleotideType = newOligoNucleotideType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, oldOligoNucleotideType, newOligoNucleotideType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOligoNucleotideType(CodeableConcept newOligoNucleotideType) {
		if (newOligoNucleotideType != oligoNucleotideType) {
			NotificationChain msgs = null;
			if (oligoNucleotideType != null)
				msgs = ((InternalEObject)oligoNucleotideType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, null, msgs);
			if (newOligoNucleotideType != null)
				msgs = ((InternalEObject)newOligoNucleotideType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, null, msgs);
			msgs = basicSetOligoNucleotideType(newOligoNucleotideType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, newOligoNucleotideType, newOligoNucleotideType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceNucleicAcidSubunit> getSubunits() {
		if (subunits == null) {
			subunits = new EObjectContainmentEList<SubstanceNucleicAcidSubunit>(SubstanceNucleicAcidSubunit.class, this, ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT);
		}
		return subunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				return basicSetSequenceType(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				return basicSetNumberOfSubunits(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				return basicSetAreaOfHybridisation(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				return basicSetOligoNucleotideType(null, msgs);
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
				return ((InternalEList<?>)getSubunits()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				return getSequenceType();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				return getNumberOfSubunits();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				return getAreaOfHybridisation();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				return getOligoNucleotideType();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
				return getSubunits();
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				setAreaOfHybridisation((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				setOligoNucleotideType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
				getSubunits().clear();
				getSubunits().addAll((Collection<? extends SubstanceNucleicAcidSubunit>)newValue);
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				setAreaOfHybridisation((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				setOligoNucleotideType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
				getSubunits().clear();
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
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				return sequenceType != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				return numberOfSubunits != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				return areaOfHybridisation != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				return oligoNucleotideType != null;
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
				return subunits != null && !subunits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceNucleicAcidImpl
