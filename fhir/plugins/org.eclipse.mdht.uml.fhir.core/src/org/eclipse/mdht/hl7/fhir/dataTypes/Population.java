/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getAgex <em>Agex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getRace <em>Race</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getPhysiologicalCondition <em>Physiological Condition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getPopulation()
 * @model
 * @generated
 */
public interface Population extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Agex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agex</em>' containment reference.
	 * @see #setAgex(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getPopulation_Agex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='age[x]'"
	 * @generated
	 */
	DataType getAgex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getAgex <em>Agex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agex</em>' containment reference.
	 * @see #getAgex()
	 * @generated
	 */
	void setAgex(DataType value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getPopulation_Gender()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getGender();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Race</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Race</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Race</em>' containment reference.
	 * @see #setRace(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getPopulation_Race()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRace();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getRace <em>Race</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race</em>' containment reference.
	 * @see #getRace()
	 * @generated
	 */
	void setRace(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Physiological Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physiological Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physiological Condition</em>' containment reference.
	 * @see #setPhysiologicalCondition(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getPopulation_PhysiologicalCondition()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPhysiologicalCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Population#getPhysiologicalCondition <em>Physiological Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physiological Condition</em>' containment reference.
	 * @see #getPhysiologicalCondition()
	 * @generated
	 */
	void setPhysiologicalCondition(CodeableConcept value);

} // Population
