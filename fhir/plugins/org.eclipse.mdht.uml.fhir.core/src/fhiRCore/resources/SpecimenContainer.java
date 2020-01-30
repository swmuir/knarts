/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SpecimenContainer#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenContainer#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenContainer#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenContainer#getSpecimenQuantity <em>Specimen Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenContainer#getAdditivex <em>Additivex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSpecimenContainer()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Specimen_Container'"
 * @generated
 */
public interface SpecimenContainer extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenContainer_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenContainer_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenContainer#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenContainer_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenContainer#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenContainer_Capacity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getCapacity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenContainer#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Specimen Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen Quantity</em>' containment reference.
	 * @see #setSpecimenQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenContainer_SpecimenQuantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getSpecimenQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenContainer#getSpecimenQuantity <em>Specimen Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen Quantity</em>' containment reference.
	 * @see #getSpecimenQuantity()
	 * @generated
	 */
	void setSpecimenQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Additivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additivex</em>' containment reference.
	 * @see #setAdditivex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenContainer_Additivex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='additive[x]'"
	 * @generated
	 */
	DataType getAdditivex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenContainer#getAdditivex <em>Additivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additivex</em>' containment reference.
	 * @see #getAdditivex()
	 * @generated
	 */
	void setAdditivex(DataType value);

} // SpecimenContainer
