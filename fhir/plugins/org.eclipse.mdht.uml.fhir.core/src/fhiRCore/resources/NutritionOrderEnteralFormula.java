/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Enteral Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getAdditiveType <em>Additive Type</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getCaloricDensity <em>Caloric Density</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getAdministrations <em>Administration</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormula#getAdministrationInstruction <em>Administration Instruction</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NutritionOrder_EnteralFormula'"
 * @generated
 */
public interface NutritionOrderEnteralFormula extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Base Formula Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Formula Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Formula Type</em>' containment reference.
	 * @see #setBaseFormulaType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_BaseFormulaType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getBaseFormulaType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Type</em>' containment reference.
	 * @see #getBaseFormulaType()
	 * @generated
	 */
	void setBaseFormulaType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Base Formula Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Formula Product Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Formula Product Name</em>' containment reference.
	 * @see #setBaseFormulaProductName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_BaseFormulaProductName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getBaseFormulaProductName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Product Name</em>' containment reference.
	 * @see #getBaseFormulaProductName()
	 * @generated
	 */
	void setBaseFormulaProductName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Additive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Type</em>' containment reference.
	 * @see #setAdditiveType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_AdditiveType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAdditiveType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getAdditiveType <em>Additive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Type</em>' containment reference.
	 * @see #getAdditiveType()
	 * @generated
	 */
	void setAdditiveType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Product Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Product Name</em>' containment reference.
	 * @see #setAdditiveProductName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_AdditiveProductName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAdditiveProductName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Product Name</em>' containment reference.
	 * @see #getAdditiveProductName()
	 * @generated
	 */
	void setAdditiveProductName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Caloric Density</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caloric Density</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caloric Density</em>' containment reference.
	 * @see #setCaloricDensity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_CaloricDensity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getCaloricDensity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getCaloricDensity <em>Caloric Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caloric Density</em>' containment reference.
	 * @see #getCaloricDensity()
	 * @generated
	 */
	void setCaloricDensity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Routeof Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routeof Administration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routeof Administration</em>' containment reference.
	 * @see #setRouteofAdministration(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_RouteofAdministration()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRouteofAdministration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routeof Administration</em>' containment reference.
	 * @see #getRouteofAdministration()
	 * @generated
	 */
	void setRouteofAdministration(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Administration</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_Administration()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionOrderEnteralFormulaAdministration> getAdministrations();

	/**
	 * Returns the value of the '<em><b>Max Volume To Deliver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Volume To Deliver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Volume To Deliver</em>' containment reference.
	 * @see #setMaxVolumeToDeliver(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_MaxVolumeToDeliver()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getMaxVolumeToDeliver();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volume To Deliver</em>' containment reference.
	 * @see #getMaxVolumeToDeliver()
	 * @generated
	 */
	void setMaxVolumeToDeliver(Quantity value);

	/**
	 * Returns the value of the '<em><b>Administration Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administration Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration Instruction</em>' containment reference.
	 * @see #setAdministrationInstruction(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormula_AdministrationInstruction()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAdministrationInstruction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormula#getAdministrationInstruction <em>Administration Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration Instruction</em>' containment reference.
	 * @see #getAdministrationInstruction()
	 * @generated
	 */
	void setAdministrationInstruction(fhiRCore.dataTypes.String value);

} // NutritionOrderEnteralFormula
