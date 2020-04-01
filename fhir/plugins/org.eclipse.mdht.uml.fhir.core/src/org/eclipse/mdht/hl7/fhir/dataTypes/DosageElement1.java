/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dosage Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DosageElement1#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DosageElement1#getDosex <em>Dosex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DosageElement1#getRatex <em>Ratex</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDosageElement1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Dosage_Element1'"
 * @generated
 */
public interface DosageElement1 extends Element {
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
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDosageElement1_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.DosageElement1#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dosex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosex</em>' containment reference.
	 * @see #setDosex(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDosageElement1_Dosex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='dose[x]'"
	 * @generated
	 */
	DataType getDosex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.DosageElement1#getDosex <em>Dosex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dosex</em>' containment reference.
	 * @see #getDosex()
	 * @generated
	 */
	void setDosex(DataType value);

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
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDosageElement1_Ratex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='rate[x]'"
	 * @generated
	 */
	DataType getRatex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.DosageElement1#getRatex <em>Ratex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratex</em>' containment reference.
	 * @see #getRatex()
	 * @generated
	 */
	void setRatex(DataType value);

} // DosageElement1
