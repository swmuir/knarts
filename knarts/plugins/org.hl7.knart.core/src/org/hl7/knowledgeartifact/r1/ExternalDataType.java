/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.elm.r1.CodeSystemDef;
import org.hl7.elm.r1.ExpressionDef;
import org.hl7.elm.r1.ParameterDef;
import org.hl7.elm.r1.ValueSetDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getCodesystem <em>Codesystem</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getValueset <em>Valueset</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getDef <em>Def</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getExternalDataType()
 * @model extendedMetaData="name='externalData_._type' kind='elementOnly'"
 * @generated
 */
public interface ExternalDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Codesystem</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.CodeSystemDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code system definition that can be referenced
	 * 									anywhere within the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Codesystem</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getExternalDataType_Codesystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codesystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemDef> getCodesystem();

	/**
	 * Returns the value of the '<em><b>Valueset</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.ValueSetDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value set definition that can be referenced
	 * 									anywhere within the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valueset</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getExternalDataType_Valueset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetDef> getValueset();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.ParameterDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter element define a parameters for the
	 * 									knowledge document. Parameters are expected to be provided by
	 * 									the caller when an evaluation is performed. Parameters can be
	 * 									referenced within any expression using a ParameterRef
	 * 									expression. For instance, one may define a MonthThreshold
	 * 									parameter, and use this parameter to determine whether the span
	 * 									of time that has elapsed since the last A1C has been performed
	 * 									warrants the elicitation of a reminder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getExternalDataType_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterDef> getParameter();

	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.ExpressionDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The named expression used to retrieve external
	 * 									data. For instance, an expression to retrieve patient
	 * 									demographic data or a set of SNOMED-CT codes subsumed by another
	 * 									SNOMED-CT code from a terminology server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getExternalDataType_Def()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='def' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExpressionDef> getDef();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger element represents an event that
	 * 									'triggers' the knowledge artifact. For instance, 'evaluate this
	 * 									artifact whenever a new Problem with a Diabetes Diagnosis code
	 * 									is added to the patient's record' or 'Evaluate this artifact
	 * 									every week day at 10:00 PM'. A trigger can model either a data
	 * 									event or a periodic event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getExternalDataType_Trigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Trigger> getTrigger();

} // ExternalDataType
