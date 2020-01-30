/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Name Name Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductNameNamePart#getPart <em>Part</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductNameNamePart#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductNameNamePart()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Name_NamePart'"
 * @generated
 */
public interface MedicinalProductNameNamePart extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference.
	 * @see #setPart(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductNameNamePart_Part()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPart();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductNameNamePart#getPart <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' containment reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductNameNamePart_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductNameNamePart#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

} // MedicinalProductNameNamePart
