/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceSpecification;
import org.hl7.fhir.SubstanceSpecificationMoiety;
import org.hl7.fhir.SubstanceSpecificationMolecularWeight;
import org.hl7.fhir.SubstanceSpecificationProperty;
import org.hl7.fhir.SubstanceSpecificationStructure;
import org.hl7.fhir.SubstanceSpecificationSubstanceCode;
import org.hl7.fhir.SubstanceSpecificationSubstanceName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getStoichiometric <em>Stoichiometric</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getReferenceSource <em>Reference Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getMoiety <em>Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getSubstanceCode <em>Substance Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getSubstanceName <em>Substance Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getPolymer <em>Polymer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationImpl extends DomainResourceImpl implements SubstanceSpecification {
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getStoichiometric() <em>Stoichiometric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoichiometric()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean stoichiometric;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getReferenceSource() <em>Reference Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSource()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> referenceSource;

	/**
	 * The cached value of the '{@link #getMoiety() <em>Moiety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoiety()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationMoiety> moiety;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationProperty> property;

	/**
	 * The cached value of the '{@link #getReferenceInformation() <em>Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceInformation()
	 * @generated
	 * @ordered
	 */
	protected Reference referenceInformation;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSpecificationStructure structure;

	/**
	 * The cached value of the '{@link #getSubstanceCode() <em>Substance Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationSubstanceCode> substanceCode;

	/**
	 * The cached value of the '{@link #getSubstanceName() <em>Substance Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceName()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationSubstanceName> substanceName;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationMolecularWeight> molecularWeight;

	/**
	 * The cached value of the '{@link #getPolymer() <em>Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolymer()
	 * @generated
	 * @ordered
	 */
	protected Reference polymer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getStoichiometric() {
		return stoichiometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoichiometric(org.hl7.fhir.Boolean newStoichiometric, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldStoichiometric = stoichiometric;
		stoichiometric = newStoichiometric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC, oldStoichiometric, newStoichiometric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoichiometric(org.hl7.fhir.Boolean newStoichiometric) {
		if (newStoichiometric != stoichiometric) {
			NotificationChain msgs = null;
			if (stoichiometric != null)
				msgs = ((InternalEObject)stoichiometric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC, null, msgs);
			if (newStoichiometric != null)
				msgs = ((InternalEObject)newStoichiometric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC, null, msgs);
			msgs = basicSetStoichiometric(newStoichiometric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC, newStoichiometric, newStoichiometric));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getReferenceSource() {
		if (referenceSource == null) {
			referenceSource = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_SOURCE);
		}
		return referenceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceSpecificationMoiety> getMoiety() {
		if (moiety == null) {
			moiety = new EObjectContainmentEList<SubstanceSpecificationMoiety>(SubstanceSpecificationMoiety.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY);
		}
		return moiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceSpecificationProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<SubstanceSpecificationProperty>(SubstanceSpecificationProperty.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferenceInformation() {
		return referenceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceInformation(Reference newReferenceInformation, NotificationChain msgs) {
		Reference oldReferenceInformation = referenceInformation;
		referenceInformation = newReferenceInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, oldReferenceInformation, newReferenceInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceInformation(Reference newReferenceInformation) {
		if (newReferenceInformation != referenceInformation) {
			NotificationChain msgs = null;
			if (referenceInformation != null)
				msgs = ((InternalEObject)referenceInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, null, msgs);
			if (newReferenceInformation != null)
				msgs = ((InternalEObject)newReferenceInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, null, msgs);
			msgs = basicSetReferenceInformation(newReferenceInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, newReferenceInformation, newReferenceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSpecificationStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(SubstanceSpecificationStructure newStructure, NotificationChain msgs) {
		SubstanceSpecificationStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(SubstanceSpecificationStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceSpecificationSubstanceCode> getSubstanceCode() {
		if (substanceCode == null) {
			substanceCode = new EObjectContainmentEList<SubstanceSpecificationSubstanceCode>(SubstanceSpecificationSubstanceCode.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_CODE);
		}
		return substanceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceSpecificationSubstanceName> getSubstanceName() {
		if (substanceName == null) {
			substanceName = new EObjectContainmentEList<SubstanceSpecificationSubstanceName>(SubstanceSpecificationSubstanceName.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_NAME);
		}
		return substanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceSpecificationMolecularWeight> getMolecularWeight() {
		if (molecularWeight == null) {
			molecularWeight = new EObjectContainmentEList<SubstanceSpecificationMolecularWeight>(SubstanceSpecificationMolecularWeight.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT);
		}
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPolymer() {
		return polymer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolymer(Reference newPolymer, NotificationChain msgs) {
		Reference oldPolymer = polymer;
		polymer = newPolymer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, oldPolymer, newPolymer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolymer(Reference newPolymer) {
		if (newPolymer != polymer) {
			NotificationChain msgs = null;
			if (polymer != null)
				msgs = ((InternalEObject)polymer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, null, msgs);
			if (newPolymer != null)
				msgs = ((InternalEObject)newPolymer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, null, msgs);
			msgs = basicSetPolymer(newPolymer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, newPolymer, newPolymer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC:
				return basicSetStoichiometric(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_SOURCE:
				return ((InternalEList<?>)getReferenceSource()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				return ((InternalEList<?>)getMoiety()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				return basicSetReferenceInformation(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				return basicSetStructure(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_CODE:
				return ((InternalEList<?>)getSubstanceCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_NAME:
				return ((InternalEList<?>)getSubstanceName()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				return ((InternalEList<?>)getMolecularWeight()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				return basicSetPolymer(null, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				return getComment();
			case FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC:
				return getStoichiometric();
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_SOURCE:
				return getReferenceSource();
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				return getMoiety();
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				return getProperty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				return getReferenceInformation();
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				return getStructure();
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_CODE:
				return getSubstanceCode();
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_NAME:
				return getSubstanceName();
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				return getMolecularWeight();
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				return getPolymer();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC:
				setStoichiometric((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_SOURCE:
				getReferenceSource().clear();
				getReferenceSource().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				getMoiety().clear();
				getMoiety().addAll((Collection<? extends SubstanceSpecificationMoiety>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends SubstanceSpecificationProperty>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				setStructure((SubstanceSpecificationStructure)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_CODE:
				getSubstanceCode().clear();
				getSubstanceCode().addAll((Collection<? extends SubstanceSpecificationSubstanceCode>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_NAME:
				getSubstanceName().clear();
				getSubstanceName().addAll((Collection<? extends SubstanceSpecificationSubstanceName>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				getMolecularWeight().clear();
				getMolecularWeight().addAll((Collection<? extends SubstanceSpecificationMolecularWeight>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				setPolymer((Reference)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC:
				setStoichiometric((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_SOURCE:
				getReferenceSource().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				getMoiety().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				setStructure((SubstanceSpecificationStructure)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_CODE:
				getSubstanceCode().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_NAME:
				getSubstanceName().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				getMolecularWeight().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				setPolymer((Reference)null);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				return comment != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STOICHIOMETRIC:
				return stoichiometric != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_SOURCE:
				return referenceSource != null && !referenceSource.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				return moiety != null && !moiety.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				return referenceInformation != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				return structure != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_CODE:
				return substanceCode != null && !substanceCode.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__SUBSTANCE_NAME:
				return substanceName != null && !substanceName.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				return molecularWeight != null && !molecularWeight.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				return polymer != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationImpl
