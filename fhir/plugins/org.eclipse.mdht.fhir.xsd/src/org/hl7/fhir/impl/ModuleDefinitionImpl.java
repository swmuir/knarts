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
import org.hl7.fhir.ModuleDefinition;
import org.hl7.fhir.ModuleDefinitionCodeSystem;
import org.hl7.fhir.ModuleDefinitionData;
import org.hl7.fhir.ModuleDefinitionLibrary;
import org.hl7.fhir.ModuleDefinitionModel;
import org.hl7.fhir.ModuleDefinitionParameter;
import org.hl7.fhir.ModuleDefinitionValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDefinitionImpl extends DomainResourceImpl implements ModuleDefinition {
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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionModel> model;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionLibrary> library;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionCodeSystem> codeSystem;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionValueSet> valueSet;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionParameter> parameter;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionData> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getModuleDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MODULE_DEFINITION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionModel> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<ModuleDefinitionModel>(ModuleDefinitionModel.class, this, FhirPackage.MODULE_DEFINITION__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionLibrary> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<ModuleDefinitionLibrary>(ModuleDefinitionLibrary.class, this, FhirPackage.MODULE_DEFINITION__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionCodeSystem> getCodeSystem() {
		if (codeSystem == null) {
			codeSystem = new EObjectContainmentEList<ModuleDefinitionCodeSystem>(ModuleDefinitionCodeSystem.class, this, FhirPackage.MODULE_DEFINITION__CODE_SYSTEM);
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionValueSet> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<ModuleDefinitionValueSet>(ModuleDefinitionValueSet.class, this, FhirPackage.MODULE_DEFINITION__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ModuleDefinitionParameter>(ModuleDefinitionParameter.class, this, FhirPackage.MODULE_DEFINITION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ModuleDefinitionData>(ModuleDefinitionData.class, this, FhirPackage.MODULE_DEFINITION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MODULE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MODULE_DEFINITION__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_DEFINITION__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_DEFINITION__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystem()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_DEFINITION__VALUE_SET:
				return ((InternalEList<?>)getValueSet()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_DEFINITION__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MODULE_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MODULE_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.MODULE_DEFINITION__MODEL:
				return getModel();
			case FhirPackage.MODULE_DEFINITION__LIBRARY:
				return getLibrary();
			case FhirPackage.MODULE_DEFINITION__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.MODULE_DEFINITION__VALUE_SET:
				return getValueSet();
			case FhirPackage.MODULE_DEFINITION__PARAMETER:
				return getParameter();
			case FhirPackage.MODULE_DEFINITION__DATA:
				return getData();
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
			case FhirPackage.MODULE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends ModuleDefinitionModel>)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends ModuleDefinitionLibrary>)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION__CODE_SYSTEM:
				getCodeSystem().clear();
				getCodeSystem().addAll((Collection<? extends ModuleDefinitionCodeSystem>)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends ModuleDefinitionValueSet>)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ModuleDefinitionParameter>)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ModuleDefinitionData>)newValue);
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
			case FhirPackage.MODULE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MODULE_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_DEFINITION__MODEL:
				getModel().clear();
				return;
			case FhirPackage.MODULE_DEFINITION__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.MODULE_DEFINITION__CODE_SYSTEM:
				getCodeSystem().clear();
				return;
			case FhirPackage.MODULE_DEFINITION__VALUE_SET:
				getValueSet().clear();
				return;
			case FhirPackage.MODULE_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.MODULE_DEFINITION__DATA:
				getData().clear();
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
			case FhirPackage.MODULE_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MODULE_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.MODULE_DEFINITION__MODEL:
				return model != null && !model.isEmpty();
			case FhirPackage.MODULE_DEFINITION__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.MODULE_DEFINITION__CODE_SYSTEM:
				return codeSystem != null && !codeSystem.isEmpty();
			case FhirPackage.MODULE_DEFINITION__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
			case FhirPackage.MODULE_DEFINITION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.MODULE_DEFINITION__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleDefinitionImpl
