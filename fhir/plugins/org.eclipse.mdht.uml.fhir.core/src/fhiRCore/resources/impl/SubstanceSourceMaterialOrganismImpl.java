/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstanceSourceMaterialOrganism;
import fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor;
import fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid;
import fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral;

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
 * An implementation of the model object '<em><b>Substance Source Material Organism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getGenus <em>Genus</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getIntraspecificType <em>Intraspecific Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getIntraspecificDescription <em>Intraspecific Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getHybrid <em>Hybrid</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceSourceMaterialOrganismImpl#getOrganismGeneral <em>Organism General</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialOrganismImpl extends BackboneElementImpl implements SubstanceSourceMaterialOrganism {
	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept family;

	/**
	 * The cached value of the '{@link #getGenus() <em>Genus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genus;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * The cached value of the '{@link #getIntraspecificType() <em>Intraspecific Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraspecificType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intraspecificType;

	/**
	 * The cached value of the '{@link #getIntraspecificDescription() <em>Intraspecific Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraspecificDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String intraspecificDescription;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSourceMaterialOrganismAuthor> authors;

	/**
	 * The cached value of the '{@link #getHybrid() <em>Hybrid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybrid()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSourceMaterialOrganismHybrid hybrid;

	/**
	 * The cached value of the '{@link #getOrganismGeneral() <em>Organism General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismGeneral()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSourceMaterialOrganismOrganismGeneral organismGeneral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialOrganismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceSourceMaterialOrganism();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily(CodeableConcept newFamily, NotificationChain msgs) {
		CodeableConcept oldFamily = family;
		family = newFamily;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY, oldFamily, newFamily);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(CodeableConcept newFamily) {
		if (newFamily != family) {
			NotificationChain msgs = null;
			if (family != null)
				msgs = ((InternalEObject)family).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY, null, msgs);
			if (newFamily != null)
				msgs = ((InternalEObject)newFamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY, null, msgs);
			msgs = basicSetFamily(newFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY, newFamily, newFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenus() {
		return genus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenus(CodeableConcept newGenus, NotificationChain msgs) {
		CodeableConcept oldGenus = genus;
		genus = newGenus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS, oldGenus, newGenus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenus(CodeableConcept newGenus) {
		if (newGenus != genus) {
			NotificationChain msgs = null;
			if (genus != null)
				msgs = ((InternalEObject)genus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS, null, msgs);
			if (newGenus != null)
				msgs = ((InternalEObject)newGenus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS, null, msgs);
			msgs = basicSetGenus(newGenus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS, newGenus, newGenus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecies(CodeableConcept newSpecies, NotificationChain msgs) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES, oldSpecies, newSpecies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(CodeableConcept newSpecies) {
		if (newSpecies != species) {
			NotificationChain msgs = null;
			if (species != null)
				msgs = ((InternalEObject)species).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES, null, msgs);
			if (newSpecies != null)
				msgs = ((InternalEObject)newSpecies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES, null, msgs);
			msgs = basicSetSpecies(newSpecies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES, newSpecies, newSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getIntraspecificType() {
		return intraspecificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntraspecificType(CodeableConcept newIntraspecificType, NotificationChain msgs) {
		CodeableConcept oldIntraspecificType = intraspecificType;
		intraspecificType = newIntraspecificType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE, oldIntraspecificType, newIntraspecificType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntraspecificType(CodeableConcept newIntraspecificType) {
		if (newIntraspecificType != intraspecificType) {
			NotificationChain msgs = null;
			if (intraspecificType != null)
				msgs = ((InternalEObject)intraspecificType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE, null, msgs);
			if (newIntraspecificType != null)
				msgs = ((InternalEObject)newIntraspecificType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE, null, msgs);
			msgs = basicSetIntraspecificType(newIntraspecificType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE, newIntraspecificType, newIntraspecificType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getIntraspecificDescription() {
		return intraspecificDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntraspecificDescription(fhiRCore.dataTypes.String newIntraspecificDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldIntraspecificDescription = intraspecificDescription;
		intraspecificDescription = newIntraspecificDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION, oldIntraspecificDescription, newIntraspecificDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntraspecificDescription(fhiRCore.dataTypes.String newIntraspecificDescription) {
		if (newIntraspecificDescription != intraspecificDescription) {
			NotificationChain msgs = null;
			if (intraspecificDescription != null)
				msgs = ((InternalEObject)intraspecificDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION, null, msgs);
			if (newIntraspecificDescription != null)
				msgs = ((InternalEObject)newIntraspecificDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION, null, msgs);
			msgs = basicSetIntraspecificDescription(newIntraspecificDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION, newIntraspecificDescription, newIntraspecificDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceSourceMaterialOrganismAuthor> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<SubstanceSourceMaterialOrganismAuthor>(SubstanceSourceMaterialOrganismAuthor.class, this, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialOrganismHybrid getHybrid() {
		return hybrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHybrid(SubstanceSourceMaterialOrganismHybrid newHybrid, NotificationChain msgs) {
		SubstanceSourceMaterialOrganismHybrid oldHybrid = hybrid;
		hybrid = newHybrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID, oldHybrid, newHybrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHybrid(SubstanceSourceMaterialOrganismHybrid newHybrid) {
		if (newHybrid != hybrid) {
			NotificationChain msgs = null;
			if (hybrid != null)
				msgs = ((InternalEObject)hybrid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID, null, msgs);
			if (newHybrid != null)
				msgs = ((InternalEObject)newHybrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID, null, msgs);
			msgs = basicSetHybrid(newHybrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID, newHybrid, newHybrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialOrganismOrganismGeneral getOrganismGeneral() {
		return organismGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganismGeneral(SubstanceSourceMaterialOrganismOrganismGeneral newOrganismGeneral, NotificationChain msgs) {
		SubstanceSourceMaterialOrganismOrganismGeneral oldOrganismGeneral = organismGeneral;
		organismGeneral = newOrganismGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL, oldOrganismGeneral, newOrganismGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganismGeneral(SubstanceSourceMaterialOrganismOrganismGeneral newOrganismGeneral) {
		if (newOrganismGeneral != organismGeneral) {
			NotificationChain msgs = null;
			if (organismGeneral != null)
				msgs = ((InternalEObject)organismGeneral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL, null, msgs);
			if (newOrganismGeneral != null)
				msgs = ((InternalEObject)newOrganismGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL, null, msgs);
			msgs = basicSetOrganismGeneral(newOrganismGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL, newOrganismGeneral, newOrganismGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY:
				return basicSetFamily(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS:
				return basicSetGenus(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES:
				return basicSetSpecies(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE:
				return basicSetIntraspecificType(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION:
				return basicSetIntraspecificDescription(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID:
				return basicSetHybrid(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL:
				return basicSetOrganismGeneral(null, msgs);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY:
				return getFamily();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS:
				return getGenus();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES:
				return getSpecies();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE:
				return getIntraspecificType();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION:
				return getIntraspecificDescription();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__AUTHOR:
				return getAuthors();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID:
				return getHybrid();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL:
				return getOrganismGeneral();
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY:
				setFamily((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS:
				setGenus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES:
				setSpecies((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE:
				setIntraspecificType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION:
				setIntraspecificDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends SubstanceSourceMaterialOrganismAuthor>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID:
				setHybrid((SubstanceSourceMaterialOrganismHybrid)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL:
				setOrganismGeneral((SubstanceSourceMaterialOrganismOrganismGeneral)newValue);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY:
				setFamily((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS:
				setGenus((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES:
				setSpecies((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE:
				setIntraspecificType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION:
				setIntraspecificDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID:
				setHybrid((SubstanceSourceMaterialOrganismHybrid)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL:
				setOrganismGeneral((SubstanceSourceMaterialOrganismOrganismGeneral)null);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__FAMILY:
				return family != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__GENUS:
				return genus != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__SPECIES:
				return species != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_TYPE:
				return intraspecificType != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__INTRASPECIFIC_DESCRIPTION:
				return intraspecificDescription != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__HYBRID:
				return hybrid != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM__ORGANISM_GENERAL:
				return organismGeneral != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialOrganismImpl
