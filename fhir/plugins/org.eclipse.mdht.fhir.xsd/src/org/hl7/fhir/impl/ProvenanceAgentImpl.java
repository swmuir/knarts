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
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getWhoIdentifier <em>Who Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getOnBehalfOfIdentifier <em>On Behalf Of Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getOnBehalfOfReference <em>On Behalf Of Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceAgentImpl extends BackboneElementImpl implements ProvenanceAgent {
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
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> role;

	/**
	 * The cached value of the '{@link #getWhoIdentifier() <em>Who Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier whoIdentifier;

	/**
	 * The cached value of the '{@link #getWhoReference() <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoReference()
	 * @generated
	 * @ordered
	 */
	protected Reference whoReference;

	/**
	 * The cached value of the '{@link #getOnBehalfOfIdentifier() <em>On Behalf Of Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOfIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier onBehalfOfIdentifier;

	/**
	 * The cached value of the '{@link #getOnBehalfOfReference() <em>On Behalf Of Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOfReference()
	 * @generated
	 * @ordered
	 */
	protected Reference onBehalfOfReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProvenanceAgent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROVENANCE_AGENT__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getWhoIdentifier() {
		return whoIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoIdentifier(Identifier newWhoIdentifier, NotificationChain msgs) {
		Identifier oldWhoIdentifier = whoIdentifier;
		whoIdentifier = newWhoIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER, oldWhoIdentifier, newWhoIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoIdentifier(Identifier newWhoIdentifier) {
		if (newWhoIdentifier != whoIdentifier) {
			NotificationChain msgs = null;
			if (whoIdentifier != null)
				msgs = ((InternalEObject)whoIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER, null, msgs);
			if (newWhoIdentifier != null)
				msgs = ((InternalEObject)newWhoIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER, null, msgs);
			msgs = basicSetWhoIdentifier(newWhoIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER, newWhoIdentifier, newWhoIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWhoReference() {
		return whoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoReference(Reference newWhoReference, NotificationChain msgs) {
		Reference oldWhoReference = whoReference;
		whoReference = newWhoReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, oldWhoReference, newWhoReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoReference(Reference newWhoReference) {
		if (newWhoReference != whoReference) {
			NotificationChain msgs = null;
			if (whoReference != null)
				msgs = ((InternalEObject)whoReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, null, msgs);
			if (newWhoReference != null)
				msgs = ((InternalEObject)newWhoReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, null, msgs);
			msgs = basicSetWhoReference(newWhoReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, newWhoReference, newWhoReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOnBehalfOfIdentifier() {
		return onBehalfOfIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOfIdentifier(Identifier newOnBehalfOfIdentifier, NotificationChain msgs) {
		Identifier oldOnBehalfOfIdentifier = onBehalfOfIdentifier;
		onBehalfOfIdentifier = newOnBehalfOfIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER, oldOnBehalfOfIdentifier, newOnBehalfOfIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOfIdentifier(Identifier newOnBehalfOfIdentifier) {
		if (newOnBehalfOfIdentifier != onBehalfOfIdentifier) {
			NotificationChain msgs = null;
			if (onBehalfOfIdentifier != null)
				msgs = ((InternalEObject)onBehalfOfIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER, null, msgs);
			if (newOnBehalfOfIdentifier != null)
				msgs = ((InternalEObject)newOnBehalfOfIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER, null, msgs);
			msgs = basicSetOnBehalfOfIdentifier(newOnBehalfOfIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER, newOnBehalfOfIdentifier, newOnBehalfOfIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOnBehalfOfReference() {
		return onBehalfOfReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOfReference(Reference newOnBehalfOfReference, NotificationChain msgs) {
		Reference oldOnBehalfOfReference = onBehalfOfReference;
		onBehalfOfReference = newOnBehalfOfReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, oldOnBehalfOfReference, newOnBehalfOfReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOfReference(Reference newOnBehalfOfReference) {
		if (newOnBehalfOfReference != onBehalfOfReference) {
			NotificationChain msgs = null;
			if (onBehalfOfReference != null)
				msgs = ((InternalEObject)onBehalfOfReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, null, msgs);
			if (newOnBehalfOfReference != null)
				msgs = ((InternalEObject)newOnBehalfOfReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, null, msgs);
			msgs = basicSetOnBehalfOfReference(newOnBehalfOfReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, newOnBehalfOfReference, newOnBehalfOfReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER:
				return basicSetWhoIdentifier(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				return basicSetWhoReference(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER:
				return basicSetOnBehalfOfIdentifier(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				return basicSetOnBehalfOfReference(null, msgs);
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
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				return getType();
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return getRole();
			case FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER:
				return getWhoIdentifier();
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				return getWhoReference();
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER:
				return getOnBehalfOfIdentifier();
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				return getOnBehalfOfReference();
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
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER:
				setWhoIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				setWhoReference((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER:
				setOnBehalfOfIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				setOnBehalfOfReference((Reference)newValue);
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
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				getRole().clear();
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER:
				setWhoIdentifier((Identifier)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				setWhoReference((Reference)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER:
				setOnBehalfOfIdentifier((Identifier)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				setOnBehalfOfReference((Reference)null);
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
			case FhirPackage.PROVENANCE_AGENT__TYPE:
				return type != null;
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return role != null && !role.isEmpty();
			case FhirPackage.PROVENANCE_AGENT__WHO_IDENTIFIER:
				return whoIdentifier != null;
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				return whoReference != null;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_IDENTIFIER:
				return onBehalfOfIdentifier != null;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				return onBehalfOfReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceAgentImpl
