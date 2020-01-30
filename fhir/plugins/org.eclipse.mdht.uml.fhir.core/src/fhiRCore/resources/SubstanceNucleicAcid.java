/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Nucleic Acid</b></em>'.
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
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcid#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcid#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcid#getAreaOfHybridisation <em>Area Of Hybridisation</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcid#getOligoNucleotideType <em>Oligo Nucleotide Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcid#getSubunits <em>Subunit</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcid()
 * @model
 * @generated
 */
public interface SubstanceNucleicAcid extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcid_SequenceType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSequenceType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcid#getSequenceType <em>Sequence Type</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcid_NumberOfSubunits()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getNumberOfSubunits();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcid#getNumberOfSubunits <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #getNumberOfSubunits()
	 * @generated
	 */
	void setNumberOfSubunits(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Area Of Hybridisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Of Hybridisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Of Hybridisation</em>' containment reference.
	 * @see #setAreaOfHybridisation(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcid_AreaOfHybridisation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAreaOfHybridisation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcid#getAreaOfHybridisation <em>Area Of Hybridisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Of Hybridisation</em>' containment reference.
	 * @see #getAreaOfHybridisation()
	 * @generated
	 */
	void setAreaOfHybridisation(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Oligo Nucleotide Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oligo Nucleotide Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oligo Nucleotide Type</em>' containment reference.
	 * @see #setOligoNucleotideType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcid_OligoNucleotideType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOligoNucleotideType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcid#getOligoNucleotideType <em>Oligo Nucleotide Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oligo Nucleotide Type</em>' containment reference.
	 * @see #getOligoNucleotideType()
	 * @generated
	 */
	void setOligoNucleotideType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceNucleicAcidSubunit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subunit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcid_Subunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceNucleicAcidSubunit> getSubunits();

} // SubstanceNucleicAcid
