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

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitItem;
import org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitItemAdjudication;
import org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitItemDetail;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getCareTeamSequences <em>Care Team Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getDiagnosisSequences <em>Diagnosis Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getProcedureSequences <em>Procedure Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getInformationSequences <em>Information Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getProgramCodes <em>Program Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getLocationx <em>Locationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getUdis <em>Udi</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getSubSites <em>Sub Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getEncounters <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitItemImpl#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitItemImpl extends BackboneElementImpl implements ExplanationOfBenefitItem {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getCareTeamSequences() <em>Care Team Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> careTeamSequences;

	/**
	 * The cached value of the '{@link #getDiagnosisSequences() <em>Diagnosis Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> diagnosisSequences;

	/**
	 * The cached value of the '{@link #getProcedureSequences() <em>Procedure Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> procedureSequences;

	/**
	 * The cached value of the '{@link #getInformationSequences() <em>Information Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> informationSequences;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept revenue;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getProductOrService() <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrService;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifiers;

	/**
	 * The cached value of the '{@link #getProgramCodes() <em>Program Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programCodes;

	/**
	 * The cached value of the '{@link #getServicedx() <em>Servicedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedx()
	 * @generated
	 * @ordered
	 */
	protected DataType servicedx;

	/**
	 * The cached value of the '{@link #getLocationx() <em>Locationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationx()
	 * @generated
	 * @ordered
	 */
	protected DataType locationx;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdis() <em>Udi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdis()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> udis;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getSubSites() <em>Sub Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSites()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subSites;

	/**
	 * The cached value of the '{@link #getEncounters() <em>Encounter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounters()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> encounters;

	/**
	 * The cached value of the '{@link #getNoteNumbers() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumbers;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItemDetail> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefitItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getCareTeamSequences() {
		if (careTeamSequences == null) {
			careTeamSequences = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CARE_TEAM_SEQUENCE);
		}
		return careTeamSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getDiagnosisSequences() {
		if (diagnosisSequences == null) {
			diagnosisSequences = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_SEQUENCE);
		}
		return diagnosisSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getProcedureSequences() {
		if (procedureSequences == null) {
			procedureSequences = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROCEDURE_SEQUENCE);
		}
		return procedureSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getInformationSequences() {
		if (informationSequences == null) {
			informationSequences = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__INFORMATION_SEQUENCE);
		}
		return informationSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(CodeableConcept newRevenue, NotificationChain msgs) {
		CodeableConcept oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE, oldRevenue, newRevenue);
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
	public void setRevenue(CodeableConcept newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject)revenue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject)newRevenue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE, newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductOrService() {
		return productOrService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrService(CodeableConcept newProductOrService, NotificationChain msgs) {
		CodeableConcept oldProductOrService = productOrService;
		productOrService = newProductOrService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProgramCodes() {
		if (programCodes == null) {
			programCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE);
		}
		return programCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getServicedx() {
		return servicedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedx(DataType newServicedx, NotificationChain msgs) {
		DataType oldServicedx = servicedx;
		servicedx = newServicedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX, oldServicedx, newServicedx);
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
	public void setServicedx(DataType newServicedx) {
		if (newServicedx != servicedx) {
			NotificationChain msgs = null;
			if (servicedx != null)
				msgs = ((InternalEObject)servicedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX, null, msgs);
			if (newServicedx != null)
				msgs = ((InternalEObject)newServicedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX, null, msgs);
			msgs = basicSetServicedx(newServicedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX, newServicedx, newServicedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getLocationx() {
		return locationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationx(DataType newLocationx, NotificationChain msgs) {
		DataType oldLocationx = locationx;
		locationx = newLocationx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX, oldLocationx, newLocationx);
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
	public void setLocationx(DataType newLocationx) {
		if (newLocationx != locationx) {
			NotificationChain msgs = null;
			if (locationx != null)
				msgs = ((InternalEObject)locationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX, null, msgs);
			if (newLocationx != null)
				msgs = ((InternalEObject)newLocationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX, null, msgs);
			msgs = basicSetLocationx(newLocationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX, newLocationx, newLocationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, oldFactor, newFactor);
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
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, oldNet, newNet);
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
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getUdis() {
		if (udis == null) {
			udis = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI);
		}
		return udis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubSites() {
		if (subSites == null) {
			subSites = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE);
		}
		return subSites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEncounters() {
		if (encounters == null) {
			encounters = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ENCOUNTER);
		}
		return encounters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER);
		}
		return noteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ExplanationOfBenefitItemAdjudication>(ExplanationOfBenefitItemAdjudication.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitItemDetail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<ExplanationOfBenefitItemDetail>(ExplanationOfBenefitItemDetail.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CARE_TEAM_SEQUENCE:
				return ((InternalEList<?>)getCareTeamSequences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_SEQUENCE:
				return ((InternalEList<?>)getDiagnosisSequences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROCEDURE_SEQUENCE:
				return ((InternalEList<?>)getProcedureSequences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__INFORMATION_SEQUENCE:
				return ((InternalEList<?>)getInformationSequences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE:
				return basicSetRevenue(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				return ((InternalEList<?>)getProgramCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX:
				return basicSetServicedx(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX:
				return basicSetLocationx(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				return basicSetFactor(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				return basicSetNet(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				return ((InternalEList<?>)getUdis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				return ((InternalEList<?>)getSubSites()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ENCOUNTER:
				return ((InternalEList<?>)getEncounters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumbers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				return getSequence();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CARE_TEAM_SEQUENCE:
				return getCareTeamSequences();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_SEQUENCE:
				return getDiagnosisSequences();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROCEDURE_SEQUENCE:
				return getProcedureSequences();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__INFORMATION_SEQUENCE:
				return getInformationSequences();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE:
				return getRevenue();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY:
				return getCategory();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				return getModifiers();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				return getProgramCodes();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX:
				return getServicedx();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX:
				return getLocationx();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				return getQuantity();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				return getFactor();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				return getNet();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				return getUdis();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				return getBodySite();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				return getSubSites();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ENCOUNTER:
				return getEncounters();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				return getNoteNumbers();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				return getAdjudications();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				return getDetails();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CARE_TEAM_SEQUENCE:
				getCareTeamSequences().clear();
				getCareTeamSequences().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_SEQUENCE:
				getDiagnosisSequences().clear();
				getDiagnosisSequences().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROCEDURE_SEQUENCE:
				getProcedureSequences().clear();
				getProcedureSequences().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__INFORMATION_SEQUENCE:
				getInformationSequences().clear();
				getInformationSequences().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE:
				setRevenue((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				getProgramCodes().clear();
				getProgramCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX:
				setServicedx((DataType)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX:
				setLocationx((DataType)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				setNet((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				getUdis().clear();
				getUdis().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				getSubSites().clear();
				getSubSites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ENCOUNTER:
				getEncounters().clear();
				getEncounters().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ExplanationOfBenefitItemAdjudication>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends ExplanationOfBenefitItemDetail>)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CARE_TEAM_SEQUENCE:
				getCareTeamSequences().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_SEQUENCE:
				getDiagnosisSequences().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROCEDURE_SEQUENCE:
				getProcedureSequences().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__INFORMATION_SEQUENCE:
				getInformationSequences().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE:
				setRevenue((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				getProgramCodes().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX:
				setServicedx((DataType)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX:
				setLocationx((DataType)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				setNet((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				getUdis().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				getSubSites().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ENCOUNTER:
				getEncounters().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				getAdjudications().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				getDetails().clear();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CARE_TEAM_SEQUENCE:
				return careTeamSequences != null && !careTeamSequences.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_SEQUENCE:
				return diagnosisSequences != null && !diagnosisSequences.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROCEDURE_SEQUENCE:
				return procedureSequences != null && !procedureSequences.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__INFORMATION_SEQUENCE:
				return informationSequences != null && !informationSequences.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__REVENUE:
				return revenue != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__CATEGORY:
				return category != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				return programCodes != null && !programCodes.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICEDX:
				return servicedx != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__LOCATIONX:
				return locationx != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				return quantity != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				return factor != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				return net != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				return udis != null && !udis.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				return bodySite != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				return subSites != null && !subSites.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ENCOUNTER:
				return encounters != null && !encounters.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitItemImpl
