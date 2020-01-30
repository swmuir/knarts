/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Range;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition Qualified Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getRange <em>Range</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getAppliesTos <em>Applies To</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getAge <em>Age</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getGestationalAge <em>Gestational Age</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval()
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Category()
	 * @model containment="true"
	 * @generated
	 */
	Code getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getCategory <em>Category</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getRange <em>Range</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Context()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getContext();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_AppliesTo()
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Gender()
	 * @model containment="true"
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getGender <em>Gender</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Age()
	 * @model containment="true"
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getAge <em>Age</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_GestationalAge()
	 * @model containment="true"
	 * @generated
	 */
	Range getGestationalAge();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getGestationalAge <em>Gestational Age</em>}' containment reference.
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
	 * @see #setCondition(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getObservationDefinitionQualifiedInterval_Condition()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCondition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(fhiRCore.dataTypes.String value);

} // ObservationDefinitionQualifiedInterval
