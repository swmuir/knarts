/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.MedicationKnowledge;
import fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines;
import fhiRCore.resources.MedicationKnowledgeCost;
import fhiRCore.resources.MedicationKnowledgeDrugCharacteristic;
import fhiRCore.resources.MedicationKnowledgeIngredient;
import fhiRCore.resources.MedicationKnowledgeKinetics;
import fhiRCore.resources.MedicationKnowledgeMedicineClassification;
import fhiRCore.resources.MedicationKnowledgeMonitoringProgram;
import fhiRCore.resources.MedicationKnowledgeMonograph;
import fhiRCore.resources.MedicationKnowledgePackaging;
import fhiRCore.resources.MedicationKnowledgeRegulatory;
import fhiRCore.resources.MedicationKnowledgeRelatedMedicationKnowledge;
import fhiRCore.resources.ResourcesPackage;

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
 * An implementation of the model object '<em><b>Medication Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getSynonyms <em>Synonym</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getRelatedMedicationKnowledges <em>Related Medication Knowledge</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getAssociatedMedications <em>Associated Medication</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getProductTypes <em>Product Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getMonographs <em>Monograph</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getIngredients <em>Ingredient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getDevices <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getPreparationInstruction <em>Preparation Instruction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getIntendedRoutes <em>Intended Route</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getCosts <em>Cost</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getMonitoringPrograms <em>Monitoring Program</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getAdministrationGuidelines <em>Administration Guidelines</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getMedicineClassifications <em>Medicine Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getDrugCharacteristics <em>Drug Characteristic</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getContraindications <em>Contraindication</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getUndesirableEffects <em>Undesirable Effect</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getRegulatories <em>Regulatory</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeImpl#getKinetics <em>Kinetics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeImpl extends DomainResourceImpl implements MedicationKnowledge {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

	/**
	 * The cached value of the '{@link #getDoseForm() <em>Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseForm;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Quantity amount;

	/**
	 * The cached value of the '{@link #getSynonyms() <em>Synonym</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> synonyms;

	/**
	 * The cached value of the '{@link #getRelatedMedicationKnowledges() <em>Related Medication Knowledge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMedicationKnowledges()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRelatedMedicationKnowledge> relatedMedicationKnowledges;

	/**
	 * The cached value of the '{@link #getAssociatedMedications() <em>Associated Medication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMedications()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> associatedMedications;

	/**
	 * The cached value of the '{@link #getProductTypes() <em>Product Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> productTypes;

	/**
	 * The cached value of the '{@link #getMonographs() <em>Monograph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonographs()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMonograph> monographs;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeIngredient> ingredients;

	/**
	 * The cached value of the '{@link #getDevices() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> devices;

	/**
	 * The cached value of the '{@link #getPreparationInstruction() <em>Preparation Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparationInstruction()
	 * @generated
	 * @ordered
	 */
	protected Markdown preparationInstruction;

	/**
	 * The cached value of the '{@link #getIntendedRoutes() <em>Intended Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> intendedRoutes;

	/**
	 * The cached value of the '{@link #getCosts() <em>Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeCost> costs;

	/**
	 * The cached value of the '{@link #getMonitoringPrograms() <em>Monitoring Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMonitoringProgram> monitoringPrograms;

	/**
	 * The cached value of the '{@link #getAdministrationGuidelines() <em>Administration Guidelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationGuidelines()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeAdministrationGuidelines> administrationGuidelines;

	/**
	 * The cached value of the '{@link #getMedicineClassifications() <em>Medicine Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicineClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMedicineClassification> medicineClassifications;

	/**
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected MedicationKnowledgePackaging packaging;

	/**
	 * The cached value of the '{@link #getDrugCharacteristics() <em>Drug Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeDrugCharacteristic> drugCharacteristics;

	/**
	 * The cached value of the '{@link #getContraindications() <em>Contraindication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindications()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contraindications;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> interactions;

	/**
	 * The cached value of the '{@link #getUndesirableEffects() <em>Undesirable Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndesirableEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> undesirableEffects;

	/**
	 * The cached value of the '{@link #getRegulatories() <em>Regulatory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatories()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRegulatory> regulatories;

	/**
	 * The cached value of the '{@link #getKinetics() <em>Kinetics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinetics()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeKinetics> kinetics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationKnowledge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, oldManufacturer, newManufacturer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseForm() {
		return doseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseForm(CodeableConcept newDoseForm, NotificationChain msgs) {
		CodeableConcept oldDoseForm = doseForm;
		doseForm = newDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, oldDoseForm, newDoseForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseForm(CodeableConcept newDoseForm) {
		if (newDoseForm != doseForm) {
			NotificationChain msgs = null;
			if (doseForm != null)
				msgs = ((InternalEObject)doseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, null, msgs);
			if (newDoseForm != null)
				msgs = ((InternalEObject)newDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, null, msgs);
			msgs = basicSetDoseForm(newDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, newDoseForm, newDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Quantity newAmount, NotificationChain msgs) {
		Quantity oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Quantity newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getSynonyms() {
		if (synonyms == null) {
			synonyms = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__SYNONYM);
		}
		return synonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledges() {
		if (relatedMedicationKnowledges == null) {
			relatedMedicationKnowledges = new EObjectContainmentEList<MedicationKnowledgeRelatedMedicationKnowledge>(MedicationKnowledgeRelatedMedicationKnowledge.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE);
		}
		return relatedMedicationKnowledges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAssociatedMedications() {
		if (associatedMedications == null) {
			associatedMedications = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION);
		}
		return associatedMedications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getProductTypes() {
		if (productTypes == null) {
			productTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE);
		}
		return productTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeMonograph> getMonographs() {
		if (monographs == null) {
			monographs = new EObjectContainmentEList<MedicationKnowledgeMonograph>(MedicationKnowledgeMonograph.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__MONOGRAPH);
		}
		return monographs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeIngredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<MedicationKnowledgeIngredient>(MedicationKnowledgeIngredient.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__INGREDIENT);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__DEVICE);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getPreparationInstruction() {
		return preparationInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparationInstruction(Markdown newPreparationInstruction, NotificationChain msgs) {
		Markdown oldPreparationInstruction = preparationInstruction;
		preparationInstruction = newPreparationInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, oldPreparationInstruction, newPreparationInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreparationInstruction(Markdown newPreparationInstruction) {
		if (newPreparationInstruction != preparationInstruction) {
			NotificationChain msgs = null;
			if (preparationInstruction != null)
				msgs = ((InternalEObject)preparationInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, null, msgs);
			if (newPreparationInstruction != null)
				msgs = ((InternalEObject)newPreparationInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, null, msgs);
			msgs = basicSetPreparationInstruction(newPreparationInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, newPreparationInstruction, newPreparationInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIntendedRoutes() {
		if (intendedRoutes == null) {
			intendedRoutes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE);
		}
		return intendedRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeCost> getCosts() {
		if (costs == null) {
			costs = new EObjectContainmentEList<MedicationKnowledgeCost>(MedicationKnowledgeCost.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__COST);
		}
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeMonitoringProgram> getMonitoringPrograms() {
		if (monitoringPrograms == null) {
			monitoringPrograms = new EObjectContainmentEList<MedicationKnowledgeMonitoringProgram>(MedicationKnowledgeMonitoringProgram.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM);
		}
		return monitoringPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeAdministrationGuidelines> getAdministrationGuidelines() {
		if (administrationGuidelines == null) {
			administrationGuidelines = new EObjectContainmentEList<MedicationKnowledgeAdministrationGuidelines>(MedicationKnowledgeAdministrationGuidelines.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES);
		}
		return administrationGuidelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeMedicineClassification> getMedicineClassifications() {
		if (medicineClassifications == null) {
			medicineClassifications = new EObjectContainmentEList<MedicationKnowledgeMedicineClassification>(MedicationKnowledgeMedicineClassification.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION);
		}
		return medicineClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgePackaging getPackaging() {
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackaging(MedicationKnowledgePackaging newPackaging, NotificationChain msgs) {
		MedicationKnowledgePackaging oldPackaging = packaging;
		packaging = newPackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING, oldPackaging, newPackaging);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackaging(MedicationKnowledgePackaging newPackaging) {
		if (newPackaging != packaging) {
			NotificationChain msgs = null;
			if (packaging != null)
				msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING, null, msgs);
			if (newPackaging != null)
				msgs = ((InternalEObject)newPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING, null, msgs);
			msgs = basicSetPackaging(newPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING, newPackaging, newPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeDrugCharacteristic> getDrugCharacteristics() {
		if (drugCharacteristics == null) {
			drugCharacteristics = new EObjectContainmentEList<MedicationKnowledgeDrugCharacteristic>(MedicationKnowledgeDrugCharacteristic.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC);
		}
		return drugCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getContraindications() {
		if (contraindications == null) {
			contraindications = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION);
		}
		return contraindications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__INTERACTION);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getUndesirableEffects() {
		if (undesirableEffects == null) {
			undesirableEffects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__UNDESIRABLE_EFFECT);
		}
		return undesirableEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeRegulatory> getRegulatories() {
		if (regulatories == null) {
			regulatories = new EObjectContainmentEList<MedicationKnowledgeRegulatory>(MedicationKnowledgeRegulatory.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__REGULATORY);
		}
		return regulatories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeKinetics> getKinetics() {
		if (kinetics == null) {
			kinetics = new EObjectContainmentEList<MedicationKnowledgeKinetics>(MedicationKnowledgeKinetics.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE__KINETICS);
		}
		return kinetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				return basicSetDoseForm(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				return basicSetAmount(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				return ((InternalEList<?>)getSynonyms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return ((InternalEList<?>)getRelatedMedicationKnowledges()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return ((InternalEList<?>)getAssociatedMedications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return ((InternalEList<?>)getProductTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return ((InternalEList<?>)getMonographs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DEVICE:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return basicSetPreparationInstruction(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				return ((InternalEList<?>)getIntendedRoutes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__COST:
				return ((InternalEList<?>)getCosts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return ((InternalEList<?>)getMonitoringPrograms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				return ((InternalEList<?>)getAdministrationGuidelines()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return ((InternalEList<?>)getMedicineClassifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return basicSetPackaging(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				return ((InternalEList<?>)getDrugCharacteristics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				return ((InternalEList<?>)getContraindications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTERACTION:
				return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__UNDESIRABLE_EFFECT:
				return ((InternalEList<?>)getUndesirableEffects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return ((InternalEList<?>)getRegulatories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE__KINETICS:
				return ((InternalEList<?>)getKinetics()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CODE:
				return getCode();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS:
				return getStatus();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				return getManufacturer();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				return getDoseForm();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				return getAmount();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				return getSynonyms();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return getRelatedMedicationKnowledges();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return getAssociatedMedications();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return getProductTypes();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return getMonographs();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				return getIngredients();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DEVICE:
				return getDevices();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return getPreparationInstruction();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				return getIntendedRoutes();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__COST:
				return getCosts();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return getMonitoringPrograms();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				return getAdministrationGuidelines();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return getMedicineClassifications();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return getPackaging();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				return getDrugCharacteristics();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				return getContraindications();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTERACTION:
				return getInteractions();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__UNDESIRABLE_EFFECT:
				return getUndesirableEffects();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return getRegulatories();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__KINETICS:
				return getKinetics();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				setDoseForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				setAmount((Quantity)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				getSynonyms().clear();
				getSynonyms().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				getRelatedMedicationKnowledges().clear();
				getRelatedMedicationKnowledges().addAll((Collection<? extends MedicationKnowledgeRelatedMedicationKnowledge>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				getAssociatedMedications().clear();
				getAssociatedMedications().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				getProductTypes().clear();
				getProductTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				getMonographs().clear();
				getMonographs().addAll((Collection<? extends MedicationKnowledgeMonograph>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends MedicationKnowledgeIngredient>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DEVICE:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				setPreparationInstruction((Markdown)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				getIntendedRoutes().clear();
				getIntendedRoutes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__COST:
				getCosts().clear();
				getCosts().addAll((Collection<? extends MedicationKnowledgeCost>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				getMonitoringPrograms().clear();
				getMonitoringPrograms().addAll((Collection<? extends MedicationKnowledgeMonitoringProgram>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				getAdministrationGuidelines().clear();
				getAdministrationGuidelines().addAll((Collection<? extends MedicationKnowledgeAdministrationGuidelines>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				getMedicineClassifications().clear();
				getMedicineClassifications().addAll((Collection<? extends MedicationKnowledgeMedicineClassification>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				setPackaging((MedicationKnowledgePackaging)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				getDrugCharacteristics().clear();
				getDrugCharacteristics().addAll((Collection<? extends MedicationKnowledgeDrugCharacteristic>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				getContraindications().clear();
				getContraindications().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTERACTION:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__UNDESIRABLE_EFFECT:
				getUndesirableEffects().clear();
				getUndesirableEffects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				getRegulatories().clear();
				getRegulatories().addAll((Collection<? extends MedicationKnowledgeRegulatory>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__KINETICS:
				getKinetics().clear();
				getKinetics().addAll((Collection<? extends MedicationKnowledgeKinetics>)newValue);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				setDoseForm((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				setAmount((Quantity)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				getSynonyms().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				getRelatedMedicationKnowledges().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				getAssociatedMedications().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				getProductTypes().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				getMonographs().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				getIngredients().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DEVICE:
				getDevices().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				setPreparationInstruction((Markdown)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				getIntendedRoutes().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__COST:
				getCosts().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				getMonitoringPrograms().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				getAdministrationGuidelines().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				getMedicineClassifications().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				setPackaging((MedicationKnowledgePackaging)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				getDrugCharacteristics().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				getContraindications().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTERACTION:
				getInteractions().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__UNDESIRABLE_EFFECT:
				getUndesirableEffects().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				getRegulatories().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__KINETICS:
				getKinetics().clear();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CODE:
				return code != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				return manufacturer != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				return doseForm != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				return amount != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				return synonyms != null && !synonyms.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return relatedMedicationKnowledges != null && !relatedMedicationKnowledges.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return associatedMedications != null && !associatedMedications.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return productTypes != null && !productTypes.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return monographs != null && !monographs.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				return ingredients != null && !ingredients.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DEVICE:
				return devices != null && !devices.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return preparationInstruction != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				return intendedRoutes != null && !intendedRoutes.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__COST:
				return costs != null && !costs.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return monitoringPrograms != null && !monitoringPrograms.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				return administrationGuidelines != null && !administrationGuidelines.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return medicineClassifications != null && !medicineClassifications.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return packaging != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				return drugCharacteristics != null && !drugCharacteristics.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				return contraindications != null && !contraindications.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__INTERACTION:
				return interactions != null && !interactions.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__UNDESIRABLE_EFFECT:
				return undesirableEffects != null && !undesirableEffects.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return regulatories != null && !regulatories.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE__KINETICS:
				return kinetics != null && !kinetics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeImpl
