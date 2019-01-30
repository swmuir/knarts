/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductClinicals;
import org.hl7.fhir.MedicinalProductClinicalsContraindication;
import org.hl7.fhir.MedicinalProductClinicalsInteractions;
import org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication;
import org.hl7.fhir.MedicinalProductClinicalsUndesirableEffects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Clinicals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsImpl#getUndesirableEffects <em>Undesirable Effects</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsImpl#getTherapeuticIndication <em>Therapeutic Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsImpl#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductClinicalsImpl extends DomainResourceImpl implements MedicinalProductClinicals {
	/**
	 * The cached value of the '{@link #getUndesirableEffects() <em>Undesirable Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndesirableEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsUndesirableEffects> undesirableEffects;

	/**
	 * The cached value of the '{@link #getTherapeuticIndication() <em>Therapeutic Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTherapeuticIndication()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsTherapeuticIndication> therapeuticIndication;

	/**
	 * The cached value of the '{@link #getContraindication() <em>Contraindication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindication()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsContraindication> contraindication;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsInteractions> interactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductClinicalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductClinicals();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsUndesirableEffects> getUndesirableEffects() {
		if (undesirableEffects == null) {
			undesirableEffects = new EObjectContainmentEList<MedicinalProductClinicalsUndesirableEffects>(MedicinalProductClinicalsUndesirableEffects.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS__UNDESIRABLE_EFFECTS);
		}
		return undesirableEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsTherapeuticIndication> getTherapeuticIndication() {
		if (therapeuticIndication == null) {
			therapeuticIndication = new EObjectContainmentEList<MedicinalProductClinicalsTherapeuticIndication>(MedicinalProductClinicalsTherapeuticIndication.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS__THERAPEUTIC_INDICATION);
		}
		return therapeuticIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsContraindication> getContraindication() {
		if (contraindication == null) {
			contraindication = new EObjectContainmentEList<MedicinalProductClinicalsContraindication>(MedicinalProductClinicalsContraindication.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS__CONTRAINDICATION);
		}
		return contraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsInteractions> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<MedicinalProductClinicalsInteractions>(MedicinalProductClinicalsInteractions.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS__INTERACTIONS);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__UNDESIRABLE_EFFECTS:
				return ((InternalEList<?>)getUndesirableEffects()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__THERAPEUTIC_INDICATION:
				return ((InternalEList<?>)getTherapeuticIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__CONTRAINDICATION:
				return ((InternalEList<?>)getContraindication()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__INTERACTIONS:
				return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__UNDESIRABLE_EFFECTS:
				return getUndesirableEffects();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__THERAPEUTIC_INDICATION:
				return getTherapeuticIndication();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__CONTRAINDICATION:
				return getContraindication();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__INTERACTIONS:
				return getInteractions();
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__UNDESIRABLE_EFFECTS:
				getUndesirableEffects().clear();
				getUndesirableEffects().addAll((Collection<? extends MedicinalProductClinicalsUndesirableEffects>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__THERAPEUTIC_INDICATION:
				getTherapeuticIndication().clear();
				getTherapeuticIndication().addAll((Collection<? extends MedicinalProductClinicalsTherapeuticIndication>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__CONTRAINDICATION:
				getContraindication().clear();
				getContraindication().addAll((Collection<? extends MedicinalProductClinicalsContraindication>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__INTERACTIONS:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends MedicinalProductClinicalsInteractions>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__UNDESIRABLE_EFFECTS:
				getUndesirableEffects().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__THERAPEUTIC_INDICATION:
				getTherapeuticIndication().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__CONTRAINDICATION:
				getContraindication().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__INTERACTIONS:
				getInteractions().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__UNDESIRABLE_EFFECTS:
				return undesirableEffects != null && !undesirableEffects.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__THERAPEUTIC_INDICATION:
				return therapeuticIndication != null && !therapeuticIndication.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__CONTRAINDICATION:
				return contraindication != null && !contraindication.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS__INTERACTIONS:
				return interactions != null && !interactions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductClinicalsImpl
