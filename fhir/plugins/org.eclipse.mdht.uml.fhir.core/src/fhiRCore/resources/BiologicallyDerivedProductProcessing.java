/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getAdditive <em>Additive</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getTimex <em>Timex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BiologicallyDerivedProduct_Processing'"
 * @generated
 */
public interface BiologicallyDerivedProductProcessing extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getProcedure();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive</em>' containment reference.
	 * @see #setAdditive(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Additive()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAdditive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getAdditive <em>Additive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive</em>' containment reference.
	 * @see #getAdditive()
	 * @generated
	 */
	void setAdditive(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Timex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='time[x]'"
	 * @generated
	 */
	DataType getTimex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductProcessing#getTimex <em>Timex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timex</em>' containment reference.
	 * @see #getTimex()
	 * @generated
	 */
	void setTimex(DataType value);

} // BiologicallyDerivedProductProcessing
