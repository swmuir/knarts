/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.profiles.ProfilesPackage;
import fhiRCore.profiles.SubstanceDefinitionStructureIsotope;
import fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Structure Isotope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl#getHalfLife <em>Half Life</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionStructureIsotopeImpl extends BackboneElementImpl implements SubstanceDefinitionStructureIsotope {
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
	protected CodeableConcept name;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substitution;

	/**
	 * The cached value of the '{@link #getHalfLife() <em>Half Life</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalfLife()
	 * @generated
	 * @ordered
	 */
	protected Quantity halfLife;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected SubstanceDefinitionStructureIsotopeMolecularWeight molecularWeight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionStructureIsotopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CodeableConcept newName, NotificationChain msgs) {
		CodeableConcept oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(CodeableConcept newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(CodeableConcept newSubstitution, NotificationChain msgs) {
		CodeableConcept oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(CodeableConcept newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getHalfLife() {
		return halfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHalfLife(Quantity newHalfLife, NotificationChain msgs) {
		Quantity oldHalfLife = halfLife;
		halfLife = newHalfLife;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE, oldHalfLife, newHalfLife);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHalfLife(Quantity newHalfLife) {
		if (newHalfLife != halfLife) {
			NotificationChain msgs = null;
			if (halfLife != null)
				msgs = ((InternalEObject)halfLife).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE, null, msgs);
			if (newHalfLife != null)
				msgs = ((InternalEObject)newHalfLife).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE, null, msgs);
			msgs = basicSetHalfLife(newHalfLife, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE, newHalfLife, newHalfLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionStructureIsotopeMolecularWeight getMolecularWeight() {
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularWeight(SubstanceDefinitionStructureIsotopeMolecularWeight newMolecularWeight, NotificationChain msgs) {
		SubstanceDefinitionStructureIsotopeMolecularWeight oldMolecularWeight = molecularWeight;
		molecularWeight = newMolecularWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT, oldMolecularWeight, newMolecularWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularWeight(SubstanceDefinitionStructureIsotopeMolecularWeight newMolecularWeight) {
		if (newMolecularWeight != molecularWeight) {
			NotificationChain msgs = null;
			if (molecularWeight != null)
				msgs = ((InternalEObject)molecularWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT, null, msgs);
			if (newMolecularWeight != null)
				msgs = ((InternalEObject)newMolecularWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT, null, msgs);
			msgs = basicSetMolecularWeight(newMolecularWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT, newMolecularWeight, newMolecularWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME:
				return basicSetName(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE:
				return basicSetHalfLife(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT:
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER:
				return getIdentifier();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME:
				return getName();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION:
				return getSubstitution();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE:
				return getHalfLife();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT:
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME:
				setName((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION:
				setSubstitution((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE:
				setHalfLife((Quantity)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceDefinitionStructureIsotopeMolecularWeight)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME:
				setName((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION:
				setSubstitution((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE:
				setHalfLife((Quantity)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceDefinitionStructureIsotopeMolecularWeight)null);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER:
				return identifier != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME:
				return name != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION:
				return substitution != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE:
				return halfLife != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT:
				return molecularWeight != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionStructureIsotopeImpl
