/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.Composite;
import org.hl7.knowledgeartifact.r2.ContainedArtifactList;
import org.hl7.knowledgeartifact.r2.ControlBlock;
import org.hl7.knowledgeartifact.r2.Manifest;
import org.hl7.knowledgeartifact.r2.Metadata;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CompositeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CompositeImpl#getControlBlock <em>Control Block</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CompositeImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CompositeImpl#getContainedArtifacts <em>Contained Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends MinimalEObjectImpl.Container implements Composite {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getControlBlock() <em>Control Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlBlock()
	 * @generated
	 * @ordered
	 */
	protected ControlBlock controlBlock;

	/**
	 * The cached value of the '{@link #getManifest() <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifest()
	 * @generated
	 * @ordered
	 */
	protected Manifest manifest;

	/**
	 * The cached value of the '{@link #getContainedArtifacts() <em>Contained Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected ContainedArtifactList containedArtifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getComposite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlBlock getControlBlock() {
		return controlBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlBlock(ControlBlock newControlBlock, NotificationChain msgs) {
		ControlBlock oldControlBlock = controlBlock;
		controlBlock = newControlBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__CONTROL_BLOCK, oldControlBlock, newControlBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlBlock(ControlBlock newControlBlock) {
		if (newControlBlock != controlBlock) {
			NotificationChain msgs = null;
			if (controlBlock != null)
				msgs = ((InternalEObject)controlBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__CONTROL_BLOCK, null, msgs);
			if (newControlBlock != null)
				msgs = ((InternalEObject)newControlBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__CONTROL_BLOCK, null, msgs);
			msgs = basicSetControlBlock(newControlBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__CONTROL_BLOCK, newControlBlock, newControlBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest getManifest() {
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifest(Manifest newManifest, NotificationChain msgs) {
		Manifest oldManifest = manifest;
		manifest = newManifest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__MANIFEST, oldManifest, newManifest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifest(Manifest newManifest) {
		if (newManifest != manifest) {
			NotificationChain msgs = null;
			if (manifest != null)
				msgs = ((InternalEObject)manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__MANIFEST, null, msgs);
			if (newManifest != null)
				msgs = ((InternalEObject)newManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__MANIFEST, null, msgs);
			msgs = basicSetManifest(newManifest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__MANIFEST, newManifest, newManifest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedArtifactList getContainedArtifacts() {
		return containedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedArtifacts(ContainedArtifactList newContainedArtifacts, NotificationChain msgs) {
		ContainedArtifactList oldContainedArtifacts = containedArtifacts;
		containedArtifacts = newContainedArtifacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__CONTAINED_ARTIFACTS, oldContainedArtifacts, newContainedArtifacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedArtifacts(ContainedArtifactList newContainedArtifacts) {
		if (newContainedArtifacts != containedArtifacts) {
			NotificationChain msgs = null;
			if (containedArtifacts != null)
				msgs = ((InternalEObject)containedArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__CONTAINED_ARTIFACTS, null, msgs);
			if (newContainedArtifacts != null)
				msgs = ((InternalEObject)newContainedArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.COMPOSITE__CONTAINED_ARTIFACTS, null, msgs);
			msgs = basicSetContainedArtifacts(newContainedArtifacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.COMPOSITE__CONTAINED_ARTIFACTS, newContainedArtifacts, newContainedArtifacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.COMPOSITE__METADATA:
				return basicSetMetadata(null, msgs);
			case R2Package.COMPOSITE__CONTROL_BLOCK:
				return basicSetControlBlock(null, msgs);
			case R2Package.COMPOSITE__MANIFEST:
				return basicSetManifest(null, msgs);
			case R2Package.COMPOSITE__CONTAINED_ARTIFACTS:
				return basicSetContainedArtifacts(null, msgs);
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
			case R2Package.COMPOSITE__METADATA:
				return getMetadata();
			case R2Package.COMPOSITE__CONTROL_BLOCK:
				return getControlBlock();
			case R2Package.COMPOSITE__MANIFEST:
				return getManifest();
			case R2Package.COMPOSITE__CONTAINED_ARTIFACTS:
				return getContainedArtifacts();
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
			case R2Package.COMPOSITE__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case R2Package.COMPOSITE__CONTROL_BLOCK:
				setControlBlock((ControlBlock)newValue);
				return;
			case R2Package.COMPOSITE__MANIFEST:
				setManifest((Manifest)newValue);
				return;
			case R2Package.COMPOSITE__CONTAINED_ARTIFACTS:
				setContainedArtifacts((ContainedArtifactList)newValue);
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
			case R2Package.COMPOSITE__METADATA:
				setMetadata((Metadata)null);
				return;
			case R2Package.COMPOSITE__CONTROL_BLOCK:
				setControlBlock((ControlBlock)null);
				return;
			case R2Package.COMPOSITE__MANIFEST:
				setManifest((Manifest)null);
				return;
			case R2Package.COMPOSITE__CONTAINED_ARTIFACTS:
				setContainedArtifacts((ContainedArtifactList)null);
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
			case R2Package.COMPOSITE__METADATA:
				return metadata != null;
			case R2Package.COMPOSITE__CONTROL_BLOCK:
				return controlBlock != null;
			case R2Package.COMPOSITE__MANIFEST:
				return manifest != null;
			case R2Package.COMPOSITE__CONTAINED_ARTIFACTS:
				return containedArtifacts != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
