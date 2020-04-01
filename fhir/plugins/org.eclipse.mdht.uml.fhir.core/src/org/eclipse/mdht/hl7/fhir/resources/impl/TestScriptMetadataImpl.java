/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.TestScriptMetadata;
import org.eclipse.mdht.hl7.fhir.resources.TestScriptMetadataCapability;
import org.eclipse.mdht.hl7.fhir.resources.TestScriptMetadataLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataImpl#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestScriptMetadataImpl#getCapabilities <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptMetadataImpl extends BackboneElementImpl implements TestScriptMetadata {
	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptMetadataLink> links;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptMetadataCapability> capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptMetadata();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestScriptMetadataLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<TestScriptMetadataLink>(TestScriptMetadataLink.class, this, ResourcesPackage.TEST_SCRIPT_METADATA__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestScriptMetadataCapability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<TestScriptMetadataCapability>(TestScriptMetadataCapability.class, this, ResourcesPackage.TEST_SCRIPT_METADATA__CAPABILITY);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_METADATA__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_METADATA__LINK:
				return getLinks();
			case ResourcesPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return getCapabilities();
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
			case ResourcesPackage.TEST_SCRIPT_METADATA__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends TestScriptMetadataLink>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends TestScriptMetadataCapability>)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_METADATA__LINK:
				getLinks().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				getCapabilities().clear();
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
			case ResourcesPackage.TEST_SCRIPT_METADATA__LINK:
				return links != null && !links.isEmpty();
			case ResourcesPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return capabilities != null && !capabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptMetadataImpl
