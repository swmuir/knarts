/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.ActivityDefinition;
import fhiRCore.resources.NutritionOrder;
import fhiRCore.resources.NutritionOrderEnteralFormula;
import fhiRCore.resources.NutritionOrderOralDiet;
import fhiRCore.resources.NutritionOrderSupplement;
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
 * An implementation of the model object '<em><b>Nutrition Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getAllergyIntolerances <em>Allergy Intolerance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getFoodPreferenceModifiers <em>Food Preference Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getExcludeFoodModifiers <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getSupplements <em>Supplement</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getEnteralFormula <em>Enteral Formula</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderImpl extends DomainResourceImpl implements NutritionOrder {
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
	 * The cached value of the '{@link #getInstantiatesCanonicals() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonicals()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinition> instantiatesCanonicals;

	/**
	 * The cached value of the '{@link #getInstantiatesUris() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUris()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUris;

	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiates;

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
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Code intent;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderer()
	 * @generated
	 * @ordered
	 */
	protected Reference orderer;

	/**
	 * The cached value of the '{@link #getAllergyIntolerances() <em>Allergy Intolerance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerances()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> allergyIntolerances;

	/**
	 * The cached value of the '{@link #getFoodPreferenceModifiers() <em>Food Preference Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodPreferenceModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> foodPreferenceModifiers;

	/**
	 * The cached value of the '{@link #getExcludeFoodModifiers() <em>Exclude Food Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFoodModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> excludeFoodModifiers;

	/**
	 * The cached value of the '{@link #getOralDiet() <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOralDiet()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderOralDiet oralDiet;

	/**
	 * The cached value of the '{@link #getSupplements() <em>Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplements()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderSupplement> supplements;

	/**
	 * The cached value of the '{@link #getEnteralFormula() <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteralFormula()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderEnteralFormula enteralFormula;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNutritionOrder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.NUTRITION_ORDER__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDefinition> getInstantiatesCanonicals() {
		if (instantiatesCanonicals == null) {
			instantiatesCanonicals = new EObjectContainmentEList<ActivityDefinition>(ActivityDefinition.class, this, ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonicals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiatesUris() {
		if (instantiatesUris == null) {
			instantiatesUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_URI);
		}
		return instantiatesUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiates() {
		if (instantiates == null) {
			instantiates = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.NUTRITION_ORDER__INSTANTIATES);
		}
		return instantiates;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Code newIntent, NotificationChain msgs) {
		Code oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Code newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrderer() {
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderer(Reference newOrderer, NotificationChain msgs) {
		Reference oldOrderer = orderer;
		orderer = newOrderer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ORDERER, oldOrderer, newOrderer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderer(Reference newOrderer) {
		if (newOrderer != orderer) {
			NotificationChain msgs = null;
			if (orderer != null)
				msgs = ((InternalEObject)orderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ORDERER, null, msgs);
			if (newOrderer != null)
				msgs = ((InternalEObject)newOrderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ORDERER, null, msgs);
			msgs = basicSetOrderer(newOrderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ORDERER, newOrderer, newOrderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAllergyIntolerances() {
		if (allergyIntolerances == null) {
			allergyIntolerances = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE);
		}
		return allergyIntolerances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFoodPreferenceModifiers() {
		if (foodPreferenceModifiers == null) {
			foodPreferenceModifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER);
		}
		return foodPreferenceModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getExcludeFoodModifiers() {
		if (excludeFoodModifiers == null) {
			excludeFoodModifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER);
		}
		return excludeFoodModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet getOralDiet() {
		return oralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOralDiet(NutritionOrderOralDiet newOralDiet, NotificationChain msgs) {
		NutritionOrderOralDiet oldOralDiet = oralDiet;
		oralDiet = newOralDiet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ORAL_DIET, oldOralDiet, newOralDiet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOralDiet(NutritionOrderOralDiet newOralDiet) {
		if (newOralDiet != oralDiet) {
			NotificationChain msgs = null;
			if (oralDiet != null)
				msgs = ((InternalEObject)oralDiet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			if (newOralDiet != null)
				msgs = ((InternalEObject)newOralDiet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			msgs = basicSetOralDiet(newOralDiet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ORAL_DIET, newOralDiet, newOralDiet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderSupplement> getSupplements() {
		if (supplements == null) {
			supplements = new EObjectContainmentEList<NutritionOrderSupplement>(NutritionOrderSupplement.class, this, ResourcesPackage.NUTRITION_ORDER__SUPPLEMENT);
		}
		return supplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula getEnteralFormula() {
		return enteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula, NotificationChain msgs) {
		NutritionOrderEnteralFormula oldEnteralFormula = enteralFormula;
		enteralFormula = newEnteralFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA, oldEnteralFormula, newEnteralFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula) {
		if (newEnteralFormula != enteralFormula) {
			NotificationChain msgs = null;
			if (enteralFormula != null)
				msgs = ((InternalEObject)enteralFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			if (newEnteralFormula != null)
				msgs = ((InternalEObject)newEnteralFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			msgs = basicSetEnteralFormula(newEnteralFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA, newEnteralFormula, newEnteralFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.NUTRITION_ORDER__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.NUTRITION_ORDER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES:
				return ((InternalEList<?>)getInstantiates()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__INTENT:
				return basicSetIntent(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__ORDERER:
				return basicSetOrderer(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return ((InternalEList<?>)getAllergyIntolerances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return ((InternalEList<?>)getFoodPreferenceModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return ((InternalEList<?>)getExcludeFoodModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__ORAL_DIET:
				return basicSetOralDiet(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__SUPPLEMENT:
				return ((InternalEList<?>)getSupplements()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return basicSetEnteralFormula(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.NUTRITION_ORDER__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonicals();
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				return getInstantiatesUris();
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES:
				return getInstantiates();
			case ResourcesPackage.NUTRITION_ORDER__STATUS:
				return getStatus();
			case ResourcesPackage.NUTRITION_ORDER__INTENT:
				return getIntent();
			case ResourcesPackage.NUTRITION_ORDER__PATIENT:
				return getPatient();
			case ResourcesPackage.NUTRITION_ORDER__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.NUTRITION_ORDER__DATE_TIME:
				return getDateTime();
			case ResourcesPackage.NUTRITION_ORDER__ORDERER:
				return getOrderer();
			case ResourcesPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return getAllergyIntolerances();
			case ResourcesPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return getFoodPreferenceModifiers();
			case ResourcesPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return getExcludeFoodModifiers();
			case ResourcesPackage.NUTRITION_ORDER__ORAL_DIET:
				return getOralDiet();
			case ResourcesPackage.NUTRITION_ORDER__SUPPLEMENT:
				return getSupplements();
			case ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return getEnteralFormula();
			case ResourcesPackage.NUTRITION_ORDER__NOTE:
				return getNotes();
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
			case ResourcesPackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				getInstantiatesCanonicals().addAll((Collection<? extends ActivityDefinition>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				getInstantiatesUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES:
				getInstantiates().clear();
				getInstantiates().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Reference)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerances().clear();
				getAllergyIntolerances().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifiers().clear();
				getFoodPreferenceModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifiers().clear();
				getExcludeFoodModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplements().clear();
				getSupplements().addAll((Collection<? extends NutritionOrderSupplement>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES:
				getInstantiates().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Reference)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerances().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifiers().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifiers().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplements().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.NUTRITION_ORDER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_CANONICAL:
				return instantiatesCanonicals != null && !instantiatesCanonicals.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES_URI:
				return instantiatesUris != null && !instantiatesUris.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__INSTANTIATES:
				return instantiates != null && !instantiates.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__STATUS:
				return status != null;
			case ResourcesPackage.NUTRITION_ORDER__INTENT:
				return intent != null;
			case ResourcesPackage.NUTRITION_ORDER__PATIENT:
				return patient != null;
			case ResourcesPackage.NUTRITION_ORDER__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.NUTRITION_ORDER__DATE_TIME:
				return dateTime != null;
			case ResourcesPackage.NUTRITION_ORDER__ORDERER:
				return orderer != null;
			case ResourcesPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return allergyIntolerances != null && !allergyIntolerances.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return foodPreferenceModifiers != null && !foodPreferenceModifiers.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return excludeFoodModifiers != null && !excludeFoodModifiers.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__ORAL_DIET:
				return oralDiet != null;
			case ResourcesPackage.NUTRITION_ORDER__SUPPLEMENT:
				return supplements != null && !supplements.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return enteralFormula != null;
			case ResourcesPackage.NUTRITION_ORDER__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderImpl
