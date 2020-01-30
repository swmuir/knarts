/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceInstance#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceInstance#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceInstance#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceInstance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Substance_Instance'"
 * @generated
 */
public interface SubstanceInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceInstance_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceInstance#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry</em>' containment reference.
	 * @see #setExpiry(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceInstance_Expiry()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getExpiry();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceInstance#getExpiry <em>Expiry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' containment reference.
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(DateTime value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceInstance_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceInstance#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

} // SubstanceInstance
