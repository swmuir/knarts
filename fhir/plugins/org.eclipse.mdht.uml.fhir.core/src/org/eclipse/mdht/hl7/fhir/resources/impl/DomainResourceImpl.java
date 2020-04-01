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

import org.eclipse.mdht.hl7.fhir.dataTypes.Extension;
import org.eclipse.mdht.hl7.fhir.dataTypes.Narrative;

import org.eclipse.mdht.hl7.fhir.resources.DomainResource;
import org.eclipse.mdht.hl7.fhir.resources.Resource;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DomainResourceImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DomainResourceImpl#getContaineds <em>Contained</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DomainResourceImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DomainResourceImpl#getModifierExtensions <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainResourceImpl extends ResourceImpl implements DomainResource {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Narrative text;

	/**
	 * The cached value of the '{@link #getContaineds() <em>Contained</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaineds()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> containeds;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * The cached value of the '{@link #getModifierExtensions() <em>Modifier Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifierExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> modifierExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDomainResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Narrative getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Narrative newText, NotificationChain msgs) {
		Narrative oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOMAIN_RESOURCE__TEXT, oldText, newText);
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
	public void setText(Narrative newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOMAIN_RESOURCE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOMAIN_RESOURCE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOMAIN_RESOURCE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getContaineds() {
		if (containeds == null) {
			containeds = new EObjectContainmentEList<Resource>(Resource.class, this, ResourcesPackage.DOMAIN_RESOURCE__CONTAINED);
		}
		return containeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<Extension>(Extension.class, this, ResourcesPackage.DOMAIN_RESOURCE__EXTENSION);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Extension> getModifierExtensions() {
		if (modifierExtensions == null) {
			modifierExtensions = new EObjectContainmentEList<Extension>(Extension.class, this, ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION);
		}
		return modifierExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				return basicSetText(null, msgs);
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				return ((InternalEList<?>)getContaineds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return ((InternalEList<?>)getModifierExtensions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				return getText();
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				return getContaineds();
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				return getExtensions();
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return getModifierExtensions();
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
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)newValue);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				getContaineds().clear();
				getContaineds().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtensions().clear();
				getModifierExtensions().addAll((Collection<? extends Extension>)newValue);
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
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)null);
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				getContaineds().clear();
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtensions().clear();
				return;
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtensions().clear();
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
			case ResourcesPackage.DOMAIN_RESOURCE__TEXT:
				return text != null;
			case ResourcesPackage.DOMAIN_RESOURCE__CONTAINED:
				return containeds != null && !containeds.isEmpty();
			case ResourcesPackage.DOMAIN_RESOURCE__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return modifierExtensions != null && !modifierExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainResourceImpl
