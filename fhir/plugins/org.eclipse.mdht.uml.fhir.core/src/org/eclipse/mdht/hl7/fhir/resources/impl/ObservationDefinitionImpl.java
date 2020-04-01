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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition;
import org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval;
import org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQuantitativeDetails;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getPermittedDataTypes <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getMultipleResultsAllowed <em>Multiple Results Allowed</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getPreferredReportName <em>Preferred Report Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getQuantitativeDetails <em>Quantitative Details</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getQualifiedIntervals <em>Qualified Interval</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getValidCodedValueSet <em>Valid Coded Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getNormalCodedValueSet <em>Normal Coded Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationDefinitionImpl#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionImpl extends DomainResourceImpl implements ObservationDefinition {
	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getPermittedDataTypes() <em>Permitted Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> permittedDataTypes;

	/**
	 * The cached value of the '{@link #getMultipleResultsAllowed() <em>Multiple Results Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleResultsAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean multipleResultsAllowed;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getPreferredReportName() <em>Preferred Report Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredReportName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String preferredReportName;

	/**
	 * The cached value of the '{@link #getQuantitativeDetails() <em>Quantitative Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeDetails()
	 * @generated
	 * @ordered
	 */
	protected ObservationDefinitionQuantitativeDetails quantitativeDetails;

	/**
	 * The cached value of the '{@link #getQualifiedIntervals() <em>Qualified Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDefinitionQualifiedInterval> qualifiedIntervals;

	/**
	 * The cached value of the '{@link #getValidCodedValueSet() <em>Valid Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference validCodedValueSet;

	/**
	 * The cached value of the '{@link #getNormalCodedValueSet() <em>Normal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference normalCodedValueSet;

	/**
	 * The cached value of the '{@link #getAbnormalCodedValueSet() <em>Abnormal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbnormalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference abnormalCodedValueSet;

	/**
	 * The cached value of the '{@link #getCriticalCodedValueSet() <em>Critical Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference criticalCodedValueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getObservationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.OBSERVATION_DEFINITION__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.OBSERVATION_DEFINITION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getPermittedDataTypes() {
		if (permittedDataTypes == null) {
			permittedDataTypes = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE);
		}
		return permittedDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getMultipleResultsAllowed() {
		return multipleResultsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleResultsAllowed(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMultipleResultsAllowed, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldMultipleResultsAllowed = multipleResultsAllowed;
		multipleResultsAllowed = newMultipleResultsAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, oldMultipleResultsAllowed, newMultipleResultsAllowed);
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
	public void setMultipleResultsAllowed(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMultipleResultsAllowed) {
		if (newMultipleResultsAllowed != multipleResultsAllowed) {
			NotificationChain msgs = null;
			if (multipleResultsAllowed != null)
				msgs = ((InternalEObject)multipleResultsAllowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, null, msgs);
			if (newMultipleResultsAllowed != null)
				msgs = ((InternalEObject)newMultipleResultsAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, null, msgs);
			msgs = basicSetMultipleResultsAllowed(newMultipleResultsAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, newMultipleResultsAllowed, newMultipleResultsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__METHOD, oldMethod, newMethod);
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
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPreferredReportName() {
		return preferredReportName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredReportName(org.eclipse.mdht.hl7.fhir.dataTypes.String newPreferredReportName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPreferredReportName = preferredReportName;
		preferredReportName = newPreferredReportName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, oldPreferredReportName, newPreferredReportName);
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
	public void setPreferredReportName(org.eclipse.mdht.hl7.fhir.dataTypes.String newPreferredReportName) {
		if (newPreferredReportName != preferredReportName) {
			NotificationChain msgs = null;
			if (preferredReportName != null)
				msgs = ((InternalEObject)preferredReportName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, null, msgs);
			if (newPreferredReportName != null)
				msgs = ((InternalEObject)newPreferredReportName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, null, msgs);
			msgs = basicSetPreferredReportName(newPreferredReportName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, newPreferredReportName, newPreferredReportName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinitionQuantitativeDetails getQuantitativeDetails() {
		return quantitativeDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantitativeDetails(ObservationDefinitionQuantitativeDetails newQuantitativeDetails, NotificationChain msgs) {
		ObservationDefinitionQuantitativeDetails oldQuantitativeDetails = quantitativeDetails;
		quantitativeDetails = newQuantitativeDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, oldQuantitativeDetails, newQuantitativeDetails);
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
	public void setQuantitativeDetails(ObservationDefinitionQuantitativeDetails newQuantitativeDetails) {
		if (newQuantitativeDetails != quantitativeDetails) {
			NotificationChain msgs = null;
			if (quantitativeDetails != null)
				msgs = ((InternalEObject)quantitativeDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, null, msgs);
			if (newQuantitativeDetails != null)
				msgs = ((InternalEObject)newQuantitativeDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, null, msgs);
			msgs = basicSetQuantitativeDetails(newQuantitativeDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, newQuantitativeDetails, newQuantitativeDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationDefinitionQualifiedInterval> getQualifiedIntervals() {
		if (qualifiedIntervals == null) {
			qualifiedIntervals = new EObjectContainmentEList<ObservationDefinitionQualifiedInterval>(ObservationDefinitionQualifiedInterval.class, this, ResourcesPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL);
		}
		return qualifiedIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValidCodedValueSet() {
		return validCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidCodedValueSet(Reference newValidCodedValueSet, NotificationChain msgs) {
		Reference oldValidCodedValueSet = validCodedValueSet;
		validCodedValueSet = newValidCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, oldValidCodedValueSet, newValidCodedValueSet);
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
	public void setValidCodedValueSet(Reference newValidCodedValueSet) {
		if (newValidCodedValueSet != validCodedValueSet) {
			NotificationChain msgs = null;
			if (validCodedValueSet != null)
				msgs = ((InternalEObject)validCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, null, msgs);
			if (newValidCodedValueSet != null)
				msgs = ((InternalEObject)newValidCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, null, msgs);
			msgs = basicSetValidCodedValueSet(newValidCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, newValidCodedValueSet, newValidCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getNormalCodedValueSet() {
		return normalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalCodedValueSet(Reference newNormalCodedValueSet, NotificationChain msgs) {
		Reference oldNormalCodedValueSet = normalCodedValueSet;
		normalCodedValueSet = newNormalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, oldNormalCodedValueSet, newNormalCodedValueSet);
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
	public void setNormalCodedValueSet(Reference newNormalCodedValueSet) {
		if (newNormalCodedValueSet != normalCodedValueSet) {
			NotificationChain msgs = null;
			if (normalCodedValueSet != null)
				msgs = ((InternalEObject)normalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, null, msgs);
			if (newNormalCodedValueSet != null)
				msgs = ((InternalEObject)newNormalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetNormalCodedValueSet(newNormalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, newNormalCodedValueSet, newNormalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAbnormalCodedValueSet() {
		return abnormalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbnormalCodedValueSet(Reference newAbnormalCodedValueSet, NotificationChain msgs) {
		Reference oldAbnormalCodedValueSet = abnormalCodedValueSet;
		abnormalCodedValueSet = newAbnormalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, oldAbnormalCodedValueSet, newAbnormalCodedValueSet);
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
	public void setAbnormalCodedValueSet(Reference newAbnormalCodedValueSet) {
		if (newAbnormalCodedValueSet != abnormalCodedValueSet) {
			NotificationChain msgs = null;
			if (abnormalCodedValueSet != null)
				msgs = ((InternalEObject)abnormalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, null, msgs);
			if (newAbnormalCodedValueSet != null)
				msgs = ((InternalEObject)newAbnormalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetAbnormalCodedValueSet(newAbnormalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, newAbnormalCodedValueSet, newAbnormalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCriticalCodedValueSet() {
		return criticalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticalCodedValueSet(Reference newCriticalCodedValueSet, NotificationChain msgs) {
		Reference oldCriticalCodedValueSet = criticalCodedValueSet;
		criticalCodedValueSet = newCriticalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, oldCriticalCodedValueSet, newCriticalCodedValueSet);
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
	public void setCriticalCodedValueSet(Reference newCriticalCodedValueSet) {
		if (newCriticalCodedValueSet != criticalCodedValueSet) {
			NotificationChain msgs = null;
			if (criticalCodedValueSet != null)
				msgs = ((InternalEObject)criticalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, null, msgs);
			if (newCriticalCodedValueSet != null)
				msgs = ((InternalEObject)newCriticalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetCriticalCodedValueSet(newCriticalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, newCriticalCodedValueSet, newCriticalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OBSERVATION_DEFINITION__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return ((InternalEList<?>)getPermittedDataTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return basicSetMultipleResultsAllowed(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__METHOD:
				return basicSetMethod(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return basicSetPreferredReportName(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				return basicSetQuantitativeDetails(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				return ((InternalEList<?>)getQualifiedIntervals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				return basicSetValidCodedValueSet(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				return basicSetNormalCodedValueSet(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				return basicSetAbnormalCodedValueSet(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				return basicSetCriticalCodedValueSet(null, msgs);
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
			case ResourcesPackage.OBSERVATION_DEFINITION__CATEGORY:
				return getCategories();
			case ResourcesPackage.OBSERVATION_DEFINITION__CODE:
				return getCode();
			case ResourcesPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return getPermittedDataTypes();
			case ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return getMultipleResultsAllowed();
			case ResourcesPackage.OBSERVATION_DEFINITION__METHOD:
				return getMethod();
			case ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return getPreferredReportName();
			case ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				return getQuantitativeDetails();
			case ResourcesPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				return getQualifiedIntervals();
			case ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				return getValidCodedValueSet();
			case ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				return getNormalCodedValueSet();
			case ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				return getAbnormalCodedValueSet();
			case ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				return getCriticalCodedValueSet();
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
			case ResourcesPackage.OBSERVATION_DEFINITION__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				getPermittedDataTypes().clear();
				getPermittedDataTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				setMultipleResultsAllowed((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				setPreferredReportName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				setQuantitativeDetails((ObservationDefinitionQuantitativeDetails)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				getQualifiedIntervals().clear();
				getQualifiedIntervals().addAll((Collection<? extends ObservationDefinitionQualifiedInterval>)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				setValidCodedValueSet((Reference)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				setNormalCodedValueSet((Reference)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				setAbnormalCodedValueSet((Reference)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				setCriticalCodedValueSet((Reference)newValue);
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
			case ResourcesPackage.OBSERVATION_DEFINITION__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				getPermittedDataTypes().clear();
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				setMultipleResultsAllowed((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				setPreferredReportName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				setQuantitativeDetails((ObservationDefinitionQuantitativeDetails)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				getQualifiedIntervals().clear();
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				setValidCodedValueSet((Reference)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				setNormalCodedValueSet((Reference)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				setAbnormalCodedValueSet((Reference)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				setCriticalCodedValueSet((Reference)null);
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
			case ResourcesPackage.OBSERVATION_DEFINITION__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.OBSERVATION_DEFINITION__CODE:
				return code != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return permittedDataTypes != null && !permittedDataTypes.isEmpty();
			case ResourcesPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return multipleResultsAllowed != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__METHOD:
				return method != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return preferredReportName != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				return quantitativeDetails != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				return qualifiedIntervals != null && !qualifiedIntervals.isEmpty();
			case ResourcesPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				return validCodedValueSet != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				return normalCodedValueSet != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				return abnormalCodedValueSet != null;
			case ResourcesPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				return criticalCodedValueSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionImpl
