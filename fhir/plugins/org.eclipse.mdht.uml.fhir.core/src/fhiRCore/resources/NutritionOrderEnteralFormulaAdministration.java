/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Timing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Enteral Formula Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration#getRatex <em>Ratex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormulaAdministration()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EnteralFormula_Administration'"
 * @generated
 */
public interface NutritionOrderEnteralFormulaAdministration extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Timing)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormulaAdministration_Schedule()
	 * @model containment="true"
	 * @generated
	 */
	Timing getSchedule();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Timing value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormulaAdministration_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Ratex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratex</em>' containment reference.
	 * @see #setRatex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderEnteralFormulaAdministration_Ratex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='rate[x]'"
	 * @generated
	 */
	DataType getRatex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration#getRatex <em>Ratex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratex</em>' containment reference.
	 * @see #getRatex()
	 * @generated
	 */
	void setRatex(DataType value);

} // NutritionOrderEnteralFormulaAdministration
