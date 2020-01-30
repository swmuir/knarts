/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Ratio;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceIngredient#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceIngredient#getSubstancex <em>Substancex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceIngredient()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Substance_Ingredient'"
 * @generated
 */
public interface SubstanceIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceIngredient_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceIngredient#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Ratio value);

	/**
	 * Returns the value of the '<em><b>Substancex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substancex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substancex</em>' containment reference.
	 * @see #setSubstancex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceIngredient_Substancex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='substance[x]'"
	 * @generated
	 */
	DataType getSubstancex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceIngredient#getSubstancex <em>Substancex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substancex</em>' containment reference.
	 * @see #getSubstancex()
	 * @generated
	 */
	void setSubstancex(DataType value);

} // SubstanceIngredient
