/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition</b></em>'.
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
 *   <li>{@link fhiRCore.resources.SpecimenDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinition#getTypeCollected <em>Type Collected</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinition#getPatientPreparations <em>Patient Preparation</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinition#getTimeAspect <em>Time Aspect</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinition#getCollections <em>Collection</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinition#getTypeTesteds <em>Type Tested</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinition()
 * @model
 * @generated
 */
public interface SpecimenDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinition_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinition#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type Collected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Collected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Collected</em>' containment reference.
	 * @see #setTypeCollected(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinition_TypeCollected()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getTypeCollected();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinition#getTypeCollected <em>Type Collected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Collected</em>' containment reference.
	 * @see #getTypeCollected()
	 * @generated
	 */
	void setTypeCollected(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient Preparation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Preparation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Preparation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinition_PatientPreparation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPatientPreparations();

	/**
	 * Returns the value of the '<em><b>Time Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Aspect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Aspect</em>' containment reference.
	 * @see #setTimeAspect(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinition_TimeAspect()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTimeAspect();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinition#getTimeAspect <em>Time Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Aspect</em>' containment reference.
	 * @see #getTimeAspect()
	 * @generated
	 */
	void setTimeAspect(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinition_Collection()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCollections();

	/**
	 * Returns the value of the '<em><b>Type Tested</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SpecimenDefinitionTypeTested}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Tested</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Tested</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinition_TypeTested()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecimenDefinitionTypeTested> getTypeTesteds();

} // SpecimenDefinition
