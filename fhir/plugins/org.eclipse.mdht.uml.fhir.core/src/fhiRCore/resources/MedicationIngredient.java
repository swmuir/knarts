/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Ratio;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationIngredient#getItemx <em>Itemx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationIngredient#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationIngredient#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationIngredient()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Medication_Ingredient'"
 * @generated
 */
public interface MedicationIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Itemx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemx</em>' containment reference.
	 * @see #setItemx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationIngredient_Itemx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='item[x]'"
	 * @generated
	 */
	DataType getItemx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationIngredient#getItemx <em>Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemx</em>' containment reference.
	 * @see #getItemx()
	 * @generated
	 */
	void setItemx(DataType value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' containment reference.
	 * @see #setIsActive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationIngredient_IsActive()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationIngredient#getIsActive <em>Is Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' containment reference.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationIngredient_Strength()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getStrength();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationIngredient#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Ratio value);

} // MedicationIngredient
