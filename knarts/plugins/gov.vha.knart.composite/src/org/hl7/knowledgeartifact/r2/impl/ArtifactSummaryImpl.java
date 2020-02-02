/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.ArtifactSummary;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactSummaryImpl extends MinimalEObjectImpl.Container implements ArtifactSummary {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EObject name;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EObject identifier;

	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected EObject artifactType;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected EObject size;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected EObject hash;

	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EObject signatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getArtifactSummary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(EObject newName, NotificationChain msgs) {
		EObject oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(EObject newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(EObject newIdentifier, NotificationChain msgs) {
		EObject oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(EObject newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactType(EObject newArtifactType, NotificationChain msgs) {
		EObject oldArtifactType = artifactType;
		artifactType = newArtifactType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE, oldArtifactType, newArtifactType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactType(EObject newArtifactType) {
		if (newArtifactType != artifactType) {
			NotificationChain msgs = null;
			if (artifactType != null)
				msgs = ((InternalEObject)artifactType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE, null, msgs);
			if (newArtifactType != null)
				msgs = ((InternalEObject)newArtifactType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE, null, msgs);
			msgs = basicSetArtifactType(newArtifactType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE, newArtifactType, newArtifactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(EObject newSize, NotificationChain msgs) {
		EObject oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(EObject newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHash(EObject newHash, NotificationChain msgs) {
		EObject oldHash = hash;
		hash = newHash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__HASH, oldHash, newHash);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(EObject newHash) {
		if (newHash != hash) {
			NotificationChain msgs = null;
			if (hash != null)
				msgs = ((InternalEObject)hash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__HASH, null, msgs);
			if (newHash != null)
				msgs = ((InternalEObject)newHash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__HASH, null, msgs);
			msgs = basicSetHash(newHash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__HASH, newHash, newHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSignatures() {
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatures(EObject newSignatures, NotificationChain msgs) {
		EObject oldSignatures = signatures;
		signatures = newSignatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__SIGNATURES, oldSignatures, newSignatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatures(EObject newSignatures) {
		if (newSignatures != signatures) {
			NotificationChain msgs = null;
			if (signatures != null)
				msgs = ((InternalEObject)signatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__SIGNATURES, null, msgs);
			if (newSignatures != null)
				msgs = ((InternalEObject)newSignatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ARTIFACT_SUMMARY__SIGNATURES, null, msgs);
			msgs = basicSetSignatures(newSignatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ARTIFACT_SUMMARY__SIGNATURES, newSignatures, newSignatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.ARTIFACT_SUMMARY__NAME:
				return basicSetName(null, msgs);
			case R2Package.ARTIFACT_SUMMARY__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE:
				return basicSetArtifactType(null, msgs);
			case R2Package.ARTIFACT_SUMMARY__SIZE:
				return basicSetSize(null, msgs);
			case R2Package.ARTIFACT_SUMMARY__HASH:
				return basicSetHash(null, msgs);
			case R2Package.ARTIFACT_SUMMARY__SIGNATURES:
				return basicSetSignatures(null, msgs);
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
			case R2Package.ARTIFACT_SUMMARY__NAME:
				return getName();
			case R2Package.ARTIFACT_SUMMARY__IDENTIFIER:
				return getIdentifier();
			case R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE:
				return getArtifactType();
			case R2Package.ARTIFACT_SUMMARY__SIZE:
				return getSize();
			case R2Package.ARTIFACT_SUMMARY__HASH:
				return getHash();
			case R2Package.ARTIFACT_SUMMARY__SIGNATURES:
				return getSignatures();
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
			case R2Package.ARTIFACT_SUMMARY__NAME:
				setName((EObject)newValue);
				return;
			case R2Package.ARTIFACT_SUMMARY__IDENTIFIER:
				setIdentifier((EObject)newValue);
				return;
			case R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE:
				setArtifactType((EObject)newValue);
				return;
			case R2Package.ARTIFACT_SUMMARY__SIZE:
				setSize((EObject)newValue);
				return;
			case R2Package.ARTIFACT_SUMMARY__HASH:
				setHash((EObject)newValue);
				return;
			case R2Package.ARTIFACT_SUMMARY__SIGNATURES:
				setSignatures((EObject)newValue);
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
			case R2Package.ARTIFACT_SUMMARY__NAME:
				setName((EObject)null);
				return;
			case R2Package.ARTIFACT_SUMMARY__IDENTIFIER:
				setIdentifier((EObject)null);
				return;
			case R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE:
				setArtifactType((EObject)null);
				return;
			case R2Package.ARTIFACT_SUMMARY__SIZE:
				setSize((EObject)null);
				return;
			case R2Package.ARTIFACT_SUMMARY__HASH:
				setHash((EObject)null);
				return;
			case R2Package.ARTIFACT_SUMMARY__SIGNATURES:
				setSignatures((EObject)null);
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
			case R2Package.ARTIFACT_SUMMARY__NAME:
				return name != null;
			case R2Package.ARTIFACT_SUMMARY__IDENTIFIER:
				return identifier != null;
			case R2Package.ARTIFACT_SUMMARY__ARTIFACT_TYPE:
				return artifactType != null;
			case R2Package.ARTIFACT_SUMMARY__SIZE:
				return size != null;
			case R2Package.ARTIFACT_SUMMARY__HASH:
				return hash != null;
			case R2Package.ARTIFACT_SUMMARY__SIGNATURES:
				return signatures != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactSummaryImpl
