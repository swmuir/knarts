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
import org.hl7.fhir.SubstanceSpecificationOfficialName;
import org.hl7.fhir.SubstanceSpecificationSubstanceName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Substance Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationSubstanceNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationSubstanceNameImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationSubstanceNameImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationSubstanceNameImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationSubstanceNameImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationSubstanceNameImpl#getOfficialName <em>Official Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationSubstanceNameImpl#getReferenceSource <em>Reference Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationSubstanceNameImpl extends BackboneElementImpl implements SubstanceSpecificationSubstanceName {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> language;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> domain;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

	/**
	 * The cached value of the '{@link #getOfficialName() <em>Official Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficialName()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationOfficialName> officialName;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationSubstanceNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationSubstanceName();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceSpecificationOfficialName> getOfficialName() {
		if (officialName == null) {
			officialName = new EObjectContainmentEList<SubstanceSpecificationOfficialName>(SubstanceSpecificationOfficialName.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__OFFICIAL_NAME);
		}
		return officialName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getReferenceSource() {
		if (referenceSource == null) {
			referenceSource = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__REFERENCE_SOURCE);
		}
		return referenceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__OFFICIAL_NAME:
				return ((InternalEList<?>)getOfficialName()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__REFERENCE_SOURCE:
				return ((InternalEList<?>)getReferenceSource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__LANGUAGE:
				return getLanguage();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__DOMAIN:
				return getDomain();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__OFFICIAL_NAME:
				return getOfficialName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__REFERENCE_SOURCE:
				return getReferenceSource();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__OFFICIAL_NAME:
				getOfficialName().clear();
				getOfficialName().addAll((Collection<? extends SubstanceSpecificationOfficialName>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__REFERENCE_SOURCE:
				getReferenceSource().clear();
				getReferenceSource().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__LANGUAGE:
				getLanguage().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__DOMAIN:
				getDomain().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__OFFICIAL_NAME:
				getOfficialName().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__REFERENCE_SOURCE:
				getReferenceSource().clear();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__NAME:
				return name != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__LANGUAGE:
				return language != null && !language.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__DOMAIN:
				return domain != null && !domain.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__OFFICIAL_NAME:
				return officialName != null && !officialName.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_SUBSTANCE_NAME__REFERENCE_SOURCE:
				return referenceSource != null && !referenceSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationSubstanceNameImpl
