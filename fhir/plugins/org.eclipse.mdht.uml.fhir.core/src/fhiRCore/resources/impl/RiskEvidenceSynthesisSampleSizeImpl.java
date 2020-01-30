/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.RiskEvidenceSynthesisSampleSize;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Evidence Synthesis Sample Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.RiskEvidenceSynthesisSampleSizeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskEvidenceSynthesisSampleSizeImpl#getNumberOfStudies <em>Number Of Studies</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RiskEvidenceSynthesisSampleSizeImpl#getNumberOfParticipants <em>Number Of Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskEvidenceSynthesisSampleSizeImpl extends BackboneElementImpl implements RiskEvidenceSynthesisSampleSize {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getNumberOfStudies() <em>Number Of Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStudies()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer numberOfStudies;

	/**
	 * The cached value of the '{@link #getNumberOfParticipants() <em>Number Of Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfParticipants()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer numberOfParticipants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskEvidenceSynthesisSampleSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRiskEvidenceSynthesisSampleSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getNumberOfStudies() {
		return numberOfStudies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfStudies(fhiRCore.dataTypes.Integer newNumberOfStudies, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldNumberOfStudies = numberOfStudies;
		numberOfStudies = newNumberOfStudies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES, oldNumberOfStudies, newNumberOfStudies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfStudies(fhiRCore.dataTypes.Integer newNumberOfStudies) {
		if (newNumberOfStudies != numberOfStudies) {
			NotificationChain msgs = null;
			if (numberOfStudies != null)
				msgs = ((InternalEObject)numberOfStudies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES, null, msgs);
			if (newNumberOfStudies != null)
				msgs = ((InternalEObject)newNumberOfStudies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES, null, msgs);
			msgs = basicSetNumberOfStudies(newNumberOfStudies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES, newNumberOfStudies, newNumberOfStudies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getNumberOfParticipants() {
		return numberOfParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfParticipants(fhiRCore.dataTypes.Integer newNumberOfParticipants, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldNumberOfParticipants = numberOfParticipants;
		numberOfParticipants = newNumberOfParticipants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, oldNumberOfParticipants, newNumberOfParticipants);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfParticipants(fhiRCore.dataTypes.Integer newNumberOfParticipants) {
		if (newNumberOfParticipants != numberOfParticipants) {
			NotificationChain msgs = null;
			if (numberOfParticipants != null)
				msgs = ((InternalEObject)numberOfParticipants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, null, msgs);
			if (newNumberOfParticipants != null)
				msgs = ((InternalEObject)newNumberOfParticipants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, null, msgs);
			msgs = basicSetNumberOfParticipants(newNumberOfParticipants, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS, newNumberOfParticipants, newNumberOfParticipants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				return basicSetNumberOfStudies(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				return basicSetNumberOfParticipants(null, msgs);
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				return getNumberOfStudies();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				return getNumberOfParticipants();
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				setNumberOfStudies((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				setNumberOfParticipants((fhiRCore.dataTypes.Integer)newValue);
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				setNumberOfStudies((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				setNumberOfParticipants((fhiRCore.dataTypes.Integer)null);
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_STUDIES:
				return numberOfStudies != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE__NUMBER_OF_PARTICIPANTS:
				return numberOfParticipants != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskEvidenceSynthesisSampleSizeImpl
