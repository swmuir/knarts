/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImplementationGuideManifestManifestPage;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Manifest Manifest Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestManifestPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestManifestPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestManifestPageImpl#getAnchors <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideManifestManifestPageImpl extends BackboneElementImpl implements ImplementationGuideManifestManifestPage {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getAnchors() <em>Anchor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchors()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> anchors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideManifestManifestPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuideManifestManifestPage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(fhiRCore.dataTypes.String newTitle, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(fhiRCore.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getAnchors() {
		if (anchors == null) {
			anchors = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__ANCHOR);
		}
		return anchors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__ANCHOR:
				return ((InternalEList<?>)getAnchors()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME:
				return getName();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE:
				return getTitle();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__ANCHOR:
				return getAnchors();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__ANCHOR:
				getAnchors().clear();
				getAnchors().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__ANCHOR:
				getAnchors().clear();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__NAME:
				return name != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__TITLE:
				return title != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE__ANCHOR:
				return anchors != null && !anchors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideManifestManifestPageImpl
