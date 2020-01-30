/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.OperationDefinitionParameter;
import fhiRCore.resources.OperationDefinitionParameterBinding;
import fhiRCore.resources.OperationDefinitionParameterReferencedFrom;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureDefinition;

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
 * An implementation of the model object '<em><b>Operation Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getMax <em>Max</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getTargetProfiles <em>Target Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getSearchType <em>Search Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getReferencedFroms <em>Referenced From</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterImpl#getParts <em>Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionParameterImpl extends BackboneElementImpl implements OperationDefinitionParameter {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Code name;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String max;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String documentation;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getTargetProfiles() <em>Target Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinition> targetProfiles;

	/**
	 * The cached value of the '{@link #getSearchType() <em>Search Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchType()
	 * @generated
	 * @ordered
	 */
	protected Code searchType;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinitionParameterBinding binding;

	/**
	 * The cached value of the '{@link #getReferencedFroms() <em>Referenced From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFroms()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinitionParameterReferencedFrom> referencedFroms;

	/**
	 * The cached value of the '{@link #getParts() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinitionParameter> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOperationDefinitionParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Code newName, NotificationChain msgs) {
		Code oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Code newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Code newUse, NotificationChain msgs) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(fhiRCore.dataTypes.Integer newMin, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(fhiRCore.dataTypes.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(fhiRCore.dataTypes.String newMax, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(fhiRCore.dataTypes.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(fhiRCore.dataTypes.String newDocumentation, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(fhiRCore.dataTypes.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinition> getTargetProfiles() {
		if (targetProfiles == null) {
			targetProfiles = new EObjectContainmentEList<StructureDefinition>(StructureDefinition.class, this, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE);
		}
		return targetProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSearchType() {
		return searchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchType(Code newSearchType, NotificationChain msgs) {
		Code oldSearchType = searchType;
		searchType = newSearchType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, oldSearchType, newSearchType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchType(Code newSearchType) {
		if (newSearchType != searchType) {
			NotificationChain msgs = null;
			if (searchType != null)
				msgs = ((InternalEObject)searchType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, null, msgs);
			if (newSearchType != null)
				msgs = ((InternalEObject)newSearchType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, null, msgs);
			msgs = basicSetSearchType(newSearchType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE, newSearchType, newSearchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameterBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(OperationDefinitionParameterBinding newBinding, NotificationChain msgs) {
		OperationDefinitionParameterBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(OperationDefinitionParameterBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinitionParameterReferencedFrom> getReferencedFroms() {
		if (referencedFroms == null) {
			referencedFroms = new EObjectContainmentEList<OperationDefinitionParameterReferencedFrom>(OperationDefinitionParameterReferencedFrom.class, this, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM);
		}
		return referencedFroms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinitionParameter> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<OperationDefinitionParameter>(OperationDefinitionParameter.class, this, ResourcesPackage.OPERATION_DEFINITION_PARAMETER__PART);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE:
				return basicSetUse(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				return basicSetMin(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				return basicSetMax(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				return ((InternalEList<?>)getTargetProfiles()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				return basicSetSearchType(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				return basicSetBinding(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				return ((InternalEList<?>)getReferencedFroms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__PART:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				return getName();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE:
				return getUse();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				return getMin();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				return getMax();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				return getDocumentation();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				return getType();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				return getTargetProfiles();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				return getSearchType();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				return getBinding();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				return getReferencedFroms();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__PART:
				return getParts();
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				setName((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE:
				setUse((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				setMin((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				setMax((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				getTargetProfiles().clear();
				getTargetProfiles().addAll((Collection<? extends StructureDefinition>)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				setSearchType((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				setBinding((OperationDefinitionParameterBinding)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				getReferencedFroms().clear();
				getReferencedFroms().addAll((Collection<? extends OperationDefinitionParameterReferencedFrom>)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__PART:
				getParts().clear();
				getParts().addAll((Collection<? extends OperationDefinitionParameter>)newValue);
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				setName((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE:
				setUse((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				setMin((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				setMax((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				getTargetProfiles().clear();
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				setSearchType((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				setBinding((OperationDefinitionParameterBinding)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				getReferencedFroms().clear();
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__PART:
				getParts().clear();
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__NAME:
				return name != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__USE:
				return use != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MIN:
				return min != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__MAX:
				return max != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TYPE:
				return type != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__TARGET_PROFILE:
				return targetProfiles != null && !targetProfiles.isEmpty();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__SEARCH_TYPE:
				return searchType != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__BINDING:
				return binding != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__REFERENCED_FROM:
				return referencedFroms != null && !referencedFroms.isEmpty();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER__PART:
				return parts != null && !parts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionParameterImpl
