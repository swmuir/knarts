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

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisCertaintyCertaintySubcomponent;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Evidence Synthesis Certainty Certainty Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl#getRatings <em>Rating</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl extends BackboneElementImpl implements EffectEvidenceSynthesisCertaintyCertaintySubcomponent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEffectEvidenceSynthesisCertaintyCertaintySubcomponent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRatings() {
		if (ratings == null) {
			ratings = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__RATING);
		}
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__RATING:
				return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE:
				return getType();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__RATING:
				return getRatings();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__NOTE:
				return getNotes();
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__RATING:
				getRatings().clear();
				getRatings().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__RATING:
				getRatings().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__TYPE:
				return type != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__RATING:
				return ratings != null && !ratings.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl
