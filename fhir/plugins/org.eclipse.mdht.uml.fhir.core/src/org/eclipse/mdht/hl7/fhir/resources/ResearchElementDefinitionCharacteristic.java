/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Duration;
import org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Element Definition Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getDefinitionx <em>Definitionx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getUsageContexts <em>Usage Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectiveDescription <em>Study Effective Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectivex <em>Study Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectiveTimeFromStart <em>Study Effective Time From Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectiveGroupMeasure <em>Study Effective Group Measure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDescription <em>Participant Effective Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectivex <em>Participant Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectiveTimeFromStart <em>Participant Effective Time From Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectiveGroupMeasure <em>Participant Effective Group Measure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ResearchElementDefinition_Characteristic'"
 * @generated
 */
public interface ResearchElementDefinitionCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Definitionx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitionx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitionx</em>' containment reference.
	 * @see #setDefinitionx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_Definitionx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='definition[x]'"
	 * @generated
	 */
	DataType getDefinitionx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getDefinitionx <em>Definitionx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitionx</em>' containment reference.
	 * @see #getDefinitionx()
	 * @generated
	 */
	void setDefinitionx(DataType value);

	/**
	 * Returns the value of the '<em><b>Usage Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Context</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_UsageContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsageContext> getUsageContexts();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getExclude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #setUnitOfMeasure(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_UnitOfMeasure()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getUnitOfMeasure <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Study Effective Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Effective Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Effective Description</em>' containment reference.
	 * @see #setStudyEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveDescription()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getStudyEffectiveDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectiveDescription <em>Study Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Description</em>' containment reference.
	 * @see #getStudyEffectiveDescription()
	 * @generated
	 */
	void setStudyEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Study Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Effectivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Effectivex</em>' containment reference.
	 * @see #setStudyEffectivex(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_StudyEffectivex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='studyEffective[x]'"
	 * @generated
	 */
	DataType getStudyEffectivex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectivex <em>Study Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effectivex</em>' containment reference.
	 * @see #getStudyEffectivex()
	 * @generated
	 */
	void setStudyEffectivex(DataType value);

	/**
	 * Returns the value of the '<em><b>Study Effective Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Effective Time From Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Effective Time From Start</em>' containment reference.
	 * @see #setStudyEffectiveTimeFromStart(Duration)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveTimeFromStart()
	 * @model containment="true"
	 * @generated
	 */
	Duration getStudyEffectiveTimeFromStart();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectiveTimeFromStart <em>Study Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Time From Start</em>' containment reference.
	 * @see #getStudyEffectiveTimeFromStart()
	 * @generated
	 */
	void setStudyEffectiveTimeFromStart(Duration value);

	/**
	 * Returns the value of the '<em><b>Study Effective Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Effective Group Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Effective Group Measure</em>' containment reference.
	 * @see #setStudyEffectiveGroupMeasure(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveGroupMeasure()
	 * @model containment="true"
	 * @generated
	 */
	Code getStudyEffectiveGroupMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getStudyEffectiveGroupMeasure <em>Study Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Group Measure</em>' containment reference.
	 * @see #getStudyEffectiveGroupMeasure()
	 * @generated
	 */
	void setStudyEffectiveGroupMeasure(Code value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Effective Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Effective Description</em>' containment reference.
	 * @see #setParticipantEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveDescription()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getParticipantEffectiveDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDescription <em>Participant Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Description</em>' containment reference.
	 * @see #getParticipantEffectiveDescription()
	 * @generated
	 */
	void setParticipantEffectiveDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Participant Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Effectivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Effectivex</em>' containment reference.
	 * @see #setParticipantEffectivex(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectivex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='participantEffective[x]'"
	 * @generated
	 */
	DataType getParticipantEffectivex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectivex <em>Participant Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effectivex</em>' containment reference.
	 * @see #getParticipantEffectivex()
	 * @generated
	 */
	void setParticipantEffectivex(DataType value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Effective Time From Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Effective Time From Start</em>' containment reference.
	 * @see #setParticipantEffectiveTimeFromStart(Duration)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveTimeFromStart()
	 * @model containment="true"
	 * @generated
	 */
	Duration getParticipantEffectiveTimeFromStart();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectiveTimeFromStart <em>Participant Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Time From Start</em>' containment reference.
	 * @see #getParticipantEffectiveTimeFromStart()
	 * @generated
	 */
	void setParticipantEffectiveTimeFromStart(Duration value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Effective Group Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Effective Group Measure</em>' containment reference.
	 * @see #setParticipantEffectiveGroupMeasure(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveGroupMeasure()
	 * @model containment="true"
	 * @generated
	 */
	Code getParticipantEffectiveGroupMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ResearchElementDefinitionCharacteristic#getParticipantEffectiveGroupMeasure <em>Participant Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Group Measure</em>' containment reference.
	 * @see #getParticipantEffectiveGroupMeasure()
	 * @generated
	 */
	void setParticipantEffectiveGroupMeasure(Code value);

} // ResearchElementDefinitionCharacteristic
