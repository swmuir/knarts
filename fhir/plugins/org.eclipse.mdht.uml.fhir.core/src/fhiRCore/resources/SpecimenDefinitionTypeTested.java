/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Duration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Type Tested</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getPreference <em>Preference</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getContainer <em>Container</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getRetentionTime <em>Retention Time</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getRejectionCriterions <em>Rejection Criterion</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getHandlings <em>Handling</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SpecimenDefinition_TypeTested'"
 * @generated
 */
public interface SpecimenDefinitionTypeTested extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' containment reference.
	 * @see #setIsDerived(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_IsDerived()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getIsDerived <em>Is Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' containment reference.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference</em>' containment reference.
	 * @see #setPreference(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_Preference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getPreference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getPreference <em>Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference</em>' containment reference.
	 * @see #getPreference()
	 * @generated
	 */
	void setPreference(Code value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(SpecimenDefinitionTypeTestedContainer)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_Container()
	 * @model containment="true"
	 * @generated
	 */
	SpecimenDefinitionTypeTestedContainer getContainer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(SpecimenDefinitionTypeTestedContainer value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getRequirement();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Retention Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retention Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention Time</em>' containment reference.
	 * @see #setRetentionTime(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_RetentionTime()
	 * @model containment="true"
	 * @generated
	 */
	Duration getRetentionTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTested#getRetentionTime <em>Retention Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention Time</em>' containment reference.
	 * @see #getRetentionTime()
	 * @generated
	 */
	void setRetentionTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Rejection Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejection Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejection Criterion</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_RejectionCriterion()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getRejectionCriterions();

	/**
	 * Returns the value of the '<em><b>Handling</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handling</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handling</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTested_Handling()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecimenDefinitionTypeTestedHandling> getHandlings();

} // SpecimenDefinitionTypeTested
