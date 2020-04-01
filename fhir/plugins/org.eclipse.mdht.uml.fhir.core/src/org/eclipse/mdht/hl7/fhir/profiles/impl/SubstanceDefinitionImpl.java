/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

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
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinition;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionCode;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionMoiety;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionName;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionProperty;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionRelationship;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionStructure;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight;

import org.eclipse.mdht.hl7.fhir.resources.impl.DomainResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getMoieties <em>Moiety</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getProperties <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getMolecularWeights <em>Molecular Weight</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getRelationships <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getNucleicAcid <em>Nucleic Acid</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getPolymer <em>Polymer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getProtein <em>Protein</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionImpl#getSourceMaterial <em>Source Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionImpl extends DomainResourceImpl implements SubstanceDefinition {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept domain;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String comment;

	/**
	 * The cached value of the '{@link #getMoieties() <em>Moiety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoieties()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionMoiety> moieties;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionProperty> properties;

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
	protected SubstanceDefinitionStructure structure;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionCode> codes;

	/**
	 * The cached value of the '{@link #getNames() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionName> names;

	/**
	 * The cached value of the '{@link #getMolecularWeights() <em>Molecular Weight</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeights()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionStructureIsotopeMolecularWeight> molecularWeights;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionRelationship> relationships;

	/**
	 * The cached value of the '{@link #getNucleicAcid() <em>Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNucleicAcid()
	 * @generated
	 * @ordered
	 */
	protected Reference nucleicAcid;

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
	 * The cached value of the '{@link #getProtein() <em>Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtein()
	 * @generated
	 * @ordered
	 */
	protected Reference protein;

	/**
	 * The cached value of the '{@link #getSourceMaterial() <em>Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterial()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(CodeableConcept newDomain, NotificationChain msgs) {
		CodeableConcept oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN, oldDomain, newDomain);
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
	public void setDomain(CodeableConcept newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Reference>(Reference.class, this, ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT, oldComment, newComment);
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
	public void setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceDefinitionMoiety> getMoieties() {
		if (moieties == null) {
			moieties = new EObjectContainmentEList<SubstanceDefinitionMoiety>(SubstanceDefinitionMoiety.class, this, ProfilesPackage.SUBSTANCE_DEFINITION__MOIETY);
		}
		return moieties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceDefinitionProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<SubstanceDefinitionProperty>(SubstanceDefinitionProperty.class, this, ProfilesPackage.SUBSTANCE_DEFINITION__PROPERTY);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, oldReferenceInformation, newReferenceInformation);
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
	public void setReferenceInformation(Reference newReferenceInformation) {
		if (newReferenceInformation != referenceInformation) {
			NotificationChain msgs = null;
			if (referenceInformation != null)
				msgs = ((InternalEObject)referenceInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, null, msgs);
			if (newReferenceInformation != null)
				msgs = ((InternalEObject)newReferenceInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, null, msgs);
			msgs = basicSetReferenceInformation(newReferenceInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION, newReferenceInformation, newReferenceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(SubstanceDefinitionStructure newStructure, NotificationChain msgs) {
		SubstanceDefinitionStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(SubstanceDefinitionStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceDefinitionCode> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<SubstanceDefinitionCode>(SubstanceDefinitionCode.class, this, ProfilesPackage.SUBSTANCE_DEFINITION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceDefinitionName> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<SubstanceDefinitionName>(SubstanceDefinitionName.class, this, ProfilesPackage.SUBSTANCE_DEFINITION__NAME);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceDefinitionStructureIsotopeMolecularWeight> getMolecularWeights() {
		if (molecularWeights == null) {
			molecularWeights = new EObjectContainmentEList<SubstanceDefinitionStructureIsotopeMolecularWeight>(SubstanceDefinitionStructureIsotopeMolecularWeight.class, this, ProfilesPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT);
		}
		return molecularWeights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceDefinitionRelationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<SubstanceDefinitionRelationship>(SubstanceDefinitionRelationship.class, this, ProfilesPackage.SUBSTANCE_DEFINITION__RELATIONSHIP);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getNucleicAcid() {
		return nucleicAcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNucleicAcid(Reference newNucleicAcid, NotificationChain msgs) {
		Reference oldNucleicAcid = nucleicAcid;
		nucleicAcid = newNucleicAcid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, oldNucleicAcid, newNucleicAcid);
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
	public void setNucleicAcid(Reference newNucleicAcid) {
		if (newNucleicAcid != nucleicAcid) {
			NotificationChain msgs = null;
			if (nucleicAcid != null)
				msgs = ((InternalEObject)nucleicAcid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, null, msgs);
			if (newNucleicAcid != null)
				msgs = ((InternalEObject)newNucleicAcid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, null, msgs);
			msgs = basicSetNucleicAcid(newNucleicAcid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID, newNucleicAcid, newNucleicAcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER, oldPolymer, newPolymer);
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
	public void setPolymer(Reference newPolymer) {
		if (newPolymer != polymer) {
			NotificationChain msgs = null;
			if (polymer != null)
				msgs = ((InternalEObject)polymer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER, null, msgs);
			if (newPolymer != null)
				msgs = ((InternalEObject)newPolymer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER, null, msgs);
			msgs = basicSetPolymer(newPolymer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER, newPolymer, newPolymer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProtein() {
		return protein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtein(Reference newProtein, NotificationChain msgs) {
		Reference oldProtein = protein;
		protein = newProtein;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN, oldProtein, newProtein);
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
	public void setProtein(Reference newProtein) {
		if (newProtein != protein) {
			NotificationChain msgs = null;
			if (protein != null)
				msgs = ((InternalEObject)protein).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN, null, msgs);
			if (newProtein != null)
				msgs = ((InternalEObject)newProtein).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN, null, msgs);
			msgs = basicSetProtein(newProtein, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN, newProtein, newProtein));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSourceMaterial() {
		return sourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterial(Reference newSourceMaterial, NotificationChain msgs) {
		Reference oldSourceMaterial = sourceMaterial;
		sourceMaterial = newSourceMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, oldSourceMaterial, newSourceMaterial);
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
	public void setSourceMaterial(Reference newSourceMaterial) {
		if (newSourceMaterial != sourceMaterial) {
			NotificationChain msgs = null;
			if (sourceMaterial != null)
				msgs = ((InternalEObject)sourceMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, null, msgs);
			if (newSourceMaterial != null)
				msgs = ((InternalEObject)newSourceMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, null, msgs);
			msgs = basicSetSourceMaterial(newSourceMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL, newSourceMaterial, newSourceMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN:
				return basicSetDomain(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT:
				return basicSetComment(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOIETY:
				return ((InternalEList<?>)getMoieties()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				return basicSetReferenceInformation(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				return basicSetStructure(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__NAME:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				return ((InternalEList<?>)getMolecularWeights()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				return basicSetNucleicAcid(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER:
				return basicSetPolymer(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN:
				return basicSetProtein(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				return basicSetSourceMaterial(null, msgs);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case ProfilesPackage.SUBSTANCE_DEFINITION__TYPE:
				return getType();
			case ProfilesPackage.SUBSTANCE_DEFINITION__STATUS:
				return getStatus();
			case ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN:
				return getDomain();
			case ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				return getDescription();
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE:
				return getSources();
			case ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT:
				return getComment();
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOIETY:
				return getMoieties();
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROPERTY:
				return getProperties();
			case ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				return getReferenceInformation();
			case ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				return getStructure();
			case ProfilesPackage.SUBSTANCE_DEFINITION__CODE:
				return getCodes();
			case ProfilesPackage.SUBSTANCE_DEFINITION__NAME:
				return getNames();
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				return getMolecularWeights();
			case ProfilesPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				return getRelationships();
			case ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				return getNucleicAcid();
			case ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER:
				return getPolymer();
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN:
				return getProtein();
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				return getSourceMaterial();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN:
				setDomain((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends Reference>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOIETY:
				getMoieties().clear();
				getMoieties().addAll((Collection<? extends SubstanceDefinitionMoiety>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends SubstanceDefinitionProperty>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				setStructure((SubstanceDefinitionStructure)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends SubstanceDefinitionCode>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends SubstanceDefinitionName>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				getMolecularWeights().clear();
				getMolecularWeights().addAll((Collection<? extends SubstanceDefinitionStructureIsotopeMolecularWeight>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends SubstanceDefinitionRelationship>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				setNucleicAcid((Reference)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER:
				setPolymer((Reference)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN:
				setProtein((Reference)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				setSourceMaterial((Reference)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN:
				setDomain((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE:
				getSources().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOIETY:
				getMoieties().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROPERTY:
				getProperties().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				setStructure((SubstanceDefinitionStructure)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__CODE:
				getCodes().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__NAME:
				getNames().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				getMolecularWeights().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				getRelationships().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				setNucleicAcid((Reference)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER:
				setPolymer((Reference)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN:
				setProtein((Reference)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				setSourceMaterial((Reference)null);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION__IDENTIFIER:
				return identifier != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__TYPE:
				return type != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__STATUS:
				return status != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__DOMAIN:
				return domain != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__DESCRIPTION:
				return description != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE:
				return sources != null && !sources.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION__COMMENT:
				return comment != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOIETY:
				return moieties != null && !moieties.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROPERTY:
				return properties != null && !properties.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION__REFERENCE_INFORMATION:
				return referenceInformation != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__STRUCTURE:
				return structure != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__CODE:
				return codes != null && !codes.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION__NAME:
				return names != null && !names.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT:
				return molecularWeights != null && !molecularWeights.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION__RELATIONSHIP:
				return relationships != null && !relationships.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION__NUCLEIC_ACID:
				return nucleicAcid != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__POLYMER:
				return polymer != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__PROTEIN:
				return protein != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION__SOURCE_MATERIAL:
				return sourceMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionImpl
