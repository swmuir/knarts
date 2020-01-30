/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.EffectEvidenceSynthesisCertainty;
import fhiRCore.resources.EffectEvidenceSynthesisCertaintyCertaintySubcomponent;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Evidence Synthesis Certainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisCertaintyImpl#getRatings <em>Rating</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisCertaintyImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisCertaintyImpl#getCertaintySubcomponents <em>Certainty Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectEvidenceSynthesisCertaintyImpl extends BackboneElementImpl implements EffectEvidenceSynthesisCertainty {
	/**
	 * The cached value of the '{@link #getRatings() <em>Rating</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> ratings;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getCertaintySubcomponents() <em>Certainty Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertaintySubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisCertaintyCertaintySubcomponent> certaintySubcomponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectEvidenceSynthesisCertaintyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEffectEvidenceSynthesisCertainty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRatings() {
		if (ratings == null) {
			ratings = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__RATING);
		}
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EffectEvidenceSynthesisCertaintyCertaintySubcomponent> getCertaintySubcomponents() {
		if (certaintySubcomponents == null) {
			certaintySubcomponents = new EObjectContainmentEList<EffectEvidenceSynthesisCertaintyCertaintySubcomponent>(EffectEvidenceSynthesisCertaintyCertaintySubcomponent.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT);
		}
		return certaintySubcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				return ((InternalEList<?>)getCertaintySubcomponents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				return getRatings();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				return getNotes();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				return getCertaintySubcomponents();
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				getRatings().clear();
				getRatings().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				getCertaintySubcomponents().clear();
				getCertaintySubcomponents().addAll((Collection<? extends EffectEvidenceSynthesisCertaintyCertaintySubcomponent>)newValue);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				getRatings().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				getCertaintySubcomponents().clear();
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				return ratings != null && !ratings.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				return certaintySubcomponents != null && !certaintySubcomponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffectEvidenceSynthesisCertaintyImpl
