/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterial;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialFractionDescription;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialOrganism;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialPartDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getSourceMaterialClass <em>Source Material Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getSourceMaterialType <em>Source Material Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getSourceMaterialState <em>Source Material State</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getOrganismId <em>Organism Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getOrganismName <em>Organism Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getParentSubstanceIds <em>Parent Substance Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getParentSubstanceNames <em>Parent Substance Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getCountryOfOrigins <em>Country Of Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getGeographicalLocations <em>Geographical Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getDevelopmentStage <em>Development Stage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getFractionDescriptions <em>Fraction Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getOrganism <em>Organism</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialImpl#getPartDescriptions <em>Part Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialImpl extends DomainResourceImpl implements SubstanceSourceMaterial {
	/**
	 * The cached value of the '{@link #getSourceMaterialClass() <em>Source Material Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterialClass()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sourceMaterialClass;

	/**
	 * The cached value of the '{@link #getSourceMaterialType() <em>Source Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterialType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sourceMaterialType;

	/**
	 * The cached value of the '{@link #getSourceMaterialState() <em>Source Material State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterialState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sourceMaterialState;

	/**
	 * The cached value of the '{@link #getOrganismId() <em>Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismId()
	 * @generated
	 * @ordered
	 */
	protected Identifier organismId;

	/**
	 * The cached value of the '{@link #getOrganismName() <em>Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String organismName;

	/**
	 * The cached value of the '{@link #getParentSubstanceIds() <em>Parent Substance Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSubstanceIds()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> parentSubstanceIds;

	/**
	 * The cached value of the '{@link #getParentSubstanceNames() <em>Parent Substance Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSubstanceNames()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> parentSubstanceNames;

	/**
	 * The cached value of the '{@link #getCountryOfOrigins() <em>Country Of Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfOrigins()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> countryOfOrigins;

	/**
	 * The cached value of the '{@link #getGeographicalLocations() <em>Geographical Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicalLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> geographicalLocations;

	/**
	 * The cached value of the '{@link #getDevelopmentStage() <em>Development Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentStage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept developmentStage;

	/**
	 * The cached value of the '{@link #getFractionDescriptions() <em>Fraction Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFractionDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSourceMaterialFractionDescription> fractionDescriptions;

	/**
	 * The cached value of the '{@link #getOrganism() <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganism()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSourceMaterialOrganism organism;

	/**
	 * The cached value of the '{@link #getPartDescriptions() <em>Part Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSourceMaterialPartDescription> partDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceSourceMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSourceMaterialClass() {
		return sourceMaterialClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterialClass(CodeableConcept newSourceMaterialClass, NotificationChain msgs) {
		CodeableConcept oldSourceMaterialClass = sourceMaterialClass;
		sourceMaterialClass = newSourceMaterialClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, oldSourceMaterialClass, newSourceMaterialClass);
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
	public void setSourceMaterialClass(CodeableConcept newSourceMaterialClass) {
		if (newSourceMaterialClass != sourceMaterialClass) {
			NotificationChain msgs = null;
			if (sourceMaterialClass != null)
				msgs = ((InternalEObject)sourceMaterialClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, null, msgs);
			if (newSourceMaterialClass != null)
				msgs = ((InternalEObject)newSourceMaterialClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, null, msgs);
			msgs = basicSetSourceMaterialClass(newSourceMaterialClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, newSourceMaterialClass, newSourceMaterialClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSourceMaterialType() {
		return sourceMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterialType(CodeableConcept newSourceMaterialType, NotificationChain msgs) {
		CodeableConcept oldSourceMaterialType = sourceMaterialType;
		sourceMaterialType = newSourceMaterialType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, oldSourceMaterialType, newSourceMaterialType);
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
	public void setSourceMaterialType(CodeableConcept newSourceMaterialType) {
		if (newSourceMaterialType != sourceMaterialType) {
			NotificationChain msgs = null;
			if (sourceMaterialType != null)
				msgs = ((InternalEObject)sourceMaterialType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, null, msgs);
			if (newSourceMaterialType != null)
				msgs = ((InternalEObject)newSourceMaterialType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, null, msgs);
			msgs = basicSetSourceMaterialType(newSourceMaterialType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, newSourceMaterialType, newSourceMaterialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSourceMaterialState() {
		return sourceMaterialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterialState(CodeableConcept newSourceMaterialState, NotificationChain msgs) {
		CodeableConcept oldSourceMaterialState = sourceMaterialState;
		sourceMaterialState = newSourceMaterialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, oldSourceMaterialState, newSourceMaterialState);
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
	public void setSourceMaterialState(CodeableConcept newSourceMaterialState) {
		if (newSourceMaterialState != sourceMaterialState) {
			NotificationChain msgs = null;
			if (sourceMaterialState != null)
				msgs = ((InternalEObject)sourceMaterialState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, null, msgs);
			if (newSourceMaterialState != null)
				msgs = ((InternalEObject)newSourceMaterialState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, null, msgs);
			msgs = basicSetSourceMaterialState(newSourceMaterialState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, newSourceMaterialState, newSourceMaterialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getOrganismId() {
		return organismId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganismId(Identifier newOrganismId, NotificationChain msgs) {
		Identifier oldOrganismId = organismId;
		organismId = newOrganismId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, oldOrganismId, newOrganismId);
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
	public void setOrganismId(Identifier newOrganismId) {
		if (newOrganismId != organismId) {
			NotificationChain msgs = null;
			if (organismId != null)
				msgs = ((InternalEObject)organismId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, null, msgs);
			if (newOrganismId != null)
				msgs = ((InternalEObject)newOrganismId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, null, msgs);
			msgs = basicSetOrganismId(newOrganismId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, newOrganismId, newOrganismId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getOrganismName() {
		return organismName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganismName(org.eclipse.mdht.hl7.fhir.dataTypes.String newOrganismName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldOrganismName = organismName;
		organismName = newOrganismName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, oldOrganismName, newOrganismName);
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
	public void setOrganismName(org.eclipse.mdht.hl7.fhir.dataTypes.String newOrganismName) {
		if (newOrganismName != organismName) {
			NotificationChain msgs = null;
			if (organismName != null)
				msgs = ((InternalEObject)organismName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, null, msgs);
			if (newOrganismName != null)
				msgs = ((InternalEObject)newOrganismName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, null, msgs);
			msgs = basicSetOrganismName(newOrganismName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, newOrganismName, newOrganismName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getParentSubstanceIds() {
		if (parentSubstanceIds == null) {
			parentSubstanceIds = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID);
		}
		return parentSubstanceIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getParentSubstanceNames() {
		if (parentSubstanceNames == null) {
			parentSubstanceNames = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME);
		}
		return parentSubstanceNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCountryOfOrigins() {
		if (countryOfOrigins == null) {
			countryOfOrigins = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN);
		}
		return countryOfOrigins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getGeographicalLocations() {
		if (geographicalLocations == null) {
			geographicalLocations = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION);
		}
		return geographicalLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDevelopmentStage() {
		return developmentStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevelopmentStage(CodeableConcept newDevelopmentStage, NotificationChain msgs) {
		CodeableConcept oldDevelopmentStage = developmentStage;
		developmentStage = newDevelopmentStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, oldDevelopmentStage, newDevelopmentStage);
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
	public void setDevelopmentStage(CodeableConcept newDevelopmentStage) {
		if (newDevelopmentStage != developmentStage) {
			NotificationChain msgs = null;
			if (developmentStage != null)
				msgs = ((InternalEObject)developmentStage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, null, msgs);
			if (newDevelopmentStage != null)
				msgs = ((InternalEObject)newDevelopmentStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, null, msgs);
			msgs = basicSetDevelopmentStage(newDevelopmentStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, newDevelopmentStage, newDevelopmentStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSourceMaterialFractionDescription> getFractionDescriptions() {
		if (fractionDescriptions == null) {
			fractionDescriptions = new EObjectContainmentEList<SubstanceSourceMaterialFractionDescription>(SubstanceSourceMaterialFractionDescription.class, this, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION);
		}
		return fractionDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganism getOrganism() {
		return organism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganism(SubstanceSourceMaterialOrganism newOrganism, NotificationChain msgs) {
		SubstanceSourceMaterialOrganism oldOrganism = organism;
		organism = newOrganism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, oldOrganism, newOrganism);
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
	public void setOrganism(SubstanceSourceMaterialOrganism newOrganism) {
		if (newOrganism != organism) {
			NotificationChain msgs = null;
			if (organism != null)
				msgs = ((InternalEObject)organism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, null, msgs);
			if (newOrganism != null)
				msgs = ((InternalEObject)newOrganism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, null, msgs);
			msgs = basicSetOrganism(newOrganism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, newOrganism, newOrganism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSourceMaterialPartDescription> getPartDescriptions() {
		if (partDescriptions == null) {
			partDescriptions = new EObjectContainmentEList<SubstanceSourceMaterialPartDescription>(SubstanceSourceMaterialPartDescription.class, this, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION);
		}
		return partDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				return basicSetSourceMaterialClass(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				return basicSetSourceMaterialType(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				return basicSetSourceMaterialState(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				return basicSetOrganismId(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				return basicSetOrganismName(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				return ((InternalEList<?>)getParentSubstanceIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				return ((InternalEList<?>)getParentSubstanceNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return ((InternalEList<?>)getCountryOfOrigins()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				return ((InternalEList<?>)getGeographicalLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				return basicSetDevelopmentStage(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				return ((InternalEList<?>)getFractionDescriptions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				return basicSetOrganism(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				return ((InternalEList<?>)getPartDescriptions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				return getSourceMaterialClass();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				return getSourceMaterialType();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				return getSourceMaterialState();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				return getOrganismId();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				return getOrganismName();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				return getParentSubstanceIds();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				return getParentSubstanceNames();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return getCountryOfOrigins();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				return getGeographicalLocations();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				return getDevelopmentStage();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				return getFractionDescriptions();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				return getOrganism();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				return getPartDescriptions();
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				setSourceMaterialClass((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				setSourceMaterialType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				setSourceMaterialState((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				setOrganismId((Identifier)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				setOrganismName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				getParentSubstanceIds().clear();
				getParentSubstanceIds().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				getParentSubstanceNames().clear();
				getParentSubstanceNames().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				getCountryOfOrigins().clear();
				getCountryOfOrigins().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				getGeographicalLocations().clear();
				getGeographicalLocations().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				setDevelopmentStage((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				getFractionDescriptions().clear();
				getFractionDescriptions().addAll((Collection<? extends SubstanceSourceMaterialFractionDescription>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				setOrganism((SubstanceSourceMaterialOrganism)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				getPartDescriptions().clear();
				getPartDescriptions().addAll((Collection<? extends SubstanceSourceMaterialPartDescription>)newValue);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				setSourceMaterialClass((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				setSourceMaterialType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				setSourceMaterialState((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				setOrganismId((Identifier)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				setOrganismName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				getParentSubstanceIds().clear();
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				getParentSubstanceNames().clear();
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				getCountryOfOrigins().clear();
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				getGeographicalLocations().clear();
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				setDevelopmentStage((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				getFractionDescriptions().clear();
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				setOrganism((SubstanceSourceMaterialOrganism)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				getPartDescriptions().clear();
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				return sourceMaterialClass != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				return sourceMaterialType != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				return sourceMaterialState != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				return organismId != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				return organismName != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				return parentSubstanceIds != null && !parentSubstanceIds.isEmpty();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				return parentSubstanceNames != null && !parentSubstanceNames.isEmpty();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return countryOfOrigins != null && !countryOfOrigins.isEmpty();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				return geographicalLocations != null && !geographicalLocations.isEmpty();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				return developmentStage != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				return fractionDescriptions != null && !fractionDescriptions.isEmpty();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				return organism != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				return partDescriptions != null && !partDescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialImpl
