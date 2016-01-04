/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variation and Sequence data.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Sequence#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getVariationID <em>Variation ID</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getAllelicState <em>Allelic State</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getAllelicFrequency <em>Allelic Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getCopyNumberEvent <em>Copy Number Event</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getChip <em>Chip</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequence()
 * @model extendedMetaData="name='Sequence' kind='elementOnly'"
 * @generated
 */
public interface Sequence extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amino acid / cDNA transcript / RNA variation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SequenceType)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SequenceType value);

	/**
	 * Returns the value of the '<em><b>Variation ID</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for variant.  If a germline variant, ClinVar or dbSNP identifier should be used.  If a somatic variant, COSMIC identifier should be used, unless in ClinVar then either maybe used. Need to provide the code system used (ClinVar, dbSNP, COSMIC).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variation ID</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_VariationID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variationID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getVariationID();

	/**
	 * Returns the value of the '<em><b>Reference Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference identifier for cDNA transcript/protein, with version, from NCBI's RefSeq or ENSEMBL. This reference sequence identifier must match the type in the Sequence.type field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq</em>' containment reference.
	 * @see #setReferenceSeq(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ReferenceSeq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeq' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReferenceSeq();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getReferenceSeq <em>Reference Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq</em>' containment reference.
	 * @see #getReferenceSeq()
	 * @generated
	 */
	void setReferenceSeq(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity of the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceCoordinate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordinate of the variant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Coordinate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceCoordinate> getCoordinate();

	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organism from which sample of the sequence was extracted. Supporting tests of human, viruses, and bacteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Species</em>' containment reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Species()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='species' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getSpecies <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' containment reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Observed Allele</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed Allele</em>' containment reference.
	 * @see #setObservedAllele(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ObservedAllele()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observedAllele' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getObservedAllele();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getObservedAllele <em>Observed Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Allele</em>' containment reference.
	 * @see #getObservedAllele()
	 * @generated
	 */
	void setObservedAllele(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reference Allele</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Allele</em>' containment reference.
	 * @see #setReferenceAllele(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ReferenceAllele()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceAllele' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReferenceAllele();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getReferenceAllele <em>Reference Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Allele</em>' containment reference.
	 * @see #getReferenceAllele()
	 * @generated
	 */
	void setReferenceAllele(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Cigar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extended CIGAR string for aligning the sequence with reference bases. See detailed documentation [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cigar</em>' containment reference.
	 * @see #setCigar(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Cigar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cigar' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCigar();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getCigar <em>Cigar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cigar</em>' containment reference.
	 * @see #getCigar()
	 * @generated
	 */
	void setCigar(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceQuality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quality for sequence quality vary by platform reflecting differences in sequencing chemistry and digital processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Quality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quality' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceQuality> getQuality();

	/**
	 * Returns the value of the '<em><b>Allelic State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The level of occurrence of a single DNA Sequence Variation within a set of chromosomes. Heterozygous indicates the DNA Sequence Variation is only present in one of the two genes contained in homologous chromosomes. Homozygous indicates the DNA Sequence Variation is present in both genes contained in homologous chromosomes. Hemizygous indicates the DNA Sequence Variation exists in the only single copy of a gene in a non- homologous chromosome (the male X and Y chromosome are non-homologous). Hemiplasmic indicates that the DNA Sequence Variation is present in some but not all of the copies of mitochondrial DNA. Homoplasmic indicates that the DNA Sequence Variation is present in all of the copies of mitochondrial DNA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allelic State</em>' containment reference.
	 * @see #setAllelicState(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequence_AllelicState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allelicState' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAllelicState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getAllelicState <em>Allelic State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allelic State</em>' containment reference.
	 * @see #getAllelicState()
	 * @generated
	 */
	void setAllelicState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allelic Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allele frequencies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allelic Frequency</em>' containment reference.
	 * @see #setAllelicFrequency(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequence_AllelicFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allelicFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getAllelicFrequency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getAllelicFrequency <em>Allelic Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allelic Frequency</em>' containment reference.
	 * @see #getAllelicFrequency()
	 * @generated
	 */
	void setAllelicFrequency(Decimal value);

	/**
	 * Returns the value of the '<em><b>Copy Number Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Values: amplificaiton / deletion / LOH.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Number Event</em>' containment reference.
	 * @see #setCopyNumberEvent(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequence_CopyNumberEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyNumberEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCopyNumberEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getCopyNumberEvent <em>Copy Number Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Number Event</em>' containment reference.
	 * @see #getCopyNumberEvent()
	 * @generated
	 */
	void setCopyNumberEvent(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Read Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Coverage</em>' containment reference.
	 * @see #setReadCoverage(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ReadCoverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readCoverage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getReadCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getReadCoverage <em>Read Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Coverage</em>' containment reference.
	 * @see #getReadCoverage()
	 * @generated
	 */
	void setReadCoverage(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Chip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information of chip.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chip</em>' containment reference.
	 * @see #setChip(SequenceChip)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Chip()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chip' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceChip getChip();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getChip <em>Chip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chip</em>' containment reference.
	 * @see #getChip()
	 * @generated
	 */
	void setChip(SequenceChip value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Repository()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repository' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceRepository> getRepository();

} // Sequence
