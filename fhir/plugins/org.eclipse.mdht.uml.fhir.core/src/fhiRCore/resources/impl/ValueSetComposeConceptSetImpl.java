/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.ValueSet;
import fhiRCore.resources.ValueSetComposeConceptSet;
import fhiRCore.resources.ValueSetComposeConceptSetConceptReference;
import fhiRCore.resources.ValueSetComposeConceptSetFilter;

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
 * An implementation of the model object '<em><b>Value Set Compose Concept Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetImpl#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetImpl#getFilters <em>Filter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeConceptSetImpl#getValueSets <em>Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetComposeConceptSetImpl extends BackboneElementImpl implements ValueSetComposeConceptSet {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String version;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSetConceptReference> concepts;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSetFilter> filters;

	/**
	 * The cached value of the '{@link #getValueSets() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> valueSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeConceptSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getValueSetComposeConceptSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(fhiRCore.dataTypes.String newVersion, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(fhiRCore.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSetConceptReference> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<ValueSetComposeConceptSetConceptReference>(ValueSetComposeConceptSetConceptReference.class, this, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSetFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<ValueSetComposeConceptSetFilter>(ValueSetComposeConceptSetFilter.class, this, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSet> getValueSets() {
		if (valueSets == null) {
			valueSets = new EObjectContainmentEList<ValueSet>(ValueSet.class, this, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET);
		}
		return valueSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				return basicSetSystem(null, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				return ((InternalEList<?>)getValueSets()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				return getSystem();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				return getVersion();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				return getConcepts();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				return getFilters();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				return getValueSets();
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends ValueSetComposeConceptSetConceptReference>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				getFilters().clear();
				getFilters().addAll((Collection<? extends ValueSetComposeConceptSetFilter>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				getValueSets().clear();
				getValueSets().addAll((Collection<? extends ValueSet>)newValue);
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				setSystem((Uri)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				getConcepts().clear();
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				getFilters().clear();
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				getValueSets().clear();
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				return system != null;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				return version != null;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				return filters != null && !filters.isEmpty();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				return valueSets != null && !valueSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeConceptSetImpl
