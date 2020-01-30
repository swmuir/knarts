/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.profiles.ProfilesPackage;
import fhiRCore.profiles.SubstanceDefinitionStructure;
import fhiRCore.profiles.SubstanceDefinitionStructureIsotope;
import fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight;
import fhiRCore.profiles.SubstanceDefinitionStructureRepresentation;

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
 * An implementation of the model object '<em><b>Substance Definition Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getIsotopes <em>Isotope</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getSources <em>Source</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl#getRepresentations <em>Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionStructureImpl extends BackboneElementImpl implements SubstanceDefinitionStructure {
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
	protected fhiRCore.dataTypes.String molecularFormula;

	/**
	 * The cached value of the '{@link #getMolecularFormulaByMoiety() <em>Molecular Formula By Moiety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularFormulaByMoiety()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String molecularFormulaByMoiety;

	/**
	 * The cached value of the '{@link #getIsotopes() <em>Isotope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsotopes()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionStructureIsotope> isotopes;

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
	 * The cached value of the '{@link #getSources() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sources;

	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionStructureRepresentation> representations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION_STRUCTURE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY, oldStereochemistry, newStereochemistry);
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
				msgs = ((InternalEObject)stereochemistry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY, null, msgs);
			if (newStereochemistry != null)
				msgs = ((InternalEObject)newStereochemistry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY, null, msgs);
			msgs = basicSetStereochemistry(newStereochemistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY, newStereochemistry, newStereochemistry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY, oldOpticalActivity, newOpticalActivity);
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
				msgs = ((InternalEObject)opticalActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY, null, msgs);
			if (newOpticalActivity != null)
				msgs = ((InternalEObject)newOpticalActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY, null, msgs);
			msgs = basicSetOpticalActivity(newOpticalActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY, newOpticalActivity, newOpticalActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMolecularFormula() {
		return molecularFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularFormula(fhiRCore.dataTypes.String newMolecularFormula, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMolecularFormula = molecularFormula;
		molecularFormula = newMolecularFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA, oldMolecularFormula, newMolecularFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularFormula(fhiRCore.dataTypes.String newMolecularFormula) {
		if (newMolecularFormula != molecularFormula) {
			NotificationChain msgs = null;
			if (molecularFormula != null)
				msgs = ((InternalEObject)molecularFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA, null, msgs);
			if (newMolecularFormula != null)
				msgs = ((InternalEObject)newMolecularFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA, null, msgs);
			msgs = basicSetMolecularFormula(newMolecularFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA, newMolecularFormula, newMolecularFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMolecularFormulaByMoiety() {
		return molecularFormulaByMoiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularFormulaByMoiety(fhiRCore.dataTypes.String newMolecularFormulaByMoiety, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMolecularFormulaByMoiety = molecularFormulaByMoiety;
		molecularFormulaByMoiety = newMolecularFormulaByMoiety;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, oldMolecularFormulaByMoiety, newMolecularFormulaByMoiety);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularFormulaByMoiety(fhiRCore.dataTypes.String newMolecularFormulaByMoiety) {
		if (newMolecularFormulaByMoiety != molecularFormulaByMoiety) {
			NotificationChain msgs = null;
			if (molecularFormulaByMoiety != null)
				msgs = ((InternalEObject)molecularFormulaByMoiety).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, null, msgs);
			if (newMolecularFormulaByMoiety != null)
				msgs = ((InternalEObject)newMolecularFormulaByMoiety).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, null, msgs);
			msgs = basicSetMolecularFormulaByMoiety(newMolecularFormulaByMoiety, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, newMolecularFormulaByMoiety, newMolecularFormulaByMoiety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionStructureIsotope> getIsotopes() {
		if (isotopes == null) {
			isotopes = new EObjectContainmentEList<SubstanceDefinitionStructureIsotope>(SubstanceDefinitionStructureIsotope.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE);
		}
		return isotopes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT, oldMolecularWeight, newMolecularWeight);
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
				msgs = ((InternalEObject)molecularWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT, null, msgs);
			if (newMolecularWeight != null)
				msgs = ((InternalEObject)newMolecularWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT, null, msgs);
			msgs = basicSetMolecularWeight(newMolecularWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT, newMolecularWeight, newMolecularWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Reference>(Reference.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionStructureRepresentation> getRepresentations() {
		if (representations == null) {
			representations = new EObjectContainmentEList<SubstanceDefinitionStructureRepresentation>(SubstanceDefinitionStructureRepresentation.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION);
		}
		return representations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY:
				return basicSetStereochemistry(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY:
				return basicSetOpticalActivity(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA:
				return basicSetMolecularFormula(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				return basicSetMolecularFormulaByMoiety(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE:
				return ((InternalEList<?>)getIsotopes()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT:
				return basicSetMolecularWeight(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY:
				return getStereochemistry();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY:
				return getOpticalActivity();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA:
				return getMolecularFormula();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				return getMolecularFormulaByMoiety();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE:
				return getIsotopes();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT:
				return getMolecularWeight();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__SOURCE:
				return getSources();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION:
				return getRepresentations();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA:
				setMolecularFormula((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				setMolecularFormulaByMoiety((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE:
				getIsotopes().clear();
				getIsotopes().addAll((Collection<? extends SubstanceDefinitionStructureIsotope>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceDefinitionStructureIsotopeMolecularWeight)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends Reference>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends SubstanceDefinitionStructureRepresentation>)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA:
				setMolecularFormula((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				setMolecularFormulaByMoiety((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE:
				getIsotopes().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceDefinitionStructureIsotopeMolecularWeight)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__SOURCE:
				getSources().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION:
				getRepresentations().clear();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY:
				return stereochemistry != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY:
				return opticalActivity != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA:
				return molecularFormula != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				return molecularFormulaByMoiety != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE:
				return isotopes != null && !isotopes.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT:
				return molecularWeight != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__SOURCE:
				return sources != null && !sources.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION:
				return representations != null && !representations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionStructureImpl
