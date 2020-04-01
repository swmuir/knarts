/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Range;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition Qualified Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getAppliesTos <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getGestationalAge <em>Gestational Age</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ObservationDefinition_QualifiedInterval'"
 * @generated
 */
public interface ObservationDefinitionQualifiedInterval extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Category()
	 * @model containment="true"
	 * @generated
	 */
	Code getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Code value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Context()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_AppliesTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getAppliesTos();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Gender()
	 * @model containment="true"
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Code value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Range)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Age()
	 * @model containment="true"
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

	/**
	 * Returns the value of the '<em><b>Gestational Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gestational Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gestational Age</em>' containment reference.
	 * @see #setGestationalAge(Range)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_GestationalAge()
	 * @model containment="true"
	 * @generated
	 */
	Range getGestationalAge();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getGestationalAge <em>Gestational Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gestational Age</em>' containment reference.
	 * @see #getGestationalAge()
	 * @generated
	 */
	void setGestationalAge(Range value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Condition()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // ObservationDefinitionQualifiedInterval
