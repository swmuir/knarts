/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getStratifier <em>Stratifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends DomainResourceImpl implements Measure {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getModuleMetadata() <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMetadata()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadata moduleMetadata;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> library;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurePopulation> population;

	/**
	 * The cached value of the '{@link #getStratifier() <em>Stratifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratifier()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> stratifier;

	/**
	 * The cached value of the '{@link #getSupplementalData() <em>Supplemental Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalData()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> supplementalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEASURE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata getModuleMetadata() {
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleMetadata(ModuleMetadata newModuleMetadata, NotificationChain msgs) {
		ModuleMetadata oldModuleMetadata = moduleMetadata;
		moduleMetadata = newModuleMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__MODULE_METADATA, oldModuleMetadata, newModuleMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleMetadata(ModuleMetadata newModuleMetadata) {
		if (newModuleMetadata != moduleMetadata) {
			NotificationChain msgs = null;
			if (moduleMetadata != null)
				msgs = ((InternalEObject)moduleMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__MODULE_METADATA, null, msgs);
			if (newModuleMetadata != null)
				msgs = ((InternalEObject)newModuleMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__MODULE_METADATA, null, msgs);
			msgs = basicSetModuleMetadata(newModuleMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__MODULE_METADATA, newModuleMetadata, newModuleMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEASURE__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurePopulation> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MeasurePopulation>(MeasurePopulation.class, this, FhirPackage.MEASURE__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getStratifier() {
		if (stratifier == null) {
			stratifier = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.MEASURE__STRATIFIER);
		}
		return stratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getSupplementalData() {
		if (supplementalData == null) {
			supplementalData = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.MEASURE__SUPPLEMENTAL_DATA);
		}
		return supplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MEASURE__MODULE_METADATA:
				return basicSetModuleMetadata(null, msgs);
			case FhirPackage.MEASURE__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__STRATIFIER:
				return ((InternalEList<?>)getStratifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				return ((InternalEList<?>)getSupplementalData()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEASURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEASURE__VERSION:
				return getVersion();
			case FhirPackage.MEASURE__MODULE_METADATA:
				return getModuleMetadata();
			case FhirPackage.MEASURE__LIBRARY:
				return getLibrary();
			case FhirPackage.MEASURE__POPULATION:
				return getPopulation();
			case FhirPackage.MEASURE__STRATIFIER:
				return getStratifier();
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				return getSupplementalData();
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
			case FhirPackage.MEASURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEASURE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)newValue);
				return;
			case FhirPackage.MEASURE__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEASURE__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MeasurePopulation>)newValue);
				return;
			case FhirPackage.MEASURE__STRATIFIER:
				getStratifier().clear();
				getStratifier().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
				getSupplementalData().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.MEASURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEASURE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)null);
				return;
			case FhirPackage.MEASURE__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.MEASURE__POPULATION:
				getPopulation().clear();
				return;
			case FhirPackage.MEASURE__STRATIFIER:
				getStratifier().clear();
				return;
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
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
			case FhirPackage.MEASURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEASURE__VERSION:
				return version != null;
			case FhirPackage.MEASURE__MODULE_METADATA:
				return moduleMetadata != null;
			case FhirPackage.MEASURE__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.MEASURE__POPULATION:
				return population != null && !population.isEmpty();
			case FhirPackage.MEASURE__STRATIFIER:
				return stratifier != null && !stratifier.isEmpty();
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				return supplementalData != null && !supplementalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureImpl
