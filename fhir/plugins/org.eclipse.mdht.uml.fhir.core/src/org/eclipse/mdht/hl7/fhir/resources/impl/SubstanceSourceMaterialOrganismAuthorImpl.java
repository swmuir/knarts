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
import org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialOrganismAuthor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Organism Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialOrganismAuthorImpl#getAuthorType <em>Author Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialOrganismAuthorImpl#getAuthorDescription <em>Author Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialOrganismAuthorImpl extends BackboneElementImpl implements SubstanceSourceMaterialOrganismAuthor {
	/**
	 * The cached value of the '{@link #getAuthorType() <em>Author Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept authorType;

	/**
	 * The cached value of the '{@link #getAuthorDescription() <em>Author Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String authorDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialOrganismAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceSourceMaterialOrganismAuthor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAuthorType() {
		return authorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorType(CodeableConcept newAuthorType, NotificationChain msgs) {
		CodeableConcept oldAuthorType = authorType;
		authorType = newAuthorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE, oldAuthorType, newAuthorType);
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
	public void setAuthorType(CodeableConcept newAuthorType) {
		if (newAuthorType != authorType) {
			NotificationChain msgs = null;
			if (authorType != null)
				msgs = ((InternalEObject)authorType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE, null, msgs);
			if (newAuthorType != null)
				msgs = ((InternalEObject)newAuthorType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE, null, msgs);
			msgs = basicSetAuthorType(newAuthorType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE, newAuthorType, newAuthorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getAuthorDescription() {
		return authorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newAuthorDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldAuthorDescription = authorDescription;
		authorDescription = newAuthorDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION, oldAuthorDescription, newAuthorDescription);
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
	public void setAuthorDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newAuthorDescription) {
		if (newAuthorDescription != authorDescription) {
			NotificationChain msgs = null;
			if (authorDescription != null)
				msgs = ((InternalEObject)authorDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION, null, msgs);
			if (newAuthorDescription != null)
				msgs = ((InternalEObject)newAuthorDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION, null, msgs);
			msgs = basicSetAuthorDescription(newAuthorDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION, newAuthorDescription, newAuthorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE:
				return basicSetAuthorType(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION:
				return basicSetAuthorDescription(null, msgs);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE:
				return getAuthorType();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION:
				return getAuthorDescription();
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE:
				setAuthorType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION:
				setAuthorDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE:
				setAuthorType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION:
				setAuthorDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_TYPE:
				return authorType != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR__AUTHOR_DESCRIPTION:
				return authorDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialOrganismAuthorImpl
