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
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceReferenceInformationRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Reference Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getSubstanceReference <em>Substance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getAmountText <em>Amount Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationRelationshipImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationRelationshipImpl extends BackboneElementImpl implements SubstanceReferenceInformationRelationship {
	/**
	 * The cached value of the '{@link #getSubstanceReference() <em>Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference substanceReference;

	/**
	 * The cached value of the '{@link #getSubstanceCodeableConcept() <em>Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substanceCodeableConcept;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept interaction;

	/**
	 * The cached value of the '{@link #getIsDefining() <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefining()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isDefining;

	/**
	 * The cached value of the '{@link #getAmountQuantity() <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity amountQuantity;

	/**
	 * The cached value of the '{@link #getAmountRange() <em>Amount Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRange()
	 * @generated
	 * @ordered
	 */
	protected Range amountRange;

	/**
	 * The cached value of the '{@link #getAmountString() <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountString;

	/**
	 * The cached value of the '{@link #getAmountType() <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept amountType;

	/**
	 * The cached value of the '{@link #getAmountText() <em>Amount Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountText;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceReferenceInformationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceReferenceInformationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubstanceReference() {
		return substanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceReference(Reference newSubstanceReference, NotificationChain msgs) {
		Reference oldSubstanceReference = substanceReference;
		substanceReference = newSubstanceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE, oldSubstanceReference, newSubstanceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceReference(Reference newSubstanceReference) {
		if (newSubstanceReference != substanceReference) {
			NotificationChain msgs = null;
			if (substanceReference != null)
				msgs = ((InternalEObject)substanceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE, null, msgs);
			if (newSubstanceReference != null)
				msgs = ((InternalEObject)newSubstanceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE, null, msgs);
			msgs = basicSetSubstanceReference(newSubstanceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE, newSubstanceReference, newSubstanceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstanceCodeableConcept() {
		return substanceCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceCodeableConcept(CodeableConcept newSubstanceCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubstanceCodeableConcept = substanceCodeableConcept;
		substanceCodeableConcept = newSubstanceCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, oldSubstanceCodeableConcept, newSubstanceCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceCodeableConcept(CodeableConcept newSubstanceCodeableConcept) {
		if (newSubstanceCodeableConcept != substanceCodeableConcept) {
			NotificationChain msgs = null;
			if (substanceCodeableConcept != null)
				msgs = ((InternalEObject)substanceCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			if (newSubstanceCodeableConcept != null)
				msgs = ((InternalEObject)newSubstanceCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubstanceCodeableConcept(newSubstanceCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, newSubstanceCodeableConcept, newSubstanceCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(CodeableConcept newInteraction, NotificationChain msgs) {
		CodeableConcept oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION, oldInteraction, newInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(CodeableConcept newInteraction) {
		if (newInteraction != interaction) {
			NotificationChain msgs = null;
			if (interaction != null)
				msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION, null, msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION, null, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsDefining() {
		return isDefining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefining(org.hl7.fhir.Boolean newIsDefining, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsDefining = isDefining;
		isDefining = newIsDefining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING, oldIsDefining, newIsDefining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefining(org.hl7.fhir.Boolean newIsDefining) {
		if (newIsDefining != isDefining) {
			NotificationChain msgs = null;
			if (isDefining != null)
				msgs = ((InternalEObject)isDefining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING, null, msgs);
			if (newIsDefining != null)
				msgs = ((InternalEObject)newIsDefining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING, null, msgs);
			msgs = basicSetIsDefining(newIsDefining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING, newIsDefining, newIsDefining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getAmountQuantity() {
		return amountQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountQuantity(Quantity newAmountQuantity, NotificationChain msgs) {
		Quantity oldAmountQuantity = amountQuantity;
		amountQuantity = newAmountQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY, oldAmountQuantity, newAmountQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountQuantity(Quantity newAmountQuantity) {
		if (newAmountQuantity != amountQuantity) {
			NotificationChain msgs = null;
			if (amountQuantity != null)
				msgs = ((InternalEObject)amountQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY, null, msgs);
			if (newAmountQuantity != null)
				msgs = ((InternalEObject)newAmountQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY, null, msgs);
			msgs = basicSetAmountQuantity(newAmountQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY, newAmountQuantity, newAmountQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getAmountRange() {
		return amountRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRange(Range newAmountRange, NotificationChain msgs) {
		Range oldAmountRange = amountRange;
		amountRange = newAmountRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE, oldAmountRange, newAmountRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountRange(Range newAmountRange) {
		if (newAmountRange != amountRange) {
			NotificationChain msgs = null;
			if (amountRange != null)
				msgs = ((InternalEObject)amountRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE, null, msgs);
			if (newAmountRange != null)
				msgs = ((InternalEObject)newAmountRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE, null, msgs);
			msgs = basicSetAmountRange(newAmountRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE, newAmountRange, newAmountRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAmountString() {
		return amountString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountString(org.hl7.fhir.String newAmountString, NotificationChain msgs) {
		org.hl7.fhir.String oldAmountString = amountString;
		amountString = newAmountString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING, oldAmountString, newAmountString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountString(org.hl7.fhir.String newAmountString) {
		if (newAmountString != amountString) {
			NotificationChain msgs = null;
			if (amountString != null)
				msgs = ((InternalEObject)amountString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING, null, msgs);
			if (newAmountString != null)
				msgs = ((InternalEObject)newAmountString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING, null, msgs);
			msgs = basicSetAmountString(newAmountString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING, newAmountString, newAmountString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAmountType() {
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountType(CodeableConcept newAmountType, NotificationChain msgs) {
		CodeableConcept oldAmountType = amountType;
		amountType = newAmountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE, oldAmountType, newAmountType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountType(CodeableConcept newAmountType) {
		if (newAmountType != amountType) {
			NotificationChain msgs = null;
			if (amountType != null)
				msgs = ((InternalEObject)amountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE, null, msgs);
			if (newAmountType != null)
				msgs = ((InternalEObject)newAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE, null, msgs);
			msgs = basicSetAmountType(newAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE, newAmountType, newAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAmountText() {
		return amountText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountText(org.hl7.fhir.String newAmountText, NotificationChain msgs) {
		org.hl7.fhir.String oldAmountText = amountText;
		amountText = newAmountText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT, oldAmountText, newAmountText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountText(org.hl7.fhir.String newAmountText) {
		if (newAmountText != amountText) {
			NotificationChain msgs = null;
			if (amountText != null)
				msgs = ((InternalEObject)amountText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT, null, msgs);
			if (newAmountText != null)
				msgs = ((InternalEObject)newAmountText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT, null, msgs);
			msgs = basicSetAmountText(newAmountText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT, newAmountText, newAmountText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				return basicSetSubstanceReference(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				return basicSetSubstanceCodeableConcept(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION:
				return basicSetInteraction(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING:
				return basicSetIsDefining(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY:
				return basicSetAmountQuantity(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE:
				return basicSetAmountRange(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING:
				return basicSetAmountString(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE:
				return basicSetAmountType(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT:
				return basicSetAmountText(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				return getSubstanceReference();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				return getSubstanceCodeableConcept();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION:
				return getInteraction();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING:
				return getIsDefining();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY:
				return getAmountQuantity();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE:
				return getAmountRange();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING:
				return getAmountString();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE:
				return getAmountType();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT:
				return getAmountText();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SOURCE:
				return getSource();
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				setSubstanceReference((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				setSubstanceCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION:
				setInteraction((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE:
				setAmountRange((Range)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE:
				setAmountType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT:
				setAmountText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				setSubstanceReference((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				setSubstanceCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION:
				setInteraction((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE:
				setAmountRange((Range)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE:
				setAmountType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT:
				setAmountText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SOURCE:
				getSource().clear();
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				return substanceReference != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				return substanceCodeableConcept != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__INTERACTION:
				return interaction != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__IS_DEFINING:
				return isDefining != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_QUANTITY:
				return amountQuantity != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_RANGE:
				return amountRange != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_STRING:
				return amountString != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TYPE:
				return amountType != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__AMOUNT_TEXT:
				return amountText != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationRelationshipImpl
