/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceProtein#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceProtein#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceProtein#getDisulfideLinkages <em>Disulfide Linkage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceProtein#getSubunits <em>Subunit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceProtein()
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceProtein_SequenceType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSequenceType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceProtein#getSequenceType <em>Sequence Type</em>}' containment reference.
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
	 * @see #setNumberOfSubunits(org.eclipse.mdht.hl7.fhir.dataTypes.Integer)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceProtein_NumberOfSubunits()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Integer getNumberOfSubunits();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceProtein#getNumberOfSubunits <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #getNumberOfSubunits()
	 * @generated
	 */
	void setNumberOfSubunits(org.eclipse.mdht.hl7.fhir.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Disulfide Linkage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disulfide Linkage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disulfide Linkage</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceProtein_DisulfideLinkage()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getDisulfideLinkages();

	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.SubstanceProteinSubunit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subunit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceProtein_Subunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceProteinSubunit> getSubunits();

} // SubstanceProtein
