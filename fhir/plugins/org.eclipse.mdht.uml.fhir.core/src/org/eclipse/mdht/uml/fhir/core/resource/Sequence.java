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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getVariationIds <em>Variation Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getCoordinates <em>Coordinate</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getQualities <em>Quality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getAllelicState <em>Allelic State</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getAllelicFrequency <em>Allelic Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getCopyNumberEvent <em>Copy Number Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getChip <em>Chip</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getRepositories <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Type()
	 * @model required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Variation Id</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variation Id</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variation Id</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_VariationId()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='variationID'"
	 * @generated
	 */
	EList<CodeableConcept> getVariationIds();

	/**
	 * Returns the value of the '<em><b>Reference Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq</em>' reference.
	 * @see #setReferenceSeq(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_ReferenceSeq()
	 * @model
	 * @generated
	 */
	CodeableConcept getReferenceSeq();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getReferenceSeq <em>Reference Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq</em>' reference.
	 * @see #getReferenceSeq()
	 * @generated
	 */
	void setReferenceSeq(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' reference.
	 * @see #setQuantity(Quantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Quantity()
	 * @model
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.SequenceCoordinate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Coordinate()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceCoordinate> getCoordinates();

	/**
	 * Returns the value of the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Species()
	 * @model
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getSpecies <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Observed Allele</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observed Allele</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Allele</em>' reference.
	 * @see #setObservedAllele(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_ObservedAllele()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getObservedAllele();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getObservedAllele <em>Observed Allele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Allele</em>' reference.
	 * @see #getObservedAllele()
	 * @generated
	 */
	void setObservedAllele(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Reference Allele</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Allele</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Allele</em>' reference.
	 * @see #setReferenceAllele(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_ReferenceAllele()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getReferenceAllele();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getReferenceAllele <em>Reference Allele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Allele</em>' reference.
	 * @see #getReferenceAllele()
	 * @generated
	 */
	void setReferenceAllele(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Cigar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cigar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cigar</em>' reference.
	 * @see #setCigar(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Cigar()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getCigar();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getCigar <em>Cigar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cigar</em>' reference.
	 * @see #getCigar()
	 * @generated
	 */
	void setCigar(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.SequenceQuality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Quality()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceQuality> getQualities();

	/**
	 * Returns the value of the '<em><b>Allelic State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allelic State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allelic State</em>' reference.
	 * @see #setAllelicState(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_AllelicState()
	 * @model
	 * @generated
	 */
	CodeableConcept getAllelicState();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getAllelicState <em>Allelic State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allelic State</em>' reference.
	 * @see #getAllelicState()
	 * @generated
	 */
	void setAllelicState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allelic Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allelic Frequency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allelic Frequency</em>' reference.
	 * @see #setAllelicFrequency(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_AllelicFrequency()
	 * @model
	 * @generated
	 */
	Decimal getAllelicFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getAllelicFrequency <em>Allelic Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allelic Frequency</em>' reference.
	 * @see #getAllelicFrequency()
	 * @generated
	 */
	void setAllelicFrequency(Decimal value);

	/**
	 * Returns the value of the '<em><b>Copy Number Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Number Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Number Event</em>' reference.
	 * @see #setCopyNumberEvent(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_CopyNumberEvent()
	 * @model
	 * @generated
	 */
	CodeableConcept getCopyNumberEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getCopyNumberEvent <em>Copy Number Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Number Event</em>' reference.
	 * @see #getCopyNumberEvent()
	 * @generated
	 */
	void setCopyNumberEvent(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Read Coverage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Coverage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Coverage</em>' reference.
	 * @see #setReadCoverage(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_ReadCoverage()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getReadCoverage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getReadCoverage <em>Read Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Coverage</em>' reference.
	 * @see #getReadCoverage()
	 * @generated
	 */
	void setReadCoverage(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Chip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chip</em>' containment reference.
	 * @see #setChip(SequenceChip)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Chip()
	 * @model containment="true"
	 * @generated
	 */
	SequenceChip getChip();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Sequence#getChip <em>Chip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chip</em>' containment reference.
	 * @see #getChip()
	 * @generated
	 */
	void setChip(SequenceChip value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.SequenceRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSequence_Repository()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceRepository> getRepositories();

} // Sequence
