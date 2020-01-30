/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Organism Hybrid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getMaternalOrganismId <em>Maternal Organism Id</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getMaternalOrganismName <em>Maternal Organism Name</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getPaternalOrganismId <em>Paternal Organism Id</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getPaternalOrganismName <em>Paternal Organism Name</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getHybridType <em>Hybrid Type</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismHybrid()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Organism_Hybrid'"
 * @generated
 */
public interface SubstanceSourceMaterialOrganismHybrid extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Maternal Organism Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maternal Organism Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maternal Organism Id</em>' containment reference.
	 * @see #setMaternalOrganismId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismHybrid_MaternalOrganismId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMaternalOrganismId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getMaternalOrganismId <em>Maternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maternal Organism Id</em>' containment reference.
	 * @see #getMaternalOrganismId()
	 * @generated
	 */
	void setMaternalOrganismId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Maternal Organism Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maternal Organism Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maternal Organism Name</em>' containment reference.
	 * @see #setMaternalOrganismName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismHybrid_MaternalOrganismName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMaternalOrganismName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getMaternalOrganismName <em>Maternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maternal Organism Name</em>' containment reference.
	 * @see #getMaternalOrganismName()
	 * @generated
	 */
	void setMaternalOrganismName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Paternal Organism Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paternal Organism Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paternal Organism Id</em>' containment reference.
	 * @see #setPaternalOrganismId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismHybrid_PaternalOrganismId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPaternalOrganismId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getPaternalOrganismId <em>Paternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paternal Organism Id</em>' containment reference.
	 * @see #getPaternalOrganismId()
	 * @generated
	 */
	void setPaternalOrganismId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Paternal Organism Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paternal Organism Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paternal Organism Name</em>' containment reference.
	 * @see #setPaternalOrganismName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismHybrid_PaternalOrganismName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPaternalOrganismName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getPaternalOrganismName <em>Paternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paternal Organism Name</em>' containment reference.
	 * @see #getPaternalOrganismName()
	 * @generated
	 */
	void setPaternalOrganismName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Hybrid Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hybrid Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid Type</em>' containment reference.
	 * @see #setHybridType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismHybrid_HybridType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getHybridType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid#getHybridType <em>Hybrid Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid Type</em>' containment reference.
	 * @see #getHybridType()
	 * @generated
	 */
	void setHybridType(CodeableConcept value);

} // SubstanceSourceMaterialOrganismHybrid
