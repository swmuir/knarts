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
import org.hl7.fhir.SubstanceAmount;
import org.hl7.fhir.SubstanceMoiety;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Moiety</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceMoietyImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceMoietyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceMoietyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceMoietyImpl#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceMoietyImpl#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceMoietyImpl#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceMoietyImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceMoietyImpl extends ElementImpl implements SubstanceMoiety {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStereochemistry() <em>Stereochemistry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereochemistry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept stereochemistry;

	/**
	 * The cached value of the '{@link #getOpticalActivity() <em>Optical Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpticalActivity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept opticalActivity;

	/**
	 * The cached value of the '{@link #getMolecularFormula() <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularFormula()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String molecularFormula;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAmount amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceMoietyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceMoiety();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStereochemistry() {
		return stereochemistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStereochemistry(CodeableConcept newStereochemistry, NotificationChain msgs) {
		CodeableConcept oldStereochemistry = stereochemistry;
		stereochemistry = newStereochemistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY, oldStereochemistry, newStereochemistry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereochemistry(CodeableConcept newStereochemistry) {
		if (newStereochemistry != stereochemistry) {
			NotificationChain msgs = null;
			if (stereochemistry != null)
				msgs = ((InternalEObject)stereochemistry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY, null, msgs);
			if (newStereochemistry != null)
				msgs = ((InternalEObject)newStereochemistry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY, null, msgs);
			msgs = basicSetStereochemistry(newStereochemistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY, newStereochemistry, newStereochemistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOpticalActivity() {
		return opticalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpticalActivity(CodeableConcept newOpticalActivity, NotificationChain msgs) {
		CodeableConcept oldOpticalActivity = opticalActivity;
		opticalActivity = newOpticalActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY, oldOpticalActivity, newOpticalActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpticalActivity(CodeableConcept newOpticalActivity) {
		if (newOpticalActivity != opticalActivity) {
			NotificationChain msgs = null;
			if (opticalActivity != null)
				msgs = ((InternalEObject)opticalActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY, null, msgs);
			if (newOpticalActivity != null)
				msgs = ((InternalEObject)newOpticalActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY, null, msgs);
			msgs = basicSetOpticalActivity(newOpticalActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY, newOpticalActivity, newOpticalActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMolecularFormula() {
		return molecularFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularFormula(org.hl7.fhir.String newMolecularFormula, NotificationChain msgs) {
		org.hl7.fhir.String oldMolecularFormula = molecularFormula;
		molecularFormula = newMolecularFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA, oldMolecularFormula, newMolecularFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularFormula(org.hl7.fhir.String newMolecularFormula) {
		if (newMolecularFormula != molecularFormula) {
			NotificationChain msgs = null;
			if (molecularFormula != null)
				msgs = ((InternalEObject)molecularFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA, null, msgs);
			if (newMolecularFormula != null)
				msgs = ((InternalEObject)newMolecularFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA, null, msgs);
			msgs = basicSetMolecularFormula(newMolecularFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA, newMolecularFormula, newMolecularFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAmount getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(SubstanceAmount newAmount, NotificationChain msgs) {
		SubstanceAmount oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(SubstanceAmount newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_MOIETY__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_MOIETY__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_MOIETY__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SUBSTANCE_MOIETY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY:
				return basicSetStereochemistry(null, msgs);
			case FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY:
				return basicSetOpticalActivity(null, msgs);
			case FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA:
				return basicSetMolecularFormula(null, msgs);
			case FhirPackage.SUBSTANCE_MOIETY__AMOUNT:
				return basicSetAmount(null, msgs);
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
			case FhirPackage.SUBSTANCE_MOIETY__ROLE:
				return getRole();
			case FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSTANCE_MOIETY__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY:
				return getStereochemistry();
			case FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY:
				return getOpticalActivity();
			case FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA:
				return getMolecularFormula();
			case FhirPackage.SUBSTANCE_MOIETY__AMOUNT:
				return getAmount();
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
			case FhirPackage.SUBSTANCE_MOIETY__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA:
				setMolecularFormula((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__AMOUNT:
				setAmount((SubstanceAmount)newValue);
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
			case FhirPackage.SUBSTANCE_MOIETY__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA:
				setMolecularFormula((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_MOIETY__AMOUNT:
				setAmount((SubstanceAmount)null);
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
			case FhirPackage.SUBSTANCE_MOIETY__ROLE:
				return role != null;
			case FhirPackage.SUBSTANCE_MOIETY__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SUBSTANCE_MOIETY__NAME:
				return name != null;
			case FhirPackage.SUBSTANCE_MOIETY__STEREOCHEMISTRY:
				return stereochemistry != null;
			case FhirPackage.SUBSTANCE_MOIETY__OPTICAL_ACTIVITY:
				return opticalActivity != null;
			case FhirPackage.SUBSTANCE_MOIETY__MOLECULAR_FORMULA:
				return molecularFormula != null;
			case FhirPackage.SUBSTANCE_MOIETY__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceMoietyImpl
