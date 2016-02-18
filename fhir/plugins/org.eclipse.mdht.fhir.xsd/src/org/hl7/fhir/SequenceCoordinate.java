/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variation and Sequence data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SequenceCoordinate#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceCoordinate#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceCoordinate#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceCoordinate#getGenomeBuild <em>Genome Build</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceCoordinate()
 * @model extendedMetaData="name='Sequence.Coordinate' kind='elementOnly'"
 * @generated
 */
public interface SequenceCoordinate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Chromosome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chromosome containing the genetic finding. The value set will be 1-22, X, Y when the species is human without chromosome abnormality. Otherwise,  NCBI-Gene code system should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chromosome</em>' containment reference.
	 * @see #setChromosome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequenceCoordinate_Chromosome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chromosome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getChromosome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceCoordinate#getChromosome <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chromosome</em>' containment reference.
	 * @see #getChromosome()
	 * @generated
	 */
	void setChromosome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inclusive 0-based nucleotide position for start of genomic finding on the positive (+) genomics strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceCoordinate_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceCoordinate#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exclusive 0-based nucleotide position for end of genomic finding on the positive (+) genomic strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceCoordinate_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceCoordinate#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Genome Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genome Build</em>' containment reference.
	 * @see #setGenomeBuild(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceCoordinate_GenomeBuild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genomeBuild' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getGenomeBuild();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceCoordinate#getGenomeBuild <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Build</em>' containment reference.
	 * @see #getGenomeBuild()
	 * @generated
	 */
	void setGenomeBuild(org.hl7.fhir.String value);

} // SequenceCoordinate
