/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getTimex <em>Timex</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing()
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
	 * @see #setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Description()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getProcedure();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getProcedure <em>Procedure</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Additive()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAdditive();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getAdditive <em>Additive</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBiologicallyDerivedProductProcessing_Timex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='time[x]'"
	 * @generated
	 */
	DataType getTimex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing#getTimex <em>Timex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timex</em>' containment reference.
	 * @see #getTimex()
	 * @generated
	 */
	void setTimex(DataType value);

} // BiologicallyDerivedProductProcessing
