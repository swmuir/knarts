/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.ArtifactSummary;
import org.hl7.knowledgeartifact.r2.Manifest;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ManifestImpl#getArtifactSummary <em>Artifact Summary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestImpl extends MinimalEObjectImpl.Container implements Manifest {
	/**
	 * The cached value of the '{@link #getArtifactSummary() <em>Artifact Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactSummary()
	 * @generated
	 * @ordered
	 */
	protected ArtifactSummary artifactSummary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getManifest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSummary getArtifactSummary() {
		return artifactSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactSummary(ArtifactSummary newArtifactSummary, NotificationChain msgs) {
		ArtifactSummary oldArtifactSummary = artifactSummary;
		artifactSummary = newArtifactSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.MANIFEST__ARTIFACT_SUMMARY, oldArtifactSummary, newArtifactSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactSummary(ArtifactSummary newArtifactSummary) {
		if (newArtifactSummary != artifactSummary) {
			NotificationChain msgs = null;
			if (artifactSummary != null)
				msgs = ((InternalEObject)artifactSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.MANIFEST__ARTIFACT_SUMMARY, null, msgs);
			if (newArtifactSummary != null)
				msgs = ((InternalEObject)newArtifactSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.MANIFEST__ARTIFACT_SUMMARY, null, msgs);
			msgs = basicSetArtifactSummary(newArtifactSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.MANIFEST__ARTIFACT_SUMMARY, newArtifactSummary, newArtifactSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.MANIFEST__ARTIFACT_SUMMARY:
				return basicSetArtifactSummary(null, msgs);
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
			case R2Package.MANIFEST__ARTIFACT_SUMMARY:
				return getArtifactSummary();
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
			case R2Package.MANIFEST__ARTIFACT_SUMMARY:
				setArtifactSummary((ArtifactSummary)newValue);
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
			case R2Package.MANIFEST__ARTIFACT_SUMMARY:
				setArtifactSummary((ArtifactSummary)null);
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
			case R2Package.MANIFEST__ARTIFACT_SUMMARY:
				return artifactSummary != null;
		}
		return super.eIsSet(featureID);
	}

} //ManifestImpl
