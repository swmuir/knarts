/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Protein</b></em>'.
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
 *   <li>{@link fhiRCore.resources.SubstanceProtein#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProtein#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProtein#getDisulfideLinkages <em>Disulfide Linkage</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProtein#getSubunits <em>Subunit</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProtein()
 * @model
 * @generated
 */
public interface SubstanceProtein extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Type</em>' containment reference.
	 * @see #setSequenceType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProtein_SequenceType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSequenceType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProtein#getSequenceType <em>Sequence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Type</em>' containment reference.
	 * @see #getSequenceType()
	 * @generated
	 */
	void setSequenceType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Number Of Subunits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Subunits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #setNumberOfSubunits(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProtein_NumberOfSubunits()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getNumberOfSubunits();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProtein#getNumberOfSubunits <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #getNumberOfSubunits()
	 * @generated
	 */
	void setNumberOfSubunits(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Disulfide Linkage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disulfide Linkage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disulfide Linkage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProtein_DisulfideLinkage()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getDisulfideLinkages();

	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceProteinSubunit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subunit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProtein_Subunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceProteinSubunit> getSubunits();

} // SubstanceProtein
