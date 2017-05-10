/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.jaxb.StringImplAdapter;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ValueSetInclude", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "ValueSetInclude")
public class ValueSetIncludeImpl extends BackboneElementImpl implements ValueSetInclude {
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
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetConcept> concept;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetFilter> filter;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> valueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSetInclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_INCLUDE__SYSTEM, oldSystem, newSystem);
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
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_INCLUDE__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_INCLUDE__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_INCLUDE__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_INCLUDE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_INCLUDE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_INCLUDE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_INCLUDE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<ValueSetConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<ValueSetConcept>(ValueSetConcept.class, this, FhirPackage.VALUE_SET_INCLUDE__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<ValueSetFilter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<ValueSetFilter>(ValueSetFilter.class, this, FhirPackage.VALUE_SET_INCLUDE__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	@XmlElement
	public EList<Uri> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.VALUE_SET_INCLUDE__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VALUE_SET_INCLUDE__SYSTEM:
				return basicSetSystem(null, msgs);
			case FhirPackage.VALUE_SET_INCLUDE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.VALUE_SET_INCLUDE__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET_INCLUDE__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET_INCLUDE__VALUE_SET:
				return ((InternalEList<?>)getValueSet()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.VALUE_SET_INCLUDE__SYSTEM:
				return getSystem();
			case FhirPackage.VALUE_SET_INCLUDE__VERSION:
				return getVersion();
			case FhirPackage.VALUE_SET_INCLUDE__CONCEPT:
				return getConcept();
			case FhirPackage.VALUE_SET_INCLUDE__FILTER:
				return getFilter();
			case FhirPackage.VALUE_SET_INCLUDE__VALUE_SET:
				return getValueSet();
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
			case FhirPackage.VALUE_SET_INCLUDE__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case FhirPackage.VALUE_SET_INCLUDE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET_INCLUDE__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends ValueSetConcept>)newValue);
				return;
			case FhirPackage.VALUE_SET_INCLUDE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends ValueSetFilter>)newValue);
				return;
			case FhirPackage.VALUE_SET_INCLUDE__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends Uri>)newValue);
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
			case FhirPackage.VALUE_SET_INCLUDE__SYSTEM:
				setSystem((Uri)null);
				return;
			case FhirPackage.VALUE_SET_INCLUDE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET_INCLUDE__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.VALUE_SET_INCLUDE__FILTER:
				getFilter().clear();
				return;
			case FhirPackage.VALUE_SET_INCLUDE__VALUE_SET:
				getValueSet().clear();
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
			case FhirPackage.VALUE_SET_INCLUDE__SYSTEM:
				return system != null;
			case FhirPackage.VALUE_SET_INCLUDE__VERSION:
				return version != null;
			case FhirPackage.VALUE_SET_INCLUDE__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.VALUE_SET_INCLUDE__FILTER:
				return filter != null && !filter.isEmpty();
			case FhirPackage.VALUE_SET_INCLUDE__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetIncludeImpl
