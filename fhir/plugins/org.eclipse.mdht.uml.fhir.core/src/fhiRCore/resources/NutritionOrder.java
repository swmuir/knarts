/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getAllergyIntolerances <em>Allergy Intolerance</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getFoodPreferenceModifiers <em>Food Preference Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getExcludeFoodModifiers <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getSupplements <em>Supplement</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getEnteralFormula <em>Enteral Formula</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrder#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder()
 * @model
 * @generated
 */
public interface NutritionOrder extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ActivityDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Canonical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_InstantiatesCanonical()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityDefinition> getInstantiatesCanonicals();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Uri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_InstantiatesUri()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getInstantiatesUris();

	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Instantiates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getInstantiates();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Intent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getIntent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(Code value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_DateTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Orderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderer</em>' containment reference.
	 * @see #setOrderer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Orderer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOrderer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getOrderer <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderer</em>' containment reference.
	 * @see #getOrderer()
	 * @generated
	 */
	void setOrderer(Reference value);

	/**
	 * Returns the value of the '<em><b>Allergy Intolerance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allergy Intolerance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_AllergyIntolerance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAllergyIntolerances();

	/**
	 * Returns the value of the '<em><b>Food Preference Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food Preference Modifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Preference Modifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_FoodPreferenceModifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getFoodPreferenceModifiers();

	/**
	 * Returns the value of the '<em><b>Exclude Food Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Food Modifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Food Modifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_ExcludeFoodModifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getExcludeFoodModifiers();

	/**
	 * Returns the value of the '<em><b>Oral Diet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oral Diet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oral Diet</em>' containment reference.
	 * @see #setOralDiet(NutritionOrderOralDiet)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_OralDiet()
	 * @model containment="true"
	 * @generated
	 */
	NutritionOrderOralDiet getOralDiet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getOralDiet <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oral Diet</em>' containment reference.
	 * @see #getOralDiet()
	 * @generated
	 */
	void setOralDiet(NutritionOrderOralDiet value);

	/**
	 * Returns the value of the '<em><b>Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.NutritionOrderSupplement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplement</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Supplement()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionOrderSupplement> getSupplements();

	/**
	 * Returns the value of the '<em><b>Enteral Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enteral Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enteral Formula</em>' containment reference.
	 * @see #setEnteralFormula(NutritionOrderEnteralFormula)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_EnteralFormula()
	 * @model containment="true"
	 * @generated
	 */
	NutritionOrderEnteralFormula getEnteralFormula();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrder#getEnteralFormula <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enteral Formula</em>' containment reference.
	 * @see #getEnteralFormula()
	 * @generated
	 */
	void setEnteralFormula(NutritionOrderEnteralFormula value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrder_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // NutritionOrder
