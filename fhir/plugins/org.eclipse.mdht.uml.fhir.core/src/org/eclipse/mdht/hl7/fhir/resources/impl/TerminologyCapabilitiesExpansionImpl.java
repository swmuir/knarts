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

import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.TerminologyCapabilitiesExpansion;
import org.eclipse.mdht.hl7.fhir.resources.TerminologyCapabilitiesExpansionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities Expansion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TerminologyCapabilitiesExpansionImpl#getHierarchical <em>Hierarchical</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TerminologyCapabilitiesExpansionImpl#getPaging <em>Paging</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TerminologyCapabilitiesExpansionImpl#getIncomplete <em>Incomplete</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TerminologyCapabilitiesExpansionImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TerminologyCapabilitiesExpansionImpl#getTextFilter <em>Text Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesExpansionImpl extends BackboneElementImpl implements TerminologyCapabilitiesExpansion {
	/**
	 * The cached value of the '{@link #getHierarchical() <em>Hierarchical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchical()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean hierarchical;

	/**
	 * The cached value of the '{@link #getPaging() <em>Paging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaging()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean paging;

	/**
	 * The cached value of the '{@link #getIncomplete() <em>Incomplete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomplete()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean incomplete;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesExpansionParameter> parameters;

	/**
	 * The cached value of the '{@link #getTextFilter() <em>Text Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFilter()
	 * @generated
	 * @ordered
	 */
	protected Markdown textFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesExpansionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTerminologyCapabilitiesExpansion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getHierarchical() {
		return hierarchical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchical(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newHierarchical, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldHierarchical = hierarchical;
		hierarchical = newHierarchical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, oldHierarchical, newHierarchical);
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
	public void setHierarchical(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newHierarchical) {
		if (newHierarchical != hierarchical) {
			NotificationChain msgs = null;
			if (hierarchical != null)
				msgs = ((InternalEObject)hierarchical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, null, msgs);
			if (newHierarchical != null)
				msgs = ((InternalEObject)newHierarchical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, null, msgs);
			msgs = basicSetHierarchical(newHierarchical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, newHierarchical, newHierarchical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getPaging() {
		return paging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaging(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newPaging, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldPaging = paging;
		paging = newPaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, oldPaging, newPaging);
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
	public void setPaging(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newPaging) {
		if (newPaging != paging) {
			NotificationChain msgs = null;
			if (paging != null)
				msgs = ((InternalEObject)paging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, null, msgs);
			if (newPaging != null)
				msgs = ((InternalEObject)newPaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, null, msgs);
			msgs = basicSetPaging(newPaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, newPaging, newPaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getIncomplete() {
		return incomplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomplete(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newIncomplete, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldIncomplete = incomplete;
		incomplete = newIncomplete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, oldIncomplete, newIncomplete);
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
	public void setIncomplete(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newIncomplete) {
		if (newIncomplete != incomplete) {
			NotificationChain msgs = null;
			if (incomplete != null)
				msgs = ((InternalEObject)incomplete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, null, msgs);
			if (newIncomplete != null)
				msgs = ((InternalEObject)newIncomplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, null, msgs);
			msgs = basicSetIncomplete(newIncomplete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, newIncomplete, newIncomplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminologyCapabilitiesExpansionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<TerminologyCapabilitiesExpansionParameter>(TerminologyCapabilitiesExpansionParameter.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getTextFilter() {
		return textFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextFilter(Markdown newTextFilter, NotificationChain msgs) {
		Markdown oldTextFilter = textFilter;
		textFilter = newTextFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, oldTextFilter, newTextFilter);
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
	public void setTextFilter(Markdown newTextFilter) {
		if (newTextFilter != textFilter) {
			NotificationChain msgs = null;
			if (textFilter != null)
				msgs = ((InternalEObject)textFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, null, msgs);
			if (newTextFilter != null)
				msgs = ((InternalEObject)newTextFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, null, msgs);
			msgs = basicSetTextFilter(newTextFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, newTextFilter, newTextFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				return basicSetHierarchical(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				return basicSetPaging(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				return basicSetIncomplete(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				return basicSetTextFilter(null, msgs);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				return getHierarchical();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				return getPaging();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				return getIncomplete();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				return getParameters();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				return getTextFilter();
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				setHierarchical((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				setPaging((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				setIncomplete((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TerminologyCapabilitiesExpansionParameter>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				setTextFilter((Markdown)newValue);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				setHierarchical((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				setPaging((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				setIncomplete((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				getParameters().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				setTextFilter((Markdown)null);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				return hierarchical != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				return paging != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				return incomplete != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				return textFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesExpansionImpl
