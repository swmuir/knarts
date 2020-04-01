/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Type Tested Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getCap <em>Cap</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getMinimumVolumex <em>Minimum Volumex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getAdditives <em>Additive</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getPreparation <em>Preparation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TypeTested_Container'"
 * @generated
 */
public interface SpecimenDefinitionTypeTestedContainer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_Material()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMaterial();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(CodeableConcept value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' containment reference.
	 * @see #setCap(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_Cap()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCap();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getCap <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' containment reference.
	 * @see #getCap()
	 * @generated
	 */
	void setCap(CodeableConcept value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_Description()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_Capacity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Minimum Volumex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Volumex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Volumex</em>' containment reference.
	 * @see #setMinimumVolumex(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_MinimumVolumex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='minimumVolume[x]'"
	 * @generated
	 */
	DataType getMinimumVolumex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getMinimumVolumex <em>Minimum Volumex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Volumex</em>' containment reference.
	 * @see #getMinimumVolumex()
	 * @generated
	 */
	void setMinimumVolumex(DataType value);

	/**
	 * Returns the value of the '<em><b>Additive</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainerAdditive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_Additive()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecimenDefinitionTypeTestedContainerAdditive> getAdditives();

	/**
	 * Returns the value of the '<em><b>Preparation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preparation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparation</em>' containment reference.
	 * @see #setPreparation(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainer_Preparation()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getPreparation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTestedContainer#getPreparation <em>Preparation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparation</em>' containment reference.
	 * @see #getPreparation()
	 * @generated
	 */
	void setPreparation(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // SpecimenDefinitionTypeTestedContainer
