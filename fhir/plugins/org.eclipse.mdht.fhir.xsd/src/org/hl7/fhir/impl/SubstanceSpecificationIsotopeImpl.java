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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.SubstanceSpecificationIsotope;
import org.hl7.fhir.SubstanceSpecificationMolecularWeight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Isotope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getNuclideId <em>Nuclide Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getNuclideName <em>Nuclide Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getSubstitutionType <em>Substitution Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getNuclideHalfLife <em>Nuclide Half Life</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationIsotopeImpl extends BackboneElementImpl implements SubstanceSpecificationIsotope {
	/**
	 * The cached value of the '{@link #getNuclideId() <em>Nuclide Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuclideId()
	 * @generated
	 * @ordered
	 */
	protected Identifier nuclideId;

	/**
	 * The cached value of the '{@link #getNuclideName() <em>Nuclide Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuclideName()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept nuclideName;

	/**
	 * The cached value of the '{@link #getSubstitutionType() <em>Substitution Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substitutionType;

	/**
	 * The cached value of the '{@link #getNuclideHalfLife() <em>Nuclide Half Life</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuclideHalfLife()
	 * @generated
	 * @ordered
	 */
	protected Quantity nuclideHalfLife;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amount;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSpecificationMolecularWeight molecularWeight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationIsotopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationIsotope();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getNuclideId() {
		return nuclideId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNuclideId(Identifier newNuclideId, NotificationChain msgs) {
		Identifier oldNuclideId = nuclideId;
		nuclideId = newNuclideId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID, oldNuclideId, newNuclideId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNuclideId(Identifier newNuclideId) {
		if (newNuclideId != nuclideId) {
			NotificationChain msgs = null;
			if (nuclideId != null)
				msgs = ((InternalEObject)nuclideId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID, null, msgs);
			if (newNuclideId != null)
				msgs = ((InternalEObject)newNuclideId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID, null, msgs);
			msgs = basicSetNuclideId(newNuclideId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID, newNuclideId, newNuclideId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getNuclideName() {
		return nuclideName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNuclideName(CodeableConcept newNuclideName, NotificationChain msgs) {
		CodeableConcept oldNuclideName = nuclideName;
		nuclideName = newNuclideName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME, oldNuclideName, newNuclideName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNuclideName(CodeableConcept newNuclideName) {
		if (newNuclideName != nuclideName) {
			NotificationChain msgs = null;
			if (nuclideName != null)
				msgs = ((InternalEObject)nuclideName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME, null, msgs);
			if (newNuclideName != null)
				msgs = ((InternalEObject)newNuclideName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME, null, msgs);
			msgs = basicSetNuclideName(newNuclideName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME, newNuclideName, newNuclideName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstitutionType() {
		return substitutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitutionType(CodeableConcept newSubstitutionType, NotificationChain msgs) {
		CodeableConcept oldSubstitutionType = substitutionType;
		substitutionType = newSubstitutionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE, oldSubstitutionType, newSubstitutionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutionType(CodeableConcept newSubstitutionType) {
		if (newSubstitutionType != substitutionType) {
			NotificationChain msgs = null;
			if (substitutionType != null)
				msgs = ((InternalEObject)substitutionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE, null, msgs);
			if (newSubstitutionType != null)
				msgs = ((InternalEObject)newSubstitutionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE, null, msgs);
			msgs = basicSetSubstitutionType(newSubstitutionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE, newSubstitutionType, newSubstitutionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getNuclideHalfLife() {
		return nuclideHalfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNuclideHalfLife(Quantity newNuclideHalfLife, NotificationChain msgs) {
		Quantity oldNuclideHalfLife = nuclideHalfLife;
		nuclideHalfLife = newNuclideHalfLife;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE, oldNuclideHalfLife, newNuclideHalfLife);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNuclideHalfLife(Quantity newNuclideHalfLife) {
		if (newNuclideHalfLife != nuclideHalfLife) {
			NotificationChain msgs = null;
			if (nuclideHalfLife != null)
				msgs = ((InternalEObject)nuclideHalfLife).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE, null, msgs);
			if (newNuclideHalfLife != null)
				msgs = ((InternalEObject)newNuclideHalfLife).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE, null, msgs);
			msgs = basicSetNuclideHalfLife(newNuclideHalfLife, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE, newNuclideHalfLife, newNuclideHalfLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(org.hl7.fhir.String newAmount, NotificationChain msgs) {
		org.hl7.fhir.String oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(org.hl7.fhir.String newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSpecificationMolecularWeight getMolecularWeight() {
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularWeight(SubstanceSpecificationMolecularWeight newMolecularWeight, NotificationChain msgs) {
		SubstanceSpecificationMolecularWeight oldMolecularWeight = molecularWeight;
		molecularWeight = newMolecularWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, oldMolecularWeight, newMolecularWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularWeight(SubstanceSpecificationMolecularWeight newMolecularWeight) {
		if (newMolecularWeight != molecularWeight) {
			NotificationChain msgs = null;
			if (molecularWeight != null)
				msgs = ((InternalEObject)molecularWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, null, msgs);
			if (newMolecularWeight != null)
				msgs = ((InternalEObject)newMolecularWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, null, msgs);
			msgs = basicSetMolecularWeight(newMolecularWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, newMolecularWeight, newMolecularWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID:
				return basicSetNuclideId(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME:
				return basicSetNuclideName(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE:
				return basicSetSubstitutionType(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE:
				return basicSetNuclideHalfLife(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT:
				return basicSetAmount(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				return basicSetMolecularWeight(null, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID:
				return getNuclideId();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME:
				return getNuclideName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE:
				return getSubstitutionType();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE:
				return getNuclideHalfLife();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT:
				return getAmount();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				return getMolecularWeight();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID:
				setNuclideId((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME:
				setNuclideName((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE:
				setSubstitutionType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE:
				setNuclideHalfLife((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT:
				setAmount((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceSpecificationMolecularWeight)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID:
				setNuclideId((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME:
				setNuclideName((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE:
				setSubstitutionType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE:
				setNuclideHalfLife((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT:
				setAmount((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceSpecificationMolecularWeight)null);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_ID:
				return nuclideId != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_NAME:
				return nuclideName != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION_TYPE:
				return substitutionType != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NUCLIDE_HALF_LIFE:
				return nuclideHalfLife != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__AMOUNT:
				return amount != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				return molecularWeight != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationIsotopeImpl
