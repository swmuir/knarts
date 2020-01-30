/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Url;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImplementationGuideManifestManifestResource;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Manifest Manifest Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestManifestResourceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestManifestResourceImpl#getExamplex <em>Examplex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestManifestResourceImpl#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideManifestManifestResourceImpl extends BackboneElementImpl implements ImplementationGuideManifestManifestResource {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getExamplex() <em>Examplex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamplex()
	 * @generated
	 * @ordered
	 */
	protected DataType examplex;

	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected Url relativePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideManifestManifestResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuideManifestManifestResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getExamplex() {
		return examplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamplex(DataType newExamplex, NotificationChain msgs) {
		DataType oldExamplex = examplex;
		examplex = newExamplex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX, oldExamplex, newExamplex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamplex(DataType newExamplex) {
		if (newExamplex != examplex) {
			NotificationChain msgs = null;
			if (examplex != null)
				msgs = ((InternalEObject)examplex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX, null, msgs);
			if (newExamplex != null)
				msgs = ((InternalEObject)newExamplex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX, null, msgs);
			msgs = basicSetExamplex(newExamplex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX, newExamplex, newExamplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePath(Url newRelativePath, NotificationChain msgs) {
		Url oldRelativePath = relativePath;
		relativePath = newRelativePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH, oldRelativePath, newRelativePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePath(Url newRelativePath) {
		if (newRelativePath != relativePath) {
			NotificationChain msgs = null;
			if (relativePath != null)
				msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH, null, msgs);
			if (newRelativePath != null)
				msgs = ((InternalEObject)newRelativePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH, null, msgs);
			msgs = basicSetRelativePath(newRelativePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH, newRelativePath, newRelativePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE:
				return basicSetReference(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX:
				return basicSetExamplex(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH:
				return basicSetRelativePath(null, msgs);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE:
				return getReference();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX:
				return getExamplex();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH:
				return getRelativePath();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE:
				setReference((Reference)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX:
				setExamplex((DataType)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH:
				setRelativePath((Url)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE:
				setReference((Reference)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX:
				setExamplex((DataType)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH:
				setRelativePath((Url)null);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__REFERENCE:
				return reference != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__EXAMPLEX:
				return examplex != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE__RELATIVE_PATH:
				return relativePath != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideManifestManifestResourceImpl
