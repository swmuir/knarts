/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Url;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImplementationGuideManifest;
import fhiRCore.resources.ImplementationGuideManifestManifestPage;
import fhiRCore.resources.ImplementationGuideManifestManifestResource;
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
 * An implementation of the model object '<em><b>Implementation Guide Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestImpl#getResources <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestImpl#getPages <em>Page</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestImpl#getImages <em>Image</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideManifestImpl#getOthers <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideManifestImpl extends BackboneElementImpl implements ImplementationGuideManifest {
	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected Url rendering;

	/**
	 * The cached value of the '{@link #getResources() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideManifestManifestResource> resources;

	/**
	 * The cached value of the '{@link #getPages() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideManifestManifestPage> pages;

	/**
	 * The cached value of the '{@link #getImages() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> images;

	/**
	 * The cached value of the '{@link #getOthers() <em>Other</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthers()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> others;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuideManifest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getRendering() {
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendering(Url newRendering, NotificationChain msgs) {
		Url oldRendering = rendering;
		rendering = newRendering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, oldRendering, newRendering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendering(Url newRendering) {
		if (newRendering != rendering) {
			NotificationChain msgs = null;
			if (rendering != null)
				msgs = ((InternalEObject)rendering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, null, msgs);
			if (newRendering != null)
				msgs = ((InternalEObject)newRendering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, null, msgs);
			msgs = basicSetRendering(newRendering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, newRendering, newRendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideManifestManifestResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ImplementationGuideManifestManifestResource>(ImplementationGuideManifestManifestResource.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideManifestManifestPage> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<ImplementationGuideManifestManifestPage>(ImplementationGuideManifestManifestPage.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getOthers() {
		if (others == null) {
			others = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER);
		}
		return others;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				return basicSetRendering(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				return ((InternalEList<?>)getOthers()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				return getRendering();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				return getResources();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				return getPages();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				return getImages();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				return getOthers();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				setRendering((Url)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				getResources().clear();
				getResources().addAll((Collection<? extends ImplementationGuideManifestManifestResource>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				getPages().clear();
				getPages().addAll((Collection<? extends ImplementationGuideManifestManifestPage>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				getImages().clear();
				getImages().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				getOthers().clear();
				getOthers().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				setRendering((Url)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				getResources().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				getPages().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				getImages().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				getOthers().clear();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				return rendering != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				return resources != null && !resources.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				return pages != null && !pages.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				return images != null && !images.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				return others != null && !others.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideManifestImpl
