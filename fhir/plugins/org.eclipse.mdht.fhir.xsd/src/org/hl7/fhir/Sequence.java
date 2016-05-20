/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
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
 *   <li>{@link org.hl7.fhir.Sequence#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getVariation <em>Variation</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getAllelicState <em>Allelic State</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getAllelicFrequency <em>Allelic Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getCopyNumberEvent <em>Copy Number Event</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getObservedSeq <em>Observed Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getStructureVariation <em>Structure Variation</em>}</li>
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
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient, or group of patients whose sequencing results are described by this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen used for sequencing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Reference value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method for sequencing, for example, chip information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

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
	 * Returns the value of the '<em><b>Reference Seq</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceReferenceSeq}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference Sequence. It can be described in two ways. One is provide the unique identifier of reference sequence submitted to NCBI. The start and end position of window on reference sequence should be defined.  The other way is using  genome build, chromosome number,and also the start, end position of window (this method is specifically for DNA reference sequence) .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_ReferenceSeq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeq' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceReferenceSeq> getReferenceSeq();

	/**
	 * Returns the value of the '<em><b>Variation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Variation info in this sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variation</em>' containment reference.
	 * @see #setVariation(SequenceVariation)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Variation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variation' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceVariation getVariation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getVariation <em>Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variation</em>' containment reference.
	 * @see #getVariation()
	 * @generated
	 */
	void setVariation(SequenceVariation value);

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
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configurations of the external repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Repository()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repository' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceRepository> getRepository();

	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pointer to next atomic sequence which at most contains one variation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Pointer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPointer();

	/**
	 * Returns the value of the '<em><b>Observed Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observed Sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed Seq</em>' containment reference.
	 * @see #setObservedSeq(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ObservedSeq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observedSeq' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getObservedSeq();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getObservedSeq <em>Observed Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Seq</em>' containment reference.
	 * @see #getObservedSeq()
	 * @generated
	 */
	void setObservedSeq(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Analysis of the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Observation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getObservation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Reference value);

	/**
	 * Returns the value of the '<em><b>Structure Variation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural variant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Variation</em>' containment reference.
	 * @see #setStructureVariation(SequenceStructureVariation)
	 * @see org.hl7.fhir.FhirPackage#getSequence_StructureVariation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structureVariation' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceStructureVariation getStructureVariation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getStructureVariation <em>Structure Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Variation</em>' containment reference.
	 * @see #getStructureVariation()
	 * @generated
	 */
	void setStructureVariation(SequenceStructureVariation value);

} // Sequence
