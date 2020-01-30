/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Reference Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getStrand <em>Strand</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getWindowEnd <em>Window End</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MolecularSequence_ReferenceSeq'"
 * @generated
 */
public interface MolecularSequenceReferenceSeq extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Chromosome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chromosome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chromosome</em>' containment reference.
	 * @see #setChromosome(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_Chromosome()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getChromosome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getChromosome <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chromosome</em>' containment reference.
	 * @see #getChromosome()
	 * @generated
	 */
	void setChromosome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Genome Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genome Build</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genome Build</em>' containment reference.
	 * @see #setGenomeBuild(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_GenomeBuild()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getGenomeBuild();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Build</em>' containment reference.
	 * @see #getGenomeBuild()
	 * @generated
	 */
	void setGenomeBuild(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_Orientation()
	 * @model containment="true"
	 * @generated
	 */
	Code getOrientation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Code value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq Id</em>' containment reference.
	 * @see #setReferenceSeqId(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_ReferenceSeqId()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getReferenceSeqId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Id</em>' containment reference.
	 * @see #getReferenceSeqId()
	 * @generated
	 */
	void setReferenceSeqId(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq Pointer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq Pointer</em>' containment reference.
	 * @see #setReferenceSeqPointer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_ReferenceSeqPointer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReferenceSeqPointer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Pointer</em>' containment reference.
	 * @see #getReferenceSeqPointer()
	 * @generated
	 */
	void setReferenceSeqPointer(Reference value);

	/**
	 * Returns the value of the '<em><b>Reference Seq String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq String</em>' containment reference.
	 * @see #setReferenceSeqString(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_ReferenceSeqString()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getReferenceSeqString();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq String</em>' containment reference.
	 * @see #getReferenceSeqString()
	 * @generated
	 */
	void setReferenceSeqString(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Strand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strand</em>' containment reference.
	 * @see #setStrand(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_Strand()
	 * @model containment="true"
	 * @generated
	 */
	Code getStrand();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getStrand <em>Strand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strand</em>' containment reference.
	 * @see #getStrand()
	 * @generated
	 */
	void setStrand(Code value);

	/**
	 * Returns the value of the '<em><b>Window Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Start</em>' containment reference.
	 * @see #setWindowStart(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_WindowStart()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getWindowStart();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getWindowStart <em>Window Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Start</em>' containment reference.
	 * @see #getWindowStart()
	 * @generated
	 */
	void setWindowStart(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Window End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window End</em>' containment reference.
	 * @see #setWindowEnd(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceReferenceSeq_WindowEnd()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getWindowEnd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceReferenceSeq#getWindowEnd <em>Window End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window End</em>' containment reference.
	 * @see #getWindowEnd()
	 * @generated
	 */
	void setWindowEnd(fhiRCore.dataTypes.Integer value);

} // MolecularSequenceReferenceSeq
