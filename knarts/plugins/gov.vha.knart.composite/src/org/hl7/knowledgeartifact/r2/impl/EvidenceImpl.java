/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.cdsdt.r2.CD;

import org.hl7.knowledgeartifact.r2.Evidence;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.SupportingResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.EvidenceImpl#getQualityOfEvidence <em>Quality Of Evidence</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.EvidenceImpl#getStrengthOfRecommendation <em>Strength Of Recommendation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.EvidenceImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends MinimalEObjectImpl.Container implements Evidence {
	/**
	 * The cached value of the '{@link #getQualityOfEvidence() <em>Quality Of Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityOfEvidence()
	 * @generated
	 * @ordered
	 */
	protected CD qualityOfEvidence;

	/**
	 * The cached value of the '{@link #getStrengthOfRecommendation() <em>Strength Of Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthOfRecommendation()
	 * @generated
	 * @ordered
	 */
	protected CD strengthOfRecommendation;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected SupportingResource resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getEvidence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getQualityOfEvidence() {
		return qualityOfEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualityOfEvidence(CD newQualityOfEvidence, NotificationChain msgs) {
		CD oldQualityOfEvidence = qualityOfEvidence;
		qualityOfEvidence = newQualityOfEvidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.EVIDENCE__QUALITY_OF_EVIDENCE, oldQualityOfEvidence, newQualityOfEvidence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityOfEvidence(CD newQualityOfEvidence) {
		if (newQualityOfEvidence != qualityOfEvidence) {
			NotificationChain msgs = null;
			if (qualityOfEvidence != null)
				msgs = ((InternalEObject)qualityOfEvidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.EVIDENCE__QUALITY_OF_EVIDENCE, null, msgs);
			if (newQualityOfEvidence != null)
				msgs = ((InternalEObject)newQualityOfEvidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.EVIDENCE__QUALITY_OF_EVIDENCE, null, msgs);
			msgs = basicSetQualityOfEvidence(newQualityOfEvidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EVIDENCE__QUALITY_OF_EVIDENCE, newQualityOfEvidence, newQualityOfEvidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getStrengthOfRecommendation() {
		return strengthOfRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthOfRecommendation(CD newStrengthOfRecommendation, NotificationChain msgs) {
		CD oldStrengthOfRecommendation = strengthOfRecommendation;
		strengthOfRecommendation = newStrengthOfRecommendation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION, oldStrengthOfRecommendation, newStrengthOfRecommendation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrengthOfRecommendation(CD newStrengthOfRecommendation) {
		if (newStrengthOfRecommendation != strengthOfRecommendation) {
			NotificationChain msgs = null;
			if (strengthOfRecommendation != null)
				msgs = ((InternalEObject)strengthOfRecommendation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION, null, msgs);
			if (newStrengthOfRecommendation != null)
				msgs = ((InternalEObject)newStrengthOfRecommendation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION, null, msgs);
			msgs = basicSetStrengthOfRecommendation(newStrengthOfRecommendation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION, newStrengthOfRecommendation, newStrengthOfRecommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingResource getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(SupportingResource newResources, NotificationChain msgs) {
		SupportingResource oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.EVIDENCE__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(SupportingResource newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.EVIDENCE__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.EVIDENCE__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EVIDENCE__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.EVIDENCE__QUALITY_OF_EVIDENCE:
				return basicSetQualityOfEvidence(null, msgs);
			case R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION:
				return basicSetStrengthOfRecommendation(null, msgs);
			case R2Package.EVIDENCE__RESOURCES:
				return basicSetResources(null, msgs);
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
			case R2Package.EVIDENCE__QUALITY_OF_EVIDENCE:
				return getQualityOfEvidence();
			case R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION:
				return getStrengthOfRecommendation();
			case R2Package.EVIDENCE__RESOURCES:
				return getResources();
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
			case R2Package.EVIDENCE__QUALITY_OF_EVIDENCE:
				setQualityOfEvidence((CD)newValue);
				return;
			case R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION:
				setStrengthOfRecommendation((CD)newValue);
				return;
			case R2Package.EVIDENCE__RESOURCES:
				setResources((SupportingResource)newValue);
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
			case R2Package.EVIDENCE__QUALITY_OF_EVIDENCE:
				setQualityOfEvidence((CD)null);
				return;
			case R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION:
				setStrengthOfRecommendation((CD)null);
				return;
			case R2Package.EVIDENCE__RESOURCES:
				setResources((SupportingResource)null);
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
			case R2Package.EVIDENCE__QUALITY_OF_EVIDENCE:
				return qualityOfEvidence != null;
			case R2Package.EVIDENCE__STRENGTH_OF_RECOMMENDATION:
				return strengthOfRecommendation != null;
			case R2Package.EVIDENCE__RESOURCES:
				return resources != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceImpl
