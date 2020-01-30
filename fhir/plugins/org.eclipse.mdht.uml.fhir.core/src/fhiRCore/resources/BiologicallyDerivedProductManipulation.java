/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Manipulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductManipulation#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductManipulation#getTimex <em>Timex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductManipulation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BiologicallyDerivedProduct_Manipulation'"
 * @generated
 */
public interface BiologicallyDerivedProductManipulation extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductManipulation_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductManipulation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Timex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timex</em>' containment reference.
	 * @see #setTimex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductManipulation_Timex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='time[x]'"
	 * @generated
	 */
	DataType getTimex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductManipulation#getTimex <em>Timex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timex</em>' containment reference.
	 * @see #getTimex()
	 * @generated
	 */
	void setTimex(DataType value);

} // BiologicallyDerivedProductManipulation
