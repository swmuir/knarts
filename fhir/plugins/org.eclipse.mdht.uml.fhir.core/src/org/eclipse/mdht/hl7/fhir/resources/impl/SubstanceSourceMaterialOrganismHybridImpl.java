/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialOrganismHybrid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Organism Hybrid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialOrganismHybridImpl#getMaternalOrganismId <em>Maternal Organism Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialOrganismHybridImpl#getMaternalOrganismName <em>Maternal Organism Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialOrganismHybridImpl#getPaternalOrganismId <em>Paternal Organism Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialOrganismHybridImpl#getPaternalOrganismName <em>Paternal Organism Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialOrganismHybridImpl#getHybridType <em>Hybrid Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialOrganismHybridImpl extends BackboneElementImpl implements SubstanceSourceMaterialOrganismHybrid {
	/**
	 * The cached value of the '{@link #getMaternalOrganismId() <em>Maternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalOrganismId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String maternalOrganismId;

	/**
	 * The cached value of the '{@link #getMaternalOrganismName() <em>Maternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalOrganismName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String maternalOrganismName;

	/**
	 * The cached value of the '{@link #getPaternalOrganismId() <em>Paternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaternalOrganismId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String paternalOrganismId;

	/**
	 * The cached value of the '{@link #getPaternalOrganismName() <em>Paternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaternalOrganismName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String paternalOrganismName;

	/**
	 * The cached value of the '{@link #getHybridType() <em>Hybrid Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybridType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept hybridType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialOrganismHybridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceSourceMaterialOrganismHybrid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getMaternalOrganismId() {
		return maternalOrganismId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaternalOrganismId(org.eclipse.mdht.hl7.fhir.dataTypes.String newMaternalOrganismId, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldMaternalOrganismId = maternalOrganismId;
		maternalOrganismId = newMaternalOrganismId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID, oldMaternalOrganismId, newMaternalOrganismId);
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
	public void setMaternalOrganismId(org.eclipse.mdht.hl7.fhir.dataTypes.String newMaternalOrganismId) {
		if (newMaternalOrganismId != maternalOrganismId) {
			NotificationChain msgs = null;
			if (maternalOrganismId != null)
				msgs = ((InternalEObject)maternalOrganismId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID, null, msgs);
			if (newMaternalOrganismId != null)
				msgs = ((InternalEObject)newMaternalOrganismId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID, null, msgs);
			msgs = basicSetMaternalOrganismId(newMaternalOrganismId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID, newMaternalOrganismId, newMaternalOrganismId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getMaternalOrganismName() {
		return maternalOrganismName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaternalOrganismName(org.eclipse.mdht.hl7.fhir.dataTypes.String newMaternalOrganismName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldMaternalOrganismName = maternalOrganismName;
		maternalOrganismName = newMaternalOrganismName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME, oldMaternalOrganismName, newMaternalOrganismName);
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
	public void setMaternalOrganismName(org.eclipse.mdht.hl7.fhir.dataTypes.String newMaternalOrganismName) {
		if (newMaternalOrganismName != maternalOrganismName) {
			NotificationChain msgs = null;
			if (maternalOrganismName != null)
				msgs = ((InternalEObject)maternalOrganismName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME, null, msgs);
			if (newMaternalOrganismName != null)
				msgs = ((InternalEObject)newMaternalOrganismName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME, null, msgs);
			msgs = basicSetMaternalOrganismName(newMaternalOrganismName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME, newMaternalOrganismName, newMaternalOrganismName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPaternalOrganismId() {
		return paternalOrganismId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaternalOrganismId(org.eclipse.mdht.hl7.fhir.dataTypes.String newPaternalOrganismId, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPaternalOrganismId = paternalOrganismId;
		paternalOrganismId = newPaternalOrganismId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID, oldPaternalOrganismId, newPaternalOrganismId);
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
	public void setPaternalOrganismId(org.eclipse.mdht.hl7.fhir.dataTypes.String newPaternalOrganismId) {
		if (newPaternalOrganismId != paternalOrganismId) {
			NotificationChain msgs = null;
			if (paternalOrganismId != null)
				msgs = ((InternalEObject)paternalOrganismId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID, null, msgs);
			if (newPaternalOrganismId != null)
				msgs = ((InternalEObject)newPaternalOrganismId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID, null, msgs);
			msgs = basicSetPaternalOrganismId(newPaternalOrganismId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID, newPaternalOrganismId, newPaternalOrganismId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPaternalOrganismName() {
		return paternalOrganismName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaternalOrganismName(org.eclipse.mdht.hl7.fhir.dataTypes.String newPaternalOrganismName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPaternalOrganismName = paternalOrganismName;
		paternalOrganismName = newPaternalOrganismName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME, oldPaternalOrganismName, newPaternalOrganismName);
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
	public void setPaternalOrganismName(org.eclipse.mdht.hl7.fhir.dataTypes.String newPaternalOrganismName) {
		if (newPaternalOrganismName != paternalOrganismName) {
			NotificationChain msgs = null;
			if (paternalOrganismName != null)
				msgs = ((InternalEObject)paternalOrganismName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME, null, msgs);
			if (newPaternalOrganismName != null)
				msgs = ((InternalEObject)newPaternalOrganismName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME, null, msgs);
			msgs = basicSetPaternalOrganismName(newPaternalOrganismName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME, newPaternalOrganismName, newPaternalOrganismName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getHybridType() {
		return hybridType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHybridType(CodeableConcept newHybridType, NotificationChain msgs) {
		CodeableConcept oldHybridType = hybridType;
		hybridType = newHybridType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE, oldHybridType, newHybridType);
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
	public void setHybridType(CodeableConcept newHybridType) {
		if (newHybridType != hybridType) {
			NotificationChain msgs = null;
			if (hybridType != null)
				msgs = ((InternalEObject)hybridType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE, null, msgs);
			if (newHybridType != null)
				msgs = ((InternalEObject)newHybridType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE, null, msgs);
			msgs = basicSetHybridType(newHybridType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE, newHybridType, newHybridType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID:
				return basicSetMaternalOrganismId(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME:
				return basicSetMaternalOrganismName(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID:
				return basicSetPaternalOrganismId(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME:
				return basicSetPaternalOrganismName(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE:
				return basicSetHybridType(null, msgs);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID:
				return getMaternalOrganismId();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME:
				return getMaternalOrganismName();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID:
				return getPaternalOrganismId();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME:
				return getPaternalOrganismName();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE:
				return getHybridType();
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID:
				setMaternalOrganismId((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME:
				setMaternalOrganismName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID:
				setPaternalOrganismId((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME:
				setPaternalOrganismName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE:
				setHybridType((CodeableConcept)newValue);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID:
				setMaternalOrganismId((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME:
				setMaternalOrganismName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID:
				setPaternalOrganismId((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME:
				setPaternalOrganismName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE:
				setHybridType((CodeableConcept)null);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_ID:
				return maternalOrganismId != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__MATERNAL_ORGANISM_NAME:
				return maternalOrganismName != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_ID:
				return paternalOrganismId != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__PATERNAL_ORGANISM_NAME:
				return paternalOrganismName != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID__HYBRID_TYPE:
				return hybridType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialOrganismHybridImpl
